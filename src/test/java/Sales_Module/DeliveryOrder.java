package Sales_Module;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Singleton.SingletonDriver;
import helperFunction.HelperFunction;

public class DeliveryOrder extends HelperFunction
{

	String statusDraft="Draft";
	String statusIssued="Issued";
	String statusReturnDraft="Return Draft";
	String statusReturnPosted ="Return Posted";

	String deliveredTo="Eccountant";
	String customerNameAddPage="Customer_01";
	String doWarehouse="Warehouse 01";
	String purpose="Sales";

	String Sale_Custom_Field1="Sale Custom1";
	String Sale_Custom_Field2="Sale Custom2";
	String Sale_Custom_Field3="Sale Custom3";
	String Sale_Custom_Field4="Sale Custom4";

	String doStagesAddPage="sdf";
	String salesPersonAddPage="sohail sagar";
	String doProject="Beta_Project";
	String doDate="20-07-2023";

	String product1NameAddPage="Product 3";
	String product1NameEditPage="2ndUnitProduct";

	String product_desc1="Desc1";
	String package_unit1="saw";
	String cost_center_id1="Cost Center- 04";
	int pro_weight1=1;
	int pro_package1=15;
	String pro_unit1="meters";
	int pro_qty1=10;

	String product_desc2="Desc";
	String package_unit2="saw";
	String cost_center_id2="Cost Center- 04";
	int pro_weight2=1;
	int pro_package2=15;
	String pro_unit2="meters";
	int pro_qty2=3;


	String do_footer1="Footer Note1";
	String do_footer2="Footer Note2";
	String do_footer3="Footer Note3";
	String do_footer4="Footer Note4";

	String edit_do_footer1="Footer Note1";
	String edit_do_footer2="Footer Note2";
	String edit_do_footer3="Footer Note3";
	String edit_do_footer4="Footer Note4";
	private CharSequence package_qty;

	String product_base_unit;
	String product_base_qty;
	String product_stock_cost;

	String secondunits;
	String thirdunits;
	String fourthunits;

	int second_Unit_Qty;
	int third_Unit_Qty;
	int fourth_Unit_Qty;


	double second_Unit_Cost;
	double third_Unit_Cost;
	double fourth_Unit_Cost;

	public static Logger log=LogManager.getLogger();

