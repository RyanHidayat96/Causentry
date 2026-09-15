package defpackage;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* JADX INFO: loaded from: classes6.dex */
final class addAllDeviceStateCallbacks {
    private static final int[][] b = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    final ErrorCorrectionLevel TuitionPaymentFragmentbindingInflater1;
    final byte TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    private addAllDeviceStateCallbacks(int i) {
        this.TuitionPaymentFragmentbindingInflater1 = ErrorCorrectionLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault3((i >> 3) & 3);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (byte) (i & 7);
    }

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    static addAllDeviceStateCallbacks b(int i, int i2) {
        addAllDeviceStateCallbacks addalldevicestatecallbacksTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2);
        return addalldevicestatecallbacksTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null ? addalldevicestatecallbacksTuitionPaymentFragmentspecialinlinedviewModeldefault1 : TuitionPaymentFragmentspecialinlinedviewModeldefault1(i ^ 21522, i2 ^ 21522);
    }

    private static addAllDeviceStateCallbacks TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) {
        int iBitCount;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : b) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new addAllDeviceStateCallbacks(iArr[1]);
            }
            int iBitCount2 = Integer.bitCount(i ^ i5);
            if (iBitCount2 < i3) {
                i4 = iArr[1];
                i3 = iBitCount2;
            }
            if (i != i2 && (iBitCount = Integer.bitCount(i5 ^ i2)) < i3) {
                i4 = iArr[1];
                i3 = iBitCount;
            }
        }
        if (i3 <= 3) {
            return new addAllDeviceStateCallbacks(i4);
        }
        return null;
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentbindingInflater1.ordinal() << 3) | this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof addAllDeviceStateCallbacks)) {
            return false;
        }
        addAllDeviceStateCallbacks addalldevicestatecallbacks = (addAllDeviceStateCallbacks) obj;
        return this.TuitionPaymentFragmentbindingInflater1 == addalldevicestatecallbacks.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == addalldevicestatecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
