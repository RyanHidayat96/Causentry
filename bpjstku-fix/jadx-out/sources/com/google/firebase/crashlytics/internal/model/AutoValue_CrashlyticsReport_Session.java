package com.google.firebase.crashlytics.internal.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.encoders.annotations.Encodable;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {
    private static int $10 = 0;
    private static int $11 = 1;
    private final CrashlyticsReport.Session.Application app;
    private final String appQualitySessionId;
    private final boolean crashed;
    private final CrashlyticsReport.Session.Device device;
    private final Long endedAt;
    private final List<CrashlyticsReport.Session.Event> events;
    private final String generator;
    private final int generatorType;
    private final String identifier;
    private final CrashlyticsReport.Session.OperatingSystem os;
    private final long startedAt;
    private final CrashlyticsReport.Session.User user;
    private static final byte[] $$d = {82, Base64.padSymbol, -66, -42, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -4, -4, -5, 8, -24, 20, -16, 7, -13, 3, -4, -18, 4, -8, -1, -1, -58, 73, -3, -17, -3, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -70};
    private static final int $$e = 40;
    private static final byte[] $$a = {97, 58, 103, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 0;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -3188233938392344877L;

    private static void a(byte b2, int i, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (b2 * 3) + 84;
        int i3 = s * 15;
        int i4 = 108 - (i * 52);
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i2 = (i5 + i2) - 11;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i7 = bArr[i4];
                i4++;
                i2 = (i2 + i7) - 11;
            }
        }
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
    private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 54 - r8
            int r6 = r6 * 53
            int r6 = 57 - r6
            byte[] r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session.$$d
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r7]
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + 3
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session.d(byte, byte, short, java.lang.Object[]):void");
    }

    private AutoValue_CrashlyticsReport_Session(String str, String str2, String str3, long j, Long l, boolean z, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, List<CrashlyticsReport.Session.Event> list, int i) {
        this.generator = str;
        this.identifier = str2;
        this.appQualitySessionId = str3;
        this.startedAt = j;
        this.endedAt = l;
        this.crashed = z;
        this.app = application;
        this.user = user;
        this.os = operatingSystem;
        this.device = device;
        this.events = list;
        this.generatorType = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String getGenerator() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.generator;
        int i4 = i2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 103;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.red(0) + 19472), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2625, 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 39422), 481 - View.resolveSize(0, 0), 37 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 101;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39421), 481 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i7 = 99 / 0;
            } else {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    z = true;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (ViewConfiguration.getEdgeSlop() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 481, TextUtils.lastIndexOf("", '0') + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                } else {
                    z = true;
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class Builder extends CrashlyticsReport.Session.Builder {
        private CrashlyticsReport.Session.Application app;
        private String appQualitySessionId;
        private boolean crashed;
        private CrashlyticsReport.Session.Device device;
        private Long endedAt;
        private List<CrashlyticsReport.Session.Event> events;
        private String generator;
        private int generatorType;
        private String identifier;
        private CrashlyticsReport.Session.OperatingSystem os;
        private byte set$0;
        private long startedAt;
        private CrashlyticsReport.Session.User user;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session session) {
            this.generator = session.getGenerator();
            this.identifier = session.getIdentifier();
            this.appQualitySessionId = session.getAppQualitySessionId();
            this.startedAt = session.getStartedAt();
            this.endedAt = session.getEndedAt();
            this.crashed = session.isCrashed();
            this.app = session.getApp();
            this.user = session.getUser();
            this.os = session.getOs();
            this.device = session.getDevice();
            this.events = session.getEvents();
            this.generatorType = session.getGeneratorType();
            this.set$0 = (byte) 7;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setGenerator(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.generator = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.identifier = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setAppQualitySessionId(String str) {
            this.appQualitySessionId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setStartedAt(long j) {
            this.startedAt = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setEndedAt(Long l) {
            this.endedAt = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setCrashed(boolean z) {
            this.crashed = z;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.app = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user) {
            this.user = user;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.os = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device) {
            this.device = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setEvents(List<CrashlyticsReport.Session.Event> list) {
            this.events = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setGeneratorType(int i) {
            this.generatorType = i;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session build() {
            if (this.set$0 != 7 || this.generator == null || this.identifier == null || this.app == null) {
                StringBuilder sb = new StringBuilder();
                if (this.generator == null) {
                    sb.append(" generator");
                }
                if (this.identifier == null) {
                    sb.append(" identifier");
                }
                if ((this.set$0 & 1) == 0) {
                    sb.append(" startedAt");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" crashed");
                }
                if (this.app == null) {
                    sb.append(" app");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" generatorType");
                }
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
            }
            return new AutoValue_CrashlyticsReport_Session(this.generator, this.identifier, this.appQualitySessionId, this.startedAt, this.endedAt, this.crashed, this.app, this.user, this.os, this.device, this.events, this.generatorType);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x01fe  */
    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Encodable.Ignore
    public final String getIdentifier() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2267;
            int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0');
            int i3 = $$b;
            Object[] objArr2 = new Object[1];
            a((byte) i3, $$a[37], (byte) i3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSizeAndState, iLastIndexOf, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{16297, 61017, 40018, 19015, 30811, 9818, 54358, 33311, 45151, 24140, 3088, 14958, 59461, 38472, 17486, 29276, 8277, 52836, 64586, 43594, 22599, 1608}, 53760 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{16301, 30529, 44643, 58647, 7215, 21460, 35570, 49625, 30853, 44964, 59222, 7787, 21789, 35844, 49963}, 18661 - Color.green(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int jumpTapTimeout = 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iKeyCodeFromString = 33 - KeyEvent.keyCodeFromString("");
            int i4 = $$b;
            Object[] objArr5 = new Object[1];
            a((byte) i4, $$a[132], (byte) i4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, jumpTapTimeout, iKeyCodeFromString, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iIndexOf = 2267 - TextUtils.indexOf("", "");
                int i5 = 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b2 = (byte) $$b;
                Object[] objArr6 = new Object[1];
                a(b2, b2, $$a[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, iIndexOf, i5, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[0])[0];
            int i7 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i8 = ~iUptimeMillis;
            int i9 = 1339960208 + ((iUptimeMillis | 164667709) * (-859)) + (((~(iUptimeMillis | (-4194597))) | (~(164667709 | i8))) * 859) + (((~((-644045607) | i8)) | 639851010) * 859) + 639500603;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{16297, 19773, 55962, 26731, 62923, 678, 36878, 7643, 43889, 14539, 17846, 54095, 24781, 61044, 31686, 34996, 5646, 41962, 12634, 48688, 52096, 22807, 59112, 29760, 33057, 3727}, View.MeasureSpec.makeMeasureSpec(0, 0) + 29339, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{16299, 60900, 39688, 18609, 30409, 9243, 53674, 65510, 44400, 23193, 2270, 13938, 58247, 37164, 48994, 27798, 6711, 51279}, TextUtils.lastIndexOf("", '0', 0, 0) + 53850, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = b + 95;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                    int i13 = i12 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{16290, 42940, 3988, 63382, 24498, 51149, 45015, 5941, 65287, 26459, 53065, 46934, 8007, 34477, 28299, 54942}, 38933 - (Process.myTid() >> 22), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{16289, 10317, 4207, 30725, 24632, 18628, 45306, 39062, 32904, 59712, 53617, 14603, 8455, 2506, 29154, 22914}, 6113 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 639500603};
                byte[] bArr = $$d;
                byte b3 = (byte) (-bArr[50]);
                byte b4 = (byte) (b3 - 1);
                Object[] objArr13 = new Object[1];
                d(b3, b4, b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr[50];
                byte b6 = (byte) (b5 + 1);
                byte b7 = (byte) (-b5);
                Object[] objArr14 = new Object[1];
                d(b6, b7, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 2267;
                        int mirror = AndroidCharacter.getMirror('0') - 15;
                        byte b8 = (byte) $$b;
                        Object[] objArr16 = new Object[1];
                        a(b8, b8, $$a[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, iKeyCodeFromString2, mirror, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{16297, 61017, 40018, 19015, 30811, 9818, 54358, 33311, 45151, 24140, 3088, 14958, 59461, 38472, 17486, 29276, 8277, 52836, 64586, 43594, 22599, 1608}, 53759 - Color.red(0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{16301, 30529, 44643, 58647, 7215, 21460, 35570, 49625, 30853, 44964, 59222, 7787, 21789, 35844, 49963}, 18660 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2268;
                            int modifierMetaStateMask2 = 32 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int i14 = $$b;
                            Object[] objArr19 = new Object[1];
                            a((byte) i14, $$a[132], (byte) i14, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, modifierMetaStateMask, modifierMetaStateMask2, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                            int iCombineMeasuredStates = 2267 - View.combineMeasuredStates(0, 0);
                            int iNormalizeMetaState = 33 - KeyEvent.normalizeMetaState(0);
                            int i15 = $$b;
                            Object[] objArr20 = new Object[1];
                            a((byte) i15, $$a[37], (byte) i15, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iCombineMeasuredStates, iNormalizeMetaState, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i16 = ((int[]) objArr[3])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 == i16) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int i21 = ~System.identityHashCode(this);
            int i22 = i18 + (-584892142) + (((~((-242143569) | i21)) | (-566569748)) * (-983)) + (((~(i21 | (-566569748))) | 562113027) * 983);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr21[2])[0] = i24 ^ (i24 << 5);
            int i25 = b + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
            if (i25 % 2 != 0) {
                return this.identifier;
            }
            int i26 = 9 / 0;
            return this.identifier;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[1];
        if (strArr3 != null) {
            int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i28 = i27 + 47;
            b = i28 % 128;
            int i29 = i28 % 2;
            int i30 = i27 + 39;
            b = i30 % 128;
            int i31 = i30 % 2;
            while (i2 < strArr3.length) {
                int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                b = i32 % 128;
                if (i32 % 2 != 0) {
                    arrayList.add(strArr3[i2]);
                    i2 += 50;
                } else {
                    arrayList.add(strArr3[i2]);
                    i2++;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i17));
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String getAppQualitySessionId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.appQualitySessionId;
        int i4 = i2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final long getStartedAt() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        long j = this.startedAt;
        int i5 = i3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final Long getEndedAt() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Long l = this.endedAt;
        int i5 = i3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final boolean isCrashed() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.crashed;
        int i5 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Application getApp() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        CrashlyticsReport.Session.Application application = this.app;
        int i5 = i2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return application;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.User getUser() {
        int i = 2 % 2;
        int i2 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        CrashlyticsReport.Session.User user = this.user;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return user;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.OperatingSystem getOs() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 67;
        b = i3 % 128;
        int i4 = i3 % 2;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.os;
        int i5 = i2 + 57;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return operatingSystem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Device getDevice() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        CrashlyticsReport.Session.Device device = this.device;
        int i5 = i3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return device;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final List<CrashlyticsReport.Session.Event> getEvents() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        List<CrashlyticsReport.Session.Event> list = this.events;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final int getGeneratorType() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.generatorType;
        int i5 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.generator);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", appQualitySessionId=");
        sb.append(this.appQualitySessionId);
        sb.append(", startedAt=");
        sb.append(this.startedAt);
        sb.append(", endedAt=");
        sb.append(this.endedAt);
        sb.append(", crashed=");
        sb.append(this.crashed);
        sb.append(", app=");
        sb.append(this.app);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", os=");
        sb.append(this.os);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", events=");
        sb.append(this.events);
        sb.append(", generatorType=");
        sb.append(this.generatorType);
        sb.append("}");
        String string = sb.toString();
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0107  */
    /* JADX WARN: Code duplicated, block: B:77:0x0111  */
    /* JADX WARN: Code duplicated, block: B:79:0x0119  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0125 A[RETURN] */
    public final boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device;
        List<CrashlyticsReport.Session.Event> list;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Object obj2 = null;
        if (obj == this) {
            int i5 = b + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof CrashlyticsReport.Session) {
            CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
            if (this.generator.equals(session.getGenerator()) && this.identifier.equals(session.getIdentifier())) {
                String str = this.appQualitySessionId;
                if (str == null) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                    b = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 32 / 0;
                        if (session.getAppQualitySessionId() == null) {
                            if (this.startedAt == session.getStartedAt()) {
                                l = this.endedAt;
                                if (l == null) {
                                    i3 = b + 23;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        session.getEndedAt();
                                        throw null;
                                    }
                                    if (session.getEndedAt() == null) {
                                        if (this.crashed == session.isCrashed() && !(!this.app.equals(session.getApp()))) {
                                            user = this.user;
                                            if (user == null) {
                                                i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                                b = i2 % 128;
                                                if (i2 % 2 == 0) {
                                                    session.getUser();
                                                    throw null;
                                                }
                                                if (session.getUser() == null) {
                                                    operatingSystem = this.os;
                                                    if (operatingSystem == null ? operatingSystem.equals(session.getOs()) : session.getOs() == null) {
                                                        device = this.device;
                                                        if (device == null ? device.equals(session.getDevice()) : session.getDevice() == null) {
                                                            list = this.events;
                                                            if (list == null) {
                                                                if (session.getEvents() == null) {
                                                                    int i8 = b + 43;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                                                                    int i9 = i8 % 2;
                                                                    if (this.generatorType == session.getGeneratorType()) {
                                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                        b = i % 128;
                                                                        if (i % 2 != 0) {
                                                                            return false;
                                                                        }
                                                                        return true;
                                                                    }
                                                                }
                                                            } else if (list.equals(session.getEvents())) {
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (user.equals(session.getUser())) {
                                                operatingSystem = this.os;
                                                if (operatingSystem == null) {
                                                    device = this.device;
                                                    if (device == null) {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i10 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                                                                int i11 = i10 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i12 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                                                                int i13 = i12 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    device = this.device;
                                                    if (device == null) {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i14 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                                                                int i15 = i14 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i16 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                                                                int i17 = i16 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (l.equals(session.getEndedAt())) {
                                    if (this.crashed == session.isCrashed()) {
                                        user = this.user;
                                        if (user == null) {
                                            i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                            b = i2 % 128;
                                            if (i2 % 2 == 0) {
                                                session.getUser();
                                                throw null;
                                            }
                                            if (session.getUser() == null) {
                                                operatingSystem = this.os;
                                                if (operatingSystem == null) {
                                                    device = this.device;
                                                    if (device == null) {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i18 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                                                                int i19 = i18 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i110 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i110 % 128;
                                                                int i111 = i110 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    device = this.device;
                                                    if (device == null) {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i112 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i112 % 128;
                                                                int i113 = i112 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i114 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i114 % 128;
                                                                int i115 = i114 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (user.equals(session.getUser())) {
                                            operatingSystem = this.os;
                                            if (operatingSystem == null) {
                                                device = this.device;
                                                if (device == null) {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i116 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i116 % 128;
                                                            int i117 = i116 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i118 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i118 % 128;
                                                            int i119 = i118 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                device = this.device;
                                                if (device == null) {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i1110 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1110 % 128;
                                                            int i1111 = i1110 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i1112 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1112 % 128;
                                                            int i1113 = i1112 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (session.getAppQualitySessionId() == null) {
                        if (this.startedAt == session.getStartedAt()) {
                            l = this.endedAt;
                            if (l == null) {
                                i3 = b + 23;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                                if (i3 % 2 == 0) {
                                    session.getEndedAt();
                                    throw null;
                                }
                                if (session.getEndedAt() == null) {
                                    if (this.crashed == session.isCrashed()) {
                                        user = this.user;
                                        if (user == null) {
                                            i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                            b = i2 % 128;
                                            if (i2 % 2 == 0) {
                                                session.getUser();
                                                throw null;
                                            }
                                            if (session.getUser() == null) {
                                                operatingSystem = this.os;
                                                if (operatingSystem == null) {
                                                    device = this.device;
                                                    if (device == null) {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i1114 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1114 % 128;
                                                                int i1115 = i1114 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i1116 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1116 % 128;
                                                                int i1117 = i1116 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    device = this.device;
                                                    if (device == null) {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i1118 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1118 % 128;
                                                                int i1119 = i1118 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else {
                                                        list = this.events;
                                                        if (list == null) {
                                                            if (session.getEvents() == null) {
                                                                int i11110 = b + 43;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11110 % 128;
                                                                int i11111 = i11110 % 2;
                                                                if (this.generatorType == session.getGeneratorType()) {
                                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                    b = i % 128;
                                                                    if (i % 2 != 0) {
                                                                        return false;
                                                                    }
                                                                    return true;
                                                                }
                                                            }
                                                        } else if (list.equals(session.getEvents())) {
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (user.equals(session.getUser())) {
                                            operatingSystem = this.os;
                                            if (operatingSystem == null) {
                                                device = this.device;
                                                if (device == null) {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i11112 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11112 % 128;
                                                            int i11113 = i11112 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i11114 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11114 % 128;
                                                            int i11115 = i11114 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                device = this.device;
                                                if (device == null) {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i11116 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11116 % 128;
                                                            int i11117 = i11116 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i11118 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11118 % 128;
                                                            int i11119 = i11118 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (l.equals(session.getEndedAt())) {
                                if (this.crashed == session.isCrashed()) {
                                    user = this.user;
                                    if (user == null) {
                                        i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                        b = i2 % 128;
                                        if (i2 % 2 == 0) {
                                            session.getUser();
                                            throw null;
                                        }
                                        if (session.getUser() == null) {
                                            operatingSystem = this.os;
                                            if (operatingSystem == null) {
                                                device = this.device;
                                                if (device == null) {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i111110 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111110 % 128;
                                                            int i111111 = i111110 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i111112 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111112 % 128;
                                                            int i111113 = i111112 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                device = this.device;
                                                if (device == null) {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i111114 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111114 % 128;
                                                            int i111115 = i111114 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i111116 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111116 % 128;
                                                            int i111117 = i111116 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (user.equals(session.getUser())) {
                                        operatingSystem = this.os;
                                        if (operatingSystem == null) {
                                            device = this.device;
                                            if (device == null) {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i111118 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111118 % 128;
                                                        int i111119 = i111118 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i1111110 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111110 % 128;
                                                        int i1111111 = i1111110 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            }
                                        } else {
                                            device = this.device;
                                            if (device == null) {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i1111112 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111112 % 128;
                                                        int i1111113 = i1111112 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i1111114 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111114 % 128;
                                                        int i1111115 = i1111114 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (str.equals(session.getAppQualitySessionId())) {
                    if (this.startedAt == session.getStartedAt()) {
                        l = this.endedAt;
                        if (l == null) {
                            i3 = b + 23;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                            if (i3 % 2 == 0) {
                                session.getEndedAt();
                                throw null;
                            }
                            if (session.getEndedAt() == null) {
                                if (this.crashed == session.isCrashed()) {
                                    user = this.user;
                                    if (user == null) {
                                        i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                        b = i2 % 128;
                                        if (i2 % 2 == 0) {
                                            session.getUser();
                                            throw null;
                                        }
                                        if (session.getUser() == null) {
                                            operatingSystem = this.os;
                                            if (operatingSystem == null) {
                                                device = this.device;
                                                if (device == null) {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i1111116 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111116 % 128;
                                                            int i1111117 = i1111116 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i1111118 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111118 % 128;
                                                            int i1111119 = i1111118 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                device = this.device;
                                                if (device == null) {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i11111110 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11111110 % 128;
                                                            int i11111111 = i11111110 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else {
                                                    list = this.events;
                                                    if (list == null) {
                                                        if (session.getEvents() == null) {
                                                            int i11111112 = b + 43;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11111112 % 128;
                                                            int i11111113 = i11111112 % 2;
                                                            if (this.generatorType == session.getGeneratorType()) {
                                                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                                b = i % 128;
                                                                if (i % 2 != 0) {
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    } else if (list.equals(session.getEvents())) {
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (user.equals(session.getUser())) {
                                        operatingSystem = this.os;
                                        if (operatingSystem == null) {
                                            device = this.device;
                                            if (device == null) {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i11111114 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11111114 % 128;
                                                        int i11111115 = i11111114 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i11111116 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11111116 % 128;
                                                        int i11111117 = i11111116 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            }
                                        } else {
                                            device = this.device;
                                            if (device == null) {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i11111118 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11111118 % 128;
                                                        int i11111119 = i11111118 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i111111110 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111111110 % 128;
                                                        int i111111111 = i111111110 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (l.equals(session.getEndedAt())) {
                            if (this.crashed == session.isCrashed()) {
                                user = this.user;
                                if (user == null) {
                                    i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                    b = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        session.getUser();
                                        throw null;
                                    }
                                    if (session.getUser() == null) {
                                        operatingSystem = this.os;
                                        if (operatingSystem == null) {
                                            device = this.device;
                                            if (device == null) {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i111111112 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111111112 % 128;
                                                        int i111111113 = i111111112 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i111111114 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111111114 % 128;
                                                        int i111111115 = i111111114 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            }
                                        } else {
                                            device = this.device;
                                            if (device == null) {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i111111116 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111111116 % 128;
                                                        int i111111117 = i111111116 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else {
                                                list = this.events;
                                                if (list == null) {
                                                    if (session.getEvents() == null) {
                                                        int i111111118 = b + 43;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111111118 % 128;
                                                        int i111111119 = i111111118 % 2;
                                                        if (this.generatorType == session.getGeneratorType()) {
                                                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                            b = i % 128;
                                                            if (i % 2 != 0) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                    }
                                                } else if (list.equals(session.getEvents())) {
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (user.equals(session.getUser())) {
                                    operatingSystem = this.os;
                                    if (operatingSystem == null) {
                                        device = this.device;
                                        if (device == null) {
                                            list = this.events;
                                            if (list == null) {
                                                if (session.getEvents() == null) {
                                                    int i1111111110 = b + 43;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111111110 % 128;
                                                    int i1111111111 = i1111111110 % 2;
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else if (list.equals(session.getEvents())) {
                                                if (this.generatorType == session.getGeneratorType()) {
                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                    b = i % 128;
                                                    if (i % 2 != 0) {
                                                        return false;
                                                    }
                                                    return true;
                                                }
                                            }
                                        } else {
                                            list = this.events;
                                            if (list == null) {
                                                if (session.getEvents() == null) {
                                                    int i1111111112 = b + 43;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111111112 % 128;
                                                    int i1111111113 = i1111111112 % 2;
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else if (list.equals(session.getEvents())) {
                                                if (this.generatorType == session.getGeneratorType()) {
                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                    b = i % 128;
                                                    if (i % 2 != 0) {
                                                        return false;
                                                    }
                                                    return true;
                                                }
                                            }
                                        }
                                    } else {
                                        device = this.device;
                                        if (device == null) {
                                            list = this.events;
                                            if (list == null) {
                                                if (session.getEvents() == null) {
                                                    int i1111111114 = b + 43;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111111114 % 128;
                                                    int i1111111115 = i1111111114 % 2;
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else if (list.equals(session.getEvents())) {
                                                if (this.generatorType == session.getGeneratorType()) {
                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                    b = i % 128;
                                                    if (i % 2 != 0) {
                                                        return false;
                                                    }
                                                    return true;
                                                }
                                            }
                                        } else {
                                            list = this.events;
                                            if (list == null) {
                                                if (session.getEvents() == null) {
                                                    int i1111111116 = b + 43;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111111116 % 128;
                                                    int i1111111117 = i1111111116 % 2;
                                                    if (this.generatorType == session.getGeneratorType()) {
                                                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                        b = i % 128;
                                                        if (i % 2 != 0) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else if (list.equals(session.getEvents())) {
                                                if (this.generatorType == session.getGeneratorType()) {
                                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                                    b = i % 128;
                                                    if (i % 2 != 0) {
                                                        return false;
                                                    }
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int iHashCode2 = this.generator.hashCode();
        int iHashCode3 = this.identifier.hashCode();
        String str = this.appQualitySessionId;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        long j = this.startedAt;
        int i3 = (int) (j ^ (j >>> 32));
        Long l = this.endedAt;
        if (l == null) {
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        if (this.crashed) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
            b = i6 % 128;
            int i7 = i6 % 2;
            i = 1231;
        } else {
            i = 1237;
        }
        int iHashCode6 = this.app.hashCode();
        CrashlyticsReport.Session.User user = this.user;
        int iHashCode7 = user == null ? 0 : user.hashCode();
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.os;
        int iHashCode8 = operatingSystem == null ? 0 : operatingSystem.hashCode();
        CrashlyticsReport.Session.Device device = this.device;
        int iHashCode9 = device == null ? 0 : device.hashCode();
        List<CrashlyticsReport.Session.Event> list = this.events;
        if (list != null) {
            iHashCode4 = list.hashCode();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        return this.generatorType ^ ((((((((((((((((((((((iHashCode2 ^ 1000003) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode5) * 1000003) ^ i3) * 1000003) ^ iHashCode) * 1000003) ^ i) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode4) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Builder toBuilder() {
        int i = 2 % 2;
        AnonymousClass1 anonymousClass1 = null;
        Builder builder = new Builder(this);
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return builder;
        }
        anonymousClass1.hashCode();
        throw null;
    }
}
