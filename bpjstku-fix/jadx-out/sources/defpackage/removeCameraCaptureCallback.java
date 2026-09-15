package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class removeCameraCaptureCallback {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        if (i < 3) {
            addAllCameraCaptureCallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }
}
