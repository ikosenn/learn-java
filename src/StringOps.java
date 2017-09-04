
public class StringOps {
	public static void main(String[] args) {
		// string builder
		 StringBuilder sb = new StringBuilder();
		 sb.append("My name is Ian");
		 sb.append(" ");
		 sb.append("I am a lion tamer");
		 System.out.println(sb.toString());
		 
		 // thread safe
		 StringBuffer sbf = new StringBuffer();
		 sbf.append("My name is Ian");
		 sbf.append(" ");
		 sbf.append("I am a lion tamer");
		 System.out.println(sbf.toString());
		 
		 // formatting
		 System.out.printf("%1.5f", 5558.0);
	}
}
