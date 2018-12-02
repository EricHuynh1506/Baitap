package com.example.quangtoan.baitapandroid;

public class QuestionLibrary {
    private String content;
    private  boolean isTrue;

    public QuestionLibrary(String content, boolean isTrue) {
        this.content = content;
        this.isTrue = isTrue;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}
