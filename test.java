abstract class test {
    public void t() {
        System.out.println("Welcome");
    }

    abstract void study();
}

class manssss extends test {

    void study() {
        System.out.println("I am studying");
    }

    public static void main(String[] args) {
        test m = new manssss();
        m.study();
    }
}