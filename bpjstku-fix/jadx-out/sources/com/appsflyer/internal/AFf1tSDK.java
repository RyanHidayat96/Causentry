package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1tSDK extends AFf1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = null;
    private static int AFKeystoreWrapper = 1;
    private static int AFLogger;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char registerClient;
    private final AFg1qSDK AFInAppEventType;
    private final AFc1pSDK copydefault;
    private final String equals;
    private final AFc1iSDK hashCode;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$f = 75;
    private static int $12 = 0;
    private static int $13 = 1;
    private static final byte[] $$d = {117, 57, 101, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 112;
    private static final byte[] $$a = {68, 104, -93, -37, 2, -15, 36, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9};
    private static final int $$b = 207;
    private static int d = 0;
    private static int g = 1;
    private static int b = 1;

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = g + 69;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            getRevenue(objArr);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object revenue = getRevenue(objArr);
        int i6 = g + 119;
        d = i6 % 128;
        int i7 = i6 % 2;
        return revenue;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r0 = com.appsflyer.internal.AFf1tSDK.$$a
            int r7 = r7 * 3
            int r1 = r7 + 14
            byte[] r1 = new byte[r1]
            int r7 = r7 + 13
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L30:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.appsflyer.internal.AFf1tSDK.$$d
            int r8 = r8 * 52
            int r1 = 53 - r8
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r7 = r7 + 84
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.e(int, byte, int, java.lang.Object[]):void");
    }

    public AFf1tSDK(String str, AFc1dSDK aFc1dSDK) {
        super(new AFg1wSDK(), aFc1dSDK, str);
        this.copydefault = aFc1dSDK.getRevenue();
        this.hashCode = aFc1dSDK.AFInAppEventType();
        this.equals = str;
        this.AFInAppEventType = aFc1dSDK.component3();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r2 = r2 + 7;
        com.appsflyer.internal.AFf1tSDK.d = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if ((r2 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        copy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        copy();
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        copy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if ((r1 >>> 4) != 0) goto L13;
     */
    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getRevenue() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            super.getRevenue()
            com.appsflyer.internal.AFd1aSDK<Result> r1 = r5.component1
            if (r1 == 0) goto L5d
            int r2 = com.appsflyer.internal.AFf1tSDK.d
            int r2 = r2 + 3
            int r3 = r2 % 128
            com.appsflyer.internal.AFf1tSDK.g = r3
            int r2 = r2 % r0
            int r2 = com.appsflyer.internal.AFf1tSDK.AFLogger
            int r2 = r2 + 11
            int r2 = r2 % 128
            com.appsflyer.internal.AFf1tSDK.AFKeystoreWrapper = r2
            boolean r1 = r1.isSuccessful()
            if (r1 == 0) goto L5d
            int r1 = com.appsflyer.internal.AFf1tSDK.d
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.appsflyer.internal.AFf1tSDK.g = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L3a
            int r1 = com.appsflyer.internal.AFf1tSDK.AFLogger
            int r1 = r1 / 103
            int r4 = r1 * 14263
            com.appsflyer.internal.AFf1tSDK.AFKeystoreWrapper = r4
            int r1 = r1 >>> 4
            if (r1 == 0) goto L59
            goto L45
        L3a:
            int r1 = com.appsflyer.internal.AFf1tSDK.AFLogger
            int r1 = r1 + 117
            int r4 = r1 % 128
            com.appsflyer.internal.AFf1tSDK.AFKeystoreWrapper = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L59
        L45:
            int r2 = r2 + 7
            int r1 = r2 % 128
            com.appsflyer.internal.AFf1tSDK.d = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L52
            r5.copy()
            return
        L52:
            r5.copy()
            r3.hashCode()
            throw r3
        L59:
            r5.copy()
            throw r3
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.getRevenue():void");
    }

    private static void f(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i5 = $13 + 45;
        $12 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $13 + 57;
            $12 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getSize(0) + 8328), TextUtils.indexOf((CharSequence) "", '0', 0) + 1236, 35 - ((Process.getThreadPriority(0) + 20) >> 6), -653973969, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iRgb = (-16774452) - Color.rgb(0, 0, 0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 15;
                    byte b4 = (byte) ($$f & 6);
                    byte b5 = (byte) (b4 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, iRgb, iLastIndexOf, 1504416861, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43325), 253 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 65200);
                    int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2892;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17;
                    byte b6 = (byte) ($$f & 5);
                    byte b7 = (byte) (-b6);
                    String str$$g = $$g(b6, b7, (byte) (b7 + 1));
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, i9, doubleTapTimeout, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x068c  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0770, code lost:
    
        if ((r0 - 2) == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x077c, code lost:
    
        if ((r0 % 2) == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x077e, code lost:
    
        r4.getMediationNetwork(com.appsflyer.AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0787, code lost:
    
        r4.getMediationNetwork(com.appsflyer.AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0794, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x07b7, code lost:
    
        if ((r2 / 4) != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x07c4, code lost:
    
        if ((r2 % 2) != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x07c6, code lost:
    
        r4.getMediationNetwork("amazon_aid", r0.getMonetizationNetwork);
        r4.getMediationNetwork("amazon_aid_limit", java.lang.String.valueOf(r0.getMediationNetwork));
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x07d9, code lost:
    
        r4.getMediationNetwork("amazon_aid", r0.getMonetizationNetwork);
        r4.getMediationNetwork("amazon_aid_limit", java.lang.String.valueOf(r0.getMediationNetwork));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x07ec, code lost:
    
        throw null;
     */
    @Override // com.appsflyer.internal.AFf1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void AFAdRevenueData(com.appsflyer.internal.AFh1rSDK r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.AFAdRevenueData(com.appsflyer.internal.AFh1rSDK):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        com.appsflyer.internal.AFf1tSDK.AFLogger = (com.appsflyer.internal.AFf1tSDK.AFKeystoreWrapper + 103) % 128;
        r4.getMediationNetwork("advertiserId", r1);
        r4 = com.appsflyer.internal.AFf1tSDK.d + 5;
        com.appsflyer.internal.AFf1tSDK.g = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r3.copydefault.AFAdRevenueData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((r1 * 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1 = r3.copydefault.AFAdRevenueData();
     */
    @Override // com.appsflyer.internal.AFf1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void component3(com.appsflyer.internal.AFh1rSDK r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFf1tSDK.d
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.appsflyer.internal.AFf1tSDK.g = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1a
            int r1 = com.appsflyer.internal.AFf1tSDK.AFKeystoreWrapper
            int r1 = r1 % 25
            int r2 = r1 + 31925
            com.appsflyer.internal.AFf1tSDK.AFLogger = r2
            int r1 = r1 * r0
            if (r1 != 0) goto L44
            goto L25
        L1a:
            int r1 = com.appsflyer.internal.AFf1tSDK.AFKeystoreWrapper
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.appsflyer.internal.AFf1tSDK.AFLogger = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L44
        L25:
            com.appsflyer.internal.AFc1pSDK r1 = r3.copydefault
            java.lang.String r1 = r1.AFAdRevenueData()
            if (r1 == 0) goto L43
            int r2 = com.appsflyer.internal.AFf1tSDK.AFKeystoreWrapper
            int r2 = r2 + 103
            int r2 = r2 % 128
            com.appsflyer.internal.AFf1tSDK.AFLogger = r2
            java.lang.String r2 = "advertiserId"
            r4.getMediationNetwork(r2, r1)
            int r4 = com.appsflyer.internal.AFf1tSDK.d
            int r4 = r4 + 5
            int r1 = r4 % 128
            com.appsflyer.internal.AFf1tSDK.g = r1
            int r4 = r4 % r0
        L43:
            return
        L44:
            com.appsflyer.internal.AFc1pSDK r4 = r3.copydefault
            r4.AFAdRevenueData()
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.component3(com.appsflyer.internal.AFh1rSDK):void");
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 89;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = AFKeystoreWrapper + 95;
        int i6 = i5 % 128;
        AFLogger = i6;
        if (i5 % 2 != 0) {
            int i7 = i3 + 51;
            d = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 / 3;
            }
            z = false;
        } else {
            z = true;
        }
        int i9 = i6 + 73;
        AFKeystoreWrapper = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
        int i10 = i3 + 99;
        d = i10 % 128;
        return i10 % 2 != 0 ? z : !z;
    }

    private void copy() {
        AFc1qSDK aFc1qSDK;
        boolean z;
        int i = 2 % 2;
        int i2 = AFLogger + 101;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            aFc1qSDK = this.copy;
            z = false;
        } else {
            aFc1qSDK = this.copy;
            int i3 = d + 47;
            g = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        }
        aFc1qSDK.getCurrencyIso4217Code("sentRegisterRequestToAF", z);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        AFLogger = (AFKeystoreWrapper + 81) % 128;
        int i5 = d + 27;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AFLogger + 53;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = g + 71;
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 43;
        g = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if ((r0 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r4 = 79 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((r1 / 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = r0 + 37;
        com.appsflyer.internal.AFf1tSDK.g = r0 % 128;
     */
    @Override // com.appsflyer.internal.AFf1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void getMonetizationNetwork(com.appsflyer.internal.AFh1rSDK r4) {
        /*
            r3 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.appsflyer.internal.AFf1tSDK.d
            int r1 = r0 + 39
            int r2 = r1 % 128
            com.appsflyer.internal.AFf1tSDK.g = r2
            int r1 = r1 % r4
            if (r1 != 0) goto L1c
            int r1 = com.appsflyer.internal.AFf1tSDK.AFLogger
            int r1 = r1 / 126
            r2 = 27774(0x6c7e, float:3.892E-41)
            int r2 = r1 >>> r2
            com.appsflyer.internal.AFf1tSDK.AFKeystoreWrapper = r2
            int r1 = r1 / r4
            if (r1 == 0) goto L35
            goto L27
        L1c:
            int r1 = com.appsflyer.internal.AFf1tSDK.AFLogger
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.appsflyer.internal.AFf1tSDK.AFKeystoreWrapper = r2
            int r1 = r1 % r4
            if (r1 == 0) goto L35
        L27:
            int r0 = r0 + 37
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1tSDK.g = r1
            int r0 = r0 % r4
            if (r0 != 0) goto L34
            r4 = 79
            int r4 = r4 / 0
        L34:
            return
        L35:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.getMonetizationNetwork(com.appsflyer.internal.AFh1rSDK):void");
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getMediationNetwork(AFh1rSDK aFh1rSDK) {
        int i = 2 % 2;
        int i2 = g + 75;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = AFLogger;
        AFKeystoreWrapper = i3 != 0 ? (i4 / 38) >>> 26499 : (i4 + 103) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        int i = 2 % 2;
        int i2 = g + 101;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        AFLogger = (AFKeystoreWrapper + 1) % 128;
        int i5 = i3 + 5;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(byte b2, String str, int i, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        char[] cArr = AFInAppEventParameterName;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr2[i4] = (char) (((long) cArr[i4]) ^ (-374623853307093042L));
            }
            cArr = cArr2;
        }
        char c = (char) ((-374623853307093042L) ^ ((long) registerClient));
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 67;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = i + 123;
                cArr3[i2] = (char) (charArray[i2] - b2);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aFk1mSDK.AFAdRevenueData = 0;
            $11 = ($10 + 113) % 128;
            while (aFk1mSDK.AFAdRevenueData < i2) {
                aFk1mSDK.getMonetizationNetwork = charArray[aFk1mSDK.AFAdRevenueData];
                aFk1mSDK.getCurrencyIso4217Code = charArray[aFk1mSDK.AFAdRevenueData + 1];
                if (aFk1mSDK.getMonetizationNetwork == aFk1mSDK.getCurrencyIso4217Code) {
                    cArr3[aFk1mSDK.AFAdRevenueData] = (char) (aFk1mSDK.getMonetizationNetwork - b2);
                    cArr3[aFk1mSDK.AFAdRevenueData + 1] = (char) (aFk1mSDK.getCurrencyIso4217Code - b2);
                } else {
                    aFk1mSDK.getMediationNetwork = aFk1mSDK.getMonetizationNetwork / c;
                    aFk1mSDK.component1 = aFk1mSDK.getMonetizationNetwork % c;
                    aFk1mSDK.getRevenue = aFk1mSDK.getCurrencyIso4217Code / c;
                    aFk1mSDK.component2 = aFk1mSDK.getCurrencyIso4217Code % c;
                    if (aFk1mSDK.component1 == aFk1mSDK.component2) {
                        $11 = ($10 + 83) % 128;
                        aFk1mSDK.getMediationNetwork = ((aFk1mSDK.getMediationNetwork + c) - 1) % c;
                        aFk1mSDK.getRevenue = ((aFk1mSDK.getRevenue + c) - 1) % c;
                        int i6 = aFk1mSDK.getMediationNetwork;
                        int i7 = aFk1mSDK.component1;
                        int i8 = aFk1mSDK.getRevenue;
                        int i9 = aFk1mSDK.component2;
                        cArr3[aFk1mSDK.AFAdRevenueData] = cArr[(i6 * c) + i7];
                        cArr3[aFk1mSDK.AFAdRevenueData + 1] = cArr[(i8 * c) + i9];
                    } else if (aFk1mSDK.getMediationNetwork == aFk1mSDK.getRevenue) {
                        aFk1mSDK.component1 = ((aFk1mSDK.component1 + c) - 1) % c;
                        aFk1mSDK.component2 = ((aFk1mSDK.component2 + c) - 1) % c;
                        int i10 = aFk1mSDK.getMediationNetwork;
                        int i11 = aFk1mSDK.component1;
                        int i12 = aFk1mSDK.getRevenue;
                        int i13 = aFk1mSDK.component2;
                        cArr3[aFk1mSDK.AFAdRevenueData] = cArr[(i10 * c) + i11];
                        cArr3[aFk1mSDK.AFAdRevenueData + 1] = cArr[(i12 * c) + i13];
                        $11 = ($10 + 69) % 128;
                    } else {
                        int i14 = aFk1mSDK.getMediationNetwork;
                        int i15 = aFk1mSDK.component2;
                        int i16 = aFk1mSDK.getRevenue;
                        int i17 = aFk1mSDK.component1;
                        cArr3[aFk1mSDK.AFAdRevenueData] = cArr[(i14 * c) + i15];
                        cArr3[aFk1mSDK.AFAdRevenueData + 1] = cArr[(i16 * c) + i17];
                    }
                }
                aFk1mSDK.AFAdRevenueData += 2;
            }
        }
        $10 = ($11 + 33) % 128;
        int i18 = 0;
        while (i18 < i) {
            int i19 = d;
            int i20 = i19 + 51;
            g = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = $11 >>> 127;
                $10 = i21 + 4668;
                if (i21 + 2 != 0) {
                    cArr3[i18] = (char) (cArr3[i18] ^ 31812);
                    i18 += 84;
                } else {
                    cArr3[i18] = (char) (cArr3[i18] ^ 13722);
                    i18++;
                    int i22 = i19 + 107;
                    g = i22 % 128;
                    int i23 = i22 % 2;
                }
            } else {
                int i24 = $11 + 67;
                $10 = i24 % 128;
                if (i24 % 2 != 0) {
                    cArr3[i18] = (char) (cArr3[i18] ^ 31812);
                    i18 += 84;
                } else {
                    cArr3[i18] = (char) (cArr3[i18] ^ 13722);
                    i18++;
                    int i25 = i19 + 107;
                    g = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        TuitionPaymentFragmentbindingInflater1 = (char) 16122;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 + 102
            byte[] r0 = com.appsflyer.internal.AFf1tSDK.$$c
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r6 = r6 + r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.$$g(byte, byte, int):java.lang.String");
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        AFInAppEventParameterName = new char[]{10790, 10789, 10800, 10806, 10786, 10791, 10805, 10788, 10810};
        registerClient = (char) 8141;
        int i = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getRevenue(AFh1rSDK aFh1rSDK) {
        int i = 2 % 2;
        int i2 = d + 119;
        g = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData(new Object[]{this, aFh1rSDK}, 2011239149, -2011239149, System.identityHashCode(this));
        int i4 = d + 55;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
