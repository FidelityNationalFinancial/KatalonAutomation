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

'Maximize Window'
WebUI.maximizeWindow()

'Mouse Over to Easy Image'
WebUI.mouseOver(findTestObject('Page_FNF - TitlePay Plus/Easy Image'))

'Take Snapshot 73417_1'
WebUI.takeScreenshot('C:\\SCREENSHOTS\\73419_1.jpg')

'Mouse Over to Flexible Image\r\n'
WebUI.mouseOver(findTestObject('Page_FNF - TitlePay Plus/Flexible Image'))

'Take Snapshot 73417_1'
WebUI.takeScreenshot('C:\\SCREENSHOTS\\73419_2.jpg')

'Mouse Over to Secure Image'
WebUI.mouseOver(findTestObject('Page_FNF - TitlePay Plus/Secure Image'))

'Take Snapshot 73417_1'
WebUI.takeScreenshot('C:\\SCREENSHOTS\\73419_3.jpg')

'Close Browser'
WebUI.closeBrowser()

