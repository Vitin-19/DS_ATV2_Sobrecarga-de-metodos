package src;

import src.models.Menu;

public class Main {

    public static void main(String[] args) {
        boolean exe = true;
        while (exe) {
            exe = Menu.menu();
        }
    }
}