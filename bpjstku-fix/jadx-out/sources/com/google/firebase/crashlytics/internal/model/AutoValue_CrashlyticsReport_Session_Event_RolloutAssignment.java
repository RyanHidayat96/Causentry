package com.google.firebase.crashlytics.internal.model;

import android.content.Context;
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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.mlkit.common.MlKitException;
import defpackage.getSessionStateCallback;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
    private final long templateVersion;

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j, AnonymousClass1 anonymousClass1) {
        this(rolloutVariant, str, str2, j);
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j) {
        this.rolloutVariant = rolloutVariant;
        this.parameterKey = str;
        this.parameterValue = str2;
        this.templateVersion = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant() {
        return this.rolloutVariant;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final String getParameterKey() {
        return this.parameterKey;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final String getParameterValue() {
        return this.parameterValue;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final long getTemplateVersion() {
        return this.templateVersion;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.rolloutVariant);
        sb.append(", parameterKey=");
        sb.append(this.parameterKey);
        sb.append(", parameterValue=");
        sb.append(this.parameterValue);
        sb.append(", templateVersion=");
        sb.append(this.templateVersion);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        return this.rolloutVariant.equals(rolloutAssignment.getRolloutVariant()) && this.parameterKey.equals(rolloutAssignment.getParameterKey()) && this.parameterValue.equals(rolloutAssignment.getParameterValue()) && this.templateVersion == rolloutAssignment.getTemplateVersion();
    }

    public final int hashCode() {
        int iHashCode = this.rolloutVariant.hashCode();
        int iHashCode2 = this.parameterKey.hashCode();
        int iHashCode3 = this.parameterValue.hashCode();
        long j = this.templateVersion;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {
        private String parameterKey;
        private String parameterValue;
        private CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
        private byte set$0;
        private long templateVersion;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.rolloutVariant = rolloutVariant;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.parameterKey = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.parameterValue = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long j) {
            this.templateVersion = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment build() {
            if (this.set$0 != 1 || this.rolloutVariant == null || this.parameterKey == null || this.parameterValue == null) {
                StringBuilder sb = new StringBuilder();
                if (this.rolloutVariant == null) {
                    sb.append(" rolloutVariant");
                }
                if (this.parameterKey == null) {
                    sb.append(" parameterKey");
                }
                if (this.parameterValue == null) {
                    sb.append(" parameterValue");
                }
                if ((1 & this.set$0) == 0) {
                    sb.append(" templateVersion");
                }
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
            }
            return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(this.rolloutVariant, this.parameterKey, this.parameterValue, this.templateVersion, null);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        private static final byte[] $$c = {30, 17, -35, 104};
        private static final int $$f = 211;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {117, -15, -81, 1, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
        private static final int $$e = 68;
        private static final byte[] $$a = {81, 125, 2, 46, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
        private static final int $$b = 45;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {8057, 57474, 57492, 57526, 57511, 57525, 57540, 57498, 57563, 57571, 57598, 57360, 57357, 57362, 57396, 57466, 57371, 57411, 57438, 57456, 57453, 57444, 57748, 20389, 45139, 45150, 45134, 45171, 45157, 45073, 45071, 45061, 45107, 45060, 45279, 45279, 45251, 23879, 41670, 41641, 51905, 13608, 13689, 13569, 13576, 13574, 13693, 13629, 13665, 13636, 13658, 13734, 13728, 13746, 13708, 13710, 58289, 7262, 45462, 45561, 19984, 19997, 20020, 20038, 45548, 19977, 19991, 20011, 20013, 20031, 20033, 19978, 20063, 20071, 20089, 20174, 20109, 20118, 20128, 20130, 20147, 20161, 20176, 20142, 45560, 19981, 19970, 20009, 20015, 20029, 20091, 20032, 20051, 20068, 20093, 20099, 20117, 45563, 19981, 19968, 19987, 20021, 20011, 20048, 20053, 20049, 20059, 20081, 20114, 20122, 20113, 20135, 20149, 45565, 19974, 19984, 20018, 20003, 20017, 20032, 19998, 20061, 20088, 20068, 20174, 20109, 20124, 20137, 20153, 20146, 20102, 20208, 20197, 20218, 20209, 20231, 20245, 20268, 20263, 20280, 20297, 20303, 20289, 20297, 20337, 20338, 20361, 20371, 20389, 20414, 13225, 52245, 52251, 52287, 52261, 52278, 52337, 52345, 52335, 52348, 52328, 52373, 45491, 19980, 19989, 20020, 20013, 20087, 20032, 20049, 20040, 20073, 20027, 20099, 20099, 20117, 20202, 20147, 20144, 20167, 20186, 20197, 20130, 20217, 20234, 20244, 20238, 20263, 20285, 20292, 20226, 20316, 20337, 20337, 20336, 20422, 20359, 20400, 20397, 20411, 20417, 20383, 20426, 20453};
        private static long b = -1217759883720896920L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722489;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 3
                int r9 = 115 - r9
                int r7 = r7 + 4
                int r8 = r8 + 4
                byte[] r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.AnonymousClass1.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2b
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
                r8 = r3
                r3 = r6
            L2b:
                int r3 = r3 + r8
                int r8 = r3 + (-2)
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.AnonymousClass1.d(int, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = 103 - r6
                byte[] r0 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.AnonymousClass1.$$d
                int r8 = r8 * 52
                int r8 = 53 - r8
                int r7 = r7 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L13
                r6 = r7
                r4 = r8
                r3 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L2a:
                int r7 = r7 + r4
                int r7 = r7 + (-10)
                r5 = r7
                r7 = r6
                r6 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.AnonymousClass1.e(int, short, short, java.lang.Object[]):void");
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 2187, TextUtils.indexOf("", "", 0) + 40, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(b), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - TextUtils.indexOf("", "", 0, 0)), 3011 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - TextUtils.getCapsMode("", 0, 0), 321985076, false, $$g(b4, b5, (byte) (b5 | 6)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getTouchSlop() >> 8)), AndroidCharacter.getMirror('0') + 3328, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i5 = $11 + 37;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 36505), 3376 - KeyEvent.getDeadChar(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, -968507904, false, $$g(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class});
                    }
                    Object obj = null;
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    obj.hashCode();
                    throw null;
                }
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "") + 3376, (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, -968507904, false, $$g(b10, b11, (byte) (b11 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr);
            int i6 = $10 + 73;
            $11 = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private static void c(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3291, 31 - (ViewConfiguration.getTouchSlop() >> 8), 1199271174, false, $$g(b2, b3, (byte) (b3 | 11)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 651, 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -450685997, false, $$g(b4, b5, (byte) (b5 | 10)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i6 = $10 + 65;
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
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                int i8 = $10 + 63;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            if (z) {
                char[] cArr4 = new char[i];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 651 - KeyEvent.keyCodeFromString(""), 44 - Color.blue(0), -450685997, false, $$g(b6, b7, (byte) (b7 | 10)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Code duplicated, block: B:114:0x0b1a A[Catch: Exception -> 0x0ed2, all -> 0x0f4a, IOException -> 0x0f62, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:117:0x0b70 A[Catch: Exception -> 0x0ed2, all -> 0x0f4a, IOException -> 0x0f62, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:122:0x0be3 A[Catch: all -> 0x0f4a, IOException -> 0x0f62, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:124:0x0cc3 A[Catch: all -> 0x0f4a, IOException -> 0x0f62, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:126:0x0cf3 A[Catch: all -> 0x0f4a, IOException -> 0x0f62, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:128:0x0da6 A[Catch: all -> 0x0f4a, IOException -> 0x0f62, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:130:0x0e14 A[Catch: all -> 0x0f4a, IOException -> 0x0f62, TRY_LEAVE, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:134:0x0e33  */
        /* JADX WARN: Code duplicated, block: B:176:0x0e90 A[Catch: Exception -> 0x0ed2, all -> 0x0f4a, IOException -> 0x0f62, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:177:0x0e91 A[Catch: Exception -> 0x0ed2, all -> 0x0f4a, IOException -> 0x0f62, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:187:0x0eb0 A[Catch: Exception -> 0x0ed2, all -> 0x0f4a, IOException -> 0x0f62, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:188:0x0eb1 A[Catch: Exception -> 0x0ed2, all -> 0x0f4a, IOException -> 0x0f62, TryCatch #22 {all -> 0x0f4a, blocks: (B:111:0x0b09, B:112:0x0b0c, B:114:0x0b1a, B:115:0x0b5a, B:117:0x0b70, B:118:0x0ba9, B:120:0x0bbb, B:122:0x0be3, B:124:0x0cc3, B:126:0x0cf3, B:128:0x0da6, B:130:0x0e14, B:132:0x0e1e, B:198:0x0ed2, B:199:0x0f49, B:157:0x0e61, B:158:0x0e64, B:161:0x0e69, B:163:0x0e71, B:164:0x0e72, B:174:0x0e88, B:176:0x0e90, B:177:0x0e91, B:185:0x0eaa, B:187:0x0eb0, B:188:0x0eb1, B:191:0x0ebf, B:193:0x0ec5, B:194:0x0ec6), top: B:325:0x0b09 }] */
        /* JADX WARN: Code duplicated, block: B:213:0x0f64  */
        /* JADX WARN: Code duplicated, block: B:246:0x13ee A[EDGE_INSN: B:246:0x13ee->B:247:0x13f1 BREAK  A[LOOP:5: B:226:0x1128->B:245:0x13e0], PHI: r3
  0x13ee: PHI (r3v25 java.lang.String[]) = (r3v24 java.lang.String[]), (r3v24 java.lang.String[]), (r3v29 java.lang.String[]) binds: [B:222:0x10b1, B:224:0x1122, B:367:0x13ee] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:24:0x038e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0391  */
        /* JADX WARN: Code duplicated, block: B:29:0x03b4 A[Catch: all -> 0x1c7f, TryCatch #13 {all -> 0x1c7f, blocks: (B:12:0x01d8, B:14:0x01ee, B:16:0x024b, B:27:0x039d, B:29:0x03b4, B:31:0x040e, B:236:0x1299, B:238:0x12b1, B:240:0x1307, B:262:0x1493, B:264:0x14a0, B:265:0x14df, B:267:0x15f0, B:269:0x15fd, B:271:0x1648, B:273:0x17e6, B:275:0x17f3, B:276:0x183d, B:278:0x1961, B:280:0x196e, B:281:0x19bc, B:283:0x1af4, B:285:0x1b01, B:286:0x1b4a), top: B:323:0x01d8 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x040a  */
        /* JADX WARN: Code duplicated, block: B:330:0x05eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:344:0x06aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:357:0x04c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:358:0x04d9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x04c7 A[LOOP:1: B:25:0x038f->B:35:0x04c7, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:363:0x0e1e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:364:0x0f62 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:366:0x0e35 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x04d9 A[EDGE_INSN: B:36:0x04d9->B:37:0x04e0 BREAK  A[LOOP:1: B:25:0x038f->B:35:0x04c7], PHI: r3 r4 r5
  0x04d9: PHI (r3v65 int) = (r3v64 int), (r3v126 int) binds: [B:23:0x038c, B:358:0x04d9] A[DONT_GENERATE, DONT_INLINE]
  0x04d9: PHI (r4v71 int) = (r4v70 int), (r4v145 int) binds: [B:23:0x038c, B:358:0x04d9] A[DONT_GENERATE, DONT_INLINE]
  0x04d9: PHI (r5v64 byte) = (r5v23 byte), (r5v221 byte) binds: [B:23:0x038c, B:358:0x04d9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x0592  */
        /* JADX WARN: Code duplicated, block: B:41:0x05ce  */
        /* JADX WARN: Code duplicated, block: B:57:0x0701  */
        /* JADX WARN: Code duplicated, block: B:67:0x0745  */
        /* JADX WARN: Multi-variable type inference failed */
        public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
            Object obj;
            byte b2;
            int i4;
            int i5;
            int i6;
            String[] strArr;
            int i7;
            int length;
            int i8;
            Object obj2;
            int i9;
            int i10;
            int i11;
            String str;
            int length2;
            int i12;
            int i13;
            byte b3;
            int i14;
            byte b4;
            String[] strArrSplit;
            int length3;
            int i15;
            String str2;
            Object[] objArr;
            String[] strArr2;
            int i16;
            Object obj3;
            byte b5;
            Class cls;
            Process processExec;
            Throwable th;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Throwable th2;
            Throwable cause;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            Throwable th3;
            Throwable cause2;
            Throwable th4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            String[] strArrSplit2;
            int length4;
            int i17;
            String str3;
            Object[] objArr2;
            String str4;
            Object[] objArr3;
            Object[] objArr4;
            String[] strArrSplit3;
            int i18;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            int i19;
            int i20;
            int i21 = i;
            int i22 = 1;
            int i23 = 0;
            if (context != null) {
                try {
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                    int i24 = -(-Color.green(0));
                    Object[] objArr5 = new Object[1];
                    a(packedPositionGroup, (i24 ^ 23) + ((i24 & 23) << 1), (char) (44675 - (~(-(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))))), objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    int fadingEdgeLength = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int threadPriority = Process.getThreadPriority(0);
                    Object[] objArr6 = new Object[1];
                    a(fadingEdgeLength, 13 - (~(-(((threadPriority & 20) + (threadPriority | 20)) >> 6))), (char) (65116 - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr6);
                    String str5 = (String) cls2.getMethod((String) objArr6[0], null).invoke(context, null);
                    int i25 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i26 = ~touchSlop;
                    int i27 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i28 = (touchSlop * (-432)) + 9982 + ((~((i26 ^ i27) | (i27 & i26) | 23)) * 433);
                    int i29 = ~((-24) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i30 = ((i26 ^ i29) | (i29 & i26)) * (-433);
                    int i31 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | (~touchSlop));
                    int i32 = ~((touchSlop & 23) | (touchSlop ^ 23));
                    Object[] objArr7 = new Object[1];
                    a(i25, (((i28 | i30) << 1) - (i30 ^ i28)) + (((i32 & i31) | (i31 ^ i32)) * 433), (char) (44676 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr7);
                    Class<?> cls3 = Class.forName((String) objArr7[0]);
                    int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                    int i33 = maximumFlingVelocity * (-380);
                    int i34 = ~maximumFlingVelocity;
                    int i35 = (((i33 & 6876) + (i33 | 6876)) - (~((((i21 ^ 18) | (i21 & 18)) | i34) * (-381)))) - 1;
                    int i36 = ~((i34 ^ (-19)) | (i34 & (-19)));
                    int i37 = ~i21;
                    int i38 = ~(i37 | 18);
                    int i39 = (i36 & i38) | (i36 ^ i38);
                    int i40 = ~((maximumFlingVelocity ^ 18) | (maximumFlingVelocity & 18));
                    int i41 = ((i39 & i40) | (i39 ^ i40)) * 381;
                    int i42 = ~maximumFlingVelocity;
                    int i43 = (i35 ^ i41) + ((i41 & i35) << 1) + ((~((i42 & 18) | (i42 ^ 18))) * 381);
                    int i44 = -View.combineMeasuredStates(0, 0);
                    int i45 = ((i44 | 204) << 1) - (i44 ^ 204);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                    int i46 = (iNormalizeMetaState & 16) + (iNormalizeMetaState | 16);
                    Object[] objArr8 = new Object[1];
                    c(new char[]{7, 65506, 7, '\b', 2, '\r', 65530, 65532, 2, 5, '\t', '\t', 65498, '\r', 65534, 0, '\b', 65535}, true, i43, i45, i46, objArr8);
                    Object objInvoke = cls3.getMethod((String) objArr8[0], null).invoke(context, null);
                    byte b6 = (byte) 30;
                    byte[] bArr = $$a;
                    Object[] objArr9 = new Object[1];
                    d(b6, bArr[7], (byte) (-bArr[35]), objArr9);
                    Class<?> cls4 = Class.forName((String) objArr9[0]);
                    byte b7 = bArr[58];
                    int i47 = $$b;
                    Object[] objArr10 = new Object[1];
                    d(b7, (byte) (i47 & 240), bArr[57], objArr10);
                    int iIndexOf = ((String) cls4.getField((String) objArr10[0]).get(objInvoke)).indexOf(str5);
                    if (iIndexOf > 0) {
                        Object[] objArr11 = new Object[1];
                        d(b6, bArr[7], (byte) (-bArr[35]), objArr11);
                        Class<?> cls5 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        d(bArr[58], (byte) (i47 & 240), bArr[57], objArr12);
                        String str6 = (String) cls5.getField((String) objArr12[0]).get(objInvoke);
                        int length5 = str6.length();
                        int i48 = (length5 ^ (-16)) + ((length5 & (-16)) << 1);
                        if (i48 >= 0) {
                            int i49 = 0;
                            while (true) {
                                if (i49 > i48) {
                                    i8 = iIndexOf;
                                    obj2 = objInvoke;
                                    i4 = i37;
                                    i9 = 0;
                                    break;
                                }
                                String strSubstring = str6.substring(i49, (i49 ^ 16) + ((i49 & 16) << i22));
                                try {
                                    Object[] objArr13 = new Object[2];
                                    objArr13[i22] = 931995;
                                    objArr13[i23] = strSubstring;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char cRgb = (char) (Color.rgb(i23, i23, i23) + 16777216);
                                        int i50 = (ExpandableListView.getPackedPositionForChild(i23, i23) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i23, i23) == 0L ? 0 : -1)) + 3394;
                                        int i51 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9;
                                        byte[] bArr2 = $$d;
                                        Object[] objArr14 = new Object[1];
                                        e(bArr2[51], bArr2[7], bArr2[3], objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, i50, i51, 1203525406, false, (String) objArr14[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                    long j = 587041738;
                                    long j2 = 868;
                                    i4 = i37;
                                    long j3 = -1;
                                    long j4 = j ^ j3;
                                    i8 = iIndexOf;
                                    obj2 = objInvoke;
                                    long j5 = i21;
                                    long j6 = j5 ^ j3;
                                    long j7 = jLongValue ^ j3;
                                    long j8 = j4 | j7;
                                    long j9 = (j2 * j) + (j2 * jLongValue) + (((long) (-867)) * (((j4 | j6) ^ j3) | ((j7 | j6) ^ j3))) + (((long) (-1734)) * ((j8 ^ j3) | ((j4 | j5) ^ j3) | ((j7 | j5) ^ j3))) + (((long) 867) * (((j5 | (j7 | j)) ^ j3) | ((j8 | j6) ^ j3) | (((j4 | jLongValue) | j5) ^ j3))) + ((long) (-589111615));
                                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                    int i52 = ~((-16810017) | iMaxMemory);
                                    int i53 = ((int) (j9 >> 32)) & (2108631522 + (((-1876617982) | i52) * (-476)) + (i52 * 952) + ((~((~iMaxMemory) | (-16810017))) * 476));
                                    int i54 = (int) Runtime.getRuntime().totalMemory();
                                    int i55 = ((int) j9) & (2088992125 + (((-555059526) | i54) * 376) + (((~((~i54) | 1689522573)) | (-1706400206)) * (-376)) + (((~(i54 | (-1689522574))) | 1168218312) * 376));
                                    if (((i55 & i53) | (i53 ^ i55)) == -725904754) {
                                        i9 = 1;
                                        break;
                                    }
                                    i49 = (i49 ^ 1) + ((i49 & 1) << 1);
                                    objInvoke = obj2;
                                    i37 = i4;
                                    iIndexOf = i8;
                                    str6 = str6;
                                    i48 = i48;
                                    i22 = 1;
                                    i23 = 0;
                                } catch (Throwable th5) {
                                    Throwable cause3 = th5.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th5;
                                }
                            }
                            i10 = (~(i21 & 20)) & (i21 | 20);
                            int i56 = -i9;
                            int i57 = ((i9 & i56) | (i9 ^ i56)) >> 31;
                            int i58 = (~i57) & i21;
                            int i59 = i57 & i10;
                            i11 = (i59 & i58) | (i58 ^ i59);
                            byte[] bArr3 = $$a;
                            Object[] objArr15 = new Object[1];
                            d(b6, bArr3[7], (byte) (-bArr3[35]), objArr15);
                            Class<?> cls6 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            d(bArr3[58], (byte) ($$b & 240), bArr3[57], objArr16);
                            str = (String) cls6.getField((String) objArr16[0]).get(obj2);
                            length2 = str.length() - 6;
                            if (length2 >= 0) {
                                i12 = i11;
                                i13 = i10;
                                b3 = b6;
                                i14 = 0;
                                break;
                            }
                            i18 = 0;
                            while (true) {
                                if (i18 <= length2) {
                                    i12 = i11;
                                    i13 = i10;
                                    b3 = b6;
                                    i14 = 0;
                                    break;
                                }
                                Object[] objArr17 = {str.substring(i18, (i18 ^ 6) + ((i18 & 6) << 1)), 931995};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                    int i60 = 3394 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int i61 = 8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    byte[] bArr4 = $$d;
                                    Object[] objArr18 = new Object[1];
                                    e(bArr4[51], bArr4[7], bArr4[3], objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup2, i60, i61, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                                long j10 = 791385191;
                                i13 = i10;
                                b3 = b6;
                                long j11 = i21;
                                i12 = i11;
                                long j12 = -1;
                                long j13 = j11 ^ j12;
                                long j14 = 521;
                                long j15 = j10 ^ j12;
                                long j16 = (((long) 522) * j10) + (((long) (-520)) * jLongValue2) + (((long) (-1042)) * (j10 | ((j13 | jLongValue2) ^ j12))) + ((jLongValue2 | j11) * j14) + (j14 * (((jLongValue2 | (j13 | j10)) ^ j12) | ((j15 | (jLongValue2 ^ j12)) ^ j12) | ((j15 | j11) ^ j12))) + ((long) (-793455068));
                                int iNextInt = new Random().nextInt();
                                i19 = ((int) (j16 >> 32)) & (((1855336700 + (((~((-1779720897) | iNextInt)) | (~((-342494486) | iNextInt))) * 69)) + (((~(iNextInt | (-342596928))) | ((~((-1779823339) | iNextInt)) | 102442)) * (-69))) - 411041792);
                                int i62 = (int) Runtime.getRuntime().totalMemory();
                                i20 = ((int) j16) & ((-2069201627) + (((~(1692437210 | i62)) | (-255210801)) * (-964)) + (((~((~i62) | 1692437210)) | (-1878441979)) * (-964)));
                                if (((i19 & i20) | (i19 ^ i20)) == -2096167706) {
                                    i14 = 1;
                                    break;
                                }
                                i18++;
                                i21 = i;
                                str = str;
                                length2 = length2;
                                b6 = b3;
                                i10 = i13;
                                i11 = i12;
                            }
                            i21 = i;
                            int i63 = -i14;
                            int i64 = ((i14 & i63) | (i14 ^ i63)) >> 31;
                            int i65 = i21 ^ i12;
                            int i66 = -i65;
                            int i67 = ((i65 & i66) | (i65 ^ i66)) >> 31;
                            int i68 = ((i64 & ((i21 & (-21)) | (i4 & 20))) | ((~i64) & i21)) & (~i67);
                            int i69 = i12 & i67;
                            i5 = (i68 & i69) | (i68 ^ i69);
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            b4 = b3;
                            d(b4, bArr5[7], (byte) (-bArr5[35]), objArr19);
                            Class<?> cls7 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            d(bArr5[58], (byte) ($$b & 240), bArr5[57], objArr20);
                            String str7 = (String) cls7.getField((String) objArr20[0]).get(obj2);
                            int i70 = i8 ^ (-1);
                            int i71 = -i70;
                            String strSubstring2 = str7.substring(0, i8 & (((i70 & i71) | (i70 ^ i71)) >> 31));
                            int i72 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i73 = (i72 ^ 1) + ((i72 & 1) << 1);
                            int i74 = -(Process.myPid() >> 22);
                            int i75 = (i74 ^ 148) + ((i74 & 148) << 1);
                            int i76 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            int i77 = (i76 & 1) + (i76 | 1);
                            Object[] objArr21 = new Object[1];
                            c(new char[]{0}, true, i73, i75, i77, objArr21);
                            strArrSplit = strSubstring2.split((String) objArr21[0]);
                            length3 = strArrSplit.length;
                            i15 = 0;
                            while (i15 < length3) {
                                str2 = strArrSplit[i15];
                                int i78 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int i79 = -KeyEvent.getDeadChar(0, 0);
                                objArr = new Object[1];
                                a((i78 & 38) + (i78 | 38), ((i79 | 3) << 1) - (i79 ^ 3), (char) (60543 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))), objArr);
                                if (str2.split((String) objArr[0]).length > 1) {
                                    cls = (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - MotionEvent.axisFromString("")), 2267 - View.combineMeasuredStates(0, 0), Color.alpha(0) + 33);
                                    synchronized (cls) {
                                        try {
                                            try {
                                                int i80 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                int i81 = (i80 ^ 40) + ((i80 & 40) << 1);
                                                int i82 = -KeyEvent.keyCodeFromString("");
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i83 = i82 * (-445);
                                                int i84 = (i83 ^ (-7120)) + ((i83 & (-7120)) << 1);
                                                int i85 = ~i82;
                                                int i86 = ~((i85 ^ (-17)) | (i85 & (-17)));
                                                strArr2 = strArrSplit;
                                                int i87 = ~((-17) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                                int i88 = (i84 - (~(-(-(((i86 ^ i87) | (i87 & i86)) * 446))))) - 1;
                                                int i89 = ~((i85 ^ 16) | (i85 & 16));
                                                int i90 = ((-17) & i82) | ((-17) ^ i82);
                                                int i91 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i90) | (i90 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                                int i92 = i88 + (((i89 & i91) | (i89 ^ i91)) * 446);
                                                int i93 = -(-((~((~i82) | (-17))) * 446));
                                                int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
                                                try {
                                                    Object[] objArr22 = new Object[1];
                                                    a(i81, i94, (char) (Color.argb(0, 0, 0, 0) + 31533), objArr22);
                                                    String str8 = (String) objArr22[0];
                                                    try {
                                                        Runtime runtime = Runtime.getRuntime();
                                                        int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 56;
                                                        int i95 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                        int i96 = ((i95 | 2) << 1) - (i95 ^ 2);
                                                        int i97 = -ImageFormat.getBitsPerPixel(0);
                                                        Object[] objArr23 = new Object[1];
                                                        a(packedPositionGroup3, i96, (char) ((i97 ^ 21085) + ((i97 & 21085) << 1)), objArr23);
                                                        processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                        try {
                                                            Object[] objArr24 = {processExec.getInputStream()};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                try {
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 2142, KeyEvent.getDeadChar(0, 0) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable cause4 = th.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr24);
                                                            try {
                                                                Object[] objArr25 = {processExec.getErrorStream()};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                    try {
                                                                        try {
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.getMode(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2143, 45 - View.MeasureSpec.getMode(0), -1020714777, false, null, new Class[]{InputStream.class});
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            th2 = th;
                                                                            cause = th2.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                }
                                                                try {
                                                                    Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                                    try {
                                                                        DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                        try {
                                                                            byte[] bArr6 = $$a;
                                                                            obj3 = obj2;
                                                                            try {
                                                                                i16 = i15;
                                                                                b5 = b4;
                                                                                try {
                                                                                    Object[] objArr26 = new Object[1];
                                                                                    d(bArr6[54], (byte) (bArr6[34] - 1), bArr6[58], objArr26);
                                                                                    Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                                                    byte b8 = bArr6[13];
                                                                                    i5 = i5;
                                                                                    try {
                                                                                        Object[] objArr27 = new Object[1];
                                                                                        d(b8, (byte) (b8 | 52), bArr6[28], objArr27);
                                                                                        cls8.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                                        try {
                                                                                            Object[] objArr28 = new Object[1];
                                                                                            d(bArr6[54], (byte) (bArr6[34] - 1), bArr6[58], objArr28);
                                                                                            Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                                            byte b9 = bArr6[13];
                                                                                            Object[] objArr29 = new Object[1];
                                                                                            d(b9, (byte) (b9 | 52), bArr6[28], objArr29);
                                                                                            cls9.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                                            try {
                                                                                                StringBuilder sb = new StringBuilder();
                                                                                                sb.append(str8);
                                                                                                int i98 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                                                int i99 = (i98 ^ 57) + ((i98 & 57) << 1);
                                                                                                int i100 = -Drawable.resolveOpacity(0, 0);
                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                int i101 = i100 * 253;
                                                                                                int i102 = ((i101 | 253) << 1) - (i101 ^ 253);
                                                                                                int i103 = ~((~i100) | (-2));
                                                                                                int i104 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                                                int i105 = ~(((-2) ^ i104) | ((-2) & i104));
                                                                                                int i106 = (i103 ^ i105) | (i103 & i105);
                                                                                                int i107 = (i100 ^ 1) | (i100 & 1);
                                                                                                int i108 = ~((i107 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i107 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                                                                int i109 = -(-(((i106 ^ i108) | (i106 & i108)) * (-252)));
                                                                                                int i110 = ((i102 | i109) << 1) - (i109 ^ i102);
                                                                                                int i111 = i100 | 1;
                                                                                                int i112 = i111 * (-252);
                                                                                                int i113 = ((i110 | i112) << 1) - (i110 ^ i112);
                                                                                                int i114 = ((-2) & i104) | ((-2) ^ i104);
                                                                                                int i115 = ~((i100 & i114) | (i114 ^ i100));
                                                                                                int i116 = ~((i111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                                                                Object[] objArr30 = new Object[1];
                                                                                                a(i99, i113 + (((i115 & i116) | (i115 ^ i116)) * 252), (char) TextUtils.getOffsetAfter("", 0), objArr30);
                                                                                                sb.append((String) objArr30[0]);
                                                                                                String string = sb.toString();
                                                                                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0');
                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                int i117 = iIndexOf2 * 471;
                                                                                                int i118 = (((i117 | 2826) << 1) - (i117 ^ 2826)) + (((iIndexOf2 ^ 6) | (iIndexOf2 & 6)) * (-470));
                                                                                                int i119 = ~iIndexOf2;
                                                                                                int i120 = ~((i119 & (-7)) | (i119 ^ (-7)));
                                                                                                int i121 = ~(((-7) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-7) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                                                int i122 = (i120 ^ i121) | (i120 & i121);
                                                                                                int i123 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                                                int i124 = ~(i123 | iIndexOf2 | 6);
                                                                                                int i125 = i118 + (((i122 ^ i124) | (i124 & i122)) * (-470));
                                                                                                int i126 = (-7) | iIndexOf2;
                                                                                                int i127 = (iIndexOf2 & i123) | (i123 ^ iIndexOf2);
                                                                                                int i128 = ((~((i126 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i126 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | (~((i127 & 6) | (i127 ^ 6)))) * 470;
                                                                                                int i129 = (i125 & i128) + (i128 | i125);
                                                                                                int i130 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                                                                int i131 = (i130 ^ 168) + ((i130 & 168) << 1);
                                                                                                int i132 = -Gravity.getAbsoluteGravity(0, 0);
                                                                                                int i133 = (i132 & 4) + (i132 | 4);
                                                                                                Object[] objArr31 = new Object[1];
                                                                                                c(new char[]{16, 2, 65513, 65524, 17}, false, i129, i131, i133, objArr31);
                                                                                                dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                                dataOutputStream.flush();
                                                                                                int i134 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                                                Object[] objArr32 = new Object[1];
                                                                                                a((i134 ^ 59) + ((i134 & 59) << 1), 5 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) TextUtils.getOffsetAfter("", 0), objArr32);
                                                                                                String str9 = (String) objArr32[0];
                                                                                                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                                                                                                int i135 = iNormalizeMetaState2 * (-103);
                                                                                                int i136 = ((i135 | (-515)) << 1) - (i135 ^ (-515));
                                                                                                int i137 = ~((~iNormalizeMetaState2) | (-6));
                                                                                                int i138 = ~(((-6) & i21) | ((-6) ^ i21));
                                                                                                int i139 = ((i137 & i138) | (i137 ^ i138)) * 104;
                                                                                                int i140 = ((i136 | i139) << 1) - (i139 ^ i136);
                                                                                                int i141 = -(-((~((i4 ^ iNormalizeMetaState2) | (i4 & iNormalizeMetaState2) | 5)) * (-104)));
                                                                                                int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
                                                                                                int i143 = (iNormalizeMetaState2 | i21) * 104;
                                                                                                int i144 = (i142 & i143) + (i143 | i142);
                                                                                                int i145 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                                                                                int i146 = (i145 ^ 168) + ((i145 & 168) << 1);
                                                                                                int i147 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                                                int i148 = (i147 ^ 4) + ((i147 & 4) << 1);
                                                                                                Object[] objArr33 = new Object[1];
                                                                                                c(new char[]{16, 2, 65513, 65524, 17}, false, i144, i146, i148, objArr33);
                                                                                                dataOutputStream.write(str9.getBytes((String) objArr33[0]));
                                                                                                dataOutputStream.flush();
                                                                                                try {
                                                                                                    long jNanoTime = System.nanoTime();
                                                                                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                    while (true) {
                                                                                                        try {
                                                                                                            processExec.exitValue();
                                                                                                            str2 = str2;
                                                                                                            cls = cls;
                                                                                                            break;
                                                                                                        } catch (IllegalThreadStateException unused) {
                                                                                                            if (nanos > 0) {
                                                                                                                try {
                                                                                                                    Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                    byte[] bArr7 = $$a;
                                                                                                                    Object[] objArr35 = new Object[1];
                                                                                                                    d(bArr7[54], (byte) (bArr7[34] - 1), bArr7[58], objArr35);
                                                                                                                    Class<?> cls10 = Class.forName((String) objArr35[0]);
                                                                                                                    byte b10 = bArr7[13];
                                                                                                                    Object[] objArr36 = new Object[1];
                                                                                                                    d(b10, (byte) (b10 | 56), bArr7[28], objArr36);
                                                                                                                    cls10.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                                } catch (Throwable th9) {
                                                                                                                    Throwable cause5 = th9.getCause();
                                                                                                                    if (cause5 != null) {
                                                                                                                        throw cause5;
                                                                                                                    }
                                                                                                                    throw th9;
                                                                                                                }
                                                                                                            }
                                                                                                            nanos = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                                            if (nanos <= 0) {
                                                                                                                break;
                                                                                                            }
                                                                                                            cls = cls;
                                                                                                            str2 = str2;
                                                                                                        } catch (InterruptedException e2) {
                                                                                                            throw e2;
                                                                                                        } catch (Throwable th10) {
                                                                                                            th4 = th10;
                                                                                                            try {
                                                                                                                processExec.destroy();
                                                                                                                throw th4;
                                                                                                            } catch (Exception unused2) {
                                                                                                                throw th4;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        dataOutputStream.close();
                                                                                                                                        while (true) {
                                                                                                                                            if (i17 < length4) {
                                                                                                                                                str3 = strArrSplit2[i17];
                                                                                                                                                int i149 = 17 - (~(-ExpandableListView.getPackedPositionChild(0L)));
                                                                                                                                                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                                                                int i150 = windowTouchSlop * 193;
                                                                                                                                                int i151 = ((i150 | 37828) << 1) - (i150 ^ 37828);
                                                                                                                                                int i152 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                                                                                                                int i153 = ~windowTouchSlop;
                                                                                                                                                int i154 = ~((i153 & 196) | (i153 ^ 196));
                                                                                                                                                int i155 = i151 + (((i154 & i152) | (i152 ^ i154)) * (-192));
                                                                                                                                                int i156 = ~windowTouchSlop;
                                                                                                                                                int i157 = ~((i156 & (-197)) | (i156 ^ (-197)));
                                                                                                                                                int i158 = ((-197) ^ i152) | (i152 & (-197));
                                                                                                                                                int i159 = ~i158;
                                                                                                                                                int i160 = i155 + (((i157 ^ i159) | (i157 & i159)) * (-384));
                                                                                                                                                int i161 = (-197) | i156;
                                                                                                                                                int i162 = ~((i161 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i161 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                                                                                                                int i163 = ~((i158 & windowTouchSlop) | (i158 ^ windowTouchSlop));
                                                                                                                                                int i164 = (i162 & i163) | (i162 ^ i163);
                                                                                                                                                int i165 = (windowTouchSlop & 196) | (windowTouchSlop ^ 196);
                                                                                                                                                int i166 = ~((i165 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i165 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                                                                                                                int i167 = i160 + (((i166 & i164) | (i164 ^ i166)) * DerHeader.TAG_CLASS_PRIVATE);
                                                                                                                                                int i168 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                                                                int i169 = (i168 * (-112)) - 1568;
                                                                                                                                                int i170 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                                                                                int i171 = ~((i170 & (-15)) | ((-15) ^ i170));
                                                                                                                                                int i172 = -(-(((i171 & i168) | (i168 ^ i171)) * 226));
                                                                                                                                                int i173 = (i169 ^ i172) + ((i169 & i172) << 1);
                                                                                                                                                int i174 = ~i168;
                                                                                                                                                int i175 = ~((i174 & 14) | (i174 ^ 14));
                                                                                                                                                int i176 = ~i168;
                                                                                                                                                int i177 = ~((i176 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i176 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                                                                                                                int i178 = (i175 ^ i177) | (i175 & i177);
                                                                                                                                                int i179 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                                                                                int i180 = ((-15) ^ i179) | (i179 & (-15));
                                                                                                                                                int i181 = (i173 - (~(-(-(((~((i168 & i180) | (i180 ^ i168))) | i178) * (-113)))))) - 1;
                                                                                                                                                int i182 = -(-((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & (-15)) | ((-15) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * 113));
                                                                                                                                                objArr2 = new Object[1];
                                                                                                                                                c(new char[]{2, '\b', 6, 65499, 4, 16, 14, 65487, '\b', 16, 16, '\b', '\r', 6, 65487, 17, 2, 4, '\f'}, false, i149, i167, ((i181 | i182) << 1) - (i182 ^ i181), objArr2);
                                                                                                                                                if (str3.startsWith((String) objArr2[0])) {
                                                                                                                                                    str4 = str2;
                                                                                                                                                } else {
                                                                                                                                                    int i183 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                                                                                                                                    objArr3 = new Object[1];
                                                                                                                                                    a(((i183 | 64) << 1) - (i183 ^ 64), 19 - (~(-(-TextUtils.getOffsetAfter("", 0)))), (char) View.MeasureSpec.getMode(0), objArr3);
                                                                                                                                                    if (str3.startsWith((String) objArr3[0])) {
                                                                                                                                                        str4 = str2;
                                                                                                                                                    } else {
                                                                                                                                                        int i184 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                                                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                                                                        int i185 = i184 * (-183);
                                                                                                                                                        int i186 = ((i185 | 1295) << 1) - (i185 ^ 1295);
                                                                                                                                                        int i187 = ~i184;
                                                                                                                                                        int i188 = i186 + (((i187 & 7) | (i187 ^ 7)) * (-368));
                                                                                                                                                        int i189 = (i184 ^ (-8)) | (i184 & (-8));
                                                                                                                                                        int i190 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                                                                                                        int i191 = ((i189 & i190) | (i189 ^ i190)) * 184;
                                                                                                                                                        int i192 = (i188 ^ i191) + ((i191 & i188) << 1);
                                                                                                                                                        int i193 = ~((~i184) | (-8));
                                                                                                                                                        int i194 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | i184);
                                                                                                                                                        int i195 = (i194 & i193) | (i193 ^ i194);
                                                                                                                                                        int i196 = ~(i184 | 7);
                                                                                                                                                        int i197 = i192 + (((i196 & i195) | (i195 ^ i196)) * 184);
                                                                                                                                                        int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                                                                                                                                        int i198 = (jumpTapTimeout ^ 197) + ((jumpTapTimeout & 197) << 1);
                                                                                                                                                        int gidForName = Process.getGidForName("");
                                                                                                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                                                                        int i199 = gidForName * (-244);
                                                                                                                                                        int i200 = (i199 & 738) + (i199 | 738);
                                                                                                                                                        int i201 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                                                                                                                        int i202 = -(-(((~(((-4) ^ i201) | (i201 & (-4)))) | (~(((-4) ^ gidForName) | ((-4) & gidForName)))) * (-245)));
                                                                                                                                                        int i203 = (i200 & i202) + (i202 | i200);
                                                                                                                                                        int i204 = (~(((-4) & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | ((-4) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8))) * (-245);
                                                                                                                                                        int i205 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-4)) | ((-4) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                                                                                                                                        objArr4 = new Object[1];
                                                                                                                                                        c(new char[]{1, 16, 65498, 5, 7, 1, 11, 3}, true, i197, i198, (((i203 & i204) + (i204 | i203)) - (~(((gidForName & i205) | (gidForName ^ i205)) * 245))) - 1, objArr4);
                                                                                                                                                        if (str3.startsWith((String) objArr4[0])) {
                                                                                                                                                            int i206 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                                                                                            int iResolveSize = View.resolveSize(0, 0);
                                                                                                                                                            int i207 = iResolveSize * 758;
                                                                                                                                                            int i208 = (i207 & (-120204)) + (i207 | (-120204)) + ((iResolveSize | i4) * (-757));
                                                                                                                                                            int i209 = (~(((-160) ^ iResolveSize) | ((-160) & iResolveSize) | i21)) * 1514;
                                                                                                                                                            int i210 = (i208 & i209) + (i209 | i208);
                                                                                                                                                            int i211 = ~iResolveSize;
                                                                                                                                                            int i212 = ~((i211 & (-160)) | (i211 ^ (-160)));
                                                                                                                                                            int i213 = ~((-160) | i4);
                                                                                                                                                            int i214 = (i213 & i212) | (i212 ^ i213);
                                                                                                                                                            int i215 = iResolveSize | 159;
                                                                                                                                                            int i216 = ~((i215 & i21) | (i215 ^ i21));
                                                                                                                                                            int i217 = i210 + (((i214 & i216) | (i214 ^ i216)) * 757);
                                                                                                                                                            int i218 = -ExpandableListView.getPackedPositionGroup(0L);
                                                                                                                                                            Object[] objArr37 = new Object[1];
                                                                                                                                                            c(new char[]{0}, false, i206, i217, ((i218 | 1) << 1) - (i218 ^ 1), objArr37);
                                                                                                                                                            strArrSplit3 = str3.split((String) objArr37[0]);
                                                                                                                                                            if (strArrSplit3.length > 1) {
                                                                                                                                                                str4 = str2;
                                                                                                                                                                if (strArrSplit3[1].equalsIgnoreCase(str4)) {
                                                                                                                                                                    int i219 = i21 ^ i5;
                                                                                                                                                                    int i220 = -i219;
                                                                                                                                                                    int i221 = ((i219 & i220) | (i219 ^ i220)) >> 31;
                                                                                                                                                                    int i222 = i13 & (~i221);
                                                                                                                                                                    int i223 = i5 & i221;
                                                                                                                                                                    i5 = (i223 & i222) | (i222 ^ i223);
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                str4 = str2;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            str4 = str2;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i17 = (i17 | 1) + (i17 & 1);
                                                                                                                                                str2 = str4;
                                                                                                                                            }
                                                                                                                                            i15 = i16 + 1;
                                                                                                                                            length3 = length3;
                                                                                                                                            strArrSplit = strArr2;
                                                                                                                                            obj2 = obj3;
                                                                                                                                            b4 = b5;
                                                                                                                                        }
                                                                                                                                    } catch (InterruptedException e3) {
                                                                                                                                        e = e3;
                                                                                                                                        throw e;
                                                                                                                                    }
                                                                                                                                } catch (IOException unused3) {
                                                                                                                                }
                                                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                                                    char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                                                                                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2142;
                                                                                                                                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 45;
                                                                                                                                    byte[] bArr8 = $$d;
                                                                                                                                    byte b11 = bArr8[15];
                                                                                                                                    byte b12 = bArr8[7];
                                                                                                                                    Object[] objArr38 = new Object[1];
                                                                                                                                    e(b11, b12, (byte) (b12 + 1), objArr38);
                                                                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength2, iResolveOpacity, longPressTimeout, 399405187, false, (String) objArr38[0], null);
                                                                                                                                }
                                                                                                                                sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                                                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                                                                                                                                    int iResolveSize2 = View.resolveSize(0, 0) + 2142;
                                                                                                                                    int i224 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 44;
                                                                                                                                    byte[] bArr9 = $$d;
                                                                                                                                    byte b13 = bArr9[15];
                                                                                                                                    byte b14 = bArr9[7];
                                                                                                                                    Object[] objArr39 = new Object[1];
                                                                                                                                    e(b13, b14, (byte) (b14 + 1), objArr39);
                                                                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, iResolveSize2, i224, 399405187, false, (String) objArr39[0], null);
                                                                                                                                }
                                                                                                                                sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                                                String string2 = sb2.toString();
                                                                                                                                Object[] objArr40 = new Object[1];
                                                                                                                                a(58 - KeyEvent.getDeadChar(0, 0), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), objArr40);
                                                                                                                                strArrSplit2 = string2.split((String) objArr40[0]);
                                                                                                                                length4 = strArrSplit2.length;
                                                                                                                                i17 = 0;
                                                                                                                            } catch (Exception unused4) {
                                                                                                                                int iResolveSize3 = View.resolveSize(0, 0);
                                                                                                                                int i225 = iResolveSize3 * (-109);
                                                                                                                                int i226 = ((i225 | 2997) << 1) - (i225 ^ 2997);
                                                                                                                                int i227 = ~iResolveSize3;
                                                                                                                                int i228 = ~((i21 ^ 27) | (i21 & 27));
                                                                                                                                int i229 = ((i227 & i228) | (i227 ^ i228)) * (-220);
                                                                                                                                int i230 = (i226 & i229) + (i229 | i226);
                                                                                                                                int i231 = ~((iResolveSize3 ^ 27) | (iResolveSize3 & 27));
                                                                                                                                int i232 = -(-(((i231 & i228) | (i231 ^ i228)) * 220));
                                                                                                                                int i233 = ((i230 | i232) << 1) - (i232 ^ i230);
                                                                                                                                int i234 = ~iResolveSize3;
                                                                                                                                int i235 = ~((i234 & 27) | (i234 ^ 27));
                                                                                                                                int i236 = ~(iResolveSize3 | (-28));
                                                                                                                                int i237 = ((i235 & i236) | (i235 ^ i236)) * 110;
                                                                                                                                int i238 = (i233 ^ i237) + ((i237 & i233) << 1);
                                                                                                                                int iResolveOpacity2 = 192 - Drawable.resolveOpacity(0, 0);
                                                                                                                                int i239 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                                                                                Object[] objArr41 = new Object[1];
                                                                                                                                c(new char[]{24, 65491, 65515, 6, 14, 17, '\n', '\t', 65477, 25, 20, 65477, '\b', 23, '\n', 6, 25, '\n', 65477, 6, 65477, 21, 23, 20, '\b', '\n', 24}, false, i238, iResolveOpacity2, (i239 & 2) + (i239 | 2), objArr41);
                                                                                                                                throw new IOException((String) objArr41[0]);
                                                                                                                            }
                                                                                                                            processExec.destroy();
                                                                                                                        } catch (Exception unused5) {
                                                                                                                        }
                                                                                                                    } catch (Throwable th11) {
                                                                                                                        th = th11;
                                                                                                                        Throwable th12 = th;
                                                                                                                        throw th12;
                                                                                                                    }
                                                                                                                } catch (IOException unused6) {
                                                                                                                }
                                                                                                                Object[] objArr42 = new Object[1];
                                                                                                                d(bArr[54], (byte) (bArr[34] - 1), bArr[58], objArr42);
                                                                                                                Class<?> cls11 = Class.forName((String) objArr42[0]);
                                                                                                                Object[] objArr43 = new Object[1];
                                                                                                                d(bArr[28], (byte) (-bArr[21]), bArr[58], objArr43);
                                                                                                                cls11.getMethod((String) objArr43[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                                            } catch (Throwable th13) {
                                                                                                                Throwable cause6 = th13.getCause();
                                                                                                                if (cause6 != null) {
                                                                                                                    throw cause6;
                                                                                                                }
                                                                                                                throw th13;
                                                                                                            }
                                                                                                            byte[] bArr10 = $$a;
                                                                                                            Object[] objArr44 = new Object[1];
                                                                                                            d(bArr10[54], (byte) (bArr10[34] - 1), bArr10[58], objArr44);
                                                                                                            Class<?> cls12 = Class.forName((String) objArr44[0]);
                                                                                                            Object[] objArr45 = new Object[1];
                                                                                                            d(bArr10[28], (byte) (-bArr10[21]), bArr10[58], objArr45);
                                                                                                            cls12.getMethod((String) objArr45[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                                        } catch (Throwable th14) {
                                                                                                            Throwable cause7 = th14.getCause();
                                                                                                            if (cause7 != null) {
                                                                                                                throw cause7;
                                                                                                            }
                                                                                                            throw th14;
                                                                                                        }
                                                                                                    } catch (Throwable th15) {
                                                                                                        th = th15;
                                                                                                        th4 = th;
                                                                                                        processExec.destroy();
                                                                                                        throw th4;
                                                                                                    }
                                                                                                } catch (InterruptedException e4) {
                                                                                                    e = e4;
                                                                                                } catch (Throwable th16) {
                                                                                                    th = th16;
                                                                                                }
                                                                                            } catch (IOException unused7) {
                                                                                                cls = cls;
                                                                                            } catch (Exception unused8) {
                                                                                                int iResolveSize4 = View.resolveSize(0, 0);
                                                                                                int i2210 = iResolveSize4 * (-109);
                                                                                                int i2211 = ((i2210 | 2997) << 1) - (i2210 ^ 2997);
                                                                                                int i2212 = ~iResolveSize4;
                                                                                                int i2213 = ~((i21 ^ 27) | (i21 & 27));
                                                                                                int i2214 = ((i2212 & i2213) | (i2212 ^ i2213)) * (-220);
                                                                                                int i2310 = (i2211 & i2214) + (i2214 | i2211);
                                                                                                int i2311 = ~((iResolveSize4 ^ 27) | (iResolveSize4 & 27));
                                                                                                int i2312 = -(-(((i2311 & i2213) | (i2311 ^ i2213)) * 220));
                                                                                                int i2313 = ((i2310 | i2312) << 1) - (i2312 ^ i2310);
                                                                                                int i2314 = ~iResolveSize4;
                                                                                                int i2315 = ~((i2314 & 27) | (i2314 ^ 27));
                                                                                                int i2316 = ~(iResolveSize4 | (-28));
                                                                                                int i2317 = ((i2315 & i2316) | (i2315 ^ i2316)) * 110;
                                                                                                int i2318 = (i2313 ^ i2317) + ((i2317 & i2313) << 1);
                                                                                                int iResolveOpacity3 = 192 - Drawable.resolveOpacity(0, 0);
                                                                                                int i2319 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                                                Object[] objArr46 = new Object[1];
                                                                                                c(new char[]{24, 65491, 65515, 6, 14, 17, '\n', '\t', 65477, 25, 20, 65477, '\b', 23, '\n', 6, 25, '\n', 65477, 6, 65477, 21, 23, 20, '\b', '\n', 24}, false, i2318, iResolveOpacity3, (i2319 & 2) + (i2319 | 2), objArr46);
                                                                                                throw new IOException((String) objArr46[0]);
                                                                                            }
                                                                                        } catch (Throwable th17) {
                                                                                            Throwable cause8 = th17.getCause();
                                                                                            if (cause8 != null) {
                                                                                                throw cause8;
                                                                                            }
                                                                                            throw th17;
                                                                                        }
                                                                                    } catch (Throwable th18) {
                                                                                        th = th18;
                                                                                        th3 = th;
                                                                                        cause2 = th3.getCause();
                                                                                        if (cause2 != null) {
                                                                                            throw cause2;
                                                                                        }
                                                                                        throw th3;
                                                                                    }
                                                                                } catch (Throwable th19) {
                                                                                    th = th19;
                                                                                }
                                                                            } catch (Throwable th20) {
                                                                                th = th20;
                                                                                th3 = th;
                                                                                cause2 = th3.getCause();
                                                                                if (cause2 != null) {
                                                                                    throw cause2;
                                                                                }
                                                                                throw th3;
                                                                            }
                                                                        } catch (Throwable th21) {
                                                                            th = th21;
                                                                        }
                                                                    } catch (IOException unused9) {
                                                                        i5 = i5;
                                                                        i16 = i15;
                                                                        obj3 = obj2;
                                                                        b5 = b4;
                                                                        cls = cls;
                                                                        i5 = i5;
                                                                        i15 = i16 + 1;
                                                                        length3 = length3;
                                                                        strArrSplit = strArr2;
                                                                        obj2 = obj3;
                                                                        b4 = b5;
                                                                    } catch (Exception unused10) {
                                                                        int iResolveSize5 = View.resolveSize(0, 0);
                                                                        int i2215 = iResolveSize5 * (-109);
                                                                        int i2216 = ((i2215 | 2997) << 1) - (i2215 ^ 2997);
                                                                        int i2217 = ~iResolveSize5;
                                                                        int i2218 = ~((i21 ^ 27) | (i21 & 27));
                                                                        int i2219 = ((i2217 & i2218) | (i2217 ^ i2218)) * (-220);
                                                                        int i23110 = (i2216 & i2219) + (i2219 | i2216);
                                                                        int i23111 = ~((iResolveSize5 ^ 27) | (iResolveSize5 & 27));
                                                                        int i23112 = -(-(((i23111 & i2218) | (i23111 ^ i2218)) * 220));
                                                                        int i23113 = ((i23110 | i23112) << 1) - (i23112 ^ i23110);
                                                                        int i23114 = ~iResolveSize5;
                                                                        int i23115 = ~((i23114 & 27) | (i23114 ^ 27));
                                                                        int i23116 = ~(iResolveSize5 | (-28));
                                                                        int i23117 = ((i23115 & i23116) | (i23115 ^ i23116)) * 110;
                                                                        int i23118 = (i23113 ^ i23117) + ((i23117 & i23113) << 1);
                                                                        int iResolveOpacity4 = 192 - Drawable.resolveOpacity(0, 0);
                                                                        int i23119 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                        Object[] objArr47 = new Object[1];
                                                                        c(new char[]{24, 65491, 65515, 6, 14, 17, '\n', '\t', 65477, 25, 20, 65477, '\b', 23, '\n', 6, 25, '\n', 65477, 6, 65477, 21, 23, 20, '\b', '\n', 24}, false, i23118, iResolveOpacity4, (i23119 & 2) + (i23119 | 2), objArr47);
                                                                        throw new IOException((String) objArr47[0]);
                                                                    }
                                                                } catch (Throwable th22) {
                                                                    th = th22;
                                                                    th2 = th;
                                                                    cause = th2.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th23) {
                                                                th = th23;
                                                            }
                                                        } catch (Throwable th24) {
                                                            th = th24;
                                                        }
                                                    } catch (Exception unused11) {
                                                    }
                                                } catch (IOException unused12) {
                                                    length3 = length3;
                                                    i16 = i15;
                                                    obj3 = obj2;
                                                    b5 = b4;
                                                    cls = cls;
                                                    i5 = i5;
                                                    i15 = i16 + 1;
                                                    length3 = length3;
                                                    strArrSplit = strArr2;
                                                    obj2 = obj3;
                                                    b4 = b5;
                                                }
                                            } catch (IOException unused13) {
                                                strArr2 = strArrSplit;
                                            }
                                        } catch (Throwable th25) {
                                            th = th25;
                                            cls = cls;
                                        }
                                    }
                                } else {
                                    i5 = i5;
                                    strArr2 = strArrSplit;
                                    length3 = length3;
                                    i16 = i15;
                                    obj3 = obj2;
                                    b5 = b4;
                                }
                                i5 = i5;
                                i15 = i16 + 1;
                                length3 = length3;
                                strArrSplit = strArr2;
                                obj2 = obj3;
                                b4 = b5;
                            }
                            obj = obj2;
                            b2 = b4;
                        } else {
                            i8 = iIndexOf;
                            obj2 = objInvoke;
                            i4 = i37;
                            i9 = 0;
                            i10 = (~(i21 & 20)) & (i21 | 20);
                            int i510 = -i9;
                            int i511 = ((i9 & i510) | (i9 ^ i510)) >> 31;
                            int i512 = (~i511) & i21;
                            int i513 = i511 & i10;
                            i11 = (i513 & i512) | (i512 ^ i513);
                            byte[] bArr11 = $$a;
                            Object[] objArr110 = new Object[1];
                            d(b6, bArr11[7], (byte) (-bArr11[35]), objArr110);
                            Class<?> cls13 = Class.forName((String) objArr110[0]);
                            Object[] objArr111 = new Object[1];
                            d(bArr11[58], (byte) ($$b & 240), bArr11[57], objArr111);
                            str = (String) cls13.getField((String) objArr111[0]).get(obj2);
                            length2 = str.length() - 6;
                            if (length2 >= 0) {
                                i12 = i11;
                                i13 = i10;
                                b3 = b6;
                                i14 = 0;
                                break;
                            }
                            i18 = 0;
                            while (true) {
                                if (i18 <= length2) {
                                    i12 = i11;
                                    i13 = i10;
                                    b3 = b6;
                                    i14 = 0;
                                    break;
                                }
                                Object[] objArr112 = {str.substring(i18, (i18 ^ 6) + ((i18 & 6) << 1)), 931995};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char packedPositionGroup4 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                    int i610 = 3394 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int i611 = 8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    byte[] bArr12 = $$d;
                                    Object[] objArr113 = new Object[1];
                                    e(bArr12[51], bArr12[7], bArr12[3], objArr113);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup4, i610, i611, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                                long j17 = 791385191;
                                i13 = i10;
                                b3 = b6;
                                long j18 = i21;
                                i12 = i11;
                                long j19 = -1;
                                long j110 = j18 ^ j19;
                                long j111 = 521;
                                long j112 = j17 ^ j19;
                                long j113 = (((long) 522) * j17) + (((long) (-520)) * jLongValue3) + (((long) (-1042)) * (j17 | ((j110 | jLongValue3) ^ j19))) + ((jLongValue3 | j18) * j111) + (j111 * (((jLongValue3 | (j110 | j17)) ^ j19) | ((j112 | (jLongValue3 ^ j19)) ^ j19) | ((j112 | j18) ^ j19))) + ((long) (-793455068));
                                int iNextInt2 = new Random().nextInt();
                                i19 = ((int) (j113 >> 32)) & (((1855336700 + (((~((-1779720897) | iNextInt2)) | (~((-342494486) | iNextInt2))) * 69)) + (((~(iNextInt2 | (-342596928))) | ((~((-1779823339) | iNextInt2)) | 102442)) * (-69))) - 411041792);
                                int i612 = (int) Runtime.getRuntime().totalMemory();
                                i20 = ((int) j113) & ((-2069201627) + (((~(1692437210 | i612)) | (-255210801)) * (-964)) + (((~((~i612) | 1692437210)) | (-1878441979)) * (-964)));
                                if (((i19 & i20) | (i19 ^ i20)) == -2096167706) {
                                    i14 = 1;
                                    break;
                                }
                                i18++;
                                i21 = i;
                                str = str;
                                length2 = length2;
                                b6 = b3;
                                i10 = i13;
                                i11 = i12;
                            }
                            i21 = i;
                            int i613 = -i14;
                            int i614 = ((i14 & i613) | (i14 ^ i613)) >> 31;
                            int i615 = i21 ^ i12;
                            int i616 = -i615;
                            int i617 = ((i615 & i616) | (i615 ^ i616)) >> 31;
                            int i618 = ((i614 & ((i21 & (-21)) | (i4 & 20))) | ((~i614) & i21)) & (~i617);
                            int i619 = i12 & i617;
                            i5 = (i618 & i619) | (i618 ^ i619);
                            byte[] bArr13 = $$a;
                            Object[] objArr114 = new Object[1];
                            b4 = b3;
                            d(b4, bArr13[7], (byte) (-bArr13[35]), objArr114);
                            Class<?> cls14 = Class.forName((String) objArr114[0]);
                            Object[] objArr210 = new Object[1];
                            d(bArr13[58], (byte) ($$b & 240), bArr13[57], objArr210);
                            String str10 = (String) cls14.getField((String) objArr210[0]).get(obj2);
                            int i710 = i8 ^ (-1);
                            int i711 = -i710;
                            String strSubstring3 = str10.substring(0, i8 & (((i710 & i711) | (i710 ^ i711)) >> 31));
                            int i712 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i713 = (i712 ^ 1) + ((i712 & 1) << 1);
                            int i714 = -(Process.myPid() >> 22);
                            int i715 = (i714 ^ 148) + ((i714 & 148) << 1);
                            int i716 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            int i717 = (i716 & 1) + (i716 | 1);
                            Object[] objArr211 = new Object[1];
                            c(new char[]{0}, true, i713, i715, i717, objArr211);
                            strArrSplit = strSubstring3.split((String) objArr211[0]);
                            length3 = strArrSplit.length;
                            i15 = 0;
                            while (i15 < length3) {
                                str2 = strArrSplit[i15];
                                int i718 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int i719 = -KeyEvent.getDeadChar(0, 0);
                                objArr = new Object[1];
                                a((i718 & 38) + (i718 | 38), ((i719 | 3) << 1) - (i719 ^ 3), (char) (60543 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))), objArr);
                                if (str2.split((String) objArr[0]).length > 1) {
                                    cls = (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - MotionEvent.axisFromString("")), 2267 - View.combineMeasuredStates(0, 0), Color.alpha(0) + 33);
                                    synchronized (cls) {
                                        int i810 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                        int i811 = (i810 ^ 40) + ((i810 & 40) << 1);
                                        int i812 = -KeyEvent.keyCodeFromString("");
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i813 = i812 * (-445);
                                        int i814 = (i813 ^ (-7120)) + ((i813 & (-7120)) << 1);
                                        int i815 = ~i812;
                                        int i816 = ~((i815 ^ (-17)) | (i815 & (-17)));
                                        strArr2 = strArrSplit;
                                        int i817 = ~((-17) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                        int i818 = (i814 - (~(-(-(((i816 ^ i817) | (i817 & i816)) * 446))))) - 1;
                                        int i819 = ~((i815 ^ 16) | (i815 & 16));
                                        int i910 = ((-17) & i812) | ((-17) ^ i812);
                                        int i911 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & i910) | (i910 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                        int i912 = i818 + (((i819 & i911) | (i819 ^ i911)) * 446);
                                        int i913 = -(-((~((~i812) | (-17))) * 446));
                                        int i914 = (i912 ^ i913) + ((i913 & i912) << 1);
                                        Object[] objArr212 = new Object[1];
                                        a(i811, i914, (char) (Color.argb(0, 0, 0, 0) + 31533), objArr212);
                                        String str11 = (String) objArr212[0];
                                        Runtime runtime2 = Runtime.getRuntime();
                                        int packedPositionGroup5 = ExpandableListView.getPackedPositionGroup(0L) + 56;
                                        int i915 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i916 = ((i915 | 2) << 1) - (i915 ^ 2);
                                        int i917 = -ImageFormat.getBitsPerPixel(0);
                                        Object[] objArr213 = new Object[1];
                                        a(packedPositionGroup5, i916, (char) ((i917 ^ 21085) + ((i917 & 21085) << 1)), objArr213);
                                        processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                        Object[] objArr214 = {processExec.getInputStream()};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 2142, KeyEvent.getDeadChar(0, 0) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                        }
                                        Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                        Object[] objArr215 = {processExec.getErrorStream()};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.getMode(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2143, 45 - View.MeasureSpec.getMode(0), -1020714777, false, null, new Class[]{InputStream.class});
                                        }
                                        Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                        byte[] bArr14 = $$a;
                                        obj3 = obj2;
                                        i16 = i15;
                                        b5 = b4;
                                        Object[] objArr216 = new Object[1];
                                        d(bArr14[54], (byte) (bArr14[34] - 1), bArr14[58], objArr216);
                                        Class<?> cls15 = Class.forName((String) objArr216[0]);
                                        byte b15 = bArr14[13];
                                        i5 = i5;
                                        Object[] objArr217 = new Object[1];
                                        d(b15, (byte) (b15 | 52), bArr14[28], objArr217);
                                        cls15.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                        Object[] objArr218 = new Object[1];
                                        d(bArr14[54], (byte) (bArr14[34] - 1), bArr14[58], objArr218);
                                        Class<?> cls16 = Class.forName((String) objArr218[0]);
                                        byte b16 = bArr14[13];
                                        Object[] objArr219 = new Object[1];
                                        d(b16, (byte) (b16 | 52), bArr14[28], objArr219);
                                        cls16.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(str11);
                                        int i918 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i919 = (i918 ^ 57) + ((i918 & 57) << 1);
                                        int i1010 = -Drawable.resolveOpacity(0, 0);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i1011 = i1010 * 253;
                                        int i1012 = ((i1011 | 253) << 1) - (i1011 ^ 253);
                                        int i1013 = ~((~i1010) | (-2));
                                        int i1014 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                        int i1015 = ~(((-2) ^ i1014) | ((-2) & i1014));
                                        int i1016 = (i1013 ^ i1015) | (i1013 & i1015);
                                        int i1017 = (i1010 ^ 1) | (i1010 & 1);
                                        int i1018 = ~((i1017 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i1017 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                        int i1019 = -(-(((i1016 ^ i1018) | (i1016 & i1018)) * (-252)));
                                        int i1110 = ((i1012 | i1019) << 1) - (i1019 ^ i1012);
                                        int i1111 = i1010 | 1;
                                        int i1112 = i1111 * (-252);
                                        int i1113 = ((i1110 | i1112) << 1) - (i1110 ^ i1112);
                                        int i1114 = ((-2) & i1014) | ((-2) ^ i1014);
                                        int i1115 = ~((i1010 & i1114) | (i1114 ^ i1010));
                                        int i1116 = ~((i1111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i1111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                        Object[] objArr310 = new Object[1];
                                        a(i919, i1113 + (((i1115 & i1116) | (i1115 ^ i1116)) * 252), (char) TextUtils.getOffsetAfter("", 0), objArr310);
                                        sb3.append((String) objArr310[0]);
                                        String string3 = sb3.toString();
                                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0');
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i1117 = iIndexOf3 * 471;
                                        int i1118 = (((i1117 | 2826) << 1) - (i1117 ^ 2826)) + (((iIndexOf3 ^ 6) | (iIndexOf3 & 6)) * (-470));
                                        int i1119 = ~iIndexOf3;
                                        int i1210 = ~((i1119 & (-7)) | (i1119 ^ (-7)));
                                        int i1211 = ~(((-7) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | ((-7) & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                        int i1212 = (i1210 ^ i1211) | (i1210 & i1211);
                                        int i1213 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                        int i1214 = ~(i1213 | iIndexOf3 | 6);
                                        int i1215 = i1118 + (((i1212 ^ i1214) | (i1214 & i1212)) * (-470));
                                        int i1216 = (-7) | iIndexOf3;
                                        int i1217 = (iIndexOf3 & i1213) | (i1213 ^ iIndexOf3);
                                        int i1218 = ((~((i1216 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i1216 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) | (~((i1217 & 6) | (i1217 ^ 6)))) * 470;
                                        int i1219 = (i1215 & i1218) + (i1218 | i1215);
                                        int i1310 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                        int i1311 = (i1310 ^ 168) + ((i1310 & 168) << 1);
                                        int i1312 = -Gravity.getAbsoluteGravity(0, 0);
                                        int i1313 = (i1312 & 4) + (i1312 | 4);
                                        Object[] objArr311 = new Object[1];
                                        c(new char[]{16, 2, 65513, 65524, 17}, false, i1219, i1311, i1313, objArr311);
                                        dataOutputStream2.write(string3.getBytes((String) objArr311[0]));
                                        dataOutputStream2.flush();
                                        int i1314 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                        Object[] objArr312 = new Object[1];
                                        a((i1314 ^ 59) + ((i1314 & 59) << 1), 5 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) TextUtils.getOffsetAfter("", 0), objArr312);
                                        String str12 = (String) objArr312[0];
                                        int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0);
                                        int i1315 = iNormalizeMetaState3 * (-103);
                                        int i1316 = ((i1315 | (-515)) << 1) - (i1315 ^ (-515));
                                        int i1317 = ~((~iNormalizeMetaState3) | (-6));
                                        int i1318 = ~(((-6) & i21) | ((-6) ^ i21));
                                        int i1319 = ((i1317 & i1318) | (i1317 ^ i1318)) * 104;
                                        int i1410 = ((i1316 | i1319) << 1) - (i1319 ^ i1316);
                                        int i1411 = -(-((~((i4 ^ iNormalizeMetaState3) | (i4 & iNormalizeMetaState3) | 5)) * (-104)));
                                        int i1412 = (i1410 ^ i1411) + ((i1411 & i1410) << 1);
                                        int i1413 = (iNormalizeMetaState3 | i21) * 104;
                                        int i1414 = (i1412 & i1413) + (i1413 | i1412);
                                        int i1415 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                        int i1416 = (i1415 ^ 168) + ((i1415 & 168) << 1);
                                        int i1417 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i1418 = (i1417 ^ 4) + ((i1417 & 4) << 1);
                                        Object[] objArr313 = new Object[1];
                                        c(new char[]{16, 2, 65513, 65524, 17}, false, i1414, i1416, i1418, objArr313);
                                        dataOutputStream2.write(str12.getBytes((String) objArr313[0]));
                                        dataOutputStream2.flush();
                                        long jNanoTime2 = System.nanoTime();
                                        long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                        while (true) {
                                            processExec.exitValue();
                                            str2 = str2;
                                            cls = cls;
                                            break;
                                        }
                                        dataOutputStream2.close();
                                        byte[] bArr15 = $$a;
                                        Object[] objArr48 = new Object[1];
                                        d(bArr15[54], (byte) (bArr15[34] - 1), bArr15[58], objArr48);
                                        Class<?> cls17 = Class.forName((String) objArr48[0]);
                                        Object[] objArr49 = new Object[1];
                                        d(bArr15[28], (byte) (-bArr15[21]), bArr15[58], objArr49);
                                        cls17.getMethod((String) objArr49[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                        Object[] objArr410 = new Object[1];
                                        d(bArr15[54], (byte) (bArr15[34] - 1), bArr15[58], objArr410);
                                        Class<?> cls18 = Class.forName((String) objArr410[0]);
                                        Object[] objArr411 = new Object[1];
                                        d(bArr15[28], (byte) (-bArr15[21]), bArr15[58], objArr411);
                                        cls18.getMethod((String) objArr411[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                        processExec.destroy();
                                        StringBuilder sb4 = new StringBuilder();
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int iResolveOpacity5 = Drawable.resolveOpacity(0, 0) + 2142;
                                            int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 45;
                                            byte[] bArr16 = $$d;
                                            byte b17 = bArr16[15];
                                            byte b18 = bArr16[7];
                                            Object[] objArr314 = new Object[1];
                                            e(b17, b18, (byte) (b18 + 1), objArr314);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength3, iResolveOpacity5, longPressTimeout2, 399405187, false, (String) objArr314[0], null);
                                        }
                                        sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                                            int iResolveSize6 = View.resolveSize(0, 0) + 2142;
                                            int i2220 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 44;
                                            byte[] bArr17 = $$d;
                                            byte b19 = bArr17[15];
                                            byte b110 = bArr17[7];
                                            Object[] objArr315 = new Object[1];
                                            e(b19, b110, (byte) (b110 + 1), objArr315);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb2, iResolveSize6, i2220, 399405187, false, (String) objArr315[0], null);
                                        }
                                        sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                        String string4 = sb4.toString();
                                        Object[] objArr412 = new Object[1];
                                        a(58 - KeyEvent.getDeadChar(0, 0), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), objArr412);
                                        strArrSplit2 = string4.split((String) objArr412[0]);
                                        length4 = strArrSplit2.length;
                                        i17 = 0;
                                        while (true) {
                                            if (i17 < length4) {
                                                str3 = strArrSplit2[i17];
                                                int i1419 = 17 - (~(-ExpandableListView.getPackedPositionChild(0L)));
                                                int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i1510 = windowTouchSlop2 * 193;
                                                int i1511 = ((i1510 | 37828) << 1) - (i1510 ^ 37828);
                                                int i1512 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                                int i1513 = ~windowTouchSlop2;
                                                int i1514 = ~((i1513 & 196) | (i1513 ^ 196));
                                                int i1515 = i1511 + (((i1514 & i1512) | (i1512 ^ i1514)) * (-192));
                                                int i1516 = ~windowTouchSlop2;
                                                int i1517 = ~((i1516 & (-197)) | (i1516 ^ (-197)));
                                                int i1518 = ((-197) ^ i1512) | (i1512 & (-197));
                                                int i1519 = ~i1518;
                                                int i1610 = i1515 + (((i1517 ^ i1519) | (i1517 & i1519)) * (-384));
                                                int i1611 = (-197) | i1516;
                                                int i1612 = ~((i1611 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i1611 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                                int i1613 = ~((i1518 & windowTouchSlop2) | (i1518 ^ windowTouchSlop2));
                                                int i1614 = (i1612 & i1613) | (i1612 ^ i1613);
                                                int i1615 = (windowTouchSlop2 & 196) | (windowTouchSlop2 ^ 196);
                                                int i1616 = ~((i1615 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i1615 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                                int i1617 = i1610 + (((i1616 & i1614) | (i1614 ^ i1616)) * DerHeader.TAG_CLASS_PRIVATE);
                                                int i1618 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i1619 = (i1618 * (-112)) - 1568;
                                                int i1710 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                                int i1711 = ~((i1710 & (-15)) | ((-15) ^ i1710));
                                                int i1712 = -(-(((i1711 & i1618) | (i1618 ^ i1711)) * 226));
                                                int i1713 = (i1619 ^ i1712) + ((i1619 & i1712) << 1);
                                                int i1714 = ~i1618;
                                                int i1715 = ~((i1714 & 14) | (i1714 ^ 14));
                                                int i1716 = ~i1618;
                                                int i1717 = ~((i1716 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (i1716 & iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
                                                int i1718 = (i1715 ^ i1717) | (i1715 & i1717);
                                                int i1719 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                                int i1810 = ((-15) ^ i1719) | (i1719 & (-15));
                                                int i1811 = (i1713 - (~(-(-(((~((i1618 & i1810) | (i1810 ^ i1618))) | i1718) * (-113)))))) - 1;
                                                int i1812 = -(-((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & (-15)) | ((-15) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13))) * 113));
                                                objArr2 = new Object[1];
                                                c(new char[]{2, '\b', 6, 65499, 4, 16, 14, 65487, '\b', 16, 16, '\b', '\r', 6, 65487, 17, 2, 4, '\f'}, false, i1419, i1617, ((i1811 | i1812) << 1) - (i1812 ^ i1811), objArr2);
                                                if (str3.startsWith((String) objArr2[0])) {
                                                    int i1813 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                                    objArr3 = new Object[1];
                                                    a(((i1813 | 64) << 1) - (i1813 ^ 64), 19 - (~(-(-TextUtils.getOffsetAfter("", 0)))), (char) View.MeasureSpec.getMode(0), objArr3);
                                                    if (str3.startsWith((String) objArr3[0])) {
                                                        int i1814 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i1815 = i1814 * (-183);
                                                        int i1816 = ((i1815 | 1295) << 1) - (i1815 ^ 1295);
                                                        int i1817 = ~i1814;
                                                        int i1818 = i1816 + (((i1817 & 7) | (i1817 ^ 7)) * (-368));
                                                        int i1819 = (i1814 ^ (-8)) | (i1814 & (-8));
                                                        int i1910 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                                        int i1911 = ((i1819 & i1910) | (i1819 ^ i1910)) * 184;
                                                        int i1912 = (i1818 ^ i1911) + ((i1911 & i1818) << 1);
                                                        int i1913 = ~((~i1814) | (-8));
                                                        int i1914 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | i1814);
                                                        int i1915 = (i1914 & i1913) | (i1913 ^ i1914);
                                                        int i1916 = ~(i1814 | 7);
                                                        int i1917 = i1912 + (((i1916 & i1915) | (i1915 ^ i1916)) * 184);
                                                        int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                                        int i1918 = (jumpTapTimeout2 ^ 197) + ((jumpTapTimeout2 & 197) << 1);
                                                        int gidForName2 = Process.getGidForName("");
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i1919 = gidForName2 * (-244);
                                                        int i2010 = (i1919 & 738) + (i1919 | 738);
                                                        int i2011 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                                        int i2012 = -(-(((~(((-4) ^ i2011) | (i2011 & (-4)))) | (~(((-4) ^ gidForName2) | ((-4) & gidForName2)))) * (-245)));
                                                        int i2013 = (i2010 & i2012) + (i2012 | i2010);
                                                        int i2014 = (~(((-4) & iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | ((-4) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15))) * (-245);
                                                        int i2015 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & (-4)) | ((-4) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
                                                        objArr4 = new Object[1];
                                                        c(new char[]{1, 16, 65498, 5, 7, 1, 11, 3}, true, i1917, i1918, (((i2013 & i2014) + (i2014 | i2013)) - (~(((gidForName2 & i2015) | (gidForName2 ^ i2015)) * 245))) - 1, objArr4);
                                                        if (str3.startsWith((String) objArr4[0])) {
                                                            int i2016 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            int iResolveSize7 = View.resolveSize(0, 0);
                                                            int i2017 = iResolveSize7 * 758;
                                                            int i2018 = (i2017 & (-120204)) + (i2017 | (-120204)) + ((iResolveSize7 | i4) * (-757));
                                                            int i2019 = (~(((-160) ^ iResolveSize7) | ((-160) & iResolveSize7) | i21)) * 1514;
                                                            int i2110 = (i2018 & i2019) + (i2019 | i2018);
                                                            int i2111 = ~iResolveSize7;
                                                            int i2112 = ~((i2111 & (-160)) | (i2111 ^ (-160)));
                                                            int i2113 = ~((-160) | i4);
                                                            int i2114 = (i2113 & i2112) | (i2112 ^ i2113);
                                                            int i2115 = iResolveSize7 | 159;
                                                            int i2116 = ~((i2115 & i21) | (i2115 ^ i21));
                                                            int i2117 = i2110 + (((i2114 & i2116) | (i2114 ^ i2116)) * 757);
                                                            int i2118 = -ExpandableListView.getPackedPositionGroup(0L);
                                                            Object[] objArr316 = new Object[1];
                                                            c(new char[]{0}, false, i2016, i2117, ((i2118 | 1) << 1) - (i2118 ^ 1), objArr316);
                                                            strArrSplit3 = str3.split((String) objArr316[0]);
                                                            if (strArrSplit3.length > 1) {
                                                                str4 = str2;
                                                                if (strArrSplit3[1].equalsIgnoreCase(str4)) {
                                                                    int i2119 = i21 ^ i5;
                                                                    int i2221 = -i2119;
                                                                    int i2222 = ((i2119 & i2221) | (i2119 ^ i2221)) >> 31;
                                                                    int i2223 = i13 & (~i2222);
                                                                    int i2224 = i5 & i2222;
                                                                    i5 = (i2224 & i2223) | (i2223 ^ i2224);
                                                                }
                                                            } else {
                                                                str4 = str2;
                                                            }
                                                        } else {
                                                            str4 = str2;
                                                        }
                                                    } else {
                                                        str4 = str2;
                                                    }
                                                } else {
                                                    str4 = str2;
                                                }
                                                i17 = (i17 | 1) + (i17 & 1);
                                                str2 = str4;
                                            }
                                            i15 = i16 + 1;
                                            length3 = length3;
                                            strArrSplit = strArr2;
                                            obj2 = obj3;
                                            b4 = b5;
                                        }
                                    }
                                } else {
                                    i5 = i5;
                                    strArr2 = strArrSplit;
                                    length3 = length3;
                                    i16 = i15;
                                    obj3 = obj2;
                                    b5 = b4;
                                }
                                i5 = i5;
                                i15 = i16 + 1;
                                length3 = length3;
                                strArrSplit = strArr2;
                                obj2 = obj3;
                                b4 = b5;
                            }
                            obj = obj2;
                            b2 = b4;
                        }
                    } else {
                        obj = objInvoke;
                        b2 = b6;
                        i4 = i37;
                        i5 = i21;
                    }
                    byte[] bArr18 = $$a;
                    Object[] objArr50 = new Object[1];
                    d(b2, bArr18[7], (byte) (-bArr18[35]), objArr50);
                    Class<?> cls19 = Class.forName((String) objArr50[0]);
                    Object[] objArr51 = new Object[1];
                    d(bArr18[58], (byte) ($$b & 240), bArr18[57], objArr51);
                    String[] strArr3 = {cls19.getField((String) objArr51[0]).get(obj)};
                    Object obj4 = new Object[]{new int[1], strArr3}[0];
                    ((int[]) obj4)[0] = i5;
                    i6 = ((int[]) obj4)[0];
                    String[] strArr4 = strArr3;
                    if ((i2 & 1) == 0) {
                        int i240 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                        int i241 = i240 * (-380);
                        int i242 = (i241 ^ 32088) + ((i241 & 32088) << 1);
                        int i243 = i21 | 84;
                        int i244 = ~i240;
                        int i245 = i242 + (((i243 & i244) | (i243 ^ i244)) * (-381));
                        int i246 = ~i240;
                        int i247 = (~((i246 ^ (-85)) | (i246 & (-85)))) | (~((i4 ^ 84) | (i4 & 84)));
                        int i248 = ~(i240 | 84);
                        int i249 = i245 + (((i248 & i247) | (i247 ^ i248)) * 381);
                        int i250 = -(-((~((i246 ^ 84) | (i246 & 84))) * 381));
                        Object[] objArr52 = new Object[1];
                        a((i249 ^ i250) + ((i250 & i249) << 1), 12 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), (char) ((-2) - ((-TextUtils.lastIndexOf("", '0')) ^ (-1))), objArr52);
                        try {
                            Object[] objArr53 = {(String) objArr52[0]};
                            Object[] objArr54 = new Object[1];
                            a(ViewConfiguration.getPressedStateDuration() >> 16, 22 - (~(-(-Gravity.getAbsoluteGravity(0, 0)))), (char) (44675 - (~Color.argb(0, 0, 0, 0))), objArr54);
                            Class<?> cls20 = Class.forName((String) objArr54[0]);
                            int i251 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                            int i252 = (i251 ^ 97) + ((i251 & 97) << 1);
                            int i253 = -Color.blue(0);
                            Object[] objArr55 = new Object[1];
                            a(i252, ((i253 | 16) << 1) - (i253 ^ 16), (char) View.MeasureSpec.getMode(0), objArr55);
                            Object objInvoke2 = cls20.getMethod((String) objArr55[0], String.class).invoke(context, objArr53);
                            if (objInvoke2 == null) {
                                strArr4 = strArr4;
                                i7 = i21;
                                break;
                            }
                            int i254 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            Object[] objArr56 = new Object[1];
                            a((i254 & 112) + (i254 | 112), 37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr56);
                            Class<?> cls21 = Class.forName((String) objArr56[0]);
                            int i255 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int i256 = ((i255 | 15) << 1) - (i255 ^ 15);
                            int i257 = -((byte) KeyEvent.getModifierMetaStateMask());
                            Object[] objArr57 = new Object[1];
                            c(new char[]{15, 4, 17, 0, 65500, 65535, '\b', 4, '\t', 14, 2, 0, 15, 65500, 65534}, false, i256, ((i257 & 201) << 1) + (i257 ^ 201), 9 - (~(ViewConfiguration.getTouchSlop() >> 8)), objArr57);
                            List list = (List) cls21.getMethod((String) objArr57[0], null).invoke(objInvoke2, null);
                            if (list == null) {
                                strArr4 = strArr4;
                                i7 = i21;
                                break;
                            }
                            Iterator it = list.iterator();
                            loop5: while (true) {
                                if (!it.hasNext()) {
                                    strArr4 = strArr4;
                                    i7 = i21;
                                    break;
                                }
                                Object next = it.next();
                                int i258 = 29 - (~(-(-TextUtils.indexOf((CharSequence) "", '0', 0, 0))));
                                int i259 = 200 - (~(ViewConfiguration.getJumpTapTimeout() >> 16));
                                int i260 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                int i261 = (i260 ^ 15) + ((i260 & 15) << 1);
                                Object[] objArr58 = new Object[1];
                                c(new char[]{16, 65482, 65503, 11, '\t', '\f', 11, '\n', 1, '\n', 16, 65514, 65533, '\t', 1, 65533, '\n', 0, 14, 11, 5, 0, 65482, 65535, 11, '\n', 16, 1, '\n'}, false, i258, i259, i261, objArr58);
                                Class<?> cls22 = Class.forName((String) objArr58[0]);
                                Object[] objArr59 = new Object[1];
                                a(23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - (~(-View.getDefaultSize(0, 0))), (char) (65119 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr59);
                                String str13 = (String) cls22.getMethod((String) objArr59[0], null).invoke(next, null);
                                int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                int i262 = scrollBarFadeDuration * (-919);
                                int i263 = (i262 ^ (-103847)) + ((i262 & (-103847)) << 1);
                                int i264 = ~scrollBarFadeDuration;
                                int i265 = ~((i264 ^ (-114)) | (i264 & (-114)) | i21);
                                int i266 = ~i21;
                                int i267 = ((-114) ^ i266) | ((-114) & i266);
                                int i268 = ~((i267 ^ scrollBarFadeDuration) | (i267 & scrollBarFadeDuration));
                                int i269 = i263 + (((i265 ^ i268) | (i265 & i268)) * 920);
                                int i270 = ~scrollBarFadeDuration;
                                int i271 = (i270 ^ (-114)) | (i270 & (-114));
                                int i272 = ((~((i264 ^ i266) | (i264 & i266))) | (~i271)) * 920;
                                int i273 = (i269 ^ i272) + ((i272 & i269) << 1);
                                int i274 = ~((i271 ^ i4) | (i271 & i4));
                                int i275 = (i270 & 113) | (i270 ^ 113);
                                int i276 = ~((i275 & i21) | (i275 ^ i21));
                                int i277 = (scrollBarFadeDuration & (-114)) | ((-114) ^ scrollBarFadeDuration);
                                int i278 = ((~((i277 & i21) | (i277 ^ i21))) | (i274 & i276) | (i274 ^ i276)) * 920;
                                Object[] objArr60 = new Object[1];
                                a(((i273 | i278) << 1) - (i278 ^ i273), 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr60);
                                Class<?> cls23 = Class.forName((String) objArr60[0]);
                                int i279 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                Object[] objArr61 = new Object[1];
                                c(new char[]{65534, 11, 65498, '\t', '\t', 2, '\f', 65513, 11, '\b', 65535, 2, 5, 65534, 65512, 16, 7}, false, (i279 & 17) + (i279 | 17), MotionEvent.axisFromString("") + MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 4 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr61);
                                if (((Boolean) cls23.getMethod((String) objArr61[0], String.class).invoke(objInvoke2, str13)).booleanValue() && (length = str13.length() - 20) >= 0) {
                                    int i280 = 0;
                                    while (i280 <= length) {
                                        Object[] objArr62 = {str13.substring(i280, (i280 & 20) + (i280 | 20)), 931995};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                            int i281 = 3393 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            int fadingEdgeLength4 = 9 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                            byte[] bArr19 = $$d;
                                            Object[] objArr63 = new Object[1];
                                            e(bArr19[51], bArr19[7], bArr19[3], objArr63);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout3, i281, fadingEdgeLength4, 1203525406, false, (String) objArr63[0], new Class[]{String.class, Integer.TYPE});
                                        }
                                        long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr62)).longValue();
                                        long j20 = 1708372992;
                                        long j21 = 569;
                                        Object obj5 = objInvoke2;
                                        Iterator it2 = it;
                                        long j22 = -1;
                                        long j23 = j20 ^ j22;
                                        long j24 = jLongValue4 ^ j22;
                                        long j25 = j23 | j24;
                                        String str14 = str13;
                                        int i282 = length;
                                        long j26 = (int) Runtime.getRuntime().totalMemory();
                                        long j27 = j26 ^ j22;
                                        long j28 = (j21 * j20) + (j21 * jLongValue4) + (((long) (-1136)) * ((j25 ^ j22) | ((j23 | j27) ^ j22) | ((j24 | j27) ^ j22)));
                                        long j29 = j27 | j20;
                                        long j30 = j28 + (((long) (-568)) * (((j23 | j26) ^ j22) | ((j24 | j26) ^ j22) | ((j29 | jLongValue4) ^ j22))) + (((long) 568) * (((j25 | j26) ^ j22) | ((j27 | jLongValue4) ^ j22) | (j29 ^ j22))) + ((long) (-1710442869));
                                        int i283 = ((int) (j30 >> 32)) & ((-2072279902) + ((~(i4 | 998126821)) * (-116)) + ((997078245 | i21) * 116) + (((~((-440148166) | i21)) | 439099589) * 116));
                                        int i284 = (~(1399970740 | i4)) | (-1400503286);
                                        int i285 = ~((-36723125) | i21);
                                        if (((((int) j30) & (((i284 | i285) * (-252)) + 2118231085 + ((i285 | (~(i4 | (-532546)))) * 252))) | i283) == 1245577864) {
                                            i7 = (~(i21 & 70)) & (i21 | 70);
                                            break loop5;
                                        }
                                        i280++;
                                        objInvoke2 = obj5;
                                        it = it2;
                                        str13 = str14;
                                        strArr4 = strArr4;
                                        length = i282;
                                    }
                                }
                                objInvoke2 = objInvoke2;
                                it = it;
                                strArr4 = strArr4;
                            }
                            int i286 = (~(i21 & i6)) & (i21 | i6);
                            int i287 = -i286;
                            int i288 = ((i286 & i287) | (i286 ^ i287)) >> 31;
                            int i289 = i7 & (~i288);
                            int i290 = i6 & i288;
                            i6 = (i290 & i289) | (i289 ^ i290);
                        } catch (Throwable th26) {
                            Throwable cause9 = th26.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th26;
                        }
                    } else {
                        strArr4 = strArr4;
                    }
                    strArr = strArr4;
                } catch (Throwable th27) {
                    Throwable cause10 = th27.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th27;
                }
            } else {
                i6 = i21;
                strArr = null;
            }
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i291 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
            int i292 = ~iLastIndexOf;
            int i293 = (((iLastIndexOf * (-661)) - 99811) - (~(-(-((i291 | (~(i292 | (-152)))) * 1324))))) - 1;
            int i294 = ~((iLastIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | (iLastIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault16));
            int i295 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault16 | 151);
            int i296 = ((i295 & i294) | (i294 ^ i295)) * (-1324);
            int i297 = ((i293 | i296) << 1) - (i296 ^ i293);
            int i298 = ((~((iLastIndexOf & (-152)) | ((-152) ^ iLastIndexOf))) | (~((i292 ^ 151) | (i292 & 151)))) * 662;
            int i299 = (i297 & i298) + (i298 | i297);
            int i300 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i301 = ((i300 | 12) << 1) - (i300 ^ 12);
            int i302 = -ExpandableListView.getPackedPositionType(0L);
            Object[] objArr64 = new Object[1];
            a(i299, i301, (char) ((i302 ^ 33306) + ((i302 & 33306) << 1)), objArr64);
            Object[] objArr65 = {(String) objArr64[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cGreen = (char) Color.green(0);
                int i303 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 993;
                int iMyPid = (Process.myPid() >> 22) + 8;
                byte b20 = $$d[3];
                byte b21 = (byte) (b20 - 1);
                Object[] objArr66 = new Object[1];
                e(b21, (byte) (b21 | 51), b20, objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cGreen, i303, iMyPid, -545305915, false, (String) objArr66[0], new Class[]{String.class});
            }
            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr65)).longValue();
            long j31 = 60980982;
            long j32 = -55;
            long j33 = (j32 * j31) + (j32 * jLongValue5);
            long j34 = 56;
            long j35 = i21;
            int i304 = i6;
            long j36 = -1;
            String[] strArr5 = strArr;
            long j37 = j35 ^ j36;
            long j38 = j33 + ((jLongValue5 | ((j31 | j35) ^ j36)) * j34) + (((long) (-56)) * ((j31 | jLongValue5) ^ j36)) + (j34 * (((jLongValue5 | j37) ^ j36) | j31)) + ((long) 559478302);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i305 = ~((-1600685095) | iElapsedRealtime);
            int i306 = ~iElapsedRealtime;
            int i307 = ((int) (j38 >> 32)) & ((-1504632390) + ((i305 | (~((-163458684) | i306))) * (-1808)) + (((~((-1447067653) | iElapsedRealtime)) | (~(i306 | (-9841242)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iElapsedRealtime | 163458683)) | 153617442 | (~(1600685094 | i306))) * TypedValues.Custom.TYPE_BOOLEAN));
            int i308 = ~i;
            int i309 = ((int) j38) & (1453938690 + (((~((-235494907) | i308)) | (-1672721317)) * 519) + (((~((-33624481) | i308)) | (~((-1639096837) | i))) * (-519)) + (((~((-1672721317) | i)) | 235494906) * 519));
            int i310 = (i307 & i309) | (i307 ^ i309);
            int i311 = -i310;
            int i312 = ((i310 & i311) | (i310 ^ i311)) >> 31;
            int i313 = (~i312) & i;
            int i314 = i312 & ((i & (-51)) | (i308 & 50));
            int i315 = (i314 & i313) | (i313 ^ i314);
            int i316 = (~(i & i304)) & (i | i304);
            int i317 = -i316;
            int i318 = ((i316 & i317) | (i316 ^ i317)) >> 31;
            int i319 = i315 & (~i318);
            int i320 = i304 & i318;
            int i321 = (i319 & i320) | (i319 ^ i320);
            int i322 = 18 - (~(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int i323 = -Color.rgb(0, 0, 0);
            Object[] objArr67 = new Object[1];
            c(new char[]{16, '\n', 2, '\t', '\b', 65535, 65529, '\r', '\n', 65531, 65533, 65535, 65481, '\r', 19, '\r', 14, 65535, 7, 65481}, false, i322, (i323 & (-16777013)) + (i323 | (-16777013)), 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr67);
            Object[] objArr68 = {(String) objArr67[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int defaultSize = View.getDefaultSize(0, 0) + 993;
                int i324 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9;
                byte b22 = $$d[3];
                byte b23 = (byte) (b22 - 1);
                Object[] objArr69 = new Object[1];
                e(b23, (byte) (b23 | 51), b22, objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumDrawingCacheSize, defaultSize, i324, -545305915, false, (String) objArr69[0], new Class[]{String.class});
            }
            long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr68)).longValue();
            long j39 = -165770743;
            long j40 = j39 ^ j36;
            long j41 = (((long) 284) * j39) + (((long) (-282)) * jLongValue6) + (((long) (-283)) * (((j40 | jLongValue6) ^ j36) | ((j40 | j35) ^ j36)));
            long j42 = 283;
            long j43 = jLongValue6 ^ j36;
            long j44 = j41 + (((j39 | j43) ^ j36) * j42) + (j42 * (((j40 | j43) | j35) ^ j36)) + ((long) 786230027);
            int i325 = ((int) (j44 >> 32)) & ((-564122542) + (((~(1129844673 | i308)) | 1727896211 | (~((-1129844674) | i))) * (-564)) + ((~((-16778561) | i)) * 1128) + (((~(1727896211 | i308)) | 1113066113) * 564));
            int iMyUid = Process.myUid();
            int i326 = ((int) j44) & ((-1118262447) + (((~(1610457045 | iMyUid)) | 1247283840) * (-756)) + (((~iMyUid) | 1610457045) * 756));
            int i327 = (i325 & i326) | (i325 ^ i326);
            int i328 = (i327 | (-i327)) >> 31;
            int i329 = (~i328) & i;
            int i330 = i328 & ((i & (-61)) | (i308 & 60));
            int i331 = (i330 & i329) | (i329 ^ i330);
            int i332 = i ^ i321;
            int i333 = -i332;
            int i334 = ((i332 & i333) | (i332 ^ i333)) >> 31;
            int i335 = i331 & (~i334);
            int i336 = i334 & i321;
            int i337 = (i335 & i336) | (i335 ^ i336);
            int i338 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i339 = i338 * 71;
            int i340 = ((i339 | (-2484)) << 1) - (i339 ^ (-2484));
            int i341 = ~i338;
            int i342 = -(-(((~((i341 & 36) | (i341 ^ 36))) | (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault17 | 36))) * (-140)));
            int i343 = ((i340 | i342) << 1) - (i342 ^ i340);
            int i344 = (~((i338 ^ 36) | (i338 & 36) | iTuitionPaymentFragmentspecialinlinedviewModeldefault17)) * 70;
            int i345 = (i343 ^ i344) + ((i344 & i343) << 1);
            int i346 = ~i338;
            int i347 = ~((i346 & 36) | (i346 ^ 36));
            int i348 = ~(((-37) & i338) | ((-37) ^ i338));
            int i349 = (i347 & i348) | (i347 ^ i348);
            int i350 = ~((i338 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (i338 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
            int i351 = (i345 - (~(-(-(((i350 & i349) | (i349 ^ i350)) * 70))))) - 1;
            int i352 = -ExpandableListView.getPackedPositionChild(0L);
            int i353 = ((i352 | 195) << 1) - (i352 ^ 195);
            int i354 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i355 = i354 * (-919);
            int i356 = ((i355 | (-20218)) << 1) - (i355 ^ (-20218));
            int i357 = ~i354;
            int i358 = i357 | (-23);
            int i359 = ~((i358 & iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | (i358 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18));
            int i360 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
            int i361 = (-23) | i360;
            int i362 = ~((i361 ^ i354) | (i361 & i354));
            int i363 = ((i359 ^ i362) | (i359 & i362)) * 920;
            int i364 = (i356 ^ i363) + ((i356 & i363) << 1);
            int i365 = ~((i357 ^ (-23)) | (i357 & (-23)));
            int i366 = ~i354;
            int i367 = ~((i366 ^ i360) | (i366 & i360));
            int i368 = i364 + (((i365 ^ i367) | (i367 & i365)) * 920);
            int i369 = ~(i357 | (-23) | i360);
            int i370 = i366 | 22;
            int i371 = ~((i370 & iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | (i370 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18));
            int i372 = (i369 & i371) | (i369 ^ i371);
            int i373 = i354 | (-23);
            int i374 = ~((i373 & iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | (i373 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18));
            int i375 = (i368 - (~(((i372 & i374) | (i372 ^ i374)) * 920))) - 1;
            Object[] objArr70 = new Object[1];
            c(new char[]{65487, '\b', 3, 16, 25, 65487, 2, 15, 5, 19, 16, '\n', 5, 65488, 23, 7, 20, 0, 5, 2, 21, 2, 65488, 5, 2, 21, 2, 65488, 5, 2, 21, 2, 65488, 4, 16, 14}, false, i351, i353, i375, objArr70);
            Object[] objArr71 = {(String) objArr70[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int trimmedLength = TextUtils.getTrimmedLength("") + 993;
                int iMyTid = 8 - (Process.myTid() >> 22);
                byte[] bArr20 = $$d;
                Object[] objArr72 = new Object[1];
                e(bArr20[41], (byte) 51, bArr20[3], objArr72);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c, trimmedLength, iMyTid, 349342683, false, (String) objArr72[0], new Class[]{String.class});
            }
            long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr71)).longValue();
            long j45 = -214892060;
            long j46 = j45 ^ j36;
            long j47 = (((long) (-563)) * j45) + (((long) 565) * jLongValue7) + (((long) (-564)) * (j46 | (((jLongValue7 ^ j36) | j37) ^ j36) | ((jLongValue7 | j35) ^ j36))) + (((long) 1128) * (((j46 | jLongValue7) | j35) ^ j36)) + (((long) 564) * (((j46 | j37) ^ j36) | ((jLongValue7 | j45) ^ j36))) + ((long) (-632186545));
            int i376 = ((int) (j47 >> 32)) & ((-2072279902) + ((~(1342156201 | i308)) * (-116)) + ((133933313 | i) * 116) + (((~((-1303293098) | i)) | 95070209) * 116));
            int i377 = (int) j47;
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i378 = ~iMaxMemory2;
            int i379 = 508917475 + (((~(1014153250 | i378)) | 1098918417) * (-1188));
            int i380 = (~(iMaxMemory2 | (-1014153251))) | 1098918417;
            int i381 = ~(1843587635 | i378);
            int i382 = i377 & (i379 + ((i380 | i381) * 594) + (((~((-1014153251) | i378)) | 269484032 | i381) * 594));
            int i383 = (i376 & i382) | (i376 ^ i382);
            int i384 = -i383;
            int i385 = ((i383 & i384) | (i383 ^ i384)) >> 31;
            int i386 = (i385 & ((i & (-81)) | (i308 & 80))) | ((~i385) & i);
            int i387 = i ^ i337;
            int i388 = -i387;
            int i389 = ((i387 & i388) | (i387 ^ i388)) >> 31;
            int i390 = i386 & (~i389);
            int i391 = i337 & i389;
            int i392 = (i390 & i391) | (i390 ^ i391);
            int i393 = -Color.argb(0, 0, 0, 0);
            int i394 = ((i393 | 162) << 1) - (i393 ^ 162);
            int i395 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i396 = i395 * (-1335);
            int i397 = (i396 ^ (-27347)) + ((i396 & (-27347)) << 1);
            int i398 = (i395 ^ i) | (i395 & i);
            int i399 = (i397 - (~(-(-(((~i398) | (-42)) * (-668)))))) - 1;
            int i400 = (i395 | (~(((-42) ^ i) | ((-42) & i)))) * 1336;
            int i401 = (i399 ^ i400) + ((i400 & i399) << 1);
            int i402 = -(-((i398 | (-42)) * 668));
            Object[] objArr73 = new Object[1];
            a(i394, ((i401 | i402) << 1) - (i402 ^ i401), (char) TextUtils.getOffsetBefore("", 0), objArr73);
            Object[] objArr74 = {(String) objArr73[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                int i403 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 993;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 8;
                byte[] bArr21 = $$d;
                Object[] objArr75 = new Object[1];
                e(bArr21[41], (byte) 51, bArr21[3], objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, i403, iMakeMeasureSpec, 349342683, false, (String) objArr75[0], new Class[]{String.class});
            }
            long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr74)).longValue();
            long j48 = 100889197;
            long j49 = -209;
            long j50 = (j49 * j48) + (j49 * jLongValue8);
            long j51 = 210;
            long j52 = j48 ^ j36;
            long j53 = jLongValue8 ^ j36;
            long j54 = j50 + (((j52 | j53) ^ j36) * j51) + ((((j53 | j37) ^ j36) | ((j52 | j35) ^ j36)) * j51) + (j51 * ((((j52 | j37) | jLongValue8) ^ j36) | (((j53 | j48) | j35) ^ j36))) + ((long) (-947967802));
            int i404 = ((int) (j54 >> 32)) & (((((~((-856649043) | i)) | 295011594) * 262) - 2131279022) + (((~((-856649043) | i308)) | 295011594) * 262));
            int i405 = ((int) j54) & ((((~(2053416677 | i308)) | (~((-616190268) | i)) | (~(i308 | 616190267))) * 959) + 1816124846 + (((~(2053416677 | i)) | (~((-616190268) | i308)) | (~(616190267 | i))) * 959));
            int i406 = (i404 & i405) | (i404 ^ i405);
            int i407 = -i406;
            int i408 = ((i406 & i407) | (i406 ^ i407)) >> 31;
            int i409 = (~i408) & i;
            int i410 = i408 & (i ^ 90);
            int i411 = (i410 & i409) | (i409 ^ i410);
            int i412 = ((~i392) & i) | (i392 & i308);
            int i413 = -i412;
            int i414 = ((i412 & i413) | (i412 ^ i413)) >> 31;
            int i415 = i411 & (~i414);
            int i416 = i392 & i414;
            int i417 = (i416 & i415) | (i415 ^ i416);
            int i418 = -(ViewConfiguration.getTouchSlop() >> 8);
            int i419 = ((i418 | 18) << 1) - (i418 ^ 18);
            int i420 = -TextUtils.getTrimmedLength("");
            int i421 = i420 * 860;
            int i422 = (i421 ^ (-167310)) + ((i421 & (-167310)) << 1);
            int i423 = ((i420 ^ i) | (i420 & i)) * (-859);
            int i424 = ((i422 | i423) << 1) - (i423 ^ i422);
            int i425 = ~i;
            int i426 = ~((i425 & i420) | (i425 ^ i420));
            int i427 = ~i420;
            int i428 = (i427 & (-196)) | (i427 ^ (-196));
            int i429 = ~((i428 & i) | (i428 ^ i));
            int i430 = ((i426 & i429) | (i426 ^ i429)) * 859;
            int i431 = (i424 ^ i430) + ((i430 & i424) << 1);
            int i432 = ~(((-196) & i308) | ((-196) ^ i308));
            int i433 = ~((i420 & (-196)) | ((-196) ^ i420));
            int i434 = i432 ^ i433;
            Object[] objArr76 = new Object[1];
            c(new char[]{65488, 16, 3, 22, 11, 22, 65488, 22, 11, 16, 11, 65489, 5, 22, 7, 65489, '\n', 21}, true, i419, i431 + (((i433 & i432) | i434) * 859), 15 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), objArr76);
            Object[] objArr77 = {(String) objArr76[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iMyTid2 = (Process.myTid() >> 22) + 993;
                int packedPositionType = 8 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr22 = $$d;
                Object[] objArr78 = new Object[1];
                e(bArr22[41], (byte) 51, bArr22[3], objArr78);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(doubleTapTimeout, iMyTid2, packedPositionType, 349342683, false, (String) objArr78[0], new Class[]{String.class});
            }
            long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr77)).longValue();
            long j55 = 1241116322;
            long j56 = (((long) (-665)) * j55) + (((long) 334) * jLongValue9);
            long j57 = j55 ^ j36;
            long j58 = 333;
            long j59 = j56 + (((long) (-333)) * j57) + ((((j57 | j37) ^ j36) | ((jLongValue9 | j35) ^ j36)) * j58) + (j58 * (((j37 | jLongValue9) ^ j36) | ((j57 | j35) ^ j36))) + ((long) (-2088194927));
            int i435 = ((int) (j59 >> 32)) & (1578164611 + (((~(1431562732 | i)) | (~((-1048709) | i308))) * 497) + (((~(1427226860 | i308)) | 4335872 | (~((-1048709) | i))) * 497));
            int i436 = ((int) j59) & (1368536161 + ((~((-363488813) | i308)) * 52) + (((~((-497805117) | i308)) | (~(939421293 | i308)) | 134316304) * (-52)) + (((~(497805116 | i308)) | 575932481) * 52));
            int i437 = (i435 & i436) | (i435 ^ i436);
            int i438 = -i437;
            int i439 = ((i437 & i438) | (i437 ^ i438)) >> 31;
            int i440 = (i439 & (~(i & 100)) & (i | 100)) | ((~i439) & i);
            int i441 = ((~i417) & i) | (i417 & i308);
            int i442 = -i441;
            int i443 = ((i441 & i442) | (i441 ^ i442)) >> 31;
            int i444 = (i417 & i443) | (i440 & (~i443));
            Object[] objArr79 = {new int[]{i}, strArr5, new int[1], new int[]{i444}};
            int i445 = (~(i & i444)) & (i | i444);
            int i446 = -i445;
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i447 = ~iUptimeMillis;
            int i448 = (-1695660275) + (((~((-319741041) | i447)) | (~((-488972276) | iUptimeMillis))) * 210) + (((~(iUptimeMillis | (-34258945))) | (~(i447 | (-203490180)))) * 210);
            int i449 = -(-((((i445 & i446) | (i445 ^ i446)) >> 31) & 16));
            int i450 = (i448 & i449) + (i449 | i448);
            int i451 = (i3 ^ i450) + ((i3 & i450) << 1);
            int i452 = i451 << 13;
            int i453 = ((~i451) & i452) | ((~i452) & i451);
            int i454 = i453 >>> 17;
            int i455 = ((~i453) & i454) | ((~i454) & i453);
            int i456 = i455 << 5;
            ((int[]) objArr79[2])[0] = ((~i455) & i456) | ((~i456) & i455);
            return objArr79;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, int r7, short r8) {
            /*
                int r8 = r8 + 109
                int r7 = r7 * 3
                int r0 = 1 - r7
                int r6 = r6 * 3
                int r6 = r6 + 4
                byte[] r1 = com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.AnonymousClass1.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2a
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r3 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r5
            L2a:
                int r3 = -r3
                int r6 = r6 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.AnonymousClass1.$$g(short, int, short):java.lang.String");
        }
    }
}
