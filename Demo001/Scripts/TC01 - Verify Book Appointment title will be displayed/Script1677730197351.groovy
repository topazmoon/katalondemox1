import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open browser
WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.maximizeWindow()

//Input username
WebUI.setText(findTestObject('Login_TC01/txt_username'), 'John Doe')

//Input Password
WebUI.setText(findTestObject('Login_TC01/txt_password'), 'ThisIsNotAPassword')

//Login
WebUI.click(findTestObject('Login_TC01/btn_login'))

WebUI.waitForPageLoad(30)

//verify 'Book Appointment' available 
WebUI.verifyTextPresent('Book Appointment', false)

WebUI.closeBrowser()

