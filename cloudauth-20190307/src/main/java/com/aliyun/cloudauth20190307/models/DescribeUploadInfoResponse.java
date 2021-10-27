// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUploadInfoResponse extends TeaModel {
    @NameInMap("Accessid")
    @Validation(required = true)
    public String accessid;

    @NameInMap("Expire")
    @Validation(required = true)
    public Long expire;

    @NameInMap("Folder")
    @Validation(required = true)
    public String folder;

    @NameInMap("Host")
    @Validation(required = true)
    public String host;

    @NameInMap("Policy")
    @Validation(required = true)
    public String policy;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Signature")
    @Validation(required = true)
    public String signature;

    public static DescribeUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadInfoResponse self = new DescribeUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUploadInfoResponse setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public DescribeUploadInfoResponse setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public DescribeUploadInfoResponse setFolder(String folder) {
        this.folder = folder;
        return this;
    }
    public String getFolder() {
        return this.folder;
    }

    public DescribeUploadInfoResponse setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeUploadInfoResponse setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeUploadInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUploadInfoResponse setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
