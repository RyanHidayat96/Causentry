package defpackage;

import java.io.EOFException;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class closeSurface {
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bytes;
    }

    public static final byte[] b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback, int i, byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationSurfaceRequestCallback, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        int i4 = surfaceViewImplementationSurfaceRequestCallback.limit;
        byte[] bArr2 = surfaceViewImplementationSurfaceRequestCallback.data;
        while (i2 < i3) {
            if (i == i4) {
                surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                byte[] bArr3 = surfaceViewImplementationSurfaceRequestCallback.data;
                bArr2 = bArr3;
                i = surfaceViewImplementationSurfaceRequestCallback.pos;
                i4 = surfaceViewImplementationSurfaceRequestCallback.limit;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String b(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        if (j > 0) {
            long j2 = j - 1;
            if (rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2) == 13) {
                String strB = rotationProviderListenerWrapper.b(j2, Charsets.UTF_8);
                rotationProviderListenerWrapper.g(2L);
                return strB;
            }
        }
        String strB2 = rotationProviderListenerWrapper.b(j, Charsets.UTF_8);
        rotationProviderListenerWrapper.g(1L);
        return strB2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009d A[LOOP:0: B:8:0x0022->B:45:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x009c A[SYNTHETIC] */
    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(RotationProviderListenerWrapper rotationProviderListenerWrapper, lambdagetPreviewBitmap1 lambdagetpreviewbitmap1, boolean z) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        Intrinsics.checkNotNullParameter(lambdagetpreviewbitmap1, "");
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = rotationProviderListenerWrapper.head;
        int i4 = -1;
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = surfaceViewImplementationSurfaceRequestCallback.data;
        int i5 = surfaceViewImplementationSurfaceRequestCallback.pos;
        int i6 = surfaceViewImplementationSurfaceRequestCallback.limit;
        int[] iArr = lambdagetpreviewbitmap1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = surfaceViewImplementationSurfaceRequestCallback;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = iArr[i8];
            int i10 = i8 + 2;
            int i11 = iArr[i8 + 1];
            if (i11 != i4) {
                i7 = i11;
            }
            if (surfaceViewImplementationSurfaceRequestCallback2 == null) {
                break;
            }
            if (i9 >= 0) {
                int i12 = i5 + 1;
                byte b = bArr[i5];
                for (int i13 = i10; i13 != i10 + i9; i13++) {
                    if ((b & UByte.MAX_VALUE) == iArr[i13]) {
                        int i14 = iArr[i13 + i9];
                        if (i12 == i6) {
                            surfaceViewImplementationSurfaceRequestCallback2 = surfaceViewImplementationSurfaceRequestCallback2.next;
                            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
                            i12 = surfaceViewImplementationSurfaceRequestCallback2.pos;
                            bArr = surfaceViewImplementationSurfaceRequestCallback2.data;
                            i6 = surfaceViewImplementationSurfaceRequestCallback2.limit;
                            if (surfaceViewImplementationSurfaceRequestCallback2 == surfaceViewImplementationSurfaceRequestCallback) {
                                surfaceViewImplementationSurfaceRequestCallback2 = null;
                            }
                        }
                        i5 = i12;
                        i = i14;
                        if (i >= 0) {
                            return i;
                        }
                        i8 = -i;
                        i4 = -1;
                    }
                }
                return i7;
            }
            int i15 = i10;
            while (true) {
                int i16 = i5 + 1;
                int i17 = i15 + 1;
                if ((bArr[i5] & UByte.MAX_VALUE) == iArr[i15]) {
                    boolean z2 = i17 == (i9 * (-1)) + i10;
                    if (i16 == i6) {
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
                        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback3 = surfaceViewImplementationSurfaceRequestCallback2.next;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback3);
                        i3 = surfaceViewImplementationSurfaceRequestCallback3.pos;
                        byte[] bArr2 = surfaceViewImplementationSurfaceRequestCallback3.data;
                        i2 = surfaceViewImplementationSurfaceRequestCallback3.limit;
                        if (surfaceViewImplementationSurfaceRequestCallback3 != surfaceViewImplementationSurfaceRequestCallback) {
                            surfaceViewImplementationSurfaceRequestCallback2 = surfaceViewImplementationSurfaceRequestCallback3;
                            bArr = bArr2;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            surfaceViewImplementationSurfaceRequestCallback2 = null;
                        }
                    } else {
                        i2 = i6;
                        i3 = i16;
                    }
                    if (z2) {
                        i = iArr[i17];
                        i5 = i3;
                        i6 = i2;
                        break;
                    }
                    i5 = i3;
                    i6 = i2;
                    i15 = i17;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            i8 = -i;
            i4 = -1;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    public static final RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(RotationProviderListenerWrapper rotationProviderListenerWrapper, RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
        RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater1);
        if (tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = rotationProviderListenerWrapper;
        tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        return tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
