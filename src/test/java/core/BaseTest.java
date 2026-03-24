package core;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.codeborne.selenide.Configuration;

/**
 Базовый класс для инициализации селенида
 */

public class BaseTest {

    /**
     Инициализация selenida с настройками
     */

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
    }

}
