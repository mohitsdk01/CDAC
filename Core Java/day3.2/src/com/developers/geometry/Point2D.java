package com.developers.geometry;
import java.util.Scanner;

public class Point2D {

	private int x = 0;
    private int y = 0;
    Scanner sc = new Scanner(System.in);
    public Point2D(){
    }
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String show(){
        return "x: "+ x +" y: " + y;
    }
    public void AcceptPoints(){
        System.out.println("Enter x: ");
        x = sc.nextInt(); //5 //8
        System.out.println("Enter y: "); 
        y = sc.nextInt();  //6 //9
    }
    public double calculateDistance(Point2D p2){
        int xValue = p2.x - this.x;
        int yValue = p2.y - this.y;
        double res = Math.sqrt((xValue * xValue) + (yValue * yValue));
        return res;
    }
    public boolean isEqual(Point2D p2){
        // System.out.println(p2.x + p2.y);
        return (this.x == p2.x) && (this.y == p2.y);
    }
    public void DisplayPoints() {
    	System.out.println("x: " + x + " y: " + y);
    }
}
