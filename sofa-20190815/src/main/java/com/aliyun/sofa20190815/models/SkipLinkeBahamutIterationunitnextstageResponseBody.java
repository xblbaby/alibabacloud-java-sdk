// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipLinkeBahamutIterationunitnextstageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public SkipLinkeBahamutIterationunitnextstageResponseBodyResult result;

    public static SkipLinkeBahamutIterationunitnextstageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SkipLinkeBahamutIterationunitnextstageResponseBody self = new SkipLinkeBahamutIterationunitnextstageResponseBody();
        return TeaModel.build(map, self);
    }

    public SkipLinkeBahamutIterationunitnextstageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SkipLinkeBahamutIterationunitnextstageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SkipLinkeBahamutIterationunitnextstageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SkipLinkeBahamutIterationunitnextstageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SkipLinkeBahamutIterationunitnextstageResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public SkipLinkeBahamutIterationunitnextstageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SkipLinkeBahamutIterationunitnextstageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public SkipLinkeBahamutIterationunitnextstageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SkipLinkeBahamutIterationunitnextstageResponseBody setResult(SkipLinkeBahamutIterationunitnextstageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SkipLinkeBahamutIterationunitnextstageResponseBodyResult getResult() {
        return this.result;
    }

    public static class SkipLinkeBahamutIterationunitnextstageResponseBodyResult extends TeaModel {
        @NameInMap("AppMeta")
        public String appMeta;

        @NameInMap("BatchIndex")
        public Long batchIndex;

        @NameInMap("BeforeSit")
        public Boolean beforeSit;

        @NameInMap("Compatible")
        public Boolean compatible;

        @NameInMap("Created")
        public Long created;

        @NameInMap("CreateAfterUseLinkQ")
        public Boolean createAfterUseLinkQ;

        @NameInMap("CreatorSysName")
        public String creatorSysName;

        @NameInMap("CurrentStage")
        public String currentStage;

        @NameInMap("CurrentStageStep")
        public String currentStageStep;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("DeletedByIteration")
        public Boolean deletedByIteration;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("From")
        public String from;

        @NameInMap("FromCommitId")
        public String fromCommitId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Iteration")
        public String iteration;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("LastStage")
        public String lastStage;

        @NameInMap("NextStage")
        public String nextStage;

        @NameInMap("Private")
        public Boolean _private;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("ProdVersion")
        public String prodVersion;

        @NameInMap("SkipReleaseCheck")
        public Boolean skipReleaseCheck;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Version")
        public String version;

        @NameInMap("YunyDaily")
        public Boolean yunyDaily;

        @NameInMap("CreatedBy")
        public java.util.List<String> createdBy;

        @NameInMap("Jars")
        public java.util.List<String> jars;

        @NameInMap("JarHistrories")
        public java.util.List<String> jarHistrories;

        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("Stages")
        public java.util.List<String> stages;

        public static SkipLinkeBahamutIterationunitnextstageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SkipLinkeBahamutIterationunitnextstageResponseBodyResult self = new SkipLinkeBahamutIterationunitnextstageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setAppMeta(String appMeta) {
            this.appMeta = appMeta;
            return this;
        }
        public String getAppMeta() {
            return this.appMeta;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setBatchIndex(Long batchIndex) {
            this.batchIndex = batchIndex;
            return this;
        }
        public Long getBatchIndex() {
            return this.batchIndex;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setBeforeSit(Boolean beforeSit) {
            this.beforeSit = beforeSit;
            return this;
        }
        public Boolean getBeforeSit() {
            return this.beforeSit;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setCompatible(Boolean compatible) {
            this.compatible = compatible;
            return this;
        }
        public Boolean getCompatible() {
            return this.compatible;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setCreateAfterUseLinkQ(Boolean createAfterUseLinkQ) {
            this.createAfterUseLinkQ = createAfterUseLinkQ;
            return this;
        }
        public Boolean getCreateAfterUseLinkQ() {
            return this.createAfterUseLinkQ;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setCreatorSysName(String creatorSysName) {
            this.creatorSysName = creatorSysName;
            return this;
        }
        public String getCreatorSysName() {
            return this.creatorSysName;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setCurrentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public String getCurrentStage() {
            return this.currentStage;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setCurrentStageStep(String currentStageStep) {
            this.currentStageStep = currentStageStep;
            return this;
        }
        public String getCurrentStageStep() {
            return this.currentStageStep;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setDeletedByIteration(Boolean deletedByIteration) {
            this.deletedByIteration = deletedByIteration;
            return this;
        }
        public Boolean getDeletedByIteration() {
            return this.deletedByIteration;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setFromCommitId(String fromCommitId) {
            this.fromCommitId = fromCommitId;
            return this;
        }
        public String getFromCommitId() {
            return this.fromCommitId;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setIteration(String iteration) {
            this.iteration = iteration;
            return this;
        }
        public String getIteration() {
            return this.iteration;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setLastStage(String lastStage) {
            this.lastStage = lastStage;
            return this;
        }
        public String getLastStage() {
            return this.lastStage;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setNextStage(String nextStage) {
            this.nextStage = nextStage;
            return this;
        }
        public String getNextStage() {
            return this.nextStage;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult set_private(Boolean _private) {
            this._private = _private;
            return this;
        }
        public Boolean get_private() {
            return this._private;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setProdVersion(String prodVersion) {
            this.prodVersion = prodVersion;
            return this;
        }
        public String getProdVersion() {
            return this.prodVersion;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setSkipReleaseCheck(Boolean skipReleaseCheck) {
            this.skipReleaseCheck = skipReleaseCheck;
            return this;
        }
        public Boolean getSkipReleaseCheck() {
            return this.skipReleaseCheck;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setYunyDaily(Boolean yunyDaily) {
            this.yunyDaily = yunyDaily;
            return this;
        }
        public Boolean getYunyDaily() {
            return this.yunyDaily;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setCreatedBy(java.util.List<String> createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public java.util.List<String> getCreatedBy() {
            return this.createdBy;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setJars(java.util.List<String> jars) {
            this.jars = jars;
            return this;
        }
        public java.util.List<String> getJars() {
            return this.jars;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setJarHistrories(java.util.List<String> jarHistrories) {
            this.jarHistrories = jarHistrories;
            return this;
        }
        public java.util.List<String> getJarHistrories() {
            return this.jarHistrories;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public SkipLinkeBahamutIterationunitnextstageResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

    }

}
