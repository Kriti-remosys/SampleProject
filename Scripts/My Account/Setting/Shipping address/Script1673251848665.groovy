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

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1 (1)/span_Welcome'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1 (1)/a_My Account'))

WebUI.navigateToUrl('https://www.pcjeweller.com/user/account/')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account  Gold  Diamond  Online Jewelle_3bdbfd (1)/a_Shipping Address'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/a_Add New Address'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/input__shippingFname'))

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/input__shippingFname'), 
    'Remo')

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/input__shippingAddress1'), 
    'Address 1')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/input_Address 2_shippingAddress2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/select_SelectAndaman and Nicobar IslandsAnd_5dc6ba'), 
    '1493', true)

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/input__shippingCity'), 
    'pune')

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/input__shippingZip'), 
    'Test')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/label_Make this my primary shipping address'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/input_Make this my primary shipping address_submit'), 
    '')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/input_Make this my primary shipping address_submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/div_Shipping Details Updated'), 
    'Shipping Details Updated.')

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/label_Remo , Address 1, Maharashtra, pune, _ae4225'), 
    'Remo , Address 1, Maharashtra, pune, Test, India')

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/a_Shipping Details Updated_icon-edit editAddress'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/a_Shipping Details Updated_icon-delete marg_9901dc'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/a_Add New Address'), 
    'Add New Address')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/a_Welcome RemoSys1'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Gold  Diamond  On_6e1087/a_Logout'))

WebUI.closeBrowser()

