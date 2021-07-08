package Java_Prgms1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 07;
		System.out.println(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq",549382313570l));
		
	}
	
	public static long repeatedString(String s, long n) {
	    // Write your code here
		int ln =s.length();
	        if(ln<=100 && ln>=1){
	            if(s.contains("a")){
	            if(ln==1){return n;}
	            else {
	                long count = n/ln;
	                long extra = n%ln;
	                int i;
	                long c = 0l;
	                for(i=0;i<ln;i++){
	                    if(s.charAt(i)=='a')
	                        c++;
	                }
	                c = c*count;
	                for(i=0;i<extra;i++){
	                    if(s.charAt(i)=='a')
	                        c++;
	                }
	                return c;
	            }}
	            return 0l;
	        }
	        return 0l;
	    }

}
//16481469408
//16481469405