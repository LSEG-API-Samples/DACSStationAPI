# DACS Station API - Quick Start Guide


## Introduction

This Quickstart guide will show how to get one's first DACS Station API client application up and running.  Please note, that this API is often referred to by engineers as "DACS Web Service API".    

Together, we will examine the following steps: 

*  Creating Netbeans project
*  Adding web services client reference to the project
*  Submitting a simple request to DACS Web Services, then verifying it's result 

## Overview

#### Audience

DACS Station API is primarily intended to be used by DACS system administrators, to automate some tasks that need to be run repeatedly.  

It's usage requires:

*  Solid undestrating of DACS
*  Approval by and access to privileged DACS credenatials from DACs Site Administrator (you will be trusted to modify DACS)
*  Limited programming knowledge

####  DACS Web Service

The DACS Web Service is a standard DACS feature available as of DACS 6.0.1.  DACS Web Service feature exposes programmatic interfaces for creating/querying and updating entitlements information contained within the DACS database. 

DACS Web Service is not intended to be used as the interface for the real-time entitlement of users. For the real-time entitlement of users, the Open DACS API is available.

This Web Service is a SOAP-based document literal interface based on the standards defined by the JAX-WS 2.0/2.1 specification. For more information about JAX-WS, refer to: 

[http://jax-ws.java.net/](http://jax-ws.java.net/)

DACS Station API works with DACS Web Service.


## Creating Netbeans Project

#### Download Netbeans

This step is necesssary if Netbeans IDE is not installed on the target machine.
Go to:

[https://netbeans.org/downloads/](https://netbeans.org/downloads/)

And choose to download the latest free Java EE IDE.  It includes web servers, Glassfish and Apache Tomcat.

## Adding Web Service Client Reference

#### Getting Ready To Install (Sanity Check)

In the web browser adress window, enter:

[http://MY_DACS_HOST:MY_WS_PORT/DacsWS/DacsWebServiceService?wsdl](http://MY_DACS_HOST:MY_WS_PORT/DacsWS/DacsWebServiceService?wsdl)

One should see the WSDL definitions, as this is the way that the quickstart project will be set up, and how the resulting application will access the web service:

![DACSWSURL](https://github.com/TR-API-Samples/Quickstart.DACSStationAPI/blob/master/DACSWSURL.gif)




## Submitting a Simple Request

