package com.ct.nestedclass;

public enum Role {
    ADMIN, USER;

    class Info {
        void show() {
            System.out.println("Enum role: " + Role.this.name());
        }
    }

    public static void main(String[] args) {
        Role.Info adminInfo = Role.ADMIN.new Info();
        adminInfo.show();  // Output: Enum role: ADMIN
    }
}
