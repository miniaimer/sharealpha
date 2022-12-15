package com.playground.share;

import android.app.Activity;
import android.content.ContentValues;
import android.net.Uri;

public class HistoryBridge {
    static String URL = "content://com.playground.architecture.provider.HistoryContentProvider/HistoryData_Database";
    static Uri CONTENT_URI  = Uri.parse(URL);
    static public String InsertNote(Activity activity, HistoryData historyData){
        ContentValues newValues = new ContentValues();
        newValues.put("Id", historyData.getId());
        newValues.put("PackageName", historyData.getPackageName());
        newValues.put("AppName", historyData.getAppName());
        newValues.put("Point", historyData.getPoint());
        newValues.put("AppThumbnailUrl", historyData.getAppThumbnailUrl());
        newValues.put("CustomData", historyData.getCustomData());
        try {
            activity.getContentResolver().insert(CONTENT_URI,newValues);
            return "OK";
        }catch (Exception e){
            return e.getMessage();
        }


    }
}
