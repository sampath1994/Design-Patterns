package com.company.factory;

public class WindowsDialog extends Dialog{
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
