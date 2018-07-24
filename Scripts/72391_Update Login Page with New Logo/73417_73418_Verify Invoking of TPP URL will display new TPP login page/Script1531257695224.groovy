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
import org.openqa.selenium.Keys as Keys

'Launch Browser'
WebUI.openBrowser('')

'Navigate to TPP URL'
WebUI.navigateToUrl(findTestData('Application').getValue(1, 1))

'Wait for Element <LOG IN> to be present'
WebUI.waitForElementPresent(findTestObject('Page_FNF - TitlePay Plus/a_Log In'), 20)

'Take Snapshot 73417_1'
WebUI.takeScreenshot('C:\\SCREENSHOTS\\73417_1.jpg')

'Click on <LOG IN> link'
WebUI.click(findTestObject('Page_FNF - TitlePay Plus/a_Log In'))

'Verify Text "Welcome to FNTG Agency Suite of Application" is present on the page after load'
WebUI.verifyElementText(findTestObject('Page_FNTG Login/h3_Welcome to the FNTG Agency'), 'Welcome to the FNTG Agency Suite of Applications')

'Take Snapshot 73417_2'
WebUI.takeScreenshot('C:\\SCREENSHOTS\\73417_2.jpg')

'Close Browser'
WebUI.closeBrowser()

