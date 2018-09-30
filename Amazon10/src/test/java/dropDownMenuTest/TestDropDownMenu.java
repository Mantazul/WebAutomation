package dropDownMenuTest;

import menu.MenuPage;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestDropDownMenu extends MenuPage{
    @Test//f
    public void menu(){
      TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      readMenuTest();
    }
}
