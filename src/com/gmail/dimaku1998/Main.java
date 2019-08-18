/*1) С помощью циклов нарисовать «обои». Причем количество полос
должно вводиться с клавиатуры. В примере 7 полос.
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
*/
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number of strip = ");
        int strip = sc.nextInt();
        for (int i = 0;i < 5; i++){
            for (int j = 0; j < strip; j++){
                if ((j+1)%2 == 0){
                    System.out.print("***");
                }else
                    System.out.print("+++");
            }
            System.out.println();
        }
    }
}
