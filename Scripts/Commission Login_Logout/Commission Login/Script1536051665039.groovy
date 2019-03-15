import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import org.testng.Assert as Assert

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.BecURL)

WebUI.maximizeWindow()

//User can verify that whether login page has loaded or not  
'Verifying login page has loaded correctly\r\n'
Assert.assertEquals(WebUI.getText(findTestObject('LoginPage/Header_homepage')), header_name)

'Providing the Username'
WebUI.setText(findTestObject('LoginPage/input_Username_username'), GlobalVariable.Bec_UserName)

'Password to be provided in the text box'
WebUI.setText(findTestObject('LoginPage/input_Password_password'), GlobalVariable.Bec_Password)

WebUI.waitForElementClickable(findTestObject('LoginPage/Login_Button'), 2)

'Clicking  the submit button '
WebUI.click(findTestObject('LoginPage/Login_Button'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('MessagesPage/Icon_Apps'))

WebUI.mouseOver(findTestObject('MessagesPage/Link_Commissions'))

WebUI.scrollToElement(findTestObject('MessagesPage/Link_Commissions'), 1)

'Clicking on Commissions link \r\n'
WebUI.click(findTestObject('MessagesPage/Link_Commissions'))

'Verifying the Username'
WebUI.click(findTestObject('LoginPage/User_id'))

WebUI.waitForElementVisible(findTestObject('LoginPage/user_name'), 1)

'Verifying Commissions has loaded correctly'
Assert.assertEquals(WebUI.getText(findTestObject('LoginPage/user_name')), User_name)

WebUI.waitForPageLoad(3)

