/** Programmers: Ben Zakielarz and Gigi Li
 * Course:  CS 212
 * Due Date: 02/18/2024
 * Lab Assignment: 4
 * Problem Statement: Create a new class named Sphere and use it to create sphere objects and to detect sphere collisions
 * Data In: none
 * Data Out: Sphere's surface area, volume, distance from its center, and whether the two spheres collide
 * Credits: none
 */

class Main {
    public static void main(String[] args) {
        //tell the user the purpose of the program
        System.out.println("This program will show you the distance from the center, surface area, and volume of the Sun, Earth, and PlanetX, including whether the objects will collide or not.\n");

        //spherical objects
        Sphere sun = new Sphere(43.26, 0, 0, 0);
        Sphere earth = new Sphere(.395, 26, 42, 79);
        Sphere planetX = new Sphere(1.4, 25.3, 43.1, 77.8);

        //output the distance from the center of each spherical object
        System.out.println("Distances from center, sun, earth, planetX");
        System.out.println("Sun: " + Sphere.calcDistanceFromCenter(sun));
        System.out.println("Earth: " + Sphere.calcDistanceFromCenter(earth));
        System.out.println("PlanetX: " + Sphere.calcDistanceFromCenter(planetX));

        //output the surface area of each spherical object
        System.out.println("\nCalculates the surface area of the sun, earth, and planetX");
        System.out.println("Sun: " + Sphere.calcSurfaceArea(sun));
        System.out.println("Earth: " + Sphere.calcSurfaceArea(earth));
        System.out.println("PlanetX: " + Sphere.calcSurfaceArea(planetX));

        //output the volume of each spherical object
        System.out.println("\nVolume of the Sun, Earth, and PlanetX");
        System.out.println("Sun: " + Sphere.calcVolume(sun));
        System.out.println("Earth: " + Sphere.calcVolume(earth));
        System.out.println("PlanetX: " + Sphere.calcVolume(planetX));

        //output whether the two spherical objects are colliding
        System.out.println("\nCheck whether the spherical objects are colliding: ");
        System.out.println("Sun and Earth: " + Sphere.isColliding(sun, earth));
        System.out.println("Earth and PlanetX: " + Sphere.isColliding(earth, planetX));
        System.out.println("PlanetX and Sun: " + Sphere.isColliding(planetX, sun));

        //thank the user for using this program
        System.out.println("\n Thank you for using this program.");
    }
}
