// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProfilequeryappserviceidRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public String appServiceId;

    public static QueryLinkedeploycoreDeploycoreProfilequeryappserviceidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProfilequeryappserviceidRequest self = new QueryLinkedeploycoreDeploycoreProfilequeryappserviceidRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

}
