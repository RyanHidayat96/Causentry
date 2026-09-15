package com.dynatrace.android.agent.data;

/* JADX INFO: loaded from: classes3.dex */
public enum SessionState {
    CREATED(true, false),
    ENABLED(true, true),
    DISABLED(false, true);

    public boolean active;
    public boolean configurationApplied;

    SessionState(boolean z, boolean z2) {
        this.active = z;
        this.configurationApplied = z2;
    }
}
