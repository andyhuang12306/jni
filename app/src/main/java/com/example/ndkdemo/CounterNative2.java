package com.example.ndkdemo;


import android.os.Handler;
import android.os.Message;

public class CounterNative2 {

    private static Handler handler;
    private int number;

    static{
        System.loadLibrary("counter-native-2");
    }

    public CounterNative2(){
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                MainActivity.Companion.setPageTitle(msg.obj.toString());
            }
        };
        number=40;

        nativeSetup();
    }

    private native void nativeSetup();

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

    public native void nativeExe();
}
