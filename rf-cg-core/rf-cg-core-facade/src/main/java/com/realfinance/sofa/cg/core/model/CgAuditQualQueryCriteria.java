package com.realfinance.sofa.cg.core.model;

public class CgAuditQualQueryCriteria {

    /**
     * 会议主持人用户ID
     */
    private Integer biddingDocumentId;

    /**
     * 专家ID
     */
    private Integer expertId;

    /**
     * 会议ID
     */
    private Integer meetingId;

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * 用户ID
     */
    private Integer createdUserId;

    public Integer getBiddingDocumentId() {
        return biddingDocumentId;
    }

    public void setBiddingDocumentId(Integer biddingDocumentId) {
        this.biddingDocumentId = biddingDocumentId;
    }

    public Integer getExpertId() {
        return expertId;
    }

    public void setExpertId(Integer expertId) {
        this.expertId = expertId;
    }

    public Integer getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }
}
