package greyNodesAssignment;

import greyNodesAssignment.game.Clara;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-20,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class MiniPacman {
    class MyClara extends Clara {
        /**
         * In the 'run()' method you can write your program for Clara
         */
        void run() {
            while(!treeLeft()) {
                cleanStreet();
                repositionWest();
                repositionEast();
                cleanStreet();
            }
        }

        void cleanStreet() {
            while (!treeFront()) {
                if (onLeaf()) {
                    removeLeaf();
                }
                move();

                // If there is no leaf ahead, move back to the leaf
                if (!onLeaf()) {
                    backToLeaf();
                    break; // Exit the loop as no further cleaning is needed
                }
            }
        }

        void repositionWest() {
            turnRight(); // Clara turns right to reposition herself

            if (!treeFront()) {
                cleanStreet(); // Continue cleaning the street
            }
        }

        void repositionEast() {
            turnLeft(); // Clara turns left to reposition herself
            if (!treeFront()) {
                cleanStreet(); // Continue cleaning the street
            }
            turnLeft(); // Turn right to face the original direction after repositioning
        }

        void backToLeaf() {
            turnLeft(); // Turn around to face the opposite direction
            turnLeft();
            move(); // Move to the position of the previous leaf
        }
    }

}
