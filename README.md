# jni

the process of jni programming is as following:

1. define a java class with native methods

2. compile the java class into C Header file with javac -h . <class path>

3. according to the c Header file to realize the native methods with c++

4. generate .so lib with CMake

5. copay .so folder to app/lib

6. System.loadLibary("libname")

7. test the native method by calling it and let native code call java method.


key issue:

1. compile java class to C Header file probably need to add android.jar to environment PATH or will complain can not find the imported android packages in this java file

2. remember to load the libary in  static {} and pay attention to the lib name


functions included:

1. a basic test for c++ and java function call;

2. a test for c++ and java instance passing to binding each other's instance

what to do next:

1. do more C++ grammar practice
