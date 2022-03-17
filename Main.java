import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
   int instrukcja;
    System.out.println("Podaj co liczymy:");
    instrukcja = getInt();
    switch (instrukcja) {
      case 1:
        System.out.println("Poniedzialek.");
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