package problemI;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

	public static void main(String[] args) {
		int number = 268;
		int largest= solution(number);
		System.out.print(largest);

	}
	public static int solution(int n) {
		String number = String.valueOf(n)+"5";
		Set<String>perm = new HashSet<String>();
		perm = permFinder(number);
		int temp = 0;
		for(String str:perm) {
			System.out.println(str);
			if(temp<Integer.parseInt(str)) {
				temp = Integer.parseInt(str);
			}
		}
		 return temp;
	}
	
	public static Set<String>permFinder(String str){
		Set<String> perm = new HashSet<String>();
		
		if(str==null)
			return null;
		else if (str.length()==0) {
			perm.add("");
			return perm;
		}
		char initial = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = permFinder(rem);
		System.out.println(words);
		for(String strNew:words) {
			for(int i=0;i<strNew.length();i++) {
				perm.add(charInsert(strNew,initial,i));
			}
		}
		System.out.print(perm);
		return perm;
	}
	public static String charInsert(String str,char c,int i) {
		String begin = str.substring(0,i);
		String end = str.substring(i);
		return begin+c+end;
	}

}
