package pl.b2b.alcohol;

import java.util.ArrayList;
import java.util.List;

public class ConfigAllcohol {

    public String expensiveAlcohol(List<Alcohol> alcohols) {

        Alcohol expensiveAlcohol = alcohols.get(0);

        for (Alcohol alcohol : alcohols) {

            if (alcohol.getPrice() > expensiveAlcohol.getPrice()) {
                expensiveAlcohol = alcohol;
            }
        }

        return expensiveAlcohol.getName();
    }

    public String cheapAlcohol(List<Alcohol> alcohols) {

        Alcohol expensiveAlcohol = alcohols.get(0);

        for (Alcohol alcohol : alcohols) {

            if (alcohol.getPrice() < expensiveAlcohol.getPrice()) {
                expensiveAlcohol = alcohol;
            }
        }

        return expensiveAlcohol.getName();
    }

    public String mostPromils(List<Alcohol> alcohols) {
        return "";
    }

    public String lowestPromils(List<Alcohol> alcohols) {
        return "";
    }

    public double averagePrice(List<Alcohol> alcohols) {

        double sum = 0;

        for (Alcohol alcohol : alcohols) {
            sum += alcohol.getPrice();
        }

        double result;
        result = sum / alcohols.size();

        return result;
    }

    public List<String> namesOfAlcoholsWitchPriceIsHigherThanAverage(List<Alcohol> alcohols) {

        double average = averagePrice(alcohols);
        List<String> alcoholsThanAverage = new ArrayList<>();

        for (Alcohol alcohol : alcohols) {

            if (alcohol.getPrice() > average) {
                alcoholsThanAverage.add(alcohol.getName());
            }
        }
        return alcoholsThanAverage;
    }

    public String nameAndPrice(Alcohol alcohol) {

        String result;
        result = alcohol.getName() + " " + alcohol.getPrice();

        return result;
    }

    public List<String> nameAndPriceBelowAveragePrice(List<Alcohol> alcohols) {

        List<String> resultList = new ArrayList<>();

        double average = averagePrice(alcohols);

        for (Alcohol alcohol : alcohols) {
            if (alcohol.getPrice() < average) {
                resultList.add(nameAndPrice(alcohol));
            }
        }

        return resultList;
    }

}
