$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("regression/loginFunction.feature");
formatter.feature({
  "line": 1,
  "name": "MyAccount-Login",
  "description": "Description: This feature will test a login functionality",
  "id": "myaccount-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user should be able to login successfully",
  "description": "",
  "id": "myaccount-login;user-should-be-able-to-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter registered \"lellasreelakshmi@gmail.com\" and \"Aanya@2020\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user must be able to login the web page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user logout from the application",
  "keyword": "And "
});
formatter.match({
  "location": "loginFunction.userIsOnHomePage()"
});
formatter.result({
  "duration": 156562200,
  "status": "passed"
});
formatter.match({
  "location": "loginFunction.userClickOnLogin()"
});
formatter.result({
  "duration": 1334640600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lellasreelakshmi@gmail.com",
      "offset": 18
    },
    {
      "val": "Aanya@2020",
      "offset": 51
    }
  ],
  "location": "loginFunction.enterRegisteredAnd(String,String)"
});
formatter.result({
  "duration": 516879000,
  "status": "passed"
});
formatter.match({
  "location": "loginFunction.userClickOnLoginButton()"
});
formatter.result({
  "duration": 2225493500,
  "status": "passed"
});
formatter.match({
  "location": "loginFunction.userMustBeAbleToLoginTheWebPage()"
});
formatter.result({
  "duration": 108580300,
  "status": "passed"
});
formatter.match({
  "location": "loginFunction.userLogoutFromTheApplication()"
});
formatter.result({
  "duration": 808500400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Log-in with invalid username and password",
  "description": "",
  "id": "myaccount-login;log-in-with-invalid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user click on login",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Enter invalid username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17
    },
    {
      "cells": [
        "lellasreelakshmi@gmail.com",
        "Aanya@201"
      ],
      "line": 18
    },
    {
      "cells": [
        "rsunkara@gmail.com",
        "Nani@2020"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user must not login to the web page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginFunction.userIsOnHomePage()"
});
formatter.result({
  "duration": 893500,
  "status": "passed"
});
formatter.match({
  "location": "loginFunction.userClickOnLogin()"
});
formatter.result({
  "duration": 548681400,
  "status": "passed"
});
formatter.match({
  "location": "loginFunction.enterInvalidUsernameAndPassword(DataTable)"
});
formatter.result({
  "duration": 376719800,
  "status": "passed"
});
formatter.match({
  "location": "loginFunction.userClickOnLoginButton()"
});
formatter.result({
  "duration": 541052300,
  "status": "passed"
});
formatter.match({
  "location": "loginFunction.userMustNotLoginToTheWebPage()"
});
formatter.result({
  "duration": 166548500,
  "status": "passed"
});
formatter.uri("regression/registration.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration",
  "description": "Description:This feature test a Registration functionality",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User Registration with personal details",
  "description": "",
  "id": "user-registration;user-registration-with-personal-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on registration",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter Firstname \"Sree\" and Lastname \"Lella\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "select DOB date \"20\" and month \"10\" and year \"1985\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter Email address \"lellasreelakshmi@gmail.com\" and Company name \"freelance\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter Password \"Aanya@2020\" and Confirm Password \"Aanya@2020\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click registration button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user successfully registered to the application",
  "keyword": "Then "
});
formatter.match({
  "location": "registration.userIsOnRegistrationPage()"
});
formatter.result({
  "duration": 1355549200,
  "status": "passed"
});
formatter.match({
  "location": "registration.userClickOnRegistration()"
});
formatter.result({
  "duration": 1279742800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sree",
      "offset": 17
    },
    {
      "val": "Lella",
      "offset": 37
    }
  ],
  "location": "registration.enterFirstnameAndLastname(String,String)"
});
formatter.result({
  "duration": 274220400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 17
    },
    {
      "val": "10",
      "offset": 32
    },
    {
      "val": "1985",
      "offset": 46
    }
  ],
  "location": "registration.selectDOBDateAndMonthAndYear(String,String,String)"
});
formatter.result({
  "duration": 328992000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lellasreelakshmi@gmail.com",
      "offset": 21
    },
    {
      "val": "freelance",
      "offset": 67
    }
  ],
  "location": "registration.enterEmailAddressAndCompanyName(String,String)"
});
formatter.result({
  "duration": 317244200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aanya@2020",
      "offset": 16
    },
    {
      "val": "Aanya@2020",
      "offset": 50
    }
  ],
  "location": "registration.enterPasswordAndConfirmPassword(String,String)"
});
formatter.result({
  "duration": 216395400,
  "status": "passed"
});
formatter.match({
  "location": "registration.userClickRegistrationButton()"
});
formatter.result({
  "duration": 1289950800,
  "status": "passed"
});
formatter.match({
  "location": "registration.userSuccessfullyRegisteredToTheApplication()"
});
formatter.result({
  "duration": 268811300,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat regression.registration.userSuccessfullyRegisteredToTheApplication(registration.java:57)\r\n\tat ✽.Then user successfully registered to the application(regression/registration.feature:12)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "User Registration with  invalid personal details",
  "description": "",
  "id": "user-registration;user-registration-with--invalid-personal-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user click on registration",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Enter Firstname \"\u003cfirstname\u003e\" and Lastname \"Lella\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "select DOB date \"20\" and month \"10\" and year \"1985\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Enter Email address \"\u003cemail\u003e\" and Company name \"freelance\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Enter Password \"\u003cpassword\u003e\" and Confirm Password \"\u003cconfirmPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user click registration button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user must not registered to the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "user-registration;user-registration-with--invalid-personal-details;",
  "rows": [
    {
      "cells": [
        "email",
        "firstname",
        "password",
        "confirmPassword"
      ],
      "line": 28,
      "id": "user-registration;user-registration-with--invalid-personal-details;;1"
    },
    {
      "cells": [
        "yashwantrsunkara@gmail.com",
        "sree",
        "Aanya@2020",
        "Aanya2021"
      ],
      "line": 29,
      "id": "user-registration;user-registration-with--invalid-personal-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "User Registration with  invalid personal details",
  "description": "",
  "id": "user-registration;user-registration-with--invalid-personal-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user click on registration",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Enter Firstname \"sree\" and Lastname \"Lella\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "select DOB date \"20\" and month \"10\" and year \"1985\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Enter Email address \"yashwantrsunkara@gmail.com\" and Company name \"freelance\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Enter Password \"Aanya@2020\" and Confirm Password \"Aanya2021\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user click registration button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user must not registered to the application",
  "keyword": "Then "
});
formatter.match({
  "location": "registration.userIsOnRegistrationPage()"
});
formatter.result({
  "duration": 460056800,
  "status": "passed"
});
formatter.match({
  "location": "registration.userClickOnRegistration()"
});
formatter.result({
  "duration": 494684900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sree",
      "offset": 17
    },
    {
      "val": "Lella",
      "offset": 37
    }
  ],
  "location": "registration.enterFirstnameAndLastname(String,String)"
});
formatter.result({
  "duration": 236010100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 17
    },
    {
      "val": "10",
      "offset": 32
    },
    {
      "val": "1985",
      "offset": 46
    }
  ],
  "location": "registration.selectDOBDateAndMonthAndYear(String,String,String)"
});
formatter.result({
  "duration": 312948200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yashwantrsunkara@gmail.com",
      "offset": 21
    },
    {
      "val": "freelance",
      "offset": 67
    }
  ],
  "location": "registration.enterEmailAddressAndCompanyName(String,String)"
});
formatter.result({
  "duration": 286885400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aanya@2020",
      "offset": 16
    },
    {
      "val": "Aanya2021",
      "offset": 50
    }
  ],
  "location": "registration.enterPasswordAndConfirmPassword(String,String)"
});
formatter.result({
  "duration": 205278400,
  "status": "passed"
});
formatter.match({
  "location": "registration.userClickRegistrationButton()"
});
formatter.result({
  "duration": 89175400,
  "status": "passed"
});
formatter.match({
  "location": "registration.userMustNotRegisteredToTheApplication()"
});
formatter.result({
  "duration": 280155200,
  "status": "passed"
});
formatter.uri("regression/search.feature");
formatter.feature({
  "line": 1,
  "name": "search products feature",
  "description": "",
  "id": "search-products-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "keyword search from home page",
  "description": "",
  "id": "search-products-feature;keyword-search-from-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search with keyword",
  "rows": [
    {
      "cells": [
        "keyword"
      ],
      "line": 9
    },
    {
      "cells": [
        "computer"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see atleast one search",
  "keyword": "Then "
});
formatter.match({
  "location": "search.i_am_on_landing_page()"
});
formatter.result({
  "duration": 1872200,
  "status": "passed"
});
formatter.match({
  "location": "search.iSearchWithKeyword(String,String\u003e\u003e)"
});
formatter.result({
  "duration": 96629200,
  "status": "passed"
});
formatter.match({
  "location": "search.iShouldSeeAtleastOneSearch()"
});
formatter.result({
  "duration": 33100,
  "status": "passed"
});
});