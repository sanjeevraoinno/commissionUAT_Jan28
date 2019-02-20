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

WebUI.waitForPageLoad(5)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('AdvanceSearch_Page/Icon_Advanced Search'))

WebUI.waitForElementVisible(findTestObject('AdvanceSearch_Page/FieldName_DropDown'), 2)

WebUI.click(findTestObject('AdvanceSearch_Page/FieldName_DropDown'))

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Value'), 4)

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/option_Value'), 2)

WebUI.click(findTestObject('AdvanceSearch_Page/option_Value'))

WebUI.click(findTestObject('AdvanceSearch_Page/td_Comparision'))

WebUI.waitForElementVisible(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

WebUI.click(findTestObject('AdvanceSearch_Page/option_Equals'))

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/td_Value'), 5)

WebUI.click(findTestObject('AdvanceSearch_Page/td_Value'))

WebUI.setText(findTestObject('AdvanceSearch_Page/td_Value'), SerachString)

WebUI.waitForElementClickable(findTestObject('AdvanceSearch_Page/AppySearch_button'), 2)

WebUI.click(findTestObject('AdvanceSearch_Page/AppySearch_button'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

