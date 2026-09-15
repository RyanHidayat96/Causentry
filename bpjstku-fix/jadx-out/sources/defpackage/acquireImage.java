package defpackage;

import com.datadog.android.api.context.DeviceType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class acquireImage {
    public final String TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251a;
    public final DeviceType asInterface;
    public final String b;
    public final String d;
    public final String g;

    public acquireImage(String str, String str2, String str3, DeviceType deviceType, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(deviceType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
        this.asInterface = deviceType;
        this.b = str4;
        this.f251a = str5;
        this.g = str6;
        this.d = str7;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acquireImage)) {
            return false;
        }
        acquireImage acquireimage = (acquireImage) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, acquireimage.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, acquireimage.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, acquireimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.asInterface == acquireimage.asInterface && Intrinsics.areEqual(this.b, acquireimage.b) && Intrinsics.areEqual(this.f251a, acquireimage.f251a) && Intrinsics.areEqual(this.g, acquireimage.g) && Intrinsics.areEqual(this.d, acquireimage.d) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, acquireimage.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        return (((((((((((((((this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.b.hashCode()) * 31) + this.f251a.hashCode()) * 31) + this.g.hashCode()) * 31) + this.d.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        DeviceType deviceType = this.asInterface;
        String str4 = this.b;
        String str5 = this.f251a;
        String str6 = this.g;
        String str7 = this.d;
        String str8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("DeviceInfo(deviceName=");
        sb.append(str);
        sb.append(", deviceBrand=");
        sb.append(str2);
        sb.append(", deviceModel=");
        sb.append(str3);
        sb.append(", deviceType=");
        sb.append(deviceType);
        sb.append(", deviceBuildId=");
        sb.append(str4);
        sb.append(", osName=");
        sb.append(str5);
        sb.append(", osMajorVersion=");
        sb.append(str6);
        sb.append(", osVersion=");
        sb.append(str7);
        sb.append(", architecture=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }
}
