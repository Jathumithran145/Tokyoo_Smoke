package com.test.qa.cards.testTrials.Rawmaterial.admixture;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class ChemicalAdmixture extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"}, priority = 1)
    public void PhTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(05);
  //      MethodBase.assertEqual_Text_ByXpath("//*[@id=\\\"root\\\"]/div/section/section/header/ul/a/div",("Test trial table is diplayed"));
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/a/div"), "Dashboard is not Displayed");
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div"); // click raw material test
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div/h1"); // click admixture test
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/a[1]/div/h1"); // click chemical test
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/a/div/h1"); // click ph test
        PageBase.staticWait(05);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[1]/div"), "Incomming sample table is not Displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]/button");  //Create Test
        PageBase.staticWait(05);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div[1]/div/div[1]/div/h4"), "Ph test table is displayed");
        MethodBase.click_ByXpath("//*[@id=\"date\"]/div");  //Date
        MethodBase.hitEnter();
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"material_state\"]");    //Meterial State
        MethodBase.hitEnter();
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"test_level\"]/div/div");    //Test Level
        MethodBase.hitEnter();
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[5]/div/div[1]/div[1]/span[1]");   //No of Test
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div[2]/div[2]/div/div");    //Submit btn
        PageBase.staticWait(05);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"), "Test trial table is diplayed");

        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div/input","5.2");
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial btn
        PageBase.staticWait(05);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div/input", "4.2");
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial btn
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); // View Result
        PageBase.staticWait(05);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/table/thead/tr"),"Generate Report table is displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/button");   //Genrate Report
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/button[2]");
        softAssert.assertAll();
    }
}
