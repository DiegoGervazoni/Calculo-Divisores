import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor para achar divisores: ");
        int numero = sc.nextInt();

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                System.out.println("Divisores -> " + i);
            }

        }

        sc.close();
    }
}
