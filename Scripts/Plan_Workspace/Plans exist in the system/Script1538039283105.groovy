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

'Clicking on Plan data Icon'
WebUI.click(findTestObject('HomePage_Commission/Commission_Plandata/Icon_PlanData'))

'Verifying the linktext of Plan data \r\n'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Plan data')), Plan_data)

println('User is able to navigate to Plan tab')

WebUI.waitForElementVisible(findTestObject('HomePage_Commission/Commission_Plandata/Link_Plan'), 2)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Plandata/Link_Plan'))

'Clicking on Plans link\r\n\r\n\r\n'
WebUI.click(findTestObject('HomePage_Commission/Commission_Plandata/Link_Plan'))

'Verifying the linktext of Plans \r\n'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Plans')), Plan_txt)

println('User navigated to Plans screen')

WebUI.callTestCase(findTestCase('Script_For_Advancesearch/AdvanceSearch'), [('SerachString') : 'Plan_Raj'], FailureHandling.STOP_ON_FAILURE)

