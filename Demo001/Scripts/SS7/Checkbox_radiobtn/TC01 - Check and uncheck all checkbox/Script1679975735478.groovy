import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


int _intWaitingTime = 30
// Open Browser with URL
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

//Wait for page loaded and elemement visible
WebUI.waitForPageLoad(_intWaitingTime)
WebUI.waitForElementVisible(findTestObject('Object Repository/SS7/Checkbox_radiobtn/TC01/lst_checkbox'), _intWaitingTime)

//Get list checkbox
def lst = WebUI.findWebElements(findTestObject('Object Repository/SS7/Checkbox_radiobtn/TC01/lst_checkbox'),_intWaitingTime)

// Check on all checkboxes
for (int i=1; i <= lst.size();i++) {
	WebUI.check(findTestObject('Object Repository/SS7/Checkbox_radiobtn/TC01/chkbx_items',['chkindex':i]))
}

//Delay 2 seconds
WebUI.delay(2)

// Unheck on all checkboxes
for (int i=1; i <= lst.size();i++) {
	WebUI.uncheck(findTestObject('Object Repository/SS7/Checkbox_radiobtn/TC01/chkbx_items',['chkindex':i]))
}

//Close browser
WebUI.closeBrowser()