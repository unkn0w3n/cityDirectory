import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        //Read from file and creating City class objects
        String filePath = "data/cities.txt";
        List<City> cityList = FileAndMenu.readAndParseCitiesFromFile(filePath);

        //main program start
        int menu = 0;
        while(true){
            //show menu (sleep 2 sec before show)
            try {
                menu = FileAndMenu.showMenuAndGetId();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            //Вывести список Городов
            if(menu == 1) {
                for(City city:cityList){
                    System.out.println(city);
                }
            }
            //Отсортировать по городу, по убыванию
            else if(menu == 2) {
                Sort.sortByCityDescending(cityList);
            }
            //Отсортировать по округу и городу
            else if(menu == 3) {
                Sort.sortByDistrictCity(cityList);
            }
            //Отобразить город с максимальным кол-вом жителей
            else if(menu == 4) {
                Sort.showCityWithMaxPopulation(cityList);
            }
            //Отобразить количество городов в разрезе регионов
            else if(menu == 5) {
                Sort.countAndShowCityInEveryDistrict(cityList);
            }
            //Выйти из программы
            else if(menu == 666) {
                System.out.println("[+] Программа успешно завершенна");
                return;
            }
            else{
                System.out.println("\n\n[!!!] Нажата некорректная клавиша или выбран несуществующий пункт меню. Попробуйте еще раз\n\n");
            }
        }
    } //end of main
} //end of class





