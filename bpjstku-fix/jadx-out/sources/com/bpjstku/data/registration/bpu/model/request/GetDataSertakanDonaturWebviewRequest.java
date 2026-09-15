package com.bpjstku.data.registration.bpu.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/registration/bpu/model/request/GetDataSertakanDonaturWebviewRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/bpu/model/request/GetDataSertakanDonaturWebviewRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "identifierDonatur", "Ljava/lang/String;", "getIdentifierDonatur", "nikDonatur", "getNikDonatur", "namaDonatur", "getNamaDonatur", "phoneNumberDonatur", "getPhoneNumberDonatur", "customField", "getCustomField"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetDataSertakanDonaturWebviewRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("customField")
    private final String customField;

    @SerializedName("identifierDonatur")
    private final String identifierDonatur;

    @SerializedName("namaDonatur")
    private final String namaDonatur;

    @SerializedName("nikDonatur")
    private final String nikDonatur;

    @SerializedName("phoneNumberDonatur")
    private final String phoneNumberDonatur;

    public final String getIdentifierDonatur() {
        return this.identifierDonatur;
    }

    public final String getNikDonatur() {
        return this.nikDonatur;
    }

    public final String getNamaDonatur() {
        return this.namaDonatur;
    }

    public final String getPhoneNumberDonatur() {
        return this.phoneNumberDonatur;
    }

    public final String getCustomField() {
        return this.customField;
    }

    public GetDataSertakanDonaturWebviewRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.identifierDonatur = str;
        this.nikDonatur = str2;
        this.namaDonatur = str3;
        this.phoneNumberDonatur = str4;
        this.customField = str5;
    }

    public static /* synthetic */ GetDataSertakanDonaturWebviewRequest copy$default(GetDataSertakanDonaturWebviewRequest getDataSertakanDonaturWebviewRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getDataSertakanDonaturWebviewRequest.identifierDonatur;
        }
        if ((i & 2) != 0) {
            str2 = getDataSertakanDonaturWebviewRequest.nikDonatur;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = getDataSertakanDonaturWebviewRequest.namaDonatur;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = getDataSertakanDonaturWebviewRequest.phoneNumberDonatur;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = getDataSertakanDonaturWebviewRequest.customField;
        }
        return getDataSertakanDonaturWebviewRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentifierDonatur() {
        return this.identifierDonatur;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNikDonatur() {
        return this.nikDonatur;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaDonatur() {
        return this.namaDonatur;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhoneNumberDonatur() {
        return this.phoneNumberDonatur;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCustomField() {
        return this.customField;
    }

    public final GetDataSertakanDonaturWebviewRequest copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new GetDataSertakanDonaturWebviewRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GetDataSertakanDonaturWebviewRequest)) {
            return false;
        }
        GetDataSertakanDonaturWebviewRequest getDataSertakanDonaturWebviewRequest = (GetDataSertakanDonaturWebviewRequest) p0;
        return Intrinsics.areEqual(this.identifierDonatur, getDataSertakanDonaturWebviewRequest.identifierDonatur) && Intrinsics.areEqual(this.nikDonatur, getDataSertakanDonaturWebviewRequest.nikDonatur) && Intrinsics.areEqual(this.namaDonatur, getDataSertakanDonaturWebviewRequest.namaDonatur) && Intrinsics.areEqual(this.phoneNumberDonatur, getDataSertakanDonaturWebviewRequest.phoneNumberDonatur) && Intrinsics.areEqual(this.customField, getDataSertakanDonaturWebviewRequest.customField);
    }

    public final int hashCode() {
        return (((((((this.identifierDonatur.hashCode() * 31) + this.nikDonatur.hashCode()) * 31) + this.namaDonatur.hashCode()) * 31) + this.phoneNumberDonatur.hashCode()) * 31) + this.customField.hashCode();
    }

    public final String toString() {
        String str = this.identifierDonatur;
        String str2 = this.nikDonatur;
        String str3 = this.namaDonatur;
        String str4 = this.phoneNumberDonatur;
        String str5 = this.customField;
        StringBuilder sb = new StringBuilder("GetDataSertakanDonaturWebviewRequest(identifierDonatur=");
        sb.append(str);
        sb.append(", nikDonatur=");
        sb.append(str2);
        sb.append(", namaDonatur=");
        sb.append(str3);
        sb.append(", phoneNumberDonatur=");
        sb.append(str4);
        sb.append(", customField=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
