package com.briteERP.tests;

import com.briteERP.pages.CRMPage;
import com.briteERP.pages.LoginPage;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import com.briteERP.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class viewListPage  extends TestBase {


    @Test
    public void verifyListPageTest(){
        LoginPage loginPage = new LoginPage();
        CRMPage crmPage = new CRMPage();


        System.out.println(ConfigurationReader.getProperty("username") + " " + ConfigurationReader.getProperty("password"));
        loginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        crmPage.getCrmModul().click();
        crmPage.getListButton().click();
        String revenueList = crmPage.revenueTextonList().getText();
        crmPage.getPivotButton().click();
        BrowserUtils.clickWithJS(crmPage.getTotalButton());
        BrowserUtils.clickWithJS(crmPage.getTotalButton());

        //crmPage.getTotalButton().click();
        crmPage.getOpportunityOption().click();
        String revenuePivot = crmPage.getRevenueTextonPivot().getText();

        Assert.assertEquals(revenueList,revenuePivot);
        System.out.println(revenueList + " == " + revenuePivot);




    }
}
