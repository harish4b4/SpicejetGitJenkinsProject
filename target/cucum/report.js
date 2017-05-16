$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Spicejet.feature");
formatter.feature({
  "line": 2,
  "name": "Test the functionality of spicejet scenario",
  "description": "",
  "id": "test-the-functionality-of-spicejet-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Test with valid credential",
  "description": "",
  "id": "test-the-functionality-of-spicejet-scenario;test-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "open firefox and start validation",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user entered valid data in leaving from",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should enter into leaving from",
  "keyword": "Then "
});
formatter.match({
  "location": "SpicejetStepDef.open_firefox_and_start_validation()"
});
formatter.result({
  "duration": 17161612835,
  "status": "passed"
});
formatter.match({
  "location": "SpicejetStepDef.user_entered_valid_data_in_leaving_from()"
});
formatter.result({
  "duration": 91118885,
  "status": "passed"
});
formatter.match({
  "location": "SpicejetStepDef.user_should_enter_into_leaving_from()"
});
formatter.result({
  "duration": 1725652143,
  "status": "passed"
});
});