package com.dynatrace.android.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import defpackage.CaptureSession1;
import defpackage.ViewPortBuilder;
import defpackage.computeCropRectFromAspectRatio;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import defpackage.onScroll;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class Application extends android.app.Application {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int $10;
    private static int $11;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;
    private static char b;
    private static final byte[] $$c = {1, 115, -83, 116};
    private static final int $$f = 110;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 1
            int r6 = r6 + 84
            byte[] r1 = com.dynatrace.android.app.Application.$$a
            int r8 = 213 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L28
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            r8 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.app.Application.c(int, short, int, java.lang.Object[]):void");
    }

    private static void d(short s, byte b2, byte b3, Object[] objArr) {
        int i = 513 - s;
        byte[] bArr = $$d;
        int i2 = 114 - b3;
        byte[] bArr2 = new byte[76 - b2];
        int i3 = 75 - b2;
        int i4 = -1;
        if (bArr == null) {
            i++;
            i2 = (i + (-i2)) - 2;
        }
        while (true) {
            int i5 = i2;
            int i6 = i;
            i4++;
            bArr2[i4] = (byte) i5;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i = i6 + 1;
                i2 = (i5 + (-bArr[i6])) - 2;
            }
        }
    }

    public Application() {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0d04  */
    /* JADX WARN: Code duplicated, block: B:30:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:33:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:361:0x23b9  */
    @Override // android.app.Application
    public /* synthetic */ void onCreate() throws Throwable {
        String str;
        String str2;
        Object[] objArr;
        char c;
        String str3;
        String str4;
        Object[] objArr2;
        char c2;
        int i;
        String str5;
        Object[] objArr3;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i2;
        Object[] objArr4;
        Object[] objArr5;
        int i3;
        String str6;
        Object[] objArr6;
        Object[] objArr7;
        String str7;
        int i4;
        Object[] objArr8;
        Object[] objArr9;
        String str8;
        Object[] objArr10;
        int i5;
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            super.onCreate();
            return;
        }
        int i6 = 2 % 2;
        String str9 = "android.app.ActivityThread";
        String str10 = "currentApplication";
        Object[] objArr11 = new Object[1];
        a(new char[]{36435, 16645, 3025, 58089, 24121, 53018, 31287, 7549, 42729, 14583, 56889, 41604, 14131, 1033, 38892, 40402, 23260, 64698, 6590, 15088, 10820, 20469, 36544, 17218}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr11);
        String str11 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        a(new char[]{7896, 23026, 59534, 21514, 13675, 32571, 52665, 40173, 20066, 60110, 55380, 28126, 34384, 46837, 43735, 63866, 56012, 44533}, 15 - View.resolveSize(0, 0), objArr12);
        String str12 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        a(new char[]{21376, 59550, 37480, 8470, 42753, 16753, 21286, 12870, 44860, 43942, 1992, 52724, 42536, 51944, 57654, 64777, 45054, 40410}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr13);
        String str13 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        a(new char[]{46620, 9717, 10330, 59809, 1932, 16784, 55228, 26445, 36595, 47371, 57063, 30575, 20374, 20660, 35161, 37225, 12922, 15497}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr14);
        String str14 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a(new char[]{13251, 42430, 6887, 64683, 10533, 19572, 18098, 57552, 62263, 41467, 44972, 18489, 56624, 12440, 54481, 3972, 14129, 18218, 50524, 44768, 16621, 64824, 38720, 48575, 16113, 7960, 46302, 54437}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 15, objArr15);
        String str15 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        a(new char[]{45194, 11447, 57433, 37311, 52924, 4257, 21732, 6918, 32377, 33691, 8006, 38634, 55469, 64557, 52546, 55466, 32132, 42539, 45008, 10837}, 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr16);
        String str16 = (String) objArr16[0];
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        super.onCreate();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 53892);
            int edgeSlop = 1320 - (ViewConfiguration.getEdgeSlop() >> 16);
            int maximumDrawingCacheSize = 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[205] + 1);
            byte b3 = bArr[7];
            Object[] objArr17 = new Object[1];
            c(b2, b3, (short) (b3 | 210), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, edgeSlop, maximumDrawingCacheSize, -1433084963, false, (String) objArr17[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 53893);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1320;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36;
            byte b4 = $$a[7];
            Object[] objArr18 = new Object[1];
            c(b4, (byte) (b4 | 37), (short) ($$b + 1), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, maxKeyCode, minimumFlingVelocity, -1273706634, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 53893);
                int packedPositionType = 1320 - ExpandableListView.getPackedPositionType(0L);
                int gidForName = Process.getGidForName("") + 37;
                byte b5 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(b5, (byte) (b5 | 52), (short) 173, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, packedPositionType, gidForName, -1920778747, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i7 = ((int[]) objArr20[0])[0];
            int i8 = ((int[]) objArr20[3])[0];
            String[] strArr = (String[]) objArr20[2];
            int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i10 = ~i9;
            int i11 = (((~((-562043905) | i10)) | (~(1033895384 | i9))) * 988) + 1724254156 + (((~(i9 | (-898776345))) | 336732440 | (~(i10 | 1033895384))) * 988) + 914415066;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
            str10 = "currentApplication";
            c = 3;
            str = str14;
            str2 = str12;
            str9 = "android.app.ActivityThread";
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str15).getMethod(str16, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i14 = TuitionPaymentFragmentbindingInflater1 + 119;
                asInterface = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 88 / 0;
                    if (baseContext instanceof ContextWrapper) {
                        if (((ContextWrapper) baseContext).getBaseContext() != null) {
                            baseContext = null;
                        }
                    }
                } else if (baseContext instanceof ContextWrapper) {
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = null;
                    }
                }
                baseContext = baseContext.getApplicationContext();
            }
            str = str14;
            int iIntValue = ((Integer) Class.forName(str13).getMethod(str, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr21 = {-388646113};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 47977), Color.argb(0, 0, 0, 0) + 1300, 20 - KeyEvent.keyCodeFromString(""), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr22 = {baseContext, "com.bpjstku", 914415066, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr21), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cResolveOpacity = (char) (53893 - Drawable.resolveOpacity(0, 0));
                    int defaultSize = View.getDefaultSize(0, 0) + 1320;
                    int i16 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 36;
                    byte b6 = $$a[7];
                    Object[] objArr23 = new Object[1];
                    c(b6, (byte) (b6 | 52), (short) 173, objArr23);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, defaultSize, i16, 819724799, false, (String) objArr23[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 57879), View.MeasureSpec.getMode(0) + 1394, TextUtils.getOffsetAfter("", 0) + 75), Boolean.TYPE});
                }
                Object[] objArr24 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr22);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetBefore = (char) (53893 - TextUtils.getOffsetBefore("", 0));
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1320;
                        int offsetAfter = 36 - TextUtils.getOffsetAfter("", 0);
                        byte b7 = $$a[7];
                        Object[] objArr25 = new Object[1];
                        c(b7, (byte) (b7 | 52), (short) 173, objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, scrollBarSize, offsetAfter, -1920778747, false, (String) objArr25[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr24);
                    try {
                        str2 = str12;
                        long jLongValue2 = ((Long) Class.forName(str11).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cNormalizeMetaState = (char) (53893 - KeyEvent.normalizeMetaState(0));
                            int minimumFlingVelocity2 = 1320 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iResolveSize = 36 - View.resolveSize(0, 0);
                            byte b8 = $$a[7];
                            Object[] objArr26 = new Object[1];
                            c(b8, (byte) (b8 | 37), (short) ($$b + 1), objArr26);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, minimumFlingVelocity2, iResolveSize, -1273706634, false, (String) objArr26[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char cAxisFromString = (char) (53892 - MotionEvent.axisFromString(""));
                            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 1320;
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36;
                            byte[] bArr2 = $$a;
                            byte b9 = (byte) (bArr2[205] + 1);
                            byte b10 = bArr2[7];
                            Object[] objArr27 = new Object[1];
                            c(b9, b10, (short) (b10 | 210), objArr27);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAxisFromString, offsetBefore2, maximumFlingVelocity, -1433084963, false, (String) objArr27[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr24 = objArr24;
                    str10 = "currentApplication";
                    str2 = str12;
                    str9 = "android.app.ActivityThread";
                }
                objArr = objArr24;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i17 = ((int[]) objArr[c])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 != i17) {
            throw new RuntimeException(String.valueOf(i18));
        }
        Object[] objArr28 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[0])[0];
        int i21 = ((int[]) objArr[3])[0];
        String[] strArr2 = (String[]) objArr[2];
        int iIdentityHashCode = System.identityHashCode(this);
        int i22 = ~iIdentityHashCode;
        int i23 = i19 + 326153952 + ((1065352687 | i22) * (-369)) + (((~((-327098756) | i22)) | 1043529069) * (-369)) + (((~(iIdentityHashCode | 327098755)) | 738253932 | (~(i22 | (-21823619)))) * 369);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr28[1])[0] = i25 ^ (i25 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c4 = (char) (37568 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int i26 = 626 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i27 = 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr3 = $$a;
            byte b11 = (byte) (bArr3[205] + 1);
            byte b12 = bArr3[7];
            Object[] objArr29 = new Object[1];
            c(b11, b12, (short) (b12 | 210), objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, i26, i27, -477065106, false, (String) objArr29[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str11).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37568);
            int iIndexOf = TextUtils.indexOf("", "") + 625;
            int defaultSize2 = View.getDefaultSize(0, 0) + 14;
            byte b13 = $$a[7];
            Object[] objArr30 = new Object[1];
            c(b13, (byte) (b13 | 52), (short) 121, objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(modifierMetaStateMask, iIndexOf, defaultSize2, -976899241, false, (String) objArr30[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char packedPositionGroup = (char) (37567 - ExpandableListView.getPackedPositionGroup(0L));
                int iRgb = (-16776591) - Color.rgb(0, 0, 0);
                int keyRepeatTimeout = 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b14 = $$a[7];
                Object[] objArr31 = new Object[1];
                c(b14, (byte) (b14 | 52), (short) 173, objArr31);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(packedPositionGroup, iRgb, keyRepeatTimeout, -973632554, false, (String) objArr31[0], null);
            }
            Object[] objArr32 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            int i28 = ((int[]) objArr32[2])[0];
            int i29 = ((int[]) objArr32[0])[0];
            String[] strArr3 = (String[]) objArr32[3];
            int[] iArr = {i28};
            int[] iArr2 = {i29};
            int iMyTid = Process.myTid();
            int i30 = ~iMyTid;
            int i31 = 1530953286 + (((~((-1281906127) | i30)) | 1277183172) * 98) + (((~(i30 | (-541831995))) | (-1281906127) | (~(541831994 | iMyTid))) * (-49)) + (((~(iMyTid | (-1281906127))) | (-1819015167)) * 49) + 2135427817;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr2[1])[0] = i33 ^ (i33 << 5);
            objArr2 = new Object[]{iArr2, new int[1], iArr, strArr3};
            str = str;
            c2 = 0;
            str4 = str2;
            str3 = str10;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str15).getMethod(str16, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            int iIntValue2 = ((Integer) Class.forName(str13).getMethod(str, Object.class).invoke(null, this)).intValue();
            str3 = str10;
            Object[] objArr33 = new Object[1];
            a(new char[]{48947, 28459, 42422, 51465, 62182, 34536, 10788, 26321, 43142, 35272, 17058, 52005, 58060, 36047, 13446, 41218, 61857, 62731, 60328, 13112, 25807, 43168, 57178, 65279, 10823, 5493, 43560, 6890, 19506, 56786, 48907, 6354, 54763, 3347, 20541, 57535, 47031, 49793, 5240, 13112, 9783, 27176, 2872, 34192, 54621, 47619, 41525, 5168, 42470, 57646, 35338, 33681, 3093, 13723, 28656, 48489, 41613, 5973, 37326, 57230, 1392, 57335, 13586, 40997, 20111, 27424}, ((Context) Class.forName(str9).getMethod(str3, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 28, objArr33);
            String str17 = (String) objArr33[0];
            Object[] objArr34 = new Object[1];
            a(new char[]{20883, 27278, 34080, 45455, 17690, 52568, 65148, 48289, 53053, 27143, 55042, 23595, 31271, 14052, 14957, 25575, 19574, 32096, 56994, 46176, 14501, 23101, 17471, 20329, 10553, 24229, 58366, 14983, 59321, 33578, 36315, 19915, 31718, 46069, 30278, 41040, 23776, 42269, 45444, 2630, 35264, 26073, 1093, 33594, 35098, 29295, 23933, 51103, 32789, 5179, 54663, 35827, 3030, 52807, 23709, 15509, 42550, 11287, 34670, 61680, 1922, 33381, 16014, 29157, 26481, 53501}, ((Context) Class.forName(str9).getMethod(str3, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_5).substring(1, 2).length() + 63, objArr34);
            try {
                Object[] objArr35 = {baseContext2, new String[]{str17, (String) objArr34[0]}, Integer.valueOf(iIntValue2), 17, 2135427817};
                short s = (short) ($$e | 265);
                byte[] bArr4 = $$d;
                Object[] objArr36 = new Object[1];
                d(s, bArr4[30], bArr4[25], objArr36);
                Class<?> cls = Class.forName((String) objArr36[0]);
                Object[] objArr37 = new Object[1];
                d((short) 437, (byte) (bArr4[66] - 1), bArr4[233], objArr37);
                Object[] objArr38 = (Object[]) cls.getMethod((String) objArr37[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr35);
                int i34 = ((int[]) objArr38[0])[0];
                int i35 = ((int[]) objArr38[2])[0];
                if (baseContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 37567);
                        int iGreen = 625 - Color.green(0);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 14;
                        byte b15 = $$a[7];
                        Object[] objArr39 = new Object[1];
                        c(b15, (byte) (b15 | 52), (short) 173, objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionGroup2, iGreen, trimmedLength, -973632554, false, (String) objArr39[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr38);
                    try {
                        str4 = str2;
                        long jLongValue4 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue4);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37568);
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 625;
                            int i36 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13;
                            byte b16 = $$a[7];
                            Object[] objArr40 = new Object[1];
                            c(b16, (byte) (b16 | 52), (short) 121, objArr40);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, fadingEdgeLength, i36, -976899241, false, (String) objArr40[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                            char cRed = (char) (37567 - Color.red(0));
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 625;
                            int mirror = '>' - AndroidCharacter.getMirror('0');
                            byte[] bArr5 = $$a;
                            byte b17 = (byte) (bArr5[205] + 1);
                            byte b18 = bArr5[7];
                            Object[] objArr41 = new Object[1];
                            c(b17, b18, (short) (b18 | 210), objArr41);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cRed, doubleTapTimeout, mirror, -477065106, false, (String) objArr41[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    str = str;
                    objArr38 = objArr38;
                    str4 = str2;
                }
                objArr2 = objArr38;
                c2 = 0;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i37 = ((int[]) objArr2[c2])[c2];
        int i38 = ((int[]) objArr2[2])[c2];
        if (i38 == i37) {
            int i39 = TuitionPaymentFragmentbindingInflater1 + 15;
            asInterface = i39 % 128;
            int i40 = i39 % 2;
            int i41 = ((int[]) objArr2[1])[0];
            int i42 = ((int[]) objArr2[2])[0];
            int i43 = ((int[]) objArr2[0])[0];
            String[] strArr4 = (String[]) objArr2[3];
            int[] iArr3 = {i42};
            int length = ((Context) Class.forName(str9).getMethod(str3, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 571665203;
            int i44 = i41 + ((((-655191944) + (((~length) | (-1396958455)) * 1444)) + (((~(length | 1605932703)) | ((~(217805417 | length)) | (-1610348288))) * (-1444))) - 713310772);
            int i45 = i44 ^ (i44 << 13);
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr[1])[0] = i46 ^ (i46 << 5);
            Object[] objArr42 = {new int[]{i43}, new int[1], iArr3, strArr4};
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr5 = (String[]) objArr2[3];
            if (strArr5 != null) {
                for (String str18 : strArr5) {
                    int i47 = TuitionPaymentFragmentbindingInflater1 + 93;
                    asInterface = i47 % 128;
                    int i48 = i47 % 2;
                    arrayList.add(str18);
                }
            }
            int[] iArr4 = new int[i38];
            int i49 = i38 - 1;
            iArr4[i49] = 1;
            Toast.makeText((Context) null, iArr4[((i38 * i49) % 2) - 1], 1).show();
            int i50 = ((int[]) objArr2[1])[0];
            int i51 = ((int[]) objArr2[2])[0];
            int i52 = ((int[]) objArr2[0])[0];
            String[] strArr6 = (String[]) objArr2[3];
            int[] iArr5 = {i51};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i53 = ~iIdentityHashCode2;
            int i54 = i50 + 120377344 + (((~((-1782298272) | i53)) | (-41439850) | (~(1782298271 | iIdentityHashCode2))) * (-564)) + ((~(iIdentityHashCode2 | (-4210785))) * 1128) + (((~((-41439850) | i53)) | (-1786509056)) * 564);
            int i55 = (i54 << 13) ^ i54;
            int i56 = i55 ^ (i55 >>> 17);
            i = 0;
            ((int[]) objArr[1])[0] = i56 ^ (i56 << 5);
            Object[] objArr43 = {new int[]{i52}, new int[1], iArr5, strArr6};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
            char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iResolveSizeAndState = View.resolveSizeAndState(i, i, i) + 2267;
            int bitsPerPixel = 32 - ImageFormat.getBitsPerPixel(i);
            byte b19 = $$a[7];
            Object[] objArr44 = new Object[1];
            c(b19, (byte) (b19 | 52), (short) 173, objArr44);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(scrollBarSize2, iResolveSizeAndState, bitsPerPixel, -887667012, false, (String) objArr44[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int iNormalizeMetaState = 2267 - KeyEvent.normalizeMetaState(0);
            int edgeSlop2 = 33 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b20 = $$a[7];
            Object[] objArr45 = new Object[1];
            c(b20, (byte) (b20 | 52), (short) 121, objArr45);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(threadPriority, iNormalizeMetaState, edgeSlop2, -874156483, false, (String) objArr45[0], null);
        }
        if (j3 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char offsetBefore3 = (char) TextUtils.getOffsetBefore("", 0);
                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 2268;
                int deadChar = KeyEvent.getDeadChar(0, 0) + 33;
                byte b21 = $$a[7];
                Object[] objArr46 = new Object[1];
                c(b21, (byte) (b21 | 37), (short) ($$b + 1), objArr46);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(offsetBefore3, bitsPerPixel2, deadChar, -654680577, false, (String) objArr46[0], null);
            }
            Object[] objArr47 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).get(null);
            objArr3 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i57 = ((int[]) objArr47[0])[0];
            int i58 = ((int[]) objArr47[3])[0];
            String[] strArr7 = (String[]) objArr47[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i59 = ((((~(847249135 | iIdentityHashCode3)) | 34308619) * 449) - 1772882755) + (((~((~iIdentityHashCode3) | 847249135)) | 34308619) * 449) + 1305838117;
            int i60 = (i59 << 13) ^ i59;
            int i61 = i60 ^ (i60 >>> 17);
            ((int[]) objArr3[2])[0] = i61 ^ (i61 << 5);
            str5 = str;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str15).getMethod(str16, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                int i62 = asInterface + 121;
                int i63 = i62 % 128;
                TuitionPaymentFragmentbindingInflater1 = i63;
                int i64 = i62 % 2;
                if (baseContext3 instanceof ContextWrapper) {
                    int i65 = i63 + 91;
                    asInterface = i65 % 128;
                    int i66 = i65 % 2;
                    if (((ContextWrapper) baseContext3).getBaseContext() != null) {
                        baseContext3 = baseContext3.getApplicationContext();
                    } else {
                        baseContext3 = null;
                    }
                } else {
                    baseContext3 = baseContext3.getApplicationContext();
                }
            }
            str5 = str;
            Object[] objArr48 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1305838117};
            short s2 = (short) 437;
            byte[] bArr6 = $$d;
            Object[] objArr49 = new Object[1];
            d(s2, bArr6[32], bArr6[25], objArr49);
            Class<?> cls2 = Class.forName((String) objArr49[0]);
            Object[] objArr50 = new Object[1];
            d(s2, (byte) (bArr6[66] - 1), bArr6[233], objArr50);
            Object[] objArr51 = (Object[]) cls2.getMethod((String) objArr50[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr48);
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                    int i67 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
                    int maximumFlingVelocity2 = 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b22 = $$a[7];
                    Object[] objArr52 = new Object[1];
                    c(b22, (byte) (b22 | 37), (short) ($$b + 1), objArr52);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cResolveOpacity2, i67, maximumFlingVelocity2, -654680577, false, (String) objArr52[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, objArr51);
                try {
                    long jLongValue6 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i68 = 2267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i69 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32;
                        byte b23 = $$a[7];
                        Object[] objArr53 = new Object[1];
                        c(b23, (byte) (b23 | 52), (short) 121, objArr53);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(jumpTapTimeout, i68, i69, -874156483, false, (String) objArr53[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int tapTimeout2 = 2267 - (ViewConfiguration.getTapTimeout() >> 16);
                        int size2 = 33 - View.MeasureSpec.getSize(0);
                        byte b24 = $$a[7];
                        Object[] objArr54 = new Object[1];
                        c(b24, (byte) (b24 | 52), (short) 173, objArr54);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(size, tapTimeout2, size2, -887667012, false, (String) objArr54[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                objArr51 = objArr51;
            }
            objArr3 = objArr51;
        }
        int i70 = ((int[]) objArr3[3])[0];
        int i71 = ((int[]) objArr3[0])[0];
        if (i71 == i70) {
            Object[] objArr55 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i72 = ((int[]) objArr3[2])[0];
            int i73 = ((int[]) objArr3[0])[0];
            int i74 = ((int[]) objArr3[3])[0];
            String[] strArr8 = (String[]) objArr3[1];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i75 = ~iIdentityHashCode4;
            int i76 = i72 + (-2028697069) + ((iIdentityHashCode4 | 695597461) * 140) + (((~(695597461 | i75)) | 109707850) * (-280)) + (((~(iIdentityHashCode4 | (-109707851))) | (~(113115854 | i75)) | 692189457) * 140);
            int i77 = (i76 << 13) ^ i76;
            int i78 = i77 ^ (i77 >>> 17);
            ((int[]) objArr55[2])[0] = i78 ^ (i78 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr9 = (String[]) objArr3[1];
            if (strArr9 != null) {
                for (String str19 : strArr9) {
                    arrayList2.add(str19);
                }
            }
            Toast.makeText((Context) null, i71 / (((i71 - 1) * i71) % 2), 0).show();
            Object[] objArr56 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i79 = ((int[]) objArr3[2])[0];
            int i80 = ((int[]) objArr3[0])[0];
            int i81 = ((int[]) objArr3[3])[0];
            String[] strArr10 = (String[]) objArr3[1];
            int iNextInt = new Random().nextInt();
            int i82 = ~iNextInt;
            int i83 = i79 + (-724584993) + (((~(597181635 | i82)) | 201569056) * (-108)) + (((~(i82 | 211531680)) | (~((-211531681) | iNextInt)) | 587219011) * 54) + ((iNextInt | 587219011) * 54);
            int i84 = (i83 << 13) ^ i83;
            int i85 = i84 ^ (i84 >>> 17);
            ((int[]) objArr56[2])[0] = i85 ^ (i85 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
            char packedPositionGroup3 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
            int minimumFlingVelocity3 = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i86 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            byte b25 = $$a[7];
            Object[] objArr57 = new Object[1];
            c(b25, (byte) (b25 | 37), (short) ($$b + 1), objArr57);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(packedPositionGroup3, minimumFlingVelocity3, i86, 986134021, false, (String) objArr57[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
            int i87 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            byte b26 = $$a[7];
            Object[] objArr58 = new Object[1];
            c(b26, (byte) (b26 | 52), (short) 69, objArr58);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cLastIndexOf, scrollBarFadeDuration, i87, 1596667560, false, (String) objArr58[0], null);
        }
        if (j4 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char c5 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                int trimmedLength2 = TextUtils.getTrimmedLength("") + 23;
                byte b27 = $$a[7];
                Object[] objArr59 = new Object[1];
                c(b27, (byte) (b27 | 52), (short) 173, objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(c5, iLastIndexOf, trimmedLength2, 1599039318, false, (String) objArr59[0], null);
            }
            Object[] objArr60 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr60[0])[0]}, new int[]{((int[]) objArr60[1])[0]}, (Object[]) objArr60[2], new int[1], (String[]) objArr60[4]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i88 = (-1406308614) + ((~((-337642001) | iIdentityHashCode5)) * (-301)) + (((~(338726832 | iIdentityHashCode5)) | (~((~iIdentityHashCode5) | 551329258))) * (-301)) + (((~(iIdentityHashCode5 | (-551329259))) | 338726832) * 301) + 1203555529;
            int i89 = (i88 << 13) ^ i88;
            int i90 = i89 ^ (i89 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i90 ^ (i90 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr61 = {-388646113};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b((char) (42049 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1726 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue3, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).newInstance(objArr61), 1203555529);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char doubleTapTimeout2 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                int i91 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte b28 = $$a[7];
                Object[] objArr62 = new Object[1];
                c(b28, (byte) (b28 | 52), (short) 173, objArr62);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(doubleTapTimeout2, maxKeyCode2, i91, 1599039318, false, (String) objArr62[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                long jLongValue8 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
                    int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
                    byte b29 = $$a[7];
                    Object[] objArr63 = new Object[1];
                    c(b29, (byte) (b29 | 52), (short) 69, objArr63);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(windowTouchSlop, packedPositionChild, windowTouchSlop2, 1596667560, false, (String) objArr63[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue8 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                    int offsetBefore4 = TextUtils.getOffsetBefore("", 0) + 23;
                    byte b30 = $$a[7];
                    Object[] objArr64 = new Object[1];
                    c(b30, (byte) (b30 | 37), (short) ($$b + 1), objArr64);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cIndexOf2, fadingEdgeLength2, offsetBefore4, 986134021, false, (String) objArr64[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf8);
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i92 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i93 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i93 == i92) {
            int i94 = TuitionPaymentFragmentbindingInflater1 + 9;
            asInterface = i94 % 128;
            int i95 = i94 % 2;
            int i96 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr65 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int i97 = ~((int) Runtime.getRuntime().maxMemory());
            int i98 = i96 + (-251538111) + (((~(i97 | 1073731566)) | (~((-738968865) | i97))) * (-184)) + ((273682564 | (~((-1012651429) | i97)) | (~(800049002 | i97))) * 184) + 1646156312;
            int i99 = (i98 << 13) ^ i98;
            int i100 = i99 ^ (i99 >>> 17);
            i2 = 0;
            ((int[]) objArr65[3])[0] = i100 ^ (i100 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr11 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr11 != null) {
                for (String str20 : strArr11) {
                    arrayList3.add(str20);
                }
            }
            int[] iArr6 = new int[i93];
            int i101 = i93 - 1;
            iArr6[i101] = 1;
            Toast.makeText((Context) null, iArr6[((i93 * i101) % 2) - 1], 1).show();
            int i102 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr66 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i103 = ~((-139382306) | iIdentityHashCode6);
            int i104 = ~iIdentityHashCode6;
            int i105 = i102 + (-106324479) + ((i103 | (~(73220120 | i104))) * (-1808)) + (((~((-4997121) | iIdentityHashCode6)) | (~(i104 | 207605305))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode6 | (-73220121))) | 134385185 | (~(139382305 | i104))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            i2 = 0;
            ((int[]) objArr66[3])[0] = i107 ^ (i107 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
            char cResolveOpacity3 = (char) (43042 - Drawable.resolveOpacity(i2, i2));
            int keyRepeatDelay = 3111 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i108 = 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte b31 = $$a[7];
            Object[] objArr67 = new Object[1];
            c(b31, (byte) (b31 | 52), (short) 121, objArr67);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cResolveOpacity3, keyRepeatDelay, i108, -1272852037, false, (String) objArr67[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
            char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 43043);
            int iIndexOf2 = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int windowTouchSlop3 = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte b32 = $$a[7];
            Object[] objArr68 = new Object[1];
            c(b32, (byte) (b32 | 52), (short) 173, objArr68);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(packedPositionChild2, iIndexOf2, windowTouchSlop3, -1269618118, false, (String) objArr68[0], null);
        }
        if (j5 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char cNormalizeMetaState2 = (char) (43042 - KeyEvent.normalizeMetaState(0));
                int packedPositionType2 = 3111 - ExpandableListView.getPackedPositionType(0L);
                int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                byte b33 = $$a[7];
                Object[] objArr69 = new Object[1];
                c(b33, (byte) (b33 | 37), (short) ($$b + 1), objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cNormalizeMetaState2, packedPositionType2, jumpTapTimeout2, 154975793, false, (String) objArr69[0], null);
            }
            Object[] objArr70 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
            int i109 = ((int[]) objArr70[2])[0];
            int i110 = ((int[]) objArr70[1])[0];
            String[] strArr12 = (String[]) objArr70[3];
            int[] iArr7 = {i109};
            int[] iArr8 = {i110};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i111 = ((((-2027574026) + (((~(elapsedCpuTime | 1129361226)) | (-575670233)) * (-465))) + ((1129361226 | (~((-575670233) | elapsedCpuTime))) * 930)) + ((elapsedCpuTime | (-536871057)) * 465)) - 655149445;
            int i112 = (i111 << 13) ^ i111;
            int i113 = i112 ^ (i112 >>> 17);
            ((int[]) objArr4[0])[0] = i113 ^ (i113 << 5);
            objArr4 = new Object[]{new int[1], iArr8, iArr7, strArr12};
        } else {
            Object[] objArr71 = {null, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -655149445};
            byte[] bArr7 = $$d;
            Object[] objArr72 = new Object[1];
            d((short) 366, (byte) 25, bArr7[25], objArr72);
            Class<?> cls3 = Class.forName((String) objArr72[0]);
            Object[] objArr73 = new Object[1];
            d((short) 437, (byte) (bArr7[66] - 1), bArr7[233], objArr73);
            objArr4 = (Object[]) cls3.getMethod((String) objArr73[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr71);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char c6 = (char) (43043 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int maximumFlingVelocity3 = 3111 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                byte b34 = $$a[7];
                Object[] objArr74 = new Object[1];
                c(b34, (byte) (b34 | 37), (short) ($$b + 1), objArr74);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c6, maximumFlingVelocity3, longPressTimeout, 154975793, false, (String) objArr74[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr4);
            try {
                long jLongValue10 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char doubleTapTimeout3 = (char) (43042 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int i114 = 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i115 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b35 = $$a[7];
                    Object[] objArr75 = new Object[1];
                    c(b35, (byte) (b35 | 52), (short) 173, objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(doubleTapTimeout3, i114, i115, -1269618118, false, (String) objArr75[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                    char c7 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43041);
                    int i116 = 3111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int scrollBarFadeDuration2 = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b36 = $$a[7];
                    Object[] objArr76 = new Object[1];
                    c(b36, (byte) (b36 | 52), (short) 121, objArr76);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c7, i116, scrollBarFadeDuration2, -1272852037, false, (String) objArr76[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf10);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i117 = ((int[]) objArr4[1])[0];
        int i118 = ((int[]) objArr4[2])[0];
        if (i118 != i117) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr13 = (String[]) objArr4[3];
            if (strArr13 != null) {
                int i119 = TuitionPaymentFragmentbindingInflater1 + 75;
                asInterface = i119 % 128;
                for (int i120 = i119 % 2 == 0 ? 1 : 0; i120 < strArr13.length; i120++) {
                    arrayList4.add(strArr13[i120]);
                }
            }
            throw new RuntimeException(String.valueOf(i118));
        }
        int i121 = ((int[]) objArr4[0])[0];
        int i122 = ((int[]) objArr4[2])[0];
        int i123 = ((int[]) objArr4[1])[0];
        String[] strArr14 = (String[]) objArr4[3];
        int[] iArr9 = {i123};
        String str21 = str3;
        int length2 = ((Context) Class.forName(str9).getMethod(str21, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1861098644;
        int i124 = ~length2;
        int i125 = i121 + 909100724 + (((~((-1557632928) | i124)) | (~((-147398532) | length2))) * 210) + (((~(length2 | (-1410760733))) | (~(i124 | (-526337)))) * 210);
        int i126 = (i125 << 13) ^ i125;
        int i127 = i126 ^ (i126 >>> 17);
        ((int[]) objArr[0])[0] = i127 ^ (i127 << 5);
        Object[] objArr77 = {new int[1], iArr9, new int[]{i122}, strArr14};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
            char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
            int iResolveSize2 = View.resolveSize(0, 0) + 15;
            byte b37 = $$a[7];
            Object[] objArr78 = new Object[1];
            c(b37, (byte) (b37 | 52), (short) 121, objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(fadingEdgeLength3, iResolveOpacity, iResolveSize2, 1357589585, false, (String) objArr78[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int i128 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int gidForName2 = Process.getGidForName("") + 16;
            byte b38 = $$a[7];
            Object[] objArr79 = new Object[1];
            c(b38, (byte) (b38 | 52), (short) 173, objArr79);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cCombineMeasuredStates, i128, gidForName2, 1344079056, false, (String) objArr79[0], null);
        }
        if (j6 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 1031;
                int maximumFlingVelocity4 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                byte[] bArr8 = $$a;
                byte b39 = (byte) (bArr8[205] + 1);
                byte b40 = bArr8[7];
                Object[] objArr80 = new Object[1];
                c(b39, b40, (short) (b40 | 210), objArr80);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cIndexOf3, packedPositionType3, maximumFlingVelocity4, 632103528, false, (String) objArr80[0], null);
            }
            Object[] objArr81 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
            objArr5 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i129 = ((int[]) objArr81[3])[0];
            int i130 = ((int[]) objArr81[1])[0];
            String[] strArr15 = (String[]) objArr81[0];
            int iCodePointAt = ((Context) Class.forName(str9).getMethod(str21, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step5).substring(1, 7).codePointAt(0) + 1950020155;
            int i131 = ~((-220676885) | iCodePointAt);
            int i132 = 529298453 + ((4722689 | i131) * (-476)) + (i131 * 952) + ((~((~iCodePointAt) | (-220676885))) * 476) + 399998285;
            int i133 = (i132 << 13) ^ i132;
            int i134 = i133 ^ (i133 >>> 17);
            ((int[]) objArr5[2])[0] = i134 ^ (i134 << 5);
        } else {
            int iIntValue4 = ((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr82 = {-388646113};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b((char) (46038 - Gravity.getAbsoluteGravity(0, 0)), 1133 - TextUtils.lastIndexOf("", '0', 0), 18 - View.MeasureSpec.getMode(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr83 = {Integer.valueOf(iIntValue4), 0, 399998285, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).newInstance(objArr82), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char c8 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int mirror2 = AndroidCharacter.getMirror('0') + 983;
                int iGreen2 = 15 - Color.green(0);
                byte b41 = $$a[7];
                Object[] objArr84 = new Object[1];
                c(b41, (byte) (b41 | 52), (short) 121, objArr84);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c8, mirror2, iGreen2, 1298546779, false, (String) objArr84[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.normalizeMetaState(0) + 45993), Color.argb(0, 0, 0, 0) + 1117, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17), Boolean.TYPE});
            }
            objArr5 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).invoke(null, objArr83);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
                int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
                byte[] bArr9 = $$a;
                byte b42 = (byte) (bArr9[205] + 1);
                byte b43 = bArr9[7];
                Object[] objArr85 = new Object[1];
                c(b42, b43, (short) (b43 | 210), objArr85);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(maxKeyCode3, scrollBarSize3, iKeyCodeFromString, 632103528, false, (String) objArr85[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, objArr5);
            try {
                long jLongValue12 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int i135 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                    int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                    byte b44 = $$a[7];
                    Object[] objArr86 = new Object[1];
                    c(b44, (byte) (b44 | 52), (short) 173, objArr86);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cArgb, i135, edgeSlop3, 1344079056, false, (String) objArr86[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char packedPositionChild3 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 1031;
                    int size3 = 15 - View.MeasureSpec.getSize(0);
                    byte b45 = $$a[7];
                    Object[] objArr87 = new Object[1];
                    c(b45, (byte) (b45 | 52), (short) 121, objArr87);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(packedPositionChild3, offsetAfter2, size3, 1357589585, false, (String) objArr87[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf12);
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i136 = ((int[]) objArr5[1])[0];
        int i137 = ((int[]) objArr5[3])[0];
        if (i137 == i136) {
            Object[] objArr88 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i138 = ((int[]) objArr5[2])[0];
            int i139 = ((int[]) objArr5[3])[0];
            int i140 = ((int[]) objArr5[1])[0];
            String[] strArr16 = (String[]) objArr5[0];
            int length3 = ((Context) Class.forName(str9).getMethod(str21, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minute).substring(0, 1).length() - 1332763516;
            int i141 = ~length3;
            int i142 = i138 + 624044085 + (((~((-756343369) | i141)) | 1000623538) * (-328)) + ((length3 | 1000623538) * 164) + (((~(length3 | 756343368)) | 312479154 | (~(i141 | (-68198985)))) * 164);
            int i143 = (i142 << 13) ^ i142;
            int i144 = i143 ^ (i143 >>> 17);
            i3 = 0;
            ((int[]) objArr88[2])[0] = i144 ^ (i144 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr17 = (String[]) objArr5[0];
            if (strArr17 != null) {
                for (String str22 : strArr17) {
                    arrayList5.add(str22);
                }
            }
            Toast.makeText((Context) null, i137 / (((i137 - 1) * i137) % 2), 0).show();
            Object[] objArr89 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i145 = ((int[]) objArr5[2])[0];
            int i146 = ((int[]) objArr5[3])[0];
            int i147 = ((int[]) objArr5[1])[0];
            String[] strArr18 = (String[]) objArr5[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i148 = ~iIdentityHashCode7;
            int i149 = i145 + 2101649552 + ((285066442 | i148) * (-757)) + ((~(318758378 | iIdentityHashCode7)) * 1514) + (((~(iIdentityHashCode7 | (-33691937))) | (~(i148 | 40786272)) | 277972106) * 757);
            int i150 = (i149 << 13) ^ i149;
            int i151 = i150 ^ (i150 >>> 17);
            i3 = 0;
            ((int[]) objArr89[2])[0] = i151 ^ (i151 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
            char c9 = (char) ((TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)) + 31533);
            int i152 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
            int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 28;
            byte[] bArr10 = $$a;
            byte b46 = (byte) (bArr10[205] + 1);
            byte b47 = bArr10[7];
            Object[] objArr90 = new Object[1];
            c(b46, b47, (short) (b47 | 210), objArr90);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c9, i152, packedPositionType4, -1048449946, false, (String) objArr90[0], null);
        }
        long j7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char cResolveSize2 = (char) (View.resolveSize(0, 0) + 31533);
            int iLastIndexOf2 = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
            int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
            byte b48 = $$a[7];
            Object[] objArr91 = new Object[1];
            c(b48, (byte) (b48 | 52), (short) 173, objArr91);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cResolveSize2, iLastIndexOf2, absoluteGravity, -778300370, false, (String) objArr91[0], null);
        }
        if (j7 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31534);
                int packedPositionType5 = 921 - ExpandableListView.getPackedPositionType(0L);
                int iLastIndexOf3 = 27 - TextUtils.lastIndexOf("", '0', 0);
                byte b49 = $$a[7];
                Object[] objArr92 = new Object[1];
                c(b49, (byte) (b49 | 37), (short) ($$b + 1), objArr92);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cIndexOf4, packedPositionType5, iLastIndexOf3, -1142834547, false, (String) objArr92[0], null);
            }
            Object[] objArr93 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).get(null);
            objArr6 = new Object[]{new int[1], new int[]{((int[]) objArr93[1])[0]}, (Object[]) objArr93[2], new int[]{((int[]) objArr93[3])[0]}, (String[]) objArr93[4]};
            int iMyTid2 = Process.myTid();
            int i153 = 877719025 + (((~((-88765449) | iMyTid2)) | (-1685314196)) * (-318));
            int i154 = ~((-1685314196) | iMyTid2);
            int i155 = ~iMyTid2;
            int i156 = i153 + ((i154 | (~(1702624923 | i155))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyTid2 | 1702624923)) | (~((-1613859476) | i155))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 145810527;
            int i157 = (i156 << 13) ^ i156;
            int i158 = i157 ^ (i157 >>> 17);
            ((int[]) objArr6[0])[0] = i158 ^ (i158 << 5);
            str6 = str16;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str15).getMethod(str6, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                str6 = str16;
                if ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) {
                    str6 = str16;
                    baseContext4 = null;
                } else {
                    str6 = str16;
                    str6 = str16;
                    baseContext4 = baseContext4.getApplicationContext();
                }
            }
            str6 = str16;
            str6 = str16;
            Object[] objArr94 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 145810527};
            short s3 = (short) TypedValues.AttributesType.TYPE_PATH_ROTATE;
            byte[] bArr11 = $$d;
            Object[] objArr95 = new Object[1];
            d(s3, (byte) (-bArr11[337]), bArr11[5], objArr95);
            Class<?> cls4 = Class.forName((String) objArr95[0]);
            Object[] objArr96 = new Object[1];
            d((short) 264, (byte) (-bArr11[337]), bArr11[140], objArr96);
            Object[] objArr97 = (Object[]) cls4.getMethod((String) objArr96[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr94);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char c10 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                int i159 = 921 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int minimumFlingVelocity4 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28;
                byte b50 = $$a[7];
                Object[] objArr98 = new Object[1];
                c(b50, (byte) (b50 | 37), (short) ($$b + 1), objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c10, i159, minimumFlingVelocity4, -1142834547, false, (String) objArr98[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, objArr97);
            try {
                long jLongValue14 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char cResolveSize3 = (char) (31533 - View.resolveSize(0, 0));
                    int iArgb = 921 - Color.argb(0, 0, 0, 0);
                    int iKeyCodeFromString2 = 28 - KeyEvent.keyCodeFromString("");
                    byte b51 = $$a[7];
                    Object[] objArr99 = new Object[1];
                    c(b51, (byte) (b51 | 52), (short) 173, objArr99);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cResolveSize3, iArgb, iKeyCodeFromString2, -778300370, false, (String) objArr99[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue14 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char threadPriority2 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0') + 922;
                    int i160 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte[] bArr12 = $$a;
                    byte b52 = (byte) (bArr12[205] + 1);
                    byte b53 = bArr12[7];
                    Object[] objArr100 = new Object[1];
                    c(b52, b53, (short) (b53 | 210), objArr100);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(threadPriority2, iLastIndexOf4, i160, -1048449946, false, (String) objArr100[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf14);
                objArr6 = objArr97;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i161 = ((int[]) objArr6[1])[0];
        int i162 = ((int[]) objArr6[3])[0];
        if (i162 == i161) {
            int i163 = TuitionPaymentFragmentbindingInflater1 + 103;
            asInterface = i163 % 128;
            int i164 = i163 % 2;
            int i165 = ((int[]) objArr6[0])[0];
            Object[] objArr101 = {new int[1], new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[]{((int[]) objArr6[3])[0]}, (String[]) objArr6[4]};
            int layoutDirection = ((Context) Class.forName(str9).getMethod(str21, new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i166 = ~layoutDirection;
            int i167 = i165 + 47094355 + (((~((-157876127) | i166)) | 1616203517) * (-602)) + (((~(layoutDirection | (-157876127))) | 4214428 | (~(1769865215 | i166))) * (-301)) + ((~(i166 | 1616203517)) * 301);
            int i168 = (i167 << 13) ^ i167;
            int i169 = i168 ^ (i168 >>> 17);
            ((int[]) objArr101[0])[0] = i169 ^ (i169 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr19 = (String[]) objArr6[4];
            if (strArr19 != null) {
                for (String str23 : strArr19) {
                    arrayList6.add(str23);
                }
            }
            Toast.makeText((Context) null, i162 / (((i162 - 1) * i162) % 2), 0).show();
            int i170 = ((int[]) objArr6[0])[0];
            Object[] objArr102 = {new int[1], new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[]{((int[]) objArr6[3])[0]}, (String[]) objArr6[4]};
            int length4 = ((Context) Class.forName(str9).getMethod(str21, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step3).substring(0, 1).length() + 2088671654;
            int i171 = 1724103233 + ((length4 | 242294963) * (-50));
            int i172 = ~((-172040353) | length4);
            int i173 = ~length4;
            int i174 = i170 + i171 + ((i172 | (~((-1359744329) | i173))) * 50) + (((~(i173 | 242294963)) | (~((-1531784681) | i173)) | 1359744328) * 50);
            int i175 = (i174 << 13) ^ i174;
            int i176 = i175 ^ (i175 >>> 17);
            ((int[]) objArr102[0])[0] = i176 ^ (i176 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
            char cIndexOf5 = (char) TextUtils.indexOf("", "");
            int i177 = 877 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int iResolveOpacity2 = 10 - Drawable.resolveOpacity(0, 0);
            byte b54 = $$a[7];
            Object[] objArr103 = new Object[1];
            c(b54, (byte) (b54 | 37), (short) ($$b + 1), objArr103);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cIndexOf5, i177, iResolveOpacity2, -1650998592, false, (String) objArr103[0], null);
        }
        long j8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int maxKeyCode4 = (KeyEvent.getMaxKeyCode() >> 16) + 876;
            int i178 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte b55 = $$a[7];
            Object[] objArr104 = new Object[1];
            c(b55, (byte) (b55 | 52), (short) 173, objArr104);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(scrollDefaultDelay, maxKeyCode4, i178, 2012020043, false, (String) objArr104[0], null);
        }
        if (j8 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int iRgb2 = (-16776340) - Color.rgb(0, 0, 0);
                int scrollDefaultDelay2 = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b56 = $$a[7];
                Object[] objArr105 = new Object[1];
                c(b56, (byte) (b56 | 52), (short) 121, objArr105);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(capsMode, iRgb2, scrollDefaultDelay2, 2012931276, false, (String) objArr105[0], null);
            }
            Object[] objArr106 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr106[0])[0]}, new int[1], new int[]{((int[]) objArr106[2])[0]}, (String[]) objArr106[3]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i179 = ((((-214181732) + (((~(iIdentityHashCode8 | 120810542)) | 80500313) * (-668))) + ((120810542 | (~(80500313 | iIdentityHashCode8))) * 1336)) + ((iIdentityHashCode8 | 134184575) * 668)) - 936945833;
            int i180 = (i179 << 13) ^ i179;
            int i181 = i180 ^ (i180 >>> 17);
            ((int[]) objArr7[1])[0] = i181 ^ (i181 << 5);
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str15).getMethod(str6, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                int i182 = TuitionPaymentFragmentbindingInflater1 + 15;
                int i183 = i182 % 128;
                asInterface = i183;
                int i184 = i182 % 2;
                if (baseContext5 instanceof ContextWrapper) {
                    int i185 = i183 + 55;
                    TuitionPaymentFragmentbindingInflater1 = i185 % 128;
                    int i186 = i185 % 2;
                    if (((ContextWrapper) baseContext5).getBaseContext() != null) {
                        baseContext5 = baseContext5.getApplicationContext();
                    } else {
                        baseContext5 = null;
                    }
                } else {
                    baseContext5 = baseContext5.getApplicationContext();
                }
            }
            Object[] objArr107 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -936945833};
            short s4 = (short) ($$e & 991);
            byte[] bArr13 = $$d;
            Object[] objArr108 = new Object[1];
            d(s4, bArr13[5], bArr13[25], objArr108);
            Class<?> cls5 = Class.forName((String) objArr108[0]);
            Object[] objArr109 = new Object[1];
            d((short) 137, bArr13[54], bArr13[140], objArr109);
            objArr7 = (Object[]) cls5.getMethod((String) objArr109[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr107);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 876;
                    int i187 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9;
                    byte b57 = $$a[7];
                    Object[] objArr110 = new Object[1];
                    c(b57, (byte) (b57 | 52), (short) 121, objArr110);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cMakeMeasureSpec, offsetAfter3, i187, 2012931276, false, (String) objArr110[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, objArr7);
                try {
                    long jLongValue16 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                        char defaultSize3 = (char) View.getDefaultSize(0, 0);
                        int iRgb3 = Color.rgb(0, 0, 0) + 16778092;
                        int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                        byte b58 = $$a[7];
                        Object[] objArr111 = new Object[1];
                        c(b58, (byte) (b58 | 52), (short) 173, objArr111);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(defaultSize3, iRgb3, longPressTimeout2, 2012020043, false, (String) objArr111[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                        char cRed2 = (char) Color.red(0);
                        int iLastIndexOf5 = 875 - TextUtils.lastIndexOf("", '0', 0);
                        int maximumFlingVelocity5 = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b59 = $$a[7];
                        Object[] objArr112 = new Object[1];
                        c(b59, (byte) (b59 | 37), (short) ($$b + 1), objArr112);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cRed2, iLastIndexOf5, maximumFlingVelocity5, -1650998592, false, (String) objArr112[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf16);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
        }
        int i188 = ((int[]) objArr7[2])[0];
        int i189 = ((int[]) objArr7[0])[0];
        if (i189 == i188) {
            int i190 = ((int[]) objArr7[1])[0];
            Object[] objArr113 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i191 = ~iIdentityHashCode9;
            int i192 = i190 + (((2070192700 + (((~(644679939 | i191)) | (~((-684990169) | iIdentityHashCode9))) * (-370))) + ((((~(iIdentityHashCode9 | 644679939)) | (~(i191 | (-684990169)))) | 103350531) * (-370))) - 415009194);
            int i193 = (i192 << 13) ^ i192;
            int i194 = i193 ^ (i193 >>> 17);
            ((int[]) objArr113[1])[0] = i194 ^ (i194 << 5);
            i4 = 0;
            str7 = str21;
        } else {
            Toast.makeText((Context) null, i189 / (((i189 - 1) * i189) % 2), 0).show();
            int i195 = ((int[]) objArr7[1])[0];
            Object[] objArr114 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            str7 = str21;
            int i196 = ((Context) Class.forName(str9).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i197 = i195 + ((((~(i196 | 492448193)) | (-452137965)) * 56) - 392276524) + (((~((~i196) | (-452137965))) | 492448193) * 56);
            int i198 = i197 ^ (i197 << 13);
            int i199 = i198 ^ (i198 >>> 17);
            i4 = 0;
            ((int[]) objArr114[1])[0] = i199 ^ (i199 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
            char c11 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int iLastIndexOf6 = TextUtils.lastIndexOf("", '0', i4, i4) + 877;
            int iMyTid3 = (Process.myTid() >> 22) + 10;
            byte[] bArr14 = $$a;
            Object[] objArr115 = new Object[1];
            c(bArr14[205], bArr14[9], bArr14[8], objArr115);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(c11, iLastIndexOf6, iMyTid3, -1199417970, false, (String) objArr115[0], null);
        }
        long j9 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).getLong(null);
        long jLongValue17 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
            char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int i200 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
            int mode = 10 - View.MeasureSpec.getMode(0);
            byte[] bArr15 = $$a;
            Object[] objArr116 = new Object[1];
            c(bArr15[27], bArr15[7], bArr15[78], objArr116);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(jumpTapTimeout3, i200, mode, 254769921, false, (String) objArr116[0], null);
        }
        if (j9 == ((jLongValue17 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                char c12 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int iLastIndexOf7 = 875 - TextUtils.lastIndexOf("", '0', 0, 0);
                int scrollBarSize4 = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr16 = $$a;
                byte b60 = bArr16[205];
                byte b61 = bArr16[78];
                Object[] objArr117 = new Object[1];
                c(b60, b61, b61, objArr117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(c12, iLastIndexOf7, scrollBarSize4, 1324201839, false, (String) objArr117[0], null);
            }
            Object[] objArr118 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).get(null);
            objArr8 = new Object[]{new int[]{((int[]) objArr118[0])[0]}, new int[1], new int[]{((int[]) objArr118[2])[0]}, (String[]) objArr118[3]};
            int i201 = ((Context) Class.forName(str9).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i202 = (-1448395628) + (((~(865528450 | i201)) | (-825218222)) * 672);
            int i203 = ~i201;
            int i204 = i202 + (((~(i201 | (-825218222))) | (~((-865528451) | i203))) * (-672)) + (((~(825218221 | i203)) | (-868220592)) * 672) + 1972180465;
            int i205 = (i204 << 13) ^ i204;
            int i206 = i205 ^ (i205 >>> 17);
            ((int[]) objArr8[1])[0] = i206 ^ (i206 << 5);
        } else {
            Object[] objArr119 = {Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 1972180465};
            short s5 = (short) ($$e & 367);
            byte[] bArr17 = $$d;
            Object[] objArr120 = new Object[1];
            d(s5, (byte) (-bArr17[532]), bArr17[25], objArr120);
            Class<?> cls6 = Class.forName((String) objArr120[0]);
            Object[] objArr121 = new Object[1];
            d(bArr17[94], (byte) (-bArr17[337]), bArr17[140], objArr121);
            objArr8 = (Object[]) cls6.getMethod((String) objArr121[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr119);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                int mirror3 = 924 - AndroidCharacter.getMirror('0');
                int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                byte[] bArr18 = $$a;
                byte b62 = bArr18[205];
                byte b63 = bArr18[78];
                Object[] objArr122 = new Object[1];
                c(b62, b63, b63, objArr122);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cLastIndexOf2, mirror3, threadPriority3, 1324201839, false, (String) objArr122[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, objArr8);
            try {
                long jLongValue18 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue18);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                    char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iGreen3 = 876 - Color.green(0);
                    int iMyPid = 10 - (Process.myPid() >> 22);
                    byte[] bArr19 = $$a;
                    Object[] objArr123 = new Object[1];
                    c(bArr19[27], bArr19[7], bArr19[78], objArr123);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(scrollBarFadeDuration3, iGreen3, iMyPid, 254769921, false, (String) objArr123[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue18 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char cBlue = (char) Color.blue(0);
                    int i207 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                    int keyRepeatTimeout2 = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr20 = $$a;
                    Object[] objArr124 = new Object[1];
                    c(bArr20[205], bArr20[9], bArr20[8], objArr124);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cBlue, i207, keyRepeatTimeout2, -1199417970, false, (String) objArr124[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, lValueOf18);
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr8[0])[0] != ((int[]) objArr8[2])[0]) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr20 = (String[]) objArr8[3];
            if (strArr20 != null) {
                for (String str24 : strArr20) {
                    arrayList7.add(str24);
                }
            }
            throw null;
        }
        int i208 = ((int[]) objArr8[1])[0];
        Object[] objArr125 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
        int i209 = ((Context) Class.forName(str9).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2135278526;
        int i210 = ~i209;
        int i211 = i208 + 2048839012 + (((~((-378800824) | i210)) | 419111052) * (-328)) + ((i209 | 419111052) * 164) + (((~(i209 | 378800823)) | 141238280 | (~(i210 | (-100928052)))) * 164);
        int i212 = (i211 << 13) ^ i211;
        int i213 = i212 ^ (i212 >>> 17);
        ((int[]) objArr125[1])[0] = i213 ^ (i213 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
            char cAxisFromString2 = (char) (MotionEvent.axisFromString("") + 1);
            int iResolveSize3 = 876 - View.resolveSize(0, 0);
            int trimmedLength3 = TextUtils.getTrimmedLength("") + 10;
            byte[] bArr21 = $$a;
            byte b64 = (byte) (bArr21[205] + 1);
            byte b65 = bArr21[7];
            Object[] objArr126 = new Object[1];
            c(b64, b65, (short) (b65 | 210), objArr126);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cAxisFromString2, iResolveSize3, trimmedLength3, 252381699, false, (String) objArr126[0], null);
        }
        long j10 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).getLong(null);
        long jLongValue19 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
            char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int iResolveSize4 = 876 - View.resolveSize(0, 0);
            int packedPositionChild4 = 9 - ExpandableListView.getPackedPositionChild(0L);
            byte b66 = $$a[7];
            Object[] objArr127 = new Object[1];
            c(b66, (byte) (b66 | 52), (short) 69, objArr127);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cMakeMeasureSpec2, iResolveSize4, packedPositionChild4, 2009631821, false, (String) objArr127[0], null);
        }
        if (j10 == ((jLongValue19 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char scrollBarFadeDuration4 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iGreen4 = Color.green(0) + 876;
                int scrollBarSize5 = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr22 = $$a;
                byte b67 = bArr22[91];
                byte b68 = bArr22[7];
                Object[] objArr128 = new Object[1];
                c(b67, b68, b68, objArr128);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(scrollBarFadeDuration4, iGreen4, scrollBarSize5, 256017550, false, (String) objArr128[0], null);
            }
            Object[] objArr129 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr129[0])[0]}, new int[1], new int[]{((int[]) objArr129[2])[0]}, (String[]) objArr129[3]};
            int i214 = ((Context) Class.forName(str9).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i215 = (((-208210156) + (((~((-210868026) | i214)) | 76617241) * 1504)) + ((~(i214 | (-134250785))) * (-1504))) - 1220049798;
            int i216 = (i215 << 13) ^ i215;
            int i217 = i216 ^ (i216 >>> 17);
            ((int[]) objArr9[1])[0] = i217 ^ (i217 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str15).getMethod(str8, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                if ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) {
                    str8 = str6;
                    baseContext6 = null;
                } else {
                    str8 = str6;
                    str8 = str6;
                    baseContext6 = baseContext6.getApplicationContext();
                }
            }
            str8 = str6;
            Object[] objArr130 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str5, Object.class).invoke(null, this)).intValue()), 2094610586};
            byte[] bArr23 = $$d;
            byte b69 = bArr23[5];
            short s6 = b69;
            Object[] objArr131 = new Object[1];
            d(s6, (byte) (s6 | 41), b69, objArr131);
            Class<?> cls7 = Class.forName((String) objArr131[0]);
            Object[] objArr132 = new Object[1];
            d((short) 137, bArr23[54], bArr23[140], objArr132);
            objArr9 = (Object[]) cls7.getMethod((String) objArr132[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr130);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char cResolveOpacity4 = (char) Drawable.resolveOpacity(0, 0);
                    int fadingEdgeLength4 = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iAxisFromString = MotionEvent.axisFromString("") + 11;
                    byte[] bArr24 = $$a;
                    byte b70 = bArr24[91];
                    byte b71 = bArr24[7];
                    Object[] objArr133 = new Object[1];
                    c(b70, b71, b71, objArr133);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cResolveOpacity4, fadingEdgeLength4, iAxisFromString, 256017550, false, (String) objArr133[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, objArr9);
                try {
                    long jLongValue20 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue20);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                        char cMakeMeasureSpec3 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iMyPid2 = (Process.myPid() >> 22) + 876;
                        int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                        byte b72 = $$a[7];
                        Object[] objArr134 = new Object[1];
                        c(b72, (byte) (b72 | 52), (short) 69, objArr134);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cMakeMeasureSpec3, iMyPid2, tapTimeout3, 2009631821, false, (String) objArr134[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue20 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                        char cGreen = (char) Color.green(0);
                        int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                        int deadChar2 = 10 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr25 = $$a;
                        byte b73 = (byte) (bArr25[205] + 1);
                        byte b74 = bArr25[7];
                        Object[] objArr135 = new Object[1];
                        c(b73, b74, (short) (b74 | 210), objArr135);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cGreen, doubleTapTimeout4, deadChar2, 252381699, false, (String) objArr135[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
        }
        int i218 = ((int[]) objArr9[2])[0];
        int i219 = ((int[]) objArr9[0])[0];
        if (i219 == i218) {
            int i220 = ((int[]) objArr9[1])[0];
            Object[] objArr136 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int iMyPid3 = Process.myPid();
            int i221 = 1153572500 + (((~((-315007154) | iMyPid3)) | 41951265 | (~(274696924 | iMyPid3))) * (-880));
            int i222 = (~((-315007154) | (~iMyPid3))) | (-274696925);
            int i223 = ~(iMyPid3 | 315007153);
            int i224 = i220 + i221 + ((i222 | i223) * (-880)) + (i223 * 880);
            int i225 = (i224 << 13) ^ i224;
            int i226 = i225 ^ (i225 >>> 17);
            ((int[]) objArr136[1])[0] = i226 ^ (i226 << 5);
        } else {
            int[] iArr10 = new int[i219];
            int i227 = i219 - 1;
            iArr10[i227] = 1;
            Toast.makeText((Context) null, iArr10[((i219 * i227) % 2) - 1], 1).show();
            int i228 = ((int[]) objArr9[1])[0];
            Object[] objArr137 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int i229 = ((Context) Class.forName(str9).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i230 = ~i229;
            int i231 = 586124706 + (((~((-729209577) | i230)) | 693424296) * (-1188));
            int i232 = (~(i229 | 729209576)) | 693424296;
            int i233 = ~(769519805 | i230);
            int i234 = i228 + i231 + ((i232 | i233) * 594) + (((~(729209576 | i230)) | (-805305086) | i233) * 594);
            int i235 = (i234 << 13) ^ i234;
            int i236 = i235 ^ (i235 >>> 17);
            ((int[]) objArr137[1])[0] = i236 ^ (i236 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
            char c13 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int iLastIndexOf8 = TextUtils.lastIndexOf("", '0', 0, 0) + 652;
            int threadPriority4 = 44 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte b75 = $$a[7];
            Object[] objArr138 = new Object[1];
            c(b75, (byte) (b75 | 52), (short) 69, objArr138);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c13, iLastIndexOf8, threadPriority4, -459846511, false, (String) objArr138[0], null);
        }
        long j11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).getLong(null);
        long jLongValue21 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
            char cRed3 = (char) Color.red(0);
            int iIndexOf3 = 651 - TextUtils.indexOf("", "", 0, 0);
            int scrollBarSize6 = (ViewConfiguration.getScrollBarSize() >> 8) + 44;
            byte[] bArr26 = $$a;
            byte b76 = (byte) (bArr26[205] + 1);
            byte b77 = bArr26[7];
            Object[] objArr139 = new Object[1];
            c(b76, b77, (short) (b77 | 210), objArr139);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cRed3, iIndexOf3, scrollBarSize6, -873460649, false, (String) objArr139[0], null);
        }
        if (j11 == ((jLongValue21 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                char scrollBarSize7 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int packedPositionType6 = 651 - ExpandableListView.getPackedPositionType(0L);
                int iRed = 44 - Color.red(0);
                byte b78 = $$a[7];
                Object[] objArr140 = new Object[1];
                c(b78, (byte) (b78 | 37), (short) ($$b + 1), objArr140);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(scrollBarSize7, packedPositionType6, iRed, -1595579076, false, (String) objArr140[0], null);
            }
            Object[] objArr141 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).get(null);
            objArr10 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i237 = ((int[]) objArr141[2])[0];
            int i238 = ((int[]) objArr141[0])[0];
            int i239 = ((Context) Class.forName(str9).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i240 = ~(562036718 | i239);
            int i241 = ((((-145452323) + ((556507528 | i240) * (-476))) + (i240 * 952)) + ((~((~i239) | 562036718)) * 476)) - 996722348;
            int i242 = (i241 << 13) ^ i241;
            int i243 = i242 ^ (i242 >>> 17);
            ((int[]) objArr10[3])[0] = i243 ^ (i243 << 5);
            i5 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b((char) KeyEvent.normalizeMetaState(0), 1610 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr142 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).newInstance(null), -996722348, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                char c14 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int bitsPerPixel3 = 650 - ImageFormat.getBitsPerPixel(0);
                int i244 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43;
                byte[] bArr27 = $$a;
                byte b79 = (byte) (bArr27[205] + 1);
                byte b80 = bArr27[7];
                Object[] objArr143 = new Object[1];
                c(b79, b80, (short) (b80 | 210), objArr143);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(c14, bitsPerPixel3, i244, 2075921419, false, (String) objArr143[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.getDefaultSize(0, 0), 694 - TextUtils.lastIndexOf("", '0', 0, 0), 98 - KeyEvent.normalizeMetaState(0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.normalizeMetaState(0) + 63406), View.resolveSize(0, 0) + 793, 83 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Integer.TYPE, Integer.TYPE});
            }
            objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).invoke(null, objArr142);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                char cIndexOf6 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int iBlue = 651 - Color.blue(0);
                int trimmedLength4 = 44 - TextUtils.getTrimmedLength("");
                byte b81 = $$a[7];
                Object[] objArr144 = new Object[1];
                c(b81, (byte) (b81 | 37), (short) ($$b + 1), objArr144);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(cIndexOf6, iBlue, trimmedLength4, -1595579076, false, (String) objArr144[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).set(null, objArr10);
            try {
                long jLongValue22 = ((Long) Class.forName(str11).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue22);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault74 == null) {
                    char cResolveSize4 = (char) View.resolveSize(0, 0);
                    int packedPositionType7 = ExpandableListView.getPackedPositionType(0L) + 651;
                    int iMyTid4 = (Process.myTid() >> 22) + 44;
                    byte[] bArr28 = $$a;
                    byte b82 = (byte) (bArr28[205] + 1);
                    byte b83 = bArr28[7];
                    Object[] objArr145 = new Object[1];
                    c(b82, b83, (short) (b83 | 210), objArr145);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.b(cResolveSize4, packedPositionType7, iMyTid4, -873460649, false, (String) objArr145[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault74).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue22 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault75 == null) {
                    char tapTimeout4 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iLastIndexOf9 = 650 - TextUtils.lastIndexOf("", '0');
                    int iLastIndexOf10 = TextUtils.lastIndexOf("", '0', 0) + 45;
                    byte b84 = $$a[7];
                    Object[] objArr146 = new Object[1];
                    c(b84, (byte) (b84 | 52), (short) 69, objArr146);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.b(tapTimeout4, iLastIndexOf9, iLastIndexOf10, -459846511, false, (String) objArr146[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault75).set(null, lValueOf22);
                i5 = 0;
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr10[2])[i5] != ((int[]) objArr10[i5])[i5]) {
            int i245 = i5;
            ArrayList arrayList8 = new ArrayList();
            String[] strArr21 = (String[]) objArr10[1];
            if (strArr21 != null) {
                for (int i246 = i245; i246 < strArr21.length; i246++) {
                    arrayList8.add(strArr21[i246]);
                }
            }
            throw null;
        }
        Object[] objArr147 = new Object[4];
        int[] iArr11 = new int[1];
        objArr147[i5] = iArr11;
        int[] iArr12 = new int[1];
        objArr147[2] = iArr12;
        objArr147[3] = new int[1];
        int i247 = ((int[]) objArr10[3])[i5];
        int i248 = ((int[]) objArr10[2])[i5];
        int i249 = ((int[]) objArr10[i5])[i5];
        iArr12[i5] = i248;
        iArr11[i5] = i249;
        objArr147[1] = new String[i5];
        int iNextInt2 = new Random().nextInt();
        int i250 = i247 + 1303787871 + (((~((~iNextInt2) | (-490815766))) | (~((-271977) | iNextInt2))) * (-302)) + ((~((-490815766) | iNextInt2)) * (-604)) + (((~(iNextInt2 | (-491087742))) | (-494790528)) * 302);
        int i251 = (i250 << 13) ^ i250;
        int i252 = i251 ^ (i251 >>> 17);
        ((int[]) objArr147[3])[0] = i252 ^ (i252 << 5);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i3 = $11 + 111;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10 + 113;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i9 = i6;
                int i10 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i11 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c2] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 47773);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 468;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, fadingEdgeLength, packedPositionGroup, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47821 - AndroidCharacter.getMirror('0')), View.MeasureSpec.makeMeasureSpec(0, 0) + 468, 12 - TextUtils.lastIndexOf("", '0', 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i9 + 1;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "");
                int iBlue = Color.blue(0) + 2323;
                int maximumFlingVelocity = 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b2 = (byte) ($$c[0] - 1);
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iBlue, maximumFlingVelocity, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            super.attachBaseContext(context);
            return;
        }
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int iArgb = Color.argb(0, 0, 0, 0) + 1755;
            int i3 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (b2 | 37), (short) ($$b + 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, iArgb, i3, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        a(new char[]{36435, 16645, 3025, 58089, 24121, 53018, 31287, 7549, 42729, 14583, 56889, 41604, 14131, 1033, 38892, 40402, 23260, 64698, 6590, 15088, 10820, 20469, 36544, 17218}, 22 - Gravity.getAbsoluteGravity(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(new char[]{7896, 23026, 59534, 21514, 13675, 32571, 52665, 40173, 20066, 60110, 55380, 28126, 34384, 46837, 43735, 63866, 56012, 44533}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_failed).substring(53, 55).codePointAt(0) - 17, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 24;
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(b3, (byte) (b3 | 52), (short) 69, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iIndexOf, iIndexOf2, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                int i4 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b4 = $$a[7];
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 52), (short) 173, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, i4, doubleTapTimeout, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i5}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i6 = ~layoutDirection;
            int i7 = ((((-1160119099) + (((~((-503926099) | i6)) | 167856384) * (-108))) + (((~(i6 | 716528524)) | ((~((-716528525) | layoutDirection)) | (-1052598239))) * 54)) + ((layoutDirection | (-1052598239)) * 54)) - 697877937;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            a(new char[]{21376, 59550, 37480, 8470, 42753, 16753, 21286, 12870, 44860, 43942, 1992, 52724, 42536, 51944, 57654, 64777, 45054, 40410}, 16 - (ViewConfiguration.getTouchSlop() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(new char[]{46620, 9717, 10330, 59809, 1932, 16784, 55228, 26445, 36595, 47371, 57063, 30575, 20374, 20660, 35161, 37225, 12922, 15497}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_right_eye_closed).substring(0, 15).codePointAt(11) - 81, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1971374614};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.green(0) + 42049), 1725 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 29 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -697877937, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char trimmedLength = (char) (29944 - TextUtils.getTrimmedLength(""));
                    int iResolveSize = View.resolveSize(0, 0) + 1755;
                    int trimmedLength2 = TextUtils.getTrimmedLength("") + 23;
                    byte b5 = $$a[7];
                    Object[] objArr11 = new Object[1];
                    c(b5, (byte) (b5 | 52), (short) 173, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, iResolveSize, trimmedLength2, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    a(new char[]{36435, 16645, 3025, 58089, 24121, 53018, 31287, 7549, 42729, 14583, 56889, 41604, 14131, 1033, 38892, 40402, 23260, 64698, 6590, 15088, 10820, 20469, 36544, 17218}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_continue_next_step).substring(2, 3).length() + 21, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    a(new char[]{7896, 23026, 59534, 21514, 13675, 32571, 52665, 40173, 20066, 60110, 55380, 28126, 34384, 46837, 43735, 63866, 56012, 44533}, 15 - (KeyEvent.getMaxKeyCode() >> 16), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                        int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iAlpha = 23 - Color.alpha(0);
                        byte b6 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        c(b6, (byte) (b6 | 52), (short) 69, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, tapTimeout, iAlpha, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                        int trimmedLength3 = TextUtils.getTrimmedLength("") + 1755;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                        byte b7 = $$a[7];
                        Object[] objArr15 = new Object[1];
                        c(b7, (byte) (b7 | 37), (short) ($$b + 1), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, trimmedLength3, iLastIndexOf, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i10 = ((int[]) objArrB$7879113[1])[0];
        int i11 = ((int[]) objArrB$7879113[0])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i12 = asInterface + 55;
                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                int i13 = i12 % 2;
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i14 = ((int[]) objArrB$7879113[3])[0];
        int i15 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr16 = {new int[]{i15}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i16 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 224469387;
        int i17 = i14 + (((~(1065156554 | i16)) | 570982400) * 449) + 85438788 + (((~((~i16) | 1065156554)) | 570982400) * 449);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr16[3])[0] = i19 ^ (i19 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int iRed = Color.red(0) + 1031;
            int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte b8 = $$a[7];
            Object[] objArr17 = new Object[1];
            c(b8, (byte) (b8 | 52), (short) 121, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, iRed, pressedStateDuration, 1357589585, false, (String) objArr17[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr18 = new Object[1];
        a(new char[]{36435, 16645, 3025, 58089, 24121, 53018, 31287, 7549, 42729, 14583, 56889, 41604, 14131, 1033, 38892, 40402, 23260, 64698, 6590, 15088, 10820, 20469, 36544, 17218}, 22 - Color.red(0), objArr18);
        Class<?> cls4 = Class.forName((String) objArr18[0]);
        Object[] objArr19 = new Object[1];
        a(new char[]{7896, 23026, 59534, 21514, 13675, 32571, 52665, 40173, 20066, 60110, 55380, 28126, 34384, 46837, 43735, 63866, 56012, 44533}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr19);
        long jLongValue3 = ((Long) cls4.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int keyRepeatTimeout2 = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iResolveSize2 = View.resolveSize(0, 0) + 15;
            byte b9 = $$a[7];
            Object[] objArr20 = new Object[1];
            c(b9, (byte) (b9 | 52), (short) 173, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(capsMode, keyRepeatTimeout2, iResolveSize2, 1344079056, false, (String) objArr20[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 1031;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                byte[] bArr = $$a;
                byte b10 = (byte) (bArr[205] + 1);
                byte b11 = bArr[7];
                Object[] objArr21 = new Object[1];
                c(b10, b11, (short) (b11 | 210), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, iIndexOf3, absoluteGravity, 632103528, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr22[3])[0];
            int i21 = ((int[]) objArr22[1])[0];
            String[] strArr2 = (String[]) objArr22[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = ~((-191674102) | iIdentityHashCode);
            int i23 = ~iIdentityHashCode;
            int i24 = (((871326719 + ((i22 | (~(191805173 | i23))) * (-406))) + ((~((-139199106) | i23)) * (-406))) + (((~(iIdentityHashCode | (-52606069))) | (~(191674101 | i23))) * 406)) - 1941536910;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[2])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            a(new char[]{21376, 59550, 37480, 8470, 42753, 16753, 21286, 12870, 44860, 43942, 1992, 52724, 42536, 51944, 57654, 64777, 45054, 40410}, MotionEvent.axisFromString("") + 17, objArr23);
            Class<?> cls5 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            a(new char[]{46620, 9717, 10330, 59809, 1932, 16784, 55228, 26445, 36595, 47371, 57063, 30575, 20374, 20660, 35161, 37225, 12922, 15497}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr24);
            int iIntValue2 = ((Integer) cls5.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1971374614};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46039), 1134 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr26 = {Integer.valueOf(iIntValue2), 0, -1941536910, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
                int keyRepeatTimeout3 = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b12 = $$a[7];
                Object[] objArr27 = new Object[1];
                c(b12, (byte) (b12 | 52), (short) 121, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, iCombineMeasuredStates, keyRepeatTimeout3, 1298546779, false, (String) objArr27[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1116, 17 - (ViewConfiguration.getScrollBarSize() >> 8)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr26);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 1031;
                int i27 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b13 = (byte) (bArr2[205] + 1);
                byte b14 = bArr2[7];
                Object[] objArr28 = new Object[1];
                c(b13, b14, (short) (b14 | 210), objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMyPid, iCombineMeasuredStates2, i27, 632103528, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr29 = new Object[1];
                a(new char[]{36435, 16645, 3025, 58089, 24121, 53018, 31287, 7549, 42729, 14583, 56889, 41604, 14131, 1033, 38892, 40402, 23260, 64698, 6590, 15088, 10820, 20469, 36544, 17218}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_token_message).substring(1, 2).length() + 21, objArr29);
                Class<?> cls6 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                a(new char[]{7896, 23026, 59534, 21514, 13675, 32571, 52665, 40173, 20066, 60110, 55380, 28126, 34384, 46837, 43735, 63866, 56012, 44533}, Color.alpha(0) + 15, objArr30);
                long jLongValue4 = ((Long) cls6.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int defaultSize = View.getDefaultSize(0, 0) + 1031;
                    int iAxisFromString = MotionEvent.axisFromString("") + 16;
                    byte b15 = $$a[7];
                    Object[] objArr31 = new Object[1];
                    c(b15, (byte) (b15 | 52), (short) 173, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(doubleTapTimeout2, defaultSize, iAxisFromString, 1344079056, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 1031;
                    int i28 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b16 = $$a[7];
                    Object[] objArr32 = new Object[1];
                    c(b16, (byte) (b16 | 52), (short) 121, objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c4, capsMode2, i28, 1357589585, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArr[1])[0];
        int i30 = ((int[]) objArr[3])[0];
        if (i30 != i29) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i30));
        }
        int i31 = asInterface + 35;
        TuitionPaymentFragmentbindingInflater1 = i31 % 128;
        int i32 = i31 % 2;
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i33 = ((int[]) objArr[2])[0];
        int i34 = ((int[]) objArr[3])[0];
        int i35 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i36 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i37 = i33 + (((1739565539 + (((~i36) | 12620204) * 1324)) + (((~(i36 | 29809068)) | (~(214471101 | i36))) * (-1324))) - 1024566282);
        int i38 = i37 ^ (i37 << 13);
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr33[2])[0] = i39 ^ (i39 << 5);
    }

    static {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            return;
        }
        $10 = 0;
        $11 = 1;
        byte[] bArr = new byte[547];
        System.arraycopy("D\u0089´aò\u0000=Åöþ\u0006ù\u00055Æûõ\u000b\u0001ÿì\f5Éï\u000fì\túñ\u0003\t\u0004îCæÛõ\u000b\u0001ÿì\f Ï\u000fì\túñ\u0003\t\u0004î&Õú$ëüüôý\u0000\u000fíLßÒ\u0000û\rñ\u0003øÿò\u0000=È\u0001ë\u0011ûó\u00067Ëñ\bð\u0001\u0004\u00034ºû\u0006=Ãùø\rñ\u0002\u000bó<Èó\u0000\nöù>¹\u000eòý\t5ÚÛ\u0006\u0015ë\u0002ì\"îòý\t?º\u0005ñ\bö\u0005\u001eÍ\u000fõøNñò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034ÅøøCËêÿ\n8Ëï\u00059¹\b\u0000÷\u0003ù>Ãùø\rñ\u0002\u000bó<²\u0016ê\u000büüôý\rñ-àò\u0006ñ\u000f;ÎÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õø\u0010÷ù\bùù\u0005\u001cÙ\u0006ø\të\rñ?Ý\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö@ò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034¿\në\rñ\u0007\u0006ó<É\u0000í\u0001ø\u0000\f÷<éàí\u0001ø\u0000\f÷\u001eéæ\bøÿ%êñ\u000bø\u0000ñLßÙýû\u0006\u001fàó\u0007ì\u0007\të\tøÿùÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õø\u0010÷ù\bùù\u0005\u001cÙ\u0006ø\të\rñ?ò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034À\u0001\u0005î\u000fí\u0007\u0002ðC¼\u0002\tüüðCÃùø\rñ\u0002\u000bó<²þ\u000fúÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007öA\u000bï\u0000\u0001\u0007ûó@\u0002Üíí\u000fò\u0006ï\rñ(åñ\bö\u0005ñLÜÛ\u0002÷\u0006\u0015êï".getBytes("ISO-8859-1"), 0, bArr, 0, 547);
        $$d = bArr;
        $$e = 244;
        $$a = new byte[]{6, 51, 46, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = 209;
        TuitionPaymentFragmentbindingInflater1 = 0;
        asInterface = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 58804;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 27531;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 4141;
        b = (char) 34915;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, byte r8, int r9) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r9 = r9 * 4
            int r9 = r9 + 108
            byte[] r0 = com.dynatrace.android.app.Application.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.app.Application.$$g(short, byte, int):java.lang.String");
    }
}
