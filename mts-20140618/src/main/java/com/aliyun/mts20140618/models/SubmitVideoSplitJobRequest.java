// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitVideoSplitJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Input")
    public String input;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("VideoSplitConfig")
    public String videoSplitConfig;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static SubmitVideoSplitJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoSplitJobRequest self = new SubmitVideoSplitJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoSplitJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitVideoSplitJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitVideoSplitJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitVideoSplitJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitVideoSplitJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitVideoSplitJobRequest setVideoSplitConfig(String videoSplitConfig) {
        this.videoSplitConfig = videoSplitConfig;
        return this;
    }
    public String getVideoSplitConfig() {
        return this.videoSplitConfig;
    }

    public SubmitVideoSplitJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitVideoSplitJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
