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

WebUI.navigateToUrl('https://stage.sepirak.com/form/')

WebUI.click(findTestObject('Object Repository/Page_/button_Plan Details'))

WebUI.click(findTestObject('Object Repository/Page_/div_Tax Year Plan is Established_form-contr_476e84'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Tax Year Plan is Established'), '2021 Tax Year')

WebUI.enhancedClick(findTestObject('Page_/select_Tax Year Plan is Established'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Solo 401(k) Plan EIN_datasolo401KPlanEin'), '63-2589203')

WebUI.click(findTestObject('Object Repository/Page_/input_Solo 401(k) Plan EIN_dataplanLoan'))

WebUI.click(findTestObject('Object Repository/Page_/input_No_dataplanRoth'))

WebUI.click(findTestObject('Object Repository/Page_/input_No_dataplanRothRoll'))

WebUI.click(findTestObject('Object Repository/Page_/button_Next'))

WebUI.closeBrowser()

