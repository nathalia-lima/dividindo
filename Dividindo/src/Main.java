import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        double X;
        double Y;
        N = input.nextInt();

        for (int i=0; i<N; i++) {
            X = input.nextDouble();
            Y = input.nextDouble();
            if (Y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(X/Y);
            }
        }
    }
}