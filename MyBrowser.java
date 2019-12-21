package launchingMyBrowserForTestNG;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyBrowser extends AllMethod {


// running browser 
@BeforeMethod

public void launchBrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://newtours.demoaut.com/");

//To maximize the window size
driver.manage().window().maximize();
//Implictly
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
}

 // verifying the title of the page

@Test(description= "This test case will check the page title.")
public void verifyHomepageTitle() {
String expectedTitle = "Welcome: Mercury Tours";
String actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle);
}

@Test(description= "This test case should check the Register link from the page.")
public void testTheRegisterLink() {
Assert.assertTrue(verifyTheRegisterLink());
}


// verifying the 'SUBMIT' button is there or not ?
@Test(description= "This test case should check the submit button after the register link is clicked.")
public void testSubmitButton() {
clickRegister();
Assert.assertEquals(verifySubmitButton(), true);
}

@Test(description= "This test case should check whether contact information is populated or not .")
public void verifyContactInformation() {
verifyContactInformation("Sushil", "Joshi", "9723469272", "contact@gmail.com");	
Assert.assertTrue(true);
}

@Test(description= "This test case should check whether mailing information is populated or not.")
public void verifyMailingInformation() {
verifyMailingInformation("18600 Dallas Pkwy", "275", "Dallas", "Texas", "75287");
Assert.assertTrue(true);
}

@Test(description="This test case should check whether the country NEPAL is selected or not .")
public void clickDropdownFromMenu() {
clickDropdownFromMenu("NEPAL");
Assert.assertTrue(true);
}

@Test(description= "This test case should check whether user information is populated or not.")
public void verifyUserInformation() {
verifyUserInformation("Binda", "Binda123", "Binda123");
Assert.assertTrue(true);

}

@Test(description= "This test case should check the submit button is clicked.")
public void clickSubmit(){
	Assert.assertTrue(true);
}

@Test(description= "This test case should check the Sing-in link from the page.")
public void verifyTheSinginLink() {
Assert.assertTrue(true);
}

@Test (description="This test case should check whether user information is populated or not.")
public void clickSingon(){
	clickSingon("Binda", "Binda123");	
	Assert.assertTrue(true);
}

@Test (description="This test case should click on the submit button once the username and password is entered.")
public void verifyClickSubmit() {
	Assert.assertTrue(true);
}

@Test (description="This test case should click on the trip type.")
public void verifyFlightType() {
Assert.assertTrue(true);
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
}


@Test(description="This test case should select the pass count.")
public void noOfPassengers() {	
	String expectedNoOfPassengers = "4";
	String actualnoOfPassengers = "4";
	Assert.assertEquals(actualnoOfPassengers, expectedNoOfPassengers);
	}	

@Test(description= "This test case will check the departing port.")
public void verifyDepartingFrom() {
String expectedCountry = "New York";
String actualCountry = "New York";
Assert.assertEquals(actualCountry, expectedCountry);
}

@Test(description= "This test case should check the month and date of departure.")
public void goingMonthAndDate() {
	String expectedMonthAndDate="March, 14";
	String actualMonthAndDate="March, 14";
	Assert.assertEquals(actualMonthAndDate, expectedMonthAndDate);
}	

@Test(description= "This test case will check the arriving port.")
public void arrivingIn() {
String expectedCountry = "Sydney";
String actualCountry = "Sydney";
Assert.assertEquals(actualCountry, expectedCountry);
}

@Test(description= "This test case should check the month and date of departure.")
public void arrivingMonthAndDate() {
	String expectedMonthAndDate="March, 17";
	String actualMonthAndDate="March, 17";
	Assert.assertEquals(actualMonthAndDate, expectedMonthAndDate);
}	
@Test (description="This test case should select the service class.")
public void serviceClass() {	
Assert.assertTrue(true);
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
}

@Test (description="This test case should select the airline.")
public void airLine() {
	String expectedAirLine="Unified Airlines";
	String actualAirLine="Unified Airlines";
	Assert.assertEquals(actualAirLine, expectedAirLine);
}
@Test(description="This test case click on the continue button to find the flight.")
public void findFlights() {
	Assert.assertTrue(true);
	}