	@BeforeTest
	public void h() 
	{
		SingletonDriver.Initialize();
	}
	@Test(priority=1,enabled=true)
	public void DoAddhideshow() throws InterruptedException
	{

		SingletonDriver.driver.findElement(By.partialLinkText("Sales")).click();
		log.info("Click Sales");
		SingletonDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Click Delivery Order
		SingletonDriver.driver.findElement(By.partialLinkText("Delivery Order")).click();
		log.info("Click Delivery Order");
		//Click Add Delivery Order1
		SingletonDriver.driver.findElement(By.partialLinkText("Add Delivery Order")).click();
		log.info("Click Add Delivery Order");

		Thread.sleep(1000);

		//Click Hide&Show Setting
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/div[1]/form/div/div/button\r\n")).click();

		//Company Log
		if ( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][logo]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][logo]']")).click();
			//Company Info
		}
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][c_info]']")).isSelected() ) {

			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][c_info]")).click();
		}
		//Category
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][category]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][category]")).click();
		}
		//SKU Number
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sku]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sku]")).click();
		}
		//Stock Qty
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][stock_qty]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][stock_qty]")).click();
		}
		//Stock Cost
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][stock_cost]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][stock_cost]")).click();
		}
		//Item Number
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][item_no]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][item_no]")).click();
		}
		//Item size
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][item_size]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][item_size")).click();

		}
		//Item Type1
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][item_type]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][item_type]")).click();

		}
		//Item Group
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][item_group]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][item_group]")).click();

		}
		//Other Number
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][other_number]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][other_number]")).click();

		}
		//Other Group
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][other_group]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][other_group]")).click();

		}
		//Main Group
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][main_group]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][main_group]")).click();

		}
		//Model
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][model]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][model]")).click();

		}
		//Registration Number
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][registration_no]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][registration_no]")).click();

		}
		//Description
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][descrp]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][descrp]")).click();

		}
		//Package Unit
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][pkg_unit]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][pkg_unit]")).click();

		}
		//Package qty
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][pkg_qty]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][pkg_qty]")).click();

		}
		//Wieght
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][weight]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][weight]")).click();

		}
		//Stages
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][stages]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][stages]")).click();

		}
		//Sale Person
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sales_person]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sales_person]")).click();

		}
		//Sale Custome Field 1
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sin_custom_field_1]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sin_custom_field_1]")).click();

		}
		//Sale Custome Field 2
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sin_custom_field_2]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sin_custom_field_2]")).click();

		}
		//Sale Custome Field 3
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sin_custom_field_3]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sin_custom_field_3]")).click();

		}
		//Sale Custome Field 4
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sin_custom_field_4]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sin_custom_field_4]")).click();

		}
		//Sale Footer Note 1
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sale_footer_note_1]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sale_footer_note_1]")).click();

		}
		//Sale Footer Note2
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sale_footer_note_2]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sale_footer_note_2]")).click();

		}
		//Sale Footer Note 3
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sale_footer_note_3]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sale_footer_note_3]")).click();

		}
		//Sale Footer Note 4
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sale_footer_note_4]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][sale_footer_note_4]")).click();

		}
		//Cost List
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][cost_list]']")).isSelected() ) {
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note][cost_list]")).click();
		}


		SingletonDriver.driver.findElement(By.id("getPurchaseLsit")).click();

	}

	//<-------------Varify Do Add Page WebElement is present or not----------------->

	@Test(priority=2,enabled=false)
	public void doAddValidateWebElement() 
	{
		log.info("****---Do Add Page Varify WebElement are Visible Or Not---****");

		if(SingletonDriver.driver.getPageSource().contains("Product Name")){
		}else{
			log.error("Product Name Element is Not Visible");
		}
		//Category


		if(SingletonDriver.driver.getPageSource().contains("Category")){
		
		}else{
			log.error("Category Element is Not Visible");
		}
		//SKU
		if(SingletonDriver.driver.getPageSource().contains("SKU5555")){
	
		}else{
			log.error("SKU5555 Element is Not Visible");
		}
		//Stock QTY
		if(SingletonDriver.driver.getPageSource().contains("Stock QTY")){
			
		}else{
			log.error("Stock QTY Element is Not Visible");
		}
		//Stock Cost442
		if(SingletonDriver.driver.getPageSource().contains("Stock Cost442")){
		
		}else{
			log.error("Stock Cost442 Element is Not Visible");
		}
		//Item Number
		if(SingletonDriver.driver.getPageSource().contains("Item Number")){
			
		}else{
			log.error("Item Number Element is Not Visible");
		}
		//Size
		if(SingletonDriver.driver.getPageSource().contains("Size")){
			
		}else{
			log.error("Size Element is Not Visible");
		}
		//	Item Type1
		if(SingletonDriver.driver.getPageSource().contains("Item Type1")){
			
		}else{
			log.error("Item Type1 Element is Not Visible");
		}
		//Item Group
		if(SingletonDriver.driver.getPageSource().contains("Item Group")){
			
		}else{
			log.error("Item Group Element is Not Visible");
		}
		//Other Number
		if(SingletonDriver.driver.getPageSource().contains("Other Number")){
			
		}else{
			log.error("Other Number Element is Not Visible");
		}
		//Other Group
		if(SingletonDriver.driver.getPageSource().contains("Other Group")){
			
		}else{
			log.error("Other Group Element is Not Visible");
		}
		//Main Group
		if(SingletonDriver.driver.getPageSource().contains("Main Group")){
			
		}else{
			log.error("Main Group Element is Not Visible");
		}
		//Model
		if(SingletonDriver.driver.getPageSource().contains("Model")){
		
		}else{
			log.error("Model Element is Not Visible");
		}
		//Registration No
		if(SingletonDriver.driver.getPageSource().contains("Registration No")){
			
		}else{
			log.error("Registration No Element is Not Visible");
		}
		//Description
		if(SingletonDriver.driver.getPageSource().contains("Description")){
			
		}else{
			log.error("Description Element is Not Visible");
		}
		//Package Unit
		if(SingletonDriver.driver.getPageSource().contains("Package Unit")){
			
		}else{
			log.error("Package Unit Element is Not Visible");
		}
		//Package QTY
		if(SingletonDriver.driver.getPageSource().contains("Package QTY")){
			
		}else{
			log.error("Package QTY Element is Not Visible");
		}
		//Weight (KG's)
		if(SingletonDriver.driver.getPageSource().contains("Weight (KG's)")){
			
		}else{
			log.error("Weight (KG's) Element is Not Visible");
		}
		//Stages
		if(SingletonDriver.driver.getPageSource().contains("Stages")){
			
		}else{
			log.error("Stages Element is Not Visible");
		}
		//Sales Person 
		if(SingletonDriver.driver.getPageSource().contains("Sales Person")){
			
		}else{
			log.error("Sales Person Element is Not Visible");
		}
		//Sale Custom Field 1
		if(SingletonDriver.driver.getPageSource().contains("Sale Custom Field 1")){
	
		}else{
			log.error("Sale Custom Field 1 is Not Visible");
		}
		//Sale Custom Field 2
		if(SingletonDriver.driver.getPageSource().contains("Sale Custom Field 2")){
			
		}else{
			log.error("Sale Custom Field 2 Element is Not Visible");
		}
		//Sale Custom Field 3
		if(SingletonDriver.driver.getPageSource().contains("Sale Custom Field 3")){
			
		}else{
			log.error("Sale Custom Field 3 Element is Not Visible");
		}
		//Sale Custom Field 4
		if(SingletonDriver.driver.getPageSource().contains("Sale Custom Field 4")){
			
		}else{
			log.error("Sale Custom Field4  Element is Not Visible");
		}

		//Sale Footer Note 1
		if(SingletonDriver.driver.getPageSource().contains("Sale Footer Note 1")){
			
		}else{
			log.error("Sale Footer Note 1 is Not Visible");
		}
		//Sale Footer Note 2
		if(SingletonDriver.driver.getPageSource().contains("Sale Footer Note 2")){
			
		}else{
			log.error("Sale Footer Note 2 Element is Not Visible");
		}
		//Sale Footer Note 3
		if(SingletonDriver.driver.getPageSource().contains("Sale Footer Note 3")){
		
		}else{
			log.error("Sale Footer Note 3 Element is Not Visible");
		}
		//Sale Footer Note 4
		if(SingletonDriver.driver.getPageSource().contains("Sale Footer Note 4")){
			
		}else{
			log.error("Sale Footer Note 4 Element is Not Visible");
		}
		//cost222 List	
		if(SingletonDriver.driver.getPageSource().contains("cost222 List")){
			
		}else{
			log.error("cost222 List Element is Not Visible");
		}


		//Second Units
		if(SingletonDriver.driver.getPageSource().contains("Second Units")){
			
		}else{
			log.error("Second Units Element is Not Visible");
		}
		//Third Units
		if(SingletonDriver.driver.getPageSource().contains("Third Units")){
	
		}else{
			log.error(" Third Units Element is Not Visible");
		}
		//Third Units
		if(SingletonDriver.driver.getPageSource().contains("Fourth Units")){
		
		}else{
			log.error("Fourth Units Element is Not Visible");
		}
	}
	@Test(priority=3,enabled=true)
	//Click Deliver Order

	public void deliveryOrderAddPage() throws InterruptedException, AWTException 
	{


		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(2000);
		log.info("<------Enter Delivery Order Details------>");

//		SingletonDriver.driver.findElement(By.partialLinkText("Sales")).click();
//		log.info("Click Sales");
//		SingletonDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//Click Delivery Order
//		SingletonDriver.driver.findElement(By.partialLinkText("Delivery Order")).click();
//		log.info("Click Delivery Order");
//		//Click Add Delivery Order1
//		SingletonDriver.driver.findElement(By.partialLinkText("Add Delivery Order")).click();
//		log.info("Click Add Delivery Order");

		Thread.sleep(1000);

		// DELIVERED TO
		SingletonDriver.driver.findElement(By.id("issued_to")).sendKeys(deliveredTo);
		log.info("Enter Delivered_To Name");

		//customer_name
		SingletonDriver.driver.findElement(By.id("customer_name")).sendKeys(customerNameAddPage);
		log.info("Enter Customer Name");
		Thread.sleep(2000);
		WebElement specificTextElement = SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[2]/div[4]/table/thead/tr/th/div/div/div[2]/a[1]/div/div[2]"));
		specificTextElement.click();
		log.info("Select Customer");

		//Click Delivery Date
		SingletonDriver.driver.findElement(By.id("notedate")).click();
		SingletonDriver.driver.findElement(By.id("notedate")).clear();
		SingletonDriver.driver.findElement(By.id("notedate")).sendKeys(doDate,Keys.ENTER);		

		//Click Warehouse Field
		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='warehouse']")).click();
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[3]/div/div/div[3]/div/div/div/div/div/input")).sendKeys(doWarehouse,Keys.ENTER);
		log.info("Select Warehouse");

		//Click Purpose Field
		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='purpose_id']")).click();

		//Type Purpose 
		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='purpose_id']")).sendKeys(purpose,Keys.ENTER);
		log.info("Select Purpose");

		//Enter Sale Custom Field 1
		SingletonDriver.driver.findElement(By.id("sin_cf_1")).sendKeys(Sale_Custom_Field1);
		log.info("Enter Custome Field 1");

		//Enter Sale Custom Field 2
		SingletonDriver.driver.findElement(By.id("sin_cf_2")).sendKeys(Sale_Custom_Field2);
		log.info("Enter Custome Field 2");

		//Enter Sale Custom Field 3
		SingletonDriver.driver.findElement(By.id("sin_cf_3")).sendKeys(Sale_Custom_Field3);
		log.info("Enter Custome Field 3");

		//Enter Sale Custom Field 4
		SingletonDriver.driver.findElement(By.id("sin_cf_4")).sendKeys(Sale_Custom_Field4);
		log.info("Enter Custome Field 4");

		//Click Stages Field
		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='stage_id']")).click();
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[3]/div/div/div[9]/div/div/div/div/input")).sendKeys(doStagesAddPage,Keys.ENTER);
		log.info("Select Stages");

		//Click Sales Person
		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='sales_person']")).click();
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[3]/div/div/div[10]/div/div/div/div/input")).sendKeys(salesPersonAddPage,Keys.ENTER);
		log.info("Select Sales Person");

		//Select Project
		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='project']")).click();
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[3]/div/div/div[11]/div/div/div/div/input")).sendKeys(doProject,Keys.ENTER);
		log.info("Select Project");

		//Again Enter Customer Name
		SingletonDriver.driver.findElement(By.id("customer_name")).sendKeys(customerNameAddPage);
		log.info("Enter Customer Name");
		Thread.sleep(2000);
		WebElement specificTextElement1 = SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[2]/div[4]/table/thead/tr/th/div/div/div[2]/a[1]/div/div[2]"));
		Thread.sleep(1000);
		specificTextElement1.click();
		log.info("Again Select Customer");

		//Select Product
		WebElement pro_name1=SingletonDriver.driver.findElement(By.id("name1"));
		pro_name1.clear();
		pro_name1.sendKeys(product1NameAddPage);
		Thread.sleep(1000);
		Actions builder1=new Actions(SingletonDriver.driver);

		builder1.moveToElement(pro_name1.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[4]/div/div/div[2]/div/div[2]/div/div[2]/a[1]/div/div[1]"))).click().build().perform();  
		log.info("Select 1st Product");
		//Product Description
		SingletonDriver.driver.findElement(By.id("product_desc1")).clear();
		SingletonDriver.driver.findElement(By.id("product_desc1")).sendKeys(product_desc1);
		log.info("Add product_desc1");
		Thread.sleep(1000);

		//Select Packae Unit
		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='package_unit1']")).click();
		Thread.sleep(1000);
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[4]/div/div/div[2]/div/div[19]/div/div/div/div/input")).sendKeys(package_unit1,Keys.ENTER);
		log.info("Select Package Unitt");
		
		//Enter Weight 
				WebElement element_weight1= SingletonDriver.driver.findElement(By.id("weight1"));
				element_weight1.clear();
				element_weight1 .sendKeys(String.valueOf(pro_weight1));
				log.info("Enter Weight1");
				

				//Enter Package QTY
				WebElement element_package1=SingletonDriver.driver.findElement(By.id("package1"));
				element_package1.clear();
				element_package1.sendKeys(String.valueOf(pro_package1));
				log.info("Enter Package1 qty");

