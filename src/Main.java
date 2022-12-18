public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 2.1,2.2");
        Human human1 = new Human(null, 0, null,"бренд-менеджера");
        human1.Man();
        Human human2 = new Human("Аня", 1993, "Москва", "методиста образовательных программ");
        human2.Man();
        Human human3 = new Human("Катя", 1992, "Калинград", "продакт-менеджера");
        human3.Man();
        Human human4 = new Human("Артем", 1995, "Москва", "директора по развитию бизнеса");
        human4.Man();
        System.out.println("Задание 2.1");
        Car car1 = new Car(null, null, 0, null, 0, "Россия");
        System.out.println(car1);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        System.out.println(car2);
        Car car3 = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        System.out.println(car3);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
        System.out.println(car4);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        System.out.println(car5);
    }
}
