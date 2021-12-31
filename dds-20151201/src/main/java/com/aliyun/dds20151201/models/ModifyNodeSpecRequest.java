// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("BusinessInfo")
    public String businessInfo;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("NodeClass")
    public String nodeClass;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("NodeStorage")
    public Integer nodeStorage;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ReadonlyReplicas")
    public Integer readonlyReplicas;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SwitchTime")
    public String switchTime;

    public static ModifyNodeSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecRequest self = new ModifyNodeSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyNodeSpecRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public ModifyNodeSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyNodeSpecRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public ModifyNodeSpecRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyNodeSpecRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyNodeSpecRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public ModifyNodeSpecRequest setNodeClass(String nodeClass) {
        this.nodeClass = nodeClass;
        return this;
    }
    public String getNodeClass() {
        return this.nodeClass;
    }

    public ModifyNodeSpecRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ModifyNodeSpecRequest setNodeStorage(Integer nodeStorage) {
        this.nodeStorage = nodeStorage;
        return this;
    }
    public Integer getNodeStorage() {
        return this.nodeStorage;
    }

    public ModifyNodeSpecRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ModifyNodeSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyNodeSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNodeSpecRequest setReadonlyReplicas(Integer readonlyReplicas) {
        this.readonlyReplicas = readonlyReplicas;
        return this;
    }
    public Integer getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    public ModifyNodeSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNodeSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyNodeSpecRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyNodeSpecRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

}
