package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes6.dex */
public final class hasUltraHdrImageCapture extends ResultReceiver {
    private static final byte[] TuitionPaymentFragmentbindingInflater1 = {81, 125, 2, 46, -11, 16, 4, -7, 10, 15, -8, 16, -1, -4, -3, -52, 67, 6, -67, 22, 53, -5, -8, 10, -5, 0, 17, -31, 35, 0, -7, 7, -5, -7, 23, -19, -49, 64, -9, 15, -5, -55, 39, 35, 0, -7, 7, -5, 15, -8, 16, -1, -4, -3, -52, 67, 6, -67, 28, 27, 15, -8, 10, -5, 15, -28, 22, 12, -11, -2, 5, 6, -10, 13};
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 85;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public HandlerThread b;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 114 - r6
            int r7 = r7 + 4
            byte[] r0 = defpackage.hasUltraHdrImageCapture.TuitionPaymentFragmentbindingInflater1
            int r5 = 70 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r7
            r3 = r2
            goto L28
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            java.lang.String r5 = r5.intern()
            r8[r2] = r5
            return
        L24:
            int r5 = r5 + 1
            r4 = r0[r5]
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-2)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hasUltraHdrImageCapture.a(short, int, int, java.lang.Object[]):void");
    }

    public hasUltraHdrImageCapture(Handler handler, HandlerThread handlerThread) {
        super(handler);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        this.b = handlerThread;
    }

    public final String TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) throws Throwable {
        byte[] bArr = TuitionPaymentFragmentbindingInflater1;
        Object[] objArr = new Object[1];
        a(bArr[16], bArr[25], bArr[2], objArr);
        try {
            Object[] objArr2 = {(String) objArr[0]};
            Object[] objArr3 = new Object[1];
            a((short) 62, bArr[26], bArr[73], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[3], (byte) (-bArr[4]), bArr[70], objArr4);
            String str = (String) objArr4[0];
            Object[] objArr5 = new Object[1];
            a((byte) (bArr[42] - 1), (byte) (-bArr[10]), bArr[67], objArr5);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (String) cls.getMethod(str, Class.forName((String) objArr5[0])).invoke(bundle, objArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        HandlerThread handlerThread = this.b;
        try {
            byte[] bArr = TuitionPaymentFragmentbindingInflater1;
            byte b = bArr[34];
            byte b2 = bArr[26];
            Object[] objArr = new Object[1];
            a(b, b2, (byte) (b2 + 3), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[25];
            Object[] objArr2 = new Object[1];
            a(b3, (byte) (-bArr[12]), b3, objArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
