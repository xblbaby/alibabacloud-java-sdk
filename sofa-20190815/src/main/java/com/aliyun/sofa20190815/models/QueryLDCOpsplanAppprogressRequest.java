// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanAppprogressRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static QueryLDCOpsplanAppprogressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanAppprogressRequest self = new QueryLDCOpsplanAppprogressRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanAppprogressRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
