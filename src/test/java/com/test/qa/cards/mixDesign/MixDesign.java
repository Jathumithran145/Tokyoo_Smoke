package com.test.qa.cards.mixDesign;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class MixDesign extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(MixDesign.class));

    @Test(groups = {"Smoke"}, priority = 1)
    /*
    Validation check
     */
    public void MixDesignWitoutDataTest() {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[3]"); //Click MixDesign;
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/button");//Click Add MixDesign button
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[3]/button[2]");// click save
        PageBase.staticWait(6);
        //MethodBase.assertEqual_Text_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]","Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div[1]/div/div", "Grade can't be empty");
        LOGGER.info("Grade can't be empty");
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div", "Date can't be empty");
        LOGGER.info("Date can't be empty");
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[3]/div[1]/div/div", "Target Strength can't be empty");
        LOGGER.info("Target Strength can't be empty");
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[5]/div/div/div[2]", "Category can't be empty");
        LOGGER.info("Category can't be empty");

    }
    /*
    Data Adding , import , export
     */

    @Test(groups = {"Smoke"}, priority = 2)
    public void MixDesignSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[3]"); //Click MixDesign
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(6);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/button[1]");//Export
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/button");//Click Add MixDesign button
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//Click Dropdown Plant
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByID("grade", "40"); //Set Grade
        MethodBase.click_ByXpath("//*[@id=\"date\"]/div/input");//Click Calender
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByID("target_strength", "7"); //set Target Slump
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[4]/div[2]/div/div/div/div");//Click Dropdown for Status
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"category\"]/div/div"); //Click DropDown for Material Category
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[1]/span/label/span/input");// click textbox1
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[1]/span/label/span/input");
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[4]/td[1]/span/label/span/input");
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[2]/button[1]");//Add quantity
        PageBase.staticWait(5);
        MethodBase.setText_ByID("Manufactured sand", "350");
        MethodBase.setText_ByID("0-15mm", "100");
        MethodBase.setText_ByID("4-20mm", "75");
        Thread.sleep(2000);
        PageBase.staticWait(5);
        MethodBase.selectDropDown("//select[@id=\"Manufactured sand\"]", "g");
        PageBase.staticWait(10);

        MethodBase.selectDropDown("/html/body/div[16]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div/div[2]/div/form/div/div/div[2]/div/select", "g");
        PageBase.staticWait(5);
        MethodBase.selectDropDown("/html/body/div[16]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div/div[3]/div/form/div/div/div[2]/div/select", "g");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background-color: rgb(0, 20, 34); color: white;\"]");//Submit button
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//Save
        PageBase.staticWait(5);

        softAssert.assertAll();

    }
    /*
    Edit & delete
     */

    @Test(groups = {"Smoke"}, priority =3 )
    public void MixDesignDeleteSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[3]"); //Click MixDesign
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(5);
       // MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[13]/span/a[2]/a/i");//delete
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[13]/span/a[1]/i");//edit
        PageBase.staticWait(5);
//        MethodBase.clickDropDownconfig("//div[@id=\"plant\"]","Vavuniya");//Edit plant
        PageBase.staticWait(5);
        MethodBase.clear_ById("grade","100");//edit grade
        PageBase.staticWait(5);
        MethodBase.clear_ById("target_strength","28");//edit target
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//Save
        PageBase.staticWait(5);
    }
    /*
    Plus icon Add finish product
     */

    @Test(groups = {"Smoke"}, priority = 4)
    public void MixDesignPlusSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[3]"); //Click MixDesign
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[9]/span/i");//plus icon
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"equipmentId\"]/div/div");//equipment dropdown
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"workOrderNo\"]","30");//work oder number
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"finishProductCode\"]","50");//cube code
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"date\"]/div/input");//Click Calender
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//Save
        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("//*[@id=\"rcDialogTitle0\"]/div/i");//close icon
        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/button[1]");//cancel
        PageBase.staticWait(10);



    }
    /*
    Raw material
     */

    @Test(groups = {"Smoke"}, priority = 5)
    public void MixDesignRawSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[3]"); //Click MixDesign
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[12]/a/i");//raw Material
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/span/a/a/i");//raw material data delete
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[12]/div/div/div/div[2]/div/div/div[2]/button[2]");//delete ok btn
        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/button/span/i");//close icon
        PageBase.staticWait(10);

    }
    /*/
    view
     */
    @Test(groups = {"Smoke"}, priority = 6)
    public void MixDesignViewSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[3]"); //Click MixDesign
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[10]/i");//View more
        PageBase.staticWait(10);
    }
    /*
    filter
     */
    @Test(groups = {"Smoke"}, priority = 7)
    public void MixDesignfilterSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[3]"); //Click MixDesign
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/button[2]");//click filter
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div/div[2]/div/div[1]/div");//click filter By
//        PageBase.staticWait(10);
//        MethodBase.setText_ByXpath("//*[@id=\"filter_by\"]/div/div/ul/li[1]/div","Plant");

    }
    /*
    Search
     */

    @Test(groups = {"Smoke"}, priority = 8)
    public void MixDesignSearchSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[3]"); //Click MixDesign
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(5);
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/span/div[1]/span/button");//import
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/table/thead/tr/th[1]/span[2]","BMQ-G40-012");//click search
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/button[2]");//clear
    }
}
