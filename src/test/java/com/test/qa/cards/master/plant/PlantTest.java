package com.test.qa.cards.master.plant;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class PlantTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((PlantTest.class)));

    @Test(groups = {"Smoke"}, priority = 1)
    public static void addPlantSmokeTest() {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[4]/a");//Plant NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//Plant Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");//Add plant

        /*
        To Check Validation
         */

        MethodBase.setText_ByID("plant_code", "");//plant_code
        PageBase.staticWait(5);
        MethodBase.setText_ByID("plant_name", "");//plant_name
        MethodBase.setText_ByID("plant_address", "");//plant_address
        MethodBase.setText_ByID("plant_contactno", "");//plant_contactno
        MethodBase.setText_ByID("fax", "");//fax
        MethodBase.setText_ByID("plant_description", "");//plant_description
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(8);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Code can't be empty\"]", "Code can't be empty");
        LOGGER.info("Code can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]", "Plant can't be empty");
        LOGGER.info("Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Address can't be empty\"]", "Address can't be empty");
        LOGGER.info("Address can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact Number can't be empty\"]", "Contact Number can't be empty");
       LOGGER.info("Contact Number can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Fax Number can't be empty\"]", "Fax Number can't be empty");
        LOGGER.info("Fax Number can't be empty");

         /*
        Input Data
         */

        MethodBase.setText_ByID("plant_code", "OOO");//plant_code
        PageBase.staticWait(5);
        MethodBase.setText_ByID("plant_name", "ampha");//plant_name
        MethodBase.setText_ByID("plant_address", "ampaga");//plant_address
        MethodBase.setText_ByID("plant_contactno", "07789654231");//plant_contactno
        MethodBase.setText_ByID("fax", "07789654231");//fax
        MethodBase.setText_ByID("plant_description", "select plant");//plant_description
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[6]/div/i");//View description
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//close
        PageBase.staticWait(8);

    }



    @Test(groups = {"Smoke"}, priority = 2)
    public  static void editPlantSmokeTest() {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[4]/a");//Plant NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//Plant Field
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[3]/td[7]/span/a[1]/i");//edit button
        PageBase.staticWait(8);
//        MethodBase.clear_ById("plant_code", "APY");//plant_code
//        PageBase.staticWait(10);
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Only 3 characters long!\"]", "Only 3 characters long!");//to restrict 3 UpperCase
        MethodBase.clear_ById("plant_name", "Vavuniya");//plant_name
        PageBase.staticWait(8);
        MethodBase.clear_ById("plant_address", "Vavuniya");//plant_address
        PageBase.staticWait(8);
        MethodBase.clear_ById("plant_contactno", "07711111111");//plant_contactno
        PageBase.staticWait(8);
        MethodBase.clear_ById("fax", "07711111111");//fax
        PageBase.staticWait(8);
        MethodBase.clear_ById("plant_description", "select plant");//plant_description
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Code can't be empty\"]", "Code can't be empty");
//        PageBase.staticWait(5);
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]", "Plant can't be empty");
//        PageBase.staticWait(5);
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Address can't be empty\"]", "Address can't be empty");
//        PageBase.staticWait(5);
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact Number can't be empty\"]", "Contact Number can't be empty");
//        PageBase.staticWait(5);
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Fax Number can't be empty\"]", "Fax Number can't be empty");
//        PageBase.staticWait(8);

    }

    @Test(groups = {"Smoke"}, priority = 3)
    public static void deletePlantSmokeTest() {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[4]/a");//Plant NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//Plant Field
        PageBase.staticWait(6);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[5]/td[7]/span/a[2]/a/i/");//delete
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/div[2]/div/div/div[2]/button[2]");//confirm delete

    }
}







