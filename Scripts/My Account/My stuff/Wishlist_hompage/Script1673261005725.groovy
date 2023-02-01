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

WebUI.callTestCase(findTestCase('Login_PC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_Earrings'))

WebUI.navigateToUrl('https://www.pcjeweller.com/jewellery/earrings.html')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond Earrings Online  Buy Lat_e6774d/a_The Binoy Gold Earrings'))

WebUI.switchToWindowTitle('The Binoy Gold Earrings by PC Jeweller')

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Binoy Gold Earrings by PC Jeweller/a_Jewellery_wish-req'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Binoy Gold Earrings by PC Jeweller/span_Please choose a category or enter a ke_d48421'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information - Wish list  Gold _89b13d/h3_The Binoy Gold Earrings'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information - Wish list  Gold _89b13d/div_My Wishlist_wish-closeBtn'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information - Wish list  Gold _89b13d/a_WelcomeRemo1'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information - Wish list  Gold _89b13d/a_Logout'))

WebUI.closeBrowser()

