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
import org.junit.After as After
import org.testng.Assert as Assert

WebUI.callTestCase(findTestCase('Commission Login_Logout/Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Globalvalues/Icon_GlobalValues'))

WebUI.waitForElementPresent(findTestObject('HomePage_Commission/Commission_Globalvalues/Icon_GlobalValues'), 7)

'Clicking on Global Values icon'
WebUI.click(findTestObject('HomePage_Commission/Commission_Globalvalues/Icon_GlobalValues'))

'Verifying the linktext of Global Values'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Global_values')), Global_val)

println('User is able to navigate to Administration tab')

WebUI.waitForElementVisible(findTestObject('HomePage_Commission/Commission_Globalvalues/Link_Earning Codes'), 3)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Globalvalues/Link_Earning Codes'), FailureHandling.STOP_ON_FAILURE)

'Clicking on Earning Codes link'
WebUI.click(findTestObject('HomePage_Commission/Commission_Globalvalues/Link_Earning Codes'))

'Verifying the linktext of earning codes '
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Earning Codes')), EC_txt)

println('User Navigated to Earning Codes screen')

'Clicking on advance search icon if given condition gets passed'
if (WebUI.verifyElementClickable(findTestObject('AdvanceSearch_Page/Advanced_searchtext'))) {
    WebUI.click(findTestObject('AdvanceSearch_Page/Icon_Advanced Search'))

    println('Performing advance search')
} else {
    println('Failed to perform advance search')
}

'Clicking on fieldname text box'
WebUI.click(findTestObject('AdvanceSearch_Page/FieldName_DropDown'))

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Earning Code id'), 3)

WebUI.click(findTestObject('AdvanceSearch_Page/option_Earning Code id'))

'Clicking on comparision text box'
WebUI.click(findTestObject('AdvanceSearch_Page/td_Comparision'))

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

'Selecting the equal icon'
WebUI.click(findTestObject('AdvanceSearch_Page/option_Equals'))

WebUI.setText(findTestObject('AdvanceSearch_Page/td_Value'), earningCodeName)

'Clicking on Apply Search button'
WebUI.click(findTestObject('AdvanceSearch_Page/AppySearch_button'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

