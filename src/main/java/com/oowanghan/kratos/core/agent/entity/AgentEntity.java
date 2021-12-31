package com.oowanghan.kratos.core.agent.entity;

/**
 * @Author WangHan
 * @Create 2021/10/9 3:08 下午
 */
public class AgentEntity {

    /**
     * agent的版本
     */
    private String agentVersion;
    /**
     * agent的绝对路径
     */
    private String agentAbPath;

    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public String getAgentAbPath() {
        return agentAbPath;
    }

    public void setAgentAbPath(String agentAbPath) {
        this.agentAbPath = agentAbPath;
    }
}
