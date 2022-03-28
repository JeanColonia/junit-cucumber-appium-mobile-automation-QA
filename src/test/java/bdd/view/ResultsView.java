package bdd.view;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import mobile.MobileBase;
import mobile.MobileDriverManager;
import mobile.Util;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class ResultsView extends MobileBase {

    /***************** METHOD AND SELECTED ITEMS FOR YOUTUBE ********/
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.youtube:id/results']/android.view.ViewGroup")
    private List<MobileElement> resulList;

    public int getSizeResult() {
        WebDriverWait webDriverWait = new WebDriverWait(MobileDriverManager.getDriver(), 15);
        webDriverWait.until(ExpectedConditions.visibilityOf(resulList.get(0)));
        Util.takeScreeShot();
        return resulList.size();
    }

    /***************** METHOD AND SELECTED ITEMS FOR LINIO ********/

    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@resource-id='com.linio.android:id/rvGeneralContent']/android.widget.RelativeLayout[@resource-id='com.linio.android:id/rlProductContainer'][1]")
    private MobileElement selectResultProduct;

    @AndroidFindBy(xpath="//android.widget.RelativeLayout[@resource-id='com.linio.android:id/stickyDoubleContainer']/android.widget.ImageView")
    private MobileElement addToCart;

    @AndroidFindBy(xpath="//android.widget.RelativeLayout[@resource-id='com.linio.android:id/headerProductDetail']/android.widget.RelativeLayout/android.widget.FrameLayout")
    private MobileElement viewProductsOnCartContainer;

    public void selectItemOfResultProducts(){
        selectResultProduct.click();
    }

    public void addProductToCart(){
      addToCart.click();
    }

    public void viewCartContainer(){
        viewProductsOnCartContainer.click();
    }

}
