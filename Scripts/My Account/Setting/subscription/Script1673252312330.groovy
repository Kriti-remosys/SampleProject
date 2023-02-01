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

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1 (1)/a_WelcomeRemoSys1'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1 (1)/a_My Account'))

WebUI.navigateToUrl('https://www.pcjeweller.com/user/account/')

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account  Gold  Diamond  Online Jewelle_3bdbfd (1)/a_Subscriptions'), 
    'Subscriptions')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account  Gold  Diamond  Online Jewelle_3bdbfd (1)/a_Subscriptions'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Subscriptions/label_Sign up for Promotional newsletter'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Subscriptions/label_Sign up for Merchant Followers newsletter'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Subscriptions/span_You must follow at least one merchant _347d2b'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Subscriptions/input_You must follow at least one merchant_234929'), 
    '')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Subscriptions/input_You must follow at least one merchant_234929'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Subscriptions/div_Your changes have been saved successfully'), 
    'Your changes have been saved successfully.')

WebUI.click(findTestObject('PCJ/Page_Account Information  Personal Information/a_WelcomeRemoSys1'))

WebUI.click(findTestObject('PCJ/Login/a_Logout'))

