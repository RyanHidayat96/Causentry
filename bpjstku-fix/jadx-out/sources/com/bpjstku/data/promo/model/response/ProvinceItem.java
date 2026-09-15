package com.bpjstku.data.promo.model.response;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionProcessor;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/promo/model/response/ProvinceItem;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/promo/model/response/ProvinceItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "code", "Ljava/lang/String;", "getCode", "province", "getProvince"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProvinceItem {
    public static final int $stable = 0;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f401a;
    private static int b;

    @SerializedName("code")
    private final String code;

    @SerializedName("province")
    private final String province;
    private static final byte[] $$c = {94, -56, 58, -24};
    private static final int $$f = 124;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, -108, 100, 114};
    private static final int $$e = 209;
    private static final byte[] $$a = {83, -4, -55, -17, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1, 1, 21, -15, 0};
    private static final int $$b = 54;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int d = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.data.promo.model.response.ProvinceItem.$$d
            int r7 = 98 - r7
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r7
            r7 = r6
        L29:
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.promo.model.response.ProvinceItem.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 15
            int r7 = 18 - r7
            byte[] r0 = com.bpjstku.data.promo.model.response.ProvinceItem.$$a
            int r8 = r8 * 9
            int r8 = r8 + 106
            int r6 = r6 * 11
            int r1 = r6 + 5
            byte[] r1 = new byte[r1]
            int r6 = r6 + 4
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L31:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + 2
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.promo.model.response.ProvinceItem.g(short, short, byte, java.lang.Object[]):void");
    }

    public ProvinceItem(String str, String str2) {
        this.code = str;
        this.province = str2;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.code;
        int i5 = i2 + 27;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProvince() {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.province;
        int i4 = i3 + 11;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void f(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i6 = $11 + 45;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i8 = $10 + 41;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(i5, i5) + 8328);
                    int i10 = 1235 - (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1));
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 35;
                    byte b2 = (byte) i5;
                    byte b3 = b2;
                    String str$$g = $$g(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, i10, scrollBarSize, -653973969, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int i11 = 2764 - (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i12 = (ExpandableListView.getPackedPositionForGroup(i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == 0L ? 0 : -1)) + 14;
                    byte b4 = (byte) i5;
                    byte b5 = (byte) (b4 + 2);
                    String str$$g2 = $$g(b4, b5, (byte) (b5 - 3));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i11, i12, 1504416861, false, str$$g2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                int i13 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i13);
                objArr4[i5] = sessionProcessor;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 43326);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 253;
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i5] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, edgeSlop, maxKeyCode, -721491957, false, "j", clsArr3);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i14 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i5] = Integer.valueOf(i14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char longPressTimeout = (char) (65200 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int packedPositionChild = 2890 - ExpandableListView.getPackedPositionChild(0L);
                    int bitsPerPixel = 16 - ImageFormat.getBitsPerPixel(i5);
                    byte b6 = (byte) i5;
                    byte b7 = (byte) (b6 + 1);
                    String str$$g3 = $$g(b6, b7, (byte) (-b7));
                    i2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i5] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(longPressTimeout, packedPositionChild, bitsPerPixel, 2012627446, false, str$$g3, clsArr4);
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) b) ^ (-6377398940819159759L)))) ^ (((long) (cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = i2;
                i5 = 0;
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

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        int i3;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = 0;
        int i5 = 1770390596;
        int i6 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionChild(j) + 2268, TextUtils.indexOf("", "") + 33, -1927765101, false, $$g(b3, (byte) (b3 | 11), (byte) (-1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    j = 0;
                    i5 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        char c2 = '\b';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), 2267 - Color.blue(0), (ViewConfiguration.getTouchSlop() >> 8) + 33, -1927765101, false, $$g(b4, (byte) (b4 | 11), (byte) (-1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $10 + 121;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                i2 = i + 124;
                cArr4[i2] = (char) (cArr[i2] + b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        char c3 = 4;
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + i6];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + i6] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    c = c2;
                    i3 = i6;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = deinitsession;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = deinitsession;
                    objArr4[9] = deinitsession;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[7] = deinitsession;
                    objArr4[6] = deinitsession;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[c3] = deinitsession;
                    objArr4[3] = deinitsession;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i6] = deinitsession;
                    objArr4[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49266), 3309 - AndroidCharacter.getMirror('0'), 29 - TextUtils.indexOf((CharSequence) "", '0', 0), -127612708, false, $$g(b5, (byte) (b5 | 12), (byte) (-1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            c = '\b';
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22878), 594 - View.MeasureSpec.getMode(0), 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1570859318, false, $$g(b6, (byte) (b6 | 14), (byte) (-1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = '\b';
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                    } else {
                        c = '\b';
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i10 = $10 + 27;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
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
                            i3 = 1;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        }
                    }
                    i3 = 1;
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                i6 = i3;
                c2 = c;
                c3 = 4;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            i16++;
            int i17 = $10 + 19;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 2 % 4;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static {
        f401a = 0;
        b();
        int i = d + 113;
        f401a = i % 128;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    public static /* synthetic */ ProvinceItem copy$default(ProvinceItem provinceItem, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = provinceItem.code;
        }
        if ((i & 2) != 0) {
            int i3 = asBinder + 41;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            str2 = provinceItem.province;
        }
        ProvinceItem provinceItemCopy = provinceItem.copy(str, str2);
        int i5 = asInterface + 119;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return provinceItemCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.code;
        int i5 = i2 + 17;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 1;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.province;
        int i5 = i2 + 105;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ProvinceItem copy(String p0, String p1) {
        int i = 2 % 2;
        ProvinceItem provinceItem = new ProvinceItem(p0, p1);
        int i2 = asBinder + 51;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return provinceItem;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = asInterface + 63;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof ProvinceItem)) {
            int i4 = asInterface + 107;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ProvinceItem provinceItem = (ProvinceItem) p0;
        if (!Intrinsics.areEqual(this.code, provinceItem.code)) {
            int i6 = asBinder + 47;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.province, provinceItem.province)) {
            return true;
        }
        int i8 = asBinder + 49;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 1;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.code;
        if (str == null) {
            int i5 = i2 + 55;
            asInterface = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.province;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.code;
        String str2 = this.province;
        StringBuilder sb = new StringBuilder("ProvinceItem(code=");
        sb.append(str);
        sb.append(", province=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x1682  */
    /* JADX WARN: Code duplicated, block: B:136:0x16d0 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:140:0x17b7  */
    /* JADX WARN: Code duplicated, block: B:141:0x17bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x17d1  */
    /* JADX WARN: Code duplicated, block: B:271:0x24d4 A[Catch: Exception -> 0x24fd, PHI: r1
  0x24d4: PHI (r1v264 java.lang.String) = (r1v260 java.lang.String), (r1v271 java.lang.String) binds: [B:270:0x24d2, B:257:0x2460] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #24 {Exception -> 0x24fd, blocks: (B:228:0x2270, B:238:0x22bd, B:245:0x233c, B:248:0x23cf, B:252:0x23ff, B:271:0x24d4, B:273:0x24da, B:261:0x2465, B:263:0x246b, B:264:0x246c, B:265:0x246d, B:275:0x24de, B:277:0x24e5, B:278:0x24e6, B:280:0x24e8, B:282:0x24ef, B:283:0x24f0, B:232:0x22ac, B:234:0x22b5, B:235:0x22b6, B:285:0x24f2, B:287:0x24fb, B:288:0x24fc, B:253:0x2409, B:255:0x2416, B:256:0x2457, B:239:0x22e6, B:241:0x22f3, B:242:0x2332, B:223:0x21b8, B:225:0x21c5, B:226:0x2208, B:216:0x20dd, B:218:0x20ea, B:219:0x2125, B:266:0x2479, B:268:0x2486, B:269:0x24c8), top: B:564:0x20dd, inners: #0, #1, #3, #5, #28 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x24da A[Catch: Exception -> 0x24fd, TryCatch #24 {Exception -> 0x24fd, blocks: (B:228:0x2270, B:238:0x22bd, B:245:0x233c, B:248:0x23cf, B:252:0x23ff, B:271:0x24d4, B:273:0x24da, B:261:0x2465, B:263:0x246b, B:264:0x246c, B:265:0x246d, B:275:0x24de, B:277:0x24e5, B:278:0x24e6, B:280:0x24e8, B:282:0x24ef, B:283:0x24f0, B:232:0x22ac, B:234:0x22b5, B:235:0x22b6, B:285:0x24f2, B:287:0x24fb, B:288:0x24fc, B:253:0x2409, B:255:0x2416, B:256:0x2457, B:239:0x22e6, B:241:0x22f3, B:242:0x2332, B:223:0x21b8, B:225:0x21c5, B:226:0x2208, B:216:0x20dd, B:218:0x20ea, B:219:0x2125, B:266:0x2479, B:268:0x2486, B:269:0x24c8), top: B:564:0x20dd, inners: #0, #1, #3, #5, #28 }] */
    /* JADX WARN: Code duplicated, block: B:293:0x2564 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:296:0x25ab  */
    /* JADX WARN: Code duplicated, block: B:298:0x25ed  */
    /* JADX WARN: Code duplicated, block: B:301:0x25f7 A[LOOP:3: B:297:0x25eb->B:301:0x25f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x28c0  */
    /* JADX WARN: Code duplicated, block: B:308:0x2944 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:313:0x2a32 A[LOOP:4: B:303:0x28bc->B:313:0x2a32, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:314:0x2a38 A[EDGE_INSN: B:314:0x2a38->B:315:0x2a39 BREAK  A[LOOP:3: B:297:0x25eb->B:301:0x25f7]] */
    /* JADX WARN: Code duplicated, block: B:320:0x2a89 A[Catch: all -> 0x2ab7, IOException -> 0x2ac5, TryCatch #27 {IOException -> 0x2ac5, all -> 0x2ab7, blocks: (B:318:0x2a82, B:320:0x2a89, B:323:0x2a95), top: B:600:0x2a82 }] */
    /* JADX WARN: Code duplicated, block: B:323:0x2a95 A[Catch: all -> 0x2ab7, IOException -> 0x2ac5, TRY_LEAVE, TryCatch #27 {IOException -> 0x2ac5, all -> 0x2ab7, blocks: (B:318:0x2a82, B:320:0x2a89, B:323:0x2a95), top: B:600:0x2a82 }] */
    /* JADX WARN: Code duplicated, block: B:329:0x2aa6  */
    /* JADX WARN: Code duplicated, block: B:330:0x2aaa A[LOOP:6: B:321:0x2a92->B:330:0x2aaa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:345:0x2ace A[EDGE_INSN: B:345:0x2ace->B:389:0x2c98 BREAK  A[LOOP:9: B:349:0x2bc0->B:388:0x2c8d]] */
    /* JADX WARN: Code duplicated, block: B:346:0x2ad1  */
    /* JADX WARN: Code duplicated, block: B:348:0x2bbe  */
    /* JADX WARN: Code duplicated, block: B:394:0x2d03 A[Catch: all -> 0x2d2e, IOException -> 0x2d3c, TryCatch #31 {IOException -> 0x2d3c, all -> 0x2d2e, blocks: (B:392:0x2cfc, B:394:0x2d03, B:396:0x2d0f), top: B:592:0x2cfc }] */
    /* JADX WARN: Code duplicated, block: B:396:0x2d0f A[Catch: all -> 0x2d2e, IOException -> 0x2d3c, TRY_LEAVE, TryCatch #31 {IOException -> 0x2d3c, all -> 0x2d2e, blocks: (B:392:0x2cfc, B:394:0x2d03, B:396:0x2d0f), top: B:592:0x2cfc }] */
    /* JADX WARN: Code duplicated, block: B:403:0x2d1c  */
    /* JADX WARN: Code duplicated, block: B:423:0x2d80 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:427:0x2e6d  */
    /* JADX WARN: Code duplicated, block: B:428:0x2e6f  */
    /* JADX WARN: Code duplicated, block: B:432:0x2eac A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:436:0x2f6a  */
    /* JADX WARN: Code duplicated, block: B:437:0x2f70  */
    /* JADX WARN: Code duplicated, block: B:441:0x2f8a A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:446:0x307a A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:451:0x3187 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:455:0x3261  */
    /* JADX WARN: Code duplicated, block: B:459:0x32a5 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:464:0x3506 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:465:0x353b  */
    /* JADX WARN: Code duplicated, block: B:470:0x3619 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:475:0x3767 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:479:0x3845  */
    /* JADX WARN: Code duplicated, block: B:481:0x3854  */
    /* JADX WARN: Code duplicated, block: B:482:0x3862  */
    /* JADX WARN: Code duplicated, block: B:486:0x3883  */
    /* JADX WARN: Code duplicated, block: B:487:0x3888  */
    /* JADX WARN: Code duplicated, block: B:490:0x391c  */
    /* JADX WARN: Code duplicated, block: B:491:0x3923  */
    /* JADX WARN: Code duplicated, block: B:495:0x3968 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:499:0x3a43  */
    /* JADX WARN: Code duplicated, block: B:500:0x3a45  */
    /* JADX WARN: Code duplicated, block: B:503:0x3a6f  */
    /* JADX WARN: Code duplicated, block: B:506:0x3a78 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:512:0x3b7b A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:517:0x3c6c A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:522:0x3d95 A[Catch: all -> 0x3f0a, TryCatch #22 {all -> 0x3f0a, blocks: (B:3:0x000d, B:6:0x001b, B:7:0x0043, B:9:0x0143, B:11:0x0152, B:12:0x018b, B:16:0x028e, B:18:0x029b, B:19:0x02d6, B:23:0x040c, B:25:0x0419, B:26:0x0453, B:28:0x0479, B:30:0x0486, B:31:0x04c5, B:33:0x04ce, B:35:0x04e6, B:36:0x0528, B:70:0x095e, B:72:0x096b, B:73:0x09a6, B:90:0x127f, B:92:0x128c, B:93:0x12cd, B:103:0x1380, B:105:0x138d, B:106:0x13c9, B:108:0x13f5, B:110:0x1402, B:111:0x1444, B:113:0x144d, B:115:0x1465, B:116:0x14ab, B:134:0x16c3, B:136:0x16d0, B:137:0x1706, B:151:0x1847, B:153:0x1854, B:154:0x1882, B:156:0x195e, B:158:0x196b, B:159:0x199f, B:169:0x1ab7, B:171:0x1ac4, B:172:0x1b02, B:178:0x1c3d, B:180:0x1c4a, B:182:0x1c8d, B:194:0x1f3b, B:196:0x1f48, B:198:0x1f8c, B:291:0x2557, B:293:0x2564, B:294:0x25a0, B:306:0x2937, B:308:0x2944, B:309:0x298a, B:421:0x2d7a, B:423:0x2d80, B:424:0x2db9, B:430:0x2ea6, B:432:0x2eac, B:433:0x2ee5, B:439:0x2f84, B:441:0x2f8a, B:442:0x2fca, B:444:0x3074, B:446:0x307a, B:447:0x30b4, B:449:0x3181, B:451:0x3187, B:452:0x31c1, B:457:0x3298, B:459:0x32a5, B:460:0x32df, B:462:0x34f3, B:464:0x3506, B:466:0x353d, B:468:0x3613, B:470:0x3619, B:471:0x364c, B:473:0x3742, B:475:0x3767, B:476:0x37b1, B:493:0x395b, B:495:0x3968, B:496:0x39a1, B:504:0x3a72, B:506:0x3a78, B:507:0x3aad, B:510:0x3b75, B:512:0x3b7b, B:513:0x3bb0, B:515:0x3c5f, B:517:0x3c6c, B:518:0x3ca9, B:520:0x3d69, B:522:0x3d95, B:523:0x3ded, B:124:0x156e, B:126:0x1585, B:127:0x15c4, B:78:0x0aa7, B:80:0x0ab4, B:81:0x0aec, B:41:0x05d0, B:43:0x05e8, B:44:0x062a, B:52:0x06e2, B:54:0x06f9, B:55:0x0736, B:61:0x07e1, B:63:0x07f9, B:64:0x0836), top: B:576:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:528:0x3e75  */
    /* JADX WARN: Code duplicated, block: B:529:0x3e9e  */
    /* JADX WARN: Code duplicated, block: B:578:0x2d2a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x2ab3 A[EXC_TOP_SPLITTER, PHI: r2
  0x2ab3: PHI (r2v298 java.io.BufferedInputStream) = (r2v297 java.io.BufferedInputStream), (r2v667 java.io.BufferedInputStream) binds: [B:341:0x2ac5, B:319:0x2a87] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x25fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x2a38 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x2a38 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x2a2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x2a9b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[LOOP:5: B:600:0x2a82->B:617:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x2d15 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[LOOP:7: B:592:0x2cfc->B:621:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:350:0x2bc1
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(int r69, int r70, java.lang.Object r71, int r72, boolean r73, boolean r74) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 17951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.promo.model.response.ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(int, int, java.lang.Object, int, boolean, boolean):java.lang.Object[]");
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{60042, 60109, 60062, 60043, 60048, 60112, 60116, 60052, 60045, 60070, 60117, 60055, 60104, 60063, 60098, 60058, 60118, 60064, 60044, 60107, 60054, 60057, 60056, 60050, 60053, 60060, 60033, 60034, 60068, 60051, 60047, 60046, 60040, 60061, 60041, 60035};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 57191;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6377398940819159759L;
        b = -981105359;
        TuitionPaymentFragmentbindingInflater1 = (char) 28860;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 + 102
            byte[] r1 = com.bpjstku.data.promo.model.response.ProvinceItem.$$c
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r6
            r7 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L1f:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r4 = -r4
            int r8 = r8 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.promo.model.response.ProvinceItem.$$g(int, byte, byte):java.lang.String");
    }
}
