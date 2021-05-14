// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAntiBruteForceRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateAntiBruteForceRule")
    public CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule createAntiBruteForceRule;

    public static CreateAntiBruteForceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAntiBruteForceRuleResponseBody self = new CreateAntiBruteForceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAntiBruteForceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntiBruteForceRuleResponseBody setCreateAntiBruteForceRule(CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule createAntiBruteForceRule) {
        this.createAntiBruteForceRule = createAntiBruteForceRule;
        return this;
    }
    public CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule getCreateAntiBruteForceRule() {
        return this.createAntiBruteForceRule;
    }

    public static class CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        public static CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule build(java.util.Map<String, ?> map) throws Exception {
            CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule self = new CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule();
            return TeaModel.build(map, self);
        }

        public CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
