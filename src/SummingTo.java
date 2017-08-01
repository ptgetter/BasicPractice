import java.util.Scanner;

public class SummingTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		scan.close();
		int sum = 0;
		
		for(int i=inputNumber; i>0; i = i -2) {
			sum += i;
		}
		
		System.out.printf("결과값 : %d", sum);
	}

}
