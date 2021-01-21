package com.company.polymorphism;

public class Ford {
    public static void main(String[] args){
        Cars car = new Cars("base car",8);

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ferrari ferrari = new Ferrari("aston",8);
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());

    }

    static class Cars{

        public String name;
        public int cylinder;
        public boolean engine;
        public int wheels;

        public String getName() {
            return name;
        }

        public int getCylinder() {
            return cylinder;
        }

        public boolean isEngine() {
            return engine;
        }

        public int getWheels() {
            return wheels;
        }

        public Cars(String name, int cylinder) {
            this.name = name;
            this.cylinder = cylinder;
            this.engine = true;
            this.wheels = 4;


        }

        public String startEngine(){
            return "Car -> startEngine() ";
        }

        public String accelerate(){
            return "Car -> accelerate() ";
        }

        public String brake(){
            return "Car -> brake() ";
        }
    }

        static class Ferrari extends Cars{
        @Override
        public String startEngine() {
            return "Ferrari -> startEngine() ";
        }

        @Override
        public String accelerate() {
            return "Ferrari -> accelerate() ";
        }

        @Override
        public String brake() {
            return "Ferrari -> brake() ";
        }

        public Ferrari(String name, int cylinder) {
            super(name, cylinder);



        }
    }

}
