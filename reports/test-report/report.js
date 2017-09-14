$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myfeatures.feature");
formatter.feature({
  "line": 2,
  "name": "GMAIL LOGIN Working OK",
  "description": "",
  "id": "gmail-login-working-ok",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@featureTest"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "# @Scenario1"
    },
    {
      "line": 5,
      "value": "# Scenario: Successful Login"
    },
    {
      "line": 6,
      "value": "#  Given enter gmail url"
    },
    {
      "line": 7,
      "value": "#   When enter credentials"
    },
    {
      "line": 8,
      "value": "#    | Fields   | values                     |"
    },
    {
      "line": 9,
      "value": "#   | username | vishhal.bhopal22@gmail.com |"
    },
    {
      "line": 10,
      "value": "#  And Press submit"
    },
    {
      "line": 11,
      "value": "#  Then gmail successfully login"
    },
    {
      "line": 12,
      "value": "#  @Scenario2"
    },
    {
      "line": 13,
      "value": "#Scenario: Successful Login"
    },
    {
      "line": 14,
      "value": "# Given enter gmail url"
    },
    {
      "line": 15,
      "value": "# When enter credentials"
    },
    {
      "line": 16,
      "value": "#   | Fields   | values                     |"
    },
    {
      "line": 17,
      "value": "#   | username | vishhal.bhopal22@gmail.com |"
    },
    {
      "line": 18,
      "value": "# And Press submit"
    },
    {
      "line": 19,
      "value": "# Then gmail successfully login"
    },
    {
      "line": 20,
      "value": "#   @Scenario3"
    },
    {
      "line": 21,
      "value": "#Scenario: Successful Login"
    },
    {
      "line": 22,
      "value": "#  Given enter gmail url"
    },
    {
      "line": 23,
      "value": "# When enter credentials"
    },
    {
      "line": 24,
      "value": "#   | Fields   | values                     |"
    },
    {
      "line": 25,
      "value": "#   | username | vishhal.bhopal22@gmail.com |"
    },
    {
      "line": 26,
      "value": "#  And Press submit"
    },
    {
      "line": 27,
      "value": "#  Then gmail successfully login"
    }
  ],
  "line": 30,
  "name": "Successful Login",
  "description": "",
  "id": "gmail-login-working-ok;successful-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@Hooks"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "enter gmail url",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "enter \"\u003ccredentials\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Press submit",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "gmail successfully login",
  "keyword": "Then "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "gmail-login-working-ok;successful-login;",
  "rows": [
    {
      "cells": [
        "credentials"
      ],
      "line": 37,
      "id": "gmail-login-working-ok;successful-login;;1"
    },
    {
      "cells": [
        "vishal.bh@gmail.com"
      ],
      "line": 38,
      "id": "gmail-login-working-ok;successful-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 38,
  "name": "Successful Login",
  "description": "",
  "id": "gmail-login-working-ok;successful-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@Hooks"
    },
    {
      "line": 1,
      "name": "@featureTest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "enter gmail url",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "enter \"vishal.bh@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Press submit",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "gmail successfully login",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});