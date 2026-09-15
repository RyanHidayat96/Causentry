package com.bpjstku.data.asik.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/asik/model/request/OtpByEmailRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/request/OtpByEmailRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "deviceId", "getDeviceId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OtpByEmailRequest extends BaseRequest {
    public static final int $stable = 0;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static int g;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("email")
    private final String email;
    private static final byte[] $$c = {92, 126, -38, -95};
    private static final int $$f = 19;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {5, 11, -122, -94, 20, 6, -55, 69, 12, 14, 6, -3, 9, 10, 1, 25, 7, 8, -11, -43, 59, 26, 14, -3, -3, -45, 27, 58, 14, -3, -3, -8, 26, 21, 12, -9, 21, -70, 21, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -58};
    private static final int $$e = ModuleDescriptor.MODULE_VERSION;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 230;
    private static int d = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    private static void a(short s, byte b2, int i, Object[] objArr) {
        int i2 = s + 4;
        byte[] bArr = $$a;
        int i3 = (b2 * 14) + 84;
        byte[] bArr2 = new byte[53 - i];
        int i4 = 52 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i3)) - 10;
            i5 = -1;
        }
        while (true) {
            i2++;
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i2])) - 10;
                i5 = i6;
            }
        }
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
    private static void e(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.data.asik.model.request.OtpByEmailRequest.$$d
            int r5 = r5 * 15
            int r5 = r5 + 84
            int r7 = r7 * 17
            int r7 = 53 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r6]
        L29:
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.request.OtpByEmailRequest.e(int, short, short, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = d + 103;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 113;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDeviceId() {
        int i = 2 % 2;
        int i2 = d + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = this.deviceId;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return str;
    }

    public OtpByEmailRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.email = str;
        this.deviceId = str2;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 35;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 23;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char fadingEdgeLength = (char) (47773 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int deadChar = 468 - KeyEvent.getDeadChar(i5, i5);
                        int maximumDrawingCacheSize = 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, deadChar, maximumDrawingCacheSize, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 47772), 468 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "", 0, 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (Process.myTid() >> 22) + 2323, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, -1312321721, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x020e  */
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean, int] */
    public final boolean equals(Object p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRed = (char) (31533 - Color.red(0));
            int iAlpha = Color.alpha(0) + 921;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[37], bArr[7], (byte) 52, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, iAlpha, iResolveOpacity, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{45136, 17697, 47438, 26833, 427, 44217, 14682, 44460, 63514, 50156, 24840, 56400, 62799, 41086, 12120, 33376, 36577, 12884, 29069, 6611, 14888, 52629, 6621, 60334}, 22 - TextUtils.indexOf("", ""), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{11119, 59337, 56832, 5339, 59016, 53293, 36792, 20674, 36389, 65436, 39094, 58269, 16600, 25627, 53075, 34354, 27989, 1498}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) (31533 - (Process.myPid() >> 22));
            int iIndexOf = 921 - TextUtils.indexOf("", "");
            int iMyTid = 28 - (Process.myTid() >> 22);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[37];
            byte b3 = bArr2[80];
            Object[] objArr6 = new Object[1];
            a(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, iIndexOf, iMyTid, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
                int iIndexOf2 = 28 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                a((byte) 51, bArr3[80], (byte) (-bArr3[33]), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, i2, iIndexOf2, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ~iIdentityHashCode;
            int i4 = ~(815561113 | i3);
            int i5 = 480545443 + ((153191426 | i4) * (-712)) + (((~(iIdentityHashCode | 968752539)) | (~(i3 | (-153191427)))) * (-712)) + (((-958518531) | i4) * 712) + 380240940;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{17304, 61933, 51051, 25384, 34140, 7236, 43704, 41673, 19247, 7297, 28564, 40645, 37114, 62076, 2929, 30100, 37749, 56546, 4994, 36203, 62913, 27304, 64171, 8035, 17889, 1684, 12344, 34629}, 26 - ((Process.getThreadPriority(0) + 20) >> 6), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{19101, 45757, 14528, 50561, 13927, 21920, 13657, 19586, 21063, 50721, 18400, 18747, 61486, 59436, 41085, 20578, 43580, 40186, 53092, 58319}, 18 - ExpandableListView.getPackedPositionType(0L), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = asInterface + 43;
                    d = i8 % 128;
                    int i9 = i8 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            c(new char[]{42188, 1484, 60339, 35457, 27267, 47768, 58096, 64272, 55419, 18866, 47995, 19011, 33284, 63496, 20490, 8301, 49482, 9448}, 16 - TextUtils.getTrimmedLength(""), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{3759, 25807, 56981, 43987, 26390, 3204, 48750, 4384, 52192, 8934, 27001, 4439, 30073, 13206, 5999, 15483, 55960, 51619}, 16 - TextUtils.indexOf("", "", 0), objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 380240940};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[14];
                Object[] objArr14 = new Object[1];
                e(b4, bArr4[72], b4, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b5 = bArr4[49];
                Object[] objArr15 = new Object[1];
                e(b5, (byte) (-bArr4[78]), b5, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                    int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int trimmedLength = 28 - TextUtils.getTrimmedLength("");
                    byte[] bArr5 = $$a;
                    Object[] objArr17 = new Object[1];
                    a((byte) 51, bArr5[80], (byte) (-bArr5[33]), objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, maximumFlingVelocity, trimmedLength, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    c(new char[]{45136, 17697, 47438, 26833, 427, 44217, 14682, 44460, 63514, 50156, 24840, 56400, 62799, 41086, 12120, 33376, 36577, 12884, 29069, 6611, 14888, 52629, 6621, 60334}, 22 - KeyEvent.keyCodeFromString(""), objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    c(new char[]{11119, 59337, 56832, 5339, 59016, 53293, 36792, 20674, 36389, 65436, 39094, 58269, 16600, 25627, 53075, 34354, 27989, 1498}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf2 = (char) (31533 - TextUtils.indexOf("", "", 0, 0));
                        int absoluteGravity = 921 - Gravity.getAbsoluteGravity(0, 0);
                        int iIndexOf3 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr6 = $$a;
                        byte b6 = bArr6[37];
                        byte b7 = bArr6[80];
                        Object[] objArr20 = new Object[1];
                        a(b6, b7, b7, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, absoluteGravity, iIndexOf3, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int threadPriority = 28 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte[] bArr7 = $$a;
                        Object[] objArr21 = new Object[1];
                        a(bArr7[37], bArr7[7], (byte) 52, objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, scrollBarSize, threadPriority, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i13 = ~System.identityHashCode(this);
            int i14 = ~(632842868 | i13);
            int i15 = i12 + (-118343677) + ((i14 | 1141236775) * 764) + (((~(i13 | 1141236775)) | 565709392) * (-1528)) + ((1639812691 | i14) * 764);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr2[0])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i18 = 0;
                while (i18 < strArr.length) {
                    int i19 = asInterface + 45;
                    d = i19 % 128;
                    if (i19 % 2 != 0) {
                        arrayList.add(strArr[i18]);
                        i18 += 55;
                    } else {
                        arrayList.add(strArr[i18]);
                        i18++;
                    }
                }
            }
            int[] iArr = new int[i11];
            int i20 = i11 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i22 = i21 + ((~(startElapsedRealtime | 1139802240)) * TypedValues.CycleType.TYPE_EASING) + 8331839 + (((~((~startElapsedRealtime) | 1139802240)) | 29360128) * TypedValues.CycleType.TYPE_EASING);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[0])[0] = i24 ^ (i24 << 5);
        }
        if (this == p0) {
            int i25 = d + 103;
            asInterface = i25 % 128;
            int i26 = i25 % 2;
            return true;
        }
        if (!(p0 instanceof OtpByEmailRequest)) {
            int i27 = asInterface + 67;
            d = i27 % 128;
            int i28 = i27 % 2;
            return false;
        }
        OtpByEmailRequest otpByEmailRequest = (OtpByEmailRequest) p0;
        if (!Intrinsics.areEqual(this.email, otpByEmailRequest.email)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceId, otpByEmailRequest.deviceId)) {
            int i29 = d + 69;
            asInterface = i29 % 128;
            return i29 % 2 == 0;
        }
        int i30 = ((int[]) objArr2[0])[0];
        int i31 = ((((i30 * i30) - (~(-(643714750 * i30)))) - 1) - (~(-(i30 * (-1436443516))))) - (-153849664);
        int i32 = i31 >> 16;
        int i33 = ((((-131071) | i32) << 1) - (i32 ^ (-131071))) / 65536;
        int i34 = (i33 & 1) + (i33 | 1);
        int i35 = (i31 & i34) + (i34 | i31);
        int i36 = ((i31 >> 28) - 31) / 16;
        int i37 = (-(i35 ^ ((i36 ^ 1) + ((i36 & 1) << 1)))) + 8;
        int i38 = i37 >> 21;
        int i39 = ((i38 ^ (-4095)) + ((i38 & (-4095)) << 1)) / 2048;
        int i40 = ((i39 | 1) << 1) - (i39 ^ 1);
        return 2464 / ((i37 & (-(((i40 | 1) << 1) - (i40 ^ 1)))) * 308);
    }

    static {
        g = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentbindingInflater1 + 7;
        g = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ OtpByEmailRequest copy$default(OtpByEmailRequest otpByEmailRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 89;
        d = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = otpByEmailRequest.email;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 9;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                String str3 = otpByEmailRequest.deviceId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = otpByEmailRequest.deviceId;
        }
        return otpByEmailRequest.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.email;
        int i4 = i2 + 37;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.deviceId;
        }
        throw null;
    }

    public final OtpByEmailRequest copy(String p0, String p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        OtpByEmailRequest otpByEmailRequest = new OtpByEmailRequest(p0, p1);
        int i2 = asInterface + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
        return otpByEmailRequest;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = d + 99;
        asInterface = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.email.hashCode() >> 33) >> this.deviceId.hashCode() : (this.email.hashCode() * 31) + this.deviceId.hashCode();
        int i3 = asInterface + 113;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.deviceId;
        StringBuilder sb = new StringBuilder("OtpByEmailRequest(email=");
        sb.append(str);
        sb.append(", deviceId=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = d + 79;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 52008;
        b = (char) 42823;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 10906;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 40887;
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
    private static java.lang.String $$g(int r7, byte r8, short r9) {
        /*
            int r8 = r8 + 4
            int r9 = r9 * 4
            int r9 = r9 + 108
            byte[] r0 = com.bpjstku.data.asik.model.request.OtpByEmailRequest.$$c
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.request.OtpByEmailRequest.$$g(int, byte, short):java.lang.String");
    }
}
