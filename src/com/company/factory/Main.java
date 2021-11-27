package com.company.factory;

public class Main {

    public static void main(String[] args) {
	    Dialog dialog;
        final String OS = "window";

        if(OS.equals("windows")){
            dialog = new WindowsDialog();
        }else{
            dialog = new WebDialog();
        }

        dialog.render();
    }
}
