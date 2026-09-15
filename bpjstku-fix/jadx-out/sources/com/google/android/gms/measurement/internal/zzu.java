package com.google.android.gms.measurement.internal;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.setRelative;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzu implements Runnable {
    private static int $10 = 0;
    private static int $11 = 1;
    private final /* synthetic */ zzic zza;
    private static final byte[] $$d = {106, -93, -11, -74, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 253;
    private static final byte[] $$a = {14, 116, 92, -78, 2, -10, 10};
    private static final int $$b = 47;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long b = -1241631750295528533L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 111
            byte[] r0 = com.google.android.gms.measurement.internal.zzu.$$a
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r1 = 4 - r6
            byte[] r1 = new byte[r1]
            int r6 = 3 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r5
            r5 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r7]
            int r3 = r3 + 1
        L2b:
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            int r7 = r7 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzu.a(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.measurement.internal.zzu.$$d
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r5 = 103 - r5
            int r7 = r7 * 52
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzu.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r1.zzj().zzv();
        r1 = r1.zzj();
        java.util.Objects.requireNonNull(r1);
        new java.lang.Thread(new com.google.android.gms.measurement.internal.zzv(r1)).start();
        r1 = com.google.android.gms.measurement.internal.zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        com.google.android.gms.measurement.internal.zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1.zzk().zzS() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r1.zzk().zzS() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1.zzaV().zze().zza("registerTrigger called but app not eligible");
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void run() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 1
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1f
            com.google.android.gms.measurement.internal.zzic r1 = r4.zza
            com.google.android.gms.measurement.internal.zzpp r2 = r1.zzk()
            boolean r2 = r2.zzS()
            r3 = 94
            int r3 = r3 / 0
            if (r2 != 0) goto L39
            goto L2b
        L1f:
            com.google.android.gms.measurement.internal.zzic r1 = r4.zza
            com.google.android.gms.measurement.internal.zzpp r2 = r1.zzk()
            boolean r2 = r2.zzS()
            if (r2 != 0) goto L39
        L2b:
            com.google.android.gms.measurement.internal.zzgu r0 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zze()
            java.lang.String r1 = "registerTrigger called but app not eligible"
            r0.zza(r1)
            return
        L39:
            com.google.android.gms.measurement.internal.zzlj r2 = r1.zzj()
            r2.zzv()
            com.google.android.gms.measurement.internal.zzlj r1 = r1.zzj()
            java.util.Objects.requireNonNull(r1)
            java.lang.Thread r2 = new java.lang.Thread
            com.google.android.gms.measurement.internal.zzv r3 = new com.google.android.gms.measurement.internal.zzv
            r3.<init>()
            r2.<init>(r3)
            r2.start()
            int r1 = com.google.android.gms.measurement.internal.zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L60
            return
        L60:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzu.run():void");
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 15;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "") + 19472), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2624, 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b - 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 39423), 481 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - ExpandableListView.getPackedPositionType(0L)), 2624 - Drawable.resolveOpacity(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (b ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - View.resolveSizeAndState(0, 0, 0)), TextUtils.lastIndexOf("", '0') + 482, MotionEvent.axisFromString("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39422), 480 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            int i6 = $11 + 103;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x06d3 A[Catch: all -> 0x0897, TryCatch #0 {all -> 0x0897, blocks: (B:97:0x066d, B:99:0x067a, B:100:0x06b5, B:102:0x06d3, B:104:0x071c, B:81:0x058a, B:83:0x05a1, B:84:0x05eb), top: B:136:0x058a }] */
    /* JADX WARN: Code duplicated, block: B:103:0x071b  */
    /* JADX WARN: Code duplicated, block: B:107:0x077a  */
    /* JADX WARN: Code duplicated, block: B:108:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:111:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:112:0x0802  */
    /* JADX WARN: Code duplicated, block: B:115:0x0836  */
    /* JADX WARN: Code duplicated, block: B:116:0x0847  */
    /* JADX WARN: Code duplicated, block: B:118:0x0854  */
    /* JADX WARN: Code duplicated, block: B:119:0x0865  */
    /* JADX WARN: Code duplicated, block: B:123:0x086a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0876  */
    /* JADX WARN: Code duplicated, block: B:127:0x0886  */
    /* JADX WARN: Code duplicated, block: B:128:0x088d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x04ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:17:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:21:0x012d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0143  */
    /* JADX WARN: Code duplicated, block: B:27:0x017f  */
    /* JADX WARN: Code duplicated, block: B:30:0x01ab A[Catch: all -> 0x061f, TRY_LEAVE, TryCatch #1 {all -> 0x061f, blocks: (B:18:0x010b, B:22:0x0141, B:28:0x0196, B:29:0x01a7, B:33:0x01e7, B:36:0x020f, B:38:0x0250, B:40:0x0282, B:43:0x029a, B:45:0x02eb, B:47:0x0308, B:50:0x031d, B:56:0x0377, B:65:0x03bd, B:67:0x0489, B:61:0x03a3, B:37:0x022e, B:30:0x01ab), top: B:138:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x020f A[Catch: all -> 0x061f, TRY_ENTER, TryCatch #1 {all -> 0x061f, blocks: (B:18:0x010b, B:22:0x0141, B:28:0x0196, B:29:0x01a7, B:33:0x01e7, B:36:0x020f, B:38:0x0250, B:40:0x0282, B:43:0x029a, B:45:0x02eb, B:47:0x0308, B:50:0x031d, B:56:0x0377, B:65:0x03bd, B:67:0x0489, B:61:0x03a3, B:37:0x022e, B:30:0x01ab), top: B:138:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x022e A[Catch: all -> 0x061f, TryCatch #1 {all -> 0x061f, blocks: (B:18:0x010b, B:22:0x0141, B:28:0x0196, B:29:0x01a7, B:33:0x01e7, B:36:0x020f, B:38:0x0250, B:40:0x0282, B:43:0x029a, B:45:0x02eb, B:47:0x0308, B:50:0x031d, B:56:0x0377, B:65:0x03bd, B:67:0x0489, B:61:0x03a3, B:37:0x022e, B:30:0x01ab), top: B:138:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0296  */
    /* JADX WARN: Code duplicated, block: B:50:0x031d A[Catch: all -> 0x061f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x061f, blocks: (B:18:0x010b, B:22:0x0141, B:28:0x0196, B:29:0x01a7, B:33:0x01e7, B:36:0x020f, B:38:0x0250, B:40:0x0282, B:43:0x029a, B:45:0x02eb, B:47:0x0308, B:50:0x031d, B:56:0x0377, B:65:0x03bd, B:67:0x0489, B:61:0x03a3, B:37:0x022e, B:30:0x01ab), top: B:138:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x032f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0371  */
    /* JADX WARN: Code duplicated, block: B:59:0x0392  */
    /* JADX WARN: Code duplicated, block: B:60:0x0395  */
    /* JADX WARN: Code duplicated, block: B:70:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x054a  */
    /* JADX WARN: Code duplicated, block: B:83:0x05a1 A[Catch: all -> 0x0897, TryCatch #0 {all -> 0x0897, blocks: (B:97:0x066d, B:99:0x067a, B:100:0x06b5, B:102:0x06d3, B:104:0x071c, B:81:0x058a, B:83:0x05a1, B:84:0x05eb), top: B:136:0x058a }] */
    /* JADX WARN: Code duplicated, block: B:95:0x062f  */
    /* JADX WARN: Code duplicated, block: B:99:0x067a A[Catch: all -> 0x0897, TryCatch #0 {all -> 0x0897, blocks: (B:97:0x066d, B:99:0x067a, B:100:0x06b5, B:102:0x06d3, B:104:0x071c, B:81:0x058a, B:83:0x05a1, B:84:0x05eb), top: B:136:0x058a }] */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) throws Throwable {
        Method[] declaredMethods;
        int length;
        int i;
        Method method;
        char[] cArr;
        int i2;
        int iB;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Class<?> cls;
        char[] cArr2;
        Integer num;
        int i8;
        Object[] objArr;
        char[] cArr3;
        int i9;
        Class<?> cls2;
        String str;
        Class<?>[] clsArr;
        Class cls3;
        Class<?> cls4;
        char[] cArr4;
        int offsetBefore;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i17;
        Object[] objArr5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        int i18;
        long j;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        String string;
        int i28;
        Method method2;
        int i29 = 2 % 2;
        int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
        int i31 = i30 % 2;
        int i32 = 1;
        Method[] methodArr = new Method[1];
        int i33 = 0;
        byte b2 = (byte) 0;
        byte b3 = b2;
        Object[] objArr6 = new Object[1];
        a(b2, b3, b3, objArr6);
        String str2 = (String) objArr6[0];
        Class[] clsArr2 = new Class[1];
        int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i35 = (i34 & 97) + (i34 | 97);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i35 % 128;
        char c = '0';
        int i36 = -2001519171;
        Class<?>[] clsArr3 = null;
        if (i35 % 2 != 0) {
            clsArr2[0] = String.class;
            methodArr[0] = AssetManager.class.getMethod(str2, clsArr2);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int trimmedLength = TextUtils.getTrimmedLength("") + 2823;
                int size = View.MeasureSpec.getSize(0) + 22;
                byte[] bArr = $$d;
                byte b4 = bArr[10];
                byte b5 = bArr[7];
                Object[] objArr7 = new Object[1];
                c(b4, b5, b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSize, trimmedLength, size, 1814927978, false, (String) objArr7[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null) == null) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2822, View.resolveSize(0, 0) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
                i = 0;
                while (true) {
                    if (i < length) {
                        int i37 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                        int i38 = i37 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38;
                        int i39 = i37 % 2;
                        method = declaredMethods[i];
                        int i40 = ((i38 | 65) << i32) - (i38 ^ 65);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i40 % 128;
                        int i41 = i40 % 2;
                        cArr = new char[]{29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211};
                        i2 = -TextUtils.indexOf("", c, i33, i33);
                        iB = setRelative.b();
                        int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i3 = ((i42 | 41) << 1) - (i42 ^ 41);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                        if (i3 % 2 != 0) {
                            i4 = ((-109) >> i2) * 111;
                            int i43 = ~i2;
                            int i44 = ~((iB ^ 58920) | (iB & 58920));
                            i5 = (-220) / ((i43 ^ i44) | (i43 & i44));
                        } else {
                            int i45 = i2 * (-109);
                            i4 = ((i45 | 6540120) << i32) - (i45 ^ 6540120);
                            int i46 = ~i2;
                            int i47 = ~((iB ^ 58920) | (iB & 58920));
                            i5 = ((i46 ^ i47) | (i46 & i47)) * (-220);
                        }
                        int i48 = ((i4 | i5) << i32) - (i4 ^ i5);
                        int i49 = ~(i2 | 58920);
                        int i50 = ~((58920 ^ iB) | (58920 & iB));
                        i6 = i48 + (((i49 ^ i50) | (i49 & i50)) * 220);
                        i7 = i42 + 93;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i51 = ~i2;
                            int i52 = ~((i51 ^ 58920) | (i51 & 58920));
                            int i53 = ~(((-58921) ^ i2) | ((-58921) & i2));
                            int i54 = i6 * (110 >>> ((i52 & i53) | (i52 ^ i53)));
                            Object[] objArr8 = new Object[i32];
                            d(cArr, i54, objArr8);
                            cls = Class.forName((String) objArr8[i33]);
                            cArr2 = new char[12];
                        } else {
                            int i55 = ~i2;
                            int i56 = ~((i55 ^ 58920) | (i55 & 58920));
                            int i57 = ~(((-58921) ^ i2) | ((-58921) & i2));
                            int i58 = -(-(((i56 & i57) | (i56 ^ i57)) * 110));
                            int i59 = (i6 ^ i58) + ((i6 & i58) << i32);
                            Object[] objArr9 = new Object[i32];
                            d(cArr, i59, objArr9);
                            cls = Class.forName((String) objArr9[i33]);
                            cArr2 = new char[12];
                        }
                        // fill-array-data instruction
                        cArr2[0] = 29399;
                        cArr2[1] = 34268;
                        cArr2[2] = 40150;
                        cArr2[3] = 38886;
                        cArr2[4] = 44795;
                        cArr2[5] = 41465;
                        cArr2[6] = 47343;
                        cArr2[7] = 46057;
                        cArr2[8] = 51857;
                        cArr2[9] = 56708;
                        cArr2[10] = 54424;
                        cArr2[11] = 61344;
                        int i60 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i61 = ((i60 | 69) << i32) - (i60 ^ 69);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i61 % 128;
                        int i62 = i61 % 2;
                        Object[] objArr10 = new Object[i32];
                        d(cArr2, (TypedValue.complexToFraction(i33, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i33, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63241, objArr10);
                        num = (Integer) cls.getMethod((String) objArr10[i33], clsArr3).invoke(method, clsArr3);
                        i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                        if (i8 % 2 == 0) {
                            objArr = new Object[i32];
                            objArr[i33] = Integer.valueOf(num.intValue());
                            cArr3 = new char[]{29402, 40794, 43472, 47728, 50354, 53611, 58259, 3091, 7823, 11133, 13740, 17964, 20562, 25299, 36687, 39414, 43636, 46245, 49467, 54158, 64520, 3774, 6948, 9636, 14301, 16465};
                            i9 = 60811 >>> (TypedValue.complexToFloat(i32) > 0.0f ? 1 : (TypedValue.complexToFloat(i32) == 0.0f ? 0 : -1));
                        } else {
                            objArr = new Object[i32];
                            objArr[i33] = Integer.valueOf(num.intValue());
                            cArr3 = new char[]{29402, 40794, 43472, 47728, 50354, 53611, 58259, 3091, 7823, 11133, 13740, 17964, 20562, 25299, 36687, 39414, 43636, 46245, 49467, 54158, 64520, 3774, 6948, 9636, 14301, 16465};
                            int i63 = -(TypedValue.complexToFloat(i33) > 0.0f ? 1 : (TypedValue.complexToFloat(i33) == 0.0f ? 0 : -1));
                            i9 = ((i63 & 60811) << i32) + (i63 ^ 60811);
                        }
                        Object[] objArr11 = new Object[i32];
                        d(cArr3, i9, objArr11);
                        cls2 = Class.forName((String) objArr11[i33]);
                        Object[] objArr12 = new Object[i32];
                        d(new char[]{29401, 30940, 26304, 27788, 23224, 16450, 20092, 13324}, 2591 - TextUtils.getCapsMode("", i33, i33), objArr12);
                        str = (String) objArr12[i33];
                        clsArr = new Class[i32];
                        int i64 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i65 = (i64 & 33) + (i64 | 33);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i65 % 128;
                        int i66 = i65 % 2;
                        clsArr[i33] = Integer.TYPE;
                        if (((Boolean) cls2.getMethod(str, clsArr).invoke(clsArr3, objArr)).booleanValue()) {
                            cls3 = Long.TYPE;
                            char[] cArr5 = {29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211};
                            int i67 = -Color.alpha(i33);
                            int iB2 = setRelative.b();
                            int i68 = i67 * 866;
                            int i69 = (i68 & (-50907744)) + (i68 | (-50907744));
                            int i70 = ~i67;
                            int i71 = ~iB2;
                            int i72 = ~(i70 | i71);
                            int i73 = i69 + ((((-58922) ^ i72) | ((-58922) & i72)) * (-865));
                            int i74 = -(-((~(i67 | iB2)) * 865));
                            int i75 = (i73 & i74) + (i73 | i74);
                            int i76 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i76 % 128;
                            int i77 = i76 % 2;
                            int i78 = ~iB2;
                            int i79 = i75 + (865 * ((~((i67 & i71) | (i71 ^ i67))) | (~(((-58922) & i78) | ((-58922) ^ i78)))));
                            Object[] objArr13 = new Object[i32];
                            d(cArr5, i79, objArr13);
                            cls4 = Class.forName((String) objArr13[i33]);
                            cArr4 = new char[]{29399, 29618, 28682, 30423, 30537, 30151, 31407, 31507, 31206, 32379, 31951, 32173, 25089};
                            int i80 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i80 % 128;
                            int i81 = i80 % 2;
                            offsetBefore = TextUtils.getOffsetBefore("", i33);
                            int iB3 = setRelative.b();
                            i10 = offsetBefore * 367;
                            int i82 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i11 = i82 + 41;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i83 = i10 / 8;
                                int i84 = -(-(((offsetBefore ^ 359) | (offsetBefore & 359)) * (-366)));
                                i12 = (i83 ^ i84) + ((i84 & i83) << 1);
                            } else {
                                i12 = (((i10 & 131753) + (131753 | i10)) - (~(((offsetBefore ^ 359) | (offsetBefore & 359)) * (-366)))) - 1;
                            }
                            int i85 = ~(((-360) & iB3) | ((-360) ^ iB3));
                            i13 = i12 + ((-366) * ((i85 & offsetBefore) | (offsetBefore ^ i85)));
                            int i86 = ~offsetBefore;
                            i14 = ~((i86 & 359) | (i86 ^ 359));
                            int i87 = ((-360) ^ offsetBefore) | (offsetBefore & (-360));
                            int i88 = (i87 & iB3) | (i87 ^ iB3);
                            int i89 = (i82 ^ 87) + ((i82 & 87) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i89 % 128;
                            i15 = i89 % 2;
                            i16 = ~i88;
                            if (i15 != 0) {
                                int i90 = i14 ^ i16;
                                objArr5 = new Object[1];
                                d(cArr4, i13 % (((i14 & i16) | i90) * 366), objArr5);
                                if (cls3.equals(cls4.getMethod((String) objArr5[0], null).invoke(method, null))) {
                                    int i91 = -TextUtils.lastIndexOf("", '0');
                                    int iB4 = setRelative.b();
                                    int i92 = ~(((-58921) & i91) | ((-58921) ^ i91));
                                    int i93 = ~iB4;
                                    int i94 = ~((i93 & 58920) | (i93 ^ 58920));
                                    int i95 = (i91 * (-1939)) + 57211320 + (((i92 & i94) | (i92 ^ i94)) * (-970));
                                    int i96 = ~i91;
                                    int i97 = i95 + ((~((i96 & 58920) | (i96 ^ 58920))) * 1940);
                                    int i98 = ~i91;
                                    int i99 = ~((i98 & (-58921)) | (i98 ^ (-58921)));
                                    int i100 = ~iB4;
                                    int i101 = -(-((i99 | (~((i100 & 58920) | (i100 ^ 58920)))) * 970));
                                    int i102 = (i97 ^ i101) + ((i101 & i97) << 1);
                                    Object[] objArr14 = new Object[1];
                                    d(new char[]{29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211}, i102, objArr14);
                                    Class<?> cls5 = Class.forName((String) objArr14[0]);
                                    char[] cArr6 = {29399, 17698, 7466, 54533, 44301, 25873, 15643, 62748, 52589, 34155, 23923, 5471, 60784, 42306, 32066, 13740, 3507};
                                    int i103 = -View.combineMeasuredStates(0, 0);
                                    int iB5 = setRelative.b();
                                    int i104 = i103 * 450;
                                    int i105 = ((i104 | (-6418496)) << 1) - (i104 ^ (-6418496));
                                    int i106 = ~i103;
                                    int i107 = ((~((i106 ^ 14327) | (i106 & 14327))) | (~((-14328) | i103 | iB5))) * 449;
                                    int i108 = (i105 ^ i107) + ((i107 & i105) << 1);
                                    int i109 = ~i103;
                                    int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i111 = ((i110 | 41) << 1) - (i110 ^ 41);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i111 % 128;
                                    int i112 = i111 % 2;
                                    int i113 = (i108 - (~(-(-((-1347) * (~((i109 & 14327) | (i109 ^ 14327)))))))) - 1;
                                    int i114 = ~((i106 & 14327) | (i106 ^ 14327));
                                    int i115 = ~iB5;
                                    int i116 = (i115 & (-14328)) | ((-14328) ^ i115);
                                    int i117 = ~((i103 & i116) | (i116 ^ i103));
                                    Object[] objArr15 = new Object[1];
                                    d(cArr6, (i113 - (~(-(-(((i117 & i114) | (i114 ^ i117)) * 449))))) - 1, objArr15);
                                    objArr3 = (Object[]) cls5.getMethod((String) objArr15[0], null).invoke(method, null);
                                    if (objArr3.length == 2) {
                                        int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i119 = (i118 & 49) + (i118 | 49);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i119 % 128;
                                        int i120 = i119 % 2;
                                        if (Long.TYPE.equals(objArr3[0])) {
                                            int i121 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i122 = (i121 & 37) + (i121 | 37);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i122 % 128;
                                            int i123 = i122 % 2;
                                            objArr4 = new Object[1];
                                            d(new char[]{29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211}, 58921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                                            if (Class.forName((String) objArr4[0]).equals(objArr3[1])) {
                                                int i124 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i124 % 128;
                                                int i125 = i124 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int iResolveSize = 2823 - View.resolveSize(0, 0);
                                                    int mode = 22 - View.MeasureSpec.getMode(0);
                                                    byte[] bArr2 = $$d;
                                                    byte b6 = bArr2[10];
                                                    byte b7 = bArr2[7];
                                                    Object[] objArr16 = new Object[1];
                                                    c(b6, b7, b7, objArr16);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iResolveSize, mode, 1814927978, false, (String) objArr16[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                                    int bitsPerPixel = 2822 - ImageFormat.getBitsPerPixel(0);
                                                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                                                    byte[] bArr3 = $$d;
                                                    byte b8 = bArr3[10];
                                                    byte b9 = bArr3[7];
                                                    Object[] objArr17 = new Object[1];
                                                    c(b8, b9, b9, objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, bitsPerPixel, minimumFlingVelocity, 1814927978, false, (String) objArr17[0], null);
                                                }
                                                Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                    int i126 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int iIndexOf = TextUtils.indexOf("", "", 0) + 22;
                                                    byte[] bArr4 = $$d;
                                                    byte b10 = bArr4[7];
                                                    byte b11 = bArr4[5];
                                                    Object[] objArr19 = new Object[1];
                                                    c(b10, b11, b11, objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i126, iIndexOf, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr18)).longValue();
                                                int i127 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i128 = (i127 ^ 27) + ((i127 & 27) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i128 % 128;
                                                int i129 = i128 % 2;
                                                i17 = -2001519171;
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                int i130 = -(-(((i14 & i16) | (i14 ^ i16)) * 366));
                                int i131 = (i13 ^ i130) + ((i130 & i13) << 1);
                                objArr2 = new Object[1];
                                d(cArr4, i131, objArr2);
                                if (cls3.equals(cls4.getMethod((String) objArr2[0], null).invoke(method, null))) {
                                    int i910 = -TextUtils.lastIndexOf("", '0');
                                    int iB6 = setRelative.b();
                                    int i911 = ~(((-58921) & i910) | ((-58921) ^ i910));
                                    int i912 = ~iB6;
                                    int i913 = ~((i912 & 58920) | (i912 ^ 58920));
                                    int i914 = (i910 * (-1939)) + 57211320 + (((i911 & i913) | (i911 ^ i913)) * (-970));
                                    int i915 = ~i910;
                                    int i916 = i914 + ((~((i915 & 58920) | (i915 ^ 58920))) * 1940);
                                    int i917 = ~i910;
                                    int i918 = ~((i917 & (-58921)) | (i917 ^ (-58921)));
                                    int i1010 = ~iB6;
                                    int i1011 = -(-((i918 | (~((i1010 & 58920) | (i1010 ^ 58920)))) * 970));
                                    int i1012 = (i916 ^ i1011) + ((i1011 & i916) << 1);
                                    Object[] objArr110 = new Object[1];
                                    d(new char[]{29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211}, i1012, objArr110);
                                    Class<?> cls6 = Class.forName((String) objArr110[0]);
                                    char[] cArr7 = {29399, 17698, 7466, 54533, 44301, 25873, 15643, 62748, 52589, 34155, 23923, 5471, 60784, 42306, 32066, 13740, 3507};
                                    int i1013 = -View.combineMeasuredStates(0, 0);
                                    int iB7 = setRelative.b();
                                    int i1014 = i1013 * 450;
                                    int i1015 = ((i1014 | (-6418496)) << 1) - (i1014 ^ (-6418496));
                                    int i1016 = ~i1013;
                                    int i1017 = ((~((i1016 ^ 14327) | (i1016 & 14327))) | (~((-14328) | i1013 | iB7))) * 449;
                                    int i1018 = (i1015 ^ i1017) + ((i1017 & i1015) << 1);
                                    int i1019 = ~i1013;
                                    int i1110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i1111 = ((i1110 | 41) << 1) - (i1110 ^ 41);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1111 % 128;
                                    int i1112 = i1111 % 2;
                                    int i1113 = (i1018 - (~(-(-((-1347) * (~((i1019 & 14327) | (i1019 ^ 14327)))))))) - 1;
                                    int i1114 = ~((i1016 & 14327) | (i1016 ^ 14327));
                                    int i1115 = ~iB7;
                                    int i1116 = (i1115 & (-14328)) | ((-14328) ^ i1115);
                                    int i1117 = ~((i1013 & i1116) | (i1116 ^ i1013));
                                    Object[] objArr111 = new Object[1];
                                    d(cArr7, (i1113 - (~(-(-(((i1117 & i1114) | (i1114 ^ i1117)) * 449))))) - 1, objArr111);
                                    objArr3 = (Object[]) cls6.getMethod((String) objArr111[0], null).invoke(method, null);
                                    if (objArr3.length == 2) {
                                        int i1118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i1119 = (i1118 & 49) + (i1118 | 49);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1119 % 128;
                                        int i1210 = i1119 % 2;
                                        if (Long.TYPE.equals(objArr3[0])) {
                                            int i1211 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i1212 = (i1211 & 37) + (i1211 | 37);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1212 % 128;
                                            int i1213 = i1212 % 2;
                                            objArr4 = new Object[1];
                                            d(new char[]{29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211}, 58921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                                            if (Class.forName((String) objArr4[0]).equals(objArr3[1])) {
                                                int i1214 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1214 % 128;
                                                int i1215 = i1214 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int iResolveSize2 = 2823 - View.resolveSize(0, 0);
                                                    int mode2 = 22 - View.MeasureSpec.getMode(0);
                                                    byte[] bArr5 = $$d;
                                                    byte b12 = bArr5[10];
                                                    byte b13 = bArr5[7];
                                                    Object[] objArr112 = new Object[1];
                                                    c(b12, b13, b13, objArr112);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay2, iResolveSize2, mode2, 1814927978, false, (String) objArr112[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                                    int bitsPerPixel2 = 2822 - ImageFormat.getBitsPerPixel(0);
                                                    int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                                                    byte[] bArr6 = $$d;
                                                    byte b14 = bArr6[10];
                                                    byte b15 = bArr6[7];
                                                    Object[] objArr113 = new Object[1];
                                                    c(b14, b15, b15, objArr113);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, bitsPerPixel2, minimumFlingVelocity2, 1814927978, false, (String) objArr113[0], null);
                                                }
                                                Object[] objArr114 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                    int i1216 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int iIndexOf2 = TextUtils.indexOf("", "", 0) + 22;
                                                    byte[] bArr7 = $$d;
                                                    byte b16 = bArr7[7];
                                                    byte b17 = bArr7[5];
                                                    Object[] objArr115 = new Object[1];
                                                    c(b16, b17, b17, objArr115);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, i1216, iIndexOf2, -2137287382, false, (String) objArr115[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr114)).longValue();
                                                int i1217 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i1218 = (i1217 ^ 27) + ((i1217 & 27) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1218 % 128;
                                                int i1219 = i1218 % 2;
                                                i17 = -2001519171;
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        i = (i | 1) + (i & 1);
                        i33 = 0;
                        i36 = -2001519171;
                        clsArr3 = null;
                        c = '0';
                        i32 = 1;
                    }
                }
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i17);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int doubleTapTimeout = 2823 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
                byte[] bArr8 = $$d;
                byte b18 = bArr8[10];
                byte b19 = bArr8[7];
                Object[] objArr20 = new Object[1];
                c(b18, b19, b19, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, doubleTapTimeout, maximumFlingVelocity, 1814927978, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int maxKeyCode = 2823 - (KeyEvent.getMaxKeyCode() >> 16);
                int iIndexOf3 = TextUtils.indexOf("", "", 0) + 22;
                byte b20 = (byte) ($$e & 7);
                byte b21 = $$d[5];
                Object[] objArr22 = new Object[1];
                c(b20, b21, b21, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, maxKeyCode, iIndexOf3, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr21);
            Object[] objArr23 = {0, methodArr, null};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cMakeMeasureSpec2 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37657);
                int mode3 = 2720 - View.MeasureSpec.getMode(0);
                int edgeSlop = 19 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte b22 = (byte) ($$e & 7);
                byte b23 = $$d[5];
                Object[] objArr24 = new Object[1];
                c(b22, b23, b23, objArr24);
                i18 = 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec2, mode3, edgeSlop, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            } else {
                i18 = 0;
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr23)).longValue();
            long j2 = -498655299;
            long j3 = 253;
            long j4 = (j3 * j2) + (j3 * jLongValue);
            long j5 = -252;
            long j6 = -1;
            long j7 = jLongValue ^ j6;
            long j8 = ((j2 ^ j6) | j7) ^ j6;
            long jNextInt = new Random().nextInt(1890218049);
            long j9 = j7 | (jNextInt ^ j6);
            long j10 = jLongValue | j2;
            long j11 = (jNextInt | j10) ^ j6;
            j = j4 + ((j8 | (j9 ^ j6) | j11) * j5) + (j5 * j10) + (((long) 252) * (j11 | ((j9 | j2) ^ j6))) + ((long) (-1311750546));
            int i132 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            i19 = (i132 & 125) + (i132 | 125);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
            if (i19 % 2 == 0) {
                int i133 = ~Process.myTid();
                i20 = ((int) (j >> 66)) & (((((~(979530482 | i133)) | (-2146662387)) * (-241)) - 784752041) + (((~(i133 | (-1167131905))) | 268451984) * 241));
            } else {
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                i20 = ((int) (j >> 32)) & (((((~((-601838999) | iUptimeMillis)) | 303322498) * 398) - 1797892518) + (((~((~iUptimeMillis) | (-601838999))) | 303322498) * 398));
            }
            i21 = (int) j;
            int i134 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            i22 = (i134 & 125) + (i134 | 125);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
            if (i22 % 2 == 0) {
                int i135 = ~(((int) SystemClock.elapsedRealtime()) | 1681224758);
                int i136 = i21 & ((((-1753851849) + (((-1176516128) | i135) * (-220))) + ((i135 | (-1714779712)) * 220)) - 1524470370);
                i23 = (i20 & i136) | (i20 ^ i136);
                i24 = (i23 ^ 37) + ((i23 & 37) << 1);
            } else {
                int i137 = ~((int) Runtime.getRuntime().maxMemory());
                int i138 = ~((-1776326676) | i137);
                i23 = i20 | (i21 & (204696557 + ((339100265 | i138) * 764) + (((~(i137 | 339100265)) | (-2113329788)) * (-1528)) + (((-2111232635) | i138) * 764)));
                i24 = i23 >>> 24;
            }
            i25 = i23 & ViewCompat.MEASURED_SIZE_MASK;
            if (i24 != 0) {
                int i139 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i140 = ((i139 | 33) << 1) - (i139 ^ 33);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i140 % 128;
                int i141 = i140 % 2;
                i26 = 1;
            } else {
                int i142 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i142 % 128;
                int i143 = i142 % 2;
                i26 = i18;
            }
            if (i26 != 0) {
                int i144 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i27 = 1;
                int i145 = ((i144 | 13) << 1) - (i144 ^ 13);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i145 % 128;
                int i146 = i145 % 2;
                i18 = 1;
            } else {
                i27 = 1;
            }
            if ((i26 ^ i27) != 0) {
                string = null;
            } else {
                i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i147 = i28 + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i147 % 128;
                int i148 = i147 % 2;
                if (i25 < i27) {
                    int i149 = (i28 ^ 89) + ((i28 & 89) << i27);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i149 % 128;
                    int i150 = i149 % 2;
                    method2 = methodArr[i25];
                    if (method2 != null) {
                        string = method2.toString();
                    } else {
                        string = null;
                    }
                } else {
                    string = null;
                }
            }
            list.add(string);
            return (i24 + 6) * i18;
        }
        clsArr2[0] = String.class;
        methodArr[0] = AssetManager.class.getMethod(str2, clsArr2);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2824;
            int iIndexOf4 = TextUtils.indexOf("", "") + 22;
            byte[] bArr9 = $$d;
            byte b24 = bArr9[10];
            byte b25 = bArr9[7];
            Object[] objArr25 = new Object[1];
            c(b24, b25, b25, objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maxKeyCode2, iLastIndexOf, iIndexOf4, 1814927978, false, (String) objArr25[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null) == null) {
            declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2822, View.resolveSize(0, 0) + 22)).getDeclaredMethods();
            length = declaredMethods.length;
            i = 0;
            while (true) {
                if (i < length) {
                    int i310 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                    int i311 = i310 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i311;
                    int i312 = i310 % 2;
                    method = declaredMethods[i];
                    int i410 = ((i311 | 65) << i32) - (i311 ^ 65);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i410 % 128;
                    int i411 = i410 % 2;
                    try {
                        cArr = new char[]{29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211};
                        i2 = -TextUtils.indexOf("", c, i33, i33);
                        iB = setRelative.b();
                        int i412 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i3 = ((i412 | 41) << 1) - (i412 ^ 41);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                        if (i3 % 2 != 0) {
                            i4 = ((-109) >> i2) * 111;
                            int i413 = ~i2;
                            int i414 = ~((iB ^ 58920) | (iB & 58920));
                            i5 = (-220) / ((i413 ^ i414) | (i413 & i414));
                        } else {
                            int i415 = i2 * (-109);
                            i4 = ((i415 | 6540120) << i32) - (i415 ^ 6540120);
                            int i416 = ~i2;
                            int i417 = ~((iB ^ 58920) | (iB & 58920));
                            i5 = ((i416 ^ i417) | (i416 & i417)) * (-220);
                        }
                        int i418 = ((i4 | i5) << i32) - (i4 ^ i5);
                        int i419 = ~(i2 | 58920);
                        int i510 = ~((58920 ^ iB) | (58920 & iB));
                        i6 = i418 + (((i419 ^ i510) | (i419 & i510)) * 220);
                        i7 = i412 + 93;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i511 = ~i2;
                            int i512 = ~((i511 ^ 58920) | (i511 & 58920));
                            int i513 = ~(((-58921) ^ i2) | ((-58921) & i2));
                            int i514 = i6 * (110 >>> ((i512 & i513) | (i512 ^ i513)));
                            Object[] objArr26 = new Object[i32];
                            d(cArr, i514, objArr26);
                            cls = Class.forName((String) objArr26[i33]);
                            cArr2 = new char[12];
                        } else {
                            int i515 = ~i2;
                            int i516 = ~((i515 ^ 58920) | (i515 & 58920));
                            int i517 = ~(((-58921) ^ i2) | ((-58921) & i2));
                            int i518 = -(-(((i516 & i517) | (i516 ^ i517)) * 110));
                            int i519 = (i6 ^ i518) + ((i6 & i518) << i32);
                            Object[] objArr27 = new Object[i32];
                            d(cArr, i519, objArr27);
                            cls = Class.forName((String) objArr27[i33]);
                            cArr2 = new char[12];
                        }
                        // fill-array-data instruction
                        cArr2[0] = 29399;
                        cArr2[1] = 34268;
                        cArr2[2] = 40150;
                        cArr2[3] = 38886;
                        cArr2[4] = 44795;
                        cArr2[5] = 41465;
                        cArr2[6] = 47343;
                        cArr2[7] = 46057;
                        cArr2[8] = 51857;
                        cArr2[9] = 56708;
                        cArr2[10] = 54424;
                        cArr2[11] = 61344;
                        int i610 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i611 = ((i610 | 69) << i32) - (i610 ^ 69);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i611 % 128;
                        int i612 = i611 % 2;
                        Object[] objArr116 = new Object[i32];
                        d(cArr2, (TypedValue.complexToFraction(i33, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i33, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63241, objArr116);
                        num = (Integer) cls.getMethod((String) objArr116[i33], clsArr3).invoke(method, clsArr3);
                        i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                        if (i8 % 2 == 0) {
                            objArr = new Object[i32];
                            objArr[i33] = Integer.valueOf(num.intValue());
                            cArr3 = new char[]{29402, 40794, 43472, 47728, 50354, 53611, 58259, 3091, 7823, 11133, 13740, 17964, 20562, 25299, 36687, 39414, 43636, 46245, 49467, 54158, 64520, 3774, 6948, 9636, 14301, 16465};
                            i9 = 60811 >>> (TypedValue.complexToFloat(i32) > 0.0f ? 1 : (TypedValue.complexToFloat(i32) == 0.0f ? 0 : -1));
                        } else {
                            objArr = new Object[i32];
                            objArr[i33] = Integer.valueOf(num.intValue());
                            cArr3 = new char[]{29402, 40794, 43472, 47728, 50354, 53611, 58259, 3091, 7823, 11133, 13740, 17964, 20562, 25299, 36687, 39414, 43636, 46245, 49467, 54158, 64520, 3774, 6948, 9636, 14301, 16465};
                            int i613 = -(TypedValue.complexToFloat(i33) > 0.0f ? 1 : (TypedValue.complexToFloat(i33) == 0.0f ? 0 : -1));
                            i9 = ((i613 & 60811) << i32) + (i613 ^ 60811);
                        }
                        Object[] objArr117 = new Object[i32];
                        d(cArr3, i9, objArr117);
                        cls2 = Class.forName((String) objArr117[i33]);
                        Object[] objArr118 = new Object[i32];
                        d(new char[]{29401, 30940, 26304, 27788, 23224, 16450, 20092, 13324}, 2591 - TextUtils.getCapsMode("", i33, i33), objArr118);
                        str = (String) objArr118[i33];
                        clsArr = new Class[i32];
                        int i614 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i615 = (i614 & 33) + (i614 | 33);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i615 % 128;
                        int i616 = i615 % 2;
                        clsArr[i33] = Integer.TYPE;
                        if (((Boolean) cls2.getMethod(str, clsArr).invoke(clsArr3, objArr)).booleanValue()) {
                            cls3 = Long.TYPE;
                            char[] cArr8 = {29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211};
                            int i617 = -Color.alpha(i33);
                            int iB8 = setRelative.b();
                            int i618 = i617 * 866;
                            int i619 = (i618 & (-50907744)) + (i618 | (-50907744));
                            int i710 = ~i617;
                            int i711 = ~iB8;
                            int i712 = ~(i710 | i711);
                            int i713 = i619 + ((((-58922) ^ i712) | ((-58922) & i712)) * (-865));
                            int i714 = -(-((~(i617 | iB8)) * 865));
                            int i715 = (i713 & i714) + (i713 | i714);
                            int i716 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i716 % 128;
                            int i717 = i716 % 2;
                            int i718 = ~iB8;
                            int i719 = i715 + (865 * ((~((i617 & i711) | (i711 ^ i617))) | (~(((-58922) & i718) | ((-58922) ^ i718)))));
                            Object[] objArr119 = new Object[i32];
                            d(cArr8, i719, objArr119);
                            cls4 = Class.forName((String) objArr119[i33]);
                            cArr4 = new char[]{29399, 29618, 28682, 30423, 30537, 30151, 31407, 31507, 31206, 32379, 31951, 32173, 25089};
                            int i810 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i810 % 128;
                            int i811 = i810 % 2;
                            offsetBefore = TextUtils.getOffsetBefore("", i33);
                            int iB9 = setRelative.b();
                            i10 = offsetBefore * 367;
                            int i812 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i11 = i812 + 41;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i813 = i10 / 8;
                                int i814 = -(-(((offsetBefore ^ 359) | (offsetBefore & 359)) * (-366)));
                                i12 = (i813 ^ i814) + ((i814 & i813) << 1);
                            } else {
                                i12 = (((i10 & 131753) + (131753 | i10)) - (~(((offsetBefore ^ 359) | (offsetBefore & 359)) * (-366)))) - 1;
                            }
                            int i815 = ~(((-360) & iB9) | ((-360) ^ iB9));
                            i13 = i12 + ((-366) * ((i815 & offsetBefore) | (offsetBefore ^ i815)));
                            int i816 = ~offsetBefore;
                            i14 = ~((i816 & 359) | (i816 ^ 359));
                            int i817 = ((-360) ^ offsetBefore) | (offsetBefore & (-360));
                            int i818 = (i817 & iB9) | (i817 ^ iB9);
                            int i819 = (i812 ^ 87) + ((i812 & 87) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i819 % 128;
                            i15 = i819 % 2;
                            i16 = ~i818;
                            if (i15 != 0) {
                                int i919 = i14 ^ i16;
                                objArr5 = new Object[1];
                                d(cArr4, i13 % (((i14 & i16) | i919) * 366), objArr5);
                                if (cls3.equals(cls4.getMethod((String) objArr5[0], null).invoke(method, null))) {
                                    int i9110 = -TextUtils.lastIndexOf("", '0');
                                    int iB10 = setRelative.b();
                                    int i9111 = ~(((-58921) & i9110) | ((-58921) ^ i9110));
                                    int i9112 = ~iB10;
                                    int i9113 = ~((i9112 & 58920) | (i9112 ^ 58920));
                                    int i9114 = (i9110 * (-1939)) + 57211320 + (((i9111 & i9113) | (i9111 ^ i9113)) * (-970));
                                    int i9115 = ~i9110;
                                    int i9116 = i9114 + ((~((i9115 & 58920) | (i9115 ^ 58920))) * 1940);
                                    int i9117 = ~i9110;
                                    int i9118 = ~((i9117 & (-58921)) | (i9117 ^ (-58921)));
                                    int i10110 = ~iB10;
                                    int i10111 = -(-((i9118 | (~((i10110 & 58920) | (i10110 ^ 58920)))) * 970));
                                    int i10112 = (i9116 ^ i10111) + ((i10111 & i9116) << 1);
                                    Object[] objArr1110 = new Object[1];
                                    d(new char[]{29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211}, i10112, objArr1110);
                                    Class<?> cls7 = Class.forName((String) objArr1110[0]);
                                    char[] cArr9 = {29399, 17698, 7466, 54533, 44301, 25873, 15643, 62748, 52589, 34155, 23923, 5471, 60784, 42306, 32066, 13740, 3507};
                                    int i10113 = -View.combineMeasuredStates(0, 0);
                                    int iB11 = setRelative.b();
                                    int i10114 = i10113 * 450;
                                    int i10115 = ((i10114 | (-6418496)) << 1) - (i10114 ^ (-6418496));
                                    int i10116 = ~i10113;
                                    int i10117 = ((~((i10116 ^ 14327) | (i10116 & 14327))) | (~((-14328) | i10113 | iB11))) * 449;
                                    int i10118 = (i10115 ^ i10117) + ((i10117 & i10115) << 1);
                                    int i10119 = ~i10113;
                                    int i11110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i11111 = ((i11110 | 41) << 1) - (i11110 ^ 41);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11111 % 128;
                                    int i11112 = i11111 % 2;
                                    int i11113 = (i10118 - (~(-(-((-1347) * (~((i10119 & 14327) | (i10119 ^ 14327)))))))) - 1;
                                    int i11114 = ~((i10116 & 14327) | (i10116 ^ 14327));
                                    int i11115 = ~iB11;
                                    int i11116 = (i11115 & (-14328)) | ((-14328) ^ i11115);
                                    int i11117 = ~((i10113 & i11116) | (i11116 ^ i10113));
                                    Object[] objArr1111 = new Object[1];
                                    d(cArr9, (i11113 - (~(-(-(((i11117 & i11114) | (i11114 ^ i11117)) * 449))))) - 1, objArr1111);
                                    objArr3 = (Object[]) cls7.getMethod((String) objArr1111[0], null).invoke(method, null);
                                    if (objArr3.length == 2) {
                                        int i11118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i11119 = (i11118 & 49) + (i11118 | 49);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11119 % 128;
                                        int i12110 = i11119 % 2;
                                        if (Long.TYPE.equals(objArr3[0])) {
                                            int i12111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i12112 = (i12111 & 37) + (i12111 | 37);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12112 % 128;
                                            int i12113 = i12112 % 2;
                                            objArr4 = new Object[1];
                                            d(new char[]{29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211}, 58921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                                            if (Class.forName((String) objArr4[0]).equals(objArr3[1])) {
                                                int i12114 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12114 % 128;
                                                int i12115 = i12114 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int iResolveSize3 = 2823 - View.resolveSize(0, 0);
                                                    int mode4 = 22 - View.MeasureSpec.getMode(0);
                                                    byte[] bArr10 = $$d;
                                                    byte b110 = bArr10[10];
                                                    byte b111 = bArr10[7];
                                                    Object[] objArr1112 = new Object[1];
                                                    c(b110, b111, b111, objArr1112);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay3, iResolveSize3, mode4, 1814927978, false, (String) objArr1112[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                                    int bitsPerPixel3 = 2822 - ImageFormat.getBitsPerPixel(0);
                                                    int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                                                    byte[] bArr11 = $$d;
                                                    byte b112 = bArr11[10];
                                                    byte b113 = bArr11[7];
                                                    Object[] objArr1113 = new Object[1];
                                                    c(b112, b113, b113, objArr1113);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf3, bitsPerPixel3, minimumFlingVelocity3, 1814927978, false, (String) objArr1113[0], null);
                                                }
                                                try {
                                                    Object[] objArr1114 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char c4 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                        int i12116 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                        int iIndexOf5 = TextUtils.indexOf("", "", 0) + 22;
                                                        byte[] bArr12 = $$d;
                                                        byte b114 = bArr12[7];
                                                        byte b115 = bArr12[5];
                                                        Object[] objArr1115 = new Object[1];
                                                        c(b114, b115, b115, objArr1115);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, i12116, iIndexOf5, -2137287382, false, (String) objArr1115[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1114)).longValue();
                                                    int i12117 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                    int i12118 = (i12117 ^ 27) + ((i12117 & 27) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12118 % 128;
                                                    int i12119 = i12118 % 2;
                                                    i17 = -2001519171;
                                                    break;
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                int i1310 = -(-(((i14 & i16) | (i14 ^ i16)) * 366));
                                int i1311 = (i13 ^ i1310) + ((i1310 & i13) << 1);
                                objArr2 = new Object[1];
                                d(cArr4, i1311, objArr2);
                                if (cls3.equals(cls4.getMethod((String) objArr2[0], null).invoke(method, null))) {
                                    int i9119 = -TextUtils.lastIndexOf("", '0');
                                    int iB12 = setRelative.b();
                                    int i91110 = ~(((-58921) & i9119) | ((-58921) ^ i9119));
                                    int i91111 = ~iB12;
                                    int i91112 = ~((i91111 & 58920) | (i91111 ^ 58920));
                                    int i91113 = (i9119 * (-1939)) + 57211320 + (((i91110 & i91112) | (i91110 ^ i91112)) * (-970));
                                    int i91114 = ~i9119;
                                    int i91115 = i91113 + ((~((i91114 & 58920) | (i91114 ^ 58920))) * 1940);
                                    int i91116 = ~i9119;
                                    int i91117 = ~((i91116 & (-58921)) | (i91116 ^ (-58921)));
                                    int i101110 = ~iB12;
                                    int i101111 = -(-((i91117 | (~((i101110 & 58920) | (i101110 ^ 58920)))) * 970));
                                    int i101112 = (i91115 ^ i101111) + ((i101111 & i91115) << 1);
                                    Object[] objArr1116 = new Object[1];
                                    d(new char[]{29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211}, i101112, objArr1116);
                                    Class<?> cls8 = Class.forName((String) objArr1116[0]);
                                    char[] cArr10 = {29399, 17698, 7466, 54533, 44301, 25873, 15643, 62748, 52589, 34155, 23923, 5471, 60784, 42306, 32066, 13740, 3507};
                                    int i101113 = -View.combineMeasuredStates(0, 0);
                                    int iB13 = setRelative.b();
                                    int i101114 = i101113 * 450;
                                    int i101115 = ((i101114 | (-6418496)) << 1) - (i101114 ^ (-6418496));
                                    int i101116 = ~i101113;
                                    int i101117 = ((~((i101116 ^ 14327) | (i101116 & 14327))) | (~((-14328) | i101113 | iB13))) * 449;
                                    int i101118 = (i101115 ^ i101117) + ((i101117 & i101115) << 1);
                                    int i101119 = ~i101113;
                                    int i111110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i111111 = ((i111110 | 41) << 1) - (i111110 ^ 41);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i111111 % 128;
                                    int i111112 = i111111 % 2;
                                    int i111113 = (i101118 - (~(-(-((-1347) * (~((i101119 & 14327) | (i101119 ^ 14327)))))))) - 1;
                                    int i111114 = ~((i101116 & 14327) | (i101116 ^ 14327));
                                    int i111115 = ~iB13;
                                    int i111116 = (i111115 & (-14328)) | ((-14328) ^ i111115);
                                    int i111117 = ~((i101113 & i111116) | (i111116 ^ i101113));
                                    Object[] objArr1117 = new Object[1];
                                    d(cArr10, (i111113 - (~(-(-(((i111117 & i111114) | (i111114 ^ i111117)) * 449))))) - 1, objArr1117);
                                    objArr3 = (Object[]) cls8.getMethod((String) objArr1117[0], null).invoke(method, null);
                                    if (objArr3.length == 2) {
                                        int i111118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i111119 = (i111118 & 49) + (i111118 | 49);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i111119 % 128;
                                        int i121110 = i111119 % 2;
                                        if (Long.TYPE.equals(objArr3[0])) {
                                            int i121111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i121112 = (i121111 & 37) + (i121111 | 37);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i121112 % 128;
                                            int i121113 = i121112 % 2;
                                            objArr4 = new Object[1];
                                            d(new char[]{29402, 38136, 48788, 49322, 59962, 3089, 5671, 14785, 17311, 26095, 36696, 37142, 47930, 49865, 58603, 3764, 4180, 14887, 23583, 26590, 35312, 37765, 46425, 57211}, 58921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                                            if (Class.forName((String) objArr4[0]).equals(objArr3[1])) {
                                                int i121114 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i121114 % 128;
                                                int i121115 = i121114 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char keyRepeatDelay4 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int iResolveSize4 = 2823 - View.resolveSize(0, 0);
                                                    int mode5 = 22 - View.MeasureSpec.getMode(0);
                                                    byte[] bArr13 = $$d;
                                                    byte b116 = bArr13[10];
                                                    byte b117 = bArr13[7];
                                                    Object[] objArr1118 = new Object[1];
                                                    c(b116, b117, b117, objArr1118);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay4, iResolveSize4, mode5, 1814927978, false, (String) objArr1118[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                                    int bitsPerPixel4 = 2822 - ImageFormat.getBitsPerPixel(0);
                                                    int minimumFlingVelocity4 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                                                    byte[] bArr14 = $$d;
                                                    byte b118 = bArr14[10];
                                                    byte b119 = bArr14[7];
                                                    Object[] objArr1119 = new Object[1];
                                                    c(b118, b119, b119, objArr1119);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf4, bitsPerPixel4, minimumFlingVelocity4, 1814927978, false, (String) objArr1119[0], null);
                                                }
                                                Object[] objArr11110 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c5 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                    int i121116 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int iIndexOf6 = TextUtils.indexOf("", "", 0) + 22;
                                                    byte[] bArr15 = $$d;
                                                    byte b1110 = bArr15[7];
                                                    byte b1111 = bArr15[5];
                                                    Object[] objArr11111 = new Object[1];
                                                    c(b1110, b1111, b1111, objArr11111);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c5, i121116, iIndexOf6, -2137287382, false, (String) objArr11111[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr11110)).longValue();
                                                int i121117 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i121118 = (i121117 ^ 27) + ((i121117 & 27) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i121118 % 128;
                                                int i121119 = i121118 % 2;
                                                i17 = -2001519171;
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        i = (i | 1) + (i & 1);
                        i33 = 0;
                        i36 = -2001519171;
                        clsArr3 = null;
                        c = '0';
                        i32 = 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i17);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int doubleTapTimeout2 = 2823 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
            byte[] bArr16 = $$d;
            byte b120 = bArr16[10];
            byte b121 = bArr16[7];
            Object[] objArr28 = new Object[1];
            c(b120, b121, b121, objArr28);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout2, doubleTapTimeout2, maximumFlingVelocity2, 1814927978, false, (String) objArr28[0], null);
        }
        Object[] objArr29 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cMakeMeasureSpec3 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int maxKeyCode3 = 2823 - (KeyEvent.getMaxKeyCode() >> 16);
            int iIndexOf7 = TextUtils.indexOf("", "", 0) + 22;
            byte b26 = (byte) ($$e & 7);
            byte b27 = $$d[5];
            Object[] objArr210 = new Object[1];
            c(b26, b27, b27, objArr210);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec3, maxKeyCode3, iIndexOf7, 1025296417, false, (String) objArr210[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr29);
        Object[] objArr211 = {0, methodArr, null};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cMakeMeasureSpec4 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37657);
            int mode6 = 2720 - View.MeasureSpec.getMode(0);
            int edgeSlop2 = 19 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b28 = (byte) ($$e & 7);
            byte b29 = $$d[5];
            Object[] objArr212 = new Object[1];
            c(b28, b29, b29, objArr212);
            i18 = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec4, mode6, edgeSlop2, -1568796068, false, (String) objArr212[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        } else {
            i18 = 0;
        }
        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr211)).longValue();
        long j12 = -498655299;
        long j13 = 253;
        long j14 = (j13 * j12) + (j13 * jLongValue2);
        long j15 = -252;
        long j16 = -1;
        long j17 = jLongValue2 ^ j16;
        long j18 = ((j12 ^ j16) | j17) ^ j16;
        long jNextInt2 = new Random().nextInt(1890218049);
        long j19 = j17 | (jNextInt2 ^ j16);
        long j110 = jLongValue2 | j12;
        long j111 = (jNextInt2 | j110) ^ j16;
        j = j14 + ((j18 | (j19 ^ j16) | j111) * j15) + (j15 * j110) + (((long) 252) * (j111 | ((j19 | j12) ^ j16))) + ((long) (-1311750546));
        int i1312 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        i19 = (i1312 & 125) + (i1312 | 125);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
        if (i19 % 2 == 0) {
            int i1313 = ~Process.myTid();
            i20 = ((int) (j >> 66)) & (((((~(979530482 | i1313)) | (-2146662387)) * (-241)) - 784752041) + (((~(i1313 | (-1167131905))) | 268451984) * 241));
        } else {
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            i20 = ((int) (j >> 32)) & (((((~((-601838999) | iUptimeMillis2)) | 303322498) * 398) - 1797892518) + (((~((~iUptimeMillis2) | (-601838999))) | 303322498) * 398));
        }
        i21 = (int) j;
        int i1314 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        i22 = (i1314 & 125) + (i1314 | 125);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
        if (i22 % 2 == 0) {
            int i1315 = ~(((int) SystemClock.elapsedRealtime()) | 1681224758);
            int i1316 = i21 & ((((-1753851849) + (((-1176516128) | i1315) * (-220))) + ((i1315 | (-1714779712)) * 220)) - 1524470370);
            i23 = (i20 & i1316) | (i20 ^ i1316);
            i24 = (i23 ^ 37) + ((i23 & 37) << 1);
        } else {
            int i1317 = ~((int) Runtime.getRuntime().maxMemory());
            int i1318 = ~((-1776326676) | i1317);
            i23 = i20 | (i21 & (204696557 + ((339100265 | i1318) * 764) + (((~(i1317 | 339100265)) | (-2113329788)) * (-1528)) + (((-2111232635) | i1318) * 764)));
            i24 = i23 >>> 24;
        }
        i25 = i23 & ViewCompat.MEASURED_SIZE_MASK;
        if (i24 != 0) {
            int i1319 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i1410 = ((i1319 | 33) << 1) - (i1319 ^ 33);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1410 % 128;
            int i1411 = i1410 % 2;
            i26 = 1;
        } else {
            int i1412 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1412 % 128;
            int i1413 = i1412 % 2;
            i26 = i18;
        }
        if (i26 != 0) {
            int i1414 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            i27 = 1;
            int i1415 = ((i1414 | 13) << 1) - (i1414 ^ 13);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1415 % 128;
            int i1416 = i1415 % 2;
            i18 = 1;
        } else {
            i27 = 1;
        }
        if ((i26 ^ i27) != 0) {
            string = null;
        } else {
            i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i1417 = i28 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1417 % 128;
            int i1418 = i1417 % 2;
            if (i25 < i27) {
                int i1419 = (i28 ^ 89) + ((i28 & 89) << i27);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1419 % 128;
                int i151 = i1419 % 2;
                method2 = methodArr[i25];
                if (method2 != null) {
                    string = method2.toString();
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
        }
        list.add(string);
        return (i24 + 6) * i18;
        i17 = i36;
        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i17);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char keyRepeatTimeout3 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int doubleTapTimeout3 = 2823 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
            byte[] bArr17 = $$d;
            byte b122 = bArr17[10];
            byte b123 = bArr17[7];
            Object[] objArr213 = new Object[1];
            c(b122, b123, b123, objArr213);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout3, doubleTapTimeout3, maximumFlingVelocity3, 1814927978, false, (String) objArr213[0], null);
        }
        Object[] objArr214 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cMakeMeasureSpec5 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int maxKeyCode4 = 2823 - (KeyEvent.getMaxKeyCode() >> 16);
            int iIndexOf8 = TextUtils.indexOf("", "", 0) + 22;
            byte b210 = (byte) ($$e & 7);
            byte b211 = $$d[5];
            Object[] objArr215 = new Object[1];
            c(b210, b211, b211, objArr215);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec5, maxKeyCode4, iIndexOf8, 1025296417, false, (String) objArr215[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr214);
        Object[] objArr216 = {0, methodArr, null};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cMakeMeasureSpec6 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37657);
            int mode7 = 2720 - View.MeasureSpec.getMode(0);
            int edgeSlop3 = 19 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b212 = (byte) ($$e & 7);
            byte b213 = $$d[5];
            Object[] objArr217 = new Object[1];
            c(b212, b213, b213, objArr217);
            i18 = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec6, mode7, edgeSlop3, -1568796068, false, (String) objArr217[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        } else {
            i18 = 0;
        }
        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr216)).longValue();
        long j112 = -498655299;
        long j113 = 253;
        long j114 = (j113 * j112) + (j113 * jLongValue3);
        long j115 = -252;
        long j116 = -1;
        long j117 = jLongValue3 ^ j116;
        long j118 = ((j112 ^ j116) | j117) ^ j116;
        long jNextInt3 = new Random().nextInt(1890218049);
        long j119 = j117 | (jNextInt3 ^ j116);
        long j1110 = jLongValue3 | j112;
        long j1111 = (jNextInt3 | j1110) ^ j116;
        j = j114 + ((j118 | (j119 ^ j116) | j1111) * j115) + (j115 * j1110) + (((long) 252) * (j1111 | ((j119 | j112) ^ j116))) + ((long) (-1311750546));
        int i13110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        i19 = (i13110 & 125) + (i13110 | 125);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
        if (i19 % 2 == 0) {
            int i13111 = ~Process.myTid();
            i20 = ((int) (j >> 66)) & (((((~(979530482 | i13111)) | (-2146662387)) * (-241)) - 784752041) + (((~(i13111 | (-1167131905))) | 268451984) * 241));
        } else {
            int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
            i20 = ((int) (j >> 32)) & (((((~((-601838999) | iUptimeMillis3)) | 303322498) * 398) - 1797892518) + (((~((~iUptimeMillis3) | (-601838999))) | 303322498) * 398));
        }
        i21 = (int) j;
        int i13112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        i22 = (i13112 & 125) + (i13112 | 125);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
        if (i22 % 2 == 0) {
            int i13113 = ~(((int) SystemClock.elapsedRealtime()) | 1681224758);
            int i13114 = i21 & ((((-1753851849) + (((-1176516128) | i13113) * (-220))) + ((i13113 | (-1714779712)) * 220)) - 1524470370);
            i23 = (i20 & i13114) | (i20 ^ i13114);
            i24 = (i23 ^ 37) + ((i23 & 37) << 1);
        } else {
            int i13115 = ~((int) Runtime.getRuntime().maxMemory());
            int i13116 = ~((-1776326676) | i13115);
            i23 = i20 | (i21 & (204696557 + ((339100265 | i13116) * 764) + (((~(i13115 | 339100265)) | (-2113329788)) * (-1528)) + (((-2111232635) | i13116) * 764)));
            i24 = i23 >>> 24;
        }
        i25 = i23 & ViewCompat.MEASURED_SIZE_MASK;
        if (i24 != 0) {
            int i13117 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i14110 = ((i13117 | 33) << 1) - (i13117 ^ 33);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14110 % 128;
            int i14111 = i14110 % 2;
            i26 = 1;
        } else {
            int i14112 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14112 % 128;
            int i14113 = i14112 % 2;
            i26 = i18;
        }
        if (i26 != 0) {
            int i14114 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            i27 = 1;
            int i14115 = ((i14114 | 13) << 1) - (i14114 ^ 13);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14115 % 128;
            int i14116 = i14115 % 2;
            i18 = 1;
        } else {
            i27 = 1;
        }
        if ((i26 ^ i27) != 0) {
            string = null;
        } else {
            i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i14117 = i28 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14117 % 128;
            int i14118 = i14117 % 2;
            if (i25 < i27) {
                int i14119 = (i28 ^ 89) + ((i28 & 89) << i27);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14119 % 128;
                int i152 = i14119 % 2;
                method2 = methodArr[i25];
                if (method2 != null) {
                    string = method2.toString();
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
        }
        list.add(string);
        return (i24 + 6) * i18;
    }
}
