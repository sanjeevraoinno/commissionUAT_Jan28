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
import org.junit.After as After
import org.testng.Assert as Assert

// Verifying the existence of Fixed Value
WebUI.callTestCase(findTestCase('Commission Login_Logout/Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_CompensationElements/Icon_Compensationelement'))

WebUI.waitForElementPresent(findTestObject('HomePage_Commission/Commission_CompensationElements/Icon_Compensationelement'), 
    3)

'Clicking on Compensation Elements icon '
WebUI.click(findTestObject('HomePage_Commission/Commission_CompensationElements/Icon_Compensationelement'))

'Verifying the linktext of Compensation Elements'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Compensation_elements')), Compensation_ele)

println('User is able to navigate to Plan tab')

WebUI.waitForElementVisible(findTestObject('HomePage_Commission/Commission_CompensationElements/Link_Fixed Value'), 1)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_CompensationElements/Link_Fixed Value'), FailureHandling.STOP_ON_FAILURE)

'Clicking on Fixed value link\r\n'
WebUI.click(findTestObject('HomePage_Commission/Commission_CompensationElements/Link_Fixed Value'))

'Verifying  the lintext of fixed value\r\n'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Fixed_value')), FV_Name)

println('User Navigated to Fixed Values screen')

'Clicking on advance search icon if given condition gets passed'
if (WebUI.verifyElementClickable(findTestObject('AdvanceSearch_Page/Advanced_searchtext'))) {
    WebUI.click(findTestObject('AdvanceSearch_Page/Icon_Advanced Search'))

    println('Performing advance search')
} else {
    println('Failed to perform advance search')
}

'Clicking on fieldname text box\r\n'
WebUI.click(findTestObject('AdvanceSearch_Page/FieldName_DropDown'))

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Compensations Elements'), 4)

WebUI.click(findTestObject('AdvanceSearch_Page/option_Compensations Elements'))

'Clicking on comparision text box\r\n'
WebUI.click(findTestObject('AdvanceSearch_Page/td_Comparision'))

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

'Selecting the equal icon'
WebUI.click(findTestObject('AdvanceSearch_Page/option_Equals'))

WebUI.setText(findTestObject('AdvanceSearch_Page/td_Value'), FIX_VAL)

'Clicking on Apply Search button '
WebUI.click(findTestObject('AdvanceSearch_Page/AppySearch_button'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

