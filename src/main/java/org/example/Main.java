package org.example;

import org.example.service.MenuService;
import org.example.service.MenuServiceImpl;
import org.example.ui.BasicUI;
import org.example.ui.MenuUI;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MenuService service = new MenuServiceImpl();

        MenuUI menuUI = new MenuUI(scanner,service);

        menuUI.execute();

    }
}