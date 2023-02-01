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

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_WelcomeRemoSys1'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_My Account'))

WebUI.navigateToUrl('https://www.pcjeweller.com/user/account/')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account  Gold  Diamond  Online Jewelle_3bdbfd/a_Address'))

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Address/input__userAdress1'), 'Test 1')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Address/input_Address 2_userAdress2'))

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Address/input_Address 2_userAdress2'), 'test 2')

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Address/input_Mobile Number_userPhone'), '1234567891')

WebUI.selectOptionByValue(findTestObject('Object Repository/PCJ/Page_Account Information  Address/select_SelectIndiaUnited Arab EmiratesUnite_d26500'), 
    '99', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PCJ/Page_Account Information  Address/select_SelectAndaman and Nicobar IslandsAnd_5dc6ba'), 
    '1493', true)

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Address/input__userCity'), 'pune')

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Address/input__userZip'), '123456')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Address/input_Enter Pin Code_submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Address/div_Your changes have been saved successfully'), 
    'Your changes have been saved successfully.')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Address/a_WelcomeRemoSys1'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Address/a_Logout'))

