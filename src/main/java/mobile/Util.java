package mobile;

import org.openqa.selenium.OutputType;

public class Util {

    public static void takeScreeShot(){
        byte[] screenshot = MobileDriverManager.getDriver().getScreenshotAs(OutputType.BYTES);
        ManageScenario.getScenario().attach(screenshot,"image/jpeg", "evidencia");
    }

    public static void waitThread(int mill){
        try {
            Thread.sleep(1000);
        }catch(InterruptedException interruptException){
            System.out.println(interruptException);
        }
    }
}
