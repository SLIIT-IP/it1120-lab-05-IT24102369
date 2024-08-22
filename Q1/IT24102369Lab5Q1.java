import java.util.Scanner;
public class IT24102369Lab5Q1
{
public static void main(String[]args)
{
Scanner input = new Scanner(System.in);
int n1,n2,n3,max,min;
System.out.print("Enter the first integer:");
n1=input.nextInt();
System.out.print("Enter the second integer:");
n2=input.nextInt();
System.out.print("Enter the third integer:");
n3=input.nextInt();
if(n1>n2){
max=n1;
min=n2;
}
else{
max=n2;
min=n1;
}
if(n3<min){
min=n3;
}
System.out.println("User entered numbers are:"+n1+","+n2+","+n3);
System.out.println("The Largest number is:"+max);
System.out.println("The Largest number is:"+min);
}
}