import java.util.Scanner;

public class sinhvien {
    String hoten;
    int ngaysinh;
    String gioitinh;
    double toan,ly,hoa;
    double dtb;
    static Scanner sc = new Scanner(System.in);
void nhap(){
    System.out.println("nhap ten sinh vien: ");
    hoten = sc.next();
    System.out.println("nhap ngay sinh");
    ngaysinh = sc.nextInt();
    System.out.println("nhap gioi tinh: ");
    gioitinh = sc.next();
    System.out.println("nhap diem toan: ");
    toan = sc.nextDouble();
    System.out.println("nhap diem ly: ");
    ly = sc.nextDouble();
    System.out.println("nhap diem hoa: ");
    hoa = sc.nextDouble();
}
void in(){
    System.out.println("ho va ten: "+hoten);
    System.out.println("ngay sinh: "+ngaysinh);
    System.out.println("gioi tinh: "+gioitinh);
    System.out.println("diem toan: "+toan);
    System.out.println("diem ly: "+ly);
    System.out.println("diem hoa: "+hoa);
}
double dtb(){
    return (toan+ly+hoa)/3;
}
public static void main(String[] args){
    System.out.println("nhap so sinh vien: ");
    int n = sc.nextInt();
    sinhvien sv[] = new sinhvien[n];
		
		for (int i = 0; i < n; i++) {
		    sv[i] = new sinhvien();
		    System.out.println("Nhap thong tin sinh vien " +(i + 1));
		    sv[i].nhap();
		}
		
		sinhvien temp = new sinhvien();
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sv[j].dtb() < sv[j+1].dtb())
                {
                    temp = sv[j];
                    sv[j] = sv[j+1];
                    sv[j+1] = temp;
                }
            }
        }
        System.out.println("danh sach sinh vien sau khi sap xep: ");
        for (int i=0;i<n;i++){
            System.out.println("Sinh vien thu: " +(i + 1));
            sv[i].in();
            System.out.println("-----------------------------");
        }
    }
}