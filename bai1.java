package src;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a: ");
        int a = sc.nextInt();
        System.out.println("nhap so b: ");
        int b = sc.nextInt();
        int tong = a+b;
        int hieu = a-b;
        int tich = a*b;
        int thuong = a%b; 
        System.out.println("tong la: " +tong);
        System.out.println("hieu la: " +hieu);
        System.out.println("tich la: " +tich);
        System.out.println("thuong la:" +thuong);
        int max = a>b ? a:b;
        System.out.println("so lon hon la: " + max);
    sc.close();
    }
}
