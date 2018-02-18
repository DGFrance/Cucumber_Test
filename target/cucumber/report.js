$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/cucumberJava.feature");
formatter.feature({
  "line": 1,
  "name": "Kumparan Automation",
  "description": "",
  "id": "kumparan-automation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#"
    },
    {
      "line": 4,
      "value": "#  @Registration"
    },
    {
      "line": 5,
      "value": "#  Scenario Outline: Register on Kumparan"
    },
    {
      "line": 6,
      "value": "#    Given I Open Kumparan web Login/Register"
    },
    {
      "line": 7,
      "value": "#    And I am Register as the \u003coption\u003e user"
    },
    {
      "line": 8,
      "value": "#    When i input the username and password \u003cnegative\u003e"
    },
    {
      "line": 9,
      "value": "#    And  I input the username and password \u003cpositive\u003e"
    },
    {
      "line": 10,
      "value": "#    Then i will registered as Kumparan User"
    },
    {
      "line": 11,
      "value": "#"
    },
    {
      "line": 12,
      "value": "#   Examples:"
    },
    {
      "line": 13,
      "value": "#    |option|positive|negative|"
    },
    {
      "line": 14,
      "value": "#    |Facebook|FB Positive|FB Negative|"
    },
    {
      "line": 15,
      "value": "#    |GooglePlus|G+ Positive|G+ Negative|"
    }
  ],
  "line": 19,
  "name": "Write Comment on any Article",
  "description": "",
  "id": "kumparan-automation;write-comment-on-any-article",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Comment"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I Open Kumparan web",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I Open any Article",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I write a Comment",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Post the Comment \u003cPostComment\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "The Comment will posted on Recent",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "kumparan-automation;write-comment-on-any-article;",
  "rows": [
    {
      "cells": [
        "PostComment"
      ],
      "line": 27,
      "id": "kumparan-automation;write-comment-on-any-article;;1"
    },
    {
      "cells": [
        "notRegistered"
      ],
      "line": 28,
      "id": "kumparan-automation;write-comment-on-any-article;;2"
    },
    {
      "cells": [
        "Registered"
      ],
      "line": 29,
      "id": "kumparan-automation;write-comment-on-any-article;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4488220830,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Write Comment on any Article",
  "description": "",
  "id": "kumparan-automation;write-comment-on-any-article;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Comment"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I Open Kumparan web",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I Open any Article",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I write a Comment",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Post the Comment notRegistered",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "The Comment will posted on Recent",
  "keyword": "Then "
});
formatter.match({
  "location": "annotation.i_Open_Kumparan_web()"
});
formatter.result({
  "duration": 12708587740,
  "status": "passed"
});
formatter.match({
  "location": "annotation.i_Open_any_Article()"
});
formatter.result({
  "duration": 5270111399,
  "status": "passed"
});
formatter.match({
  "location": "annotation.i_write_a_Comment()"
});
formatter.result({
  "duration": 5371117621,
  "status": "passed"
});
formatter.match({
  "location": "annotation.post_the_Comment_notRegistered()"
});
formatter.result({
  "duration": 5208061751,
  "status": "passed"
});
formatter.match({
  "location": "annotation.the_Comment_will_posted_on_Recent()"
});
formatter.result({
  "duration": 30362,
  "status": "passed"
});
formatter.after({
  "duration": 1146549210,
  "status": "passed"
});
formatter.before({
  "duration": 3401540764,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Write Comment on any Article",
  "description": "",
  "id": "kumparan-automation;write-comment-on-any-article;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Comment"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I Open Kumparan web",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I Open any Article",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I write a Comment",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Post the Comment Registered",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "The Comment will posted on Recent",
  "keyword": "Then "
});
formatter.match({
  "location": "annotation.i_Open_Kumparan_web()"
});
formatter.result({
  "duration": 13496758964,
  "status": "passed"
});
formatter.match({
  "location": "annotation.i_Open_any_Article()"
});
formatter.result({
  "duration": 5276496397,
  "status": "passed"
});
formatter.match({
  "location": "annotation.i_write_a_Comment()"
});
formatter.result({
  "duration": 5566707007,
  "status": "passed"
});
formatter.match({
  "location": "annotation.post_the_Comment_Registered()"
});
formatter.result({
  "duration": 28103659,
  "status": "passed"
});
formatter.match({
  "location": "annotation.the_Comment_will_posted_on_Recent()"
});
formatter.result({
  "duration": 22665,
  "status": "passed"
});
formatter.after({
  "duration": 1026771152,
  "status": "passed"
});
});