// Применение инструкции break с меткой
public class BreakMetka {

    public static void main(String args[]) {
        int i;
        
        for(i = 1; i < 4; i++) {
            one: {
                two: {
                    three: {
                        System.out.println("\ni равно " + i);
                        if(i == 1) break one;
                        if(i == 2) break two;
                        if(i == 3) break three;
                        
                        // Эта строка кода никогда не будет достигнута
                        System.out.println("не будет выведено");
                    }
                    System.out.println("После блока three");
                }
                System.out.println("После блока two");
            }
            System.out.println("После блока one");
        }
        System.out.println("После цикла for\n");
        
        // Ещё один пример применения break с меткой
        done:
        for(i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if(k == 5) break done; // переход по метке done
                }
                System.out.println("После цикла по k"); // не выполнится
            }
            System.out.println("После цикла по j"); // не выполнится
        }
        System.out.println("После цикла по i\n");
        
        // Расположение метки имеет большое значение
        int x = 0, y = 0;
        
        // Здесь метка распологается перед циклом for
        stop1: for(x = 0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("x и y: " + x + " " + y);
            }
        }
        
        System.out.println();
        
        // А тут метка распологается непосредственно перед
        // открывающей фигурной скобкой
        for(x = 0; x < 5; x++)
            stop2: {
                for(y = 0; y < 5; y++) {
                    if(y == 2) break stop2;
                    System.out.println("x и y: " + x + " " + y);
                }
            }
    }
}

/**
* В первом варианте метка стоит перед циклом for.
* В таком случае при выполнении инструкции breal управление передаётся в конец
* всего блока цикла for, а оставшиеся итерации внешнего цикла пропускаются
* Во втором случае метка находится перед открывающей фигурной скобкой блока кода,
* определяющего тело внешнего цикла. Поэтому при выполнении инструкции
* break stop2 управление передаётся в конец тела внешнего цикла
* for, и далее выполняется очередной его шаг.
*/