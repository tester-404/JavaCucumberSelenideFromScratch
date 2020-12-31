package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButton(String text) {

        $(By.xpath("//a[contains(text(),'" + text + "')]")).click();

    //    $(By.xpath("//div[text()='" + text + "']")).click();
   //     $(By.xpath("//a[contains(text(),'Log In')]")).click(); работает
      //  System.out.println("PRESS OK!!!!!!!!!!");
        // (   ()
        // //a[contains(text(),'Log In')]   //a[contains(text(),'Log In')]
    }

    public void clickButtonSpan(String text) {
        $(By.xpath("//span[text()='" + text + "']/..")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }
}
