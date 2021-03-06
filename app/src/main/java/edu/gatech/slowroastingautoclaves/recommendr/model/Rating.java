package edu.gatech.slowroastingautoclaves.recommendr.model;

import java.io.Serializable;

/**
 * Represents a rating for a movie that tracks the user and major that made the rating.
 */
public class Rating implements Serializable {
    private String identifier;
    private User user;
    private double rating;

    /**
     * Constructor for Rating.
     * @param identifier is identifier.
     * @param user is user.
     * @param rating is rating.
     */
    public Rating(String identifier, User user, double rating) {
        this.identifier = identifier;
        this.user = user;
        this.rating = rating;
    }

    /**
     * Getter for movie identifier.
     * @return the identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Getter for user major.
     * @return the major
     */
    public String getMajor() {
        return this.user.getMajor();
    }

    /**
     * Getter for movie rating.
     * @return the rating
     */
    public double getRating() {
        return this.rating;
    }

    /**
     * Getter for user identifier.
     * @return the user identifier
     */
    public String getUser() {
        return this.user.getEmail();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rating)) {
            return false;
        }
        Rating compare = (Rating) o;
        return compare.getUser().equals(this.user.getEmail()) && compare.getIdentifier().equals(this.identifier);
    }

    @Override
    public int hashCode() {
        return this.user.hashCode() + this.identifier.hashCode();
    }
}
