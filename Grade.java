import java.util.Scanner;
public class Grade {
        public static void main(String[]args)
        {
			Scanner scan = new Scanner(System.in);
			
            int markOne, markTwo, markThree, averageOfMark;
            markOne = 35;
            markTwo = 35;
            markThree = 35;
            if (markOne >= 35 && markTwo >= 35 && markThree >= 35){
                averageOfMark = (markOne + markTwo + markThree)/ 3;
                if(averageOfMark >= 90){
                    System.out.println("Grade \"A\"");
                } else if (averageOfMark >= 80) {
                    System.out.println("Grade \"B\"");
                } else if (averageOfMark >= 70) {
                    System.out.println("Grade \"C\"");
                } else if (averageOfMark >= 35) {
                    System.out.println("Grade \"D\"");
                } else {
                    System.out.println("Grade \"RA\"");
                }
            } else {
                System.out.println("FAIL");
            }
        }
}
