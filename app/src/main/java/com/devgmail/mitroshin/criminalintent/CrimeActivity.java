package com.devgmail.mitroshin.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        // Передаем в fm фрагмент для управления
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null) {
            fragment = new CrimeFragment();
            // Создает и закрепляет транзакцию фрагмента
            // Т.е. указываем идентификатор контейнерного представления и экземпляра фрагмента
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
    }
}
