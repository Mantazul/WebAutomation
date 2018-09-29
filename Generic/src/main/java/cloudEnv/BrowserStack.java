package cloudEnv;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStack {

    public void setUpBrowserStack() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setPlatform(Platform.MAC);
        cap.setBrowserName("chrome");
        String browserStackUrl = "https://renxingxing1:DyE5Dpu9u1W4WLaQT9yn@hub-cloud.browserstack.com/wd/hub";
        URL serverUrl = new URL(browserStackUrl);
    }
}
