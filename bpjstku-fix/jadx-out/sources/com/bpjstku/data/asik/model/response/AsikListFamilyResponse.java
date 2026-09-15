package com.bpjstku.data.asik.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/asik/model/response/AsikListFamilyResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "Lcom/bpjstku/data/asik/model/response/AsikListFamilyItem;", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/bpjstku/data/asik/model/response/AsikListFamilyResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikListFamilyResponse extends BaseItem {
    public static final int $stable = 8;
    private static short[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f382a;
    private static byte[] b;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final List<AsikListFamilyItem> data;
    private static final byte[] $$c = {0, -94, -62, -97};
    private static final int $$f = 37;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {117, 57, 101, -72, 14, 0, -61, 56, -1, 21, -17, 5, 13, -6, -55, 53, 15, -8, 16, -1, -4, -3, -52, 70, 5, -6, -61, 65, 4, -9, 3, 9, -60, 32, 37, 1, -5, -17, 15, 20, -6, -36, 51, -15, 11, 8, -78, 77, 1, -24, 32, -15, 15, 7, -16, 4, 19, -78, 64, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 58, 5, 11, -11, -1, 1, 20, -12, -53, 55, 17, -15, 20, -9, 6, 15, -3, -9, -4, 18, -67, Base64.padSymbol, 7, 8, -13, 15, -2, -11, 13, -60, 66, -7, 17, 5, -6, 5, -5, -59, 28, 46, 2, -2, -39, 32, 17, -32, 21, 14, 6, -14, 16, 3};
    private static final int $$e = 75;
    private static final byte[] $$a = {84, 10, 24, -102, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 66;
    private static int asBinder = 0;
    private static int d = 1;
    private static int asInterface = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r6 = r6 + 1
            byte[] r0 = com.bpjstku.data.asik.model.response.AsikListFamilyResponse.$$a
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r6
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r8 = r8 + r3
            int r8 = r8 + (-10)
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.response.AsikListFamilyResponse.c(byte, short, byte, java.lang.Object[]):void");
    }

    private static void f(byte b2, int i, short s, Object[] objArr) {
        int i2 = 99 - i;
        byte[] bArr = $$d;
        int i3 = 58 - (s * 55);
        byte[] bArr2 = new byte[63 - b2];
        int i4 = 62 - b2;
        int i5 = -1;
        if (bArr == null) {
            int i6 = (i3 + i4) - 2;
            i3 = i3;
            i2 = i6;
        }
        while (true) {
            i5++;
            int i7 = i3 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i7;
            i2 = (i2 + bArr[i7]) - 2;
        }
    }

    public final List<AsikListFamilyItem> getData() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        List<AsikListFamilyItem> list = this.data;
        int i5 = i2 + 41;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return list;
    }

    public AsikListFamilyResponse(List<AsikListFamilyItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.data = list;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iGreen = Color.green(0) + 2267;
                int iMyPid = (Process.myPid() >> 22) + 33;
                byte[] bArr = $$c;
                byte b3 = bArr[0];
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iGreen, iMyPid, 1387473586, false, $$g(b3, (byte) (b3 - 1), (byte) bArr.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr2 = b;
                if (bArr2 != null) {
                    int length = bArr2.length;
                    byte[] bArr3 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int iAxisFromString = 3357 - MotionEvent.axisFromString("");
                            int threadPriority = 18 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte b4 = $$c[0];
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, iAxisFromString, threadPriority, -1054011043, false, $$g(b5, (byte) (b5 - 1), b4), new Class[]{Integer.TYPE});
                        }
                        bArr3[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = b;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 2267;
                        int offsetBefore = 33 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr5 = $$c;
                        byte b6 = bArr5[0];
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, trimmedLength, offsetBefore, 1387473586, false, $$g(b6, (byte) (b6 - 1), (byte) bArr5.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    int i8 = $10 + 83;
                    $11 = i8 % 128;
                    i4 = 2;
                    int i9 = i8 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                int i10 = ((i3 + iIntValue) - i4) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L));
                if (z) {
                    i5 = 1;
                } else {
                    int i11 = $10 + 17;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    i5 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i10 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (55904 - TextUtils.indexOf("", ""));
                    int i13 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2855;
                    int i14 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12;
                    byte b7 = $$c[0];
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i13, i14, -1529949196, false, $$g(b7, b8, (byte) (b8 + 4)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr6 = b;
                if (bArr6 != null) {
                    int i15 = $10 + 113;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    int length2 = bArr6.length;
                    byte[] bArr7 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr7[i17] = (byte) (((long) bArr6[i17]) ^ 3046761265686732006L);
                    }
                    bArr6 = bArr7;
                }
                boolean z2 = bArr6 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i18 = $10 + 99;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr8 = b;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentbindingInflater1;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    int i21 = $10 + 53;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
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

    public final List<AsikListFamilyItem> component1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 31533);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
            int gidForName = Process.getGidForName("") + 29;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[37], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, iLastIndexOf, gidForName, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 671287193, (-3) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) TextUtils.indexOf("", "", 0, 0), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), 68206660 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(TextUtils.getTrimmedLength("") - 671287188, (-10) - ImageFormat.getBitsPerPixel(0), (short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), 68206681 - (Process.myTid() >> 22), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
            byte b3 = $$a[37];
            Object[] objArr5 = new Object[1];
            c((byte) 52, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, maximumFlingVelocity, offsetBefore, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = asBinder + 107;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') + 31485);
                int i4 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i5 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[80];
                byte b5 = bArr2[37];
                Object[] objArr6 = new Object[1];
                c((byte) 37, b4, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, i4, i5, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMyUid = Process.myUid();
            int i6 = (-573572919) + (((~((-176300758) | iMyUid)) | 8519697 | (~(1597778886 | iMyUid))) * (-754));
            int i7 = ~((-8519698) | iMyUid);
            int i8 = ~iMyUid;
            int i9 = i6 + ((i7 | (~(1606298583 | i8))) * (-754)) + ((i8 | (-176300758)) * 754) + 1869919985;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(TextUtils.indexOf("", "", 0) - 671287192, TextUtils.getOffsetAfter("", 0) + 2, (short) TextUtils.indexOf("", "", 0, 0), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), 68206694 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((-671287190) - View.resolveSize(0, 0), (-6) - (KeyEvent.getMaxKeyCode() >> 16), (short) (AndroidCharacter.getMirror('0') - '0'), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), 68206720 - TextUtils.getTrimmedLength(""), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i12 = d + 19;
                asBinder = i12 % 128;
                if (i12 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i13 = asBinder + 3;
                    d = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            e((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 671287183, (-8) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 68206736 - ExpandableListView.getPackedPositionChild(0L), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e((-671287184) - (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) - 8, (short) KeyEvent.keyCodeFromString(""), (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 68206752, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1869919985};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                f(bArr3[53], bArr3[5], bArr3[35], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f((byte) (bArr3[90] + 1), bArr3[35], bArr3[5], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 921;
                    int iAxisFromString = MotionEvent.axisFromString("") + 29;
                    byte[] bArr4 = $$a;
                    byte b6 = bArr4[80];
                    byte b7 = bArr4[37];
                    Object[] objArr15 = new Object[1];
                    c((byte) 37, b6, b7, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, iResolveSizeAndState, iAxisFromString, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e((-671287193) - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0, 0) - 2, (short) Color.blue(0), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 68206660, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 671287189, (Process.myPid() >> 22) - 9, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ExpandableListView.getPackedPositionGroup(0L), Color.blue(0) + 68206681, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char trimmedLength = (char) (31533 - TextUtils.getTrimmedLength(""));
                        int gidForName2 = 920 - Process.getGidForName("");
                        int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 28;
                        byte b8 = $$a[37];
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, b8, b8, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, gidForName2, iResolveSizeAndState2, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (31533 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                        int i15 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b9, bArr5[37], b9, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, minimumFlingVelocity, i15, -1048449946, false, (String) objArr19[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 != i16) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i17));
        }
        int i18 = asBinder + 117;
        d = i18 % 128;
        int i19 = i18 % 2;
        int i20 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i21 = ~((-67272769) | iIdentityHashCode);
        int i22 = ~iIdentityHashCode;
        int i23 = i20 + (-400379920) + ((i21 | (~((-1621691908) | i22))) * 497) + (((~(iIdentityHashCode | (-1621691908))) | (~((-85114969) | i22)) | 17842200) * 497);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr20[0])[0] = i25 ^ (i25 << 5);
        return this.data;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x029f  */
    /* JADX WARN: Code duplicated, block: B:27:0x02a1  */
    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asBinder + 87;
        d = i2 % 128;
        int i3 = i2 % 2;
        List<AsikListFamilyItem> list = this.data;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) (31533 - KeyEvent.normalizeMetaState(0));
            int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
            int iAxisFromString = MotionEvent.axisFromString("") + 29;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[37], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, packedPositionGroup, iAxisFromString, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(Color.green(0) - 671287192, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 3, (short) View.getDefaultSize(0, 0), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 68206660, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((-671287188) - (ViewConfiguration.getEdgeSlop() >> 16), (-9) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) (KeyEvent.getMaxKeyCode() >> 16), ExpandableListView.getPackedPositionType(0L) + 68206681, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 31533);
            int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
            int i5 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte b3 = $$a[37];
            Object[] objArr5 = new Object[1];
            c((byte) 52, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i4, i5, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = d + 101;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cBlue = (char) (Color.blue(0) + 31533);
                int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                int trimmedLength = TextUtils.getTrimmedLength("") + 28;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[80];
                byte b5 = bArr2[37];
                Object[] objArr6 = new Object[1];
                c((byte) 37, b4, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, iKeyCodeFromString, trimmedLength, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = 81443043 + (((~((-1389888732) | iIdentityHashCode)) | 314572992) * 336) + (((~(iIdentityHashCode | 384190912)) | (-1459506652)) * (-168)) + (((~((~iIdentityHashCode) | 384190912)) | (-1389888732)) * 168) + 356835260;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e((-671287192) - TextUtils.getOffsetAfter("", 0), View.MeasureSpec.getMode(0) + 2, (short) TextUtils.indexOf("", "", 0, 0), (byte) Color.blue(0), 68206695 - (ViewConfiguration.getEdgeSlop() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(63642 - AndroidCharacter.getMirror('0'), (-6) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.green(0) + 68206720, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = d + 91;
                    asBinder = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 88 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                            int i13 = d + 31;
                            asBinder = i13 % 128;
                            int i14 = i13 % 2;
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                        int i15 = d + 31;
                        asBinder = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i17 = d + 31;
                    asBinder = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            e((-671287183) - Color.alpha(0), (-9) - Process.getGidForName(""), (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 68206738, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e((ViewConfiguration.getKeyRepeatDelay() >> 16) - 671287184, Color.rgb(0, 0, 0) + 16777208, (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 68206751, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i19 = d + 91;
            asBinder = i19 % 128;
            int i20 = i19 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 356835260};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[5];
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                f(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f((byte) (bArr3[90] + 1), bArr3[35], bArr3[5], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (31534 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 922;
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[80];
                    byte b9 = bArr4[37];
                    Object[] objArr15 = new Object[1];
                    c((byte) 37, b8, b9, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iLastIndexOf, edgeSlop, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e((-671287192) - Gravity.getAbsoluteGravity(0, 0), (-2) - Color.alpha(0), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) Color.red(0), 68206660 - ((Process.getThreadPriority(0) + 20) >> 6), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e((-671287188) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-9) - (ViewConfiguration.getTouchSlop() >> 8), (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (Process.getGidForName("") + 1), 68206680 - TextUtils.lastIndexOf("", '0', 0, 0), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf2 = (char) (31533 - TextUtils.indexOf("", "", 0));
                        int iAlpha = Color.alpha(0) + 921;
                        int i21 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b10 = $$a[37];
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, b10, b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, iAlpha, i21, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 31533);
                        int i22 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iArgb = Color.argb(0, 0, 0, 0) + 28;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b11, bArr5[37], b11, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength2, i22, iArgb, -1048449946, false, (String) objArr19[0], null);
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
        int i23 = ((int[]) objArr[1])[0];
        int i24 = ((int[]) objArr[3])[0];
        if (i24 != i23) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i24));
        }
        int i25 = d + 109;
        asBinder = i25 % 128;
        int i26 = i25 % 2;
        int i27 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i28 = (int) Runtime.getRuntime().totalMemory();
        int i29 = ~i28;
        int i30 = i27 + 845523475 + ((i28 | 1432111963) * 140) + (((~(1432111963 | i29)) | 2228224) * (-280)) + (((~(i28 | (-2228225))) | (~(341967680 | i29)) | 1092372507) * 140);
        int i31 = (i30 << 13) ^ i30;
        int i32 = i31 ^ (i31 >>> 17);
        ((int[]) objArr20[0])[0] = i32 ^ (i32 << 5);
        int i33 = d + 23;
        asBinder = i33 % 128;
        if (i33 % 2 == 0) {
            return list.hashCode();
        }
        list.hashCode();
        obj.hashCode();
        throw null;
    }

    static {
        f382a = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = asInterface + 57;
        f382a = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AsikListFamilyResponse copy$default(AsikListFamilyResponse asikListFamilyResponse, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asBinder + 7;
        d = i3 % 128;
        int i4 = i & 1;
        if (i3 % 2 != 0 ? i4 != 0 : i4 != 0) {
            list = asikListFamilyResponse.data;
        }
        AsikListFamilyResponse asikListFamilyResponseCopy = asikListFamilyResponse.copy(list);
        int i5 = d + 71;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return asikListFamilyResponseCopy;
    }

    public final AsikListFamilyResponse copy(List<AsikListFamilyItem> p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        AsikListFamilyResponse asikListFamilyResponse = new AsikListFamilyResponse(p0);
        int i2 = d + 63;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return asikListFamilyResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = d + 7;
            asBinder = i2 % 128;
            return i2 % 2 == 0;
        }
        if (p0 instanceof AsikListFamilyResponse) {
            return !(Intrinsics.areEqual(this.data, ((AsikListFamilyResponse) p0).data) ^ true);
        }
        int i3 = asBinder + 7;
        d = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        List<AsikListFamilyItem> list = this.data;
        StringBuilder sb = new StringBuilder("AsikListFamilyResponse(data=");
        sb.append(list);
        sb.append(")");
        String string = sb.toString();
        int i2 = d + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2000839514;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795522;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1532077281;
        b = new byte[]{-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -26, -26, -26, -26, -26, -26};
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
    private static java.lang.String $$g(int r5, int r6, short r7) {
        /*
            int r5 = r5 * 4
            int r0 = 1 - r5
            int r7 = 121 - r7
            byte[] r1 = com.bpjstku.data.asik.model.response.AsikListFamilyResponse.$$c
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r6]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.response.AsikListFamilyResponse.$$g(int, int, short):java.lang.String");
    }
}
