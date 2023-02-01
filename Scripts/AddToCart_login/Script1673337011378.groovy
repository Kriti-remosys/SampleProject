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

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_Rings'))

WebUI.navigateToUrl('https://www.pcjeweller.com/jewellery/rings.html')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Gold  Diamond Rings Online  Buy Latest_e6139c/img_FILTERED BY_img-responsive ls-is-cached_61787d'))

WebUI.switchToWindowTitle('The Taksh Diamond Ring | PC Jeweller')

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_The Taksh Diamond Ring  PC Jeweller/a_ADD TO CART'), 
    'ADD TO CART')

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/div_Select SizeSelect Size11121314151617181_1d97de'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Taksh Diamond Ring  PC Jeweller/li_12'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Taksh Diamond Ring  PC Jeweller/a_ViewHide price breakup'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/a_ViewHide Customize Design'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/div_Yellow GoldWhite GoldYellow Gold'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/li_White Gold'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Taksh Diamond Ring  PC Jeweller/span_18KT'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/span_14KT'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/span_JK-VSSI'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/span_GH-VSSI'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Taksh Diamond Ring  PC Jeweller/a_ADD TO CART'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_(2) New Messages/span_Added to cart'), 'Added to cart')

WebUI.click(findTestObject('Object Repository/PCJ/Page_(2) New Messages/a_2'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Cart  Gold  Diamond  Online Jewellery _7d767c/a_The Taksh Diamond Ring'), 
    'The Taksh Diamond Ring')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Cart  Gold  Diamond  Online Jewellery _7d767c/span_Welcome'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Cart  Gold  Diamond  Online Jewellery _7d767c/a_Logout'))

