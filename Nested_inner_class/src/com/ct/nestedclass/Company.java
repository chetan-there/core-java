package com.ct.nestedclass;

class Company {
    private String companyName = "Tech Corp";

    // Inner class
    class Employee {
        void showDetails() {
            System.out.println("Company: " + companyName);
        }
    }

    public static void main(String[] args) {
        Company outer = new Company();                // Create outer class instance
        Company.Employee emp = outer.new Employee();  // Create inner class instance
        emp.showDetails();
    }
}
