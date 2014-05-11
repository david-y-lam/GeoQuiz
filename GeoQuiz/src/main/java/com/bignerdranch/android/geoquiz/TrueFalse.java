package com.bignerdranch.android.geoquiz;

/**
 * Created by davidlam on 5/10/14.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean trueQuestion;

    public TrueFalse(int mQuestion, boolean trueQuestion) {
        this.mQuestion = mQuestion;
        this.trueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean isTrueQuestion() {
        return trueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        this.trueQuestion = trueQuestion;
    }
}
