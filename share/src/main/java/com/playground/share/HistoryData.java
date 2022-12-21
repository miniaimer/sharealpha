package com.playground.share;

public class HistoryData {
    Integer Id;
    String PackageName;
    String AppName;
    Integer Point;
    String AppThumbnailUrl;
    String CustomData;

    public HistoryData() {
    }

    public HistoryData(Integer id, String packageName,String appName, Integer point, String appThumbnailUrl, String customData) {
        Id = id;
        PackageName = packageName;
        AppName = appName;
        Point = point;
        AppThumbnailUrl = appThumbnailUrl;
        CustomData = customData;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPackageName() {
        return PackageName;
    }

    public void setPackageName(String packageName) {
        PackageName = packageName;
    }
    public String getAppName() {
        return AppName;
    }
    public void setAppName(String appName) {
        AppName = appName;
    }
    public Integer getPoint() {
        return Point;
    }

    public void setPoint(Integer point) {
        Point = point;
    }

    public String getAppThumbnailUrl() {
        return AppThumbnailUrl;
    }

    public void setAppThumbnailUrl(String appThumbnailUrl) {
        AppThumbnailUrl = appThumbnailUrl;
    }

    public String getCustomData() {
        return CustomData;
    }

    public void setCustomData(String customData) {
        CustomData = customData;
    }
}
