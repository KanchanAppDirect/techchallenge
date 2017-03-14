TechChallenge

Contributor:Kanchan Sharma (INT032), Intern Engineer.

Date : March 14, 2017

Product's Name : Demo_kanchan.

Supported Functionality : Create and Cancel Subscription.

This project TechChallenge will integrate AppDirect API's with the web application 'web13' running on sql6.freemysqlhosting.net and hosted 
on ngrok.This project contain servlets which interacts with the end point urls for performing with create and cancel subscription events.

Packages:

There are total 6 packages::

1.Com.Kanchan.Controller : This package contain create Subscription and cancel Subscription Servlets which integrate with endpoint URls and 
call the corresponding method which are defined in Com.Kanchan.Services package and appropriate response will be recorded.

2.Com.Kanchan.Services: This package connect with Com.Kanchan.Bean and Com.Kanchan.Dao packages.This Package will perform the OAuth signature
on the URL received to request for the JSON from AppDirect and map the received JSON to the Domain Classes.
 
3.Com.Kanchan.Bean: This Package contain the parent class to map the JSON received after converting to String.

4.Com.Kanchan.Dao: This package contain the java files which are performing SQl Query for saving and deleting the data in database.

5.Com.Kanchan.util: There is java file which contain Connection logic to the Database.

6.Com.Kanchan.Domain: This package contains domain classes for retrieving the useful data from the JSON












