// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public GetPolicyResponseBodyPolicy policy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DefaultPolicyVersion")
    public GetPolicyResponseBodyDefaultPolicyVersion defaultPolicyVersion;

    public static GetPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyResponseBody self = new GetPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyResponseBody setPolicy(GetPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GetPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPolicyResponseBody setDefaultPolicyVersion(GetPolicyResponseBodyDefaultPolicyVersion defaultPolicyVersion) {
        this.defaultPolicyVersion = defaultPolicyVersion;
        return this;
    }
    public GetPolicyResponseBodyDefaultPolicyVersion getDefaultPolicyVersion() {
        return this.defaultPolicyVersion;
    }

    public static class GetPolicyResponseBodyPolicy extends TeaModel {
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("PolicyDocument")
        public String policyDocument;

        @NameInMap("AttachmentCount")
        public Integer attachmentCount;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("PolicyType")
        public String policyType;

        public static GetPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicy self = new GetPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public GetPolicyResponseBodyPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetPolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPolicyResponseBodyPolicy setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public GetPolicyResponseBodyPolicy setAttachmentCount(Integer attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public Integer getAttachmentCount() {
            return this.attachmentCount;
        }

        public GetPolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetPolicyResponseBodyPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetPolicyResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetPolicyResponseBodyDefaultPolicyVersion extends TeaModel {
        @NameInMap("IsDefaultVersion")
        public Boolean isDefaultVersion;

        @NameInMap("PolicyDocument")
        public String policyDocument;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("CreateDate")
        public String createDate;

        public static GetPolicyResponseBodyDefaultPolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyDefaultPolicyVersion self = new GetPolicyResponseBodyDefaultPolicyVersion();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyDefaultPolicyVersion setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public GetPolicyResponseBodyDefaultPolicyVersion setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public GetPolicyResponseBodyDefaultPolicyVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public GetPolicyResponseBodyDefaultPolicyVersion setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
