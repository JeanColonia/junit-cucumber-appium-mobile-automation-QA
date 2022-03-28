package bdd.view;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import mobile.MobileBase;
import mobile.MobileDriverManager;
import mobile.Util;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeView extends MobileBase {

    /*************************** METHOD AND SELECTED ITEMS FOR YOUTUBE *****************/
    @AndroidFindBy(accessibility="Search")
    private MobileElement searchButton;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search YouTube']")
    private MobileElement searchInput;

    public void goSearch() { searchButton.click();}

    public void typeVideo(String video) {
        searchInput.sendKeys(video);
    }

    public void enterKey() {
     ((AndroidDriver) MobileDriverManager.getDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));}

    /*****************************  SELECTED ITEMS AND METHODS FOR LINIO **********************/
    @AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id='com.linio.android:id/oldBottomNavigation']/android.view.ViewGroup/android.widget.FrameLayout[@content-desc='BUSCAR']")
    private MobileElement searchLinioButton;
    @AndroidFindBy(xpath="//android.widget.LinearLayout[@resource-id='com.linio.android:id/llSearchBarContainer']")
    private MobileElement searchBar;
    
    //@AndroidFindBy(id = "com.linio.android:id/tvLabelText")
    @AndroidFindBy(xpath="//android.widget.EditText[@text='Buscar en Linio']")
    private MobileElement inputTextLinio;
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.linio.android:id/rvSearchContent']/android.view.ViewGroup[2]")
    private MobileElement selectProductItem;


    public void typeProduct(String product) {
        searchLinioButton.click();
        Util.waitThread(2000);
        searchBar.click();
        Util.waitThread(2000);
        inputTextLinio.sendKeys(product);
        Util.waitThread(500);
    }

    public void selectProductOfComboResult(){
        selectProductItem.click();
    }

}
