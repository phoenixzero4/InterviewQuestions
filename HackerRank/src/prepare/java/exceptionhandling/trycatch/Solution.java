package prepare.java.exceptionhandling.trycatch;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        try{
            int x = in.nextInt();
            int y = in.nextInt();
            
            System.out.println(x / y);
        }catch(InputMismatchException ime){
            System.out.print("java.util.InputMismatchException");
        }catch(ArithmeticException ae){
            System.out.print("java.lang.ArithmeticException: / by zero");
        }
    }
}

