@echo on
cd /d d:\vgtk\vgtk_viewer && mvn package && java -Xdebug -Xrunjdwp:transport=dt_socket,address=127.0.0.1:8080,suspend=y  -jar "D:\vgtk\vgtk_viewer\target\prj.jar"
cmd