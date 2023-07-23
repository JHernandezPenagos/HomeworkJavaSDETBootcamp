package com.ti.sesion1;

public class OOPExample {
    public void main(String[] args) {

        Employee.setEmployeeName("Luis");
        Employee.setSalary(1000);

        System.out.println(Employee.getEmployeeName() + " his/her salary is " + Employee.getSalary());

        Employee.setEmployeeName("Jimena");
        Employee.setSalary(2000);

        System.out.println(Employee.getEmployeeName() + " his/her salary is " + Employee.getSalary());

       /* Car car = new Car(); // Instanciar, cuando le decimos que un Objeto tiene un molde (new Car())

        car.setTireCount(4);
        System.out.println(car.getTireCount());*/


    }

    class Car {

        // El constructor realmente es el que manda llamar a Java
        public Car(int tireCount) {
            this.tireCount = tireCount;
        }

        int tireCount;

        public int getTireCount() {
            return tireCount;
        }

        public void setTireCount(int tireCounts) {
            tireCount = tireCounts;
        }
    }

    class Employee{
        static String employeeName;
        static float salary;

        //Void = Mutator = quiere decir que pede cambiar y no me va a regresar ningun valor
        //Metodo
        static void setEmployeeName(String name){
            employeeName = name;
        }

        static void setSalary(float salary){
            salary = salary; //this hace referencia a que estoy hablando a mi variable superior. Cuando no estatico se pone el this
        }

        //Accesor = no me va a cambiar nada, solo me va a traer valores
        static float getSalary(){
            return salary;
        }

        static String getEmployeeName(){
            return employeeName;
        }


    }

}
