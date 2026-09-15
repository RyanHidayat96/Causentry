package com.squareup.okhttp.internal.http;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.framed.FramedStream;
import com.squareup.okhttp.internal.framed.Header;
import defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.abortCapture;
import defpackage.initSession;
import defpackage.tryToComplete;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class Http2xStream implements HttpStream {
    private static final ByteString CONNECTION;
    private static final ByteString ENCODING;
    private static final ByteString HOST;
    private static final List<ByteString> HTTP_2_SKIPPED_REQUEST_HEADERS;
    private static final List<ByteString> HTTP_2_SKIPPED_RESPONSE_HEADERS;
    private static final ByteString KEEP_ALIVE;
    private static final ByteString PROXY_CONNECTION;
    private static final List<ByteString> SPDY_3_SKIPPED_REQUEST_HEADERS;
    private static final List<ByteString> SPDY_3_SKIPPED_RESPONSE_HEADERS;
    private static final ByteString TE;
    private static final ByteString TRANSFER_ENCODING;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final ByteString UPGRADE;
    private final FramedConnection framedConnection;
    private HttpEngine httpEngine;
    private FramedStream stream;
    private final StreamAllocation streamAllocation;
    private static final byte[] $$c = {80, -8, 43, 65};
    private static final int $$f = 68;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -4, -4, -5, 8, -24, 20, -16, 7, -13, 3, -4, -18, 4, -8, -1, -1, -58, 73, -3, -14, 6};
    private static final int $$e = 65;
    private static final byte[] $$a = {117, 57, 101, -72, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 149;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 11 - r7
            int r8 = r8 * 3
            int r8 = 100 - r8
            byte[] r0 = com.squareup.okhttp.internal.http.Http2xStream.$$a
            int r9 = r9 * 10
            int r9 = 13 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-5)
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.Http2xStream.a(short, int, short, java.lang.Object[]):void");
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
    private static void d(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.squareup.okhttp.internal.http.Http2xStream.$$d
            int r7 = r7 * 53
            int r7 = 57 - r7
            int r9 = r9 * 53
            int r9 = 54 - r9
            int r8 = r8 + 98
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L19:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r7 = r7 + r3
            int r8 = r8 + 1
            int r7 = r7 + 3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.Http2xStream.d(short, byte, int, java.lang.Object[]):void");
    }

    static /* synthetic */ StreamAllocation access$000(Http2xStream http2xStream) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 69;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        StreamAllocation streamAllocation = http2xStream.streamAllocation;
        int i5 = i2 + 107;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return streamAllocation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("connection");
        CONNECTION = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("host");
        HOST = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("keep-alive");
        KEEP_ALIVE = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("proxy-connection");
        PROXY_CONNECTION = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("transfer-encoding");
        TRANSFER_ENCODING = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("te");
        TE = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault7 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("encoding");
        ENCODING = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault8 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("upgrade");
        UPGRADE = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        SPDY_3_SKIPPED_REQUEST_HEADERS = Util.immutableList(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault5, Header.TARGET_METHOD, Header.TARGET_PATH, Header.TARGET_SCHEME, Header.TARGET_AUTHORITY, Header.TARGET_HOST, Header.VERSION);
        SPDY_3_SKIPPED_RESPONSE_HEADERS = Util.immutableList(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault5);
        HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault6, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault5, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault7, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault8, Header.TARGET_METHOD, Header.TARGET_PATH, Header.TARGET_SCHEME, Header.TARGET_AUTHORITY, Header.TARGET_HOST, Header.VERSION);
        HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault6, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault5, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault7, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault8);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 77 / 0;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 49;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 1356, (ViewConfiguration.getTapTimeout() >> 16) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 47772), 468 - TextUtils.getTrimmedLength(""), 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 61;
                $10 = i6 % 128;
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
        int i8 = $11 + 81;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 12 / 0;
        }
    }

    public Http2xStream(StreamAllocation streamAllocation, FramedConnection framedConnection) {
        this.streamAllocation = streamAllocation;
        this.framedConnection = framedConnection;
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final void setHttpEngine(HttpEngine httpEngine) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 33;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.httpEngine = httpEngine;
        int i5 = i2 + 29;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final SurfaceViewImplementationApi24Impl createRequestBody(Request request, long j) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        SurfaceViewImplementationApi24Impl sink = this.stream.getSink();
        int i4 = b + 73;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return sink;
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final void writeRequestHeaders(Request request) throws IOException {
        List<Header> listSpdy3HeadersList;
        int i = 2 % 2;
        int i2 = b + 97;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.stream != null) {
            return;
        }
        this.httpEngine.writingRequestHeaders();
        boolean zPermitsRequestBody = this.httpEngine.permitsRequestBody(request);
        if (this.framedConnection.getProtocol() == Protocol.HTTP_2) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 83;
            b = i3 % 128;
            int i4 = i3 % 2;
            listSpdy3HeadersList = http2HeadersList(request);
            int i5 = b + 47;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            listSpdy3HeadersList = spdy3HeadersList(request);
        }
        FramedStream framedStreamNewStream = this.framedConnection.newStream(listSpdy3HeadersList, zPermitsRequestBody, true);
        this.stream = framedStreamNewStream;
        framedStreamNewStream.readTimeout().timeout(this.httpEngine.client.getReadTimeout(), TimeUnit.MILLISECONDS);
        this.stream.writeTimeout().timeout(this.httpEngine.client.getWriteTimeout(), TimeUnit.MILLISECONDS);
    }

    class StreamFinishingSource extends RotationProviderListenerWrapperExternalSyntheticLambda0 {
        public StreamFinishingSource(tryToComplete trytocomplete) {
            super(trytocomplete);
        }

        @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2xStream.access$000(Http2xStream.this).streamFinished(Http2xStream.this);
            super.close();
        }
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final void writeRequestBody(RetryableSink retryableSink) throws Throwable {
        Object[] objArr;
        char c = 2;
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 876;
            int iMyPid = 10 - (Process.myPid() >> 22);
            byte b2 = $$a[11];
            byte b3 = (byte) (b2 + 1);
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iKeyCodeFromString, iMyPid, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{3622, 4055, 33762, 53368, 3655, 15641, 59078, 18410, 50377, 62110, 44102, 45622, 39753, 51204, 31116, 64715, 20959, 40324, 18262, 10109, 9291, 21300, 3278, 4599, 64197, 10396}, KeyEvent.keyCodeFromString(""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{2207, 37493, 21021, 1501, 2298, 41145, 14140, 37453, 49772, 28464, 32185, 26607, 40442, 21940, 43057, 10569, 22390, '8', 38584}, ViewConfiguration.getScrollBarSize() >> 8, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
            int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr = $$a;
            byte b4 = bArr[8];
            byte b5 = bArr[11];
            Object[] objArr5 = new Object[1];
            a(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i4, iIndexOf, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int iAlpha = 876 - Color.alpha(0);
                int iKeyCodeFromString2 = 10 - KeyEvent.keyCodeFromString("");
                byte b6 = (byte) 3;
                Object[] objArr6 = new Object[1];
                a(b6, (byte) (b6 - 2), $$a[11], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, iAlpha, iKeyCodeFromString2, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = (((1704704701 + (((~(elapsedCpuTime | (-524186989))) | (-564497218)) * (-465))) + (((-524186989) | (~((-564497218) | elapsedCpuTime))) * 930)) + ((elapsedCpuTime | (-19136833)) * 465)) - 466836153;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{38579, 23238, 35757, 25285, 38617, 26631, 61083, 62788, 23581, 42890, 41996, 203, 980, 40264, 29118, 20060, 51520, 51346, 20232, 38344}, KeyEvent.getDeadChar(0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{51945, 34383, 17511, 35682, 51840, 46219, 8514, 7404, 29, 31494, 27603, 59771, 24481, 16782, 48724, 42986, 38186, 5120, 32963, 31847}, ViewConfiguration.getLongPressTimeout() >> 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i8 = b + 21;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -466836153};
                byte[] bArr2 = $$d;
                byte b7 = (byte) (-bArr2[50]);
                byte b8 = b7;
                Object[] objArr11 = new Object[1];
                d(b7, b8, (byte) (b8 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b9 = bArr2[50];
                byte b10 = (byte) (b9 + 1);
                Object[] objArr12 = new Object[1];
                d(b10, b10, (byte) (-b9), objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i10 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                    byte b11 = (byte) 3;
                    Object[] objArr14 = new Object[1];
                    a(b11, (byte) (b11 - 2), $$a[11], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, i10, scrollDefaultDelay, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{3622, 4055, 33762, 53368, 3655, 15641, 59078, 18410, 50377, 62110, 44102, 45622, 39753, 51204, 31116, 64715, 20959, 40324, 18262, 10109, 9291, 21300, 3278, 4599, 64197, 10396}, TextUtils.lastIndexOf("", '0') + 1, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{2207, 37493, 21021, 1501, 2298, 41145, 14140, 37453, 49772, 28464, 32185, 26607, 40442, 21940, 43057, 10569, 22390, '8', 38584}, Color.red(0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 876;
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 10;
                        byte[] bArr3 = $$a;
                        byte b12 = bArr3[8];
                        byte b13 = bArr3[11];
                        Object[] objArr17 = new Object[1];
                        a(b12, b13, b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, iIndexOf2, iCombineMeasuredStates, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int iMakeMeasureSpec = 876 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                        byte b14 = $$a[11];
                        byte b15 = (byte) (b14 + 1);
                        Object[] objArr18 = new Object[1];
                        a(b14, b15, b15, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, iMakeMeasureSpec, pressedStateDuration, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
                    c = 2;
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr == null) {
                throw null;
            }
            int i11 = TuitionPaymentFragmentbindingInflater1 + 95;
            b = i11 % 128;
            int i12 = i11 % 2;
            for (String str : strArr) {
                int i13 = TuitionPaymentFragmentbindingInflater1 + 21;
                b = i13 % 128;
                int i14 = i13 % 2;
                arrayList.add(str);
            }
            throw null;
        }
        int i15 = TuitionPaymentFragmentbindingInflater1 + 103;
        b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i18 = ~iIdentityHashCode;
        int i19 = i17 + (-1504725095) + (((~((-813472176) | i18)) | (-773161947)) * (-602)) + (((~(iIdentityHashCode | (-813472176))) | 275257381 | (~((-234947153) | i18))) * (-301)) + ((~(i18 | (-773161947))) * 301);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr19[1])[0] = i21 ^ (i21 << 5);
        int i22 = b + 93;
        TuitionPaymentFragmentbindingInflater1 = i22 % 128;
        int i23 = i22 % 2;
        retryableSink.writeToSocket(this.stream.getSink());
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final void finishRequest() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.stream.getSink().close();
        int i4 = b + 39;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final Response.Builder readResponseHeaders() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            this.framedConnection.getProtocol();
            Protocol protocol = Protocol.HTTP_2;
            throw null;
        }
        if (this.framedConnection.getProtocol() == Protocol.HTTP_2) {
            Response.Builder http2HeadersList = readHttp2HeadersList(this.stream.getResponseHeaders());
            int i3 = TuitionPaymentFragmentbindingInflater1 + 7;
            b = i3 % 128;
            int i4 = i3 % 2;
            return http2HeadersList;
        }
        return readSpdy3HeadersList(this.stream.getResponseHeaders());
    }

    public static List<Header> spdy3HeadersList(Request request) {
        int i = 2 % 2;
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 5);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.httpUrl())));
        arrayList.add(new Header(Header.VERSION, "HTTP/1.1"));
        arrayList.add(new Header(Header.TARGET_HOST, Util.hostHeader(request.httpUrl())));
        arrayList.add(new Header(Header.TARGET_SCHEME, request.httpUrl().scheme()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = b + 125;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(headers.name(i2).toLowerCase(Locale.US));
            if (!SPDY_3_SKIPPED_REQUEST_HEADERS.contains(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                int i5 = TuitionPaymentFragmentbindingInflater1 + 5;
                b = i5 % 128;
                int i6 = i5 % 2;
                String strValue = headers.value(i2);
                if (linkedHashSet.add(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                    arrayList.add(new Header(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, strValue));
                    int i7 = b + 109;
                    TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        int i10 = TuitionPaymentFragmentbindingInflater1 + 103;
                        b = i10 % 128;
                        int i11 = i10 % 2;
                        if (!(!((Header) arrayList.get(i9)).name.equals(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
                            ByteString byteString = ((Header) arrayList.get(i9)).value;
                            String str = byteString.utf8;
                            if (str == null) {
                                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                                String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
                                byteString.utf8 = str2;
                                str = str2;
                            }
                            arrayList.set(i9, new Header(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, joinOnNull(str, strValue)));
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static String joinOnNull(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(str);
        sb.append((char) 0);
        sb.append(str2);
        String string = sb.toString();
        int i2 = b + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static List<Header> http2HeadersList(Request request) {
        int i = 2 % 2;
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.httpUrl())));
        arrayList.add(new Header(Header.TARGET_AUTHORITY, Util.hostHeader(request.httpUrl())));
        arrayList.add(new Header(Header.TARGET_SCHEME, request.httpUrl().scheme()));
        int size = headers.size();
        int i2 = b + 31;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 4;
        }
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = b + 47;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(headers.name(i4).toLowerCase(Locale.US));
            if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                arrayList.add(new Header(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, headers.value(i4)));
            }
        }
        return arrayList;
    }

    public static Response.Builder readSpdy3HeadersList(List<Header> list) throws IOException {
        int i = 2 % 2;
        Headers.Builder builder = new Headers.Builder();
        int size = list.size();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 % 5;
        }
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 105;
            b = i5 % 128;
            int i6 = i5 % 2;
            ByteString byteString = list.get(i4).name;
            ByteString byteString2 = list.get(i4).value;
            String str3 = byteString2.utf8;
            if (str3 == null) {
                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                String str4 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
                byteString2.utf8 = str4;
                str3 = str4;
            }
            int i7 = 0;
            while (i7 < str3.length()) {
                int iIndexOf = str3.indexOf(0, i7);
                if (iIndexOf == -1) {
                    int i8 = b + 97;
                    TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                    int i9 = i8 % 2;
                    iIndexOf = str3.length();
                }
                String strSubstring = str3.substring(i7, iIndexOf);
                if (byteString.equals(Header.RESPONSE_STATUS)) {
                    int i10 = b + 87;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                    str = strSubstring;
                } else if (byteString.equals(Header.VERSION)) {
                    str2 = strSubstring;
                } else if (!SPDY_3_SKIPPED_RESPONSE_HEADERS.contains(byteString)) {
                    String str5 = byteString.utf8;
                    if (str5 == null) {
                        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
                        String str6 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, Charsets.UTF_8);
                        byteString.utf8 = str6;
                        str5 = str6;
                    }
                    builder.add(str5, strSubstring);
                }
                i7 = iIndexOf + 1;
            }
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        StatusLine statusLine = StatusLine.parse(sb.toString());
        return new Response.Builder().protocol(Protocol.SPDY_3).code(statusLine.code).message(statusLine.message).headers(builder.build());
    }

    public static Response.Builder readHttp2HeadersList(List<Header> list) throws IOException {
        int i = 2 % 2;
        Headers.Builder builder = new Headers.Builder();
        int size = list.size();
        String str = null;
        int i2 = 0;
        while (i2 < size) {
            ByteString byteString = list.get(i2).name;
            ByteString byteString2 = list.get(i2).value;
            String str2 = byteString2.utf8;
            if (str2 == null) {
                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                String str3 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
                byteString2.utf8 = str3;
                str2 = str3;
            }
            if (byteString.equals(Header.RESPONSE_STATUS)) {
                str = str2;
            } else if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(byteString)) {
                int i3 = b + 7;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                int i4 = i3 % 2;
                String str4 = byteString.utf8;
                if (str4 == null) {
                    byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
                    String str5 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, Charsets.UTF_8);
                    byteString.utf8 = str5;
                    str4 = str5;
                }
                builder.add(str4, str2);
                int i5 = b + 91;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
            }
            i2++;
            int i7 = TuitionPaymentFragmentbindingInflater1 + 9;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        StatusLine statusLine = StatusLine.parse("HTTP/1.1 ".concat(String.valueOf(str)));
        return new Response.Builder().protocol(Protocol.HTTP_2).code(statusLine.code).message(statusLine.message).headers(builder.build());
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final ResponseBody openResponseBody(Response response) throws IOException {
        int i = 2 % 2;
        RealResponseBody realResponseBody = new RealResponseBody(response.headers(), SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new StreamFinishingSource(this.stream.getSource())));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return realResponseBody;
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public final void cancel() {
        FramedStream framedStream;
        int i = 2 % 2;
        int i2 = b + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            framedStream = this.stream;
            int i3 = 57 / 0;
            if (framedStream == null) {
                return;
            }
        } else {
            framedStream = this.stream;
            if (framedStream == null) {
                return;
            }
        }
        framedStream.closeLater(ErrorCode.CANCEL);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 37;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1411179699822602042L;
    }

    private static String $$g(int i, int i2, short s) {
        int i3 = s * 3;
        byte[] bArr = $$c;
        int i4 = 107 - (i * 3);
        int i5 = 3 - (i2 * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4 += i5;
            i5 = i5;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i5 + 1;
            i4 = bArr[i9] + i4;
            i5 = i9;
            i7 = i8;
        }
    }
}
