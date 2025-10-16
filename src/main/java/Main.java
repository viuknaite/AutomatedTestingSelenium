import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\AutomatedTestingSelenium\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.chitai-gorod.ru/");
    }
}

//header//button[@type="button"] - Каталог
//header//div//form - Поиск