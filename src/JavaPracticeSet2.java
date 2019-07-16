import static java.lang.Math.*;
import java.util.Scanner;
public class JavaPracticeSet2 {
    static final float PIE=3.141592654F;
    static final float EARTH_RADIUS = 6371.01F;
    public static void ques11(){
        float area,perimeter;
        byte radius = 3;
        System.out.println("Let the radius of the circle be "+radius+" m");
        area = (float) (PIE*Math.pow(radius,2));
        perimeter = 2 * PIE * radius;
        System.out.println("The area of circle is : "+area+" m sq.");
        System.out.println("The perimeter of circle is : "+perimeter+" m.");
    }
    public static void ques12(){
        float num1,num2,num3,avg;
        System.out.print("Enter the three numbers : ");
        num1 = new Scanner(System.in).nextFloat();
        num2 = new Scanner(System.in).nextFloat();
        num3 = new Scanner(System.in).nextFloat();
        avg = (num1+num2+num3)/3;
        System.out.println("The average of three number is : "+avg);
    }
    public static void ques13(){
        byte length,breadth,area,perimeter;
        length = 6;
        breadth = 2;
        System.out.println("Let the length of rectange be "+length+"m and breadth be "+breadth+"m.");
        area = (byte) (length*breadth);
        perimeter = (byte) (2*(length+breadth));
        System.out.println("The area of rectange is : "+area+"m sq. and perimeter is : "+perimeter+"m.");
    }
    public static void ques14(){
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * * ===================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * * ===================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * * ===================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * * ===================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    }
    public static void ques15(){
        byte a=5,b=6;
        a =  (byte)(a+b);
        b = (byte)(a-b);
        a= (byte)(a-b);
        System.out.println("The variable a = 5 and b = 6 before swapping.");
        System.out.println("Now after swapping the variable a = "+a+" and variable b = "+b);
    }
    public static void ques16(){
        System.out.println(" -----");
        System.out.println("( 0 0 )");
        System.out.println("(  |  )");
        System.out.println("(  ~  )");
        System.out.println(" -----");
    }
    public static void ques17(){
        int num1,num2;
        System.out.print("Input an integer : ");
        num1 = new Scanner(System.in).nextInt();
        num2 = new Scanner(System.in).nextInt();
        num1+=num2;
        System.out.println("The sum of the digits is: "+num1);
    }
    public static void ques18(){
        float s,area;
        System.out.print("Enter the side of the hexagon : ");
        s = new Scanner(System.in).nextFloat();
        area = (float)((6*Math.pow(s,2))/(4*tan(PIE/6)));
        System.out.println("The area of hexagon is : "+area);
    }
    public static void ques19(){
        byte n;
        float s,area;
        System.out.print("Enter the number of sides of polygon : ");
        n = new Scanner(System.in).nextByte();
        System.out.print("Enter the length of the side : ");
        s = new Scanner(System.in).nextFloat();
        area = (float)((n*Math.pow(s,2)/(4*tan(PIE/n))));
        System.out.println("The area of the Polygon is : "+area);
    }
    public static void ques20(){
        float x1,x2,y1,y2;
        float distance;
        System.out.print("Input the latitude of coordinate 1: ");
        x1 = new Scanner(System.in).nextFloat();
        System.out.print("Input the longitude of coordinate 1: ");
        y1 = new Scanner(System.in).nextFloat();
        System.out.print("Input the latitude of coordinate 2: ");
        x2 = new Scanner(System.in).nextFloat();
        System.out.print("Input the longitude of coordinate 2: ");
        y2 = new Scanner(System.in).nextFloat();
        distance = (float) (EARTH_RADIUS*cos(sin(x1)*sin(x2)+cos(x1)*cos(x2)*cos(y1-y2)));
        System.out.println("The distance between two point on the earth is : "+distance);
    }
    public static void main(String[] args){
        byte choice;
        System.out.println("Answer of Java Practice Set form Question 11 to Question 20.\n");
        System.out.println("1. Ans Of Question 11.\n2. Ans of Question 12.\n3. Ans of Question 13.\n4. Ans of Question 14.");
        System.out.println("5. Ans of Question 15.\n6. Ans of Question 16.\n7. Ans of Question 17.\n8. Ans of Question 18.");
        System.out.println("9. Ans of Question 19.\n10. Ans of Question 20.");
        System.out.print("\nPlease Enter the valid number to get Answer : ");
        choice = new Scanner(System.in).nextByte();
        switch(choice){
            case 1:
                ques11();
                break;
            case 2:
                ques12();
                break;
            case 3:
                ques13();
                break;
            case 4:
                ques14();
                break;
            case 5:
                ques15();
                break;
            case 6:
                ques16();
                break;
            case 7:
                ques17();
                break;
            case 8:
                ques18();
                break;
            case 9:
                ques19();
                break;
            case 10:
                ques20();
                break;
            default:
                System.out.println("Sorry You have Entered invalid number.!! The number must be between 1 to 10");
        }
    }
}
