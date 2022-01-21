package tests;

import lib.CoreTestCase;
import lib.ui.CrmCompanyPageObject;
import lib.ui.LoginPageObject;
import org.junit.Test;

public class FilterOnCompanyPageTest extends CoreTestCase {

    @Test
    public void testWorkFilterOnCrmCompanyPage() throws InterruptedException{
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.processLoginOrganizationAndUser();

        CrmCompanyPageObject CrmPageObject = new CrmCompanyPageObject(driver);
        CrmPageObject.moveToCompanyInCrm();
    }
}
