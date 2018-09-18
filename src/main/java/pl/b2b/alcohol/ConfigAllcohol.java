package pl.b2b.alcohol;

import java.util.List;

public class ConfigAllcohol {

    public String mostExpensiveAlcohol(List<Alcohol> alcohols){

        Alcohol expensiveAlcohol = new Alcohol(0,0,"");

        for (Alcohol alcohol : alcohols) {

            if(alcohol.getPrice()>expensiveAlcohol.getPrice()){
                expensiveAlcohol = alcohol;
            }
        }

        return expensiveAlcohol.getName();
    }

}
