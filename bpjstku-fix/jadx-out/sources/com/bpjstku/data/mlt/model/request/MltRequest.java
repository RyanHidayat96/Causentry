package com.bpjstku.data.mlt.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/bpjstku/data/mlt/model/request/MltRequest;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/mlt/model/request/MltRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik", "nama", "getNama", "email", "getEmail", "kodePointer", "getKodePointer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MltRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("kodePointer")
    private final String kodePointer;

    @SerializedName("nama")
    private final String nama;

    @SerializedName("nik")
    private final String nik;

    public MltRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.nik = str;
        this.nama = str2;
        this.email = str3;
        this.kodePointer = str4;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getNama() {
        return this.nama;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getKodePointer() {
        return this.kodePointer;
    }

    public static /* synthetic */ MltRequest copy$default(MltRequest mltRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mltRequest.nik;
        }
        if ((i & 2) != 0) {
            str2 = mltRequest.nama;
        }
        if ((i & 4) != 0) {
            str3 = mltRequest.email;
        }
        if ((i & 8) != 0) {
            str4 = mltRequest.kodePointer;
        }
        return mltRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNama() {
        return this.nama;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodePointer() {
        return this.kodePointer;
    }

    public final MltRequest copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new MltRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MltRequest)) {
            return false;
        }
        MltRequest mltRequest = (MltRequest) p0;
        return Intrinsics.areEqual(this.nik, mltRequest.nik) && Intrinsics.areEqual(this.nama, mltRequest.nama) && Intrinsics.areEqual(this.email, mltRequest.email) && Intrinsics.areEqual(this.kodePointer, mltRequest.kodePointer);
    }

    public final int hashCode() {
        return (((((this.nik.hashCode() * 31) + this.nama.hashCode()) * 31) + this.email.hashCode()) * 31) + this.kodePointer.hashCode();
    }

    public final String toString() {
        String str = this.nik;
        String str2 = this.nama;
        String str3 = this.email;
        String str4 = this.kodePointer;
        StringBuilder sb = new StringBuilder("MltRequest(nik=");
        sb.append(str);
        sb.append(", nama=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(", kodePointer=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
