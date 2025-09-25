package Practice;

//str= "to find reverse the string";
public class StringHandling {

	public static int Stringshow() {		
		String str="mom dad chilc lol";		
		String[] str2 = str.split(" ");
		String str3="";	
		int a=0;
		int flag=0;
		boolean b=false;
		
		for( int i=0;i<str2.length;i++) {
			for( int j=str2[i].length()-1,k=0;j>=0;j--,k++) {				
				if(str2[i].charAt(k)==str2[i].charAt(j)) {
					System.out.println(str2[i].charAt(k)+"=="+str2[i].charAt(j));
					flag+=1;				
				}					
								
			}//for j			
					if(flag==str2[i].length()) {
						a+=1;						
						
					}									
					flag=0;
		}//for i
		
		return a;
	}
	
	public static void main(String[] args) {
		
	System.out.println(Stringshow()); 
	
	
	
	}	
}
