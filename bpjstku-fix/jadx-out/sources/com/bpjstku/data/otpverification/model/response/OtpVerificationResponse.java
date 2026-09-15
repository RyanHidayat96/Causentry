package com.bpjstku.data.otpverification.model.response;

import android.content.Context;
import android.content.ContextWrapper;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/otpverification/model/response/OtpVerificationResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/otpverification/model/response/OtpVerificationResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "signature", "Ljava/lang/String;", "getSignature", "checkSum", "getCheckSum"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OtpVerificationResponse extends BaseItem {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static int d;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("signature")
    private final String signature;
    private static final byte[] $$c = {59, -124, -78, 46};
    private static final int $$f = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Base64.padSymbol, -108, 49, -100, 14, -57, 76, -5, 4, 10, 25, -3, 21, -9, 27, -66, 67, 13, 14, -7, 21, 4, -5, 19, -54, 73, 9, -3, 21, -9, 27, 3, 11, 9, -61, 73, -5, 25, -6, 21, 12, -13, 9, 18, 1, -47, 41, 27, 25, -6, 21, 12, -13, 9, 18, 1, -6, 26, 13, -2, 19, 16, -45, 53, 14, 1, -2, 5, 25, 15, -77, 56, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
    private static final int $$e = 98;
    private static final byte[] $$a = {53, -70, 9, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 181;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f394a = 1;
    private static int g = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = r6 + 38
            byte[] r1 = com.bpjstku.data.otpverification.model.response.OtpVerificationResponse.$$a
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 84
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.otpverification.model.response.OtpVerificationResponse.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 105
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.data.otpverification.model.response.OtpVerificationResponse.$$d
            int r5 = r5 * 21
            int r5 = r5 + 84
            int r7 = r7 * 53
            int r1 = r7 + 53
            byte[] r1 = new byte[r1]
            int r7 = r7 + 52
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.otpverification.model.response.OtpVerificationResponse.f(short, int, short, java.lang.Object[]):void");
    }

    public final String getSignature() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        int i3 = i2 % 128;
        f394a = i3;
        int i4 = i2 % 2;
        String str = this.signature;
        int i5 = i3 + 125;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCheckSum() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 117;
        f394a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.checkSum;
        int i4 = i2 + 7;
        f394a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public OtpVerificationResponse(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.signature = str;
        this.checkSum = str2;
    }

    public final String component2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.checkSum;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 877;
            int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[28], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iLastIndexOf, touchSlop, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((-398551714) - TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 67, (short) (102 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (byte) (Process.myPid() >> 22), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1374725581, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(TextUtils.indexOf((CharSequence) "", '0') - 398551709, (-66) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) (TextUtils.getOffsetAfter("", 0) - 55), (byte) Color.blue(0), (-1374725559) - ImageFormat.getBitsPerPixel(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int mirror = 924 - AndroidCharacter.getMirror('0');
            int iRed = Color.red(0) + 10;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[5], (byte) ($$b & 110), bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, mirror, iRed, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = f394a + 57;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr3[5], (byte) 88, bArr3[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, packedPositionGroup, offsetBefore, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = 378912036 + ((6739400 | iIdentityHashCode) * 614);
            int i5 = ~iIdentityHashCode;
            int i6 = i4 + (((~((-16933319) | i5)) | 147904 | (~(23376910 | i5))) * (-1228)) + (((~(i5 | 23524814)) | (~((-16785415) | i5))) * 614) + 1709153487;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            int i9 = asInterface + 79;
            f394a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 / 2;
            }
        } else {
            Object[] objArr8 = new Object[1];
            e((-398551715) - TextUtils.lastIndexOf("", '0'), Color.red(0) - 67, (short) (57 - (ViewConfiguration.getEdgeSlop() >> 16)), (byte) View.MeasureSpec.getSize(0), (-1374725543) - TextUtils.getTrimmedLength(""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((ViewConfiguration.getDoubleTapTimeout() >> 16) - 398551712, (-67) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (ExpandableListView.getPackedPositionChild(0L) - 46), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1374725517, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e((-398551705) - TextUtils.getOffsetAfter("", 0), (-67) - Color.argb(0, 0, 0, 0), (short) (22 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (byte) View.combineMeasuredStates(0, 0), 23221 - AndroidCharacter.getMirror('0'), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e((ViewConfiguration.getTouchSlop() >> 8) - 398551706, TextUtils.lastIndexOf("", '0', 0) - 66, (short) (89 - View.resolveSize(0, 0)), (byte) KeyEvent.keyCodeFromString(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1374725483, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = asInterface + 1;
            f394a = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1709153487};
                byte[] bArr4 = $$d;
                byte b3 = bArr4[44];
                Object[] objArr13 = new Object[1];
                f(b3, bArr4[82], b3, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b4 = bArr4[82];
                Object[] objArr14 = new Object[1];
                f(b4, bArr4[44], b4, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int offsetBefore2 = 876 - TextUtils.getOffsetBefore("", 0);
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        c(bArr5[5], (byte) 88, bArr5[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, offsetBefore2, touchSlop2, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(ExpandableListView.getPackedPositionChild(0L) - 398551713, ImageFormat.getBitsPerPixel(0) - 66, (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 103), (byte) TextUtils.indexOf("", "", 0, 0), (-1374725580) - (ViewConfiguration.getEdgeSlop() >> 16), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e((ViewConfiguration.getEdgeSlop() >> 16) - 398551710, (-67) - Color.red(0), (short) ((-55) - TextUtils.indexOf("", "")), (byte) ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0) - 1374725557, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 877;
                            int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            byte[] bArr6 = $$a;
                            Object[] objArr18 = new Object[1];
                            c(bArr6[5], (byte) ($$b & 110), bArr6[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, iIndexOf, minimumFlingVelocity, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cBlue = (char) Color.blue(0);
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                            int i13 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                            byte[] bArr7 = $$a;
                            byte b5 = bArr7[7];
                            Object[] objArr19 = new Object[1];
                            c(b5, bArr7[28], b5, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, maximumFlingVelocity, i13, -1650998592, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 == i14) {
            int i16 = f394a + 83;
            asInterface = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i19 = i18 + 1829056144 + (((~((~startUptimeMillis) | (-37750035))) | (~((-94384685) | startUptimeMillis))) * (-302)) + ((~((-37750035) | startUptimeMillis)) * (-604)) + (((~(startUptimeMillis | (-132134719))) | (-266829632)) * 302);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr20[1])[0] = i21 ^ (i21 << 5);
            return str;
        }
        int[] iArr = new int[i15];
        int i22 = i15 - 1;
        iArr[i22] = 1;
        Toast.makeText((Context) null, iArr[((i15 * i22) % 2) - 1], 1).show();
        int i23 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i24 = 1153572500 + (((~((-772385147) | iIdentityHashCode2)) | 67709018 | (~(732074917 | iIdentityHashCode2))) * (-880));
        int i25 = (~((-772385147) | (~iIdentityHashCode2))) | (-732074918);
        int i26 = ~(iIdentityHashCode2 | 772385146);
        int i27 = i23 + i24 + ((i25 | i26) * (-880)) + (i26 * 880);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr21[1])[0] = i29 ^ (i29 << 5);
        return str;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 2267 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 97;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i8 = $10 + 123;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 3358;
                            int iMyPid = 18 - (Process.myPid() >> 22);
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, longPressTimeout, iMyPid, -1054011043, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), 2266 - TextUtils.indexOf((CharSequence) "", '0', 0), 33 - View.combineMeasuredStates(0, 0), 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    int i10 = $10 + 25;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16833120);
                    int i12 = 2856 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i13 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13;
                    byte b8 = (byte) ($$f & 1);
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, i12, i13, -1529949196, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i14 = 0; i14 < length3; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $10 + 75;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                int i17 = $10 + 89;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i19 = $10 + 7;
                    int i20 = i19 % 128;
                    $11 = i20;
                    int i21 = i19 % 2;
                    if (z) {
                        int i22 = i20 + 89;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i25 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i25]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        d = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = g + 63;
        d = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ OtpVerificationResponse copy$default(OtpVerificationResponse otpVerificationResponse, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface + 99;
        int i4 = i3 % 128;
        f394a = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 7;
            int i6 = i5 % 128;
            asInterface = i6;
            int i7 = i5 % 2;
            String str3 = otpVerificationResponse.signature;
            int i8 = i6 + 89;
            f394a = i8 % 128;
            int i9 = i8 % 2;
            str = str3;
        }
        if ((i & 2) != 0) {
            str2 = otpVerificationResponse.checkSum;
        }
        return otpVerificationResponse.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        int i3 = i2 % 128;
        f394a = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.signature;
        int i4 = i3 + 115;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return str;
    }

    public final OtpVerificationResponse copy(String p0, String p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        OtpVerificationResponse otpVerificationResponse = new OtpVerificationResponse(p0, p1);
        int i2 = f394a + 3;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return otpVerificationResponse;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = f394a + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof OtpVerificationResponse)) {
            return false;
        }
        OtpVerificationResponse otpVerificationResponse = (OtpVerificationResponse) p0;
        if (!Intrinsics.areEqual(this.signature, otpVerificationResponse.signature)) {
            int i4 = f394a + 101;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.checkSum, otpVerificationResponse.checkSum)) {
            return true;
        }
        int i6 = f394a + 107;
        int i7 = i6 % 128;
        asInterface = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 51;
        f394a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 1 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f394a + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.signature.hashCode() * 31) + this.checkSum.hashCode();
        int i4 = asInterface + 1;
        f394a = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.signature;
        String str2 = this.checkSum;
        StringBuilder sb = new StringBuilder("OtpVerificationResponse(signature=");
        sb.append(str);
        sb.append(", checkSum=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = f394a + 13;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentbindingInflater1 = -581043926;
        b = -1934795612;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1687406619;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new byte[]{50, 68, 104, 123, 37, -106, 68, 109, 125, 114, 38, 89, -77, 120, Base64.padSymbol, -126, 115, 114, 113, 78, 118, 65, 43, -55, -35, -54, -39, -92, -43, -84, -61, -48, -49, -36, -96, -54, -40, 62, 44, 37, 92, 55, Base64.padSymbol, 68, 42, 52, 92, 50, 90, 62, 15, 60, 99, 33, 48, 28, 119, 36, 39, 34, 51, 91, 50, 54, -56, -45, -62, -92, -53, -49, -54, -51, -55, -72, 26, -45, -34, -60, -55, -54, -89, 40, 20, Base64.padSymbol, 13, 2, -10, -23, 87, 5, 17, 57, -50, 81, 51, 25, 7, 40, 78, 122, 53, 100, 122, 95, 38, -112, 74, 84, 122, 75, 86, 78, 68};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r6 = r6 + 117
            byte[] r0 = com.bpjstku.data.otpverification.model.response.OtpVerificationResponse.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.otpverification.model.response.OtpVerificationResponse.$$g(int, byte, short):java.lang.String");
    }
}
