// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertRoleRequest extends TeaModel {
    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("ActionData")
    public String actionData;

    public static InsertRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertRoleRequest self = new InsertRoleRequest();
        return TeaModel.build(map, self);
    }

    public InsertRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public InsertRoleRequest setActionData(String actionData) {
        this.actionData = actionData;
        return this;
    }
    public String getActionData() {
        return this.actionData;
    }

}
