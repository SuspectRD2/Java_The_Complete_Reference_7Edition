/**
 * Вывод таблицы перевода дюймов в метры.
 * После каждых 12 дюймов выводится пустая строка.
 */
public class InchToMeter {

    public static void main(String args[]) {
        double inch, meter;
        int counter;
        
        counter = 0;
        for(inch = 1; inch <= 100; inch++) {
            meter = inch * 39.37;
            System.out.println(inch + " дюймам соотвествует " +
                    meter + " метра");
            
            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
