package src;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so n: ");
        int n = sc.nextInt();
        if( n%2 ==0){
            System.out.println("so chan");
        }else{
            System.out.println("so le");
        }
        sc.close();
    }
}
