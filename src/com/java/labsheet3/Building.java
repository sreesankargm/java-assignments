package com.java.labsheet3;

public class Building {

    String name;
    String buildingCode;
    String location;
    int numberOfFloors;
    float totalArea;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public Building(String name, String buildingCode, String location, int numberOfFloors, float totalArea) {
        this.setName(name);
        this.setLocation(location);
        this.setBuildingCode(buildingCode);
        this.setNumberOfFloors(numberOfFloors);
        this.setTotalArea(totalArea);
    }

    @Override
    public String toString() {
        return String.format("""
            Building details are:
            Name: %s,
            Location: %s,
            Building Code: %s
            Number of floors: %d,
            Total Area: %.2f
                """, this.getName(), this.getLocation(), this.getBuildingCode(), this.getNumberOfFloors(), this.getTotalArea());
    }

    public static void main(String[] args) {
        Building building = new Building(
            "This is the name",
            "This is the location",
            "This is the building code",
            5,
            10.50f
        );

        System.out.println(building);
    }

}
