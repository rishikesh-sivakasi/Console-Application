package com.zsgs.hotel.util;

import java.util.Scanner;

public class Read {
    private static Scanner scanner ;

    private Read(){}

    public static Scanner getScanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
