import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort {
    ////------- Part 2.1: Sort by CityName Descending (register==off)  (Press 2)
    public static void sortByCityDescending(List<City> cityList){
        System.out.println("Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра;");
        cityList.sort(Comparator.comparing((City o)-> o.getName().toLowerCase()).reversed());

        for(City city:cityList){
            System.out.println(city);
        }
    }

    ////------- Part 2.2: Sort by District, then CityName (register==on) (Press 3)
    public static void sortByDistrictCity(List<City> cityList){
        //Sort by District => Then by CityName
        System.out.println("\n\nСортировка списка городов по федеральному округу и наименованию города внутри каждого федерального округа в алфавитном порядке по убыванию с учетом регистра");
        cityList.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));

        for(City city:cityList){
            System.out.println(city);
        }
    }



    ////------- Part 3: Show max population city (Press 4)
    public static void showCityWithMaxPopulation(List<City> cityList){
        System.out.println("\nГорода с наибольшим количеством жителей");
        City[] arrCity = new City[cityList.size()];
        arrCity = cityList.toArray(arrCity);

        int max = 0;
        int maxId = 0;
        for(int i = 0; i < arrCity.length; i++){
            if(arrCity[i].getPopulation() > max){
                max = arrCity[i].getPopulation();
                maxId = i;
            }
        }

        System.out.println("MAX City : "+arrCity[maxId].getName());
        System.out.format("[%d] = %d", maxId, arrCity[maxId].getPopulation());
    }

    //------- Part 4: Count city in every District (press 5)
    public static void countAndShowCityInEveryDistrict(List<City> cityList) {
        System.out.println("\n\n");
        System.out.println("Отобразить количество городов в разрезе регионов");
        Map<String, Integer> map = new HashMap<String, Integer>();
        //int count = 0;
        for(City city : cityList){
            Integer count = map.get(city.getRegion());
            if(count!=null){
                map.put(city.getRegion(), count +1);
            }
            else {
                map.put(city.getRegion(), 1);
            }
        }

        System.out.println(map);
    }


}
