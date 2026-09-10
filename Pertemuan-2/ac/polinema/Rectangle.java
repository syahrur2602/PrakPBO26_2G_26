package Pertemuan_2.ac.polinema;

public class Rectangle {

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int width;
    int height;

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }
    
}
