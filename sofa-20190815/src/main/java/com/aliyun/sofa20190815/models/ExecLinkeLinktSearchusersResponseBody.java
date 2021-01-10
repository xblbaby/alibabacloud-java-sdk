// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSearchusersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public java.util.List<ExecLinkeLinktSearchusersResponseBodyData> data;

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

    public static ExecLinkeLinktSearchusersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSearchusersResponseBody self = new ExecLinkeLinktSearchusersResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSearchusersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeLinktSearchusersResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeLinktSearchusersResponseBody setData(java.util.List<ExecLinkeLinktSearchusersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ExecLinkeLinktSearchusersResponseBodyData> getData() {
        return this.data;
    }

    public ExecLinkeLinktSearchusersResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ExecLinkeLinktSearchusersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecLinkeLinktSearchusersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeLinktSearchusersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeLinktSearchusersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ExecLinkeLinktSearchusersResponseBodyData extends TeaModel {
        @NameInMap("DeptNo")
        public String deptNo;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("SuperWorkNo")
        public String superWorkNo;

        @NameInMap("Site")
        public String site;

        @NameInMap("Manager")
        public Boolean manager;

        @NameInMap("AuthToken")
        public String authToken;

        @NameInMap("UserToken")
        public String userToken;

        @NameInMap("BuName")
        public String buName;

        @NameInMap("LoginAccount")
        public String loginAccount;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GmtLeave")
        public Long gmtLeave;

        @NameInMap("TenantAdmin")
        public Boolean tenantAdmin;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("GitModified")
        public Long gitModified;

        @NameInMap("BuNo")
        public String buNo;

        @NameInMap("EmpTypeExt")
        public String empTypeExt;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("WorkStatus")
        public String workStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("VirtName")
        public String virtName;

        @NameInMap("AliFullName")
        public String aliFullName;

        @NameInMap("Account")
        public String account;

        @NameInMap("DeptName")
        public String deptName;

        @NameInMap("GitPassword")
        public String gitPassword;

        @NameInMap("FullPartTime")
        public String fullPartTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("AdDomain")
        public String adDomain;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("SuperName")
        public String superName;

        @NameInMap("VirtWorkNo")
        public String virtWorkNo;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Tenants")
        public java.util.List<String> tenants;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("Email")
        public String email;

        @NameInMap("GmtEntry")
        public Long gmtEntry;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("WorkNo")
        public String workNo;

        @NameInMap("EmpType")
        public String empType;

        @NameInMap("Level")
        public String level;

        @NameInMap("SuperNickName")
        public String superNickName;

        public static ExecLinkeLinktSearchusersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeLinktSearchusersResponseBodyData self = new ExecLinkeLinktSearchusersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecLinkeLinktSearchusersResponseBodyData setDeptNo(String deptNo) {
            this.deptNo = deptNo;
            return this;
        }
        public String getDeptNo() {
            return this.deptNo;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setSuperWorkNo(String superWorkNo) {
            this.superWorkNo = superWorkNo;
            return this;
        }
        public String getSuperWorkNo() {
            return this.superWorkNo;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setManager(Boolean manager) {
            this.manager = manager;
            return this;
        }
        public Boolean getManager() {
            return this.manager;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setUserToken(String userToken) {
            this.userToken = userToken;
            return this;
        }
        public String getUserToken() {
            return this.userToken;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setBuName(String buName) {
            this.buName = buName;
            return this;
        }
        public String getBuName() {
            return this.buName;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setLoginAccount(String loginAccount) {
            this.loginAccount = loginAccount;
            return this;
        }
        public String getLoginAccount() {
            return this.loginAccount;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setGmtLeave(Long gmtLeave) {
            this.gmtLeave = gmtLeave;
            return this;
        }
        public Long getGmtLeave() {
            return this.gmtLeave;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setTenantAdmin(Boolean tenantAdmin) {
            this.tenantAdmin = tenantAdmin;
            return this;
        }
        public Boolean getTenantAdmin() {
            return this.tenantAdmin;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setGitModified(Long gitModified) {
            this.gitModified = gitModified;
            return this;
        }
        public Long getGitModified() {
            return this.gitModified;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setBuNo(String buNo) {
            this.buNo = buNo;
            return this;
        }
        public String getBuNo() {
            return this.buNo;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setEmpTypeExt(String empTypeExt) {
            this.empTypeExt = empTypeExt;
            return this;
        }
        public String getEmpTypeExt() {
            return this.empTypeExt;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setWorkStatus(String workStatus) {
            this.workStatus = workStatus;
            return this;
        }
        public String getWorkStatus() {
            return this.workStatus;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setVirtName(String virtName) {
            this.virtName = virtName;
            return this;
        }
        public String getVirtName() {
            return this.virtName;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setAliFullName(String aliFullName) {
            this.aliFullName = aliFullName;
            return this;
        }
        public String getAliFullName() {
            return this.aliFullName;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setGitPassword(String gitPassword) {
            this.gitPassword = gitPassword;
            return this;
        }
        public String getGitPassword() {
            return this.gitPassword;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setFullPartTime(String fullPartTime) {
            this.fullPartTime = fullPartTime;
            return this;
        }
        public String getFullPartTime() {
            return this.fullPartTime;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setSuperName(String superName) {
            this.superName = superName;
            return this;
        }
        public String getSuperName() {
            return this.superName;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setVirtWorkNo(String virtWorkNo) {
            this.virtWorkNo = virtWorkNo;
            return this;
        }
        public String getVirtWorkNo() {
            return this.virtWorkNo;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setGmtEntry(Long gmtEntry) {
            this.gmtEntry = gmtEntry;
            return this;
        }
        public Long getGmtEntry() {
            return this.gmtEntry;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setEmpType(String empType) {
            this.empType = empType;
            return this;
        }
        public String getEmpType() {
            return this.empType;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecLinkeLinktSearchusersResponseBodyData setSuperNickName(String superNickName) {
            this.superNickName = superNickName;
            return this;
        }
        public String getSuperNickName() {
            return this.superNickName;
        }

    }

}
