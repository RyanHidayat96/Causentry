package com.google.firebase.crashlytics.internal.model;

import android.graphics.Color;
import android.media.AudioTrack;
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
import com.google.android.gms.common.api.internal.zaaq;
import com.google.firebase.encoders.annotations.Encodable;
import defpackage.deInitSession;
import defpackage.initSession;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;
import kotlin.text.Typography;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes4.dex */
@Encodable
public abstract class CrashlyticsReport {
    private static final Charset UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);

    @Retention(RetentionPolicy.SOURCE)
    public @interface Architecture {
        public static final int ARM64 = 9;
        public static final int ARMV6 = 5;
        public static final int ARMV7 = 6;
        public static final int UNKNOWN = 7;
        public static final int X86_32 = 0;
        public static final int X86_64 = 1;
    }

    public static abstract class Builder {
        public abstract CrashlyticsReport build();

        public abstract Builder setAppExitInfo(ApplicationExitInfo applicationExitInfo);

        public abstract Builder setAppQualitySessionId(String str);

        public abstract Builder setBuildVersion(String str);

        public abstract Builder setDisplayVersion(String str);

        public abstract Builder setFirebaseAuthenticationToken(String str);

        public abstract Builder setFirebaseInstallationId(String str);

        public abstract Builder setGmpAppId(String str);

        public abstract Builder setInstallationUuid(String str);

        public abstract Builder setNdkPayload(FilesPayload filesPayload);

        public abstract Builder setPlatform(int i);

        public abstract Builder setSdkVersion(String str);

        public abstract Builder setSession(Session session);
    }

    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    public abstract ApplicationExitInfo getAppExitInfo();

    public abstract String getAppQualitySessionId();

    public abstract String getBuildVersion();

    public abstract String getDisplayVersion();

    public abstract String getFirebaseAuthenticationToken();

    public abstract String getFirebaseInstallationId();

    public abstract String getGmpAppId();

    public abstract String getInstallationUuid();

    public abstract FilesPayload getNdkPayload();

    public abstract int getPlatform();

    public abstract String getSdkVersion();

    public abstract Session getSession();

    protected abstract Builder toBuilder();

    public static Builder builder() {
        return new AutoValue_CrashlyticsReport.Builder();
    }

    @Encodable.Ignore
    public Type getType() {
        if (getSession() != null) {
            return Type.JAVA;
        }
        if (getNdkPayload() != null) {
            return Type.NATIVE;
        }
        return Type.INCOMPLETE;
    }

    public CrashlyticsReport withEvents(List<Session.Event> list) {
        if (getSession() == null) {
            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
        }
        return toBuilder().setSession(getSession().withEvents(list)).build();
    }

    public CrashlyticsReport withOrganizationId(String str) {
        Builder builder = toBuilder();
        FilesPayload ndkPayload = getNdkPayload();
        if (ndkPayload != null) {
            builder.setNdkPayload(ndkPayload.toBuilder().setOrgId(str).build());
        }
        Session session = getSession();
        if (session != null) {
            builder.setSession(session.withOrganizationId(str));
        }
        return builder.build();
    }

    public CrashlyticsReport withNdkPayload(FilesPayload filesPayload) {
        return toBuilder().setSession(null).setNdkPayload(filesPayload).build();
    }

    public CrashlyticsReport withApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo == null ? this : toBuilder().setAppExitInfo(applicationExitInfo).build();
    }

    public CrashlyticsReport withSessionEndFields(long j, boolean z, String str) {
        Builder builder = toBuilder();
        if (getSession() != null) {
            builder.setSession(getSession().withSessionEndFields(j, z, str));
        }
        return builder.build();
    }

    public CrashlyticsReport withAppQualitySessionId(String str) {
        Builder appQualitySessionId = toBuilder().setAppQualitySessionId(str);
        if (getSession() != null) {
            appQualitySessionId.setSession(getSession().withAppQualitySessionId(str));
        }
        return appQualitySessionId.build();
    }

    public CrashlyticsReport withFirebaseInstallationId(String str) {
        return toBuilder().setFirebaseInstallationId(str).build();
    }

    public CrashlyticsReport withFirebaseAuthenticationToken(String str) {
        return toBuilder().setFirebaseAuthenticationToken(str).build();
    }

    public static abstract class FilesPayload {

        public static abstract class Builder {
            public abstract FilesPayload build();

            public abstract Builder setFiles(List<File> list);

            public abstract Builder setOrgId(String str);
        }

        public abstract List<File> getFiles();

        public abstract String getOrgId();

        abstract Builder toBuilder();

        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_FilesPayload.Builder();
        }

        public static abstract class File {

            /* JADX INFO: loaded from: classes6.dex */
            public static abstract class Builder {
                public abstract File build();

                public abstract Builder setContents(byte[] bArr);

                public abstract Builder setFilename(String str);
            }

            public abstract byte[] getContents();

            public abstract String getFilename();

            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_FilesPayload_File.Builder();
            }
        }
    }

    public static abstract class Session {
        public abstract Application getApp();

        public abstract String getAppQualitySessionId();

        public abstract Device getDevice();

        public abstract Long getEndedAt();

        public abstract List<Event> getEvents();

        public abstract String getGenerator();

        public abstract int getGeneratorType();

        @Encodable.Ignore
        public abstract String getIdentifier();

        public abstract OperatingSystem getOs();

        public abstract long getStartedAt();

        public abstract User getUser();

        public abstract boolean isCrashed();

        public abstract Builder toBuilder();

        public static abstract class Event {

            public static abstract class Builder {
                public abstract Event build();

                public abstract Builder setApp(Application application);

                public abstract Builder setDevice(Device device);

                public abstract Builder setLog(Log log);

                public abstract Builder setRollouts(RolloutsState rolloutsState);

                public abstract Builder setTimestamp(long j);

                public abstract Builder setType(String str);
            }

            public abstract Application getApp();

            public abstract Device getDevice();

            public abstract Log getLog();

            public abstract RolloutsState getRollouts();

            public abstract long getTimestamp();

            public abstract String getType();

            public abstract Builder toBuilder();

            public static abstract class RolloutAssignment {

                /* JADX INFO: loaded from: classes5.dex */
                public static abstract class Builder {
                    public abstract RolloutAssignment build();

                    public abstract Builder setParameterKey(String str);

                    public abstract Builder setParameterValue(String str);

                    public abstract Builder setRolloutVariant(RolloutVariant rolloutVariant);

                    public abstract Builder setTemplateVersion(long j);
                }

                public abstract String getParameterKey();

                public abstract String getParameterValue();

                public abstract RolloutVariant getRolloutVariant();

                public abstract long getTemplateVersion();

                /* JADX INFO: loaded from: classes5.dex */
                public static abstract class RolloutVariant {
                    public abstract String getRolloutId();

                    public abstract String getVariantId();

                    public static abstract class Builder {
                        private static final byte[] $$c = {19, 78, 114, 113};
                        private static final int $$d = 4;
                        private static int $10 = 0;
                        private static int $11 = 1;
                        private static final byte[] $$a = {99, -43, -44, -62, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
                        private static final int $$b = 27;
                        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60034, 60052, 60060, 60061, 60050, 60090, 60079, 60044, 60042, 60039, 60041, 60058, 60043, 60046, 60037, 60036, 60049, 60053, 60054, 60040, 60088, 60048, 60072, 60057, 60035, 60051, 60063, 60117, 60045, 60093, 60059, 60056, 60047, 60062, 60038, 60055};
                        private static char TuitionPaymentFragmentbindingInflater1 = 57191;

                        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static void b(short r5, int r6, int r7, java.lang.Object[] r8) {
                            /*
                                int r5 = r5 * 52
                                int r0 = 53 - r5
                                byte[] r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder.$$a
                                int r6 = r6 * 3
                                int r6 = 4 - r6
                                int r7 = r7 * 14
                                int r7 = r7 + 84
                                byte[] r0 = new byte[r0]
                                int r5 = 52 - r5
                                r2 = 0
                                if (r1 != 0) goto L19
                                r4 = r7
                                r3 = r2
                                r7 = r5
                                goto L2b
                            L19:
                                r3 = r2
                            L1a:
                                byte r4 = (byte) r7
                                r0[r3] = r4
                                if (r3 != r5) goto L27
                                java.lang.String r5 = new java.lang.String
                                r5.<init>(r0, r2)
                                r8[r2] = r5
                                return
                            L27:
                                int r3 = r3 + 1
                                r4 = r1[r6]
                            L2b:
                                int r6 = r6 + 1
                                int r7 = r7 + r4
                                int r7 = r7 + (-11)
                                goto L1a
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder.b(short, int, int, java.lang.Object[]):void");
                        }

                        public abstract RolloutVariant build();

                        public abstract Builder setRolloutId(String str);

                        public abstract Builder setVariantId(String str);

                        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
                            int i2;
                            Object obj;
                            int length;
                            char[] cArr2;
                            int i3 = 2 % 2;
                            deInitSession deinitsession = new deInitSession();
                            char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i4 = 1770390596;
                            Object obj2 = null;
                            if (cArr3 != null) {
                                int i5 = $11 + 113;
                                $10 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    length = cArr3.length;
                                    cArr2 = new char[length];
                                } else {
                                    length = cArr3.length;
                                    cArr2 = new char[length];
                                }
                                int i6 = 0;
                                while (i6 < length) {
                                    try {
                                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                            int iGreen = 2267 - Color.green(0);
                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 33;
                                            byte b2 = (byte) ($$d - 5);
                                            byte b3 = (byte) (b2 + 1);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iGreen, iResolveSizeAndState, -1927765101, false, $$e(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                                        }
                                        cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                        i6++;
                                        int i7 = $10 + 61;
                                        $11 = i7 % 128;
                                        int i8 = i7 % 2;
                                        i4 = 1770390596;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                cArr3 = cArr2;
                            }
                            try {
                                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char gidForName = (char) ((-1) - Process.getGidForName(""));
                                    int deadChar = 2267 - KeyEvent.getDeadChar(0, 0);
                                    int i9 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32;
                                    byte b4 = (byte) ($$d - 5);
                                    byte b5 = (byte) (b4 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, deadChar, i9, -1927765101, false, $$e(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
                                }
                                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                char[] cArr4 = new char[i];
                                if (i % 2 != 0) {
                                    i2 = i - 1;
                                    cArr4[i2] = (char) (cArr[i2] - b);
                                } else {
                                    i2 = i;
                                }
                                if (i2 > 1) {
                                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                            int i10 = $10 + 13;
                                            $11 = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b / b);
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * b);
                                            } else {
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                                            }
                                            obj = obj2;
                                        } else {
                                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 49267);
                                                int iResolveSize = 3261 - View.resolveSize(0, 0);
                                                int minimumFlingVelocity = 30 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                byte b6 = (byte) ($$d - 5);
                                                byte b7 = (byte) (b6 + 1);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, iResolveSize, minimumFlingVelocity, -127612708, false, $$e(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                            }
                                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char cIndexOf2 = (char) (TextUtils.indexOf("", "") + 22878);
                                                    int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 593;
                                                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17;
                                                    byte b8 = (byte) ($$d - 5);
                                                    byte b9 = (byte) (b8 + 1);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i11, maximumDrawingCacheSize, 1570859318, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                                }
                                                obj = null;
                                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                                int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i12];
                                            } else {
                                                obj = null;
                                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                                    int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i13];
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                                                } else {
                                                    int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                                    int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i15];
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
                                                }
                                            }
                                        }
                                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                                        obj2 = obj;
                                    }
                                }
                                int i17 = 0;
                                while (i17 < i) {
                                    int i18 = $11 + 55;
                                    int i19 = i18 % 128;
                                    $10 = i19;
                                    int i20 = i18 % 2;
                                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                                    i17++;
                                    int i21 = i19 + 91;
                                    $11 = i21 % 128;
                                    int i22 = i21 % 2;
                                }
                                objArr[0] = new String(cArr4);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:130:0x0a31  */
                        /* JADX WARN: Code duplicated, block: B:131:0x0a41  */
                        /* JADX WARN: Code duplicated, block: B:134:0x0b06  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r15v10 */
                        /* JADX WARN: Type inference failed for: r15v3 */
                        /* JADX WARN: Type inference failed for: r15v4 */
                        /* JADX WARN: Type inference failed for: r15v7 */
                        /* JADX WARN: Type inference failed for: r3v110 */
                        /* JADX WARN: Type inference failed for: r3v114, types: [int] */
                        /* JADX WARN: Type inference failed for: r5v33 */
                        /* JADX WARN: Type inference failed for: r5v34, types: [int] */
                        /* JADX WARN: Type inference failed for: r5v69, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
                        /* JADX WARN: Type inference failed for: r5v71 */
                        /* JADX WARN: Type inference failed for: r5v73 */
                        /* JADX WARN: Type inference failed for: r5v74 */
                        /* JADX WARN: Type inference failed for: r6v1 */
                        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence] */
                        /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.CharSequence] */
                        /* JADX WARN: Type inference failed for: r6v96 */
                        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class cls, int i, int i2, int i3) throws Throwable {
                            ?? r6;
                            int i4;
                            int i5;
                            int i6;
                            int i7;
                            int i8;
                            int i9;
                            char c;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            ?? declaredField;
                            ?? r15;
                            String string;
                            char c2;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int i20 = 2 % 2;
                            if ((i2 & 2) != 0) {
                                String[][] strArr = new String[1][];
                                try {
                                    char[] cArr = {27, ' ', 26, 18, 7, '#', 27, 31};
                                    int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i21 = maximumFlingVelocity * (-519);
                                    int i22 = ((i21 | 25008) << 1) - (i21 ^ 25008);
                                    int i23 = ~maximumFlingVelocity;
                                    int i24 = (i23 ^ (-49)) | (i23 & (-49));
                                    int i25 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i26 = (i22 - (~(((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 48) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 48))) | (~((i24 ^ i25) | (i24 & i25)))) * 520))) - 1;
                                    int i27 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i28 = ~((-49) | i27);
                                    int i29 = ~(maximumFlingVelocity | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    int i30 = (i26 - (~(((i28 ^ i29) | (i28 & i29)) * (-1040)))) - 1;
                                    int i31 = ~(i27 | i23);
                                    int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i33 = (i32 & 99) + (i32 | 99);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                                    int i34 = i33 % 2;
                                    int i35 = ~(((-49) ^ maximumFlingVelocity) | ((-49) & maximumFlingVelocity));
                                    int i36 = (i31 & i35) | (i31 ^ i35);
                                    int i37 = ~((maximumFlingVelocity ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & maximumFlingVelocity));
                                    int i38 = -(-(520 * ((i36 & i37) | (i36 ^ i37))));
                                    byte b = (byte) ((i30 ^ i38) + ((i38 & i30) << 1));
                                    int i39 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    int i40 = ((i39 | 8) << 1) - (i39 ^ 8);
                                    Object[] objArr = new Object[1];
                                    a(cArr, b, i40, objArr);
                                    Field declaredField2 = Class.class.getDeclaredField((String) objArr[0]);
                                    declaredField2.setAccessible(true);
                                    Object obj = declaredField2.get(cls);
                                    Class<?> cls2 = obj.getClass();
                                    char[] cArr2 = {27, ' ', 25, 24, 5, Typography.quote, 13947};
                                    int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i41 % 128;
                                    int i42 = i41 % 2;
                                    char mirror = AndroidCharacter.getMirror('0');
                                    int i43 = (mirror * 64815) - 54796;
                                    int i44 = ~i;
                                    int i45 = ~mirror;
                                    int i46 = ~(i45 | (-77));
                                    int i47 = (i44 ^ i46) | (i46 & i44);
                                    int i48 = ~((mirror ^ 'L') | (mirror & 'L'));
                                    int i49 = ((i47 ^ i48) | (i48 & i47)) * 1444;
                                    int i50 = (i43 & i49) + (i49 | i43);
                                    int i51 = ~(mirror | 'L');
                                    int i52 = ~((mirror ^ i) | (mirror & i));
                                    int i53 = ((i51 ^ i52) | (i51 & i52) | (~((i ^ 76) | (i & 76)))) * (-1444);
                                    int i54 = ((i50 | i53) << 1) - (i53 ^ i50);
                                    int i55 = ~((i45 ^ 76) | (i45 & 76));
                                    int i56 = ~((mirror & 65459) | (65459 ^ mirror));
                                    int i57 = ((i55 & i56) | (i55 ^ i56)) * 722;
                                    byte b2 = (byte) ((i54 & i57) + (i57 | i54));
                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                                    int i58 = iIndexOf * 471;
                                    int i59 = ((i58 | 3768) << 1) - (i58 ^ 3768);
                                    int i60 = -(-(((iIndexOf ^ 8) | (iIndexOf & 8)) * (-470)));
                                    int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                                    int i62 = ~iIndexOf;
                                    int i63 = ~((i62 & (-9)) | (i62 ^ (-9)));
                                    int i64 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i64 % 128;
                                    int i65 = i64 % 2;
                                    int i66 = ~((-9) | i);
                                    int i67 = (i66 & i63) | (i63 ^ i66);
                                    int i68 = (i44 ^ iIndexOf) | (i44 & iIndexOf);
                                    r15 = 8;
                                    int i69 = ~((i68 & 8) | (i68 ^ 8));
                                    int i70 = (i61 - (~((-470) * ((i67 & i69) | (i67 ^ i69))))) - 1;
                                    int i71 = ((~(((-9) & iIndexOf) | ((-9) ^ iIndexOf) | i)) | (~(i44 | iIndexOf | 8))) * 470;
                                    int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                                    Object[] objArr2 = new Object[1];
                                    a(cArr2, b2, i72, objArr2);
                                    declaredField = cls2.getDeclaredField((String) objArr2[0]);
                                    declaredField.setAccessible(true);
                                    try {
                                        Object[] objArr3 = {Long.valueOf(((Number) declaredField.get(obj)).longValue() & 281474976710655L), strArr};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486768121);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char defaultSize = (char) (41241 - View.getDefaultSize(0, 0));
                                            int iAlpha = 1705 - Color.alpha(0);
                                            int i73 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 20;
                                            byte[] bArr = $$a;
                                            byte b3 = bArr[5];
                                            Object[] objArr4 = new Object[1];
                                            b((byte) (-b3), bArr[7], (byte) (-b3), objArr4);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iAlpha, i73, -107095506, false, (String) objArr4[0], new Class[]{Long.TYPE, String[][].class});
                                        }
                                        declaredField = 0;
                                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).longValue();
                                        long j = -1881533117;
                                        long j2 = -167;
                                        long j3 = (j2 * j) + (j2 * jLongValue);
                                        long j4 = 168;
                                        long j5 = -1;
                                        long j6 = j ^ j5;
                                        long j7 = jLongValue ^ j5;
                                        long j8 = j6 | j7;
                                        r15 = "";
                                        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                        long j9 = jElapsedRealtime ^ j5;
                                        long j10 = j3 + (((j8 ^ j5) | ((j7 | j9) ^ j5)) * j4) + (((j8 | jElapsedRealtime) ^ j5) * j4) + (j4 * ((j5 ^ ((j7 | j) | jElapsedRealtime)) | ((j6 | j9) ^ j5) | ((j6 | jLongValue) ^ j5))) + ((long) (-224483944));
                                        int i74 = (int) (j10 >> 32);
                                        try {
                                            int i75 = ~((int) Process.getElapsedCpuTime());
                                            int i76 = i74 & ((-923364378) + ((~((-17303553) | i75)) * (-783)) + (((~(i75 | 979478439)) | (-457747972)) * 783));
                                            int i77 = ((int) j10) & (282608167 + (((~(1584912255 | i44)) | (~((-1509955093) | i))) * (-302)) + ((~(1584912255 | i)) * (-604)) + (((~(74957163 | i)) | 2228481) * 302));
                                            int i78 = (i76 & i77) | (i76 ^ i77);
                                            if (i78 != 0) {
                                                int i79 = (i78 | i) & (~(i & i78));
                                                String[] strArr2 = strArr[0];
                                                String[] strArr3 = {cls.getName(), strArr2[0], strArr2[1], strArr2[2]};
                                                Object[] objArr5 = new Object[4];
                                                int[] iArr = new int[1];
                                                objArr5[0] = iArr;
                                                objArr5[1] = new int[]{i79};
                                                objArr5[2] = new int[]{i};
                                                int i80 = (-1421044831) + (((~((-136362020) | i44)) | (~((-21038225) | i)) | (~((-1411269197) | i))) * 765) + (((~((-157400244) | i44)) | 136362019) * 1530) + (((~((-157400244) | i)) | (~((-1411269197) | i44))) * 765);
                                                int i81 = -(-(i80 * 334));
                                                int i82 = ((((-10640) | i81) << 1) - (i81 ^ (-10640))) + 5661;
                                                int i83 = ~(((-17) ^ i44) | ((-17) & i44));
                                                int i84 = ~((i80 ^ i) | (i80 & i));
                                                int i85 = ((i83 & i84) | (i83 ^ i84)) * 333;
                                                int i86 = (i82 ^ i85) + ((i85 & i82) << 1);
                                                int i87 = ~(((-17) & i) | ((-17) ^ i));
                                                int i88 = ~i;
                                                int i89 = ~((i80 & i88) | (i88 ^ i80));
                                                int i90 = (i86 - (~(-(-(((i87 & i89) | (i87 ^ i89)) * 333))))) - 1;
                                                int i91 = (i90 * (-494)) + (i3 * (-494));
                                                int i92 = (~(i90 | i3)) * (-495);
                                                int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
                                                int i94 = (i90 | i44) * 495;
                                                int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                                                int i96 = ~i90;
                                                int i97 = ~i3;
                                                int i98 = ~((i96 & i97) | (i96 ^ i97));
                                                int i99 = ~((i90 & i44) | (i44 ^ i90));
                                                int i100 = -(-(((i98 & i99) | (i98 ^ i99)) * 495));
                                                int i101 = (i95 & i100) + (i100 | i95);
                                                int i102 = i101 << 13;
                                                int i103 = (i102 & (~i101)) | ((~i102) & i101);
                                                int i104 = i103 >>> 17;
                                                int i105 = ((~i103) & i104) | ((~i104) & i103);
                                                int i106 = i105 << 5;
                                                iArr[0] = ((~i105) & i106) | ((~i106) & i105);
                                                objArr5[3] = strArr3;
                                                return objArr5;
                                            }
                                            int i107 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i107 % 128;
                                            int i108 = i107 % 2;
                                            r6 = r15;
                                        } catch (Throwable th) {
                                            th = th;
                                            declaredField = i3;
                                            try {
                                                StringWriter stringWriter = new StringWriter();
                                                try {
                                                    Object[] objArr6 = {new PrintWriter(stringWriter)};
                                                    char[] cArr3 = {17, '\n', 29, '\n', 29, '!', 17, 23, 3, 26, 7, 24, 7, 4, '\b', 6, 29, 5, 13899};
                                                    ?? r7 = r15;
                                                    int i109 = -TextUtils.indexOf((CharSequence) r7, (CharSequence) r7, 0, 0);
                                                    int i110 = (i109 & 76) + (i109 | 76);
                                                    int i111 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    int i112 = (i111 ^ 77) + ((i111 & 77) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i112 % 128;
                                                    int i113 = i112 % 2;
                                                    byte b4 = (byte) i110;
                                                    int i114 = -TextUtils.getTrimmedLength(r7);
                                                    int i115 = ~i;
                                                    int i116 = (((i114 * 758) - 14364) - (~(((i115 & i114) | (i114 ^ i115)) * (-757)))) - 1;
                                                    int i117 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                                                    int i118 = i117 % 128;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i118;
                                                    if (i117 % 2 == 0) {
                                                        int i119 = ((-20) & i114) | ((-20) ^ i114);
                                                        i19 = i116 << (1514 % (~((i119 & i) | (i119 ^ i))));
                                                    } else {
                                                        int i120 = ((-20) & i114) | ((-20) ^ i114);
                                                        int i121 = -(-((~((i120 & i) | (i120 ^ i))) * 1514));
                                                        i19 = ((i116 & i121) << 1) + (i116 ^ i121);
                                                    }
                                                    int i122 = ~i114;
                                                    int i123 = ~((i122 & (-20)) | (i122 ^ (-20)));
                                                    int i124 = ~i;
                                                    int i125 = ~((i124 & (-20)) | ((-20) ^ i124));
                                                    int i126 = (i123 & i125) | (i123 ^ i125);
                                                    int i127 = i114 | 19;
                                                    int i128 = (i118 & 81) + (i118 | 81);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i128 % 128;
                                                    int i129 = i128 % 2;
                                                    int i130 = ~((i127 & i) | (i127 ^ i));
                                                    int i131 = 757 * ((i130 & i126) | (i126 ^ i130));
                                                    int i132 = (i19 ^ i131) + ((i19 & i131) << 1);
                                                    Object[] objArr7 = new Object[1];
                                                    a(cArr3, b4, i132, objArr7);
                                                    Class<?> cls3 = Class.forName((String) objArr7[0]);
                                                    char[] cArr4 = {16, 6, 5, 16, Typography.quote, 20, '#', '\b', '!', 19, 7, 11, 7, '#', 13933};
                                                    int i133 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    int i134 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                    int i135 = (i134 & 41) + (i134 | 41);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i135 % 128;
                                                    int i136 = i135 % 2;
                                                    int i137 = -i133;
                                                    Object[] objArr8 = new Object[1];
                                                    a(cArr4, (byte) ((111 & i137) + (i137 | 111)), 14 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), objArr8);
                                                    cls3.getMethod((String) objArr8[0], PrintWriter.class).invoke(th, objArr6);
                                                    string = stringWriter.toString();
                                                    int i138 = (i & (-32)) | ((~i) & 31);
                                                    String[] strArr4 = {cls.getName(), string};
                                                    Object[] objArr9 = new Object[4];
                                                    int i139 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    int i140 = (i139 ^ 37) + ((i139 & 37) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i140 % 128;
                                                    if (i140 % 2 == 0) {
                                                        objArr9[0] = new int[0];
                                                        objArr9[1] = new int[1];
                                                        objArr9[4] = new int[0];
                                                        i15 = 77;
                                                        c2 = 2;
                                                    } else {
                                                        objArr9[0] = new int[1];
                                                        objArr9[1] = new int[1];
                                                        c2 = 2;
                                                        objArr9[2] = new int[1];
                                                        i15 = 16;
                                                    }
                                                    ((int[]) objArr9[c2])[0] = i;
                                                    ((int[]) objArr9[1])[0] = i138;
                                                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                                    int i141 = ~startUptimeMillis;
                                                    int i142 = 567363166 + (((~((-897475171) | i141)) | 89924130) * 98) + (((~(i141 | (-807556289))) | (-897475171) | (~(807556288 | startUptimeMillis))) * (-49)) + (((~(startUptimeMillis | (-897475171))) | (-897480419)) * 49) + i15;
                                                    int i143 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                    int i144 = ((i143 | 115) << 1) - (i143 ^ 115);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i144 % 128;
                                                    int i145 = i144 % 2;
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                    if (i145 != 0) {
                                                        int i146 = 758 << i142;
                                                        int i147 = -((-756) >>> declaredField);
                                                        int i148 = (i146 ^ i147) + ((i146 & i147) << 1);
                                                        int i149 = -(-((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i142));
                                                        i16 = i148 / (((i149 | (-757)) << 1) - (i149 ^ (-757)));
                                                    } else {
                                                        int i150 = i142 * 758;
                                                        int i151 = declaredField * (-756);
                                                        i16 = (i150 & i151) + (i150 | i151) + (((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i142) * (-757));
                                                    }
                                                    int i152 = ~declaredField;
                                                    int i153 = (i152 ^ i142) | (i152 & i142);
                                                    int i154 = i16 + (1514 * (~((i153 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i153 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))));
                                                    int i155 = ~i142;
                                                    int i156 = ~declaredField;
                                                    int i157 = ~((i155 & i156) | (i155 ^ i156));
                                                    int i158 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                                                    int i159 = i158 % 128;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i159;
                                                    if (i158 % 2 == 0) {
                                                        int i160 = ~(i152 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                        int i161 = (i160 & i157) | (i157 ^ i160);
                                                        int i162 = ((i142 ^ declaredField) == true ? 1 : 0) | (declaredField & i142);
                                                        int i163 = 757 << ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i162) | (i162 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | i161);
                                                        int i164 = (i154 & i163) + (i163 | i154);
                                                        i17 = (i164 * 116) ^ i164;
                                                        i18 = (i17 & 47) + (i17 | 47);
                                                    } else {
                                                        int i165 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                        int i166 = (~((i152 & i165) | (i152 ^ i165))) | i157;
                                                        int i167 = (i142 ^ declaredField) | (declaredField & i142);
                                                        int i168 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i167) | (i167 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                        int i169 = -(-(((i168 & i166) | (i166 ^ i168)) * 757));
                                                        int i170 = ((i154 | i169) << 1) - (i169 ^ i154);
                                                        int i171 = i170 << 13;
                                                        i17 = (i171 & (~i170)) | ((~i171) & i170);
                                                        i18 = i17 >>> 17;
                                                    }
                                                    int i172 = ((i159 | 45) << 1) - (i159 ^ 45);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i172 % 128;
                                                    if (i172 % 2 == 0) {
                                                        int i173 = (i17 | i18) & (~(i17 & i18));
                                                        ((int[]) objArr9[0])[0] = i173 ^ (i173 << 5);
                                                        objArr9[3] = strArr4;
                                                        return objArr9;
                                                    }
                                                    int i174 = i17 ^ i18;
                                                    int i175 = i174 / 3;
                                                    ((int[]) objArr9[0])[0] = (i174 | i175) & (~(i174 & i175));
                                                    objArr9[4] = strArr4;
                                                    return objArr9;
                                                } catch (Throwable th2) {
                                                    Throwable cause = th2.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (Throwable unused) {
                                                int i176 = -(-View.combineMeasuredStates(0, 0));
                                                Object[] objArr10 = new Object[1];
                                                a(new char[]{13827}, (byte) ((i176 & 79) + (i176 | 79)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr10);
                                                string = (String) objArr10[0];
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause2 = th3.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    declaredField = i3;
                                    r15 = "";
                                }
                            } else {
                                r6 = "";
                            }
                            int[] iArr2 = {-1844476378, 1276062274, -797088743, 965014536, -30564408, 800164665, 427080095, -63109426, -2128711273, 443823261, -421827424, -1596256068, -554832609, -49350782, -437871410, 1291703475, -587285223, 1359539528, -706062319, 1866472215};
                            String[][] strArr5 = new String[1][];
                            int i177 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i177 % 128;
                            int i178 = i177 % 2;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int i179 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i180 = ((i179 | 27) << 1) - (i179 ^ 27);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i180 % 128;
                            int i181 = (int) jCurrentTimeMillis;
                            if (i180 % 2 == 0) {
                                i4 = i181 ^ 343337308;
                                i5 = i ^ i4;
                                int i182 = 89 / 0;
                            } else {
                                i4 = i181 ^ 343337308;
                                i5 = ((~i4) & i) | ((~i) & i4);
                            }
                            try {
                                Object[] objArr11 = {Integer.valueOf(i5), iArr2, Integer.valueOf(i2), strArr5};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 43042);
                                    int iBlue = Color.blue(0) + 3111;
                                    int deadChar = KeyEvent.getDeadChar(0, 0) + 22;
                                    byte[] bArr2 = $$a;
                                    byte b5 = bArr2[5];
                                    Object[] objArr12 = new Object[1];
                                    b((byte) (-b5), bArr2[7], (byte) (-b5), objArr12);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize2, iBlue, deadChar, 974412207, false, (String) objArr12[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr11)).longValue();
                                long j11 = -225333655;
                                long j12 = (((long) 784) * j11) + (((long) (-782)) * jLongValue2);
                                long j13 = -783;
                                long j14 = -1;
                                long j15 = j11 ^ j14;
                                long jMaxMemory = ((long) ((int) Runtime.getRuntime().maxMemory())) ^ j14;
                                long j16 = j12 + ((jLongValue2 ^ j14) * j13) + (j13 * (((j15 | jMaxMemory) | jLongValue2) ^ j14)) + (((long) 783) * (((jMaxMemory | jLongValue2) ^ j14) | j15)) + ((long) 329067720);
                                int iMyPid = Process.myPid();
                                int i183 = ~iMyPid;
                                int i184 = ((int) (j16 >> 32)) & ((-425986835) + (((~(i183 | (-33382403))) | 5783554 | (~((-1443009966) | iMyPid))) * 717) + (((~(iMyPid | (-33382403))) | (~(i183 | (-1443009966))) | 5783554) * 717));
                                int iMyTid = Process.myTid();
                                int i185 = ~iMyTid;
                                int i186 = ((int) j16) & ((-2077215590) + ((1017106739 | i185) * (-757)) + ((~((-1092618241) | iMyTid)) * 1514) + (((~(iMyTid | 2109724979)) | (~(i185 | (-1840634147))) | 748015906) * 757));
                                int i187 = ((i184 & i186) | (i184 ^ i186)) ^ i4;
                                if (i187 != i) {
                                    String[] strArr6 = strArr5[0];
                                    Object[] objArr13 = new Object[4];
                                    objArr13[0] = new int[1];
                                    int[] iArr3 = new int[1];
                                    objArr13[1] = iArr3;
                                    int i188 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i189 = ((i188 | 23) << 1) - (i188 ^ 23);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i189 % 128;
                                    int i190 = i189 % 2;
                                    int[] iArr4 = new int[1];
                                    objArr13[2] = iArr4;
                                    int i191 = ((i188 | 65) << 1) - (i188 ^ 65);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i191 % 128;
                                    if (i191 % 2 == 0) {
                                        iArr4[1] = i;
                                        iArr3[0] = i187;
                                    } else {
                                        iArr4[0] = i;
                                        iArr3[0] = i187;
                                    }
                                    int iMyUid = Process.myUid();
                                    int i192 = 1879698000 + (((~((-160579636) | iMyUid)) | 134365219) * 345) + (((~((-160579636) | (~iMyUid))) | 1410086604) * 345) + ((~(iMyUid | (-134365220))) * 345);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i193 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i194 = i193 + 33;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i194 % 128;
                                    int i195 = i194 % 2;
                                    int i196 = 8047 - (~(-(-(TypedValues.PositionType.TYPE_PERCENT_WIDTH * i192))));
                                    int i197 = (16 ^ i192) | (16 & i192);
                                    int i198 = i197 * (-502);
                                    int i199 = ((i196 | i198) << 1) - (i196 ^ i198);
                                    int i200 = ~((~i192) | (-17));
                                    int i201 = (i193 ^ 7) + ((i193 & 7) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i201 % 128;
                                    int i202 = i201 % 2;
                                    int i203 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    int i204 = i200 | (~(((-17) ^ i203) | ((-17) & i203)));
                                    int i205 = ~((i197 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i197 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    int i206 = (i199 - (~(-(-((-502) * ((i204 & i205) | (i204 ^ i205))))))) - 1;
                                    int i207 = i193 + 51;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i207 % 128;
                                    if (i207 % 2 == 0) {
                                        int i208 = ((-17) & i203) | ((-17) ^ i203);
                                        int i209 = ~((i208 & i192) | (i208 ^ i192));
                                        int i210 = i192 | 16;
                                        int i211 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i210) | (i210 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i212 = (i206 << (TypedValues.PositionType.TYPE_DRAWPATH >>> ((i211 & i209) | (i209 ^ i211)))) * i3;
                                        i13 = i212 ^ (i212 % 123);
                                        i14 = i13 >> 107;
                                    } else {
                                        int i213 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i214 = (i213 & (-17)) | ((-17) ^ i213);
                                        int i215 = ~((i214 & i192) | (i214 ^ i192));
                                        int i216 = i192 | 16;
                                        int i217 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i216) | (i216 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i218 = ((i217 & i215) | (i215 ^ i217)) * TypedValues.PositionType.TYPE_DRAWPATH;
                                        int i219 = -(-((i206 ^ i218) + ((i218 & i206) << 1)));
                                        int i220 = (i3 & i219) + (i3 | i219);
                                        int i221 = i220 << 13;
                                        i13 = (i221 | i220) & (~(i220 & i221));
                                        i14 = i13 >>> 17;
                                    }
                                    int i222 = i193 + 61;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i222 % 128;
                                    if (i222 % 2 == 0) {
                                        int i223 = (i13 | i14) & (~(i13 & i14));
                                        ((int[]) objArr13[0])[0] = i223 ^ (i223 * 2);
                                        objArr13[4] = strArr6;
                                    } else {
                                        int i224 = ((~i13) & i14) | ((~i14) & i13);
                                        int i225 = i224 << 5;
                                        ((int[]) objArr13[0])[0] = ((~i224) & i225) | ((~i225) & i224);
                                        objArr13[3] = strArr6;
                                    }
                                    return objArr13;
                                }
                                try {
                                    char[] cArr5 = {17, 23, 28, '\b', 2, 5, 27, 28, 6, 17, 15, 24, 1, '#', Typography.quote, 2, Typography.quote, '\n', 30, 2, 7, 24, '\t', Typography.quote, '\b', 29};
                                    int i226 = -KeyEvent.getDeadChar(0, 0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i227 = i226 * (-317);
                                    int i228 = (i227 & 15312) + (i227 | 15312);
                                    int i229 = ~i226;
                                    int i230 = (i229 & (-49)) | (i229 ^ (-49));
                                    int i231 = ~((i230 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i230 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                    int i232 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                    int i233 = ~((i232 & i226) | (i232 ^ i226) | 48);
                                    int i234 = i228 + (((i231 & i233) | (i231 ^ i233)) * (-318));
                                    int i235 = ~((-49) | i226);
                                    int i236 = ~((i226 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i226 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                    int i237 = ((i235 & i236) | (i235 ^ i236)) * (-318);
                                    int i238 = (i234 ^ i237) + ((i237 & i234) << 1);
                                    int i239 = ~i226;
                                    int i240 = -(-(((~((i239 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i239 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | (-49)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                    Object[] objArr14 = new Object[1];
                                    a(cArr5, (byte) ((i238 ^ i240) + ((i240 & i238) << 1)), (ViewConfiguration.getTapTimeout() >> 16) + 26, objArr14);
                                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                                    char[] cArr6 = {1, 19, 13921, 13921, '#', 15, '#', 2, 13923, 13923, Typography.quote, 5, '#', 7, Typography.quote, 2, 5, '\r'};
                                    i6 = 16;
                                    int i241 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                    byte b6 = (byte) ((i241 ^ 121) + ((i241 & 121) << 1));
                                    try {
                                        int i242 = -TextUtils.lastIndexOf(r6, '0', 0);
                                        int i243 = (i242 ^ 17) + ((i242 & 17) << 1);
                                        Object[] objArr15 = new Object[1];
                                        a(cArr6, b6, i243, objArr15);
                                        if (cls4.getMethod((String) objArr15[0], new Class[0]).invoke(null, null) != null) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char packedPositionType = (char) (22878 - ExpandableListView.getPackedPositionType(0L));
                                                int iIndexOf2 = 594 - TextUtils.indexOf((CharSequence) r6, (CharSequence) r6, 0, 0);
                                                int iIndexOf3 = TextUtils.indexOf((CharSequence) r6, '0', 0, 0) + 18;
                                                byte b7 = $$a[7];
                                                byte b8 = b7;
                                                Object[] objArr16 = new Object[1];
                                                b(b7, b8, b8, objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, iIndexOf2, iIndexOf3, -1471475267, false, (String) objArr16[0], null);
                                            }
                                            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null) != 0) {
                                                int i244 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i245 = ((i244 | 39) << 1) - (i244 ^ 39);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i245 % 128;
                                                if (i245 % 2 != 0) {
                                                    i7 = ~(i & 106);
                                                    i8 = i | 106;
                                                } else {
                                                    i7 = ~(i & 9);
                                                    i8 = i | 9;
                                                }
                                                i9 = i7 & i8;
                                            } else {
                                                int i246 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i247 = (i246 ^ 9) + ((i246 & 9) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i247 % 128;
                                                int i248 = i247 % 2;
                                            }
                                            if (i9 != i) {
                                                int i249 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i250 = (i249 & 39) + (i249 | 39);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i250 % 128;
                                                c = 2;
                                                int i251 = i250 % 2;
                                                i11 = i6;
                                                i10 = 0;
                                            } else {
                                                c = 2;
                                                i10 = 0;
                                                i11 = 0;
                                            }
                                            String[] strArr7 = new String[i10];
                                            Object[] objArr17 = new Object[4];
                                            objArr17[i10] = new int[1];
                                            int[] iArr5 = new int[1];
                                            objArr17[1] = iArr5;
                                            int[] iArr6 = new int[1];
                                            objArr17[c] = iArr6;
                                            iArr6[i10] = i;
                                            iArr5[i10] = i9;
                                            int iNextInt = new Random().nextInt(1838460699);
                                            int i252 = ~iNextInt;
                                            int i253 = (-1984962272) + (((~((-1041285676) | i252)) | 663745783) * 226) + (((~(i252 | (-403702281))) | (~((-663745784) | iNextInt)) | 26162388) * (-113)) + ((~(iNextInt | (-1041285676))) * 113);
                                            int i254 = i11 * 236;
                                            int i255 = i253 * 471;
                                            int i256 = ((i254 | i255) << 1) - (i254 ^ i255);
                                            int i257 = ~i11;
                                            int i258 = ~i;
                                            int i259 = ~((i258 & i257) | (i257 ^ i258));
                                            int i260 = ((i259 & i253) | (i253 ^ i259)) * (-235);
                                            int i261 = ((i256 | i260) << 1) - (i260 ^ i256);
                                            int i262 = ~((i257 ^ i) | (i257 & i));
                                            int i263 = ((i262 & i253) | (i253 ^ i262)) * (-470);
                                            int i264 = (i261 & i263) + (i263 | i261);
                                            int i265 = ~i253;
                                            int i266 = ~((i265 & i11) | (i265 ^ i11));
                                            int i267 = (i257 & i253) | (i257 ^ i253);
                                            int i268 = ~((i & i267) | (i267 ^ i));
                                            int i269 = -(-(((i268 & i266) | (i266 ^ i268)) * 235));
                                            int i270 = i3 + (((i264 | i269) << 1) - (i269 ^ i264));
                                            int i271 = i270 ^ (i270 << 13);
                                            int i272 = i271 >>> 17;
                                            int i273 = ((~i271) & i272) | ((~i272) & i271);
                                            ((int[]) objArr17[0])[0] = i273 ^ (i273 << 5);
                                            objArr17[3] = strArr7;
                                            int i274 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            i12 = (i274 ^ 75) + ((i274 & 75) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                                            if (i12 % 2 != 0) {
                                                int i275 = 26 / 0;
                                            }
                                            return objArr17;
                                        }
                                        int i276 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i276 % 128;
                                        if (i276 % 2 == 0) {
                                            int i277 = 64 / 0;
                                        }
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    i6 = 16;
                                }
                                i9 = i;
                                if (i9 != i) {
                                    int i2410 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i2510 = (i2410 & 39) + (i2410 | 39);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2510 % 128;
                                    c = 2;
                                    int i2511 = i2510 % 2;
                                    i11 = i6;
                                    i10 = 0;
                                } else {
                                    c = 2;
                                    i10 = 0;
                                    i11 = 0;
                                }
                                String[] strArr8 = new String[i10];
                                Object[] objArr18 = new Object[4];
                                objArr18[i10] = new int[1];
                                int[] iArr7 = new int[1];
                                objArr18[1] = iArr7;
                                int[] iArr8 = new int[1];
                                objArr18[c] = iArr8;
                                iArr8[i10] = i;
                                iArr7[i10] = i9;
                                int iNextInt2 = new Random().nextInt(1838460699);
                                int i2512 = ~iNextInt2;
                                int i2513 = (-1984962272) + (((~((-1041285676) | i2512)) | 663745783) * 226) + (((~(i2512 | (-403702281))) | (~((-663745784) | iNextInt2)) | 26162388) * (-113)) + ((~(iNextInt2 | (-1041285676))) * 113);
                                int i2514 = i11 * 236;
                                int i2515 = i2513 * 471;
                                int i2516 = ((i2514 | i2515) << 1) - (i2514 ^ i2515);
                                int i2517 = ~i11;
                                int i2518 = ~i;
                                int i2519 = ~((i2518 & i2517) | (i2517 ^ i2518));
                                int i2610 = ((i2519 & i2513) | (i2513 ^ i2519)) * (-235);
                                int i2611 = ((i2516 | i2610) << 1) - (i2610 ^ i2516);
                                int i2612 = ~((i2517 ^ i) | (i2517 & i));
                                int i2613 = ((i2612 & i2513) | (i2513 ^ i2612)) * (-470);
                                int i2614 = (i2611 & i2613) + (i2613 | i2611);
                                int i2615 = ~i2513;
                                int i2616 = ~((i2615 & i11) | (i2615 ^ i11));
                                int i2617 = (i2517 & i2513) | (i2517 ^ i2513);
                                int i2618 = ~((i & i2617) | (i2617 ^ i));
                                int i2619 = -(-(((i2618 & i2616) | (i2616 ^ i2618)) * 235));
                                int i278 = i3 + (((i2614 | i2619) << 1) - (i2619 ^ i2614));
                                int i279 = i278 ^ (i278 << 13);
                                int i2710 = i279 >>> 17;
                                int i2711 = ((~i279) & i2710) | ((~i2710) & i279);
                                ((int[]) objArr18[0])[0] = i2711 ^ (i2711 << 5);
                                objArr18[3] = strArr8;
                                int i2712 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i12 = (i2712 ^ 75) + ((i2712 & 75) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                                if (i12 % 2 != 0) {
                                    int i2713 = 26 / 0;
                                }
                                return objArr18;
                            } catch (Throwable th5) {
                                Throwable cause3 = th5.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th5;
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static java.lang.String $$e(byte r6, int r7, short r8) {
                            /*
                                int r8 = 116 - r8
                                byte[] r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder.$$c
                                int r7 = r7 * 3
                                int r1 = 1 - r7
                                int r6 = r6 + 4
                                byte[] r1 = new byte[r1]
                                r2 = 0
                                int r7 = 0 - r7
                                if (r0 != 0) goto L15
                                r8 = r6
                                r4 = r7
                                r3 = r2
                                goto L2a
                            L15:
                                r3 = r2
                            L16:
                                int r6 = r6 + 1
                                byte r4 = (byte) r8
                                r1[r3] = r4
                                if (r3 != r7) goto L23
                                java.lang.String r6 = new java.lang.String
                                r6.<init>(r1, r2)
                                return r6
                            L23:
                                r4 = r0[r6]
                                int r3 = r3 + 1
                                r5 = r8
                                r8 = r6
                                r6 = r5
                            L2a:
                                int r6 = r6 + r4
                                r5 = r8
                                r8 = r6
                                r6 = r5
                                goto L16
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder.$$e(byte, int, short):java.lang.String");
                        }
                    }

                    public static Builder builder() {
                        return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.Builder();
                    }
                }

                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.Builder();
                }
            }

            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_Event.Builder();
            }

            public static abstract class Application {

                /* JADX INFO: loaded from: classes5.dex */
                public static abstract class Builder {
                    public abstract Application build();

                    public abstract Builder setAppProcessDetails(List<ProcessDetails> list);

                    public abstract Builder setBackground(Boolean bool);

                    public abstract Builder setCurrentProcessDetails(ProcessDetails processDetails);

                    public abstract Builder setCustomAttributes(List<CustomAttribute> list);

                    public abstract Builder setExecution(Execution execution);

                    public abstract Builder setInternalKeys(List<CustomAttribute> list);

                    public abstract Builder setUiOrientation(int i);
                }

                public abstract List<ProcessDetails> getAppProcessDetails();

                public abstract Boolean getBackground();

                public abstract ProcessDetails getCurrentProcessDetails();

                public abstract List<CustomAttribute> getCustomAttributes();

                public abstract Execution getExecution();

                public abstract List<CustomAttribute> getInternalKeys();

                public abstract int getUiOrientation();

                public abstract Builder toBuilder();

                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Application.Builder();
                }

                /* JADX INFO: loaded from: classes5.dex */
                public static abstract class Execution {

                    public static abstract class Builder {
                        public abstract Execution build();

                        public abstract Builder setAppExitInfo(ApplicationExitInfo applicationExitInfo);

                        public abstract Builder setBinaries(List<BinaryImage> list);

                        public abstract Builder setException(Exception exception);

                        public abstract Builder setSignal(Signal signal);

                        public abstract Builder setThreads(List<Thread> list);
                    }

                    public abstract ApplicationExitInfo getAppExitInfo();

                    public abstract List<BinaryImage> getBinaries();

                    public abstract Exception getException();

                    public abstract Signal getSignal();

                    public abstract List<Thread> getThreads();

                    public static Builder builder() {
                        return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder();
                    }

                    public static abstract class Thread {

                        public static abstract class Builder {
                            public abstract Thread build();

                            public abstract Builder setFrames(List<Frame> list);

                            public abstract Builder setImportance(int i);

                            public abstract Builder setName(String str);
                        }

                        public abstract List<Frame> getFrames();

                        public abstract int getImportance();

                        public abstract String getName();

                        public static Builder builder() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.Builder();
                        }

                        public static abstract class Frame {

                            public static abstract class Builder {
                                public abstract Frame build();

                                public abstract Builder setFile(String str);

                                public abstract Builder setImportance(int i);

                                public abstract Builder setOffset(long j);

                                public abstract Builder setPc(long j);

                                public abstract Builder setSymbol(String str);
                            }

                            public abstract String getFile();

                            public abstract int getImportance();

                            public abstract long getOffset();

                            public abstract long getPc();

                            public abstract String getSymbol();

                            public static Builder builder() {
                                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.Builder();
                            }
                        }
                    }

                    public static abstract class Exception {

                        public static abstract class Builder {
                            public abstract Exception build();

                            public abstract Builder setCausedBy(Exception exception);

                            public abstract Builder setFrames(List<Thread.Frame> list);

                            public abstract Builder setOverflowCount(int i);

                            public abstract Builder setReason(String str);

                            public abstract Builder setType(String str);
                        }

                        public abstract Exception getCausedBy();

                        public abstract List<Thread.Frame> getFrames();

                        public abstract int getOverflowCount();

                        public abstract String getReason();

                        public abstract String getType();

                        public static Builder builder() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.Builder();
                        }
                    }

                    public static abstract class Signal {

                        public static abstract class Builder {
                            public abstract Signal build();

                            public abstract Builder setAddress(long j);

                            public abstract Builder setCode(String str);

                            public abstract Builder setName(String str);
                        }

                        public abstract long getAddress();

                        public abstract String getCode();

                        public abstract String getName();

                        public static Builder builder() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.Builder();
                        }
                    }

                    public static abstract class BinaryImage {
                        public abstract long getBaseAddress();

                        public abstract String getName();

                        public abstract long getSize();

                        @Encodable.Ignore
                        public abstract String getUuid();

                        public static Builder builder() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.Builder();
                        }

                        @Encodable.Field(name = "uuid")
                        public byte[] getUuidUtf8Bytes() {
                            String uuid = getUuid();
                            if (uuid != null) {
                                return uuid.getBytes(CrashlyticsReport.UTF_8);
                            }
                            return null;
                        }

                        public static abstract class Builder {
                            public abstract BinaryImage build();

                            public abstract Builder setBaseAddress(long j);

                            public abstract Builder setName(String str);

                            public abstract Builder setSize(long j);

                            public abstract Builder setUuid(String str);

                            public Builder setUuidFromUtf8Bytes(byte[] bArr) {
                                return setUuid(new String(bArr, CrashlyticsReport.UTF_8));
                            }
                        }
                    }
                }

                /* JADX INFO: loaded from: classes5.dex */
                public static abstract class ProcessDetails {

                    public static abstract class Builder {
                        public abstract ProcessDetails build();

                        public abstract Builder setDefaultProcess(boolean z);

                        public abstract Builder setImportance(int i);

                        public abstract Builder setPid(int i);

                        public abstract Builder setProcessName(String str);
                    }

                    public abstract int getImportance();

                    public abstract int getPid();

                    public abstract String getProcessName();

                    public abstract boolean isDefaultProcess();

                    public static Builder builder() {
                        return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.Builder();
                    }
                }
            }

            public static abstract class Device {

                /* JADX INFO: loaded from: classes5.dex */
                public static abstract class Builder {
                    public abstract Device build();

                    public abstract Builder setBatteryLevel(Double d);

                    public abstract Builder setBatteryVelocity(int i);

                    public abstract Builder setDiskUsed(long j);

                    public abstract Builder setOrientation(int i);

                    public abstract Builder setProximityOn(boolean z);

                    public abstract Builder setRamUsed(long j);
                }

                public abstract Double getBatteryLevel();

                public abstract int getBatteryVelocity();

                public abstract long getDiskUsed();

                public abstract int getOrientation();

                public abstract long getRamUsed();

                public abstract boolean isProximityOn();

                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Device.Builder();
                }
            }

            public static abstract class Log {

                /* JADX INFO: loaded from: classes5.dex */
                public static abstract class Builder {
                    public abstract Log build();

                    public abstract Builder setContent(String str);
                }

                public abstract String getContent();

                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Log.Builder();
                }
            }

            public static abstract class RolloutsState {

                public static abstract class Builder {
                    public abstract RolloutsState build();

                    public abstract Builder setRolloutAssignments(List<RolloutAssignment> list);
                }

                @Encodable.Field(name = "assignments")
                public abstract List<RolloutAssignment> getRolloutAssignments();

                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState.Builder();
                }
            }
        }

        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_Session.Builder().setCrashed(false);
        }

        @Encodable.Field(name = "identifier")
        public byte[] getIdentifierUtf8Bytes() {
            return getIdentifier().getBytes(CrashlyticsReport.UTF_8);
        }

        Session withEvents(List<Event> list) {
            return toBuilder().setEvents(list).build();
        }

        Session withOrganizationId(String str) {
            return toBuilder().setApp(getApp().withOrganizationId(str)).build();
        }

        Session withSessionEndFields(long j, boolean z, String str) {
            Builder builder = toBuilder();
            builder.setEndedAt(Long.valueOf(j));
            builder.setCrashed(z);
            if (str != null) {
                builder.setUser(User.builder().setIdentifier(str).build());
            }
            return builder.build();
        }

        Session withAppQualitySessionId(String str) {
            return toBuilder().setAppQualitySessionId(str).build();
        }

        public static abstract class Builder {
            public abstract Session build();

            public abstract Builder setApp(Application application);

            public abstract Builder setAppQualitySessionId(String str);

            public abstract Builder setCrashed(boolean z);

            public abstract Builder setDevice(Device device);

            public abstract Builder setEndedAt(Long l);

            public abstract Builder setEvents(List<Event> list);

            public abstract Builder setGenerator(String str);

            public abstract Builder setGeneratorType(int i);

            public abstract Builder setIdentifier(String str);

            public abstract Builder setOs(OperatingSystem operatingSystem);

            public abstract Builder setStartedAt(long j);

            public abstract Builder setUser(User user);

            public Builder setIdentifierFromUtf8Bytes(byte[] bArr) {
                return setIdentifier(new String(bArr, CrashlyticsReport.UTF_8));
            }
        }

        public static abstract class User {

            public static abstract class Builder {
                public abstract User build();

                public abstract Builder setIdentifier(String str);
            }

            public abstract String getIdentifier();

            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_User.Builder();
            }
        }

        public static abstract class Application {
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            public static int b;

            public static abstract class Builder {
                public abstract Application build();

                public abstract Builder setDevelopmentPlatform(String str);

                public abstract Builder setDevelopmentPlatformVersion(String str);

                public abstract Builder setDisplayVersion(String str);

                public abstract Builder setIdentifier(String str);

                public abstract Builder setInstallationUuid(String str);

                public abstract Builder setOrganization(Organization organization);

                public abstract Builder setVersion(String str);
            }

            public abstract String getDevelopmentPlatform();

            public abstract String getDevelopmentPlatformVersion();

            public abstract String getDisplayVersion();

            public abstract String getIdentifier();

            public abstract String getInstallationUuid();

            public abstract Organization getOrganization();

            public abstract String getVersion();

            protected abstract Builder toBuilder();

            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_Application.Builder();
            }

            Application withOrganizationId(String str) {
                Organization organization = getOrganization();
                return toBuilder().setOrganization((organization != null ? organization.toBuilder() : Organization.builder()).setClsId(str).build()).build();
            }

            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                int i = b;
                int i2 = i % 9966237;
                b = i + 1;
                if (i2 != 0) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = elapsedCpuTime;
                return elapsedCpuTime;
            }

            public static abstract class Organization {

                public static abstract class Builder {
                    public abstract Organization build();

                    public abstract Builder setClsId(String str);
                }

                public abstract String getClsId();

                protected abstract Builder toBuilder();

                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Application_Organization.Builder();
                }
            }
        }

        public static abstract class OperatingSystem {

            /* JADX INFO: loaded from: classes6.dex */
            public static abstract class Builder {
                public abstract OperatingSystem build();

                public abstract Builder setBuildVersion(String str);

                public abstract Builder setJailbroken(boolean z);

                public abstract Builder setPlatform(int i);

                public abstract Builder setVersion(String str);
            }

            public abstract String getBuildVersion();

            public abstract int getPlatform();

            public abstract String getVersion();

            public abstract boolean isJailbroken();

            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder();
            }
        }

        public static abstract class Device {

            /* JADX INFO: loaded from: classes6.dex */
            public static abstract class Builder {
                public abstract Device build();

                public abstract Builder setArch(int i);

                public abstract Builder setCores(int i);

                public abstract Builder setDiskSpace(long j);

                public abstract Builder setManufacturer(String str);

                public abstract Builder setModel(String str);

                public abstract Builder setModelClass(String str);

                public abstract Builder setRam(long j);

                public abstract Builder setSimulator(boolean z);

                public abstract Builder setState(int i);
            }

            public abstract int getArch();

            public abstract int getCores();

            public abstract long getDiskSpace();

            public abstract String getManufacturer();

            public abstract String getModel();

            public abstract String getModelClass();

            public abstract long getRam();

            public abstract int getState();

            public abstract boolean isSimulator();

            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_Device.Builder();
            }
        }
    }

    public static abstract class CustomAttribute {

        public static abstract class Builder {
            public abstract CustomAttribute build();

            public abstract Builder setKey(String str);

            public abstract Builder setValue(String str);
        }

        public abstract String getKey();

        public abstract String getValue();

        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_CustomAttribute.Builder();
        }
    }

    public static abstract class ApplicationExitInfo {

        /* JADX INFO: loaded from: classes6.dex */
        public static abstract class Builder {
            public abstract ApplicationExitInfo build();

            public abstract Builder setBuildIdMappingForArch(List<BuildIdMappingForArch> list);

            public abstract Builder setImportance(int i);

            public abstract Builder setPid(int i);

            public abstract Builder setProcessName(String str);

            public abstract Builder setPss(long j);

            public abstract Builder setReasonCode(int i);

            public abstract Builder setRss(long j);

            public abstract Builder setTimestamp(long j);

            public abstract Builder setTraceFile(String str);
        }

        public abstract List<BuildIdMappingForArch> getBuildIdMappingForArch();

        public abstract int getImportance();

        public abstract int getPid();

        public abstract String getProcessName();

        public abstract long getPss();

        public abstract int getReasonCode();

        public abstract long getRss();

        public abstract long getTimestamp();

        public abstract String getTraceFile();

        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_ApplicationExitInfo.Builder();
        }

        /* JADX INFO: loaded from: classes5.dex */
        public static abstract class BuildIdMappingForArch {

            /* JADX INFO: loaded from: classes6.dex */
            public static abstract class Builder {
                public abstract BuildIdMappingForArch build();

                public abstract Builder setArch(String str);

                public abstract Builder setBuildId(String str);

                public abstract Builder setLibraryName(String str);
            }

            public abstract String getArch();

            public abstract String getBuildId();

            public abstract String getLibraryName();

            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.Builder();
            }
        }
    }
}
