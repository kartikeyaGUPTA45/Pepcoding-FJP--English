import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);

    int n=scn.nextInt();

    int dp1[]=new int [n+1];// ending with 0's
    int dp2[]=new int[n+1];// ending with 1's


    dp1[1]=1;
    dp2[1]=1;


    for(int i=2;i<=n;i++){

        dp1[i]=dp2[i-1];
        dp2[i]=dp1[i-1]+dp2[i-1];
    }

    int finalAns=dp1[n]+dp2[n];

    System.out.println(finalAns);




 }

}
