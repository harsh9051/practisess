class Parent {
    Parent() {
        System.out.println("This is Parent");
    }

    Parent(int a) {
        System.out.println("The Area of the circle" + (Math.PI * a * a));
    }

    public void study() {
        System.out.println("I am studying");
    }

    void study(int a) {
        System.out.println("I am studying with a variable" + a);
    }
}

class Child extends Parent {
    Child() {
        super();
        // super(10);
    }

    public void study() {
        System.out.println(" I am not studying");
    }

}

class MAIN {
    public static void main(String[] args) {
        Parent p = new Parent(10);
        p.study();
        p.study(10);

        Child c = new Child();
        c.study();
    }
}