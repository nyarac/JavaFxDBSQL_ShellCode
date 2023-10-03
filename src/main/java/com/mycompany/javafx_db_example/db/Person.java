package com.mycompany.javafx_db_example.db;

public class Person {

    private String phone;
    private String name;
    private String email;
    private String password;
    private String address;
        private int Salary;
        public Person() {
            this.name = " ";
            this.email = " ";
            this.phone = " ";
            this.address = " ";
            this.password = " ";
            this.Salary = 0;

        }


        public Person(String name, String email, String phone, String address, String password, int Salary) {
            this.name = name;
            this.password = password;
            this.email = email;
            this.address = address;
            this.phone = phone;
            this.Salary = Salary;
        }




        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return Salary;
        }

        public void setSalary (int Salary) {
            this.Salary = Salary;
        }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

