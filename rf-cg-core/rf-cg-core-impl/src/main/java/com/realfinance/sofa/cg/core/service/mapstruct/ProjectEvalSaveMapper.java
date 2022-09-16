package com.realfinance.sofa.cg.core.service.mapstruct;

import com.realfinance.sofa.cg.core.domain.exec.ProjectExecution;
import com.realfinance.sofa.cg.core.domain.exec.ProjectExecutionAtt;
import com.realfinance.sofa.cg.core.domain.proj.ProjectEval;
import com.realfinance.sofa.cg.core.model.CgProjectEvalDto;
import com.realfinance.sofa.cg.core.model.CgProjectExecutionAttDto;
import com.realfinance.sofa.cg.core.model.CgProjectExecutionDetailsSaveDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(config = RootConfig.class, uses = {CustomMapper.class})
public interface ProjectEvalSaveMapper extends ToEntityMapper<ProjectEval, CgProjectEvalDto> {

}
