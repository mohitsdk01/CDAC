package com.tester;
import com.developers.geometry.*;
import java.util.*;
public class TestPoints {

	public static void main(String[] args) {
//		Point2D p = new Point2D(2, 5);
//        System.out.println(p.show());
//        Point2D p3 = new Point2D(9, 4);
//        System.out.println(p3.show());
//        
//        Point2D p1 = new Point2D();
//        p1.AcceptPoints();
//        Point2D p2 = new Point2D();
//        p2.AcceptPoints();
//        
//        if(p1.isEqual(p2)){ //p1=5,6   p2=8,9
//            System.out.println("Equal Points.");
//        }
//        else{
//            System.out.println("Different Points.");
//            System.out.println("Distance: " + p1.calculateDistance(p2));
//        }
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int choice;
        do {
        	count++;
        	System.out.println("Enter Size of Points to be created: ");
            Point2D[] points = new Point2D[sc.nextInt()];
            
        	System.out.println("\nMenu:");
            System.out.println("1. Plot a point");
            System.out.println("2. Display all points");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
            	for(int i=0; i<points.length; i++) {
                	System.out.println("Enter the Points: ");
                	points[i] = new Point2D();
                	points[i].AcceptPoints();
//                	points[i] = new Point2D(sc.nextInt(), sc.nextInt());
                	for(int j=0; j<i; j++) {
                		if(points[i].isEqual(points[j])) {
                			System.out.println("Co-ordinates are same! \n\n Enter One more time: ");
                			points[i].AcceptPoints();
                		}
                	}
                }
            	
            	System.out.println("The Co-ordinates are: ");
                for(Point2D x : points) {
                	x.DisplayPoints();
                }
            	break;                
            case 0:
            	System.exit(1);
            }
        }while(count > 0);
        
	}
}
