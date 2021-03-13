import java.util.Scanner;

public class Diem {
    int x, y,x1,y1;
    double d,s;
    Scanner sc = new Scanner(System.in);
    void nhap(){
        System.out.println("nhap toa do x");
        x = sc.nextInt();
        System.out.println("nhap toa do diem y");
        y = sc.nextInt();
    }
    void xuat(){
        System.out.println("Toa do la: ("+x+","+y+")");
    }
    void doixung(){
        x1 = x;
        y1 = -y;
        System.out.println("Tọa độ của điểm đối xứng là: (" +x1 +"," + y1 +")");
    }
    void khoangcach(){
        d = Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
        System.out.println("Khoảng cách giữa hai điểm là: " +d);
    }
    void kiemTra(){
        if( x==0 || y==0 ){
            System.out.println("Điểm này nằm trên trục tọa độ");
        }else{
            System.out.println("Điểm này không nằm trên trục tọa độ");
            s = 0.5 * d *x ;
            System.out.println("Diện tich tam giác là: " +s);
        }
    }
    public static void main(String[] args){
        Diem diem = new Diem();
        diem.nhap();
        diem.xuat();
        diem.doixung();
        diem.khoangcach();
        diem.kiemTra();
    }
}
