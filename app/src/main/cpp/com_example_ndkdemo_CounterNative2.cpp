/* DO NOT EDIT THIS FILE - it is machine generated */

#include "com_example_ndkdemo_CounterNative2.h"
#include <jni.h>

jclass m_class;
jobject m_object;
jmethodID m_mid;
jfieldID m_fid;

JNIEXPORT void JNICALL Java_com_example_ndkdemo_CounterNative2_nativeSetup
  (JNIEnv *env, jobject thiz) {
    jclass clazz=(env)->GetObjectClass(thiz);
    m_class=(jclass)(env)->NewGlobalRef(clazz);
    m_object=(jobject)(env)->NewGlobalRef(thiz);
    m_mid=(jmethodID)(env)->GetMethodID(clazz, "setV", "(I)V");
    m_fid=(jfieldID)(env)->GetFieldID(clazz, "number", "I");
};

/*
 * Class:     com_example_ndkdemo_CounterNative2
 * Method:    nativeExe
 * Signature: ()V
 */
JNIEXPORT void JNICALL
Java_com_example_ndkdemo_CounterNative2_nativeExe
  (JNIEnv *env, jobject thiz){
    int n, i, sum=0;
    n= (int)((env)->GetIntField(thiz, m_fid));
    for(i=0; i<n; i++){
        sum+=i;
    }

    (env)->CallVoidMethod(thiz, m_mid, sum);
};