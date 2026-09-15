package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera2CameraControlExternalSyntheticLambda4 {
    public final String TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final String b;
    public final String g;

    public Camera2CameraControlExternalSyntheticLambda4(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.b = str3;
        this.g = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str6;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return !Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, "0.0") && !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "0.0") && this.TuitionPaymentFragmentbindingInflater1.length() > 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Camera2CameraControlExternalSyntheticLambda4)) {
            return false;
        }
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4 = (Camera2CameraControlExternalSyntheticLambda4) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, camera2CameraControlExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, camera2CameraControlExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, camera2CameraControlExternalSyntheticLambda4.b) && Intrinsics.areEqual(this.g, camera2CameraControlExternalSyntheticLambda4.g) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, camera2CameraControlExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, camera2CameraControlExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        return (((((((((this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.b.hashCode()) * 31) + this.g.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = this.b;
        String str4 = this.g;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("CachedLocation(latitude=");
        sb.append(str);
        sb.append(", longitude=");
        sb.append(str2);
        sb.append(", city=");
        sb.append(str3);
        sb.append(", province=");
        sb.append(str4);
        sb.append(", country=");
        sb.append(str5);
        sb.append(", fullAddress=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
