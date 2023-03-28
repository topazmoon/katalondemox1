import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

int _intWaitingTime = 30
// Define list value for checkbox
String[] lstValue = ["Asthma", "Gout", "Emotional Disorder"]
// Open Browser with URL
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

//Wait for page loaded and elemement visible
WebUI.waitForPageLoad(_intWaitingTime)

// Check on checkbox by defined values
for (def item in lstValue) {
	WebUI.check(findTestObject('Object Repository/SS7/Checkbox_radiobtn/TC02/chk_item',['txtvalue':item]))
}

//Close browser
WebUI.closeBrowser()