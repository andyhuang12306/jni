cmake_minimum_required(VERSION 3.4.1)

add_library( counter-native

             SHARED

             src/main/cpp/com_example_ndkdemo_CounterNative.cpp )


add_library( counter-native-2

        SHARED

        src/main/cpp/com_example_ndkdemo_CounterNative2.cpp )


add_library( counter-native-3

        SHARED

        src/main/cpp/com_example_ndkdemo_CounterNative3.cpp )


