package com.travelroute.domain.model.travel;

public class Travel {
    private TravelDate travelDate;
    private Long id;
    private String name;
    private Country country;
    private Long userId;


    public Travel(Long id, String name, Country country, TravelDate travelDate, Long userId) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.travelDate = travelDate;
        this.userId = userId;
    }

    public Travel(String name, Country country, TravelDate travelDate, Long userId) {
        this.name = name;
        this.country = country;
        this.travelDate = travelDate;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public TravelDate getTravelDate() {
        return travelDate;
    }

    public Long getUserId() {
        return userId;
    }
}
