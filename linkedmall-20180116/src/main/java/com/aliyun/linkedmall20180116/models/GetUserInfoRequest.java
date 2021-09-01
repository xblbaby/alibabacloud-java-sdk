// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetUserInfoRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("UserFlag")
    public String userFlag;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("QueryJson")
    public String queryJson;

    public static GetUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoRequest self = new GetUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetUserInfoRequest setUserFlag(String userFlag) {
        this.userFlag = userFlag;
        return this;
    }
    public String getUserFlag() {
        return this.userFlag;
    }

    public GetUserInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetUserInfoRequest setQueryJson(String queryJson) {
        this.queryJson = queryJson;
        return this;
    }
    public String getQueryJson() {
        return this.queryJson;
    }

}
