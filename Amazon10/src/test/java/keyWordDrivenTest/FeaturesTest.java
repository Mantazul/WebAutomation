package keyWordDrivenTest;

import keyWordDrivenPage.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class FeaturesTest extends Features {
    Features objOfFeatures;
    @BeforeMethod
    public void initializeObjects(){
        objOfFeatures = PageFactory.initElements(driver, Features.class);
    }
    @Test
    public void testSignInWithInvalidIdAndPassword() throws IOException, InterruptedException {
        objOfFeatures.selectFeature();
    }
}
