package KT;

import java.util.Scanner;

public class Hoadon extends KhachHang {
	protected  int soHoaDon ;
	protected String ngayBan;
	Scanner scan=new Scanner(System.in);
	
	@Override
	public void nhapTenKhach()
	{
		System.out.println("Nhap tên khach\n");
		tenKh = scan.nextLine() ;
		
	}
	public void nhap()
	{
		System.out.println("Nhap so hoa don\n");
		soHoaDon = scan.nextInt () ;
		System.out.println("Nhap ngay ban\n");
		ngayBan = scan.nextLine() ;
		nhapTenKhach() ;
	}
	public void hienThi()
	{
		System.out.println("so hoa don :"+soHoaDon+"\nNgay ban "+ngayBan+"\nTen Khach hang :"+tenKh );
		}
}
