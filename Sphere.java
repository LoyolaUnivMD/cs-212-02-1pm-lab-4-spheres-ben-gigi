/** Programmers: Ben Zakielarz and Gigi Li
* Course:  CS 212
* Due Date: 02/18/2024
* Lab Assignment: 4
* Problem Statement: Create a new class named Sphere and use it to create sphere objects and to detect sphere collisions
* Data In: none
* Data Out: Sphere's surface area, volume, distance from its center, and whether the two spheres collide
* Credits: none
*/

import java.lang.Math;
class Sphere {
    //data fields
    double r;
    double x;
    double y;
    double z;

    //default values
    public Sphere(double r, double x, double y, double z){
        //constructor
        this.r = r;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //method to calculate the surface area of the sphere
    static double calcSurfaceArea(Sphere sphere) {
        double area = 4 * Math.PI * Math.pow(sphere.r, 2);
        return area;
    }

    //method to calculate the volume of the sphere
    static double calcVolume(Sphere sphere) {
        double volume = (Math.pow(sphere.r, 3)) * ((double) 4 /3) * Math.PI;
        return volume;
    }

    //method to calculate the distance from the center of the sphere to the arbitrary point
    static double calcDistanceFromCenter (Sphere sphere) {
        //let Q equal an arbitrary point in space
        int[] q = { 0, 0, 0 };
        double distance = Math.sqrt(Math.pow(sphere.x-q[0], 2) + Math.pow(sphere.y-q[1], 2) + Math.pow(sphere.z-q[2], 2));
        return distance;
    }

    //method to determine whether the two spheres will collide
    static boolean isColliding(Sphere sphere1, Sphere sphere2) {
        if(Math.abs(sphere1.calcDistanceFromCenter(sphere1) - sphere2.calcDistanceFromCenter(sphere2)) < (sphere1.r + sphere2.r)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
       System.out.println("Spheres Go Here");
    }
}
