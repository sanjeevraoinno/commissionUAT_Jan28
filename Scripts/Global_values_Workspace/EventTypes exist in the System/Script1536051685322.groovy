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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import org.junit.After as After
import org.testng.Assert as Assert

WebUI.callTestCase(findTestCase('Commission Login_Logout/Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('HomePage_Commission/Commission_Globalvalues/Icon_GlobalValues'), 5)

'Clicking on Global Values icon'
WebUI.click(findTestObject('HomePage_Commission/Commission_Globalvalues/Icon_GlobalValues'))

'Verifying the linktext of Global Values'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Global_values')), Global_val)

println('User is able to navigate to Global Variable Icon')

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Globalvalues/Link_EventTypes'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('HomePage_Commission/Commission_Globalvalues/Link_EventTypes'), 5)

'Clicking on Event Types link'
WebUI.click(findTestObject('HomePage_Commission/Commission_Globalvalues/Link_EventTypes'))

'Verifying the lintext of Event Types'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Event Types')), ET_txt)

println('User Navigated to Event Type screen')

WebUI.waitForPageLoad(5)

WebUI.scrollToPosition(0, 0)

'Clicking on advance search icon if given condition gets passed'
if (WebUI.verifyElementClickable(findTestObject('AdvanceSearch_Page/Advanced_searchtext'))) {
    WebUI.click(findTestObject('AdvanceSearch_Page/Icon_Advanced Search'))

    println('Performing advance search')
} else {
    println('Failed to perform advance search')
}

WebUI.waitForElementVisible(findTestObject('AdvanceSearch_Page/FieldName_DropDown'), 5)

'Clicking on fieldname text box'
WebUI.click(findTestObject('AdvanceSearch_Page/FieldName_DropDown'))

WebUI.waitForElementVisible(findTestObject('AdvanceSearch_Page/option_Event Type id'), 2)

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Event Type id'), 3)

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/option_Event Type id'), 2)

WebUI.click(findTestObject('AdvanceSearch_Page/option_Event Type id'))

'Clicking on comparision text box'
WebUI.click(findTestObject('AdvanceSearch_Page/td_Comparision'))

WebUI.waitForElementVisible(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

'Selecting the equal icon'
WebUI.click(findTestObject('AdvanceSearch_Page/option_Equals'))

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/td_Value'), 2)

WebUI.click(findTestObject('AdvanceSearch_Page/td_Value'))

WebUI.setText(findTestObject('AdvanceSearch_Page/td_Value'), eventTypeName)

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/AppySearch_button'), 2)

'Clicking on Apply Search button'
WebUI.click(findTestObject('AdvanceSearch_Page/AppySearch_button'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

