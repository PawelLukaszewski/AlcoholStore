package pl.b2b.alcohol;

import java.util.ArrayList;
import java.util.List;

public class ConfigAlcohol {
    //nazwe najdrozszego alkoholu
    public String expensiveAlcohol(List<Alcohol> alcohols) {

        Alcohol max = alcohols.get(0);
        for (Alcohol alcohol : alcohols) {
            if (max.getPrice() < max.getPrice()) {
                max = alcohol;
            }
        }
        return max.getName();
    }

    // nazwe najtanszego alkoholu
    public String cheapAlcohol(List<Alcohol> alcohols) {
        Alcohol min = alcohols.get(0);
        for (Alcohol alcohol : alcohols) {
            if (min.getPrice() > min.getPrice()) {
                min = alcohol;
            }
        }
        return min.getName();
    }

//    public String mostPromils(List<Alcohol> alcohols) {
//        return "";
//    }
//
//    public String lowestPromils(List<Alcohol> alcohols) {
//        return "";
//    }

    public double averagePrice(List<Alcohol> alcohols) {
        double sum = 0;
        double result;
        for (Alcohol alcohol : alcohols) {
            sum += alcohol.getPrice();
        }
        result = sum / alcohols.size();

        return result;
    }

    //nazwa alkoholu ktora ma cene wieksza niz srednia calej listy
    public List<String> namesOfAlcoholsWitchPriceIsHigherThanAverage(List<Alcohol> alcohols) {
        List<String> result = new ArrayList<>();
        double average = averagePrice(alcohols);
        for (Alcohol alcohol : alcohols) {
            if (alcohol.getPrice() > average) {
                result.add(alcohol.getName());
            }
        }

        return result;
    }

    public String nameAndPrice(Alcohol alcohol) {

        return alcohol.getName() + " " + alcohol.getPrice();
    }

    public List<String> nameAndPriceBelowAveragePrice(List<Alcohol> alcohols) {

        return null;
    }

}
