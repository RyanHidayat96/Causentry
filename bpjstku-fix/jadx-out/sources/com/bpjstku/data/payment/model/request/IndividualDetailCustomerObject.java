package com.bpjstku.data.payment.model.request;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.InputDeviceCompat;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/payment/model/request/IndividualDetailCustomerObject;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/IndividualDetailCustomerObject;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "givenNames", "Ljava/lang/String;", "getGivenNames", "surname", "getSurname"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IndividualDetailCustomerObject {
    public static final int $stable = 0;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;

    @SerializedName("given_names")
    private final String givenNames;

    @SerializedName("surname")
    private final String surname;
    private static final byte[] $$c = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
    private static final int $$f = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {67, -127, -109, 9, -15, -1, 60, -55, -17, 3, -12, -4, 6, -13, 68, -69, -5, 10, -17, 11, -12, -9, 16, -22, 8, -9, -2, Base64.padSymbol, -69, -5, 0, -1, -5, 62, -25, -36, -18, 16, -11, -6, 25, -37, 0, -1, -5, 43, -37, -20, 8, -16, 10, -14, -8, 82, -82, 0, 8, -1, -9, 5, -14, 69, -3, -72, -8, -1, 0, -8, 6, -2, Base64.padSymbol, -72, -8, 1, 2, -1, -20, 77, -67, -4, -4, 2, -23, 6, -11, 77, -16, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, 15, -10, -8, 7, -8, -8, 4, 27, -40, 5, -9, 8, -22, 12, -16, 62};
    private static final int $$e = 31;
    private static final byte[] $$a = {51, -5, 77, 89, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 45;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.data.payment.model.request.IndividualDetailCustomerObject.$$a
            int r6 = r6 + 84
            int r1 = r5 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r5
            r4 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            r3 = r0[r7]
        L22:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r7 = r7 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.IndividualDetailCustomerObject.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 46
            int r0 = r8 + 38
            byte[] r1 = com.bpjstku.data.payment.model.request.IndividualDetailCustomerObject.$$d
            int r6 = r6 * 83
            int r6 = r6 + 4
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r0 = new byte[r0]
            int r8 = r8 + 37
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-3)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.IndividualDetailCustomerObject.e(int, int, short, java.lang.Object[]):void");
    }

    public IndividualDetailCustomerObject(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.givenNames = str;
        this.surname = str2;
    }

    public final String getGivenNames() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.givenNames;
        }
        throw null;
    }

    public final String getSurname() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.surname;
        }
        throw null;
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = d + 73;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.givenNames.hashCode() * 31;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (43042 - (ViewConfiguration.getLongPressTimeout() >> 16));
            int iIndexOf = 3111 - TextUtils.indexOf("", "", 0, 0);
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21;
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[0] + 1);
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iIndexOf, i4, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(ImageFormat.getBitsPerPixel(0) + 1, (KeyEvent.getMaxKeyCode() >> 16) + 22, (char) (Color.red(0) + 39943), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(Color.blue(0) + 22, 15 - (Process.myPid() >> 22), (char) (Color.alpha(0) + 62001), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout2 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43042);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 3111;
            int touchSlop = 22 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr2 = $$a;
            byte b4 = (byte) (bArr2[0] + 1);
            byte b5 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, (short) (b5 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout2, packedPositionType, touchSlop, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = d + 23;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) (43042 - ((Process.getThreadPriority(0) + 20) >> 6));
                int i7 = 3111 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 22;
                byte b6 = (byte) ($$b & 247);
                byte b7 = $$a[7];
                Object[] objArr6 = new Object[1];
                a(b6, b7, (short) (b7 | 104), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, i7, packedPositionGroup, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i8};
            int iNextInt = new Random().nextInt(101934803);
            int i10 = ~((-379526621) | (~iNextInt));
            int i11 = ((((1224769538 | i10) | (~(379526620 | iNextInt))) * (-338)) - 934692410) + (((~(iNextInt | 1604296158)) | i10) * 338) + 1966429405;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[1], new int[]{i9}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(37 - TextUtils.getTrimmedLength(""), Color.rgb(0, 0, 0) + InputDeviceCompat.SOURCE_JOYSTICK, (char) (38707 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 52, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1966429405};
                byte[] bArr3 = $$d;
                byte b8 = bArr3[30];
                Object[] objArr11 = new Object[1];
                e(b8, b8, bArr3[73], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b9 = bArr3[73];
                Object[] objArr12 = new Object[1];
                e(b9, b9, bArr3[30], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43042);
                    int doubleTapTimeout = 3111 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i14 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                    byte b10 = (byte) ($$b & 247);
                    byte b11 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    a(b10, b11, (short) (b11 | 104), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, doubleTapTimeout, i14, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(Process.myTid() >> 22, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22, (char) (39943 - View.MeasureSpec.getMode(0)), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (62001 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cArgb = (char) (43042 - Color.argb(0, 0, 0, 0));
                        int i15 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3112;
                        int tapTimeout = 22 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr4 = $$a;
                        byte b12 = (byte) (bArr4[0] + 1);
                        byte b13 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        a(b12, b13, (short) (b13 | 52), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, i15, tapTimeout, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRed = (char) (43042 - Color.red(0));
                        int iAlpha = Color.alpha(0) + 3111;
                        int packedPositionChild = 21 - ExpandableListView.getPackedPositionChild(0L);
                        byte[] bArr5 = $$a;
                        byte b14 = (byte) (bArr5[0] + 1);
                        byte b15 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        a(b14, b15, b15, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iAlpha, packedPositionChild, -1272852037, false, (String) objArr17[0], null);
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
        int i17 = ((int[]) objArr[2])[0];
        if (i17 == i16) {
            int i18 = d + 5;
            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = ~iIdentityHashCode;
            int i24 = i20 + (-1524992103) + (((~((-309209129) | i23)) | (~(iIdentityHashCode | 1395822330))) * 333) + (((~(iIdentityHashCode | (-309209129))) | (~(i23 | 1395822330))) * 333);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[0])[0] = i26 ^ (i26 << 5);
            Object[] objArr18 = {new int[1], new int[]{i22}, new int[]{i21}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr2 = new int[i17];
            int i27 = i17 - 1;
            iArr2[i27] = 1;
            Toast.makeText((Context) null, iArr2[((i17 * i27) % 2) - 1], 1).show();
            int i28 = ((int[]) objArr[0])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i31 = i28 + 176979026 + (((~(766946570 | iIdentityHashCode2)) | (-1073655579) | (~(938084888 | iIdentityHashCode2))) * (-744)) + (((~iIdentityHashCode2) | 631375880) * 744) + ((iIdentityHashCode2 | 1073655578) * 744);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[0])[0] = i33 ^ (i33 << 5);
            Object[] objArr19 = {new int[1], new int[]{i30}, new int[]{i29}, strArr4};
        }
        return iHashCode + this.surname.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x01ca  */
    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.blue(0), 2186 - ExpandableListView.getPackedPositionChild(0L), Process.getGidForName("") + 41, 841711447, false, $$g(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33017), 3012 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 26 - (ViewConfiguration.getWindowTouchSlop() >> 8), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 3376 - Drawable.resolveOpacity(0, 0), Color.blue(0) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i5 = $11 + 17;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 23;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - TextUtils.indexOf("", "", 0)), 3377 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), 16 - TextUtils.lastIndexOf("", '0', 0, 0), -968507904, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    static {
        b = 0;
        b();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        b = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ IndividualDetailCustomerObject copy$default(IndividualDetailCustomerObject individualDetailCustomerObject, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = d + 125;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                str = individualDetailCustomerObject.givenNames;
                int i4 = 73 / 0;
            } else {
                str = individualDetailCustomerObject.givenNames;
            }
        }
        if ((i & 2) != 0) {
            str2 = individualDetailCustomerObject.surname;
        }
        IndividualDetailCustomerObject individualDetailCustomerObjectCopy = individualDetailCustomerObject.copy(str, str2);
        int i5 = d + 83;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return individualDetailCustomerObjectCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = d + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.givenNames;
        int i4 = i3 + 37;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.surname;
        int i5 = i3 + 19;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final IndividualDetailCustomerObject copy(String p0, String p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        IndividualDetailCustomerObject individualDetailCustomerObject = new IndividualDetailCustomerObject(p0, p1);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        return individualDetailCustomerObject;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof IndividualDetailCustomerObject)) {
            return false;
        }
        IndividualDetailCustomerObject individualDetailCustomerObject = (IndividualDetailCustomerObject) p0;
        if (!Intrinsics.areEqual(this.givenNames, individualDetailCustomerObject.givenNames)) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 55;
            d = i3 % 128;
            return i3 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.surname, individualDetailCustomerObject.surname)) {
            return true;
        }
        int i4 = d + 5;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.givenNames;
        String str2 = this.surname;
        StringBuilder sb = new StringBuilder("IndividualDetailCustomerObject(givenNames=");
        sb.append(str);
        sb.append(", surname=");
        sb.append(str2);
        Object[] objArr = new Object[1];
        c((ViewConfiguration.getScrollDefaultDelay() >> 16) + 69, View.getDefaultSize(0, 0) + 1, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        sb.append((String) objArr[0]);
        String string = sb.toString();
        int i2 = d + 75;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r72, int r73, int r74, int r75) {
        /*
            Method dump skipped, instruction units count: 15008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.IndividualDetailCustomerObject.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void b() {
        char[] cArr = new char[2223];
        ByteBuffer.wrap("-ú%X<¥7î\u000f@\u0006\u0093\u0019ñ\u0011\u000eh\u009ccý{wr§Eþ]!T\u0099¯Ý§&¾¥±Ý\u0089#\u0080|\u009bÁCÈKlR\u0096YÚajh©wÇ\u007fD\u0006 \rÙ\u0015\u0003\u001c¶+Ø3\t:¾&Å.c7\u0083<É\u00045\r¢\u0012À\u001azc h\u0094p>y¹NÀV\u0012_¼¤á±õ¹U £«õ\u0093\\\u009a\u0094\u0085æ\u008d^ô¼ÿèç-î\u009bÙÃÁ:È\u008e3Ú±µ±³¹U £«í\u0093\u0007\u009a\u009a\u0085ý\u008dKô\u0090ÿïç7î\u0080ÙèÁ\nÈ\u008b3Û;(\"\u0093-Ó\u00158\u001ck\u0007ò\u000f1vgaÅi\u001aPk\u0012\r\u001aë\u0003\u001d\bS0¹9$&C.õW.\\QD\u0089M>zVb´k$\u0090h\u0098\u0082\u0081:\u008eW¶\u0091¿Ö¤a¬\u009fÕÝÂ~±³¹U £«í\u0093\u0007\u009a\u009a\u0085ý\u008dKô\u0090ÿïç7î\u0080ÙèÁ\nÈ\u00993Æ;\"\"\u0082±³¹B ¿«è\u0093\u0007\u009a\u0090\u0085ý\u008dCô\u0081ÿåç;îÜÙçÁ:È\u00863Û;*\"\u0088-Å\u0015#\u001cG\u0007Ï\u000f#vcaÐi\u001cP|[Ú±³¹T ²«ø\u0093\u0007\u009a\u0099\u0085õ\u008d\tô\u0084ÿûç1î\u0083±³¹T ²«ø\u0093\u0007\u009a\u008e\u0085û\u008dJôÚÿùç,î\u009cÙð±³¹B ¢«ø\u0093I\u009a\u008f\u0085ö\u008d\bô¦ÿÏç\u0013î\u009cÙöÁ0È®3Þ;8\"\u0080±³¹U §«ï\u0093I\u009aÒ\u0085¼\u008dDô\u0084ÿüç7î\u009dÙæÁ:±î¹^ è«ù\u0093G\u009a\u0092\u0085æ\u008d\tô\u0086ÿìç:î\u0081ÙïÁ<È\u008e3à;\"\"\u0084-Â\u0015\u0014\u001c|\u0007Ã\u000f1v&±î¹^ è«ù\u0093G\u009a\u0092\u0085æ\u008d\tô\u0086ÿìç:î\u0081ÙïÁ<È\u008e3à;\"\"\u0084-Â\u0015\u0014\u001c|\u0007Ã\u000f1v%±³¹B ¿«è\u0093\\\u009a\u0098\u0085ÿ\u008d\bô\u0098ÿàç<îÜÙìÁ<È\u00883Ñ;.\"Ï-Å\u0015$³\u000e»¨¢Q©\u0005\u0091·\u0098u\u0089N\u0081¿\u0098B\u0093\u0015«¡¢e½\u0002µõÌkÇ\u001dßÍÖ!á\u0013ùÍðz\u000b7\u0003ç\u001aQ\u0015f-Ø$\u0080?=7ÊNÇY:Qëh\u009dc*{ÿr\u0097\u008dK±³¹B ¿«è\u0093\\\u009a\u0098\u0085ÿ\u008d\bô\u0096ÿàç0îÜÙîÁ0È\u00873Ê;\u001a\"¬-\u009b\u0015;\u001cj\u0007Â\u000f2Ä\u0094ÌeÕ\u0098ÞÏæ{ï¿ðØø/\u0081¿\u008aÇ\u0092\u001b\u009bû¬Ë´\u001b½¯FöN\u000eW«Xä`:irrúz\u0017\u0003_\u0014ó\u001cp%Z.ë\u0001Ò\t4\u0010Â\u001b\u008c#f*ò5\u0096=+DàO\u008fWJ^÷i\u0092q@±î¹^ è«ù\u0093]\u009a\u0094\u0085þ\u008dCôÚÿáç1î\u0080Ùô±ò¹T §«è\u0093M\u009aÓ\u0085ü\u008dBô\u0080±³¹A ´«ô\u0093K\u009aÒ\u0085ô\u008dNô\u0098ÿìç-î\u008aÙóÁ!È\u008f3Ò;?±ò¹T ««î\u0093[\u009a\u009b±î¹^ è«ë\u0093Z\u009a\u0092\u0085ö\u008dRô\u0097ÿýçpî\u009eÙáÁ;È\u009f3Ù;-\"\u0082-Â\u0015>\u001cj\u0007È\u000f0±û¹T ¨«â±ì¹T ´«è\u0093A\u009a\u008e\u0085æ\u008d\tô\u0087ÿðç-îÝÙâÁ1ÈÄ3Û;)\"\u0083-Ã\u0015,\u001c6\u0007Ê\u000f2vba\u008ai\u001fPo[ÈC\u0015JZµ½½\u001f¤I¯\u008e\u0097\u0014\u009e^\u0089¦ðùøWãµêñÒ[\"¸*\u00003à8¼\u0000\u0015\tÚ\u0016²\u001e]gÓl¤ty}\u0089J¶Re[\u0090 \u008f¨}±×¾\u0097\u0086x\u008fb\u0094\u009e\u009cfå6òÞúKÃ;È\u009cÐAÙ\u000e&é.K7\u001d<Ú\u0004D\r\n\u001aòc\u00adk\tpá±ì¹T ´«è\u0093A\u009a\u008e\u0085æ\u008d\tô\u0087ÿðç-îÝÙâÁ1ÈÄ3Û;)\"\u0083-Ã\u0015,\u001c6\u0007ß\u000f-v9aÇi\bPg«\u001b££ºC±\u001f\u0089¶\u0080y\u009f\u0011\u0097þîpå\u0007ýÚô*Ã\u0015ÛÆÒ3),!Þ8t74\u000fÛ\u0006Á\u001d(\u0015ÚlÎ{?sïJ\u009a±ì¹T ´«è\u0093A\u009a\u008e\u0085æ\u008d\tô\u0087ÿðç-îÝÙâÁ1ÈÄ3Û;)\"\u0083-Ã\u0015,\u001c6\u0007ß\u000f-v9aÉi\u001aPm±ì¹T ´«è\u0093A\u009a\u008e\u0085æ\u008d\tô\u0087ÿðç-îÝÙâÁ1ÈÄ3Û;)\"\u0083-Ã\u0015,\u001c6\u0007ß\u000f-v9aÉi\u0017Pmä\u0087ì>õÄþ\u008eÆ6Ïö±³¹A ´«ô\u0093K\u009aÒ\u0085ÿ\u008dHô\u0090ÿüç2î\u0096ÙóÊæÂ_Û¥ÐïèCá\u0084þûöX\u008f\u008c)³!B8¿3è\u000b\\\u0002\u0098\u001dÿ\u0015\bl\u0092gû\u007f?v\u009eAåY\"P\u0085«Í£'ºÎµÁ\u008d\"\u0084v\u009fÉ\u0097-î`ù×ñTÈ}ÃÚÛ\u0003Òq-¿%\u0002<c7¢\u000f\u0003\u0006I\u0011¾hø`@{érþJHE\u008cä\u0084ìpõ\u0094þÂÆ{Ï¥Ð×Ø?¡¯ª×²\u000b»ò\u008c\u0083\u0094M\u009dµfÿnTw·xô@\u0018IFRõZ[#P4á<'\u0005T\u000eõ\u00165\u001fKàÃè/ñbú\u0088Â5ËcÜ\u0088¥Ù\u00ad+¶\u0083¿Ì¿\r·ù®\u001d¥K\u009dò\u0094,\u008b^\u0083¶ú&ñ^é\u0082à{×\nÏÄÆ<=v5Ý,7#\u007f\u001b\u0096\u0012É\t~\u0001\u008cxÆoig¢^ÂU3M¹DÒ»\n³µªí¡\u0018\u0099«\u0090«\u0087\u0005þLZ\u001bRêK\u0017@@xôq0nWf \u001f0\u0014H\f\u0094\u0005m2\u001c*Ò#!Ø{Ð\u008bÉ<Æzþ¼÷Ñìlä\u008e\u009dÓ\u008aS\u0082¸»È°\u007f¨½¡ß^\u0014V¦O÷D\u001c|ãuðb\u0010\u001bE\u0013´\b\u001c\u0001S¨h \u008f¹i²#\u008aÜ\u0083O\u009c'\u0094\u0095í[æ}þì÷FÀ2ØúÑ\u001f*\u0007\"û;U4\u0018\fô\u0005°\u001e\u0013\u0016ëoºx\u0016pÁI°BVZÙS½ìsäüý\u0000öJÎíÇ:ØNÐæ©3¢Oi;a\u008dx\u007fs'K\u0095BX].±ÿ¹Y ´«ô\u0093E\u009a\u0094\u0085ç\u008dJ\u0015¸\u001d\b\u0004¾\u000f½7\f>Ä! )\u0004PÁ[«C&JÁ}³eulÕ\u0097\u008a\u009f\u007fÎðÆIß³Ôùì\nåÑúøÆíÎB×¾ÜèäLí\u0082òçL`DÏ]3VenÁg\u000fxjpã\t\u0017\u0002*\u001aóU¶]\u0019DåO³w\u0017~Ùa¼i5\u0010Á\u001bü\u0003%\ná=û%,±î¹^ è«ë\u0093Z\u009a\u0092\u0085ö\u008dRô\u0097ÿýçpî\u009eÙïÁ1È\u008f3Ó±ï¹U \u00adæÄîa÷\u008eüÊÄtÍ´ÒÀÚh±Ý¹A ¶«»\u0093z\u009a\u0088\u0085ü\u008dSô\u009dÿäç;îÓÙæÁ:È\u00983\u009f;\u000f\"\u0089-Ä\u0015$\u001cu\u0007È±Ý¹_ ¢«é\u0093G\u009a\u0094\u0085ö\u008d\u0007ô§ÿÍç\u0015îÓÙâÁ È\u00833Ó;8\"Á-Ð\u0015$\u001cj\u0007\u008d\u000f:v/a\u0092±Ý¹_ ¢«é\u0093G\u009a\u0094\u0085ö\u008d\u0007ô§ÿÍç\u0015îÓÙâÁ È\u00833Ó;8\"Á-Ð\u0015$\u001cj\u0007\u008d\u000f:v/a\u0092i&P8[\u0097±î¹^ è«ó\u0093I\u009a\u008f\u0085ö\u008dPô\u0095ÿûç;±û¹^ ª«ÿ\u0093N\u009a\u0094\u0085á\u008dO3Ï;v\"\u008c)Æ\u00115\u0018î\u0002\u0080\n>\u0013Æ\u0018\u0096 .)æ\u0093\u0096\u009b&\u0082\u0090\u0089\u0093±\"¸ê§\u008e¯*ÖïÝ\u0085Å\bÌéû\u008aãLêü\u0011£ë\u0099ã)ú\u009fñ\u0087É:Àøß\u008b×5®ï¥Ð½X´á\u0083\u009a\u009bW±\u00ad±î¹^ è«è\u0093M\u009a\u009e\u0085ç\u008dUô\u0091±¬\u0087=\u008f\u008d\u0096;\u009d*¥\u008e¬G³-»\u0090Â\tÉ*ÑÿØOï7÷óþZ\u0005\u0018nrfÌ\u007f\"t\u007fLÿE\rZ\"R\u0099±î¹^ è«ù\u0093]\u009a\u0094\u0085þ\u008dCôÚÿïç7î\u009dÙçÁ0È\u00983Ï;>\"\u0088-Ø\u0015?\u009a\u008f\u0092 \u008bÜ\u0080\u008a¸.±à®\u0085¦|ßóÔ\u0099ÌAÅ¨ò\u0093êDãð\u0018®\u0010J\tü\u0006¡ÝNÕáÌ\u001dÇKÿïö!éDáÍ\u00989\u0093\u0004\u008bÝ\u0082iµF\u00ad\u0084¤4_UW\u0081NlA5yÑpÊk}c\u0099\u001aÇ\rc\u0005¥<Ø7I/½&\u0088ÙY½0µ\u009f¬c§5\u009f\u0091\u0096_\u0089:\u0081ÃøXó-ëúâ_Õ'ÍûÄ~?\u00077ã.A!R\u0019ç\u0010¶\u000b\b\u0003ìz®m\u0006eÑ±û¹T ¨«þ\u0093Z\u009a\u0094\u0085ñ\u008d\bô\u0082ÿëç1î\u008bÙ¸ÁcÈ\u009a3\u0090;:\"\u0083-Ù\u00153\u001c \u0007\u009b\u000f2õ\u0014ý±äFï\u0013×«ÞwÁRÉ»°\u007f»\r£îª{\u009d\u001f\u0085Ò\u008cjw>\u007fÆfQi!Q\u009cXÁCmKÊ2\u009d%%-ó\u0014\u0093\u001f%\u0007ü\u000eµñMù¸àå±î¹^ è«ù\u0093G\u009a\u0092\u0085æ\u008dKô\u009bÿèç:î\u0096ÙòC_KïRYYHaöh#wW\u007fÿ\u0006(\rY\u0015\u0088\u001c'+\u001f3\u0086:.ÁgÉ\u0091Ð4ß)ç\u009cîÀõrý\u0094\u0084Ã\u0093g\u009b¸¢Í©{±¯¸ÀÅÛÍYÔ¤ßïçAî\u0092ñðù\f\u0080\u008a\u008b·\u0093n{Gs÷jAaPYôP=OWGê>s5D-\u009e$)\u0013Y\u000b\u0090\u0002\"ùoñËè!ç{\u007f6w\u008anke1]ÛàýèWñ§úçÂ\u000eË\u0086ÔìÜL¥Ò®ð¶3¿\u0096\u0088ý\u0090p\u0099\u0092bÅj+s\u0099|Í!^)ç0\u0018;]\u0003µ\n&\u0015V\u001dºd*o[w\u0084~.IXQ\u0083X £\u007f>è6Q/®$ë\u001c\u0003\u0015\u008b\nñ\u0002\f{\u0097píh0a\u0093VÚN3G\u008e¼×´,\u00ad\u0096¢Ò±í¹T ««î\u0093\u0006\u009a\u008e\u0085ô\u008d\tô\u0098ÿêç:î¬ÙäÁ0È\u00843Ì;%\"\u0095-Ï±î¹^ è«ð\u0093M\u009a\u008f\u0085ü\u008dBô\u0098ÿ§ç?î\u009dÙäÁ'È\u00853Ö;(\"Ï-Ç\u0015.\u001cu\u0007Ø\u000f&\u001e\u000f\u0016¿\u000f\t\u0004\u0018<¦5s*\u0007\"è[dP\rHÒAgvOnÕg}\u009c:\u0094ò\u008dn\u00826ºÇ³\u009c±î¹^ è«ô\u0093L\u009a\u0090\u0085¼\u008dEô\u0081ÿàç2î\u0097Ù®Á3È\u00833Ñ;+\"\u0084-Ä\u0015;\u001cj\u0007Ä\u000f,vcTH\\øENNMvü\u007f4`Phô\u00111\u001a[\u0002Ö\u000b7<S$\u009a- Ö}ÞÄÇ!Èyð\u0083ùÙânê\u0096\u0093Á\u0084p\u008c¶µÆ¾q±î¹^ è«è\u0093Q\u009a\u008e\u0085æ\u008dBô\u0099ÿ§ç<î\u0086ÙéÁ9È\u008e3\u0091;*\"\u0088-Ø\u0015,\u001c}\u0007ß\u000f2veaÍi\u0017Pz±î¹^ è«è\u0093Q\u009a\u008e\u0085æ\u008dBô\u0099ÿÖç;î\u008bÙôÁ{È\u00883Ê;%\"\u008d-Ò\u0015e\u001c~\u0007Ä\u000f,vpaÁi\u000bP~[ÑC\u0019Jkµ®\u0092ç\u009aW\u0083á\u0088ä°D¹\u009a¦ÿ®A×\u008fÜ®Ä5Í\u008fúàâ0ë\u0087\u0010\u0098\u0018#\u0001\u0081\u000eÑ6%?t$Ö,;UlBÄJ\u001ess±\u0010¹  \u0016«\u0013\u0093³\u009am\u0085\b\u008d¶ôxÿ(çÄîaÙ\u0015ÁÆÈ:3#;Ç\"v-$\u0015Ñ\u001cÈ\u00075\u000fÕv\u0087a=iâP\u0082[-CüJ\u0092µJ½åQz±°¹\u0011\u0006º±³¹U £«í\u0093\u0007\u009a\u008c\u0085÷\u008dJô\u0081ÿÖç.î\u009aÙðÁ0±³¹U £«í\u0093\u0007\u009a\u008e\u0085ý\u008dDô\u009fÿìç*îÜÙâÁ4È\u00993Ú;.\"\u0080-Ø\u0015/\u001cG\u0007Ê\u000f'vyaÝi\u001d±³¹U £«í\u0093\u0007\u009a\u008e\u0085ý\u008dDô\u009fÿìç*îÜÙçÁ0È\u00843Æ;(±³¹U £«í\u0093\u0007\u009a\u008e\u0085ý\u008dDô\u009fÿìç*îÜÙñÁ0È\u00873Ê;(\u008b\u009d\u0083l\u009a\u0091\u0091Æ©) ¢¿Ù·dÎ¯ÅøÝ\u0004Ô¯ãÏû\u0018ò¡±³¹B ¿«è\u0093\\\u009a\u0098\u0085ÿ\u008d\bô\u0098ÿàç<îÜÙìÁ<È\u00883Ü;\u0013\"\u008c-×\u0015'\u001ct\u0007Â\u000f!vHaÀi\u001cPl[ÖC\u0017JZµ«½\n¤Q¯¤\u0097H\u009eH\u0089§/\u001e'ø>\u000e5@\rª\u00042\u001bL\u0013þj\u0006aCy\u0083p-)0!Ö8 3n\u000b\u0084\u0002\u001c\u001db\u0015Ðl(g~\u007f´v\u001dAfX®PHI¾Bðz\u001as\u0093làdY\u001d\u0082\u0016ñ\u000e7\u0007Á0ÿ(;!\u0083ÚÄÒ>Ë\u0090ÄÏü3õwîÔ±³¹B ¿«è\u0093\\\u009a\u0098\u0085ÿ\u008d\bô\u0098ÿàç<îÜÙìÁ<È\u00883Ý;?\"\u0095-Ð\u0015$\u001ct\u0007É\u000f'veaûi\u0013P`[ÊC^JvµµËºÃ\\ÚªÑäé\u000eà\u0096ÿè÷Z\u008e\u009c\u0085ã\u009d4\u0094\u009f;ñ3\u0017*á!¯\u0019E\u0010Ý\u000f£\u0007\u0011~Ñu²mndÞJ\u001cBú[\fPBh¨a0~Nvü\u000f6\u0004C\u001c\u0096\u00152±³¹U £«í\u0093\u0007\u009a\u009f\u0085á\u008dSô\u009bÿûç7î\u0096±³¹U £«í\u0093\u0007\u009a\u009f\u0085á\u008dSô\u0082ÿäç-î\u0094±³¹U £«í\u0093\u0007\u009a\u009f\u0085á\u008dSô\u0084ÿîç?î\u009aÙðÁ6Û9ÓßÊ)Ágù\u008dð\u0015ïkçÙ\u009e!\u0095j\u008d¹\u0084\u001c±³¹U §«ï\u0093I\u009aÒ\u0085ö\u008dHô\u0083ÿçç2î\u009cÙáÁ1È\u00993\u0090;b\"\u0099-Ô\u0015d\u001cz\u0007Þ\u000f6v|±³¹\\ ¨«ï\u0093\u0007\u009a\u008a\u0085û\u008dIô\u0090ÿæç)î\u0080Ù¯Á\u0017È\u00993Ë;\u001f\"\u0089-×\u00159\u001c}\u0007É\u000f\u0004vxaÈi\u001dPk[Ñ±³¹A ´«ô\u0093K\u009aÒ\u0085û\u008dHô\u0084ÿæç,î\u0087Ùóí®åUü¢÷¹Ï\u0010±³¹A ´«ô\u0093K\u009aÒ\u0085á\u008dBô\u0098ÿïçqî\u009eÙáÁ%È\u0099±û¹C §«÷\u0093D\u009a\u0092\u0085ñ\u008d\tô\u0093ÿæç2î\u0097ÙæÁ<È\u00993×;b\"\u0092-Ù6D>ì'\u0010,h\u0014Ð\u001d\f\u0002u\nÌs\"xN`\u009eii^GF\u008eú´òSëµàÿØ\u0000Ñ\u0097ÎðÆD¿\u009a´ï¬\u0006¥\u0097\u0092è\u008a6\u0083\u0088xÛp8iÈfÉ^!Ws±þ¹] ³«þ\u0093[\u009a\u0089\u0085ó\u008dDô\u009fÿúãbë\u0085òcù)ÁÖÈA×,ß\u0083¦K\u00ad,µü&V.°7B<\n\u0004¬\r7\u0012\u0013\u001a\u00adcfh\u0002p×yyN\u0004VÔ_|¤u¬\u0087µ`º#\u0082\u0081\u008b\u009c\u00908\u0098×á\u0081öoþäÇ\u0086Ì*±³¹A ´«ô\u0093K\u009aÒ\u0085ñ\u008dWô\u0081ÿàç0î\u0095Ùï±Û¹^ ª«ÿ\u0093N\u009a\u0094\u0085á\u008dOÊUÂ³ÛAÐ\tè¯á4þ\u0019ö¨\u008fa\u0084\f\u009c\u0097\u0095e¢\u0014ºÜ³jH0@ÆYbV#n\u0082g\u009d|>tÖ\rÞ\u001ar\u0012°+\u008b *8û1ÍÎQÆàß¹ÔEìïå«òG\u008b\t\u0083 \u0098\u000f\u0091\u001f©ª¦u¿\u0000·¯L~E\t".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2223);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -7970329011030017743L;
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
    private static java.lang.String $$g(byte r7, short r8, int r9) {
        /*
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r0 = com.bpjstku.data.payment.model.request.IndividualDetailCustomerObject.$$c
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.IndividualDetailCustomerObject.$$g(byte, short, int):java.lang.String");
    }
}
