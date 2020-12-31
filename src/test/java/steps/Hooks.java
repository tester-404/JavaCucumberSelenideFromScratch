package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void openUrl() {
     //   open("https://grinfer.com/home");
    //    open("https://www.google.com/");
        open("https://grinfer.com/");
    }
}
