import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\Silver Touch_MP\\Softwares\\Katalon\\SauceDemo_APK\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk', 
    false)

// Remote (Browserstack) URL
//Mobile.startApplication('bs://a6c0485821c15cfb0b23f1b7b7983370dfaa28dc', false)
Mobile.delay(GlobalVariable.short_wait)

Mobile.setText(findTestObject('Object Repository/Login_Page/Username'), GlobalVariable.username, 0)

Mobile.delay(GlobalVariable.short_wait)

Mobile.setEncryptedText(findTestObject('Object Repository/Login_Page/Password'), GlobalVariable.password, 0)

Mobile.delay(GlobalVariable.short_wait)

Mobile.tap(findTestObject('Object Repository/Login_Page/Button_LOGIN'), 0)

Mobile.delay(GlobalVariable.short_wait)