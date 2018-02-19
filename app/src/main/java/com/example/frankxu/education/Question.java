package com.example.frankxu.education;

import java.util.UUID;

/**
 * Created by frankxu on 2018-02-05.
 */

public class Question {
    private UUID mId;
    private String mTitle;
    private String mAnswer;

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public UUID getId() {
        return mId;
    }

    public void setAnswer(String answer) {
        mAnswer = answer;
    }

    public String getAnswer() {
        return mAnswer;
    }
}
