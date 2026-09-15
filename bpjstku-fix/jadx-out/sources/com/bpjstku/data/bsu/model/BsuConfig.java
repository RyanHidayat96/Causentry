package com.bpjstku.data.bsu.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/bsu/model/BsuConfig;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZZLjava/lang/String;)Lcom/bpjstku/data/bsu/model/BsuConfig;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "appLinkPortalBsu", "Ljava/lang/String;", "getAppLinkPortalBsu", "appWebviewBsu", "Z", "getAppWebviewBsu", "appBsuLogin", "getAppBsuLogin", "appBsuText", "getAppBsuText"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BsuConfig {
    public static final int $stable = 0;

    @SerializedName("app_bsu_login")
    public boolean appBsuLogin;

    @SerializedName("app_bsu_text")
    public String appBsuText;

    @SerializedName("app_link_portal_bsu")
    public String appLinkPortalBsu;

    @SerializedName("app_webview_bsu")
    public boolean appWebviewBsu;

    public BsuConfig(String str, boolean z, boolean z2, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.appLinkPortalBsu = str;
        this.appWebviewBsu = z;
        this.appBsuLogin = z2;
        this.appBsuText = str2;
    }

    public final String getAppLinkPortalBsu() {
        return this.appLinkPortalBsu;
    }

    public final boolean getAppWebviewBsu() {
        return this.appWebviewBsu;
    }

    public final boolean getAppBsuLogin() {
        return this.appBsuLogin;
    }

    public final String getAppBsuText() {
        return this.appBsuText;
    }

    public static /* synthetic */ BsuConfig copy$default(BsuConfig bsuConfig, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bsuConfig.appLinkPortalBsu;
        }
        if ((i & 2) != 0) {
            z = bsuConfig.appWebviewBsu;
        }
        if ((i & 4) != 0) {
            z2 = bsuConfig.appBsuLogin;
        }
        if ((i & 8) != 0) {
            str2 = bsuConfig.appBsuText;
        }
        return bsuConfig.copy(str, z, z2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppLinkPortalBsu() {
        return this.appLinkPortalBsu;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAppWebviewBsu() {
        return this.appWebviewBsu;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAppBsuLogin() {
        return this.appBsuLogin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppBsuText() {
        return this.appBsuText;
    }

    public final BsuConfig copy(String p0, boolean p1, boolean p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new BsuConfig(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BsuConfig)) {
            return false;
        }
        BsuConfig bsuConfig = (BsuConfig) p0;
        return Intrinsics.areEqual(this.appLinkPortalBsu, bsuConfig.appLinkPortalBsu) && this.appWebviewBsu == bsuConfig.appWebviewBsu && this.appBsuLogin == bsuConfig.appBsuLogin && Intrinsics.areEqual(this.appBsuText, bsuConfig.appBsuText);
    }

    public final int hashCode() {
        return (((((this.appLinkPortalBsu.hashCode() * 31) + Boolean.hashCode(this.appWebviewBsu)) * 31) + Boolean.hashCode(this.appBsuLogin)) * 31) + this.appBsuText.hashCode();
    }

    public final String toString() {
        String str = this.appLinkPortalBsu;
        boolean z = this.appWebviewBsu;
        boolean z2 = this.appBsuLogin;
        String str2 = this.appBsuText;
        StringBuilder sb = new StringBuilder("BsuConfig(appLinkPortalBsu=");
        sb.append(str);
        sb.append(", appWebviewBsu=");
        sb.append(z);
        sb.append(", appBsuLogin=");
        sb.append(z2);
        sb.append(", appBsuText=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ BsuConfig() {
    }
}
