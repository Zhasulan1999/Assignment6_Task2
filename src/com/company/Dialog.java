package com.company;

interface Button{
    void render();
    void onClick();
}
class HTMLButton implements Button{

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}

class WindowsButton implements Button{

    @Override
    public void render() {

    }

    @Override
    public void onClick() {

    }
}

public abstract class Dialog{
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton();
}

class HtmlDialog extends Dialog{

    @Override
    protected Button createButton() {
        return new HTMLButton();
    }
}

class WindowsDialog extends Dialog{

    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
