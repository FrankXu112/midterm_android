package com.example.frankxu.education;

import java.util.UUID;

/**
 * Created by frankxu on 2018-02-05.
 */

public class Major {
    private UUID mId;
    private String mTitle;
    private String mResult;

    public void setId(UUID id) {
        mId = id;
    }

    public UUID getId() {
        return mId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setResult(String result) {
        mResult = result;
    }

    public String getResult() {
        return mResult;
    }
}
