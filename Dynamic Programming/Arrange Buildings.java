import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);

    int n=scn.nextInt();

    long oldb=1;
    long olds=1;


    for(int i=2;i<=n;i++){
        long newb=olds;
        long news=oldb+olds;


        olds=news;
        oldb=newb;
    }

    long x=oldb+olds;

    long finalAns=x*x;

    System.out.println(finalAns);

 }

}
