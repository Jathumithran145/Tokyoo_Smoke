package com.test.qa.cards.master;

import com.test.qa.cards.master.customer.Customer;
import com.test.qa.cards.master.customer.DeliveryCycle;
import com.test.qa.cards.master.customer.Project;
import com.test.qa.cards.master.employee.Designation;
import com.test.qa.cards.master.employee.Employee;
import com.test.qa.cards.master.employee.Role;
import com.test.qa.cards.master.employee.User;
import com.test.qa.cards.master.equipment.EquipmentTest;
import com.test.qa.cards.master.equipment.PlantEquipment;
import com.test.qa.cards.master.material.*;
import com.test.qa.cards.master.plant.PlantTest;
import com.test.qa.cards.master.supplier.Supplier;
import com.test.qa.cards.master.supplier.SupplierCategory;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class MasterRunTokiyo extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((SupplierCategory.class)));
    @Test(groups = {"Smoke"}, priority = 1)
    public void  masterRunTokiyoSmokeTest() throws Exception {
        softAssert = new SoftAssert();
/*
Plant NV
 */
        PlantTest.addPlantSmokeTest();
        PlantTest.editPlantSmokeTest();
        PlantTest.editPlantSmokeTest();

 /*
 Equipment NV
  */

        EquipmentTest.addEquipmentSmokeTest();
        EquipmentTest.editEquipmentSmokeTest();
        EquipmentTest.deleteEquipmentSmokeTest();

        PlantEquipment.addPlantEquipmentSmokeTest();
        PlantEquipment.editPlantEquipmentSmokeTest();
        PlantEquipment.deletePlantEquipmentSmokeTest();

  /*
 Material  NV
  */

        MaterialCtaegory.addMaterialCtaegorySmokeTest();
        MaterialCtaegory.editMaterialCtaegorySmokeTest();
        MaterialCtaegory.deleteMaterialCtaegorySmokeTest();

        MaterialSubCategory.addMaterialSubCategorySmokeTest();
        MaterialSubCategory.editMaterialSubCategorySmokeTest();
        MaterialSubCategory.deleteMaterialSubCategorySmokeTest();

        Material.addMaterialSubCategorySmokeTest();
        Material.editMaterialSubCategorySmokeTest();
        MaterialSubCategory.deleteMaterialSubCategorySmokeTest();

        MaterialState.addMaterialCtaegorySmokeTest();
        MaterialState.editMaterialCtaegorySmokeTest();
        MaterialState.deleteMaterialCtaegorySmokeTest();

        Unit.addUnitSmokeTest();
        Unit.editUnitSmokeTest();
        Unit.deleteUnitSmokeTest();


  /*
Customer NV
 */

        Customer.addcustomerSmokeTest();
        Customer.editcustomerSmokeTest();
        Customer.deletecustomerSmokeTest();

        Project.addprojectSmokeTest();
        Project.editprojectSmokeTest();
        Project.deleteprojectSmokeTest();

        DeliveryCycle.adddeliveryCycleSmokeTest();
        DeliveryCycle.editdeliveryCycleSmokeTest();
        DeliveryCycle.deletedeliveryCycleSmokeTest();

/*
Supplier NV
 */


        Supplier.addsupplierSmokeTest();
        Supplier.editsupplierSmokeTest();
        Supplier.deletesupplierSmokeTest();

        SupplierCategory.addsupplierCategorySmokeTest();
        SupplierCategory.editsupplierCategorySmokeTest();
        SupplierCategory.deletesupplierCategorySmokeTest();



/*
Employee NV
 */

        Designation.adddesignationSmokeTest();
        Designation.editdesignationSmokeTest();
        Designation.deletedesignationSmokeTest();


        Role.addroleSmokeTest();
        Role.editroleSmokeTest();
        Role.deleteroleSmokeTest();

        Employee.addemployeeSmokeTest();
        Employee.editemployeeSmokeTest();
        Employee.deleteemployeeSmokeTest();

        User.viewuserSmokeTest();

        softAssert.assertAll();






    }
}
