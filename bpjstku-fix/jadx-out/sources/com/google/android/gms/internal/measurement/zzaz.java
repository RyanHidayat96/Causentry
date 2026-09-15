package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
final class zzaz implements Comparator {
    private static int $10 = 0;
    private static int $11 = 1;
    final /* synthetic */ zzai zza;
    final /* synthetic */ zzg zzb;
    private static final byte[] $$a = {74, 60, 122, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 238;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5370322878004852673L;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 84
            int r8 = r8 * 3
            int r8 = 53 - r8
            int r9 = r9 * 4
            int r9 = 4 - r9
            byte[] r0 = com.google.android.gms.internal.measurement.zzaz.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r7 = r7 + r9
            int r9 = r3 + 1
            int r7 = r7 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaz.c(byte, int, short, java.lang.Object[]):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 21;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $11 + 93;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Color.argb(0, 0, 0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2624, 13 - KeyEvent.getDeadChar(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (TuitionPaymentFragmentspecialinlinedviewModeldefault2 & 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 39422), 481 - KeyEvent.keyCodeFromString(""), TextUtils.getOffsetBefore("", 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                int i7 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - TextUtils.indexOf("", "", 0)), 2623 - ImageFormat.getBitsPerPixel(0), 13 - Gravity.getAbsoluteGravity(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 39422), KeyEvent.normalizeMetaState(0) + 481, 37 - Color.argb(0, 0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - TextUtils.getOffsetBefore("", 0)), 481 - View.resolveSize(0, 0), 37 - (ViewConfiguration.getTouchSlop() >> 8), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) throws Throwable {
        int i;
        CharSequence charSequence;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i3 = 16;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46399), 40 - (ViewConfiguration.getJumpTapTimeout() >> 16), 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new char[]{24251, 48633, 38948, 63311, 54145, 11826, 3440, 27119, 17629, 41756, 49142, 39622, 63807, 54336, 12440, 3900, 27239, 18052, 42460, 32770, 40125, 64480}, 58188 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{24255, 14145, 36181, 25423, 63861, 20332, 9588, 47945, 4359, 59156, 32016, 54067, 43303, 16188, 38205}, TextUtils.getCapsMode("", 0, 0) + 27127, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 623;
        long j2 = -1;
        long j3 = j2 ^ (-105656831561953490L);
        long j4 = j3 | 2202914006303912477L;
        CharSequence charSequence2 = "";
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j5 = (((long) 624) * 2202914006303912477L) + (((long) (-622)) * (-105656831561953490L)) + (((j4 | jElapsedRealtime) ^ j2) * j) + (((long) (-623)) * ((jElapsedRealtime ^ j2) | (((j2 ^ 2202914006303912477L) | (-105656831561953490L)) ^ j2))) + (j * ((j4 ^ j2) | ((j3 | jElapsedRealtime) ^ j2) | (j2 ^ (jElapsedRealtime | 2202914006303912477L))));
        int i5 = 0;
        while (true) {
            if (i5 == 10) {
                int i6 = i3;
                char[] cArr = new char[i6];
                // fill-array-data instruction
                cArr[0] = 24240;
                cArr[1] = 51516;
                cArr[2] = 29090;
                cArr[3] = 38958;
                cArr[4] = 232;
                cArr[5] = 43797;
                cArr[6] = 54161;
                cArr[7] = 31237;
                cArr[8] = 57989;
                cArr[9] = 3403;
                cArr[10] = 46543;
                cArr[11] = 56430;
                cArr[12] = 17661;
                cArr[13] = 61301;
                cArr[14] = 6109;
                cArr[15] = 48734;
                Object[] objArr3 = new Object[1];
                a(cArr, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 38790, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                char[] cArr2 = new char[i6];
                // fill-array-data instruction
                cArr2[0] = 24243;
                cArr2[1] = 52107;
                cArr2[2] = 29909;
                cArr2[3] = 57643;
                cArr2[4] = 2682;
                cArr2[5] = 46266;
                cArr2[6] = 8592;
                cArr2[7] = 19152;
                cArr2[8] = 63290;
                cArr2[9] = 24678;
                cArr2[10] = 35515;
                cArr2[11] = 14325;
                cArr2[12] = 41189;
                cArr2[13] = 52484;
                cArr2[14] = 30296;
                cArr2[15] = 57508;
                Object[] objArr4 = new Object[1];
                a(cArr2, 38197 - KeyEvent.normalizeMetaState(0), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-1845570140};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1134, 17 - ((byte) KeyEvent.getModifierMetaStateMask()), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1417194696, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                        CharSequence charSequence3 = charSequence2;
                        int iIndexOf = TextUtils.indexOf(charSequence3, charSequence3) + 15;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iResolveOpacity, iIndexOf, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.lastIndexOf(charSequence3, '0', 0, 0) + 1118, 17 - (ViewConfiguration.getScrollBarSize() >> 8)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    int i7 = ((int[]) objArr8[1])[0];
                    int i8 = ((int[]) objArr8[3])[0];
                    if (i8 == i7) {
                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[0];
                        if (strArr != null) {
                            int i9 = 0;
                            while (i9 < strArr.length) {
                                int i10 = b + 9;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    arrayList.add(strArr[i9]);
                                    i9 += 30;
                                } else {
                                    arrayList.add(strArr[i9]);
                                    i9++;
                                }
                            }
                        }
                        int[] iArr = new int[i8];
                        int i11 = i8 - 1;
                        iArr[i11] = 1;
                        Toast.makeText((Context) null, iArr[((i8 * i11) % 2) - 1], 1).show();
                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
                    }
                    b = i % 128;
                    int i12 = i % 2;
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i13 = b + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
            int i14 = i13 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                charSequence = charSequence2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> i3) + 37836), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, 18 - TextUtils.getOffsetAfter(charSequence, 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            } else {
                charSequence = charSequence2;
            }
            int i15 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            long j6 = jLongValue;
            int i16 = 0;
            while (true) {
                int i17 = 0;
                while (i17 != 8) {
                    i15 = (((((int) (j6 >> i17)) & 255) + (i15 << 6)) + (i15 << 16)) - i15;
                    i17++;
                    charSequence = charSequence;
                }
                charSequence2 = charSequence;
                if (i16 != 0) {
                    break;
                }
                i16++;
                j6 = j5;
                charSequence = charSequence2;
            }
            if (i15 == i4) {
                break;
            }
            jLongValue -= 1024;
            i5++;
            i3 = 16;
        }
        zzao zzaoVar = (zzao) obj;
        zzao zzaoVar2 = (zzao) obj2;
        if (!(zzaoVar instanceof zzat)) {
            if (!(zzaoVar2 instanceof zzat)) {
                zzai zzaiVar = this.zza;
                return zzaiVar == null ? zzaoVar.zzc().compareTo(zzaoVar2.zzc()) : (int) zzh.zzi(zzaiVar.zza(this.zzb, Arrays.asList(zzaoVar, zzaoVar2)).zzd().doubleValue());
            }
            int i18 = b + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
            if (i18 % 2 == 0) {
                return -1;
            }
            throw null;
        }
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        int i20 = i19 % 128;
        b = i20;
        int i21 = i19 % 2;
        if (zzaoVar2 instanceof zzat) {
            return 0;
        }
        int i22 = i20 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
        int i23 = i22 % 2;
        return 1;
    }

    zzaz(zzai zzaiVar, zzg zzgVar) {
        this.zza = zzaiVar;
        this.zzb = zzgVar;
    }
}
