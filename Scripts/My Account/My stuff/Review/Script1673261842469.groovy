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

WebUI.click(findTestObject('Object Repository/PCJ/Page_(1) New Message/a_Write Your Review'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Discussion  Gold  Diamond  Online Jewe_5bcf47/a_4'))

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Discussion  Gold  Diamond  Online Jewe_5bcf47/input__reviewTitle'), 
    'title')

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Discussion  Gold  Diamond  Online Jewe_5bcf47/textarea__reviewText'), 
    'comment')

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Discussion  Gold  Diamond  Online Jewe_5bcf47/input_Enter comment_submitProductreview'), 
    '')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Discussion  Gold  Diamond  Online Jewe_5bcf47/input_Enter comment_submitProductreview'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_The Taksh Diamond Ring  PC Jeweller/div_Your comments submitted successfully It_f87cb7'), 
    'Your comments submitted successfully!!! It will be posted after the admin approval')

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Taksh Diamond Ring  PC Jeweller/a_WelcomeRemo1'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_The Taksh Diamond Ring  PC Jeweller/a_My Account'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account  Gold  Diamond  Online Jewelle_3bdbfd/a_My Reviews'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  My Reviews/a_Merchant Reviews_icon-edit rewEdit'), 
    '')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  My Reviews/a_Merchant Reviews_icon-edit rewEdit'))

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Review Edit/input_Please give the product a star rating_fa4289'), 
    'title1')

WebUI.setText(findTestObject('Object Repository/PCJ/Page_Account Information  Review Edit/textarea_comment'), '1')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  Review Edit/input_Please Write a Comment_submitReviewComment'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  My Reviews/div_Updated Successfully'), 
    'Updated Successfully')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  My Reviews/span_Merchant Reviews_pull-right'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  My Reviews/a_Merchant Reviews_review_delete rewdlte ic_f067f4'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  My Reviews/input_Are you sure you want to delete this _f2323e'))

WebUI.verifyElementText(findTestObject('Object Repository/PCJ/Page_Account Information  My Reviews/div_Deleted Successfully'), 
    'Deleted Successfully')

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  My Reviews/a_WelcomeRemo1'))

WebUI.click(findTestObject('Object Repository/PCJ/Page_Account Information  My Reviews/a_Logout'))

