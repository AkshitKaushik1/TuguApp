package pages;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFPictureData;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Log;

public class HomePage extends BasePage {
    /*
     * --**
     * Constructor
     */
    public HomePage (WebDriver driver) {
        super(driver);
    } 
    JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions a = new Actions(driver);
    String filepath = "C:\\Users\\akshi\\OneDrive\\Desktop\\image.xlsx";
    /**
     * Web Elements
     */

    By Poststatus               = By.xpath("//*[@id=\"post-textarea\"]/div/textarea");
    By emoji                    = By.xpath("//*[@id=\"dropdownEmo\"]");
    By emojidropdown            = By.xpath("//*[@id=\"post-textarea\"]/div/div[2]/ul/span[12]/span");
    By sharebutton              = By.xpath("//*[@id=\"publisher-button\"]");//*[@id="publisher-button"]
    By uploadImage              = By.xpath("//*[@id=\"publisher-photos\"]");
    By dropdownbutton           = By.xpath("//*[@id=\"head_menu_rght\"]/li[4]/a");
    By logout                   = By.xpath("//*[@id=\"head_menu_rght\"]/li[4]/ul/li[14]/a");
    By createpoll               = By.xpath("//*[@id=\"publisher-box-focus\"]/div/div[12]/div[3]/span");
    By answer1                  = By.xpath("//*[@id=\"poll-form\"]/div[1]/input[1]");
    By answer2                  = By.xpath("//*[@id=\"poll-form\"]/div[1]/input[2]");
    By addanswer                = By.xpath("//*[@id=\"add_answer\"]/div");//*[@id="add_answer"]/div
    
