public class TextEditor {

    private boolean isCapsLock = false;

    public void capsLock() {
        if (isCapsLock)
            isCapsLock = false;
        else
            isCapsLock = true;
    }

    public void print(String str) {
        if (isCapsLock)
            System.out.println(str.toUpperCase());
        else
            System.out.println(str);
    }
}

