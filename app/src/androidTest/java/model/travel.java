package model;

import android.graphics.Color;

public class travel {
    private String username;
    private  int txtColor;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public travel(String username) {
        this.username = username;
        this.txtColor = Color.BLACK;

    }
}
