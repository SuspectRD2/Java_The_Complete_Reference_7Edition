// Поиск максимального и минимального значения в массиве
public class MinMax {

    public static void main(String args[]) {
        int nums[] = { 99, -10, 100123, 18, -978, 5653, -9, 342, 3, 34 };
        int min, max;       
        
        min = max = nums[0];
        for(int x : nums) {
            if(x < min) min = x;
            if(x > max) max = x;
        }
        System.out.println("min и max: " + min + " " + max);
    }
}
