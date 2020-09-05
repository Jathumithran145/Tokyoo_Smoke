package com.test.qa.cards.testConfiguration;

import com.test.qa.utils.TestBase;
import org.apache.xmlbeans.impl.jam.mutable.MElement;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.MethodBase;
import utils.PageBase;

import javax.swing.*;
import java.awt.*;
import java.lang.management.MemoryType;

public class Configration extends TestBase {
    @Test(priority = 1)

    /** Check the Validation for first page , Next Page button [CONFIGURE TEST 01 ] */
    public void test0() throws Exception {
//        WebDriver driver = new chromedriver();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configuration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//click configure test

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div/div[2]/span");//click configure test 1
//        MethodBase.isDisplayed_ByXpath("//*[@style=\"background: rgb(0, 20, 34); color: white; border-top-left-radius: 5px; border-top-right-radius: 5px; height: 50px; justify-content: center; vertical-align: middle; margin-top: 10px; font-size: 16px; font-weight: 480;\"]");
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div[2]/div[5]/button"); // click Submit button
//        MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div[2]",
//                "Test can't be empty"); // Validation verify for Test
//        MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div[2]/div[1]/div[2]/div/div[2]",
//                "Test Type can't be empty"); // Validation verify for Test Type
//        MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div[2]/div[1]/div[3]/div/div[1]",
//                "Prefix can't be empty"); // Validation verify for Prefix
//        MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]",
//                "Material Category can't be empty"); // Validation verify for Meterial Category
//        MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]",
//                "Material Sub category can't be empty"); // Validation verify for Prefix
//        MethodBase.hitEnter();
    /** fill the data for first step , Next Page button  */
        MethodBase.click_ByXpath("//*[@id=\"test\"]/div");//click test drop down
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"test_type\"]/div");//click test type
        Thread.sleep(2000);
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByID("prefix","JA");//set prefix
        MethodBase.click_ByXpath("//*[@id=\"main_category\"]/div/div");//click main category
        Thread.sleep(3000);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div"); // click subcategory
        Thread.sleep(3000);
        PageBase.staticWait(9);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"material\"]/div/div"); // click material
        Thread.sleep(3000);
        MethodBase.hitEnter();
        MethodBase.setText_ByID("description","data");// set description
        MethodBase.setText_ByID("procedure","procedure"); // set procedure
        MethodBase.click_ByXpath("//*[@id=\"report_format\"]"); // click reportformat
        Thread.sleep(2000);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div[2]/div[5]/button"); // click Submit button

        /** fill the data for second  step ,Checkbox button [TEST PARAMETER 02 ]  */

//        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div");// check the parameter page is displayed
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[4]/div/div[2]/button");//Click submit parameter
//        MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[4]/div/div[1]/div[1]",
//                "Test Parameters can not be Empty"); // Validation verify for Test parameter
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div/div[3]"); // Select Add Parameter
//        PageBase.staticWait(5);
//        MethodBase.isDisplayed_ByXpath("//*[@id=\"rcDialogTitle0\"]/div/p"); // Check Add parameter page is displayed
//        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");// Click save
//        MethodBase.assertEqual_Text_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div/div[1]",
//                "Parameter Name can't be empty"); // Validation verify for Test
//        MethodBase.assertEqual_Text_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]",
//                "Parameter Type can't be empty'"); // Validation verify for Test
//        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]"); // click Return

        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div/div[3]"); // Select Add Parameter
//        PageBase.staticWait(5);
//        MethodBase.setText_ByXpath("//*[@id=\"parameter_name\"]","  Weight of oven dried Sample in air_0A3");// enter parameter name
//        MethodBase.click_ByXpath("//*[@id=\" parameterType\"]/div");// click Parameter type
//        PageBase.staticWait(5);
//        MethodBase.hitEnter();
//        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");// Click save
//        PageBase.staticWait(5);
////        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div"); //Check parameter page is displayed
//
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div/div[3]"); // Select Add Parameter
//        PageBase.staticWait(5);
//        MethodBase.setText_ByXpath("//*[@id=\"parameter_name\"]","Weight of saturated surface Dry sample in air_0B3");// enter parameter name
//        MethodBase.click_ByXpath("//*[@id=\" parameterType\"]/div");// click Parameter type
//        PageBase.staticWait(5);
//        MethodBase.hitEnter();
//        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");// Click save
////        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div"); //Check parameter page is displayed
//
//
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div/div[3]"); // Select Add Parameter
//        PageBase.staticWait(5);
//        MethodBase.setText_ByXpath("//*[@id=\"parameter_name\"]","  Water Absorption %_0C3");// enter parameter name
//        MethodBase.click_ByXpath("//*[@id=\" parameterType\"]/div");// click Parameter type
//        PageBase.staticWait(5);
//        MethodBase.hitEnter();
//        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");// Click save
////        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div"); //Check parameter page is displayed

        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/label");// click checkbox
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[3]/label"); // Select Checkbox 02
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[3]/label"); // Select Checkbox 03
        PageBase.staticWait(10);
