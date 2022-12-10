import java.util.Scanner;

public class PrimeTest{

    public static void main(String[] args){

        // Определяем счетчик для подсчета количества простых чисел
        int count =0;

        // Получить простое число от 1 до n, ввести значение n
        System.out.println("Пожалуйста, введите число больше 2 в качестве верхнего предела интервала:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i < n; i++){
            if(isPrime1(i)){
                System.out.print(i+"\t");
                count++;
                if(count%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println("\r"+"1 к" + n + "Количество простых чисел между \t" + count);
    }
    // Создать метод, чтобы определить, является ли число простым
    public static boolean isPrime1(int i){
        // Определяем переменную, чтобы судить, простое ли число
        boolean t = false;

        // Когда число равно 2, простое число возвращает true
        if(i==2){
            t = true;
        }
        // Когда число не 2, дальнейшее суждение
        for(int j = 2;j < i;j++){
            if(j==(i-1)){
                t = true;
            }
            if((i % j)==0){
                break;
            }
        }
        return t;
    }
}