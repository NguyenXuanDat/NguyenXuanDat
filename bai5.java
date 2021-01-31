package src;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) throws Exception {
        int s = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap n: ");
             n = sc.nextInt();
            s += n;
    }while(s < 100);
    sc.close();
    System.out.println("Tong la: " +s);
    }
}
