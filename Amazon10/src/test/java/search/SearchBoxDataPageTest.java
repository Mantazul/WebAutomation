package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchBoxDataPage;

public class SearchBoxDataPageTest extends SearchBoxDataPage {
    SearchBoxDataPage searchBoxDataPage;
    @BeforeMethod
    public void initElement(){searchBoxDataPage= PageFactory.initElements(driver,SearchBoxDataPage.class);
    }
    //************** Test-cases for searching items with DB data  *****************************************************
    @Test(priority = 1, enabled = true)
    public void testSearchByDBData() throws Exception {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBoxDataPage.searchItemsFromDB();
    }
}
