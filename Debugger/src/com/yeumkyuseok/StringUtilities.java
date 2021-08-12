package com.yeumkyuseok;

public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        this.sBuilder.append(c);
        charsAdded++;
    }
}
