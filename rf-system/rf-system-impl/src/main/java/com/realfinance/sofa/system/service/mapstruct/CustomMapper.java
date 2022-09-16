package com.realfinance.sofa.system.service.mapstruct;

import com.realfinance.sofa.common.model.IEntity;
import com.realfinance.sofa.common.model.ReferenceObject;
import org.mapstruct.TargetType;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Component
public class CustomMapper {
    @PersistenceContext
    private EntityManager em;


    public <ID extends Serializable, T extends IEntity<ID>> T resolveEntity(
            ReferenceObject<ID> id, @TargetType Class<T> entityClass) {
        if (id == null) {
            return null;
        }
        return em.find(entityClass,id.getId());
    }

    public <T extends IEntity<Integer>> T resolveEntity(
            Integer id, @TargetType Class<T> entityClass) {
        if (id == null) {
            return null;
        }
        return em.find(entityClass,id);
    }

    public <T extends IEntity<Long>> T resolveEntity(
            Long id, @TargetType Class<T> entityClass) {
        if (id == null) {
            return null;
        }
        return em.find(entityClass,id);
    }

    public <T extends IEntity<String>> T resolveEntity(
            String id, @TargetType Class<T> entityClass) {
        if (id == null) {
            return null;
        }
        return em.find(entityClass,id);
    }
}
