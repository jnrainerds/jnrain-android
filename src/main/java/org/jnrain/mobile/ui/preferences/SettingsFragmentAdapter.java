/*
 * Copyright 2013 JNRain
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.jnrain.mobile.ui.preferences;

import name.xen0n.cytosol.ui.preference.BaseSettingsFragmentAdapter;

import org.jnrain.mobile.R;

import android.content.Context;
import android.support.v4.app.FragmentManager;


public class SettingsFragmentAdapter extends BaseSettingsFragmentAdapter {
    public SettingsFragmentAdapter(FragmentManager fm, Context context) {
        super(fm, context);
    }

    @Override
    public void initFragments() {
        addItem(
                R.xml.prefs_general,
                R.string.prefs_title_general,
                SettingsGeneralFragment.class);
    }

    @Override
    public int getIconResId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
}
