import java.util.Scanner;

public class method
{
    static boolean checkDigit(int num){
        if(num>=10 && num<100)
            return true;
    return false;
}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number to check twoDigit:");
	    int num = sc.nextInt();
	    System.out.println(checkDigit(num));
	}
	
}