package com.realfinance.sofa.cg.sup.repository;

import com.realfinance.sofa.cg.sup.domain.FlowStatus;
import com.realfinance.sofa.cg.sup.domain.SupplierSolicitation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface SupplierSolicitationRepository extends JpaRepositoryImplementation<SupplierSolicitation,Integer> {

    Page<SupplierSolicitation> findAllByReleaseStatus(String releaseStatus, Pageable pageable);


}




