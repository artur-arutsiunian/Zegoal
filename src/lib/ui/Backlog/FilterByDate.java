package lib.ui.Backlog;

import io.appium.java_client.AppiumDriver;
import lib.ui.MainPageObject;
import org.openqa.selenium.By;

public class FilterByDate extends MainPageObject {

    public FilterByDate(AppiumDriver driver) {
        super(driver);
    }

    private final static String
            BACKLOG_TAB = "//android.widget.LinearLayout[@content-desc=\"Backlog\"]",
            FILTER__IN_BACKLOG = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]",
            CHOOSE_FIRST_DATE = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]",
            CLICK_ON_THE_FIRST_DATE_IN_CALENDAR = "//android.view.View[@content-desc=\"03 February 2022\"]",
            CLICK_OK_BUTTON_AFTER_CHOOSE_FIRST_DATE = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]",
            CHOOSE_SECOND_DATE = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]",
            CLICK_ON_THE_SECOND_DATE_IN_CALENDAR = "//android.view.View[@content-desc=\"08 February 2022\"]",
            CLICK_OK_BUTTON_AFTER_CHOOSE_SECOND_DATE = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]",
            CLICK_ON_CHECK_BUTTON = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]",
            APPLIED_FILTER_EXIST_ON_THE_PAGE = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]";

    public void moveToBacklogFilter() throws InterruptedException {

        this.waitForElementAndClick(
                By.xpath(BACKLOG_TAB),
                "Can't click 'Backlog' tab",
                5
        );

        this.waitForElementAndClick(
                By.xpath(FILTER__IN_BACKLOG),
                "Can't click 'Filter'",
                5
        );

        this.waitForElementAndClick(
                By.xpath(CHOOSE_FIRST_DATE),
                "Can't click 'First date'",
                5
        );

        this.waitForElementAndClick(
                By.xpath(CLICK_ON_THE_FIRST_DATE_IN_CALENDAR),
                "Can't click first date in calendar",
                5
        );

        this.waitForElementAndClick(
                By.xpath(CLICK_OK_BUTTON_AFTER_CHOOSE_FIRST_DATE),
                "Can't click 'OK' button after first date in calendar",
                5
        );

        this.waitForElementAndClick(
                By.xpath(CHOOSE_SECOND_DATE),
                "Can't click 'Second date'",
                5
        );

        this.waitForElementAndClick(
                By.xpath(CLICK_ON_THE_SECOND_DATE_IN_CALENDAR),
                "Can't click second date in calendar",
                5
        );

        this.waitForElementAndClick(
                By.xpath(CLICK_OK_BUTTON_AFTER_CHOOSE_SECOND_DATE),
                "Can't click 'OK' button after second date in calendar",
                5
        );

        this.waitForElementAndClick(
                By.xpath(CLICK_ON_CHECK_BUTTON),
                "Can't click 'Check' button",
                5
        );

        this.waitForElementPresent(
                By.xpath(APPLIED_FILTER_EXIST_ON_THE_PAGE),
                "Can't find applied filter on the last step",
                5
        );
    }
}
