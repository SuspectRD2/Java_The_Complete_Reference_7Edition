// использованеи побитовой операции исключающего ИЛИ
// для шифрования и дешифрования сообщений
public class Encode2 {
    public static void main(String args[]) {
        String msg = "Это простой текст";
        String encmsg = "";
        String decmsg = "";
        String key = "восемььь";

        System.out.print("исходное сообщение: ");
        System.out.println(msg);
        
        int j = 0;
        // Шифрование сообщения
        for(int i = 0; i < msg.length(); i++) 
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
        
        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);
        
        j = 0;
        // Дешифровка сообщения
        for(int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8)
                j = 0;
        }
        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
