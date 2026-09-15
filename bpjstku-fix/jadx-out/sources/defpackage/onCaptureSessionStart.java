package defpackage;

import androidx.collection.SieveCacheKt;

/* JADX INFO: loaded from: classes4.dex */
public final class onCaptureSessionStart {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(int[] iArr, int i, int i2) {
        int length = iArr.length;
        long j = 1;
        for (int i3 = 0; i3 < 3; i3++) {
            j = ((j * ((long) i)) + ((long) iArr[i3])) % SieveCacheKt.NodeLinkMask;
        }
        return (int) ((j + SieveCacheKt.NodeLinkMask) % SieveCacheKt.NodeLinkMask);
    }
}
