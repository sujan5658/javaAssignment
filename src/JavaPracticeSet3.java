import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class JavaPracticeSet3 {
    static final byte UNIT_COST=100;
    public static void ques21(){
        String str;
        int i;
        System.out.print("Enter any string : ");
        str = new Scanner(System.in).nextLine();
        ArrayList<Character> st = new ArrayList<>(str.length());
        for(i=str.length();i>0;i--){
           st.add(str.charAt(i-1));
        }
        for(i=0;i<st.size();i++){
            System.out.print(st.get(i));
        }
        System.out.println("");
    }
    public static void ques22(){
        char ch;
        System.out.print("Enter any character : ");
        ch = new Scanner(System.in).nextLine().charAt(0);
        System.out.println("The ASCII value of "+ch+" is "+(int)ch);
    }
    public static void ques23(){
        Date date = new Date();
        System.out.println("Current Date time: "+date);
    }
    public static void ques24(){
        Date date = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Now : "+dateFormatter.format(date));
    }
    public static void ques25(){
        String str = "12345";
        System.out.println("Here the given string is "+str);
        int num;
        num = Integer.parseInt(str);
        System.out.println("After conversion to number : "+num);
    }
    public static void ques26(){
        System.out.println(Math.random() + " is the random number");
    }
    public static void ques27(){
        byte num = (byte)(Math.random()*100+1);
        System.out.println("The random number between 1 to 100 is : "+num);
    }
    public static void ques28(){
        float l,b;
        System.out.print("Enter the length of rectangle : ");
        l = new Scanner(System.in).nextFloat();
        System.out.print("Enter the breadth of rectangle : ");
        b = new Scanner(System.in).nextFloat();
        if(l==b){
            System.out.println("It is a square.");
        }
        else{
            System.out.println("It is a rectangel not a square.");
        }
    }
    public static void ques29(){
        int num1,num2;
        System.out.print("Enter the first number : ");
        num1 = new Scanner(System.in).nextInt();
        System.out.print("Enter the second number : ");
        num2 = new Scanner(System.in).nextInt();
        if(num1>num2)
            System.out.println(num1 + " is the greater number.");
        else
            System.out.println(num2 + " is the greater number.");
    }
    public static void ques30(){
        byte quantity;
        float cost;
        System.out.print("Enter the quantity : ");
        quantity = new Scanner(System.in).nextByte();
        cost = quantity*UNIT_COST;
        if(cost>1000)
            cost=(float) (cost-(cost*0.1)); 
        System.out.println("The total cost is : "+cost);
    }
    public static void main(String[] args){
        byte choice;
        System.out.println("Answer of Java Practice Set form Question 21 to Question 30.\n");
        System.out.println("1. Ans Of Question 21.\n2. Ans of Question 22.\n3. Ans of Question 23.\n4. Ans of Question 24.");
        System.out.println("5. Ans of Question 25.\n6. Ans of Question 26.\n7. Ans of Question 27.\n8. Ans of Question 28.");
        System.out.println("9. Ans of Question 29.\n10. Ans of Question 30.");
        System.out.print("\nPlease Enter the valid number to get Answer : ");
        choice = new Scanner(System.in).nextByte();
        switch(choice){
            case 1:
                ques21();
                break;
            case 2:
                ques22();
                break;
            case 3:
                ques23();
                break;
            case 4:
                ques24();
                break;
            case 5:
                ques25();
                break;
            case 6:
                ques26();
                break;
            case 7:
                ques27();
                break;
            case 8:
                ques28();
                break;
            case 9:
                ques29();
                break;
            case 10:
                ques30();
                break;
            default:
                System.out.println("Sorry You have Entered invalid number.!! The number must be between 1 to 10");
        }
    }
}
