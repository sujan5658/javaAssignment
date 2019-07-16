import java.util.Scanner;
public class JavaPracticeSet1 {
    public static void ques1(){
        System.out.println("Hello");
        System.out.println("Sujan Koju");
    }
    public static void ques2(){
        int num1 = 5;
        int num2 = 6;
        int numSum;
        numSum = num1 + num2;
        System.out.println("Variable num1 = 5 and num2 = 6");
        System.out.println("Now Their Sum is "+numSum);
    }
    public static void ques3(){
        byte num1=10,num2=2;
        System.out.println("The first number is "+num1+" and the second number is "+num2);
        System.out.println("Now the first number divide by second number is : "+num1/num2);
    }
    public static void ques4(){
        byte ans1,ans2;
        float ans3,ans4;
        ans1 = -5+8*6;
        ans2 = (55+9)%9;
        ans3 = 20 + -3*5/8;
        ans4 = 5+15/3*2-8%3;
        System.out.println("The result of Operation -5+8*6 is : "+ans1);
        System.out.println("The result of Operation (55+9)%9 is : "+ans2);
        System.out.println("The result of Operation 20 + -3*5/8 is : "+ans3);
        System.out.println("The result of Operation 5+15/3*2-8%3 is : "+ans4);
    }
    public static void ques5(){
        float num1,num2;
        System.out.print("Enter the first number : ");
        num1 = new Scanner(System.in).nextInt();
        System.out.print("Enter the second number : ");
        num2 = new Scanner(System.in).nextInt();
        System.out.println("The product of two number is : "+num1*num2);
    }
    public static void ques6(){
        byte num1,num2,num3;
        num1 = 10;
        num2 = 2;
        System.out.println("The first number is "+num1+" and the second number is "+num2);
        num3 = (byte) (num1 + num2);
        System.out.println("The addition of two number is : "+num3);
        num3 = (byte) (num1 - num2);
        System.out.println("The subtraction of two number is : "+num3);
        num3 = (byte) (num1 * num2);
        System.out.println("The product of two number is : "+num3);
        num3 = (byte) (num1/num2);
        System.out.println("The division of two number is : "+num3);
        num3 = (byte) (num1%num2);
        System.out.println("The remainder is : "+num3);
    }
    public static void ques7(){
        byte num,i;
        System.out.print("Enter the number between 1 to 127 : ");
        num = new Scanner(System.in).nextByte();
        if(num<=0 || num>127){
            System.out.println("You enter invalid number.!!! Valid number is from 1 to 127");
        }
        else{
            System.out.println("The multiplication table of "+num+" upto 10 is given below.");
            for(i=1;i<=10;i++){
                System.out.println(i+", "+num+" * "+i+" = "+num*i);
            }
        }
    }
    public static void main(String[] args){
        byte choice;
        System.out.println("Answer of Java Practice Set form Question 1 to Question 10.\n");
        System.out.println("1. Ans Of Question 1.\n2. Ans of Question 2.\n3. Ans of Question 3.\n4. Ans of Question 4.");
        System.out.println("5. Ans of Question 5.\n6. Ans of Question 6.\n7. Ans of Question 7.\n8. Ans of Question 8.");
        System.out.println("9. Ans of Question 9.\n10. Ans of Question 10.");
        System.out.print("\nPlease Enter the valid number to get Answer : ");
        choice = new Scanner(System.in).nextByte();
        switch(choice){
            case 1:
                ques1();
                break;
            case 2:
                ques2();
                break;
            case 3:
                ques3();
                break;
            case 4:
                ques4();
                break;
            case 5:
                ques5();
                break;
            case 6:
                ques6();
                break;
            case 7:
                ques7();
                break;
            case 8:
                System.out.println("There is no pattern given in the question.");
                break;
            case 9:
                float num1;
                num1 = (float)((25.5*3.5-3.5*3.5)/(40.5-4.5));
                System.out.println("The output of ((25.5*3.5-3.5*3.5)/(40.5-4.5)) is : "+num1);
                break;
            case 10:
                float num2;
                num2 = (float) (4.0*(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)); 
                System.out.println("The solution of 4.0*(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11) is : "+num2);
                break;
            default:
                System.out.println("Sorry You have Entered invalid number.!! The number must be between 1 to 10");
        }
    }
}
