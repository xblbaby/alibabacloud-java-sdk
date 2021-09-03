// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class TriggerRepositoryMirrorSyncRequest extends TeaModel {
    // 个人访问令牌。 使用阿里云AK+SK或使用STS临时授权方式不需要传该字段
    @NameInMap("AccessToken")
    public String accessToken;

    // 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如 https://devops.aliyun.com/organization/
    @NameInMap("OrganizationId")
    public String organizationId;

    // 远程同步库克隆账号
    @NameInMap("Account")
    public String account;

    // 远程同步库克隆令牌
    @NameInMap("Token")
    public String token;

    public static TriggerRepositoryMirrorSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerRepositoryMirrorSyncRequest self = new TriggerRepositoryMirrorSyncRequest();
        return TeaModel.build(map, self);
    }

    public TriggerRepositoryMirrorSyncRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public TriggerRepositoryMirrorSyncRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public TriggerRepositoryMirrorSyncRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public TriggerRepositoryMirrorSyncRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
