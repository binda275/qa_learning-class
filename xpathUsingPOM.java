package launchingMyBrowserForTestNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathUsingPOM {

	

			public WebDriver driver;
			
			private final static By REGISTER = By.xpath("//*[contains(text(),'REGISTER')]");
			private final static By REGISTERLINK = By.xpath("//*[contains(text(), 'Register')]");
			private final static By SUBMITBUTTON = By.xpath("//input[@name='register']");
			
			//contact information
			private final static By FIRST_NAME = By.xpath("//input[@name='firstName']");
			private final static By LAST_NAME = By.xpath("//input[@name='lastName']");
			private final static By PHONE = By.xpath("//input[@name='phone']");
			private final static By EMAIL = By.xpath("//*[@id='userName']");
		
			//mailing address
			private final static By ADDRESS1 = By.xpath("//input[@name='address1']");
			private final static By ADDRESS2 = By.xpath("//input[@name='address2']");
			private final static By CITY = By.xpath("//input[@name='city']");
			private final static By STATE = By.xpath("//input[@name='state']");
			private final static By POSTALCODE = By.xpath("//input[@name='postalCode']");
			
			//selecting country
			private final static By COUNTRY = By.xpath("//select[@name='country']");
			
			//user information
			private final static By USER_EMAIL = By.xpath("//*[@id='email']");
			private final static By USER_PASSWORD = By.xpath("//input[@name='password']");
			private final static By CONFIRM_PASSWORD = By.xpath("//input[@name='confirmPassword']");
			private final static By CLICK_SUBMIT = By.xpath("//input[@name='register']");
			
			//verify signing link
			private final static By SIGN_IN = By.xpath("//a[contains(text(), 'SIGN-IN')]");
			
			//click sign-on
			private final static By USER_NAME = By.xpath("//input[@name='userName']");
			private final static By PASSWORD =By.xpath("//input[@name='password']");
			
			//click submit
			private final static By LOG_IN =By.xpath("//input[@name='login']");
			
			//Flight Type
			private final static By ONEWAY =By.xpath("//input[ @value= 'oneway']");
			private final static By ROUND_TRIP =By.xpath("//input[ @value= 'roundtrip']");
			
			//No.of passengers
			private final static By PASS_COUNT =By.name("passCount");
			
			//Departing From
			private final static By FROM_PORT= By.name("fromPort");
			
			//Going Month And Date
			private final static By FROM_MONTH= By.name("fromMonth");
			private final static By FROM_DAY = By.name("fromDay");
			
			//Arriving In
			private final static By TO_PORT= By.name("toPort");
			
			//Arriving Month And Date
			private final static By TO_MONTH= By.name("toMonth");
			private final static By TO_DAY = By.name("toDay");
			
			//Service Class
			private final static By COACH = By.xpath("//input[@name= 'servClass' and @ value='Coach']");
			private final static By BUSINESS = By.xpath("//input[@name= 'servClass' and @ value='Business']");
			private final static By FIRST = By.xpath("//input[@name= 'servClass' and @ value='First']");
			
			// Selecting AirLine
			private final static By AIRLINE = By.name("airline");
			
			//Find Flights
			private final static By FIND_FLIGHTS = By.xpath("//input[@name='findFlights']");
			
			//Select Depart Flight
			private final static By BLUE_SKIES_AIRLINES_360 = By.xpath("//input[@value='Blue Skies Airlines$360$270$5:03']");
			private final static By BLUE_SKIES_AIRLINES_361 = By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']");
			private final static By PANGEA_AIRLINES_362 = By.xpath("//input[@value='Pangea Airlines$362$274$9:17']");
			private final static By UNIFIED_AIRLINES_363 = By.xpath("//input[@value='Unified Airlines$363$281$11:24']");
			
			//Select Returnt Flight
			private final static By BLUE_SKIES_AIRLINES_630 = By.xpath("//input[@value='Blue Skies Airlines$630$270$12:23']");
			private final static By BLUE_SKIES_AIRLINES_631 = By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']");
			private final static By PANGEA_AIRLINES_632 = By.xpath("//input[@value='Pangea Airlines$632$282$16:37']");
			private final static By UNIFIED_AIRLINES_633 = By.xpath("//input[@value='Unified Airlines$633$303$18:44']");
			
			//Reserve Flights
			private final static By RESERVE_FLIGHTS = By.xpath("//input[@name='reserveFlights']");
			
			//Passengers FirstName
			private final static By PASS_FIRST_0 = By.xpath("//input[@name='passFirst0']"); 
			private final static By PASS_FIRST_1 = By.xpath("//input[@name='passFirst1']"); 
			private final static By PASS_FIRST_2 = By.xpath("//input[@name='passFirst2']"); 
			private final static By PASS_FIRST_3 = By.xpath("//input[@name='passFirst3']"); 
			
			//Passengers LastName
			
			private final static By PASS_LAST_0 = By.xpath("//input[@name='passLast0']"); 
			private final static By PASS_LAST_1 = By.xpath("//input[@name='passLast1']"); 
			private final static By PASS_LAST_2 = By.xpath("//input[@name='passLast2']"); 
			private final static By PASS_LAST_3 = By.xpath("//input[@name='passLast3']"); 
			
			//Selecting Meal
			private final static By PASS_0 = By.xpath("//select[@name='pass.0.meal']"); 
			private final static By PASS_1 = By.xpath("//select[@name='pass.1.meal']"); 
			private final static By PASS_2 = By.xpath("//select[@name='pass.2.meal']"); 
			private final static By PASS_3 = By.xpath("//select[@name='pass.3.meal']"); 
			
			//Selecting Credit Card
			private final static By CREDIT_CARD = By.name("creditCard");
			
			//Credit Card Number
			private final static By CARD_NUMBER = By.xpath("//input[@name='creditnumber']");
			
			//Card Expiration Month And Year
			private final static By MONTH = By.xpath("//select[@name='cc_exp_dt_mn']");
			private final static By YEAR = By.xpath("//select[@name='cc_exp_dt_yr']");
			
			//Card Holder
			private final static By HOLDER_FIRST_NAME = By.name("cc_frst_name");
			private final static By HOLDER_MID_NAME = By.name("cc_mid_name");
			private final static By HOLDER_LAST_NAME = By.name("cc_last_name");
			
			//Ticket Less Travel
			
			private final static By TICKET_LESS = By.xpath("(//input[@name= 'ticketLess'])[1]");
			
			//Clear Billing Address
			
			private final static By C_BILL_ADDRESS1 = By.name("billAddress1");
			private final static By C_BILL_ADDRESS2 = By.name("billAddress2");
			private final static By C_BILL_CITY = By.name("billCity");
			private final static By C_BILL_STATE = By.name("billState");
			private final static By C_BILL_ZIP = By.name("billZip");
			
			
			//Populate Billing Address
			
			private final static By BILL_ADDRESS1 = By.name("billAddress1");
			private final static By BILL_ADDRESS2 = By.name("billAddress2");
			private final static By BILL_CITY = By.name("billCity");
			private final static By BILL_STATE = By.name("billState");
			private final static By BILL_ZIP = By.name("billZip");
			
			//Ticket Less Travel 1
			
			private final static By TICKET_LESS_1 = By.xpath("(//input[@name= 'ticketLess'])[2]");
			
			//Clear Delivery Address
			
			private final static By DELIVERY_ADDRESS1 = By.name("delAddress1");
			private final static By DELIVERY_ADDRESS2 = By.name("delAddress2");
			private final static By DELIVERY_CITY = By.name("delCity");
			private final static By DELIVERY_STATE = By.name("delState");
			private final static By DELIVERY_ZIP = By.name("delZip");
			
			
			//Delivery Address
			
			private final static By C_DELIVERY_ADDRESS1 = By.name("delAddress1");
			private final static By C_DELIVERY_ADDRESS2 = By.name("delAddress2");
			private final static By C_DELIVERY_CITY = By.name("delCity");
			private final static By C_DELIVERY_STATE = By.name("delState");
			private final static By C_DELIVERY_ZIP = By.name("delZip");
			
			//Buy Flights
			
			private final static By BUY_FLIGHTS = By.xpath("//input[@name='buyFlights']");
			
			
			// Click Register Method
			public void clickRegister() {
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElement(REGISTER).click();

			}

			public boolean verifyTheRegisterLink() {
				return driver.findElement(REGISTERLINK).isDisplayed();
			}

		// creating method to verify the Submit button is there or not after
		// clicking 'REGISTER' link
			public boolean verifySubmitButton() {
				clickRegister();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// using isDisplayed method to see the button 
				driver.findElement(SUBMITBUTTON).isDisplayed();
				return true;
			}

			public void verifyContactInformation(String firstName, String lastName, String phone, String email) {
				clickRegister();
				driver.findElement(FIRST_NAME).sendKeys(firstName);
				driver.findElement(LAST_NAME).sendKeys(lastName);
				driver.findElement(PHONE).sendKeys(phone);
				driver.findElement(EMAIL).sendKeys(email);
			}

			public void verifyMailingInformation(String address1, String address2, String city, String state,String postalCode) {
				clickRegister();
				driver.findElement(ADDRESS1).sendKeys(address1);
				driver.findElement(ADDRESS2).sendKeys(address2);
				driver.findElement(CITY).sendKeys(city);
				driver.findElement(STATE).sendKeys(state);
				driver.findElement(POSTALCODE).sendKeys(postalCode);
			}

			public void clickDropdownFromMenu(String countryName) {
				clickRegister();
				Select anyt = new Select(driver.findElement(COUNTRY));
				anyt.selectByVisibleText(countryName);
				// anyt.selectByIndex(1);

			}

			public  void verifyUserInformation(String email, String password, String confirmPassword) {
				clickRegister();
				driver.findElement(USER_EMAIL).sendKeys(email);
				driver.findElement(USER_PASSWORD).sendKeys(password);
				driver.findElement(CONFIRM_PASSWORD).sendKeys(confirmPassword);

			}
			public  void clickSubmit() {
				clickRegister();
				driver.findElement(CLICK_SUBMIT).click();
			}
			
			public void verifyTheSinginLink() {
				driver.findElement(SIGN_IN).isDisplayed();
				}
			
			public void clickSingon(String userName, String password) {
		clickRegister();
			
				driver.findElement(USER_NAME).sendKeys(userName);
				driver.findElement(PASSWORD).sendKeys(password);
			}	

			public void verifyClickSubmit() {
				driver.findElement(LOG_IN).click();
			
			}
			
		public boolean verifyFlightType(String tripType) {
			
				clickRegister();
				
				if(tripType=="oneway")
				{
				 driver.findElement(ONEWAY).click();
				}
				else 
				{
				 driver.findElement(ROUND_TRIP).click();
				}
				return true;
			}

//			public void verifyFlightType(String tripType) {
//				clickRegister();
//				driver.findElement(By.xpath("//input[@name='tripType' and @value= 'oneway']")).click();
//			}

		public void noOfPassengers(String numberofPassangers ) {
			
			Select Passengers = new Select(driver.findElement(PASS_COUNT));
			Passengers.selectByValue(numberofPassangers);
		}

		public void departingFrom(String countryName) {
			Select departingFrom= new Select(driver.findElement(FROM_PORT));
		departingFrom.selectByValue(countryName);
		}

		public void goingMonthAndDate(String month, String date) {
			clickRegister();
			Select goingMonth= new Select(driver.findElement(FROM_MONTH));
			goingMonth.selectByVisibleText(month);
				
			Select goingDate = new Select(driver.findElement(FROM_DAY));
			goingDate .selectByValue(date);
		}


		public void arrivingIn(String countryName) {
			Select arrivingIn = new Select(driver.findElement(TO_PORT));
		    arrivingIn.selectByValue(countryName);	
		}

		public void arrivingMonthAndDate(String month, String date) {
			clickRegister();
			Select arrivingMonth= new Select(driver.findElement(TO_MONTH));
			arrivingMonth.selectByVisibleText(month);

			Select arrivingDate = new Select(driver.findElement(TO_DAY));
			arrivingDate.selectByValue(date);
		}

		public  void serviceClass(String serviceClass) {
			clickRegister();
			if (serviceClass=="Coach") {
				
			driver.findElement(COACH).click();
			}
			
			else if(serviceClass=="Business") {
			driver.findElement(BUSINESS).click();
			}
			else {
			driver.findElement(FIRST).click();
			}
		}
		public void airLine(String airlinesName) {
			Select airline= new Select(driver.findElement(AIRLINE));
			airline.selectByVisibleText(airlinesName);
		}

			public void findFlights(String findFlights) {
			clickRegister();
			driver.findElement(FIND_FLIGHTS).click();//continue
			
			}
			
			public  void selectDepartFlight(String selectDepartFlight) {
				
				if(selectDepartFlight=="Blue Skies Airlines 360") {
				driver.findElement(BLUE_SKIES_AIRLINES_360).click();	
				}
				
				else if(selectDepartFlight=="Blue Skies Airlines 361") {
				driver.findElement(BLUE_SKIES_AIRLINES_361).click();	
				}	
				else if(selectDepartFlight =="Pangaea Airlines 362") {
				driver.findElement(PANGEA_AIRLINES_362).click();
				}
			
			else {
				driver.findElement(UNIFIED_AIRLINES_363).click();
				
			}
				
			}
			
			public  void selectReturntFlight(String selectReturntFlight) {
				if(selectReturntFlight=="Blue Skies Airlines 630") {
				driver.findElement(BLUE_SKIES_AIRLINES_630).click();
				}
				else if(selectReturntFlight=="Blue Skies Airlines 631") {
					driver.findElement(BLUE_SKIES_AIRLINES_631).click();
					}
				
				else if(selectReturntFlight=="Pangea Airlines 632") {
					driver.findElement(PANGEA_AIRLINES_632).click();
					}	
				
				else {
					driver.findElement(UNIFIED_AIRLINES_633).click();
					
				}

		}
			
			public void reserveFlights(String reserveFlights) {
				clickRegister();
			driver.findElement(RESERVE_FLIGHTS).click();
		}
			
			public  void  passengersFirstName(String passFirst0, String passFirst1, String passFirst2, String passFirst3) {//bookaFlight
			clickRegister();
				driver.findElement(PASS_FIRST_0).sendKeys(passFirst0);
				driver.findElement(PASS_FIRST_1).sendKeys(passFirst1);
				driver.findElement(PASS_FIRST_2).sendKeys(passFirst2);
				driver.findElement(PASS_FIRST_3).sendKeys(passFirst3);
			}
			
			public void  passengersLastName(String passLast0, String passLast1, String passLast2, String passLast3) {//bookaFlight
				clickRegister();
				driver.findElement(PASS_LAST_0).sendKeys(passLast0);
				driver.findElement(PASS_LAST_1).sendKeys(passLast1);
				driver.findElement(PASS_LAST_2).sendKeys(passLast2);
				driver.findElement(PASS_LAST_3).sendKeys(passLast3);
			}
			
			public void meal(String meal) {
				
				Select Meal = new Select(driver.findElement(PASS_0));
		        Meal.selectByVisibleText(meal);	
			
		}
			public void meal1(String meal) {
				Select Meal = new Select(driver.findElement(PASS_1));
		        Meal.selectByVisibleText(meal);	
		}
			public void meal2(String meal) {
				Select Meal = new Select(driver.findElement(PASS_2));
		        Meal.selectByVisibleText(meal);	
		}
			public void meal3(String meal) {
				Select Meal = new Select(driver.findElement(PASS_3));
		        Meal.selectByVisibleText(meal);	
		}
			
			public void  creditCard(String cardType) {
				Select creditCard = new Select(driver.findElement(CREDIT_CARD));
				creditCard.selectByVisibleText(cardType);
			}
			public  void  cardNumber(String cardNumber) {
				clickRegister();
				driver.findElement(CARD_NUMBER).sendKeys(cardNumber);
				}
			
			
			public void  expirationMonthAndYear(String month, String year) {
				Select expirationMonth= new Select(driver.findElement(MONTH));
				expirationMonth.selectByVisibleText(month);
				

				Select expirationYear = new Select(driver.findElement(YEAR));
				expirationYear.selectByVisibleText(year);
				
				}
			
			public void  cardHolder(String firstName, String midName, String lastName) {
				clickRegister();
				driver.findElement(HOLDER_FIRST_NAME).sendKeys(firstName);
				driver.findElement(HOLDER_MID_NAME).sendKeys(midName);
				driver.findElement(HOLDER_LAST_NAME).sendKeys(lastName);
			}
			
			public  void ticketLess() {
				
				driver.findElement(TICKET_LESS).click();
			}

			
				public void clearBillingAddress(String billAddress1, String billAddress2, String billCity, String billState, String billZip){	
				
				driver.findElement(C_BILL_ADDRESS1).clear();
				driver.findElement(C_BILL_ADDRESS2).clear();
				driver.findElement(C_BILL_CITY).clear();
				driver.findElement(C_BILL_STATE).clear();
				driver.findElement(C_BILL_ZIP).clear();
				}
			
				public void populateBillingAddress(String billAddress1, String billAddress2, String billCity, String billState, String billZip) {
					clickRegister();
			
					driver.findElement(BILL_ADDRESS1).sendKeys(billAddress1);
					driver.findElement(BILL_ADDRESS2).sendKeys(billAddress2);
					driver.findElement(BILL_CITY).sendKeys(billCity);
					driver.findElement(BILL_STATE).sendKeys(billState);
					driver.findElement(BILL_ZIP).sendKeys(billZip);
				}
				
				
				public void ticketLess1( ) {
					driver.findElement(TICKET_LESS_1).click();
				}
				
				
					public void clearDeliveryAddress( String delAddress1, String delAddress2, String delCity, String delState, String delZip) {
					driver.findElement(C_DELIVERY_ADDRESS1).clear();
					driver.findElement(C_DELIVERY_ADDRESS2).clear();
					driver.findElement(C_DELIVERY_CITY).clear();
					driver.findElement(C_DELIVERY_STATE).clear();
					driver.findElement(C_DELIVERY_ZIP).clear();
							
		}
					
					public void deliveryAddress(String delAddress1,String delAddress2, String delCity, String delState, String delZip) {
						clickRegister();
						driver.findElement(DELIVERY_ADDRESS1).sendKeys(delAddress1);
						driver.findElement(DELIVERY_ADDRESS2).sendKeys(delAddress2);
						driver.findElement(DELIVERY_CITY).sendKeys(delCity);
						driver.findElement(DELIVERY_STATE).sendKeys(delState);
						driver.findElement(DELIVERY_ZIP).sendKeys(delZip);
					}
						
						
					public void buyFlights() {
					driver.findElement(BUY_FLIGHTS).click();	
		






	}

}
