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

'Navigate to TPP URL'
WebUI.navigateToUrl(findTestData('Application').getValue(1, 1))

'Wait for <Log In> button to be present'
WebUI.waitForElementPresent(findTestObject('Page_FNF - TitlePay Plus/a_Log In'), 20)

'Validate if <About Us> Link is Clickable'
WebUI.verifyElementClickable(findTestObject('Page_FNF - TitlePay Plus/a_About Us'))

'Validate that <About Us> Link has href attribute of: http://www.fnf.com/pages/about-us.aspx'
WebUI.verifyElementAttributeValue(findTestObject('Page_FNF - TitlePay Plus/a_About Us'), 'href', 'http://www.fnf.com/pages/about-us.aspx', 
    20)

'Validate that <Register> button is clickable'
WebUI.verifyElementClickable(findTestObject('Page_FNF - TitlePay Plus/a_Register'))

'Validate that <Register> Link has href attribute of: https://titlepayplus-int.fnf.com/Home/Register'
WebUI.verifyElementAttributeValue(findTestObject('Page_FNF - TitlePay Plus/a_Register'), 'href', 'https://titlepayplus-int.fnf.com/Home/Register', 
    20)

'Validate that <Privacy Notice> is Clickable\r\n'
WebUI.verifyElementClickable(findTestObject('Page_FNF - TitlePay Plus/a_FNF Privacy Notice'))

'Validate that <Privacy Notice> has href attribute of: http://www.fnf.com/privacy'
WebUI.verifyElementAttributeValue(findTestObject('Page_FNF - TitlePay Plus/a_FNF Privacy Notice'), 'href', 'http://www.fnf.com/privacy', 
    20)

'Validate <Terms of Use> is Clickable'
WebUI.verifyElementClickable(findTestObject('Page_FNF - TitlePay Plus/a_FNF Terms of Use'))

'Validate that <Terms of Use> has href attribute of: http://www.fnf.com/termsofuse'
WebUI.verifyElementAttributeValue(findTestObject('Page_FNF - TitlePay Plus/a_FNF Terms of Use'), 'href', 'http://www.fnf.com/termsofuse', 
    20)

'Take a Snapshot 73420_1.jpg'
WebUI.takeScreenshot('C:\\SCREENSHOTS\\73420_1.jpg')

'Close Browser'
WebUI.closeBrowser()

