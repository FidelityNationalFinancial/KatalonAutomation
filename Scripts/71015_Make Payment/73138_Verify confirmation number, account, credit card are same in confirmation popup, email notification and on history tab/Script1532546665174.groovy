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

'Launch Browser'
WebUI.openBrowser('')

'Navigate to TPP URL '
WebUI.navigateToUrl(findTestData('Application').getValue(1, 1))

'Wait for element <Log In> Link'
WebUI.waitForElementPresent(findTestObject('Page_FNF - TitlePay Plus/a_Log In'), 20)

'Click <Login> Link'
WebUI.click(findTestObject('Page_FNF - TitlePay Plus (Invoices)/a_Log In'))

'Wait for Button <Login>'
WebUI.waitForElementPresent(findTestObject('Page_FNTG Login/button_Log In'), 20)

'Enter Username'
WebUI.setText(findTestObject('Page_FNTG Login/input_username'), findTestData('Application').getValue(2, 1))

'Enter Password'
WebUI.setText(findTestObject('Page_FNTG Login/input_password'), findTestData('Application').getValue(3, 1))

'Click Button <Login>'
WebUI.click(findTestObject('Page_FNTG Login/button_Log In'))

'Make a payment for invoices'
WebUI.setText(null, null)
WebUI.setText(null, null)
WebUI.setText(null, null)
WebUI.setText(null, null)
WebUI.setText(null, null)







