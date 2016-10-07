package com.devgmail.mitroshin.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Dmitry on 07.10.2016.
 */

public abstract class SingleFragmentActivity extends FragmentActivity {

    // Метод, используемый для создания экземпляра фрагмента
    // Субклассы данного класса реализуют этот метод так, чтобы он возвращал экземпляр фрагмента,
    // хостом которого является активность
    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        // Передаем в fm фрагмент для управления
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null) {
            fragment = createFragment();
            // Создает и закрепляет транзакцию фрагмента
            // Т.е. указываем идентификатор контейнерного представления и экземпляра фрагмента
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
    }
}
