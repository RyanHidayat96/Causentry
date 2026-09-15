package com.google.firebase.crashlytics.internal.model;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Application_Organization extends CrashlyticsReport.Session.Application.Organization {
    private final String clsId;

    private AutoValue_CrashlyticsReport_Session_Application_Organization(String str) {
        this.clsId = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public final String getClsId() {
        return this.clsId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Organization{clsId=");
        sb.append(this.clsId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.clsId.equals(((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
        return false;
    }

    public final int hashCode() {
        return this.clsId.hashCode() ^ 1000003;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    protected final CrashlyticsReport.Session.Application.Organization.Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: loaded from: classes6.dex */
    static final class Builder extends CrashlyticsReport.Session.Application.Organization.Builder {
        private String clsId;
        private static final byte[] $$c = {56, 94, 119, -19};
        private static final int $$f = 163;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {51, -5, 77, 89, -6, -55, 71, -14, -6, -4, -52, 50, 10, -6, 7, 3, -70, Base64.padSymbol, 8, -9, -13, -52, 29, 40, -9, -5, 4, -14, 12, -12, 1, -20, 18, 13, 1, -10, 7};
        private static final int $$e = 229;
        private static final byte[] $$a = {63, 56, -36, -117, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
        private static final int $$b = 248;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -749486780384147310L;

        private static void a(byte b, int i, short s, Object[] objArr) {
            int i2 = 14 - (b * 10);
            byte[] bArr = $$a;
            int i3 = (i * 3) + 97;
            byte[] bArr2 = new byte[s + 1];
            int i4 = -1;
            if (bArr == null) {
                i3 = (i3 + (-s)) - 5;
                i2++;
            }
            while (true) {
                i4++;
                bArr2[i4] = (byte) i3;
                if (i4 == s) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i3 = (i3 + (-bArr[i2])) - 5;
                    i2++;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 7
                int r5 = 105 - r5
                byte[] r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization.Builder.$$d
                int r6 = r6 * 33
                int r1 = 34 - r6
                int r7 = r7 * 33
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                int r6 = 33 - r6
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r5
                r5 = r6
                r4 = r2
                goto L2b
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L29
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L29:
                r3 = r0[r7]
            L2b:
                int r7 = r7 + 1
                int r5 = r5 + r3
                int r5 = r5 + 1
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization.Builder.c(short, int, short, java.lang.Object[]):void");
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Application.Organization organization) {
            this.clsId = organization.getClsId();
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            int i3 = $11 + 65;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (abortcapture.b < cArrB.length) {
                int i5 = $10 + 103;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i7 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 64838), 1356 - View.resolveSize(0, 0), 38 - View.MeasureSpec.getSize(0), 894276454, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.lastIndexOf("", '0') + 469, 12 - ImageFormat.getBitsPerPixel(0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
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
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public final CrashlyticsReport.Session.Application.Organization.Builder setClsId(String str) throws Throwable {
            int i;
            int length;
            Object[] objArr;
            char c;
            int i2 = 2 % 2;
            if (str == null) {
                throw new NullPointerException("Null clsId");
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                int i3 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                byte[] bArr = $$a;
                byte b = bArr[11];
                Object[] objArr2 = new Object[1];
                a((byte) (b + 1), b, bArr[8], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, iResolveOpacity, i3, -1199417970, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            b(new char[]{52324, 696, 52229, 30323, 57378, 46079, 43389, 18395, 467, 27669, 10159, 13649, 56235, 63583, 43989, 49660, 28525, 33967, 8031, 19962, 58185, 4303, 33591, 55712, 30487, 40151}, Drawable.resolveOpacity(0, 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(new char[]{5490, 45007, 5399, 61994, 19799, 14243, 9348, 40657, 35880, 49518, 41974, 47318, 695, 21818, 12238, 19488, 46699, 10694, 39703}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                int iAxisFromString = MotionEvent.axisFromString("") + 877;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                byte b2 = $$a[11];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                a(b3, (byte) (b3 + 1), b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, iAxisFromString, edgeSlop, 254769921, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int i4 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[11];
                    Object[] objArr6 = new Object[1];
                    a(b4, b4, bArr2[10], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, i4, iLastIndexOf, 1324201839, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i5 = ~((int) Process.getElapsedCpuTime());
                int i6 = 1889774804 + (((~((-822136939) | i5)) | 781826709) * (-933)) + (((~(i5 | 781826709)) | (-1067055872)) * 933) + 114678967;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                c = 2;
            } else {
                if (str != null) {
                    length = str.length();
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    i = 2;
                    int i10 = i9 % 2;
                } else {
                    i = 2;
                    length = 0;
                }
                int i11 = TuitionPaymentFragmentbindingInflater1 + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                int i12 = i11 % i;
                try {
                    Object[] objArr8 = new Object[i];
                    objArr8[1] = -761418834;
                    objArr8[0] = Integer.valueOf(length);
                    byte[] bArr3 = $$d;
                    byte b5 = (byte) (bArr3[30] - 1);
                    byte b6 = b5;
                    Object[] objArr9 = new Object[1];
                    c(b5, b6, b6, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b7 = bArr3[30];
                    byte b8 = b7;
                    Object[] objArr10 = new Object[1];
                    c(b7, b8, b8, objArr10);
                    objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                        int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[11];
                        Object[] objArr11 = new Object[1];
                        a(b9, b9, bArr4[10], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, minimumFlingVelocity, deadChar, 1324201839, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr12 = new Object[1];
                        b(new char[]{52324, 696, 52229, 30323, 57378, 46079, 43389, 18395, 467, 27669, 10159, 13649, 56235, 63583, 43989, 49660, 28525, 33967, 8031, 19962, 58185, 4303, 33591, 55712, 30487, 40151}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        b(new char[]{5490, 45007, 5399, 61994, 19799, 14243, 9348, 40657, 35880, 49518, 41974, 47318, 695, 21818, 12238, 19488, 46699, 10694, 39703}, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                            int size = 10 - View.MeasureSpec.getSize(0);
                            byte b10 = $$a[11];
                            byte b11 = b10;
                            Object[] objArr14 = new Object[1];
                            a(b11, (byte) (b11 + 1), b10, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, absoluteGravity, size, 254769921, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int iIndexOf = 10 - TextUtils.indexOf("", "", 0);
                            byte[] bArr5 = $$a;
                            byte b12 = bArr5[11];
                            Object[] objArr15 = new Object[1];
                            a((byte) (b12 + 1), b12, bArr5[8], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, pressedStateDuration, iIndexOf, -1199417970, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                        c = 2;
                        int i14 = i13 % 2;
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
            int i15 = ((int[]) objArr[c])[0];
            int i16 = ((int[]) objArr[0])[0];
            if (i16 == i15) {
                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                int i18 = i17 % 2;
                int i19 = ((int[]) objArr[1])[0];
                Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i20 = ~iMaxMemory;
                int i21 = i19 + 560637028 + (((~(946512763 | i20)) | (-986822993) | (~((-946512764) | iMaxMemory))) * (-564)) + ((~(iMaxMemory | (-943759697))) * 1128) + (((~((-986822993) | i20)) | 2753067) * 564);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr16[1])[0] = i23 ^ (i23 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    for (String str2 : strArr) {
                        arrayList.add(str2);
                    }
                }
                int[] iArr = new int[i16];
                int i24 = i16 - 1;
                iArr[i24] = 1;
                Toast.makeText((Context) null, iArr[((i16 * i24) % 2) - 1], 1).show();
                int i25 = ((int[]) objArr[1])[0];
                Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i26 = (-1180109228) + (((~(1057401140 | iIdentityHashCode)) | (-1017090912)) * 672);
                int i27 = ~iIdentityHashCode;
                int i28 = i25 + i26 + (((~(iIdentityHashCode | (-1017090912))) | (~((-1057401141) | i27))) * (-672)) + (((~(1017090911 | i27)) | (-1067432832)) * 672);
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr17[1])[0] = i30 ^ (i30 << 5);
            }
            this.clsId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public final CrashlyticsReport.Session.Application.Organization build() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            if (this.clsId == null) {
                throw new IllegalStateException("Missing required properties: clsId");
            }
            AutoValue_CrashlyticsReport_Session_Application_Organization autoValue_CrashlyticsReport_Session_Application_Organization = new AutoValue_CrashlyticsReport_Session_Application_Organization(this.clsId);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return autoValue_CrashlyticsReport_Session_Application_Organization;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, int r7, short r8) {
            /*
                byte[] r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization.Builder.$$c
                int r8 = r8 * 3
                int r1 = r8 + 1
                int r6 = r6 * 2
                int r6 = r6 + 107
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L2a
            L14:
                r3 = r2
            L15:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2a:
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization.Builder.$$g(short, int, short):java.lang.String");
        }
    }
}
