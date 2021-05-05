package KT;

import java.util.Scanner;

public class ChiTietHoadon  extends Hoadon{
	protected  float soLuong,donGia;
	protected String maSp, tenSp;
	Scanner scan=new Scanner(System.in);
	public void nhap()
	{
		System.out.println("Nhap ma san pham\n");
		maSp = scan.nextLine () ;
		System.out.println("Nhap ten san pham\n");
		tenSp = scan.nextLine() ;
		System.out.println("Nhap so Luong\n");
		soLuong = scan.nextInt() ;
		System.out.println("Nhap don gia\n");
		donGia = scan.nextInt() ;
	}
	public void hienThi()
	{
		System.out.println("Ma sp : :"+maSp+"\ntenSp "+tenSp+"\nSo luong :"+soLuong+"\nDon gia :"+donGia );
		}
	
	public static void main(String[] args) {
		
	}
}
