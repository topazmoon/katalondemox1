import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String _url = 'https://demo.guru99.com/V4/';
int _intTimeout = 30;
WebUI.openBrowser(_url)

//Click ‘here’ link at the bottom
WebUI.click(findTestObject('SS6/TC01/lbtn_here'))

//Input Email ID
WebUI.setText(findTestObject('SS6/TC01/txt_newemail'), 'dntestss6@aperiatest.org')

// Click Submit button
WebUI.click(findTestObject('SS6/TC01/btn_submit'))


//Get User ID and password
WebUI.waitForPageLoad(_intTimeout)
WebUI.waitForElementPresent(findTestObject('SS6/TC01/lb_username'), _intTimeout)
String username = WebUI.getText(findTestObject('SS6/TC01/lb_username'))
String password = WebUI.getText(findTestObject('SS6/TC01/lb_password'))


//Navigate to http://demo.guru99.com/V4/ again
WebUI.navigateToUrl(_url)

//Input User ID and password at step 5
WebUI.waitForPageLoad(_intTimeout)
WebUI.setText(findTestObject('SS6/TC01/txt_username'), username)
WebUI.setText(findTestObject('SS6/TC01/txt_password'), password)
WebUI.click(findTestObject('SS6/TC01/btn_login'))

//Verify message: Welcome To Manager's Page of Guru99 Bank displayed
WebUI.waitForPageLoad(_intTimeout)
String strMessage = 'Welcome To Manager\'s Page of Guru99 Bank'
WebUI.verifyElementText(findTestObject('SS6/TC01/lb_message'), strMessage)


