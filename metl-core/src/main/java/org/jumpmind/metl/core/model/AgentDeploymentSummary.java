package org.jumpmind.metl.core.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.jumpmind.metl.core.runtime.LogLevel;

public class AgentDeploymentSummary extends AbstractObject {

    private static final long serialVersionUID = 1L;

    public static final String TYPE_FLOW = "Flow";
    
    public static final String TYPE_RESOURCE = "Resource";
    
    String projectName;
    
    String type;
    
    String name;

    String status = DeploymentStatus.DISABLED.name();

    String logLevel = LogLevel.DEBUG.name();

    String startType = StartType.MANUAL.name();

    String startExpression;

    public AgentDeploymentSummary() {
    }

    public AgentDeploymentSummary(AgentDeployment agentDeployment) {
        copy(agentDeployment);
    }

    public void copy(AgentDeployment agentDeployment) {
        id = agentDeployment.getId();
        name = agentDeployment.getName();
        type = TYPE_FLOW;
        status = agentDeployment.getStatus();
        logLevel = agentDeployment.getLogLevel();
        startType = agentDeployment.getStartType();
        startExpression = agentDeployment.getStartExpression();
    }

    public boolean isChanged(AgentDeploymentSummary o) {
        return ! new EqualsBuilder().append(id, o.id).append(projectName, o.projectName).append(type, o.type).append(name, o.name).append(status, o.status)
            .append(logLevel, o.logLevel).append(startType, o.startType).append(startExpression, o.startExpression).isEquals();
    }
        
    public boolean isFlow() {
        return type.equals(TYPE_FLOW);
    }
    
    public boolean isResource() {
        return type.equals(TYPE_RESOURCE);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType;
    }

    public String getStartExpression() {
        return startExpression;
    }

    public void setStartExpression(String startExpression) {
        this.startExpression = startExpression;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