@Test(description="This test case should select the departure flight.")
public void selectDepartFlight() {
	Assert.assertTrue(true);
}

@Test(description="This test case should select the return flight.")
public  void selectReturntFlight() {
	Assert.assertTrue(true);	
}

@Test(description="This test case should click on the continue button once the flight is reserved.")
public void reserveFlights() {
	Assert.assertTrue(true);
}

@Test(description="This test case should populate the passengers first name.")
public void passengersFirstName() {
	String expectedPassengersFirstName ="Binda, Sushil, Parin,Alisha";
	String actualPassengersFirstName = "Binda, Sushil, Parin, Alisha";
Assert.assertEquals(actualPassengersFirstName, expectedPassengersFirstName);
}

@Test(description="This test case should populate the passengers last name.")
public void passengersLastName() {
	String expectedPassengersLastName = "Joshi, Paudel, Shrestha, Bhandari";	
	String actualPassengersLastName = "Joshi, Paudel, Shrestha, Bhandari";	
Assert.assertEquals(actualPassengersLastName, expectedPassengersLastName );
}

@Test(description="This test case should populate the passenger's meal.")
public void meal() {
String expectedMeal="Hindu";
String actualMeal="Hindu";
Assert.assertEquals(actualMeal, expectedMeal);
}

@Test(description="This test case should populate the passenger's meal.")
public void meal1() {
String expectedMeal="Low Calorie";
String actualMeal="Low Calorie";
Assert.assertEquals(actualMeal, expectedMeal);
}

@Test(description="This test case should populate the passenger's meal.")
public void meal2() {
String expectedMeal="Low Cholesterol";
String actualMeal="Low Cholesterol";
Assert.assertEquals(actualMeal, expectedMeal);
}

@Test(description="This test case should populate the passenger's meal.")
public void meal3() {
String expectedMeal="Vegetarian";
String actualMeal="Vegetarian";
Assert.assertEquals(actualMeal, expectedMeal);
}

@Test (description="This test case should select the creditCard.")
public void creditCard() {
	String expectedCreditCard="Discover";
	String actualcreditCard="Discover";
	Assert.assertEquals(actualcreditCard, expectedCreditCard);
}

@Test (description="This test case should populate the CreditCard number.")
public void cardNumber() {
	cardNumber("64123789");	
Assert.assertTrue(true);
}

@Test (description="This test case should populate the Expiration month and date.")
public void expirationMonthAndDate() {
	String expectedexpirationMonthAndDate=("11,2010");
	String actualexpirationMonthAndDate= ("11,2010");
	Assert.assertEquals(actualexpirationMonthAndDate, expectedexpirationMonthAndDate);
}

@Test (description="This test case should populate the cardholder name.")
public void  cardHolder() {
	cardHolder("Sushant", "Raj", "Joshi");	
	Assert.assertTrue(true);
	}	

@Test (description="This test case should select the ticketless travel.")
public  void ticketLess() {
	Assert.assertTrue(true);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}


@Test (description="This test case should clear the billing address which is already in there.")
public  void clearBillingAddress() {
	clearBillingAddress();	
	}

@Test (description="This test case should populate the billing address.")
public void populateBillingAddress() {
	populateBillingAddress("2300 Valley View Ln", "1050","Irving", "Texas", "75062");
	Assert.assertTrue(true);
}


@Test (description="This test case should select the same as billing address.")
public void ticketLess1( ) {
	Assert.assertTrue(true);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

@Test (description="This test case should clear the delivery address which is already in there.")

public  void clearDeliveryAddress( ) {
	clearDeliveryAddress();
}

@Test (description="This test case should populate the delivery address.")
public void deliveryAddress() {
	deliveryAddress("2300 Valley View Ln", "1050","Irving", "Texas", "75062");
	Assert.assertTrue(true);
}

@Test (description="This test case should click and buy flights.")
public void buyFlights() {
	Assert.assertTrue(true);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}


// closing browser after each test case run
@AfterMethod
public void closeTheBrowser() {
driver.close();
}

}



