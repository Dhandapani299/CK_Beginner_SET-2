import java.io.*;
import java.util.*;
public class BetArm{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
		 System.out.println("Enter the start number");
		 int low= s.nextInt();
 		 System.out.println("Enter the end number");
		 int high = s.nextInt();
		 

for(int number=low+1;number<high;++number){
int digits=0;
int result=0;
int originalnumber = number;

while(originalnumber != 0){

originalnumber/=10;
++digits;
}
originalnumber = number;

while(originalnumber != 0){

int remainder = originalnumber % 10;
result += Math.pow(remainder, digits);
originalnumber /= 10;
}

if(result == number)
System.out.println(number +" ");
}
}
}
	 





