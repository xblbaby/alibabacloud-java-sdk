// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDedicatedLineRequest extends TeaModel {
    // 宽带（Mbps）
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    // 幂等校验 token
    @NameInMap("ClientToken")
    public String clientToken;

    // 联系人
    @NameInMap("Contact")
    public String contact;

    // 专线网关
    @NameInMap("DedicatedLineGateway")
    public String dedicatedLineGateway;

    // 专线IP
    @NameInMap("DedicatedLineIp")
    public String dedicatedLineIp;

    // 专线角色
    @NameInMap("DedicatedLineRole")
    public String dedicatedLineRole;

    // 备注
    @NameInMap("Description")
    public String description;

    // 关联设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 关联设备端口名称
    @NameInMap("DevicePort")
    public String devicePort;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 运营商
    @NameInMap("Isp")
    public String isp;

    // 联系方式
    @NameInMap("Phone")
    public String phone;

    // 物理空间ID
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    public static CreateDedicatedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedLineRequest self = new CreateDedicatedLineRequest();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedLineRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateDedicatedLineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDedicatedLineRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public CreateDedicatedLineRequest setDedicatedLineGateway(String dedicatedLineGateway) {
        this.dedicatedLineGateway = dedicatedLineGateway;
        return this;
    }
    public String getDedicatedLineGateway() {
        return this.dedicatedLineGateway;
    }

    public CreateDedicatedLineRequest setDedicatedLineIp(String dedicatedLineIp) {
        this.dedicatedLineIp = dedicatedLineIp;
        return this;
    }
    public String getDedicatedLineIp() {
        return this.dedicatedLineIp;
    }

    public CreateDedicatedLineRequest setDedicatedLineRole(String dedicatedLineRole) {
        this.dedicatedLineRole = dedicatedLineRole;
        return this;
    }
    public String getDedicatedLineRole() {
        return this.dedicatedLineRole;
    }

    public CreateDedicatedLineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDedicatedLineRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateDedicatedLineRequest setDevicePort(String devicePort) {
        this.devicePort = devicePort;
        return this;
    }
    public String getDevicePort() {
        return this.devicePort;
    }

    public CreateDedicatedLineRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDedicatedLineRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public CreateDedicatedLineRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateDedicatedLineRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

}
