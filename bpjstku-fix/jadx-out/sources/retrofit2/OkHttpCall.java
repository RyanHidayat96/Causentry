package retrofit2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.AutoValue_Bitmap2JpegBytes_In;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0;
import defpackage.SessionProcessor;
import defpackage.SurfaceViewImplementation;
import defpackage.abortCapture;
import defpackage.cancelPreviousRequest;
import defpackage.initSession;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Objects;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final okhttp3.Call.Factory callFactory;
    private volatile boolean canceled;
    private Throwable creationFailure;
    private boolean executed;
    private okhttp3.Call rawCall;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, T> responseConverter;

    OkHttpCall(RequestFactory requestFactory, Object[] objArr, okhttp3.Call.Factory factory, Converter<ResponseBody, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = factory;
        this.responseConverter = converter;
    }

    @Override // retrofit2.Call
    public final OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }

    @Override // retrofit2.Call
    public final Request request() {
        Request request;
        synchronized (this) {
            try {
                request = getRawCall().request();
            } catch (IOException e2) {
                throw new RuntimeException("Unable to create request.", e2);
            }
        }
        return request;
    }

    @Override // retrofit2.Call
    public final cancelPreviousRequest timeout() {
        cancelPreviousRequest cancelpreviousrequestTimeout;
        synchronized (this) {
            try {
                cancelpreviousrequestTimeout = getRawCall().timeout();
            } catch (IOException e2) {
                throw new RuntimeException("Unable to create call.", e2);
            }
        }
        return cancelpreviousrequestTimeout;
    }

    private okhttp3.Call getRawCall() throws IOException {
        okhttp3.Call call = this.rawCall;
        if (call != null) {
            return call;
        }
        Throwable th = this.creationFailure;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.Call callCreateRawCall = createRawCall();
            this.rawCall = callCreateRawCall;
            return callCreateRawCall;
        } catch (IOException | Error | RuntimeException e2) {
            Utils.throwIfFatal(e2);
            this.creationFailure = e2;
            throw e2;
        }
    }

    @Override // retrofit2.Call
    public final void enqueue(final Callback<T> callback) {
        okhttp3.Call call;
        Throwable th;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            call = this.rawCall;
            th = this.creationFailure;
            if (call == null && th == null) {
                try {
                    okhttp3.Call callCreateRawCall = createRawCall();
                    this.rawCall = callCreateRawCall;
                    call = callCreateRawCall;
                } catch (Throwable th2) {
                    th = th2;
                    Utils.throwIfFatal(th);
                    this.creationFailure = th;
                }
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        AutoValue_Bitmap2JpegBytes_In.b(call, new okhttp3.Callback() { // from class: retrofit2.OkHttpCall.1
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                AutoValue_Bitmap2JpegBytes_In.b(call2, response);
                try {
                    try {
                        try {
                            callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(response));
                        } catch (Throwable th3) {
                            Utils.throwIfFatal(th3);
                            th3.printStackTrace();
                        }
                        AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    } catch (Throwable th4) {
                        Utils.throwIfFatal(th4);
                        callFailure(th4);
                        AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                } catch (Throwable th5) {
                    AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    throw th5;
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call2, IOException iOException) {
                AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2(call2, iOException);
                try {
                    callFailure(iOException);
                } finally {
                    AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            }

            private void callFailure(Throwable th3) {
                try {
                    callback.onFailure(OkHttpCall.this, th3);
                } catch (Throwable th4) {
                    Utils.throwIfFatal(th4);
                    th4.printStackTrace();
                }
            }
        });
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.executed;
        }
        return z;
    }

    @Override // retrofit2.Call
    public final Response<T> execute() throws IOException {
        okhttp3.Call rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rawCall));
    }

    private okhttp3.Call createRawCall() throws IOException {
        okhttp3.Call callNewCall = this.callFactory.newCall(this.requestFactory.create(this.args));
        if (callNewCall != null) {
            return callNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    final Response<T> parseResponse(okhttp3.Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        okhttp3.Response responseBuild = response.newBuilder().body(new NoContentResponseBody(responseBodyBody.get$contentType(), responseBodyBody.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                return Response.error(Utils.buffer(responseBodyBody), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return Response.success((Object) null, responseBuild);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(responseBodyBody);
        try {
            return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), responseBuild);
        } catch (RuntimeException e2) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e2;
        }
    }

    @Override // retrofit2.Call
    public final void cancel() {
        okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        boolean z;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            okhttp3.Call call = this.rawCall;
            z = call != null && call.getCanceled();
        }
        return z;
    }

    static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;
        private final MediaType contentType;

        NoContentResponseBody(MediaType mediaType, long j) {
            this.contentType = mediaType;
            this.contentLength = j;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType get$contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getContentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public final RotationProvider1 getBodySource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        private final RotationProvider1 delegateSource;
        IOException thrownException;

        ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
            this.delegateSource = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new RotationProviderListenerWrapperExternalSyntheticLambda0(responseBody.getBodySource()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                private static final byte[] $$a = {1, -81, 2, 79};
                private static final int $$b = 76;
                private static int $10 = 0;
                private static int $11 = 1;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                private static int asInterface = 1;
                private static long b = -6377398940819159759L;
                private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
                private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 50782;
                private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -7088822624012287515L;

                private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                    int i2 = 2 % 2;
                    abortCapture abortcapture = new abortCapture();
                    char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
                    abortcapture.b = 4;
                    while (abortcapture.b < cArrB.length) {
                        int i3 = $11 + 117;
                        $10 = i3 % 128;
                        int i4 = i3 % 2;
                        abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                        int i5 = abortcapture.b;
                        try {
                            Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char maximumFlingVelocity = (char) (64838 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                int iIndexOf = 1356 - TextUtils.indexOf("", "");
                                int maximumFlingVelocity2 = 38 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                byte b2 = (byte) ($$a[0] - 1);
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, iIndexOf, maximumFlingVelocity2, 894276454, false, $$c(b2, b3, (byte) (b3 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                            }
                            cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {abortcapture, abortcapture};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - Drawable.resolveOpacity(0, 0)), 468 - KeyEvent.normalizeMetaState(0), 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 896083767, false, "n", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                            int i6 = $10 + 113;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                }

                private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
                    int i2 = 2;
                    int i3 = 2 % 2;
                    SessionProcessor sessionProcessor = new SessionProcessor();
                    int length = cArr2.length;
                    char[] cArr4 = new char[length];
                    int length2 = cArr.length;
                    char[] cArr5 = new char[length2];
                    System.arraycopy(cArr2, 0, cArr4, 0, length);
                    System.arraycopy(cArr, 0, cArr5, 0, length2);
                    cArr4[0] = (char) (cArr4[0] ^ c);
                    cArr5[2] = (char) (cArr5[2] + ((char) i));
                    int length3 = cArr3.length;
                    char[] cArr6 = new char[length3];
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                    while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                        int i4 = $11 + 19;
                        $10 = i4 % 128;
                        int i5 = i4 % i2;
                        try {
                            Object[] objArr2 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 8328);
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1236;
                                int edgeSlop = 35 - (ViewConfiguration.getEdgeSlop() >> 16);
                                byte b2 = (byte) ($$a[0] - 1);
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iLastIndexOf, edgeSlop, -653973969, false, $$c(b2, b3, b3), new Class[]{Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            Object[] objArr3 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                                int i6 = 2763 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 14;
                                byte[] bArr = $$a;
                                byte b4 = (byte) (bArr[0] - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i6, maxKeyCode, 1504416861, false, $$c(b4, b4, bArr[2]), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 252, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char absoluteGravity = (char) (65200 - Gravity.getAbsoluteGravity(0, 0));
                                int scrollDefaultDelay = 2891 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int keyRepeatDelay = 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                byte b5 = $$a[0];
                                byte b6 = (byte) (b5 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, scrollDefaultDelay, keyRepeatDelay, 2012627446, false, $$c(b6, b6, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            int i7 = $11 + 71;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = new String(cArr6);
                }

                @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete
                public long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
                    int i = 2 % 2;
                    int i2 = asInterface + 51;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                    int i3 = i2 % 2;
                    try {
                        long j2 = super.read(rotationProviderListenerWrapper, j);
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                        asInterface = i4 % 128;
                        int i5 = i4 % 2;
                        return j2;
                    } catch (IOException e2) {
                        ExceptionCatchingResponseBody.this.thrownException = e2;
                        throw e2;
                    }
                }

                public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2) {
                    int i3;
                    Object obj;
                    int i4;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i5;
                    Object obj2;
                    char[] cArr;
                    int trimmedLength;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10 = 2 % 2;
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i12 = i11 + 41;
                    asInterface = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = 1;
                    if (context != null) {
                        int i15 = i11 + 39;
                        asInterface = i15 % 128;
                        int i16 = i15 % 2;
                        try {
                            char[] cArr2 = {0, 0, 0, 0};
                            char[] cArr3 = {26251, 9031, 38829, 42865};
                            int i17 = -(ViewConfiguration.getTouchSlop() >> 8);
                            int i18 = (i17 & 29079) + (i17 | 29079);
                            int i19 = asInterface;
                            int i20 = (i19 & 73) + (i19 | 73);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                            char c = (char) i18;
                            if (i20 % 2 != 0) {
                                int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
                                Object[] objArr = new Object[1];
                                a(cArr2, cArr3, c, (-1390196890) / ((jumpTapTimeout & (-73)) + (jumpTapTimeout | (-73))), new char[]{35931, 17014, 29738, 12511, 51815, 61151, 22118, 51549, 56900, 56896, 22269, 57724, 6654, 24478, 10639, 14237, 2521, 21156, 16396, 35697, 37931, 15771, 35109, 9701, 43025, 4731, 39568, 11513, 14196, 38365, 19423}, objArr);
                                obj = objArr[0];
                            } else {
                                Object[] objArr2 = new Object[1];
                                a(cArr2, cArr3, c, (ViewConfiguration.getJumpTapTimeout() >> 16) - 1390196890, new char[]{35931, 17014, 29738, 12511, 51815, 61151, 22118, 51549, 56900, 56896, 22269, 57724, 6654, 24478, 10639, 14237, 2521, 21156, 16396, 35697, 37931, 15771, 35109, 9701, 43025, 4731, 39568, 11513, 14196, 38365, 19423}, objArr2);
                                obj = objArr2[0];
                            }
                            try {
                                Object[] objArr3 = {(String) obj};
                                char[] cArr4 = {0, 0, 0, 0};
                                char[] cArr5 = {13857, 5263, 14913, 27638};
                                int i21 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i22 = ((i21 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) - 503) + (((~i21) | i21) * (-502));
                                int i23 = ~i21;
                                int i24 = ~i23;
                                int i25 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i26 = ~((i23 ^ i25) | (i23 & i25));
                                int i27 = (i24 ^ i26) | (i24 & i26);
                                int i28 = ~(((-1) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                int i29 = ((i27 ^ i28) | (i27 & i28)) * (-502);
                                int i30 = (i22 & i29) + (i29 | i22);
                                int i31 = asInterface + 71;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i31 % 128;
                                int i32 = i31 % 2;
                                int i33 = i23 | i25;
                                int i34 = ~(i33 | (i33 ^ (-1)));
                                int i35 = ~((i21 ^ (-1)) | i21 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                int i36 = -(-(((i34 & i35) | (i34 ^ i35)) * TypedValues.PositionType.TYPE_DRAWPATH));
                                char c2 = (char) ((i30 ^ i36) + ((i36 & i30) << 1));
                                int i37 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int i38 = i37 * (-344);
                                int i39 = (i38 & 344) + (i38 | 344);
                                int i40 = ~i37;
                                int i41 = ~i40;
                                int i42 = ~((i40 ^ i) | (i40 & i));
                                int i43 = (i39 - (~(-(-(((i41 ^ i42) | (i42 & i41)) * 345))))) - 1;
                                int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i45 = (i44 ^ 39) + ((i44 & 39) << 1);
                                asInterface = i45 % 128;
                                int i46 = i45 % 2;
                                int i47 = ~i37;
                                int i48 = ~i;
                                int i49 = -(-(((~i37) | (~((i47 ^ i48) | (i47 & i48)))) * 345));
                                int i50 = (i43 ^ i49) + ((i49 & i43) << 1);
                                int i51 = (~((i47 ^ i) | (i47 & i))) * 345;
                                Object[] objArr4 = new Object[1];
                                a(cArr4, cArr5, c2, (i50 & i51) + (i51 | i50), new char[]{19345, 65333, 5232, 8877, 29855, 56872, 49149, 11718, 990, 62748, 41235, 46737, 17950, 10605, 7868, 47980, 8357, 5407, 27906, 9771, 39229, 34961, 52609, 42224, 2552, 36821, 23137, 5920, 38544, 34655, 52407, 30703, 29304, 57423, 58868, 30165, 19416, 37828}, objArr4);
                                Object objNewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(objArr3);
                                char[] cArr6 = {43458, 35260, 43393, 41474, 61192, 32471, 2018, 47195, 64525, 20604, 48500, 52441, 62900, 3651, 2871, 8899, 41871, 48255, 55645, 28899, 4540, 27186, 46892, 50906, 53146, 6257, 1398, 5281, 48622, 46679, 54097, 27321, 27636, 25630, 41318};
                                int i52 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i53 = i52 * (-495);
                                int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
                                asInterface = i54 % 128;
                                int i55 = i54 % 2;
                                int i56 = (i53 & (-495)) + (i53 | (-495));
                                int i57 = ~i52;
                                int i58 = -(-(((~((i57 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i57 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | (~((i57 ^ (-2)) | (i57 & (-2))))) * 992));
                                int i59 = ((i56 | i58) << 1) - (i58 ^ i56);
                                int i60 = ~i52;
                                int i61 = ~((i60 & (-2)) | (i60 ^ (-2)));
                                int i62 = ~((i57 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i57 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i63 = (i61 & i62) | (i61 ^ i62);
                                int i64 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i65 = (i52 & i64) | (i64 ^ i52);
                                int i66 = ~((i65 & 1) | (i65 ^ 1));
                                int i67 = (i59 - (~(-(-(((i63 & i66) | (i63 ^ i66)) * (-496)))))) - 1;
                                int i68 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 1)) * 496;
                                int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                                Object[] objArr5 = new Object[1];
                                c(cArr6, i69, objArr5);
                                try {
                                    Object[] objArr6 = {(String) objArr5[0]};
                                    Object[] objArr7 = new Object[1];
                                    a(new char[]{0, 0, 0, 0}, new char[]{13857, 5263, 14913, 27638}, (char) (Process.myTid() >> 22), View.combineMeasuredStates(0, 0), new char[]{19345, 65333, 5232, 8877, 29855, 56872, 49149, 11718, 990, 62748, 41235, 46737, 17950, 10605, 7868, 47980, 8357, 5407, 27906, 9771, 39229, 34961, 52609, 42224, 2552, 36821, 23137, 5920, 38544, 34655, 52407, 30703, 29304, 57423, 58868, 30165, 19416, 37828}, objArr7);
                                    Object objNewInstance2 = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                                    int i70 = asInterface + 101;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i70 % 128;
                                    if (i70 % 2 != 0) {
                                        int i71 = 5 % 2;
                                    }
                                    try {
                                        int iRgb = Color.rgb(0, 0, 0);
                                        int i72 = (iRgb & 16777217) + (iRgb | 16777217);
                                        Object[] objArr8 = new Object[1];
                                        c(new char[]{35932, 37173, 35901, 47832, 52457, 22801, 8767, 39819, 56298, 18643, 40701, 60241, 53287, 5825, 10491, 1343, 34333, 42236, 64213, 22377, 13359, 29417, 38099, 57639, 59909, 242, 9917}, i72, objArr8);
                                        Class<?> cls = Class.forName((String) objArr8[0]);
                                        char[] cArr7 = {0, 0, 0, 0};
                                        char[] cArr8 = {49636, 4764, 37097, 4351};
                                        int i73 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i74 = i73 * 628;
                                        int i75 = (i74 ^ 41086272) + ((i74 & 41086272) << 1);
                                        int i76 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i77 = (i76 ^ 61) + ((i76 & 61) << 1);
                                        asInterface = i77 % 128;
                                        int i78 = i77 % 2;
                                        int i79 = (65424 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (65424 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                        int i80 = ~i73;
                                        int i81 = (-627) * ((i79 ^ i80) | (i80 & i79));
                                        int i82 = (((i75 | i81) << 1) - (i75 ^ i81)) + (((~((-65425) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) | i73) * (-627));
                                        int i83 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        char c3 = (char) (i82 + (((~((i83 ^ 65424) | (65424 & i83))) | (~((i73 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i73 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * 627));
                                        int i84 = ((i76 | 71) << 1) - (i76 ^ 71);
                                        asInterface = i84 % 128;
                                        if (i84 % 2 == 0) {
                                            i4 = -(ViewConfiguration.getEdgeSlop() % 65);
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            i5 = (-392) - (~(-i4));
                                        } else {
                                            i4 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            i5 = i4 * (-391);
                                        }
                                        int i85 = (i5 ^ 1993513213) + ((i5 & 1993513213) << 1);
                                        int i86 = ~(384656190 | i4);
                                        int i87 = ~(((-384656191) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & (-384656191)));
                                        int i88 = (i86 | i87) * (-196);
                                        int i89 = ((i85 | i88) << 1) - (i88 ^ i85);
                                        int i90 = (i4 | (-384656191)) * 392;
                                        int i91 = (i89 ^ i90) + ((i89 & i90) << 1);
                                        int i92 = ~i4;
                                        int i93 = ~((i92 & 384656190) | (i92 ^ 384656190));
                                        int i94 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i95 = (i94 ^ 95) + ((i94 & 95) << 1);
                                        asInterface = i95 % 128;
                                        int i96 = i95 % 2;
                                        int i97 = (i91 - (~(196 * ((i93 & i87) | (i93 ^ i87))))) - 1;
                                        Object[] objArr9 = new Object[1];
                                        a(cArr7, cArr8, c3, i97, new char[]{51791, 11332, 55576, 48843, 33187, 49114, 24502, 27460, 55359, 38858, 61633, 51228, 46034, 18424, 50473, 3038, 3265}, objArr9);
                                        Object objInvoke = cls.getMethod((String) objArr9[0], null).invoke(context, null);
                                        int i98 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i99 = (i98 ^ 55) + ((i98 & 55) << 1);
                                        asInterface = i99 % 128;
                                        int i100 = i99 % 2;
                                        try {
                                            Object[] objArr10 = new Object[1];
                                            c(new char[]{35932, 37173, 35901, 47832, 52457, 22801, 8767, 39819, 56298, 18643, 40701, 60241, 53287, 5825, 10491, 1343, 34333, 42236, 64213, 22377, 13359, 29417, 38099, 57639, 59909, 242, 9917}, -MotionEvent.axisFromString(""), objArr10);
                                            Class<?> cls2 = Class.forName((String) objArr10[0]);
                                            int i101 = -(ViewConfiguration.getTouchSlop() >> 8);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i102 = i101 * 495;
                                            int i103 = (((i102 & (-493)) + (i102 | (-493))) - (~(-(-(((i101 ^ (-2)) | (i101 & (-2))) * (-988)))))) - 1;
                                            int i104 = ~i101;
                                            int i105 = (i104 & 1) | (i104 ^ 1);
                                            int i106 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                            int i107 = ((i105 & i106) | (i105 ^ i106)) * 494;
                                            int i108 = (i103 & i107) + (i107 | i103);
                                            int i109 = ~i101;
                                            int i110 = ~((i109 & (-2)) | (i109 ^ (-2)));
                                            int i111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                            int i112 = (~((i111 & 1) | (i111 ^ 1))) | i110;
                                            int i113 = ~((i101 & 1) | (i101 ^ 1));
                                            int i114 = ((i113 & i112) | (i112 ^ i113)) * 494;
                                            int i115 = ((i108 | i114) << 1) - (i114 ^ i108);
                                            Object[] objArr11 = new Object[1];
                                            c(new char[]{22873, 27905, 22846, 18151, 58225, 62207, 63284, 46083, 28710, 46317, 45434, 16594, 1318, 60159, 1875, 44774, 21264, 22723}, i115, objArr11);
                                            Object objInvoke2 = cls2.getMethod((String) objArr11[0], null).invoke(context, null);
                                            int i116 = asInterface;
                                            int i117 = (i116 & 31) + (i116 | 31);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i117 % 128;
                                            int i118 = i117 % 2;
                                            try {
                                                Object[] objArr12 = {objInvoke2, 64};
                                                int iIndexOf = TextUtils.indexOf("", "", 0, 0);
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i119 = iIndexOf * (-721);
                                                int i120 = ((i119 | (-721)) << 1) - (i119 ^ (-721));
                                                int i121 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                int i122 = ~iIndexOf;
                                                int i123 = i121 | (~((i122 ^ (-2)) | (i122 & (-2))));
                                                int i124 = ~((iIndexOf ^ 1) | (iIndexOf & 1));
                                                int i125 = ((i123 & i124) | (i123 ^ i124)) * 1444;
                                                int i126 = (i120 & i125) + (i125 | i120);
                                                int i127 = ~((iIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                int i128 = (i127 & i124) | (i124 ^ i127);
                                                int i129 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 1));
                                                int i130 = (i126 - (~(-(-(((i129 & i128) | (i128 ^ i129)) * (-1444)))))) - 1;
                                                int i131 = ~((i122 ^ 1) | (i122 & 1));
                                                int i132 = ~(((-2) & iIndexOf) | ((-2) ^ iIndexOf));
                                                int i133 = -(-(((i131 & i132) | (i131 ^ i132)) * 722));
                                                int i134 = (i130 & i133) + (i133 | i130);
                                                Object[] objArr13 = new Object[1];
                                                c(new char[]{47323, 50682, 47290, 60951, 35914, 62809, 5816, 56104, 30626, 7196, 56926, 18201, 58528, 16910, 26712, 43383, 45722, 61491, 47734, 64289, 155, 9764, 54320, 19787, 56966, 21542, 26113, 40710, 44276, 64084, 45099, 57618, 31457, 10316, 49685, 13082, 51401}, i134, objArr13);
                                                Class<?> cls3 = Class.forName((String) objArr13[0]);
                                                int i135 = -Color.green(0);
                                                Object[] objArr14 = new Object[1];
                                                a(new char[]{0, 0, 0, 0}, new char[]{1587, 35515, 16950, 14156}, (char) ((i135 & 19522) + (i135 | 19522)), TextUtils.indexOf("", "", 0), new char[]{22544, 35677, 5303, 19238, 42778, 23231, 4137, 21173, 51425, 40851, 23566, 55516, 41488, 31895}, objArr14);
                                                Object objInvoke3 = cls3.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke, objArr12);
                                                int i136 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                int i137 = ~i136;
                                                int i138 = ~((i137 ^ (-25503)) | (i137 & (-25503)));
                                                int i139 = ~(((-25503) & i) | ((-25503) ^ i));
                                                int i140 = ((i136 * (-575)) - 14663650) + (((i138 & i139) | (i138 ^ i139)) * 576);
                                                int i141 = ~((i137 & 25502) | (i137 ^ 25502));
                                                int i142 = ~(((-25503) ^ i48) | ((-25503) & i48) | i136);
                                                int i143 = -(-(((i141 & i142) | (i141 ^ i142)) * 576));
                                                int i144 = (i140 & i143) + (i140 | i143);
                                                int i145 = ~i136;
                                                int i146 = (~((i145 & (-25503)) | (i145 ^ (-25503)))) * 576;
                                                Object[] objArr15 = new Object[1];
                                                a(new char[]{0, 0, 0, 0}, new char[]{60907, 51618, 40657, 63331}, (char) ((i144 ^ i146) + ((i146 & i144) << 1)), KeyEvent.getDeadChar(0, 0), new char[]{46922, 15750, 21148, 27208, 6935, 53307, 33336, 49925, 24374, 4984, 16194, 43052, 62415, 50187, 28615, 52366, 7162, 59567, 46985, 9523, 54968, 38025, 55627, 50281, 17817, 46931, 65074, 50430, 51005, 12484}, objArr15);
                                                Class<?> cls4 = Class.forName((String) objArr15[0]);
                                                int i147 = -TextUtils.getTrimmedLength("");
                                                int i148 = i147 * 868;
                                                int i149 = (i148 & 868) + (i148 | 868);
                                                int i150 = ~i147;
                                                int i151 = ~i;
                                                int i152 = -(-(((~((i150 ^ i151) | (i150 & i151))) | (~((-2) | i48))) * (-867)));
                                                int i153 = (i149 ^ i152) + ((i149 & i152) << 1);
                                                int i154 = ~i147;
                                                int i155 = ~((i154 ^ (-2)) | (i154 & (-2)));
                                                int i156 = ~(i150 | i);
                                                int i157 = (i156 & i155) | (i155 ^ i156);
                                                int i158 = ~(((-2) ^ i) | ((-2) & i));
                                                int i159 = -(-(((i157 & i158) | (i157 ^ i158)) * (-1734)));
                                                int i160 = (i153 ^ i159) + ((i159 & i153) << 1);
                                                int i161 = i154 | (-2);
                                                int i162 = ~((i161 & i48) | (i161 ^ i48));
                                                int i163 = ~((i154 & 1) | (i154 ^ 1) | i);
                                                int i164 = (i162 & i163) | (i162 ^ i163);
                                                int i165 = ((-2) & i147) | ((-2) ^ i147);
                                                int i166 = ~((i165 & i) | (i165 ^ i));
                                                int i167 = (i160 - (~(-(-(((i166 & i164) | (i164 ^ i166)) * 867))))) - 1;
                                                Object[] objArr16 = new Object[1];
                                                c(new char[]{22165, 41514, 22246, 35264, 5010, 23256, 63736, 17651, 55359, 31697, 16788, 59608, 2792, 9666}, i167, objArr16);
                                                Object[] objArr17 = (Object[]) cls4.getField((String) objArr16[0]).get(objInvoke3);
                                                int length = objArr17.length;
                                                int i168 = 0;
                                                while (i168 < length) {
                                                    int i169 = asInterface;
                                                    int i170 = (i169 ^ 63) + ((i169 & 63) << i14);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i170 % 128;
                                                    if (i170 % 2 != 0) {
                                                        obj2 = objArr17[i168];
                                                        cArr = new char[]{47562, 50846, 47506, 60723, 6613, 53601, 6143, 20198, 21464};
                                                        trimmedLength = TextUtils.getTrimmedLength("");
                                                        i6 = 0;
                                                    } else {
                                                        obj2 = objArr17[i168];
                                                        cArr = new char[]{47562, 50846, 47506, 60723, 6613, 53601, 6143, 20198, 21464};
                                                        trimmedLength = TextUtils.getTrimmedLength("");
                                                        i6 = i14;
                                                    }
                                                    int i171 = -trimmedLength;
                                                    int i172 = ((i6 | i171) << i14) - (i171 ^ i6);
                                                    Object[] objArr18 = new Object[i14];
                                                    c(cArr, i172, objArr18);
                                                    try {
                                                        Object[] objArr19 = {(String) objArr18[0]};
                                                        Object[] objArr20 = new Object[i14];
                                                        c(new char[]{30261, 54669, 30303, 65135, 42986, 44500, 55319, 61594, 12092, 3185, 62957, 8138, 10840, 21092, 17389, 61929, 31848, 57348, 37331, 41972, 52855, 13898, 65410, 5574, 4204, 17472, 19884, 51088, 25115, 59951, 39863, 47500, 46101, 14399, 59782, 27520, 1590, 19994, 14227, 56743, 26656}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr20);
                                                        Class<?> cls5 = Class.forName((String) objArr20[0]);
                                                        char[] cArr9 = {0, 0, 0, 0};
                                                        char[] cArr10 = {11879, 4061, 48710, 18523};
                                                        char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int i173 = 1175444781 - (~TextUtils.indexOf("", ""));
                                                        int i174 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                        int i175 = (i174 ^ 73) + ((i174 & 73) << 1);
                                                        Object[] objArr21 = objArr17;
                                                        asInterface = i175 % 128;
                                                        int i176 = i175 % 2;
                                                        int i177 = length;
                                                        Object[] objArr22 = new Object[1];
                                                        a(cArr9, cArr10, c4, i173, new char[]{10035, 53739, 3943, 25929, 15201, 11037, 6605, 40073, 13803, 59561, 14380}, objArr22);
                                                        Object objInvoke4 = cls5.getMethod((String) objArr22[0], String.class).invoke(null, objArr19);
                                                        try {
                                                            Object[] objArr23 = new Object[1];
                                                            a(new char[]{0, 0, 0, 0}, new char[]{21102, 38563, 18264, 44572}, (char) (7238 - (~(-Drawable.resolveOpacity(0, 0)))), View.resolveSize(0, 0), new char[]{8205, 62795, 6264, 58641, 42795, 16806, 31876, 52330, 37881, 58550, 37219, 31528, 39597, 63799, 46793, 36946, 22885, 42844, 20451, 7969, 526, 55530, 24916, 12344, 19120, 48666, 17878, 61851}, objArr23);
                                                            Class<?> cls6 = Class.forName((String) objArr23[0]);
                                                            char[] cArr11 = {0, 0, 0, 0};
                                                            char[] cArr12 = {41406, 17947, 33451, 14803};
                                                            int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                            int i178 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                            int i179 = ((i178 | 1) << 1) - (i178 ^ 1);
                                                            asInterface = i179 % 128;
                                                            int i180 = i179 % 2;
                                                            char c5 = (char) maximumFlingVelocity;
                                                            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0);
                                                            int i181 = iIndexOf2 * 236;
                                                            int i182 = (i181 & 503108919) + (i181 | 503108919);
                                                            int i183 = asInterface;
                                                            int i184 = i168;
                                                            int i185 = (i183 & 53) + (i183 | 53);
                                                            Object obj3 = objNewInstance2;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i185 % 128;
                                                            int i186 = i185 % 2;
                                                            int i187 = ~iIndexOf2;
                                                            int i188 = ~((i187 ^ i151) | (i187 & i151));
                                                            int i189 = -(-((((-1421468767) ^ i188) | ((-1421468767) & i188)) * (-235)));
                                                            int i190 = (i182 & i189) + (i182 | i189);
                                                            int i191 = (i183 ^ 125) + ((i183 & 125) << 1);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i191 % 128;
                                                            if (i191 % 2 != 0) {
                                                                int i192 = ~iIndexOf2;
                                                                i7 = i190 % (((~((i192 & i) | (i192 ^ i))) | (-1421468767)) * (-470));
                                                                i8 = (1421468766 & iIndexOf2) | (1421468766 ^ iIndexOf2);
                                                            } else {
                                                                int i193 = ~(i187 | i);
                                                                int i194 = ((i193 & (-1421468767)) | (i193 ^ (-1421468767))) * (-470);
                                                                i7 = (i190 ^ i194) + ((i190 & i194) << 1);
                                                                i8 = 1421468766 | iIndexOf2;
                                                            }
                                                            int i195 = ~i8;
                                                            int i196 = i187 | (-1421468767);
                                                            int i197 = ~((i196 & i) | (i196 ^ i));
                                                            Object[] objArr24 = new Object[1];
                                                            a(cArr11, cArr12, c5, (i7 - (~(-(-(235 * ((i197 & i195) | (i195 ^ i197))))))) - 1, new char[]{38495, 19864, 53176, 42278, 11726, 63620, 51194, 5367, 28111, 52019, 7876}, objArr24);
                                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr24[0], null).invoke(obj2, null));
                                                            int i198 = asInterface + 5;
                                                            int i199 = i198 % 128;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i199;
                                                            int i200 = i198 % 2;
                                                            try {
                                                                Object[] objArr25 = {byteArrayInputStream};
                                                                char[] cArr13 = {30261, 54669, 30303, 65135, 42986, 44500, 55319, 61594, 12092, 3185, 62957, 8138, 10840, 21092, 17389, 61929, 31848, 57348, 37331, 41972, 52855, 13898, 65410, 5574, 4204, 17472, 19884, 51088, 25115, 59951, 39863, 47500, 46101, 14399, 59782, 27520, 1590, 19994, 14227, 56743, 26656};
                                                                int i201 = (i199 ^ 35) + ((i199 & 35) << 1);
                                                                asInterface = i201 % 128;
                                                                int i202 = i201 % 2;
                                                                int i203 = -TextUtils.indexOf("", "", 0);
                                                                int i204 = (i203 ^ 1) + ((i203 & 1) << 1);
                                                                Object[] objArr26 = new Object[1];
                                                                c(cArr13, i204, objArr26);
                                                                Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                Object[] objArr27 = new Object[1];
                                                                c(new char[]{2498, 50411, 2469, 61197, 46214, 45083, 42940, 58350, 13047, 7429, 59016, 519, 21913, 17173, 20610, 60450, 911, 61738, 33453, 48697, 45459, 10028, 60605}, -TextUtils.lastIndexOf("", '0', 0), objArr27);
                                                                String str = (String) objArr27[0];
                                                                int i205 = asInterface + 49;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i205 % 128;
                                                                int i206 = i205 % 2;
                                                                Object objInvoke5 = cls7.getMethod(str, InputStream.class).invoke(objInvoke4, objArr25);
                                                                try {
                                                                    Object[] objArr28 = new Object[1];
                                                                    c(new char[]{61543, 6506, 61453, 12936, 37679, 23937, 24133, 50271, 57193, 49302, 49448, 61343, 44042, 40579, 30504, 444, 64058, 11491, 42262, 21409, 18469, 64173, 52039, 58760, 38510, 35045, 31012, 14319, 58442, 9939, 44901, 18897, 12885, 62676, 56678, 39893, 32883, 33516}, 0 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr28);
                                                                    Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                                                    char mirror = AndroidCharacter.getMirror('0');
                                                                    Object[] objArr29 = new Object[1];
                                                                    a(new char[]{0, 0, 0, 0}, new char[]{22065, 61833, 23381, 41902}, scrollBarSize, (mirror ^ 35110) + ((35110 & mirror) << 1), new char[]{7620, 24193, 16668, 26413, 46120, 2549, 54891, 30626, 53746, 54684, 46545, 40250, 15437, 51430, 2132, 43570, 43426, 26928, 60913, 34245, 35063, 23574, 25910}, objArr29);
                                                                    if (!objNewInstance.equals(cls8.getMethod((String) objArr29[0], null).invoke(objInvoke5, null))) {
                                                                        int i207 = asInterface;
                                                                        int i208 = ((i207 | 3) << 1) - (i207 ^ 3);
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i208 % 128;
                                                                        int i209 = i208 % 2;
                                                                        try {
                                                                            Object[] objArr30 = new Object[1];
                                                                            c(new char[]{61543, 6506, 61453, 12936, 37679, 23937, 24133, 50271, 57193, 49302, 49448, 61343, 44042, 40579, 30504, 444, 64058, 11491, 42262, 21409, 18469, 64173, 52039, 58760, 38510, 35045, 31012, 14319, 58442, 9939, 44901, 18897, 12885, 62676, 56678, 39893, 32883, 33516}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr30);
                                                                            Class<?> cls9 = Class.forName((String) objArr30[0]);
                                                                            char[] cArr14 = {0, 0, 0, 0};
                                                                            char[] cArr15 = {22065, 61833, 23381, 41902};
                                                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                                                            int i210 = asInterface;
                                                                            int i211 = (i210 & 123) + (i210 | 123);
                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i211 % 128;
                                                                            int i212 = i211 % 2 != 0 ? ((-159) % iLastIndexOf) - (-2147483568) : (iLastIndexOf * (-159)) - 159;
                                                                            int i213 = ~iLastIndexOf;
                                                                            int i214 = (i212 - (~(-(-(((i213 ^ 1) | (i213 & 1)) * 160))))) - 1;
                                                                            int i215 = -(-(((~((iLastIndexOf ^ 1) | (iLastIndexOf & 1))) | (~((i151 ^ iLastIndexOf) | (i151 & iLastIndexOf)))) * (-160)));
                                                                            int i216 = (i214 & i215) + (i215 | i214);
                                                                            int i217 = ~((-2) | i151);
                                                                            char c6 = (char) ((i216 - (~(((i217 & iLastIndexOf) | (iLastIndexOf ^ i217)) * 160))) - 1);
                                                                            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                            int i218 = fadingEdgeLength * (-1965);
                                                                            int i219 = (i218 ^ 1483203216) + ((i218 & 1483203216) << 1);
                                                                            int i220 = ((fadingEdgeLength ^ (-1441892695)) | (fadingEdgeLength & (-1441892695))) * 983;
                                                                            int i221 = (i219 & i220) + (i219 | i220);
                                                                            int i222 = ~fadingEdgeLength;
                                                                            int i223 = asInterface;
                                                                            int i224 = (i223 & 13) + (i223 | 13);
                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i224 % 128;
                                                                            int i225 = i224 % 2;
                                                                            int i226 = ~(((-1441892695) ^ i151) | ((-1441892695) & i151));
                                                                            if (i225 != 0) {
                                                                                i9 = i221 << ((-983) << ((i226 & i222) | (i222 ^ i226)));
                                                                            } else {
                                                                                int i227 = -(-(((i226 & i222) | (i222 ^ i226)) * (-983)));
                                                                                i9 = ((i221 | i227) << 1) - (i221 ^ i227);
                                                                            }
                                                                            int i228 = ~fadingEdgeLength;
                                                                            int i229 = ~((i228 & i48) | (i228 ^ i48));
                                                                            int i230 = ~((1441892694 & i222) | (i222 ^ 1441892694));
                                                                            int i231 = 983 * ((i229 & i230) | (i229 ^ i230));
                                                                            Object[] objArr31 = new Object[1];
                                                                            a(cArr14, cArr15, c6, ((i9 | i231) << 1) - (i9 ^ i231), new char[]{7620, 24193, 16668, 26413, 46120, 2549, 54891, 30626, 53746, 54684, 46545, 40250, 15437, 51430, 2132, 43570, 43426, 26928, 60913, 34245, 35063, 23574, 25910}, objArr31);
                                                                            if (!obj3.equals(cls9.getMethod((String) objArr31[0], null).invoke(objInvoke5, null))) {
                                                                                i168 = i184 + 1;
                                                                                objNewInstance2 = obj3;
                                                                                objArr17 = objArr21;
                                                                                length = i177;
                                                                                i14 = 1;
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            Throwable cause = th.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    int[] iArr = new int[1];
                                                                    Object[] objArr32 = {new int[]{i}, iArr, new int[]{(~(i & 1)) & (i | 1)}, null};
                                                                    int i232 = 1858126516 + (((~(618795616 | i151)) | 50931733) * 168) + ((~((-50931734) | i)) * 168) + (((~((-659105846) | i151)) | 608174112 | (~(669727349 | i))) * 168);
                                                                    int i233 = i232 * 408;
                                                                    int i234 = (((-13008) | i233) << 1) - (i233 ^ (-13008));
                                                                    int i235 = ~i232;
                                                                    int i236 = ~((i235 & 16) | (i235 ^ 16));
                                                                    int i237 = ~(i | 16);
                                                                    int i238 = -(-(((i236 & i237) | (i236 ^ i237)) * (-814)));
                                                                    int i239 = (i234 ^ i238) + ((i238 & i234) << 1);
                                                                    int i240 = ~i232;
                                                                    int i241 = ~((i240 & i48) | (i240 ^ i48));
                                                                    int i242 = ((-17) & i232) | ((-17) ^ i232);
                                                                    int i243 = ~i242;
                                                                    int i244 = (i241 & i243) | (i241 ^ i243);
                                                                    int i245 = ~((i ^ 16) | (i & 16));
                                                                    int i246 = (i239 - (~(((i244 & i245) | (i244 ^ i245)) * 407))) - 1;
                                                                    int i247 = ~i242;
                                                                    int i248 = ~(((-17) & i) | ((-17) ^ i));
                                                                    int i249 = (i247 & i248) | (i247 ^ i248);
                                                                    int i250 = ~((i232 & i) | (i232 ^ i));
                                                                    int i251 = -(-(i246 + (((i249 & i250) | (i249 ^ i250)) * 407)));
                                                                    int i252 = (i2 & i251) + (i2 | i251);
                                                                    int i253 = (i252 << 13) ^ i252;
                                                                    int i254 = i253 >>> 17;
                                                                    int i255 = (i253 | i254) & (~(i253 & i254));
                                                                    int i256 = i255 << 5;
                                                                    iArr[0] = (i255 | i256) & (~(i255 & i256));
                                                                    return objArr32;
                                                                } catch (Throwable th2) {
                                                                    Throwable cause2 = th2.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th3) {
                                                                Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        } catch (Throwable th4) {
                                                            Throwable cause4 = th4.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th4;
                                                        }
                                                    } catch (Throwable th5) {
                                                        Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                Throwable cause6 = th6.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th6;
                                            }
                                        } catch (Throwable th7) {
                                            Throwable cause7 = th7.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th7;
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause8 = th8.getCause();
                                        if (cause8 != null) {
                                            throw cause8;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause9 = th9.getCause();
                                    if (cause9 != null) {
                                        throw cause9;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause10 = th10.getCause();
                                if (cause10 != null) {
                                    throw cause10;
                                }
                                throw th10;
                            }
                        } catch (Throwable unused) {
                        }
                        i3 = 4;
                    } else {
                        i3 = 4;
                    }
                    Object[] objArr33 = new Object[i3];
                    objArr33[0] = new int[]{i};
                    objArr33[1] = new int[1];
                    objArr33[2] = new int[]{i};
                    int i257 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i258 = (i257 & 63) + (i257 | 63);
                    asInterface = i258 % 128;
                    int i259 = i258 % 2;
                    int i260 = i257 + 45;
                    asInterface = i260 % 128;
                    if (i260 % 2 == 0) {
                        objArr33[3] = null;
                        throw null;
                    }
                    objArr33[3] = null;
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i261 = ~elapsedCpuTime;
                    int i262 = 350412148 + ((~(518401227 | i261)) * (-560)) + ((~(elapsedCpuTime | 520044287)) * (-560)) + (((~((-478090999) | i261)) | 476447938) * 560);
                    int i263 = ((i2 | i262) << 1) - (i2 ^ i262);
                    int i264 = i263 ^ (i263 << 13);
                    int i265 = i264 >>> 17;
                    int i266 = (i264 | i265) & (~(i264 & i265));
                    int i267 = i266 << 5;
                    ((int[]) objArr33[1])[0] = ((~i266) & i267) | ((~i267) & i266);
                    return objArr33;
                }

                private static String $$c(short s, byte b2, short s2) {
                    int i = (s * 2) + 4;
                    byte[] bArr = $$a;
                    int i2 = b2 * 3;
                    int i3 = s2 + 102;
                    byte[] bArr2 = new byte[i2 + 1];
                    int i4 = -1;
                    if (bArr == null) {
                        i++;
                        i3 = i + (-i2);
                    }
                    while (true) {
                        int i5 = i3;
                        int i6 = i;
                        i4++;
                        bArr2[i4] = (byte) i5;
                        if (i4 == i2) {
                            return new String(bArr2, 0);
                        }
                        i = i6 + 1;
                        i3 = i5 + (-bArr[i6]);
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType get$contentType() {
            return this.delegate.get$contentType();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getContentLength() {
            return this.delegate.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public final RotationProvider1 getBodySource() {
            return this.delegateSource;
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.delegate.close();
        }

        final void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }
}
