package com.playground.share;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class Share {
    static String AUTHORITY = "com.playground.architecture.provider.CoinContentProvider";
    static String CONTENT_PATH = "coin_database";
    static String URL = "content://$AUTHORITY/$CONTENT_PATH";
    static Uri CONTENT_URI  = Uri.parse(URL);
    static String _ID = "id";
    static String VALUE = "coin";
    static public void UpdateCoins(Activity activity, long coinValue){
          ContentValues newValues = new ContentValues();
          newValues.put(VALUE, coinValue);
          activity.getContentResolver().update(CONTENT_URI,newValues,null,null);
      }
    public long GetCoins(Activity activity){
        ContentValues newValues = new ContentValues();
        Cursor c = activity.getContentResolver().query(CONTENT_URI, null, null, null, null);
        if (c.moveToFirst()) {
            do {
                if (c.getString(0).equals("1")){
                    return c.getLong(1);
                }
            } while (c.moveToNext());
        }
        return -1;
    }
}
