package com.travelroute.infrastructure.entity.travel;

import com.travelroute.domain.model.travel.Country;
import com.travelroute.domain.model.travel.Travel;
import com.travelroute.domain.model.travel.TravelDate;
import com.travelroute.infrastructure.entity.common.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "travel")
@Entity
public class TravelEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "country", nullable = false)
    private Country country;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    public TravelEntity(Long id, String name, Country country, LocalDate startDate, LocalDate endDate, Long userId) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userId = userId;
    }

    public TravelEntity() {

    }

    public Travel to() {
        return new Travel(
            this.id,
            this.name,
            this.country,
            new TravelDate(this.startDate, this.endDate),
            this.userId
        );
    }

    public static TravelEntity of(Travel travel) {
        return new TravelEntity(
            travel.getId(),
            travel.getName(),
            travel.getCountry(),
            travel.getTravelDate().startDate(),
            travel.getTravelDate().endDate(),
            travel.getUserId()
        );
    }
}
