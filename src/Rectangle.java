import java.util.Scanner;

//input length
// input breath
// formula length* breath
public class Rectangle {
    public static void main(String[]args){
        int l,b;
        System.out.println("Enter value for sides");
        Scanner r=new Scanner(System.in);
        l=r.nextInt();//10
        b=r.nextInt();//5
        int area = l * b;//50
        System.out.println("Area of rectangle " +area);


    }
}
