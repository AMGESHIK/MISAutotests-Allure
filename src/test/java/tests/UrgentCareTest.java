package tests;

import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.FindPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;


@DisplayName("Тесты Яндекс поиска")
@ExtendWith(ScreenShooterExtension.class)
public class UrgentCareTest extends BaseTest {
    @Test
    @DisplayName("поиск в поисковике")
    public void PatientSearch() {
        FindPage findPage = new FindPage();
        findPage.fillFinder("allure");
        findPage.clickSearchBtn();
    }
}
