// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeSubDomainResponseBody extends TeaModel {
    @NameInMap("SubDomain")
    public String subDomain;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSubDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainResponseBody self = new DescribeSubDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubDomainResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribeSubDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
