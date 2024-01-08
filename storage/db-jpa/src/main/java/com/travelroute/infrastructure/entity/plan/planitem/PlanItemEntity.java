package com.travelroute.infrastructure.entity.plan.planitem;


import com.travelroute.infrastructure.entity.plan.PlanEntity;
import jakarta.persistence.*;
@Table(name = "plan_item")
@Entity
public class PlanItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "plan_id", nullable = false)
    private PlanEntity plan;

    public void setPlan(PlanEntity plan) {
        this.plan = plan;
    }
}
