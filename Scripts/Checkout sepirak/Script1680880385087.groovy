import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.sepirak.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Home  SEPira(k) Wealth Management for _e66667/a_Pricing'))

WebUI.click(findTestObject('Object Repository/Page_Pricing  SEPira(k) Wealth Management f_93f16d/span_Get Started'))

WebUI.click(findTestObject('Object Repository/Page_Register  SEPira(k) Wealth Management _159b07/span_Select Plan'))

WebUI.setText(findTestObject('Object Repository/Page_/input_First Name_first_name'), 'jane')

WebUI.setText(findTestObject('Object Repository/Page_/input_Last Name_last_name'), 'Maine')

WebUI.setText(findTestObject('Object Repository/Page_/input_Email Address_email'), 'contact@whiteghanaian.com')

WebUI.setText(findTestObject('Object Repository/Page_/input_Phone_phone'), '8082348295')

not_run: WebUI.click(findTestObject('Object Repository/Page_/div_id(katalon-rec_elementInfoDiv) (2)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_/body_var vaultUrl              function(t,e_76db93'))

WebUI.setText(findTestObject('Object Repository/Page_/input_concat(id(, , react, , )inputclass, ,_2d0c38 (1)'), 'Jane Maine')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_card-number-input  invalid touched dirty'), '4242')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_card-number-input  invalid touched dirty'), '4242')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_card-number-input  invalid touched dirty'), '4242')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_card-number-input  invalid touched dirty'), '4242')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_invalid dirty (3)'), '09')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_invalid dirty (3)'), '23')

WebUI.setText(findTestObject('Page_/input_CVC'), '569')

WebUI.enhancedClick(findTestObject('Object Repository/Page_/span_Confirm Payment'))

WebUI.closeBrowser()

