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

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_WelcomeRemoSys1'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_My Account'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account  Gold  Diamond  Online Jewelle_3bdbfd/a_Change Password'), 
    'Change Password')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account  Gold  Diamond  Online Jewelle_3bdbfd/a_Change Password'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Change Password/h2_Reset Password'), 
    'Reset Password')

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Change Password/div_draftcardtesting1gmail.com'), 
    'draftcardtesting1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/PCJ/Page_Account Information  Change Password/input__userPassword1'), 
    '7q1aKE1wHhQjVkZDsO80LQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/PCJ/Page_Account Information  Change Password/input__userNewPassword'), 
    '7q1aKE1wHhQjVkZDsO80LQ==')

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Change Password/input_Enter PasswordPassword Mismatch_reset_54700c'), 
    '')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Change Password/input_Enter PasswordPassword Mismatch_reset_54700c'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Change Password/div_Your changes have been saved successfully'), 
    'Your changes have been saved successfully.')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Change Password/a_WelcomeRemoSys1'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Change Password/a_Logout'))

