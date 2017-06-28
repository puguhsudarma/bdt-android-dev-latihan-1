package com.reroet.bdtbatch2_latihan.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by reroet on 28/06/17.
 */

public class PrefManager {

    public PrefManager(){

    }

    public void saveString(Context context, String key, String value){
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(key, value)
                .apply();
    }

    public String getString(Context context, String key){
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(key, null);
    }

    public void saveBool(Context context, String key, boolean value){
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putBoolean(key, value)
                .apply();
    }

    public boolean getBool(Context context, String key){
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getBoolean(key, false);
    }
}
