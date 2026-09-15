package com.squareup.okhttp.internal.http;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.mlkit_common.zzjq;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.io.RealConnection;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.ScreenFlashViewExternalSyntheticLambda0;
import defpackage.SessionProcessor;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.cancelPreviousRequest;
import defpackage.initSession;
import defpackage.tryToComplete;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class Http1xStream implements HttpStream {
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private HttpEngine httpEngine;
    private final RotationProviderListener sink;
    private final RotationProvider1 source;
    private int state = 0;
    private final StreamAllocation streamAllocation;

    public Http1xStream(StreamAllocation streamAllocation, RotationProvider1 rotationProvider1, RotationProviderListener rotationProviderListener) {
        this.streamAllocation = streamAllocation;
        this.source = rotationProvider1;
        this.sink = rotationProviderListener;
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final void setHttpEngine(HttpEngine httpEngine) {
        this.httpEngine = httpEngine;
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final SurfaceViewImplementationApi24Impl createRequestBody(Request request, long j) throws IOException {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final void cancel() {
        RealConnection realConnectionConnection = this.streamAllocation.connection();
        if (realConnectionConnection != null) {
            realConnectionConnection.cancel();
        }
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final void writeRequestHeaders(Request request) throws IOException {
        this.httpEngine.writingRequestHeaders();
        writeRequest(request.headers(), RequestLine.get(request, this.httpEngine.getConnection().getRoute().getProxy().type()));
    }

    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        private static final byte[] $$c = {117, -15, -81, 1};
        private static final int $$d = 116;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {84, 10, 24, -102, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 152;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        private static int TuitionPaymentFragmentbindingInflater1 = 1075859907;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 + 4
                int r9 = r9 * 14
                int r9 = 98 - r9
                int r7 = r7 + 1
                byte[] r0 = com.squareup.okhttp.internal.http.Http1xStream.FixedLengthSource.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2a
            L13:
                r3 = r2
            L14:
                int r8 = r8 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2a:
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.Http1xStream.FixedLengthSource.c(short, int, int, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
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
            int i5 = $11 + 75;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i7 = $11 + 105;
                $10 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 8328);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1236;
                        int deadChar = 35 - KeyEvent.getDeadChar(0, 0);
                        byte b2 = (byte) ($$c[3] - 1);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iIndexOf, deadChar, -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cRed = (char) Color.red(0);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2764;
                            int trimmedLength = 14 - TextUtils.getTrimmedLength("");
                            byte b4 = (byte) ($$c[3] + 1);
                            byte b5 = (byte) (b4 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, jumpTapTimeout, trimmedLength, 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 43325), 253 - Drawable.resolveOpacity(0, 0), 22 - View.resolveSizeAndState(0, 0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char offsetBefore = (char) (65200 - TextUtils.getOffsetBefore("", 0));
                                    int i9 = 2892 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int iLastIndexOf = 16 - TextUtils.lastIndexOf("", '0', 0, 0);
                                    byte b6 = $$c[3];
                                    byte b7 = (byte) (b6 - 1);
                                    String str$$e = $$e(b6, b7, b7);
                                    i2 = 2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, i9, iLastIndexOf, 2012627446, false, str$$e, new Class[]{Integer.TYPE, Integer.TYPE});
                                } else {
                                    i2 = 2;
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = sessionProcessor.b;
                                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                i3 = i2;
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
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public FixedLengthSource(long j) throws IOException {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                endOfInput();
                int i = b + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 3 / 4;
                } else {
                    int i3 = 2 % 2;
                }
            }
            int i4 = b + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        /* JADX WARN: Code duplicated, block: B:25:0x0067  */
        /* JADX WARN: Code duplicated, block: B:26:0x006f  */
        @Override // defpackage.tryToComplete
        public long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            int i;
            int i2 = 2 % 2;
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            if (!(!this.closed)) {
                throw new IllegalStateException("closed");
            }
            int i3 = b + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0 ? this.bytesRemaining == 0 : this.bytesRemaining == 1) {
                return -1L;
            }
            long j2 = Http1xStream.this.source.read(rotationProviderListenerWrapper, Math.min(this.bytesRemaining, j));
            if (j2 == -1) {
                unexpectedEndOfInput();
                throw new ProtocolException("unexpected end of stream");
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i5 = i4 + 3;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                long j3 = this.bytesRemaining ^ j2;
                this.bytesRemaining = j3;
                if (j3 == 0) {
                    i = i4 + 49;
                    b = i % 128;
                    if (i % 2 != 0) {
                        endOfInput();
                        int i6 = 42 / 0;
                    } else {
                        endOfInput();
                    }
                }
            } else {
                long j4 = this.bytesRemaining - j2;
                this.bytesRemaining = j4;
                if (j4 == 0) {
                    i = i4 + 49;
                    b = i % 128;
                    if (i % 2 != 0) {
                        endOfInput();
                        int i7 = 42 / 0;
                    } else {
                        endOfInput();
                    }
                }
            }
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 41 / 0;
            }
            return j2;
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            int i = 2 % 2;
            int i2 = b + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 91 / 0;
                if (this.closed) {
                    return;
                }
            } else if (this.closed) {
                return;
            }
            if (this.bytesRemaining != 0) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                b = i4 % 128;
                int i5 = i4 % 2;
                if (!Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    unexpectedEndOfInput();
                }
            }
            this.closed = true;
        }

        /* JADX WARN: Code duplicated, block: B:114:0x0338 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:32:0x0325  */
        /* JADX WARN: Code duplicated, block: B:34:0x032b  */
        /* JADX WARN: Code duplicated, block: B:37:0x033c  */
        /* JADX WARN: Code duplicated, block: B:39:0x0349 A[Catch: Exception -> 0x069b, TRY_ENTER, TryCatch #4 {Exception -> 0x069b, blocks: (B:35:0x0338, B:39:0x0349, B:42:0x036f, B:41:0x035e), top: B:114:0x0338 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x035e A[Catch: Exception -> 0x069b, TryCatch #4 {Exception -> 0x069b, blocks: (B:35:0x0338, B:39:0x0349, B:42:0x036f, B:41:0x035e), top: B:114:0x0338 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x039a A[Catch: all -> 0x04a3, TryCatch #3 {all -> 0x04a3, blocks: (B:43:0x038d, B:45:0x039a, B:46:0x03d7), top: B:112:0x038d, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0498  */
        /* JADX WARN: Code duplicated, block: B:52:0x049c  */
        /* JADX WARN: Code duplicated, block: B:63:0x04ae A[Catch: Exception -> 0x069d, TRY_LEAVE, TryCatch #2 {Exception -> 0x069d, blocks: (B:48:0x0430, B:53:0x049d, B:54:0x04a0, B:59:0x04a6, B:61:0x04ac, B:62:0x04ad, B:63:0x04ae, B:67:0x04fe, B:73:0x0590, B:75:0x05b1, B:77:0x0602, B:82:0x0670, B:87:0x0693, B:89:0x0699, B:90:0x069a, B:74:0x0595, B:68:0x0511, B:78:0x0615, B:80:0x0622, B:81:0x0669, B:43:0x038d, B:45:0x039a, B:46:0x03d7), top: B:111:0x033a, inners: #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x04fd  */
        /* JADX WARN: Code duplicated, block: B:68:0x0511 A[Catch: Exception -> 0x069d, TRY_LEAVE, TryCatch #2 {Exception -> 0x069d, blocks: (B:48:0x0430, B:53:0x049d, B:54:0x04a0, B:59:0x04a6, B:61:0x04ac, B:62:0x04ad, B:63:0x04ae, B:67:0x04fe, B:73:0x0590, B:75:0x05b1, B:77:0x0602, B:82:0x0670, B:87:0x0693, B:89:0x0699, B:90:0x069a, B:74:0x0595, B:68:0x0511, B:78:0x0615, B:80:0x0622, B:81:0x0669, B:43:0x038d, B:45:0x039a, B:46:0x03d7), top: B:111:0x033a, inners: #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x0579  */
        /* JADX WARN: Code duplicated, block: B:74:0x0595 A[Catch: Exception -> 0x069d, TryCatch #2 {Exception -> 0x069d, blocks: (B:48:0x0430, B:53:0x049d, B:54:0x04a0, B:59:0x04a6, B:61:0x04ac, B:62:0x04ad, B:63:0x04ae, B:67:0x04fe, B:73:0x0590, B:75:0x05b1, B:77:0x0602, B:82:0x0670, B:87:0x0693, B:89:0x0699, B:90:0x069a, B:74:0x0595, B:68:0x0511, B:78:0x0615, B:80:0x0622, B:81:0x0669, B:43:0x038d, B:45:0x039a, B:46:0x03d7), top: B:111:0x033a, inners: #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:80:0x0622 A[Catch: all -> 0x0692, TryCatch #1 {all -> 0x0692, blocks: (B:78:0x0615, B:80:0x0622, B:81:0x0669), top: B:109:0x0615, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x0676  */
        /* JADX WARN: Code duplicated, block: B:85:0x0682  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r32v0, types: [android.content.Context, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r32v1 */
        /* JADX WARN: Type inference failed for: r32v10 */
        /* JADX WARN: Type inference failed for: r32v11 */
        /* JADX WARN: Type inference failed for: r32v12 */
        /* JADX WARN: Type inference failed for: r32v2 */
        /* JADX WARN: Type inference failed for: r32v3 */
        /* JADX WARN: Type inference failed for: r32v4 */
        /* JADX WARN: Type inference failed for: r32v5 */
        /* JADX WARN: Type inference failed for: r32v6 */
        /* JADX WARN: Type inference failed for: r32v7 */
        /* JADX WARN: Type inference failed for: r32v9 */
        /* JADX WARN: Type inference failed for: r3v9 */
        public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            ?? r32;
            int i6;
            ?? r33;
            String str;
            int i7;
            char[] cArr;
            char[] cArr2;
            int maxKeyCode;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            char c;
            int edgeSlop;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i14;
            char[] cArr3;
            char[] cArr4;
            int tapTimeout;
            int i15;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20 = 2 % 2;
            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
            int i22 = i21 % 128;
            b = i22;
            int i23 = i21 % 2;
            int i24 = i22 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
            if (i24 % 2 == 0) {
                throw null;
            }
            if (context != 0) {
                int i25 = (i22 & 9) + (i22 | 9);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
                int i26 = i25 % 2;
                try {
                    int threadPriority = Process.getThreadPriority(0);
                    int iB = zzjq.b();
                    int i27 = ~((-21) | threadPriority);
                    int i28 = ~threadPriority;
                    int i29 = ~((i28 ^ 20) | (i28 & 20));
                    int i30 = (i27 ^ i29) | (i29 & i27);
                    int i31 = ~((iB ^ 20) | (iB & 20));
                    int i32 = ((13180 + (threadPriority * (-657))) - (~(((i30 ^ i31) | (i30 & i31)) * (-658)))) - 1;
                    int i33 = -(-((~(i28 | 20)) * 658));
                    int i34 = (i32 & i33) + (i32 | i33);
                    int i35 = ~threadPriority;
                    int i36 = ~((i35 & 20) | (i35 ^ 20));
                    int i37 = -(-(((i36 & i31) | (i36 ^ i31)) * 658));
                    Object[] objArr2 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{31571, 47783, 341, 37075}, (char) (((i34 ^ i37) + ((i37 & i34) << 1)) >> 6), 1438295929 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0))), new char[]{39492, 25667, 44855, 18957, 39412, 27449, 64381, 4359, 38305, 46646, 18737, 43409, 6708, 63461, 21937, 3799, 13879, 15984, 48375, 42987, 43853, 5336, 30489}, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    char[] cArr5 = {0, 0, 0, 0};
                    char[] cArr6 = {54110, 28799, 35407, 36079};
                    int i38 = -ExpandableListView.getPackedPositionType(0L);
                    int i39 = (i38 * (-445)) - 27288290;
                    int i40 = ~i38;
                    int i41 = ~(i40 | (-61323));
                    int i42 = ~i;
                    int i43 = -(-((i41 | (~(((-61323) & i42) | ((-61323) ^ i42)))) * 446));
                    int i44 = (i39 & i43) + (i39 | i43);
                    int i45 = ~((61322 & i40) | (i40 ^ 61322));
                    int i46 = ~(((-61323) ^ i38) | ((-61323) & i38) | i);
                    int i47 = ~i38;
                    char c2 = (char) (((i44 + (((i45 & i46) | (i45 ^ i46)) * 446)) - (~(-(-((~((i47 & (-61323)) | (i47 ^ (-61323)))) * 446))))) - 1);
                    int mode = View.MeasureSpec.getMode(0);
                    int i48 = b;
                    int i49 = ((i48 | 19) << 1) - (i48 ^ 19);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i49 % 128;
                    int i50 = i49 % 2;
                    Object[] objArr3 = new Object[1];
                    a(cArr5, cArr6, c2, mode, new char[]{59491, 53551, 2938, 47679, 64885, 7051, 30253, 1564, 31322, 52132, 59039, 53315, 2927, 62457, 52075, 7959, 12495, 40338}, objArr3);
                    Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    Object[] objArr4 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{1240, 4452, 49417, 18001}, (char) ((-2) - (~(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{50344, 4828, 64414, 45506, 56900, 9375, 6708, 43615, 7433, 50290, 22010, 47256, 44152, 35791, 62484, 35472, 37849, 9345, 9998, 4264, 5525, 10966, 55324, 30521, 57576, 8659, 3968, 46164, 12604, 5314, 38636, 21015, 10902, 51800}, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    int windowTouchSlop = ViewConfiguration.getWindowTouchSlop();
                    int i51 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i52 = (i51 & 71) + (i51 | 71);
                    b = i52 % 128;
                    int i53 = i52 % 2;
                    int i54 = -(windowTouchSlop >> 8);
                    int iB2 = zzjq.b();
                    int i55 = ~iB2;
                    int i56 = ((((i54 * 522) - 726960) - (~(-(-(((~((i55 ^ 1398) | (i55 & 1398))) | i54) * (-1042)))))) - 1) + (((1398 ^ iB2) | (1398 & iB2)) * 521);
                    int i57 = ~i54;
                    int i58 = ~((i57 ^ (-1399)) | (i57 & (-1399)));
                    int i59 = ~i54;
                    int i60 = ~((i59 ^ iB2) | (iB2 & i59));
                    int i61 = (i60 & i58) | (i58 ^ i60);
                    int i62 = ~((i54 & i55) | (i55 ^ i54) | 1398);
                    int i63 = -(-(((i62 & i61) | (i61 ^ i62)) * 521));
                    int i64 = -AndroidCharacter.getMirror('0');
                    Object[] objArr5 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{36160, 9169, 30447, 64773}, (char) ((i56 & i63) + (i63 | i56)), ((i64 | (-282865219)) << 1) - (i64 ^ (-282865219)), new char[]{44950, 50684, 4128, 40051, 2664}, objArr5);
                    int i65 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i66 = b + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i66 % 128;
                    int i67 = i66 % 2;
                    int i68 = (~(i & 1)) & (i | 1);
                    int i69 = -i65;
                    int i70 = ((i65 & i69) | (i65 ^ i69)) >> 31;
                    int i71 = (~i70) & i;
                    int i72 = i70 & i68;
                    i4 = (i72 & i71) | (i71 ^ i72);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 16949);
                    int i73 = 2738 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int trimmedLength = 13 - TextUtils.getTrimmedLength("");
                    byte[] bArr = $$a;
                    Object[] objArr6 = new Object[1];
                    c((byte) 52, bArr[5], bArr[132], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, i73, trimmedLength, 1501733736, false, (String) objArr6[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maxKeyCode2 = (char) (16949 - (KeyEvent.getMaxKeyCode() >> 16));
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 2739;
                    int iAlpha = 13 - Color.alpha(0);
                    byte b2 = (byte) 52;
                    Object[] objArr7 = new Object[1];
                    c(b2, (short) (b2 - 1), $$a[132], objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode2, capsMode, iAlpha, 47863026, false, (String) objArr7[0], null);
                }
                Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                int i74 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
                b = i74 % 128;
                int i75 = i74 % 2;
                if (!set.contains(obj)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char doubleTapTimeout = (char) (16949 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int trimmedLength2 = 2739 - TextUtils.getTrimmedLength("");
                        int iIndexOf = 13 - TextUtils.indexOf("", "", 0);
                        byte b3 = (byte) 37;
                        Object[] objArr8 = new Object[1];
                        c(b3, (short) (b3 | 66), $$a[132], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, trimmedLength2, iIndexOf, 631063962, false, (String) objArr8[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 - (-21);
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                cArr3 = new char[]{0, 0, 0, 0};
                                cArr4 = new char[]{18996, 28288, 65130, 15741};
                                tapTimeout = ViewConfiguration.getTapTimeout();
                                i15 = 4111;
                            } else {
                                cArr3 = new char[]{0, 0, 0, 0};
                                cArr4 = new char[]{18996, 28288, 65130, 15741};
                                tapTimeout = ViewConfiguration.getTapTimeout();
                                i15 = 32254;
                            }
                            char[] cArr7 = cArr4;
                            Object[] objArr9 = new Object[1];
                            a(cArr3, cArr7, (char) (i15 - (tapTimeout >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{58043, 5195, 16047, 26359, 57480, 32918, 13808, 758, 19706, 22351, 59175, 8428, 11937, 8006, 10667, 25435, 50621, 44637, 36861, 63602, 51613, 36090, 55819, 17415, 43676, 28510, 25329, 64640}, objArr9);
                            Object[] objArr10 = {(String) objArr9[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 993;
                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 8;
                                byte b4 = $$a[7];
                                byte b5 = b4;
                                Object[] objArr11 = new Object[1];
                                c(b5, (short) (b5 | 140), b4, objArr11);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, scrollBarFadeDuration, pressedStateDuration, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr10)).longValue();
                            long j = 544468408;
                            long j2 = (((long) (-523)) * j) + (((long) 263) * jLongValue);
                            long j3 = 262;
                            long j4 = -1;
                            long j5 = ((j ^ j4) | jLongValue) ^ j4;
                            long j6 = jLongValue ^ j4;
                            long j7 = (j | j6) ^ j4;
                            long j8 = i;
                            r33 = i4;
                            long j9 = j2 + ((j5 | j7 | ((j6 | j8) ^ j4)) * j3) + (((long) (-786)) * j7) + (j3 * ((((j8 ^ j4) | j6) ^ j4) | j5 | j7)) + ((long) (-745386645));
                            int i76 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                            b = i76 % 128;
                            int i77 = i76 % 2;
                            int i78 = (int) (j9 >> 32);
                            int i79 = (int) Runtime.getRuntime().totalMemory();
                            i16 = i78 & ((((~((-1198054795) | i79)) | 1227466154) * 398) + 539126034 + (((~((~i79) | (-1198054795))) | 1227466154) * 398));
                            i17 = (int) j9;
                            int i80 = ~((-225012326) | i);
                            int i81 = ~i;
                            i18 = (-464283779) + ((i80 | (~((-1662238736) | i81))) * (-1808)) + (((~((-208153185) | i)) | (~(i81 | (-1645379595)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(1662238735 | i)) | 16859141 | (~(225012325 | i81))) * TypedValues.Custom.TYPE_BOOLEAN);
                            int i82 = b;
                            i19 = (i82 ^ 107) + ((i82 & 107) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                            if (i19 % 2 == 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            i6 = i16 | (i17 & i18);
                        } else {
                            context = i4;
                            Object[] objArr12 = new Object[1];
                            a(new char[]{0, 0, 0, 0}, new char[]{32098, 34861, 54630, 37850}, (char) (ExpandableListView.getPackedPositionType(0L) + 56021), 1720200572 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16)))), new char[]{60345}, objArr12);
                            str = (String) objArr12[0];
                            i7 = b + 53;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                            if (i7 % 2 == 0) {
                                cArr = new char[]{0, 0, 0, 0};
                                cArr2 = new char[]{51041, 45731, 13608, 45916};
                                maxKeyCode = KeyEvent.getMaxKeyCode() >>> 95;
                                i8 = 30134;
                            } else {
                                cArr = new char[]{0, 0, 0, 0};
                                cArr2 = new char[]{51041, 45731, 13608, 45916};
                                maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                i8 = 23605;
                            }
                            char[] cArr8 = cArr;
                            char[] cArr9 = cArr2;
                            int i83 = 51 * maxKeyCode;
                            int i84 = -(-(i8 * (-49)));
                            int i85 = ((i83 | i84) << 1) - (i83 ^ i84);
                            int i86 = -(-(((maxKeyCode ^ i) | (maxKeyCode & i)) * (-50)));
                            int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                            int i88 = ~maxKeyCode;
                            i9 = ~i8;
                            int i89 = i88 | i9;
                            int i90 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                            int i91 = i90 % 128;
                            b = i91;
                            int i92 = i90 % 2;
                            int i93 = ~((i89 & i) | (i89 ^ i));
                            i10 = ~i;
                            int i94 = (i9 ^ i10) | (i9 & i10);
                            i11 = (i87 - (~(-(-(50 * (i93 | (~((i94 & maxKeyCode) | (i94 ^ maxKeyCode))))))))) - 1;
                            i12 = ~i8;
                            i13 = (i91 ^ 55) + ((i91 & 55) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i95 = ((~(maxKeyCode | i10)) | (~((i12 ^ i10) | (i12 & i10))) | (~((i9 ^ maxKeyCode) | (i9 & maxKeyCode)))) * 50;
                                c = (char) ((i11 ^ i95) + ((i95 & i11) << 1));
                                edgeSlop = ViewConfiguration.getEdgeSlop();
                            } else {
                                int i96 = ~(i12 | i10);
                                int i97 = ~(i12 | maxKeyCode);
                                int i98 = ((~((maxKeyCode & i10) | (i10 ^ maxKeyCode))) | (i96 & i97) | (i96 ^ i97)) * 50;
                                c = (char) (((i11 | i98) << 1) - (i98 ^ i11));
                                edgeSlop = ViewConfiguration.getEdgeSlop();
                            }
                            char c4 = c;
                            int i99 = -(edgeSlop >> 16);
                            int iB3 = zzjq.b();
                            int i100 = i99 * (-55);
                            int i101 = ((i100 | 1100927039) << 1) - (i100 ^ 1100927039);
                            int i102 = ~((i99 ^ iB3) | (i99 & iB3));
                            int i103 = i101 + (((i102 & 682795975) | (682795975 ^ i102)) * 56);
                            int i104 = (~((i99 ^ 682795975) | (i99 & 682795975))) * (-56);
                            int i105 = (i103 & i104) + (i104 | i103);
                            int i106 = ~iB3;
                            int i107 = b;
                            int i108 = (i107 & 35) + (i107 | 35);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i108 % 128;
                            int i109 = i108 % 2;
                            int i110 = ~((i106 & 682795975) | (i106 ^ 682795975));
                            int i111 = 56 * ((i99 & i110) | (i99 ^ i110));
                            int i112 = ((i105 | i111) << 1) - (i111 ^ i105);
                            Object[] objArr13 = new Object[1];
                            a(cArr8, cArr9, c4, i112, new char[]{20075, 39545, 53914, 12342, 3571, 49757, 9921, 11957, 24046, 18243, 31377, 46863, 15516}, objArr13);
                            objArr = new Object[]{(String) objArr13[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf("", "") + 33602);
                                int i113 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3085;
                                int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
                                byte b6 = $$a[7];
                                byte b7 = b6;
                                Object[] objArr14 = new Object[1];
                                c(b7, (short) (b7 | 140), b6, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i113, iLastIndexOf, 1411172903, false, (String) objArr14[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i114 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                                b = i114 % 128;
                                int i115 = i114 % 2;
                                i6 = 1;
                                r33 = context;
                            } else {
                                int i116 = b;
                                int i117 = ((i116 | 97) << 1) - (i116 ^ 97);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i117 % 128;
                                int i118 = i117 % 2;
                                i6 = 0;
                                r33 = context;
                            }
                        }
                        int i119 = (i6 | (-i6)) >> 31;
                        int i120 = i2 & 32;
                        int i121 = (i120 | (-i120)) >> 31;
                        int i122 = ((i119 & (~(i & 10)) & (i | 10)) | ((~i119) & i)) & (~i121);
                        int i123 = i121 & i;
                        i5 = (i122 & i123) | (i122 ^ i123);
                        r32 = r33;
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i124 = b + 33;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i124 % 128;
                        int i125 = i124 % 2;
                        i5 = i;
                        r32 = i4;
                    } else {
                        if (Build.VERSION.SDK_INT > 33) {
                            i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 - (-21);
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                cArr3 = new char[]{0, 0, 0, 0};
                                cArr4 = new char[]{18996, 28288, 65130, 15741};
                                tapTimeout = ViewConfiguration.getTapTimeout();
                                i15 = 4111;
                            } else {
                                cArr3 = new char[]{0, 0, 0, 0};
                                cArr4 = new char[]{18996, 28288, 65130, 15741};
                                tapTimeout = ViewConfiguration.getTapTimeout();
                                i15 = 32254;
                            }
                            char[] cArr10 = cArr4;
                            Object[] objArr15 = new Object[1];
                            a(cArr3, cArr10, (char) (i15 - (tapTimeout >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{58043, 5195, 16047, 26359, 57480, 32918, 13808, 758, 19706, 22351, 59175, 8428, 11937, 8006, 10667, 25435, 50621, 44637, 36861, 63602, 51613, 36090, 55819, 17415, 43676, 28510, 25329, 64640}, objArr15);
                            Object[] objArr16 = {(String) objArr15[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c5 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 993;
                                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 8;
                                byte b8 = $$a[7];
                                byte b9 = b8;
                                Object[] objArr17 = new Object[1];
                                c(b9, (short) (b9 | 140), b8, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c5, scrollBarFadeDuration2, pressedStateDuration2, 410748506, false, (String) objArr17[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr16)).longValue();
                            long j10 = 544468408;
                            long j11 = (((long) (-523)) * j10) + (((long) 263) * jLongValue2);
                            long j12 = 262;
                            long j13 = -1;
                            long j14 = ((j10 ^ j13) | jLongValue2) ^ j13;
                            long j15 = jLongValue2 ^ j13;
                            long j16 = (j10 | j15) ^ j13;
                            long j17 = i;
                            r33 = i4;
                            long j18 = j11 + ((j14 | j16 | ((j15 | j17) ^ j13)) * j12) + (((long) (-786)) * j16) + (j12 * ((((j17 ^ j13) | j15) ^ j13) | j14 | j16)) + ((long) (-745386645));
                            int i710 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                            b = i710 % 128;
                            int i711 = i710 % 2;
                            int i712 = (int) (j18 >> 32);
                            int i713 = (int) Runtime.getRuntime().totalMemory();
                            i16 = i712 & ((((~((-1198054795) | i713)) | 1227466154) * 398) + 539126034 + (((~((~i713) | (-1198054795))) | 1227466154) * 398));
                            i17 = (int) j18;
                            int i810 = ~((-225012326) | i);
                            int i811 = ~i;
                            i18 = (-464283779) + ((i810 | (~((-1662238736) | i811))) * (-1808)) + (((~((-208153185) | i)) | (~(i811 | (-1645379595)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(1662238735 | i)) | 16859141 | (~(225012325 | i811))) * TypedValues.Custom.TYPE_BOOLEAN);
                            int i812 = b;
                            i19 = (i812 ^ 107) + ((i812 & 107) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                            if (i19 % 2 == 0) {
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            i6 = i16 | (i17 & i18);
                        } else {
                            context = i4;
                            Object[] objArr18 = new Object[1];
                            a(new char[]{0, 0, 0, 0}, new char[]{32098, 34861, 54630, 37850}, (char) (ExpandableListView.getPackedPositionType(0L) + 56021), 1720200572 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16)))), new char[]{60345}, objArr18);
                            str = (String) objArr18[0];
                            i7 = b + 53;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                            if (i7 % 2 == 0) {
                                cArr = new char[]{0, 0, 0, 0};
                                cArr2 = new char[]{51041, 45731, 13608, 45916};
                                maxKeyCode = KeyEvent.getMaxKeyCode() >>> 95;
                                i8 = 30134;
                            } else {
                                cArr = new char[]{0, 0, 0, 0};
                                cArr2 = new char[]{51041, 45731, 13608, 45916};
                                maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                i8 = 23605;
                            }
                            char[] cArr11 = cArr;
                            char[] cArr12 = cArr2;
                            int i813 = 51 * maxKeyCode;
                            int i814 = -(-(i8 * (-49)));
                            int i815 = ((i813 | i814) << 1) - (i813 ^ i814);
                            int i816 = -(-(((maxKeyCode ^ i) | (maxKeyCode & i)) * (-50)));
                            int i817 = ((i815 | i816) << 1) - (i816 ^ i815);
                            int i818 = ~maxKeyCode;
                            i9 = ~i8;
                            int i819 = i818 | i9;
                            int i910 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                            int i911 = i910 % 128;
                            b = i911;
                            int i912 = i910 % 2;
                            int i913 = ~((i819 & i) | (i819 ^ i));
                            i10 = ~i;
                            int i914 = (i9 ^ i10) | (i9 & i10);
                            i11 = (i817 - (~(-(-(50 * (i913 | (~((i914 & maxKeyCode) | (i914 ^ maxKeyCode))))))))) - 1;
                            i12 = ~i8;
                            i13 = (i911 ^ 55) + ((i911 & 55) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i915 = ((~(maxKeyCode | i10)) | (~((i12 ^ i10) | (i12 & i10))) | (~((i9 ^ maxKeyCode) | (i9 & maxKeyCode)))) * 50;
                                c = (char) ((i11 ^ i915) + ((i915 & i11) << 1));
                                edgeSlop = ViewConfiguration.getEdgeSlop();
                            } else {
                                int i916 = ~(i12 | i10);
                                int i917 = ~(i12 | maxKeyCode);
                                int i918 = ((~((maxKeyCode & i10) | (i10 ^ maxKeyCode))) | (i916 & i917) | (i916 ^ i917)) * 50;
                                c = (char) (((i11 | i918) << 1) - (i918 ^ i11));
                                edgeSlop = ViewConfiguration.getEdgeSlop();
                            }
                            char c6 = c;
                            int i919 = -(edgeSlop >> 16);
                            int iB4 = zzjq.b();
                            int i1010 = i919 * (-55);
                            int i1011 = ((i1010 | 1100927039) << 1) - (i1010 ^ 1100927039);
                            int i1012 = ~((i919 ^ iB4) | (i919 & iB4));
                            int i1013 = i1011 + (((i1012 & 682795975) | (682795975 ^ i1012)) * 56);
                            int i1014 = (~((i919 ^ 682795975) | (i919 & 682795975))) * (-56);
                            int i1015 = (i1013 & i1014) + (i1014 | i1013);
                            int i1016 = ~iB4;
                            int i1017 = b;
                            int i1018 = (i1017 & 35) + (i1017 | 35);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1018 % 128;
                            int i1019 = i1018 % 2;
                            int i1110 = ~((i1016 & 682795975) | (i1016 ^ 682795975));
                            int i1111 = 56 * ((i919 & i1110) | (i919 ^ i1110));
                            int i1112 = ((i1015 | i1111) << 1) - (i1111 ^ i1015);
                            Object[] objArr19 = new Object[1];
                            a(cArr11, cArr12, c6, i1112, new char[]{20075, 39545, 53914, 12342, 3571, 49757, 9921, 11957, 24046, 18243, 31377, 46863, 15516}, objArr19);
                            objArr = new Object[]{(String) objArr19[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cIndexOf2 = (char) (TextUtils.indexOf("", "") + 33602);
                                int i1113 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3085;
                                int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
                                byte b10 = $$a[7];
                                byte b11 = b10;
                                Object[] objArr110 = new Object[1];
                                c(b11, (short) (b11 | 140), b10, objArr110);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, i1113, iLastIndexOf2, 1411172903, false, (String) objArr110[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i1114 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                                b = i1114 % 128;
                                int i1115 = i1114 % 2;
                                i6 = 1;
                                r33 = context;
                            } else {
                                int i1116 = b;
                                int i1117 = ((i1116 | 97) << 1) - (i1116 ^ 97);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1117 % 128;
                                int i1118 = i1117 % 2;
                                i6 = 0;
                                r33 = context;
                            }
                        }
                        int i1119 = (i6 | (-i6)) >> 31;
                        int i126 = i2 & 32;
                        int i127 = (i126 | (-i126)) >> 31;
                        int i128 = ((i1119 & (~(i & 10)) & (i | 10)) | ((~i1119) & i)) & (~i127);
                        int i129 = i127 & i;
                        i5 = (i128 & i129) | (i128 ^ i129);
                        r32 = r33;
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i1210 = b + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1210 % 128;
                    int i1211 = i1210 % 2;
                    i5 = i;
                    r32 = i4;
                } else {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 - (-21);
                                b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    cArr3 = new char[]{0, 0, 0, 0};
                                    cArr4 = new char[]{18996, 28288, 65130, 15741};
                                    tapTimeout = ViewConfiguration.getTapTimeout();
                                    i15 = 4111;
                                } else {
                                    cArr3 = new char[]{0, 0, 0, 0};
                                    cArr4 = new char[]{18996, 28288, 65130, 15741};
                                    tapTimeout = ViewConfiguration.getTapTimeout();
                                    i15 = 32254;
                                }
                                char[] cArr13 = cArr4;
                                Object[] objArr111 = new Object[1];
                                a(cArr3, cArr13, (char) (i15 - (tapTimeout >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{58043, 5195, 16047, 26359, 57480, 32918, 13808, 758, 19706, 22351, 59175, 8428, 11937, 8006, 10667, 25435, 50621, 44637, 36861, 63602, 51613, 36090, 55819, 17415, 43676, 28510, 25329, 64640}, objArr111);
                                try {
                                    Object[] objArr112 = {(String) objArr111[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c7 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                        int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 993;
                                        int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 8;
                                        byte b12 = $$a[7];
                                        byte b13 = b12;
                                        Object[] objArr113 = new Object[1];
                                        c(b13, (short) (b13 | 140), b12, objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c7, scrollBarFadeDuration3, pressedStateDuration3, 410748506, false, (String) objArr113[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr112)).longValue();
                                    long j19 = 544468408;
                                    long j110 = (((long) (-523)) * j19) + (((long) 263) * jLongValue3);
                                    long j111 = 262;
                                    long j112 = -1;
                                    long j113 = ((j19 ^ j112) | jLongValue3) ^ j112;
                                    long j114 = jLongValue3 ^ j112;
                                    long j115 = (j19 | j114) ^ j112;
                                    long j116 = i;
                                    r33 = i4;
                                    long j117 = j110 + ((j113 | j115 | ((j114 | j116) ^ j112)) * j111) + (((long) (-786)) * j115) + (j111 * ((((j116 ^ j112) | j114) ^ j112) | j113 | j115)) + ((long) (-745386645));
                                    int i714 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                                    b = i714 % 128;
                                    int i715 = i714 % 2;
                                    int i716 = (int) (j117 >> 32);
                                    int i717 = (int) Runtime.getRuntime().totalMemory();
                                    i16 = i716 & ((((~((-1198054795) | i717)) | 1227466154) * 398) + 539126034 + (((~((~i717) | (-1198054795))) | 1227466154) * 398));
                                    i17 = (int) j117;
                                    int i8110 = ~((-225012326) | i);
                                    int i8111 = ~i;
                                    i18 = (-464283779) + ((i8110 | (~((-1662238736) | i8111))) * (-1808)) + (((~((-208153185) | i)) | (~(i8111 | (-1645379595)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(1662238735 | i)) | 16859141 | (~(225012325 | i8111))) * TypedValues.Custom.TYPE_BOOLEAN);
                                    int i8112 = b;
                                    i19 = (i8112 ^ 107) + ((i8112 & 107) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    i6 = i16 | (i17 & i18);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                context = i4;
                                Object[] objArr114 = new Object[1];
                                a(new char[]{0, 0, 0, 0}, new char[]{32098, 34861, 54630, 37850}, (char) (ExpandableListView.getPackedPositionType(0L) + 56021), 1720200572 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16)))), new char[]{60345}, objArr114);
                                str = (String) objArr114[0];
                                i7 = b + 53;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                                if (i7 % 2 == 0) {
                                    cArr = new char[]{0, 0, 0, 0};
                                    cArr2 = new char[]{51041, 45731, 13608, 45916};
                                    maxKeyCode = KeyEvent.getMaxKeyCode() >>> 95;
                                    i8 = 30134;
                                } else {
                                    cArr = new char[]{0, 0, 0, 0};
                                    cArr2 = new char[]{51041, 45731, 13608, 45916};
                                    maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                    i8 = 23605;
                                }
                                char[] cArr14 = cArr;
                                char[] cArr15 = cArr2;
                                int i8113 = 51 * maxKeyCode;
                                int i8114 = -(-(i8 * (-49)));
                                int i8115 = ((i8113 | i8114) << 1) - (i8113 ^ i8114);
                                int i8116 = -(-(((maxKeyCode ^ i) | (maxKeyCode & i)) * (-50)));
                                int i8117 = ((i8115 | i8116) << 1) - (i8116 ^ i8115);
                                int i8118 = ~maxKeyCode;
                                i9 = ~i8;
                                int i8119 = i8118 | i9;
                                int i9110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                                int i9111 = i9110 % 128;
                                b = i9111;
                                int i9112 = i9110 % 2;
                                int i9113 = ~((i8119 & i) | (i8119 ^ i));
                                i10 = ~i;
                                int i9114 = (i9 ^ i10) | (i9 & i10);
                                i11 = (i8117 - (~(-(-(50 * (i9113 | (~((i9114 & maxKeyCode) | (i9114 ^ maxKeyCode))))))))) - 1;
                                i12 = ~i8;
                                i13 = (i9111 ^ 55) + ((i9111 & 55) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                                if (i13 % 2 == 0) {
                                    int i9115 = ((~(maxKeyCode | i10)) | (~((i12 ^ i10) | (i12 & i10))) | (~((i9 ^ maxKeyCode) | (i9 & maxKeyCode)))) * 50;
                                    c = (char) ((i11 ^ i9115) + ((i9115 & i11) << 1));
                                    edgeSlop = ViewConfiguration.getEdgeSlop();
                                } else {
                                    int i9116 = ~(i12 | i10);
                                    int i9117 = ~(i12 | maxKeyCode);
                                    int i9118 = ((~((maxKeyCode & i10) | (i10 ^ maxKeyCode))) | (i9116 & i9117) | (i9116 ^ i9117)) * 50;
                                    c = (char) (((i11 | i9118) << 1) - (i9118 ^ i11));
                                    edgeSlop = ViewConfiguration.getEdgeSlop();
                                }
                                char c8 = c;
                                int i9119 = -(edgeSlop >> 16);
                                int iB5 = zzjq.b();
                                int i10110 = i9119 * (-55);
                                int i10111 = ((i10110 | 1100927039) << 1) - (i10110 ^ 1100927039);
                                int i10112 = ~((i9119 ^ iB5) | (i9119 & iB5));
                                int i10113 = i10111 + (((i10112 & 682795975) | (682795975 ^ i10112)) * 56);
                                int i10114 = (~((i9119 ^ 682795975) | (i9119 & 682795975))) * (-56);
                                int i10115 = (i10113 & i10114) + (i10114 | i10113);
                                int i10116 = ~iB5;
                                int i10117 = b;
                                int i10118 = (i10117 & 35) + (i10117 | 35);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10118 % 128;
                                int i10119 = i10118 % 2;
                                int i11110 = ~((i10116 & 682795975) | (i10116 ^ 682795975));
                                int i11111 = 56 * ((i9119 & i11110) | (i9119 ^ i11110));
                                int i11112 = ((i10115 | i11111) << 1) - (i11111 ^ i10115);
                                Object[] objArr115 = new Object[1];
                                a(cArr14, cArr15, c8, i11112, new char[]{20075, 39545, 53914, 12342, 3571, 49757, 9921, 11957, 24046, 18243, 31377, 46863, 15516}, objArr115);
                                try {
                                    objArr = new Object[]{(String) objArr115[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char cIndexOf3 = (char) (TextUtils.indexOf("", "") + 33602);
                                        int i11113 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3085;
                                        int iLastIndexOf3 = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
                                        byte b14 = $$a[7];
                                        byte b15 = b14;
                                        Object[] objArr116 = new Object[1];
                                        c(b15, (short) (b15 | 140), b14, objArr116);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf3, i11113, iLastIndexOf3, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        int i11114 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                                        b = i11114 % 128;
                                        int i11115 = i11114 % 2;
                                        i6 = 1;
                                        r33 = context;
                                    } else {
                                        int i11116 = b;
                                        int i11117 = ((i11116 | 97) << 1) - (i11116 ^ 97);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11117 % 128;
                                        int i11118 = i11117 % 2;
                                        i6 = 0;
                                        r33 = context;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        context = i4;
                    }
                    int i11119 = (i6 | (-i6)) >> 31;
                    int i1212 = i2 & 32;
                    int i1213 = (i1212 | (-i1212)) >> 31;
                    int i1214 = ((i11119 & (~(i & 10)) & (i | 10)) | ((~i11119) & i)) & (~i1213);
                    int i1215 = i1213 & i;
                    i5 = (i1214 & i1215) | (i1214 ^ i1215);
                    r32 = r33;
                }
                int i130 = (~((i & r32) == true ? 1 : 0)) & ((i | r32) == true ? 1 : 0);
                int i131 = -i130;
                int i132 = ((i130 & i131) | (i130 ^ i131)) >> 31;
                int i133 = i5 & (~i132);
                int i134 = r32 & i132;
                int i135 = (i133 & i134) | (i133 ^ i134);
                int[] iArr = new int[1];
                int i136 = i ^ i135;
                int i137 = -i136;
                int i138 = (((i136 & i137) | (i136 ^ i137)) >> 31) & 16;
                Object[] objArr20 = {new int[]{i}, iArr, new int[]{i135}, null};
                int i139 = (((~((-939526469) | i)) | (-1038819200)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1753638592;
                int i140 = ~i;
                int i141 = i139 + ((~((-939526469) | i140)) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                int i142 = ~i138;
                int i143 = ~((i142 ^ i141) | (i142 & i141));
                int i144 = ~i141;
                int i145 = (i144 ^ i138) | (i144 & i138);
                int i146 = (i138 * 450) + (i141 * (-448)) + (((~((i & i145) | (i145 ^ i))) | i143) * 449) + ((~((i142 ^ i141) | (i142 & i141))) * (-1347));
                int i147 = ~(i141 | i142);
                int i148 = (i144 ^ i140) | (i140 & i144);
                int i149 = ~((i148 & i138) | (i148 ^ i138));
                int i150 = ((i147 & i149) | (i147 ^ i149)) * 449;
                int i151 = i3 + (i146 ^ i150) + ((i150 & i146) << 1);
                int i152 = i151 << 13;
                int i153 = ((~i151) & i152) | ((~i152) & i151);
                int i154 = i153 >>> 17;
                int i155 = (i153 | i154) & (~(i153 & i154));
                int i156 = i155 << 5;
                iArr[0] = ((~i155) & i156) | ((~i156) & i155);
                int i157 = b + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i157 % 128;
                if (i157 % 2 != 0) {
                    return objArr20;
                }
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
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
        private static java.lang.String $$e(byte r5, int r6, short r7) {
            /*
                int r6 = r6 * 2
                int r6 = 3 - r6
                byte[] r0 = com.squareup.okhttp.internal.http.Http1xStream.FixedLengthSource.$$c
                int r5 = r5 + 102
                int r7 = r7 * 4
                int r1 = r7 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r5
                r5 = r7
                r4 = r2
                goto L27
            L15:
                r3 = r2
            L16:
                int r6 = r6 + 1
                byte r4 = (byte) r5
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L25:
                r3 = r0[r6]
            L27:
                int r5 = r5 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.Http1xStream.FixedLengthSource.$$e(byte, int, short):java.lang.String");
        }
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final Response.Builder readResponseHeaders() throws IOException {
        return readResponse();
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final ResponseBody openResponseBody(Response response) throws IOException {
        return new RealResponseBody(response.headers(), SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTransferStream(response)));
    }

    private tryToComplete getTransferStream(Response response) throws IOException {
        if (!HttpEngine.hasBody(response)) {
            return newFixedLengthSource(0L);
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return newChunkedSource(this.httpEngine);
        }
        long jContentLength = OkHeaders.contentLength(response);
        if (jContentLength != -1) {
            return newFixedLengthSource(jContentLength);
        }
        return newUnknownLengthSource();
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final void finishRequest() throws IOException {
        this.sink.flush();
    }

    public final void writeRequest(Headers headers, String str) throws IOException {
        if (this.state != 0) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString());
        }
        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str).TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1(headers.name(i)).TuitionPaymentFragmentspecialinlinedviewModeldefault1(": ").TuitionPaymentFragmentspecialinlinedviewModeldefault1(headers.value(i)).TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
        }
        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
        this.state = 1;
    }

    public final Response.Builder readResponse() throws IOException {
        StatusLine statusLine;
        Response.Builder builderHeaders;
        int i = this.state;
        if (i != 1 && i != 3) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString());
        }
        do {
            try {
                statusLine = StatusLine.parse(this.source.IconCompatParcelizer());
                builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(readHeaders());
            } catch (EOFException e2) {
                StringBuilder sb2 = new StringBuilder("unexpected end of stream on ");
                sb2.append(this.streamAllocation);
                IOException iOException = new IOException(sb2.toString());
                iOException.initCause(e2);
                throw iOException;
            }
        } while (statusLine.code == 100);
        this.state = 4;
        return builderHeaders;
    }

    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String strIconCompatParcelizer = this.source.IconCompatParcelizer();
            if (strIconCompatParcelizer.length() != 0) {
                Internal.instance.addLenient(builder, strIconCompatParcelizer);
            } else {
                return builder.build();
            }
        }
    }

    public final SurfaceViewImplementationApi24Impl newChunkedSink() {
        if (this.state != 1) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString());
        }
        this.state = 2;
        return new ChunkedSink();
    }

    public final SurfaceViewImplementationApi24Impl newFixedLengthSink(long j) {
        if (this.state != 1) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString());
        }
        this.state = 2;
        return new FixedLengthSink(j);
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final void writeRequestBody(RetryableSink retryableSink) throws IOException {
        if (this.state != 1) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString());
        }
        this.state = 3;
        retryableSink.writeToSocket(this.sink);
    }

    public final tryToComplete newFixedLengthSource(long j) throws IOException {
        if (this.state != 4) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString());
        }
        this.state = 5;
        return new FixedLengthSource(j);
    }

    public final tryToComplete newChunkedSource(HttpEngine httpEngine) throws IOException {
        if (this.state != 4) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString());
        }
        this.state = 5;
        return new ChunkedSource(httpEngine);
    }

    public final tryToComplete newUnknownLengthSource() throws IOException {
        if (this.state != 4) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString());
        }
        StreamAllocation streamAllocation = this.streamAllocation;
        if (streamAllocation == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.state = 5;
        streamAllocation.noNewStreams();
        return new UnknownLengthSource();
    }

    final class FixedLengthSink implements SurfaceViewImplementationApi24Impl {
        private long bytesRemaining;
        private boolean closed;
        private final ScreenFlashViewExternalSyntheticLambda0 timeout;

        private FixedLengthSink(long j) {
            this.timeout = new ScreenFlashViewExternalSyntheticLambda0(Http1xStream.this.sink.timeout());
            this.bytesRemaining = j;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final cancelPreviousRequest timeout() {
            return this.timeout;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Util.checkOffsetAndCount(rotationProviderListenerWrapper.size, 0L, j);
            if (j <= this.bytesRemaining) {
                Http1xStream.this.sink.write(rotationProviderListenerWrapper, j);
                this.bytesRemaining -= j;
            } else {
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.bytesRemaining);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
        public final void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1xStream.this.sink.flush();
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.bytesRemaining <= 0) {
                Http1xStream.this.detachTimeout(this.timeout);
                Http1xStream.this.state = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }
    }

    final class ChunkedSink implements SurfaceViewImplementationApi24Impl {
        private boolean closed;
        private final ScreenFlashViewExternalSyntheticLambda0 timeout;

        private ChunkedSink() {
            this.timeout = new ScreenFlashViewExternalSyntheticLambda0(Http1xStream.this.sink.timeout());
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final cancelPreviousRequest timeout() {
            return this.timeout;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            Http1xStream.this.sink.notify(j);
            Http1xStream.this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
            Http1xStream.this.sink.write(rotationProviderListenerWrapper, j);
            Http1xStream.this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
        public final void flush() throws IOException {
            synchronized (this) {
                if (this.closed) {
                    return;
                }
                Http1xStream.this.sink.flush();
            }
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (this) {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                Http1xStream.this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1("0\r\n\r\n");
                Http1xStream.this.detachTimeout(this.timeout);
                Http1xStream.this.state = 3;
            }
        }
    }

    abstract class AbstractSource implements tryToComplete {
        protected boolean closed;
        protected final ScreenFlashViewExternalSyntheticLambda0 timeout;

        private AbstractSource() {
            this.timeout = new ScreenFlashViewExternalSyntheticLambda0(Http1xStream.this.source.getTimeout());
        }

        @Override // defpackage.tryToComplete
        /* JADX INFO: renamed from: timeout */
        public cancelPreviousRequest getTimeout() {
            return this.timeout;
        }

        protected final void endOfInput() throws IOException {
            if (Http1xStream.this.state == 5) {
                Http1xStream.this.detachTimeout(this.timeout);
                Http1xStream.this.state = 6;
                if (Http1xStream.this.streamAllocation != null) {
                    Http1xStream.this.streamAllocation.streamFinished(Http1xStream.this);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(Http1xStream.this.state);
            throw new IllegalStateException(sb.toString());
        }

        protected final void unexpectedEndOfInput() {
            if (Http1xStream.this.state != 6) {
                Http1xStream.this.state = 6;
                if (Http1xStream.this.streamAllocation != null) {
                    Http1xStream.this.streamAllocation.noNewStreams();
                    Http1xStream.this.streamAllocation.streamFinished(Http1xStream.this);
                }
            }
        }
    }

    class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpEngine httpEngine;

        ChunkedSource(HttpEngine httpEngine) throws IOException {
            super();
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
            this.httpEngine = httpEngine;
        }

        @Override // defpackage.tryToComplete
        public long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j2 = this.bytesRemainingInChunk;
            if (j2 == 0 || j2 == -1) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long j3 = Http1xStream.this.source.read(rotationProviderListenerWrapper, Math.min(j, this.bytesRemainingInChunk));
            if (j3 == -1) {
                unexpectedEndOfInput();
                throw new ProtocolException("unexpected end of stream");
            }
            this.bytesRemainingInChunk -= j3;
            return j3;
        }

        private void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                Http1xStream.this.source.IconCompatParcelizer();
            }
            try {
                this.bytesRemainingInChunk = Http1xStream.this.source.getInterfaceDescriptor();
                String strTrim = Http1xStream.this.source.IconCompatParcelizer().trim();
                if (this.bytesRemainingInChunk < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    StringBuilder sb = new StringBuilder("expected chunk size and optional extensions but was \"");
                    sb.append(this.bytesRemainingInChunk);
                    sb.append(strTrim);
                    sb.append("\"");
                    throw new ProtocolException(sb.toString());
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    this.httpEngine.receiveHeaders(Http1xStream.this.readHeaders());
                    endOfInput();
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                unexpectedEndOfInput();
            }
            this.closed = true;
        }
    }

    class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        private UnknownLengthSource() {
            super();
        }

        @Override // defpackage.tryToComplete
        public long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long j2 = Http1xStream.this.source.read(rotationProviderListenerWrapper, j);
            if (j2 != -1) {
                return j2;
            }
            this.inputExhausted = true;
            endOfInput();
            return -1L;
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (!this.inputExhausted) {
                unexpectedEndOfInput();
            }
            this.closed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void detachTimeout(ScreenFlashViewExternalSyntheticLambda0 screenFlashViewExternalSyntheticLambda0) {
        cancelPreviousRequest cancelpreviousrequest = screenFlashViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        cancelPreviousRequest cancelpreviousrequest2 = cancelPreviousRequest.NONE;
        Intrinsics.checkNotNullParameter(cancelpreviousrequest2, "");
        screenFlashViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancelpreviousrequest2;
        cancelpreviousrequest.clearDeadline();
        cancelpreviousrequest.clearTimeout();
    }
}
