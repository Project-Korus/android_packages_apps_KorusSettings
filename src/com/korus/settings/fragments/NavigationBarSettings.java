package com.korus.settings.fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.PowerManager;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.SwitchPreference;
import android.provider.Settings;
import com.android.settings.R;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.android.internal.logging.nano.MetricsProto;

import com.android.settings.SettingsPreferenceFragment;


public class NavigationBarSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.korus_settings_navigation);
    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.KORUS_PROJECT_SETTINGS;
    }
}
