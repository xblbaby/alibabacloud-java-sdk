// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult result;

    public static DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody self = new DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody setResult(DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ProdVersion")
        public String prodVersion;

        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("IterationTemplate")
        public String iterationTemplate;

        @NameInMap("PaasApplyIds")
        public java.util.List<String> paasApplyIds;

        @NameInMap("Requirements")
        public java.util.List<String> requirements;

        @NameInMap("TecRiskOwner")
        public String tecRiskOwner;

        @NameInMap("XflushCheckEnable")
        public Boolean xflushCheckEnable;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Compatible")
        public Boolean compatible;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("TestOwner")
        public String testOwner;

        @NameInMap("OriginalRelease")
        public String originalRelease;

        @NameInMap("PrePubOwner")
        public String prePubOwner;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("UseBaselineToRelease")
        public Boolean useBaselineToRelease;

        @NameInMap("AuditProds")
        public java.util.List<String> auditProds;

        @NameInMap("Name")
        public String name;

        @NameInMap("IndependentComplete")
        public Boolean independentComplete;

        @NameInMap("CreatorSysName")
        public String creatorSysName;

        @NameInMap("TagAndMergeMasterWhenEmergency")
        public Boolean tagAndMergeMasterWhenEmergency;

        @NameInMap("BranchRelease")
        public Boolean branchRelease;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("AoneCodeChangeId")
        public String aoneCodeChangeId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("FabricBizType")
        public String fabricBizType;

        @NameInMap("Emergency")
        public Boolean emergency;

        @NameInMap("PrivateAppGroup")
        public String privateAppGroup;

        @NameInMap("IterationManager")
        public String iterationManager;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("StageStep")
        public String stageStep;

        @NameInMap("Tasks")
        public java.util.List<String> tasks;

        @NameInMap("AppMetaIds")
        public java.util.List<String> appMetaIds;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("GreyRelease")
        public String greyRelease;

        @NameInMap("Release")
        public String release;

        @NameInMap("OverdueApplyModifyReleaseId")
        public String overdueApplyModifyReleaseId;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Id")
        public String id;

        @NameInMap("AppMetaNames")
        public java.util.List<String> appMetaNames;

        @NameInMap("Defects")
        public java.util.List<String> defects;

        public static DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult self = new DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setProdVersion(String prodVersion) {
            this.prodVersion = prodVersion;
            return this;
        }
        public String getProdVersion() {
            return this.prodVersion;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setIterationTemplate(String iterationTemplate) {
            this.iterationTemplate = iterationTemplate;
            return this;
        }
        public String getIterationTemplate() {
            return this.iterationTemplate;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setPaasApplyIds(java.util.List<String> paasApplyIds) {
            this.paasApplyIds = paasApplyIds;
            return this;
        }
        public java.util.List<String> getPaasApplyIds() {
            return this.paasApplyIds;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setRequirements(java.util.List<String> requirements) {
            this.requirements = requirements;
            return this;
        }
        public java.util.List<String> getRequirements() {
            return this.requirements;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setTecRiskOwner(String tecRiskOwner) {
            this.tecRiskOwner = tecRiskOwner;
            return this;
        }
        public String getTecRiskOwner() {
            return this.tecRiskOwner;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setXflushCheckEnable(Boolean xflushCheckEnable) {
            this.xflushCheckEnable = xflushCheckEnable;
            return this;
        }
        public Boolean getXflushCheckEnable() {
            return this.xflushCheckEnable;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setCompatible(Boolean compatible) {
            this.compatible = compatible;
            return this;
        }
        public Boolean getCompatible() {
            return this.compatible;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setTestOwner(String testOwner) {
            this.testOwner = testOwner;
            return this;
        }
        public String getTestOwner() {
            return this.testOwner;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setOriginalRelease(String originalRelease) {
            this.originalRelease = originalRelease;
            return this;
        }
        public String getOriginalRelease() {
            return this.originalRelease;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setPrePubOwner(String prePubOwner) {
            this.prePubOwner = prePubOwner;
            return this;
        }
        public String getPrePubOwner() {
            return this.prePubOwner;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setUseBaselineToRelease(Boolean useBaselineToRelease) {
            this.useBaselineToRelease = useBaselineToRelease;
            return this;
        }
        public Boolean getUseBaselineToRelease() {
            return this.useBaselineToRelease;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setAuditProds(java.util.List<String> auditProds) {
            this.auditProds = auditProds;
            return this;
        }
        public java.util.List<String> getAuditProds() {
            return this.auditProds;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setIndependentComplete(Boolean independentComplete) {
            this.independentComplete = independentComplete;
            return this;
        }
        public Boolean getIndependentComplete() {
            return this.independentComplete;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setCreatorSysName(String creatorSysName) {
            this.creatorSysName = creatorSysName;
            return this;
        }
        public String getCreatorSysName() {
            return this.creatorSysName;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
            this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
            return this;
        }
        public Boolean getTagAndMergeMasterWhenEmergency() {
            return this.tagAndMergeMasterWhenEmergency;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setBranchRelease(Boolean branchRelease) {
            this.branchRelease = branchRelease;
            return this;
        }
        public Boolean getBranchRelease() {
            return this.branchRelease;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setAoneCodeChangeId(String aoneCodeChangeId) {
            this.aoneCodeChangeId = aoneCodeChangeId;
            return this;
        }
        public String getAoneCodeChangeId() {
            return this.aoneCodeChangeId;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setFabricBizType(String fabricBizType) {
            this.fabricBizType = fabricBizType;
            return this;
        }
        public String getFabricBizType() {
            return this.fabricBizType;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setEmergency(Boolean emergency) {
            this.emergency = emergency;
            return this;
        }
        public Boolean getEmergency() {
            return this.emergency;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setPrivateAppGroup(String privateAppGroup) {
            this.privateAppGroup = privateAppGroup;
            return this;
        }
        public String getPrivateAppGroup() {
            return this.privateAppGroup;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setIterationManager(String iterationManager) {
            this.iterationManager = iterationManager;
            return this;
        }
        public String getIterationManager() {
            return this.iterationManager;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setStageStep(String stageStep) {
            this.stageStep = stageStep;
            return this;
        }
        public String getStageStep() {
            return this.stageStep;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setAppMetaIds(java.util.List<String> appMetaIds) {
            this.appMetaIds = appMetaIds;
            return this;
        }
        public java.util.List<String> getAppMetaIds() {
            return this.appMetaIds;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setGreyRelease(String greyRelease) {
            this.greyRelease = greyRelease;
            return this;
        }
        public String getGreyRelease() {
            return this.greyRelease;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setOverdueApplyModifyReleaseId(String overdueApplyModifyReleaseId) {
            this.overdueApplyModifyReleaseId = overdueApplyModifyReleaseId;
            return this;
        }
        public String getOverdueApplyModifyReleaseId() {
            return this.overdueApplyModifyReleaseId;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setAppMetaNames(java.util.List<String> appMetaNames) {
            this.appMetaNames = appMetaNames;
            return this;
        }
        public java.util.List<String> getAppMetaNames() {
            return this.appMetaNames;
        }

        public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBodyResult setDefects(java.util.List<String> defects) {
            this.defects = defects;
            return this;
        }
        public java.util.List<String> getDefects() {
            return this.defects;
        }

    }

}
