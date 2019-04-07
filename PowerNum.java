import java.io.*;
import java.util.*;
public class PowerNum{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
		 System.out.println("Enter the base number");
		 int base = s.nextInt();
		 int value = 1;;
		 System.out.println("Enter the expponent number");
		 int exp = s.nextInt();

while(exp !=0){
value *= base;
--exp;

}




				
System.out.println("RESULT" +value);

 		}
	}

