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

'Verify if <Pay Now> Button is Present'
WebUI.verifyElementPresent(findTestObject('Page_FNF - TitlePay Plus (Invoices)/first_invoice_on_table'), 20)

'Click <Pay Now> Button (no invoice selected>'
WebUI.click(findTestObject('Page_FNF - TitlePay Plus (Invoices)/button_Pay Now'))

'Take Screenshot 71275_1'
WebUI.takeScreenshot('C:\\SCREENSHOTS\\71275_1.jpg')

'Select first record (invoice) from the grid'
WebUI.click(findTestObject('Page_FNF - TitlePay Plus (Invoices)/first_invoice_on_table'))

'Verify <Pay Now> Button is Clickable'
WebUI.verifyElementClickable(findTestObject('Page_FNF - TitlePay Plus (Invoices)/button_Pay Now'))

'Take Screenshot 71275_2'
WebUI.takeScreenshot('C:\\SCREENSHOTS\\71275_2.jpg')

'Click <Pay Now> Button'
WebUI.click(findTestObject('Page_FNF - TitlePay Plus (Invoices)/button_Pay Now'))

'Redirect to Payment Screen'
WebUI.waitForElementPresent(findTestObject('Page_FNF - TitlePay Plus (Payment Screen)/select_-- Select --New Credit'), 20)

'Take Screenshot 71275_3'
WebUI.takeScreenshot('C:\\SCREENSHOTS\\71275_3.jpg')

'Close Browser'
WebUI.closeBrowser()

