import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
   int instrukcja;
    System.out.println("Podaj co liczymy:\n1-Pole prostokąta\n2-Suma pól kół\n3-Pole trójkąta prostokątnego\n4-iloraz(który nie dzieli przez 0) ");
    instrukcja = getInt();
    switch (instrukcja) {
      case 1:
       Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok a(w metrach): ");
        double a = scan.nextDouble();
         System.out.println("Podaj bok b(w metrach): ");
        double b = scan.nextDouble();
      double pole = a * b;
        System.out.println("Pole prostokąta="  + pole + " metra");
        
        break;
      case 2:
        System.out.println("Wtorek.");
        break;
      case 3:
        System.out.println("Sroda.");
        break;
      case 4:
        System.out.println("Czwartek.");
        break;
         default:
        System.out.println("Nieznana funkcja!!!!");
    }
    
  }
   public static int getInt() {
    return new Scanner(System.in).nextInt();}
}