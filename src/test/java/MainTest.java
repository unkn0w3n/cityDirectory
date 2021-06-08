import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    //-------- Part 1: Read file + check
    @Test
    @DisplayName("Check File Exists")
    void checkFileExist() {
        Assertions.assertThrows(FileNotFoundException.class, () -> {
            String filePath = "not_exist.txt";
            Scanner scanner = new Scanner(new File(filePath));
        });
    }

    @Test
    @DisplayName("Class Readed correctly")
    void classElementCreatedCorrectly() throws IOException {
        City test = new City("Адыгейск","Адыгея","Южный",111091,1973);
        String filePath = "data/cities.txt";
        List<City> cityList = FileAndMenu.readAndParseCitiesFromFile(filePath);
        Assertions.assertEquals();
    }
}