package com.realfinance.sofa.cg.core.domain.exec.bid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 资格审查
 */
@Entity
@Table(name = "CG_CORE_BID_DOC_QUAL_EXAM")
public class BiddingDocumentBiddingDocumentQualExamination extends BaseBiddingDocumentExamination {

    @ManyToOne
    @JoinColumn(name = "bid_doc_id", updatable = false)
    protected BiddingDocument biddingDocument;

    public BiddingDocument getBiddingDocument() {
        return biddingDocument;
    }

    public void setBiddingDocument(BiddingDocument biddingDocument) {
        this.biddingDocument = biddingDocument;
    }

}
