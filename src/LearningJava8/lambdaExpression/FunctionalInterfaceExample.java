package LearningJava8.lambdaExpression;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-10,Aug,2023
 * in Project: DataStructuresJavaCode
 */
@FunctionalInterface
interface FunctionalInterfaceExample {
    default String addEmployee(String employeeName) {
        return null;
    }

    static void removeEmployee(String employeeName) {

    }

    static void rteturnString(String string) {
        System.out.println("Printing str get in the argument" + string);
    }

    int addNum(int num1, int num2);

}

class runMainClass implements Runnable {
    public static void main(String[] args) {
        Thread threadObject = new Thread(() -> {
            System.out.println("Hello, World!");
        });

        threadObject.start();


//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread is running1!");
//            }
//        });

        new Thread(() -> {
            System.out.println("Thread is running2!");
        }).start();
//        thread.start();
    }

    @Override
    public void run() {

    }

//    button.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("Button clicked!");
//        }
//    });

}



