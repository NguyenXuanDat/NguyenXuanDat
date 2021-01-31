package src;
import java.util.Scanner;
public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", +i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Dãy số vừa nhập là: ");
        for (int i = 0;i<n;i++){
            System.out.printf(arr[i] + " ");
        }
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}   

