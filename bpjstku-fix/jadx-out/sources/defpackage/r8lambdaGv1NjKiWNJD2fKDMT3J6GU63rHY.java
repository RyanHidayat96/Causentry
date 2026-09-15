package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaGv1NjKiWNJD2fKDMT3J6GU63rHY implements setInactive {
    private static short[] d;
    private final String TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {7, 15, 25, 25};
    private static final int $$f = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {70, -114, 113, 8, 14, 0, -61, 56, -1, 21, -17, 5, 13, -6, -55, 53, 15, -8, 16, -1, -4, -3, -52, 70, 5, -6, -61, 65, 4, -9, 3, 9, -60, 32, 37, 1, -5, -17, 15, 20, -6, -36, 51, -15, 11, 8, -78, 77, 1, -24, 32, -15, 15, 7, -16, 4, 19, -78, 64};
    private static final int $$e = 82;
    private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 102;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1333a = 1;
    private static int b = -985437524;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795636;
    private static int asInterface = 1165541978;
    private static byte[] g = {-69, 103, -66, -40, 69, -69, 96, -80, 105, -43, -44, 54, -73, -16, 121, 118, 105, 108, -67, 101, -68, -91, -39, -74, -43, -48, -95, -56, -65, -84, -85, -40, -36, -74, -92, 76, -123, -68, 87, 93, 100, 74, 84, -68, 82, -70, 94, 111, 92, -61, 65, 80, 124, -105, -124, -121, -126, 83, -69, 82, -71, -2, -125, -27, -122, -70, -69, -72, -12, -55, -85, -2, -17, -123, -12, -69, -30, -58, 111, -1, 116, -48, -45, -79, 119, -5, 99, -88, -69, 101, -61, 97, 111, -77, 74, -39, -77, -112, 103, -83, 99, 105, -77, 100, 119, 111, -71, -26, -26, -26, -26, -26, -26};

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r0 = 53 - r7
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = defpackage.r8lambdaGv1NjKiWNJD2fKDMT3J6GU63rHY.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r8lambdaGv1NjKiWNJD2fKDMT3J6GU63rHY.c(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 55
            int r7 = 59 - r7
            byte[] r0 = defpackage.r8lambdaGv1NjKiWNJD2fKDMT3J6GU63rHY.$$d
            int r8 = 99 - r8
            int r6 = r6 * 55
            int r6 = 56 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-2)
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r8lambdaGv1NjKiWNJD2fKDMT3J6GU63rHY.f(short, byte, int, java.lang.Object[]):void");
    }

    public r8lambdaGv1NjKiWNJD2fKDMT3J6GU63rHY(String str, String str2, String str3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
    }

    @Override // defpackage.setInactive
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f1333a;
        int i3 = i2 + 71;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i2 + 55;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 2315 - AndroidCharacter.getMirror('0'), TextUtils.getOffsetAfter("", 0) + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $11 + 23;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = g;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $10 + 21;
                        $11 = i9 % 128;
                        if (i9 % i4 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 3358 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 17 - MotionEvent.axisFromString(""), -1054011043, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i8 = 0;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.green(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 3358, Color.rgb(0, 0, 0) + 16777234, -1054011043, false, $$g(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i4 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = g;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 2267 - TextUtils.getTrimmedLength(""), 32 - MotionEvent.axisFromString(""), 1387473586, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) d[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i6;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asInterface), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 55905), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2855, TextUtils.getCapsMode("", 0, 0) + 13, -1529949196, false, $$g(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = g;
                if (bArr4 != null) {
                    int i10 = $11 + 115;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $11 + 29;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i15 = $11 + 41;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    if (z) {
                        byte[] bArr6 = g;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = d;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    @Override // defpackage.setInactive
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31534);
            int i2 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int gidForName = 27 - Process.getGidForName("");
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            c(b3, (byte) (b3 | 52), b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, gidForName, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(View.MeasureSpec.getMode(0) + 908747173, TextUtils.getTrimmedLength("") - 84, (short) (16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (View.MeasureSpec.getSize(0) + 100), MotionEvent.axisFromString("") - 1240348233, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(908747178 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-91) - TextUtils.getOffsetBefore("", 0), (short) ((ViewConfiguration.getJumpTapTimeout() >> 16) - 67), (byte) ((-9) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.getOffsetBefore("", 0) - 1240348213, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
            int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
            byte[] bArr = $$a;
            byte b4 = bArr[80];
            Object[] objArr6 = new Object[1];
            c(b4, b4, bArr[37], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, iMakeMeasureSpec, keyRepeatDelay, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = f1333a + 33;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 921;
                int i5 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b5 = bArr2[37];
                byte b6 = b5;
                byte b7 = bArr2[33];
                byte b8 = b5;
                Object[] objArr7 = new Object[1];
                c(b6, b7, b8, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, scrollDefaultDelay, i5, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ((808541329 + (((~((~iIdentityHashCode) | (-714356939))) | 704647360) * 446)) + (((~(iIdentityHashCode | (-9709579))) | 355075345) * 446)) - 1635863916;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            int i9 = f1333a + 3;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            e(View.getDefaultSize(0, 0) + 908747173, ExpandableListView.getPackedPositionType(0L) - 80, (short) ((-7) - KeyEvent.getDeadChar(0, 0)), (byte) ((-96) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1240348199, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(View.resolveSizeAndState(0, 0, 0) + 908747175, (-89) - TextUtils.lastIndexOf("", '0', 0, 0), (short) (71 - (ViewConfiguration.getScrollBarSize() >> 8)), (byte) (KeyEvent.getDeadChar(0, 0) + 89), (-1240348174) - View.MeasureSpec.getSize(0), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = asBinder + 77;
                f1333a = i11 % 128;
                int i12 = i11 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e(908747182 - (ViewConfiguration.getFadingEdgeLength() >> 16), (-90) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 69), (-1240348157) - Drawable.resolveOpacity(0, 0), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(908747181 - ((Process.getThreadPriority(0) + 20) >> 6), (-90) - (ViewConfiguration.getEdgeSlop() >> 16), (short) (14 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 106), KeyEvent.getDeadChar(0, 0) - 1240348142, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 1918993428};
                byte[] bArr3 = $$d;
                byte b9 = bArr3[5];
                Object[] objArr14 = new Object[1];
                f(b9, bArr3[35], b9, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b10 = bArr3[35];
                Object[] objArr15 = new Object[1];
                f(b10, bArr3[5], b10, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
                    int doubleTapTimeout = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iMyPid = (Process.myPid() >> 22) + 28;
                    byte[] bArr4 = $$a;
                    byte b11 = bArr4[37];
                    Object[] objArr16 = new Object[1];
                    c(b11, bArr4[33], b11, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, doubleTapTimeout, iMyPid, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr17 = new Object[1];
                    e((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 908747172, TextUtils.lastIndexOf("", '0', 0) - 83, (short) (15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 100), View.resolveSize(0, 0) - 1240348234, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(Color.argb(0, 0, 0, 0) + 908747177, (-91) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (View.resolveSize(0, 0) - 67), (byte) ((-8) - View.resolveSize(0, 0)), (-1240348213) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                        int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int offsetBefore = 28 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b12, b12, bArr5[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, scrollBarFadeDuration, offsetBefore, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
                        int i13 = 921 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b13 = $$a[80];
                        byte b14 = b13;
                        Object[] objArr20 = new Object[1];
                        c(b14, (byte) (b14 | 52), b13, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, i13, keyRepeatTimeout, -1048449946, false, (String) objArr20[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i17 = (-53007403) + ((iIdentityHashCode2 | 911718624) * (-50));
            int i18 = ~((-843485345) | iIdentityHashCode2);
            int i19 = ~iIdentityHashCode2;
            int i20 = i16 + i17 + ((i18 | (~((-18875676) | i19))) * 50) + (((~(i19 | 911718624)) | (~((-862361020) | i19)) | 18875675) * 50);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[0])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i23 = asBinder + 71;
                f1333a = i23 % 128;
                int i24 = i23 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i25 = i15 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i25) % 2) - 1], 1).show();
            int i26 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode3;
            int i28 = i26 + (-510090614) + (((~((-220371958) | i27)) | (-1553707687)) * (-865)) + ((~(iIdentityHashCode3 | 220371957)) * 865) + (((~((-1553707687) | i27)) | (~(i27 | 220371957))) * 865);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[0])[0] = i30 ^ (i30 << 5);
        }
        int i31 = ((int[]) objArr2[0])[0];
        int i32 = i31 * i31;
        int i33 = -(1771597640 * i31);
        int i34 = (((i32 ^ i33) + ((i32 & i33) << 1)) - (~(-(i31 * 80486754)))) - 1;
        int i35 = (i34 ^ (-610014151)) + (((-610014151) & i34) << 1);
        int i36 = i35 >> 26;
        int i37 = ((i36 ^ ComposerKt.defaultsKey) + ((i36 & ComposerKt.defaultsKey) << 1)) / 64;
        int i38 = (i37 ^ 1) + ((i37 & 1) << 1);
        int i39 = ((i35 | i38) << 1) - (i38 ^ i35);
        int i40 = i35 >> 27;
        int i41 = ((i40 & (-63)) + (i40 | (-63))) / 32;
        int i42 = (-((((i41 | 1) << 1) - (i41 ^ 1)) ^ i39)) + 2;
        int i43 = i42 >> 15;
        int i44 = (((-262143) & i43) + (i43 | (-262143))) / 131072;
        int i45 = ((i44 | 1) << 1) - (i44 ^ 1);
        StringBuilder sb = new StringBuilder("22|28|17|^.{".substring(11736 / ((i42 & (-((i45 & 1) + (i45 | 1)))) * 652)));
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(',');
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append("}$");
        return Pattern.compile(sb.toString()).matcher(accessgetCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view)).matches();
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
    private static java.lang.String $$g(short r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = r8 + 117
            byte[] r1 = defpackage.r8lambdaGv1NjKiWNJD2fKDMT3J6GU63rHY.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r8 = r8 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r8lambdaGv1NjKiWNJD2fKDMT3J6GU63rHY.$$g(short, byte, int):java.lang.String");
    }
}
