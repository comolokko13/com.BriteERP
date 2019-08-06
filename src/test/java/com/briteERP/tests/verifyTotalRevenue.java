package com.briteERP.tests;

import com.briteERP.pages.CRMPage;
import com.briteERP.pages.LoginPage;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class verifyTotalRevenue extends TestBase {

    @Test
    public void verifyListPageTest(){
        LoginPage loginPage = new LoginPage();
        CRMPage crmPage = new CRMPage();


        System.out.println(ConfigurationReader.getProperty("username") + " " + ConfigurationReader.getProperty("password"));
        loginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        crmPage.getCrmModul().click();
        crmPage.getListButton().click();
        BrowserUtils.waitClicable(crmPage.getPivotButton()).click();
        BrowserUtils.waitClicable(crmPage.getTotalButton());

        BrowserUtils.clickWithJS(crmPage.getTotalButton());
        BrowserUtils.clickWithJS(crmPage.getTotalButton());
        crmPage.getOpportunityOption().click();
       List<WebElement> expectedRevenues = crmPage.getExpectedRevenues();
        List<Integer> revenues  = new ArrayList<>();
        for (WebElement element : expectedRevenues) {

           revenues.add(Integer.parseInt(element.getText().replaceAll("[,.]","")));

        }
        Integer totalReveneu = 0;
      for (int i = 1 ;i < revenues.size();i++){
          System.out.println(revenues.get(i));
          totalReveneu+=(int)revenues.get(i);
          System.out.println(totalReveneu);

      }
        System.out.println(totalReveneu.toString() + " === " + revenues.get(0));




    }
}
