package problemH;

import java.util.HashMap;
import java.util.Map;

public class ProblemH {

	public static void main(String[] args) {
		String astring = "aba";
		int n = 10;
		StringBuilder strRepeat = new StringBuilder(astring);
		for(int i = 0;i<100;i++) {
			strRepeat.append(astring);
		}
		char astringchar[] = (strRepeat.substring(0, n+1)).toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(int i = 0; i<astringchar.length;i++) {
			if(charMap.get(astringchar[i])==null) {
				charMap.put(astringchar[i],1);
			}
			else {
				charMap.put(astringchar[i],charMap.get(astringchar[i])+1);
			}
		}
		int temp = charMap.get(astringchar[0]);
		for(Map.Entry<Character,Integer>mapChar:charMap.entrySet()) {
			if(mapChar.getValue()>temp) {
				temp = mapChar.getValue();
			}
		}
		System.out.println(temp);
	}

}
