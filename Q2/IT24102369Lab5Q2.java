import java.util.Scanner;

public class IT24102369Lab5Q2
{
     public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
    
      int no_of_new_members;
      System.out.print("Enter the number of new members introduced:");
      no_of_new_members = input.nextInt();
      if (no_of_new_members==0){
      System.out.print("No prize");
      }else if (no_of_new_members==1){
      System.out.print(" Prize is a : Pen");
      }else if(no_of_new_members==2){
      System.out.print(" Prize is a : Umbrella");
      }else if (no_of_new_members==3){
      System.out.print("Prize is a :Bag");
      }else if (no_of_new_members==4){
      System.out.print("Prize is a : Travelling chair");
      }else if (no_of_new_members>=5){
      System.out.print("Prize is a: Headphone");
      }else{
      System.out.print(" Input must be a number 0 or greater");
           }
    }
}