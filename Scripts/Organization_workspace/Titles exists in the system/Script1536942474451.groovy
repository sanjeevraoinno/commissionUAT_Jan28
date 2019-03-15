import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.testng.Assert as Assert

WebUI.callTestCase(findTestCase('Commission Login_Logout/Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Organizationdata/Icon_Organization'))

WebUI.waitForElementPresent(findTestObject('HomePage_Commission/Commission_Organizationdata/Icon_Organization'), 1)

'Clicking on Organization icon\r\n'
WebUI.click(findTestObject('HomePage_Commission/Commission_Organizationdata/Icon_Organization'))

'Verifying the linktext of Organization\r\n'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Organization')), ORG)

println('User is able to navigate to Administration tab')

WebUI.waitForElementVisible(findTestObject('HomePage_Commission/Commission_Organizationdata/Link_Titles'), 4)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Organizationdata/Link_Titles'), FailureHandling.STOP_ON_FAILURE)

'Clicking on Titles link\r\n\r\n'
WebUI.click(findTestObject('HomePage_Commission/Commission_Organizationdata/Link_Titles'))

'Verifying the linktext of Titles\r\n'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Titles')), Titletxt)

println('User navigated to Titles screen')

'Clicking on advance search icon if given condition gets passed\r\n'
if (WebUI.verifyElementClickable(findTestObject('AdvanceSearch_Page/Advanced_searchtext'))) {
    WebUI.click(findTestObject('AdvanceSearch_Page/Icon_Advanced Search'))

    println('Performing advance search')
} else {
    println('Failed to perform advance search')
}

'Clicking on fieldname text box\r\n'
WebUI.click(findTestObject('AdvanceSearch_Page/FieldName_DropDown'))

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Tittle_fieldName'), 4)

WebUI.click(findTestObject('AdvanceSearch_Page/option_Tittle_fieldName'))

'Clicking on comparision text box\r\n'
WebUI.click(findTestObject('AdvanceSearch_Page/td_Comparision'))

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

'Selecting the equal icon\r\n'
WebUI.click(findTestObject('AdvanceSearch_Page/option_Equals'))

WebUI.setText(findTestObject('AdvanceSearch_Page/td_Value'), TitleName)

'Clicking on Apply Search button\r\n'
WebUI.click(findTestObject('AdvanceSearch_Page/AppySearch_button'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

