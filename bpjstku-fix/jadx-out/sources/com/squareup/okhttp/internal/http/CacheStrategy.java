package com.squareup.okhttp.internal.http;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class CacheStrategy {
    public final Response cacheResponse;
    public final Request networkRequest;

    private CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.cacheControl().isPrivate() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isCacheable(com.squareup.okhttp.Response r3, com.squareup.okhttp.Request r4) {
        /*
            int r0 = r3.code()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L59
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L59
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L59
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L59
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L59
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L59
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L59
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L59
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L59
            switch(r0) {
                case 300: goto L59;
                case 301: goto L59;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L58
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.header(r0)
            if (r0 != 0) goto L59
            com.squareup.okhttp.CacheControl r0 = r3.cacheControl()
            int r0 = r0.maxAgeSeconds()
            r1 = -1
            if (r0 != r1) goto L59
            com.squareup.okhttp.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPublic()
            if (r0 != 0) goto L59
            com.squareup.okhttp.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPrivate()
            if (r0 != 0) goto L59
        L58:
            return r2
        L59:
            com.squareup.okhttp.CacheControl r3 = r3.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L6f
            com.squareup.okhttp.CacheControl r3 = r4.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L6f
            r3 = 1
            return r3
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.CacheStrategy.isCacheable(com.squareup.okhttp.Response, com.squareup.okhttp.Request):boolean");
    }

    public static class Factory {
        private int ageSeconds;
        final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        final long nowMillis;
        private long receivedResponseMillis;
        final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;
        private static final byte[] $$c = {118, 35, -100, -35};
        private static final int $$d = 2;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {81, -102, -70, -91, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 240;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int b = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        private static char TuitionPaymentFragmentbindingInflater1 = 45683;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.squareup.okhttp.internal.http.CacheStrategy.Factory.$$a
                int r7 = r7 * 2
                int r1 = 53 - r7
                int r6 = r6 * 2
                int r6 = 84 - r6
                int r8 = r8 + 4
                byte[] r1 = new byte[r1]
                int r7 = 52 - r7
                r2 = 0
                if (r0 != 0) goto L17
                r6 = r7
                r3 = r8
                r4 = r2
                goto L2f
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r8 = r8 + 1
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2f:
                int r6 = r6 + r8
                int r6 = r6 + (-11)
                r8 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.CacheStrategy.Factory.c(byte, byte, int, java.lang.Object[]):void");
        }

        public Factory(long j, Request request, Response response) {
            this.ageSeconds = -1;
            this.nowMillis = j;
            this.request = request;
            this.cacheResponse = response;
            if (response != null) {
                Headers headers = response.headers();
                int size = headers.size();
                int i = b + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
                for (int i4 = 0; i4 < size; i4++) {
                    String strName = headers.name(i4);
                    String strValue = headers.value(i4);
                    if ("Date".equalsIgnoreCase(strName)) {
                        this.servedDate = HttpDate.parse(strValue);
                        this.servedDateString = strValue;
                    } else if ("Expires".equalsIgnoreCase(strName)) {
                        this.expires = HttpDate.parse(strValue);
                        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                        b = i5 % 128;
                        int i6 = i5 % 2;
                    } else if ("Last-Modified".equalsIgnoreCase(strName)) {
                        this.lastModified = HttpDate.parse(strValue);
                        this.lastModifiedString = strValue;
                    } else if ("ETag".equalsIgnoreCase(strName)) {
                        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
                        b = i7 % 128;
                        int i8 = i7 % 2;
                        this.etag = strValue;
                    } else if ("Age".equalsIgnoreCase(strName)) {
                        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            this.ageSeconds = HeaderParser.parseSeconds(strValue, -1);
                            throw null;
                        }
                        this.ageSeconds = HeaderParser.parseSeconds(strValue, -1);
                    } else if (OkHeaders.SENT_MILLIS.equalsIgnoreCase(strName)) {
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                        b = i10 % 128;
                        if (i10 % 2 == 0) {
                            this.sentRequestMillis = Long.parseLong(strValue);
                            throw null;
                        }
                        this.sentRequestMillis = Long.parseLong(strValue);
                    } else if (!(!OkHeaders.RECEIVED_MILLIS.equalsIgnoreCase(strName))) {
                        this.receivedResponseMillis = Long.parseLong(strValue);
                    }
                }
            }
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
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i6 = $10 + 53;
                $11 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMyPid = (char) (8328 - (Process.myPid() >> 22));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1235;
                        int pressedStateDuration = 35 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b2 = (byte) ($$d - i2);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, iCombineMeasuredStates, pressedStateDuration, -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2765;
                        int maximumFlingVelocity = 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i8 = $$d;
                        byte b4 = (byte) (i8 - 2);
                        byte b5 = (byte) i8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, bitsPerPixel, maximumFlingVelocity, 1504416861, false, $$e(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 253, (ViewConfiguration.getTapTimeout() >> 16) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 65200);
                        int iIndexOf = 2891 - TextUtils.indexOf("", "", 0);
                        int capsMode = 17 - TextUtils.getCapsMode("", 0, 0);
                        byte b6 = (byte) ($$d - 2);
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, iIndexOf, capsMode, 2012627446, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
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

        /* JADX WARN: Multi-variable type inference failed */
        public CacheStrategy get() {
            int i = 2 % 2;
            int i2 = b + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            CacheStrategy candidate = getCandidate();
            Object obj = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (candidate.networkRequest != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    this.request.cacheControl().onlyIfCached();
                    throw null;
                }
                if (this.request.cacheControl().onlyIfCached()) {
                    candidate = new CacheStrategy(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0);
                }
            }
            int i5 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                return candidate;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (hasConditions(r14.request) == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        
            if (hasConditions(r14.request) == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        
            r3 = com.squareup.okhttp.internal.http.CacheStrategy.Factory.b + 115;
            com.squareup.okhttp.internal.http.CacheStrategy.Factory.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        
            if ((r3 % 2) == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        
            r5 = cacheResponseAge();
            r7 = computeFreshnessLifetime();
            r9 = 91 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        
            if (r1.maxAgeSeconds() == (-1)) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
        
            r5 = cacheResponseAge();
            r7 = computeFreshnessLifetime();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
        
            if (r1.maxAgeSeconds() == (-1)) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        
            r7 = java.lang.Math.min(r7, java.util.concurrent.TimeUnit.SECONDS.toMillis(r1.maxAgeSeconds()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
        
            r9 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
        
            if (r1.minFreshSeconds() == (-1)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
        
            r11 = java.util.concurrent.TimeUnit.SECONDS.toMillis(r1.minFreshSeconds());
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
        
            r11 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
        
            r3 = r14.cacheResponse.cacheControl();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
        
            if (r3.mustRevalidate() != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
        
            if (r1.maxStaleSeconds() == (-1)) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
        
            r4 = com.squareup.okhttp.internal.http.CacheStrategy.Factory.b + 41;
            com.squareup.okhttp.internal.http.CacheStrategy.Factory.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r4 % 128;
            r4 = r4 % 2;
            r9 = java.util.concurrent.TimeUnit.SECONDS.toMillis(r1.maxStaleSeconds());
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
        
            if (r3.noCache() != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
        
            r11 = r11 + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00f0, code lost:
        
            if (r11 >= (r9 + r7)) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
        
            r0 = r14.cacheResponse.newBuilder();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
        
            if (r11 < r7) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
        
            r0.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
        
            if (r5 <= androidx.compose.material3.CalendarModelKt.MillisecondsIn24Hours) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x010f, code lost:
        
            if (isFreshnessLifetimeHeuristic() == true) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0112, code lost:
        
            r0.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
        
            return new com.squareup.okhttp.internal.http.CacheStrategy(r2 == true ? 1 : 0, r0.build(), r2 == true ? 1 : 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
        
            r1 = r14.request.newBuilder();
            r3 = r14.etag;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0129, code lost:
        
            if (r3 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        
            r4 = com.squareup.okhttp.internal.http.CacheStrategy.Factory.b + 21;
            com.squareup.okhttp.internal.http.CacheStrategy.Factory.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r4 % 128;
            r4 = r4 % 2;
            r1.header("If-None-Match", r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x013e, code lost:
        
            if (r14.lastModified == null) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
        
            r1.header("If-Modified-Since", r14.lastModifiedString);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0148, code lost:
        
            if (r14.servedDate == null) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
        
            r1.header("If-Modified-Since", r14.servedDateString);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x014f, code lost:
        
            r0 = r1.build();
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0157, code lost:
        
            if (hasConditions(r0) == false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0160, code lost:
        
            return new com.squareup.okhttp.internal.http.CacheStrategy(r0, r14.cacheResponse, r2 == true ? 1 : 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0166, code lost:
        
            return new com.squareup.okhttp.internal.http.CacheStrategy(r0, r2 == true ? 1 : 0, r2 == true ? 1 : 0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.squareup.okhttp.internal.http.CacheStrategy getCandidate() {
            /*
                Method dump skipped, instruction units count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.CacheStrategy.Factory.getCandidate():com.squareup.okhttp.internal.http.CacheStrategy");
        }

        private long computeFreshnessLifetime() {
            long time;
            int i = 2 % 2;
            CacheControl cacheControl = this.cacheResponse.cacheControl();
            if (cacheControl.maxAgeSeconds() != -1) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                b = i2 % 128;
                int i3 = i2 % 2;
                return TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds());
            }
            if (this.expires != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                b = i4 % 128;
                int i5 = i4 % 2;
                Date date = this.servedDate;
                long time2 = this.expires.getTime() - (date != null ? date.getTime() : this.receivedResponseMillis);
                if (time2 <= 0) {
                    return 0L;
                }
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 80 / 0;
                }
                return time2;
            }
            if (this.lastModified != null) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                b = i8 % 128;
                Object obj = null;
                if (i8 % 2 == 0) {
                    this.cacheResponse.request().httpUrl().query();
                    obj.hashCode();
                    throw null;
                }
                if (this.cacheResponse.request().httpUrl().query() == null) {
                    Date date2 = this.servedDate;
                    if (date2 != null) {
                        int i9 = b + 59;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                        int i10 = i9 % 2;
                        time = date2.getTime();
                    } else {
                        time = this.sentRequestMillis;
                    }
                    long time3 = time - this.lastModified.getTime();
                    if (time3 > 0) {
                        long j = time3 / 10;
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                        b = i11 % 128;
                        if (i11 % 2 != 0) {
                            return j;
                        }
                        throw null;
                    }
                }
            }
            return 0L;
        }

        private long cacheResponseAge() {
            Date date;
            int i = 2 % 2;
            int i2 = b + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            long jMax = 0;
            if (i2 % 2 == 0 ? (date = this.servedDate) != null : (date = this.servedDate) != null) {
                jMax = Math.max(0L, this.receivedResponseMillis - date.getTime());
            }
            if (this.ageSeconds != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(this.ageSeconds));
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                b = i3 % 128;
                int i4 = i3 % 2;
            }
            long j = this.receivedResponseMillis;
            return jMax + (j - this.sentRequestMillis) + (this.nowMillis - j);
        }

        private boolean isFreshnessLifetimeHeuristic() throws Throwable {
            long j;
            int i = 2 % 2;
            int i2 = b + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46400), 41 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{57866, 45019, 57935, 27260}, (char) ((-1) - Process.getGidForName("")), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{32198, 33538, 6465, 27461, 44761, 39771, 52836, 25906, 57715, 11608, 24501, 15882, 47863, 37834, 64834, 65133, 43725, 5684, 20809, 60140, 20377, 14077}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{40239, 17969, 13709, 6023}, (char) (34613 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (-1924779619) + (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{4790, 52761, 1306, 26699, 23896, 60310, 45397, 12961, 13409, 33514, 58205, 38435, 27517, 23059, 33333}, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j2 = -1;
            long j3 = 659398918115444201L ^ j2;
            long jIdentityHashCode = System.identityHashCode(this);
            long j4 = jIdentityHashCode ^ j2;
            long j5 = (((long) 302) * 659398918115444201L) + (((long) TypedValues.MotionType.TYPE_EASING) * 1437858256626514786L) + (((long) (-602)) * (((j3 | j4) ^ j2) | 1437858256626514786L)) + (((long) (-301)) * (((j3 | (j2 ^ 1437858256626514786L)) ^ j2) | ((jIdentityHashCode | j3) ^ j2) | ((j4 | 2015061731182510059L) ^ j2))) + (((long) 301) * (j2 ^ (j4 | 1437858256626514786L)));
            int i5 = 0;
            while (true) {
                if (i5 != 10) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 37836), (ViewConfiguration.getScrollBarSize() >> 8) + 59, 18 - (Process.myTid() >> 22), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    int i7 = 0;
                    long j6 = jLongValue;
                    while (true) {
                        int i8 = 0;
                        while (i8 != 8) {
                            i6 = (((((int) (j6 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                            i8++;
                            j5 = j5;
                        }
                        j = j5;
                        if (i7 != 0) {
                            break;
                        }
                        i7++;
                        j6 = j;
                        j5 = j6;
                    }
                    if (i6 == i4) {
                        break;
                    }
                    jLongValue -= 1024;
                    i5++;
                    int i9 = b + 1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                    j5 = j;
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{46696, 23416, 41721, 32690}, (char) (45730 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf("", "", 0), new char[]{9688, 47321, 51242, 45853, 19718, 33755, 33513, 58602, 62375, 8455, 20596, 27714, 41780, 54473, 60446, 9125}, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{23561, 27767, 17810, 31125}, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 38214), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{9356, 62652, 51089, 56955, 26488, 18756, 62481, 50748, 46821, 56517, 4903, 63156, 60463, 29115, 12981, 34643}, objArr4);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr5 = {-930555336};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46037), ((Process.getThreadPriority(0) + 20) >> 6) + 1134, Color.argb(0, 0, 0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 297660214, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                            int i11 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                            byte[] bArr = $$a;
                            byte b2 = bArr[7];
                            Object[] objArr7 = new Object[1];
                            c(b2, b2, bArr[5], objArr7);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i11, deadChar, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.getGidForName("") + 45994), View.MeasureSpec.getSize(0) + 1117, 17 - TextUtils.indexOf("", "", 0)), Boolean.TYPE});
                        }
                        Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                        if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                            break;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[0];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                            throw null;
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
            }
            if (this.cacheResponse.cacheControl().maxAgeSeconds() != -1 || this.expires != null) {
                return false;
            }
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            b = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }

        private static boolean hasConditions(Request request) {
            int i = 2 % 2;
            if (request.header("If-Modified-Since") == null) {
                int i2 = b + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                if (request.header("If-None-Match") == null) {
                    int i4 = b + 71;
                    int i5 = i4 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
                    boolean z = i4 % 2 != 0;
                    int i6 = i5 + 105;
                    b = i6 % 128;
                    if (i6 % 2 != 0) {
                        return z;
                    }
                    throw null;
                }
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, short r7, short r8) {
            /*
                int r8 = r8 * 2
                int r8 = r8 + 4
                int r7 = r7 + 102
                byte[] r0 = com.squareup.okhttp.internal.http.CacheStrategy.Factory.$$c
                int r6 = r6 * 2
                int r6 = r6 + 1
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r6
                r7 = r8
                r3 = r2
                goto L28
            L15:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L19:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                r4 = r0[r7]
            L28:
                int r8 = r8 + r4
                int r7 = r7 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.CacheStrategy.Factory.$$e(short, short, short):java.lang.String");
        }
    }
}
