/**
 * Программа, в которой используется класс Vehicle.
 * 
 * Присвойте файлу с исходным кодом имя VehicleDemo.java.
 */

class Vehicle {
    
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int kmpl; // потребление в километрах на литр
    
    // Это конструктор класса Vehicle
    Vehicle(int p, int f, int k) {
        passengers = p;
        fuelcap = f;
        kmpl = k;
    }
    
    // Отображение дальности поездки транспортного средства
    int range() {
        return fuelcap * kmpl;
    }
    
    // Расчёт количества топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int km) {
        return (double) km / kmpl;
    }
}

public class VehicleDemo { 
      
    public static void main(String args[]) {
        
        double lit;
        int dist = 252;
        
        Vehicle minivan = new Vehicle(7, 16, 21);    // создание объекта minivan типа Vehicle
        Vehicle sportscar; // выделение памяти для объекта
        sportscar = new Vehicle(2, 14, 12); // типа Vehicle       
     
        System.out.println("Мини-фургон может перевезти " +
                        minivan.passengers + " пассажиров "
                        + "на расстояние " + minivan.range() + " км.");       
        
        System.out.println("Спорткар может перевезти " +
                        sportscar.passengers + " пассажиров "
                        + "на расстояние " + sportscar.range() + " км.");
        
        System.out.println();
        
        lit = minivan.fuelneeded(dist);
        
        System.out.println("Для преодоления " + dist + 
                " километров мини-фургону требуется " +
                lit + " литров топлива.");
        
        lit = sportscar.fuelneeded(dist);
        
        System.out.println("Для преодоления " + dist + 
                " километров спорткару требуется " +
                lit + " литров топлива.");
    }
}



