package src;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten cua ban: ");
        String ten = sc.next(); 
        System.out.println("nhap nam sinh cua ban: ");
        int ns = sc.nextInt();
        int tuoi = 2020 - ns;
        if(tuoi < 16){
            System.out.println("ban " +ten + " o do tuoi vi thanh nien");
        }else if(tuoi >=16){
            System.out.println("ban " +ten +" o do tuoi truong thanh");
        }else if(tuoi >= 18){
            System.out.println("ban " +ten +" o do tuoi gia");
        }
        sc.close();
    }
}
