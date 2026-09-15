package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class addAllCameraCaptureCallbacks {
    addAllCameraCaptureCallbacks() {
    }

    public static void TuitionPaymentFragmentbindingInflater1(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        StringBuilder sb = new StringBuilder("null value in entry: ");
        sb.append(obj);
        sb.append("=null");
        throw new NullPointerException(sb.toString());
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
