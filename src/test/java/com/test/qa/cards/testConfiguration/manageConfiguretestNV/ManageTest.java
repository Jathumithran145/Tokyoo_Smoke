package com.test.qa.cards.testConfiguration.manageConfiguretestNV;

import com.test.qa.cards.testConfiguration.testNV.AddTest;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;


public class ManageTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddTest.class));

                        /* Test Parameters View page edit & delete function */
        @Test(priority = 1,groups = {"Smoke"})
            public void Test_Parameters_View() throws Exception {
                softAssert = new SoftAssert();
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");// click manageconfiguretestNV
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//click managetestfield
                MethodBase.isDisplayed_ByXpath("//*[@style=\"font-family: Roboto; color: white; text-align: center; padding: 10px;\"]");// page display
                LOGGER.info("Manage Test Configuration Page is Display");
                PageBase.staticWait(5);
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/i");//click parametertest view
                MethodBase.isDisplayed_ById("rcDialogTitle0");// parameter page display
                LOGGER.info("Test Parameters is Display");
                MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[6]/span/a[1]/i");//click edit in parameter test
                PageBase.staticWait(8);
                MethodBase.isDisplayed_ById("rcDialogTitle1");//edit parameter page view
                LOGGER.info("Edit Test Parameter");
                MethodBase.click_ByXpath("//*[@id=\"mix_design_field\"]/div/div");//edit mixdesign field
                PageBase.staticWait(5);
                MethodBase.hitEnter();
                MethodBase.click_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div/button[2]");//click save btn
        }

                             /* Accepted Value View page edit & delete function */
        @Test(priority = 2,groups = {"Smoke"})
            public void managetest_Acceptedvalue() throws Exception {
                softAssert = new SoftAssert();
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");// click manageconfiguretestNV
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//click managetestfield
                MethodBase.isDisplayed_ByXpath("//*[@style=\"font-family: Roboto; color: white; text-align: center; padding: 10px;\"]");// page display
                PageBase.staticWait(5);
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/span/i");// click accepted value view
                PageBase.staticWait(5);
                MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr/td[6]/span/a/i");//click edit
                MethodBase.isDisplayed_ById("rcDialogTitle0"); // Finish Product Accepted Value page display
                LOGGER.info("Finish Product Accepted Value Page is Display");
                MethodBase.setText_ByID("finishPDAcMin","5");// edit parameter min range
                MethodBase.setText_ByID("finishPDAcMax","7");// edit parameter max range
                MethodBase.setText_ByID("finishPDAcvalue","6"); // edit value
                MethodBase.click_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[2]");//edit save
                LOGGER.info("Accepted Value updated Successfully ");
                softAssert.assertAll();
            }
                     /*Material Accepted Value edit & delete function */

    @Test(priority = 3,groups = {"Smoke"})
        public void material_Accepted_Value() throws Exception {
            softAssert = new SoftAssert();
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");// click manageconfiguretestNV
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//click managetestfield
            PageBase.staticWait(5);
            MethodBase.isDisplayed_ByXpath("//*[@style=\"font-family: Roboto; color: white; text-align: center; padding: 10px;\"]");// page display
            LOGGER.info("Manage Test Configuration page id Display");
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[4]/td[5]/span/i");// click Material Accepted Value
            MethodBase.isDisplayed_ById("rcDialogTitle0"); //
            PageBase.staticWait(5);
            LOGGER.info("Material Accepted Value is Display");
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[7]/span/a[1]/i");// click edit Material Accepted Value
            MethodBase.isDisplayed_ById("//*[@id=\"rcDialogTitle1\"]/div/p");
            LOGGER.info("Edit Material Accepted Value page is Display");
            PageBase.staticWait(5);
            MethodBase.setText_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div/form/div[5]/div[1]/div[2]/div/input","5"); // set minvalue
            PageBase.staticWait(5);
            MethodBase.setText_ByID("switchValMaximum","7");//set maxvalue
            PageBase.staticWait(5);
            MethodBase.setText_ByID("value","6");// set value
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[2]");// click save
            PageBase.staticWait(5);
            softAssert.assertAll();
    }

                             /* Equation View page edit & delete function */
            @Test(priority = 4,groups = {"Smoke"})
                public void managetest_Equation() throws Exception {
                    softAssert = new SoftAssert();
                    MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
                    MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");// click manageconfiguretestNV
                    MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//click managetestfield
                    MethodBase.isDisplayed_ByXpath("//*[@style=\"font-family: Roboto; color: white; text-align: center; padding: 10px;\"]");// page display
                    LOGGER.info("Equation Page is Display");
                    PageBase.staticWait(5);
                    MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/i");// click equation
                    PageBase.staticWait(5);
                    MethodBase.isDisplayed_ById("rcDialogTitle4"); // Equation page view
                    LOGGER.info("Equation page is Display");
                    PageBase.staticWait(8);
                    MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[4]/span/a[1]/i/svg");// click edit equation

//                    PageBase.staticWait(5);
//                    MethodBase.isDisplayed_ById("rcDialogTitle5");
//                    LOGGER.info("Edit Equation page is Display");
//                    MethodBase.click_ByXpath("/html/body/div[5]/div/div[2]/div/div[2]/div[3]/div/button[2]");// click save
//                    MethodBase.assertEqual_Text_ByXpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div[1]","you can only use the same test parameter"); //validation
//                    LOGGER.info("you can only use the same test parameter");
//                    MethodBase.setText_ByID("equation_formula","A= B+c");// edit equation
//                    MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// save
//                    MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[4]/span/a[2]/a/i/svg");// click delete
//                    MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div[2]/div/div/div[2]/button[2]");//conform ok
//                    softAssert.assertAll();
                }

                            /* managetest_Configuration edit & delete function */
        @Test(priority = 5,groups = {"Smoke"})
            public void managetest_ConfigurationEdit() throws Exception {
                softAssert = new SoftAssert();
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");// click manageconfiguretestNV
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//click managetestfield
                MethodBase.isDisplayed_ByXpath("//*[@style=\"font-family: Roboto; color: white; text-align: center; padding: 10px;\"]");// page display
                PageBase.staticWait(8);
                MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[9]/span/a[1]/i");// click edit btn
                PageBase.staticWait(8);
                MethodBase.click_ById("coretest");//click keytest
                MethodBase.setText_ByID("description","Description");// set description
                MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
                MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div","page is Display");
                LOGGER.info("Updated Successfully");
              //  MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[9]/span/a[2]/a/i/svg");// click delete
                softAssert.assertAll();
         }
    }

