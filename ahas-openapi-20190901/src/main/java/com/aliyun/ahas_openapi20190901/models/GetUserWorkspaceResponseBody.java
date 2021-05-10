// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetUserWorkspaceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("WorkspaceList")
    public java.util.List<GetUserWorkspaceResponseBodyWorkspaceList> workspaceList;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserWorkspaceResponseBody self = new GetUserWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserWorkspaceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserWorkspaceResponseBody setWorkspaceList(java.util.List<GetUserWorkspaceResponseBodyWorkspaceList> workspaceList) {
        this.workspaceList = workspaceList;
        return this;
    }
    public java.util.List<GetUserWorkspaceResponseBodyWorkspaceList> getWorkspaceList() {
        return this.workspaceList;
    }

    public GetUserWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserWorkspaceResponseBodyWorkspaceList extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static GetUserWorkspaceResponseBodyWorkspaceList build(java.util.Map<String, ?> map) throws Exception {
            GetUserWorkspaceResponseBodyWorkspaceList self = new GetUserWorkspaceResponseBodyWorkspaceList();
            return TeaModel.build(map, self);
        }

        public GetUserWorkspaceResponseBodyWorkspaceList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetUserWorkspaceResponseBodyWorkspaceList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetUserWorkspaceResponseBodyWorkspaceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserWorkspaceResponseBodyWorkspaceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
