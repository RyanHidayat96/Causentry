package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ResultReceiver;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hasNonSdrConfig extends ResultReceiver {
    private static final byte[] TuitionPaymentFragmentbindingInflater1 = {31, 115, -100, -11, -11, 16, 4, -7, 10, 15, -8, 16, -1, -4, -3, -52, 67, 6, -67, 22, 53, -5, -8, 10, -5, 0, 17, -41, 39, 8, -7, 23, -19, -49, 64, -9, 15, -5, -55, 39, 35, 0, -7, 7, -5, -11, 16, 4, -7, 10, -66, 0, 17, -31, 20, 15, -7, -6, 13, -1, 19, -23, 3, 12, -5, 15, -8, 16, -1, -4, -3, -52, 67, 6, -67, 28, 27, 15, -8, 10, -5, 15, -28, 22, 12, -11, -2, 5, 6, -10, 13};
    private static final int b = 183;
    public List<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final HandlerThread TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = 88 - r6
            byte[] r0 = defpackage.hasNonSdrConfig.TuitionPaymentFragmentbindingInflater1
            int r7 = r7 + 97
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r7 = r8
            r4 = r2
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            java.lang.String r6 = r6.intern()
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-2)
            int r6 = r6 + 1
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hasNonSdrConfig.a(short, byte, byte, java.lang.Object[]):void");
    }

    public hasNonSdrConfig(Handler handler, HandlerThread handlerThread) {
        super(handler);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = handlerThread;
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final List<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) throws Throwable {
        byte[] bArr = TuitionPaymentFragmentbindingInflater1;
        Object[] objArr = new Object[1];
        a((short) 84, bArr[26], (byte) (-bArr[86]), objArr);
        try {
            Object[] objArr2 = {(String) objArr[0]};
            Object[] objArr3 = new Object[1];
            a((short) 79, bArr[25], bArr[58], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((byte) (bArr[34] - 1), bArr[17], (byte) (-bArr[86]), objArr4);
            String str = (String) objArr4[0];
            Object[] objArr5 = new Object[1];
            a((short) 58, (byte) (-bArr[35]), bArr[63], objArr5);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((Integer) cls.getMethod(str, Class.forName((String) objArr5[0])).invoke(bundle, objArr2)).intValue();
            Object[] objArr6 = new Object[1];
            a((short) 43, bArr[26], bArr[62], objArr6);
            Object[] objArr7 = {(String) objArr6[0]};
            Object[] objArr8 = new Object[1];
            a((short) 79, bArr[25], bArr[58], objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((byte) (b & 109), bArr[17], (byte) (-bArr[3]), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a((short) 58, (byte) (-bArr[35]), bArr[63], objArr10);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (List) cls2.getMethod(str2, Class.forName((String) objArr10[0])).invoke(bundle, objArr7);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
        HandlerThread handlerThread = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        try {
            byte[] bArr = TuitionPaymentFragmentbindingInflater1;
            Object[] objArr = new Object[1];
            a(bArr[31], bArr[25], bArr[54], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[25];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[5], b2, objArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
