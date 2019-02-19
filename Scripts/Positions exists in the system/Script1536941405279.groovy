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

WebUI.callTestCase(findTestCase('Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Organization Tab/div_Organization'))

WebUI.delay(3)

println('User is able to naviagte to Administration tab')

WebUI.scrollToElement(findTestObject('Page_Organization Tab/a_Positions'), 2)

WebUI.delay(4)

WebUI.click(findTestObject('Page_Organization Tab/a_Positions'))

println('User Naviagted to Positions screen')

WebUI.click(findTestObject('AdvanceSearch_Page/Icon_Advanced Search'))

WebUI.delay(3)

WebUI.click(findTestObject('AdvanceSearch_Page/FieldName_DropDown'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Organization Tab/option_Position_Name'), 9)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Organization Tab/option_Position_Name'))

WebUI.click(findTestObject('AdvanceSearch_Page/td_Comparision'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('AdvanceSearch_Page/option_Equals'))

WebUI.delay(2)

WebUI.setText(findTestObject('AdvanceSearch_Page/td_Value'), Position)

WebUI.delay(2)

WebUI.click(findTestObject('null'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

