@echo off
setlocal
set MAVEN_WRAPPER_DIR=%~dp0\.mvn\wrapper
java -jar "%MAVEN_WRAPPER_DIR%\maven-wrapper.jar" %*
endlocal
