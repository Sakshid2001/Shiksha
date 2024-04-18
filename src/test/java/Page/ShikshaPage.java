package Page;

import java.awt.AWTException; 
 
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ShikshaPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//a[text()=\"Login\"]") WebElement login;
	@FindBy(xpath="//input[@placeholder=\"Email address\"]") WebElement email;
	@FindBy(xpath="//input[@class=\"input password\"]") WebElement password;
@FindBy(xpath="//button[text()=\"Login\"]") WebElement submit;
@FindBy(xpath="//a[@title=\"MBA\"]") WebElement mbaElement;
@FindBy(linkText="Q&A") WebElement qa;
@FindBy(css="#tagAskNow") WebElement askQuestion;
@FindBy(xpath="//iframe[@name=\"chatbotIframe\"]") WebElement iframeElement;
@FindBy(css="input[placeholder=\"Write your query on colleges, exam here...\"]") WebElement textarea;
@FindBy(xpath="//div[@class=\"input-box\"]/child::span") WebElement send;

//@FindBy(xpath="//span[@id=\"customDenyBtn\"]") WebElement popup;
@FindBy(xpath="(//ul[@class=\"nav-discussion\"]/li[3])[6]") WebElement answer;

@FindBy(xpath="//iframe[@class=\"ana-posting-iframe\"]") WebElement iframe;
@FindBy(xpath="//iframe[@id=\"shiksha-editor--ana-posting_ifr\"]") WebElement innerIframe;
@FindBy(id="tinymce") WebElement typeAnswer;
@FindBy(xpath="//button[@class=\"ff4b\"]") WebElement post;

@FindBy(xpath="//strong[text()=\"Sakshi\"]") WebElement userButton;

@FindBy(xpath="//a[text()=\"Profile\"]") WebElement Profile;
@FindBy(xpath="//button[@class=\"custom-button custom-button--link _0588\"]") WebElement newButton;
@FindBy(xpath="//span[text()=\"PG\"]") WebElement courseLevel;
@FindBy(xpath="(//div[@class=\"text-field\"]/input[1])[1]") WebElement study;
@FindBy(xpath="(//ul[@class=\"_69be _0bd8\"]/li[1])[1]") WebElement fullTime;
@FindBy(xpath="//div[@class=\"_7010\"]/button[2]") WebElement saveOne;
@FindBy(xpath="//div[@class=\"FieldWrapper\"]") WebElement stream;
@FindBy(xpath="//ul[@class=\"_69be\"]/li[1]") WebElement streamOption;
@FindBy(xpath="(//div[@class=\"FieldWrapper\"])[2]") WebElement courseName;
@FindBy(xpath="(//ul[@class=\"_69be\"]/li)[1]") WebElement courseOption; 
@FindBy(xpath="//div[@class=\"_7010\"]/button[2]")WebElement saveTwo;


@FindBy(xpath="//button[text()=\"+Add\"]") WebElement add;
@FindBy(xpath="(//div[@class=\"FieldWrapper\"])[1]") WebElement year;
@FindBy(xpath="//input[@placeholder=\"Search\"]") WebElement searchOne;
@FindBy(xpath="//span[text()=\"2024\"]") WebElement selectYear;



@FindBy(xpath="(//div[@class=\"FieldWrapper\"]/div/input)[2]") WebElement city;
@FindBy(xpath="//input[@placeholder=\"Search\"]") WebElement searchTwo;
@FindBy(xpath="//span[text()=\"Pune\"]") WebElement selectCity;
@FindBy(xpath="(//button[text()=\"Save\"])[1]") WebElement saveThree;

@FindBy(xpath="(//div[@class=\"FieldWrapper\"])[2]") WebElement budget;
@FindBy(xpath="//span[text()=\"less than 1 Lakh\"]") WebElement selectBudget;

@FindBy(xpath="//button[text()=\"Save\"]") WebElement saveFour;
   

@FindBy(xpath="//div[text()=\"Exam\"]") WebElement exam;
@FindBy(xpath="(//div[@class=\"FieldWrapper\"]/div/input)[1]") WebElement examName;
@FindBy(xpath="//span[text()=\"JEE AME\"]") WebElement selectExam;
@FindBy(xpath="(//div[@class=\"FieldWrapper\"]/div/input)[2]") WebElement examGroup;
@FindBy(xpath="//span[text()=\"BE/BTech\"]") WebElement selectGroup;
@FindBy(xpath="(//div[@class=\"FieldWrapper\"]/div/input)[3]") WebElement scoreType;
@FindBy(xpath="//span[text()=\"percentile\"]") WebElement selectType;
@FindBy(xpath="//div[@class=\"FieldWrapper _2225\"]") WebElement score;
@FindBy(xpath="(//div[@class=\"text-field\"]/input)[4]") WebElement inputScore;


@FindBy(xpath="(//div[@class=\"FieldWrapper\"]/div)[7]") WebElement scoreStatus;
@FindBy(xpath="//span[text()=\"Actual\"]") WebElement selectStatus;



@FindBy(xpath="(//div[@class=\"text-field\"]/input)[6]") WebElement category;
@FindBy(xpath="//span[text()=\"General\"]") WebElement selectCategory;

@FindBy(xpath="(//div[@class=\"text-field\"]/input)[7]") WebElement domicile;
@FindBy(xpath="//span[text()=\"Andhra Pradesh\"]") WebElement selectDomicile;
@FindBy(xpath="//button[text()=\"Save\"]") WebElement saveButton;



