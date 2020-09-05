package com.test.qa.cards.master.employee;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Designation extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((Designation.class)));
    @Test(groups = {"Smoke"}, priority = 41)
    public static void  adddesignationSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]");//employee
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");//Designation
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]");//AddDesignation
        /*
        Validation Checking
         */

        MethodBase.setText_ByID("designation","");//designation
        MethodBase.setText_ByXpath("//*[@id=\"designation_name\"]","");//designation_name
        MethodBase.setText_ByXpath("//*[@id=\"designation_description\"]","");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Designation can't be empty\"]","Designation can't be empty");
        LOGGER.info("Designation can't be empty");
        PageBase.staticWait((5));


        /*
        Data Input
         */
        MethodBase.setText_ByID("designation"," mega main QA");//designation
        MethodBase.setText_ByXpath("//*[@id=\"designation_name\"]","Quality Assurance ad");//designation_name
        MethodBase.setText_ByXpath("//*[@id=\"designation_description\"]","designation position");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

    @Test(groups = {"Smoke"}, priority = 42)
    public  static void  editdesignationSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]");//employee
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");//Designation
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[3]/span/a[1]/i");//edit
        MethodBase.clear_ByXpath("designation","main QA");//designation
        MethodBase.clear_ByXpath("//*[@id=\"designation_name\"]","Quality Assurance");//designation_name
        MethodBase.clear_ByXpath("//*[@id=\"designation_description\"]","designation ");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

    @Test(groups = {"Smoke"}, priority = 43)
    public  static void  deletedesignationSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]");//employee
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");//Designation
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[5]/td[3]/span/a[2]/a/i/");
        PageBase.staticWait( 5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div[2]/div/div/div[2]/button[2]");//ok



    }

}
