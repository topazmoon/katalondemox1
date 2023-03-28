import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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