package com.realfinance.sofa.cg.core.domain.req;

import com.realfinance.sofa.cg.core.domain.BasePurItem;

import javax.persistence.*;

@Entity
@Table(name = "CG_CORE_HI_REQ_ITEM")
public class HistoricRequirementItem extends BasePurItem {

    @Column(nullable = false)
    private Integer srcId;

    @ManyToOne
    @JoinColumn(name = "hi_req_id", updatable = false)
    private HistoricRequirement requirement;

    public Integer getSrcId() {
        return srcId;
    }

    public void setSrcId(Integer srcId) {
        this.srcId = srcId;
    }

    public HistoricRequirement getRequirement() {
        return requirement;
    }

    public void setRequirement(HistoricRequirement requirement) {
        this.requirement = requirement;
    }

}
