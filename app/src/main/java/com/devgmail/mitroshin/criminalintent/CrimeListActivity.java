package com.devgmail.mitroshin.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Dmitry on 07.10.2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
