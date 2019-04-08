package Guleri;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner in= new Scanner(System.in);
       int d,r,x=0,B;
        int n= in.nextInt();
int[] T = new int[100];
        while( x<n){
            T[x] = in.nextInt();x++;}
     for(int i:T) {
         d = (i / 10) * 10;
         r = i % 10;
         if ((r < 10) && (d == 0)) {
             B = 10;
             System.out.println(B);
         } else if ((d != 0) && (r < 6)) {
             B = d + 10;
             System.out.println(B);
         } else {
             B = d + 20;
             System.out.println(B);
         }

     }
     }  }
