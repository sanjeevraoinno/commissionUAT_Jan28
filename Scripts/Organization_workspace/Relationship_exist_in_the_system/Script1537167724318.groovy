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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('Commission Login_Logout/Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Organizationdata/Icon_Organization'))

WebUI.scrollToElement(findTestObject('HomePage_Commission/Commission_Organizationdata/Link_Relationships'), 3)

WebUI.click(findTestObject('HomePage_Commission/Commission_Organizationdata/Link_Relationships'))

WebUI.scrollToPosition(1, 0)

WebUI.waitForElementPresent(findTestObject('Page_Plan Tab/Span_New Roll Type'), 1)

WebUI.click(findTestObject('Page_Plan Tab/Span_New Roll Type'))

WebUI.setText(findTestObject('Page_Plan Tab/input_Roll Type Name'), New_roll_type)

WebUI.click(findTestObject('Page_Plan Tab/img'))

WebUI.click(findTestObject('Page_Plan Tab/span_NewRollTypeListcreated'))

WebUI.click(findTestObject('Page_Plan Tab/span_Cancel_icon-file-plus2 co'))

WebUI.click(findTestObject('Page_Plan Tab/span_Ok'))



WebUI.setText(findTestObject('Page_Plan Tab/input_Search positions below d (1)'), Position_val1)

WebUI.click(findTestObject('Page_Plan Tab/Relation_searchicon'))

TestObject position1obj = new TestObject('Dynamic object')

String pos1object = Position_val1

String pos1txt_xapth = ('//*[normalize-space(text()) and normalize-space(.)="'+ pos1object) +'"]'

position1obj.addProperty('xpath', ConditionType.EQUALS, pos1txt_xapth)

Thread.sleep(2000)

String pos1_text = WebUI.getText(position1obj)

WebUI.dragAndDropToObject(position1obj, findTestObject('Page_Plan Tab/span_SourceDragPosition'))


WebUI.setText(findTestObject('Page_Plan Tab/input_Search positions below d (1)'), Position_val2)

WebUI.click(findTestObject('Page_Plan Tab/Relation_searchicon'))



TestObject position2obj = new TestObject('Dynamic object')

String pos2object = Position_val2

String pos2txt_xapth = ('//*[normalize-space(text()) and normalize-space(.)="'+ pos2object) +'"]'

position2obj.addProperty('xpath', ConditionType.EQUALS, pos2txt_xapth)

Thread.sleep(2000)

String pos2_text = WebUI.getText(position2obj)


WebUI.dragAndDropToObject(position2obj, findTestObject('Page_Plan Tab/span_Drop a position below as'))

WebUI.scrollToPosition(1, 1)

WebUI.click(findTestObject('Page_Plan Tab/span_Pos1_icon-disk'))

