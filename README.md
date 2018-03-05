# Input-Output Tasks
by Atid Srisukhantapuek

I ran the tasks with 2.6Ghz i7-6700HQ,
and got these results:


 Task                                          |   Time
 ----------------------------------------------|-------:
 Read file 1-char at a time to String          | 0.066165333 sec
 Read file 1-char at a time to StringBuilder   | 0.001921975 sec
 Read file line at a time using BufferedReader | 0.004043061 sec 

# Explanation of Results

-String generates a new String and discard the older String for garbage collection.
it cause a lot of garbage then string is slowest

