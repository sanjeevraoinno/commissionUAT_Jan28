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

WebUI.delay(6)

WebUI.mouseOver(findTestObject('Page_Callidus Cloud Commissions Man/div_ADMINISTRATION'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Page_Callidus Cloud Commissions Man/a_Fixed Value Types'), 6)

WebUI.delay(4)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/a_Fixed Value Types'))

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/span_Fixed Value Type Summary_'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Callidus Cloud Commissions Man/input_Create_FixedValueType'), 'FixedValuetype_demo')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/a_Save'))

