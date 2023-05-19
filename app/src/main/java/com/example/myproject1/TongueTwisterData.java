package com.example.myproject1;
import java.io.Serializable;
//Эта активность будет передовать данные с кнопок в другую активность (ГОТОВО)
public class TongueTwisterData implements Serializable {
    private String title;
    private String illustration1;
    private String text;

    public TongueTwisterData(String title, String text, String illustration1) {
        this.title = title;
        this.text = text;
        this.illustration1 = illustration1;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getIllustration1() {
        return illustration1;
    }
    public void setIllustration1(String illustration) {
        this.illustration1 = illustration;
    }
}
