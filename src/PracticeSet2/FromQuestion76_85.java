
package PracticeSet2;
import java.util.Scanner;
public class FromQuestion76_85 {
    public static float electricity(short unit){
        float totalAmount=0;
        if(unit>50){
            totalAmount = (float)(0.5 * 50);
            unit-=50;
            if(unit>100){
                totalAmount = totalAmount + (float)(0.75*100);
                unit-=100;
                if(unit>100){
                    totalAmount = totalAmount+ (float)(1.20*100);
                    unit-=100;
                    if(unit>0){
                        totalAmount = totalAmount + (float)(1.50*unit);
                    }
                }
                else{
                    totalAmount = totalAmount + (float)(1.20*unit);
                }
            }
            else{
                totalAmount = totalAmount + (float)(0.75*unit);
            }
        }
        else{
            totalAmount=(float)(unit*0.50);
        }
        totalAmount = (float)(totalAmount + (0.2 * totalAmount));
        return totalAmount;
    }
    public static void main(String[] args){
        //From question 76 to 85
        System.out.println("From Question 76 to 85");
        //declare
        byte choice;
        //process
        System.out.println("From Question NO 56 to 76");
        System.out.println("Choose the question No to get answer.");
        System.out.println("1. Question no 76");
        System.out.println("2. Question no 77");
        System.out.println("3. Question no 78");
        System.out.println("4. Question no 79");
        System.out.println("5. Question no 80");
        System.out.println("6. Question no 81");
        System.out.println("7. Question no 82");
        System.out.println("8. Question no 83");
        System.out.println("9. Question no 84");
        System.out.println("10. Question no 85");
        System.out.print("Your Choice : ");
        choice = new Scanner(System.in).nextByte();
        
        switch(choice){
            case 1:
                short unit;
                System.out.print("Enter the electrical units consumed : ");
                unit = new Scanner(System.in).nextShort();
                if(unit>0){
                    float totalAmount = electricity(unit);
                    System.out.println("The total Amount of bill is : "+totalAmount);
                }
                else{
                    System.out.println("The unit is negative.");
                }
                break;
            case 2:
                byte day;
                System.out.print("Enter the numeric value of day of the week : ");
                day = new Scanner(System.in).nextByte();
                switch(day){
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default :
                        System.out.println("Invalid Week number.");
                }
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
                
                break;
            case 10:
                
                break;
            default :
                System.out.println("Invalid choice, choice must be from 1 to 10");
        }
                
    }
}
