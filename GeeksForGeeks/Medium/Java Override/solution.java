class Child extends Parent {
    @Override
    void show(int p) {
        System.out.print(p + " ");
    }

    @Override
    void print(int q) {
        // Add your code here.
        System.out.print(q*q+" ");
        System.out.println();
    }
}