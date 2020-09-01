from selenium import webdriver
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

firefox = webdriver.Remote(command_executor='http://localhost:4444/wd/hub', desired_capabilities=DesiredCapabilities.FIREFOX)

firefox.get('https://www.google.com')
print(firefox.title)
f=open('temp.log', 'a+')
f.write(firefox.title)
f.close()
firefox.quit()
