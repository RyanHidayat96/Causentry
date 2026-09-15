package retrofit2;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
class Platform {
    private static final Platform PLATFORM;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private final boolean hasJava8Types;
    private final Constructor<MethodHandles.Lookup> lookupConstructor;
    private static final byte[] $$c = {36, -74, -79, -21};
    private static final int $$d = 190;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {51, -99, -8, -59, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 214;
    private static int d = 0;
    private static int asInterface = 1;
    private static int g = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 53 - r7
            int r6 = r6 * 3
            int r6 = r6 + 84
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = retrofit2.Platform.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.Platform.c(int, int, int, java.lang.Object[]):void");
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        PLATFORM = findPlatform();
        int i = g + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    static Platform get() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 103;
        d = i3 % 128;
        int i4 = i3 % 2;
        Platform platform = PLATFORM;
        int i5 = i2 + 49;
        d = i5 % 128;
        int i6 = i5 % 2;
        return platform;
    }

    private static Platform findPlatform() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            "Dalvik".equals(System.getProperty("java.vm.name"));
            throw null;
        }
        if (!"Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new Platform(true);
        }
        Android android2 = new Android();
        int i3 = d + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return android2;
    }

    Platform(boolean z) {
        this.hasJava8Types = z;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
                int i = d + 31;
                asInterface = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.lookupConstructor = declaredConstructor;
        int i4 = asInterface + 37;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    List<? extends CallAdapter.Factory> defaultCallAdapterFactories(Executor executor) {
        int i = 2 % 2;
        DefaultCallAdapterFactory defaultCallAdapterFactory = new DefaultCallAdapterFactory(executor);
        if (!this.hasJava8Types) {
            return Collections.singletonList(defaultCallAdapterFactory);
        }
        int i2 = d + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        List<? extends CallAdapter.Factory> listAsList = Arrays.asList(CompletableFutureCallAdapterFactory.INSTANCE, defaultCallAdapterFactory);
        int i4 = asInterface + 29;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return listAsList;
        }
        throw null;
    }

    int defaultCallAdapterFactoriesSize() {
        int i = 2 % 2;
        if (!this.hasJava8Types) {
            return 1;
        }
        int i2 = asInterface;
        int i3 = i2 + 21;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        d = i5 % 128;
        int i6 = i5 % 2;
        return 2;
    }

    List<? extends Converter.Factory> defaultConverterFactories() {
        int i = 2 % 2;
        int i2 = d + 111;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (!this.hasJava8Types) {
            return Collections.emptyList();
        }
        List<? extends Converter.Factory> listSingletonList = Collections.singletonList(OptionalConverterFactory.INSTANCE);
        int i3 = d + 89;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return listSingletonList;
        }
        throw null;
    }

    int defaultConverterFactoriesSize() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 41;
        d = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hasJava8Types;
        int i5 = i2 + 73;
        d = i5 % 128;
        int i6 = i5 % 2;
        return z ? 1 : 0;
    }

    boolean isDefaultMethod(Method method) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (!(!this.hasJava8Types)) {
            int i5 = i3 + 121;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                method.isDefault();
                throw null;
            }
            if (!(!method.isDefault())) {
                return true;
            }
        }
        int i6 = d + 33;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        int i = 2 % 2;
        int i2 = asInterface + 61;
        d = i2 % 128;
        int i3 = i2 % 2;
        Constructor<MethodHandles.Lookup> constructor = this.lookupConstructor;
        if (constructor != null) {
            lookup = constructor.newInstance(cls, -1);
        } else {
            lookup = MethodHandles.lookup();
            int i4 = asInterface + 117;
            d = i4 % 128;
            int i5 = i4 % 2;
        }
        Object objInvokeWithArguments = lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        int i6 = d + 93;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return objInvokeWithArguments;
    }

    static final class Android extends Platform {
        Android() {
            super(true);
        }

        @Override // retrofit2.Platform
        public final Executor defaultCallbackExecutor() {
            return new MainThreadExecutor();
        }

        @Override // retrofit2.Platform
        final Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT < 26) {
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            }
            return super.invokeDefaultMethod(method, cls, obj, objArr);
        }

        static final class MainThreadExecutor implements Executor {
            private final Handler handler = new Handler(Looper.getMainLooper());

            MainThreadExecutor() {
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.handler.post(runnable);
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i3 = 58224;
                int i4 = 0;
                while (i4 < 16) {
                    int i5 = $11 + 21;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[c];
                    int i7 = (c3 + i3) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                    int i8 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                        objArr2[2] = Integer.valueOf(i8);
                        objArr2[1] = Integer.valueOf(i7);
                        objArr2[c] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char tapTimeout = (char) (47773 - (ViewConfiguration.getTapTimeout() >> 16));
                            int iMyTid = 468 - (Process.myTid() >> 22);
                            int scrollBarSize = 13 - (ViewConfiguration.getScrollBarSize() >> 8);
                            Class[] clsArr = new Class[4];
                            clsArr[c] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, iMyTid, scrollBarSize, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i9 = i4;
                        Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 47774), KeyEvent.keyCodeFromString("") + 468, 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i3 -= 40503;
                        i4 = i9 + 1;
                        c = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getTrimmedLength(""), 2323 - (Process.myTid() >> 22), Color.blue(0) + 44, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                objArr[0] = new String(cArr2, 0, i);
                int i10 = $10 + 103;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
        }
    }

    Executor defaultCallbackExecutor() throws Throwable {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 40, ((Process.getThreadPriority(0) + 20) >> 6) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new char[]{26160, 20324, 52180, 28891, 22228, 53953, 39692, 58953, 27538, 23707, 24815, 21121, 15398, 61711, 23505, 63578, 50812, 1166, 1642, 233, 39674, 39990, 46459, 18061}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{3867, 54018, 58707, 58526, '`', 39874, 54063, 50153, 8837, 33694, 5849, 48234, 57828, 43466, 32519, 34988, 3080, 44878}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -919;
        long j2 = (j * 4300139260799534974L) + (j * (-2202882086057575987L));
        long j3 = 920;
        long j4 = -1;
        long j5 = j4 ^ 4300139260799534974L;
        long j6 = j4 ^ (-2202882086057575987L);
        long j7 = j5 | j6;
        long jIdentityHashCode = System.identityHashCode(this);
        long j8 = jIdentityHashCode ^ j4;
        long j9 = j2 + ((((j7 | jIdentityHashCode) ^ j4) | (((j6 | j8) | 4300139260799534974L) ^ j4)) * j3) + (((j7 ^ j4) | ((j5 | j8) ^ j4)) * j3) + (j3 * (((j7 | j8) ^ j4) | (((j5 | (-2202882086057575987L)) | jIdentityHashCode) ^ j4) | ((jIdentityHashCode | (j6 | 4300139260799534974L)) ^ j4)));
        for (int i3 = 0; i3 != 10; i3++) {
            int i4 = asInterface + 103;
            d = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), AndroidCharacter.getMirror('0') + 11, View.resolveSize(0, 0) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            int i7 = 0;
            long j10 = jLongValue;
            while (true) {
                for (int i8 = 0; i8 != 8; i8++) {
                    i6 = (((((int) (j10 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                }
                if (i7 != 0) {
                    break;
                }
                i7++;
                j10 = j9;
            }
            if (i6 == i2) {
                return null;
            }
            jLongValue -= 1024;
        }
        Object[] objArr3 = new Object[1];
        a(new char[]{11824, 47127, 30297, 56974, 790, 65240, 57707, 43242, 13731, 23651, 40845, 6436, 44568, 44204, 51554, 41924, 1531, 22986}, 16 - KeyEvent.getDeadChar(0, 0), objArr3);
        Class<?> cls2 = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(new char[]{23737, 36737, 7879, 61462, 54629, 57765, 7795, 56470, 32457, 26717, 1498, 47166, 61595, 28860, 23797, 30495, 17756, 55927}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, objArr4);
        int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
        try {
            Object[] objArr5 = {247222810};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1135, (ViewConfiguration.getPressedStateDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1394332291, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cRed = (char) Color.red(0);
                int gidForName = Process.getGidForName("") + 1032;
                int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr7 = new Object[1];
                c(b2, b3, b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, gidForName, trimmedLength, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - MotionEvent.axisFromString("")), ((byte) KeyEvent.getModifierMetaStateMask()) + 1118, 16 - ExpandableListView.getPackedPositionChild(0L)), Boolean.TYPE});
            }
            Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
            if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr8[0];
            if (strArr != null) {
                int i9 = asInterface + 31;
                d = i9 % 128;
                int i10 = i9 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = (char) 40358;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 45923;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 52742;
        TuitionPaymentFragmentbindingInflater1 = (char) 5752;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, short r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 108 - r7
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r0 = retrofit2.Platform.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.Platform.$$e(int, short, int):java.lang.String");
    }
}
