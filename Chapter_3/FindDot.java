/**
 * Программа считывает символы с клавиатуры до тех пор,
 * пока не встретится точка. Считает счётчик пробелов.
 */
public class FindDot {
    
    public static void main(String args[]) 
        throws java.io.IOException {
        
        char ch;
        int i = 0;
        
        System.out.println("Ввод: ");
        do {
            ch = (char) System.in.read();
            if(ch == '\u0020')
                i++;
        } while (ch != '.');
        System.out.println(i + " пробелов.");
        
    }
}
