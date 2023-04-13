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

WebUI.click(findTestObject('Object Repository/Page_/button_Bank Partner Details'))

WebUI.setText(findTestObject('Object Repository/Page_/input_, numeric only,_datatbPin'), '1515')

WebUI.click(findTestObject('Object Repository/Page_/div_, numeric only,_col-md-6    col-md-offs_7b60c8'))

WebUI.click(findTestObject('Object Repository/Page_/div_TB_trustAccountMonthlyActivityDomestic__33c879'))

WebUI.setText(findTestObject('Object Repository/Page_/input_TB_trustAccountMonthlyActivityDomestic__33c879'), '$0-$25,000')

WebUI.enhancedClick(findTestObject('Object Repository/Page_/select_span0-25,000span'))

WebUI.click(findTestObject('Object Repository/Page_/div_TB_trustAccountMonthlyActivityInternati_52fa07'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_span0-25,000span_1'), '$0-$25,000', true)

WebUI.click(findTestObject('Object Repository/Page_/div_TB_trustAssetsType_form-control ui flui_3b1468'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_spanReal Estatespan'), 'Real Estate', true)

WebUI.click(findTestObject('Object Repository/Page_/div_TB_trustSourceOfFunds_form-control ui f_077f12'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_spanBank transfer from another accou_2401b4'), 
    'Bank transfer from another account you own', true)

WebUI.click(findTestObject('Object Repository/Page_/input_Other_datatbTermsAgree'))

WebUI.setText(findTestObject('Object Repository/Page_/input_planSignerFirstName_dataplanSignerFirstName'), 'Joshuologist')

WebUI.setText(findTestObject('Object Repository/Page_/input_planSignerLastName_dataplanSignerLastName'), 'Love')

WebUI.setText(findTestObject('Object Repository/Page_/input_planSignerTitle_dataplanSignerTitle'), 'Dr.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_January  February  March  April  May_143270'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Day_planSignDate-day'), '14')

WebUI.setText(findTestObject('Object Repository/Page_/input_Year_planSignDate-year'), '2023')

WebUI.click(findTestObject('Object Repository/Page_/canvas_planSignature_signature-pad-canvas'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Year_planSignDate-year'), '2023')

WebUI.click(findTestObject('Object Repository/Page_/i_planSignature_fa fa-refresh'))

WebUI.click(findTestObject('Object Repository/Page_/canvas_planSignature_signature-pad-canvas'))

WebUI.click(findTestObject('Object Repository/Page_/i_planSignature_fa fa-refresh'))

WebUI.click(findTestObject('Object Repository/Page_/canvas_planSignature_signature-pad-canvas'))

WebUI.click(findTestObject('Object Repository/Page_/button_Next'))

WebUI.closeBrowser()

