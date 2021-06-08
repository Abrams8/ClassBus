package com.company;

import java.util.Objects;

public class Bus {
    private String nameAndSername;
    private int routeNomber;
    private String label;
    private int yearStartUse;
    private int mileage;

    public static Bus.BusBuilder builder() {

        return new Bus.BusBuilder();
    }

    public String getNameAndSername() {

        return this.nameAndSername;
    }

    public void setNameAndSername(String nameAndSername) {

        this.nameAndSername = nameAndSername;
    }

    public int getRouteNomber() {

        return this.routeNomber;
    }

    public void setRouteNomber(int routeNomber) {

        this.routeNomber = routeNomber;
    }

    public String getLabel() {

        return this.label;
    }

    public void setLabel(String label) {

        this.label = label;
    }

    public int getYearStartUse() {

        return this.yearStartUse;
    }

    public void setYearStartUse(int yearStartUse) {

        this.yearStartUse = yearStartUse;
    }

    public int getMileage() {

        return this.mileage;
    }

    public void setMileage(int mileage) {

        this.mileage = mileage;
    }

    public static class BusBuilder {
        private final Bus bus = new Bus();

        private BusBuilder() {
        }

        public Bus.BusBuilder nameAndSername(String nameAndSername) {
            this.bus.nameAndSername = nameAndSername;
            return this;
        }

        public Bus.BusBuilder routeNomber(int routeNomber) {
            this.bus.routeNomber = routeNomber;
            return this;
        }

        public Bus.BusBuilder label(String label) {
            this.bus.label = label;
            return this;
        }

        public Bus.BusBuilder yearStartUse(int yearStartUse) {
            this.bus.yearStartUse = yearStartUse;
            return this;
        }

        public Bus.BusBuilder mileage(int mileage) {
            this.bus.mileage = mileage;
            return this;
        }

        public Bus build() {
            return bus;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return routeNomber == bus.routeNomber && yearStartUse == bus.yearStartUse && mileage == bus.mileage && Objects.equals(nameAndSername, bus.nameAndSername) && Objects.equals(label, bus.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAndSername, routeNomber, label, yearStartUse, mileage);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "nameAndSername='" + nameAndSername + '\'' +
                ", routeNomber=" + routeNomber +
                ", label='" + label + '\'' +
                ", yearStartUse=" + yearStartUse +
                ", mileage=" + mileage +
                '}';
    }


    }

