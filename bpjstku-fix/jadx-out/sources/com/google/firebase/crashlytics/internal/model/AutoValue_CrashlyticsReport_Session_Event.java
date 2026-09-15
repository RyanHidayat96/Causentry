package com.google.firebase.crashlytics.internal.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.core.view.ViewCompat;
import com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda9;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.Session.Event {
    private final CrashlyticsReport.Session.Event.Application app;
    private final CrashlyticsReport.Session.Event.Device device;
    private final CrashlyticsReport.Session.Event.Log log;
    private final CrashlyticsReport.Session.Event.RolloutsState rollouts;
    private final long timestamp;
    private final String type;
    private static final byte[] $$c = {56, 94, 119, -19};
    private static final int $$f = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {36, -74, -79, -21, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 138;
    private static final byte[] $$a = {89, 107, -36, -112, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
    private static final int $$b = 198;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {20264, 47812, 42234, 44694, 39152, 33453, 35913, 63101, 57373, 60019, 54326, 57290, 51696, 13205, 15749, 10152, 4422, 6971, 1329, 3842, 31034, 25817, 28407, 22759, 45563, 17438, 23078, 20580, 26223, 31867, 29343, 2219, 7885, 5350, 10984, 8450, 32586, 35494, 38040, 40692, 43154, 45775, 48171, 50719, 53375, 55825, 58452, 61352, 63890, 1015, 3559, 6090, 8484, 11097, 13651, 16234, 18760, 21690, 24220, 26760, 29421, 31965, 45557, 17416, 23068, 20552, 26228, 31862, 29312, 2216, 3924, 64177, 58505, 61140, 55498, 49860, 52268, 46608, 41061, 43640, 37964, 40878, 35202, 502, 62483, 59947, 57460, 54892, 52320, 49818, 47277, 44748, 42234, 39666, 37134, 34577, 32083, 29507, 27005, 24466};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -5512752044373883781L;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 6
            int r7 = r7 + 97
            byte[] r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.$$a
            int r8 = r8 * 19
            int r8 = r8 + 14
            int r6 = r6 * 32
            int r6 = 36 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-2)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.a(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r6 = r6 * 52
            int r6 = r6 + 1
            byte[] r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.c(short, int, short, java.lang.Object[]):void");
    }

    private AutoValue_CrashlyticsReport_Session_Event(long j, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, CrashlyticsReport.Session.Event.Log log, CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.timestamp = j;
        this.type = str;
        this.app = application;
        this.device = device;
        this.log = log;
        this.rollouts = rolloutsState;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final long getTimestamp() {
        int i = 2 % 2;
        int i2 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.timestamp;
        }
        int i3 = 41 / 0;
        return this.timestamp;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final String getType() {
        int i = 2 % 2;
        int i2 = b + 39;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 69;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Application getApp() {
        int i = 2 % 2;
        int i2 = b + 93;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        CrashlyticsReport.Session.Event.Application application = this.app;
        int i5 = i3 + 115;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return application;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Device getDevice() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        CrashlyticsReport.Session.Event.Device device = this.device;
        int i4 = i2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return device;
        }
        throw null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Log getLog() {
        CrashlyticsReport.Session.Event.Log log;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            log = this.log;
            int i4 = 79 / 0;
        } else {
            log = this.log;
        }
        int i5 = i2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return log;
        }
        throw null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.RolloutsState getRollouts() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 95;
        b = i3 % 128;
        int i4 = i3 % 2;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.rollouts;
        int i5 = i2 + 109;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return rolloutsState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Event{timestamp=");
        sb.append(this.timestamp);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", app=");
        sb.append(this.app);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", log=");
        sb.append(this.log);
        sb.append(", rollouts=");
        sb.append(this.rollouts);
        sb.append("}");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        b = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == this) {
            int i2 = b + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event)) {
            return false;
        }
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        if (this.timestamp != event.getTimestamp() || !this.type.equals(event.getType()) || !this.app.equals(event.getApp()) || !this.device.equals(event.getDevice())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Log log = this.log;
        if (log == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (event.getLog() != null) {
                return false;
            }
        } else if (!log.equals(event.getLog())) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.rollouts;
        if (rolloutsState == null) {
            if (event.getRollouts() != null) {
                return false;
            }
            int i6 = b + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
        } else if (!rolloutsState.equals(event.getRollouts())) {
            return false;
        }
        return true;
    }

    private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2188 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 40 - KeyEvent.keyCodeFromString(""), 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 33017), TextUtils.lastIndexOf("", '0', 0) + 3012, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36504 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3377, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i5 = $10 + 81;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 % 4;
        }
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36505), 3376 - (Process.myPid() >> 22), 17 - TextUtils.getCapsMode("", 0, 0), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        long j = this.timestamp;
        int i4 = (int) (j ^ (j >>> 32));
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.app.hashCode();
        int iHashCode3 = this.device.hashCode();
        CrashlyticsReport.Session.Event.Log log = this.log;
        int iHashCode4 = 0;
        int iHashCode5 = log == null ? 0 : log.hashCode();
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.rollouts;
        if (rolloutsState != null) {
            iHashCode4 = rolloutsState.hashCode();
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
        return ((((((((((i4 ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode4;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Builder toBuilder() {
        int i = 2 % 2;
        Builder builder = new Builder(this);
        int i2 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return builder;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:76:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0841  */
    /* JADX WARN: Code duplicated, block: B:83:0x0895 A[Catch: all -> 0x0b49, TryCatch #0 {all -> 0x0b49, blocks: (B:81:0x087e, B:83:0x0895, B:84:0x08d6, B:99:0x094b, B:101:0x0958, B:102:0x0991, B:104:0x09b0, B:106:0x09fc), top: B:125:0x087e }] */
    /* JADX WARN: Code duplicated, block: B:88:0x08e8  */
    public static int b(List list) throws Throwable {
        Method[] methodArr;
        Class<?> cls;
        String str;
        int i;
        char c;
        int i2;
        String string;
        Method[] declaredMethods;
        int length;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int keyRepeatDelay;
        int i7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = (i9 & 73) + (i9 | 73);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
        int i11 = 1;
        int i12 = 0;
        if (i10 % 2 == 0) {
            methodArr = new Method[4];
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr = new Object[1];
            a(b2, bArr[28], b2, objArr);
            cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[28];
            Object[] objArr2 = new Object[1];
            a(b3, bArr[7], b3, objArr2);
            str = (String) objArr2[0];
            c = 1;
            i = 3;
        } else {
            methodArr = new Method[2];
            byte[] bArr2 = $$a;
            byte b4 = bArr2[7];
            Object[] objArr3 = new Object[1];
            a(b4, bArr2[28], b4, objArr3);
            cls = Class.forName((String) objArr3[0]);
            byte b5 = bArr2[28];
            Object[] objArr4 = new Object[1];
            a(b5, bArr2[7], b5, objArr4);
            str = (String) objArr4[0];
            i = 2;
            c = 0;
        }
        int i13 = b;
        int i14 = ((i13 | 81) << 1) - (i13 ^ 81);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
        Class<?>[] clsArr = new Class[i];
        if (i14 % 2 == 0) {
            clsArr[0] = String.class;
            clsArr[1] = Integer.TYPE;
        } else {
            clsArr[0] = String.class;
            clsArr[1] = Integer.TYPE;
        }
        int i15 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
        int i16 = i15 % 2;
        methodArr[c] = cls.getMethod(str, clsArr);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte[] bArr3 = $$a;
        byte b6 = bArr3[28];
        Object[] objArr5 = new Object[1];
        a(b6, bArr3[7], b6, objArr5);
        String str2 = (String) objArr5[0];
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        b = i17 % 128;
        int i18 = i17 % 2;
        methodArr[1] = cls2.getMethod(str2, String.class, Integer.TYPE);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int packedPositionType = 2823 - ExpandableListView.getPackedPositionType(0L);
            int i19 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr4 = $$d;
            byte b7 = (byte) (-bArr4[5]);
            Object[] objArr6 = new Object[1];
            c(b7, b7, bArr4[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, packedPositionType, i19, 1814927978, false, (String) objArr6[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i20 = b + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
            if (i20 % 2 == 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0, 0), MotionEvent.axisFromString("") + 2824, 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getDeclaredMethods();
                length = declaredMethods.length;
                i3 = 1;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2823 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
                i3 = 0;
            }
            while (true) {
                if (i3 < length) {
                    Method method = declaredMethods[i3];
                    ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    try {
                        int iGreen = Color.green(i12);
                        int trimmedLength = TextUtils.getTrimmedLength("");
                        int i21 = -((byte) KeyEvent.getModifierMetaStateMask());
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i22 = (i21 * (-419)) - (-27468145);
                        int i23 = -(-((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 65245) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 65245))) * TypedValues.CycleType.TYPE_EASING));
                        int i24 = (i22 & i23) + (i22 | i23);
                        int i25 = ~i21;
                        int i26 = (i24 - (~(-(-(((i25 & 65245) | (i25 ^ 65245)) * (-420)))))) - 1;
                        int i27 = ~i21;
                        int i28 = ~((i27 & (-65246)) | (i27 ^ (-65246)));
                        int i29 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i30 = ~((i29 & 65245) | (i29 ^ 65245));
                        int i31 = ((i28 & i30) | (i28 ^ i30)) * TypedValues.CycleType.TYPE_EASING;
                        Object[] objArr7 = new Object[i11];
                        d(iGreen, (trimmedLength ^ 24) + ((trimmedLength & 24) << i11), (char) ((i26 & i31) + (i26 | i31)), objArr7);
                        Class<?> cls3 = Class.forName((String) objArr7[i12]);
                        int i32 = 23 - (~(ViewConfiguration.getEdgeSlop() >> 16));
                        int i33 = -TextUtils.getTrimmedLength("");
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i34 = i33 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                        int i35 = (i34 & 6036) + (i34 | 6036);
                        int i36 = (i33 ^ 12) | (i33 & 12);
                        int i37 = -(-(i36 * (-502)));
                        int i38 = ((i35 | i37) << 1) - (i37 ^ i35);
                        int i39 = ~i33;
                        int i40 = ~((i39 ^ (-13)) | (i39 & (-13)));
                        int i41 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i42 = ~((i39 ^ i41) | (i39 & i41));
                        int i43 = (i38 - (~(-(-((((i40 ^ i42) | (i42 & i40)) | (~((i33 | 12) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) * (-502)))))) - 1;
                        int i44 = ~i33;
                        int i45 = ~((i44 & i41) | (i44 ^ i41) | 12);
                        int i46 = ~((i36 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i36 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i47 = ((i45 & i46) | (i45 ^ i46)) * TypedValues.PositionType.TYPE_DRAWPATH;
                        Object[] objArr8 = new Object[i11];
                        d(i32, (i43 & i47) + (i43 | i47), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr8);
                        Object[] objArr9 = new Object[i11];
                        objArr9[i12] = Integer.valueOf(((Integer) cls3.getMethod((String) objArr8[i12], null).invoke(method, null)).intValue());
                        int i48 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i49 = (i48 * (-743)) - 26748;
                        int i50 = (i48 ^ 36) | (i48 & 36);
                        int i51 = (~i50) | (~((i48 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i48 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5)));
                        int i52 = ~((36 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (36 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        int i53 = -(-(((i51 & i52) | (i51 ^ i52)) * (-744)));
                        int i54 = ((i49 | i53) << i11) - (i49 ^ i53);
                        int i55 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i56 = ~i48;
                        int i57 = b + 11;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i57 % 128;
                        int i58 = i57 % 2;
                        int i59 = ((i54 + (744 * ((~((i56 & (-37)) | (i56 ^ (-37)))) | i55))) - (~(-(-(((i50 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i50)) * 744))))) - i11;
                        int i60 = -(ViewConfiguration.getEdgeSlop() >> 16);
                        int i61 = (i60 ^ 26) + ((i60 & 26) << i11);
                        int iMyPid = Process.myPid() >> 22;
                        Object[] objArr10 = new Object[i11];
                        d(i59, i61, (char) (((iMyPid | 52924) << i11) - (iMyPid ^ 52924)), objArr10);
                        Class<?> cls4 = Class.forName((String) objArr10[i12]);
                        Object[] objArr11 = new Object[i11];
                        d(62 - View.MeasureSpec.makeMeasureSpec(i12, i12), 7 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), (char) (Color.rgb(i12, i12, i12) + 16777216), objArr11);
                        String str3 = (String) objArr11[i12];
                        Class<?>[] clsArr2 = new Class[i11];
                        clsArr2[i12] = Integer.TYPE;
                        if (((Boolean) cls4.getMethod(str3, clsArr2).invoke(null, objArr9)).booleanValue()) {
                            Class cls5 = Long.TYPE;
                            int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                            int i62 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i63 = i62 * 989;
                            int i64 = (i63 & (-24675)) + (i63 | (-24675));
                            int i65 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i66 = (i65 ^ 23) + ((i65 & 23) << i11);
                            b = i66 % 128;
                            if (i66 % 2 != 0) {
                                int i67 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (-26);
                                int i68 = ~((i67 ^ i62) | (i67 & i62));
                                int i69 = (i62 ^ 25) | (i62 & 25);
                                int i70 = ~((i69 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i69 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                i4 = (i64 << (988 >> ((i68 ^ i70) | (i70 & i68)))) >> ((i62 | (-26)) * (-988));
                            } else {
                                int i71 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                int i72 = (i71 & (-26)) | ((-26) ^ i71);
                                int i73 = ~((i72 & i62) | (i72 ^ i62));
                                int i74 = (i62 ^ 25) | (i62 & 25);
                                int i75 = ~((i74 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i74 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                int i76 = -(-(((i73 ^ i75) | (i73 & i75)) * 988));
                                int i77 = (i64 & i76) + (i76 | i64);
                                int i78 = -(-(((i62 ^ (-26)) | (i62 & (-26))) * (-988)));
                                i4 = ((i77 | i78) << i11) - (i78 ^ i77);
                            }
                            int i79 = ~((~i62) | (-26));
                            int i80 = ~(((-26) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-26) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                            int i81 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                            int i82 = (i62 & i81) | (i81 ^ i62);
                            int i83 = -(-(988 * ((~((i82 & 25) | (i82 ^ 25))) | (i79 & i80) | (i79 ^ i80))));
                            int i84 = (i4 & i83) + (i83 | i4);
                            int iIndexOf = TextUtils.indexOf("", "");
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i85 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i86 = (-886224567) - (~((~(((-1016496070) ^ i85) | (i85 & (-1016496070)))) * 979));
                            int i87 = -(-(((1118700149 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (1118700149 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8)) * (-979)));
                            int i88 = (i86 ^ i87) + ((i87 & i86) << i11);
                            int i89 = ~(((-1016496070) & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | ((-1016496070) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i90 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | 1118700149);
                            int i91 = i88 + (((i89 & i90) | (i89 ^ i90)) * 979);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i92 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i93 = ~(((-344031669) ^ i92) | (i92 & (-344031669)));
                            int i94 = ~((1039138805 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (1039138805 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                            int i95 = ((i93 ^ i94) | (i93 & i94)) * (-272);
                            int i96 = (((-110795079) | i95) << 1) - (i95 ^ (-110795079));
                            int i97 = ~(((-902008310) & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | ((-902008310) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                            int i98 = -(-(((557976641 ^ i97) | (i97 & 557976641)) * (-272)));
                            int i99 = (i96 ^ i98) + ((i96 & i98) << i11);
                            int i100 = ~((902008309 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & 902008309));
                            if (i91 <= (i99 - (~(((481162164 ^ i100) | (i100 & 481162164)) * 272))) - i11) {
                                int i101 = ~iIndexOf;
                                int i102 = ~((i101 & (-65247)) | (i101 ^ (-65247)));
                                int i103 = ~iIndexOf;
                                int i104 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                int i105 = ~((i103 ^ i104) | (i104 & i103));
                                i5 = ((483 - iIndexOf) / (-65004)) << (((i105 & i102) | (i102 ^ i105)) - 241);
                            } else {
                                int i106 = (iIndexOf * 483) + 15789532;
                                int i107 = ~iIndexOf;
                                int i108 = ~((i107 & (-65247)) | (i107 ^ (-65247)));
                                int i109 = ~((~iIndexOf) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                int i110 = ((i108 & i109) | (i108 ^ i109)) * (-241);
                                i5 = ((i106 & i110) << 1) + (i106 ^ i110);
                            }
                            int i111 = ((iIndexOf ^ 65246) | (iIndexOf & 65246)) * (-482);
                            int i112 = ((i5 | i111) << 1) - (i5 ^ i111);
                            int i113 = ~(((-65247) ^ iIndexOf) | ((-65247) & iIndexOf));
                            int i114 = (~iIndexOf) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                            int i115 = ~((i114 & 65246) | (i114 ^ 65246));
                            int i116 = -(-(((i115 & i113) | (i113 ^ i115)) * 241));
                            Object[] objArr12 = new Object[1];
                            d(pressedStateDuration, i84, (char) ((i112 & i116) + (i112 | i116)), objArr12);
                            Class<?> cls6 = Class.forName((String) objArr12[0]);
                            int i117 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 70;
                            int maxKeyCode = 13 - (KeyEvent.getMaxKeyCode() >> 16);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i118 = iResolveOpacity * 398;
                            int i119 = (i118 ^ (-19330740)) + ((i118 & (-19330740)) << 1);
                            int i120 = ~iResolveOpacity;
                            int i121 = b;
                            int i122 = ((i121 | 85) << 1) - (i121 ^ 85);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i122 % 128;
                            if (i122 % 2 == 0) {
                                int i123 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | i120);
                                int i124 = ~(i120 | 48815);
                                int i125 = (i123 ^ i124) | (i123 & i124);
                                int i126 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                int i127 = ~((i126 ^ 48815) | (i126 & 48815));
                                i6 = (i119 >>> ((-397) / ((i125 ^ i127) | (i125 & i127)))) / ((-397) << (~((i120 ^ 48815) | (i120 & 48815))));
                            } else {
                                int i128 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | i120);
                                int i129 = ~((i120 ^ 48815) | (i120 & 48815));
                                int i130 = (i128 ^ i129) | (i128 & i129);
                                int i131 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                int i132 = ~((i131 ^ 48815) | (i131 & 48815));
                                int i133 = ((i130 ^ i132) | (i130 & i132)) * (-397);
                                int i134 = (i119 ^ i133) + ((i133 & i119) << 1);
                                int i135 = -(-((~((i120 ^ 48815) | (i120 & 48815))) * (-397)));
                                i6 = ((i134 & i135) << 1) + (i134 ^ i135);
                            }
                            int i136 = ~((i120 & 48815) | (i120 ^ 48815));
                            int i137 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & i136) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 ^ i136);
                            int i138 = ~(iResolveOpacity | (-48816));
                            Object[] objArr13 = new Object[1];
                            d(i117, maxKeyCode, (char) (i6 + (397 * ((i137 & i138) | (i137 ^ i138)))), objArr13);
                            if (cls5.equals(cls6.getMethod((String) objArr13[0], null).invoke(method, null))) {
                                int i139 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                                b = i139 % 128;
                                int i140 = i139 % 2;
                                int iArgb = Color.argb(0, 0, 0, 0);
                                int i141 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i142 = ~i141;
                                int i143 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                int i144 = (~(i142 | i143)) | (~((i142 ^ 25) | (i142 & 25)));
                                int i145 = ~((i143 & 25) | (i143 ^ 25));
                                int i146 = ((i141 * 398) - 9900) + (((i145 & i144) | (i144 ^ i145)) * (-397));
                                int i147 = b + 119;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i147 % 128;
                                if (i147 % 2 == 0) {
                                    int i148 = i146 >> ((~((i142 & 25) | (i142 ^ 25))) * (-397));
                                    int i149 = ~((~i141) | 25);
                                    i7 = i148 << (396 - (~(-(-((~((i141 & (-26)) | ((-26) ^ i141))) | ((iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & i149) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 ^ i149)))))));
                                    int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay();
                                    keyRepeatDelay = (keyRepeatDelay2 & 112) + (keyRepeatDelay2 | 112);
                                } else {
                                    int i150 = i146 + ((~((i142 & 25) | (i142 ^ 25))) * (-397));
                                    int i151 = ~i141;
                                    int i152 = ~((i151 & 25) | (i151 ^ 25));
                                    int i153 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & i152) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 ^ i152);
                                    int i154 = ~((i141 & (-26)) | ((-26) ^ i141));
                                    int i155 = (i150 - (~(((i154 & i153) | (i153 ^ i154)) * 397))) - 1;
                                    keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                    i7 = i155;
                                }
                                int i156 = -keyRepeatDelay;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i157 = i156 * 784;
                                int i158 = ((i157 | (-51022372)) << 1) - (i157 ^ (-51022372));
                                int i159 = ((i158 | 51088401) << 1) - (51088401 ^ i158);
                                int i160 = ~i156;
                                int i161 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                int i162 = (i161 & i160) | (i160 ^ i161);
                                int i163 = -(-((~((i162 & 65246) | (i162 ^ 65246))) * (-783)));
                                int i164 = (i159 ^ i163) + ((i163 & i159) << 1);
                                int i165 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                int i166 = ~((i165 & 65246) | (i165 ^ 65246));
                                int i167 = ((i160 & i166) | (i160 ^ i166)) * 783;
                                Object[] objArr14 = new Object[1];
                                d(iArgb, i7, (char) (((i164 | i167) << 1) - (i167 ^ i164)), objArr14);
                                Class<?> cls7 = Class.forName((String) objArr14[0]);
                                int packedPositionChild = 82 - ExpandableListView.getPackedPositionChild(0L);
                                int iResolveSize = 17 - View.resolveSize(0, 0);
                                int i168 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i169 = ~i168;
                                int i170 = ((-45070) & i169) | (i169 ^ (-45070));
                                int i171 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                int i172 = ((i168 * 491) - 22038741) + (((i170 & i171) | (i170 ^ i171)) * (-490));
                                int i173 = ~(i168 | (-45070));
                                int i174 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault13 | (-45070));
                                int i175 = ((i173 & i174) | (i173 ^ i174)) * 490;
                                int i176 = ((i172 | i175) << 1) - (i175 ^ i172);
                                int i177 = i169 * 490;
                                char c3 = (char) ((i176 & i177) + (i176 | i177));
                                Object[] objArr15 = new Object[1];
                                d(packedPositionChild, iResolveSize, c3, objArr15);
                                Object[] objArr16 = (Object[]) cls7.getMethod((String) objArr15[0], null).invoke(method, null);
                                if (objArr16.length == 2) {
                                    int i178 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i179 = (i178 & 5) + (i178 | 5);
                                    b = i179 % 128;
                                    if (i179 % 2 == 0 ? !Long.TYPE.equals(objArr16[0]) : !Long.TYPE.equals(objArr16[0])) {
                                        z = false;
                                    } else {
                                        int i180 = b;
                                        int i181 = ((i180 | 41) << 1) - (i180 ^ 41);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i181 % 128;
                                        int i182 = i181 % 2;
                                        z = false;
                                        int i183 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int capsMode = TextUtils.getCapsMode("", 0, 0);
                                        int i184 = (capsMode & 24) + (capsMode | 24);
                                        byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i185 = modifierMetaStateMask * Base64.padSymbol;
                                        int i186 = ((i185 | 54089763) << 1) - (i185 ^ 54089763);
                                        int i187 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                                        int i188 = i187 % 128;
                                        b = i188;
                                        if (i187 % 2 != 0) {
                                            Object obj = null;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        int i189 = ~((~modifierMetaStateMask) | (-65248));
                                        int i190 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                        int i191 = (i190 ^ modifierMetaStateMask) | (i190 & modifierMetaStateMask);
                                        int i192 = ~((i191 ^ 65247) | (i191 & 65247));
                                        int i193 = -(-((-828) * ((i189 ^ i192) | (i189 & i192))));
                                        int i194 = ((i186 | i193) << 1) - (i193 ^ i186);
                                        int i195 = i188 + 1;
                                        int i196 = i195 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i196;
                                        int i197 = i195 % 2;
                                        int i198 = (i194 - (~((-828) * ((~iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (modifierMetaStateMask | 65247))))) - 1;
                                        int i199 = i196 + 71;
                                        b = i199 % 128;
                                        int i200 = i199 % 2;
                                        int i201 = ~((modifierMetaStateMask & 65247) | (modifierMetaStateMask ^ 65247));
                                        if (i200 != 0) {
                                            Object[] objArr17 = new Object[1];
                                            d(i183, i184, (char) (i198 >>> (828 / i201)), objArr17);
                                            if (Class.forName((String) objArr17[0]).equals(objArr16[0])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2823;
                                                    int absoluteGravity = 22 - Gravity.getAbsoluteGravity(0, 0);
                                                    byte[] bArr5 = $$d;
                                                    byte b8 = (byte) (-bArr5[5]);
                                                    Object[] objArr18 = new Object[1];
                                                    c(b8, b8, bArr5[7], objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, iCombineMeasuredStates, absoluteGravity, 1814927978, false, (String) objArr18[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                                    int mirror = AndroidCharacter.getMirror('0') + 2775;
                                                    int iIndexOf2 = 22 - TextUtils.indexOf("", "", 0, 0);
                                                    byte[] bArr6 = $$d;
                                                    byte b9 = (byte) (-bArr6[5]);
                                                    Object[] objArr19 = new Object[1];
                                                    c(b9, b9, bArr6[7], objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, mirror, iIndexOf2, 1814927978, false, (String) objArr19[0], null);
                                                }
                                                try {
                                                    Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                                                        int iMyPid2 = 2823 - (Process.myPid() >> 22);
                                                        int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 23;
                                                        byte[] bArr7 = $$d;
                                                        byte b10 = bArr7[7];
                                                        Object[] objArr21 = new Object[1];
                                                        c(b10, b10, bArr7[54], objArr21);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, iMyPid2, packedPositionChild2, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr20)).longValue();
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            int i202 = i201 * 828;
                                            Object[] objArr22 = new Object[1];
                                            d(i183, i184, (char) ((i198 & i202) + (i202 | i198)), objArr22);
                                            if (Class.forName((String) objArr22[0]).equals(objArr16[1])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 2823;
                                                    int absoluteGravity2 = 22 - Gravity.getAbsoluteGravity(0, 0);
                                                    byte[] bArr8 = $$d;
                                                    byte b11 = (byte) (-bArr8[5]);
                                                    Object[] objArr110 = new Object[1];
                                                    c(b11, b11, bArr8[7], objArr110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay2, iCombineMeasuredStates2, absoluteGravity2, 1814927978, false, (String) objArr110[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                                                    int mirror2 = AndroidCharacter.getMirror('0') + 2775;
                                                    int iIndexOf3 = 22 - TextUtils.indexOf("", "", 0, 0);
                                                    byte[] bArr9 = $$d;
                                                    byte b12 = (byte) (-bArr9[5]);
                                                    Object[] objArr111 = new Object[1];
                                                    c(b12, b12, bArr9[7], objArr111);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, mirror2, iIndexOf3, 1814927978, false, (String) objArr111[0], null);
                                                }
                                                Object[] objArr23 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                                                    int iMyPid3 = 2823 - (Process.myPid() >> 22);
                                                    int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 23;
                                                    byte[] bArr10 = $$d;
                                                    byte b13 = bArr10[7];
                                                    Object[] objArr24 = new Object[1];
                                                    c(b13, b13, bArr10[54], objArr24);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb2, iMyPid3, packedPositionChild3, -2137287382, false, (String) objArr24[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr23)).longValue();
                                            }
                                        }
                                    }
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        int i203 = i3 - 51;
                        i3 = (i203 ^ 52) + ((i203 & 52) << 1);
                        i11 = 1;
                        i12 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int maximumDrawingCacheSize = 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int trimmedLength2 = TextUtils.getTrimmedLength("") + 22;
            byte[] bArr11 = $$d;
            byte b14 = (byte) (-bArr11[5]);
            Object[] objArr25 = new Object[1];
            c(b14, b14, bArr11[7], objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, maximumDrawingCacheSize, trimmedLength2, 1814927978, false, (String) objArr25[0], null);
        }
        Object[] objArr26 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int iMyTid = 2823 - (Process.myTid() >> 22);
            int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b15 = $$d[7];
            byte b16 = b15;
            Object[] objArr27 = new Object[1];
            c(b15, b16, (byte) (b16 | 14), objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration2, iMyTid, iMakeMeasureSpec, 1025296417, false, (String) objArr27[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr26);
        Object[] objArr28 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char packedPositionChild4 = (char) (ExpandableListView.getPackedPositionChild(0L) + 37658);
            int maximumFlingVelocity = 2720 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int keyRepeatDelay3 = 19 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte b17 = $$d[7];
            byte b18 = b17;
            Object[] objArr29 = new Object[1];
            c(b17, b18, (byte) (b18 | 14), objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionChild4, maximumFlingVelocity, keyRepeatDelay3, -1568796068, false, (String) objArr29[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr28)).longValue();
        long j = -96542310;
        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
        long j2 = -1;
        long j3 = jMaxMemory ^ j2;
        Method[] methodArr2 = methodArr;
        long j4 = jLongValue ^ j2;
        long j5 = (((long) 758) * j) + (((long) (-756)) * jLongValue) + (((long) (-757)) * (j | j3)) + (((long) 1514) * (((j4 | j) | jMaxMemory) ^ j2)) + (((long) 757) * ((((jLongValue | j) | jMaxMemory) ^ j2) | (((j ^ j2) | j4) ^ j2) | ((j4 | j3) ^ j2))) + ((long) (-1713863535));
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i204 = ((int) (j5 >> 32)) & ((((~((-926933151) | iFreeMemory)) | (-1930807735)) * 56) + 1806006186 + (((~((~iFreeMemory) | (-1930807735))) | (-926933151)) * 56));
        int iMyUid = Process.myUid();
        int i205 = 818884229 + (((~((-1257555352) | iMyUid)) | 1247855766 | (~((-1600185535) | iMyUid))) * (-880));
        int i206 = (~((-1257555352) | (~iMyUid))) | 1600185534;
        int i207 = ~(iMyUid | 1257555351);
        int i208 = i205 + ((i206 | i207) * (-880)) + (i207 * 880);
        int i209 = b;
        int i210 = i209 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i210 % 128;
        int i211 = i210 % 2;
        int i212 = i204 | (((int) j5) & i208);
        int i213 = i212 >>> 24;
        int i214 = i212 & ViewCompat.MEASURED_SIZE_MASK;
        if (i213 != 0) {
            int i215 = i209 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i215 % 128;
            int i216 = i215 % 2;
            i2 = 1;
        } else {
            int i217 = (i209 ^ 31) + ((i209 & 31) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i217 % 128;
            int i218 = i217 % 2;
            i2 = 0;
        }
        if (i2 != 0) {
            ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (i214 < methodArr2.length) {
                int i219 = b + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i219 % 128;
                int i220 = i219 % 2;
                Method method2 = methodArr2[i214];
                if (method2 != null) {
                    string = method2.toString();
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        list.add(string);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i221 = b;
        int i222 = i221 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i222 % 128;
        int i223 = i222 % 2;
        int i224 = (-494) * i213;
        int i225 = ((((-2964) | i224) << 1) - (i224 ^ (-2964))) + ((~(6 | i213)) * (-495));
        int i226 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        int i227 = i225 + (((i226 & 6) | (i226 ^ 6)) * 495);
        int i228 = (i221 ^ 115) + ((i221 & 115) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i228 % 128;
        int i229 = i228 % 2;
        int i230 = ~i213;
        int i231 = ~((i230 & (-7)) | ((-7) ^ i230));
        int i232 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        int i233 = ~((i232 & 6) | (i232 ^ 6));
        int i234 = -(-(((i233 & i231) | (i231 ^ i233)) * 495));
        return ((i227 & i234) + (i234 | i227)) * i2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r0 = 1 - r5
            int r7 = r7 * 3
            int r7 = 115 - r7
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L27:
            r3 = r1[r6]
        L29:
            int r3 = -r3
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.$$g(int, byte, byte):java.lang.String");
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class Builder extends CrashlyticsReport.Session.Event.Builder {
        private CrashlyticsReport.Session.Event.Application app;
        private CrashlyticsReport.Session.Event.Device device;
        private CrashlyticsReport.Session.Event.Log log;
        private CrashlyticsReport.Session.Event.RolloutsState rollouts;
        private byte set$0;
        private long timestamp;
        private String type;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event event) {
            this.timestamp = event.getTimestamp();
            this.type = event.getType();
            this.app = event.getApp();
            this.device = event.getDevice();
            this.log = event.getLog();
            this.rollouts = event.getRollouts();
            this.set$0 = (byte) 1;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setTimestamp(long j) {
            this.timestamp = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setType(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.type = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setApp(CrashlyticsReport.Session.Event.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.app = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setDevice(CrashlyticsReport.Session.Event.Device device) {
            if (device == null) {
                throw new NullPointerException("Null device");
            }
            this.device = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setLog(CrashlyticsReport.Session.Event.Log log) {
            this.log = log;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setRollouts(CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.rollouts = rolloutsState;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event build() {
            if (this.set$0 != 1 || this.type == null || this.app == null || this.device == null) {
                StringBuilder sb = new StringBuilder();
                if ((1 & this.set$0) == 0) {
                    sb.append(" timestamp");
                }
                if (this.type == null) {
                    sb.append(" type");
                }
                if (this.app == null) {
                    sb.append(" app");
                }
                if (this.device == null) {
                    sb.append(" device");
                }
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
            }
            return new AutoValue_CrashlyticsReport_Session_Event(this.timestamp, this.type, this.app, this.device, this.log, this.rollouts);
        }
    }
}
