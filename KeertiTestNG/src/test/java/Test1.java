import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver=new ChromeDriver();
	  driver.get("http://google.com");
  }
}
