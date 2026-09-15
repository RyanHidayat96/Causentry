package com.google.android.gms.common.internal;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    final int zaa;
    final IBinder zab;
    private final ConnectionResult zac;
    private final boolean zad;
    private final boolean zae;
    private static final byte[] $$c = {32, 1, 70, -122};
    private static final int $$f = 148;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {39, 27, 2, 54, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 58, 5, 11, -11, -1, 1, 20, -12, -53, 71, -12, 16, 2, -8, 8, 1, 7, -67, 39, 23, -5, 19, -11, 1, -15, 20, 16, 2, -8, 8, 1, -26, 21, 13, 1, 6, -8, 13, -3, 5, 9, -46, 38, 5, -2, -70, 76, 3, 7, -9, -1, 21, -36, 36, -17, 19, -14, 17, -7, -5, 5, 15, 3, -77, 15, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, 1, -1, -9, 0, 8, -6, 13, -1, 7, 0, -1, 7, -7, 1, 20, -11, -2, 20, -40, 36, -9, 3, 9, -6, 3, 3, -3, 22, -7, 10, -64};
    private static final int $$e = 42;
    private static final byte[] $$a = {57, -56, 23, -36, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 62;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f772a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.zaa = i;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = z;
        this.zae = z2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.common.internal.zav.$$a
            int r1 = r5 + 1
            int r7 = r7 * 3
            int r7 = r7 + 97
            int r6 = r6 * 10
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-5)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zav.c(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 75
            int r7 = 79 - r7
            int r6 = r6 * 23
            int r0 = 76 - r6
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r1 = com.google.android.gms.common.internal.zav.$$d
            byte[] r0 = new byte[r0]
            int r6 = 75 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r8]
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + (-2)
            int r8 = r8 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zav.e(int, short, int, java.lang.Object[]):void");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            int i2 = f772a + 119;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this == obj) {
            int i4 = f772a + 31;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof zav)) {
            int i6 = asInterface + 25;
            f772a = i6 % 128;
            return i6 % 2 == 0;
        }
        zav zavVar = (zav) obj;
        if (!this.zac.equals(zavVar.zac) || !Objects.equal(zab(), zavVar.zab())) {
            int i7 = f772a + 89;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = f772a + 37;
        asInterface = i9 % 128;
        if (i9 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 75;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char absoluteGravity = (char) (8328 - Gravity.getAbsoluteGravity(0, 0));
                    int doubleTapTimeout = 1235 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 35;
                    byte b2 = (byte) ($$c[1] - 1);
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, doubleTapTimeout, offsetAfter, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                    int iArgb = Color.argb(0, 0, 0, 0) + 2764;
                    int iIndexOf = TextUtils.indexOf("", "") + 14;
                    byte b4 = (byte) ($$c[1] + 1);
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iArgb, iIndexOf, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 43325), (ViewConfiguration.getEdgeSlop() >> 16) + 253, 22 - View.MeasureSpec.getSize(0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMakeMeasureSpec = (char) (65200 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int iAxisFromString = 2890 - MotionEvent.axisFromString("");
                    int mode = 17 - View.MeasureSpec.getMode(0);
                    byte b6 = $$c[1];
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, iAxisFromString, mode, 2012627446, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $11 + 77;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 23 / 0;
        }
    }

    public final IAccountAccessor zab() {
        int i = 2 % 2;
        int i2 = f772a;
        int i3 = i2 + 43;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        IBinder iBinder = this.zab;
        if (iBinder != null) {
            return IAccountAccessor.Stub.asInterface(iBinder);
        }
        int i5 = i2 + 19;
        int i6 = i5 % 128;
        asInterface = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i6 + 51;
        f772a = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i2 = 2 % 2;
        int i3 = asInterface + 67;
        f772a = i3 % 128;
        int i4 = i3 % 2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        IBinder iBinder = this.zab;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int iAlpha = Color.alpha(0) + 876;
            int iAlpha2 = 10 - Color.alpha(0);
            byte[] bArr = $$a;
            byte b2 = bArr[8];
            byte b3 = bArr[11];
            Object[] objArr3 = new Object[1];
            c(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, iAlpha, iAlpha2, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{49114, 3843, 3510, 8569}, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, new char[]{48314, 61976, 58015, 35182, 24877, 29085, 53723, 24506, 8024, 34503, 27852, 10335, 28505, 9843, 24139, 48462, 47843, 8941, 17534, 13826, 23455, 6697}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{8003, 39522, 56266, 42176}, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49371), (ViewConfiguration.getTouchSlop() >> 8) - 895852001, new char[]{32157, 9131, 46190, 43883, 60183, 29733, 32601, 3883, 6859, 58212, 26165, 10449, 46017, 59733, 52053}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
            int size = 10 - View.MeasureSpec.getSize(0);
            byte b4 = $$a[11];
            byte b5 = (byte) (b4 + 1);
            Object[] objArr6 = new Object[1];
            c(b4, b5, b5, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, tapTimeout, size, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = asInterface + 13;
            f772a = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                byte[] bArr2 = $$a;
                byte b6 = bArr2[10];
                Object[] objArr7 = new Object[1];
                c(b6, (byte) (b6 >>> 2), bArr2[11], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength2, i7, pressedStateDuration, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = (-219778240) + (((~(861928541 | i8)) | 902238770) * 226) + (((~(i8 | 937426559)) | (~((-902238771) | iIdentityHashCode)) | 826740752) * (-113)) + ((~(iIdentityHashCode | 861928541)) * 113) + 531089459;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
        } else {
            int i12 = asInterface + 105;
            f772a = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr9 = {Integer.valueOf(i), 531089459};
                byte[] bArr3 = $$d;
                byte b7 = bArr3[5];
                Object[] objArr10 = new Object[1];
                e(b7, bArr3[19], b7, objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[0]);
                byte b8 = bArr3[19];
                Object[] objArr11 = new Object[1];
                e(b8, bArr3[5], b8, objArr11);
                objArr = (Object[]) cls2.getMethod((String) objArr11[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                    int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0');
                    byte[] bArr4 = $$a;
                    byte b9 = bArr4[10];
                    Object[] objArr12 = new Object[1];
                    c(b9, (byte) (b9 >>> 2), bArr4[11], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, iResolveSizeAndState, iIndexOf, 1324201839, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr13 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{49114, 3843, 3510, 8569}, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{48314, 61976, 58015, 35182, 24877, 29085, 53723, 24506, 8024, 34503, 27852, 10335, 28505, 9843, 24139, 48462, 47843, 8941, 17534, 13826, 23455, 6697}, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{8003, 39522, 56266, 42176}, (char) (49370 - ExpandableListView.getPackedPositionChild(0L)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 895852001, new char[]{32157, 9131, 46190, 43883, 60183, 29733, 32601, 3883, 6859, 58212, 26165, 10449, 46017, 59733, 52053}, objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                        int i14 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte b10 = $$a[11];
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr15 = new Object[1];
                        c(b10, b11, b11, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, absoluteGravity, i14, 254769921, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                        int i15 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[8];
                        byte b13 = bArr5[11];
                        Object[] objArr16 = new Object[1];
                        c(b12, b13, b13, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, maximumFlingVelocity, i15, -1199417970, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i19 = (int) Runtime.getRuntime().totalMemory();
            int i20 = ~i19;
            int i21 = i18 + 723455908 + (((~((-877414553) | i20)) | (-837104324)) * (-602)) + (((~(i19 | (-877414553))) | 67651608 | (~((-27341380) | i20))) * (-301)) + ((~(i20 | (-837104324))) * 301);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[1])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i24 = f772a + 85;
                asInterface = i24 % 128;
                for (int i25 = i24 % 2 != 0 ? 1 : 0; i25 < strArr.length; i25++) {
                    arrayList.add(strArr[i25]);
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i26 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i27 = ~System.identityHashCode(this);
            int i28 = ~(1050781401 | i27);
            int i29 = i26 + 1785109320 + ((i28 | (-1010471173)) * 764) + (((~(i27 | (-1010471173))) | 1008762880) * (-1528)) + (((-43726814) | i28) * 764);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr2[1])[0] = i31 ^ (i31 << 5);
        }
        int i32 = ((int[]) objArr2[1])[0];
        int i33 = i32 * i32;
        int i34 = -(1791588377 * i32);
        int i35 = (i33 & i34) + (i33 | i34);
        int i36 = -(i32 * (-1941092423));
        int i37 = (i35 & i36) + (i36 | i35);
        int i38 = ((i37 | 821346833) << 1) - (821346833 ^ i37);
        int i39 = i38 >> 20;
        int i40 = i39 & (-8191);
        int i41 = ((i39 | (-8191)) + i40) / 4096;
        int i42 = (i41 & 1) + (i41 | 1);
        int i43 = ((i39 ^ (-8191)) + (i40 << 1)) / 4096;
        int i44 = -(((i38 ^ i42) + ((i38 & i42) << 1)) ^ (((i43 | 1) << 1) - (i43 ^ 1)));
        int i45 = (i44 & 2) + (i44 | 2);
        int i46 = i45 >> 16;
        int i47 = ((i46 & (-131071)) + (i46 | (-131071))) / 65536;
        int i48 = (i47 & 1) + (i47 | 1);
        SafeParcelWriter.writeIBinder(parcel, 2048 / (((-((i48 & 1) + (i48 | 1))) & i45) * 512), iBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zad);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zae);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        b();
        CREATOR = new zaw();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
    }

    public final ConnectionResult zaa() {
        int i = 2 % 2;
        int i2 = f772a + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ConnectionResult connectionResult = this.zac;
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return connectionResult;
    }

    public final boolean zac() {
        boolean z;
        int i = 2 % 2;
        int i2 = f772a + 87;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            z = this.zad;
            int i4 = 2 / 0;
        } else {
            z = this.zad;
        }
        int i5 = i3 + 123;
        f772a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return z;
    }

    public final boolean zad() {
        int i = 2 % 2;
        int i2 = f772a + 75;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.zae;
        int i5 = i3 + 107;
        f772a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return z;
    }

    static void b() {
        b = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        TuitionPaymentFragmentbindingInflater1 = (char) 57049;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.google.android.gms.common.internal.zav.$$c
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r6 = r6 + 102
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zav.$$g(short, int, byte):java.lang.String");
    }
}
