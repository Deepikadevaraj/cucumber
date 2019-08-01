$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Sample/B.feature");
formatter.feature({
  "name": "Login TestMeApp",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "display welcome",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "welcome user",
  "keyword": "Given "
});
formatter.match({
  "location": "Sample2.welcome_user()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login with the valid data credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user opens chrome browser and open application",
  "keyword": "When "
});
formatter.match({
  "location": "Sample2.user_opens_chrome_browser_and_open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"\u003cUserName\u003e\" And password as \"\u003cPassword\u003e\"  field",
  "keyword": "When "
});
formatter.match({
  "location": "Sample2.user_enters_username_as_And_password_as_field(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "Sample2.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the login",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample2.verify_the_login()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat a1.Sample2.verify_the_login(Sample2.java:51)\r\n\tat ✽.verify the login(src/test/resources/Sample/B.feature:10)\r\n",
  "status": "failed"
});
});