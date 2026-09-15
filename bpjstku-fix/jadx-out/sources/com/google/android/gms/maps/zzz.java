package com.google.android.gms.maps;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.maps.model.LatLng;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class zzz extends com.google.android.gms.maps.internal.zzam {
    final /* synthetic */ GoogleMap.OnMapClickListener zza;
    private static final byte[] $$c = {65, -122, -65, 2};
    private static final int $$f = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {30, 17, -35, 104, -10, 4, 65, -52, 5, -17, 21, -1, -9, 10, 59, -49, -11, 12, -12, 5, 8, 7, 56, -66, -1, 10, 65, -57, -3, -4, 17, -11, 6, 15, -9, 64, -52, -9, 4, 14, -6, -3, 66, -67, 18, -10, 1, 13, 57, -34, -33, 10, 46, -32, -15, 13, -4, 3, 29, -14, -10, 1, 13, 67, -77, 16, -7, 12, 37, -32, -15, 13, -4, 3, 76, -12, 16, -12, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 20, -5, -3, 12, -3, -3, 9, 32, -35, 10, -4, 13, -17, 17, -11, 67};
    private static final int $$e = 227;
    private static final byte[] $$a = {2, -84, 82, -15, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 69;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {45565, 53699, 29082, 37245, 12599, 20736, 61662, 4325, 45179, 53334, 28760, 37844, 13225, 21394, 62278, 4902, 45793, 53918, 29314, 37456, 12843, 22002, 50882, 42746, 1700, 58948, 17936, 9783, 34789, 26530, 51018, 42879, 1825, 58568, 17538, 9399, 33900, 61715, 37161, 12653, 53643, 29075, 4576, 45118, 20544, 61590, 37102, 12480, 54043, 29510, 4976, 46002, 21451, 45557, 53705, 29083, 37217, 12588, 20736, 61646, 4274, 45148, 53316, 28677, 37871, 13203, 21390, 62294, 4902};
    private static long b = 1460753945414390189L;

    zzz(GoogleMap googleMap, GoogleMap.OnMapClickListener onMapClickListener) {
        this.zza = onMapClickListener;
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
    private static void a(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 84
            int r6 = r6 * 15
            int r0 = r6 + 38
            int r5 = r5 * 52
            int r5 = 108 - r5
            byte[] r1 = com.google.android.gms.maps.zzz.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r5]
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r5 = r5 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.zzz.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 74
            int r7 = 78 - r7
            int r8 = r8 * 37
            int r8 = 75 - r8
            int r6 = r6 * 15
            int r6 = r6 + 84
            byte[] r0 = com.google.android.gms.maps.zzz.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + 1
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + 2
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.zzz.d(short, short, short, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $10 + 61;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2186 - ((byte) KeyEvent.getModifierMetaStateMask()), 41 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 33017);
                    int i7 = 3011 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 27;
                    byte b4 = $$c[3];
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, i7, packedPositionChild, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char gidForName = (char) (36504 - Process.getGidForName(""));
                    int mirror = AndroidCharacter.getMirror('0') + 3328;
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 17;
                    byte b6 = (byte) ($$c[3] - 1);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, mirror, longPressTimeout, -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36504);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 3376;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 18;
                byte b8 = (byte) ($$c[3] - 1);
                byte b9 = (byte) (b8 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, offsetAfter, iLastIndexOf, -968507904, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i8 = $10 + 87;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.google.android.gms.maps.internal.zzan
    public final void zzb(LatLng latLng) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43042);
            int iResolveOpacity = 3111 - Drawable.resolveOpacity(0, 0);
            int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[0], bArr[132], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iResolveOpacity, iCombineMeasuredStates, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(Color.green(0) + 22, 15 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 30523), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
            int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[132];
            Object[] objArr5 = new Object[1];
            a(b2, b2, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, i2, keyRepeatDelay, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int packedPositionType = 3111 - ExpandableListView.getPackedPositionType(0L);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, packedPositionType, maxKeyCode, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i3};
            int[] iArr2 = {i4};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~((-789445253) | iIdentityHashCode);
            int i6 = ~iIdentityHashCode;
            int i7 = (((2031411686 + ((i5 | (~(1067450014 | i6))) * (-406))) + ((~((-151863809) | i6)) * (-406))) + (((~(iIdentityHashCode | (-915586207))) | (~(789445252 | i6))) * 406)) - 390138396;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], iArr2, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(37 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (char) (MotionEvent.axisFromString("") + 16614), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ViewConfiguration.getTouchSlop() >> 8) + 53, 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i10 = TuitionPaymentFragmentbindingInflater1 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -390138396};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[46];
                byte b6 = b5;
                Object[] objArr11 = new Object[1];
                d(b5, b6, (byte) (b6 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[46];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr12 = new Object[1];
                d(b8, b8, b7, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRed = (char) (Color.red(0) + 43042);
                    int size = View.MeasureSpec.getSize(0) + 3111;
                    int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b9 = $$a[7];
                    byte b10 = b9;
                    Object[] objArr14 = new Object[1];
                    a(b9, b10, b10, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, size, keyRepeatTimeout, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(KeyEvent.getMaxKeyCode() >> 16, 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(22 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, (char) (30523 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 43042);
                        int iBlue = 3111 - Color.blue(0);
                        int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21;
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[132];
                        Object[] objArr17 = new Object[1];
                        a(b11, b11, bArr4[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, iBlue, i12, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43042);
                        int iBlue2 = Color.blue(0) + 3111;
                        int iIndexOf = 22 - TextUtils.indexOf("", "", 0);
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[0];
                        byte b13 = bArr5[132];
                        byte b14 = bArr5[7];
                        Object[] objArr18 = new Object[1];
                        a(b12, b13, b14, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize2, iBlue2, iIndexOf, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int i18 = ~((int) Process.getStartUptimeMillis());
            int i19 = i15 + 1461011642 + (((-302254227) | i18) * 494) + (((~(i18 | 1241208648)) | (-1381894291)) * 494);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr[0])[0] = i21 ^ (i21 << 5);
            Object[] objArr19 = {new int[1], new int[]{i17}, new int[]{i16}, strArr2};
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
            TuitionPaymentFragmentbindingInflater1 = i22 % 128;
            int i23 = i22 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i24 = 0;
                while (i24 < strArr3.length) {
                    int i25 = TuitionPaymentFragmentbindingInflater1 + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
                    if (i25 % 2 != 0) {
                        arrayList.add(strArr3[i24]);
                        i24 += 87;
                    } else {
                        arrayList.add(strArr3[i24]);
                        i24++;
                    }
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i26 = ((int[]) objArr[0])[0];
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i27};
            int i29 = ~((~System.identityHashCode(this)) | 265729093);
            int i30 = i26 + (((169128960 | i29) * (-374)) - 1233958316) + ((i29 | 96600133) * 374);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[0])[0] = i32 ^ (i32 << 5);
            Object[] objArr20 = {new int[1], new int[]{i28}, iArr3, strArr4};
        }
        this.zza.onMapClick(latLng);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, short r6, int r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r5 = r5 * 3
            int r5 = r5 + 109
            byte[] r0 = com.google.android.gms.maps.zzz.$$c
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r5
            r5 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r6]
        L27:
            int r5 = r5 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.zzz.$$g(short, short, int):java.lang.String");
    }
}
