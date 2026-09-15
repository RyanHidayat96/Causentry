package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import com.bpjstku.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.libraries.places.internal.zzpu;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setRotationDegrees extends ContextWrapper {
    public static final AutoValue_SurfaceOutput_Event<?, ?> b;
    private static int[] cancelAll;
    private static int notify;
    private final Glide.TuitionPaymentFragmentbindingInflater1 INotificationSideChannel;
    public final List<getTargetCoordinateSystem<Object>> TuitionPaymentFragmentbindingInflater1;
    public final CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final Map<Class<?>, AutoValue_SurfaceOutput_Event<?, ?>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final getAvailableCameraInfos TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RequestOptions f1383a;
    public final setDefaultSessionConfig asBinder;
    public final setResolution asInterface;
    public final setZslDisabled.b<Registry> d;
    public final int g;
    private static final byte[] $$c = {110, -73, -111, 99};
    private static final int $$d = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {92, 126, -38, -95, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 249;
    private static int cancel = 0;
    private static int INotificationSideChannelDefault = 1;
    private static int onTransact = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 1
            byte[] r1 = defpackage.setRotationDegrees.$$a
            int r5 = r5 * 14
            int r5 = 98 - r5
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setRotationDegrees.c(byte, short, byte, java.lang.Object[]):void");
    }

    static {
        notify = 1;
        TuitionPaymentFragmentbindingInflater1();
        b = new AutoValue_ResolutionInfo_ResolutionInfoInternal1();
        int i = onTransact + 65;
        notify = i % 128;
        int i2 = i % 2;
    }

    public setRotationDegrees(Context context, CameraUnavailableException cameraUnavailableException, setZslDisabled.b<Registry> bVar, setDefaultSessionConfig setdefaultsessionconfig, Glide.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Map<Class<?>, AutoValue_SurfaceOutput_Event<?, ?>> map, List<getTargetCoordinateSystem<Object>> list, getAvailableCameraInfos getavailablecamerainfos, setResolution setresolution, int i) {
        super(context.getApplicationContext());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraUnavailableException;
        this.asBinder = setdefaultsessionconfig;
        this.INotificationSideChannel = tuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentbindingInflater1 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getavailablecamerainfos;
        this.asInterface = setresolution;
        this.g = i;
        this.d = new setZslDisabled.AnonymousClass3(bVar);
    }

    public final RequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        RequestOptions requestOptions;
        synchronized (this) {
            if (this.f1383a == null) {
                this.f1383a = this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2().asBinder();
            }
            requestOptions = this.f1383a;
        }
        return requestOptions;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = cancelAll;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), View.MeasureSpec.getMode(0) + 3291, AndroidCharacter.getMirror('0') - 17, 1948206109, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = cancelAll;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $10 + 107;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c = (char) ((ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1)) + i5);
                        int iKeyCodeFromString = 3291 - KeyEvent.keyCodeFromString("");
                        int iResolveOpacity = 31 - Drawable.resolveOpacity(i6, i6);
                        byte b4 = (byte) i6;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iKeyCodeFromString, iResolveOpacity, 1948206109, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i8++;
                    int i11 = $10 + 67;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    iArr5 = iArr5;
                    i5 = 1;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[i2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i13 = 17;
            for (int i14 = 1; i13 > i14; i14 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i13];
                try {
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 2559 - Color.argb(0, 0, 0, 0), View.getDefaultSize(0, 0) + 29, 683220507, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i13--;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.getGidForName("") + 28880), (ViewConfiguration.getFadingEdgeLength() >> 16) + 348, (ViewConfiguration.getJumpTapTimeout() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (29944 - TextUtils.indexOf("", ""));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
            int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[28];
            short s = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b2, s, (byte) (s & 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, tapTimeout, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
                int i2 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 23;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[28];
                short s2 = (short) (bArr2[12] + 1);
                Object[] objArr3 = new Object[1];
                c(b3, s2, (byte) (s2 | 16), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, i2, touchSlop2, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1622811851;
            int i4 = ~i3;
            int i5 = 1666560288 + (((~((-707940545) | i4)) | 495338118) * (-865)) + ((~(i3 | 707940544)) * 865) + (((~(495338118 | i4)) | (~(i4 | 707940544))) * 865) + 1409328212;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{951024566, 723180419, -1554938762, 1092829632, -87201567, -122229171, 389514163, 1266183652, -1003601853, 1635693374}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{-1304755794, -154835792, -1118831046, -793035772, 792108236, -1003625070, -1924478549, -1540599712, -1757161447, -112860329}, 15 - TextUtils.lastIndexOf("", '0', 0, 0), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-111393119};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 42048), 1726 - TextUtils.indexOf("", "", 0, 0), 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1409328212, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
                    int i8 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[28];
                    short s3 = (short) (bArr3[12] + 1);
                    Object[] objArr8 = new Object[1];
                    c(b4, s3, (byte) (s3 | 16), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, i8, keyRepeatDelay, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{1075392650, 945388966, -1114774056, 792951, 1186423565, 1857467119, 1859756091, 1712449305, -149132177, 503239834, 637008185, 1199431651, 157009436, -1005589254}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_instalments).substring(4, 5).length() + 21, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{309541779, -237071084, 74020956, 1307160446, 342628512, -2124652965, -916246799, -1118903558, -96976056, 539518161}, MotionEvent.axisFromString("") + 16, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAlpha = (char) (29944 - Color.alpha(0));
                        int keyRepeatDelay2 = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                        Object[] objArr11 = new Object[1];
                        c($$a[28], (short) ($$b & 350), (byte) 52, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, keyRepeatDelay2, edgeSlop, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                        int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                        byte[] bArr4 = $$a;
                        byte b5 = bArr4[28];
                        short s4 = bArr4[5];
                        Object[] objArr12 = new Object[1];
                        c(b5, s4, (byte) (s4 & 37), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iCombineMeasuredStates, iNormalizeMetaState, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i10 == i9) {
            int i11 = cancel + 25;
            INotificationSideChannelDefault = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i14 = i13 + (((~((-627882203) | iIdentityHashCode)) | 4237440) * (-283)) + 1411797945 + ((~(iIdentityHashCode | (-623644763))) * 283);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i17 = cancel + 23;
                    INotificationSideChannelDefault = i17 % 128;
                    int i18 = i17 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i19 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i20 = ~startElapsedRealtime;
            int i21 = i19 + 711695537 + (((~((-504823768) | i20)) | 236195394 | (~(292221341 | i20))) * (-1136)) + (((~((-504823768) | startElapsedRealtime)) | (~(292221341 | startElapsedRealtime)) | (~((-23592969) | i20))) * (-568)) + (((~(startElapsedRealtime | (-236195395))) | (~(i20 | (-292221342))) | (~(504823767 | i20))) * 568);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr14[3])[0] = i23 ^ (i23 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
            int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15;
            Object[] objArr15 = new Object[1];
            c($$a[28], (short) 140, (byte) 52, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, capsMode, keyRepeatDelay3, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{1075392650, 945388966, -1114774056, 792951, 1186423565, 1857467119, 1859756091, 1712449305, -149132177, 503239834, 637008185, 1199431651, 157009436, -1005589254}, 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{309541779, -237071084, 74020956, 1307160446, 342628512, -2124652965, -916246799, -1118903558, -96976056, 539518161}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama6).substring(9, 10).length() + 14, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i24 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr5 = $$a;
            byte b6 = bArr5[28];
            short s5 = (short) (bArr5[12] + 1);
            Object[] objArr18 = new Object[1];
            c(b6, s5, (byte) (s5 | 16), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i24, modifierMetaStateMask, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i25 = INotificationSideChannelDefault + 107;
            cancel = i25 % 128;
            int i26 = i25 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cBlue = (char) Color.blue(0);
                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 1031;
                int iAlpha = 15 - Color.alpha(0);
                byte b7 = $$a[7];
                byte b8 = b7;
                Object[] objArr19 = new Object[1];
                c(b8, (short) (b8 | 192), b7, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cBlue, iIndexOf2, iAlpha, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr20[3])[0];
            int i28 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i29 = 1370543449 + (((~((-277971853) | (~iIdentityHashCode2))) | (~((-33691683) | iIdentityHashCode2))) * (-272)) + (((~((-1040049037) | iIdentityHashCode2)) | 762077184) * (-272)) + (((~(iIdentityHashCode2 | 1040049036)) | (-795768867)) * 272) + 322618130;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr[2])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{951024566, 723180419, -1554938762, 1092829632, -87201567, -122229171, 389514163, 1266183652, -1003601853, 1635693374}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step4).substring(23, 24).length() + 15, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{-1304755794, -154835792, -1118831046, -793035772, 792108236, -1003625070, -1924478549, -1540599712, -1757161447, -112860329}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step6).substring(6, 7).length() + 15, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-111393119};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.argb(0, 0, 0, 0) + 1134, 17 - Process.getGidForName(""), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 322618130, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int mirror = AndroidCharacter.getMirror('0') + 983;
                int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 15;
                Object[] objArr25 = new Object[1];
                c($$a[28], (short) 140, (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(packedPositionGroup, mirror, iIndexOf3, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 45993), TextUtils.getOffsetBefore("", 0) + 1117, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b9 = $$a[7];
                byte b10 = b9;
                Object[] objArr26 = new Object[1];
                c(b10, (short) (b10 | 192), b9, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(doubleTapTimeout, threadPriority, scrollBarSize, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{1075392650, 945388966, -1114774056, 792951, 1186423565, 1857467119, 1859756091, 1712449305, -149132177, 503239834, 637008185, 1199431651, 157009436, -1005589254}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{309541779, -237071084, 74020956, 1307160446, 342628512, -2124652965, -916246799, -1118903558, -96976056, 539518161}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step4).substring(60, 62).length() + 13, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i32 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i33 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                    byte[] bArr6 = $$a;
                    byte b11 = bArr6[28];
                    short s6 = (short) (bArr6[12] + 1);
                    Object[] objArr29 = new Object[1];
                    c(b11, s6, (byte) (s6 | 16), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatTimeout, i32, i33, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1032;
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                    Object[] objArr30 = new Object[1];
                    c($$a[28], (short) 140, (byte) 52, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cArgb, iLastIndexOf, tapTimeout2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i34 = INotificationSideChannelDefault + 85;
                cancel = i34 % 128;
                int i35 = i34 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArr[1])[0];
        int i37 = ((int[]) objArr[3])[0];
        if (i37 == i36) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i38 = ((int[]) objArr[2])[0];
            int i39 = ((int[]) objArr[3])[0];
            int i40 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i41 = ~iIdentityHashCode3;
            int i42 = i38 + 1277449301 + (((~(558503511 | i41)) | (-802783682) | (~((-558503512) | iIdentityHashCode3))) * (-564)) + ((~(iIdentityHashCode3 | (-558366786))) * 1128) + (((~((-802783682) | i41)) | 136726) * 564);
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr31[2])[0] = i44 ^ (i44 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i45 = 0;
            while (i45 < strArr4.length) {
                int i46 = INotificationSideChannelDefault + 107;
                cancel = i46 % 128;
                if (i46 % 2 != 0) {
                    arrayList2.add(strArr4[i45]);
                    i45 += 35;
                } else {
                    arrayList2.add(strArr4[i45]);
                    i45++;
                }
            }
        }
        Toast.makeText((Context) null, i37 / (((i37 - 1) * i37) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i47 = ((int[]) objArr[2])[0];
        int i48 = ((int[]) objArr[3])[0];
        int i49 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i50 = ~iIdentityHashCode4;
        int i51 = i47 + (((((~(383603829 | i50)) | (~((-627884000) | iIdentityHashCode4))) | (~(i50 | 627883999))) * 959) - 181611214) + (((~(iIdentityHashCode4 | 627883999)) | (~(i50 | (-627884000))) | (~(383603829 | iIdentityHashCode4))) * 959);
        int i52 = (i51 << 13) ^ i51;
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr32[2])[0] = i53 ^ (i53 << 5);
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        cancelAll = new int[]{1052630749, 1055666389, -849406181, -1857080591, -984284094, -1581372918, 634705739, 1674740887, -255616908, -1816881703, 148610257, 1785889027, -469385143, -1384056466, -997140998, -1054023836, 1367867600, 304668032};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = defpackage.setRotationDegrees.$$c
            int r8 = r8 * 56
            int r8 = r8 + 66
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L29:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setRotationDegrees.$$e(byte, byte, int):java.lang.String");
    }
}
