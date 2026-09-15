package com.bpjstku.data.user.model.request;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/user/model/request/UpdateDeviceToken;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/user/model/request/UpdateDeviceToken;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "registerId", RemoteConfigConstants.RequestFieldKey.APP_ID}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateDeviceToken extends BaseRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static short[] asInterface;
    private static byte[] b;
    private static int d;

    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_ID)
    private final String appId;

    @SerializedName("email")
    private final String email;

    @SerializedName("deviceToken")
    private final String registerId;
    private static final byte[] $$c = {43, 23, 22, -14};
    private static final int $$f = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, -102, -70, -91, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 4;
    private static final byte[] $$a = {94, 6, -99, -107, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, 54, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
    private static final int $$b = 115;
    private static int asBinder = 0;
    private static int g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f414a = 0;

    private static void f(byte b2, byte b3, int i, Object[] objArr) {
        int i2 = b2 + 4;
        int i3 = 103 - i;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[b3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i2 + (-b3)) - 11;
        }
        while (true) {
            int i5 = i3;
            int i6 = i2;
            i4++;
            bArr2[i4] = (byte) i5;
            if (i4 == b3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i6 + 1;
                i3 = (i5 + (-bArr[i6])) - 11;
            }
        }
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
    private static void h(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 33
            int r6 = 36 - r6
            int r8 = r8 * 3
            int r8 = r8 + 103
            byte[] r0 = com.bpjstku.data.user.model.request.UpdateDeviceToken.$$a
            int r7 = r7 * 17
            int r1 = r7 + 17
            byte[] r1 = new byte[r1]
            int r7 = r7 + 16
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L31:
            int r3 = r3 + r6
            int r6 = r3 + (-3)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.request.UpdateDeviceToken.h(byte, byte, short, java.lang.Object[]):void");
    }

    public UpdateDeviceToken(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.email = str;
        this.registerId = str2;
        this.appId = str3;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 5;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getTouchSlop() >> 8)), 2624 - ExpandableListView.getPackedPositionGroup(0L), 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39421), TextUtils.getCapsMode("", 0, 0) + 481, KeyEvent.getDeadChar(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 15;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - Color.alpha(0)), 482 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i8 = $11 + 71;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static void e(int i, int i2, short s, int i3, byte b2, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            float f = 0.0f;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2267;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 33;
                byte length = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, i6, edgeSlop, 1387473586, false, $$g((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                byte[] bArr = b;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 3358 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, -1054011043, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i8++;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = b;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2268;
                        int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 33;
                        byte length3 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, iLastIndexOf, packedPositionType2, 1387473586, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) asInterface[i + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                    int i9 = $11 + 25;
                    $10 = i9 % 128;
                    i4 = 2;
                    int i10 = i9 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i + iIntValue) - i4) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)) + i7;
                try {
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 55904), ExpandableListView.getPackedPositionGroup(0L) + 2855, TextUtils.indexOf("", "", 0) + 13, -1529949196, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = b;
                    if (bArr4 != null) {
                        int i11 = $10 + 33;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        for (int i13 = 0; i13 < length4; i13++) {
                            bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i14 = $10 + 101;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        if (z) {
                            byte[] bArr6 = b;
                            int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = asInterface;
                            int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        d = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = f414a + 61;
        d = i % 128;
        int i2 = i % 2;
    }

    private final String component1() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 43;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private final String component2() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 65;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.registerId;
        int i5 = i2 + 123;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private final String component3() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 75;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appId;
        int i5 = i2 + 79;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ UpdateDeviceToken copy$default(UpdateDeviceToken updateDeviceToken, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asBinder + 111;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = updateDeviceToken.email;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i6 = i4 + 13;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                String str4 = updateDeviceToken.registerId;
                throw null;
            }
            str2 = updateDeviceToken.registerId;
        }
        if ((i & 4) != 0) {
            int i7 = i4 + 53;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                String str5 = updateDeviceToken.appId;
                obj2.hashCode();
                throw null;
            }
            str3 = updateDeviceToken.appId;
        }
        UpdateDeviceToken updateDeviceTokenCopy = updateDeviceToken.copy(str, str2, str3);
        int i8 = g + 19;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return updateDeviceTokenCopy;
    }

    public final UpdateDeviceToken copy(String p0, String p1, String p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        UpdateDeviceToken updateDeviceToken = new UpdateDeviceToken(p0, p1, p2);
        int i2 = asBinder + 3;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return updateDeviceToken;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = asBinder + 95;
            g = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof UpdateDeviceToken)) {
            int i4 = asBinder + 33;
            g = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        UpdateDeviceToken updateDeviceToken = (UpdateDeviceToken) p0;
        if (!Intrinsics.areEqual(this.email, updateDeviceToken.email)) {
            int i6 = asBinder + 97;
            g = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.registerId, updateDeviceToken.registerId)) {
            int i8 = asBinder + 121;
            g = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.appId, updateDeviceToken.appId)) {
            int i9 = g + 119;
            asBinder = i9 % 128;
            return i9 % 2 != 0;
        }
        int i10 = asBinder + 27;
        g = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        g = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.email.hashCode() / 32) << this.registerId.hashCode()) << 121) >>> this.appId.hashCode() : (((this.email.hashCode() * 31) + this.registerId.hashCode()) * 31) + this.appId.hashCode();
        int i3 = asBinder + 91;
        g = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.registerId;
        String str3 = this.appId;
        StringBuilder sb = new StringBuilder("UpdateDeviceToken(email=");
        sb.append(str);
        sb.append(", registerId=");
        sb.append(str2);
        sb.append(", appId=");
        sb.append(str3);
        sb.append(")");
        String string = sb.toString();
        int i2 = g + 5;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 284171. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object[] b(android.content.Context r61, java.lang.String[] r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instruction units count: 28417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.request.UpdateDeviceToken.b(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2681455111089585693L;
        TuitionPaymentFragmentbindingInflater1 = -1253224909;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795599;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1955580351;
        b = new byte[]{10, 5, -15, -42, 51, -14, 4, 14, -74, 60, 26, -28, 6, 53, 58, -50, 38, 48, -59, 56, -61, 33, 111, -125, -120, 119, -121, 117, 96, 107, -68, 125, -117, -127, 57, -77, -107, 107, -119, -126, 126, 111, -102, 117, -120, -114, -115, 29, 110, -106, 126, -126, 96, -102, 100, 115, -72, 100, 101, 124, -70, 121, 119, 112, -40, 104, 102, -102, -112, ByteCompanionObject.MAX_VALUE, -109, -97, 40, -96, -122, 120, -102, 101, -105, 107, -70, 10, -24, 5, 1, -8, 6, 14, -7, -10, -39, -18, 65, -7, -10, -7, -50, 78, -2, -16, 12, 6, -23, 5, 9, -66, 54, 16, -18, 12, 15, -15, 5, -4, 5, -39, 33, -1, 14, 104, -118, 103, 99, -102, 100, 108, -101, -108, -69, 71, 104, -118, 118, -108, 110, -112, 103, 111, -113, -101, -112, 98, -99, 108, -82, 70, 100, 98, -66, 68, -113, -111, 102, -98, 103, 84, -91, -70, 70, -76, -67, 98, -104, 80, 94, -102, -72, -40, -42, -37, -33, 44, -46, 35, -63, -49, 51, 33, -63, 53, -52, 36, 23, -13, -49, 112, -120, 52, 59, -61, 52, -51, 62, 7, -8, -55, -56, -49, 60, -60, 63, -73, 70, -101, 90, 64, -72, 72, -74, -68, -81, 98, -79, 64, 57, -51, -46, 40, 63, -57, 55, -55, -61, -48, 29, -50, 63, -91, 86, -82, 91, -91, -68, 64, 86, -82, 94, -96, -86, -71, 116, -89, 86, -45, 33, -46, 41, 62, 57, -100, 55, -40, -33, 32, 39, -43, 98, -31, -33, 43, -45, 24, -21, -51, 51, -47, -69, -73, 70, -71, 71, -65, 79, -104, 99, -75, 68, 77, -75, 93, -78, -67, 65, -64, -96, 81, -82, 80, -88, 88, -113, -78, 23, -68, 83, 84, -85, -84, 94, -23, 106, 84, -96, 88, -109, 96, 70, -72, 90, 89, -69, 67, -91, -91, 109, -68, 37, -34, -36, 14, -55, 38, -38, 36, -45, 39, -60, 58, 58, -9, 36, -43, 24, -21, 19, -26, 24, 1, -3, -21, 19, -29, 29, 23, 4, 55, -44, -24, 87, -81, 19, 28, -28, 19, -22, 25, 32, -33, -18, -17, -24, 27, -29, 24, -94, -92, 46, 33, -47, -47, 10, -16, -47, 41, -63, 47, 33, 55, 48, -102, 42, 36, -40, -46, Base64.padSymbol, -47, -35, 106, -30, -60, 58, -40, 31, 16, -32, -32, 27, 15, -15, -13, -124, 119, 124, -105, 117, ByteCompanionObject.MIN_VALUE, 119, 105, 91, -70, -124, 112, -120, 67, -80, -106, 104, -118, -104, 96, -120, 102, 104, 126, -65, 105, -104, 122, 118, -100, -106, 71, -121, 118, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = com.bpjstku.data.user.model.request.UpdateDeviceToken.$$c
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = 121 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.request.UpdateDeviceToken.$$g(byte, int, int):java.lang.String");
    }
}
