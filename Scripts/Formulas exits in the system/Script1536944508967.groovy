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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Callidus Cloud Commissions Man/div_PLAN'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Page_Plan Tab/a_Formulas'), 9)

WebUI.click(findTestObject('Page_Plan Tab/a_Formulas'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/a_Advanced Search'))

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/td_Field Name'))

WebUI.scrollToElement(findTestObject('Page_Plan Tab/a_FormulaName'), 4)

WebUI.click(findTestObject('Page_Plan Tab/a_FormulaName'))

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/td_Comparision'))

WebUI.scrollToElement(findTestObject('Page_Callidus Cloud Commissions Man/option_Equals'), 2)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/option_Equals'))

WebUI.setText(findTestObject('Page_Callidus Cloud Commissions Man/td_Value'), Formulas)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/input_Apply Search'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

