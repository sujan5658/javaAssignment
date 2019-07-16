
package Exception;

public class ArithemeticException {
    public static void main(String[] args){
        //Arithemetic Exception
        /** 
         Arithmetic Exception occurs when a number is divided by zero.
         */
        
//        int num1,num2,num3;
//        num1 = 10;
//        num2 = 0;
//        num3 = num1/num2;
//        System.out.println(num3);
        
        /** 
         The above program will gives out the error.
         Exception in thread "main" java.lang.ArithmeticException: / by zero
         */
        
        //Such error can be handel by following way.
        int num1,num2,num3;
        try{
            num1=10;
            num2=0;
            num3=num1/num2;
            System.out.println(num3);
        }
        catch(ArithmeticException er){
            System.out.println(er);
        }
        /* Try will throw the exception occured to the catch and catch will manipulate it*/
    }
}
