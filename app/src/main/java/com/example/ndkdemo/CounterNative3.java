package com.example.ndkdemo;

public class CounterNative3 {

    public long cObj;
    private INumber mListener;

    static{
        System.loadLibrary("counter-native-3");
    }

    public CounterNative3(){
        nativeSetup();
    }

    public void setNumberListener(INumber listener){
        mListener=listener;
    }

    public int getNumb(){
        if(mListener!=null){
            return mListener.onNumber();
        }
        return -1;
    }

    private native void nativeSetup();

}
