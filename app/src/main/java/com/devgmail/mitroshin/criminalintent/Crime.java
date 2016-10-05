package com.devgmail.mitroshin.criminalintent;

import java.util.UUID;

/**
 * Created by Dmitry on 05.10.2016.
 */

public class Crime {

    // Идентификатор объекта преступления
    private UUID mId;
    // Название преступления
    private String mTitle;

    public Crime() {
        // Генерация уникального идентификатора
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
