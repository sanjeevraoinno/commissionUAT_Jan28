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

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('null'))

WebUI.delay(5)

if (true) {
    println('User is able to naviagte to Administration tab')

    WebUI.scrollToElement(findTestObject('HomePage_Commission/Commission_Globalvalues/Link_Credit Types'), 2)

    WebUI.delay(4)

    WebUI.click(findTestObject('HomePage_Commission/Commission_Globalvalues/Link_Credit Types'))

    if (true) {
        println('User Naviagted to Credit Types screen')

        WebUI.click(findTestObject('AdvanceSearch_Page/Icon_Advanced Search'))

        WebUI.delay(3)

        WebUI.click(findTestObject('AdvanceSearch_Page/FieldName_DropDown'))

        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_credit types id'), 2)

        WebUI.delay(2)

        WebUI.click(findTestObject('AdvanceSearch_Page/option_credit types id'))

        WebUI.click(findTestObject('AdvanceSearch_Page/td_Comparision'))

        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('AdvanceSearch_Page/option_Equals'), 2)

        WebUI.delay(2)

        WebUI.click(findTestObject('AdvanceSearch_Page/option_Equals'))

        WebUI.delay(2)

        WebUI.setText(findTestObject('AdvanceSearch_Page/td_Value'), 'Order')

        WebUI.delay(2)

        WebUI.click(findTestObject('null'))

        println('User search for credit types successfull, Testcase , Pass')
    } else {
        false
    }
    
    println('Credit Types screen is unavailable Test case FAIL')
} else {
    false.call({ 
            println('Administration tab is unavailable, Test case Fail')
        })
}

WebUI.callTestCase(findTestCase('Commission Login_Logout/Commission Logout'), [:], FailureHandling.STOP_ON_FAILURE)

