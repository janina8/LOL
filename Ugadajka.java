import java.util.Random; 
import java.util.Scanner; 

public class Ugadajka {  

        public static void main(String[] args) {

            Random rnd = new Random();
            Scanner scanner = new Scanner(System.in);
            int min = 0, max = 10, guess;
            String sravnenie;

            System.out.println("Загадай число от 1 до 10 ");

            do {
                guess = rnd.nextInt(max) + min + 1;
                System.out.println("Твое число больше меньше или равно: " + guess + " ?");
                sravnenie = scanner.nextLine();

                while(!(sravnenie.equals(">") || sravnenie.equals("<") || sravnenie.equals("="))) {
                    System.out.println("Ошибка ввода! Повторите попытку.\n");
                    sravnenie = scanner.nextLine();
                }

                if (sravnenie.equals(">")) {
                    System.out.println("Твое число меньше");
                    max = guess - 1;
                }

                else  if (sravnenie.equals ("<") ) {
                    System.out.println("Твое число больше!");
                    min =  guess + 1 ;
                    max = 10 ;
                }

                else (sravnenie.equals ("=") ) { 
                    System.out.println("Твое число равно");
                    break;
                }

            } while (true);
        }
    }
