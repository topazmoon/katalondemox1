import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

int _intWaitingTime = 30
// Open Browser with URL
WebUI.openBrowser('https://demos.telerik.com/kendo-ui/dropdownlist/index')

//Wait for page loaded 
WebUI.waitForPageLoad(_intWaitingTime)

// Wait for dropdown visible
WebUI.waitForElementVisible(findTestObject('SS7/Dropdown/TC01/ddl_Categories'), _intWaitingTime)

// Click on Categories dropdown
WebUI.click(findTestObject('SS7/Dropdown/TC01/ddl_Categories'))

// Create object item need to click
def itemObj = findTestObject('SS7/Dropdown/TC01/ddl_Categories_item',['itemtext':'Beverages'])

// Click on item
WebUI.waitForElementVisible(itemObj, _intWaitingTime)
WebUI.click(itemObj)

//Close browser
WebUI.closeBrowser()