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

not_run: WebUI.callTestCase(findTestCase('Commission Login'), [('Password') : 'PortalAdmin', ('Username') : 'PortalAdmin'
        , ('Url') : 'https://ca1-lvcomapp-int6.callidussoftware.com:444/SalesPortal/#!/'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(5)

WebUI.mouseOver(findTestObject('Page_Plan Tab/a_Plan'))

not_run: WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Page_Plan Tab/a_Rules'), 4)

not_run: WebUI.delay(4)

WebUI.click(findTestObject('Page_Plan Tab/a_Rules'))

println('User Naviagted to Rules screen')

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/a_Advanced Search'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/td_Field Name'))

not_run: WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Plan Tab/a_Field_name'), 4)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Page_Plan Tab/a_Field_name'))

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/td_Comparision'))

not_run: WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Callidus Cloud Commissions Man/option_Equals'), 2)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/option_Equals'))

not_run: WebUI.delay(2)

WebUI.setText(findTestObject('Page_Callidus Cloud Commissions Man/td_Value'), RuleName)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/input_Apply Search'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

not_run: WebUI.delay(0)

not_run: WebUI.closeBrowser()

