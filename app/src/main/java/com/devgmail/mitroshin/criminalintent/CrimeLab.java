package com.devgmail.mitroshin.criminalintent;

import android.content.Context;

/**
 * Created by Dmitry on 07.10.2016.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

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

    }
}
