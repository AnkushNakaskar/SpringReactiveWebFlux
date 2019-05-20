# SpringReactiveWebFlux
This project tell more about the reactive webflux in spring

If you run the script named as "runScript.py",You will find the logs the thread name which will be more than 200,Which is default to tomcat pool.

Logs :


Thread[Thread-306,5,main]   :::: Processing request for count : 99
Thread[Thread-323,5,main]   :::: Processing request for count : 99
Thread[Thread-314,5,main]   :::: Processing request for count : 99
Thread[Thread-292,5,main]   :::: Processing request for count : 99
Thread[Thread-320,5,main]   :::: Processing request for count : 99
Thread[Thread-339,5,main]   :::: Processing request for count : 99
Thread[Thread-340,5,main]   :::: Processing request for count : 99
Thread[Thread-295,5,main]   :::: Processing request for count : 99
Thread[Thread-330,5,main]   :::: Processing request for count : 99
Thread[Thread-326,5,main]   :::: Processing request for count : 99
Thread[Thread-325,5,main]   :::: Processing request for count : 99



This indicate that,There is reacitve behaviour and threads are getting released once they are blocked.

For more info : https://howtodoinjava.com/spring-webflux/spring-webflux-tutorial/


If you run the URL from crome,You can see only 6 request at a time ,Which is limitation of crome browser.It limit only six concurrent request at the time.

https://stackoverflow.com/questions/12060869/why-is-node-js-only-processing-six-requests-at-a-time
