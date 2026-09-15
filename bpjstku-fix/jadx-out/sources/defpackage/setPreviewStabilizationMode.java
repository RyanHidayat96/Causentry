package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class setPreviewStabilizationMode {
    public static void b(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
