package okhttp3;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.dynamiclinks.DynamicLink;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 32\u00020\u0001:\u000243BQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\u0002H\u0007¢\u0006\u0004\b \u0010\u0011J\u000f\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\tH\u0007¢\u0006\u0004\b\"\u0010\u001aJ\u000f\u0010#\u001a\u00020\u0002H\u0017¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0007¢\u0006\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010\u0011R\u001a\u0010)\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010\u0015R\u001a\u0010+\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010\u001aR\u001a\u0010-\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b-\u0010\u001aR\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b.\u0010\u0011R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b0\u0010\u001aR\u001a\u00101\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b1\u0010\u001aR\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b2\u0010\u0011"}, d2 = {"Lokhttp3/Cookie;", "", "", "p0", "p1", "", "p2", "p3", "p4", "", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "-deprecated_domain", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "-deprecated_expiresAt", "()J", "", "hashCode", "()I", "-deprecated_hostOnly", "()Z", "-deprecated_httpOnly", "Lokhttp3/HttpUrl;", "matches", "(Lokhttp3/HttpUrl;)Z", "-deprecated_name", "-deprecated_path", "-deprecated_persistent", "-deprecated_secure", "toString", "toString$okhttp", "(Z)Ljava/lang/String;", "-deprecated_value", DynamicLink.Builder.KEY_DOMAIN, "Ljava/lang/String;", "expiresAt", "J", "hostOnly", "Z", "httpOnly", "name", "path", "persistent", "secure", "value", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Cookie {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Pattern DAY_OF_MONTH_PATTERN;
    private static final Pattern MONTH_PATTERN;
    private static final Pattern TIME_PATTERN;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final Pattern YEAR_PATTERN;
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    private static final byte[] $$d = {21, 65, -9, -121, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -67, 14, -25, 11, 7, -10, -7, 69, -64, -3, 10, -2, -8, Base64.padSymbol, -69, 12, -13, -5, 15, -15, -2, 69, -28, -38, 9, -6, -14, 12, 4, -18, 19, -12, 39, -34, -16, 18, -9, -4, 40, -51, 1, -2, 4, 1, 7, -14, 34, -20, -9, 4, 1, -18, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64};
    private static final int $$e = 136;
    private static final byte[] $$a = {81, 125, 2, 46, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 177;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = okhttp3.Cookie.$$a
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r7
            int r6 = r6 + (-10)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 15
            int r7 = r7 + 84
            byte[] r0 = okhttp3.Cookie.$$d
            int r6 = r6 * 31
            int r1 = 69 - r6
            int r8 = r8 * 68
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r6 = 68 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2e:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-1)
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.d(int, int, int, java.lang.Object[]):void");
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }

    public static final /* synthetic */ Pattern access$getDAY_OF_MONTH_PATTERN$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        Pattern pattern = DAY_OF_MONTH_PATTERN;
        int i5 = i3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return pattern;
    }

    public static final /* synthetic */ Pattern access$getMONTH_PATTERN$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Pattern pattern = MONTH_PATTERN;
        int i4 = i3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return pattern;
        }
        throw null;
    }

    public static final /* synthetic */ Pattern access$getTIME_PATTERN$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        Pattern pattern = TIME_PATTERN;
        int i5 = i3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return pattern;
    }

    public static final /* synthetic */ Pattern access$getYEAR_PATTERN$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return YEAR_PATTERN;
        }
        throw null;
    }

    public final String name() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.name;
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return str;
    }

    public final String value() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.value;
            int i4 = 94 / 0;
        } else {
            str = this.value;
        }
        int i5 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long expiresAt() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.expiresAt;
        int i4 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final String domain() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.domain;
        int i5 = i2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String path() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.path;
        int i4 = i3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean secure() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.secure;
        int i5 = i2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 37;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 19472), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2624, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - Process.getGidForName("")), ((Process.getThreadPriority(0) + 20) >> 6) + 481, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $10 + 75;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 109;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getEdgeSlop() >> 16)), 481 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 36 - TextUtils.indexOf((CharSequence) "", '0', 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i9 = 3 / 0;
            } else {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 39422), 481 - Color.red(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    public final boolean httpOnly() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.httpOnly;
        }
        throw null;
    }

    public final boolean persistent() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.persistent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean hostOnly() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hostOnly;
        int i5 = i2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean matches(HttpUrl p0) {
        boolean zDomainMatch;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.hostOnly) {
            zDomainMatch = Intrinsics.areEqual(p0.host(), this.domain);
        } else {
            zDomainMatch = INSTANCE.domainMatch(p0.host(), this.domain);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
        }
        if (!zDomainMatch) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!INSTANCE.pathMatch(p0, this.path)) {
            return false;
        }
        if (!this.secure || p0.getIsHttps()) {
            return true;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i8 = i7 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final boolean equals(Object p0) {
        Cookie cookie;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 60 / 0;
            if (p0 instanceof Cookie) {
                cookie = (Cookie) p0;
                if (Intrinsics.areEqual(cookie.name, this.name) && Intrinsics.areEqual(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && Intrinsics.areEqual(cookie.domain, this.domain) && Intrinsics.areEqual(cookie.path, this.path)) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
                    i = i5 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
                    int i6 = i5 % 2;
                    if (cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent) {
                        int i7 = i + 33;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                        int i8 = i7 % 2;
                        if (cookie.hostOnly == this.hostOnly) {
                            return true;
                        }
                    }
                }
            }
        } else if (p0 instanceof Cookie) {
            cookie = (Cookie) p0;
            if (Intrinsics.areEqual(cookie.name, this.name)) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
                i = i9 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
                int i10 = i9 % 2;
                if (cookie.secure == this.secure) {
                    int i11 = i + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                    int i12 = i11 % 2;
                    if (cookie.hostOnly == this.hostOnly) {
                        return true;
                    }
                }
            }
        }
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.value.hashCode();
        int iHashCode3 = Long.hashCode(this.expiresAt);
        int iHashCode4 = this.domain.hashCode();
        int iHashCode5 = this.path.hashCode();
        int iHashCode6 = Boolean.hashCode(this.secure);
        int iHashCode7 = ((((((((((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode7;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        return toString$okhttp(i2 % 2 != 0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "name", imports = {}))
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name */
    public final String m9550deprecated_name() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\nR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "Lokhttp3/Cookie;", "build", "()Lokhttp3/Cookie;", "", "p0", DynamicLink.Builder.KEY_DOMAIN, "(Ljava/lang/String;)Lokhttp3/Cookie$Builder;", "", "p1", "(Ljava/lang/String;Z)Lokhttp3/Cookie$Builder;", "", "expiresAt", "(J)Lokhttp3/Cookie$Builder;", "hostOnlyDomain", "httpOnly", "()Lokhttp3/Cookie$Builder;", "name", "path", "secure", "value", "Ljava/lang/String;", "J", "hostOnly", "Z", "persistent"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        public final Builder name(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (!Intrinsics.areEqual(StringsKt.trim((CharSequence) p0).toString(), p0)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.name = p0;
            return this;
        }

        public final Builder value(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (!Intrinsics.areEqual(StringsKt.trim((CharSequence) p0).toString(), p0)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.value = p0;
            return this;
        }

        public final Builder expiresAt(long p0) {
            if (p0 <= 0) {
                p0 = Long.MIN_VALUE;
            }
            if (p0 > DatesKt.MAX_DATE) {
                p0 = 253402300799999L;
            }
            this.expiresAt = p0;
            this.persistent = true;
            return this;
        }

        public final Builder domain(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return domain(p0, false);
        }

        public final Builder hostOnlyDomain(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return domain(p0, true);
        }

        private final Builder domain(String p0, boolean p1) {
            String canonicalHost = HostnamesKt.toCanonicalHost(p0);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected domain: ".concat(String.valueOf(p0)));
            }
            this.domain = canonicalHost;
            this.hostOnly = p1;
            return this;
        }

        public final Builder path(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (!StringsKt.startsWith$default(p0, "/", false, 2, (Object) null)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.path = p0;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new NullPointerException("builder.domain == null");
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!R\u0018\u0010#\u001a\u0006*\u00020\"0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0006*\u00020\"0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0018\u0010&\u001a\u0006*\u00020\"0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0018\u0010'\u001a\u0006*\u00020\"0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010$"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "", "p3", "dateCharacterOffset", "(Ljava/lang/String;IIZ)I", "domainMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "Lokhttp3/HttpUrl;", "Lokhttp3/Cookie;", "parse$okhttp", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "parse", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "Lokhttp3/Headers;", "", "parseAll", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List;", "parseDomain", "(Ljava/lang/String;)Ljava/lang/String;", "parseExpires", "(Ljava/lang/String;II)J", "parseMaxAge", "(Ljava/lang/String;)J", "pathMatch", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Z", "Ljava/util/regex/Pattern;", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String p0, String p1) {
            if (Intrinsics.areEqual(p0, p1)) {
                return true;
            }
            return StringsKt.endsWith$default(p0, p1, false, 2, (Object) null) && p0.charAt((p0.length() - p1.length()) - 1) == '.' && !Util.canParseAsIpAddress(p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl p0, String p1) {
            String strEncodedPath = p0.encodedPath();
            if (Intrinsics.areEqual(strEncodedPath, p1)) {
                return true;
            }
            return StringsKt.startsWith$default(strEncodedPath, p1, false, 2, (Object) null) && (StringsKt.endsWith$default(p1, "/", false, 2, (Object) null) || strEncodedPath.charAt(p1.length()) == '/');
        }

        @JvmStatic
        public final Cookie parse(HttpUrl p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return parse$okhttp(System.currentTimeMillis(), p0, p1);
        }

        public final Cookie parse$okhttp(long p0, HttpUrl p1, String p2) {
            long j;
            Cookie cookie;
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            int iDelimiterOffset$default = Util.delimiterOffset$default(p2, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = Util.delimiterOffset$default(p2, '=', 0, iDelimiterOffset$default, 2, (Object) null);
            if (iDelimiterOffset$default2 == iDelimiterOffset$default) {
                return null;
            }
            String strTrimSubstring$default = Util.trimSubstring$default(p2, 0, iDelimiterOffset$default2, 1, null);
            if (strTrimSubstring$default.length() == 0 || Util.indexOfControlOrNonAscii(strTrimSubstring$default) != -1) {
                return null;
            }
            String strTrimSubstring = Util.trimSubstring(p2, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
            if (Util.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
                return null;
            }
            int i = iDelimiterOffset$default + 1;
            int length = p2.length();
            String domain = null;
            String str3 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            long maxAge = -1;
            long expires = DatesKt.MAX_DATE;
            while (i < length) {
                int iDelimiterOffset = Util.delimiterOffset(p2, ';', i, length);
                int iDelimiterOffset2 = Util.delimiterOffset(p2, '=', i, iDelimiterOffset);
                String strTrimSubstring2 = Util.trimSubstring(p2, i, iDelimiterOffset2);
                String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(p2, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                if (StringsKt.equals(strTrimSubstring2, "expires", true)) {
                    try {
                        expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
                        z3 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.equals(strTrimSubstring2, "max-age", true)) {
                    maxAge = parseMaxAge(strTrimSubstring3);
                    z3 = true;
                } else if (StringsKt.equals(strTrimSubstring2, DynamicLink.Builder.KEY_DOMAIN, true)) {
                    domain = parseDomain(strTrimSubstring3);
                    z4 = false;
                } else if (StringsKt.equals(strTrimSubstring2, "path", true)) {
                    str3 = strTrimSubstring3;
                } else if (StringsKt.equals(strTrimSubstring2, "secure", true)) {
                    z = true;
                } else if (StringsKt.equals(strTrimSubstring2, "httponly", true)) {
                    z2 = true;
                }
                i = iDelimiterOffset + 1;
            }
            long j2 = Long.MIN_VALUE;
            if (maxAge != Long.MIN_VALUE) {
                if (maxAge != -1) {
                    expires = p0 + (maxAge <= 9223372036854775L ? maxAge * 1000 : Long.MAX_VALUE);
                    if (expires >= p0) {
                        j2 = DatesKt.MAX_DATE;
                        if (expires > DatesKt.MAX_DATE) {
                        }
                    } else {
                        j2 = DatesKt.MAX_DATE;
                    }
                    j = j2;
                }
                j = expires;
            } else {
                j = j2;
            }
            String strHost = p1.host();
            if (domain == null) {
                str = strHost;
                cookie = null;
            } else {
                if (!domainMatch(strHost, domain)) {
                    return null;
                }
                cookie = null;
                str = domain;
            }
            if (strHost.length() != str.length() && PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str) == null) {
                return cookie;
            }
            String strSubstring = "/";
            String str4 = str3;
            if (str4 == null || !StringsKt.startsWith$default(str4, "/", false, 2, (Object) cookie)) {
                String strEncodedPath = p1.encodedPath();
                int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) strEncodedPath, '/', 0, false, 6, (Object) null);
                if (iLastIndexOf$default != 0) {
                    strSubstring = strEncodedPath.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                }
                str2 = strSubstring;
            } else {
                str2 = str4;
            }
            return new Cookie(strTrimSubstring$default, strTrimSubstring, j, str, str2, z, z2, z3, z4, null);
        }

        private final long parseExpires(String p0, int p1, int p2) {
            int iDateCharacterOffset = dateCharacterOffset(p0, p1, p2, false);
            Matcher matcher = Cookie.access$getTIME_PATTERN$cp().matcher(p0);
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int iIndexOf$default = -1;
            int i4 = -1;
            int i5 = -1;
            while (iDateCharacterOffset < p2) {
                int iDateCharacterOffset2 = dateCharacterOffset(p0, iDateCharacterOffset + 1, p2, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i2 == -1 && matcher.usePattern(Cookie.access$getTIME_PATTERN$cp()).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "");
                    i2 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "");
                    i4 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "");
                    i5 = Integer.parseInt(strGroup3);
                } else if (i3 == -1 && matcher.usePattern(Cookie.access$getDAY_OF_MONTH_PATTERN$cp()).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "");
                    i3 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(Cookie.access$getMONTH_PATTERN$cp()).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "");
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    String strPattern = Cookie.access$getMONTH_PATTERN$cp().pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "");
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i == -1 && matcher.usePattern(Cookie.access$getYEAR_PATTERN$cp()).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "");
                    i = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(p0, iDateCharacterOffset2 + 1, p2, false);
            }
            if (70 <= i && i < 100) {
                i += 1900;
            }
            if (i >= 0 && i < 70) {
                i += 2000;
            }
            if (i < 1601) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i3 <= 0 || i3 >= 32) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i2 < 0 || i2 >= 24) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i4 < 0 || i4 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i5 < 0 || i5 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i3);
            gregorianCalendar.set(11, i2);
            gregorianCalendar.set(12, i4);
            gregorianCalendar.set(13, i5);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final int dateCharacterOffset(String p0, int p1, int p2, boolean p3) {
            while (p1 < p2) {
                char cCharAt = p0.charAt(p1);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!p3)) {
                    return p1;
                }
                p1++;
            }
            return p2;
        }

        private final long parseMaxAge(String p0) {
            try {
                long j = Long.parseLong(p0);
                if (j <= 0) {
                    return Long.MIN_VALUE;
                }
                return j;
            } catch (NumberFormatException e2) {
                if (new Regex("-?\\d+").matches(p0)) {
                    return !StringsKt.startsWith$default(p0, "-", false, 2, (Object) null) ? Long.MAX_VALUE : Long.MIN_VALUE;
                }
                throw e2;
            }
        }

        private final String parseDomain(String p0) {
            if (StringsKt.endsWith$default(p0, ".", false, 2, (Object) null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(StringsKt.removePrefix(p0, (CharSequence) "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        @JvmStatic
        public final List<Cookie> parseAll(HttpUrl p0, Headers p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            List<String> listValues = p1.values("Set-Cookie");
            int size = listValues.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie cookie = parse(p0, listValues.get(i));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList != null) {
                List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
                return listUnmodifiableList;
            }
            return CollectionsKt.emptyList();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0216  */
    /* JADX WARN: Code duplicated, block: B:27:0x021b  */
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "value", imports = {}))
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name */
    public final String m9554deprecated_value() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
            int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[37], bArr[7], bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iResolveOpacity, fadingEdgeLength, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{10372, 38460, 21999, 5298, 53846, 37151, 20683, 8138, 56626, 40185, 23533, 6507, 55304, 34781, 18067, 1081, 50168, 33409, 16471, 3871, 52938, 36237}, 48822 - ImageFormat.getBitsPerPixel(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{10368, 51492, 60382, 36242, 44578, 16609, 25231, 780, 9704, 51089, 63563, 39678, 48272, 23873, 32758}, 57773 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int defaultSize = View.getDefaultSize(0, 0) + 921;
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 & 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, defaultSize, packedPositionChild, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte b4 = $$a[80];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 51), (byte) 37, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, scrollBarSize, keyRepeatDelay, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i4 = ((788831605 + (((~iUptimeMillis) | (-20556052)) * 1444)) + (((~(iUptimeMillis | 893549253)) | ((~(880530390 | iUptimeMillis)) | (-897317848))) * (-1444))) - 15886123;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{10372, 39354, 19171, 15108, 60494, 23929, 4007, 61596, 41228, 4652, 50047, 46544, 26344, 55291, 38975, 18771, 15235, 60621, 24035, 3647, 65381, 41352, 4769, 50151, 46108, 25928}, 45361 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{10374, 14793, 2597, 7324, 28132, 32310, 16519, 20939, 41565, 46260, 34291, 38495, 63658, 51457, 55887, 11451, 15642, 3682}, 4440 - TextUtils.indexOf((CharSequence) "", '0'), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 28 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{10383, 28413, 42081, 64495, 12591, 18644, 36434, 50628, 6986, 21130, 59404, 12207, 25914, 48308, 61982, 2463}, 18041 - Color.blue(0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{10380, 8654, 14878, 13158, 3501, 1543, 8011, 27061, 25301, 31555, 30080, 20200, 18194, 20873, 43731, 41761}, TextUtils.indexOf((CharSequence) "", '0', 0) + 2384, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1972453057};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[77];
                Object[] objArr13 = new Object[1];
                d(b5, bArr3[5], b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[5];
                Object[] objArr14 = new Object[1];
                d(b6, bArr3[77], b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 31534);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 921;
                    int iAxisFromString = 27 - MotionEvent.axisFromString("");
                    byte b7 = $$a[80];
                    Object[] objArr16 = new Object[1];
                    a(b7, (byte) (b7 | 51), (byte) 37, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, offsetAfter, iAxisFromString, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{10372, 38460, 21999, 5298, 53846, 37151, 20683, 8138, 56626, 40185, 23533, 6507, 55304, 34781, 18067, 1081, 50168, 33409, 16471, 3871, 52938, 36237}, KeyEvent.normalizeMetaState(0) + 48823, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{10368, 51492, 60382, 36242, 44578, 16609, 25231, 780, 9704, 51089, 63563, 39678, 48272, 23873, 32758}, 57773 - (ViewConfiguration.getEdgeSlop() >> 16), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
                        int i9 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                        int maximumFlingVelocity = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[80];
                        byte b9 = bArr4[7];
                        Object[] objArr19 = new Object[1];
                        a(b8, b9, (byte) (b9 & 52), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i9, maximumFlingVelocity, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 31533);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 28;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[37];
                        byte b11 = bArr5[7];
                        byte b12 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        a(b10, b11, b12, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize2, offsetBefore, iIndexOf, -1048449946, false, (String) objArr20[0], null);
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            int i10 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt();
            int i11 = i10 + 478757582 + (((-557598867) | iNextInt) * (-381)) + (((~((~iNextInt) | 1212253445)) | (-1765624980)) * 381) + 1991770442;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr21[0])[0] = i13 ^ (i13 << 5);
            return this.value;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr == null) {
            throw null;
        }
        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
        for (int i15 = i14 % 2 != 0 ? 0 : 1; i15 < strArr.length; i15++) {
            arrayList.add(strArr[i15]);
        }
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "persistent", imports = {}))
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m9552deprecated_persistent() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.persistent;
        int i4 = i3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "expiresAt", imports = {}))
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m9547deprecated_expiresAt() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        long j = this.expiresAt;
        int i5 = i3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostOnly", imports = {}))
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m9548deprecated_hostOnly() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.hostOnly;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = DynamicLink.Builder.KEY_DOMAIN, imports = {}))
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name */
    public final String m9546deprecated_domain() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.domain;
        }
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "path", imports = {}))
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name */
    public final String m9551deprecated_path() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.path;
        int i4 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "httpOnly", imports = {}))
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m9549deprecated_httpOnly() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        boolean z = this.httpOnly;
        int i5 = i3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return z;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "secure", imports = {}))
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m9553deprecated_secure() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.secure;
        int i5 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    public final String toString$okhttp(boolean p0) {
        int i;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        Object obj = null;
        if (this.persistent) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
            int i4 = i3 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
            if (i3 % 2 == 0) {
                int i5 = 53 / 0;
                if (this.expiresAt == Long.MIN_VALUE) {
                    i = i4 + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                    if (i % 2 == 0) {
                        sb.append("; max-age=0");
                        obj.hashCode();
                        throw null;
                    }
                    sb.append("; max-age=0");
                } else {
                    sb.append("; expires=");
                    sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
                }
            } else if (this.expiresAt == Long.MIN_VALUE) {
                i = i4 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                if (i % 2 == 0) {
                    sb.append("; max-age=0");
                    obj.hashCode();
                    throw null;
                }
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (p0) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 == 0) {
                sb.append("; secure");
                obj.hashCode();
                throw null;
            }
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        b();
        INSTANCE = new Companion(null);
        YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
        MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
        TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
        int i = b + 61;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    @JvmStatic
    public static final Cookie parse(HttpUrl httpUrl, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Cookie cookie = INSTANCE.parse(httpUrl, str);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return cookie;
    }

    @JvmStatic
    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            INSTANCE.parseAll(httpUrl, headers);
            obj.hashCode();
            throw null;
        }
        List<Cookie> all = INSTANCE.parseAll(httpUrl, headers);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return all;
        }
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 8281796589912818174L;
    }
}
