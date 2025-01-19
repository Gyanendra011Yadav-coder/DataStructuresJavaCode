package FirstPhaseLearning.greyNodesAssignment;


/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-20,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class LeftToRight {

    /* PERMITTED COMMANDS
   move, turnLeft, turnRight, treeLeft, treeRight, treeFront, onLeaf, putLeaf, removeLeaf, mushroomFront
   JAVA
   if, while, for
*/

    /*class MyClara extends Clara {
        *//**
         * In the 'run()' method you can write your program for Clara
         *//*
        void run() {
            completeColumnUp();
            move();

            // Move until encountering a leaf or a tree
            while (!onLeaf() && !treeFront()) {
                move();
            }

            if (onLeaf()) {
                // Handle the case when a leaf is encountered
                boolean isFilled = false;
                turnRight();

                // Check if there are leaves in the immediate next two spots
                for (int i = 0; i < 2; i++) {
                    if (onLeaf()) {
                        isFilled = true;
                        move();
                    } else {
                        isFilled = false;
                        break;
                    }
                }

                if (!isFilled) {
                    // Clean, move, and reposition to complete the column
                    completeColumnDown();
                    moveMultipleTime(4);
                    completeColumnUp();
                    moveMultipleTime(4);
                    turnRight();
                    completeColumnDown();
                } else {
                    moveRightColumn();
                }
            }
        }

        void completeColumnUp() {
            turnLeft();
            while (!treeFront()) {
                putLeafOrMove();
            }
            if (!onLeaf()) putLeaf();
            turnRight();
        }

        void completeColumnDown() {
            while (!treeFront()) {
                putLeafOrMove();
            }
            if (!onLeaf()) putLeaf();

            turnLeft();
        }

        void moveRightColumn() {
            turnLeft();move();turnLeft();move();turnRight();
            for (int i = 0; i < 3; i++) {
                move();
            }
            turnRight();
            completeColumnDown();
        }

        void putLeafOrMove() {
            if (!onLeaf()) putLeaf();
            move();
        }

        void moveMultipleTime(int times){
            for (int i = 0; i < times; i++) {
                move();
            }
        }
    }

    class MyClaraOptimized extends Clara {
        void run() {
            completeColumnUp();
            move();
            while (!onLeaf() && !treeFront()) move();

            if (onLeaf()) {
                boolean isFilled = false;
                turnRight();

                for (int i = 0; i < 2 && (isFilled = onLeaf()); i++) move();

                if (!isFilled) {
                    completeColumnDown();
                    moveMultipleTimes(4);
                    completeColumnUp();
                    moveMultipleTimes(4);
                    turnRight();
                    completeColumnDown();
                } else moveRightColumn();
            }
        }

        void completeColumnUp() {
            turnLeft();
            while (!treeFront()) putLeafOrMove();
            if (!onLeaf()) putLeaf();
            turnRight();
        }

        void completeColumnDown() {
            while (!treeFront()) putLeafOrMove();
            if (!onLeaf()) putLeaf();
            turnLeft();
        }

        void moveRightColumn() {
            turnLeft(); move(); turnLeft(); move(); turnRight();
            moveMultipleTimes(3);
            turnRight();
            completeColumnDown();
        }

        void putLeafOrMove() {
            if (!onLeaf()) putLeaf();
            move();
        }

        void moveMultipleTimes(int times) {
            for (int i = 0; i < times; i++) move();
        }
    }*/

}
