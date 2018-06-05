package com.qin.study;

import com.guwei.volume.OperationFailedException;
import com.guwei.volume.VolumeControl;

/**
 * 描述:
 *
 * @outhor qinhaochun
 * @create 2018-05-31 18:40
 */
public class HelloJNI {
    static {
        // hello.dll (Windows) or libhello.so (Unixes)
        System.loadLibrary("HelloJNI");
    }

    private native void sayHello();

    private native boolean SetVolumeLevel(int level);

    public static void main(String[] args) {

        new HelloJNI().sayHello();  // invoke the native method
        boolean b = new HelloJNI().SetVolumeLevel(200);
        try {
            boolean mute = VolumeControl.getInstance().getMute();
            System.out.println(mute);
        } catch (OperationFailedException e) {
            e.printStackTrace();
        }
    }

}