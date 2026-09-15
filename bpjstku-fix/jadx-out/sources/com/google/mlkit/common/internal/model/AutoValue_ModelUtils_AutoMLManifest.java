package com.google.mlkit.common.internal.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_ModelUtils_AutoMLManifest extends ModelUtils.AutoMLManifest {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private static final byte[] $$c = {51, -5, 77, 89};
    private static final int $$d = 57;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {109, 84, -87, -114, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 176;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45565, 7782, 61136, 48978, 4003, 56337, 44160, 31934, 52563, 40411, 27258, 14995, 35605, 23403, 11248, 63573, 18609, 6411, 59800, 46607, 1647, 54995, 45561, 7780, 61141, 48976, 4031, 56349, 44160, 31938, 52569, 40393, 27192, 15028, 35589, 23413, 11233, 13832, 39319, 26940, 14527, 34844, 23530, 11131, 64256, 19109, 6776, 60921, 48455, 3297, 56466, 44063, 32675, 12442, 40707, 28606, 15905, 36567, 23934, 11775, 64902, 19483, 7334, 60232, 48071, 2624, 55832, 43663, 31034};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6130490795965211128L;

    AutoValue_ModelUtils_AutoMLManifest(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null modelType");
        }
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null modelFile");
        }
        int i = b + 41;
        int i2 = i % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
        int i3 = i % 2;
        this.zzb = str2;
        if (str3 == null) {
            throw new NullPointerException("Null labelsFile");
        }
        int i4 = i2 + 105;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.zzc = str3;
            throw null;
        }
        this.zzc = str3;
        int i5 = i2 + 41;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 84 - r8
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest.$$a
            int r7 = r7 * 3
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest.c(short, byte, byte, java.lang.Object[]):void");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.zza.hashCode();
        int iHashCode2 = ((((iHashCode ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == this) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
            b = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof ModelUtils.AutoMLManifest))) {
            int i4 = b + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                this.zza.equals(((ModelUtils.AutoMLManifest) obj).getModelType());
                throw null;
            }
            ModelUtils.AutoMLManifest autoMLManifest = (ModelUtils.AutoMLManifest) obj;
            if (this.zza.equals(autoMLManifest.getModelType()) && this.zzb.equals(autoMLManifest.getModelFile()) && this.zzc.equals(autoMLManifest.getLabelsFile())) {
                int i5 = b + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x01c0  */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        char c2;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $10 + 55;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            c2 = '0';
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), View.resolveSize(0, 0) + 2187, 40 - (ViewConfiguration.getTouchSlop() >> 8), 841711447, false, $$e(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33016 - TextUtils.indexOf((CharSequence) "", '0', 0)), 3011 - Color.green(0), 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 36505), 3375 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -968507904, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (-b8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36504 - TextUtils.lastIndexOf("", c2, 0)), TextUtils.lastIndexOf("", c2, 0) + 3377, 17 - View.MeasureSpec.makeMeasureSpec(0, 0), -968507904, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i7 = $11 + 13;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            c2 = '0';
        }
        objArr[0] = new String(cArr);
    }

    public final String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 40 - KeyEvent.getDeadChar(0, 0), 19 - KeyEvent.keyCodeFromString(""), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        Object obj = null;
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 23, (char) Drawable.resolveOpacity(0, 0), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 22, 14 - TextUtils.indexOf((CharSequence) "", '0'), (char) (Process.myPid() >> 22), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 471;
        long j2 = (j * 3161541941962759355L) + (j * (-1064284767220800368L));
        long j3 = -470;
        long j4 = -1;
        long j5 = j4 ^ (-1064284767220800368L);
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = ((jIdentityHashCode ^ j4) | (-289655730339709765L)) ^ j4;
        long j7 = j2 + (j3 * (-289655730339709765L)) + (j3 * ((((j4 ^ 3161541941962759355L) | j5) ^ j4) | ((j5 | jIdentityHashCode) ^ j4) | j6)) + (((long) 470) * ((j4 ^ (jIdentityHashCode | (j5 | 3161541941962759355L))) | j6));
        int i6 = 0;
        while (true) {
            if (i6 == 10) {
                Object[] objArr3 = new Object[1];
                a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, (char) (View.MeasureSpec.getMode(0) + 34814), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(53 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Process.getGidForName("") + 17, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33134), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-1895222945};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 46038), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1134, TextUtils.getOffsetBefore("", 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1659362889, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1030;
                        int iAlpha = Color.alpha(0) + 15;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, i7, iAlpha, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ExpandableListView.getPackedPositionChild(0L)), 1118 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    int i8 = ((int[]) objArr8[1])[0];
                    int i9 = ((int[]) objArr8[3])[0];
                    if (i9 == i8) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                        b = i10 % 128;
                        for (int i11 = i10 % 2 == 0 ? 1 : 0; i11 < strArr.length; i11++) {
                            arrayList.add(strArr[i11]);
                        }
                    }
                    int[] iArr = new int[i9];
                    int i12 = i9 - 1;
                    iArr[i12] = 1;
                    Toast.makeText((Context) null, iArr[((i9 * i12) % 2) - 1], 1).show();
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - TextUtils.indexOf("", "")), 59 - (ViewConfiguration.getTapTimeout() >> 16), 18 - (ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i13 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(obj);
            int i14 = i4;
            long j8 = jLongValue;
            while (true) {
                for (int i15 = i4; i15 != 8; i15++) {
                    i13 = (((((int) (j8 >> i15)) & 255) + (i13 << 6)) + (i13 << 16)) - i13;
                }
                if (i14 != 0) {
                    break;
                }
                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                b = i16 % 128;
                i14 = i16 % 2 == 0 ? i14 + 19 : i14 + 1;
                j8 = j7;
                i4 = 0;
            }
            if (i13 == i5) {
                break;
            }
            jLongValue -= 1024;
            i6++;
            i4 = 0;
            obj = null;
        }
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzc;
        StringBuilder sb = new StringBuilder("AutoMLManifest{modelType=");
        sb.append(str);
        sb.append(", modelFile=");
        sb.append(str2);
        sb.append(", labelsFile=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public final String getLabelsFile() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 7;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzc;
        int i5 = i2 + 101;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return str;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public final String getModelFile() {
        int i = 2 % 2;
        int i2 = b + 21;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.zzb;
        int i5 = i3 + 43;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public final String getModelType() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zza;
        int i5 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static String $$e(int i, short s, int i2) {
        int i3 = i2 * 2;
        byte[] bArr = $$c;
        int i4 = i + 4;
        int i5 = 115 - (s * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i5 = i4 + i6;
            i4 = i4;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i4 + 1;
            i7 = i8;
            i5 = bArr[i9] + i5;
            i4 = i9;
        }
    }
}
