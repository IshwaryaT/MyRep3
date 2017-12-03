package javasample;

public class Stringpalindrome {
	public static boolean palindrome(String str){
		StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        String rev=sb.toString();
		if(str.equals(rev)){
			return true;
		}

		else{
		return false;
		}
		
	}

}
