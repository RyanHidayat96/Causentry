package com.dynatrace.android.agent.metrics;

/* JADX INFO: loaded from: classes3.dex */
public enum ConnectionType {
    OFFLINE("o"),
    MOBILE("m"),
    WIFI("w"),
    LAN("l"),
    OTHER("");

    public String protocolValue;

    ConnectionType(String str) {
        this.protocolValue = str;
    }
}
