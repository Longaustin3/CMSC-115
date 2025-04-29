public class test {
	public static void main (String[] args) {
		String s = "Java";
	    change(s);
	    System.out.println(s);
	}
	  
	private static void change(String s) {
		s = s + " and HTML";
	}
}