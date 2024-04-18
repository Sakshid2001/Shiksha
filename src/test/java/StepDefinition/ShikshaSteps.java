package StepDefinition;

import java.awt.AWTException;  
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertFalse;


import DriverSetup.SetupDriver;

import Page.ShikshaPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShikshaSteps {
	static WebDriver driver;
	ShikshaPage sp;
	
	/*=================================================== Question=================================================== */


@Given("I am on the Shiksha homepage")
public void i_am_on_the_shiksha_homepage() throws InterruptedException, AWTException {
	driver=SetupDriver.chromedriver();
    sp = new ShikshaPage(driver);

      sp.background();
}

@When("I click on the course")
public void i_click_on_the_course() throws InterruptedException, AWTException {
    sp = new ShikshaPage(driver);

    sp.course();
}

@When("I navigate to the Q&A section for that course")
public void i_navigate_to_the_q_a_section_for_that_course() {
    sp = new ShikshaPage(driver);

   sp.navigateQA();
}

@When("I click on ask question button")
public void i_click_on_ask_question_button() throws InterruptedException  {
    sp = new ShikshaPage(driver);

   sp.clickQbutton();
}

@When("I type my question in the provided field")
public void i_type_my_question_in_the_provided_field(DataTable dataTable) throws InterruptedException {
    sp = new ShikshaPage(driver);

	 List<String> queries = dataTable.asList(String.class);
     for (String query : queries) {
        sp.typeQuestion(query);
     }
}

@When("I click on send button")
public void i_click_on_send_button() throws InterruptedException {
    sp = new ShikshaPage(driver);
   
   sp.clickSend();
}

@Then("I should get the answer")
public void i_should_get_the_answer() {
	String actual = driver.getCurrentUrl();
	String expected = "https://www.shiksha.com/tags/mba-tdp-422";
	Assert.assertEquals(expected, actual);
	
}
@AfterStep
public static void takeScreendown(Scenario scenerio) {
	   TakesScreenshot ts= (TakesScreenshot) driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}
/*=================================================== Answer=================================================== */
@Given("I am on the Q&A section")
public void i_am_on_the_q_a_section() throws InterruptedException, AWTException {
	driver=SetupDriver.chromedriver();
    sp = new ShikshaPage(driver);
    sp.background();
    
}



@When("I select a question to answer")
public void i_select_a_question_to_answer() throws AWTException, InterruptedException {
    sp = new ShikshaPage(driver);
sp.answer();
}



@When("^I write my (.*)")
public void i_write_my(String answer) throws InterruptedException {
    sp = new ShikshaPage(driver);

    sp.enterAnswer(answer);
}

@When("I post the answer")
public void i_post_the_answer() throws InterruptedException {
	  sp = new ShikshaPage(driver);
   sp.clickPost();
}
@Then("the answer should be posted")
public void the_answer_should_be_posted() {
	String actual = driver.getCurrentUrl();
	String expected = "https://www.shiksha.com/tags/mba-tdp-422";
	Assert.assertEquals(expected, actual);
}

@AfterStep
public static void takeScreendown1(Scenario scenerio) {
	   TakesScreenshot ts= (TakesScreenshot) driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}

/*=================================================== Education=================================================== */

@Given("I am on the education preferences page")
public void i_am_on_the_education_preferences_page() throws InterruptedException, AWTException {
	driver=SetupDriver.chromedriver();
    sp = new ShikshaPage(driver);
    sp.background();
    sp.userButton();
}


@When("I click on the Create New option")
public void i_click_on_the_create_new_option() {
   sp.newButton();
}

@And("I select the course level")
public void i_select_the_course_level() {
   sp.courseLevel();
}

@And("I select the mode of study")
public void i_select_the_mode_of_study() throws InterruptedException {
  sp.modeStudy();
}

@And("I select the stream")
public void i_select_the_stream() throws InterruptedException {
    sp.stream();
}

@And("I select the course name")
public void i_select_the_course_name() throws AWTException, InterruptedException {
   sp.courseName();
}

@And("I select the year of admission")
public void i_select_the_year_of_admission( DataTable dataTable) throws InterruptedException {
	 sp = new ShikshaPage(driver);

	 List<String> year = dataTable.asList(String.class);
	for (String year1 : year) {
        sp.year(year1);
	}
}
	

@And("I select the city")
public void i_select_the_city(DataTable dataTable) throws InterruptedException {
	 sp = new ShikshaPage(driver);

	 List<String> cities = dataTable.asList(String.class);
	for (String city : cities) {
        sp.city(city);
	}
}

@And("I select the budget")
public void i_select_the_budget() {
    sp.budget();
}

@And("I click on save button")
public void i_click_on_save_button() {
   sp.save();
}

@Then("The details are saved successfully")
public void the_details_are_saved_successfully() {
	String actual = driver.getCurrentUrl();
	String expected = "https://www.shiksha.com/userprofile/edit";
	Assert.assertEquals(expected, actual);
}

@AfterStep
public static void takeScreendown11(Scenario scenerio) {
	   TakesScreenshot ts= (TakesScreenshot) driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}
/*=================================================== Exam =================================================== */



@Given("I am on the exam preferences page")
public void i_am_on_the_exam_preferences_page() throws InterruptedException, AWTException {
	driver=SetupDriver.chromedriver();
    sp = new ShikshaPage(driver);
    sp.background();
    sp.userButton();
    sp.exam();
}

@When("I click on the Create New option on exam page")
public void i_click_on_the_create_new_option_on_exam_page() {
	   sp.newButton();
}

@And("I select the exam name")
public void i_select_the_exam_name() {
  sp.examName();
}

@When("I select the exam group")
public void i_select_the_exam_group() {
   sp.examGroup();
}

@And("I select the score type")
public void i_select_the_score_type() {
   sp.scoreType();
}

@When("I enter the score {string}")
public void i_enter_the_score(String score) {
	sp = new ShikshaPage(driver);
     sp.score();
   sp.scoreOne(score);
}

@When("I select the score status")
public void i_select_the_score_status() {
sp.scoreStatus();
}

@When("I select the category")
public void i_select_the_category() {
  sp.category();
}

@When("I select the domicile")
public void i_select_the_domicile() {
   sp.domicile();
   
}

@When("I click on the save button")
public void i_click_on_the_save_button() {
   sp.clickSave();
}

@Then("details are saved")
public void details_are_saved() {
	String actual = driver.getCurrentUrl();
	String expected = "https://www.shiksha.com/userprofile/edit";
	Assert.assertEquals(expected, actual);

}


/*=================================================== Defect =================================================== */


@Given("I am on the shiksha homepage")
public void i_am_on_the_shiksha_homepage1() throws InterruptedException, AWTException {
	driver=SetupDriver.chromedriver();
    sp = new ShikshaPage(driver);
    sp.background();
}

@When("I click on notification bell option")
public void i_click_on_notification_bell_option() {
   sp.clickBell();
}

@When("I click on mark as read")
public void i_click_on_mark_as_read() {
   sp.read();
}

@Then("the notification should be marked as read.")
public void the_notification_should_be_marked_as_read() {
	 boolean isRead = sp.isNotificationMarkedAsRead();
   // Expected outcome is that the notification should be marked as read
 boolean expectedState = true;

// Assert that the actual state matches the expected state
 if (isRead != expectedState) {
	    // If the notification is not marked as read, fail the test case
	 throw new AssertionError("Test failed: Notification was not marked as read after clicking 'mark as read'.");
	 } else {
	        
	        System.out.println("Test passed: Notification is marked as read.");
	    }
}
}