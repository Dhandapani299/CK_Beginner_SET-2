import java.io.*;
import java.util.*;
public class Armstrong{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num = s.nextInt();
 		 
		 int number,temp,total=0;

number = num; 
for(;number!=0;number /= 10)
{

temp = number % 10;
total = total + temp*temp*temp;
}
if(total==num)
System.out.println("yes");
else
System.out.println("no");

}
}
	 





