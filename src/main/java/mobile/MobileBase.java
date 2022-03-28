package mobile;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MobileBase {
    public MobileBase(){
        PageFactory.initElements(new AppiumFieldDecorator(MobileDriverManager.getDriver()), this);
    }

}
