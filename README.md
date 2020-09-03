docker-compose up


Trash:
//To execute this docker-compose yml file use `docker-compose -f docker-compose.yml up`
//Add the `-d` flag at the end for detached execution
//To stop the execution, hit Ctrl+C, and then `docker-compose -f docker-compose.yml down`


//docker run -d -p 4444:4444 -p 5900:5900 -v /dev/shm:/dev/shm selenium/standalone-chrome-debug:3.141.59-yttrium

//dotnet test -s .runsettings -- RunConfiguration.remoteWebDriverUrl="http://selenium-hub:4444/wd/hub"
