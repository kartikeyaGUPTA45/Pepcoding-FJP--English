import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        
      // Base case
        if(n==0) return ;
        
        // My Work
        System.out.println(n);
        // faith
        pd(n-1);
        
      // My work
        System.out.println(n);
        
    }

}
