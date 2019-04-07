import java.io.*;
import java.util.*;
public class Palindrome{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
		 System.out.println("Enter the base number");
		 int num = s.nextInt();
		 int r,sum= 0,temp;
		 
temp = num;
while(num>0){
r=num%10;
sum=(sum*10)+r;
num=num/10;  	
}

if(temp == sum)
System.out.println("yes");
else
System.out.println("no");


 		}
	}

