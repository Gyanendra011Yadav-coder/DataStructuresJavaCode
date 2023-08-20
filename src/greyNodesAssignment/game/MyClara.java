package greyNodesAssignment.game;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-20,Aug,2023
 * in Project: DataStructuresJavaCode
 */
/* PERMITTED COMMANDS
   Clara commands:
   move(); turnLeft(); turnRight(); treeLeft(); treeRight(); treeFront(); onLeaf(); putLeaf(); removeLeaf(); mushroomFront();
   JAVA commands:
   if, else, for, while, do, &&, ||, ! */

class MyClara extends Clara {
    /**
     * In the 'run()' method, you can write your program for Clara.
     */
    void run() {
        putLeaf(); // Initial leaf placement

        // Loop through the rows of trees
        for (int i = 0; i < 7; i++) {
            while (!treeFront()) {
                if (!onLeaf()) {
                    putLeaf();
                }
                move();
            }
            if (i < 6) {
                turnLeft(); // Turn left at the end of each row
            }
        }
    }
}

