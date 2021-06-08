package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Bus [] buses = new Bus[5];
        buses[0]= Bus.builder()
                .nameAndSername("Владимир Туманов")
                .routeNomber(655)
                .yearStartUse(1999)
                .label("volvo")
                .mileage(196000)
                .build();
        buses[1] = Bus.builder()
                .nameAndSername("Николай Попов")
                .routeNomber(680)
                .yearStartUse(2006)
                .label("scania")
                .mileage(356000)
                .build();
        buses[2] = Bus.builder()
                .nameAndSername("Ян Васильев")
                .routeNomber(655)
                .yearStartUse(2012)
                .label("mercades")
                .mileage(12000)
                .build();
        buses[3] = Bus.builder()
                .nameAndSername("Джон Якубович")
                .routeNomber(737)
                .yearStartUse(2010)
                .label("mercedes")
                .mileage(56000)
                .build();
        buses[4] = Bus.builder()
                .nameAndSername("Джейсон Стетхем")
                .routeNomber(999)
                .yearStartUse(2020)
                .label("renault")
                .mileage(1300)
                .build();
        System.out.println(buses[0]);
        System.out.println(buses[1]);
        System.out.println(buses[2]);
        System.out.println(buses[3]);
        System.out.println(buses[4]);



    }







}
