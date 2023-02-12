package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.library.page.HomePage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {

        HomePage homePage;


        @BeforeMethod
        public void inIt() {
            homePage = new HomePage();
        }

        @Test
        public void test(){

            System.out.println(driver);
            driver.switchTo().frame("gdpr-consent-notice");
            homePage.clickOnAccept();
            driver.switchTo().defaultContent();
            homePage.enterJobTitle("software tester");
            homePage.enterLocaion("ha3 9rf");
            homePage.selectDistance("1");
            homePage.clickOnMoreoptions();
            homePage.enterMinSalary("30000");
            homePage.enterMaxSalary("50000");
            homePage.selectsalaryTypeDropDown(1);
            homePage.selectJobTypeDropDown(Integer.parseInt("1"));
            homePage.clickOnSearchButton();

        }
    }

