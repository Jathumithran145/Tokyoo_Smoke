package com.test.qa.cards.master.equipment;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class EquipmentTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((EquipmentTest.class)));

    @Test(groups = {"Smoke"}, priority = 4)
    public static void addEquipmentSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add Equipment
        /*
        To Check Validation
         */

        MethodBase.setText_ByXpath("//*[@id=\"equipment_name\"]","");//equipment_name
        MethodBase.setText_ByXpath("//*[@id=\"equipment_description\"]","");//equipment_description
        MethodBase.click_ByXpath("  //*[@id=\"type\"]/div/div");//equipment type
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]","Name can't be empty");
        PageBase.staticWait((5));

        /*
        Data Input
         */

        MethodBase.setText_ByXpath("//*[@id=\"equipment_name\"]","Comprise shaker");//equipment_name
        MethodBase.setText_ByXpath("//*[@id=\"equipment_description\"]"," Take Comprise shaker");//equipment_description
        MethodBase.click_ByXpath("  //*[@id=\"type\"]/div/div");//equipment type
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));






    }

    @Test(groups = {"Smoke"}, priority = 5)
    public  static void editEquipmentSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/span/a[1]/i");//edit
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"equipment_name\"]", "Ston shaker");//equipment_name
        MethodBase.clear_ByXpath("//*[@id=\"equipment_description\"]", " Take Ston shaker");//equipment_description
        MethodBase.click_ByXpath("  //*[@id=\"type\"]/div/div");//equipment type
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));

    }

        @Test(groups = {"Smoke"}, priority = 6)
        public static void deleteEquipmentSmokeTest() throws Exception {

            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");// Equipment field
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[4]/span/a[2]/a/i");// Edit btn
            PageBase.staticWait(8);
            MethodBase.click_ByXpath("/html/body/div[8]/div/div/div/div[2]/div/div/div[2]/button[2]");
            PageBase.staticWait(6);
//            MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/span/a[2]/a/i");//verify  if deleted
//            LOGGER.info("verify  if deleted");







    }
}
