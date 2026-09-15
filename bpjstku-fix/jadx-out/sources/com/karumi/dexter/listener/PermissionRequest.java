package com.karumi.dexter.listener;

/* JADX INFO: loaded from: classes4.dex */
public final class PermissionRequest {
    private final String name;

    public PermissionRequest(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Permission name: ");
        sb.append(this.name);
        return sb.toString();
    }
}
