package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
 //   private SelenideElement loginInput = $(By.xpath("//input[@id='email']"));
    private SelenideElement loginInput = $(By.xpath("//input[contains(@id,'email')]"));
  //  private SelenideElement loginInput = $(By.xpath("/html[1]/body[1]/div[2]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[2]/div[1]/span[1]/input[1]"));
    private SelenideElement passwordInput = $(By.xpath("//input[contains(@id,'password')]"));

    public void inputLogin(String text) {
        this.loginInput.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }

}
