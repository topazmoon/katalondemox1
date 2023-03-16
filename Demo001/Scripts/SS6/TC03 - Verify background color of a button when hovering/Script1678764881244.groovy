import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import utilities.supporter


int _intTimeout = 30
WebUI.openBrowser('https://atlassian.design/components/tooltip/examples')

//Hover to button "Hover over me"
WebUI.waitForPageLoad(_intTimeout)
WebUI.mouseOver(findTestObject('SS6/TC03/btn_HoverOnMe'))
WebUI.delay(1)
String strTooltipID = WebUI.getAttribute(findTestObject('SS6/TC03/btn_HoverOnMe'), 'aria-describedby')

//Verify tooltip 'Hello World' displayed
WebUI.verifyElementText(findTestObject('SS6/TC03/lb_message',['itemid':strTooltipID]), 'Hello World')

//Get background color của button "Hover over me“ when hover
String color = WebUI.getCSSValue(findTestObject('SS6/TC03/btn_HoverOnMe'), 'background')
String convertColor = supporter.convertRGBAToHex(color).toUpperCase()

//Verify background color after hover is displayed correctly
String validcolor = '#0055CC';
WebUI.verifyEqual(convertColor, validcolor)

WebUI.closeBrowser()

