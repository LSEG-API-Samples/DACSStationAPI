## Overview

#### Audience

DACS Station API is mainly intended for DACS system administrators, a common use case is to automate administrative tasks that need to run repeatedly, many times.  

DACS Station API's usage requirements:

*  Solid undestrating of DACS
*  Approval by and access to privileged DACS credenatials from DACs Site Administrator (you will be trusted to modify DACS)
*  Limited programming knowledge

####  DACS Web Service

The DACS Web Service is a standard DACS feature available as of DACS 6.0.1.  DACS Web Service feature exposes programmatic interfaces for creating/querying and updating entitlements information contained within the DACS database. 

DACS Web Service is not intended to be used as the interface for the real-time entitlement of users. For the real-time entitlement of users, the Open DACS API is available.

This Web Service is a SOAP-based document literal interface based on the standards defined by the JAX-WS 2.0/2.1 specification. For more information about JAX-WS, refer to: 

[http://jax-ws.java.net/](http://jax-ws.java.net/)

DACS Station API works with DACS Web Service.
