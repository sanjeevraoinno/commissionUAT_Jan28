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
import org.junit.After as After
import org.testng.Assert as Assert

WebUI.callTestCase(findTestCase('Commission Login_Logout/Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Organizationdata/Icon_Organization'))

WebUI.waitForElementPresent(findTestObject('HomePage_Commission/Commission_Organizationdata/Icon_Organization'), 1)

'Clicking on Organization icon\r\n'
WebUI.click(findTestObject('HomePage_Commission/Commission_Organizationdata/Icon_Organization'))

'Verifying the linktext of Organization\r\n'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Organization')), ORG)

WebUI.waitForElementVisible(findTestObject('HomePage_Commission/Commission_Organizationdata/Link_Relationships'), 3)

WebUI.mouseOver(findTestObject('HomePage_Commission/Commission_Organizationdata/Link_Relationships'), FailureHandling.STOP_ON_FAILURE)

'Clicking on Relationship icon\r\n'
WebUI.click(findTestObject('HomePage_Commission/Commission_Organizationdata/Link_Relationships'))

'Verifying the linktext of Relationship\r\n'
Assert.assertEquals(WebUI.getText(findTestObject('Assertion_objects/Relationship')), Rel_txt)

WebUI.scrollToPosition(1, 0)

WebUI.waitForElementPresent(findTestObject('Page_Plan Tab/Span_New Roll Type'), 1)

'Clicking on new roll type icon'
WebUI.click(findTestObject('Page_Plan Tab/Span_New Roll Type'))

WebUI.setText(findTestObject('Page_Plan Tab/input_Roll Type Name'), New_roll_type)

'Clicking on save button'
WebUI.click(findTestObject('Page_Plan Tab/img'))

'Clicking on newly created roll type'
WebUI.click(findTestObject('Page_Plan Tab/span_NewRollTypeListcreated'))

'Clicking on create new relationship icon'
WebUI.click(findTestObject('Page_Plan Tab/span_Cancel_icon-file-plus2 co'))

WebUI.click(findTestObject('Page_Plan Tab/span_Ok'))

'Setting the position name'
WebUI.setText(findTestObject('Page_Plan Tab/input_Search positions below d (1)'), Position_val1)

'Clicking on search icon'
WebUI.click(findTestObject('Page_Plan Tab/Relation_searchicon'))

TestObject position1obj = new TestObject('Dynamic object')

String pos1object = Position_val1

String pos1txt_xapth = ('//*[normalize-space(text()) and normalize-space(.)="' + pos1object) + '"]'

position1obj.addProperty('xpath', ConditionType.EQUALS, pos1txt_xapth)

Thread.sleep(2000)

String pos1_text = WebUI.getText(position1obj)

'Drag and drop position name to source'
WebUI.dragAndDropToObject(position1obj, findTestObject('Page_Plan Tab/span_SourceDragPosition'))

'Setting the position name'
WebUI.setText(findTestObject('Page_Plan Tab/input_Search positions below d (1)'), Position_val2)

'Clicking on search icon'
WebUI.click(findTestObject('Page_Plan Tab/Relation_searchicon'))

TestObject position2obj = new TestObject('Dynamic object')

String pos2object = Position_val2

String pos2txt_xapth = ('//*[normalize-space(text()) and normalize-space(.)="' + pos2object) + '"]'

position2obj.addProperty('xpath', ConditionType.EQUALS, pos2txt_xapth)

Thread.sleep(2000)

String pos2_text = WebUI.getText(position2obj)

'Drag and drop position name to receiver'
WebUI.dragAndDropToObject(position2obj, findTestObject('Page_Plan Tab/span_Drop a position below as'))

WebUI.scrollToPosition(1, 1)

'Click on save icon to save the realationship'
WebUI.click(findTestObject('Page_Plan Tab/span_Pos1_icon-disk'))

