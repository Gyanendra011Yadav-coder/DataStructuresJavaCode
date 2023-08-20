package greyNodesAssignment.game;

import java.util.function.Function;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-20,Aug,2023
 * in Project: DataStructuresJavaCode
 */
class Error {
    Error(String message) {}
}

class Exception extends Error {
    Exception(String message) {
        super(message);
    }
}

class String {
    public int length;
}

class Array<T> {
    public int length;
    public int slice(int start, int end) { return 0; };
}

interface Object {
    String toString();
}

class Math {
    static float random() { return 0; }
    static int floor(float input) { return 0; }
}

abstract class console {
    static void error(String message) {};
    static void log(String message) {};
    static void warn(String message) {};
}

interface Timeout {
    void clearTimeout();
}

class BoardException {
    BoardException(BoardTile tile, String message) { }
}

interface IPainter {
    void act();
}

abstract class Waiter {
    public Object promise;
    public abstract void add();
    public abstract void finishOne();
    public abstract void finishAll();
    public abstract void abort();
    @Async
    public abstract Object wait();
}

// ////////////////////////////////////
// // SVG.JS                         //
// ////////////////////////////////////

// abstract class Shape {
//     Shape move(int x, int y) { return null; }
//     // Shape stroke(StrokeData data) { return null; }
// }

// abstract class Line extends Shape {
// }

// abstract class SvgJS {
//     abstract Line line(int x1, int y1, int x2, int y2);
// }

////////////////////////////////////
// END SVG.JS                         //
////////////////////////////////////

abstract class Engine {
    public static BoardTile instantiate(int row, int column, Tile tile, int direction) { return null; }
    public static boolean isRunning;
    public static void stop() {}
    public static ContextPlayer[] players;
    public static void notifyInteraction(SystemEvents type, String source, String target) {};
    public static void notifySimpleEvent(String name, String argument) {};
    public static void notifyEvent(String name, java.lang.Object[] args) {};
    public static void log(java.lang.Object message) {};
    public static void message(String message, String title) { };
    @Async
    public static String prompt(String message, String defaultValue) { return null; };
    @Async
    public static int promptInt(String message, String defaultValue) { return 0; };
    @Async
    public static float promptFloat(String message, String defaultValue) { return 0; };
    public static void console(String message) {}
    public static int parseInt(String message) { return 0; };
    public static boolean isNaN(int message) { return true; };
    public static void setKey(String key, Function onPress, Function onRelease, boolean preventRepeat) {};
    public static void resetKeys() {};
    public static void loadBoard(char[][] board) {};
    public static Sound sound(String url) { return null; };

    public static void paintFrameAsync(IPainter painter, int delay) {

    }

    @Async
    public static void wait() {}
    @Async
    public static void waitTime(int ms) {}
    public static Timeout timeout(Function delegate, int timeout) { return null; };
    public static Waiter pool;
}

class __context extends Engine {}
class __db extends Engine {}

interface Sound {
    boolean isEnded();
    void play();
}

abstract class Instance {
}

abstract class ContextPlayer {
    BoardTile tile;
    Instance instance;
}

abstract class Tile {
    public String name;
}

abstract class Prop {
    float currentWidth;
    int currentX;
    int currentY;
    void moveTo(double x, double y) {}
}

abstract class BoardTile {
    public String name;
    public int row;
    public int column;
    public int direction;
    public Tile tile;
    public Prop prop;
    public abstract void moveTo(int x, int y);
}

abstract class World {
    public abstract Tile getTileByName(String name);
}

abstract class Board {
    // public World world;
    float tileSize;
    int rows;
    int columns;
    int index;
    BoardTile[][] statics;
    BoardTile[][] sprites;
    String code;
    boolean running;
    World world;

    // mask is a bitmask where 4 - static, 2 - sprite and 1 - player
    // for example if you want only statics and sprites you put 4 + 2 = 6
    public abstract BoarTile checkCollisions(BoardTile player, int mask);
    public abstract void moveTo(BoardTile player, int row, int column);
    public abstract void moveForward(BoardTile player, int tiles);
    public abstract void rotateLeft(BoardTile player);
    public abstract void rotateRight(BoardTile player);
    public abstract BoardTile getSprite(int row, int column);
    public abstract BoardTile getTile(int row, int column);
    public abstract BoardTile tileFront(BoardTile player);
    public abstract BoardTile spriteFront(BoardTile player);
    public abstract Tile getTileByName(String name);
    public abstract void addTileAt(int row, int column, Tile tileName);
    public abstract void removeTile(BoardTile tile);
    public abstract boolean isFront(BoardTile player, Tile tile);
    public abstract boolean isLeft(BoardTile player, Tile tile);
    public abstract boolean isRight(BoardTile player, Tile tile);
    public abstract boolean isOnTile(BoardTile player, Tile tile);
    public abstract void step();

    // Returns first player tile that is not “origin” at that position
    public abstract BoardTile getPlayerAt(BoardTile origin, int row, int column);
    // Returns all players that are not “origin” at that position
    public abstract BoardTile[] getPlayersAt(BoardTile player, int row, int column);
    public abstract void moveByPixels(BoardTile player, int pixels);
    public abstract void setDirection(BoardTile player, int direction, boolean rotate);
    public abstract String getDirection(int direction);
    public abstract int wrapRow(int row);
    public abstract int wrapColumn(int column);
    public abstract void animate(BoardTile tile, String animationName);
    public abstract void reset(boolean visual);
}

