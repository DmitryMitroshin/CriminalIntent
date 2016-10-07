package com.devgmail.mitroshin.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Dmitry on 07.10.2016.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    // Список, для хранения объектов Crime
    private List<Crime> mCrimes;

    // Синглейтный класс. Создает объект, если тот ранее не существовал.
    // Возвращает экземпляр, если тот уже имеется.
    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    // Конструктор синглетного класса должен быть закрытым
    private CrimeLab (Context context) {
        mCrimes = new ArrayList<>();
        // Заполняем массив для примера
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0); // Каждый четный будет раскрыт
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    // Возвращает конкретный элемент списка по идентификатору
    public Crime getCrime (UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
