
package Exception;

public class IndexBound {
    public static void main(String[] args){
        /** 
         Array Index out of bound error occurs while accessing the index of array which is not available in array.
         */
        
//        int num[] = new int[5];
//        for(int i=1;i<=5;i++){
//            num[i-1] = i;
//        }
//        System.out.println(num[4]);  //Accessing the last index of array
//        System.out.println(num[5]);  //Accessing the index that is not available in array num
        
        /* In above Program the error is :
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        */
        
        //It can be handeled by
        int num[] = new int[5];
        try{
            for(int i=1;i<=5;i++){
                num[i-1] = i;
            }
            System.out.println(num[4]);  //Accessing the last index of array
            System.out.println(num[5]);  //Accessing the index that is not available in array num
        }
        catch(Exception er){
            System.out.println(er);
        }
        /* when in try block any exception is found, then it is thrown to the catch block*/
    }
}
