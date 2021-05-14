// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityStatInfoResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityEvent")
    public DescribeSecurityStatInfoResponseBodySecurityEvent securityEvent;

    @NameInMap("AttackEvent")
    public DescribeSecurityStatInfoResponseBodyAttackEvent attackEvent;

    @NameInMap("HealthCheck")
    public DescribeSecurityStatInfoResponseBodyHealthCheck healthCheck;

    @NameInMap("Vulnerability")
    public DescribeSecurityStatInfoResponseBodyVulnerability vulnerability;

    public static DescribeSecurityStatInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityStatInfoResponseBody self = new DescribeSecurityStatInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityStatInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSecurityStatInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityStatInfoResponseBody setSecurityEvent(DescribeSecurityStatInfoResponseBodySecurityEvent securityEvent) {
        this.securityEvent = securityEvent;
        return this;
    }
    public DescribeSecurityStatInfoResponseBodySecurityEvent getSecurityEvent() {
        return this.securityEvent;
    }

    public DescribeSecurityStatInfoResponseBody setAttackEvent(DescribeSecurityStatInfoResponseBodyAttackEvent attackEvent) {
        this.attackEvent = attackEvent;
        return this;
    }
    public DescribeSecurityStatInfoResponseBodyAttackEvent getAttackEvent() {
        return this.attackEvent;
    }

    public DescribeSecurityStatInfoResponseBody setHealthCheck(DescribeSecurityStatInfoResponseBodyHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public DescribeSecurityStatInfoResponseBodyHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeSecurityStatInfoResponseBody setVulnerability(DescribeSecurityStatInfoResponseBodyVulnerability vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }
    public DescribeSecurityStatInfoResponseBodyVulnerability getVulnerability() {
        return this.vulnerability;
    }

    public static class DescribeSecurityStatInfoResponseBodySecurityEvent extends TeaModel {
        @NameInMap("SuspiciousCount")
        public Integer suspiciousCount;

        @NameInMap("SeriousCount")
        public Integer seriousCount;

        @NameInMap("RemindCount")
        public Integer remindCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        @NameInMap("TimeArray")
        public java.util.List<String> timeArray;

        @NameInMap("RemindList")
        public java.util.List<String> remindList;

        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        @NameInMap("SuspiciousList")
        public java.util.List<String> suspiciousList;

        @NameInMap("SeriousList")
        public java.util.List<String> seriousList;

        public static DescribeSecurityStatInfoResponseBodySecurityEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityStatInfoResponseBodySecurityEvent self = new DescribeSecurityStatInfoResponseBodySecurityEvent();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setSuspiciousCount(Integer suspiciousCount) {
            this.suspiciousCount = suspiciousCount;
            return this;
        }
        public Integer getSuspiciousCount() {
            return this.suspiciousCount;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setSeriousCount(Integer seriousCount) {
            this.seriousCount = seriousCount;
            return this;
        }
        public Integer getSeriousCount() {
            return this.seriousCount;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setRemindCount(Integer remindCount) {
            this.remindCount = remindCount;
            return this;
        }
        public Integer getRemindCount() {
            return this.remindCount;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setTimeArray(java.util.List<String> timeArray) {
            this.timeArray = timeArray;
            return this;
        }
        public java.util.List<String> getTimeArray() {
            return this.timeArray;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setRemindList(java.util.List<String> remindList) {
            this.remindList = remindList;
            return this;
        }
        public java.util.List<String> getRemindList() {
            return this.remindList;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setLevelsOn(java.util.List<String> levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }
        public java.util.List<String> getLevelsOn() {
            return this.levelsOn;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setSuspiciousList(java.util.List<String> suspiciousList) {
            this.suspiciousList = suspiciousList;
            return this;
        }
        public java.util.List<String> getSuspiciousList() {
            return this.suspiciousList;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setSeriousList(java.util.List<String> seriousList) {
            this.seriousList = seriousList;
            return this;
        }
        public java.util.List<String> getSeriousList() {
            return this.seriousList;
        }

    }

    public static class DescribeSecurityStatInfoResponseBodyAttackEvent extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        public static DescribeSecurityStatInfoResponseBodyAttackEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityStatInfoResponseBodyAttackEvent self = new DescribeSecurityStatInfoResponseBodyAttackEvent();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityStatInfoResponseBodyAttackEvent setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSecurityStatInfoResponseBodyAttackEvent setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeSecurityStatInfoResponseBodyAttackEvent setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

    }

    public static class DescribeSecurityStatInfoResponseBodyHealthCheck extends TeaModel {
        @NameInMap("HighCount")
        public Integer highCount;

        @NameInMap("LowCount")
        public Integer lowCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("MediumCount")
        public Integer mediumCount;

        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        @NameInMap("TimeArray")
        public java.util.List<String> timeArray;

        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        @NameInMap("LowList")
        public java.util.List<String> lowList;

        @NameInMap("MediumList")
        public java.util.List<String> mediumList;

        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        @NameInMap("HighList")
        public java.util.List<String> highList;

        public static DescribeSecurityStatInfoResponseBodyHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityStatInfoResponseBodyHealthCheck self = new DescribeSecurityStatInfoResponseBodyHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setHighCount(Integer highCount) {
            this.highCount = highCount;
            return this;
        }
        public Integer getHighCount() {
            return this.highCount;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setLowCount(Integer lowCount) {
            this.lowCount = lowCount;
            return this;
        }
        public Integer getLowCount() {
            return this.lowCount;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setMediumCount(Integer mediumCount) {
            this.mediumCount = mediumCount;
            return this;
        }
        public Integer getMediumCount() {
            return this.mediumCount;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setTimeArray(java.util.List<String> timeArray) {
            this.timeArray = timeArray;
            return this;
        }
        public java.util.List<String> getTimeArray() {
            return this.timeArray;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setLevelsOn(java.util.List<String> levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }
        public java.util.List<String> getLevelsOn() {
            return this.levelsOn;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setLowList(java.util.List<String> lowList) {
            this.lowList = lowList;
            return this;
        }
        public java.util.List<String> getLowList() {
            return this.lowList;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setMediumList(java.util.List<String> mediumList) {
            this.mediumList = mediumList;
            return this;
        }
        public java.util.List<String> getMediumList() {
            return this.mediumList;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setHighList(java.util.List<String> highList) {
            this.highList = highList;
            return this;
        }
        public java.util.List<String> getHighList() {
            return this.highList;
        }

    }

    public static class DescribeSecurityStatInfoResponseBodyVulnerability extends TeaModel {
        @NameInMap("NntfCount")
        public Integer nntfCount;

        @NameInMap("LaterCount")
        public Integer laterCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("AsapCount")
        public Integer asapCount;

        @NameInMap("NntfList")
        public java.util.List<String> nntfList;

        @NameInMap("AsapList")
        public java.util.List<String> asapList;

        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        @NameInMap("TimeArray")
        public java.util.List<String> timeArray;

        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        @NameInMap("LaterList")
        public java.util.List<String> laterList;

        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        public static DescribeSecurityStatInfoResponseBodyVulnerability build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityStatInfoResponseBodyVulnerability self = new DescribeSecurityStatInfoResponseBodyVulnerability();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setNntfList(java.util.List<String> nntfList) {
            this.nntfList = nntfList;
            return this;
        }
        public java.util.List<String> getNntfList() {
            return this.nntfList;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setAsapList(java.util.List<String> asapList) {
            this.asapList = asapList;
            return this;
        }
        public java.util.List<String> getAsapList() {
            return this.asapList;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setTimeArray(java.util.List<String> timeArray) {
            this.timeArray = timeArray;
            return this;
        }
        public java.util.List<String> getTimeArray() {
            return this.timeArray;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setLevelsOn(java.util.List<String> levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }
        public java.util.List<String> getLevelsOn() {
            return this.levelsOn;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setLaterList(java.util.List<String> laterList) {
            this.laterList = laterList;
            return this;
        }
        public java.util.List<String> getLaterList() {
            return this.laterList;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

    }

}
