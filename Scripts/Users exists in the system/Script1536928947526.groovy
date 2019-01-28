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

not_run: WebUI.callTestCase(findTestCase('Commission Login'), [('Password') : 'Augg@1234', ('Username') : 'rkulkarn@calliduscloud.com'
        , ('Url') : 'https://biz3-tst.callidusondemand.com/SalesPortal/#!/'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Commission Login - Copy'), [('Url') : 'https://ca1-lvcomapp-int6.callidussoftware.com:444/SalesPortal/#!/'
        , ('Username') : 'PortalAdmin', ('Password') : 'PortalAdmin'], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Callidus Cloud Commissions Man/div_ADMINISTRATION'))

WebUI.delay(3)

println('User is able to naviagte to Administration tab')

WebUI.scrollToElement(findTestObject('Page_Callidus Cloud Commissions Man/a_Users'), 15)

WebUI.delay(4)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/a_Users'))

println('User Naviagted to Users screen')

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/a_Advanced Search'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/td_Field Name'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Callidus Cloud Commissions Man/option_UserName'), 7)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/option_UserName'))

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/td_Comparision'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Callidus Cloud Commissions Man/option_Equals'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/option_Equals'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Callidus Cloud Commissions Man/td_Value'), UserName)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/input_Apply Search'))

CustomKeywords.'globalkeywords.record.RecordNotFound'()

