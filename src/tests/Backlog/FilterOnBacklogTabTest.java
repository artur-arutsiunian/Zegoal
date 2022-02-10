package tests.Backlog;

import lib.CoreTestCase;
import lib.ui.Backlog.FilterByDate;
import lib.ui.LoginPageObject;
import org.junit.Test;

public class FilterOnBacklogTabTest extends CoreTestCase {

    @Test
    public void testWorkFilterOnBacklogTab() throws InterruptedException{
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.processLoginOrganizationAndUser();

        FilterByDate FilterByDate = new FilterByDate(driver);
        FilterByDate.moveToBacklogFilter();
    }
}
