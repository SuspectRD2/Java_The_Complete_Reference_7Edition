// Выделение памяти по второму индексу массива вручную
public class Ragged {

    public static void main(String args[]) {
        int riders[][] = new int[7][];
        
        // Для первых пяти элементов длина массива по второму индексу равна 10
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        // Для остальных двух элементов длина массива по второму индексу равна 2
        riders[5] = new int[2];
        riders[6] = new int[2];
        
        int i, j;
        
        // Формирование произвольных данных
        for(i = 0; i < 5; i++)
            for(j = 0; j < 10; j++)
                riders[i][j] = i + j + 10;
        for(i = 5; i < 7; i++)
            for(j = 0; j < 2; j++)
                riders[i][j] = i + j + 10;
        
        System.out.println("Количество пассажиров, перевезенных"
                + " каждым рейсов, в будние дни недели:");
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Количество пассажиров, перевезенных"
                + " каждым рейсов, в выходные дни:");
        for(i = 0; i < 7; i++) {
            for(j = 0; j < 2; j++)
                System.out.print(riders[i][j] + " ");  
            System.out.println();
        }
        System.out.println();
    }
}
