import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import utilities.supporter as SP

int _intWaitingTime = 30

// Open Browser with URL
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

//Wait for page loaded and elemement visible
WebUI.waitForPageLoad(_intWaitingTime)

//Get list checkbox
def lst = WebUI.findWebElements(findTestObject('Object Repository/SS7/Checkbox_radiobtn/TC01/lst_checkbox'),_intWaitingTime)

// Define list randome number for checkbox
def lstNum = SP.listRandomNumber(1, lst.size(), 3)

// Check on checkbox by defined values
for (def item in lstNum) {
	println item
	WebUI.check(findTestObject('Object Repository/SS7/Checkbox_radiobtn/TC01/chkbx_items',['chkindex':item]))
}

//Close browser
WebUI.closeBrowser()