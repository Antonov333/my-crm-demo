package com.example.mycrm.model.metrics;

public class Indicator {
    private String name;
    /**
     * Wrapper class used to return null if particular value can not be represented by whole value
     */
    private Long valueLong;
    /**
     * Wrapper class used to return null if particular value can not be represented by float point value
     */
    private Double valueDouble;
    private MeasurementUnit unit;
}
