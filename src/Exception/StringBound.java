
package Exception;

public class StringBound {
    public static void main(String [] args){
//        String name;
//        char ch;
//        name = "Sujan Koju";
//        ch = name.charAt(10);  //Try to access the character of index 10 which is not valid index for given string
//        System.out.println(ch);
        
        /*
            Error in the above program is :
            Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10
        */
        String name;
        char ch;
        try{
            name = "Sujan Koju";
            ch =name.charAt(10); //Try to access the character of index 10 which is not valid index for given string
            System.out.println(ch);
        }
        catch(Exception er){
            System.out.println(er); // Error : java.lang.StringIndexOutOfBoundsException: String index out of range: 10
        }
    }
}
