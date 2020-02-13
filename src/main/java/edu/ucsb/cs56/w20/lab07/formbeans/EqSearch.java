package edu.ucsb.cs56.w20.lab07.formbeans;

public class EqSearch {
    private int distance;
    private int minmag;

    public EqSearch() {}

    public int getDistance() {
        return this.distance;
    } 
    
    public int getMinmag() {
        return this.minmag;
    }

    public void setDistance(int distance_) {
        this.distance = distance_;
    }

    public void setMinmag(int minmag_) {
        this.minmag = minmag_;
    }
}