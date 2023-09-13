package ru.geekbrains.lesson3;

public class RefuelingStation implements Refueling {

    // Название заправки
    String title;

    public RefuelingStation(String title) {
        this.title = title;
    }

    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("     - Заправка дизельным топливом на заправочной станции " + title);
            case Gasoline -> System.out.println("     - Заправка бензином на заправочной станции " + title);
        }
    }
}
