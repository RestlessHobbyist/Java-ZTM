package org.example;

public enum Planet {
    MERCURY("Mercury", 0.39),
    VENUS("Venus", 0.72),
    EARTH("Earth", 1.00),
    MARS("Mars", 1.52),
    JUPITER("Jupiter", 5.20),
    SATURN("Saturn", 9.54),
    URANUS("Uranus", 19.22),
    NEPTUNE("Neptune", 30.06),
    PLUTO("Pluto",39.5);

    private final String name;
    private final double auFromSun;

    Planet(String name, double distanceFromSunInAu){
        this.name = name;
        this.auFromSun = distanceFromSunInAu;
    }

    public double getAuFromSun() {
        return auFromSun;
    }

    public String getName() {
        return name;
    }
}
