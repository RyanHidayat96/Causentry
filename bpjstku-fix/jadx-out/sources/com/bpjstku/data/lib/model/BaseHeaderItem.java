package com.bpjstku.data.lib.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n"}, d2 = {"Lcom/bpjstku/data/lib/model/BaseHeaderItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "<init>", "()V", "", "requestSignature", "Ljava/lang/String;", "getRequestSignature", "()Ljava/lang/String;", "setRequestSignature", "(Ljava/lang/String;)V", "clientId", "getClientId", "setClientId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseHeaderItem extends BaseItem {
    public static final int $stable = 8;
    private String clientId;
    private String requestSignature;

    public final String getRequestSignature() {
        return this.requestSignature;
    }

    public final void setRequestSignature(String str) {
        this.requestSignature = str;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }
}
