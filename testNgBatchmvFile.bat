set projectLocation=C:\Users\Jit\Desktop\Selenium\MavenProjectPrac
cd %projectLocation%
set classpath=%projectLocation%\target\test-classes;C:\Users\Jit\.m2\repository\org\testng\testng\6.14.3\testng-6.14.3.jar;C:\Users\Jit\.m2\repository\com\beust\jcommander\1.72\jcommander-1.72.jar;%classpath%;
java org.testng.TestNG %projectLocation%\sanity.xml
pause