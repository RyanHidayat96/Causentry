package com.bpjstku.data.registration.bpu.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u000fR\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u000fR\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u000fR\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000fR\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/registration/bpu/model/request/InsertJmoPairRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/bpu/model/request/InsertJmoPairRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeIuran", "Ljava/lang/String;", "getKodeIuran", "nikBayar", "getNikBayar", "emailJmo", "getEmailJmo", "nikJmo", "getNikJmo", "paymentMethod", "getPaymentMethod", "paymentGateway", "getPaymentGateway", "jmlBln", "getJmlBln", "kodePaket", "getKodePaket", "user", "getUser"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InsertJmoPairRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("emailJmo")
    private final String emailJmo;

    @SerializedName("jmlBln")
    private final String jmlBln;

    @SerializedName("kodeIuran")
    private final String kodeIuran;

    @SerializedName("kodePaket")
    private final String kodePaket;

    @SerializedName("nikBayar")
    private final String nikBayar;

    @SerializedName("nikJmo")
    private final String nikJmo;

    @SerializedName("paymentGateway")
    private final String paymentGateway;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @SerializedName("user")
    private final String user;

    public final String getKodeIuran() {
        return this.kodeIuran;
    }

    public final String getNikBayar() {
        return this.nikBayar;
    }

    public final String getEmailJmo() {
        return this.emailJmo;
    }

    public final String getNikJmo() {
        return this.nikJmo;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentGateway() {
        return this.paymentGateway;
    }

    public final String getJmlBln() {
        return this.jmlBln;
    }

    public final String getKodePaket() {
        return this.kodePaket;
    }

    public final String getUser() {
        return this.user;
    }

    public InsertJmoPairRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.kodeIuran = str;
        this.nikBayar = str2;
        this.emailJmo = str3;
        this.nikJmo = str4;
        this.paymentMethod = str5;
        this.paymentGateway = str6;
        this.jmlBln = str7;
        this.kodePaket = str8;
        this.user = str9;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeIuran() {
        return this.kodeIuran;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNikBayar() {
        return this.nikBayar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmailJmo() {
        return this.emailJmo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNikJmo() {
        return this.nikJmo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPaymentGateway() {
        return this.paymentGateway;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getJmlBln() {
        return this.jmlBln;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKodePaket() {
        return this.kodePaket;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    public final InsertJmoPairRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        return new InsertJmoPairRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof InsertJmoPairRequest)) {
            return false;
        }
        InsertJmoPairRequest insertJmoPairRequest = (InsertJmoPairRequest) p0;
        return Intrinsics.areEqual(this.kodeIuran, insertJmoPairRequest.kodeIuran) && Intrinsics.areEqual(this.nikBayar, insertJmoPairRequest.nikBayar) && Intrinsics.areEqual(this.emailJmo, insertJmoPairRequest.emailJmo) && Intrinsics.areEqual(this.nikJmo, insertJmoPairRequest.nikJmo) && Intrinsics.areEqual(this.paymentMethod, insertJmoPairRequest.paymentMethod) && Intrinsics.areEqual(this.paymentGateway, insertJmoPairRequest.paymentGateway) && Intrinsics.areEqual(this.jmlBln, insertJmoPairRequest.jmlBln) && Intrinsics.areEqual(this.kodePaket, insertJmoPairRequest.kodePaket) && Intrinsics.areEqual(this.user, insertJmoPairRequest.user);
    }

    public final int hashCode() {
        return (((((((((((((((this.kodeIuran.hashCode() * 31) + this.nikBayar.hashCode()) * 31) + this.emailJmo.hashCode()) * 31) + this.nikJmo.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31) + this.paymentGateway.hashCode()) * 31) + this.jmlBln.hashCode()) * 31) + this.kodePaket.hashCode()) * 31) + this.user.hashCode();
    }

    public final String toString() {
        String str = this.kodeIuran;
        String str2 = this.nikBayar;
        String str3 = this.emailJmo;
        String str4 = this.nikJmo;
        String str5 = this.paymentMethod;
        String str6 = this.paymentGateway;
        String str7 = this.jmlBln;
        String str8 = this.kodePaket;
        String str9 = this.user;
        StringBuilder sb = new StringBuilder("InsertJmoPairRequest(kodeIuran=");
        sb.append(str);
        sb.append(", nikBayar=");
        sb.append(str2);
        sb.append(", emailJmo=");
        sb.append(str3);
        sb.append(", nikJmo=");
        sb.append(str4);
        sb.append(", paymentMethod=");
        sb.append(str5);
        sb.append(", paymentGateway=");
        sb.append(str6);
        sb.append(", jmlBln=");
        sb.append(str7);
        sb.append(", kodePaket=");
        sb.append(str8);
        sb.append(", user=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }
}
