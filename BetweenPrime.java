import java.io.*;
import java.util.*;
public class BetweenPrime{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
		 System.out.println("Enter the start number");
		 int low = s.nextInt();
 		 System.out.println("Enter the last number");
		 int high = s.nextInt();
		 
while(low<high){

boolean flag = false;
for(int i=2;i<=low/2;++i){

if(low%i==0){
flag = true;
break;
}
}
if(!flag)
System.out.println(low + " ");
++low;
}
}}
	 





