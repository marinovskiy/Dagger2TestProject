package com.alex.m.dagger2testproject.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceUtil {

    private static final String PREFS_KEY_AUTH_TOKEN = "auth_token";
    private static final String PREFS_KEY_USER_ID = "user_id";
    private static final String PREFS_KEY_FIRST_RUN = "first_run";

    private SharedPreferences sharedPreferences;

    public PreferenceUtil(Context context) {
        sharedPreferences = context.getSharedPreferences(
                context.getPackageName(),
                Context.MODE_PRIVATE
        );
    }

    public String getAuthToken() {
        return sharedPreferences.getString(PREFS_KEY_AUTH_TOKEN, null);
    }

    public void setAuthToken(String authToken) {
        updateStringValue(PREFS_KEY_AUTH_TOKEN, authToken);
    }

    public long getUserId() {
        return sharedPreferences.getLong(PREFS_KEY_USER_ID, 0);
    }

    public void setUserId(long userId) {
        updateLongValue(PREFS_KEY_USER_ID, userId);
    }

    public boolean isFirstRun() {
        return sharedPreferences.getBoolean(PREFS_KEY_FIRST_RUN, true);
    }

    public void setFirstRun(boolean isFirstRun) {
        updateBooleanValue(PREFS_KEY_FIRST_RUN, isFirstRun);
    }

    private void updateStringValue(String key, String value) {
        sharedPreferences.edit()
                .putString(key, value)
                .apply();
    }

    private void updateLongValue(String key, long value) {
        sharedPreferences.edit()
                .putLong(key, value)
                .apply();
    }

    private void updateBooleanValue(String key, boolean value) {
        sharedPreferences.edit()
                .putBoolean(key, value)
                .apply();
    }
}