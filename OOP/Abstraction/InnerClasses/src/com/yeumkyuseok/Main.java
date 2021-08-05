package com.yeumkyuseok;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        /*
        Gearbox mcLauren = new Gearbox(6);
        mcLauren.addGear(1, 5.3);
        mcLauren.addGear(2, 10.6);
        mcLauren.addGear(3, 15.9);
        mcLauren.operateClutch(true);
        mcLauren.changeGear(1);
        mcLauren.operateClutch(false);
        System.out.println(mcLauren.wheelSpeed(1000));
        mcLauren.changeGear(2);
        System.out.println(mcLauren.wheelSpeed(3000));
        mcLauren.operateClutch(true);
        mcLauren.changeGear(3);
        mcLauren.operateClutch(false);
        System.out.println(mcLauren.wheelSpeed(6000));
         */

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        //btnPrint.setOnClickListener(new ClickListener());


        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
