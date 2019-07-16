package JavaHwC1_21;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int num[] = new int[5];
        int i;
        int random[] = new int[5];
        RandomNo rand;
        rand = new RandomNo();
        System.out.println("Enter any five integer number between 1 to 52 : ");
        for(i=0;i<5;i++){
            num[i] = new Scanner(System.in).nextInt();
        }
        random = rand.RandomNumber(num);
        for(i=0;i<5;i++){
            System.out.print(num[i]+" ");
        }
    }
}
