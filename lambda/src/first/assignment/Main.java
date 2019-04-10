package first.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] a){
        String[] lines = {
                "Maharashtra=Pune:1000",
                "Maharashtra=Mumbai:10000",
                "Karnataka=Bengaluru:1200",
                "Karnataka=Mysuru:1100",
                "Aasam=mycity:200"
        };
        Map<String, List<City>> states= new HashMap<>();
        for(String line: lines){
            String[] lineVal = line.split("=");
            String[] cityDetails = lineVal[1].split(":");
            City city = new City(cityDetails[0],Integer.parseInt(cityDetails[1]));
            List<City> cities = new ArrayList<>();
            if(states.containsKey(lineVal[0])){
                cities = states.get(lineVal[0]);
            }
            cities.add(city);
            states.put(lineVal[0],cities);
        }
        int p = 89;
        //display the name of the state and population of the state
        StatesProcessor statesProcessor = (Map<String, List<City>> statesMap) -> {
            for (String str:states.keySet()
                 ) {
                System.out.println(str);
            }

            for (Map.Entry<String,List<City>> entry : statesMap.entrySet()){
                int population = 0;

                for (City city:entry.getValue()){
                    population = population + city.getPopulation();
                }
                System.out.println("City = " + entry.getKey() +
                        ",population = " + population);
            }
        };

        statesProcessor.processStates(states);
    }
}
