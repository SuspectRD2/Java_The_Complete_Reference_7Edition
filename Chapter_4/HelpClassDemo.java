/**
 * Упражнение 4.1
 * 
 * Преобразование в класс Help справочной системы
 * из упражнения 3.3. (Глава 3)
 */
class Help {
    void heplon(int what) {
        switch(what) {
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
            default: System.out.println("Запрос не найден.");
        }
        System.out.println();
    }
    
    void showmenu() {
        System.out.print("Справка:\n"
                    + "1. if\n"
                    + "2. switch\n"
                    + "3. for\n"
                    + "4. while\n"
                    + "5. do-while\n"
                    + "6. breal\n"
                    + "7. continue\n"
                    + "Выберите (q - выход): ");
    }
    
    boolean isvalid(int ch) {
        if(ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}

class HelpClassDemo {
    public static void main(String args[])
    throws java.io.IOException {
        char choice, ignore;
        
        Help hlpobj = new Help();
        
        for (;;) {
            do {
                hlpobj.showmenu();
                
                choice = (char) System.in.read();
                
                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while(!hlpobj.isvalid(choice));
            
            if(choice == 'q') break;
            
            System.out.println("\n");
            
            hlpobj.heplon(choice);
        }
    }
}

