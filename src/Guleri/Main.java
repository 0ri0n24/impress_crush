package Guleri;
public class Main {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner in= new Scanner(System.in);
        int B,n= in.nextInt();
        int x=0;int[] T = new int[n];
        while( x<n){
            T[x] = in.nextInt();x++;}
        for (int i:T) {
            int d = i / 10;
            int r = i % 10; d = d * 10;
            if ((r< 6)&&(r>0)) {r= 10;B = d + r;System.out.println(B); }
            else if((r==0)&&(d>0)){r = 0;B = d + r;System.out.println(B); }
            else{ r=20; B = d+ r;System.out.println(B);}}}}
