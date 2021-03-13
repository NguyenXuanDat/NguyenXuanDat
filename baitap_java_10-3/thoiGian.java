import java.util.Scanner;

public class thoiGian {
    private int gio;
    private int phut;
    private int giay;
    static Scanner sc = new Scanner(System.in);

    public thoiGian(){
        this.gio = this.phut = this.giay = 0;
    }
    void nhap(){
        System.out.println("nhap gio: ");
        sc.nextLine();
        gio = sc.nextInt();
        System.out.println("nhap phut: ");
        phut = sc.nextInt();
        System.out.println("nhap giay: ");
        giay = sc.nextInt();
    }
    void xuat(){
        System.out.println("thoi gian: "+gio+"gio,"+phut+" phut"+giay+" giay");

    }
    int chuyen(){
        return gio * 60 * 60 + phut * 60 + giay;
    }
    boolean sosanh(thoiGian t1, thoiGian t2){
        if(t1.chuyen() > t2.chuyen()){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.print("nhap so luong n: ");
        int n;
        do {
            n = sc.nextInt();
        } while (n < 1 || n > 50);
        thoiGian[] arr = new thoiGian[n];
        System.out.println("nhap cac gia tri thoi gian: ");
        for (int i = 0;i<n;i++){
            arr[i] = new thoiGian();
            arr[i].nhap();
        }
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i].chuyen();
                arr[i].sosanh();
            }
        }
        for (int i=0;i<n;i++){
            arr[i].xuat();
        }
    }
}
