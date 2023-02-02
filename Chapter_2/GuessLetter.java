public class GuessLetter {
    
    public static void main(String args[]) 
        throws java.io.IOException {
        
        char ch, ignore, answer = 'K';
        
        do {
            System.out.println("Задумана буква из диапазона A-Z");
            System.out.println("Попытайтесь её угадать: ");
         
            ch = (char) System.in.read(); // чтение символа с клавиатуры
        
            // Отбрасывание всех остальных символов во входном буфере
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
        
            if(ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print("...извините, нужная буква находится ");
            
                // вложенная инструкция if
                if(ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
            }
        } while(answer != ch);
    }
}
