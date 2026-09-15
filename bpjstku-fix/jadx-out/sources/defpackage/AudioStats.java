package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.RtlMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioStats {
    public Orientation INotificationSideChannel;
    public int INotificationSideChannelDefault;
    public int INotificationSideChannelStub;
    public int INotificationSideChannelStubProxy;
    public int IconCompatParcelizer;
    public float RemoteActionCompatParcelizer;
    public boolean TuitionPaymentFragmentbindingInflater1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f76a;
    public boolean asBinder;
    public long asInterface;
    public AnimationType b;
    public int cancel;
    public int cancelAll;
    public int connect;
    public int d;
    public int g;
    public int getExtras;
    public RtlMode getInterfaceDescriptor;
    public int notify;
    public int onTransact;
    public int read;
    public int write;
    private static final byte[] $$c = {68, -119, -76, 97};
    private static final int $$f = 150;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, 88, -118, 32, 12, -2, -63, 52, 14, -6, 9, 1, -9, 10, -71, 54, -3, 19, -19, -51, 71, -2, -14, 13, -68, 63, 2, -11, 1, 7, -62, 68, -13, 12, 4, -16, 14, 1, -70, 39, 27, -12, -3, 19, -15, -33, 33, 17, -13, -6, 2, -17, 27, -4, -6, 9};
    private static final int $$e = 92;
    private static final byte[] $$a = {68, 83, 49, -116, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 29;
    private static int disconnect = 0;
    private static int getItem = 1;
    private static int[] getRoot = {421266499, -1788324878, 24277316, 428013518, 1986257425, 116371951, -150096225, 1919319468, 2099204245, -1517543859, 621924691, -165811728, -1763331483, -146582478, -1595110679, 133844481, 650159504, -380228380};
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 3;
    public int MediaBrowserCompat = -1;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            byte[] r1 = defpackage.AudioStats.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r6 = 145 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AudioStats.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 52
            int r9 = r9 + 4
            byte[] r0 = defpackage.AudioStats.$$d
            int r8 = r8 + 98
            int r7 = r7 * 52
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r8 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r9 = r9 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AudioStats.f(int, byte, short, java.lang.Object[]):void");
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getRoot;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i6;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 3291 - TextUtils.indexOf("", ""), 30 - ImageFormat.getBitsPerPixel(i6), 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1870535734;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getRoot;
        if (iArr6 != null) {
            int i8 = $11 + 25;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i9 = $11 + 37;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr6[i2]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 3292, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                } else {
                    length = length;
                    Object[] objArr4 = {Integer.valueOf(iArr6[i2])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 1), ImageFormat.getBitsPerPixel(0) + 3292, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30, 1948206109, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i2++;
                }
                length = length;
                i5 = 1;
            }
            iArr6 = iArr2;
        }
        char c = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i10 = 17;
            for (int i11 = 1; i10 > i11; i11 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i10];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 1;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), (Process.myPid() >> 22) + 2559, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, 683220507, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i10--;
            }
            int i12 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 28879), ((Process.getThreadPriority(0) + 20) >> 6) + 348, 25 - (ViewConfiguration.getEdgeSlop() >> 16), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            c = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
            int mirror = 1803 - AndroidCharacter.getMirror('0');
            int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte b = $$a[5];
            Object[] objArr = new Object[1];
            c((short) 37, b, (byte) (b | 36), objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, mirror, iIndexOf, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        e(new int[]{1657643223, 1941636704, 1364747650, 363319701, 1080940722, -1251238201, 1039437868, 827073497, 1514720502, 907434486, -1209948474, -142787669, 1876982261, 145134609}, 22 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(new int[]{895638961, -2046248542, 57771509, -683175770, -1077576858, 662115738, 1174023066, -284755581, -1568157775, -1855503912}, Gravity.getAbsoluteGravity(0, 0) + 15, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cBlue = (char) (Color.blue(0) + 29944);
            int minimumFlingVelocity = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
            byte[] bArr = $$a;
            Object[] objArr4 = new Object[1];
            c(bArr[7], bArr[5], (byte) 52, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, minimumFlingVelocity, offsetBefore, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = disconnect + 117;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 1755;
                int iRgb = Color.rgb(0, 0, 0) + 16777239;
                Object[] objArr5 = new Object[1];
                c((short) 89, $$a[5], (byte) 52, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, capsMode2, iRgb, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr6[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{i4}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iMyPid = Process.myPid();
            int i5 = ~iMyPid;
            int i6 = (((-1379194337) + ((((~(i5 | (-195118649))) | 60817928) | (~((-273420355) | iMyPid))) * 717)) + (((~(iMyPid | (-195118649))) | ((~(i5 | (-273420355))) | 60817928)) * 717)) - 188144639;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            e(new int[]{1956561420, -419753086, -183085764, 1474509902, 1168722256, 1792594858, 281481000, -1191878485, 653752479, 31390455}, 16 - ExpandableListView.getPackedPositionType(0L), objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            e(new int[]{-2050683013, -1351306114, -738688890, 434133955, -184869051, -945225419, -1342828799, -642554427, -1163355983, 800015570}, 15 - MotionEvent.axisFromString(""), objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {1677391237};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42050 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1725 - ((byte) KeyEvent.getModifierMetaStateMask()), 29 - Color.red(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -188144639);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMyPid = (char) (29944 - (Process.myPid() >> 22));
                    int i9 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
                    int iResolveSize = View.resolveSize(0, 0) + 23;
                    Object[] objArr10 = new Object[1];
                    c((short) 89, $$a[5], (byte) 52, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, i9, iResolveSize, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr11 = new Object[1];
                    e(new int[]{1657643223, 1941636704, 1364747650, 363319701, 1080940722, -1251238201, 1039437868, 827073497, 1514720502, 907434486, -1209948474, -142787669, 1876982261, 145134609}, 22 - TextUtils.indexOf("", ""), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    e(new int[]{895638961, -2046248542, 57771509, -683175770, -1077576858, 662115738, 1174023066, -284755581, -1568157775, -1855503912}, 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyPid2 = (char) ((Process.myPid() >> 22) + 29944);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1755;
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                        byte[] bArr2 = $$a;
                        Object[] objArr13 = new Object[1];
                        c(bArr2[7], bArr2[5], (byte) 52, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid2, offsetAfter, threadPriority, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (29944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
                        int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 23;
                        byte b2 = $$a[5];
                        Object[] objArr14 = new Object[1];
                        c((short) 37, b2, (byte) (b2 | 36), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, iNormalizeMetaState, capsMode3, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
            Object[] objArr15 = {new int[]{i13}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i14 = ~iElapsedRealtime;
            int i15 = i12 + 711695537 + (((~((-24847780) | i14)) | 19931266 | (~((-187754647) | i14))) * (-1136)) + (((~((-24847780) | iElapsedRealtime)) | (~((-187754647) | iElapsedRealtime)) | (~(192671159 | i14))) * (-568)) + (((~(iElapsedRealtime | (-19931267))) | (~(i14 | 187754646)) | (~(24847779 | i14))) * 568);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr15[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i18 = 0;
                while (i18 < strArr.length) {
                    int i19 = getItem + 37;
                    disconnect = i19 % 128;
                    if (i19 % 2 != 0) {
                        arrayList.add(strArr[i18]);
                        i18 += 47;
                    } else {
                        arrayList.add(strArr[i18]);
                        i18++;
                    }
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i20 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            int i21 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
            Object[] objArr16 = {new int[]{i21}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i22 = ~elapsedCpuTime;
            int i23 = i20 + (-1616531427) + ((1073542863 | elapsedCpuTime) * (-676)) + (((~(1013499077 | i22)) | (-1073542864)) * 676) + (((~(elapsedCpuTime | (-60043787))) | (~(i22 | 800896651)) | 272646212) * 676);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[3])[0] = i25 ^ (i25 << 5);
        }
        return this.getExtras;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0205  */
    public final int TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = getItem + 55;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAxisFromString = (char) (37566 - MotionEvent.axisFromString(""));
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 625;
            int iBlue = Color.blue(0) + 14;
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 141, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, packedPositionGroup, iBlue, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{1657643223, 1941636704, 1364747650, 363319701, 1080940722, -1251238201, 1039437868, 827073497, 1514720502, 907434486, -1209948474, -142787669, 1876982261, 145134609}, 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{895638961, -2046248542, 57771509, -683175770, -1077576858, 662115738, 1174023066, -284755581, -1568157775, -1855503912}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) (View.MeasureSpec.getMode(0) + 37567);
            int touchSlop = 625 - (ViewConfiguration.getTouchSlop() >> 8);
            int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13;
            Object[] objArr5 = new Object[1];
            c((short) 141, $$a[5], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, touchSlop, i4, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (37566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 625;
                int i5 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr6 = new Object[1];
                c((short) 89, $$a[5], (byte) 52, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iCombineMeasuredStates, i5, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int iNextInt = new Random().nextInt();
            int i8 = (((-250606024) + (((~(1739851750 | iNextInt)) | 83886370) * (-756))) + (((~iNextInt) | 1739851750) * 756)) - 1439906809;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i6}, strArr};
            int i11 = disconnect + 63;
            getItem = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{-2112978247, -562235414, 1574847289, -1731663125, -350442377, -1673221000, 1915441907, -1226137720, 384844292, 513584888, -1920874409, 1886308883, 1809923327, -2137468737, 2110928543, -898515726}, 26 - (ViewConfiguration.getScrollBarSize() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{413537037, -177274672, -86526728, -1736997841, 137477788, -1780373662, -2094673140, -1697105850, 395560909, -268749605, -333483638, 236625338}, View.MeasureSpec.getSize(0) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i13 = getItem + 105;
                    disconnect = i13 % 128;
                    int i14 = i13 % 2;
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
            e(new int[]{1956561420, -419753086, -183085764, 1474509902, 1168722256, 1792594858, 281481000, -1191878485, 653752479, 31390455}, 17 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{-2050683013, -1351306114, -738688890, 434133955, -184869051, -945225419, -1342828799, -642554427, -1163355983, 800015570}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(new int[]{-232627649, 2006487335, -701361264, -121058482, -1042271320, 842892256, -66461721, -342042455, -1727803065, -2015900065, -1785258563, 485992570, 1979020009, 1180021438, -204518370, -830805382, -616377847, -74300507, -265194077, -791333470, 748103689, -1019534007, 1983475310, 513263137, -438826170, -1528660013, 447801140, 1637587775, -861958330, 1849237714, 1720204593, -971587610, -901809747, 550610425}, 65 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(new int[]{510999580, 1238600995, -1231304727, 1563099347, -1632749127, 578734577, 1339143844, 36319292, -1117808809, -1015283961, -1019086241, 3296794, 6073468, 371626271, 603659748, 991600178, 1281602272, -1515489956, 1171412511, -392690768, -301157728, 1088288138, 1968526662, 1747637802, 1499011436, 1121145193, -1955276200, -727550997, 36083316, -1054227204, 1200981570, -1108880997, -60152348, -754364036}, 64 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i15 = disconnect + 117;
            getItem = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -1439906809};
                byte[] bArr = $$d;
                byte b2 = bArr[11];
                byte b3 = b2;
                Object[] objArr15 = new Object[1];
                f(b2, b3, (byte) (b3 - 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b4 = bArr[11];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr16 = new Object[1];
                f(b5, b5, b4, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i17 = ((int[]) objArr17[0])[0];
                int i18 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 37567);
                        int iAxisFromString = MotionEvent.axisFromString("") + 626;
                        int i19 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13;
                        Object[] objArr18 = new Object[1];
                        c((short) 89, $$a[5], (byte) 52, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iAxisFromString, i19, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(new int[]{1657643223, 1941636704, 1364747650, 363319701, 1080940722, -1251238201, 1039437868, 827073497, 1514720502, 907434486, -1209948474, -142787669, 1876982261, 145134609}, (ViewConfiguration.getScrollBarSize() >> 8) + 22, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(new int[]{895638961, -2046248542, 57771509, -683175770, -1077576858, 662115738, 1174023066, -284755581, -1568157775, -1855503912}, 15 - TextUtils.getOffsetBefore("", 0), objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37567);
                            int i20 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 625;
                            int iMyTid = (Process.myTid() >> 22) + 14;
                            Object[] objArr21 = new Object[1];
                            c((short) 141, $$a[5], (byte) 52, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, i20, iMyTid, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveSize = (char) (View.resolveSize(0, 0) + 37567);
                            int i21 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 624;
                            int i22 = 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            byte b6 = $$a[7];
                            Object[] objArr22 = new Object[1];
                            c((short) 141, b6, b6, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, i21, i22, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i23 = ((int[]) objArr[0])[0];
        int i24 = ((int[]) objArr[2])[0];
        if (i24 == i23) {
            int i25 = ((int[]) objArr[1])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i26};
            int[] iArr3 = {i27};
            int iNextInt2 = new Random().nextInt();
            int i28 = ~((-1778817156) | iNextInt2);
            int i29 = ~iNextInt2;
            int i30 = i28 | (~(44920965 | i29));
            int i31 = ~(1778817155 | i29);
            int i32 = i25 + (-1133992704) + ((i30 | i31) * (-516)) + (((~(iNextInt2 | (-33820802))) | (~((-11100165) | i29))) * 516) + ((11100164 | i31) * 516);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr[1])[0] = i34 ^ (i34 << 5);
            Object[] objArr23 = {iArr3, new int[1], iArr2, strArr3};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                int i35 = getItem + 65;
                disconnect = i35 % 128;
                int i36 = i35 % 2;
                for (String str2 : strArr4) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i24 / (((i24 - 1) * i24) % 2), 0).show();
            int i37 = ((int[]) objArr[1])[0];
            int i38 = ((int[]) objArr[2])[0];
            int i39 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int[] iArr4 = {i38};
            int[] iArr5 = {i39};
            int iMyTid2 = Process.myTid();
            int i40 = (-668197476) + (((~((-232641600) | iMyTid2)) | (-1591096522)) * (-318));
            int i41 = ~((-1591096522) | iMyTid2);
            int i42 = ~iMyTid2;
            int i43 = i37 + i40 + ((i41 | (~(1608512767 | i42))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyTid2 | 1608512767)) | (~((-1375871169) | i42))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr[1])[0] = i45 ^ (i45 << 5);
            Object[] objArr24 = {iArr5, new int[1], iArr4, strArr5};
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = defpackage.AudioStats.$$c
            int r6 = r6 * 56
            int r6 = r6 + 66
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AudioStats.$$g(short, short, int):java.lang.String");
    }
}
