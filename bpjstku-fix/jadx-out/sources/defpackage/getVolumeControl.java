package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class getVolumeControl extends fromToken<Float, Float> {
    private static short[] d;
    private static final byte[] $$c = {29, -5, -24, -13};
    private static final int $$f = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, 5, -88, -44, 12, -2, -63, 57, 8, 0, -8, 5, -7, -55, 51, 13, -10, 14, -3, -6, -5, -54, 62, -3, -7, 16, -17, 17, -9, -4, 14, -69, 66, -4, -11, 2, 2, 14, -69, 36, -46, 69, -5, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -1, -3, -11, -2, 6, -8, 11, -3, 5, -2, -3, 5, -9, -1, 18, -13, -4, 18, -42, 34, -11, 1, 7, -8, 1, 1, -5, 20, -9, 8, -67};
    private static final int $$e = 94;
    private static final byte[] $$a = {51, -5, 77, 89, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 235;
    private static int asBinder = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1953787965;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795554;
    private static int TuitionPaymentFragmentbindingInflater1 = -184652450;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -42, 42, -30, -26, -56, 26, 25, 49, -42, 28, -30, 53, -49, -18, 41, -54, -28, 40, 25, -56, -30, 25, 41, -29, -49, -31, -26, 30, -31, 55, -50, -26, -29, 54, -41, -28, 41, -51, 52, -27, -51, -26, -28, 54, -55, -29, 28, -28, 50, 26, -26, -42, 41, -26, -53, -27, 54, -30, -25, -26, 29, -25, -43, -42, -32, 41, -53, -28, 42, -27, -41, 25, 25, 52, -49, -26, 48, -52, -32, -26, 25, 27, -25, 54, -25, -43, -26, 55, 26, -41, -27, 26, 53, -49, -25, 25, -26, -32, 28, 49, -56, 52, -54, 54, -55, -28, -28, 27, -27, -25, 24, 40, -46, 43, -27, -44, 44, -25, -56, 51, -53, -29, 28, 52, -27, 24, -26, -26, -26, -26, -26, -26, -26, -26};

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 56 - r6
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = defpackage.getVolumeControl.$$a
            int r7 = r7 * 52
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r6 = r6 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVolumeControl.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.getVolumeControl.$$d
            int r8 = r8 * 15
            int r8 = 99 - r8
            int r9 = r9 * 13
            int r9 = 53 - r9
            int r7 = r7 * 39
            int r7 = 43 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2c:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVolumeControl.e(short, byte, byte, java.lang.Object[]):void");
    }

    @Override // defpackage.fromToken, defpackage.MediaControllerCompatApi21
    public final /* bridge */ /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return super.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        int i3 = 2 / 0;
        return super.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.fromToken, defpackage.MediaControllerCompatApi21
    public final /* bridge */ /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        g = i2 % 128;
        int i3 = i2 % 2;
        List listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i4 = g + 121;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return listTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.fromToken
    public final /* bridge */ /* synthetic */ String toString() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        g = i2 % 128;
        int i3 = i2 % 2;
        String string = super.toString();
        int i4 = asBinder + 109;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return string;
    }

    getVolumeControl() {
        super(Float.valueOf(0.0f));
    }

    public getVolumeControl(List<onSkipToNext<Float>> list) {
        super((List) list);
    }

    private static void c(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int length;
        byte[] bArr;
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 2267, (-16777183) - Color.rgb(0, 0, 0), 1387473586, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                long j = 0;
                if (bArr2 != null) {
                    int i7 = $11 + 37;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i4])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(j);
                            int touchSlop = 3358 - (ViewConfiguration.getTouchSlop() >> 8);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 18;
                            byte length2 = (byte) $$c.length;
                            byte b4 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, touchSlop, iNormalizeMetaState, -1054011043, false, $$g(length2, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr[i4] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i4++;
                        j = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 2266 - ImageFormat.getBitsPerPixel(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34, 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) d[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i8 = $10 + 79;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)) + i6;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 1;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 2855 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1529949196, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr4 != null) {
                    int i10 = $11 + 51;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i12 = 0; i12 < length3; i12++) {
                        int i13 = $11 + 43;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i15]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = d;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i16]) ^ 3046761265686732006L)) + s)) ^ b));
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

    @Override // defpackage.MediaControllerCompatApi21
    public final binderDied<Float, Float> TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asBinder + 103;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 37567);
            int iBlue = 625 - Color.blue(0);
            int mode = View.MeasureSpec.getMode(0) + 14;
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[5]);
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iBlue, mode, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(Color.alpha(0) - 2018718039, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 34, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), View.getDefaultSize(0, 0) + 119984933, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(Color.rgb(0, 0, 0) - 2001940819, (-41) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) Color.argb(0, 0, 0, 0), (byte) TextUtils.getOffsetAfter("", 0), AndroidCharacter.getMirror('0') + 54026, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRed = (char) (37567 - Color.red(0));
            int iArgb = 625 - Color.argb(0, 0, 0, 0);
            int mirror = '>' - AndroidCharacter.getMirror('0');
            byte b3 = (byte) (-$$a[5]);
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, iArgb, mirror, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asBinder + 105;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37567);
                int deadChar = 625 - KeyEvent.getDeadChar(0, 0);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 15;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[7];
                byte b6 = (byte) (-bArr2[5]);
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, deadChar, modifierMetaStateMask, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = (-704589446) + (((~((~iIdentityHashCode) | (-1003126842))) | 184680496) * (-245));
            int i9 = ~(iIdentityHashCode | (-1003126842));
            int i10 = i8 + (i9 * (-245)) + ((i9 | 820611279) * 245) + 1709452660;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(Color.green(0) - 2018718039, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 30, (short) TextUtils.indexOf("", "", 0, 0), (byte) View.resolveSize(0, 0), Process.getGidForName("") + 119984969, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((-2018718037) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 38, (short) (Process.myPid() >> 22), (byte) Drawable.resolveOpacity(0, 0), 119984993 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i13 = asBinder + 23;
                    g = i13 % 128;
                    int i14 = i13 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i15 = g + 29;
                    asBinder = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            c(View.resolveSize(0, 0) - 2018718030, (Process.myPid() >> 22) - 40, (short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) KeyEvent.keyCodeFromString(""), TextUtils.getOffsetAfter("", 0) + 119985010, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((-2018718031) - ExpandableListView.getPackedPositionGroup(0L), TextUtils.getOffsetBefore("", 0) - 40, (short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ExpandableListView.getPackedPositionGroup(0L), 119985026 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c((-2018718087) - TextUtils.lastIndexOf("", '0', 0), KeyEvent.normalizeMetaState(0) + 8, (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) Drawable.resolveOpacity(0, 0), 119985040 - (KeyEvent.getMaxKeyCode() >> 16), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c((-2018718037) - (ViewConfiguration.getScrollBarSize() >> 8), 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.argb(0, 0, 0, 0) + 119985103, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 1709452660};
                byte[] bArr3 = $$d;
                byte b7 = bArr3[85];
                Object[] objArr15 = new Object[1];
                e(b7, bArr3[9], b7, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = bArr3[9];
                Object[] objArr16 = new Object[1];
                e(b8, bArr3[85], b8, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37568);
                        int longPressTimeout = 625 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int fadingEdgeLength = 14 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        byte b10 = (byte) (-bArr4[5]);
                        Object[] objArr17 = new Object[1];
                        a(b9, b10, b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, longPressTimeout, fadingEdgeLength, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        c((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 2018718039, (ViewConfiguration.getTouchSlop() >> 8) - 34, (short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 119984932, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 2018718036, Drawable.resolveOpacity(0, 0) - 41, (short) ((-1) - ImageFormat.getBitsPerPixel(0)), (byte) ExpandableListView.getPackedPositionGroup(0L), 119984954 - (Process.myPid() >> 22), objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char deadChar2 = (char) (37567 - KeyEvent.getDeadChar(0, 0));
                            int maximumDrawingCacheSize = 625 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int i19 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13;
                            byte b11 = (byte) (-$$a[5]);
                            byte b12 = b11;
                            Object[] objArr20 = new Object[1];
                            a(b11, b12, b12, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar2, maximumDrawingCacheSize, i19, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollBarSize = (char) (37567 - (ViewConfiguration.getScrollBarSize() >> 8));
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 625;
                            int i20 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13;
                            byte[] bArr5 = $$a;
                            byte b13 = (byte) (-bArr5[5]);
                            byte b14 = bArr5[7];
                            Object[] objArr21 = new Object[1];
                            a(b13, b14, b14, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, iIndexOf, i20, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
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
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            for (String str2 : strArr2) {
                int i21 = g + 3;
                asBinder = i21 % 128;
                int i22 = i21 % 2;
                arrayList.add(str2);
            }
            throw null;
        }
        int i23 = ((int[]) objArr[1])[0];
        int i24 = ((int[]) objArr[2])[0];
        int i25 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i24};
        int i26 = ~Process.myPid();
        int i27 = i23 + ((((-1607244078) + (((~((-742006470) | i26)) | (-1081731652)) * (-933))) + (((~(i26 | (-1081731652))) | 1078059010) * 933)) - 1609010920);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr[1])[0] = i29 ^ (i29 << 5);
        Object[] objArr22 = {new int[]{i25}, new int[1], iArr2, strArr3};
        return new onAudioInfoChanged(this.b);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, int r8, short r9) {
        /*
            byte[] r0 = defpackage.getVolumeControl.$$c
            int r7 = r7 + 117
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r9 = r9 * 3
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
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
            if (r5 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVolumeControl.$$g(int, int, short):java.lang.String");
    }
}
