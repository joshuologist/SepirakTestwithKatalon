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

WebUI.click(findTestObject('Object Repository/Page- test dropdown/Page_/button_Trustee Details'))

WebUI.setText(findTestObject('Object Repository/Page- test dropdown/Page_/input_concat(Trustee, , s Occupation)_datat_79900b'), 
    'Producer')

WebUI.click(findTestObject('Object Repository/Page- test dropdown/Page_/input_concat(Trustee, , s Occupation)_datat_5a44b1'))

WebUI.click(findTestObject('Object Repository/Page- test dropdown/Page_/input_Control Group_datatbIdType'))

WebUI.setText(findTestObject('Object Repository/Page- test dropdown/Page_/input_Photo Id Number_datatbPhotoIdNumber'), 'H9624589')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page- test dropdown/Page_/select_January  February  March  April  May_143270'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Page- test dropdown/Page_/input_Day_tbIdExpiryDate-day'), '6')

WebUI.setText(findTestObject('Object Repository/Page- test dropdown/Page_/input_Year_tbIdExpiryDate-year'), '2028')

WebUI.click(findTestObject('Object Repository/Page- test dropdown/Page_/a_browse                      Browse to att_060eec'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page- test dropdown/Page_/select_January  February  March  April  May_143270_1'), 
    '7', true)

WebUI.setText(findTestObject('Object Repository/Page- test dropdown/Page_/input_Day_trusteeBirthDay-day'), '4')

WebUI.setText(findTestObject('Object Repository/Page- test dropdown/Page_/input_Year_trusteeBirthDay-year'), '1981')

WebUI.click(findTestObject('Object Repository/Page- test dropdown/Page_/div_Trustees Birth Date                  Mo_5de58b'))

WebUI.closeBrowser()

