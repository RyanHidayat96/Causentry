package androidx.FastestIyy;

/* JADX INFO: loaded from: classes5.dex */
public abstract class K {
    public static int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 0) {
            return -1;
        }
        int[] iArr = new int[bArr2.length];
        int i = 0;
        for (int i2 = 1; i2 < bArr2.length; i2++) {
            while (i > 0 && bArr2[i] != bArr2[i2]) {
                i = iArr[i - 1];
            }
            if (bArr2[i] == bArr2[i2]) {
                i++;
            }
            iArr[i2] = i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            while (i3 > 0 && bArr2[i3] != bArr[i4]) {
                i3 = iArr[i3 - 1];
            }
            if (bArr2[i3] == bArr[i4]) {
                i3++;
            }
            if (i3 == bArr2.length) {
                return (i4 - bArr2.length) + 1;
            }
        }
        return -1;
    }
}
