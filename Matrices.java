# Matrices
import java.util.*;
import java.io.*;

public class Matrices{

   
    public static void main(String[] args) {
        // TODO code application logic here
        int a,count=0;
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        a=s.length();
        for(int i=0;i<a-2;i++){
            if((s.charAt(i)==s.charAt(i+1))&&(s.charAt(i)==s.charAt(i+2))){
                count++;
            }else{
                continue;
            }
        }
        System.out.println("countis "+count);
    }
}
