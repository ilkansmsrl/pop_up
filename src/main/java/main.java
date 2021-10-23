import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Timer;
import java.util.TimerTask;

public class main {

    public static void  main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\onurs\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.convertflow.com/campaigns/popup-examples-templates";
        driver.get(baseUrl);
        Timer myTimer = new Timer();
        WebDriverWait wait = new WebDriverWait(driver,10);
        TimerTask myTask = new TimerTask() {
             final sa sa = new sa();

            @Override
            public void run() {
                WebElement element = driver.findElement(By.xpath("//body/div[7]/div[1]/div[@class='cf-cta-close']"));
                Boolean visible = element.isDisplayed();
                if (visible == true){
                    System.out.println("burda");
                    element.click();
                }
                else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("sa");
                    run();
                }


            }
        };
        myTimer.schedule(myTask, 0, 20);
    }




}
