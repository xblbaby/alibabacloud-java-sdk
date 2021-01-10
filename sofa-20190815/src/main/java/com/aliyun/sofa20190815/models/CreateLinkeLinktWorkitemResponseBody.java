// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktWorkitemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public CreateLinkeLinktWorkitemResponseBodyData data;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeLinktWorkitemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktWorkitemResponseBody self = new CreateLinkeLinktWorkitemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktWorkitemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeLinktWorkitemResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeLinktWorkitemResponseBody setData(CreateLinkeLinktWorkitemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLinkeLinktWorkitemResponseBodyData getData() {
        return this.data;
    }

    public CreateLinkeLinktWorkitemResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public CreateLinkeLinktWorkitemResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLinkeLinktWorkitemResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeLinktWorkitemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeLinktWorkitemResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeLinktWorkitemResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Template")
        public String template;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("RelatedProjects")
        public java.util.List<String> relatedProjects;

        @NameInMap("StatusStage")
        public Long statusStage;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ParentWorkItem")
        public String parentWorkItem;

        @NameInMap("Description")
        public String description;

        @NameInMap("TemplateList")
        public java.util.List<String> templateList;

        @NameInMap("Region")
        public String region;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("FinishedChildrenCount")
        public Long finishedChildrenCount;

        @NameInMap("Link")
        public String link;

        @NameInMap("Modules")
        public java.util.List<String> modules;

        @NameInMap("StatusId")
        public Long statusId;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("CustomFieldsValues")
        public java.util.List<String> customFieldsValues;

        @NameInMap("PriorityEntity")
        public String priorityEntity;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Ccs")
        public java.util.List<String> ccs;

        @NameInMap("Project")
        public String project;

        @NameInMap("Iteration")
        public String iteration;

        @NameInMap("ParentSign")
        public String parentSign;

        @NameInMap("SignPath")
        public String signPath;

        @NameInMap("ChildrenCount")
        public Long childrenCount;

        @NameInMap("IterationSign")
        public String iterationSign;

        @NameInMap("AssignedToIds")
        public String assignedToIds;

        @NameInMap("AttachmentVOs")
        public java.util.List<String> attachmentVOs;

        @NameInMap("ExpectedAt")
        public Long expectedAt;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("CustomFields")
        public java.util.List<String> customFields;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("FilteredChildrenCount")
        public Long filteredChildrenCount;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("AsRootLevel")
        public Boolean asRootLevel;

        @NameInMap("Id")
        public Long id;

        public static CreateLinkeLinktWorkitemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeLinktWorkitemResponseBodyData self = new CreateLinkeLinktWorkitemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLinkeLinktWorkitemResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setRelatedProjects(java.util.List<String> relatedProjects) {
            this.relatedProjects = relatedProjects;
            return this;
        }
        public java.util.List<String> getRelatedProjects() {
            return this.relatedProjects;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setStatusStage(Long statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public Long getStatusStage() {
            return this.statusStage;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setParentWorkItem(String parentWorkItem) {
            this.parentWorkItem = parentWorkItem;
            return this;
        }
        public String getParentWorkItem() {
            return this.parentWorkItem;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setTemplateList(java.util.List<String> templateList) {
            this.templateList = templateList;
            return this;
        }
        public java.util.List<String> getTemplateList() {
            return this.templateList;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setFinishedChildrenCount(Long finishedChildrenCount) {
            this.finishedChildrenCount = finishedChildrenCount;
            return this;
        }
        public Long getFinishedChildrenCount() {
            return this.finishedChildrenCount;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setModules(java.util.List<String> modules) {
            this.modules = modules;
            return this;
        }
        public java.util.List<String> getModules() {
            return this.modules;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setStatusId(Long statusId) {
            this.statusId = statusId;
            return this;
        }
        public Long getStatusId() {
            return this.statusId;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setCustomFieldsValues(java.util.List<String> customFieldsValues) {
            this.customFieldsValues = customFieldsValues;
            return this;
        }
        public java.util.List<String> getCustomFieldsValues() {
            return this.customFieldsValues;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setPriorityEntity(String priorityEntity) {
            this.priorityEntity = priorityEntity;
            return this;
        }
        public String getPriorityEntity() {
            return this.priorityEntity;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setCcs(java.util.List<String> ccs) {
            this.ccs = ccs;
            return this;
        }
        public java.util.List<String> getCcs() {
            return this.ccs;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setIteration(String iteration) {
            this.iteration = iteration;
            return this;
        }
        public String getIteration() {
            return this.iteration;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setParentSign(String parentSign) {
            this.parentSign = parentSign;
            return this;
        }
        public String getParentSign() {
            return this.parentSign;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setSignPath(String signPath) {
            this.signPath = signPath;
            return this;
        }
        public String getSignPath() {
            return this.signPath;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setChildrenCount(Long childrenCount) {
            this.childrenCount = childrenCount;
            return this;
        }
        public Long getChildrenCount() {
            return this.childrenCount;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setIterationSign(String iterationSign) {
            this.iterationSign = iterationSign;
            return this;
        }
        public String getIterationSign() {
            return this.iterationSign;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setAssignedToIds(String assignedToIds) {
            this.assignedToIds = assignedToIds;
            return this;
        }
        public String getAssignedToIds() {
            return this.assignedToIds;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setAttachmentVOs(java.util.List<String> attachmentVOs) {
            this.attachmentVOs = attachmentVOs;
            return this;
        }
        public java.util.List<String> getAttachmentVOs() {
            return this.attachmentVOs;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setExpectedAt(Long expectedAt) {
            this.expectedAt = expectedAt;
            return this;
        }
        public Long getExpectedAt() {
            return this.expectedAt;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setCustomFields(java.util.List<String> customFields) {
            this.customFields = customFields;
            return this;
        }
        public java.util.List<String> getCustomFields() {
            return this.customFields;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setFilteredChildrenCount(Long filteredChildrenCount) {
            this.filteredChildrenCount = filteredChildrenCount;
            return this;
        }
        public Long getFilteredChildrenCount() {
            return this.filteredChildrenCount;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setAsRootLevel(Boolean asRootLevel) {
            this.asRootLevel = asRootLevel;
            return this;
        }
        public Boolean getAsRootLevel() {
            return this.asRootLevel;
        }

        public CreateLinkeLinktWorkitemResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
