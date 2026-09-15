package com.bpjstku.data.menu.model.response;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/menu/model/response/AvailabilityMenuItem;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/menu/model/response/AvailabilityMenuItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "menuCode", "Ljava/lang/String;", "getMenuCode", "menuName", "getMenuName", "informationMessage", "getInformationMessage", "imageUrl", "getImageUrl", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "getActive"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AvailabilityMenuItem {
    public static final int $stable = 0;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private final String active;

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("informationMessage")
    private final String informationMessage;

    @SerializedName("menuCode")
    private final String menuCode;

    @SerializedName("menuName")
    private final String menuName;

    public AvailabilityMenuItem(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.menuCode = str;
        this.menuName = str2;
        this.informationMessage = str3;
        this.imageUrl = str4;
        this.active = str5;
    }

    public final String getMenuCode() {
        return this.menuCode;
    }

    public final String getMenuName() {
        return this.menuName;
    }

    public final String getInformationMessage() {
        return this.informationMessage;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getActive() {
        return this.active;
    }

    public static /* synthetic */ AvailabilityMenuItem copy$default(AvailabilityMenuItem availabilityMenuItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availabilityMenuItem.menuCode;
        }
        if ((i & 2) != 0) {
            str2 = availabilityMenuItem.menuName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = availabilityMenuItem.informationMessage;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = availabilityMenuItem.imageUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = availabilityMenuItem.active;
        }
        return availabilityMenuItem.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMenuCode() {
        return this.menuCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMenuName() {
        return this.menuName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInformationMessage() {
        return this.informationMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getActive() {
        return this.active;
    }

    public final AvailabilityMenuItem copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new AvailabilityMenuItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AvailabilityMenuItem)) {
            return false;
        }
        AvailabilityMenuItem availabilityMenuItem = (AvailabilityMenuItem) p0;
        return Intrinsics.areEqual(this.menuCode, availabilityMenuItem.menuCode) && Intrinsics.areEqual(this.menuName, availabilityMenuItem.menuName) && Intrinsics.areEqual(this.informationMessage, availabilityMenuItem.informationMessage) && Intrinsics.areEqual(this.imageUrl, availabilityMenuItem.imageUrl) && Intrinsics.areEqual(this.active, availabilityMenuItem.active);
    }

    public final int hashCode() {
        return (((((((this.menuCode.hashCode() * 31) + this.menuName.hashCode()) * 31) + this.informationMessage.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.active.hashCode();
    }

    public final String toString() {
        String str = this.menuCode;
        String str2 = this.menuName;
        String str3 = this.informationMessage;
        String str4 = this.imageUrl;
        String str5 = this.active;
        StringBuilder sb = new StringBuilder("AvailabilityMenuItem(menuCode=");
        sb.append(str);
        sb.append(", menuName=");
        sb.append(str2);
        sb.append(", informationMessage=");
        sb.append(str3);
        sb.append(", imageUrl=");
        sb.append(str4);
        sb.append(", active=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
