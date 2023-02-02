
import java.util.Arrays;

/**
 * Упражнение 5.1 (со строками
 * 
 * Демонстрация алгоритма пузырьковой сортировки
 */
public class Bubble2 {

    public static void main(String args[]) {
        String[] str = new String[]  {
            "String", "win", 
            "Tom", "Bubble", 
            "lastIndexOf", "Lose", 
            "a", "mew" };    
        String t;
        int a, b;
        int val = 0;
        
        // Отображение исходного массива
        System.out.print("исходный массив:");
        for(int i=0; i < str.length; i++)
            System.out.print(" " + str[i]);
        System.out.println() ;
        
        // Реализация алгоритма пузырьковой сортировки
        for(a = 1; a < str.length; a++)
            for(b = str.length - 1; b >= a; b-- ) {
                val = str[b-1].compareTo(str[b]);
                if(val > 0) {   // если требуемый порядок
                                            // следования не соблюдается,
                                            // поменять элементы местами
                    t = str[b-1];
                    str[b-1] = str[b];
                    str[b] = t;
                }
            }               
        // Отображение отсортированного массива
        System.out.print("Отсортированный массив:");
        for(int i=0; i < str.length; i++)
            System.out.print(" " + str[i]);
        System.out.println();    
        boolean charAt(5);
    }
}
