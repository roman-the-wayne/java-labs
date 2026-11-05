package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private int id;
    private String name;
    private String sport;
    private int division;
    private List<Integer> matchRatings;

    public Club() {
        this.matchRatings = new ArrayList<>();
    }

    public Club(int id, String name, String sport, int division, List<Integer> matchRatings) {
        this.id = id;
        this.name = name;
        this.sport = sport;
        this.division = division;
        this.matchRatings = matchRatings != null ? new ArrayList<>(matchRatings) : new ArrayList<>();
    }

    public double getAverageRating() {
        if (matchRatings == null || matchRatings.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int rating : matchRatings) {
            sum += rating;
        }
        return sum / matchRatings.size();
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public List<Integer> getMatchRatings() {
        return matchRatings;
    }

    public void setMatchRatings(List<Integer> matchRatings) {
        this.matchRatings = matchRatings;
    }

    @Override
    public String toString() {
        return String.format("Club{id=%d, name='%s', sport='%s', division=%d, avgRating=%.2f, ratings=%s}",
                id, name, sport, division, getAverageRating(), matchRatings);
    }
}
