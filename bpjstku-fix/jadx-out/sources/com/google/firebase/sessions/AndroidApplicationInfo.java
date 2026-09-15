package com.google.firebase.sessions;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JR\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000eR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000eR\u001a\u0010(\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0015"}, d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", "", "p0", "p1", "p2", "p3", "Lcom/google/firebase/sessions/ProcessDetails;", "p4", "", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/google/firebase/sessions/ProcessDetails;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "Ljava/lang/String;", "getPackageName", "versionName", "getVersionName", "appBuildVersion", "getAppBuildVersion", "deviceManufacturer", "getDeviceManufacturer", "currentProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "getCurrentProcessDetails", "appProcessDetails", "Ljava/util/List;", "getAppProcessDetails"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AndroidApplicationInfo {
    private final String appBuildVersion;
    private final List<ProcessDetails> appProcessDetails;
    private final ProcessDetails currentProcessDetails;
    private final String deviceManufacturer;
    private final String packageName;
    private final String versionName;
    private static final byte[] $$c = {83, -44, 103, 46};
    private static final int $$f = 44;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, 88, -118, 32, 11, -3, -64, 56, 7, -1, -9, 4, -8, -56, 55, 2, 8, -14, -4, -2, 17, -15, -56, 67, -14, 7, 1, 4, -16, -3, 11, -2, -9, 2, -3, -58, 20, 43, -2, -9, 2, -3, -19, 26, -13, -4, 18, -16, 32, -13, 10, -12, 5, -2, -31, 16, 23, -13, -9, 8, 5, -47, 43, -18, 5, 5, -9, 8, 5, -2, -4, -12, -3, 5, -9, 10, -4, 4, -3, -4, 4, -10, -2, 17, -14, -5, 17, -43, 33, -12, 0, 6, -9, 0, 0, -6, 19, -10, 7, -66};
    private static final int $$e = 103;
    private static final byte[] $$a = {106, -22, 107, 95, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 95;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -499500073559965395L;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 1
            int r7 = r7 + 4
            byte[] r0 = com.google.firebase.sessions.AndroidApplicationInfo.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.AndroidApplicationInfo.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 8
            int r0 = r7 + 45
            int r6 = r6 * 15
            int r6 = 99 - r6
            byte[] r1 = com.google.firebase.sessions.AndroidApplicationInfo.$$d
            int r8 = r8 * 44
            int r8 = 47 - r8
            byte[] r0 = new byte[r0]
            int r7 = r7 + 44
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L31:
            int r6 = r6 + r8
            int r6 = r6 + 1
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.AndroidApplicationInfo.d(int, int, short, java.lang.Object[]):void");
    }

    public AndroidApplicationInfo(String str, String str2, String str3, String str4, ProcessDetails processDetails, List<ProcessDetails> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(processDetails, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.packageName = str;
        this.versionName = str2;
        this.appBuildVersion = str3;
        this.deviceManufacturer = str4;
        this.currentProcessDetails = processDetails;
        this.appProcessDetails = list;
    }

    public final String getPackageName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.packageName;
        int i4 = i3 + 125;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return str;
    }

    public final String getVersionName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 97;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.versionName;
        int i4 = i2 + 9;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAppBuildVersion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.appBuildVersion;
        int i5 = i3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDeviceManufacturer() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.deviceManufacturer;
        int i5 = i3 + 23;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return str;
    }

    public final ProcessDetails getCurrentProcessDetails() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 97;
        b = i3 % 128;
        int i4 = i3 % 2;
        ProcessDetails processDetails = this.currentProcessDetails;
        int i5 = i2 + 79;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return processDetails;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<ProcessDetails> getAppProcessDetails() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.appProcessDetails;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 65;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 % 5;
        }
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 99;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - TextUtils.getOffsetBefore("", 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1357, 38 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - Color.argb(0, 0, 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 467, 13 - TextUtils.getCapsMode("", 0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x021d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0228  */
    public final List<ProcessDetails> component6() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        List<ProcessDetails> list = this.appProcessDetails;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
            int i2 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 921;
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[37], bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, i2, fadingEdgeLength, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{1064, 2725, 1097, 37931, 41344, 49881, 2026, 1657, 43371, 21179, 38797, 43209, 24095, 3957, 9451, 23424, 981, 47129, 51781, 3818, 45301, 21789, 40705, 45332, 26007, 2025}, (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{61291, 59452, 61198, 5985, 17179, 16790, 32125, 31980, 16948, 45102, 5319, 53794, 46422, 60926, 42979, 8496, 59526, 23198, 18718}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
            int iGreen = 921 - Color.green(0);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 28;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[80];
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iGreen, iResolveSizeAndState, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                int i3 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int pressedStateDuration = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte b4 = $$a[80];
                Object[] objArr6 = new Object[1];
                a((byte) 51, b4, (byte) (b4 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, i3, pressedStateDuration, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = 1187916342 + (((~((-1647176113) | i4)) | 1613596944) * 98) + (((~(i4 | (-126903532))) | (-1647176113) | (~(126903531 | iIdentityHashCode))) * (-49)) + (((~(iIdentityHashCode | (-1647176113))) | (-1740500476)) * 49) + 603342997;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{55164, 58951, 55069, 1745, 19810, 20515, 28287, 28652, 31295, 48729, 1399, 49500, 36165, 58260, 46671, 12904, 53433, 21739, 22719, 26483, 25530, 47573, 3555, 55447, 46836, 60168, 48849, 3495, 55317, 23664}, TextUtils.indexOf("", "") + 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{22007, 46955, 21908, 4382, 7253, 18426, 41874, 41473, 63678, 61298, 4776, 3294, 4063, 45752, 41372, 65474, 21008, 1477, 20336, 43678, 57640, 59646}, (-16777215) - Color.rgb(0, 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = b + 61;
                    TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 21 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            int i10 = b + 5;
                            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                            int i11 = i10 % 2;
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i12 = b + 5;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        int i13 = i12 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{50111, 42516, 50133, 26655, 3390, 16127, 16817, 16433, 28349, 65039, 27580, 61138, 39296, 41881, 55458, 7665, 50248, 5295, 13920, 18617}, TextUtils.indexOf("", "") + 1, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{48800, 11839, 48841, 33878, 34064, 53925, 39320, 38935, 5112, 30241, 34784, 14060, 58544, 11261, 13515, 50633, 47463, 40095, 55848, 37016}, -ImageFormat.getBitsPerPixel(0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i14 = b + 53;
            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 603342997};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[90];
                Object[] objArr13 = new Object[1];
                d(b5, b5, bArr3[26], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[26];
                Object[] objArr14 = new Object[1];
                d(b6, b6, bArr3[90], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 31533);
                    int size = View.MeasureSpec.getSize(0) + 921;
                    int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                    byte b7 = $$a[80];
                    Object[] objArr16 = new Object[1];
                    a((byte) 51, b7, (byte) (b7 | 37), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, size, capsMode, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{1064, 2725, 1097, 37931, 41344, 49881, 2026, 1657, 43371, 21179, 38797, 43209, 24095, 3957, 9451, 23424, 981, 47129, 51781, 3818, 45301, 21789, 40705, 45332, 26007, 2025}, (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{61291, 59452, 61198, 5985, 17179, 16790, 32125, 31980, 16948, 45102, 5319, 53794, 46422, 60926, 42979, 8496, 59526, 23198, 18718}, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                        int iAxisFromString = 27 - MotionEvent.axisFromString("");
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[7];
                        byte b9 = bArr4[80];
                        Object[] objArr19 = new Object[1];
                        a(b8, b9, (byte) (b9 | 52), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, scrollBarFadeDuration, iAxisFromString, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cBlue = (char) (Color.blue(0) + 31533);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 922;
                        int i16 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        Object[] objArr20 = new Object[1];
                        a(bArr5[7], bArr5[37], bArr5[80], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, iLastIndexOf, i16, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyPid = Process.myPid();
            int i20 = i19 + 413785123 + (((~(809881015 | iMyPid)) | (-964546040) | (~(964198628 | iMyPid))) * (-744)) + (((~iMyPid) | 809533604) * 744) + ((iMyPid | 964546039) * 744);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
            return list;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
        int i23 = ((int[]) objArr[0])[0];
        Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i24 = ~iIdentityHashCode2;
        int i25 = i23 + 270326022 + (((~((-1056693305) | i24)) | (~(1056702075 | iIdentityHashCode2))) * (-831)) + ((~((-339315737) | iIdentityHashCode2)) * (-1662)) + (((~(iIdentityHashCode2 | 1056693304)) | (~(i24 | (-717386340))) | (~(717386339 | iIdentityHashCode2))) * 831);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr22[0])[0] = i27 ^ (i27 << 5);
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i, Object obj) {
        String str5;
        String str6;
        ProcessDetails processDetails2;
        List list2;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 67;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0 || (i & 1) == 0) {
            str5 = str;
        } else {
            str5 = androidApplicationInfo.packageName;
            int i5 = i4 + 13;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 61;
            b = i7 % 128;
            int i8 = i7 % 2;
            str6 = androidApplicationInfo.versionName;
        } else {
            str6 = str2;
        }
        String str7 = (i & 4) != 0 ? androidApplicationInfo.appBuildVersion : str3;
        String str8 = (i & 8) != 0 ? androidApplicationInfo.deviceManufacturer : str4;
        if ((i & 16) != 0) {
            int i9 = b + 93;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            int i10 = i9 % 2;
            processDetails2 = androidApplicationInfo.currentProcessDetails;
        } else {
            processDetails2 = processDetails;
        }
        if ((i & 32) != 0) {
            int i11 = TuitionPaymentFragmentbindingInflater1 + 121;
            b = i11 % 128;
            int i12 = i11 % 2;
            list2 = androidApplicationInfo.appProcessDetails;
        } else {
            list2 = list;
        }
        return androidApplicationInfo.copy(str5, str6, str7, str8, processDetails2, list2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 55;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.packageName;
        int i4 = i2 + 21;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 117;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.versionName;
        int i5 = i2 + 123;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 55;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appBuildVersion;
        int i5 = i2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = b + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.deviceManufacturer;
        int i5 = i3 + 115;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    public final ProcessDetails component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 77;
        b = i3 % 128;
        int i4 = i3 % 2;
        ProcessDetails processDetails = this.currentProcessDetails;
        int i5 = i2 + 81;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return processDetails;
        }
        throw null;
    }

    public final AndroidApplicationInfo copy(String p0, String p1, String p2, String p3, ProcessDetails p4, List<ProcessDetails> p5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        AndroidApplicationInfo androidApplicationInfo = new AndroidApplicationInfo(p0, p1, p2, p3, p4, p5);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
        return androidApplicationInfo;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = b + 29;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof AndroidApplicationInfo)) {
            int i4 = b + 35;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) p0;
        if ((!Intrinsics.areEqual(this.packageName, androidApplicationInfo.packageName)) || (!Intrinsics.areEqual(this.versionName, androidApplicationInfo.versionName)) || !Intrinsics.areEqual(this.appBuildVersion, androidApplicationInfo.appBuildVersion)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer)) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 9;
            b = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails)) {
            return false;
        }
        if (Intrinsics.areEqual(this.appProcessDetails, androidApplicationInfo.appProcessDetails)) {
            return true;
        }
        int i8 = TuitionPaymentFragmentbindingInflater1 + 7;
        b = i8 % 128;
        return i8 % 2 == 0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 67;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.packageName.hashCode() * 31) + this.versionName.hashCode()) * 31) + this.appBuildVersion.hashCode()) * 31) + this.deviceManufacturer.hashCode()) * 31) + this.currentProcessDetails.hashCode()) * 31) + this.appProcessDetails.hashCode();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 69;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb.append(this.packageName);
        sb.append(", versionName=");
        sb.append(this.versionName);
        sb.append(", appBuildVersion=");
        sb.append(this.appBuildVersion);
        sb.append(", deviceManufacturer=");
        sb.append(this.deviceManufacturer);
        sb.append(", currentProcessDetails=");
        sb.append(this.currentProcessDetails);
        sb.append(", appProcessDetails=");
        sb.append(this.appProcessDetails);
        sb.append(')');
        String string = sb.toString();
        int i2 = b + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r9 = r9 * 4
            int r9 = 1 - r9
            int r8 = r8 * 3
            int r8 = 107 - r8
            byte[] r0 = com.google.firebase.sessions.AndroidApplicationInfo.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2d:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.AndroidApplicationInfo.$$g(byte, byte, byte):java.lang.String");
    }
}
