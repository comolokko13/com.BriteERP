package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CRMPage {

    public CRMPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }


    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//span[contains(text(),'CRM')]")
    private WebElement crmModul;

    public WebElement getCrmModul() {
        return crmModul;
    }

    @FindBy(xpath = "//td[text()='grou25OpportunityDemo']//parent::tr//td[@class='o_data_cell o_list_number'][1]")
    private WebElement revenueTextonList;


    public WebElement revenueTextonList() {
        return revenueTextonList;
    }

    @FindBy(xpath = "//td[text()='grou25OpportunityDemo']//parent::tr//td[@class='o_pivot_cell_value text-right'][1]")
    private WebElement revenueTextonPivot;


    public WebElement getRevenueTextonPivot() {
        return revenueTextonPivot;
    }
    @FindBy(xpath = "//button[@data-original-title='List']")
    private WebElement listButton ;

    public WebElement getListButton(){
        return listButton;
    }


    @FindBy(xpath = "//button[@data-original-title='Pivot']")
    private WebElement pivotButton ;

    public WebElement getPivotButton(){
        return pivotButton;
    }


    @FindBy(xpath = "//td[text()='Total']")
    private  WebElement totalButton;

    public WebElement getTotalButton(){
        return totalButton;
    }

    @FindBy(xpath = "//ul[@class='dropdown-menu o_pivot_field_menu']//a[text()='Opportunity']")
    private  WebElement opportunityOption;

    public WebElement getOpportunityOption(){
        return opportunityOption;
    }

    @FindBy(xpath = "//td[@class='o_pivot_cell_value text-right'][1]")
    private  List<WebElement>  expectedRevenues;

    public List<WebElement> getExpectedRevenues() {
        return expectedRevenues;
    }
}