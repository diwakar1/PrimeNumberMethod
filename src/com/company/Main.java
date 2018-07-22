package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i <100; i++){

            if (primeMethod(i) == true)
                System.out.print(i+" ");
        }
    }

    public static boolean primeMethod(int n){
     for(int i = 2; i< n ; i++)  {

       if (n%i == 0)

           return  false;

     }

     return true;

    }
}
