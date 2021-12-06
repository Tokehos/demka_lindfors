package ru.netology;

public class CallbackTest {
    private WebDriver driver;

    @BeforeAll
    public static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
        driver = null;

    }

    @Test
    public void should(){
        driver.get("https://spb.lindfors.ru/?city=1");
        System.out.println();
    }
}