    /**
     * Page Methods
     * @throws InterruptedException 
     */
    public HomePage Poststatus () throws InterruptedException {
        Log.info("Publish a status");
        Thread.sleep(6000);
        click(Poststatus);
        Thread.sleep(3000);
        writeText(Poststatus,"Hi all");
        click(emoji);
        Thread.sleep(4000);
        click(emojidropdown);
        Thread.sleep(4000);
        click(sharebutton);
        
        return new HomePage(driver);
        
    }
    public HomePage UploadImage (String Imagepath) throws InterruptedException, IOException {
    	Log.info("Uploading an Image");
    	Thread.sleep(6000);
        click(Poststatus);
        Thread.sleep(3000);
        writeText(Poststatus,"Hi all");
        Thread.sleep(20000);
        driver.findElement(By.xpath("//*[@id=\"publisher-photos\"]")).sendKeys(Imagepath);
        Thread.sleep(15000);
        
        WebElement scroll = driver.findElement(By.xpath("//*[@id=\"publisher-button\"]")) ;
        System.out.println("lable is detected");
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
        //scroll.sendKeys(Keys.PAGE_DOWN);
        System.out.println("scroll is executed successfully");
        
        Thread.sleep(5000);
        click(sharebutton);
        Thread.sleep(8000);
        click(dropdownbutton);
        Thread.sleep(3000);
        click(logout);
        Thread.sleep(5000);
       // File src		    = new File(filepath);
		//FileInputStream fis = new FileInputStream(src);
	//	XSSFWorkbook wb 	= new XSSFWorkbook(fis);
		/*XSSFSheet sheet1 	= wb.getSheetAt(0);
		int rows 			= sheet1.getLastRowNum();
		
		int cols 			= sheet1.getRow(1).getLastCellNum();
		System.out.println("Total number of rows---" + (rows));						
		System.out.println("Total number of columns---" + cols+"\n");
	
		String[][] data = new String[rows][cols];
		data = new String[rows][cols];
		for(int i =0; i<=rows-1; i++)
		{
			XSSFRow row = sheet1.getRow(i);
			for(int j = 0; j<cols;j++) {
				
			//DataFormatter df = new DataFormatter();
			//data[i][j] = df.formatCellValue(sheet1.getRow(i).getCell(j));
	
				System.out.println(" ");
				for(String[] dataArr : data) {*/
		/*
		 * System.out.println(java.util.Arrays.toString(dataArr));
		 * System.out.println(data); } } }
		 */
       // File src		    = new File(filepath);
		//FileInputStream fis = new FileInputStream(src);
		//XSSFWorkbook wb 	= new XSSFWorkbook(fis);
		//XSSFSheet sheet1 	= wb.getSheetAt(0);
		
	//	AXSSFSheet sheet1 = (XSSFSheet) wb.getSheetAt(0);
      //  XSSFRow row = sheet1.getRow(0);
       // XSSFCell cell = row.getCell(0);
     //  XSSFCell cell = row.getCell(0);
     //   List lst = wb.getAllPictures();
      // for (Iterator it = lst.iterator(); it.hasNext(); ) {
        //  PictureData pict = (PictureData)it.next();
         // Dimension ext = pict.getImageDimension();
         // byte[] data = pict.getData();
         // if (ext.equals("1020071.jpg")){
           //FileOutputStream out = new FileOutputStream("pict.jpg");
           //out.write(data);
           //out.close();
         // }
        //}
        //for (XSSFPictureData picture : sheet1.getWorkbook().getAllPictures()) {
          //  // Get picture data
            //byte[] data = picture.getData();
            // Write picture data to a file
            //FileOutputStream out = new FileOutputStream("‪C:\\Users\\akshi\\Downloads\\tugu\\tugu\\Pictures\\1020071.jpg");
            //out.write(data);
            //out.close();

            // Load image in WebDriver and get its dimensions
            //driver.get("C:\\Users\\akshi\\Downloads\\tugu\\tugu\\Pictures\\1020071.jpg");
            //WebElement image = driver.findElement(By.tagName("img"));
           // int width = image.getSize().getWidth();
           // int height = image.getSize().getHeight();

            // Do something with the image dimensions
           // System.out.println("Image dimensions: " + width + " x " + height);
       // }
    

    // Close workbook and quit WebDriver
  //  workbook.close();
   // driver.quit();
		
		// byte imageBytes []= cell.getData();
		 
		 //File imageFile = new File("image.png");
	       // FileOutputStream imageOut = new FileOutputStream(imageFile);
	        //imageOut.write(imageBytes);
	        //imageOut.close();
	
        //Workbook workbook = new XSSFWorkbook(new FileInputStream("example.xlsx"));
        //XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(0);
        //XSSFRow row = sheet.getRow(0);
        //XSSFCell cell = row.getCell(0);
        
//File src = new File ("C:\\Users\\akshi\\OneDrive\\Desktop\\pictures.xlsx");
		
	//	FileInputStream fis= new FileInputStream(src);
		
	//	XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
     //   XSSFSheet sheet1 = workbook.getSheetAt(0);
       // int rows =sheet1.getLastRowNum();
        //int cols =sheet1.getRow(1).getLastCellNum();
        
        //System.out.println("Total number of rows---" + (rows-1));						
	///	System.out.println("Total number of columns---" + cols+"\n");
    	//driver.findElement(uploadImage).sendKeys("./Pictures/1020071.jpg");
    	return new HomePage(driver);
    }
    public HomePage Createpoll () throws InterruptedException {
    	 Log.info("Create a poll");
         Thread.sleep(9000);
         click(createpoll);
         Thread.sleep(6000);
         writeText(Poststatus , "hi all, which brand is best ?");
         Thread.sleep(5000);
         writeText(answer1, "BMW");
         Thread.sleep(6000);
         writeText(answer2,"Audi");
         //Thread.sleep(10000);
        // click(addanswer);
         WebElement scroll = driver.findElement(By.xpath("//*[@id=\"publisher-button\"]")) ;
         System.out.println("lable is detected");
         ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
         //scroll.sendKeys(Keys.PAGE_DOWN);
         System.out.println("scroll is executed successfully");
         Thread.sleep(5000);
         click(sharebutton);
         return new HomePage(driver);
    }
    public HomePage UploadVideo (String VideoPath) throws InterruptedException, IOException {
    	Log.info("Uploading a Video");
    
    	Thread.sleep(6000);
        click(Poststatus);
        Thread.sleep(3000);
        writeText(Poststatus,"Hi all");
        Thread.sleep(20000);
        driver.findElement(By.xpath("//*[@id=\"publisher-video\"]")).sendKeys(VideoPath);
        Thread.sleep(15000);
        
        WebElement scroll = driver.findElement(By.xpath("//*[@id=\"publisher-button\"]")) ;
        System.out.println("lable is detected");
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
        //scroll.sendKeys(Keys.PAGE_DOWN);
        System.out.println("scroll is executed successfully");
        
        Thread.sleep(5000);
        click(sharebutton);
        Thread.sleep(8000);
        click(dropdownbutton);
        Thread.sleep(3000);
        click(logout);
        Thread.sleep(5000);
        
    	
    	return new HomePage(driver);

    }
}