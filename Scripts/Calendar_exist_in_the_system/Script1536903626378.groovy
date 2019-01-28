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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.callTestCase(findTestCase('Commission Login'), [('Password') : 'Kiran09@@', ('Username') : 'kikosana@calliduscloud.com'
        , ('Url') : 'https://biz3-tst.callidusondemand.com/SalesPortal/#!/'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.mouseOver(findTestObject('Page_Callidus Cloud Commissions Man/div_ADMINISTRATION'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Page_Callidus Cloud Commissions Man/Calendar'), 1)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/Calendar'))

if (WebUI.verifyTextPresent('Main Monthly Calendar', true)) {
    System.out.println('Able to find the record')

    WebUI.callTestCase(findTestCase('Commission Logout'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    System.out.println('No Records Found')
}

