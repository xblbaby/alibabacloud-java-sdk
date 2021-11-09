// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyAdvancedConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribePolicyAdvancedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyAdvancedConfigRequest self = new DescribePolicyAdvancedConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyAdvancedConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePolicyAdvancedConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
