package globalkeywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.util.KeywordUtil

public class record {

	@Keyword
	def RecordNotFound(){




		try {
			boolean norecord = WebUI.waitForElementPresent(findTestObject('Page_Callidus Cloud Commissions Man/NoRecordsFound'),
					10)

			if (norecord) {
				'The Record you are searching Not Found.  Test-Case Failed'
				KeywordUtil.markFailed('Record Not found')

				KeywordLogger logger = new KeywordLogger()

				logger.logInfo('Record Not found')
			}
		}
		catch (Exception e) {
		}
	}
}