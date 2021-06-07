package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);

        final double taxRate = .055;

        System.out.print( "Enter the price of item 1: ");
        int price1 = Integer.parseInt(Obj.nextLine());
        System.out.print( "Enter the quantity of item 1: ");
        int quant1 = Integer.parseInt(Obj.nextLine());

        System.out.print( "Enter the price of item 2: ");
        int price2 = Integer.parseInt(Obj.nextLine());
        System.out.print( "Enter the quantity of item 2: ");
        int quant2 = Integer.parseInt(Obj.nextLine());

        System.out.print( "Enter the price of item 3: ");
        int price3 = Integer.parseInt(Obj.nextLine());
        System.out.print( "Enter the quantity of item 3: ");
        int quant3 = Integer.parseInt(Obj.nextLine());

        double subtotal = (price1*quant1)+(price2*quant2)+(price3*quant3);
        double tax = taxRate*subtotal;
        double total = subtotal+tax;

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f", total);
    }
}