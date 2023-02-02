// Применение метода substring()
public class Substring {
    public static void main(String args[]) {
        String orgstr = "Java - двигатель интернета.";
        
        // Сформируем подстроку
        String substr = orgstr.substring(7, 25);
        
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
