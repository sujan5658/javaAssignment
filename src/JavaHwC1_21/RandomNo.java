
package JavaHwC1_21;

public class RandomNo {
    /**
     * Method RandomNumber takes integer array as a parameter.
     * The Method Random Number returns the random number between range 1 to 52.
     * If the integer number in array is greater than 52 or less than 1 then the Method returns same array value.
     */
    public int[] RandomNumber(int num[]){
        int i,randomNo;
        int len,temp;
        len = num.length-1;
        for(i=0;i<len;i++){
            if(num[i]<1 || num[i]>52){
                System.out.println("The Array contain the number greater than 52 or less than 1.!!!");
                System.exit(1);
            }
        }
        for(i=0;i<len;i++){
            randomNo = (int) (Math.random()*len+1);
            temp = num[i];
            num[i] = num[randomNo];
            num[randomNo] = temp;
        }
        return num;
    }
}
