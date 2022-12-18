public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car (String brand, String model,double engineVolume, String color, int year, String country){
        if (brand==null) {
            this.brand ="default";
        }
        else  {this.brand=brand;
        }
        if (model==null) {
            this.model ="default";
        }
        else  {this.model=model;
        }
        if (engineVolume<=0) {
            this.engineVolume=1.5;
        }
        else  {this.engineVolume=engineVolume;
        }
        if (color==null) {
            this.color ="Белый";
        }
        else  { this.color=color;;
        }
        if (country==null) {
            this.country ="default";
        }
        else  {this.country=country;
        }
        if (year<=0) {
            this.year=2000;
        }
        else  {this.year=year;
        }
    }

    @Override
    public String toString() {
        return "Марка: " +brand+ " Модель: " +model+ " Объем двигателя: "+engineVolume+"л Цвет: "+color+" Страна производитель: "+country;
    }
}

