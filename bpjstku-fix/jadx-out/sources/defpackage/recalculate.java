package defpackage;

import androidx.core.view.MotionEventCompat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class recalculate {
    private static final RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1 = new RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1();
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1234567890;

    public static final long TuitionPaymentFragmentbindingInflater1(long j) {
        return ((j & 65280) << 40) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((255 & j) << 56);
    }

    public static final short TuitionPaymentFragmentspecialinlinedviewModeldefault1(short s) {
        return (short) (((s & 65280) >>> 8) | ((s & 255) << 8));
    }

    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        return ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) << 8) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & 255) << 24);
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte b) {
        return StringsKt.concatToString(new char[]{canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[(b >> 4) & 15], canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[b & 15]});
    }

    public static final String b(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[(i >> 28) & 15], canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[(i >> 24) & 15], canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[(i >> 20) & 15], canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[(i >> 16) & 15], canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[(i >> 12) & 15], canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[(i >> 8) & 15], canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[(i >> 4) & 15], canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return StringsKt.concatToString(cArr, i2, 8);
    }

    public static final RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 b() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static final RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
        return tuitionPaymentFragmentbindingInflater1 == TuitionPaymentFragmentbindingInflater1 ? new RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1() : tuitionPaymentFragmentbindingInflater1;
    }

    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static final int b(ByteString byteString, int i) {
        Intrinsics.checkNotNullParameter(byteString, "");
        return i == TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3() : i;
    }

    public static final int b(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return i == TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? bArr.length : i;
    }
}
