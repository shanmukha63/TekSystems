from selenium import webdriver
from selenium.webdriver.common.keys import Keys

def before_scenario(context, scenario):
    context.browser = webdriver.Chrome()

def after_scenario(context, scenario):
    context.browser.quit()
