package com.playground.share;

import static android.content.Context.BIND_AUTO_CREATE;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.playground.architecture.IAppDataAidlInterface;

public class AppDataBridge {
    public static IAppDataAidlInterface iAppDataAidlInterface;
    public static ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            iAppDataAidlInterface = IAppDataAidlInterface.Stub.asInterface(iBinder);
            Log.e("AppDataBridge", "onServiceConnected");
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            iAppDataAidlInterface = null;
            Log.e("AppDataBridge", "onServiceDisconnected");
        }
    };
    //initiate connection to dashboard
    public static void createConnection(Activity activity){
        Intent intent = new Intent("AppDataService");
        intent.setPackage("com.playground.architecture");
        activity.bindService(intent,mConnection, BIND_AUTO_CREATE);
    }
    public static void updateTime(Activity activity){
        try {
          iAppDataAidlInterface.updateAppData(activity.getPackageName());

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    //run the function to add 10 points on the dashboard
    public static String add10points(Activity activity){
        try {
           String text = iAppDataAidlInterface.Add10Points(activity.getPackageName());
           return text;
        } catch (RemoteException e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
