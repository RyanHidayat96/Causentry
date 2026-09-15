package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
class zzao extends zzam implements List {
    private static int $10 = 0;
    private static int $11 = 1;
    final /* synthetic */ zzap zzf;
    private static final byte[] $$d = {41, 2, 45, -60, -13, -10, 25, -53, -10, 14, -23, -16, -22, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 243;
    private static final byte[] $$a = {12, -88, 33, 118, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 41;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 7323747760626455763L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzao(zzap zzapVar, Object obj, List list, zzam zzamVar) {
        super(zzapVar, obj, list, zzamVar);
        this.zzf = zzapVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 1
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_face.zzao.$$a
            int r8 = r8 * 52
            int r8 = r8 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            int r8 = r8 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzao.a(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_face.zzao.$$d
            int r8 = r8 * 28
            int r8 = r8 + 10
            int r7 = r7 + 4
            int r9 = r9 * 13
            int r9 = 97 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L2e
        L14:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2e:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + (-10)
            r9 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzao.d(byte, short, byte, java.lang.Object[]):void");
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = 2 % 2;
        int i3 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zzb();
        Object obj = ((List) this.zzb).get(i);
        int i5 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        b = i3 % 128;
        int i4 = i3 % 2;
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzap.zzd(this.zzf);
        if (zIsEmpty) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            b = i5 % 128;
            int i6 = i5 % 2;
            zza();
            if (i6 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = 2 % 2;
        boolean z = false;
        if (collection.isEmpty()) {
            int i3 = b + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i, collection);
        if (zAddAll) {
            zzap.zzf(this.zzf, this.zzb.size() - size);
            if (size == 0) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                b = i5 % 128;
                int i6 = i5 % 2;
                zza();
                if (i6 != 0) {
                    z = true;
                }
            } else {
                z = zAddAll;
            }
        } else {
            z = zAddAll;
        }
        int i7 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        if (i7 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.blue(0) + 19472), 2624 - (ViewConfiguration.getPressedStateDuration() >> 16), 13 - Color.red(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - Process.getGidForName("")), 481 - (ViewConfiguration.getScrollBarSize() >> 8), 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i4 = $11 + 63;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - View.MeasureSpec.makeMeasureSpec(0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 481, 37 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39423 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 481, (ViewConfiguration.getTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
        int i5 = $11 + 83;
        $10 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = 2 % 2;
        zzb();
        zzan zzanVar = new zzan(this);
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return zzanVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x021b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0225  */
    @Override // java.util.List
    public final int indexOf(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        zzb();
        List list = (List) this.zzb;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31534 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 921;
            int scrollBarFadeDuration = 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[37], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, jumpTapTimeout, scrollBarFadeDuration, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{32169, 41311, 50270, 60241, 3651, 11644, 20602, 30505, 39535, 47482, 56412, 808, 9757, 17694, 26658, 36666, 45621, 53506, 62502, 7132, 16095, 24014}, ((byte) KeyEvent.getModifierMetaStateMask()) + 56570, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{32173, 10765, 54011, 31555, 8991, 52192, 28762, 6149, 49381, 26968, 4414, 47615, 26189, 3632, 46739}, Drawable.resolveOpacity(0, 0) + 22441, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
            int iAlpha = 28 - Color.alpha(0);
            byte b3 = $$a[80];
            Object[] objArr5 = new Object[1];
            a((byte) 52, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, iIndexOf, iAlpha, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 31533);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                byte b4 = (byte) ($$b - 4);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(b4, bArr2[80], bArr2[37], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, deadChar, iResolveOpacity, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i2 = ~elapsedCpuTime;
            int i3 = (((115939108 + ((1007928496 | i2) * (-757))) + ((~((-27789644) | elapsedCpuTime)) * 1514)) + (((~(elapsedCpuTime | 1035718139)) | ((~(i2 | (-766151148))) | 738361504)) * 757)) - 126542983;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{32169, 10051, 51302, 27925, 5683, 48088, 23794, 421, 43649, 20405, 61770, 39473, 16181, 57354, 34106, 11978, 54254, 29844, 6566, 49998, 25720, 2409, 45588, 22334, 63697, 40433}, 23269 - (Process.myTid() >> 22), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{32171, 34434, 35780, 35847, 37201, 38301, 40646, 41776, 42048, 43151, 44498, 46612, 47967, 49050, 49358, 50448, 52823, 53897}, 64319 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 94 / 0;
                    if (!(!(applicationContext instanceof ContextWrapper))) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{32162, 6444, 46260, 20518, 61426, 35645, 9911, 49669, 22919, 62795, 37033, 11270, 52103, 26493, 747, 40558}, 25732 - TextUtils.lastIndexOf("", '0'), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{32161, 1119, 36427, 4223, 39536, 7198, 42510, 10260, 45592, 13346, 48837, 16593, 51951, 19696, 55014, 22672}, 31218 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -126542983};
                byte[] bArr3 = $$d;
                byte b5 = (byte) (-bArr3[16]);
                byte b6 = bArr3[37];
                Object[] objArr13 = new Object[1];
                d(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[34];
                byte b8 = bArr3[16];
                Object[] objArr14 = new Object[1];
                d(b7, b8, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                    int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                    int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b9 = (byte) ($$b - 4);
                    byte[] bArr4 = $$a;
                    Object[] objArr16 = new Object[1];
                    a(b9, bArr4[80], bArr4[37], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, packedPositionGroup, tapTimeout, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{32169, 41311, 50270, 60241, 3651, 11644, 20602, 30505, 39535, 47482, 56412, 808, 9757, 17694, 26658, 36666, 45621, 53506, 62502, 7132, 16095, 24014}, View.resolveSizeAndState(0, 0, 0) + 56569, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{32173, 10765, 54011, 31555, 8991, 52192, 28762, 6149, 49381, 26968, 4414, 47615, 26189, 3632, 46739}, KeyEvent.getDeadChar(0, 0) + 22441, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int deadChar2 = 921 - KeyEvent.getDeadChar(0, 0);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                        byte b10 = $$a[80];
                        Object[] objArr19 = new Object[1];
                        a((byte) 52, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, deadChar2, maximumFlingVelocity, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31533);
                        int keyRepeatDelay = 921 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int pressedStateDuration = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        a(b11, bArr5[37], b11, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, keyRepeatDelay, pressedStateDuration, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    objArr = objArr15;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i12 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i13 = (int) Runtime.getRuntime().totalMemory();
        int i14 = ~i13;
        int i15 = i12 + 105428928 + (((~((-778016035) | i14)) | 67175426) * 98) + (((~(i14 | (-996063610))) | (-778016035) | (~(996063609 | i13))) * (-49)) + (((~(i13 | (-778016035))) | (-1063239036)) * 49);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
        return list.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        int iLastIndexOf = ((List) this.zzb).lastIndexOf(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return iLastIndexOf;
        }
        throw null;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zzb();
        Object obj2 = ((List) this.zzb).set(i, obj);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return obj2;
        }
        throw null;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = 2 % 2;
        zzb();
        zzan zzanVar = new zzan(this, i);
        int i3 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return zzanVar;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        b = i4 % 128;
        int i5 = i4 % 2;
        zzb();
        zzap zzapVar = this.zzf;
        Object obj = this.zza;
        List listSubList = ((List) this.zzb).subList(i, i2);
        zzam zzamVar = this.zzc;
        if (zzamVar == null) {
            int i6 = b + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            zzamVar = this;
        }
        return zzapVar.zzi(obj, listSubList, zzamVar);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        b = i3 % 128;
        int i4 = i3 % 2;
        zzb();
        Object objRemove = ((List) this.zzb).remove(i);
        zzap.zze(this.zzf);
        zzc();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return objRemove;
        }
        throw null;
    }
}
