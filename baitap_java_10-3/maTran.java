import java.util.Scanner;

public class maTran {
    int n;
    double[][] maTran;
    
    static Scanner sc = new Scanner(System.in);
    
    void nhap() {
        System.out.println("Nhap so hang va cot cua ma tran: ");
        n = sc.nextInt();
        System.out.println(n);
        maTran = new double[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.format("Nhap vao phan tu[%d][%d]: ", i + 1, j + 1);
                maTran[i][j] = sc.nextInt();
            }
        }
    }
    
    void in() {
        for(int i = 0; i < soHang; i++) {
            for(int j = 0; j < soHang; j++) {
                System.out.print(maTran[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    boolean maTranDonVi() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (maTran[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        maTran mt = new maTran();
        
        mt.nhap();

        
        if (mt.maTranDonVi()) {
            System.out.println("Day la ma tran don vi");
        } else {
            System.out.println("Day khong phai la ma tran don vi");
        }
        
        mt.in();
    }
}