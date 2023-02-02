// Поиск среднего значения типа double
public class AvgDemo {
    public static void main(String args[]) {
        double d[] = { 1.0, 5.5, 10.2, 3.8, 6.5, 123.0, 25.5, 77.0, 1.2, 3.3 };
        double avg = 0;
        
        System.out.print("Массив: ");
        for(int i = 0; i < d.length; i++)
            System.out.print(d[i] + " ");
        System.out.println();
        
        System.out.print("Среднее значение: ");
        for(int i = 0; i < d.length; i++) {
            avg = avg + d[i];
        }
        avg = avg / d.length;
        System.out.print(avg);
    }
}
