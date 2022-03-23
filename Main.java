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
        System.out.println("Pole prostokąta="  + pole + " metra/ów");
        
        break;
      case 2:
        Scanner nacs = new Scanner(System.in);
        System.out.println("Podaj promień koła: ");
        double c = nacs.nextDouble();
         System.out.println("Podaj promień koła drugiego: ");
        double d = nacs.nextDouble();
        c = Math.pow(c,2);//a^2
        d = Math.pow(d,2);
      double suma = (3.14*c)+(3.14*d);
        System.out.println("Suma pól = "  + suma );
        
        break;
      case 3:
        Scanner cans = new Scanner(System.in);
        System.out.println("Podaj bok a(w metrach): ");
        double e = cans.nextDouble();
         System.out.println("Podaj wysokość h(w metrach): ");
        double f = cans.nextDouble();
      double pole2 = 0.5*e * f;
        System.out.println("Pole trójkąta prostokątnego ="  + pole2 + " metra/ów");
        break;// nie dasz break to wykona się kolejny case
      case 4:
        Scanner ans = new Scanner(System.in);
        System.out.println("Podaj liczbe do dzielenia: ");
        double g = ans.nextDouble();
         System.out.println("przez ile?: ");
        double h = ans.nextDouble();
      double iloraz = g/h;
        if(h == 0){
        System.out.println("Nie można dzielić przez 0");
          break;
      }
        System.out.println("iloraz="  + iloraz);
        break;
         default:
        System.out.println("Nieznana funkcja!!!!");
    }
    
  }
   public static int getInt() {
    return new Scanner(System.in).nextInt();}
}