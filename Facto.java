import java.util.*;
public class Facto{
public static int method(int x){

if (x==0 || x==1){
return (1);
}
else 
return method(x-1)*x;}

public static void main (String [] abc){

System.out.println("the factorical of 1 to 10 are : ");
for (int i =1 ;i<=10;i++){
System.out.println("the factoircal of "+i+ "="+ method(i));
}
}}