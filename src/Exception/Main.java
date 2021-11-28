package Exception;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println(inverse(0));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			
		}
	}
	public static double inverse (double a) throws Exception {
		if(a==0) throw new Exception("division par 0 impossible");
		return 1/a;
	}
}
