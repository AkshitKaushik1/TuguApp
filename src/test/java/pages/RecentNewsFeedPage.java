package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.Exit;

import java.util.TreeSet;
import java.util.ArrayList;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

import utils.Log;

public class RecentNewsFeedPage extends BasePage{

	public RecentNewsFeedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Variables
	 */

	public static final long SECOND_IN_MILLIS = 1000;
	public static final long MINUTE_IN_MILLIS = SECOND_IN_MILLIS * 60;
	public static final long HOUR_IN_MILLIS = MINUTE_IN_MILLIS * 60;
	public static final long DAY_IN_MILLIS = HOUR_IN_MILLIS * 24;
	public static final long WEEK_IN_MILLIS = DAY_IN_MILLIS * 7;

	int waittime =4000;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	ArrayList <WebElement>alist1;
	String newsfeedtime;
	String newsfeed;
	int i;
	String time1;
	String[] time;
	String act;
	long timeinmili;
	String secondtopfeed;
	String secondtoptime1;
	int secondtoptimeind;
	long secondtoptimeinmili;
		
	/**
	 * Web Elements
	 */
	By NewsFeedLink			=By.xpath("//*[@id=\"contnet\"]/div/div/div[1]/div/div/ul/li[1]/a");
	By topfeed1             =By.xpath("//a[@class='ajax-time']");
	//	By topfeed1				=By.xpath("//*[@id=\"post-505\"]/div/div[1]/div[3]/h6/span");
	By secondtop			=By.xpath("//*[@id=\"post-504\"]/div/div[1]/div[3]/h6/span[1]");

	public  String RecentNewsFeed() throws InterruptedException   {
					
		Log.info("Trying to validate recent post from News Feed.");

		js.executeScript("window.scrollBy(0, 500);");

		click(NewsFeedLink);
		Thread.sleep(30000);
		ArrayList<Long> set = new ArrayList<Long>();
		alist1= (ArrayList<WebElement>) driver.findElements(topfeed1);
		Thread.sleep(30000);
		for( i=0;i<alist1.size();i++) {
			newsfeedtime =alist1.get(i).getText();
			System.out.println(newsfeedtime);
			newsfeed = newsfeedtime.replaceAll("\\s.*", "");

			System.out.println(newsfeed);

			if(newsfeedtime.contains("d"))
			{
				long timeind= Integer.parseInt(newsfeed);
				timeinmili = timeind*DAY_IN_MILLIS;
				System.out.println(timeinmili);
				set.add(timeinmili);

			}
			else if (newsfeedtime.contains("w")) {
				long timeinw = Integer.parseInt(newsfeed);
				timeinmili = timeinw*WEEK_IN_MILLIS;
				System.out.println(timeinmili);
				set.add(timeinmili);
			}

			else if (newsfeedtime.contains("hrs")) {
				long timeinhrs = Integer.parseInt(newsfeed);
				timeinmili = timeinhrs*HOUR_IN_MILLIS;
				System.out.println(timeinmili);
				set.add(timeinmili);
			}
			else if(newsfeedtime.contains("now")) {

				System.out.println("Currently posted ");
				set.add(System.currentTimeMillis());
				LocalDateTime currenttime =  LocalDateTime.now();
				System.out.println(currenttime);

			}
			else if(newsfeedtime.contains("m")) {
				long timeinmin = Integer.parseInt(newsfeed);
				timeinmili = timeinmin*MINUTE_IN_MILLIS;
				System.out.println(timeinmili);
				set.add(timeinmili);
			}

		}	

		System.out.println(set);  


		long time =  set.get(0);
		System.out.println(time);

		int n = set.size(); 
		int arr[] = new int[n]; 

		int i = 0; 

		// using for-each loop to traverse through 
		// the set and adding each element to array
		for (long ele : set) 
			arr[i++] = (int) ele; 

		for(int res : arr)
		{
			System.out.print(res+ " ");
		}

		System.out.println();

		// getting the element at index 2
		System.out.print("   "+arr[1]);
		// millis var is a system current time

		long millis = System.currentTimeMillis(); 
		LocalDateTime currenttime =  LocalDateTime.now();
		System.out.println("  "+currenttime);
		System.out.println("  "+millis);

		/*
		 * int seconds1 = (int) (millis / 1000) % 60 ; int minutes1 = (int) ((millis /
		 * (1000*60)) % 60); int hours1 = (int) ((millis / (1000*60*60)) % 24); int days
		 * = (int) ((millis / (1000*60*60*24)) % 7); int weeks = (int) (millis /
		 * (1000*60*60*24*7));
		 */
		
		String str[] = new String[3];
		str[0]= "first post is most recent post in News feed";
		str[1] = "top 2 post are posted at the same time";
		str[2] = "post is currently posted";

		if(time == millis) {
			act = str[2];
			System.out.println(str[2]);
		}
		else if (time== arr[1]) {
			act = str[1];
			System.out.println(str[1]);
		}

		/*
		 * long difftime1 = millis-time;
		 * 
		 * 
		 * System.out.println("  "+ difftime1);
		 * 
		 * hours1 = (int)((difftime1/ (1000*60*60)) % 24); System.out.println("hours "+
		 * hours1 );
		 */
		else if(time<arr[1])
		{
			act = str[0];
			System.out.println(str[0]);
		}
		else {
			System.out.println("Second post is posted recently");
		}
		return act ;

		/*
					 	 if(time== arr[2]) {
					 		 System.out.println("top 2 post are posted at the same time");
					 	 }
					 	 else {

					 			 long difftime2= millis-arr[2];

					 			 System.out.println("  "+difftime2);
					 			days = (int)((difftime2/ (1000*60*60*24)) % 7);
							 	System.out.println("days "+days);*/

		/* 	 
					 	 if(time<arr[2])
					 	 {
					 		 System.out.println("first post has recently posted");
					 	 }
					 	 else {
					 		 System.out.println("Second post has posted recently");
					 	 }
					 	 }
		 */

	}

}		



