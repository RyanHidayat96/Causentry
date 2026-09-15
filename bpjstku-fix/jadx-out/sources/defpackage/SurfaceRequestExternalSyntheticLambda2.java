package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceRequestExternalSyntheticLambda2 {
    private int TuitionPaymentFragmentbindingInflater1;
    public mergeConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public long b;
    private long d;
    private static final byte[] $$c = {112, 19, -59, 97};
    private static final int $$f = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, 104, -93, -37, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 67, 3, -12, 15, -13, 10, 7, -18, 20, -10, 7, 0, -63, 70, -15, 6, 8, -2, -10, 18, 2, -10, 2, 8, -65, 54, 13, 0, -7, 4, 10, -4, -62, 38, 17, 6, 8, -2, -10, 18, -46, 45, 0, -7, 4, 10, -4, -43, 35, 18, -10, 14, -12, 12, 6, -84, 80, -2, -10, -1, 7, -7, 12, -71, 1, 70, 6, -1, -2, 6, -8, 0, -63, 83, -12, -3, 19, -41, 35, -10, 2, 8, -71, 65, 2, 2, -4, 21, -8, 9, -79, 14, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -64};
    private static final int $$e = 133;
    private static final byte[] $$a = {15, -9, 64, -81, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 173;
    private static int notify = 0;
    private static int cancelAll = 1;
    private static char[] asInterface = {47378, 47365, 47375, 47361, 47364, 47370, 47301, 47360, 47328, 47418, 47423, 47374, 47366, 47344, 47367, 47376, 47368, 47363, 47329, 47346, 47421, 47391, 47371, 47422, 47369, 47372, 47339};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f229a = 2047719603;
    private static boolean asBinder = true;
    private static boolean g = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = r8 + 38
            int r7 = r7 + 4
            byte[] r0 = defpackage.SurfaceRequestExternalSyntheticLambda2.$$a
            int r6 = r6 * 2
            int r6 = r6 + 84
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceRequestExternalSyntheticLambda2.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 15
            int r8 = 99 - r8
            int r6 = r6 * 51
            int r0 = r6 + 53
            byte[] r1 = defpackage.SurfaceRequestExternalSyntheticLambda2.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 52
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceRequestExternalSyntheticLambda2.f(int, byte, byte, java.lang.Object[]):void");
    }

    public SurfaceRequestExternalSyntheticLambda2(long j, int i, mergeConfigs mergeconfigs) {
        this(i, mergeconfigs, lambdaprovideSurface5.b, j, Thread.currentThread().getId(), ViewPort.b());
    }

    private SurfaceRequestExternalSyntheticLambda2(int i, mergeConfigs mergeconfigs, String str, long j, long j2, int i2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mergeconfigs;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.b = j;
        this.d = j2;
        this.TuitionPaymentFragmentbindingInflater1 = i2;
    }

    public static String TuitionPaymentFragmentbindingInflater1(URLConnection uRLConnection) {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 101;
        notify = i3 % 128;
        int i4 = i3 % 2;
        if (uRLConnection != null) {
            try {
                return uRLConnection.getRequestProperty(provideSurface.TuitionPaymentFragmentbindingInflater1());
            } catch (Exception unused) {
                return null;
            }
        }
        int i5 = i2 + 25;
        notify = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("MT_3_");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("_");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancelAll);
        sb.append("_");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d);
        sb.append("-");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
        sb.append("_");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("_");
        sb.append(this.b);
        sb.append("_");
        sb.append(this.d);
        sb.append("_");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        String string = sb.toString();
        int i2 = notify + 17;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = asInterface;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 45;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i4]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i3;
                            byte b2 = (byte) (b - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31338), Color.argb(i3, i3, i3, i3) + 2994, 17 - (ViewConfiguration.getTouchSlop() >> 8), 1182129903, false, $$g(b, b2, (byte) (-b2)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i4 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 31339), ((Process.getThreadPriority(0) + 20) >> 6) + 2994, 16 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1182129903, false, $$g(b3, b4, (byte) (-b4)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4++;
                }
                i3 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f229a)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43326), 253 - TextUtils.indexOf("", ""), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        if (g) {
            int i6 = $10 + 53;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 3085 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26, -2146875848, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (asBinder) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - ExpandableListView.getPackedPositionGroup(0L)), View.MeasureSpec.getSize(0) + 3085, 26 - Color.red(0), -2146875848, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i8 = $10 + 23;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            int i10 = $10 + 69;
            $11 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        Object[] objArr;
        char c = 2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int mode = View.MeasureSpec.getMode(0) + 876;
            int modifierMetaStateMask = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, mode, modifierMetaStateMask, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, 127 - View.resolveSizeAndState(0, 0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b3, (byte) (b3 | 37), bArr[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iIndexOf, pressedStateDuration, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = cancelAll + 73;
            notify = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int scrollBarFadeDuration = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i4 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 89), bArr2[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, scrollBarFadeDuration, i4, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyUid = Process.myUid();
            int i5 = ((957297592 + (((~((-68168281) | (~iMyUid))) | 27858051) * (-591))) + ((iMyUid | (-68168281)) * 591)) - 840234227;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = notify + 69;
                cancelAll = i8 % 128;
                if (i8 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(null, null, Drawable.resolveOpacity(0, 0) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(null, null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -840234227};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                f(bArr3[79], bArr3[5], bArr3[26], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[26];
                Object[] objArr14 = new Object[1];
                f(b5, (byte) (b5 | 102), bArr3[79], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                        int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        c(b6, (byte) (b6 | 89), bArr4[5], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, i9, keyRepeatTimeout, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(null, null, Color.red(0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(null, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                            int iMyTid = (Process.myTid() >> 22) + 876;
                            int i10 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b7 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            c(b7, (byte) (b7 | 37), bArr5[5], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, iMyTid, i10, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cGreen = (char) Color.green(0);
                            int defaultSize = 876 - View.getDefaultSize(0, 0);
                            int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr19 = new Object[1];
                            c(b8, b9, b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, defaultSize, doubleTapTimeout, -1650998592, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i11 = ((int[]) objArr[c])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = cancelAll + 5;
            notify = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i16 = ~startElapsedRealtime;
            int i17 = i15 + (-999155460) + ((startElapsedRealtime | 362047462) * (-859)) + (((~(startElapsedRealtime | (-76555751))) | (~(362047462 | i16))) * 859) + (((~(321737233 | i16)) | (-398292984)) * 859);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr20[1])[0] = i19 ^ (i19 << 5);
            int i20 = cancelAll + 119;
            notify = i20 % 128;
            int i21 = i20 % 2;
        } else {
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i22 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = ~iIdentityHashCode;
            int i24 = i22 + 614646549 + (((~((-335288841) | i23)) | (~(iIdentityHashCode | (-294978612)))) * 333) + (((~(iIdentityHashCode | (-335288841))) | (~(i23 | (-294978612)))) * 333);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr21[1])[0] = i26 ^ (i26 << 5);
            int i27 = cancelAll + 101;
            notify = i27 % 128;
            int i28 = i27 % 2;
        }
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    private static String $$g(byte b, short s, int i) {
        int i2 = i + 67;
        int i3 = s + 4;
        int i4 = b * 2;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 += -i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            i3++;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i3];
        }
    }
}
