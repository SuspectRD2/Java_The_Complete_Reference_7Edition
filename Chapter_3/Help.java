/**
 * упражнение 3.1 - 3.3
 * 
 * 3.1. Простая справочная система.
 * |
 * 3.2. Расширенная справочная система, в котрой для обработки
 * результатов выбора из меню используется цикл do-while.
 * |
 * 3.3. Завершенная справочная система по управлябщим
 * инструкциям Java, обрабатывающая многократные запросы.
 */
public class Help {

    public static void main(String args[]) 
        throws java.io.IOException {
        
        char choice, ignore;
        
        for(;;) { // бесконечный цикл
                do {
                System.out.print("Справка:\n"
                    + "1. if\n"
                    + "2. switch\n"
                    + "3. for\n"
                    + "4. while\n"
                    + "5. do-while\n"
                    + "6. breal\n"
                    + "7. continue\n"
                    + "Выберите (q - выход): ");
        
                choice = (char) System.in.read();
                System.out.println();
            
                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');                     
            } while(choice < '1' | choice > '7' & choice != 'q');
                
            if(choice == 'q') break;
            
            System.out.println("\n");
        
            switch(choice) {
                case '1':
                    System.out.println("инструкция if:\n");
                    System.out.println("if(условие) инструкция;");
                    System.out.println("else инструкция;");
                    break;
                case '2':
                    System.out.println("инструкция switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println("  case константа:");
                    System.out.println("    последовательность инструкций;");
                    System.out.println("    break;");
                    System.out.println("  // ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Цикл for:\n");
                    System.out.println("for (инициализация; условие; итерация)");
                    System.out.println("  инструкция;");
                    break;
                case '4':
                    System.out.println("Цикл while:\n");
                    System.out.println("while(условие) инструкция;");
                    break;
                case '5':
                    System.out.println("Цикл do-while:\n");
                    System.out.println("do {");
                    System.out.println("  инструкция;");
                    System.out.println("} while(условие);");
                    break;
                case '6':
                    System.out.println("инструкция break:\n");
                    System.out.println("break; или break метка;");
                    break;
                case '7':
                    System.out.println("инструкция continue:\n");
                    System.out.println("continue; или continue метка;");
                    break;
                default:
                    System.out.println("Запрос не найден.");
            }
            System.out.println();
        } 
    }
}
