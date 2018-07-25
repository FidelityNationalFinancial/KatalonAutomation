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

'Verify TPP URL redirect to Auth0 Hosted page'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FNTG Login/auth0_h3_Welcome to the FNTG Agency'), 0)

'Verify username, password, and Login button is displayed'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FNTG Login/input_username'), 5)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FNTG Login/input_password'), 5)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FNTG Login/button_Log In'), 5)

//'Verify when user enter valid credential and click on login. User navigate to TPP home page'
//WebUI.setText(findTestObject('Page_FNTG Login/input_username'), findTestData('Application').getValue(2,4))
//WebUI.setText(findTestObject('Page_FNTG Login/input_password'), findTestData('Application').getValue(3, 1))
//WebUI.click(findTestObject('Page_FNTG Login/button_Log In'))
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FNTG Login/title-pay-plus-img'), 5)
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_FNTG Login/a_Logout'), 5)
//WebUI.click(findTestObject('Object Repository/Page_FNTG Login/a_Logout'))
//WebUI.click(findTestObject('Page_FNF - TitlePay Plus (Invoices)/a_Log In'))
//WebUI.waitForPageLoad(10)

'Verify if invalid or blocked user enter credential appropriate message should be displayed'
WebUI.setText(findTestObject('Object Repository/Page_FNTG Login/input_username'), findTestData('Application').getValue(1, 1))
WebUI.setText(findTestObject('Object Repository/Page_FNTG Login/input_password'), "123")
WebUI.click(findTestObject('Object Repository/Page_FNTG Login/button_Log In'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FNTG Login/div_Wrong email or password.'), 5)

'Verify when user click on register button navigate to registration page'
WebUI.click(findTestObject('Object Repository/Page_FNTG Login/button_Register'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FNTG Login/h2_Registration'), 5)



'Close Browser'
WebUI.closeBrowser()
