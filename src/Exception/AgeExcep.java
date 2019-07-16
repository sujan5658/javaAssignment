
package Exception;
import java.util.Scanner;
public class AgeExcep {
    /* This type of exception occur while user input invalid values.*/
    //It can be handeled by:
    public static void main(String[] args){
        int age;
        try{
            System.out.print("Enter age [40-50]:");
            age = new Scanner(System.in).nextInt();  //Taking input from user
            if(age<40 || age>50){ //if user input age less than 40 or greater than 50 it throws Exception
                throw new AgeException("You Enter age out of range");
            }
        }
        catch(Exception er){
            System.out.println(er);
        }
    }
}
