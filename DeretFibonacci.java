/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deretfibonacci;
import java.util.Scanner;

public class DeretFibonacci {

       public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Input Angka : ");
        int num = input.nextInt();
        long fibo[] = new long[num];
        
        fibo[0] = 0;
        fibo[1] = 1;
        
        for(int i = 2; i < num; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        
        for(int i = 0; i < num; i++){
            System.out.print(fibo[i] + " ");
        }
        
    }
    
}
