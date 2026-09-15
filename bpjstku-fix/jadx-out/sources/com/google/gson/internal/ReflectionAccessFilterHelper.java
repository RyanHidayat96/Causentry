package com.google.gson.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import com.google.gson.ReflectionAccessFilter;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public class ReflectionAccessFilterHelper {
    private ReflectionAccessFilterHelper() {
    }

    public static boolean isJavaType(Class<?> cls) {
        return isJavaType(cls.getName());
    }

    private static boolean isJavaType(String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }

    public static boolean isAndroidType(Class<?> cls) {
        return isAndroidType(cls.getName());
    }

    private static boolean isAndroidType(String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || isJavaType(str);
    }

    public static boolean isAnyPlatformType(Class<?> cls) {
        String name = cls.getName();
        return isAndroidType(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static ReflectionAccessFilter.FilterResult getFilterResult(List<ReflectionAccessFilter> list, Class<?> cls) {
        Iterator<ReflectionAccessFilter> it = list.iterator();
        while (it.hasNext()) {
            ReflectionAccessFilter.FilterResult filterResultCheck = it.next().check(cls);
            if (filterResultCheck != ReflectionAccessFilter.FilterResult.INDECISIVE) {
                return filterResultCheck;
            }
        }
        return ReflectionAccessFilter.FilterResult.ALLOW;
    }

    public static boolean canAccess(AccessibleObject accessibleObject, Object obj) {
        return AccessChecker.INSTANCE.canAccess(accessibleObject, obj);
    }

    static abstract class AccessChecker {
        public static final AccessChecker INSTANCE;

        public abstract boolean canAccess(AccessibleObject accessibleObject, Object obj);

        private AccessChecker() {
        }

        static {
            AccessChecker accessChecker;
            if (JavaVersion.isJava9OrLater()) {
                try {
                    final Method declaredMethod = AccessibleObject.class.getDeclaredMethod("canAccess", Object.class);
                    accessChecker = new AccessChecker() { // from class: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.1
                        private static final byte[] $$c = {0, -94, -62, -97};
                        private static final int $$f = 210;
                        private static int $10 = 0;
                        private static int $11 = 1;
                        private static final byte[] $$d = {38, 31, -70, -1, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 53, 15, -8, 16, -1, -4, -3, -52, 65, -10, 21, -13, 15, -7, -6, 13, -60, 53, 17, 2, -12, 1, 19, -66, 28, 31, -2, 5, 3, 15, -46, 37, 5, -5, 23, -11, 8, 5};
                        private static final int $$e = 10;
                        private static final byte[] $$a = {114, -59, 10, 31, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
                        private static final int $$b = 179;
                        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        private static int TuitionPaymentFragmentbindingInflater1 = 1;
                        private static char[] b = {60040, 60048, 60042, 60053, 60055, 60060, 60047, 60073, 60063, 60072, 60049, 60062, 60056, 60117, 60058, 60050, 60083, 60054, 60041, 60051, 60052, 60045, 60034, 60043, 60088};
                        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57188;

                        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static void a(short r7, byte r8, byte r9, java.lang.Object[] r10) {
                            /*
                                int r9 = r9 * 3
                                int r9 = r9 + 97
                                int r7 = r7 * 10
                                int r7 = r7 + 4
                                byte[] r0 = com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.AnonymousClass1.$$a
                                int r8 = r8 + 1
                                byte[] r1 = new byte[r8]
                                r2 = 0
                                if (r0 != 0) goto L15
                                r3 = r9
                                r5 = r2
                                r9 = r7
                                goto L2b
                            L15:
                                r3 = r2
                            L16:
                                byte r4 = (byte) r9
                                int r5 = r3 + 1
                                r1[r3] = r4
                                if (r5 != r8) goto L25
                                java.lang.String r7 = new java.lang.String
                                r7.<init>(r1, r2)
                                r10[r2] = r7
                                return
                            L25:
                                r3 = r0[r7]
                                r6 = r9
                                r9 = r7
                                r7 = r3
                                r3 = r6
                            L2b:
                                int r3 = r3 + r7
                                int r7 = r9 + 1
                                int r9 = r3 + (-5)
                                r3 = r5
                                goto L16
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.AnonymousClass1.a(short, byte, byte, java.lang.Object[]):void");
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static void d(byte r6, short r7, byte r8, java.lang.Object[] r9) {
                            /*
                                byte[] r0 = com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.AnonymousClass1.$$d
                                int r7 = 99 - r7
                                int r6 = r6 * 48
                                int r1 = r6 + 1
                                int r8 = r8 * 48
                                int r8 = 51 - r8
                                byte[] r1 = new byte[r1]
                                r2 = 0
                                if (r0 != 0) goto L15
                                r7 = r6
                                r3 = r8
                                r4 = r2
                                goto L2d
                            L15:
                                r3 = r2
                            L16:
                                byte r4 = (byte) r7
                                int r8 = r8 + 1
                                r1[r3] = r4
                                if (r3 != r6) goto L25
                                java.lang.String r6 = new java.lang.String
                                r6.<init>(r1, r2)
                                r9[r2] = r6
                                return
                            L25:
                                r4 = r0[r8]
                                int r3 = r3 + 1
                                r5 = r3
                                r3 = r8
                                r8 = r4
                                r4 = r5
                            L2d:
                                int r7 = r7 + r8
                                int r7 = r7 + (-2)
                                r8 = r3
                                r3 = r4
                                goto L16
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.AnonymousClass1.d(byte, short, byte, java.lang.Object[]):void");
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                            int i2;
                            Object obj;
                            int i3 = 2 % 2;
                            deInitSession deinitsession = new deInitSession();
                            char[] cArr2 = b;
                            int i4 = 1770390596;
                            Object obj2 = null;
                            int i5 = 8;
                            if (cArr2 != null) {
                                int i6 = $10 + 15;
                                $11 = i6 % 128;
                                int i7 = i6 % 2;
                                int length = cArr2.length;
                                char[] cArr3 = new char[length];
                                int i8 = 0;
                                while (i8 < length) {
                                    try {
                                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> i5);
                                            int iIndexOf = 2266 - TextUtils.indexOf((CharSequence) "", '0');
                                            int iRgb = (-16777183) - Color.rgb(0, 0, 0);
                                            byte b3 = $$c[0];
                                            byte b4 = (byte) (b3 - 1);
                                            byte b5 = b3;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, iIndexOf, iRgb, -1927765101, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                        }
                                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                        i8++;
                                        i4 = 1770390596;
                                        i5 = 8;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                cArr2 = cArr3;
                            }
                            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int iMyPid = 2267 - (Process.myPid() >> 22);
                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33;
                                byte b6 = $$c[0];
                                byte b7 = (byte) (b6 - 1);
                                byte b8 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iMyPid, maximumFlingVelocity, -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            char[] cArr4 = new char[i];
                            if (i % 2 != 0) {
                                int i9 = $10 + 105;
                                $11 = i9 % 128;
                                int i10 = i9 % 2;
                                i2 = i - 1;
                                cArr4[i2] = (char) (cArr[i2] - b2);
                            } else {
                                i2 = i;
                            }
                            char c2 = 11;
                            if (i2 > 1) {
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                        obj = obj2;
                                    } else {
                                        Object[] objArr4 = new Object[13];
                                        objArr4[12] = deinitsession;
                                        objArr4[c2] = Integer.valueOf(cCharValue);
                                        objArr4[10] = deinitsession;
                                        objArr4[9] = deinitsession;
                                        objArr4[8] = Integer.valueOf(cCharValue);
                                        objArr4[7] = deinitsession;
                                        objArr4[6] = deinitsession;
                                        objArr4[5] = Integer.valueOf(cCharValue);
                                        objArr4[4] = deinitsession;
                                        objArr4[3] = deinitsession;
                                        objArr4[2] = Integer.valueOf(cCharValue);
                                        objArr4[1] = deinitsession;
                                        objArr4[0] = deinitsession;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char cKeyCodeFromString = (char) (49267 - KeyEvent.keyCodeFromString(""));
                                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 3261;
                                            int iGreen = 30 - Color.green(0);
                                            byte b9 = $$c[0];
                                            byte b10 = (byte) (b9 - 1);
                                            byte b11 = b9;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, threadPriority, iGreen, -127612708, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                        }
                                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char deadChar = (char) (22878 - KeyEvent.getDeadChar(0, 0));
                                                int packedPositionType = 594 - ExpandableListView.getPackedPositionType(0L);
                                                int offsetAfter = 17 - TextUtils.getOffsetAfter("", 0);
                                                byte b12 = $$c[0];
                                                byte b13 = (byte) (b12 - 1);
                                                byte b14 = b12;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, packedPositionType, offsetAfter, 1570859318, false, $$g(b13, b14, (byte) (b14 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                            }
                                            obj = null;
                                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                                        } else {
                                            obj = null;
                                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                                int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                                            } else {
                                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                            }
                                        }
                                    }
                                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                                    obj2 = obj;
                                    c2 = 11;
                                }
                            }
                            int i16 = $10 + 11;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            for (int i18 = 0; i18 < i; i18++) {
                                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                            }
                            objArr[0] = new String(cArr4);
                        }

                        @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                        public boolean canAccess(AccessibleObject accessibleObject, Object obj) throws Throwable {
                            Object[] objArr;
                            int i = 2 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                                int i2 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                byte[] bArr = $$a;
                                byte b2 = bArr[11];
                                Object[] objArr2 = new Object[1];
                                a(b2, bArr[2], b2, objArr2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, maximumDrawingCacheSize, -1199417970, false, (String) objArr2[0], null);
                            }
                            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                            Object[] objArr3 = new Object[1];
                            c(new char[]{'\r', 4, '\r', 23, 0, 20, '\r', 18, 0, 5, 14, '\b', 20, 2, 11, 16, 19, 22, 0, 24, 11, 2}, (byte) (95 - TextUtils.getOffsetAfter("", 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, objArr3);
                            Class<?> cls = Class.forName((String) objArr3[0]);
                            Object[] objArr4 = new Object[1];
                            c(new char[]{14, 1, '\r', 24, 1, '\n', '\t', '\b', '\f', '\n', 1, '\t', 16, 18, 13870}, (byte) (47 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 10;
                                byte b3 = (byte) ($$b & 5);
                                byte b4 = $$a[11];
                                Object[] objArr5 = new Object[1];
                                a(b3, b4, (byte) (b4 + 1), objArr5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, fadingEdgeLength, iKeyCodeFromString, 254769921, false, (String) objArr5[0], null);
                            }
                            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                int i3 = TuitionPaymentFragmentbindingInflater1 + 37;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                                int i4 = i3 % 2;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
                                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
                                    byte b5 = (byte) ($$b & 5);
                                    byte[] bArr2 = $$a;
                                    Object[] objArr6 = new Object[1];
                                    a(b5, bArr2[12], bArr2[11], objArr6);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, packedPositionChild, offsetBefore, 1324201839, false, (String) objArr6[0], null);
                                }
                                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                int i5 = ~iUptimeMillis;
                                int i6 = (-810060588) + ((537182240 | i5) * (-192)) + (((~(785301605 | i5)) | 288429594) * (-384)) + (((~(iUptimeMillis | (-248119366))) | (~(i5 | 1073731199)) | (~((-288429595) | iUptimeMillis))) * DerHeader.TAG_CLASS_PRIVATE) + 1962714568;
                                int i7 = (i6 << 13) ^ i6;
                                int i8 = i7 ^ (i7 >>> 17);
                                ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                            } else {
                                Object[] objArr8 = new Object[1];
                                c(new char[]{11, '\n', 24, 11, 14, 3, '\r', 4, '\b', '\n', 7, 24, 1, 5, '\f', 16}, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 66), 15 - Process.getGidForName(""), objArr8);
                                Class<?> cls2 = Class.forName((String) objArr8[0]);
                                Object[] objArr9 = new Object[1];
                                c(new char[]{18, 5, '\r', 1, 5, 16, 7, 21, 19, 11, 4, 15, 20, 21, 6, '\r'}, (byte) (123 - Color.blue(0)), 15 - TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
                                try {
                                    Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 1962714568};
                                    byte[] bArr3 = $$d;
                                    byte b6 = bArr3[35];
                                    Object[] objArr11 = new Object[1];
                                    d(b6, bArr3[5], b6, objArr11);
                                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                                    byte b7 = bArr3[5];
                                    Object[] objArr12 = new Object[1];
                                    d(b7, bArr3[35], b7, objArr12);
                                    objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int iAxisFromString = 875 - MotionEvent.axisFromString("");
                                        int i9 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        byte b8 = (byte) ($$b & 5);
                                        byte[] bArr4 = $$a;
                                        byte b9 = bArr4[12];
                                        byte b10 = bArr4[11];
                                        Object[] objArr13 = new Object[1];
                                        a(b8, b9, b10, objArr13);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iAxisFromString, i9, 1324201839, false, (String) objArr13[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                    try {
                                        Object[] objArr14 = new Object[1];
                                        c(new char[]{'\r', 4, '\r', 23, 0, 20, '\r', 18, 0, 5, 14, '\b', 20, 2, 11, 16, 19, 22, 0, 24, 11, 2}, (byte) (View.MeasureSpec.getSize(0) + 95), 22 - TextUtils.indexOf("", ""), objArr14);
                                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                                        Object[] objArr15 = new Object[1];
                                        c(new char[]{14, 1, '\r', 24, 1, '\n', '\t', '\b', '\f', '\n', 1, '\t', 16, 18, 13870}, (byte) ((Process.myPid() >> 22) + 47), 15 - View.MeasureSpec.getSize(0), objArr15);
                                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                        Long lValueOf = Long.valueOf(jLongValue2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 876;
                                            int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9;
                                            byte b11 = (byte) ($$b & 5);
                                            byte b12 = $$a[11];
                                            Object[] objArr16 = new Object[1];
                                            a(b11, b12, (byte) (b12 + 1), objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, offsetAfter, i10, 254769921, false, (String) objArr16[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                            int scrollBarFadeDuration = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            int longPressTimeout = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                            byte[] bArr5 = $$a;
                                            byte b13 = bArr5[11];
                                            Object[] objArr17 = new Object[1];
                                            a(b13, bArr5[2], b13, objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, scrollBarFadeDuration, longPressTimeout, -1199417970, false, (String) objArr17[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
                            int i11 = ((int[]) objArr[2])[0];
                            int i12 = ((int[]) objArr[0])[0];
                            if (i12 != i11) {
                                ArrayList arrayList = new ArrayList();
                                String[] strArr = (String[]) objArr[3];
                                if (strArr != null) {
                                    for (String str : strArr) {
                                        arrayList.add(str);
                                    }
                                }
                                throw new RuntimeException(String.valueOf(i12));
                            }
                            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                            int i14 = i13 % 2;
                            int i15 = ((int[]) objArr[1])[0];
                            Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                            int i16 = i15 + (-1912613915) + (((~(startUptimeMillis | (-996860543))) | 1037170771) * 191) + (((~((~startUptimeMillis) | (-996860543))) | 960553042) * 191);
                            int i17 = (i16 << 13) ^ i16;
                            int i18 = i17 ^ (i17 >>> 17);
                            Object obj2 = objArr18[1];
                            ((int[]) obj2)[0] = i18 ^ (i18 << 5);
                            try {
                                Method method = declaredMethod;
                                int i19 = ((int[]) obj2)[0];
                                int i20 = i19 * i19;
                                int i21 = -(977192410 * i19);
                                int i22 = (((i20 ^ i21) + ((i20 & i21) << 1)) - (~(-(i19 * 1028224600)))) - 1;
                                int i23 = (i22 ^ (-1613635983)) + (((-1613635983) & i22) << 1);
                                int i24 = ((i23 >> 21) - 4095) / 2048;
                                int i25 = (i24 & 1) + (i24 | 1);
                                int i26 = (i23 ^ i25) + ((i25 & i23) << 1);
                                int i27 = i23 >> 26;
                                int i28 = ((i27 ^ ComposerKt.defaultsKey) + ((i27 & ComposerKt.defaultsKey) << 1)) / 64;
                                int i29 = -(i26 ^ ((i28 ^ 1) + ((i28 & 1) << 1)));
                                int i30 = (i29 ^ 9) + ((i29 & 9) << 1);
                                int i31 = i30 >> 26;
                                int i32 = (((i31 & ComposerKt.defaultsKey) + (i31 | ComposerKt.defaultsKey)) / 64) + 1;
                                Object[] objArr19 = new Object[1530 / (((-((i32 & 1) + (i32 | 1))) & i30) * 170)];
                                objArr19[0] = obj;
                                return ((Boolean) method.invoke(accessibleObject, objArr19)).booleanValue();
                            } catch (Exception e2) {
                                throw new RuntimeException("Failed invoking canAccess", e2);
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static java.lang.String $$g(int r7, byte r8, short r9) {
                            /*
                                int r9 = r9 + 113
                                int r7 = r7 + 4
                                int r8 = r8 * 2
                                int r8 = r8 + 1
                                byte[] r0 = com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.AnonymousClass1.$$c
                                byte[] r1 = new byte[r8]
                                r2 = 0
                                if (r0 != 0) goto L13
                                r3 = r9
                                r5 = r2
                                r9 = r7
                                goto L29
                            L13:
                                r3 = r2
                            L14:
                                byte r4 = (byte) r9
                                int r5 = r3 + 1
                                r1[r3] = r4
                                int r7 = r7 + 1
                                if (r5 != r8) goto L23
                                java.lang.String r7 = new java.lang.String
                                r7.<init>(r1, r2)
                                return r7
                            L23:
                                r3 = r0[r7]
                                r6 = r9
                                r9 = r7
                                r7 = r3
                                r3 = r6
                            L29:
                                int r7 = -r7
                                int r7 = r7 + r3
                                r3 = r5
                                r6 = r9
                                r9 = r7
                                r7 = r6
                                goto L14
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.AnonymousClass1.$$g(int, byte, short):java.lang.String");
                        }
                    };
                } catch (NoSuchMethodException unused) {
                    accessChecker = null;
                }
            } else {
                accessChecker = null;
            }
            if (accessChecker == null) {
                accessChecker = new AccessChecker() { // from class: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.2
                    @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                    public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                        return true;
                    }
                };
            }
            INSTANCE = accessChecker;
        }
    }
}
