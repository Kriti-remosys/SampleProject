import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_Silver'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Buy Silver Jewellery Online  Latest De_50751b/a_VIEW DETAILS_addToWishList  icon-like'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Buy Silver Jewellery Online  Latest De_50751b/a_Login'), 
    'Login')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Buy Silver Jewellery Online  Latest De_50751b/span_Login_icon-cross icon-exchange log-close'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Buy Silver Jewellery Online  Latest De_50751b/a_10 Gram Laxmi Ganesh Silver Coin - Round'))

WebUI.switchToWindowTitle('10 Gram Laxmi Ganesh Silver Coin by PC Jeweller')

WebUI.click(findTestObject('Object Repository/PCJ/Page_10 Gram Laxmi Ganesh Silver Coin by PC_2bf219/h1_10 Gram Laxmi Ganesh Silver Coin - Round'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_(1) New Message/a_Jewellery_wish-req'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_10 Gram Laxmi Ganesh Silver Coin by PC_2bf219/a_Login'), 
    'Login')

WebUI.click(findTestObject('Object Repository/PCJ/Page_10 Gram Laxmi Ganesh Silver Coin by PC_2bf219/span_Login_icon-cross icon-exchange log-close'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_10 Gram Laxmi Ganesh Silver Coin by PC_2bf219/span_Please choose a category or enter a ke_d48421'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_10 Gram Laxmi Ganesh Silver Coin by PC_2bf219/a_Login'), 
    'Login')

WebUI.closeBrowser()

