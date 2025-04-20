package com.ct.nestedclass;

class TestLocalInner {
    void show() {
        int count = 10; // must be effectively final

        // Local inner class
        class Local {
            void print() {
                System.out.println("Count = " + count);
            }
        }

        Local obj = new Local();
        obj.print();
    }

    public static void main(String[] args) {
        new TestLocalInner().show();
    }
}
