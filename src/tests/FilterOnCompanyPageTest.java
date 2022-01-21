package tests;

import lib.CoreTestCase;
import lib.ui.CrmPageOject;
import lib.ui.LoginPageObject;
import org.junit.Test;

public class FilterOnCompanyPageTest extends CoreTestCase {

    @Test
    public void testWorkFilterOnCrmCompanyPage() throws InterruptedException{
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.processLoginOrganizationAndUser();

        CrmPageOject CrmPageObject = new CrmPageOject(driver);
        CrmPageObject.moveToCompanyInCrm();
    }
}
