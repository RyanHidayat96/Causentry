package com.squareup.okhttp;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.RotationProviderListenerWrapper;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.io.EOFException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpUrl {
    static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final String FRAGMENT_ENCODE_SET = "";
    static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    static final String QUERY_COMPONENT_ENCODE_SET = " \"'<>#&=";
    static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    static final String QUERY_ENCODE_SET = " \"'<>#";
    static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    static int decodeHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        String encodedFragment;
        final List<String> encodedPathSegments;
        List<String> encodedQueryNamesAndValues;
        String host;
        String scheme;
        private static final byte[] $$c = {115, 98, 19, 9};
        private static final int $$f = 13;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {74, 60, 122, -26, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 28, -13, 14, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
        private static final int $$e = 195;
        private static final byte[] $$a = {27, 65, -33, 120, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 44;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722407;
        String encodedUsername = "";
        String encodedPassword = "";
        int port = -1;

        enum ParseResult {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 52
                int r8 = 55 - r8
                byte[] r0 = com.squareup.okhttp.HttpUrl.Builder.$$a
                int r6 = r6 * 14
                int r6 = 98 - r6
                int r7 = 53 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L2c
            L14:
                r3 = r2
            L15:
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2c:
                int r8 = -r8
                int r6 = r6 + r8
                int r6 = r6 + (-10)
                r8 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.HttpUrl.Builder.a(int, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.squareup.okhttp.HttpUrl.Builder.$$d
                int r7 = r7 * 3
                int r7 = r7 + 50
                int r8 = r8 * 15
                int r8 = r8 + 84
                int r6 = r6 * 49
                int r6 = 53 - r6
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r6
                r3 = r7
                r5 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r6]
            L29:
                int r3 = -r3
                int r6 = r6 + 1
                int r8 = r8 + r3
                int r8 = r8 + 3
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.HttpUrl.Builder.d(byte, byte, int, java.lang.Object[]):void");
        }

        private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), 3291 - View.MeasureSpec.makeMeasureSpec(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 31, 1199271174, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 651 - ((Process.getThreadPriority(0) + 20) >> 6), Color.argb(0, 0, 0, 0) + 44, -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i6 = $10 + 7;
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
            if (i3 > 0) {
                int i8 = $11 + 107;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                int i10 = $10 + 123;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i12 = $11 + 83;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i2 >>> setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 650 - Process.getGidForName(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 650, KeyEvent.normalizeMetaState(0) + 44, -450685997, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                int i13 = $10 + 31;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
            int i15 = $11 + 125;
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        public final Builder scheme(String str) {
            int i = 2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (str.equalsIgnoreCase("http")) {
                this.scheme = "http";
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str)));
            }
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            this.scheme = "https";
            return this;
        }

        public final Builder username(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (str == null) {
                throw new IllegalArgumentException("username == null");
            }
            int i4 = i2 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, true);
            } else {
                this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, true);
            }
            return this;
        }

        public final Builder encodedUsername(String str) {
            int i = 2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedUsername == null");
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder password(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str == null) {
                throw new IllegalArgumentException("password == null");
            }
            this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, true);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder encodedPassword(String str) {
            int i = 2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedPassword == null");
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder host(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            int i5 = i3 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            String strCanonicalizeHost = canonicalizeHost(str, 0, str.length());
            if (strCanonicalizeHost == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
            }
            this.host = strCanonicalizeHost;
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder port(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
            int i4 = i3 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
            int i5 = i3 % 2;
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
            }
            this.port = i;
            int i6 = i4 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        final int effectivePort() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = this.port;
            if (i4 == -1) {
                return HttpUrl.defaultPort(this.scheme);
            }
            int i5 = i3 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            throw new java.lang.IllegalArgumentException("pathSegment == null");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        
            if (r9 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        
            if (r9 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        
            push(r9, 0, r9.length(), false, false);
            r9 = com.squareup.okhttp.HttpUrl.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            com.squareup.okhttp.HttpUrl.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r9 % 128;
            r9 = r9 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        
            return r8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.squareup.okhttp.HttpUrl.Builder addPathSegment(java.lang.String r9) throws java.io.EOFException {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.squareup.okhttp.HttpUrl.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                int r1 = r1 + 109
                int r2 = r1 % 128
                com.squareup.okhttp.HttpUrl.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L13
                r1 = 0
                int r1 = r1 / r1
                if (r9 == 0) goto L2b
                goto L15
            L13:
                if (r9 == 0) goto L2b
            L15:
                r4 = 0
                int r5 = r9.length()
                r6 = 0
                r7 = 0
                r2 = r8
                r3 = r9
                r2.push(r3, r4, r5, r6, r7)
                int r9 = com.squareup.okhttp.HttpUrl.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                int r9 = r9 + 63
                int r1 = r9 % 128
                com.squareup.okhttp.HttpUrl.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
                int r9 = r9 % r0
                return r8
            L2b:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "pathSegment == null"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.HttpUrl.Builder.addPathSegment(java.lang.String):com.squareup.okhttp.HttpUrl$Builder");
        }

        public final Builder addEncodedPathSegment(String str) throws EOFException {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedPathSegment == null");
            }
            int i5 = i3 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            push(str, 0, str.length(), false, true);
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setPathSegment(int i, String str) throws EOFException {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            if (str == null) {
                throw new IllegalArgumentException("pathSegment == null");
            }
            String strCanonicalize = HttpUrl.canonicalize(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, true);
            if (isDot(strCanonicalize) || isDotDot(strCanonicalize)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(String.valueOf(str)));
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                this.encodedPathSegments.set(i, strCanonicalize);
                return this;
            }
            this.encodedPathSegments.set(i, strCanonicalize);
            throw null;
        }

        public final Builder setEncodedPathSegment(int i, String str) throws EOFException {
            int i2 = 2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedPathSegment == null");
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            String strCanonicalize = HttpUrl.canonicalize(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, true);
            this.encodedPathSegments.set(i, strCanonicalize);
            if (!isDot(strCanonicalize)) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    isDotDot(strCanonicalize);
                    throw null;
                }
                if (!isDotDot(strCanonicalize)) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    if (i6 % 2 == 0) {
                        return this;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            throw new IllegalArgumentException("unexpected path segment: ".concat(String.valueOf(str)));
        }

        public final Builder removePathSegment(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
            }
            return this;
        }

        public final Builder encodedPath(String str) throws EOFException {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedPath == null");
            }
            int i5 = i2 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            if (str.startsWith("/")) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                if (i7 % 2 == 0) {
                    resolvePath(str, 0, str.length());
                } else {
                    resolvePath(str, 0, str.length());
                }
                return this;
            }
            throw new IllegalArgumentException("unexpected encodedPath: ".concat(String.valueOf(str)));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:11:0x0028  */
        /* JADX WARN: Code duplicated, block: B:13:0x0031  */
        /* JADX WARN: Code duplicated, block: B:8:0x0017  */
        public final Builder query(String str) {
            int i;
            String strCanonicalize;
            List<String> listQueryStringToNamesAndValues;
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = i3 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 56 / 0;
                if (str != null) {
                    i = i3 + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                    if (i % 2 == 0) {
                        strCanonicalize = HttpUrl.canonicalize(str, " \"'<>#", true, true, false);
                    } else {
                        strCanonicalize = HttpUrl.canonicalize(str, " \"'<>#", false, true, true);
                    }
                    listQueryStringToNamesAndValues = HttpUrl.queryStringToNamesAndValues(strCanonicalize);
                } else {
                    listQueryStringToNamesAndValues = null;
                }
            } else if (str != null) {
                i = i3 + 35;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                if (i % 2 == 0) {
                    strCanonicalize = HttpUrl.canonicalize(str, " \"'<>#", true, true, false);
                } else {
                    strCanonicalize = HttpUrl.canonicalize(str, " \"'<>#", false, true, true);
                }
                listQueryStringToNamesAndValues = HttpUrl.queryStringToNamesAndValues(strCanonicalize);
            } else {
                listQueryStringToNamesAndValues = null;
            }
            this.encodedQueryNamesAndValues = listQueryStringToNamesAndValues;
            return this;
        }

        public final Builder encodedQuery(String str) {
            List<String> listQueryStringToNamesAndValues;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            if (str == null) {
                int i5 = i3 + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                listQueryStringToNamesAndValues = null;
            } else {
                int i7 = i3 + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                listQueryStringToNamesAndValues = HttpUrl.queryStringToNamesAndValues(i7 % 2 != 0 ? HttpUrl.canonicalize(str, " \"'<>#", false, true, true) : HttpUrl.canonicalize(str, " \"'<>#", true, true, true));
            }
            this.encodedQueryNamesAndValues = listQueryStringToNamesAndValues;
            return this;
        }

        public final Builder addQueryParameter(String str, String str2) {
            String strCanonicalize;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, " \"'<>#&=", false, true, true));
            List<String> list = this.encodedQueryNamesAndValues;
            if (str2 != null) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                if (i3 % 2 != 0) {
                    strCanonicalize = HttpUrl.canonicalize(str2, " \"'<>#&=", true, false, false);
                } else {
                    strCanonicalize = HttpUrl.canonicalize(str2, " \"'<>#&=", false, true, true);
                }
            } else {
                strCanonicalize = null;
            }
            list.add(strCanonicalize);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0024  */
        public final Builder addEncodedQueryParameter(String str, String str2) {
            String strCanonicalize;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedName == null");
            }
            int i5 = i2 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 10 / 0;
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
            } else if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, " \"'<>#&=", true, true, true));
            List<String> list = this.encodedQueryNamesAndValues;
            if (str2 == null) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                int i8 = i7 % 2;
                strCanonicalize = null;
            } else {
                strCanonicalize = HttpUrl.canonicalize(str2, " \"'<>#&=", true, true, true);
            }
            list.add(strCanonicalize);
            return this;
        }

        public final Builder setQueryParameter(String str, String str2) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                removeAllEncodedQueryParameters(str);
                addEncodedQueryParameter(str, str2);
                return this;
            }
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder removeAllQueryParameters(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (this.encodedQueryNamesAndValues == null) {
                int i4 = i2 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 82 / 0;
                }
                return this;
            }
            removeAllCanonicalQueryParameters(HttpUrl.canonicalize(str, " \"'<>#&=", false, true, true));
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 83 / 0;
            }
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            r1 = r1 + 83;
            com.squareup.okhttp.HttpUrl.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        
            removeAllCanonicalQueryParameters(com.squareup.okhttp.HttpUrl.canonicalize(r5, " \"'<>#&=", true, true, true));
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        
            throw new java.lang.IllegalArgumentException("encodedName == null");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r5 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r5 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        
            if (r4.encodedQueryNamesAndValues != null) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.squareup.okhttp.HttpUrl.Builder removeAllEncodedQueryParameters(java.lang.String r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.squareup.okhttp.HttpUrl.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                int r2 = r1 + 69
                int r3 = r2 % 128
                com.squareup.okhttp.HttpUrl.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
                int r2 = r2 % r0
                if (r2 == 0) goto L15
                r2 = 11
                int r2 = r2 / 0
                if (r5 == 0) goto L2e
                goto L17
            L15:
                if (r5 == 0) goto L2e
            L17:
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                if (r2 != 0) goto L23
                int r1 = r1 + 83
                int r5 = r1 % 128
                com.squareup.okhttp.HttpUrl.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5
                int r1 = r1 % r0
                return r4
            L23:
                java.lang.String r0 = " \"'<>#&="
                r1 = 1
                java.lang.String r5 = com.squareup.okhttp.HttpUrl.canonicalize(r5, r0, r1, r1, r1)
                r4.removeAllCanonicalQueryParameters(r5)
                return r4
            L2e:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "encodedName == null"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.HttpUrl.Builder.removeAllEncodedQueryParameters(java.lang.String):com.squareup.okhttp.HttpUrl$Builder");
        }

        private void removeAllCanonicalQueryParameters(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int size = i2 % 2 == 0 ? this.encodedQueryNamesAndValues.size() % 2 : this.encodedQueryNamesAndValues.size() - 2;
            while (true) {
                Object obj = null;
                if (size < 0) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                    if (i3 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                if (str.equals(this.encodedQueryNamesAndValues.get(size))) {
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                size -= 2;
            }
        }

        public final Builder fragment(String str) {
            String strCanonicalize;
            int i = 2 % 2;
            if (str != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                strCanonicalize = i2 % 2 != 0 ? HttpUrl.canonicalize(str, "", false, true, false) : HttpUrl.canonicalize(str, "", false, false, false);
            } else {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 % 3;
                }
                strCanonicalize = null;
            }
            this.encodedFragment = strCanonicalize;
            return this;
        }

        public final Builder encodedFragment(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            String strCanonicalize = null;
            if (i2 % 2 == 0) {
                strCanonicalize.hashCode();
                throw null;
            }
            if (str != null) {
                strCanonicalize = HttpUrl.canonicalize(str, "", true, false, false);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
            }
            this.encodedFragment = strCanonicalize;
            return this;
        }

        final Builder reencodeForUri() {
            int i = 2 % 2;
            int size = this.encodedPathSegments.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.encodedPathSegments.set(i2, HttpUrl.canonicalize(this.encodedPathSegments.get(i2), "[]", true, false, true));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    String str = this.encodedQueryNamesAndValues.get(i3);
                    if (str != null) {
                        this.encodedQueryNamesAndValues.set(i3, HttpUrl.canonicalize(str, "\\^`{|}", true, true, true));
                    }
                    i3++;
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            String str2 = this.encodedFragment;
            if (str2 != null) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                int i7 = i6 % 2;
                this.encodedFragment = HttpUrl.canonicalize(str2, " \"#<>\\^`{|}", true, false, false);
            }
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            return this;
        }

        public final HttpUrl build() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            if (this.scheme == null) {
                throw new IllegalStateException("scheme == null");
            }
            int i5 = i2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            if (this.host == null) {
                throw new IllegalStateException("host == null");
            }
            HttpUrl httpUrl = new HttpUrl(this, null);
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            return httpUrl;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0049  */
        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append(this.scheme);
            sb.append("://");
            if (this.encodedUsername.isEmpty()) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 66 / 0;
                    if (!this.encodedPassword.isEmpty()) {
                        sb.append(this.encodedUsername);
                        if (!this.encodedPassword.isEmpty()) {
                            sb.append(':');
                            sb.append(this.encodedPassword);
                        }
                        sb.append('@');
                    }
                } else if (!this.encodedPassword.isEmpty()) {
                    sb.append(this.encodedUsername);
                    if (!this.encodedPassword.isEmpty()) {
                        sb.append(':');
                        sb.append(this.encodedPassword);
                    }
                    sb.append('@');
                }
            } else {
                sb.append(this.encodedUsername);
                if (!this.encodedPassword.isEmpty()) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            if (this.host.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.host);
                sb.append(']');
            } else {
                sb.append(this.host);
            }
            int iEffectivePort = effectivePort();
            if (iEffectivePort != HttpUrl.defaultPort(this.scheme)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 == 0) {
                    sb.append('E');
                    sb.append(iEffectivePort);
                } else {
                    sb.append(':');
                    sb.append(iEffectivePort);
                }
            }
            HttpUrl.pathSegmentsToString(sb, this.encodedPathSegments);
            if (this.encodedQueryNamesAndValues != null) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                if (i5 % 2 != 0) {
                    sb.append(Typography.dollar);
                    HttpUrl.namesAndValuesToQueryString(sb, this.encodedQueryNamesAndValues);
                } else {
                    sb.append('?');
                    HttpUrl.namesAndValuesToQueryString(sb, this.encodedQueryNamesAndValues);
                }
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        final ParseResult parse(HttpUrl httpUrl, String str) throws Throwable {
            int iDelimiterOffset;
            char cCharAt;
            int i;
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            int iSkipLeadingAsciiWhitespace = skipLeadingAsciiWhitespace(str, 0, str.length());
            int iSkipTrailingAsciiWhitespace = skipTrailingAsciiWhitespace(str, iSkipLeadingAsciiWhitespace, str.length());
            if (schemeDelimiterOffset(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace) != -1) {
                if (str.regionMatches(true, iSkipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.scheme = "https";
                    iSkipLeadingAsciiWhitespace += 6;
                } else {
                    if (!str.regionMatches(true, iSkipLeadingAsciiWhitespace, "http:", 0, 5)) {
                        return ParseResult.UNSUPPORTED_SCHEME;
                    }
                    this.scheme = "http";
                    iSkipLeadingAsciiWhitespace += 5;
                }
            } else {
                if (httpUrl == null) {
                    return ParseResult.MISSING_SCHEME;
                }
                this.scheme = httpUrl.scheme;
            }
            int iSlashCount = slashCount(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace);
            char c = '?';
            char c2 = '#';
            if (iSlashCount >= 2 || httpUrl == null || !httpUrl.scheme.equals(this.scheme)) {
                boolean z = false;
                int i5 = iSkipLeadingAsciiWhitespace + iSlashCount;
                boolean z2 = false;
                while (true) {
                    iDelimiterOffset = HttpUrl.delimiterOffset(str, i5, iSkipTrailingAsciiWhitespace, "@/\\?#");
                    if (iDelimiterOffset != iSkipTrailingAsciiWhitespace) {
                        cCharAt = str.charAt(iDelimiterOffset);
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + c2;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        cCharAt = 65535;
                    }
                    if (cCharAt != 65535 && cCharAt != c2 && cCharAt != '/' && cCharAt != '\\') {
                        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i9 = i8 + 69;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                        int i10 = i9 % 2;
                        if (cCharAt == c) {
                            break;
                        }
                        if (cCharAt == '@') {
                            int i11 = i8 + 47;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                            int i12 = i11 % 2;
                            if (z2) {
                                i = iDelimiterOffset;
                                StringBuilder sb = new StringBuilder();
                                sb.append(this.encodedPassword);
                                sb.append("%40");
                                sb.append(HttpUrl.canonicalize(str, i5, i, " \"':;<=>@[]^`{}|/\\?#", true, false, true));
                                this.encodedPassword = sb.toString();
                            } else {
                                int iDelimiterOffset2 = HttpUrl.delimiterOffset(str, i5, iDelimiterOffset, ":");
                                i = iDelimiterOffset;
                                String strCanonicalize = HttpUrl.canonicalize(str, i5, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                if (z) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.encodedUsername);
                                    sb2.append("%40");
                                    sb2.append(strCanonicalize);
                                    strCanonicalize = sb2.toString();
                                }
                                this.encodedUsername = strCanonicalize;
                                if (iDelimiterOffset2 != i) {
                                    this.encodedPassword = HttpUrl.canonicalize(str, iDelimiterOffset2 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                    z2 = true;
                                }
                                z = true;
                            }
                            i5 = i + 1;
                            c = '?';
                            c2 = '#';
                        }
                    } else {
                        break;
                    }
                }
                int iPortColonOffset = portColonOffset(str, i5, iDelimiterOffset);
                int i13 = iPortColonOffset + 1;
                if (i13 < iDelimiterOffset) {
                    this.host = canonicalizeHost(str, i5, iPortColonOffset);
                    int port = parsePort(str, i13, iDelimiterOffset);
                    this.port = port;
                    if (port == -1) {
                        return ParseResult.INVALID_PORT;
                    }
                } else {
                    this.host = canonicalizeHost(str, i5, iPortColonOffset);
                    this.port = HttpUrl.defaultPort(this.scheme);
                }
                if (this.host == null) {
                    return ParseResult.INVALID_HOST;
                }
                iSkipLeadingAsciiWhitespace = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host;
                this.port = httpUrl.port;
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iSkipLeadingAsciiWhitespace == iSkipTrailingAsciiWhitespace || str.charAt(iSkipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int iDelimiterOffset3 = HttpUrl.delimiterOffset(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace, "?#");
            resolvePath(str, iSkipLeadingAsciiWhitespace, iDelimiterOffset3);
            if (iDelimiterOffset3 < iSkipTrailingAsciiWhitespace) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                if (i14 % 2 != 0 ? str.charAt(iDelimiterOffset3) == '?' : str.charAt(iDelimiterOffset3) == '*') {
                    int iDelimiterOffset4 = HttpUrl.delimiterOffset(str, iDelimiterOffset3, iSkipTrailingAsciiWhitespace, "#");
                    this.encodedQueryNamesAndValues = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, iDelimiterOffset3 + 1, iDelimiterOffset4, " \"'<>#", true, true, true));
                    iDelimiterOffset3 = iDelimiterOffset4;
                }
            }
            if (iDelimiterOffset3 < iSkipTrailingAsciiWhitespace) {
                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                if (i15 % 2 == 0 ? str.charAt(iDelimiterOffset3) == '#' : str.charAt(iDelimiterOffset3) == 'T') {
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                    if (i16 % 2 == 0) {
                        this.encodedFragment = HttpUrl.canonicalize(str, 1 + iDelimiterOffset3, iSkipTrailingAsciiWhitespace, "", false, true, true);
                    } else {
                        this.encodedFragment = HttpUrl.canonicalize(str, 1 + iDelimiterOffset3, iSkipTrailingAsciiWhitespace, "", true, false, false);
                    }
                }
            }
            return ParseResult.SUCCESS;
        }

        private void resolvePath(String str, int i, int i2) throws EOFException {
            int i3 = 2 % 2;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i5 = i4 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            if (i == i2) {
                return;
            }
            int i7 = i4 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i++;
            } else {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                int i10 = i9 % 2;
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i11 = i;
                if (i11 >= i2) {
                    return;
                }
                i = HttpUrl.delimiterOffset(str, i11, i2, "/\\");
                boolean z = i < i2;
                push(str, i11, i, z, true);
                if (z) {
                    i++;
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
        }

        private void push(String str, int i, int i2, boolean z, boolean z2) throws EOFException {
            String strCanonicalize;
            int i3 = 2 % 2;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                strCanonicalize = HttpUrl.canonicalize(str, i, i2, " \"<>^`{}|/\\?#", z2, false, true);
                if (isDot(strCanonicalize)) {
                    return;
                }
            } else {
                strCanonicalize = HttpUrl.canonicalize(str, i, i2, " \"<>^`{}|/\\?#", z2, false, true);
                if (isDot(strCanonicalize)) {
                    return;
                }
            }
            if (!isDotDot(strCanonicalize)) {
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, strCanonicalize);
                } else {
                    this.encodedPathSegments.add(strCanonicalize);
                }
                if (z) {
                    this.encodedPathSegments.add("");
                    return;
                }
                return;
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                pop();
                throw null;
            }
            pop();
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
        }

        private boolean isDot(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                str.equals(".");
                throw null;
            }
            if (!str.equals(".") && (!str.equalsIgnoreCase("%2e"))) {
                return false;
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            throw null;
        }

        private boolean isDotDot(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            if (!str.equals("..") && !str.equalsIgnoreCase("%2e.") && !str.equalsIgnoreCase(".%2e")) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                if (!str.equalsIgnoreCase("%2e%2e")) {
                    return false;
                }
            }
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }

        private void pop() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).isEmpty()) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                if (!this.encodedPathSegments.isEmpty()) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, "");
                    return;
                }
            }
            this.encodedPathSegments.add("");
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0025  */
        /* JADX WARN: Code duplicated, block: B:17:0x0029  */
        /* JADX WARN: Code duplicated, block: B:19:0x0032  */
        /* JADX WARN: Code duplicated, block: B:22:0x0037  */
        /* JADX WARN: Code duplicated, block: B:28:0x003b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x003b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x003c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x003c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x003c A[SYNTHETIC] */
        private int skipLeadingAsciiWhitespace(String str, int i, int i2) {
            int i3;
            int i4 = 2 % 2;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && cCharAt != '\n') {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i6 = i5 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    if (i6 % 2 != 0) {
                        if (cCharAt == 23) {
                            continue;
                        } else if (cCharAt != '\r') {
                            i3 = i5 + 25;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                            if (i3 % 2 != 0) {
                                if (cCharAt != '-') {
                                    return i;
                                }
                            } else if (cCharAt != ' ') {
                                return i;
                            }
                        } else {
                            continue;
                        }
                    } else if (cCharAt == '\f') {
                        continue;
                    } else if (cCharAt != '\r') {
                        i3 = i5 + 25;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                        if (i3 % 2 != 0) {
                            if (cCharAt != '-') {
                                return i;
                            }
                        } else if (cCharAt != ' ') {
                            return i;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            }
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:64:0x05f6  */
        private int skipTrailingAsciiWhitespace(String str, int i, int i2) throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            int i3 = 2 % 2;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2 != 0 ? i2 + 79 : i2 - 1;
            while (true) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                    int iAlpha = 921 - Color.alpha(0);
                    int iAxisFromString = 27 - MotionEvent.axisFromString("");
                    byte[] bArr = $$a;
                    byte b = bArr[80];
                    Object[] objArr3 = new Object[1];
                    a(b, (byte) (b | 52), bArr[7], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, iAlpha, iAxisFromString, -1048449946, false, (String) objArr3[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr4 = new Object[1];
                c(true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 158, 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 7 - ExpandableListView.getPackedPositionGroup(0L), new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                c(false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 162, 15 - TextUtils.getTrimmedLength(""), 5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530}, objArr5);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                    int i6 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[7];
                    byte b3 = b2;
                    Object[] objArr6 = new Object[1];
                    a(b2, bArr2[80], b3, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i6, iIndexOf, -778300370, false, (String) objArr6[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 921;
                        int i7 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte[] bArr3 = $$a;
                        Object[] objArr7 = new Object[1];
                        a(bArr3[7], (byte) (-bArr3[33]), bArr3[80], objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, packedPositionGroup, i7, -1142834547, false, (String) objArr7[0], null);
                    }
                    Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
                    int i8 = ~i;
                    int i9 = 1760939827 + (((~(i8 | (-153681947))) | (~((-1346626) | i8))) * (-184)) + ((809525536 | (~((-810872162) | i8)) | (~((-963207483) | i8))) * 184) + 557302974;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                } else {
                    Object[] objArr9 = new Object[1];
                    c(false, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 159, Color.argb(0, 0, 0, 0) + 26, Color.rgb(0, 0, 0) + 16777226, new char[]{19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(true, ExpandableListView.getPackedPositionType(0L) + 165, 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 17 - TextUtils.lastIndexOf("", '0', 0), new char[]{4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529}, objArr10);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    try {
                        Object[] objArr11 = {applicationContext, Integer.valueOf(i), 0, -826993578};
                        byte[] bArr4 = $$d;
                        byte b4 = bArr4[35];
                        byte b5 = b4;
                        Object[] objArr12 = new Object[1];
                        d(b5, (byte) (b5 - 1), b4, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        byte b6 = bArr4[35];
                        byte b7 = (byte) (b6 - 1);
                        byte b8 = b6;
                        Object[] objArr13 = new Object[1];
                        d(b7, b8, (byte) (b8 - 1), objArr13);
                        objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                            int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            byte[] bArr5 = $$a;
                            Object[] objArr14 = new Object[1];
                            a(bArr5[7], (byte) (-bArr5[33]), bArr5[80], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iIndexOf2, maximumDrawingCacheSize, -1142834547, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr15 = new Object[1];
                            c(true, TextUtils.indexOf("", "", 0) + 158, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            c(false, (ViewConfiguration.getTapTimeout() >> 16) + 162, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, 6 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530}, objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
                                int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                                int packedPositionType = 28 - ExpandableListView.getPackedPositionType(0L);
                                byte[] bArr6 = $$a;
                                byte b9 = bArr6[7];
                                Object[] objArr17 = new Object[1];
                                a(b9, bArr6[80], b9, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iLastIndexOf, packedPositionType, -778300370, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char defaultSize = (char) (View.getDefaultSize(0, 0) + 31533);
                                int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                                int packedPositionGroup2 = 28 - ExpandableListView.getPackedPositionGroup(0L);
                                byte[] bArr7 = $$a;
                                byte b10 = bArr7[80];
                                Object[] objArr18 = new Object[1];
                                a(b10, (byte) (b10 | 52), bArr7[7], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, threadPriority, packedPositionGroup2, -1048449946, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
                int i12 = ((int[]) objArr[1])[0];
                int i13 = ((int[]) objArr[3])[0];
                if (i13 == i12) {
                    int i14 = ((int[]) objArr[0])[0];
                    objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i15 = ~startElapsedRealtime;
                    int i16 = i14 + (-70006909) + (((~(1512268483 | i15)) | 93882648) * 184) + ((startElapsedRealtime | 1344339971) * (-184)) + ((~((-261811161) | i15)) * 184);
                    int i17 = (i16 << 13) ^ i16;
                    int i18 = i17 ^ (i17 >>> 17);
                    ((int[]) objArr2[0])[0] = i18 ^ (i18 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i19 = 0;
                        while (i19 < strArr.length) {
                            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                            if (i20 % 2 != 0) {
                                arrayList.add(strArr[i19]);
                                i19 += 69;
                            } else {
                                arrayList.add(strArr[i19]);
                                i19++;
                            }
                        }
                    }
                    int[] iArr = new int[i13];
                    int i21 = i13 - 1;
                    iArr[i21] = 1;
                    Toast.makeText((Context) null, iArr[((i13 * i21) % 2) - 1], 1).show();
                    int i22 = ((int[]) objArr[0])[0];
                    objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i23 = ~iIdentityHashCode;
                    int i24 = i22 + 25598825 + (((~((-1550911850) | i23)) | (~((-223167795) | iIdentityHashCode))) * 1900) + (((~(i23 | 223167794)) | (~(iIdentityHashCode | 1550911849))) * (-950)) + (((~(iIdentityHashCode | 223167794)) | (~(i23 | 1550911849))) * 950);
                    int i25 = (i24 << 13) ^ i24;
                    int i26 = i25 ^ (i25 >>> 17);
                    ((int[]) objArr2[0])[0] = i26 ^ (i26 << 5);
                }
                if (i5 < i) {
                    return i;
                }
                char cCharAt = str.charAt(i5);
                if (cCharAt != '\t') {
                    int i27 = ((int[]) objArr2[0])[0];
                    int i28 = ((((i27 * i27) - (~(-(1281712316 * i27)))) - 1) - (~(-(i27 * (-805059790))))) - 1;
                    int i29 = ((i28 | (-1550730159)) << 1) - ((-1550730159) ^ i28);
                    int i30 = i29 >> 29;
                    int i31 = ((i30 & (-15)) + (i30 | (-15))) / 8;
                    int i32 = (i31 ^ 1) + ((i31 & 1) << 1);
                    int i33 = -(((((i29 >> 28) - 31) / 16) + 1) ^ (((i29 | i32) << 1) - (i32 ^ i29)));
                    int i34 = (i33 ^ 7) + ((i33 & 7) << 1);
                    int i35 = i34 >> 15;
                    int i36 = (((-262143) & i35) + (i35 | (-262143))) / 131072;
                    int i37 = (i36 ^ 1) + ((i36 & 1) << 1);
                    if (cCharAt != TypedValues.TransitionType.TYPE_DURATION / (((-((i37 ^ 1) + ((i37 & 1) << 1))) & i34) * 10)) {
                        int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                        int i39 = i38 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i39;
                        if (i38 % 2 == 0) {
                            if (cCharAt == '0') {
                                continue;
                            } else if (cCharAt != '\r' && cCharAt != ' ') {
                                int i40 = i39 + 19;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i40 % 128;
                                int i41 = i40 % 2;
                                return i5 + 1;
                            }
                        } else if (cCharAt == '\f') {
                            continue;
                        } else if (cCharAt != '\r') {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i5--;
            }
        }

        private static int schemeDelimiterOffset(String str, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i5 = i4 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            if (i2 - i < 2) {
                int i7 = i4 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                if (i7 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i8 = i4 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                int i9 = i8 % 2;
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 >= 'a') {
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                        if (i10 % 2 != 0) {
                            if (cCharAt2 <= 'q') {
                                continue;
                            }
                        } else if (cCharAt2 <= 'z') {
                            continue;
                        }
                    }
                    if (cCharAt2 >= 'A') {
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                        if (i11 % 2 == 0) {
                            if (cCharAt2 <= 'b') {
                                continue;
                            }
                        } else if (cCharAt2 <= 'Z') {
                            continue;
                        }
                    }
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        if (cCharAt2 != '+') {
                            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                            int i13 = i12 % 2;
                            if (cCharAt2 != '-' && cCharAt2 != '.') {
                                if (cCharAt2 == ':') {
                                    return i;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return -1;
        }

        private static int slashCount(String str, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2 != 0 ? 1 : 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\\') {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    int i7 = i6 % 2;
                    if (cCharAt != '/') {
                        break;
                    }
                }
                i5++;
                i++;
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                int i9 = i8 % 2;
            }
            return i5;
        }

        private static int portColonOffset(String str, int i, int i2) {
            int i3 = 2 % 2;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    int i5 = i4 % 2;
                    return i;
                }
                if (cCharAt == '[') {
                    while (true) {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                        if (i6 % 2 == 0) {
                            if (str.charAt(i) == 'f') {
                                break;
                            }
                        } else if (str.charAt(i) == ']') {
                            break;
                        }
                    }
                } else {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    int i8 = i7 % 2;
                }
                i++;
            }
            return i2;
        }

        private static String canonicalizeHost(String str, int i, int i2) {
            InetAddress inetAddressDecodeIpv6;
            int i3 = 2 % 2;
            String strPercentDecode = HttpUrl.percentDecode(str, i, i2, false);
            if (strPercentDecode.startsWith("[")) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 != 0) {
                    strPercentDecode.endsWith("]");
                    throw null;
                }
                if (strPercentDecode.endsWith("]")) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    if (i5 % 2 == 0 ? (inetAddressDecodeIpv6 = decodeIpv6(strPercentDecode, 1, strPercentDecode.length() - 1)) == null : (inetAddressDecodeIpv6 = decodeIpv6(strPercentDecode, 0, strPercentDecode.length() + 1)) == null) {
                        return null;
                    }
                    byte[] address = inetAddressDecodeIpv6.getAddress();
                    if (address.length != 16) {
                        throw new AssertionError();
                    }
                    String strInet6AddressToAscii = inet6AddressToAscii(address);
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 6 / 0;
                    }
                    return strInet6AddressToAscii;
                }
            }
            return domainToAscii(strPercentDecode);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x005a  */
        /* JADX WARN: Code duplicated, block: B:34:0x0065  */
        /* JADX WARN: Code duplicated, block: B:36:0x006f A[LOOP:1: B:31:0x0058->B:36:0x006f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:63:0x0075 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x007d A[EDGE_INSN: B:66:0x007d->B:39:0x007d BREAK  A[LOOP:1: B:31:0x0058->B:36:0x006f], SYNTHETIC] */
        private static InetAddress decodeIpv6(String str, int i, int i2) {
            int i3;
            int i4;
            int i5;
            int iDecodeHexDigit;
            int i6 = 2 % 2;
            byte[] bArr = new byte[16];
            int i7 = -1;
            int i8 = -1;
            int i9 = 0;
            while (i < i2) {
                if (i9 == 16) {
                    return null;
                }
                int i10 = i + 2;
                if (i10 <= i2 && str.regionMatches(i, "::", 0, 2)) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                    int i12 = i11 % 2;
                    if (i7 != -1) {
                        return null;
                    }
                    i9 += 2;
                    i7 = i9;
                    if (i10 == i2) {
                        break;
                    }
                    i8 = i10;
                    i3 = 0;
                    i = i8;
                    while (i < i2) {
                        i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                        if (i5 % 2 == 0) {
                            HttpUrl.decodeHexDigit(str.charAt(i));
                            throw null;
                        }
                        iDecodeHexDigit = HttpUrl.decodeHexDigit(str.charAt(i));
                        if (iDecodeHexDigit != -1) {
                            break;
                            break;
                        }
                        i3 = (i3 << 4) + iDecodeHexDigit;
                        i++;
                    }
                    i4 = i - i8;
                    if (i4 != 0) {
                    }
                    return null;
                }
                if (i9 != 0) {
                    if (!str.regionMatches(i, ":", 0, 1)) {
                        if (!str.regionMatches(i, ".", 0, 1) || !decodeIpv4Suffix(str, i8, i2, bArr, i9 - 2)) {
                            return null;
                        }
                        i9 += 2;
                        break;
                    }
                    i++;
                }
                i8 = i;
                i3 = 0;
                i = i8;
                while (i < i2) {
                    i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        HttpUrl.decodeHexDigit(str.charAt(i));
                        throw null;
                    }
                    iDecodeHexDigit = HttpUrl.decodeHexDigit(str.charAt(i));
                    if (iDecodeHexDigit != -1) {
                        break;
                    }
                    i3 = (i3 << 4) + iDecodeHexDigit;
                    i++;
                }
                i4 = i - i8;
                if (i4 != 0 || i4 > 4) {
                    return null;
                }
                bArr[i9] = (byte) ((i3 >>> 8) & 255);
                bArr[i9 + 1] = (byte) (i3 & 255);
                i9 += 2;
            }
            if (i9 != 16) {
                if (i7 == -1) {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                    if (i13 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                int i14 = i9 - i7;
                System.arraycopy(bArr, i7, bArr, 16 - i14, i14);
                Arrays.fill(bArr, i7, (16 - i9) + i7, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        private static boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = 2 % 2;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i6 = i5 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 5;
            }
            int i10 = i3;
            while (i < i2) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                if (i11 % 2 == 0) {
                    int length = bArr.length;
                    throw null;
                }
                if (i10 == bArr.length) {
                    return false;
                }
                if (i10 != i3) {
                    if (str.charAt(i) != '.') {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                        int i13 = i12 % 2;
                        return false;
                    }
                    i++;
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    int i15 = i14 % 2;
                }
                int i16 = i;
                int i17 = 0;
                while (i16 < i2) {
                    char cCharAt = str.charAt(i16);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    if (i17 == 0 && i != i16) {
                        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                        int i19 = i18 % 2;
                        return false;
                    }
                    i17 = ((i17 * 10) + cCharAt) - 48;
                    if (i17 > 255) {
                        return false;
                    }
                    i16++;
                }
                if (i16 - i == 0) {
                    return false;
                }
                bArr[i10] = (byte) i17;
                i10++;
                i = i16;
            }
            if (i10 == i3 + 4) {
                return true;
            }
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
            int i21 = i20 % 2;
            return false;
        }

        private static String domainToAscii(String str) {
            int i = 2 % 2;
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (!containsInvalidHostnameAsciiCodes(lowerCase)) {
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                    if (i2 % 2 != 0) {
                        return lowerCase;
                    }
                    throw null;
                }
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
            } catch (IllegalArgumentException unused) {
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0042 A[LOOP:0: B:3:0x000e->B:17:0x0042, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:24:0x0041 A[SYNTHETIC] */
        private static boolean containsInvalidHostnameAsciiCodes(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            for (int i4 = 0; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt > 31) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                    int i6 = i5 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
                    if (i5 % 2 != 0) {
                        if (cCharAt >= '2') {
                        }
                        int i7 = i6 + 51;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                        int i8 = i7 % 2;
                        if (" #%/:?@[\\]".indexOf(cCharAt) != -1) {
                            return true;
                        }
                    } else {
                        if (cCharAt >= 127) {
                        }
                        int i9 = i6 + 51;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                        int i10 = i9 % 2;
                        if (" #%/:?@[\\]".indexOf(cCharAt) != -1) {
                            return true;
                        }
                    }
                }
                return true;
            }
            return false;
        }

        private static String inet6AddressToAscii(byte[] bArr) {
            int i = 2 % 2;
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (i4 < bArr.length) {
                int i6 = i4;
                while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                    i6 += 2;
                }
                int i7 = i6 - i4;
                if (i7 > i5) {
                    i3 = i4;
                    i5 = i7;
                }
                i4 = i6 + 2;
            }
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            while (i2 < bArr.length) {
                if (i2 == i3) {
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                    if (i10 % 2 == 0) {
                        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(114);
                        i2 %= i5;
                        if (i2 == 5) {
                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                            int i12 = i11 % 2;
                            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(58);
                        }
                    } else {
                        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(58);
                        i2 += i5;
                        if (i2 == 16) {
                            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                            int i14 = i13 % 2;
                            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(58);
                        }
                    }
                } else {
                    if (i2 > 0) {
                        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(58);
                    }
                    rotationProviderListenerWrapper.notify(((bArr[i2] & UByte.MAX_VALUE) << 8) | (bArr[i2 + 1] & UByte.MAX_VALUE));
                    i2 += 2;
                }
            }
            return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, Charsets.UTF_8);
        }

        private static int parsePort(String str, int i, int i2) {
            int i3 = 2 % 2;
            try {
                int i4 = Integer.parseInt(HttpUrl.canonicalize(str, i, i2, "", false, false, true));
                if (i4 <= 0) {
                    return -1;
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                int i6 = i5 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6;
                int i7 = i5 % 2;
                if (i4 > 65535) {
                    return -1;
                }
                int i8 = i6 + 1;
                int i9 = i8 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                int i12 = i11 % 2;
                return i4;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private static String $$g(byte b, byte b2, int i) {
            int i2 = b * 4;
            byte[] bArr = $$c;
            int i3 = i + 119;
            int i4 = 4 - (b2 * 4);
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            int i6 = -1;
            if (bArr == null) {
                i6 = -1;
                i3 = (-i4) + i3;
                i4++;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i3;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = i3;
                i6 = i7;
                i3 = (-bArr[i4]) + i8;
                i4++;
            }
        }
    }

    /* synthetic */ HttpUrl(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    private HttpUrl(Builder builder) {
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername, false);
        this.password = percentDecode(builder.encodedPassword, false);
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.pathSegments = percentDecode(builder.encodedPathSegments, false);
        this.queryNamesAndValues = builder.encodedQueryNamesAndValues != null ? percentDecode(builder.encodedQueryNamesAndValues, true) : null;
        this.fragment = builder.encodedFragment != null ? percentDecode(builder.encodedFragment, false) : null;
        this.url = builder.toString();
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final URI uri() {
        try {
            return new URI(newBuilder().reencodeForUri().toString());
        } catch (URISyntaxException unused) {
            StringBuilder sb = new StringBuilder("not valid as a java.net.URI: ");
            sb.append(this.url);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final String scheme() {
        return this.scheme;
    }

    public final boolean isHttps() {
        return this.scheme.equals("https");
    }

    public final String encodedUsername() {
        if (this.username.isEmpty()) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, delimiterOffset(str, length, str.length(), ":@"));
    }

    public final String username() {
        return this.username;
    }

    public final String encodedPassword() {
        if (this.password.isEmpty()) {
            return "";
        }
        int iIndexOf = this.url.indexOf(58, this.scheme.length() + 3);
        return this.url.substring(iIndexOf + 1, this.url.indexOf(64));
    }

    public final String password() {
        return this.password;
    }

    public final String host() {
        return this.host;
    }

    public final int port() {
        return this.port;
    }

    public static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final String encodedPath() {
        int iIndexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        return this.url.substring(iIndexOf, delimiterOffset(str, iIndexOf, str.length(), "?#"));
    }

    static void pathSegmentsToString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public final List<String> encodedPathSegments() {
        int iIndexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        int iDelimiterOffset = delimiterOffset(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iDelimiterOffset) {
            int i = iIndexOf + 1;
            int iDelimiterOffset2 = delimiterOffset(this.url, i, iDelimiterOffset, "/");
            arrayList.add(this.url.substring(i, iDelimiterOffset2));
            iIndexOf = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iIndexOf = this.url.indexOf(63);
        String str = this.url;
        return this.url.substring(iIndexOf + 1, delimiterOffset(str, iIndexOf + 2, str.length(), "#"));
    }

    static void namesAndValuesToQueryString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static List<String> queryStringToNamesAndValues(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        namesAndValuesToQueryString(sb, this.queryNamesAndValues);
        return sb.toString();
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String queryParameter(String str) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.queryNamesAndValues.get(i))) {
                return this.queryNamesAndValues.get(i + 1);
            }
        }
        return null;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.queryNamesAndValues.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public final List<String> queryParameterValues(String str) {
        if (this.queryNamesAndValues == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.queryNamesAndValues.get(i))) {
                arrayList.add(this.queryNamesAndValues.get(i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String queryParameterName(int i) {
        return this.queryNamesAndValues.get(i * 2);
    }

    public final String queryParameterValue(int i) {
        return this.queryNamesAndValues.get((i * 2) + 1);
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(this.url.indexOf(35) + 1);
    }

    public final String fragment() {
        return this.fragment;
    }

    public final HttpUrl resolve(String str) {
        Builder builder = new Builder();
        if (builder.parse(this, str) == Builder.ParseResult.SUCCESS) {
            return builder.build();
        }
        return null;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.scheme = this.scheme;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.host = this.host;
        builder.port = this.port != defaultPort(this.scheme) ? this.port : -1;
        builder.encodedPathSegments.clear();
        builder.encodedPathSegments.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.encodedFragment = encodedFragment();
        return builder;
    }

    public static HttpUrl parse(String str) {
        Builder builder = new Builder();
        if (builder.parse(null, str) == Builder.ParseResult.SUCCESS) {
            return builder.build();
        }
        return null;
    }

    public static HttpUrl get(URL url) {
        return parse(url.toString());
    }

    static HttpUrl getChecked(String str) throws Throwable {
        Builder builder = new Builder();
        Builder.ParseResult parseResult = builder.parse(null, str);
        int i = AnonymousClass1.$SwitchMap$com$squareup$okhttp$HttpUrl$Builder$ParseResult[parseResult.ordinal()];
        if (i == 1) {
            return builder.build();
        }
        if (i == 2) {
            throw new UnknownHostException("Invalid host: ".concat(String.valueOf(str)));
        }
        StringBuilder sb = new StringBuilder("Invalid URL: ");
        sb.append(parseResult);
        sb.append(" for ");
        sb.append(str);
        throw new MalformedURLException(sb.toString());
    }

    /* JADX INFO: renamed from: com.squareup.okhttp.HttpUrl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$okhttp$HttpUrl$Builder$ParseResult;

        static {
            int[] iArr = new int[Builder.ParseResult.values().length];
            $SwitchMap$com$squareup$okhttp$HttpUrl$Builder$ParseResult = iArr;
            try {
                iArr[Builder.ParseResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$squareup$okhttp$HttpUrl$Builder$ParseResult[Builder.ParseResult.INVALID_HOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$squareup$okhttp$HttpUrl$Builder$ParseResult[Builder.ParseResult.UNSUPPORTED_SCHEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$squareup$okhttp$HttpUrl$Builder$ParseResult[Builder.ParseResult.MISSING_SCHEME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$squareup$okhttp$HttpUrl$Builder$ParseResult[Builder.ParseResult.INVALID_PORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static HttpUrl get(URI uri) {
        return parse(uri.toString());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).url.equals(this.url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return this.url;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int delimiterOffset(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    static String percentDecode(String str, boolean z) {
        return percentDecode(str, 0, str.length(), z);
    }

    private List<String> percentDecode(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? percentDecode(next, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String percentDecode(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                rotationProviderListenerWrapper.b(str, i, i3);
                percentDecode(rotationProviderListenerWrapper, str, i3, i2, z);
                return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, Charsets.UTF_8);
            }
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    static void percentDecode(RotationProviderListenerWrapper rotationProviderListenerWrapper, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iDecodeHexDigit = decodeHexDigit(str.charAt(i + 1));
                int iDecodeHexDigit2 = decodeHexDigit(str.charAt(i3));
                if (iDecodeHexDigit != -1 && iDecodeHexDigit2 != -1) {
                    rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3((iDecodeHexDigit << 4) + iDecodeHexDigit2);
                    i = i3;
                } else {
                    rotationProviderListenerWrapper.asBinder(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z) {
                rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
            } else {
                rotationProviderListenerWrapper.asBinder(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    static String canonicalize(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) throws EOFException {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z3) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || z) && (iCodePointAt != 43 || !z2)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                rotationProviderListenerWrapper.b(str, i, iCharCount);
                canonicalize(rotationProviderListenerWrapper, str, iCharCount, i2, str2, z, z2, z3);
                return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, Charsets.UTF_8);
            }
        }
        return str.substring(i, i2);
    }

    static void canonicalize(RotationProviderListenerWrapper rotationProviderListenerWrapper, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) throws EOFException {
        RotationProviderListenerWrapper rotationProviderListenerWrapper2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z2) {
                    String str3 = z ? "+" : "%2B";
                    Intrinsics.checkNotNullParameter(str3, "");
                    rotationProviderListenerWrapper.b(str3, 0, str3.length());
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z3) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && !z))) {
                    if (rotationProviderListenerWrapper2 == null) {
                        rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
                    }
                    rotationProviderListenerWrapper2.asBinder(iCodePointAt);
                    while (rotationProviderListenerWrapper2.size != 0) {
                        byte bCancel = rotationProviderListenerWrapper2.cancel();
                        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(37);
                        char[] cArr = HEX_DIGITS;
                        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) cArr[((bCancel & UByte.MAX_VALUE) >> 4) & 15]);
                        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) cArr[bCancel & 15]);
                    }
                } else {
                    rotationProviderListenerWrapper.asBinder(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    static String canonicalize(String str, String str2, boolean z, boolean z2, boolean z3) {
        return canonicalize(str, 0, str.length(), str2, z, z2, z3);
    }
}
