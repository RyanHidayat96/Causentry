package com.google.android.gms.internal.identity;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
final class zzax extends zzba {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final /* synthetic */ boolean zza;
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$f = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {101, 89, 94, -73, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 27;
    private static int asBinder = 0;
    private static int d = 1;
    private static int b = -1712025905;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795543;
    private static int TuitionPaymentFragmentbindingInflater1 = 1206777182;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {-49, 51, -60, -18, 17, -49, 54, -58, Base64.padSymbol, -31, -30, 124, -61, -122, 13, 60, Base64.padSymbol, 58, -55, 49, -54, 110, -110, 99, -98, -99, 106, -123, 120, 105, 100, -107, -103, 99, -111, -36, 37, -43, 46, -14, -15, 19, 45, -39, 33, -22, 25, 63, -63, 35, 50, -58, 31, -24, -58, 33, 42, -4, 54, 56, -58, 53, 58, 50, -56, -26, -26, -26, -26};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzax(zzbb zzbbVar, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.zza = z;
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
    private static void e(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r6 = r6 * 4
            int r6 = 84 - r6
            int r7 = r7 * 4
            int r0 = 53 - r7
            byte[] r1 = com.google.android.gms.internal.identity.zzax.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + 1
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzax.e(int, byte, short, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            float f = 0.0f;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 2267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 33 - ((Process.getThreadPriority(0) + 20) >> 6), 1387473586, false, $$i(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 61;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            char c = '0';
            if (z) {
                byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr2 != null) {
                    int i10 = $11 + 61;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i12 = 0;
                    while (i12 < length2) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i12])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", c)), (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 3358, 18 - View.resolveSizeAndState(0, 0, 0), -1054011043, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr3[i12] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i12++;
                            f = 0.0f;
                            c = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i13 = $10 + 21;
                    $11 = i13 % 128;
                    i6 = 2;
                    int i14 = i13 % 2;
                    bArr2 = bArr3;
                } else {
                    i6 = 2;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr4 = new Object[i6];
                    objArr4[1] = Integer.valueOf(b);
                    objArr4[0] = Integer.valueOf(i3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 2267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Process.getGidForName("") + 34, 1387473586, false, $$i(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                int i15 = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ j));
                if (z) {
                    int i16 = $10 + 125;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55952 - AndroidCharacter.getMirror('0')), ExpandableListView.getPackedPositionGroup(0L) + 2855, Color.argb(0, 0, 0, 0) + 13, -1529949196, false, $$i(b7, b8, (byte) (b8 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr5 != null) {
                    int i18 = $11 + 81;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        int i19 = $11 + 85;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                        bArr[i5] = (byte) (((long) bArr5[i5]) ^ 3046761265686732006L);
                        i5++;
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i21 = $10 + 97;
                    int i22 = i21 % 128;
                    $11 = i22;
                    int i23 = i21 % 2;
                    if (!z2) {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        int i25 = i22 + 87;
                        $10 = i25 % 128;
                        if (i25 % 2 != 0) {
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i26 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i26;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / (((byte) (((byte) (((long) bArr6[i26]) | 3046761265686732006L)) >>> s)) ^ b2));
                        } else {
                            byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i27 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i27 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i27]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
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

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws Throwable {
        String str;
        boolean z;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 46400), 39 - TextUtils.lastIndexOf("", '0', 0), 18 - TextUtils.lastIndexOf("", '0', 0, 0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        Object obj = null;
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(KeyEvent.keyCodeFromString("") + 884954793, 7 - TextUtils.indexOf("", ""), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (33 - ExpandableListView.getPackedPositionType(0L)), Color.red(0) - 358208041, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 884954797, KeyEvent.keyCodeFromString(""), (short) TextUtils.getOffsetBefore("", 0), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 112), (-358208020) - View.MeasureSpec.getMode(0), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -1;
        long j2 = ((j ^ 3658616811896833423L) | (-1561359637154874436L)) ^ j;
        long jIdentityHashCode = System.identityHashCode(this);
        long j3 = jIdentityHashCode ^ j;
        long j4 = (((long) 595) * 3658616811896833423L) + (((long) (-1187)) * (-1561359637154874436L)) + (((long) (-1188)) * (j2 | ((j3 | (-1561359637154874436L)) ^ j)));
        long j5 = 594;
        long j6 = j ^ (-1561359637154874436L);
        long j7 = j2 | ((j6 | jIdentityHashCode) ^ j);
        long j8 = (j3 | 3658616811896833423L) ^ j;
        long j9 = j4 + ((j7 | j8) * j5) + (j5 * (((j6 | 3658616811896833423L) ^ j) | ((j6 | j3) ^ j) | j8));
        int i3 = 0;
        while (true) {
            int i4 = 8;
            if (i3 == 10) {
                Object[] objArr3 = new Object[1];
                c(884954802 - Gravity.getAbsoluteGravity(0, 0), 1 - Color.alpha(0), (short) (MotionEvent.axisFromString("") + 1), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 50), (-358208006) - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c((ViewConfiguration.getScrollDefaultDelay() >> 16) + 884954801, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, (short) ((-1) - Process.getGidForName("")), (byte) ((-44) - ((byte) KeyEvent.getModifierMetaStateMask())), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 358207991, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {1096074480};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        str = "";
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 46038), TextUtils.getOffsetAfter(str, 0) + 1134, KeyEvent.keyCodeFromString(str) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    } else {
                        str = "";
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1968965769, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                        int iLastIndexOf = TextUtils.lastIndexOf(str, '0', 0) + 1032;
                        int maximumFlingVelocity = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        e(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, iLastIndexOf, maximumFlingVelocity, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - Process.getGidForName(str)), 1116 - MotionEvent.axisFromString(str), 17 - (ViewConfiguration.getLongPressTimeout() >> 16)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    z = true;
                    int i5 = ((int[]) objArr8[1])[0];
                    int i6 = ((int[]) objArr8[3])[0];
                    if (i6 == i5) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        int i7 = asBinder + 81;
                        int i8 = i7 % 128;
                        d = i8;
                        int i9 = i8 + 45;
                        asBinder = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 2 % 4;
                        }
                        for (int i11 = i7 % 2 == 0 ? 1 : 0; i11 < strArr.length; i11++) {
                            arrayList.add(strArr[i11]);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i6));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i12 = d + 69;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 37836), 59 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i14 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(obj);
            int i15 = 0;
            long j10 = jLongValue;
            while (true) {
                int i16 = 0;
                while (i16 != i4) {
                    i14 = (((((int) (j10 >> i16)) & 255) + (i14 << 6)) + (i14 << 16)) - i14;
                    i16++;
                    i4 = 8;
                }
                if (i15 != 0) {
                    break;
                }
                i15++;
                int i17 = d + 21;
                asBinder = i17 % 128;
                int i18 = i17 % 2;
                j10 = j9;
                i4 = 8;
            }
            if (i14 == i2) {
                z = true;
                break;
            }
            int i19 = d + 15;
            asBinder = i19 % 128;
            if (i19 % 2 != 0) {
                i3 += 74;
                jLongValue = 1024 & jLongValue;
            } else {
                jLongValue -= 1024;
                i3++;
            }
            obj = null;
        }
        zzdz zzdzVar = (zzdz) anyClient;
        if (this.zza != z) {
            zzdzVar.zzz(zzbb.zza(this));
        } else {
            zzdzVar.zzy(zzbb.zza(this));
        }
    }

    private static String $$i(short s, short s2, byte b2) {
        int i = (s2 * 2) + 4;
        int i2 = s * 3;
        byte[] bArr = $$c;
        int i3 = 121 - b2;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i++;
            i3 = i4 + i;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i];
            i++;
            i3 += b3;
        }
    }
}
