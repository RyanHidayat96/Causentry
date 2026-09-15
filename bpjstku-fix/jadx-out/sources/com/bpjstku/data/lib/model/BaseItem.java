package com.bpjstku.data.lib.model;

import com.google.gson.annotations.SerializedName;
import defpackage.unsuspend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010"}, d2 = {"Lcom/bpjstku/data/lib/model/BaseItem;", "Lunsuspend;", "<init>", "()V", "", "isSuccessful", "Z", "()Z", "setSuccessful", "(Z)V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "statusCode", "getStatusCode", "setStatusCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseItem extends unsuspend {
    public static final int $stable = 8;

    @SerializedName("isSuccessful")
    private boolean isSuccessful;

    @SerializedName("message")
    private String message = "";

    @SerializedName("statusCode")
    private String statusCode = "";

    /* JADX INFO: renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    public final void setSuccessful(boolean z) {
        this.isSuccessful = z;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final void setStatusCode(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.statusCode = str;
    }
}
