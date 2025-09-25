package Base;

public class StringDemo {

	public static void main(String args[]) {
		
		//this is a demo to reverse every word in a String
		
		String str1="this is a demo to reverse every word in a String";
		
		String[] str2=str1.split(" ");
		for(int i=0;i<str2.length;i++) {
			for(int j=str2[i].length()-1;j>=0;j--) {
				System.out.print(str2[i].charAt(j));
			}
		System.out.print(" ");
		}
		
	}
	
}
