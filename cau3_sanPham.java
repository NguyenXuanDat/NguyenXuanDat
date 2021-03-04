import java.util.Scanner;

public class cau3_sanPham {
    String tenSp;
    Double donGia;
    Double giamGia;
    private double ThueNhapKhau(){
        return (donGia * 10) / 100;
    }
    public cau3_sanPham(String tenSp, double donGia, double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public cau3_sanPham(String tenSp, double donGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
    }
    public void nhapsp(){
        System.out.println("nhap ten san pham: ");
        Scanner sc = new Scanner(System.in);
        tenSp = sc.next();
        System.out.println("nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.println("nhap ma giam gia: ");
        giamGia = sc.nextDouble();
        sc.close();
    }
    void xuatsp(){
        System.out.println("Ten san pham: "+ tenSp);
        System.out.println("Don gia: "+ donGia);
        System.out.println("Giam gia: "+ giamGia);
        System.out.println("Thue nhap khau: "+ ThueNhapKhau());
    }
    public static void main(String[] args){
        cau3_sanPham spcgg = new cau3_sanPham("laptop", 15000000, 300000);
        cau3_sanPham spkgg = new cau3_sanPham("phone",10000000,0);
        spcgg.xuatsp();
        spkgg.xuatsp();
    }
}
