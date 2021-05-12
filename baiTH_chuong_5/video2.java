public class video2 {
    public static void main(String[] args) {
		try {
			int a = 6;
			int b = 0;
			int [] c = {5,6,7};
			System.out.println(a/b);
			System.out.println(c[4]);	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Loi vui long kiem tra");
		}catch(Exception e) {
			System.out.println("Error:"+e.toString());
		}finally {
			System.out.println("Luon thuc hien");	
		}
		System.out.println("Ban hay kiem tra lai");			
	}
}
