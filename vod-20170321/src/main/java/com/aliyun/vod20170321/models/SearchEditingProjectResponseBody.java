// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchEditingProjectResponseBody extends TeaModel {
    @NameInMap("ProjectList")
    public SearchEditingProjectResponseBodyProjectList projectList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static SearchEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchEditingProjectResponseBody self = new SearchEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchEditingProjectResponseBody setProjectList(SearchEditingProjectResponseBodyProjectList projectList) {
        this.projectList = projectList;
        return this;
    }
    public SearchEditingProjectResponseBodyProjectList getProjectList() {
        return this.projectList;
    }

    public SearchEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchEditingProjectResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class SearchEditingProjectResponseBodyProjectListProject extends TeaModel {
        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("Title")
        public String title;

        public static SearchEditingProjectResponseBodyProjectListProject build(java.util.Map<String, ?> map) throws Exception {
            SearchEditingProjectResponseBodyProjectListProject self = new SearchEditingProjectResponseBodyProjectListProject();
            return TeaModel.build(map, self);
        }

        public SearchEditingProjectResponseBodyProjectListProject setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchEditingProjectResponseBodyProjectListProject setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchEditingProjectResponseBodyProjectListProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchEditingProjectResponseBodyProjectListProject setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public SearchEditingProjectResponseBodyProjectListProject setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchEditingProjectResponseBodyProjectListProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public SearchEditingProjectResponseBodyProjectListProject setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchEditingProjectResponseBodyProjectListProject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchEditingProjectResponseBodyProjectListProject setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchEditingProjectResponseBodyProjectListProject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SearchEditingProjectResponseBodyProjectList extends TeaModel {
        @NameInMap("Project")
        public java.util.List<SearchEditingProjectResponseBodyProjectListProject> project;

        public static SearchEditingProjectResponseBodyProjectList build(java.util.Map<String, ?> map) throws Exception {
            SearchEditingProjectResponseBodyProjectList self = new SearchEditingProjectResponseBodyProjectList();
            return TeaModel.build(map, self);
        }

        public SearchEditingProjectResponseBodyProjectList setProject(java.util.List<SearchEditingProjectResponseBodyProjectListProject> project) {
            this.project = project;
            return this;
        }
        public java.util.List<SearchEditingProjectResponseBodyProjectListProject> getProject() {
            return this.project;
        }

    }

}
