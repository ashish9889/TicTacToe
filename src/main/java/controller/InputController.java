package controller;

import entities.Cell;

import java.util.Scanner;

public class InputController {
    private static InputController INPUT_CONTROLLER;
    private Scanner scanner;
    private InputController(){
        scanner = new Scanner(System.in);
    }
    public static InputController getInstance(){
        if(null == INPUT_CONTROLLER){
            synchronized (InputController.class){
                if(null == INPUT_CONTROLLER){
                    INPUT_CONTROLLER = new InputController();
                }
            }
        }
        return INPUT_CONTROLLER;
    }

    public Cell getInputCell(){
        System.out.println("Please select row!");
        int row = scanner.nextInt();

        System.out.println("Please select column!");
        int column = scanner.nextInt();

        return new Cell(row, column);
    }
}