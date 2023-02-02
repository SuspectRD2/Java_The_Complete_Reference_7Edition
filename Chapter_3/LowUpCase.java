/**
 * Перевод строчных букв в прописные, а прописные в строчные.
 * В конце вывод кол-во измененных букв.
 */
public class LowUpCase {

    public static void main(String args[]) 
        throws java.io.IOException {
        
        char ch;
        int i = 0, j = 0;
        
        do {
            ch = (char) System.in.read();
            if(ch >= 65 & ch <=90) {
                ch += 32;
                i++;
                System.out.print(ch);
                System.out.println();
            }
            else if(ch >= 97 & ch <= 122) {
                ch -= 32;
                j++;
                System.out.print(ch);
                System.out.println();
            }
        } while(ch != '.');
        System.out.println("из нижнего регистра в верхний: " + i);
        System.out.println("из верхнего регистра в нижний: " + j);     
    }
}
