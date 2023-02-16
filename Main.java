import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
     
		double X;
		X = sc.nextDouble();
		System.out.printf("O valor digitado: %.2f%n", X);
		
		sc.close();
	}

}
