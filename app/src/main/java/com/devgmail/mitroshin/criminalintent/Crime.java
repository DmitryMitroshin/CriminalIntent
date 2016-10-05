package com.devgmail.mitroshin.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Dmitry on 05.10.2016.
 */

public class Crime {

    private UUID mId; // Идентификатор объекта преступления
    private String mTitle; // Название преступления
    private Date mDate;
    private boolean mSolved;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime() {
        mDate = new Date();
        mId = UUID.randomUUID(); // Генерация уникального идентификатора
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
