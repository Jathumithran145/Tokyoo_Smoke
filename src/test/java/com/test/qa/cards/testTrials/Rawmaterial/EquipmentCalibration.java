package com.test.qa.cards.testTrials.Rawmaterial;

import com.test.qa.utils.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;


public class EquipmentCalibration extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"}, priority = 1)
    public void AddCalibration() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(8);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[3]/div"); // click equipment
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button"); // click Add equipment
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"equipment\"]/div/div"); // click equipment
        MethodBase.hitEnter();
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"equipment_plant\"]/div/div"); // click plant equipment
        MethodBase.hitEnter();
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"employeeId\"]/div/div"); // click employee
        MethodBase.hitEnter();
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"calibrated_date\"]/div/input"); // select date
        MethodBase.hitEnter();
        PageBase.staticWait(8);
       // MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div[2]/input"); // set due days
        MethodBase.setKey_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div[2]/input",Keys.ARROW_UP);
        PageBase.staticWait(8);
        MethodBase.setText_ByXpath("//*[@id=\"accuracy\"]","1234"); // set accuracy
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"calibrated_by\"]/label[1]/span[2]"); // calibrated type internal
        MethodBase.hitEnter();
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"status\"]/div/div"); // status
        MethodBase.hitEnter();
        
        MethodBase.setText_ByXpath("//*[@id=\"description\"]","jnmnfdopidighhgff"); // description
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[3]/button[2]"); // save button
        PageBase.staticWait(8);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[11]/div/i");   //Description
//        PageBase.staticWait(3);
        MethodBase.assertEqual_Text_ByXpath("//*[@class=\"ant-modal-body\"]","jnmnfdopidighhgff");
        PageBase.staticWait(8);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 2)
    public void Report() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(2);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(2);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
        PageBase.staticWait(2);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[3]/div"); // click equipment
        PageBase.staticWait(2);
//        Report
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[10]/i");    //Report btn
        PageBase.staticWait(2);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[3]/div/button[2]");
        PageBase.staticWait(2);
    }
    @Test(groups = {"Smoke"}, priority = 3)
    public void Description() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(5);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[3]/div"); // click equipment
        PageBase.staticWait(5);

//        Description
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[11]/div/i");   //Description
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[3]/button");     //Close btn
        PageBase.staticWait(5);

    }

    @Test(groups = {"Smoke"}, priority = 4)
    public void Edit() throws Exception {
        softAssert = new SoftAssert();

        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[3]/div"); // click equipment
        PageBase.staticWait(3);
//        Edit btn
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[12]/span/a[1]/i");     //Edit btn
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"accuracy\"]", "2445");    //Accurancy
        PageBase.staticWait(3);
        softAssert.assertAll();
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");  //Save btn
        PageBase.staticWait(3);
    }

        @Test(groups = {"Smoke"}, priority = 5)
        public void Delete() throws Exception {
            softAssert = new SoftAssert();
            softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
            PageBase.staticWait(3);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
            PageBase.staticWait(3);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[3]/div"); // click equipment
            PageBase.staticWait(5);

//        Delete btn
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[12]/span/a[2]/a/i");    //Delete Btn
            PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/div[2]/div/div/div[2]/button[2]");     //Ok Btn
            PageBase.staticWait(3);
    }

}
