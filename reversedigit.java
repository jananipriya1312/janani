import java.util.*;
import java.Scanner;
public class reverse{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
 while(s!=0){
 int a=s%10;
 reversed=reversed*10+a;
 s/=10;
 }
 System.out.println(reversed);
 }
 }
