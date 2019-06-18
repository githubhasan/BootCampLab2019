
BOOT CAMP LAB 2019 SUB: SELENIUM

The purpose of Boot Camp is to demonstrate completion of the course successfully by utilizing hands on tools on real world projects as well as to give exposure to a collaborative process. By participating this Lab session and presenting successfully you are going to enter in the automation engineering community as a true software engineer.
The course name “Selenium” derived from a simply suite of tools name Selenium WebDriver API. But in depth of this course was heavily focused on Programming Language and other cutting edges application development tools in the last 10 weeks. During this camp, you must use all the tools and API that you have learned and should be able to set up the Framework from scratch or enhance from the existing one.
As part of the industry demand, five different domains have been chosen and those are Ecommerce, Social media, News Media, Insurance and Financial organization. Each application may have some unique features, by automating those application you are going to expand your analytical skills as well as acquiring knowledge of the tools how to tackle those edge cases.
This Lab has three parts, one is functional testing for Browser, second is functional testing for Mobile and the third part is performance testing.
You are assigned in separate groups previously during the class, so you can complete this lab as a team with each individual efforts and do the presentation at the end of the lab session.
  
  1) 
  Functional Testing Lab for Browser
  Design a Testing Framework such a way that you can distribute the API throughout the organization. The purpose of distribution is to share the Framework for multiple projects using the common core API. Design pattern should follow building the API where you will have multi layer modules. Layer one would be a Generic module that can be used for any application to test, and then second layer would be for specific application module, which inherits from Generic Module. By such you can extend the Framework, to unlimited number of application modules. Also the second layer of module can share their API where the many applications might have common ground to share. Then if you break down each application module, it will have two directories, one is Main and the other one is Test directory. On Main directory you will have common API only for that particular application, and on Test directory you will have all the test classes only for that particular application where you will implement all the test cases. This design approach will have the ability to maintain your Framework very easily and reuse the code whenever and wherever it’s needed. Please use the diagram below as your road map to design the Framework.

   Framework Diagram
Breaking down of Application Module Diagram
Exit Criteria of Framework Implementation:
EC-1: Framework should use the following tools and guidelines.
 
   * Use core java (Object-Oriented programming features to reu your codes and demonstrate smart programmatic approach reduce number of lines of code such as using different kinds loops and data structure.)
* Recommended to use Intellij IDE.
* Use Selenium WebDriver API.
* Use Junit or testNG testing Framework to control your test.
* Use Maven as your dependency management and build tool.
* Locating web-elements using id, name, xpath and css.
* Design should have Data-Driven Testing feature using Apac
POI.


EC-2 : Framework should have the following features from
*Use one of the database (Oracle, MySQL or MongoDB). Selenium API as well*FarsamfreowmorkcsohroueldjabveacoinfiyguoruabrleGtoenruenrdicifferent testing
module.
environment such as Sauce labs and Organization cloud. *Use GitHub as your versioning system to share codes and
hooks with jerkins server to fetch the code for CI.
* Create Driver instance for multi-browser * Test should have features to run in cloud * Alert Handling.
*Cookies Handling
* Selecting items from drop down menu. * Explicit and Implicit wait.
* Synchronization Strategies.
* Enter text on input box.
* Popup window Handling. * Mouse Hover option.
* Drag and Drop option.
* Navigation.
* User Interaction.
* Run test on Multi-browser
* Scrolling option on web page by horizontally and vertically. * Taking Screenshot.
* Others (as many as you can add from Selenium API).


EC-3: Framework should be able to run regression test on Continuous Integration Testing Environment to protect the application modules from new bugs and to maintain the existing functionality.
 * Continuous Integration Set Up:
(Jenkins as a server with GitHub Repository System and
Maven as dependency management and build tool.)
* Run Jenkins.war into your localhost on port 8080
* Configure Jenkins with Jdk, Maven, Git and Github.
* Schedule tasks to run tests periodically.
* Configure E-mail notification to send the post-build reports to
the team members.
* Test should be able to run on cloud such as Saucelabs or Continuous Integration Testing Environment Diagram
Now using above tools, infrastructure and different kind of testing Framework models, design a Hybrid Framework that can accommodate any application under test:


A) With all the above in your hand, create one app-module for (Amazon.com) and add more test cases besides given below.
Test cases:
● Log In.
● Browse the products and use the shopping cart to check out.
● Search Items and verify items.
● Verify autosuggestion.
● Navigate to the products.
● Sign Out.
    
 
B) Create another app-module for (Facebook.com), then import into the Framework. Please add as many test cases as possible besides given below.
Test cases:
● Log In to Facebook.
● Search a name.
● Make a comment to your friend.
● Send a friend request.
● Accept a friend request.
● Comment on a post.
● Like a post.
● Upload image.
● Read news.
● Keep adding more test cases as you can.

C) Create an app-module for (cnn.com), then import into the
Framework. Please add as many test cases as possible besides given below.
Test Cases:
● Log In.
● Click on navigation Tabs.
● Read news on each page and verify news.
● Search for news.
● Sign Out.

D) Create another app-module for the (Cigna.com) and add test cases as you can think of besides given below.
Test Cases:
● Log In.
● Click on navigation Tabs.
● Navigate through different level of Health coverage.
● Search for Medical tools.
● Checkout the Cigna global products.
● Sign Out.

E) Create another app-module (Citibank.com), and add test cases as you can think of besides given below.
Test Cases:
● Log In.
● Click on navigation Tabs for different kind of banking.
● Read all available features offering for the customers.
● Browser through all the products it is offering and validates the links.
● Search Items.
● Sign Out.


2) Mobile Automation:
As consumer’s expectation increases and Businesses strategy changes, industry has to deliver the business contents continuously. To deliver the customer’s need from the businesses, Continuous Integration and Continuous Delivery become essential in software development process. Since the use of mobile app is increasing day by day and companies are serving their customers as needed. As a result, Mobile Automation is very important for CI-CD pipeline in agile environment. Using open source tool Appium, you can test the Native app and Hybrid app. Framework can be implemented with various languages. You can use Java to build it.

Exit Criteria for Mobile Automation Framework:

You must do all the Part-one Criteria and in addition to handling Mobile Automation features:
You must configure Android SDK and iOS SDK in order to make it to work. Implement all the Framework criteria you have designed on Lab-1 for browser along with all other features needed in handling Mobile Automation:
Design Page Object Model for the following Mobile Application that we have in Dropbox/GitHub.

A) NYP or Snapchat Android app.
* Use Appium Driver to Launch the app. The Framework should be able to handle different kind of app such as Native and Hybrid app. Also it should have flexible feature to run in Simulator/Emulator and in real devices.
 
B) UICatalog iOS app.
Navigate to NYP News Vertical and scrap the news.
Log In to Snapchat and test the available features.
Navigate through each items in UICatalog and enter text into fields. 

3) Rest Api Testing
Implement a Rest API testing module within the Web Automation Framework to test Rest Api/Web services. You can use Rest Assured API as dependency and JSON parser as well.
Use POST,GET,PUT and DELETE method.
Verify the response status, content and header.
Below is the few api’s that you can make call.
http://info.venturepulse.org:8080/service- webapp/api/SingleEmployeeResources/590a4acd35522970c7956cdf
http://info.venturepulse.org:8080/service- webapp/api/AllEmployeeResources

4) Performance Testing Lab
Use Apache Jmeter to test performance of any app for 100 users ramp up in 5 seconds and find the following data with the informatics graph.
Average response time, min, max, Error%, Throughput, Standard Deviation, Median, KB/Sec and Average Bytes.
