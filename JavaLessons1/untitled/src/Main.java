import java.util.Scanner;
//Вычислить n-ое треугольного число(сумма чисел от 1 до n)
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Print the sum of all integers from 1 to n program");
            System.out.println("=================================================");
            System.out.print("Please enter n: ");
            int n = scanner.nextInt();
            int sum = 0;
            for(int i = 1; i < n; i++) {
                System.out.print(i + "+");
                sum += i;
            }
            sum += n;
            System.out.print(n + "=" + sum);
        }
    }
