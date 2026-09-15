package com.midtrans.sdk.analytics;

/* JADX INFO: loaded from: classes4.dex */
public class MixpanelEvent {
    public String event;
    public MixpanelProperties properties;

    public String getEvent() {
        return this.event;
    }

    public MixpanelProperties getProperties() {
        return this.properties;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setProperties(MixpanelProperties mixpanelProperties) {
        this.properties = mixpanelProperties;
    }
}
