package launchingMyBrowserForTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AllMethod {

	public WebDriver driver;

// Click Register Method
	public void clickRegister() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();

	}

	public boolean verifyTheRegisterLink() {
		return driver.findElement(By.xpath("//*[contains(text(), 'Register')]")).isDisplayed();
	}

// creating method to verify the Submit button is there or not after
// clicking 'REGISTER' link
	public boolean verifySubmitButton() {
		clickRegister();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
// using isDisplayed method to see the button 
		driver.findElement(By.xpath("//input[@name='register']")).isDisplayed();
		return true;
	}

	public void verifyContactInformation(String firstName, String lastName, String phone, String email) {
		clickRegister();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(email);
	}

	public void verifyMailingInformation(String address1, String address2, String city, String state,String postalCode) {
		clickRegister();
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address1);
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(address2);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalCode);
	}

	public void clickDropdownFromMenu(String countryName) {
		clickRegister();
		Select anyt = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		anyt.selectByVisibleText(countryName);
		// anyt.selectByIndex(1);

	}
	


	//This method will click SignIn buttton 
	public void clickSigIn(){
	driver.findElement(By.xpath("//input[@name='register']")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public  void verifyUserInformation(String email, String password, String confirmPassword) {
		clickRegister();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmPassword);

	}
	public  void clickSubmit() {
		clickRegister();
		driver.findElement(By.xpath("//input[@name='register']")).click();
	}
	
	public void verifyTheSinginLink() {
		driver.findElement(By.xpath("//a[contains(text(), 'SIGN-IN')]")).isDisplayed();
		}
	
	public void clickSingon(String userName, String password) {
clickRegister();
	
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}	

	public void verifyClickSubmit() {
		driver.findElement(By.xpath("//input[@name='login']")).click();
	
	}
	
public boolean verifyFlightType(String tripType) {
	
		clickRegister();
		
		if(tripType=="oneway")
		{
		 driver.findElement(By.xpath("//input[ @value= 'oneway']")).click();
		}
		else 
		{
		 driver.findElement(By.xpath("//input[ @value= 'roundtrip']")).click();
		}
		return true;
	}

//	public void verifyFlightType(String tripType) {
//		clickRegister();
//		driver.findElement(By.xpath("//input[@name='tripType' and @value= 'oneway']")).click();
//	}

public void noOfPassengers(String numberofPassangers ) {
	
	Select Passengers = new Select(driver.findElement(By.name("passCount")));
	Passengers.selectByValue(numberofPassangers);
}

public void departingFrom(String countryName) {
	Select departingFrom= new Select(driver.findElement(By.name("fromPort")));
departingFrom.selectByValue(countryName);
}

public void goingMonthAndDate(String month, String date) {
	clickRegister();
	Select goingMonth= new Select(driver.findElement(By.name("fromMonth")));
	goingMonth.selectByVisibleText(month);
		
	Select goingDate = new Select(driver.findElement(By.name("fromDay")));
	goingDate .selectByValue(date);
}


public void arrivingIn(String countryName) {
	Select arrivingIn = new Select(driver.findElement(By.name("toPort")));
    arrivingIn.selectByValue(countryName);	
}

public void arrivingMonthAndDate(String month, String date) {
	clickRegister();
	Select arrivingMonth= new Select(driver.findElement(By.name("toMonth")));
	arrivingMonth.selectByVisibleText(month);

	Select arrivingDate = new Select(driver.findElement(By.name("toDay")));
	arrivingDate.selectByValue(date);
}

public  void serviceClass(String serviceClass) {
	clickRegister();
	if (serviceClass=="Coach") {
		
	driver.findElement(By.xpath("//input[@name= 'servClass' and @ value='Coach']")).click();
	}
	
	else if(serviceClass=="Business") {
	driver.findElement(By.xpath("//input[@name= 'servClass' and @ value='Business']")).click();
	}
	else {
	driver.findElement(By.xpath("//input[@name= 'servClass' and @ value='First']")).click();
	}
}
public void airLine(String airlinesName) {
	Select airline= new Select(driver.findElement(By.name("airline")));
	airline.selectByVisibleText(airlinesName);
}

	public void findFlights(String findFlights) {
	clickRegister();
	driver.findElement(By.xpath("//input[@name='findFlights']")).click();//continue
	
	}
	
	public  void selectDepartFlight(String selectDepartFlight) {
		
		if(selectDepartFlight=="Blue Skies Airlines 360") {
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$360$270$5:03']")).click();	
		}
		
		else if(selectDepartFlight=="Blue Skies Airlines 361") {
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();	
		}	
		else if(selectDepartFlight =="Pangaea Airlines 362") {
		driver.findElement(By.xpath("//input[@value='Pangea Airlines$362$274$9:17']")).click();
		}
	
	else {
		driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();
		
	}
	}
	public  void selectReturntFlight(String selectReturntFlight) {
		if(selectReturntFlight=="Blue Skies Airlines 630") {
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$630$270$12:23']")).click();
		}
		else if(selectReturntFlight=="Blue Skies Airlines 631") {
			driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
			}
		
		else if(selectReturntFlight=="Pangea Airlines 632") {
			driver.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']")).click();
			}	
		
		else {
			driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']")).click();
			
		}

}
	
	public void reserveFlights(String reserveFlights) {
		clickRegister();
	driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
}
	
	public  void  passengersFirstName(String passFirst0, String passFirst1, String passFirst2, String passFirst3) {//bookaFlight

		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys(passFirst0);
		driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys(passFirst1);
		driver.findElement(By.xpath("//input[@name='passFirst2']")).sendKeys(passFirst2);
		driver.findElement(By.xpath("//input[@name='passFirst3']")).sendKeys(passFirst3);
	}
	
	public void  passengersLastName(String passLast0, String passLast1, String passLast2, String passLast3) {//bookaFlight
		clickRegister();
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys(passLast0);
		driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys(passLast1);
		driver.findElement(By.xpath("//input[@name='passLast2']")).sendKeys(passLast2);
		driver.findElement(By.xpath("//input[@name='passLast3']")).sendKeys(passLast3);
	}
	
	public void meal(String meal) {
		
		Select Meal = new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
        Meal.selectByVisibleText(meal);	
	
}
	public void meal1(String meal) {
		Select Meal = new Select(driver.findElement(By.xpath("//select[@name='pass.1.meal']")));
        Meal.selectByVisibleText(meal);	
}
	public void meal2(String meal) {
		Select Meal = new Select(driver.findElement(By.xpath("//select[@name='pass.2.meal']")));
        Meal.selectByVisibleText(meal);	
}
	public void meal3(String meal) {
		Select Meal = new Select(driver.findElement(By.xpath("//select[@name='pass.3.meal']")));
        Meal.selectByVisibleText(meal);	
}
	
	public void  creditCard(String cardType) {
		Select creditCard = new Select(driver.findElement(By.name("creditCard")));
		creditCard.selectByVisibleText(cardType);
	}
	public  void  cardNumber(String cardNumber) {
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys(cardNumber);
		}
	
	
	public void  Expiration(String month, String year) {
		Select expirationMonth= new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")));
		expirationMonth.selectByVisibleText(month);
		

		Select expirationYear = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']")));
		expirationYear.selectByVisibleText(year);
		
		}
	
	public void  cardHolder(String firstName, String midName, String lastName) {
		clickRegister();
		driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys(midName);
		driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys(lastName);
	}
	
	public  void ticketLess() {
		
		driver.findElement(By.xpath("(//input[@name= 'ticketLess'])[1]")).click();
	}

	
		public  void clearBillingAddress(String billAddress1, String billAddress2, String billCity, String billState, String billZip){	
		
		driver.findElement(By.xpath("//input[@name='billAddress1']")).clear();
		driver.findElement(By.xpath("//input[@name='billAddress2']")).clear();
		driver.findElement(By.xpath("//input[@name='billCity']")).clear();
		driver.findElement(By.xpath("//input[@name='billState']")).clear();
		driver.findElement(By.xpath("//input[@name='billZip']")).clear();
		}
	
		public void populateBillingAddress(String billAddress1, String billAddress2, String billCity, String billState, String billZip) {
			clickRegister();
	
			driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys(billAddress1);
			driver.findElement(By.xpath("//input[@name='billAddress2']")).sendKeys(billAddress2);
			driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys(billCity);
			driver.findElement(By.xpath("//input[@name='billState']")).sendKeys(billState);
			driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys(billZip);
		}
		
		
		public void ticketLess1( ) {
			driver.findElement(By.xpath("(//input[@name= 'ticketLess'])[2]")).click();
		}
		
		
			public void clearDeliveryAddress( String delAddress1, String delAddress2, String delCity, String delState, String delZip) {
			driver.findElement(By.xpath("//input[@name='delAddress1']")).clear();
			driver.findElement(By.xpath("//input[@name='delAddress2']")).clear();
			driver.findElement(By.xpath("//input[@name='delCity']")).clear();
			driver.findElement(By.xpath("//input[@name='delState']")).clear();
			driver.findElement(By.xpath("//input[@name='delZip']")).clear();
					
}
			
			public void deliveryAddress(String delAddress1,String delAddress2, String delCity, String delState, String delZip) {
				clickRegister();
				driver.findElement(By.xpath("//input[@name='delAddress1']")).sendKeys(delAddress1);
				driver.findElement(By.xpath("//input[@name='delAddress2']")).sendKeys(delAddress2);
				driver.findElement(By.xpath("//input[@name='delCity']")).sendKeys(delCity);
				driver.findElement(By.xpath("//input[@name='delState']")).sendKeys(delState);
				driver.findElement(By.xpath("//input[@name='delZip']")).sendKeys(delZip);
			}
				
				
			public void buyFlights() {
			driver.findElement(By.xpath("//input[@name='buyFlights']")).click();	
}
}




