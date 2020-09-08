/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseconvertor;

import java.util.Scanner;

/**
 *
 * @author ridhi
 */


public class BaseConvertor {

    static int decimal(int n, int b)
    {
        int result = 0;
        int p = 0;
        while (n > 0)
        {
            result = (int) (result + (n % b) * Math.pow(b,p)); 
            n = n/10;
            p++;
        }

    return result;
    }
        static int destBase(int n, int b)
    {
        int result = 0;
        int p = 0;
        while (n > 0)
        {
            result = (int) (result + (n % b) * Math.pow(10, p)); 
            n = n/b;
            p++;
        }

    return result;
    }
    static int convertor(int n,int b1, int b2)
    {
    int result;
    int b10 = decimal (n,b1);
        System.out.println("base 10 "+ b10);
    result = destBase(b10, b2);
    return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number\n");
        int s = sc.nextInt();
        System.out.println("Enter Base of the number\n");
        int b1 = sc.nextInt();
        System.out.println("Enter desired base\n");
        int b2 = sc.nextInt();
        d = convertor (s, b1,b2);
        System.out.println(d);
        
        // TODO code application logic here
    }
    
}
