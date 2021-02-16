# sdk 

- This SDK accept two parameter one is Platform input type string and other one is Organization name than that function process
- The data do network call and provide the list of parsed model values that receive in list model are repository name, privacy status, description, language
- Writen unit test cases also for parsing function to check
- Tests are compiled to run locally on the Java Virtual Machine 
- Aar file created

# How To Use
#### Include Library in your project

just include the following line your build.gradle (Module:app) file and sync project.

`implementation 'com.github.vivekmaheshsahu:sdkTask:Tag'`

After including the library you have to do function call with its parameter

`GetRepo.getRepos("android", "rakutentech")`

Please Report any issue or suggestions if you have.
