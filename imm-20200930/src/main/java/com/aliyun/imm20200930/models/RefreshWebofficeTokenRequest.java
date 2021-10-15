// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RefreshWebofficeTokenRequest extends TeaModel {
    // access token
    @NameInMap("AccessToken")
    public String accessToken;

    // 链式授权
    @NameInMap("AssumeRoleChain")
    public AssumeRoleChain assumeRoleChain;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // refresh token
    @NameInMap("RefreshToken")
    public String refreshToken;

    public static RefreshWebofficeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshWebofficeTokenRequest self = new RefreshWebofficeTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshWebofficeTokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public RefreshWebofficeTokenRequest setAssumeRoleChain(AssumeRoleChain assumeRoleChain) {
        this.assumeRoleChain = assumeRoleChain;
        return this;
    }
    public AssumeRoleChain getAssumeRoleChain() {
        return this.assumeRoleChain;
    }

    public RefreshWebofficeTokenRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public RefreshWebofficeTokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
