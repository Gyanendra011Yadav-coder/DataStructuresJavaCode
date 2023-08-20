package greyNodesAssignment.game;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-20,Aug,2023
 * in Project: DataStructuresJavaCode
 */
enum SystemEvents {
    Trigger,
    Collision
}

class StandardOutput {
    public void print(Object message) {
        Engine.log(message);
    }

    public void println(object message) {
        message = message + "\n";
        this.print(message);
    }
}

class System {
    static StandardOutput out = new StandardOutput();
}

class Sounds {
    static Sounds _instance;
    static Sounds instance() {
        if (Sounds._instance == null) {
            Sounds._instance = new Sounds();
        }
        return Sounds._instance;
    }
}

class Character {
    static ContextPlayer _clara;

    Board _board;
    BoardTile _player;
    String[] _inputs;
    String _debugName;

    public String playerName;

    boolean _alive = true;
    int _inputIndex = -1;

    @Async
    void act() {}

    void waitAsync() {
        return Engine.waitTime(1000 / 30);
    }

    @Async
    void runAsync() {
        // notify board
        while (this._alive) {
            this.act();
            Engine.waitTime(5);
        }
    }

    public void turnLeft() {
        this._board.step();
        this._board.rotateLeft(this._player);

        return Engine.wait();
    }

    public void turnRight() {
        this._board.step();
        this._board.rotateRight(this._player);

        return Engine.wait();
    }

    public void move() {
        this._board.step();
        this._board.moveForward(this._player, 1);

        return Engine.wait();
    }

    public void putLeaf() {
        this._board.step();

        if (this._board.getSprite(this._player.row, this._player.column) == null) {
            this._board.addTileAt(this._player.row, this._player.column, this.getLeafTile());
        } else {
            throw new Error("You cannot put leaf here!");
        }
        return Engine.wait();
    }

    public void removeLeaf() {
        this._board.step();

        BoardTile leaf = this._board.getSprite(this._player.row, this._player.column);
        if (leaf != null && leaf.tile.name == Character.LeafTileName) {
            this._board.removeTile(leaf);
        } else {
            throw new Error("There is no leaf to remove!");
        }
        return Engine.wait();
    }

    public boolean mushroomFront() {
        return this._board.isFront(this._player, this.getMushroomTile());
    }

    boolean treeFront() {
        return this._board.isFront(this._player, this.getTreeTile());
    }

    public boolean treeLeft() {
        return this._board.isLeft(this._player, this.getTreeTile());
    }

    public boolean treeRight() {
        return this._board.isRight(this._player, this.getTreeTile());
    }

    public boolean onLeaf() {
        return !!this._board.isOnTile(this._player, this.getLeafTile());
    }

    public BoardTile checkCollisions(int mask) {
        return this._board.checkCollisions(this._player, mask);
    }

    protected Tile getTileByName(String name) {
        try {
            return this._board.getTileByName(name);
        } catch (Exception ex) {
            return this._board.world.getTileByName(name);
        }
    }

    // helper methods
    static String LeafTileName = "Leaf";
    Tile _leafTile;
    Tile getLeafTile() {
        if (this._leafTile == null) {
            this._leafTile = this.getTileByName(Character.LeafTileName);
        }
        return this._leafTile;
    }

    static String TreeTileName = "Tree";
    Tile _treeTile;
    Tile getTreeTile() {
        if (this._treeTile == null) {
            this._treeTile = this.getTileByName(Character.TreeTileName);
        }
        return this._treeTile;
    }

    static String MushroomTileName = "Mushroom";
    Tile _mushroomTile;
    Tile getMushroomTile() {
        if (this._mushroomTile == null) {
            this._mushroomTile = this.getTileByName(Character.MushroomTileName);
        }
        return this._mushroomTile;
    }

    public void moveBy(int pixels) {
        if (pixels == 0) {
            throw new Error("Cannot move! Please specify speed!");
        }
        this._board.moveByPixels(this._player, pixels);
    }

    public String getDirection() {
        return _board.getDirection(this._player.direction);
    }

    public void setDirection(String direction) {
        switch (direction) {
            case "up":
                this._board.setDirection(this._player, 0, true);
                break;
            case "down":
                this._board.setDirection(this._player, 2, true);
                break;
            case "left":
                this._board.setDirection(this._player, 3, true);
                break;
            case "right":
                this._board.setDirection(this._player, 1, true);
                break;
        }
    }

    public void wrapAroundWorld() {
        int row = this._player.row;
        int column = this._player.column;

        int wrappedRow = this._board.wrapRow(row);
        int wrappedColumn = this._board.wrapColumn(column);

        if (row != wrappedRow || column != wrappedColumn) {
            this._board.moveTo(this._player, wrappedRow, wrappedColumn);
        }
    }

    public boolean intersectsWithName(String who)
    {
        boolean retVal = false;

        for (int i = 0; i < Engine.players.length; i++)
        {
            ContextPlayer foundPlayer = Engine.players[i];

            // ignore those marked as "dead"
            // if (foundPlayer.instance._isDead == true)
            //    continue;

            if ( foundPlayer.tile.tile.name == who )
            {
                if (this._player.column == foundPlayer.tile.column && this._player.row == foundPlayer.tile.row)
                    retVal = true;
            }
        }

        return retVal;
    }

    public void animate(String animation) {
        this._board.animate(this._player, animation);
    }

    void findClara() {
        if (Character._clara == null) {
            for (int i = 0; i < Engine.players.length; i++) {
                if (Engine.players[i].tile.tile.name == "Player") {
                    Character._clara = Engine.players[i];
                    break;
                }
            }
        }
        return Character._clara;
    }

    int readInt(String message) {
        if (this._inputIndex == -1) {
            this._inputIndex = 0;
        }

        this._board.step();

        int num = 0;
        String msg = message == null ? "Please specify an integer" : message;

        String txt;
        if (this._inputs != null && this._inputs[this._inputIndex] != null) {
            message = "World #" + (this._board.index + 1) + ": ";
            message += msg + " [AUTO]: " + this._inputs[this._inputIndex];
            Engine.log(message + "\n");
            Engine.console(message + "\n");
            return Engine.parseInt(this._inputs[this._inputIndex++]);
        } else {
            Engine.console("message");
            return Engine.promptInt(msg, "0");
        }
    }

    String readString(String message) {
        if (this._inputIndex == -1) {
            this._inputIndex = 0;
        }

        this._board.step();
        String msg = message == null ? "Please specify an integer" : message;

        String txt;
        if (this._inputs != null && this._inputs[this._inputIndex] != null) {
            message = "World #" + (this._board.index + 1) + ": ";
            message += msg + " [AUTO]: " + this._inputs[this._inputIndex];
            Engine.log(message + "\n");
            Engine.console(message + "\n");
            return message;
        } else {
            Engine.console("message");
            return Engine.prompt(msg, "Your answer");
        }
    }
}
