package edu.gatech.slowroastingautoclaves.recommendr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a monostate List of Movie objects.
 */
public class Movies implements Serializable {
    /**
     * List of Movie objects.
     */
    public static final List<Movie> ITEMS = new ArrayList<>();

    /**
     * Map of Movie objects to their title + release year identifier.
     */
    public static final Map<String, Movie> ITEM_MAP = new HashMap<>();

    /**
     * Adds Movie to List and Map.
     * @param item is Movie to add.
     */
    public static void addItem(Movie item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.toString(), item);
    }

    /**
     * Gets details about Movie.
     * @param position is index of Movie List to get Movie from.
     * @return the Movie description.
     */
    public static String makeDetails(int position) {
        return ITEMS.get(position).getDescription();
    }

    /**
     * Clears the static list/map of Movie objects (used to reset for a new search).
     */
    public static void clear() {
        ITEMS.clear();
        ITEM_MAP.clear();
    }
}
