package retrofit2;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.io.encoding.Base64;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class Retrofit {
    final HttpUrl baseUrl;
    final List<CallAdapter.Factory> callAdapterFactories;
    final okhttp3.Call.Factory callFactory;
    final Executor callbackExecutor;
    final List<Converter.Factory> converterFactories;
    private final Map<Method, ServiceMethod<?>> serviceMethodCache = new ConcurrentHashMap();
    final boolean validateEagerly;
    private static final byte[] $$c = {90, 46, 113, 8};
    private static final int $$f = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {80, -8, 43, 65, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 58, 5, 11, -11, -1, 1, 20, -12, -53, 55, 17, -15, 20, -9, 6, 15, -3, -9, -4, 18, -67, Base64.padSymbol, 7, 8, -13, 15, -2, -11, 13, -60, 66, -7, 17, 5, -6, 5, -5, -59, 28, 46, 2, -2, -39, 32, 17, -32, 21, 14, 6, -14, 16, 3};
    private static final int $$e = 60;
    private static final byte[] $$a = {67, -127, -109, 9, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 230;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 9184650459780083515L;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 53 - r6
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = retrofit2.Retrofit.$$a
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-10)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.Retrofit.a(short, short, byte, java.lang.Object[]):void");
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
    private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 62
            int r8 = r8 + 4
            int r7 = r7 * 62
            int r7 = 63 - r7
            int r9 = 99 - r9
            byte[] r0 = retrofit2.Retrofit.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
        L2a:
            int r8 = r8 + r3
            int r8 = r8 + (-2)
            int r9 = r9 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.Retrofit.c(int, byte, int, java.lang.Object[]):void");
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 117;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 59;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.getDefaultSize(0, 0) + 1356, ((Process.getThreadPriority(0) + 20) >> 6) + 38, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), MotionEvent.axisFromString("") + 469, KeyEvent.getDeadChar(0, 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    Retrofit(okhttp3.Call.Factory factory, HttpUrl httpUrl, List<Converter.Factory> list, List<CallAdapter.Factory> list2, Executor executor, boolean z) {
        this.callFactory = factory;
        this.baseUrl = httpUrl;
        this.converterFactories = list;
        this.callAdapterFactories = list2;
        this.callbackExecutor = executor;
        this.validateEagerly = z;
    }

    public final <T> T create(final Class<T> cls) {
        int i = 2 % 2;
        validateServiceInterface(cls);
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: retrofit2.Retrofit.1
            private final Platform platform = Platform.get();
            private final Object[] emptyArgs = new Object[0];

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.emptyArgs;
                }
                if (this.platform.isDefaultMethod(method)) {
                    return this.platform.invokeDefaultMethod(method, cls, obj, objArr);
                }
                return Retrofit.this.loadServiceMethod(method).invoke(objArr);
            }
        });
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return t;
    }

    private void validateServiceInterface(Class<?> cls) {
        Platform platform;
        Method[] declaredMethods;
        int length;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    int i4 = TuitionPaymentFragmentbindingInflater1 + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    int i5 = i4 % 2;
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.validateEagerly) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 == 0) {
                platform = Platform.get();
                declaredMethods = cls.getDeclaredMethods();
                length = declaredMethods.length;
            } else {
                platform = Platform.get();
                declaredMethods = cls.getDeclaredMethods();
                length = declaredMethods.length;
            }
            for (int i7 = 0; i7 < length; i7++) {
                Method method = declaredMethods[i7];
                if (!platform.isDefaultMethod(method) && (!Modifier.isStatic(method.getModifiers()))) {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
                    TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                    int i9 = i8 % 2;
                    loadServiceMethod(method);
                }
            }
        }
        int i10 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
        int i11 = i10 % 2;
    }

    final ServiceMethod<?> loadServiceMethod(Method method) {
        ServiceMethod<?> annotations;
        ServiceMethod<?> serviceMethod = this.serviceMethodCache.get(method);
        if (serviceMethod != null) {
            return serviceMethod;
        }
        synchronized (this.serviceMethodCache) {
            annotations = this.serviceMethodCache.get(method);
            if (annotations == null) {
                annotations = ServiceMethod.parseAnnotations(this, method);
                this.serviceMethodCache.put(method, annotations);
            }
        }
        return annotations;
    }

    public static final class Builder {
        private HttpUrl baseUrl;
        private final List<CallAdapter.Factory> callAdapterFactories;
        private okhttp3.Call.Factory callFactory;
        private Executor callbackExecutor;
        private final List<Converter.Factory> converterFactories;
        private final Platform platform;
        private boolean validateEagerly;

        Builder(Platform platform) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            this.platform = platform;
        }

        public Builder() {
            this(Platform.get());
        }

        Builder(Retrofit retrofit) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            Platform platform = Platform.get();
            this.platform = platform;
            this.callFactory = retrofit.callFactory;
            this.baseUrl = retrofit.baseUrl;
            int size = retrofit.converterFactories.size();
            int iDefaultConverterFactoriesSize = platform.defaultConverterFactoriesSize();
            for (int i = 1; i < size - iDefaultConverterFactoriesSize; i++) {
                this.converterFactories.add(retrofit.converterFactories.get(i));
            }
            int size2 = retrofit.callAdapterFactories.size();
            int iDefaultCallAdapterFactoriesSize = this.platform.defaultCallAdapterFactoriesSize();
            for (int i2 = 0; i2 < size2 - iDefaultCallAdapterFactoriesSize; i2++) {
                this.callAdapterFactories.add(retrofit.callAdapterFactories.get(i2));
            }
            this.callbackExecutor = retrofit.callbackExecutor;
            this.validateEagerly = retrofit.validateEagerly;
        }

        public final Builder client(OkHttpClient okHttpClient) {
            return callFactory((okhttp3.Call.Factory) Objects.requireNonNull(okHttpClient, "client == null"));
        }

        public final Builder callFactory(okhttp3.Call.Factory factory) {
            this.callFactory = (okhttp3.Call.Factory) Objects.requireNonNull(factory, "factory == null");
            return this;
        }

        public final Builder baseUrl(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return baseUrl(HttpUrl.get(url.toString()));
        }

        public final Builder baseUrl(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return baseUrl(HttpUrl.get(str));
        }

        public final Builder baseUrl(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> listPathSegments = httpUrl.pathSegments();
            if (!"".equals(listPathSegments.get(listPathSegments.size() - 1))) {
                throw new IllegalArgumentException("baseUrl must end in /: ".concat(String.valueOf(httpUrl)));
            }
            this.baseUrl = httpUrl;
            return this;
        }

        public final Builder addConverterFactory(Converter.Factory factory) {
            this.converterFactories.add((Converter.Factory) Objects.requireNonNull(factory, "factory == null"));
            return this;
        }

        public final Builder addCallAdapterFactory(CallAdapter.Factory factory) {
            this.callAdapterFactories.add((CallAdapter.Factory) Objects.requireNonNull(factory, "factory == null"));
            return this;
        }

        public final Builder callbackExecutor(Executor executor) {
            this.callbackExecutor = (Executor) Objects.requireNonNull(executor, "executor == null");
            return this;
        }

        public final List<CallAdapter.Factory> callAdapterFactories() {
            return this.callAdapterFactories;
        }

        public final List<Converter.Factory> converterFactories() {
            return this.converterFactories;
        }

        public final Builder validateEagerly(boolean z) {
            this.validateEagerly = z;
            return this;
        }

        public final Retrofit build() throws Throwable {
            if (this.baseUrl == null) {
                throw new IllegalStateException("Base URL required.");
            }
            okhttp3.Call.Factory okHttpClient = this.callFactory;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            okhttp3.Call.Factory factory = okHttpClient;
            Executor executorDefaultCallbackExecutor = this.callbackExecutor;
            if (executorDefaultCallbackExecutor == null) {
                executorDefaultCallbackExecutor = this.platform.defaultCallbackExecutor();
            }
            Executor executor = executorDefaultCallbackExecutor;
            ArrayList arrayList = new ArrayList(this.callAdapterFactories);
            arrayList.addAll(this.platform.defaultCallAdapterFactories(executor));
            ArrayList arrayList2 = new ArrayList(this.converterFactories.size() + 1 + this.platform.defaultConverterFactoriesSize());
            arrayList2.add(new BuiltInConverters());
            arrayList2.addAll(this.converterFactories);
            arrayList2.addAll(this.platform.defaultConverterFactories());
            return new Retrofit(factory, this.baseUrl, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.validateEagerly);
        }
    }

    public final okhttp3.Call.Factory callFactory() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
            int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
            int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 52, bArr[7], bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i4, iKeyCodeFromString, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{7793, 7696, 40746, 64905, 46712, 39449, 63319, 42525, 2922, 34194, 56771, 37853, 13558, 44828, 51205, 36052, 24148, 56032, 46827, 58990, 19404, 50244, 40303, 54256, 30038, 61408}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{36091, 35998, 11378, 9783, 36096, 10563, 11500, 40295, 39420, 14022, 1661, 43225, 42614, 7254, 5113, 46987, 52430, 27046, 27972}, 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31534 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int defaultSize = 921 - View.getDefaultSize(0, 0);
            int edgeSlop = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr2 = $$a;
            byte b = bArr2[80];
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, defaultSize, edgeSlop, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                int iGreen = 28 - Color.green(0);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (-bArr3[33]), bArr3[80], bArr3[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i5, iGreen, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = ~i6;
            int i8 = (-1649470049) + (((~(718541479 | i7)) | 338307408) * (-108)) + (((~(i7 | 1055538164)) | (~((-1055538165) | i6)) | 1310723) * 54) + ((i6 | 1310723) * 54) + 1388888408;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{45893, 45860, 39097, 41902, 64441, 40330, 43376, 60380, 42590, 33281, 33764, 56860, 39372, 43148, 38524, 49512, 62296, 56675, 59596, 43939, 59107, 50173, 50000, 40487, 55381, 59504, 54818, 32903, 13212, 7880}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{60675, 60768, 62779, 63146, 5757, 61459, 64610, 1560, 63506, 61316, 55024, 13239, 51099, 50446, 50020, 11499, 44348, 45283, 48584, 18023, 47292, 44664}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i13 = TuitionPaymentFragmentbindingInflater1 + 91;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                    int i14 = i13 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            b(new char[]{6781, 6679, 15130, 23353, 29088, 15910, 20981, 25046, 3879, 8615, 31606, 21573, 12530, 2929, 28360, 19238, 23122, 32471, 4170, 8638}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(new char[]{61673, 61568, 49143, 64497, 43955, 47822, 61742, 48074, 58857, 42319, 56235, 36417, 55881, 36819, 52768, 37156, 45302, 64033, 45187, 64421}, 1 - Color.alpha(0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
            TuitionPaymentFragmentbindingInflater1 = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1388888408};
                byte[] bArr4 = $$d;
                byte b3 = bArr4[5];
                byte b4 = b3;
                Object[] objArr13 = new Object[1];
                c(b3, b4, b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr4[19];
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                c(b5, b6, b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int edgeSlop2 = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int iResolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr16 = new Object[1];
                    a((byte) (-bArr5[33]), bArr5[80], bArr5[7], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, edgeSlop2, iResolveSizeAndState, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    b(new char[]{7793, 7696, 40746, 64905, 46712, 39449, 63319, 42525, 2922, 34194, 56771, 37853, 13558, 44828, 51205, 36052, 24148, 56032, 46827, 58990, 19404, 50244, 40303, 54256, 30038, 61408}, 1 - View.combineMeasuredStates(0, 0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    b(new char[]{36091, 35998, 11378, 9783, 36096, 10563, 11500, 40295, 39420, 14022, 1661, 43225, 42614, 7254, 5113, 46987, 52430, 27046, 27972}, TextUtils.getOffsetBefore("", 0) + 1, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int i17 = 922 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i18 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr6 = $$a;
                        byte b7 = bArr6[80];
                        byte b8 = bArr6[7];
                        Object[] objArr19 = new Object[1];
                        a(b7, b8, b8, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i17, i18, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
                        int i19 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
                        int touchSlop = 28 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte[] bArr7 = $$a;
                        Object[] objArr20 = new Object[1];
                        a((byte) 52, bArr7[7], bArr7[80], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, i19, touchSlop, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i20 = ((int[]) objArr[1])[0];
        int i21 = ((int[]) objArr[3])[0];
        if (i21 == i20) {
            int i22 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt();
            int i23 = ~iNextInt;
            int i24 = ~((-48957837) | i23);
            int i25 = ~((-1725121808) | iNextInt);
            int i26 = i22 + (-414465930) + ((i24 | i25) * 1150) + (((~(1725121807 | i23)) | i25) * (-575)) + (((~(iNextInt | (-48957837))) | (~(i23 | 48957836))) * 575);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr21[0])[0] = i28 ^ (i28 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                TuitionPaymentFragmentbindingInflater1 = i29 % 128;
                int i30 = i29 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
            int i31 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i32 = ~System.identityHashCode(this);
            int i33 = i31 + 1958420497 + (((-37552394) | i32) * 494) + (((~(i32 | 901839602)) | (-104704348)) * 494);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr22[0])[0] = i35 ^ (i35 << 5);
        }
        return this.callFactory;
    }

    public final HttpUrl baseUrl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HttpUrl httpUrl = this.baseUrl;
        int i4 = i3 + 73;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return httpUrl;
    }

    public final List<CallAdapter.Factory> callAdapterFactories() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<CallAdapter.Factory> list = this.callAdapterFactories;
        int i4 = i3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final CallAdapter<?, ?> callAdapter(Type type, Annotation[] annotationArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        CallAdapter<?, ?> callAdapterNextCallAdapter = nextCallAdapter(null, type, annotationArr);
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return callAdapterNextCallAdapter;
    }

    public final CallAdapter<?, ?> nextCallAdapter(CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        int iIndexOf;
        int size;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            Objects.requireNonNull(type, "returnType == null");
            Objects.requireNonNull(annotationArr, "annotations == null");
            iIndexOf = this.callAdapterFactories.indexOf(factory);
            size = this.callAdapterFactories.size();
        } else {
            Objects.requireNonNull(type, "returnType == null");
            Objects.requireNonNull(annotationArr, "annotations == null");
            iIndexOf = this.callAdapterFactories.indexOf(factory) + 1;
            size = this.callAdapterFactories.size();
        }
        for (int i3 = iIndexOf; i3 < size; i3++) {
            CallAdapter<?, ?> callAdapter = this.callAdapterFactories.get(i3).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i4 = 0; i4 < iIndexOf; i4++) {
                sb.append("\n   * ");
                sb.append(this.callAdapterFactories.get(i4).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.callAdapterFactories.size();
        while (iIndexOf < size2) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                sb.append("\n   * ");
                sb.append(this.callAdapterFactories.get(iIndexOf).getClass().getName());
                iIndexOf += 32;
            } else {
                sb.append("\n   * ");
                sb.append(this.callAdapterFactories.get(iIndexOf).getClass().getName());
                iIndexOf++;
            }
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final List<Converter.Factory> converterFactories() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.converterFactories;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <T> Converter<T, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
        }
        nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
        obj.hashCode();
        throw null;
    }

    public final <T> Converter<T, RequestBody> nextRequestBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        int i = 2 % 2;
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i2 = iIndexOf; i2 < size; i2++) {
            Converter<T, RequestBody> converter = (Converter<T, RequestBody>) this.converterFactories.get(i2).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                int i4 = i3 % 2;
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 3;
            }
            for (int i7 = 0; i7 < iIndexOf; i7++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i7).getClass().getName());
            }
            sb.append('\n');
            int i8 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 % 2;
            }
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> Converter<ResponseBody, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return nextResponseBodyConverter(null, type, annotationArr);
        }
        nextResponseBodyConverter(null, type, annotationArr);
        throw null;
    }

    public final <T> Converter<ResponseBody, T> nextResponseBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr) {
        int iIndexOf;
        int size;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(type, "type == null");
            Objects.requireNonNull(annotationArr, "annotations == null");
            iIndexOf = this.converterFactories.indexOf(factory);
            size = this.converterFactories.size();
        } else {
            Objects.requireNonNull(type, "type == null");
            Objects.requireNonNull(annotationArr, "annotations == null");
            iIndexOf = this.converterFactories.indexOf(factory) + 1;
            size = this.converterFactories.size();
        }
        int i3 = size;
        int i4 = iIndexOf;
        while (iIndexOf < i3) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Converter<ResponseBody, T> converter = (Converter<ResponseBody, T>) this.converterFactories.get(iIndexOf).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
            iIndexOf++;
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            int i7 = 0;
            while (i7 < i4) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                if (i8 % 2 != 0) {
                    sb.append("\n   * ");
                    sb.append(this.converterFactories.get(i7).getClass().getName());
                    i7 += 21;
                } else {
                    sb.append("\n   * ");
                    sb.append(this.converterFactories.get(i7).getClass().getName());
                    i7++;
                }
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        int i9 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
        int i10 = i9 % 2;
        while (i4 < size2) {
            int i11 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            if (i11 % 2 == 0) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i4).getClass().getName());
                i4 += 80;
            } else {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i4).getClass().getName());
                i4++;
            }
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        int size;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(type, "type == null");
            Objects.requireNonNull(annotationArr, "annotations == null");
            size = this.converterFactories.size();
        } else {
            Objects.requireNonNull(type, "type == null");
            Objects.requireNonNull(annotationArr, "annotations == null");
            size = this.converterFactories.size();
        }
        int i3 = 0;
        while (i3 < size) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Converter<T, String> converter = (Converter<T, String>) this.converterFactories.get(i3).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
            i3++;
            int i6 = TuitionPaymentFragmentbindingInflater1 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return BuiltInConverters.ToStringConverter.INSTANCE;
    }

    public final Executor callbackExecutor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.callbackExecutor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Builder newBuilder() {
        int i = 2 % 2;
        Builder builder = new Builder(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return builder;
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
    private static java.lang.String $$g(short r5, byte r6, short r7) {
        /*
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = retrofit2.Retrofit.$$c
            int r6 = r6 * 4
            int r6 = 107 - r6
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r5
            r6 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r3 = r1[r7]
        L27:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.Retrofit.$$g(short, byte, short):java.lang.String");
    }
}
