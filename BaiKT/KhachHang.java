package KT;
import java.util.Scanner;
public  abstract class KhachHang {
	protected String maKh ,tenKh;
	protected String soDt;
	Scanner scan=new Scanner(System.in);
	public void nhap()
	{
		System.out.println("Nhap ma khach\n");
		maKh = scan.nextLine() ;
		System.out.println("Nhap so dien thoai\n");
		soDt = scan.nextLine() ;
	}
	public abstract void nhapTenKhach() ;

	public void hienThi()
	{
		System.out.println("Khach hang :"+maKh+"\nTen khách "+tenKh+"\nSo dt :"+soDt );
	}
	
}
