// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyExecDetailRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StrategyId")
    public Integer strategyId;

    public static DescribeStrategyExecDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyExecDetailRequest self = new DescribeStrategyExecDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyExecDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeStrategyExecDetailRequest setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Integer getStrategyId() {
        return this.strategyId;
    }

}
