import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sa  {
    public static boolean isClickable(WebElement element) {
        WebDriver driver = new ChromeDriver();
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, 100);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }





}
