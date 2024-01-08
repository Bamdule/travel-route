package com.travelroute.infrastructure.entity.plan;

import com.travelroute.infrastructure.entity.common.BaseEntity;
import com.travelroute.infrastructure.entity.plan.planitem.PlanItemEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Table(name = "plan")
@Entity
public class PlanEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_at", nullable = false)
    private LocalDateTime startAt;

    @Column(name = "end_at")
    private LocalDateTime endAt;

    @Column(name = "address", length = 300)
    private String address;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "contents", length = 3000)
    private String contents;

    @Column(name = "categoryId", nullable = false)
    private Long categoryId;

    @Column(name = "travel_id", nullable = false)
    private Long travelId;

    @OneToMany(mappedBy = "plan")
    private List<PlanItemEntity> planItems = new ArrayList<>();

    public void addPlanItem(PlanItemEntity planItem) {
        planItems.add(planItem);
        planItem.setPlan(this);
    }
}
