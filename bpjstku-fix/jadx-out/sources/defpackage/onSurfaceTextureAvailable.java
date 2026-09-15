package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.Subscribe;

/* JADX INFO: loaded from: classes4.dex */
final class onSurfaceTextureAvailable {
    private static final Map<Class<?>, List<onSurfaceTextureDestroyed>> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ConcurrentHashMap();
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault2[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2[4];
    private final boolean TuitionPaymentFragmentbindingInflater1;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private List<ZoomGestureDetector> b;

    onSurfaceTextureAvailable(List<ZoomGestureDetector> list, boolean z, boolean z2) {
        this.b = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        this.TuitionPaymentFragmentbindingInflater1 = z2;
    }

    final List<onSurfaceTextureDestroyed> TuitionPaymentFragmentbindingInflater1(Class<?> cls) throws Throwable {
        List<onSurfaceTextureDestroyed> listTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Map<Class<?>, List<onSurfaceTextureDestroyed>> map = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        List<onSurfaceTextureDestroyed> list = map.get(cls);
        if (list != null) {
            return list;
        }
        if (this.TuitionPaymentFragmentbindingInflater1) {
            listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(cls);
        } else {
            listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls);
        }
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
            StringBuilder sb = new StringBuilder("Subscriber ");
            sb.append(cls);
            sb.append(" and its super classes have no public methods with the @Subscribe annotation");
            throw new EventBusException(sb.toString());
        }
        map.put(cls, listTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return listTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[EDGE_INSN: B:20:0x0044->B:21:0x0045 BREAK  A[LOOP:2: B:15:0x002e->B:40:?]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:2: B:15:0x002e->B:40:?, LOOP_END, SYNTHETIC] */
    private List<onSurfaceTextureDestroyed> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<?> cls) throws Throwable {
        List<ZoomGestureDetector> list;
        lambdaonSurfaceTextureUpdated0 lambdaonsurfacetextureupdated0B;
        Iterator<ZoomGestureDetector> it;
        lambdaonSurfaceTextureUpdated0 lambdaonsurfacetextureupdated0B2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(cls);
        while (tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.d != null && tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.d.b() != null) {
                lambdaonsurfacetextureupdated0B = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.d.b();
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != lambdaonsurfacetextureupdated0B.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    list = this.b;
                    if (list != null) {
                        lambdaonsurfacetextureupdated0B = null;
                        break;
                    }
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            lambdaonsurfacetextureupdated0B = null;
                            break;
                        }
                        ZoomGestureDetector next = it.next();
                        Class<?> cls2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        lambdaonsurfacetextureupdated0B2 = next.b();
                        if (lambdaonsurfacetextureupdated0B2 != null) {
                            lambdaonsurfacetextureupdated0B = lambdaonsurfacetextureupdated0B2;
                            break;
                        }
                    }
                }
            } else {
                list = this.b;
                if (list != null) {
                    lambdaonsurfacetextureupdated0B = null;
                    break;
                }
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        lambdaonsurfacetextureupdated0B = null;
                        break;
                    }
                    ZoomGestureDetector next2 = it.next();
                    Class<?> cls3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    lambdaonsurfacetextureupdated0B2 = next2.b();
                    if (lambdaonsurfacetextureupdated0B2 != null) {
                        lambdaonsurfacetextureupdated0B = lambdaonsurfacetextureupdated0B2;
                        break;
                    }
                }
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.d = lambdaonsurfacetextureupdated0B;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.d != null) {
                for (onSurfaceTextureDestroyed onsurfacetexturedestroyed : tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onsurfacetexturedestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault3, onsurfacetexturedestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder.add(onsurfacetexturedestroyed);
                    }
                }
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    private static List<onSurfaceTextureDestroyed> TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        ArrayList arrayList = new ArrayList(tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder);
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder.clear();
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b.clear();
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.g.clear();
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setLength(0);
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 = false;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.d = null;
        synchronized (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            for (int i = 0; i < 4; i++) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[] tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr[i] == null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr[i] = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    break;
                }
            }
        }
        return arrayList;
    }

    private static TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        synchronized (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            for (int i = 0; i < 4; i++) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[] tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr[i];
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr[i] = null;
                    return tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    private List<onSurfaceTextureDestroyed> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<?> cls) throws Throwable {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(cls);
        while (tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        String string;
        Method[] methods;
        try {
            try {
                methods = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getDeclaredMethods();
            } catch (LinkageError e2) {
                StringBuilder sb = new StringBuilder("Could not inspect methods of ");
                sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getName());
                String string2 = sb.toString();
                if (this.TuitionPaymentFragmentbindingInflater1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string2);
                    sb2.append(". Please consider using EventBus annotation processor to avoid reflection.");
                    string = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(string2);
                    sb3.append(". Please make this class visible to EventBus annotation processor to avoid reflection.");
                    string = sb3.toString();
                }
                throw new EventBusException(string, e2);
            }
        } catch (Throwable unused) {
            methods = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getMethods();
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                    if (subscribe != null) {
                        Class<?> cls = parameterTypes[0];
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(method, cls)) {
                            tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder.add(new onSurfaceTextureDestroyed(method, cls, subscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), subscribe.TuitionPaymentFragmentbindingInflater1(), subscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
                        }
                    }
                } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && method.isAnnotationPresent(Subscribe.class)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(method.getDeclaringClass().getName());
                    sb4.append(".");
                    sb4.append(method.getName());
                    String string3 = sb4.toString();
                    StringBuilder sb5 = new StringBuilder("@Subscribe method ");
                    sb5.append(string3);
                    sb5.append("must have exactly 1 parameter but has ");
                    sb5.append(parameterTypes.length);
                    throw new EventBusException(sb5.toString());
                }
            } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && method.isAnnotationPresent(Subscribe.class)) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(method.getDeclaringClass().getName());
                sb6.append(".");
                sb6.append(method.getName());
                String string4 = sb6.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(string4);
                sb7.append(" is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                throw new EventBusException(sb7.toString());
            }
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        boolean TuitionPaymentFragmentbindingInflater1;
        Class<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Class<?> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        lambdaonSurfaceTextureUpdated0 d;
        private static final byte[] $$c = {74, 60, 122, -26};
        private static final int $$f = 104;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {41, 2, 45, -60, 10, -61, 72, -9, 0, 6, 21, -7, 17, -13, 23, -70, 63, 9, 10, -11, 17, 0, -9, 15, -58, 69, 5, -7, 17, -13, 23, -1, 7, 5, -65, 69, -9, 21, -10, 17, 8, -17, 5, 14, -3, -51, 37, 23, 21, -10, 17, 8, -17, 5, 14, -3, -30, 48, 3, -7, 2, 23, -35, 24, 19, -72, 51, 32, 10, 1, -11, 6, -18, 23, 21, -10, 17, 8, -13, 17};
        private static final int $$e = 201;
        private static final byte[] $$a = {73, 55, 58, 33, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
        private static final int $$b = 83;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1312a = 0;
        private static int onTransact = 1;
        private static int[] asInterface = {-1366542703, -532875361, 1109492811, -8543478, -987251245, -1851297682, -653396712, 430467031, 1377270833, 1180658336, 566596517, 674477799, -1813928366, 1677059033, 1356400992, 1670813994, 1788138006, -1145802937};
        final List<onSurfaceTextureDestroyed> asBinder = new ArrayList();
        final Map<Class, Object> b = new HashMap();
        final Map<String, Class> g = new HashMap();
        final StringBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new StringBuilder(128);

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = onSurfaceTextureAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                int r5 = r5 * 3
                int r5 = r5 + 97
                int r6 = r6 * 10
                int r6 = 14 - r6
                int r1 = 11 - r7
                byte[] r1 = new byte[r1]
                int r7 = 10 - r7
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r6
                r5 = r7
                r3 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r7) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L25:
                int r3 = r3 + 1
                r4 = r0[r6]
            L29:
                int r6 = r6 + 1
                int r5 = r5 + r4
                int r5 = r5 + (-5)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: onSurfaceTextureAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.c(int, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(int r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 76
                int r6 = 80 - r6
                byte[] r0 = onSurfaceTextureAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r7 = r7 * 76
                int r1 = 77 - r7
                int r8 = r8 * 7
                int r8 = 105 - r8
                byte[] r1 = new byte[r1]
                int r7 = 76 - r7
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2e
            L19:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L1d:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2c:
                r3 = r0[r8]
            L2e:
                int r6 = r6 + r3
                int r6 = r6 + (-4)
                int r8 = r8 + 1
                r3 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: onSurfaceTextureAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f(int, byte, short, java.lang.Object[]):void");
        }

        private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = asInterface;
            int i4 = -1870535734;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int i7 = $10 + 53;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $10 + 121;
                    $11 = i10 % 128;
                    if (i10 % i2 == 0) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i6] = Integer.valueOf(iArr2[i9]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) 1;
                                byte b2 = (byte) (b - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getTrimmedLength(""), Color.red(i6) + 3291, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                            }
                            iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 1;
                            byte b4 = (byte) (b3 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3290, 31 - View.MeasureSpec.getSize(0), 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i9++;
                    }
                    i2 = 2;
                    i4 = -1870535734;
                    i6 = 0;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = asInterface;
            long j = 0;
            if (iArr5 != null) {
                int i11 = $11 + 99;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i13 = 0;
                while (i13 < length3) {
                    try {
                        Object[] objArr4 = new Object[i5];
                        objArr4[0] = Integer.valueOf(iArr5[i13]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int i14 = (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 3290;
                            int i15 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 30;
                            byte b5 = (byte) 1;
                            byte b6 = (byte) (b5 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, i14, i15, 1948206109, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        i13++;
                        iArr5 = iArr5;
                        j = 0;
                        i5 = 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr5 = iArr6;
            }
            char c = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i16 = 17;
                for (int i17 = 1; i16 > i17; i17 = 1) {
                    int i18 = $11 + 69;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2559, 29 - ExpandableListView.getPackedPositionGroup(0L), 683220507, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i16--;
                }
                int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28878 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf("", "", 0, 0) + 348, 25 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
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

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        /* JADX WARN: Type inference failed for: r0v46, types: [boolean, int] */
        final void TuitionPaymentFragmentbindingInflater1(Class<?> cls) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = onTransact + 33;
            f1312a = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cls;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cls;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int defaultSize = View.getDefaultSize(0, 0) + 876;
                int iArgb = Color.argb(0, 0, 0, 0) + 10;
                byte b = $$a[11];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                c(b2, (byte) (b2 + 1), b, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, defaultSize, iArgb, -1199417970, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new int[]{595284370, -1034779840, 1989061677, 1970486803, 1588240926, -274332665, 651217671, 388076235, 1784628504, 915655981, -836016256, -1294923181, -1832383171, 897439469}, MotionEvent.axisFromString("") + 23, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new int[]{1032847611, 1534161120, -898235372, -1388875511, -819157362, -1097062161, -2031416604, -383611914, -1939424294, 1608490321}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, objArr4);
            long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0', 0);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                byte b3 = (byte) ($$b & 5);
                byte[] bArr = $$a;
                Object[] objArr5 = new Object[1];
                c(b3, bArr[11], bArr[17], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, iLastIndexOf, modifierMetaStateMask, 254769921, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int gidForName = Process.getGidForName("") + 877;
                    int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
                    byte b4 = $$a[11];
                    byte b5 = b4;
                    Object[] objArr6 = new Object[1];
                    c(b4, b5, (byte) (b5 + 3), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, gidForName, iNormalizeMetaState, 1324201839, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = (((114271668 + ((((~(753116852 | iIdentityHashCode)) | 35393611) | (~((-712806624) | iIdentityHashCode))) * (-744))) + (((~iIdentityHashCode) | 75703840) * 744)) + ((iIdentityHashCode | (-35393612)) * 744)) - 1440488916;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(new int[]{-833576218, -715207093, -1492828708, 1390296615, -146151142, -374425768, 1677833826, 356173003, -210681770, -1204315881}, TextUtils.getTrimmedLength("") + 16, objArr8);
                Class<?> cls3 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new int[]{-1394765361, -766042840, -1968999227, -16157522, -1993798940, 177475718, -1681109916, 1254007298, 627463928, -1401435254}, TextUtils.indexOf("", "") + 16, objArr9);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                int i7 = f1312a + 53;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr10 = {Integer.valueOf(iIntValue), -1440488916};
                    byte[] bArr2 = $$d;
                    byte b6 = bArr2[69];
                    byte b7 = bArr2[8];
                    Object[] objArr11 = new Object[1];
                    f(b6, b7, b7, objArr11);
                    Class<?> cls4 = Class.forName((String) objArr11[0]);
                    byte b8 = bArr2[8];
                    byte b9 = bArr2[69];
                    Object[] objArr12 = new Object[1];
                    f(b8, b9, b9, objArr12);
                    objArr = (Object[]) cls4.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                        int i9 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                        int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0');
                        byte b10 = $$a[11];
                        byte b11 = b10;
                        Object[] objArr13 = new Object[1];
                        c(b10, b11, (byte) (b11 + 3), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i9, iLastIndexOf2, 1324201839, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        e(new int[]{595284370, -1034779840, 1989061677, 1970486803, 1588240926, -274332665, 651217671, 388076235, 1784628504, 915655981, -836016256, -1294923181, -1832383171, 897439469}, KeyEvent.normalizeMetaState(0) + 22, objArr14);
                        Class<?> cls5 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        e(new int[]{1032847611, 1534161120, -898235372, -1388875511, -819157362, -1097062161, -2031416604, -383611914, -1939424294, 1608490321}, 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr15);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                            int iMyPid = (Process.myPid() >> 22) + 876;
                            int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                            byte b12 = (byte) ($$b & 5);
                            byte[] bArr3 = $$a;
                            Object[] objArr16 = new Object[1];
                            c(b12, bArr3[11], bArr3[17], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iMyPid, deadChar, 254769921, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
                            int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                            byte b13 = $$a[11];
                            byte b14 = b13;
                            Object[] objArr17 = new Object[1];
                            c(b14, (byte) (b14 + 1), b13, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, iResolveSizeAndState, i10, -1199417970, false, (String) objArr17[0], null);
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
            int i11 = ((int[]) objArr[2])[0];
            int i12 = ((int[]) objArr[0])[0];
            if (i12 != i11) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    int i13 = f1312a + 27;
                    onTransact = i13 % 128;
                    int i14 = i13 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i12));
            }
            int i15 = ((int[]) objArr[1])[0];
            Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = ~iIdentityHashCode2;
            int i17 = i15 + (-810060588) + ((17203202 | i16) * (-192)) + (((~(521121862 | i16)) | 544228889) * (-384)) + (((~(iIdentityHashCode2 | (-503918661))) | (~(i16 | 1065350751)) | (~((-544228890) | iIdentityHashCode2))) * DerHeader.TAG_CLASS_PRIVATE);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            Object obj = objArr18[1];
            ((int[]) obj)[0] = i19 ^ (i19 << 5);
            int i20 = ((int[]) obj)[0];
            int i21 = i20 * i20;
            int i22 = -(1370315133 * i20);
            int i23 = ((((i21 | i22) << 1) - (i21 ^ i22)) - (~(-(i20 * (-13377833))))) - 1;
            int i24 = (i23 ^ 604190436) + ((604190436 & i23) << 1);
            int i25 = (((i24 >> 20) - 8191) / 4096) + 1;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            int i27 = i24 >> 27;
            int i28 = (((i27 | (-63)) << 1) - (i27 ^ (-63))) / 32;
            int i29 = -((((i28 | 1) << 1) - (i28 ^ 1)) ^ i26);
            int i30 = ((i29 | 5) << 1) - (i29 ^ 5);
            int i31 = i30 >> 24;
            int i32 = (((i31 | (-511)) << 1) - (i31 ^ (-511))) / 256;
            this.TuitionPaymentFragmentbindingInflater1 = 0 / (((-(((i32 & 1) + (i32 | 1)) + 1)) & i30) * 941);
            this.d = null;
            int i33 = f1312a + 101;
            onTransact = i33 % 128;
            if (i33 % 2 == 0) {
                int i34 = 63 / 0;
            }
        }

        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Method method, Class<?> cls) {
            int i = 2 % 2;
            Object objPut = this.b.put(cls, method);
            if (objPut == null) {
                int i2 = onTransact + 61;
                f1312a = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (objPut instanceof Method) {
                int i4 = f1312a + 71;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                int i6 = onTransact + 111;
                f1312a = i6 % 128;
                int i7 = i6 % 2;
                this.b.put(cls, this);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(method, cls);
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Method method, Class<?> cls) {
            int i = 2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setLength(0);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.append(method.getName());
            StringBuilder sb = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            sb.append(Typography.greater);
            sb.append(cls.getName());
            String string = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class clsPut = this.g.put(string, declaringClass);
            if (clsPut != null) {
                int i2 = f1312a + 59;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                if (!clsPut.isAssignableFrom(declaringClass)) {
                    this.g.put(string, clsPut);
                    int i4 = f1312a + 41;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
            }
            return true;
        }

        final void TuitionPaymentFragmentbindingInflater1() {
            int i = 2 % 2;
            int i2 = f1312a + 69;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            if (this.TuitionPaymentFragmentbindingInflater1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                return;
            }
            Class<? super Object> superclass = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getSuperclass();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = superclass;
            String name = superclass.getName();
            if ((!name.startsWith("java.")) && (!name.startsWith("javax."))) {
                int i4 = onTransact + 59;
                f1312a = i4 % 128;
                if (i4 % 2 == 0) {
                    if (!name.startsWith("android.") && !name.startsWith("androidx.")) {
                        return;
                    }
                } else {
                    name.startsWith("android.");
                    obj.hashCode();
                    throw null;
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            int i5 = f1312a + 3;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r7, int r8, byte r9) {
            /*
                int r7 = r7 * 56
                int r7 = 122 - r7
                int r9 = r9 * 4
                int r9 = 1 - r9
                int r8 = r8 * 4
                int r8 = 3 - r8
                byte[] r0 = onSurfaceTextureAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r7 = r9
                r5 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                int r8 = r8 + 1
                if (r5 != r9) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L27:
                r3 = r0[r8]
                r6 = r3
                r3 = r8
                r8 = r6
            L2c:
                int r8 = -r8
                int r7 = r7 + r8
                r8 = r3
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: onSurfaceTextureAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(byte, int, byte):java.lang.String");
        }
    }
}
