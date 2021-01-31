package src;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        float s = 0;
        float arr[] = new float[n];
        System.out.println("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            s = s + arr[i];
        }
        float tbc = s / arr.length;
        System.out.println("trung bình cộng là: " +tbc);
    sc.close();
    }
}
