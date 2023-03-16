import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

int _intTimeout = 30
WebUI.openBrowser('https://www.fahasa.com/customer/account/create')

// Click to tab “Đăng nhập”
WebUI.waitForPageLoad(_intTimeout)
WebUI.click(findTestObject('SS6/TC02/tab_dangnhap'))

//Verify button “Đăng nhập” disabled
WebUI.verifyElementNotClickable(findTestObject('SS6/TC02/btn_dangnhap'))

// Input invalid “Số điện thoại/Email” và “Mật khẩu”
WebUI.setText(findTestObject('SS6/TC02/txt_sodienthoai'), '0123569870')
WebUI.setText(findTestObject('SS6/TC02/txt_matkhau'), '012356')

//Verify button “Đăng nhập” enabled
WebUI.verifyElementClickable(findTestObject('SS6/TC02/btn_dangnhap'))

//Click to button “Đăng nhập”
WebUI.click(findTestObject('SS6/TC02/btn_dangnhap'))

//Verify message: 'Số điện thoại/Email hoặc Mật khẩu sai!'"
String text = 'Số điện thoại/Email hoặc Mật khẩu sai!'
WebUI.verifyElementText(findTestObject('SS6/TC02/lb_message'), text)



