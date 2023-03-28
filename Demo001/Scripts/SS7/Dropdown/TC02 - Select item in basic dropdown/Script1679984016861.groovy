import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

int _intWaitingTime = 30
// Open Browser with URL
WebUI.openBrowser('https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html')

//Wait for page loaded
WebUI.waitForPageLoad(_intWaitingTime)


// Define list value to select
String[] lstValue = ['January', 'February', 'April']

//Click on Dropdown
WebUI.click(findTestObject('Object Repository/SS7/Dropdown/TC02/ddl_select'))

//Select item in dropdown by defined value
for (def item in lstValue) {
	WebUI.click(findTestObject('Object Repository/SS7/Dropdown/TC02/ddl_item',['itemvalue':item]))
}

//Close browser
WebUI.closeBrowser()