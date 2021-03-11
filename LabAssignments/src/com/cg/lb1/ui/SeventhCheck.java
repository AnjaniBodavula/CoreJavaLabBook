package com.cg.lb1.ui;

import java.util.Scanner;
public class SeventhCheck{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(checkNumber(a));
        s.close();
     }
     public static boolean checkNumber(int a){
         int n=10,r;
         while(a!=0){
             r=a%10;
             a=a/10;
             if(r>n){
                 return false;
             }
             n=r;
         }
         return true;
     }
}

