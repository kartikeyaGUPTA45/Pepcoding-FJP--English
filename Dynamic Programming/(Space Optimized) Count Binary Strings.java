import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);

    int n=scn.nextInt();

    int oldzero=1;
    int oldones=1;


    for(int i=2;i<=n;i++){
        int newzero=oldones;
        int newones=oldones+oldzero;

        oldzero=newzero;
        oldones=newones;
    }
    int finalAns=oldones+oldzero;

    System.out.println(finalAns);




 }

}
