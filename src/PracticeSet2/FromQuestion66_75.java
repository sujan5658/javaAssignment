
package PracticeSet2;
import java.util.Scanner;
enum WEEKDAY{SUNDAY,MONDAY,TUESDAY,WEDENSDAY,THURSDAY,FRIDAY,SATURDAY,INVALID_INPUT};
public class FromQuestion66_75 {
    public static WEEKDAY weekDay(byte num){
        WEEKDAY day;
        switch(num){
            case 1:
                day = WEEKDAY.SUNDAY;
                return day;
            case 2:
                day = WEEKDAY.MONDAY;
                return day;
            case 3:
                day = WEEKDAY.TUESDAY;
                return day;
            case 4:
                day = WEEKDAY.WEDENSDAY;
                return day;
            case 5:
                day = WEEKDAY.THURSDAY;
                return day;
            case 6:
                day = WEEKDAY.FRIDAY;
                return day;
            case 7:
                day = WEEKDAY.SATURDAY;
                return day;
            default:
                day = WEEKDAY.INVALID_INPUT;
                return day;
        }      
    }  
    public static boolean validTriangleAngle(float angles[]){
        int i;
        float sum;
        sum=0;
        for(i=0;i<3;i++){
            sum+=angles[i];
        }
        if(sum==180){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean validTriangleSides(float sides[]){
        if((sides[0]+sides[1])>sides[2] && (sides[0]+sides[2])>sides[1] && (sides[2]+sides[1])>sides[0]){
            return true;
        }
        else{
            return false;
        }
    }
    public static String checkTrianlge(float sides[]){
        if(sides[0]==sides[1] && sides[0]==sides[2]){
            return "Equilateral";
        }
        else{
            if(sides[0]==sides[1] || sides[0]==sides[2] || sides[1]==sides[2]){
                return "Isosceles";
            }
            else{
                return "Scalene";
            }
        }
    }
    public static Object[] percentGrade(float marks[]){
        float totalMarks=0;
        float percentage;
        Object result[] = new Object[2];
        int i;
        for(i=0;i<marks.length;i++){
            totalMarks+=marks[i];
        }
        percentage = totalMarks/marks.length;
        if(percentage>=90){
            result[1] = "A";
        }
        else{
            if(percentage>=80 && percentage<=90){
                result[1] = "B";
            }
            else{
                if(percentage>=70 && percentage<=80){
                    result[1] = "C";
                }
                else{
                    if(percentage>=60 && percentage<=70){
                        result[1] = "D";
                    }
                    else{
                        if(percentage>=40 && percentage<=60){
                            result[1] = "E";
                        }
                        else{
                            result[1] = "F";
                        }
                    }
                }
            }
        }
        result[0] = percentage;
        return result;
    }
    public static void main(String[] args){
        //From Question NO 56 to 76
        //declare
        byte choice;
        byte weekNo;
        int i;
        float a,b,c;
        float angles[] = new  float[3];
        float sides[] = new float[3];
        //process
        System.out.println("From Question NO 66 to 75");
        System.out.println("Choose the question No to get answer.");
        System.out.println("1. Question no 66");
        System.out.println("2. Question no 67");
        System.out.println("3. Question no 68");
        System.out.println("4. Question no 69");
        System.out.println("5. Question no 70");
        System.out.println("6. Question no 71");
        System.out.println("7. Question no 72");
        System.out.println("8. Question no 73");
        System.out.println("9. Question no 74");
        System.out.println("10. Question no 75");
        System.out.print("Your Choice : ");
        choice = new Scanner(System.in).nextByte();
        
        switch(choice){
            case 1:
                System.out.print("Enter the week number : ");
                weekNo = new Scanner(System.in).nextByte();
                System.out.println("The week day is : "+weekDay(weekNo));
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                System.out.println("Enter the three angles of the triangle : ");
                for(i=0;i<3;i++){
                    angles[i] = new Scanner(System.in).nextFloat();
                }
                if(validTriangleAngle(angles)){
                    System.out.println("The tringle is valid");
                }
                else{
                    System.out.println("The triangle is not a valid triangle");
                }
                break;
            case 5:
                System.out.println("Enter the three sides of triangle : ");
                for(i=0;i<3;i++){
                    sides[i] = new Scanner(System.in).nextFloat();
                }
                if(validTriangleSides(sides)){
                    System.out.println("Valid Triangle.");
                }
                else{
                    System.out.println("Invalid Triangle.");
                }
                break;
            case 6:
                System.out.println("Enter the three sides of the triangle : ");
                for(i=0;i<3;i++){
                    sides[i] = new Scanner(System.in).nextFloat();
                }
                System.out.println("The triangle is : "+checkTrianlge(sides));
                break;
            case 7:
                System.out.println("Enter the value of a,b and c of the quadratic eqn : ");
                a = new Scanner(System.in).nextFloat();
                b = new Scanner(System.in).nextFloat();
                c = new Scanner(System.in).nextFloat();
                float determinant;
                float roots[] = new float[4];
                determinant = (float)(Math.sqrt(Math.pow(b,2)-4*a*c));
                if(determinant>0){
                    roots[0] = (-b+determinant)/(2*a);
                    roots[1] = (-b-determinant)/(2*a);
                    System.out.println("The roots are real and are : "+roots[0]+" and  "+roots[1]);
                 }
                else{
                    if(determinant==0){
                        roots[0] = (-b)/(2*a);
                        System.out.println("The root is equal and is : "+roots[0]);
                    }
                    else{
                        roots[0] = (-b)/(2*a);
                        roots[1] = (float)((Math.sqrt(-determinant))/(2*a));
                        System.out.println("The root is imaginary i.e : "+roots[0]+"+"+roots[1]+"i");
                    }
                }
                break;
            case 8:
                float cp,sp,loss,profit;
                System.out.print("Enter the Cost Price : ");
                cp = new Scanner(System.in).nextFloat();
                System.out.print("Enter the Selling Price : ");
                sp = new Scanner(System.in).nextFloat();
                if(sp>cp){
                    profit = sp-cp;
                    System.out.println("The profit is : "+profit);
                }
                else{
                    loss = cp-sp;
                    System.out.println("The loss is : "+loss);
                }
                break;
            case 9:
                float marks[] = new  float[5];
                Object result[] = new Object[2];
                System.out.print("Enter the mark of Physics : ");
                marks[0] = new Scanner(System.in).nextFloat();
                System.out.print("Enter the mark of Chemistry : ");
                marks[1] = new Scanner(System.in).nextFloat();
                System.out.print("Enter the mark of Biology : ");
                marks[2] = new Scanner(System.in).nextFloat();
                System.out.print("Enter the mark of Mathematics : ");
                marks[3] = new Scanner(System.in).nextFloat();
                System.out.print("Enter the mark of Computer : ");
                marks[4] = new Scanner(System.in).nextFloat();
                result = percentGrade(marks);
                System.out.println("The percentage is : "+result[0]+"% and Grade is : "+result[1]);
                break;
            case 10:
                
                break;
            default :
                System.out.println("Invalid choice, choice must be from 1 to 10");
        }
    }
}
