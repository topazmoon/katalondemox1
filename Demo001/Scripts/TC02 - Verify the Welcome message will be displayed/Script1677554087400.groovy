import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://the-internet.herokuapp.com/login')

WebUI.maximizeWindow()

//Input username
WebUI.setText(findTestObject('Login_TC02/txt_username2'), 'tomsmith')

//Input Password
WebUI.setText(findTestObject('Login_TC02/txt_password2'), 'SuperSecretPassword!')

//Login
WebUI.click(findTestObject('Login_TC02/btn_login2'))

WebUI.waitForPageLoad(30)

//Verify text 'Welcome to the Secure Area. When you are done click logout below' available
WebUI.verifyTextPresent('Welcome to the Secure Area. When you are done click logout below', false)

WebUI.closeBrowser()