//		//Selct Cost Center
//		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='cost_center_id1']")).click();
//		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[4]/div/div/div[2]/div/div[20]/div/div/div/div/input")).sendKeys(cost_center_id1,Keys.ENTER);
//		log.info("select cost_center_id1");

		


		//		//		Select unit1
		//		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='unit1']")).click();
		//		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[4]/div/div/div[2]/div/div[23]/div/div/div/div/input")).sendKeys(pro_unit1,Keys.ENTER);
		//		log.info("Select 1st Product unit1");
		//		Thread.sleep(1000);

		//Enter 1st Product qty
		WebElement element_qty1 = SingletonDriver.driver.findElement(By.id("qty1"));
		element_qty1.clear();
		element_qty1 .sendKeys(String.valueOf(pro_qty1));
		log.info("Enter 1st Product qantity");
 
		Thread.sleep(2000);
		//Add Sale Foter Note
		WebElement footer1=SingletonDriver.driver.findElement(By.id("sale_footer_note_1"));
		footer1.click();
		footer1.sendKeys(do_footer1);
		SingletonDriver.driver.findElement(By.id("sale_footer_note_2")).sendKeys(do_footer2);
		SingletonDriver.driver.findElement(By.id("sale_footer_note_3")).sendKeys(do_footer3);
		SingletonDriver.driver.findElement(By.id("sale_footer_note_4")).sendKeys(do_footer4);
		log.info("Add Sale Footer Notes");
		//Click Save Button
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[1]/button[1]")).click();
		log.info("Click Save Button");



	}
	@Test(priority=4,enabled=false)
	public void doViewHideshow() throws InterruptedException
	{
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[1]/div[1]/form/div/button")).click();
		//Company Logo
		if ( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][logo]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][logo]']")).click();

		}else
		//Company Info
		if ( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][c_info]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][c_info]']")).click();

		}	

		//Sr.#
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item]")).click();
		}

		//Product Name
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pr_name]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pr_name]']")).click();
		}

		//SKU Number
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sku]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sku]']")).click();
		}

		//Stock Qty
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][stock_qty]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][stock_qty]']")).click();
		}

		//Stock Cost
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][stock_cost]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][stock_cost]']")).click();
		}

		//Barcode


		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][upc]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][upc]']")).click();
		}

		//Short Attributes
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][short_attributes]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][short_attributes]']")).click();
		}

		//Long Attributes
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][long_attributes]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][long_attributes]']")).click();
		}

		//Category
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][category]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][category]']")).click();
		}

		//Weight 
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][weight]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][weight]']")).click();

		}

		//Registration Number
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][reg]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][reg]']")).click();

		}

		//Item Number
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item_no]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item_no]']")).click();
		}

		//Other Number
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][other_number]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][other_number]']")).click();

		}

		//Other Group
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][other_group]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][other_group]']")).click();

		}
		//Main Group
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][mian_group]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][mian_group]']")).click();

		}
		//Item Group
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item_group]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item_group]']")).click();

		}
		//Model
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][model]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][model]']")).click();

		}

		//Item size
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item_size]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item_size]']")).click();
			Thread.sleep(1000);
		}


		//Size

		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item_size]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item_size]']")).click();
		}

		//Item Type1
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item_type]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][item_type]']")).click();

		}




		//Description
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][descrp]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][descrp]']")).click();

		}

		//Unit

		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][unit]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][unit]']")).click();

		}
		//Quantity

		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][quantity]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][quantity]']")).click();

		}
		//Pending Quantity 
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pending_quantity]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pending_quantity]']")).click();

		}
		//Aditional Products 
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][additional_products]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][additional_products]']")).click();

		}
		//Package Unit
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pkg_unit]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pkg_unit]']")).click();

		}

		//Cost Center
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][cost_center_id]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][cost_center_id]']")).click();

		}
		//Package qty
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pkg_qty]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pkg_qty]']")).click();

		}

		//Product Custome 1
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pr_cus1]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pr_cus1]']")).click();

		}

		//Product Custome 2
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pr_cus2]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pr_cus2]']")).click();

		}

		//Product Custome 3
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pr_cus3]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pr_cus3]']")).click();

		}

		//Product Custome 4
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pr_cus4]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][pr_cus4]']")).click();
			Thread.sleep(1000);
		}

		//Batch
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][batch_no]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][batch_no]']")).click();

		}

		//Expired At 
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][expired_at]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][expired_at]']")).click();

		}
		//Quality Control


		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][qc]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][qc]']")).click();

		}
		//Sale Custome Field 1
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sin_custom_field_1]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sin_custom_field_1]']")).click();

		}
		//Sale Custome Field 2
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sin_custom_field_2]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sin_custom_field_2]']")).click();

		}
		//Sale Custome Field 3
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sin_custom_field_3]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sin_custom_field_3]']")).click();

		}
		//Sale Custome Field 4
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sin_custom_field_4]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sin_custom_field_4]']")).click();

		}

		JavascriptExecutor js = (JavascriptExecutor) SingletonDriver.driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);

		//Stages
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][stages]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][stages]']")).click();
			Thread.sleep(1000);
		}
		//Sale Person
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sales_person]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sales_person]']")).click();
			Thread.sleep(1000);
		}

		//Created By1

		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][created_by]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][created_by]']")).click();

		}
		//Created At

		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][created_at]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][created_at]']")).click();

		}
		//Issued By


		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][issued_by]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][issued_by]']")).click();

		}
		//Sale Footer Note 1
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sale_footer_note_1]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sale_footer_note_1]']")).click();

		}
		//Sale Footer Note2
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sale_footer_note_2]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sale_footer_note_2]']")).click();

		}
		//Sale Footer Note 3
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sale_footer_note_3]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sale_footer_note_3]']")).click();

		}
		//Sale Footer Note 4
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sale_footer_note_4]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][sale_footer_note_4]']")).click();

		}

		//Second Units
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][second_units]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][second_units]']")).click();

		}
		//Third Units
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][third_units]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][third_units]']")).click();

		}
		//Fourth Units
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][fourth_units]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][fourth_units]']")).click();

		}

		//Base Unit
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][base_unit]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][base_unit]']")).click();

		}
		//Base Qty
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][base_qty]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][base_qty]']")).click();

		}
		//Cost List
		if( !SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][cost_list]']")).isSelected() ){
			SingletonDriver.driver.findElement(By.cssSelector("input[name*='report[issue_note_view][cost_list]']")).click();
		}


		SingletonDriver.driver.findElement(By.id("getPurchaseLsit")).click();

	}



	@Test(priority=4,enabled=false)
	public void deliveryOrderViewPage() 
	{
		doAddValidateWebElement();
	}

	@Test(priority=5,enabled=true)
	public void after_Add_Do_view() 
	{


		//Check Status 
		if(SingletonDriver.driver.getPageSource().contains(statusDraft)){
			log.info("Delivery Order  have in  Draft Status...");
		}else{
			log.error("Delivery Order  have Not in  Draft Status");
		}

		//Product Name on View Page...
		if(SingletonDriver.driver.getPageSource().contains(product1NameAddPage)){
			log.info("Product Name is Visible On View Page");
		}else{
			log.error("Product Name is Not Visible On View Page");
		}
		//Sales
		if(SingletonDriver.driver.getPageSource().contains(purpose)){
			log.info("Sale Purpose is Visible on Veiw Page");
		}else{
			log.error("Sale Purpose is not Visible on Veiw Page");
		}

		//Warehouse
		if(SingletonDriver.driver.getPageSource().contains(doWarehouse)){
			log.info("Warehouse is Visible on Veiw Page");
		}else{
			log.error("Warehouse is not Visible on Veiw Page");
		}

		//Sales Person
		if(SingletonDriver.driver.getPageSource().contains(purpose)){
			log.info("Sale Purpose is Visible on Veiw Page");
		}else{
			log.error("Sale Purpose is not Visible on Veiw Page");
		}
		// Stages
		if(SingletonDriver.driver.getPageSource().contains(doStagesAddPage)){
			log.info("Stages is Visible on Veiw Page");
		}else{
			log.error("Stages is not Visible on Veiw Page");
		}
		// Stages
		if(SingletonDriver.driver.getPageSource().contains(doProject)){
			log.info("Project is Visible on Veiw Page");
		}else{
			log.error("Project is not Visible on Veiw Page");
		}

		//Sale Custome field 1	
		if(SingletonDriver.driver.getPageSource().contains(Sale_Custom_Field1)){
			log.info("Sale_Custom_Field1 is Visible on Veiw Page");
		}else{
			log.error("Sale_Custom_Field1 is not Visible on Veiw Page");
		}

		//Sale Custome field 2	
		if(SingletonDriver.driver.getPageSource().contains(Sale_Custom_Field2)){
			log.info("Sale_Custom_Field2 is Visible on Veiw Page");
		}else{
			log.error("Sale_Custom_Field2 is not Visible on Veiw Page");
		}

		//Sale Custome field 3
		if(SingletonDriver.driver.getPageSource().contains(Sale_Custom_Field3)){
			log.info("Sale_Custom_Field3 is Visible on Veiw Page");
		}else{
			log.error("Sale_Custom_Field3 is not Visible on Veiw Page");
		}

		//Sale Custome field 4
		if(SingletonDriver.driver.getPageSource().contains(Sale_Custom_Field4)){
			log.info("Sale_Custom_Field4 is Visible on Veiw Page");
		}else{
			log.error("Sale_Custom_Field4 is not Visible on Veiw Page");
		}

		//Product Name
		if(SingletonDriver.driver.getPageSource().contains(product1NameAddPage)){
			log.info("Product name is Visible on Veiw Page");
		}else{
			log.error("Product name is not Visible on Veiw Page");
		}

		//Product Description 1
		if(SingletonDriver.driver.getPageSource().contains(product_desc2)){
			log.info("Product Description1 is Visible on Veiw Page");
		}else{
			log.error("Product Description1 is not Visible on Veiw Page");
		}

		//Unit
		if(SingletonDriver.driver.getPageSource().contains(pro_unit1)){
			log.info("Product Unit is Visible on Veiw Page");
		}else{
			log.error("Product Unit is not Visible on Veiw Page");
		}
		//qty
		if(SingletonDriver.driver.getPageSource().contains(String.valueOf(pro_qty1))){
			log.info("Product Qty Visible on Veiw Page");
		}else{
			log.error("Product Qty is not Visible on Veiw Page");
		}
		//PKG Unit
		if(SingletonDriver.driver.getPageSource().contains(String.valueOf(package_unit1))){
			log.info("Package Unit is Visible on Veiw Page");
		}else{
			log.error("Package Unit is not Visible on Veiw Page");
		}

		//Cost Center
		if(SingletonDriver.driver.getPageSource().contains(cost_center_id1)){
			log.info("Cost Center is Visible on Veiw Page");
		}else{
			log.error("Cost Center is not Visible on Veiw Page");
		}

		//Package Qty
		if(SingletonDriver.driver.getPageSource().contains(String.valueOf(package_qty))){
			log.info("Package Qty is Visible on Veiw Page");
		}else{
			log.error("Package Qty is not Visible on Veiw Page");
		}
		//Wieght
		if(SingletonDriver.driver.getPageSource().contains(String.valueOf(pro_weight1))){
			log.info("Weight is Visible on Veiw Page");
		}else{
			log.error("Weight is not Visible on Veiw Page");
		}


		//Product Base Qty
		product_base_qty = SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr/td[44]")).getText();
		System.out.println("Base Qty = "+product_base_qty);



		//Product Base Unit 
		product_base_unit = SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr/td[43]")).getText();
		System.out.println("Base Unit = "+product_base_unit);
		//Second Units
		secondunits = SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr/td[34]\r\n"+ "")).getText();
		System.out.println("Second Units  = "+secondunits);
		//Third Units
		thirdunits = SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr/td[37]")).getText();
		System.out.println("Third Units  = "+thirdunits);
		//Fourth Units
		fourthunits = SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr/td[40]")).getText();
		System.out.println("Fourth Units  = "+fourthunits);
		//Product Qty
		String Pro_qty = SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr/td[20]")).getText();
		System.out.println("Product Qty = "+Pro_qty);
		//Second Unit Qty
		second_Unit_Qty=Integer.parseInt(Pro_qty)*(5);
		System.out.println("Second Units Qty  = "+second_Unit_Qty);
		//Third Unit Qty
		third_Unit_Qty=Integer.parseInt(Pro_qty)*(10);
		System.out.println("Third Units Qty  = "+third_Unit_Qty);
		//Fourth Unit Qty
		fourth_Unit_Qty=Integer.parseInt(Pro_qty)*(15);
		System.out.println("Fourth Units Qty  = "+fourth_Unit_Qty);



		//Product Stock Cost
		product_stock_cost=SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr/td[32]")).getText();
		System.out.println("Product Cost  = "+product_stock_cost);
		//Second Unit Cost
		second_Unit_Cost=Double.parseDouble(product_stock_cost)/(5);
		System.out.println("Second Units Cost  = "+second_Unit_Cost);
		//Third Unit Cost
		third_Unit_Cost=Double.parseDouble(product_stock_cost)/(10);
		System.out.println("Third Units Cost  = "+third_Unit_Cost);
		//Fourth Unit Cost
		fourth_Unit_Cost=Double.parseDouble(product_stock_cost)/(15);
		System.out.println("Third Units Cost  = "+fourth_Unit_Cost);
		//Base Unit
		if(SingletonDriver.driver.getPageSource().contains(product_base_unit)){
			log.info("Base Unit is Visible on Veiw Page");
		}else{
			log.error("Weight is not Visible on Veiw Page");
		}
		//Second Unit
		if(SingletonDriver.driver.getPageSource().contains(secondunits)){
			log.info("secondunit Unit is Visible on Veiw Page");
		}else{
			log.error("secondunit Unit is not Visible on Veiw Page");
		}
		//Third Unit
		if(SingletonDriver.driver.getPageSource().contains(thirdunits)){
			log.info("Third Unit is Visible on Veiw Page");
		}else{
			log.error("Third Unit  is not Visible on Veiw Page");
		}
		//Fourth Unit
		if(SingletonDriver.driver.getPageSource().contains(fourthunits)){
			log.info("Fourth Unit is Visible on Veiw Page");
		}else{
			log.error("Forth Unit  is not Visible on Veiw Page");
		}

		// Validate 2,3 and Units  Qty
		//Second Unit Qty
		if(SingletonDriver.driver.getPageSource().contains(String.valueOf(second_Unit_Qty))){
			log.info("second Unit Qty is Visible on Veiw Page");
		}else{
			log.error("second Unit Qty is not Visible on Veiw Page");
		}
		//Third Unit Qty
		if(SingletonDriver.driver.getPageSource().contains(String.valueOf(third_Unit_Qty))){
			log.info("Third Unit Qty is Visible on Veiw Page");
		}else{
			log.error("Third Unit Qty is not Visible on Veiw Page");
		}
		//Fourth Unit Qty
		if(SingletonDriver.driver.getPageSource().contains(String.valueOf(fourth_Unit_Qty))){
			log.info("Fourth Unit Qty is Visible on Veiw Page");
		}else{
			log.error("Forth Unit Qty  is not Visible on Veiw Page");
		}
		// Validate 2,3 and Units  Cost
		//Second Unit Cost
		if(SingletonDriver.driver.getPageSource().contains(String.valueOf(second_Unit_Cost))){
			log.info("Second Unit Cost is Visible on Veiw Page");
		}else{
			log.error("Second Unit Cost is not Visible on Veiw Page");
		}
		//Third Unit Cost
		if(SingletonDriver.driver.getPageSource().contains(String.valueOf(third_Unit_Cost))){
			log.info("Third Unit Cost is Visible on Veiw Page");
		}else{
			log.error("Third Unit Cost is not Visible on Veiw Page");
		}
		//Fourth Unit Cost
		if(SingletonDriver.driver.getPageSource().contains(String.valueOf(fourth_Unit_Cost))){
			log.info("Fourth Unit Cost is Visible on Veiw Page");
		}else{
			log.error("Forth Unit Cost  is not Visible on Veiw Page");
		}

		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[1]/div[2]/form/div/div[1]/div/button")).click();
		//Download PDF 
		SingletonDriver.driver.findElement(By.linkText("Download PDF")).click();
		log.info("Successfully Download PDF");


	}
	//Edit page...
	@Test(priority=6,enabled=false)
	public void deliveryOrder_edit_page() throws InterruptedException {
		Thread.sleep(2000);
		//Click Edit Button
		SingletonDriver.driver.findElement(By.linkText("Edit")).click();
		log.info("Click Edit Button");
		Thread.sleep(2000);
		boolean pro_1 = SingletonDriver.driver.getPageSource().contains(product1NameEditPage);
		if (pro_1== true) {
			System.out.print("Product 1 Visible on Edit page");
		}
		//click Newline
		SingletonDriver.driver.findElement(By.id("newline")).click();
		log.info("Click Newline Button");


		SingletonDriver.driver.findElement(By.id("name4")).click();
		log.info("Click Newline Button");

		//--------------
		//Select Product 
		WebElement pro_name1=SingletonDriver.driver.findElement(By.id("name4"));
		pro_name1.clear();
		pro_name1.sendKeys(product1NameEditPage);
		Thread.sleep(3000);
		Actions builder1=new Actions(SingletonDriver.driver);

		builder1.moveToElement(pro_name1.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/a[1]/div"))).click().build().perform();  
		log.info("Select 1st Product");
		//Product Description
		SingletonDriver.driver.findElement(By.id("product_desc4")).sendKeys(product_desc2);
		log.info("Add product_desc2");
		Thread.sleep(1000);

		//Select Packae Unit
		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='package_unit4']")).click();
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div[20]/div/div/div/div/input")).sendKeys(package_unit2,Keys.ENTER);
		log.info("Select Package Unitt2");
		Thread.sleep(1000);

		//Selct Cost Center
		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='cost_center_id4']")).click();
		Thread.sleep(3000);
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div[21]/div/div/div/div/input")).sendKeys(cost_center_id2,Keys.ENTER);
		log.info("select cost_center_id2");

		//Enter Weight 
		WebElement element_weight1= SingletonDriver.driver.findElement(By.id("weight4"));
		element_weight1.clear();
		element_weight1 .sendKeys(String.valueOf(pro_weight2));
		log.info("Enter Weight2");
		Thread.sleep(1000);

		//Enter Package QTY
		WebElement element_package1=SingletonDriver.driver.findElement(By.id("package4"));
		element_package1.clear();
		element_package1.sendKeys(String.valueOf(pro_package2));
		Thread.sleep(1000);
		log.info("Enter Package1 qty");

		//		//		Select unit1
		//		SingletonDriver.driver.findElement(By.cssSelector("button[data-id*='unit1']")).click();
		//		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div/div/div[4]/div/div/div[2]/div/div[23]/div/div/div/div/input")).sendKeys(pro_unit1,Keys.ENTER);
		//		log.info("Select 1st Product unit1");
		//		Thread.sleep(1000);

		//Enter 1st Product qty
		WebElement element_qty2 = SingletonDriver.driver.findElement(By.id("qty4"));
		element_qty2.clear();
		element_qty2 .sendKeys(String.valueOf(pro_qty2));
		log.info("Enter 2nd Product qantity");
		//Scrol down
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) SingletonDriver.driver;
		js.executeScript("window.scrollBy(0,350)", "");

		//Click Save Button
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[3]/div/div[2]/button")).click();
		log.info("Click Save Button");

		//		do_view_hideshow();
		//		do_Add_Varify_WebElement();




	}
	@Test(priority=7,enabled=false)

	public void do_issued() throws InterruptedException {
		SingletonDriver.driver.findElement(By.id("finalizeButton")).click();
		if(SingletonDriver.driver.getPageSource().contains(statusIssued)){
			log.info("Delivery Order  have in  Issued Status...");
		}else{
			log.error("Delivery Order  have Not in  Issued Status");

		}
		Thread.sleep(3000);
		SingletonDriver.driver.navigate().refresh(); 
		Thread.sleep(1000);
		SingletonDriver.driver.navigate().refresh();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) SingletonDriver.driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		String stock_cost=SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div/div/div/div[2]/div[2]/div[2]/div/div/div/table/tbody/tr[3]/td[5]")).getText();

		String numericValue = stock_cost.replaceAll("-", "");
		System.out.println(numericValue);
		//click Do-Stock Voucher
		WebElement stock_cost1=SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div/div/div/div[2]/div[1]/div/div[1]/div[2]/table/tbody/tr[10]/td/a"));
		stock_cost1.click();
		String Do_Debit=SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[6]/div[1]/div/div[2]/form/div/div[2]/div[1]/div[3]/table/tfoot/tr/td[3]")).getText();
		String Do_Credit=SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[6]/div[1]/div/div[2]/form/div/div[2]/div[1]/div[3]/table/tfoot/tr/td[3]")).getText();

		if(Do_Debit.equals(Do_Credit)) {
			System.out.println("Do Debit and Credit Amount is Equal");
		}else {
			System.out.println("Do Debit and Credit Amount is not Equal");


		}
		if(Do_Debit.equals(stock_cost1)) {
			System.out.println("Stock Do Amount is Equal Debit and Credit Amount");
		}else {
			System.out.println("Stock Do Amount is not Equal Debit and Credit Amount");
			System.out.println("Stock Amount is ="+numericValue);
			System.out.println("Debit Amount is ="+Do_Debit);



		}


	}
	@Test(priority=8,enabled=false)

	public void do_return_draft() throws InterruptedException 
	{
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[1]/div[2]/form/div/div[1]/div/button")).click();
		Thread.sleep(1000);
		SingletonDriver.driver.findElement(By.linkText("Return")).click(); 
		Thread.sleep(1000);
		SingletonDriver.driver.findElement(By.linkText("Yes")).click();
		Thread.sleep(1000);
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div/form/div[1]/button")).click();
		Thread.sleep(2000);
		if(SingletonDriver.driver.getPageSource().contains(statusReturnDraft)){
			log.info("Delivery Order  have in  Return Draft Status...");
		}else{
			log.error("Delivery Order  have Not in  Return Draft Status");
		}
		doViewHideshow();
		doAddValidateWebElement();

	}
	@Test(priority=9,enabled=false)
	public void do_return_finalize() throws InterruptedException 
	{
		//Click Return Finalize Button
		SingletonDriver.driver.findElement(By.id("finalizeButton")).click();
		if(SingletonDriver.driver.getPageSource().contains(statusReturnPosted)){
			log.info("Delivery Order  have in  Return Posted Status...");
		}else{
			log.error("Delivery Order  have Not in  Return Posted  Status");
		}

		WebElement element = SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/section/div[2]/div/div/div[2]/div[1]/div/div[1]/div[2]/table/tbody/tr[10]/td/a"));

		// Use the getText() method to get the visible text from the element
		String data = element.getText();
		System.out.print(data);
		doViewHideshow();
		doAddValidateWebElement();

	}


}
