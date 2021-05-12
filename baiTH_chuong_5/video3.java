public class video3{
    public static void main(String[] args) {
		video3 mot = new video3();
		try {
			mot.connectDatabase();
		}catch(Exception e){
			System.out.println("Error:"+e.toString());
		}
		
	}
	public void connectDatabase() throws Exception{
		throw new NullPointerException();
	}
}
