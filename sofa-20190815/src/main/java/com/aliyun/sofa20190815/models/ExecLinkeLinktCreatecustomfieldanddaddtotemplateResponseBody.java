// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData data;

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

    public static ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody self = new ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody setData(ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData getData() {
        return this.data;
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData extends TeaModel {
        @NameInMap("Invisible")
        public Boolean invisible;

        @NameInMap("Type")
        public Long type;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("FormInvisible")
        public Boolean formInvisible;

        @NameInMap("DynamicOptionFetchDependentFields")
        public java.util.List<Long> dynamicOptionFetchDependentFields;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("FieldFormat")
        public String fieldFormat;

        @NameInMap("Description")
        public String description;

        @NameInMap("DynamicFieldRequiredDependentFields")
        public java.util.List<Long> dynamicFieldRequiredDependentFields;

        @NameInMap("DynamicOptionFetchInfluencedFields")
        public java.util.List<Long> dynamicOptionFetchInfluencedFields;

        @NameInMap("PossibleValues")
        public java.util.List<String> possibleValues;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Name")
        public String name;

        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        @NameInMap("Editable")
        public Boolean editable;

        @NameInMap("CopyFrom")
        public Long copyFrom;

        @NameInMap("DynamicFieldRequiredInfluencedFields")
        public java.util.List<Long> dynamicFieldRequiredInfluencedFields;

        @NameInMap("FieldLabel")
        public String fieldLabel;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("DynamicOptionFetchUrl")
        public String dynamicOptionFetchUrl;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Id")
        public Long id;

        public static ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData self = new ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setInvisible(Boolean invisible) {
            this.invisible = invisible;
            return this;
        }
        public Boolean getInvisible() {
            return this.invisible;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setFormInvisible(Boolean formInvisible) {
            this.formInvisible = formInvisible;
            return this;
        }
        public Boolean getFormInvisible() {
            return this.formInvisible;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setDynamicOptionFetchDependentFields(java.util.List<Long> dynamicOptionFetchDependentFields) {
            this.dynamicOptionFetchDependentFields = dynamicOptionFetchDependentFields;
            return this;
        }
        public java.util.List<Long> getDynamicOptionFetchDependentFields() {
            return this.dynamicOptionFetchDependentFields;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setFieldFormat(String fieldFormat) {
            this.fieldFormat = fieldFormat;
            return this;
        }
        public String getFieldFormat() {
            return this.fieldFormat;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setDynamicFieldRequiredDependentFields(java.util.List<Long> dynamicFieldRequiredDependentFields) {
            this.dynamicFieldRequiredDependentFields = dynamicFieldRequiredDependentFields;
            return this;
        }
        public java.util.List<Long> getDynamicFieldRequiredDependentFields() {
            return this.dynamicFieldRequiredDependentFields;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setDynamicOptionFetchInfluencedFields(java.util.List<Long> dynamicOptionFetchInfluencedFields) {
            this.dynamicOptionFetchInfluencedFields = dynamicOptionFetchInfluencedFields;
            return this;
        }
        public java.util.List<Long> getDynamicOptionFetchInfluencedFields() {
            return this.dynamicOptionFetchInfluencedFields;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setPossibleValues(java.util.List<String> possibleValues) {
            this.possibleValues = possibleValues;
            return this;
        }
        public java.util.List<String> getPossibleValues() {
            return this.possibleValues;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setEditable(Boolean editable) {
            this.editable = editable;
            return this;
        }
        public Boolean getEditable() {
            return this.editable;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setCopyFrom(Long copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public Long getCopyFrom() {
            return this.copyFrom;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setDynamicFieldRequiredInfluencedFields(java.util.List<Long> dynamicFieldRequiredInfluencedFields) {
            this.dynamicFieldRequiredInfluencedFields = dynamicFieldRequiredInfluencedFields;
            return this;
        }
        public java.util.List<Long> getDynamicFieldRequiredInfluencedFields() {
            return this.dynamicFieldRequiredInfluencedFields;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setFieldLabel(String fieldLabel) {
            this.fieldLabel = fieldLabel;
            return this;
        }
        public String getFieldLabel() {
            return this.fieldLabel;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setDynamicOptionFetchUrl(String dynamicOptionFetchUrl) {
            this.dynamicOptionFetchUrl = dynamicOptionFetchUrl;
            return this;
        }
        public String getDynamicOptionFetchUrl() {
            return this.dynamicOptionFetchUrl;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
