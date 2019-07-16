package PracticeSet2;
import java.util.Scanner;
public class FromQuestion56_65 {
    public static int maxNoTwo(int num1,int num2){
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }
    public static int maxNoThree(int num1,int num2,int num3){
        if(num1>num2){
            if(num1>num3){
                return num1;
            }
            else{
                return num3;
            }
        }
        else{
            if(num2>num3){
                return num2;
            }
            else{
                return num3;
            }
        }
    }
    static public String checkNo(int num){
        if(num>0){
            return "Positive";
        }
        else if(num<0){
            return "Negative";
        }
        else{
            return "Zero";
        }
    }
    public static boolean alphabet(char ch){
        if((int)ch>=97 && (int)ch<=122){
            return true;
        }
        else if((int)ch>=65 && (int)ch<=90){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean vowel(char ch){
        switch(ch){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default :
                return false;
        }
    }
    public static boolean digit(char ch){
        switch(ch){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default :
                return false;
        }
    }
    public static boolean specialChar(char ch){
        if((int)ch>=65 && (int)ch<=90){
            return false;
        }
        else if((int)ch>=97 && (int)ch<=122){
            return false;
        }
        else if((int)ch>=48 && (int)ch<=57){
            return false;
        }
        else{
            return true;
        }
    }
    public static String upperOrLower(char ch){
        if(specialChar(ch)){
            return "Not Upper Not Lower";
        }
        else{
            if((int)ch>=65 && (int)ch<=90){
                return "Upper";
            }
            else{
                return "Lower";
            }
        }
    }
    public static void main(String[] args){
        //From Question NO 56 to 76
        //declare
        byte choice;
        int num1,num2,num3,max;
        char ch;
        String checkNum;
        //process
        System.out.println("From Question NO 56 to 76");
        System.out.println("Choose the question No to get answer.");
        System.out.println("1. Question no 56");
        System.out.println("2. Question no 57");
        System.out.println("3. Question no 58");
        System.out.println("4. Question no 59");
        System.out.println("5. Question no 60");
        System.out.println("6. Question no 61");
        System.out.println("7. Question no 62");
        System.out.println("8. Question no 63");
        System.out.println("9. Question no 64");
        System.out.println("10. Question no 65");
        System.out.print("Your Choice : ");
        choice = new Scanner(System.in).nextByte();
        
        switch(choice){
            case 1:
                num1=5;
                num2=14;
                System.out.println("The first number is "+num1+" and second number is "+num2);
                max = maxNoTwo(num1,num2);
                System.out.println("The maximum is : "+max);
                break;
            case 2:
                num1=20;
                num2=35;
                num3=15;
                System.out.println("The first number is "+num1+" and second number is "+num2+" and third no is : "+num3);
                max = maxNoThree(num1,num2,num3);
                System.out.println("The maximum is : "+max);
                break;
            case 3:
                num1=5;
                System.out.println("The number is : "+num1);
                checkNum = checkNo(num1);
                System.out.println("The number is : "+checkNum);
                break;
            case 4:
                num1=66;
                System.out.println("The number is : "+num1);
                if(num1%5==0 && num1%11==0){
                    System.out.println("The number "+num1+" is divisible by 5 and 11");
                }
                else{
                    System.out.println("The number "+num1+" is not divisible by 5 and 11");
                }
                break;
            case 5:
                num1=15;
                System.out.println("The number is : "+num1);
                if(num1%2==0){
                    System.out.println("It is Even number");
                }
                else{
                    System.out.println("It is Odd number");
                }
                break;
            case 6:
                
                break;
            case 7:
                ch = 'K';
                System.out.println("The character is : "+ch);
                if(alphabet(ch)){
                    System.out.println("It is alphabet");
                }
                else{
                    System.out.println("It is not alphabet");
                }
                break;
            case 8:
                ch = 'a';
                System.out.println("The character is : "+ch);
                if(vowel(ch)){
                    System.out.println("The character is vowel.");
                }
                else{
                    System.out.println("The character is consonant.");
                }
                break;
            case 9:
                System.out.print("Enter any character : ");
                ch = new Scanner(System.in).nextLine().charAt(0);
                if(alphabet(ch)){
                    System.out.println("The character is alphabet");
                }
                else{
                    if(digit(ch)){
                        System.out.println("The character is digit");
                    }
                    else{
                        System.out.println("The character is Special Char");
                    }
                }
                break;
            case 10:
                System.out.print("Enter any character : ");
                ch = new Scanner(System.in).nextLine().charAt(0);
                System.out.println("The character is "+upperOrLower(ch));
                break;
            default :
                System.out.println("Invalid choice, choice must be from 1 to 10");
        }
    }
}
