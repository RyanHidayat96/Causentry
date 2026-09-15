package com.google.android.libraries.places.api.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class zzet implements Parcelable.Creator {
    private static final byte[] $$c = {58, -51, 54, -115};
    private static final int $$f = 66;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {77, -106, 83, 4, -6, 19, -29, 31, -13, -33, 31, 19, -13, -34, 46, 7, -6, -9, -63, 63};
    private static final int $$e = 110;
    private static final byte[] $$a = {83, -90, 68, -23, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 5;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45565, 24770, 5016, 49790, 62771, 41989, 22232, 2530, 14451, 60255, 39506, 19679, 32677, 11935, 49480, 61481, 41713, 21999, 1168, 14179, 58943, 39175, 23420, 35397, 63768, 10489, 8106, 20108, 48221, 58139, 54012, 456, 28821, 42621, 38192, 50180, 11228, 45565, 24770, 5016, 49790, 62771, 41989, 22232, 2530, 14461, 60252, 39436, 19618, 32669, 11919, 49480, 61477, 41706, 21957, 1160, 14197, 58888, 39172, 19406, 31401, 11645, 56392, 19192, 39902, 59529, 14713, 3646, 24325, 44495, 62090, 50027, 4187, 24855, 47074, 33976, 54666, 14927, 2850, 23028, 44741, 45558, 24781, 5002, 49773, 62834, 41984, 22237, 2466, 14459, 60162, 39471, 19701, 32687, 11928, 49497, 61473, 42505, 30516, 1125, 54686, 58068, 46073, 16692, 7753, 12200, 64689, 36339, 23320, 26723, 14719, 54948, 59349};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -2431718805363531604L;

    private static void a(int i, short s, int i2, Object[] objArr) {
        int i3 = i2 * 52;
        int i4 = 103 - s;
        int i5 = (i * 52) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = (i4 + i3) - 11;
            i5++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + bArr[i5]) - 11;
                i5++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.google.android.libraries.places.api.model.zzet.$$d
            int r8 = r8 * 16
            int r8 = 17 - r8
            int r7 = r7 * 6
            int r7 = 104 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r6 = r6 + 1
            r3 = r0[r6]
        L28:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzet.c(int, short, short, java.lang.Object[]):void");
    }

    private static void b(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 21;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2187;
                    int touchSlop = 40 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte b = (byte) ($$f & 15);
                    byte b2 = (byte) (b - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iKeyCodeFromString, touchSlop, 841711447, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AndroidCharacter.getMirror('0') + 32969), 3059 - AndroidCharacter.getMirror('0'), AndroidCharacter.getMirror('0') - 22, 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getTapTimeout() >> 16)), 3376 - TextUtils.getTrimmedLength(""), 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -968507904, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
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
        int i7 = $11 + 71;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b7 = (byte) 1;
                byte b8 = (byte) (b7 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 36505), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3376, 17 - TextUtils.indexOf("", "", 0), -968507904, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
        int i9 = $11 + 113;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 109;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        Place.BooleanPlaceAttributeValue[] booleanPlaceAttributeValueArr = new Place.BooleanPlaceAttributeValue[i];
        int i6 = i3 + 57;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            return booleanPlaceAttributeValueArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0241  */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String string = parcel.readString();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int iAlpha = 876 - Color.alpha(0);
            int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            a(b, (byte) $$b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iAlpha, minimumFlingVelocity, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(ViewConfiguration.getPressedStateDuration() >> 16, ((byte) KeyEvent.getModifierMetaStateMask()) + 23, (char) Color.argb(0, 0, 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(22 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 15, (char) (60037 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
            int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[7], bArr[54], (byte) (-bArr[5]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, i2, maximumFlingVelocity, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 877;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                byte[] bArr2 = $$a;
                byte b2 = (byte) (-bArr2[5]);
                byte b3 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, packedPositionChild2, edgeSlop, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i3 = ~iElapsedRealtime;
            int i4 = (((629539536 + (((~((-50043828) | i3)) | (~(9733598 | i3))) * (-867))) + ((((~((-50043828) | iElapsedRealtime)) | 40573473) | (~(9733598 | iElapsedRealtime))) * (-1734))) + (((~(iElapsedRealtime | 50307071)) | ((~(i3 | (-40573474))) | (~((-9470355) | iElapsedRealtime)))) * 867)) - 1226716782;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            int i7 = TuitionPaymentFragmentbindingInflater1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            b(TextUtils.lastIndexOf("", '0', 0, 0) + 38, 'J' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(62 - ImageFormat.getBitsPerPixel(0), 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 64264), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            b(80 - Process.getGidForName(""), 16 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 96, 16 - (ViewConfiguration.getTapTimeout() >> 16), (char) (6140 - (Process.myTid() >> 22)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentbindingInflater1 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -1226716782};
                byte b4 = (byte) (-1);
                byte b5 = (byte) (b4 + 1);
                Object[] objArr13 = new Object[1];
                c(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = (byte) 15;
                byte b7 = (byte) (b6 & 1);
                Object[] objArr14 = new Object[1];
                c(b6, b7, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i13 = TuitionPaymentFragmentbindingInflater1 + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                    int i14 = i13 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i15 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                        int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                        byte[] bArr3 = $$a;
                        byte b8 = (byte) (-bArr3[5]);
                        byte b9 = bArr3[7];
                        Object[] objArr16 = new Object[1];
                        a(b8, b9, b9, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i15, iKeyCodeFromString, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(Color.alpha(0), 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(22 - Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0') + 16, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 60037), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                            int packedPositionType = 876 - ExpandableListView.getPackedPositionType(0L);
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
                            byte[] bArr4 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(bArr4[7], bArr4[54], (byte) (-bArr4[5]), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar2, packedPositionType, offsetAfter, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int packedPositionType2 = 10 - ExpandableListView.getPackedPositionType(0L);
                            byte b10 = $$a[7];
                            Object[] objArr20 = new Object[1];
                            a(b10, (byte) $$b, b10, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, iIndexOf, packedPositionType2, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentbindingInflater1 = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i19 = ~iIdentityHashCode;
        int i20 = i18 + 1991768512 + ((iIdentityHashCode | 402917416) * 988) + (((~(447491645 | i19)) | (-451755646)) * (-1976)) + (((~(iIdentityHashCode | 407181416)) | 402917416 | (~((-407181417) | i19))) * 988);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[1])[0] = i22 ^ (i22 << 5);
        int i23 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
        int i24 = i23 % 2;
        return Place.BooleanPlaceAttributeValue.valueOf(string);
    }

    zzet() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, int r8, byte r9) {
        /*
            byte[] r0 = com.google.android.libraries.places.api.model.zzet.$$c
            int r7 = r7 * 3
            int r7 = 115 - r7
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2c:
            int r8 = r8 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzet.$$g(byte, int, byte):java.lang.String");
    }
}
