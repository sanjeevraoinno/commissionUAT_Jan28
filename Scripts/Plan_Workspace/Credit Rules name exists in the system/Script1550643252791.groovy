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

WebUI.callTestCase(findTestCase('Commission Login_Logout/Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Plandata/Icon_PlanData'))

WebUI.waitForElementPresent(findTestObject('HomePage_Commission/Commission_Plandata/Icon_PlanData'), 2)

'Clicking on Plan data icon\r\n'
WebUI.click(findTestObject('HomePage_Commission/Commission_Plandata/Icon_PlanData'))

'Verifying the linktext of Plan data \r\n'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Plan data')), Plan_data)

WebUI.waitForElementVisible(findTestObject('HomePage_Commission/Commission_Plandata/Link_Rules'), 4)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Plandata/Link_Rules'), FailureHandling.STOP_ON_FAILURE)

'Clicking on Rules link\r\n'
WebUI.click(findTestObject('HomePage_Commission/Commission_Plandata/Link_Rules'))

'Verifying the linktext of Rules\r\n'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_Objects/Rules')), Rules_txt)

println('User navigated to Rules screen')

'Clicking on advance search icon if given condition gets passed\r\n'
if (WebUI.verifyElementClickable(findTestObject('AdvanceSearch_Page/Advanced_searchtext'))) {
    WebUI.click(findTestObject('AdvanceSearch_Page/Icon_Advanced Search'))

    println('Performing advance search')
} else {
    println('Failed to perform advance search')
}

'Clicking on fieldname text box\r\n'
WebUI.click(findTestObject('AdvanceSearch_Page/FieldName_DropDown'))

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Value'), 4)

WebUI.click(findTestObject('AdvanceSearch_Page/option_Value'))

'Clicking on comparision text box\r\n'
WebUI.click(findTestObject('AdvanceSearch_Page/td_Comparision'))

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

'Selecting the equal icon\r\n'
WebUI.click(findTestObject('AdvanceSearch_Page/option_Equals'))

WebUI.setText(findTestObject('AdvanceSearch_Page/td_Value'), RuleName)

'Clicking on Apply Search button\r\n'
WebUI.click(findTestObject('AdvanceSearch_Page/AppySearch_button'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

