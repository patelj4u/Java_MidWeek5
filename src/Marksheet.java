import java.util.Scanner;

public class Marksheet {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("HINDI");
        int s1=input.nextInt();
        System.out.println(" GUJARATI");
        int s2=input.nextInt();
        System.out.println("SCIENCE");
        int s3=input.nextInt();
        System.out.println("SANSKRIT");
        int s4=input.nextInt();
        System.out.println("ENGLISH");
        int s5=input.nextInt();
        int total_Marks=s1+s2+s3+s4+s5;
        float percentage=total_Marks*100/500;
        System.out.println("Your total marks = " +total_Marks);
        System.out.println("Your percentage is ="+percentage );



    }
}
