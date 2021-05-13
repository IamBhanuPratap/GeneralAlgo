package problemB;


import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int countLines = 0,countblack=0, counttotal=0;
			String pixelInput = scan.nextLine();
			while(!(pixelInput.equalsIgnoreCase("END"))) {
				++countLines;
				if(pixelInput.length()<=1000) {
					String pixel = pixelInput.substring(1);
					if(pixelInput.substring(1).contains(".")) {
						for(int i=0;i<pixel.indexOf("*");i++) {
							char pixelChar = pixel.charAt(i);
							if(pixelChar=='.') {
								++countblack;
								continue;
							}
						}
						for(int i=0;i<pixel.length();i++) {
							char pixelChar = pixel.charAt(i);
							if(pixelChar=='.') {
								++counttotal;
								continue;
							}
							else if(pixelChar=='*') {
								if (i==(pixel.length()-1) && countblack==counttotal) {
									System.out.println(countLines+" EVEN");
									break;
								}
								else if (countblack!=counttotal){
									System.out.println(countLines+" NOT EVEN");
									break;
								}
								
							}
							counttotal = 0;
						}
					}
					else {
						System.out.println(countLines+" NOT EVEN");
					}
				}
				pixelInput = scan.nextLine();
			}
		}
			
		

	}

}
