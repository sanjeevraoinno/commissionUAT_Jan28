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

WebUI.callTestCase(findTestCase('Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('HomePage_Commission/Icon_GlobalValues'), 5)

WebUI.click(findTestObject('HomePage_Commission/Icon_GlobalValues'))

println('User is able to naviagte to Global Variable Icon')

WebUI.mouseOver(findTestObject('Globalvalues_Page/Link_EventTypes'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Globalvalues_Page/Link_EventTypes'), 5)

WebUI.click(findTestObject('Globalvalues_Page/Link_EventTypes'))

println('User Naviagted to Event Type screen')

WebUI.waitForPageLoad(5)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('AdvanceSearch_Page/Icon_Advanced Search'))

WebUI.waitForElementVisible(findTestObject('AdvanceSearch_Page/FieldName_DropDown'), 5)

WebUI.click(findTestObject('AdvanceSearch_Page/FieldName_DropDown'))

WebUI.waitForElementVisible(findTestObject('AdvanceSearch_Page/option_Event Type id'), 2)

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Event Type id'), 3)

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/option_Event Type id'), 2)

WebUI.click(findTestObject('AdvanceSearch_Page/option_Event Type id'))

WebUI.click(findTestObject('AdvanceSearch_Page/td_Comparision'))

WebUI.waitForElementVisible(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

WebUI.click(findTestObject('AdvanceSearch_Page/option_Equals'))

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/td_Value'), 2)

WebUI.click(findTestObject('AdvanceSearch_Page/td_Value'))

WebUI.setText(findTestObject('AdvanceSearch_Page/td_Value'), eventTypeName)

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/AppySearch_button'), 2)

WebUI.click(findTestObject('AdvanceSearch_Page/AppySearch_button'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

