package design;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingEmployeeInfo {
        EmployeeInfo employeeInfo = new EmployeeInfo("Poppins", "Mary", 'F', 50000.0, "Secretary", "1/22/1990");
        @Test
        public void testSalaryCalculation() {
            double expectedResult = 12500.0;
            String date = employeeInfo.getJoiningDate();
            double actualResult = employeeInfo.calculateEmployeePension(date);
            Assert.assertEquals(actualResult, expectedResult);
        }
        @Test
        public void testGenerateId() {
            String expectedResult = "PNT001";
            String actualResult = employeeInfo.getEmpId();
            Assert.assertEquals(actualResult, expectedResult);
        }
}

