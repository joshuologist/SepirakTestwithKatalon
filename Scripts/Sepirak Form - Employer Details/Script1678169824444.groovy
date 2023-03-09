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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://stage.sepirak.com/form/')

WebUI.waitForElementVisible(findTestObject('Page_Form_EmployerDetails/input_Employer Name'), 60)

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Employer Name'), 'WG')

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Employer Address'), 'P.O.Box 748')

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Employer SuiteUnit Number'), '')

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Employer City'), 'Pahoa')

WebUI.click(findTestObject('Object Repository/Page_Form_EmployerDetails/div_Employer State'))

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Employer State'), 'Hawaii')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Form_EmployerDetails/select_EmployerState'))

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Employer Zip'), '96778')

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Employer Email'), 'contact@wg.com')

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Employer Website Address'), 'www.sepirak.com')

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_employerPhone'), '3479251914')

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Employer EIN'), '249635486')

String entityType = 'Sole Proprietor'

WebUI.click(findTestObject('Page_Form_EmployerDetails/input_EntityType', [('EntityType') : entityType]))

WebUI.selectOptionByLabel(findTestObject('Page_Form_EmployerDetails/select_Month'), 'January', false)

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Day_employerIncorpDate-day'), '15')

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_Year_employerIncorpDate-year'), '2000')

WebUI.click(findTestObject('Object Repository/Page_Form_EmployerDetails/div_State of Incorporation'))

WebUI.setText(findTestObject('Object Repository/Page_Form_EmployerDetails/input_State of Incorporation'), 'Hawaii')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Form_EmployerDetails/select_State of Incorporation'))

WebUI.closeBrowser()

