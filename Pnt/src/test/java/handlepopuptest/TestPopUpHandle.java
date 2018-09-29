package handlepopuptest;

import base.CommonAPI;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import popupPage.HandlePopUp;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestPopUpHandle extends CommonAPI{
    @Test
    public void popUpHandle()throws InterruptedException{
        HandlePopUp handlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
    }
}
