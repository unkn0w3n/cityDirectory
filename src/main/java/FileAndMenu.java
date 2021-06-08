import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FileAndMenu {
    //Show menu
    public static int showMenuAndGetId() throws InterruptedException {
        int selection = 0;
        Scanner input = new Scanner(System.in);

        TimeUnit.SECONDS.sleep(2);

        /***************************************************/
        System.out.println("\n============================================");
        System.out.println("CityDirectory Меню");
        System.out.println("--------------------------------------------");
        System.out.println("1 - Вывести список городов");
        System.out.println("2 - Отсортировать и вывести список городов по убыванию");
        System.out.println("3 - Отсортировать и вывести сортированный список по региону и городу");
        System.out.println("4 - Отобразить город с максимальным кол-вом жителей");
        System.out.println("5 - Отобрать количество городов в разрезе регионов");
        System.out.println("666 - Quit [Выход из программы]");
        System.out.println("============================================");
        /***************************************************/

        try{
            selection = input.nextInt();
        } catch (Exception e){
            selection = 0;
        }
        return selection;
    }

    //Part 0. Parse from file and read to City Classes (Press 1)
    public static List<City> readAndParseCitiesFromFile(String filePath) throws IOException {
        List<City> cityList=new ArrayList<City>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String data_str = scanner.nextLine();
                cityList.add(new City(data_str));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("[!] Пожалуйста, убедитесь, что вы правильно указали путь к файлу.");
            e.printStackTrace();
        }
        return cityList;
    }

}
