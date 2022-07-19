package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }

    public Area() {

    }

    public  void calculateArea() {
        Scanner input = new Scanner(System.in);
       Double myUsersRadius = input.nextDouble();

       Double area = Circle.getArea(myUsersRadius);
        System.out.println(area);

        input.close();
    }
}