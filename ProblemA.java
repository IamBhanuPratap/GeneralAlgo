package problemA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProblemA {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Set<String> cities = new HashSet<String>();
			int noinv = Integer.parseInt(scan.nextLine());
			if (noinv<=50) {
				for(int i = 1;i<=noinv;i++) {
				int numberPostcard = Integer.parseInt(scan.nextLine());
				if(numberPostcard<=100) {
					for(int j=0;j<numberPostcard;j++) {
						String citiesName = scan.nextLine();
						if(citiesName.length()<=20 && citiesName.length()>0) {
							cities.add(citiesName);
						}
					}
					System.out.println(cities.size());
					cities.clear();
				}
				}
			}
		}
		

	}

}
