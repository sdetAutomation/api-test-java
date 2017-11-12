```                                                                      
#             .___      __     _____          __                         __  .__               
#    ______ __| _/_____/  |_  /  _  \  __ ___/  |_  ____   _____ _____ _/  |_|__| ____   ____  
#   /  ___// __ |/ __ \   __\/  /_\  \|  |  \   __\/  _ \ /     \\__  \\   __\  |/  _ \ /    \ 
#   \___ \/ /_/ \  ___/|  | /    |    \  |  /|  | (  <_> )  Y Y  \/ __ \|  | |  (  <_> )   |  \
#  /____  >____ |\___  >__| \____|__  /____/ |__|  \____/|__|_|  (____  /__| |__|\____/|___|  /
#       \/     \/    \/             \/                         \/     \/                    \/ 
```

# api-test-java
Startup Project for testing Rest Api using Java.


Introduction
------------
This project is made for anyone who is looking for a starting point for testing a Rest Api in Java.

This projet was written using IntelliJ IDEA Community Edition.   


Project Packages
-----
* Api:  
Contains class files used for testing rest api.  
    - BitPay:
        - GetBitPayData: get bitpay data.
        - TestDataBitPay: test data baselines setup. 
        - VerifyBitPay: bitpay verification functions. 
    
    - JsonPlace?Holder:
        - DeleteJsonPlaceholder: delete a jsonplaceholder record.
        - PostJsonPlaceholder: create a jsonplaceholder record.
        - PutJsonPlaceholder: edit a jsonplaceholder record. 
        - TestDataJsonPlaceholder: test data baseline setup.
        - VerifyJsonPlaceholder: jsonplaceholder verification functions. 
        
        
* DataModel:
    - Class for creating bitpay and jsonplaceholder objects. 
    
 
* TestHelper:  
    - ConfigSettings: Helper functions for reading config.properties.  
    - IoLibrary: Helper functions used across tests.  
    - LoggingLibrary: Custom functions for comparing actual to expected conditions.  
    - TestAssert: Is a custom assert, used to track if a verification point has failed.  The class variable is latched, once set to false it will remain false for the remainder of the test run. 


Maven Java Project
-----
This project is written in Java and tests can be executed using Maven commands. 

    mvn clean
    mvn install -DskipTests
    mvn surefire:test

Test Rest Api
-----
    https://bitpay.com/api/
    https://jsonplaceholder.typicode.com/    

   
Continuous Integration(CI)
------------
A web hook has been setup with Travis CI for all Push and Pull Requests.
 

Questions / Contact / Contribute
------------
Feel free to fork this repo, add to it, and create a pull request if you like to contribute.  

If you have any questions, you can contact me via email: `sdet.testautomation@gmail.com`