//        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[1]/div/div"); // Check Test parameter page is displayed

        /** [TEST PARAMETER __ ]  */
        MethodBase.setText_ByXpath("//*[@id=\"abbrivation\"]","R"); // enter Abbravation

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/div/div");// Click Type
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/ul/li[3]"); // select Result
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/div/div"); // click INPUT METHOD
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/ul/li[1]");// click Input
        PageBase.staticWait(5);
        MethodBase.hitEnter();
     ////   MethodBase.setText_ByXpath("//*[@id=\"value\"]","1178.2");// enter Value
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[7]/div/div");// Click Unit
        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/ul/li[2]");// Select  Unit
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[9]/label/span/input");// click relevent

        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[3]/span/input","B"); // enter Abbravation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[4]/div/div");// Click Type
        MethodBase.click_ByXpath("/html/body/div[6]/div/div/div/ul/li[1]"); // Click INPUT
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[5]/div/div"); // Click INPUT METHOD
        MethodBase.click_ByXpath("/html/body/div[7]/div/div/div/ul/li[2]");// click OBSERVE
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[7]/div/div");// Click Unit
        MethodBase.click_ByXpath("/html/body/div[8]/div/div/div/ul/li[2]");// CLICK UNIT
        PageBase.staticWait(5);
        MethodBase.hitEnter();

        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[3]/span/input","A"); // enter Abbravation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[4]/div/div");// Click Type
        MethodBase.click_ByXpath("/html/body/div[9]/div/div/div/ul/li[1]");// Click INPUT
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[5]/div/div");// click Input
        MethodBase.click_ByXpath("/html/body/div[10]/div/div/div/ul/li[2]"); // CLICK OBSERVE
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[7]/div/div");// Click Unit
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/ul/li[2]"); // CLICK UNIT G
        PageBase.staticWait(5);
        MethodBase.hitEnter();

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[3]/div/div[2]/button"); // click submit parameter
        Thread.sleep(3000);
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[3]/button[1]"); // click next page

        /** fill the data for third   step [CONFEGRATION EQUATION 03 ]  */

//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[3]/div"); // Config Equation
        PageBase.staticWait(5);
        MethodBase.clickText_ByID("//input[@id=\"2\"]","RESULT"); // Click Result radiobutton
        Thread.sleep(2000);
        MethodBase.click_ByXpath("//input[@id=\"2\"]");
        Thread.sleep(2000);
        PageBase.staticWait(5);

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div"); // click test parameter
        MethodBase.hitEnter();
        Thread.sleep(2000);
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]/label/span/input"); // SELECT PARAMETER B
        PageBase.staticWait(3);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[4]/label/span/input"); // SELECT THE PARAMETER A
        PageBase.staticWait(3);
        Thread.sleep(2000);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/textarea","(B-A)/B*100"); // Create Equation (B-A)/B*100
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[3]/button");// CLICK Submit Equation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[3]/button[1]"); // Click Next Button


/** fill the data for Fourth step [Accepcted Criteria 04 ]  */

//MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div[1]/p"); // Validate the page is Visible
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div[1]/div"); // Click Select parameter
       PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[3]/div[2]/div/div/div[1]/div/input","0"); // Minimum
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[3]/div[2]/div/div/div[3]/div/input","3");// Maximum
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[3]/div[3]/div/label[2]/span/input"); // Click Relevent to Result
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div[2]/button"); // Click Submit button

//        MethodBase.isDisplayed_ByXpath("/html/body/div/div/section/section/main/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div[2]/table/tbody/tr"); // Check the accdepcted vale is visible
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div[1]/div"); // Click Next Page



        /** fill the data for Fifth step [REVIWE TEST 05 ]  */


//        MethodBase.isDisplayed_ByXpath("/** fill the data for third   step [CONFEGRATION EQUATION 04 ]  */");// Verify the Configer test page is visible
//        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div[1]/div[2]/div/div[1]/div/div");// Verify the FinishProduct  page is visible
//        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div[3]/div/div[1]/div/div");// verify the Test parameter page is visible
//        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div[3]/div/div[1]/div/div");//Verify the equation page is visible
         Thread.sleep(3000);
         MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[3]/button[1]"); // Click DONE
//        MethodBase.assertEqual_Text_ByXpath("/div/div/div/span","Processing complete!"); // Check the validation page.

    }
}
