package com.example.ndkdemo;


import android.os.Handler;
import android.os.Message;

public class CounterNative {

    private static Handler handler;

    static{
        System.loadLibrary("counter-native");
    }

    public CounterNative(){
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                MainActivity.Companion.setPageTitle(msg.obj.toString());
            }
        };

        nativeSetup();
    }

    public native void nativeSetup();

    public void setV(int v){
        Message msg = Message.obtain();
        msg.obj=v;
        handler.sendMessage(msg);
    }

    public static void setValue(int v){
        Message msg = Message.obtain();
        msg.obj=v;
        handler.sendMessage(msg);
    }

    public static native void nativeExecute(int v);
    public native void nativeExe(int v);
}
