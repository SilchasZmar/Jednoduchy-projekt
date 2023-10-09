package cz.itnetwork;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        OvladaniDatabaze ovladaniDatabaze = new OvladaniDatabaze();
        ovladaniDatabaze.spustitMenu();
    }
}