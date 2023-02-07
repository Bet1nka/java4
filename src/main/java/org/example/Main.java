package org.example;

public class Main {
    public static void main(String[] args) {
            FileController fc = new FileController();
            Controller controller = new Controller();
            fc.SAVER(controller.AddUser());
    }
}