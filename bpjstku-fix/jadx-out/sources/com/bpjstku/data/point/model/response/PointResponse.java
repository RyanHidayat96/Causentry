package com.bpjstku.data.point.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
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
import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/point/model/response/PointResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/point/model/response/PointResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "key", "Ljava/lang/String;", "getKey"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PointResponse extends BaseItem {
    public static final int $stable = 0;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;

    @SerializedName("key")
    private final String key;
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 135;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {31, -3, -46, 11, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -28, 13, -14, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$e = 31;
    private static final byte[] $$a = {94, -1, 37, -59, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 249;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f399a = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.data.point.model.response.PointResponse.$$a
            int r7 = r7 + 4
            int r5 = r5 * 14
            int r5 = r5 + 84
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.point.model.response.PointResponse.c(short, int, short, java.lang.Object[]):void");
    }

    private static void e(short s, byte b2, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i = (s * 15) + 84;
        int i2 = 53 - (s2 * 49);
        int i3 = b2 * 3;
        byte[] bArr2 = new byte[53 - i3];
        int i4 = 52 - i3;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i + i2;
            i2++;
            i = i6 + 3;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i = i + bArr[i2] + 3;
            i5 = i7;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PointResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = asInterface + 17;
            int i3 = i2 % 128;
            f399a = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 85;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = "";
        }
        this(str);
    }

    public final String getKey() {
        String str;
        int i = 2 % 2;
        int i2 = f399a;
        int i3 = i2 + 105;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.key;
            int i4 = 37 / 0;
        } else {
            str = this.key;
        }
        int i5 = i2 + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public PointResponse(String str) {
        this.key = str;
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i6 = $10 + 39;
            $11 = i6 % 128;
            int i7 = i6 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cAlpha = (char) (Color.alpha(i5) + 8328);
                    int iResolveSize = View.resolveSize(i5, i5) + 1235;
                    int threadPriority = 35 - ((Process.getThreadPriority(i5) + 20) >> 6);
                    byte b2 = (byte) i5;
                    byte b3 = (byte) (b2 - 1);
                    String str$$g = $$g(b2, b3, (byte) (b3 + 3));
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, iResolveSize, threadPriority, -653973969, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int deadChar = 2764 - KeyEvent.getDeadChar(i5, i5);
                    int iGreen = 14 - Color.green(i5);
                    byte b4 = (byte) i5;
                    byte b5 = (byte) (b4 - 1);
                    String str$$g2 = $$g(b4, b5, (byte) (b5 + 1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, deadChar, iGreen, 1504416861, false, str$$g2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                int i8 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i5] = sessionProcessor;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43326);
                    int maxKeyCode = 253 - (KeyEvent.getMaxKeyCode() >> 16);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i5] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, maxKeyCode, packedPositionType, -721491957, false, "j", clsArr3);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i9 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i5] = Integer.valueOf(i9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (65200 - (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)));
                    int iResolveSize2 = 2891 - View.resolveSize(i5, i5);
                    int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16;
                    byte b6 = (byte) i5;
                    byte b7 = (byte) (b6 - 1);
                    String str$$g3 = $$g(b6, b7, (byte) (-b7));
                    i2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i5] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iResolveSize2, i10, 2012627446, false, str$$g3, clsArr4);
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))) ^ (((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i11 = $10 + 103;
                $11 = i11 % 128;
                int i12 = i11 % 2;
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

    /* JADX WARN: Code duplicated, block: B:26:0x028a  */
    /* JADX WARN: Code duplicated, block: B:27:0x028c  */
    public final String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.key;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31533);
            int iArgb = 921 - Color.argb(0, 0, 0, 0);
            int iIndexOf = TextUtils.indexOf("", "") + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[37], bArr[80], bArr[1], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, iArgb, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{45635, 8430, 38739, 59596}, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), View.MeasureSpec.getSize(0), new char[]{29435, 25392, 58178, 32224, 62664, 1916, 42649, 17707, 36995, 11698, 44831, 62995, 33983, 19382, 14549, 17758, 21597, 6578, 48198, 19779, 27122, 54438}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{11659, 31662, 47320, 61083}, (char) (MotionEvent.axisFromString("") + 39865), (ViewConfiguration.getFadingEdgeLength() >> 16) - 662983123, new char[]{34363, 63996, 59420, 52575, 60232, 28162, 54655, 50812, 27313, 16344, 44025, 50243, 38516, 33590, 43931}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char gidForName = (char) (31532 - Process.getGidForName(""));
            int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 28;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            Object[] objArr5 = new Object[1];
            c(b2, (byte) (b2 | 52), bArr2[1], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, iLastIndexOf, iCombineMeasuredStates, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = asInterface + 85;
            f399a = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int i5 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr3[80], bArr3[2], (byte) 51, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i5, packedPositionGroup, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i6}, (String[]) objArr7[4]};
            int iNextInt = new Random().nextInt();
            int i7 = ((((-2083395592) + ((~((~iNextInt) | (-4198036))) * 433)) + (((~((-1740587013) | iNextInt)) | (-33492632)) * (-433))) + (((~(iNextInt | (-33492632))) | (-1744785048)) * 433)) - 2021932384;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{61287, 1638, 16043, 13039}, (char) (61246 - (Process.myTid() >> 22)), ViewConfiguration.getPressedStateDuration() >> 16, new char[]{7128, 43439, 5912, 57869, 1967, 46159, 19496, 63004, 7233, 53898, 2649, 19374, 10587, 57733, 53916, 37934, 37253, 12435, 52084, 20939, 2884, 27560, 62047, 7105, 55204, 26437}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{36582, 46461, 14857, 33378}, (char) (Process.getGidForName("") + 25147), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{18008, 56398, 51318, 1316, 5242, 33775, 20545, 64784, 3329, 36497, 23939, 43835, 59930, 5290, 32523, 9890, 64674, 11023}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = f399a + 75;
                    asInterface = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 90 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{54201, 14113, 58812, 36632}, (char) (6374 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{55447, 27542, 35962, 63869, 63864, 60793, 4792, 38481, 47953, 20441, 11671, 42059, 21993, 51840, 21483, 14888}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{11203, 50930, 40707, 24117}, (char) (13728 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{21546, 49665, 47842, 36254, 40313, 44960, 47333, 1602, 17867, 53669, 22449, 34124, 38203, 38449, 11309, 18960}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = f399a + 57;
            asInterface = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -2021932384};
                byte[] bArr4 = $$d;
                byte b3 = (byte) (-bArr4[35]);
                byte b4 = b3;
                Object[] objArr13 = new Object[1];
                e(b3, b4, b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = (byte) (bArr4[35] + 1);
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                e(b5, b6, b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int iMyPid = 921 - (Process.myPid() >> 22);
                    int iRgb = Color.rgb(0, 0, 0) + 16777244;
                    byte[] bArr5 = $$a;
                    Object[] objArr16 = new Object[1];
                    c(bArr5[80], bArr5[2], (byte) 51, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iMyPid, iRgb, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{45635, 8430, 38739, 59596}, (char) TextUtils.getOffsetAfter("", 0), Process.myTid() >> 22, new char[]{29435, 25392, 58178, 32224, 62664, 1916, 42649, 17707, 36995, 11698, 44831, 62995, 33983, 19382, 14549, 17758, 21597, 6578, 48198, 19779, 27122, 54438}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{11659, 31662, 47320, 61083}, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39864), (-662983123) - View.MeasureSpec.getSize(0), new char[]{34363, 63996, 59420, 52575, 60232, 28162, 54655, 50812, 27313, 16344, 44025, 50243, 38516, 33590, 43931}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (31533 - TextUtils.indexOf("", "", 0, 0));
                        int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iIndexOf2 = 28 - TextUtils.indexOf("", "", 0);
                        byte[] bArr6 = $$a;
                        byte b7 = bArr6[80];
                        Object[] objArr19 = new Object[1];
                        c(b7, (byte) (b7 | 52), bArr6[1], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, keyRepeatTimeout, iIndexOf2, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31533);
                        int mirror = 969 - AndroidCharacter.getMirror('0');
                        int iMyPid2 = 28 - (Process.myPid() >> 22);
                        byte[] bArr7 = $$a;
                        Object[] objArr20 = new Object[1];
                        c(bArr7[37], bArr7[80], bArr7[1], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, mirror, iMyPid2, -1048449946, false, (String) objArr20[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                arrayList.add(strArr[i2]);
                i2++;
                int i14 = asInterface + 87;
                f399a = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 2 / 2;
                }
            }
            throw null;
        }
        int i16 = f399a + 33;
        asInterface = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[3])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i19}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = (-403930261) + (((~((-285252598) | iIdentityHashCode)) | 268472996 | (~((-1488827047) | iIdentityHashCode))) * (-880));
        int i21 = (~((-285252598) | (~iIdentityHashCode))) | 1488827046;
        int i22 = ~(iIdentityHashCode | 285252597);
        int i23 = i18 + i20 + ((i21 | i22) * (-880)) + (i22 * 880);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        Object obj = objArr21[0];
        ((int[]) obj)[0] = i25 ^ (i25 << 5);
        int i26 = asInterface + 97;
        f399a = i26 % 128;
        int i27 = i26 % 2;
        int i28 = ((int[]) obj)[0];
        int i29 = ((i28 * i28) - (~(-(1951688894 * i28)))) - 1;
        int i30 = -(i28 * (-1146406462));
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        int i32 = (i31 ^ 143233024) + ((143233024 & i31) << 1);
        int i33 = i32 >> 20;
        int i34 = (((i33 | (-8191)) << 1) - (i33 ^ (-8191))) / 4096;
        int i35 = (i32 - (~((i34 & 1) + (i34 | 1)))) - 1;
        int i36 = i32 >> 16;
        int i37 = (((-131071) ^ i36) + ((i36 & (-131071)) << 1)) / 65536;
        int i38 = -(i35 ^ ((i37 ^ 1) + ((i37 & 1) << 1)));
        int i39 = ((i38 | 7) << 1) - (i38 ^ 7);
        int i40 = i39 >> 21;
        int i41 = (((i40 | (-4095)) << 1) - (i40 ^ (-4095))) / 2048;
        int i42 = ((i41 | 1) << 1) - (i41 ^ 1);
        StringBuilder sb = new StringBuilder("18,0,21,25,29,PointResponse(key=".substring(186494 / (((-(((i42 | 1) << 1) - (i42 ^ 1))) & i39) * 1903)));
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    static {
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        b = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PointResponse copy$default(PointResponse pointResponse, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = f399a;
        int i4 = i3 + 85;
        asInterface = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = pointResponse.key;
            int i5 = i3 + 97;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }
        return pointResponse.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        int i3 = i2 % 128;
        f399a = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 75;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final PointResponse copy(String p0) {
        int i = 2 % 2;
        PointResponse pointResponse = new PointResponse(p0);
        int i2 = f399a + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return pointResponse;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PointResponse)) {
            int i2 = f399a + 17;
            asInterface = i2 % 128;
            return i2 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.key, ((PointResponse) p0).key)) {
            return true;
        }
        int i3 = asInterface + 45;
        f399a = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f399a;
        int i3 = i2 + 17;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.key;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i2 + 47;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return 0;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -195170238;
        TuitionPaymentFragmentbindingInflater1 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r7 = r7 + 4
            int r8 = 104 - r8
            byte[] r0 = com.bpjstku.data.point.model.response.PointResponse.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2b
        L12:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.point.model.response.PointResponse.$$g(short, short, int):java.lang.String");
    }
}
