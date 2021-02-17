// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SummaryMap")
    public GetAccountSummaryResponseBodySummaryMap summaryMap;

    public static GetAccountSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSummaryResponseBody self = new GetAccountSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountSummaryResponseBody setSummaryMap(GetAccountSummaryResponseBodySummaryMap summaryMap) {
        this.summaryMap = summaryMap;
        return this;
    }
    public GetAccountSummaryResponseBodySummaryMap getSummaryMap() {
        return this.summaryMap;
    }

    public static class GetAccountSummaryResponseBodySummaryMap extends TeaModel {
        @NameInMap("MFADevices")
        public Integer MFADevices;

        @NameInMap("AccessKeysPerUserQuota")
        public Integer accessKeysPerUserQuota;

        @NameInMap("AttachedPoliciesPerGroupQuota")
        public Integer attachedPoliciesPerGroupQuota;

        @NameInMap("AttachedSystemPoliciesPerRoleQuota")
        public Integer attachedSystemPoliciesPerRoleQuota;

        @NameInMap("AttachedPoliciesPerRoleQuota")
        public Integer attachedPoliciesPerRoleQuota;

        @NameInMap("GroupsPerUserQuota")
        public Integer groupsPerUserQuota;

        @NameInMap("Roles")
        public Integer roles;

        @NameInMap("PolicySizeQuota")
        public Integer policySizeQuota;

        @NameInMap("AttachedSystemPoliciesPerGroupQuota")
        public Integer attachedSystemPoliciesPerGroupQuota;

        @NameInMap("AttachedSystemPoliciesPerUserQuota")
        public Integer attachedSystemPoliciesPerUserQuota;

        @NameInMap("AttachedPoliciesPerUserQuota")
        public Integer attachedPoliciesPerUserQuota;

        @NameInMap("GroupsQuota")
        public Integer groupsQuota;

        @NameInMap("Groups")
        public Integer groups;

        @NameInMap("PoliciesQuota")
        public Integer policiesQuota;

        @NameInMap("VirtualMFADevicesQuota")
        public Integer virtualMFADevicesQuota;

        @NameInMap("VersionsPerPolicyQuota")
        public Integer versionsPerPolicyQuota;

        @NameInMap("RolesQuota")
        public Integer rolesQuota;

        @NameInMap("UsersQuota")
        public Integer usersQuota;

        @NameInMap("Policies")
        public Integer policies;

        @NameInMap("Users")
        public Integer users;

        @NameInMap("MFADevicesInUse")
        public Integer MFADevicesInUse;

        public static GetAccountSummaryResponseBodySummaryMap build(java.util.Map<String, ?> map) throws Exception {
            GetAccountSummaryResponseBodySummaryMap self = new GetAccountSummaryResponseBodySummaryMap();
            return TeaModel.build(map, self);
        }

        public GetAccountSummaryResponseBodySummaryMap setMFADevices(Integer MFADevices) {
            this.MFADevices = MFADevices;
            return this;
        }
        public Integer getMFADevices() {
            return this.MFADevices;
        }

        public GetAccountSummaryResponseBodySummaryMap setAccessKeysPerUserQuota(Integer accessKeysPerUserQuota) {
            this.accessKeysPerUserQuota = accessKeysPerUserQuota;
            return this;
        }
        public Integer getAccessKeysPerUserQuota() {
            return this.accessKeysPerUserQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedPoliciesPerGroupQuota(Integer attachedPoliciesPerGroupQuota) {
            this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerGroupQuota() {
            return this.attachedPoliciesPerGroupQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedSystemPoliciesPerRoleQuota(Integer attachedSystemPoliciesPerRoleQuota) {
            this.attachedSystemPoliciesPerRoleQuota = attachedSystemPoliciesPerRoleQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerRoleQuota() {
            return this.attachedSystemPoliciesPerRoleQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedPoliciesPerRoleQuota(Integer attachedPoliciesPerRoleQuota) {
            this.attachedPoliciesPerRoleQuota = attachedPoliciesPerRoleQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerRoleQuota() {
            return this.attachedPoliciesPerRoleQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setGroupsPerUserQuota(Integer groupsPerUserQuota) {
            this.groupsPerUserQuota = groupsPerUserQuota;
            return this;
        }
        public Integer getGroupsPerUserQuota() {
            return this.groupsPerUserQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setRoles(Integer roles) {
            this.roles = roles;
            return this;
        }
        public Integer getRoles() {
            return this.roles;
        }

        public GetAccountSummaryResponseBodySummaryMap setPolicySizeQuota(Integer policySizeQuota) {
            this.policySizeQuota = policySizeQuota;
            return this;
        }
        public Integer getPolicySizeQuota() {
            return this.policySizeQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedSystemPoliciesPerGroupQuota(Integer attachedSystemPoliciesPerGroupQuota) {
            this.attachedSystemPoliciesPerGroupQuota = attachedSystemPoliciesPerGroupQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerGroupQuota() {
            return this.attachedSystemPoliciesPerGroupQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedSystemPoliciesPerUserQuota(Integer attachedSystemPoliciesPerUserQuota) {
            this.attachedSystemPoliciesPerUserQuota = attachedSystemPoliciesPerUserQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerUserQuota() {
            return this.attachedSystemPoliciesPerUserQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedPoliciesPerUserQuota(Integer attachedPoliciesPerUserQuota) {
            this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerUserQuota() {
            return this.attachedPoliciesPerUserQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setGroupsQuota(Integer groupsQuota) {
            this.groupsQuota = groupsQuota;
            return this;
        }
        public Integer getGroupsQuota() {
            return this.groupsQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setGroups(Integer groups) {
            this.groups = groups;
            return this;
        }
        public Integer getGroups() {
            return this.groups;
        }

        public GetAccountSummaryResponseBodySummaryMap setPoliciesQuota(Integer policiesQuota) {
            this.policiesQuota = policiesQuota;
            return this;
        }
        public Integer getPoliciesQuota() {
            return this.policiesQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setVirtualMFADevicesQuota(Integer virtualMFADevicesQuota) {
            this.virtualMFADevicesQuota = virtualMFADevicesQuota;
            return this;
        }
        public Integer getVirtualMFADevicesQuota() {
            return this.virtualMFADevicesQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setVersionsPerPolicyQuota(Integer versionsPerPolicyQuota) {
            this.versionsPerPolicyQuota = versionsPerPolicyQuota;
            return this;
        }
        public Integer getVersionsPerPolicyQuota() {
            return this.versionsPerPolicyQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setRolesQuota(Integer rolesQuota) {
            this.rolesQuota = rolesQuota;
            return this;
        }
        public Integer getRolesQuota() {
            return this.rolesQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setUsersQuota(Integer usersQuota) {
            this.usersQuota = usersQuota;
            return this;
        }
        public Integer getUsersQuota() {
            return this.usersQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setPolicies(Integer policies) {
            this.policies = policies;
            return this;
        }
        public Integer getPolicies() {
            return this.policies;
        }

        public GetAccountSummaryResponseBodySummaryMap setUsers(Integer users) {
            this.users = users;
            return this;
        }
        public Integer getUsers() {
            return this.users;
        }

        public GetAccountSummaryResponseBodySummaryMap setMFADevicesInUse(Integer MFADevicesInUse) {
            this.MFADevicesInUse = MFADevicesInUse;
            return this;
        }
        public Integer getMFADevicesInUse() {
            return this.MFADevicesInUse;
        }

    }

}