package oop;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//
//        if( !(obj instanceof Point)) return false;
//
//        Point other = (Point)obj;
//        return other.x == x && other.y == y;
//    }
//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Reference Equality
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
