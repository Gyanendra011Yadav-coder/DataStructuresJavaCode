package greyNodesAssignment;

import greyNodesAssignment.game.Clara;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-20,Aug,2023
 * in Project: DataStructuresJavaCode
 */

/*
* Clara is interested in ancient Greek mythology. She has read a story about Theseus and Minotaur and decided to replicate it in her world. According to the original story, Theseus finds a way out of a labyrinth by using a ball of red thread that Theseus unrolled as he penetrated the labyrinth, which allowed him to find his way back out. You can read more about Theseus and Minotaur here: https://www.greekmyths-greekmythology.com/myth-of-theseus-and-minotaur/.

In Clara's world the labyrinth looks similar to Figure 1. Instead of unrolling the thread Clara must put leaves everywhere she goes as she is looking for a way out.

Unfortunately, there are some leaves that are already present in the labyrinth. Clara must ignore those and simply place the leaves in all cells on her path where no leaves are present.

Figure 1
Figure 1.
In the labyrinth there is always a mushroom that represents the exit. Clara's objective is to walk to the mushroom and stop in front of it. Her way from the initial position to the mushroom must be marked with leaves as shown in Figure 2.

The labyrinth is always of such a kind that Clara is able to get to the mushroom by simply walking forward until she encounters a tree in front of her that blocks her way. When there is a tree blocking her way she should turn left and continue walking. She would know that her objective is completed when Clara discovers that she is positioned in front of a mushroom ( mushroomFront() ). The result of executing your code should look similar to Figure 2.

Figure 2
Figure 2.
Your solution must be generic and has to work with all supplied example worlds. This means that before submitting you must test your code with all supplied worlds and it must correctly work in all of those. You should also aim at making sure that the code would work with all similar worlds with similar properties (beyond the provided examples).*/
public class FixLeafTrail {
    class MyClara extends Clara {
        /**
         * In the 'run()' method, you can write your program for Clara.
         */
        void run() {
            // Loop through the rows of trees
            while (!mushroomFront()){
                if (!onLeaf()) {
                    putLeaf();
                } else {
                    move();
                }
                if(treeFront()) {
                    turnLeft(); // Turn left at the end of each row
                }
            }
            putLeaf();
        }
    }
}
