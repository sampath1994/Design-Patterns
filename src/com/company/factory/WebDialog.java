package com.company.factory;

import com.company.factory.Dialog;

public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
