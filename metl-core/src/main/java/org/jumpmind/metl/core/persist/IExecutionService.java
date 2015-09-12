package org.jumpmind.metl.core.persist;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jumpmind.metl.core.model.AbstractObject;
import org.jumpmind.metl.core.model.Execution;
import org.jumpmind.metl.core.model.ExecutionStep;
import org.jumpmind.metl.core.model.ExecutionStepLog;

public interface IExecutionService {

    public void save(AbstractObject object);

    public List<Execution> findExecutions(Map<String, Object> params, int limit);

    public Execution findExecution(String id);

    public List<ExecutionStep> findExecutionSteps(String executionId);

    public List<ExecutionStepLog> findExecutionStepLog(String executionStepId);
    
    public List<ExecutionStepLog> findExecutionStepLog(Set<String> executionStepIds);
    
    public void markAbandoned(String agentId);
    
    public void deleteExecution(String executionId);
    	
}