@FindBy(xpath="//a[text()=\"Contact Us\"]") WebElement contactUs;
@FindBy(xpath="//textarea[@placeholder=\"Type your Question...\"]") WebElement typeArea;
@FindBy(xpath="//textarea[@type=\"text\"]") WebElement textArea;
@FindBy(id="lnk-add-more") WebElement addDetail;
@FindBy(css="#more-input-posting") WebElement typeDetail;
@FindBy(xpath="(//a[@class=\"prime-btn\"])[1]")WebElement clickNext;
@FindBy(xpath="(//a[@class=\"prime-btn\"])[2]") WebElement postTwo;

@FindBy(xpath="//div[@class=\"pwadesktop-srchbox\"]") WebElement search;
@FindBy(xpath="//button[@type=\"submit\"]") WebElement button;

@FindBy(xpath="//input[@id=\"searchInput\"]") WebElement enter;

@FindBy(id="BellIconForNotificationPannel") WebElement Bell;
@FindBy(xpath="//span[text()=\"Mark as read\"]") WebElement read;

	public ShikshaPage(WebDriver driver) {
    	this.driver=driver;
    	this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     PageFactory.initElements(driver, this);
    }
	public void background() throws InterruptedException, AWTException {
		login.click();
		Thread.sleep(2000);
		email.sendKeys("sakshiamitdeshpande@gmail.com");
		
		Robot robot = new Robot();
		int xCoordinate = 500;
        int yCoordinate = 500;
        robot.mouseMove(xCoordinate, yCoordinate);
          Thread.sleep(2000);
		password.sendKeys("Sakshid2001@");
		Thread.sleep(1000);
		submit.click();
		
	}
	public void course() throws InterruptedException, AWTException {
	
		
		 wait.until(ExpectedConditions.visibilityOf(mbaElement));
		 
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mbaElement);
        mbaElement.click();
      

		
	}
	public void navigateQA() {
        wait.until(ExpectedConditions.visibilityOf(qa));

		qa.click();
		
	}
	public void clickQbutton() throws InterruptedException  {
        wait.until(ExpectedConditions.elementToBeClickable(askQuestion));

		askQuestion.click();
		
	}
	
	public void typeQuestion(String query) throws InterruptedException {
		
		Thread.sleep(2000);
		 driver.switchTo().frame(iframeElement);
		 textarea.sendKeys(query);
	
	}
	public void clickSend() throws InterruptedException {
		
		Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.click(send).perform();
		send.click();
		driver.switchTo().defaultContent();
	}
	
	public void answer() throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		 
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mbaElement);
        mbaElement.click();
    	qa.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1900)");
	Thread.sleep(1000);
		answer.click();
		 Thread.sleep(1000);
	}
	public void enterAnswer(String answer) throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		 driver.switchTo().frame(innerIframe);
		Thread.sleep(1000);
		typeAnswer.sendKeys(answer);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
	}
	public void clickPost() throws InterruptedException {
     Thread.sleep(1000);
     driver.switchTo().frame(iframe);
	  Thread.sleep(1000);
	  post.click();
		Thread.sleep(1000);
		driver.navigate().back();
	}
	public void userButton() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		userButton.click();
		Thread.sleep(2000);
		Profile.click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);


       Thread.sleep(1000);
	}
	public void newButton() {
		newButton.click();
	}
	public void courseLevel() {
		
		courseLevel.click();
	}
	public void modeStudy() throws InterruptedException {
		Thread.sleep(2000);
		study.click();
		Thread.sleep(1000);
		fullTime.click();
		saveOne.click();
		
	}
	public void stream() throws InterruptedException {
		Thread.sleep(2000);
		stream.click();
		streamOption.click();
		 
	    }
	
	public void courseName() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		courseName.click();
		
		courseOption.click();
		Thread.sleep(1000);
		saveTwo.click();
		Thread.sleep(1000);
		 
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", add);
        add.click();
        }
	public void year(String yearOne) throws InterruptedException {
		year.click();
		Thread.sleep(1000);
		searchOne.click();
		
		Thread.sleep(1000);
		selectYear.click();

	}
	public void city(String enterCity) throws InterruptedException {
		
		city.click() ;
		Thread.sleep(2000);
		searchTwo.sendKeys(enterCity);
		Thread.sleep(1000);
		selectCity.click();
		saveThree.click();
		Thread.sleep(2000);
		
		
	}
	public void budget() {
		budget.click();
		selectBudget.click();
		 
	}
	public void save() {
		saveFour.click();

	}
	
	
	public void exam() {
		exam.click();
	}
	
	public void examName() {
		examName.click();
		selectExam.click();
	}
	public void examGroup() {
		examGroup.click();
		selectGroup.click();
	}
	public void scoreType() {
		
		scoreType.click();
		selectType.click();
	}
	public void score() {
		score.click();
	}
	public void scoreOne(String score) {
		inputScore.sendKeys(score);
	}
	public void category() {
		category.click();
		selectCategory.click();
		
	}
	public void scoreStatus() {
		scoreStatus.click();
		selectStatus.click();
	}
	public void domicile() {
		 domicile.click();
		 selectDomicile.click();
	}
	public void clickSave() {
           saveButton.click();		
	}

	public void clickBell() {
        Bell.click();		
	}
	public void read() {
		read.click();
	}
	public boolean isNotificationMarkedAsRead() {
        return Bell.getAttribute("class").contains("read");

	}
	
	
}
