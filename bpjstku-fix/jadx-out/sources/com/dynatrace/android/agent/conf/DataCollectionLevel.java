package com.dynatrace.android.agent.conf;

/* JADX INFO: loaded from: classes3.dex */
public enum DataCollectionLevel {
    OFF(0),
    PERFORMANCE(1),
    USER_BEHAVIOR(2);

    private final int javaScriptValue;

    DataCollectionLevel(int i) {
        this.javaScriptValue = i;
    }
}
