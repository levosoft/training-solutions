package ioreadwritebytes;

public class Temperatures {

    /*Az előző 365 nap hőmérsékleti adatait fájlban tároljuk.
    A Temperatures osztály attribútumában ezek találhatók egy byte[]-ben.
    Az osztály konstruktorban kapja meg a hőmérsékleti adatokat.
    A getYearAverage() metódusa a teljes év átlaghőmérsékletét adja vissza, a getMonthAverage() az utolsó 30 napét.
    Készíts egy TemperatureReader osztályt, mely egyetlen readTemperatures() metódusa bináris fájlból beolvassa az eltárolt
    hőmérsékleteket, és egy Temperatures példánnyal tér vissza! Ugyanennek mintájára készíts egy TemperaturesWriter osztályt,
    amelynek a writeTemperatures() metódusa a paraméterként kapott Temperatures példányból bináris fájlba írja a hőmérsékleti
    adatokat!*/


    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }


    //A két metódus nem készült el a mintafájl hiányában...
    public double  getYearAverage(){
        double yearAverage = 0;

        return yearAverage;
    }

    public double getMonthAverage(){
        double monthAverage = 0;

        return monthAverage;
    }

}
