package tests;

import lib.CoreTestCase;
import lib.ui.LoginPageObject;
import lib.ui.ScheduleTasksPageObject;
import org.junit.Test;

public class ChooseAndCompleteTaskTest extends CoreTestCase {

    @Test
    public void testCompleteTask() throws InterruptedException{
        LoginPageObject LoginPageObject  = new LoginPageObject(driver);
        LoginPageObject.processLoginOrganizationAndUser();

        ScheduleTasksPageObject ScheduleTasksPageObject = new ScheduleTasksPageObject(driver);
        ScheduleTasksPageObject.moveToTask();
    }
}
