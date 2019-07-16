
package Exception;
import java.util.Scanner;
public class NullPointer {
   public static void main(String[] args){
       /*
       Null Pointer exception error will arise while we declare object but doesnot initialize it.
       */
       
//       Scanner scan=null;
//       int num;
//       num = scan.nextInt(); //using scan object without initializing it.
       
       /*
       The error is :
       Exception in thread "main" java.lang.NullPointerException
       */
       
       //It can be handeled by
       Scanner scan = null;
       int num;
       try{
           num = scan.nextInt();  //Using scan object without initializing
       }
       catch(Exception er){
           System.out.println(er);  //Error : java.lang.NullPointerException
       }
   } 
}
