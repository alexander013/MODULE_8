
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MODUL_8_7 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }



//    ------------------------------------------------------------------------------------------------------------------
//    Модуль 8.7 задание 1
    @Test
    public void TestModul_8_7_1()
    {
        driver.navigate().to("http://qa.skillbox.ru/module19/");
//        Кнопка перехода к предыдущему объявлению в слайдере «<». <span class="da-arrows-prev"></span>
        var DaArrowsPrevLocator = By.xpath("//div[@class = 'da-arrows']//span[1]");
//        Кнопка «Узнать больше» в слайдере. Используйте поиск сразу по двум классам. <a href="#" class="da-link button">Узнать больше</a>
        var LinkButtonLocator = By.xpath("//*[@class = 'da-slide da-slide-fromleft da-slide-current']//a[contains(@class, 'da-link ')][contains(@class, 'button')]");
//        Все неактивные фильтры из раздела фильмов, которые есть в онлайн-кинотеатре.
        var NoActionElementLocator = By.xpath("//a[@href = '#noAction']");
//        Все элементы, у которых класс начинается на слова button
        var ButtonLocator = By.xpath("//*[starts-with(@class, 'button')]");
//        Кнопка «Подписаться сейчас»
        var PodpisSeychasLocator = By.xpath("//a[@class = 'button'][text() = 'Подписаться сейчас']");
//        Все картинки клиентов из раздела «Наши клиенты». Для уточнения локатора используйте указание ближайшего родительского элемента с ID.
        var ImgNahiKlientyLocator = By.xpath("//ul[@id = 'clint-slider']//li");
//        Необязательное задание. Все элементы с ценами тарифов, следующих после тарифа «Любительский».
        var PriceElementLocator = By.xpath("//div[contains(@class, 'price-table')][contains(@class, 'row-fluid')]//div[1]//following-sibling::div//li[@class='price']");
//        Необязательное задание. Все поля для ввода в форме «Скажите “Привет”», которые предшествуют полю «* Текст сообщения».
        var InputElementLocator = By.xpath("//div[@class = 'control-group'][3]//preceding-sibling::div[@class = 'control-group']//input");

    }



//    ------------------------------------------------------------------------------------------------------------------
//    Модуль 8.7 задание 2


    @Test
    public void TestModul_8_7_2()
    {
        driver.navigate().to("http://qa.skillbox.ru/module16/maincatalog/");
//        Заголовок пятого курса.
        var Title_5_Locator = By.xpath("//*[@class = 'baseCard pageCreate__card'][5]//span[@class = 'baseCard__title']");
//        Элемент с учебным периодом последнего курса
        var BaseKartLastPeriod = By.xpath("//*[@class = 'baseCard pageCreate__card'][last()]//div[@class = 'baseCard__label']");
//        Необязательное задание. Все div, которые являются непосредственными родителями для ссылок с href='#'
        var DivLocator = By.xpath("//a[@href = '#']/..");
//        Необязательное задание. Преобразуйте предыдущий локатор, чтобы он возвращал пятый элемент.
        var DivElement_5_Locator = By.xpath("//div[@class = 'pageCreate__cards']//div[@class='baseCard pageCreate__card'][5]//a[@href = '#']/..");
//        Необязательное задание. Все родительские элементы заголовка «Все курсы»
        var VseKursyLocator = By.xpath("//*[@class = 'pageCreate__title']//ancestor::*");

    }



//    ___________________________________________________________________________________________________________________
//    Модуль 8.7 задание 3

    @Test
    public void TestModul_8_7_3()
    {
        driver.navigate().to("http://qajava.skillbox.ru/index.html");
//        Ссылка «О магазине» в футере
        var O_MagazineLocator = By.xpath("//div[@id = 'preorder634']");
//        Заголовок «Бестселлеры».
        var BestselleryLocator = By.xpath("//div[@class = 'content']/h1[3]");
//        Строка поиска.
        var StrokapoiskaLokator = By.xpath("//div[@id = 'search']//input[@id = 'search-input']");
//        Итоговая сумма заказа в корзине.
        var SummaTovaraKorzinaLocator = By.xpath("//div[@id = 'order-info']//div[@id = 'total']");
//        Заголовок «Ваш заказ: в корзине.
        var ZagolovokVashZakasLocator = By.xpath("//div[@id = 'order-info']//div[text() = 'Ваш заказ: ']");
//        Кнопка «Отменить» на странице поиска.
        var ButtonOtmenitLocator = By.xpath("//div[@class = 'filter-container']//span[5]//button[@class = 'filter-button']");
    }



}
