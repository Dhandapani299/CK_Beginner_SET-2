import java.io.*;
import java.util.*;
public class PrimeNumber{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num = s.nextInt();
		 boolean flag = false;
for(int i=2;i<=num/2;++i)
{
if(num%i==0)
{
flag = true;
break;
}
}
		 

if(!flag)
System.out.println("yes");
else
System.out.println("no");


 		}
	}

