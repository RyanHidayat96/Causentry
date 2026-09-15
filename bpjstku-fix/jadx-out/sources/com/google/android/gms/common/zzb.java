package com.google.android.gms.common;

import android.app.PendingIntent;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
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
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb implements Parcelable.Creator {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {119, -103, 14, -22};
    private static final int $$d = 68;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {23, -73, 107, 5, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 216;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1365154133;
    private static int b = -1934795528;
    private static int TuitionPaymentFragmentbindingInflater1 = 116788701;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {30, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 23, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31};

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r9 = r9 + 1
            int r8 = r8 + 4
            byte[] r0 = com.google.android.gms.common.zzb.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzb.a(int, int, byte, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        PendingIntent pendingIntent = null;
        int i2 = 0;
        int i3 = 0;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i2 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 2) {
                int i4 = asBinder;
                int i5 = i4 + 59;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                if (fieldId != 3) {
                    int i7 = i4 + 95;
                    asInterface = i7 % 128;
                    if (i7 % 2 != 0) {
                        if (fieldId != 3) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            strCreateString = SafeParcelReader.createString(parcel, header);
                        }
                    } else if (fieldId != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        strCreateString = SafeParcelReader.createString(parcel, header);
                    }
                } else {
                    pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel, header, PendingIntent.CREATOR);
                }
            } else {
                i3 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ConnectionResult(i2, i3, pendingIntent, strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        int i3 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int i4 = 651 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i5 = 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            byte b3 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 & 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, i5, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(1973727014 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0') - 30, (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (byte) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getTapTimeout() >> 16) + 571226701, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(1973727019 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) - 31, (short) Color.argb(0, 0, 0, 0), (byte) TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "", 0) + 571226723, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iGreen = Color.green(0) + 651;
            int mirror = AndroidCharacter.getMirror('0') - 4;
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            a(b5, (byte) (b5 | 51), b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, iGreen, mirror, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = asBinder + 113;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRed = (char) Color.red(0);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 651;
                int jumpTapTimeout = 44 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b6 = $$a[5];
                Object[] objArr6 = new Object[1];
                a(b6, (byte) (b6 | 50), (byte) 37, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, packedPositionGroup, jumpTapTimeout, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[0])[0];
            int iMyUid = Process.myUid();
            int i10 = (((1745876209 + ((((~(228381717 | iMyUid)) | 6302314) | (~((-224950908) | iMyUid))) * (-744))) + (((~iMyUid) | 9733124) * 744)) + ((iMyUid | (-6302315)) * 744)) - 1634009206;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1609 - TextUtils.lastIndexOf("", '0', 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1634009206, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 651;
                    int iArgb = 44 - Color.argb(0, 0, 0, 0);
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr9 = new Object[1];
                    a(b8, (byte) (b8 | 51), b7, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, maximumFlingVelocity, iArgb, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getScrollBarSize() >> 8), MotionEvent.axisFromString("") + 696, 146 - AndroidCharacter.getMirror('0')), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.keyCodeFromString("") + 63406), 793 - (ViewConfiguration.getScrollBarSize() >> 8), 83 - (ViewConfiguration.getPressedStateDuration() >> 16)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 651;
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 44;
                    byte b9 = $$a[5];
                    Object[] objArr10 = new Object[1];
                    a(b9, (byte) (b9 | 50), (byte) 37, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, windowTouchSlop, scrollBarSize, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    c(1973727014 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-31) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) View.getDefaultSize(0, 0), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 571226701, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(TextUtils.indexOf((CharSequence) "", '0', 0) + 1973727019, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 31, (short) (Process.myTid() >> 22), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 571226723 - ((Process.getThreadPriority(0) + 20) >> 6), objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 652;
                        int i13 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr13 = new Object[1];
                        a(b11, (byte) (b11 | 51), b10, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iLastIndexOf, i13, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int maximumFlingVelocity2 = 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44;
                        byte[] bArr2 = $$a;
                        byte b12 = bArr2[5];
                        byte b13 = bArr2[80];
                        Object[] objArr14 = new Object[1];
                        a(b12, b13, (byte) (b13 & 52), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyPid, maximumFlingVelocity2, keyRepeatTimeout, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i14 = asBinder + 99;
                    asInterface = i14 % 128;
                    int i15 = i14 % 2;
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                while (i3 < strArr.length) {
                    arrayList.add(strArr[i3]);
                    i3++;
                    int i16 = asInterface + 25;
                    asBinder = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
            throw null;
        }
        int i18 = asBinder + 21;
        asInterface = i18 % 128;
        int i19 = i18 % 2;
        Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[0])[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i23 = ~iIdentityHashCode;
        int i24 = (~(264942248 | i23)) | (-268418795) | (~(268373058 | i23));
        int i25 = i20 + (-1119987713) + (((~(iIdentityHashCode | (-264896513))) | i24) * 590) + (i24 * (-1180)) + (((~((-268373059) | i23)) | (~(i23 | (-264942249)))) * 590);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr15[3])[0] = i27 ^ (i27 << 5);
        int i28 = asInterface + 71;
        asBinder = i28 % 128;
        int i29 = i28 % 2;
        return new ConnectionResult[i];
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int length;
        byte[] bArr;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 2266 - TextUtils.indexOf((CharSequence) "", '0'), 32 - Process.getGidForName(""), 1387473586, false, $$e(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 == 0) {
                j = 3046761265686732006L;
            } else {
                byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr2 != null) {
                    int i8 = $10 + 123;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = $10 + 61;
                        $11 = i11 % 128;
                        if (i11 % i5 == 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3358, ExpandableListView.getPackedPositionGroup(0L) + 18, -1054011043, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr3[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr4 = {Integer.valueOf(bArr2[i10])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 3358 - View.getDefaultSize(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 18, -1054011043, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE});
                                }
                                bArr3[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                i10++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i5 = 2;
                    }
                    int i12 = $10 + 47;
                    $11 = i12 % 128;
                    i4 = 2;
                    int i13 = i12 % 2;
                    bArr2 = bArr3;
                } else {
                    i4 = 2;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr5 = new Object[i4];
                        objArr5[1] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        objArr5[0] = Integer.valueOf(i3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 2267 - KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, 1387473586, false, $$e(b8, b8, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                        j = 3046761265686732006L;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ j)) + i7;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - TextUtils.indexOf("", "", 0, 0)), 2855 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 13, -1529949196, false, $$e(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr5 != null) {
                    int i14 = $11 + 49;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i15 = 0; i15 < length; i15++) {
                        int i16 = $10 + 89;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        bArr[i15] = (byte) (((long) bArr5[i15]) ^ 3046761265686732006L);
                    }
                    bArr5 = bArr;
                }
                boolean z = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    int i20 = $11 + 97;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r7, byte r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r9 = 121 - r9
            byte[] r0 = com.google.android.gms.common.zzb.$$c
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r9 = r9 + 1
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzb.$$e(int, byte, short):java.lang.String");
    }
}
