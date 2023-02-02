/**
 * Находим простые числа в диапазоне от 2 до 100
 */
public class PrimeNumbers {
    public static void main(String args[]) {
        for(double i = 2; i <= 100; i++) {
            if(i % 2 == 0) 
                continue;
            else if(i % 3 == 0)
                continue;
            else if(i % 5 == 0)
                continue;
            else if(i % 7 == 0)
                continue;
            else
                System.out.println(i);
        }        
    }
}
