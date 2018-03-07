# DACS Station API - Quick Start Guide


## Introduction

This Quickstart guide will show how to get one's first DACS Station API client application up and running.  Please note, that this API is often referred to by engineers as "DACS Web Service API".    

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

[NetBeans_WebApplication](https://github.com/TR-API-Samples/DACSStationAPI/blob/master/NetBeans_WebApplication.gif)

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


