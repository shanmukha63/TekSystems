from selenium import webdriver
from selenium.webdriver.common.keys import Keys

import time

@Given(u'we have gone to the web site')
def step_impl(context):
   context.browser.get("http://drdelozier.pythonanywhere.com")

@when('we visit google')
def step(context):
   context.browser.get('http://www.google.com')

@then('it should have a title "Google"')
def step(context):
   assert context.browser.title == "Google"
