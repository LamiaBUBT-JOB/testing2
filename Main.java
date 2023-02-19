/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Kayse
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // create Scanner class object
    // to read input values
    Scanner scan = new Scanner(System.in);

    // declare variables
    int n;
    int sum = 0;

    // read N value
    System.out.print("Enter N value: ");
    n = scan.nextInt();

    // calculate the sum of series
    for(int i=1; i<=n; i++) {
      sum = sum + i;
    }

    // display result
    System.out.println("Sum = " + sum);
    }
    
}
