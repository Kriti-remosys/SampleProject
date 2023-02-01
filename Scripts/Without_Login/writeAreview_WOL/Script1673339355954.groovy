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

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_Gold Chains'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Buy Gold Chains Online in India  Gold _390133/a_The Gold Chain GCH01500872 Ships Faster'))

WebUI.switchToWindowTitle('The Gold Chain GCH01500872 Ships Faster by PC Jeweller')

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Gold Chain GCH01500872 Ships Faste_e7a5fb/h1_The Gold Chain GCH01500872 Ships Faster'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Gold Chain GCH01500872 Ships Faste_e7a5fb/a_Write Your Review'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_The Gold Chain GCH01500872 Ships Faste_e7a5fb/a_Login'), 
    'Login')

WebUI.closeBrowser()

