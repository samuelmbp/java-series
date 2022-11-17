package generics;

/** Comparable Interface - */
public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // Needs if else logic
        return this.points - other.points;

        // Doesn't need the if else logic
        // return Integer.compare(this.points, other.points);

    }
}

