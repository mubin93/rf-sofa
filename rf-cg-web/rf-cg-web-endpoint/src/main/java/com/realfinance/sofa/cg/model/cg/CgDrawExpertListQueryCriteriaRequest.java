package com.realfinance.sofa.cg.model.cg;

import com.realfinance.sofa.cg.core.model.CgDrawExpertListQueryCriteria;
import com.realfinance.sofa.cg.core.model.CgDrawExpertQueryCriteria;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springdoc.api.annotations.ParameterObject;

@ParameterObject
public class CgDrawExpertListQueryCriteriaRequest extends CgDrawExpertListQueryCriteria {

    /**
     * id
     */
    @Parameter(description = "id", schema = @Schema(type = "string"))
    private String id;


}
