package com.test.qa.cards.mixDesign;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class MixDesignTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(MixDesign.class));

    @Test(groups = {"Smoke"}, priority = 1)
    public void MixDesignWitoutDataTest () throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[1]/div[2]/a[3]/div/div"); //Click MixDesign;
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/button");//Click Add MixDesign button
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[3]/button[2]");// click save
        PageBase.staticWait(6);
        //MethodBase.assertEqual_Text_ByXpath("/html/body/di
        // v[10]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]","Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div[1]/div/div", "Grade can't be empty");
        LOGGER.info("Grade can't be empty");
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div", "Date can't be empty");
        LOGGER.info("Date can't be empty");
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[3]/div[1]/div/div", "Target Strength can't be empty");
        LOGGER.info("Target Strength can't be empty");
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[5]/div/div/div[2]", "Category can't be empty");
        LOGGER.info("Category can't be empty");
        PageBase.staticWait(6);
        MethodBase.click_ByXpath("//*[@id=\"rcDialogTitle0\"]/div/i");//close icon
//        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/button[1]");//return
         MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/span/div[1]/span/button");//import
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/button[1]");//Export
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/button");//Click Add MixDesign button
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//Click Dropdown Plant
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(10);
        MethodBase.setText_ByID("grade", "40"); //Set Grade
        MethodBase.click_ByXpath("//*[@id=\"date\"]/div/input");//Click Calender
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByID("target_strength", "7"); //set Target Slump
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"status\"]/div");//Click Dropdown for Status
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"category\"]/div/div"); //Click DropDown for Material Category
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[1]/span/label");// click checkbox1
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[1]/span/label");// click checkbox2
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[4]/td[1]/span/label");// click checkbox3
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[2]/form/div[2]/button[1]");//Add quantity
        PageBase.staticWait(10);
        MethodBase.setText_ByID("Manufactured sand", "350");
        MethodBase.setText_ByID("0-15mm", "100");
        MethodBase.setText_ByID("4-20mm", "75");
        PageBase.staticWait(5);
        MethodBase.selectDropDown("//select[@id=\"Manufactured sand\"]", "g");
        MethodBase.selectDropDown("//select[@id=\"0-15mm\"]", "g");
        MethodBase.selectDropDown("//select[@id=\"4-20mm\"]", "g");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background-color: rgb(0, 20, 34); color: white;\"]");//Submit button
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//Save
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[13]/span/a[1]/i");//edit
        PageBase.staticWait(5);
//        MethodBase.clear_ByXpath("//*[@id=\"plant\"]/div/div","Jaffna");//Edit plant
//        MethodBase.selectDropDown("/html/body/div[10]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/div","Jaffna");
        PageBase.staticWait(5);
        MethodBase.clear_ById("grade","100");//edit grade
        PageBase.staticWait(5);
        MethodBase.clear_ById("target_strength","28");//edit target
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//Save
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[12]/a/i");//raw Material
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/span/a/a/i");//raw material data delete
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[12]/div/div/div/div[2]/div/div/div[2]/button[2]");//delete ok btn
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[10]/i");//View more

        softAssert.assertAll();

    }

}