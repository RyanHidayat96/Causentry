package com.google.firebase.crashlytics.internal.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport extends CrashlyticsReport {
    private final CrashlyticsReport.ApplicationExitInfo appExitInfo;
    private final String appQualitySessionId;
    private final String buildVersion;
    private final String displayVersion;
    private final String firebaseAuthenticationToken;
    private final String firebaseInstallationId;
    private final String gmpAppId;
    private final String installationUuid;
    private final CrashlyticsReport.FilesPayload ndkPayload;
    private final int platform;
    private final String sdkVersion;
    private final CrashlyticsReport.Session session;

    private AutoValue_CrashlyticsReport(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.sdkVersion = str;
        this.gmpAppId = str2;
        this.platform = i;
        this.installationUuid = str3;
        this.firebaseInstallationId = str4;
        this.firebaseAuthenticationToken = str5;
        this.appQualitySessionId = str6;
        this.buildVersion = str7;
        this.displayVersion = str8;
        this.session = session;
        this.ndkPayload = filesPayload;
        this.appExitInfo = applicationExitInfo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getGmpAppId() {
        return this.gmpAppId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final int getPlatform() {
        return this.platform;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getInstallationUuid() {
        return this.installationUuid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class Builder extends CrashlyticsReport.Builder {
        private CrashlyticsReport.ApplicationExitInfo appExitInfo;
        private String appQualitySessionId;
        private String buildVersion;
        private String displayVersion;
        private String firebaseAuthenticationToken;
        private String firebaseInstallationId;
        private String gmpAppId;
        private String installationUuid;
        private CrashlyticsReport.FilesPayload ndkPayload;
        private int platform;
        private String sdkVersion;
        private CrashlyticsReport.Session session;
        private byte set$0;
        private static final byte[] $$c = {17, 104, 102, -28};
        private static final int $$f = 196;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {83, -44, 103, 46, 15, 1, -60, 72, 1, 7, -17, 20, -10, 19, -2, -63, 69, -4, -3, 1, 21, 3, -1, -62, 37, 28, -3, 1, 21, 3, -1, -72, 51, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -62};
        private static final int $$e = 194;
        private static final byte[] $$a = {77, -106, 83, 4, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$b = 112;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {45565, 30681, 15790, 58223, 43359, 28450, 5370, 55967, 32939, 18028, 3100, 12822, 64481, 41408, 26546, 11644, 54081, 39172, 24310, 1218, 51875, 61552, 47000, 29114, 15306, 58636, 44834, 26959, 4763, 56450, 34496, 16415, 2623, 13392, 64912, 42943, 25026, 45565, 30681, 15790, 58223, 43359, 28450, 5370, 55967, 32933, 18031, 3138, 12907, 64473, 41424, 26546, 11632, 54106, 39214, 24302, 1236, 51860, 61555, 46684, 31780, 9717, 60363, 60205, 11536, 26474, 47549, 62343, 13815, 20024, 32802, 55910, 7357, 22156, 26878, 41257, 64256, 15712, 30626, 35217, 50171};
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 6392519020589578167L;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = 103 - r7
                byte[] r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.$$a
                int r8 = r8 * 52
                int r1 = 53 - r8
                int r6 = r6 + 4
                byte[] r1 = new byte[r1]
                int r8 = 52 - r8
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r4 = r2
                r7 = r6
                goto L2e
            L15:
                r3 = r2
            L16:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.a(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 66
                int r7 = r7 + 4
                int r5 = r5 * 14
                int r0 = 67 - r5
                int r6 = r6 * 15
                int r6 = 99 - r6
                byte[] r1 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.$$d
                byte[] r0 = new byte[r0]
                int r5 = 66 - r5
                r2 = 0
                if (r1 != 0) goto L18
                r4 = r5
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r1[r7]
            L2a:
                int r6 = r6 + r4
                int r7 = r7 + 1
                int r6 = r6 + (-3)
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.d(short, byte, byte, java.lang.Object[]):void");
        }

        private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = $11 + 39;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.getDefaultSize(0, 0), 2188 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 40 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 33017), View.getDefaultSize(0, 0) + 3011, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, 321985076, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 36506), 3376 - ExpandableListView.getPackedPositionType(0L), 17 - (ViewConfiguration.getTapTimeout() >> 16), -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 87;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i9 = $10 + 51;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 36505), (Process.myPid() >> 22) + 3376, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i10 = 53 / 0;
                } else {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    try {
                        Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - View.resolveSize(0, 0)), Process.getGidForName("") + 3377, 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -968507904, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            objArr[0] = new String(cArr);
        }

        Builder() {
        }

        private Builder(CrashlyticsReport crashlyticsReport) {
            this.sdkVersion = crashlyticsReport.getSdkVersion();
            this.gmpAppId = crashlyticsReport.getGmpAppId();
            this.platform = crashlyticsReport.getPlatform();
            this.installationUuid = crashlyticsReport.getInstallationUuid();
            this.firebaseInstallationId = crashlyticsReport.getFirebaseInstallationId();
            this.firebaseAuthenticationToken = crashlyticsReport.getFirebaseAuthenticationToken();
            this.appQualitySessionId = crashlyticsReport.getAppQualitySessionId();
            this.buildVersion = crashlyticsReport.getBuildVersion();
            this.displayVersion = crashlyticsReport.getDisplayVersion();
            this.session = crashlyticsReport.getSession();
            this.ndkPayload = crashlyticsReport.getNdkPayload();
            this.appExitInfo = crashlyticsReport.getAppExitInfo();
            this.set$0 = (byte) 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            r4 = 33 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            throw new java.lang.NullPointerException("Null sdkVersion");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r4 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r4 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            r2 = r2 + 21;
            r1 = r2 % 128;
            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1;
            r2 = r2 % 2;
            r3.sdkVersion = r4;
            r1 = r1 + 67;
            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            if ((r1 % 2) == 0) goto L11;
         */
        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSdkVersion(java.lang.String r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r1 = r1 + 25
                int r2 = r1 % 128
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.b = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L15
                r1 = 38
                int r1 = r1 / 0
                if (r4 == 0) goto L2e
                goto L17
            L15:
                if (r4 == 0) goto L2e
            L17:
                int r2 = r2 + 21
                int r1 = r2 % 128
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
                int r2 = r2 % r0
                r3.sdkVersion = r4
                int r1 = r1 + 67
                int r4 = r1 % 128
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.b = r4
                int r1 = r1 % r0
                if (r1 == 0) goto L2d
                r4 = 33
                int r4 = r4 / 0
            L2d:
                return r3
            L2e:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "Null sdkVersion"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.setSdkVersion(java.lang.String):com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setGmpAppId(String str) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            int i4 = i2 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            this.gmpAppId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setPlatform(int i) {
            int i2 = 2 % 2;
            int i3 = b + 53;
            int i4 = i3 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
            if (i3 % 2 == 0) {
                this.platform = i;
            } else {
                this.platform = i;
            }
            this.set$0 = (byte) (this.set$0 | 1);
            int i5 = i4 + 59;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        
            r3.installationUuid = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        
            r3.installationUuid = r4;
            r4 = null;
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            throw new java.lang.NullPointerException("Null installationUuid");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r4 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r4 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            r2 = r2 + 41;
            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setInstallationUuid(java.lang.String r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.b
                int r1 = r1 + 95
                int r2 = r1 % 128
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L15
                r1 = 47
                int r1 = r1 / 0
                if (r4 == 0) goto L2a
                goto L17
            L15:
                if (r4 == 0) goto L2a
            L17:
                int r2 = r2 + 41
                int r1 = r2 % 128
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.b = r1
                int r2 = r2 % r0
                if (r2 != 0) goto L23
                r3.installationUuid = r4
                return r3
            L23:
                r3.installationUuid = r4
                r4 = 0
                r4.hashCode()
                throw r4
            L2a:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "Null installationUuid"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.setInstallationUuid(java.lang.String):com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setFirebaseInstallationId(String str) {
            int i = 2 % 2;
            int i2 = b + 109;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            this.firebaseInstallationId = str;
            int i5 = i3 + 53;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 27 / 0;
            }
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setFirebaseAuthenticationToken(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 97;
            b = i3 % 128;
            int i4 = i3 % 2;
            this.firebaseAuthenticationToken = str;
            if (i4 != 0) {
                int i5 = 32 / 0;
            }
            int i6 = i2 + 65;
            b = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setAppQualitySessionId(String str) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            this.appQualitySessionId = str;
            int i5 = i2 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setBuildVersion(String str) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            int i2 = b + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 876;
                int offsetAfter = 10 - TextUtils.getOffsetAfter("", 0);
                byte b2 = $$a[5];
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                a(b3, (byte) (b3 & 5), (byte) (-b2), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, capsMode, offsetAfter, 252381699, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(ViewConfiguration.getTapTimeout() >> 16, 22 - ExpandableListView.getPackedPositionGroup(0L), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((ViewConfiguration.getEdgeSlop() >> 16) + 22, TextUtils.lastIndexOf("", '0') + 16, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1633), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                int capsMode2 = 10 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr = $$a;
                Object[] objArr5 = new Object[1];
                a(bArr[5], bArr[54], bArr[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, i4, capsMode2, 2009631821, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                    int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    a((byte) 51, bArr2[7], (byte) (-bArr2[5]), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, windowTouchSlop, iLastIndexOf, 256017550, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i5 = (-340708924) + ((~((~iFreeMemory) | (-12659758))) * (-116)) + ((724095618 | iFreeMemory) * 116) + (((~(iFreeMemory | 683785389)) | 52969986) * 116) + 1903872723;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37, ((Process.getThreadPriority(0) + 20) >> 6) + 26, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c((ViewConfiguration.getJumpTapTimeout() >> 16) + 63, Color.argb(0, 0, 0, 0) + 18, (char) (23249 - ImageFormat.getBitsPerPixel(0)), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i8 = b + 1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                    int i9 = i8 % 2;
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                int length = str != null ? str.length() : 0;
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                b = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr10 = {applicationContext, Integer.valueOf(length), 1903872723};
                    byte[] bArr3 = $$d;
                    byte b4 = bArr3[92];
                    byte b5 = b4;
                    Object[] objArr11 = new Object[1];
                    d(b4, b5, b5, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b6 = bArr3[5];
                    byte b7 = b6;
                    Object[] objArr12 = new Object[1];
                    d(b6, b7, b7, objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    if (applicationContext != null) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                        b = i12 % 128;
                        int i13 = i12 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
                            int mirror = ':' - AndroidCharacter.getMirror('0');
                            byte[] bArr4 = $$a;
                            Object[] objArr14 = new Object[1];
                            a((byte) 51, bArr4[7], (byte) (-bArr4[5]), objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, packedPositionGroup, mirror, 256017550, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            c(ViewConfiguration.getScrollBarSize() >> 8, View.resolveSize(0, 0) + 22, (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            c(22 - TextUtils.indexOf("", "", 0), 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1633), objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf3 = (char) TextUtils.indexOf("", "", 0);
                                int iRgb = Color.rgb(0, 0, 0) + 16778092;
                                int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
                                byte[] bArr5 = $$a;
                                Object[] objArr17 = new Object[1];
                                a(bArr5[5], bArr5[54], bArr5[7], objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf3, iRgb, iResolveOpacity, 2009631821, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cArgb = (char) Color.argb(0, 0, 0, 0);
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 11;
                                byte b8 = $$a[5];
                                byte b9 = b8;
                                Object[] objArr18 = new Object[1];
                                a(b9, (byte) (b9 & 5), (byte) (-b8), objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, jumpTapTimeout, iIndexOf, 252381699, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr13;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[0])[0];
            if (i15 != i14) {
                throw new RuntimeException(String.valueOf(i15));
            }
            int i16 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = ~iIdentityHashCode;
            int i18 = i16 + 2070192700 + (((~(358647899 | i17)) | (~((-398958129) | iIdentityHashCode))) * (-370)) + (((~(iIdentityHashCode | 358647899)) | (~(i17 | (-398958129))) | 2097227) * (-370)) + 775973990;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr19[1])[0] = i20 ^ (i20 << 5);
            this.buildVersion = str;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            throw new java.lang.NullPointerException("Null displayVersion");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r4 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r4 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            r2 = r2 + 59;
            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2 % 128;
            r2 = r2 % 2;
            r3.displayVersion = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        
            return r3;
         */
        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setDisplayVersion(java.lang.String r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r1 = r1 + 59
                int r2 = r1 % 128
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.b = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L15
                r1 = 48
                int r1 = r1 / 0
                if (r4 == 0) goto L21
                goto L17
            L15:
                if (r4 == 0) goto L21
            L17:
                int r2 = r2 + 59
                int r1 = r2 % 128
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
                int r2 = r2 % r0
                r3.displayVersion = r4
                return r3
            L21:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "Null displayVersion"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.setDisplayVersion(java.lang.String):com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 53;
            b = i3 % 128;
            int i4 = i3 % 2;
            this.session = session;
            int i5 = i2 + 111;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            int i = 2 % 2;
            int i2 = b + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            this.ndkPayload = filesPayload;
            if (i3 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            int i = 2 % 2;
            int i2 = b + 65;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            this.appExitInfo = applicationExitInfo;
            int i5 = i3 + 39;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 50 / 0;
            }
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport build() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 49;
            b = i3 % 128;
            if (i3 % 2 == 0 ? this.set$0 == 1 : this.set$0 == 1) {
                if (this.sdkVersion != null) {
                    int i4 = i2 + 83;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (this.gmpAppId != null && this.installationUuid != null && this.buildVersion != null && this.displayVersion != null) {
                        return new AutoValue_CrashlyticsReport(this.sdkVersion, this.gmpAppId, this.platform, this.installationUuid, this.firebaseInstallationId, this.firebaseAuthenticationToken, this.appQualitySessionId, this.buildVersion, this.displayVersion, this.session, this.ndkPayload, this.appExitInfo);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            if (this.sdkVersion == null) {
                sb.append(" sdkVersion");
            }
            if (this.gmpAppId == null) {
                int i5 = b + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                sb.append(" gmpAppId");
            }
            if ((this.set$0 & 1) == 0) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    sb.append(" platform");
                    throw null;
                }
                sb.append(" platform");
            }
            if (this.installationUuid == null) {
                int i8 = b + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                int i9 = i8 % 2;
                sb.append(" installationUuid");
            }
            if (this.buildVersion == null) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                b = i10 % 128;
                int i11 = i10 % 2;
                sb.append(" buildVersion");
            }
            if (this.displayVersion == null) {
                int i12 = b + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                int i13 = i12 % 2;
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, short r7, short r8) {
            /*
                int r7 = r7 * 4
                int r7 = 3 - r7
                int r8 = r8 * 3
                int r8 = r8 + 109
                int r6 = r6 * 4
                int r0 = r6 + 1
                byte[] r1 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2e
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder.$$g(byte, short, short):java.lang.String");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getBuildVersion() {
        return this.buildVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getDisplayVersion() {
        return this.displayVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.Session getSession() {
        return this.session;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.ndkPayload;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.appExitInfo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashlyticsReport{sdkVersion=");
        sb.append(this.sdkVersion);
        sb.append(", gmpAppId=");
        sb.append(this.gmpAppId);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", installationUuid=");
        sb.append(this.installationUuid);
        sb.append(", firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append(", firebaseAuthenticationToken=");
        sb.append(this.firebaseAuthenticationToken);
        sb.append(", appQualitySessionId=");
        sb.append(this.appQualitySessionId);
        sb.append(", buildVersion=");
        sb.append(this.buildVersion);
        sb.append(", displayVersion=");
        sb.append(this.displayVersion);
        sb.append(", session=");
        sb.append(this.session);
        sb.append(", ndkPayload=");
        sb.append(this.ndkPayload);
        sb.append(", appExitInfo=");
        sb.append(this.appExitInfo);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (!this.sdkVersion.equals(crashlyticsReport.getSdkVersion()) || !this.gmpAppId.equals(crashlyticsReport.getGmpAppId()) || this.platform != crashlyticsReport.getPlatform() || !this.installationUuid.equals(crashlyticsReport.getInstallationUuid())) {
            return false;
        }
        String str = this.firebaseInstallationId;
        if (str == null) {
            if (crashlyticsReport.getFirebaseInstallationId() != null) {
                return false;
            }
        } else if (!str.equals(crashlyticsReport.getFirebaseInstallationId())) {
            return false;
        }
        String str2 = this.firebaseAuthenticationToken;
        if (str2 == null) {
            if (crashlyticsReport.getFirebaseAuthenticationToken() != null) {
                return false;
            }
        } else if (!str2.equals(crashlyticsReport.getFirebaseAuthenticationToken())) {
            return false;
        }
        String str3 = this.appQualitySessionId;
        if (str3 == null) {
            if (crashlyticsReport.getAppQualitySessionId() != null) {
                return false;
            }
        } else if (!str3.equals(crashlyticsReport.getAppQualitySessionId())) {
            return false;
        }
        if (!this.buildVersion.equals(crashlyticsReport.getBuildVersion()) || !this.displayVersion.equals(crashlyticsReport.getDisplayVersion())) {
            return false;
        }
        CrashlyticsReport.Session session = this.session;
        if (session == null) {
            if (crashlyticsReport.getSession() != null) {
                return false;
            }
        } else if (!session.equals(crashlyticsReport.getSession())) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = this.ndkPayload;
        if (filesPayload == null) {
            if (crashlyticsReport.getNdkPayload() != null) {
                return false;
            }
        } else if (!filesPayload.equals(crashlyticsReport.getNdkPayload())) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.appExitInfo;
        if (applicationExitInfo == null) {
            if (crashlyticsReport.getAppExitInfo() != null) {
                return false;
            }
        } else if (!applicationExitInfo.equals(crashlyticsReport.getAppExitInfo())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.sdkVersion.hashCode();
        int iHashCode2 = this.gmpAppId.hashCode();
        int i = this.platform;
        int iHashCode3 = this.installationUuid.hashCode();
        String str = this.firebaseInstallationId;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.firebaseAuthenticationToken;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.appQualitySessionId;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        int iHashCode7 = this.buildVersion.hashCode();
        int iHashCode8 = this.displayVersion.hashCode();
        CrashlyticsReport.Session session = this.session;
        int iHashCode9 = session == null ? 0 : session.hashCode();
        CrashlyticsReport.FilesPayload filesPayload = this.ndkPayload;
        int iHashCode10 = filesPayload == null ? 0 : filesPayload.hashCode();
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.appExitInfo;
        return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ i) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ (applicationExitInfo != null ? applicationExitInfo.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    protected final CrashlyticsReport.Builder toBuilder() {
        return new Builder(this);
    }
}
