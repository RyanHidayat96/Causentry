package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class isImageFormatSupported {
    public final String TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final boolean b;

    public isImageFormatSupported(String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isImageFormatSupported)) {
            return false;
        }
        isImageFormatSupported isimageformatsupported = (isImageFormatSupported) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, isimageformatsupported.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, isimageformatsupported.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, isimageformatsupported.TuitionPaymentFragmentbindingInflater1) && this.b == isimageformatsupported.b;
    }

    public final int hashCode() {
        return (((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + Boolean.hashCode(this.b);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder("ThreadDump(name=");
        sb.append(str);
        sb.append(", state=");
        sb.append(str2);
        sb.append(", stack=");
        sb.append(str3);
        sb.append(", crashed=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
