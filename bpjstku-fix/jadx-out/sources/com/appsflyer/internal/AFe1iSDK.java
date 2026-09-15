package com.appsflyer.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AFe1iSDK extends AFe1gSDK {
    private final PurchaseHandler.PurchaseValidationCallback component2;
    private static final byte[] $$l = {32, 1, 70, -122};
    private static final int $$m = 76;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {81, -102, -70, -91, 52, -17, 5, 6, -28, 33, -2, -13, -4, 12, -36, 36, 3, -4, -39, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -12, 64, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -18, 7, 5, -10, 5, 5, -7, -30, 37, -8, 6, -11, 19, -15, 13, -65};
    private static final int $$k = 255;
    private static final byte[] $$d = {88, ByteCompanionObject.MAX_VALUE, -112, -47, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$e = 17;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] b = {57186, 60049, 60047, 60111, 60048, 60053, 57195, 57193, 57191, 60056, 60105, 60098, 60060, 60054, 57187, 60050, 60052, 60061, 60108, 60088, 60099, 60109, 60106, 60090, 57190, 60045, 60110, 60083, 60043, 60051, 60104, 60040, 60073, 60057, 57184, 60034, 60041, 60117, 57192, 60072, 60107, 60046, 60079, 60055, 57189, 60063, 60062, 57188, 60058};
    private static char TuitionPaymentFragmentbindingInflater1 = 57190;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r0 = r7 + 1
            int r8 = r8 * 52
            int r8 = r8 + 4
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = com.appsflyer.internal.AFe1iSDK.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r5
        L2e:
            int r8 = r8 + r6
            int r6 = r3 + 1
            int r8 = r8 + (-11)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1iSDK.e(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 19
            int r8 = r8 + 65
            byte[] r0 = com.appsflyer.internal.AFe1iSDK.$$j
            int r6 = r6 * 3
            int r1 = r6 + 38
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 37
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2f:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1iSDK.g(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1iSDK(AFe1mSDK aFe1mSDK, AFe1mSDK[] aFe1mSDKArr, AFc1dSDK aFc1dSDK, Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1mSDK, aFe1mSDKArr, aFc1dSDK, null, map);
        Intrinsics.checkNotNullParameter(aFe1mSDK, "");
        Intrinsics.checkNotNullParameter(aFe1mSDKArr, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component2 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        int i = 2 % 2;
        super.getRevenue();
        Throwable thComponent4 = component4();
        if (thComponent4 != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2 = this.component2;
            if (purchaseValidationCallback2 != null) {
                int i4 = i3 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                purchaseValidationCallback2.onFailure(thComponent4);
            }
        }
        ResponseNetwork<String> responseNetwork = ((AFe1dSDK) this).component1;
        if (responseNetwork == null || (purchaseValidationCallback = this.component2) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    private static void f(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int offsetBefore = 2267 - TextUtils.getOffsetBefore("", 0);
                        int iIndexOf = TextUtils.indexOf("", "") + 33;
                        byte b3 = (byte) ($$l[1] - 1);
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, offsetBefore, iIndexOf, -1927765101, false, $$n(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2267;
            int keyRepeatDelay = 33 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte b5 = (byte) ($$l[1] - 1);
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, packedPositionType, keyRepeatDelay, -1927765101, false, $$n(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        char c2 = 5;
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
            int i6 = $11 + 17;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 5;
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 89;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i10 = $11 + 47;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                    c = c2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = deinitsession;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = deinitsession;
                    objArr4[9] = deinitsession;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = deinitsession;
                    objArr4[6] = deinitsession;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[4] = deinitsession;
                    objArr4[3] = deinitsession;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = deinitsession;
                    objArr4[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cBlue = (char) (49267 - Color.blue(0));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3261;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 30;
                        byte b7 = $$l[1];
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, minimumFlingVelocity, iMakeMeasureSpec, -127612708, false, $$n(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i12 = $10 + 53;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 3;
                            byte b10 = (byte) (b9 - 3);
                            c = 5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - Color.green(0)), 594 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 18, 1570859318, false, $$n(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = 5;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                    } else {
                        obj = null;
                        c = 5;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        } else {
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
                c2 = c;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            int i20 = $11 + 73;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public boolean getMediationNetwork() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (37567 - ExpandableListView.getPackedPositionType(0L));
            int iIndexOf = TextUtils.indexOf("", "", 0) + 625;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 14;
            byte b2 = $$d[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            e(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, iIndexOf, touchSlop, -477065106, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        f(22 - Drawable.resolveOpacity(0, 0), new char[]{'/', 6, '+', Typography.amp, 17, 16, ',', Typography.amp, 17, 30, Typography.amp, '(', Typography.amp, 28, 4, ',', '\f', 20, ',', 15, 11, 2}, (byte) (Drawable.resolveOpacity(0, 0) + 55), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f(15 - View.getDefaultSize(0, 0), new char[]{'/', ',', '*', Typography.quote, ' ', '-', '.', 31, '/', '*', ',', 1, 20, '\b', 13843}, (byte) (AndroidCharacter.getMirror('0') - 28), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37567);
            int touchSlop2 = 625 - (ViewConfiguration.getTouchSlop() >> 8);
            int fadingEdgeLength = 14 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte[] bArr = $$d;
            byte b4 = (byte) (-bArr[5]);
            Object[] objArr5 = new Object[1];
            e(b4, b4, bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, touchSlop2, fadingEdgeLength, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) (37567 - View.combineMeasuredStates(0, 0));
                int gidForName = 624 - Process.getGidForName("");
                int iNormalizeMetaState = 14 - KeyEvent.normalizeMetaState(0);
                byte b5 = (byte) (-$$d[5]);
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                e(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, gidForName, iNormalizeMetaState, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i6};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = (-505691304) + (((~(1535778855 | i7)) | 2214080) * 184) + ((iIdentityHashCode | 1250033670) * (-184)) + ((~((-287959266) | i7)) * 184) + 1111320141;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i5}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            f(25 - ImageFormat.getBitsPerPixel(0), new char[]{'/', 6, '+', Typography.amp, 17, 16, ',', Typography.amp, '*', Typography.quote, 30, '#', 30, 16, 1, 16, 22, 18, 0, '%', '+', 28, '\'', '+', '*', '.'}, (byte) (82 - MotionEvent.axisFromString("")), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            f(TextUtils.lastIndexOf("", '0') + 19, new char[]{'\r', '%', 13809, 13809, '/', 4, '\t', 30, 13811, 13811, 1, 22, '\r', ',', 1, 16, 19, 2}, (byte) (9 - Color.argb(0, 0, 0, 0)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                if (i11 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
            }
            Object[] objArr10 = new Object[1];
            f(View.combineMeasuredStates(0, 0) + 16, new char[]{6, '+', 27, '.', Typography.dollar, ',', '/', 6, '\t', '(', '(', Typography.dollar, 30, 3, '0', 11}, (byte) (50 - Color.blue(0)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            f(17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{17, '+', '/', 4, 1, 16, 0, '%', Typography.quote, 6, ' ', 30, 20, 17, '.', '/'}, (byte) (113 - KeyEvent.keyCodeFromString("")), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            f(64 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{11, '-', 20, '-', '/', Typography.quote, 14, 24, '\n', 18, 19, 24, 13923, 13923, '/', 27, 15, 25, 25, '*', 25, 19, 19, ' ', 4, 25, 29, 26, 31, ',', 4, '\n', '\r', '.', 11, '\f', 13839, 13839, 27, 6, 19, 24, 6, 17, 18, '-', '!', 23, '/', ')', 27, 6, 6, 17, '\f', 31, '\r', 18, 5, 31, 31, 19, '\f', 31}, (byte) (Color.red(0) + 100), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            f(64 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{'\r', ',', '*', 24, '/', '!', ' ', 19, '-', 18, '/', '(', '-', 11, 24, '\n', '\t', 31, 23, 28, 25, 19, 14, 24, 31, 5, ' ', '\f', ' ', '\t', '\r', 18, '\f', ' ', 27, 23, 4, '-', '-', '\r', 11, '-', 14, 24, 17, 4, 13738, 13738, '\f', '\n', 13732, 13732, 31, 5, 31, '\t', '\n', 16, 17, '\n', '/', ')', 24, 14}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 1), objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 1111320141};
                byte[] bArr2 = $$j;
                byte b7 = bArr2[49];
                byte b8 = (byte) (-b7);
                byte b9 = b7;
                Object[] objArr15 = new Object[1];
                g(b8, b9, (byte) (b9 + 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b10 = bArr2[49];
                Object[] objArr16 = new Object[1];
                g((byte) (b10 + 1), (byte) (-bArr2[18]), (byte) (-b10), objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i12 = ((int[]) objArr17[0])[0];
                int i13 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 37567);
                        int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 625;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 15;
                        byte b11 = (byte) (-$$d[5]);
                        byte b12 = b11;
                        Object[] objArr18 = new Object[1];
                        e(b11, b12, b12, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, offsetBefore2, iLastIndexOf, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        f(21 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{'/', 6, '+', Typography.amp, 17, 16, ',', Typography.amp, 17, 30, Typography.amp, '(', Typography.amp, 28, 4, ',', '\f', 20, ',', 15, 11, 2}, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 54), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        f((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, new char[]{'/', ',', '*', Typography.quote, ' ', '-', '.', 31, '/', '*', ',', 1, 20, '\b', 13843}, (byte) (20 - TextUtils.getOffsetAfter("", 0)), objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (37568 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int iRgb = Color.rgb(0, 0, 0) + 16777841;
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15;
                            byte[] bArr3 = $$d;
                            byte b13 = (byte) (-bArr3[5]);
                            Object[] objArr21 = new Object[1];
                            e(b13, b13, bArr3[7], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iRgb, iIndexOf2, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMyPid = (char) (37567 - (Process.myPid() >> 22));
                            int minimumFlingVelocity = 625 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int i14 = 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte b14 = $$d[7];
                            byte b15 = b14;
                            Object[] objArr22 = new Object[1];
                            e(b14, b15, b15, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, minimumFlingVelocity, i14, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            while (i4 < strArr2.length) {
                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                if (i15 % 2 == 0) {
                    arrayList.add(strArr2[i4]);
                    i4 += 102;
                } else {
                    arrayList.add(strArr2[i4]);
                    i4++;
                }
            }
            throw null;
        }
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i17};
        int[] iArr3 = {i18};
        int iMyUid = Process.myUid();
        int i19 = 908283336 + (((~(868109578 | iMyUid)) | 955628542) * 672);
        int i20 = ~iMyUid;
        int i21 = i16 + i19 + (((~(iMyUid | 955628542)) | (~((-868109579) | i20))) * (-672)) + (((~((-955628543) | i20)) | 138523380) * 672);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr[1])[0] = i23 ^ (i23 << 5);
        Object[] objArr23 = {iArr3, new int[1], iArr2, strArr3};
        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
        if (i24 % 2 != 0) {
            ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
            obj.hashCode();
            throw null;
        }
        if (((AFe1dSDK) this).component1 != null) {
            ResponseNetwork responseNetwork2 = ((AFe1dSDK) this).component1;
            Intrinsics.checkNotNull(responseNetwork2);
            int statusCode = responseNetwork2.getStatusCode();
            int i25 = ((int[]) objArr23[1])[0];
            int i26 = ((((i25 * i25) - (~(-(36551049 * i25)))) - 1) - (~(-(i25 * (-1160404551))))) - 1375404224;
            int i27 = i26 >> 22;
            int i28 = (i26 - (~((((i27 ^ (-2047)) + ((i27 & (-2047)) << 1)) / 1024) + 1))) - 1;
            int i29 = i26 >> 15;
            int i30 = (((-262143) & i29) + (i29 | (-262143))) / 131072;
            int i31 = -(i28 ^ ((i30 & 1) + (i30 | 1)));
            int i32 = ((i31 | 8) << 1) - (i31 ^ 8);
            int i33 = (((i32 >> 16) - 131071) / 65536) + 1;
            if (statusCode == 853088 / (((-(((i33 | 1) << 1) - (i33 ^ 1))) & i32) * 212)) {
                return true;
            }
        }
        return super.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    protected final String AFAdRevenueData(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object obj = null;
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                String str = (String) objRemove;
                if (i4 % 2 == 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    protected final String getMonetizationNetwork(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                return (String) objRemove;
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    protected final boolean component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(int r6, short r7, int r8) {
        /*
            int r6 = r6 + 113
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = com.appsflyer.internal.AFe1iSDK.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + 1
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1iSDK.$$n(int, short, int):java.lang.String");
    }
}
