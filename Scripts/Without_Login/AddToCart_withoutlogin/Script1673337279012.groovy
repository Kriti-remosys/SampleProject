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

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_Earrings'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Gold  Diamond Earrings Online  Buy Lat_e6774d/a_The Hoprah Diamond Sui Dhaga'), 
    'The Hoprah Diamond Sui Dhaga')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond Earrings Online  Buy Lat_e6774d/a_The Hoprah Diamond Sui Dhaga'))

WebUI.switchToWindowTitle('The Hoprah Diamond Sui Dhaga by PC Jeweller')

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Hoprah Diamond Sui Dhaga by PC Jeweller/h1_The Hoprah Diamond Sui Dhaga'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Hoprah Diamond Sui Dhaga by PC Jeweller/p_By PC Jeweller   Product Code OOEC00086ADD-FXY4F'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/ul_Write Your Review'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/div_Diamond Earrings'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/div_M.R.P  39,34833,446(Inclusive of all ta_7de5e6'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Hoprah Diamond Sui Dhaga by PC Jeweller/a_ADD TO CART'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_The Hoprah Diamond Sui Dhaga by PC Jeweller/span_Added to cart'), 
    'Added to cart')

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Hoprah Diamond Sui Dhaga by PC Jeweller/span_1'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Cart  Gold  Diamond  Online Jewellery _7d767c/a_The Hoprah Diamond Sui Dhaga'), 
    'The Hoprah Diamond Sui Dhaga')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Cart  Gold  Diamond  Online Jewellery _7d767c/div_Continue Shopping'))

WebUI.closeBrowser()

