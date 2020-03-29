package Academy;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pageobjects.HomePage;
import Pageobjects.SwitchtoPage;
import resourses.base;

public class Login extends base
{
//	 public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initalise() throws IOException
	{
		driver=initialiseDriver();
//		log.info("driver is initialised");
	
		
	}
	@Test
	public void basepagenavigation() throws IOException, InterruptedException
	{
		
		driver.get(prop.getProperty("url"));
	
       HomePage hp=new HomePage(driver);
       hp.getEmail().sendKeys("testing4hobby@gmail.com");
       hp.getEnterbtn().click();
	
   	

//	framePage fp=new framePage(driver);
//	driver.get("http://demo.automationtesting.in/Frames.html");
//	driver.switchTo().frame("SingleFrame");
//	fp.getText().sendKeys("jhsjkdfhjk");
//	driver.switchTo().defaultContent();
//	fp.getFrame().click();
//	driver.switchTo().frame(1);
//	driver.switchTo().frame(0);
//	fp.gerSframe().sendKeys("sdfsdfsdhgh");
//	WindowsPage wp=new WindowsPage(driver);
//	driver.get("http://demo.automationtesting.in/Windows.html");
//	wp.getnewTabbedWindow().click();
//	driver.close();
//	AccordianPage ap=new AccordianPage (driver);
//	driver.get("http://demo.automationtesting.in/Accordion.html");
//	ap.getFirstCollapse().click();
//	ap.getSecondCollapse().click();
//	ap.getthirdCollapse().click();
//	ap.getforthCollapse().click();
//	AutocompletePage ac=new AutocompletePage(driver);
//	driver.get("http://demo.automationtesting.in/AutoComplete.html");
//	ac.getAutocompletebox().sendKeys("fjshfjhs");
//	DatepickerPage dp=new DatepickerPage(driver);
//	driver.get("http://demo.automationtesting.in/Datepicker.html");
//	Thread.sleep(3000);
//	dp.getCalander().click();
//	dp.getMonth();
//	dp.getDates();
 
	
//	Staticdraganddrop sd= new Staticdraganddrop(driver);
//	sd.getInteraction().click();
//    sd.getDragnddrop();
//    sd.getStatic();
//    Thread.sleep(5000);
//    sd.performDragandDrop();
//    SelectablePage stp=new SelectablePage(driver);
//    driver.get("http://demo.automationtesting.in/Selectable.html");
//    stp.getSerialseButton().click();
//    stp.getlistofElement();
//    driver.get("http://demo.automationtesting.in/Resizable.html");
//    ResizeelementPage re=new ResizeelementPage(driver);
//    re.getResizeelement();
//	driver.get("http://demo.automationtesting.in/TinyMCE.html");
//	TinyMCEPage tp=new TinyMCEPage (driver);
//	tp.getTinyMCE();
//	driver.get("http://demo.automationtesting.in/CKEditor.html");
//	CKEDitorPage cp=new CKEDitorPage(driver);
//	cp.getEditor();
//	
//	driver.get("http://demo.automationtesting.in/SummerNote.html");
//	SummernotePage sn=new SummernotePage(driver);
//	sn.getSummernote().clear();
//	sn.getSummernote().sendKeys("fdfsdfds");
//	driver.get("http://demo.automationtesting.in/CodeMirror.html");
//	CodemirrorPage cp=new CodemirrorPage(driver);

//	cp.gettextArea().sendKeys("hhtyfghfhftyrty");
//    driver.get("http://demo.automationtesting.in/DynamicData.html");
//    DynamicdataPage  dpg=new DynamicdataPage(driver);
//    dpg.getButton().click();
//    driver.get("http://demo.automationtesting.in/FileDownload.html");
//    FiledownloadPage fdp=new FiledownloadPage (driver);
//    fdp.getTextarea().sendKeys("hgfhgfhfh");
//    fdp.getGeneratebtn().click();
//    fdp.getDownloadlink().click();
//    Alert at=driver.switchTo().alert();
//    at.accept();
//    driver.get("http://demo.automationtesting.in/FileUpload.html");
//    FileUploadPage fup=new FileUploadPage(driver);
//    fup.getimage().sendKeys("C:\\Users\\user\\Pictures\\dsc085421.jpg");
//    fup.getSubmition().click();
//   driver.get("http://demo.automationtesting.in/JqueryProgressBar.html");
//   ProgressbarPage pb=new ProgressbarPage(driver);
//   pb.getbutton().click();
//   Thread.sleep(3000);
//   driver.switchTo().frame("aswift_1");
//   pb.getClosebtn().click();
//   driver.get("http://demo.automationtesting.in/Loader.html");
//   loderPage lpg=new loderPage (driver);
//   lpg.getRunbtn().click();
   
//   driver.switchTo().frame("aswift_0");
//   Thread.sleep(4000);
//   lpg.getClosebtn().click();
//   driver.get("cricle-btn");
//   driver.get("http://demo.automationtesting.in/ProgressBar.html");
//   LoadingprogreebarPage lpr=new LoadingprogreebarPage(driver);
//		lpr.getbar().click();   
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	}


