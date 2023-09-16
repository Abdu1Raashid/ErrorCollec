package utilities;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.TestBase;
public class testutil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static WebDriverWait wait = new WebDriverWait(TestBase.driver, Duration.ofSeconds(4));

	
	}

