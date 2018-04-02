# DACS Station API - Quick Start Guide


## Introduction

This Quick Start guide will show how to get one's first DACS Station API client application up and running.  Please note, that this API is often referred to by engineers as "DACS Web Service API".    

Together, we will examine the following steps: 

* Creating Netbeans project
* Including web services client reference to the project
* Submitting a simple request to DACS Web Services, then verifying it's result  

## Creating Netbeans Project


#### Download Netbeans

This step is necesssary if Netbeans IDE is not installed on the target machine.
Go to:

[https://netbeans.org/downloads/](https://netbeans.org/downloads/)

And choose to download the latest free Java EE IDE.  This download option includes web servers, Glassfish and Apache Tomcat.

Install Netbeans.

#### Create Netbeans Project

From Netbeans menu, choose File->New Project

Next, select Java Web -> Web Application:

![NetBeans_WebApplication](https://github.com/TR-API-Samples/DACSStationAPI/blob/master/NetBeans_WebApplication.gif)

Click "Next", pick new project name and location.

Clieck "Next", then "Next" again (leaving default web server) and click "Finish".

The project is ready to be enriched with web service cleint reference.

## Including Web Service Client Reference

#### Getting Ready To Install (Sanity Check)

In the web browser adress window, enter:

[http://MY_DACS_HOST:MY_WS_PORT/DacsWS/DacsWebServiceService?wsdl](http://MY_DACS_HOST:MY_WS_PORT/DacsWS/DacsWebServiceService?wsdl)

One should see the WSDL definitions, as this is the way that the quickstart project will be set up, and how the resulting application will access the web service:

![DACSWSURL](https://github.com/TR-API-Samples/Quickstart.DACSStationAPI/blob/master/DACSWSURL.gif)

#### Adding Web Service Client Reference

In the projects pane, right-click on the newly-created project, selecting

New -> Web service client

Next, pick "WSDL URL" and type the URL verified in the previous step:

![WebServiceClient](https://github.com/TR-API-Samples/DACSStationAPI/blob/master/WebServiceClient.gif)

Click "Finish".

Now, by expanding MY_PROJECT-> Web Service References in the Projects pane, we verify that DacsWebService is ready to be used,
complete with all the method calls:

![WebServiceClientReference](https://github.com/TR-API-Samples/DACSStationAPI/blob/master/Web%20ServiceClientReference.gif)

## Submitting a Simple Request

We are going to create a simple single class java concole app. 

In Projects pane, right-click aon the new project and select "New Java class".

Edit the source code.  Within the newly created class, create "main" with the "scaffolding" that is necessary to call the webservice:

    public static void main(String[] args) { 
        DacsAdministratorName dan = new DacsAdministratorName();
        dan.setMAdministratorName("MY_DACS_ADMIN_USER");
        DacsAdministratorPassword dap = new DacsAdministratorPassword();
        dap.setMAdministratorPassword("MY_DACS_PASSWORD");
        DacsAdministratorLogin dal = new DacsAdministratorLogin();
        dal.setAAdministratorName(dan);
        dal.setAAdministratorPassword(dap);
        DacsApplicationDefinition dad = new DacsApplicationDefinition();
        dad.setMApplicationName("goodTestApp1");
        dad.setMApplicationId(777); //My app id

When Netbeans offers to resolve references by including imports, say "Ok".

Now put your cursor after main ends, right-click, choose "Insert Code" abd select "Call Web Service Operation":

![InsertWSOp](https://github.com/TR-API-Samples/DACSStationAPI/blob/master/InsertWSOp.gif)

Expand to and select "getVersion".

The method call should be added to the class and be ready to use:

![getVersion](https://github.com/TR-API-Samples/DACSStationAPI/blob/master/getVersion.gif)

Now to the end of our main we add a call to the method and print out the results:

![getVersionCall](https://github.com/TR-API-Samples/DACSStationAPI/blob/master/getVersionCall.gif)

In Projects pane, right-click on the newly updated Java file and select "Run file".

The output should reflect the version of the DACS we are connecting to, for example:

```
run:
Attributes: SUCCESS Version= 710
BUILD SUCCESSFUL (total time: 9 seconds)
```

Optionally, put your cursor after main ends, right-click, choose "Insert Code" abd select "Call Web Service Operation",

this time choosing "getApplicationList".



Add the following code to parse and lay out the results:

![callAndParseApplicationList](https://github.com/TR-API-Samples/DACSStationAPI/blob/master/callAndParseApplicationList.gif)

Run the file again, and see the parsed list of the applications defined within the DACS, complete with their names and ids.

For example:

```
run:
getVersion Result: Operation Success
Attributes: SUCCESS Version= 710
getApplicationList Result: Operation Success
Attributes: SUCCESS
Application Name=APH, Application ID=187
Application Name=AW, Application ID=9
Application Name=Adfin, Application ID=140
Application Name=Alert Server, Application ID=194
Application Name=Applix_RTSS, Application ID=128
Application Name=Arena, Application ID=155
Application Name=Aspen Graphics, Application ID=163
...
```

The complete Java code of this Quick Start can be found at: 

[https://github.com/TR-API-Samples/DACSStationAPI/blob/master/WSDACSTest2.java](https://github.com/TR-API-Samples/DACSStationAPI/blob/master/WSDACSTest2.java)


This concludes the Quick Start guide of DACS Station API.


Next, we would like to illustrate modification of DACS contents via DACS Station API calls in one of our examples found in Downloads section.

