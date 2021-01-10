// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("MergeCommitMessage")
    public String mergeCommitMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ShouldRemoveSourceBranch")
    public String shouldRemoveSourceBranch;

    @NameInMap("SourceBranch")
    public String sourceBranch;

    @NameInMap("TargetBranch")
    public String targetBranch;

    public static ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest self = new ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest setMergeCommitMessage(String mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }
    public String getMergeCommitMessage() {
        return this.mergeCommitMessage;
    }

    public ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest setShouldRemoveSourceBranch(String shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public String getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public ExecLinkeantcodeAntcodeDoprojectbranchmergeRequest setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

}
