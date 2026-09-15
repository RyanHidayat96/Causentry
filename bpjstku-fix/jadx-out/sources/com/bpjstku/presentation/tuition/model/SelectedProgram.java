package com.bpjstku.presentation.tuition.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/tuition/model/SelectedProgram;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;I)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Integer;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SelectedProgram implements Parcelable {
    public static final Parcelable.Creator<SelectedProgram> CREATOR;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Integer b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {77, -106, 83, 4};
    private static final int $$d = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {114, -115, 48, 84, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 139;
    private static int asInterface = 0;
    private static int g = 1;
    private static int asBinder = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.tuition.model.SelectedProgram.$$a
            int r7 = r7 * 2
            int r7 = r7 + 84
            int r8 = r8 + 4
            int r9 = r9 * 3
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.model.SelectedProgram.c(byte, short, int, java.lang.Object[]):void");
    }

    public SelectedProgram(Integer num, String str, int i) {
        this.b = num;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
    }

    public final int hashCode() throws Throwable {
        int iIntValue;
        int i;
        int i2 = 2 % 2;
        int i3 = g + 109;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.b;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode2 = (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - Gravity.getAbsoluteGravity(0, 0)), Process.getGidForName("") + 41, ImageFormat.getBitsPerPixel(0) + 20, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(false, 111 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0') + 23, Color.argb(0, 0, 0, 0) + 4, new char[]{'\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(false, 115 - Color.blue(0), 15 - Color.green(0), 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        int i6 = i5;
        long j = 140;
        long jMyPid = Process.myPid();
        long j2 = -1;
        long j3 = (j2 ^ 185978408147264394L) | 1911278766594694593L;
        long j4 = jMyPid ^ j2;
        long j5 = (((long) 141) * 185978408147264394L) + (((long) (-279)) * 1911278766594694593L) + ((jMyPid | 1911278766594694593L) * j) + (((long) (-280)) * ((j3 ^ j2) | ((j4 | 1911278766594694593L) ^ j2))) + (j * ((j2 ^ (j3 | jMyPid)) | (((j2 ^ 1911278766594694593L) | 185978408147264394L) ^ j2) | ((j4 | 185978408147264394L) ^ j2)));
        long j6 = jLongValue;
        int i7 = 0;
        try {
            while (i7 != 10) {
                int i8 = asInterface + 97;
                g = i8 % 128;
                if (i8 % 2 == 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 37836), 60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 19, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 37836), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59, 18 - (ViewConfiguration.getTouchSlop() >> 8), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                }
                long j7 = j6;
                int i9 = 0;
                while (true) {
                    for (int i10 = 0; i10 != 8; i10++) {
                        i = (((((int) (j7 >> i10)) & 255) + (i << 6)) + (i << 16)) - i;
                    }
                    if (i9 != 0) {
                        break;
                    }
                    i9++;
                    j7 = j5;
                }
                int i11 = i6;
                if (i == i11) {
                    return iHashCode2;
                }
                int i12 = g + 119;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                j6 -= 1024;
                i7++;
                i6 = i11;
            }
            Object[] objArr3 = {-2026586299};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46038), 1134 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, -658850531, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 15;
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr5 = new Object[1];
                c(b, (byte) (-bArr[5]), b, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, iIndexOf, iIndexOf2, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45993), KeyEvent.keyCodeFromString("") + 1117, Color.rgb(0, 0, 0) + 16777233), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr4);
            int i14 = ((int[]) objArr6[1])[0];
            int i15 = ((int[]) objArr6[3])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    int i16 = g + 71;
                    asInterface = i16 % 128;
                    int i17 = 2;
                    int i18 = i16 % 2;
                    int i19 = 0;
                    while (i19 < strArr.length) {
                        int i20 = asInterface + 63;
                        g = i20 % 128;
                        int i21 = i20 % i17;
                        arrayList.add(strArr[i19]);
                        i19++;
                        i17 = 2;
                    }
                }
                Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            }
            return iHashCode2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        Object[] objArr7 = new Object[1];
        a(false, 109 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 16 - KeyEvent.getDeadChar(0, 0), 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535}, objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        a(false, 113 - ExpandableListView.getPackedPositionChild(0L), 16 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 3, new char[]{65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t'}, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d0  */
    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 3291 - TextUtils.indexOf("", "", 0), 31 - (ViewConfiguration.getScrollBarSize() >> 8), 1199271174, false, $$e(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 651 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, -450685997, false, $$e(b3, b4, (byte) (-b4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        if (z) {
            int i9 = $11 + 121;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i11 = $10 + 99;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i13 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr4[i12] = cArr2[0];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 651 - View.resolveSize(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, -450685997, false, $$e(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getOffsetAfter("", 0), 651 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0', 0) + 45, -450685997, false, $$e(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                int i14 = $10 + 15;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CREATOR = new TuitionPaymentFragmentbindingInflater1();
        int i = asBinder + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = g + 19;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = (i2 % 2 != 0 ? 0 : 1) ^ 1;
        int i5 = i3 + 9;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return i4;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 9;
        g = i3 % 128;
        int i4 = i3 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SelectedProgram)) {
            int i5 = i2 + 37;
            g = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        SelectedProgram selectedProgram = (SelectedProgram) p0;
        if (!Intrinsics.areEqual(this.b, selectedProgram.b)) {
            int i7 = asInterface + 67;
            g = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, selectedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            int i9 = g + 13;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == selectedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return true;
        }
        int i11 = asInterface + 75;
        g = i11 % 128;
        return i11 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        Integer num = this.b;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("SelectedProgram(b=");
        sb.append(num);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(i2);
        sb.append(")");
        String string = sb.toString();
        int i3 = asInterface + 5;
        g = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = g + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Integer num = this.b;
        if (num == null) {
            int i4 = asInterface + 63;
            g = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = 0;
        } else {
            p0.writeInt(1);
            iIntValue = num.intValue();
        }
        p0.writeInt(iIntValue);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentbindingInflater1 = -83722386;
    }

    private static String $$e(byte b, short s, byte b2) {
        byte[] bArr = $$c;
        int i = b * 2;
        int i2 = b2 + 4;
        int i3 = 120 - s;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 = (-i3) + i4;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i2 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i7]) + i3;
            i2 = i7;
            i5 = i6;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<SelectedProgram> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SelectedProgram createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SelectedProgram(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SelectedProgram[] newArray(int i) {
            return new SelectedProgram[i];
        }
    }
}
