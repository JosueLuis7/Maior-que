// Josué Luís Pimenta Alecrim
// 1261948087
import java.util.Scanner;


public class App {
   
public static String maior( int a, int b) {

    if (a > b) {
        return a + " é maior";
    } else {
        return b + " é maior";
    }

}
public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Informe os valores");
    int a = input.nextInt();
    int b = input.nextInt();
  
    String resultado = maior(a,b);
    System.out.println(resultado);
    input.close();
  }
}
