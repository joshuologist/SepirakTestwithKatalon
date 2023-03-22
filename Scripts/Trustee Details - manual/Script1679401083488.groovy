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

WebUI.click(findTestObject('Page_/button_Trustee Details'))

WebUI.click(findTestObject('Page- test dropdown/Page_/div_Title_form-control ui fluid selection dropdown'))

WebUI.setText(findTestObject('Page_/input_Title_choices__input choices__input--cloned'), 'Dr.')

WebUI.enhancedClick(findTestObject('Page_/select_Title_datatrusteeTitle'))

WebUI.setText(findTestObject('Page_/input_First Name_datatrusteeFirstName'), 'Jo')

WebUI.setText(findTestObject('Page_/input_Last Name_datatrusteeLastName'), 'Keys')

WebUI.setText(findTestObject('Page_/input_Trustee Address_datatrusteeAddress01'), '156 lake ln')

WebUI.setText(findTestObject('Page_/input_Trustee SuiteUnit Number_datatrusteeA_648f27'), '200')

WebUI.setText(findTestObject('Page_/input_Trustee City_datatrusteeCity'), 'Clayton')

WebUI.setText(findTestObject('Page_/input_Trustee State_datatrusteeState'), 'CA')

WebUI.setText(findTestObject('Page_/input_Trustee Zip_datatrusteeZip'), '94517')

WebUI.setText(findTestObject('Page_/input_Trustee Email_datatrusteeEmail'), 'yo@robo.net')

WebUI.setText(findTestObject('Page_/input_, numeric only,_datatrusteePhone'), '3475261914')

WebUI.setText(findTestObject('Page_/input_Trustee Ssn_datatrusteeSsn'), '750239680')

WebUI.selectOptionByValue(findTestObject('Page_/select_January  February  March  April  May_143270'), '5', true)

WebUI.setText(findTestObject('Page_/input_Day_trusteeBirthDay-day'), '3')

WebUI.setText(findTestObject('Page_/input_Year_trusteeBirthDay-year'), '1980')

WebUI.setText(findTestObject('Page_/input_concat(Trustee, , s Occupation)_datatrusteeOccupation'), 'Producer')

WebUI.click(findTestObject('Page_/input_concat(Trustee, , s Occupation)_datat_5a44b1'))

WebUI.setText(findTestObject('Page_/input_Photo Id Number_datatbPhotoIdNumber'), 'H9623850')

WebUI.click(findTestObject('Page_/div_State Issued_form-control ui fluid sele_3d5641'))

WebUI.setText(findTestObject('Page_/input_State Issued_choices__input choices___dec7e4'), 'Alabama')

WebUI.enhancedClick(findTestObject('Page_/select_spanAlabamaspan'))

WebUI.click(findTestObject('Page_/input_Control Group_datatbIdType'))

WebUI.selectOptionByValue(findTestObject('Page_/select_January  February  March  April  May  June  July  August  September  October  November  December'), 
    '4', true)

WebUI.setText(findTestObject('Page_/input_Day_tbIdExpiryDate-day'), '10')

WebUI.setText(findTestObject('Page_/input_Year_tbIdExpiryDate-year'), '2028')

WebUI.click(findTestObject('Page_/a_browse                      Browse to att_060eec'))

WebUI.click(findTestObject('Page_/button_Next'))

WebUI.closeBrowser()

