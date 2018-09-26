package pl.b2b;


import pl.b2b.alcohol.ConfigAlcohol;
import pl.b2b.cnf.DataAlcohol;

public class App {
    public static void main(String[] args) {
        ConfigAlcohol configAlcohol = new ConfigAlcohol();
        DataAlcohol dataAlcohol = new DataAlcohol();
        configAlcohol.nameAndPriceBelowAveragePrice(dataAlcohol.getWina());
    }
}
