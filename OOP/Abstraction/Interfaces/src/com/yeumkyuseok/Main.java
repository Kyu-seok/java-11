package com.yeumkyuseok;

public class Main {

    public static void main(String[] args) {
        ITelephone kyusPhone;
        kyusPhone = new DeskPhone(123456);
        kyusPhone.powerOn();
        kyusPhone.callPhone(123456);
        kyusPhone.answer();

        kyusPhone = new MobilePhone(24565);
        kyusPhone.powerOn();
        kyusPhone.callPhone(24565);
        kyusPhone.answer();
    }
}
