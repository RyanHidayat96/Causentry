package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
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
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.places.internal.zzpu;
import defpackage.AutoValue_OutputSurface;
import defpackage.TakePictureManager1;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.decrementRetryCounter;
import defpackage.getHdrFormat;
import defpackage.getImplementation;
import defpackage.initSession;
import defpackage.retryRequest;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {
    private static final byte[] $$c = {111, 40, 23, -13};
    private static final int $$f = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {48, -119, -71, 110, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 55, -2, 20, -18, -50, 68, 5, -15, 17, -15, 5, 6, -6, -56, 69, -12, 9, 3, 6, -14, -54, 36, 37, -15, 17, -15, 5, 6, -6, -37, 48, -6, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, 52, 14, -9, 15, -2, -5, -4, -53, 63, -2, -6, 17, -16, 18, -8, -3, 15, -68, 67, -3, -10, 3, 3, 15, -68, 52, 16, -6, -58, 64, 3, -10, 2, 8, -61, 24, 42, -10, 13, -10, 2, 0, -19, 32, -2, 14, -12, -2, 6, -8, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -65, 0, -26, 19, -3, 18, -14, 6, -36, 42, -2, -5, 9, -5, 0, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, 57, 4, 10, -12, -2, 0, 19, -13, -54, 54, 16, -16, 19, -10, 5, 14, -4, -10, -5, 17, -68, 25, 36, 10, -12, -2, 0, 19, -13, -33, 48, -16, 19, -10, 5, 14, -4, -10, -5, 17, -39, 42, 5, -37, 20, 3, 3, 11, 2, -1, -16, 18, -77, 32, 45, -1, 4, -14, 14, -4, 7, 0, 13, -1, -62, 70, -1, 5, -19, 18, -12, 17, -4, -65, 66, -3, -2, 13, 1, -3, -65, 60, 6, 7, -14, 14, -3, -12, 12, -61, 59, 13, 1, -3, -65, 27, 45, 1, -3, -42, 42, -6, 3, 6, -8, -64, 15, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -66, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, 52, 14, -9, 15, -2, -5, -4, -53, 63, -2, -6, 17, -16, 18, -8, -3, 15, -68, 67, -3, -10, 3, 3, 15, -68, 60, 6, 7, -14, 14, -3, -12, 12, -61, 77, 1, -23, 16, -12, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -64, 5, 6, -7, -2, 6, -63, 54, 13, -2, 1, -6, -1, 18, -10, 7, 0, 6, -68, 53, 20, -11, 4, -7, 2, 14, 2, -68, 32, 21, 16, -45, 52, -11, 4, -7, 2, 14, -44, 42, 7, -1, -8, -3, 15};
    private static final int $$e = 149;
    private static final byte[] $$a = {49, -45, -112, 57, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
    private static final int $$b = 131;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] b = {57184, 57186, 60106, 60048, 60090, 60052, 60117, 60055, 60043, 60045, 60111, 60098, 60040, 60054, 60051, 60041, 57191, 57187, 60083, 60057, 57190, 60058, 57189, 60056, 57188, 60104, 60047, 60049, 60060, 60046, 60109, 60050, 60110, 60088, 60072, 60105, 60099, 57193, 60034, 60063, 60108, 57195, 60107, 60073, 60061, 60079, 60062, 57192, 60053};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57190;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r8
            byte[] r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.$$a
            int r6 = r6 + 84
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 111 - r6
            int r7 = 442 - r7
            int r8 = 73 - r8
            byte[] r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r6
            r6 = r8
            r4 = r2
            goto L25
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
        L25:
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.d(byte, int, int, java.lang.Object[]):void");
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i4 = jobParameters.getExtras().getInt("priority");
        int i5 = jobParameters.getExtras().getInt("attemptNumber");
        TakePictureManager1.TuitionPaymentFragmentbindingInflater1(getApplicationContext());
        retryRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = retryRequest.b().TuitionPaymentFragmentbindingInflater1(string).TuitionPaymentFragmentspecialinlinedviewModeldefault2(getImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4));
        if (string2 != null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(Base64.decode(string2, 0));
        }
        decrementRetryCounter decrementretrycounter = TakePictureManager1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (decrementretrycounter == null) {
            throw new IllegalStateException("Not initialized!");
        }
        int i8 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        int i9 = i8 % 2;
        getHdrFormat gethdrformat = decrementretrycounter.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        gethdrformat.b.execute(new AutoValue_OutputSurface(gethdrformat, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), i5, new Runnable() { // from class: getRecommendedFileFormat
            private static final byte[] $$c = {84, 10, 24, -102};
            private static final int $$d = ModuleDescriptor.MODULE_VERSION;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {49, 84, -120, 101, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
            private static final int $$b = 209;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59710, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747, 59751, 59864, 59871, 59868, 59836, 59814, 59864, 59880, 59883, 59858, 59869, 59859, 59865, 59859, 59859, 59839, 59793, 59449, 59425, 59438, 59436, 59427, 59438, 59425, 59409, 59421, 59429, 59424, 59422, 59434, 59452, 59428};

            private static void a(short s, int i10, int i11, Object[] objArr) {
                byte[] bArr = $$a;
                int i12 = s * 15;
                int i13 = (i10 * 2) + 84;
                int i14 = 92 - i11;
                byte[] bArr2 = new byte[i12 + 38];
                int i15 = i12 + 37;
                int i16 = -1;
                if (bArr == null) {
                    int i17 = (i14 + i15) - 11;
                    i14 = i14;
                    i13 = i17;
                }
                while (true) {
                    i16++;
                    bArr2[i16] = (byte) i13;
                    if (i16 == i15) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i18 = i14 + 1;
                    i14 = i18;
                    i13 = (i13 + bArr[i18]) - 11;
                }
            }

            private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i10 = 2;
                int i11 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i12 = 0;
                int i13 = iArr[0];
                int i14 = 1;
                int i15 = iArr[1];
                int i16 = iArr[2];
                int i17 = iArr[3];
                char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i18 = $11 + 5;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        int i19 = 5 / 2;
                    }
                    int i20 = 0;
                    while (i20 < length) {
                        int i21 = $10 + 23;
                        $11 = i21 % 128;
                        if (i21 % i10 == 0) {
                            try {
                                Object[] objArr2 = new Object[i14];
                                objArr2[i12] = Integer.valueOf(cArr[i20]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) i12;
                                    byte b3 = (byte) (b2 + 5);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getCapsMode("", i12, i12), 1270 - (TypedValue.complexToFraction(i12, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i12, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 18, 407021364, false, $$e(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE});
                                }
                                cArr2[i20] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                i20--;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr[i20])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = (byte) (b4 + 5);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.alpha(0) + 1270, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 407021364, false, $$e(b4, b5, (byte) (b5 - 5)), new Class[]{Integer.TYPE});
                                }
                                cArr2[i20] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                i20++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i10 = 2;
                        i12 = 0;
                        i14 = 1;
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i15];
                System.arraycopy(cArr, i13, cArr3, 0, i15);
                if (bArr != null) {
                    char[] cArr4 = new char[i15];
                    setvideostabilizationmode.b = 0;
                    char c = 0;
                    while (setvideostabilizationmode.b < i15) {
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i22 = setvideostabilizationmode.b;
                            Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.green(0), AndroidCharacter.getMirror('0') + 3177, 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2133916302, false, $$e(b6, (byte) (b6 | 6), b6), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i22] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        } else {
                            int i23 = setvideostabilizationmode.b;
                            Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                                int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, iIndexOf, absoluteGravity, 387247676, false, $$e((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i23] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        }
                        c = cArr4[setvideostabilizationmode.b];
                        Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.green(0) + 41241), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1705, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 20, -1434471773, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                    cArr3 = cArr4;
                }
                if (i17 > 0) {
                    char[] cArr5 = new char[i15];
                    System.arraycopy(cArr3, 0, cArr5, 0, i15);
                    int i24 = i15 - i17;
                    System.arraycopy(cArr5, 0, cArr3, i24, i17);
                    System.arraycopy(cArr5, i17, cArr3, 0, i24);
                    int i25 = $10 + 95;
                    $11 = i25 % 128;
                    int i26 = i25 % 2;
                }
                if (!(!z)) {
                    char[] cArr6 = new char[i15];
                    int i27 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i27;
                        if (setvideostabilizationmode.b >= i15) {
                            break;
                        }
                        cArr6[setvideostabilizationmode.b] = cArr3[(i15 - setvideostabilizationmode.b) - 1];
                        i27 = setvideostabilizationmode.b + 1;
                    }
                    int i28 = $11 + 21;
                    $10 = i28 % 128;
                    int i29 = i28 % 2;
                    cArr3 = cArr6;
                }
                if (i16 > 0) {
                    int i30 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i30;
                        if (setvideostabilizationmode.b >= i15) {
                            break;
                        }
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        i30 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                Object[] objArr;
                int i10 = 2 % 2;
                int i11 = TuitionPaymentFragmentbindingInflater1 + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                int i12 = i11 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                    int iArgb = Color.argb(0, 0, 0, 0) + 23;
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, (byte) (b3 | 89), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionType, iArgb, 986134021, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new int[]{0, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 29945);
                    int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                    byte[] bArr = $$a;
                    byte b4 = bArr[28];
                    byte b5 = bArr[7];
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, (byte) (b5 | 52), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, maximumDrawingCacheSize, edgeSlop, 1596667560, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                        int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                        int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[28];
                        byte b7 = bArr2[7];
                        Object[] objArr6 = new Object[1];
                        a(b6, b7, b7, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, maximumDrawingCacheSize2, iRgb, 1599039318, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
                    int iMyPid = Process.myPid();
                    int i13 = ~iMyPid;
                    int i14 = (((604056486 + ((~(582672834 | i13)) * 979)) + ((iMyPid | 795275260) * (-979))) + (((~(iMyPid | 582672834)) | (~(i13 | 795275260))) * 979)) - 1884984990;
                    int i15 = (i14 << 13) ^ i14;
                    int i16 = i15 ^ (i15 >>> 17);
                    ((int[]) objArr[3])[0] = i16 ^ (i16 << 5);
                    int i17 = TuitionPaymentFragmentbindingInflater1 + 19;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new int[]{37, 16, 109, 11}, false, new byte[]{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new int[]{53, 16, 193, 5}, true, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1}, objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr10 = {1029777767};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - View.getDefaultSize(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1727, (ViewConfiguration.getFadingEdgeLength() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -1884984990);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                            int iAlpha = 23 - Color.alpha(0);
                            byte[] bArr3 = $$a;
                            byte b8 = bArr3[28];
                            byte b9 = bArr3[7];
                            Object[] objArr11 = new Object[1];
                            a(b8, b9, b9, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, keyRepeatTimeout, iAlpha, 1599039318, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                        try {
                            Object[] objArr12 = new Object[1];
                            c(new int[]{0, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr12);
                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr13);
                            long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1756;
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                                byte[] bArr4 = $$a;
                                byte b10 = bArr4[28];
                                byte b11 = bArr4[7];
                                Object[] objArr14 = new Object[1];
                                a(b10, b11, (byte) (b11 | 52), objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, iLastIndexOf, scrollBarFadeDuration, 1596667560, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                                int pressedStateDuration = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int i19 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                                byte b12 = $$a[7];
                                byte b13 = b12;
                                Object[] objArr15 = new Object[1];
                                a(b12, b13, (byte) (b13 | 89), objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionType2, pressedStateDuration, i19, 986134021, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                            objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
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
                int i20 = ((int[]) objArr[1])[0];
                int i21 = ((int[]) objArr[0])[0];
                if (i21 == i20) {
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                    TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = ((int[]) objArr[3])[0];
                    Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i25 = i24 + (-1046784134) + ((~((-262737) | iIdentityHashCode)) * (-301)) + (((~(537895536 | iIdentityHashCode)) | (~((~iIdentityHashCode) | 750497962))) * (-301)) + (((~(iIdentityHashCode | (-750497963))) | 537895536) * 301);
                    int i26 = (i25 << 13) ^ i25;
                    int i27 = i26 ^ (i26 >>> 17);
                    ((int[]) objArr16[3])[0] = i27 ^ (i27 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i28 = TuitionPaymentFragmentbindingInflater1 + 15;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
                        int i29 = i28 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    int[] iArr = new int[i21];
                    int i30 = i21 - 1;
                    iArr[i30] = 1;
                    Toast.makeText((Context) null, iArr[((i21 * i30) % 2) - 1], 1).show();
                    int i31 = ((int[]) objArr[3])[0];
                    Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i32 = i31 + (-2134423931) + (((~(156511441 | iIdentityHashCode2)) | 369113867) * (-366)) + (((~(iIdentityHashCode2 | 525615067)) | 10241) * 366);
                    int i33 = (i32 << 13) ^ i32;
                    int i34 = i33 ^ (i33 >>> 17);
                    ((int[]) objArr17[3])[0] = i34 ^ (i34 << 5);
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.jobFinished(jobParameters, false);
            }

            private static String $$e(int i10, int i11, byte b2) {
                int i12 = 105 - i11;
                int i13 = (i10 * 4) + 4;
                byte[] bArr = $$c;
                int i14 = b2 * 2;
                byte[] bArr2 = new byte[1 - i14];
                int i15 = 0 - i14;
                int i16 = -1;
                if (bArr == null) {
                    i13++;
                    i12 = i13 + (-i12);
                }
                while (true) {
                    i16++;
                    bArr2[i16] = (byte) i12;
                    if (i16 == i15) {
                        return new String(bArr2, 0);
                    }
                    byte b3 = bArr[i13];
                    i13++;
                    i12 += -b3;
                }
            }
        }));
        int i10 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$7879113;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i5, keyRepeatDelay, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{27, '*', Typography.dollar, 18, 3, '!', ')', 4, '\f', 19, '\r', ')', '(', '\n', 25, '/', '\f', Typography.quote, '\f', 0, 24, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_5).substring(25, 26).length() + 124), 22 - TextUtils.getOffsetAfter("", 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{'*', 11, 22, 7, 11, '/', Typography.dollar, '.', '*', 25, '\f', 21, Typography.quote, '\n', 13874}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 15), View.resolveSize(0, 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int mode = 1031 - View.MeasureSpec.getMode(0);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b4, (short) (b4 | 51), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, mode, maximumFlingVelocity, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                int tapTimeout = 15 - (ViewConfiguration.getTapTimeout() >> 16);
                Object[] objArr6 = new Object[1];
                a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, trimmedLength, tapTimeout, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[3])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i10 = (int) Runtime.getRuntime().totalMemory();
            int i11 = (-38240678) + (((-671744129) | i10) * (-381)) + (((~((~i10) | (-746242441))) | 393276794) * 381) + 272673225;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{21, 22, 7, 23, 0, '\r', 27, '*', Typography.quote, 0, 31, ')', 19, '!', '0', 11}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{' ', Typography.amp, '/', '*', 24, '!', 24, '(', 14, 25, 7, 19, '(', '\f', '.', 4}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 12), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_qr_code).substring(1, 2).length() + 15, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {753181069};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - Color.blue(0)), 1134 - Gravity.getAbsoluteGravity(0, 0), 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 2036198217, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iBlue = 15 - Color.blue(0);
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[7];
                    Object[] objArr12 = new Object[1];
                    a(b5, bArr2[5], b5, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, minimumFlingVelocity, iBlue, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Gravity.getAbsoluteGravity(0, 0)), 1116 - ((byte) KeyEvent.getModifierMetaStateMask()), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                    int iGreen = 1031 - Color.green(0);
                    int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    Object[] objArr13 = new Object[1];
                    a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, iGreen, pressedStateDuration, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{27, '*', Typography.dollar, 18, 3, '!', ')', 4, '\f', 19, '\r', ')', '(', '\n', 25, '/', '\f', Typography.quote, '\f', 0, 24, 2}, (byte) (125 - Color.red(0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{'*', 11, 22, 7, 11, '/', Typography.dollar, '.', '*', 25, '\f', 21, Typography.quote, '\n', 13874}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto6_bni).substring(8, 9).codePointAt(0) + 19), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 102, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i14 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr16 = new Object[1];
                        a(b7, (short) (b7 | 51), b6, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(minimumFlingVelocity2, i14, capsMode, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1032;
                        int iIndexOf = TextUtils.indexOf("", "") + 15;
                        byte[] bArr3 = $$a;
                        byte b8 = bArr3[7];
                        Object[] objArr17 = new Object[1];
                        a(b8, bArr3[5], b8, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cCombineMeasuredStates, iLastIndexOf, iIndexOf, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            while (i4 < strArr2.length) {
                arrayList.add(strArr2[i4]);
                i4++;
                int i15 = TuitionPaymentFragmentbindingInflater1 + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                int i16 = i15 % 2;
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i20 = ~System.identityHashCode(this);
        int i21 = i17 + (-322811767) + (((~(i20 | 580729877)) | 335593642) * (-160)) + (((~(i20 | 336449707)) | 580729877) * 160);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
            int defaultSize2 = View.getDefaultSize(0, 0) + 1755;
            int bitsPerPixel = 22 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr4 = $$a;
            byte b9 = bArr4[7];
            Object[] objArr19 = new Object[1];
            a(b9, (short) (b9 | 103), (byte) (bArr4[33] - 1), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cAxisFromString, defaultSize2, bitsPerPixel, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i24 = TuitionPaymentFragmentbindingInflater1 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
            int i25 = i24 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                int iRgb = Color.rgb(0, 0, 0) + 16778971;
                int gidForName = Process.getGidForName("") + 24;
                byte b10 = $$a[7];
                byte b11 = b10;
                Object[] objArr20 = new Object[1];
                a(b11, (short) (b11 | 51), b10, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, iRgb, gidForName, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bni_mobile).substring(0, 14).length() + 383204667;
            int i26 = (((~(length | 527478093)) | (-314875668)) * 56) + 707067345 + (((~((~length) | (-314875668))) | 527478093) * 56) + 297645440;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            c(new char[]{21, 22, 7, 23, 0, '\r', 27, '*', Typography.quote, 0, 31, ')', 19, '!', '0', 11}, (byte) (6 - View.MeasureSpec.getMode(0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            c(new char[]{' ', Typography.amp, '/', '*', 24, '!', 24, '(', 14, 25, 7, 19, '(', '\f', '.', 4}, (byte) (124 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {753181069};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42049), 1725 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf("", "") + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 297645440, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf3 = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                int scrollBarFadeDuration = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                byte b12 = $$a[7];
                byte b13 = b12;
                Object[] objArr25 = new Object[1];
                a(b13, (short) (b13 | 51), b12, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf3, scrollBarFadeDuration, maximumDrawingCacheSize, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr26 = new Object[1];
                c(new char[]{27, '*', Typography.dollar, 18, 3, '!', ')', 4, '\f', 19, '\r', ')', '(', '\n', 25, '/', '\f', Typography.quote, '\f', 0, 24, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_sdk_general_error).substring(0, 45).length() + 80), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                c(new char[]{'*', 11, 22, 7, 11, '/', Typography.dollar, '.', '*', 25, '\f', 21, Typography.quote, '\n', 13874}, (byte) (51 - View.resolveSize(0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                    int i29 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int deadChar2 = 23 - KeyEvent.getDeadChar(0, 0);
                    byte b14 = $$a[7];
                    byte b15 = b14;
                    Object[] objArr28 = new Object[1];
                    a(b15, (short) (b15 | 140), b14, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(deadChar, i29, deadChar2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                    int iAxisFromString = 1754 - MotionEvent.axisFromString("");
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                    byte[] bArr5 = $$a;
                    byte b16 = bArr5[7];
                    byte b17 = (byte) (bArr5[33] - 1);
                    Object[] objArr29 = new Object[1];
                    a(b16, (short) (b16 | 103), b17, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, iAxisFromString, iIndexOf2, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArrB$7879113[1])[0];
        int i31 = ((int[]) objArrB$7879113[0])[0];
        if (i31 == i30) {
            int i32 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int i33 = ~(Process.myUid() | 808227686);
            int i34 = i32 + (((-330045003) | i33) * (-658)) + 1308097729 + ((i33 | (-866948975)) * 658);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr30[3])[0] = i36 ^ (i36 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrB$7879113[4];
        if (strArr4 != null) {
            for (String str : strArr4) {
                int i37 = TuitionPaymentFragmentbindingInflater1 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37 % 128;
                int i38 = i37 % 2;
                arrayList2.add(str);
            }
        }
        int[] iArr = new int[i31];
        int i39 = i31 - 1;
        iArr[i39] = 1;
        Toast.makeText((Context) null, iArr[((i31 * i39) % 2) - 1], 1).show();
        int i40 = ((int[]) objArrB$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i41 = i40 + 1004503667 + (((~(739925503 | iIdentityHashCode)) | 68686278) * (-502)) + ((~((~iIdentityHashCode) | 1021214207)) * (-502)) + (((~(iIdentityHashCode | (-952527930))) | 739925503) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr31[3])[0] = i43 ^ (i43 << 5);
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        Object obj2 = null;
        int i5 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = $10 + 57;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 19;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 2267 - (ViewConfiguration.getTouchSlop() >> i5), 33 - ((Process.getThreadPriority(0) + 20) >> 6), -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 2;
                    i5 = 8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 + 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) + 2268, 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i11 = $10 + 41;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    i2 = i + 49;
                    cArr4[i2] = (char) (cArr[i2] % b2);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49268), 3261 - TextUtils.indexOf("", "", 0), 30 - ((Process.getThreadPriority(0) + 20) >> 6), -127612708, false, $$g(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b9 = (byte) 0;
                                    byte b10 = b9;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22878), 594 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.green(0) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    int i13 = $11 + 53;
                                    $10 = i13 % 128;
                                    int i14 = i13 % 2;
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                } else {
                                    int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            int i19 = 0;
            while (i19 < i) {
                int i20 = $11 + 17;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr4[i19] = (char) (cArr4[i19] ^ 17779);
                    i19 += 36;
                } else {
                    cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                    i19++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:252:0x1a04  */
    /* JADX WARN: Code duplicated, block: B:253:0x1a06  */
    @Override // android.app.Service
    public void onCreate() throws Throwable {
        Object[] objArr;
        String str;
        String str2;
        Object[] objArr2;
        String str3;
        Object obj;
        Object[] objArr3;
        int i;
        String str4;
        Object[] objArr4;
        char c;
        int i2;
        String str5;
        String str6;
        Object[] objArr5;
        int i3;
        String str7;
        Object[] objArr6;
        char c2;
        Object[] objArr7;
        int i4;
        String str8;
        Object[] objArr8;
        Object obj2;
        Object[] objArr9;
        String str9;
        int i5;
        int i6;
        Object[] objArr10;
        int i7;
        int i8;
        Object[] objArr11;
        int i9 = 2 % 2;
        Object[] objArr12 = new Object[1];
        c(new char[]{27, '*', Typography.dollar, 18, 3, '!', ')', 4, '\f', 19, '\r', ')', '(', '\n', 25, '/', '\f', Typography.quote, '\f', 0, 24, 2}, (byte) (125 - (ViewConfiguration.getScrollBarSize() >> 8)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.txt_checkout).substring(0, 15).length() + 7, objArr12);
        String str10 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        c(new char[]{'*', 11, 22, 7, 11, '/', Typography.dollar, '.', '*', 25, '\f', 21, Typography.quote, '\n', 13874}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 40), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, objArr13);
        String str11 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        c(new char[]{21, 22, 7, 23, 0, '\r', 27, '*', Typography.quote, 0, 31, ')', 19, '!', '0', 11}, (byte) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step5).substring(1, 7).length(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step4).substring(23, 24).length() + 15, objArr14);
        String str12 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        c(new char[]{' ', Typography.amp, '/', '*', 24, '!', 24, '(', 14, 25, 7, 19, '(', '\f', '.', 4}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 87), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_gopay_deeplink).substring(1, 2).codePointAt(0) - 81, objArr15);
        String str13 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        c(new char[]{27, '*', Typography.dollar, 18, 3, '!', ')', 4, 22, 7, '\r', 1, 2, 25, 24, '!', '\n', 30, 24, '(', '*', 17, 18, '+', 25, '#'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 19), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, objArr16);
        String str14 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        c(new char[]{22, 30, 13819, 13819, '/', '*', 25, 5, 13821, 13821, '\n', 28, 24, 22, 24, '!', 6, '/'}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7, objArr17);
        String str15 = (String) objArr17[0];
        int i10 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i11 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 946274828;
        if (i10 != (((-1638649592) + (((~((-1100562460) | i11)) | (~((-270574917) | i11))) * 69)) + (((709104256 | (~((-979679173) | i11))) | (~(i11 | (-1809666716)))) * (-69))) - 1802751840) {
            int i12 = 1894935098 % 2;
            throw new ArithmeticException();
        }
        int i13 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku_instruction_step3).substring(19, 20).codePointAt(0) - 1958817405;
        int i14 = (-611458828) + (((~(iCodePointAt | 1872660504)) | 13636 | (~((-706395461) | iCodePointAt))) * (-754));
        int i15 = ~((-13637) | iCodePointAt);
        int i16 = ~iCodePointAt;
        if (i13 != i14 + ((i15 | (~(i16 | 1872674140))) * (-754)) + (((-706395461) | i16) * 754)) {
            int i17 = 500180398 % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) (43042 - TextUtils.getOffsetBefore("", 0));
            int edgeSlop = 3111 - (ViewConfiguration.getEdgeSlop() >> 16);
            int iMyPid = 22 - (Process.myPid() >> 22);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr18 = new Object[1];
            a(b2, bArr[5], b2, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, edgeSlop, iMyPid, -1272852037, false, (String) objArr18[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char jumpTapTimeout = (char) (43042 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                int scrollBarFadeDuration = 3111 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iAlpha = 22 - Color.alpha(0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr19 = new Object[1];
                a(b3, (short) (b3 | 103), (byte) (bArr2[33] - 1), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, scrollBarFadeDuration, iAlpha, 154975793, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i18 = ((int[]) objArr20[2])[0];
            int i19 = ((int[]) objArr20[1])[0];
            String[] strArr = (String[]) objArr20[3];
            int[] iArr = {i19};
            int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i21 = (~((-1361847342) | i20)) | 270794789;
            int i22 = ~i20;
            int i23 = (((230996800 + ((i21 | (~(1434236669 | i22))) * 886)) + (((~(i22 | 1361847341)) | 343184117) * (-1772))) + ((~(i22 | 343184117)) * 886)) - 2131631649;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[0])[0] = i25 ^ (i25 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i18}, strArr};
            str14 = str14;
            str13 = str13;
        } else {
            try {
                Object[] objArr21 = {null, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str13, Object.class).invoke(null, this)).intValue()), 0, -2131631649};
                byte[] bArr3 = $$d;
                Object[] objArr22 = new Object[1];
                d(bArr3[109], (short) ($$e | 290), (byte) (-bArr3[113]), objArr22);
                Class<?> cls = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                d(bArr3[4], (short) 396, (byte) 72, objArr23);
                Object[] objArr24 = (Object[]) cls.getMethod((String) objArr23[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr21);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char tapTimeout = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 3112;
                    int windowTouchSlop = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr4 = $$a;
                    byte b4 = bArr4[7];
                    Object[] objArr25 = new Object[1];
                    a(b4, (short) (b4 | 103), (byte) (bArr4[33] - 1), objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iIndexOf, windowTouchSlop, 154975793, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr24);
                try {
                    long jLongValue = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 43042);
                        int iAlpha2 = 3111 - Color.alpha(0);
                        int iGreen = Color.green(0) + 22;
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr26 = new Object[1];
                        a(b6, (short) (b6 | 51), b5, objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iAlpha2, iGreen, -1269618118, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char fadingEdgeLength = (char) (43042 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int iAxisFromString = MotionEvent.axisFromString("") + 3112;
                        int scrollBarFadeDuration2 = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr27 = new Object[1];
                        a(b7, bArr5[5], b7, objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(fadingEdgeLength, iAxisFromString, scrollBarFadeDuration2, -1272852037, false, (String) objArr27[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    objArr = objArr24;
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
        int i26 = ((int[]) objArr[1])[0];
        int i27 = ((int[]) objArr[2])[0];
        if (i27 == i26) {
            int i28 = ((int[]) objArr[0])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i30};
            int i31 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1095245597;
            int i32 = ~i31;
            int i33 = i28 + (-454385952) + (((~((-672175674) | i32)) | (~((-1032855786) | i31))) * 210) + (((~(i31 | (-38417))) | (~(i32 | (-360718529)))) * 210);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[0])[0] = i35 ^ (i35 << 5);
            Object[] objArr28 = {new int[1], iArr2, new int[]{i29}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str16 : strArr3) {
                    arrayList.add(str16);
                }
            }
            Toast.makeText((Context) null, i27 / (((i27 - 1) * i27) % 2), 0).show();
            int i36 = ((int[]) objArr[0])[0];
            int i37 = ((int[]) objArr[2])[0];
            int i38 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i37};
            int[] iArr4 = {i38};
            int i39 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i40 = ~i39;
            int i41 = i36 + (-498553052) + ((1067351546 | i40) * (-369)) + (((~((-790002105) | i40)) | 915029354) * (-369)) + (((~(i39 | 790002104)) | 277349442 | (~(i40 | (-152322193)))) * 369);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr[0])[0] = i43 ^ (i43 << 5);
            Object[] objArr29 = {new int[1], iArr4, iArr3, strArr4};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int i44 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
            int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
            Object[] objArr30 = new Object[1];
            a($$a[205], (short) DerHeader.TAG_CLASS_PRIVATE, (byte) 42, objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop2, i44, deadChar, -1199417970, false, (String) objArr30[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
            int iArgb = 10 - Color.argb(0, 0, 0, 0);
            Object[] objArr31 = new Object[1];
            a($$a[33], (short) 202, (byte) 52, objArr31);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, iNormalizeMetaState, iArgb, 254769921, false, (String) objArr31[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int i45 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i46 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr6 = $$a;
                Object[] objArr32 = new Object[1];
                a(bArr6[205], (short) 202, bArr6[44], objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(offsetAfter, i45, i46, 1324201839, false, (String) objArr32[0], null);
            }
            Object[] objArr33 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr33[0])[0]}, new int[1], new int[]{((int[]) objArr33[2])[0]}, (String[]) objArr33[3]};
            int i47 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i48 = (((426694752 + (((~((-50333798) | i47)) | (~((~i47) | (-10023569)))) * (-318))) + (((~(1059523949 | i47)) | (-1069547518)) * (-318))) + (((~(i47 | (-1059523950))) | 1019213720) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 1086088223;
            int i49 = (i48 << 13) ^ i48;
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr2[1])[0] = i50 ^ (i50 << 5);
            str = str13;
            str2 = str11;
        } else {
            str = str13;
            Object[] objArr34 = {Integer.valueOf(((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue()), -1086088223};
            byte[] bArr7 = $$d;
            byte b8 = bArr7[109];
            byte b9 = b8;
            Object[] objArr35 = new Object[1];
            d(b9, (short) (b9 | ByteCompanionObject.MIN_VALUE), b8, objArr35);
            Class<?> cls2 = Class.forName((String) objArr35[0]);
            Object[] objArr36 = new Object[1];
            d(bArr7[278], (short) 336, bArr7[17], objArr36);
            Object[] objArr37 = (Object[]) cls2.getMethod((String) objArr36[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr34);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                int i51 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                int iGreen2 = 10 - Color.green(0);
                byte[] bArr8 = $$a;
                Object[] objArr38 = new Object[1];
                a(bArr8[205], (short) 202, bArr8[44], objArr38);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(gidForName, i51, iGreen2, 1324201839, false, (String) objArr38[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr37);
            try {
                str2 = str11;
                long jLongValue3 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                    int i52 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                    Object[] objArr39 = new Object[1];
                    a($$a[33], (short) 202, (byte) 52, objArr39);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetBefore2, i52, doubleTapTimeout, 254769921, false, (String) objArr39[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int fadingEdgeLength2 = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0);
                    Object[] objArr40 = new Object[1];
                    a($$a[205], (short) DerHeader.TAG_CLASS_PRIVATE, (byte) 42, objArr40);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cArgb, fadingEdgeLength2, iLastIndexOf, -1199417970, false, (String) objArr40[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                objArr2 = objArr37;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[2])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr2[3];
            if (strArr5 != null) {
                for (String str17 : strArr5) {
                    arrayList2.add(str17);
                }
            }
            throw null;
        }
        int i53 = ((int[]) objArr2[1])[0];
        Object[] objArr41 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
        int i54 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        int i55 = 1153572500 + (((~((-590904280) | i54)) | 52959701 | (~(550594050 | i54))) * (-880));
        int i56 = (~((-590904280) | (~i54))) | (-550594051);
        int i57 = ~(i54 | 590904279);
        int i58 = i53 + i55 + ((i56 | i57) * (-880)) + (i57 * 880);
        int i59 = (i58 << 13) ^ i58;
        int i60 = i59 ^ (i59 >>> 17);
        ((int[]) objArr41[1])[0] = i60 ^ (i60 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char packedPositionType = (char) (53893 - ExpandableListView.getPackedPositionType(0L));
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1320;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36;
            Object[] objArr42 = new Object[1];
            a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr42);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionType, iKeyCodeFromString, minimumFlingVelocity, -1433084963, false, (String) objArr42[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cBlue = (char) (53893 - Color.blue(0));
                int i61 = 1321 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int packedPositionType2 = 36 - ExpandableListView.getPackedPositionType(0L);
                byte b10 = $$a[7];
                byte b11 = b10;
                Object[] objArr43 = new Object[1];
                a(b11, (short) (b11 | 51), b10, objArr43);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cBlue, i61, packedPositionType2, -1920778747, false, (String) objArr43[0], null);
            }
            Object[] objArr44 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null);
            objArr3 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i62 = ((int[]) objArr44[0])[0];
            int i63 = ((int[]) objArr44[3])[0];
            String[] strArr6 = (String[]) objArr44[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i64 = ~((-201612933) | iIdentityHashCode);
            int i65 = (-566464416) + ((558465032 | i64) * (-476)) + (i64 * 952) + ((~((~iIdentityHashCode) | (-201612933))) * 476) + 2102135727;
            int i66 = (i65 << 13) ^ i65;
            int i67 = i66 ^ (i66 >>> 17);
            ((int[]) objArr3[1])[0] = i67 ^ (i67 << 5);
            str10 = str10;
            str3 = str15;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                str3 = str15;
                baseContext = (Context) Class.forName(str14).getMethod(str3, new Class[0]).invoke(null, null);
            } else {
                str3 = str15;
            }
            if (baseContext == null) {
                obj = null;
            } else {
                if (baseContext instanceof ContextWrapper) {
                    int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
                    TuitionPaymentFragmentbindingInflater1 = i68 % 128;
                    if (i68 % 2 != 0) {
                        ((ContextWrapper) baseContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) baseContext).getBaseContext() == null) {
                        baseContext = null;
                        obj = null;
                    }
                }
                obj = null;
                baseContext = baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(obj, this)).intValue();
            try {
                Object[] objArr45 = {-1813825281};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b((char) (47977 - View.MeasureSpec.getMode(0)), 1301 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 20 - View.resolveSize(0, 0), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr46 = {baseContext, "com.bpjstku", 2102135727, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).newInstance(objArr45), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 53892);
                    int modifierMetaStateMask = 1319 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 37;
                    byte b12 = $$a[7];
                    byte b13 = b12;
                    Object[] objArr47 = new Object[1];
                    a(b13, (short) (b13 | 51), b12, objArr47);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c3, modifierMetaStateMask, iIndexOf2, 819724799, false, (String) objArr47[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1394 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0) + 76), Boolean.TYPE});
                }
                Object[] objArr48 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr46);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 53893);
                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1320;
                        int i69 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35;
                        byte b14 = $$a[7];
                        byte b15 = b14;
                        Object[] objArr49 = new Object[1];
                        a(b15, (short) (b15 | 51), b14, objArr49);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cResolveSize, jumpTapTimeout2, i69, -1920778747, false, (String) objArr49[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, objArr48);
                    try {
                        str2 = str2;
                        long jLongValue4 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue4);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                            char cMyTid = (char) (53893 - (Process.myTid() >> 22));
                            int i70 = 1320 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37;
                            byte[] bArr9 = $$a;
                            byte b16 = bArr9[7];
                            Object[] objArr50 = new Object[1];
                            a(b16, (short) (b16 | 103), (byte) (bArr9[33] - 1), objArr50);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cMyTid, i70, iIndexOf3, -1273706634, false, (String) objArr50[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                            char c4 = (char) (53894 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 1320;
                            int defaultSize = View.getDefaultSize(0, 0) + 36;
                            Object[] objArr51 = new Object[1];
                            a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr51);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c4, offsetAfter2, defaultSize, -1433084963, false, (String) objArr51[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf6);
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                } else {
                    str10 = str10;
                    objArr48 = objArr48;
                }
                objArr3 = objArr48;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i71 = ((int[]) objArr3[3])[0];
        int i72 = ((int[]) objArr3[0])[0];
        if (i72 == i71) {
            Object[] objArr52 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i73 = ((int[]) objArr3[1])[0];
            int i74 = ((int[]) objArr3[0])[0];
            int i75 = ((int[]) objArr3[3])[0];
            String[] strArr7 = (String[]) objArr3[2];
            int i76 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i77 = i73 + 125422672 + (((~((-566501682) | (~i76))) | (~(804126143 | i76))) * (-272)) + (((~((-801452340) | i76)) | 234950658) * (-272)) + (((~(i76 | 801452339)) | 569175485) * 272);
            int i78 = (i77 << 13) ^ i77;
            int i79 = i78 ^ (i78 >>> 17);
            i = 0;
            ((int[]) objArr52[1])[0] = i79 ^ (i79 << 5);
        } else {
            Toast.makeText((Context) null, i72 / (((i72 - 1) * i72) % 2), 0).show();
            Object[] objArr53 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i80 = ((int[]) objArr3[1])[0];
            int i81 = ((int[]) objArr3[0])[0];
            int i82 = ((int[]) objArr3[3])[0];
            String[] strArr8 = (String[]) objArr3[2];
            int i83 = ~(((int) SystemClock.elapsedRealtime()) | 952721068);
            int i84 = i80 + (((536944296 | i83) * (-196)) - 650341248) + ((i83 | 415776772) * 196);
            int i85 = i84 ^ (i84 << 13);
            int i86 = i85 ^ (i85 >>> 17);
            i = 0;
            ((int[]) objArr53[1])[0] = i86 ^ (i86 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', i, i));
            int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
            Object[] objArr54 = new Object[1];
            a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr54);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cLastIndexOf, scrollDefaultDelay, keyRepeatDelay, -1048449946, false, (String) objArr54[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char bitsPerPixel = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                int i87 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
                int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr10 = $$a;
                byte b17 = bArr10[7];
                Object[] objArr55 = new Object[1];
                a(b17, (short) (b17 | 103), (byte) (bArr10[33] - 1), objArr55);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(bitsPerPixel, i87, scrollBarSize, -1142834547, false, (String) objArr55[0], null);
            }
            Object[] objArr56 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
            objArr4 = new Object[]{new int[1], new int[]{((int[]) objArr56[1])[0]}, (Object[]) objArr56[2], new int[]{((int[]) objArr56[3])[0]}, (String[]) objArr56[4]};
            int i88 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i89 = ~i88;
            int i90 = 577164008 + ((662139338 | i89) * (-757)) + ((~((-1073777682) | i88)) * 1514) + (((~(i88 | 1735917019)) | (~(i89 | (-1111940306))) | 38162624) * 757) + 626007477;
            int i91 = (i90 << 13) ^ i90;
            int i92 = i91 ^ (i91 >>> 17);
            ((int[]) objArr4[0])[0] = i92 ^ (i92 << 5);
            str4 = str2;
            c = 1;
            str = str;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                int i93 = TuitionPaymentFragmentbindingInflater1 + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i93 % 128;
                baseContext2 = i93 % 2 == 0 ? (Context) Class.forName(str14).getMethod(str3, new Class[0]).invoke(null, null) : (Context) Class.forName(str14).getMethod(str3, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                int i94 = TuitionPaymentFragmentbindingInflater1 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i94 % 128;
                int i95 = i94 % 2;
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr57 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, 626007477};
            byte[] bArr11 = $$d;
            byte b18 = bArr11[98];
            Object[] objArr58 = new Object[1];
            d(b18, (short) (b18 | 284), bArr11[50], objArr58);
            Class<?> cls3 = Class.forName((String) objArr58[0]);
            Object[] objArr59 = new Object[1];
            d(bArr11[4], (short) 396, (byte) 72, objArr59);
            Object[] objArr60 = (Object[]) cls3.getMethod((String) objArr59[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr57);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 31533);
                int size = 921 - View.MeasureSpec.getSize(0);
                int defaultSize2 = 28 - View.getDefaultSize(0, 0);
                byte[] bArr12 = $$a;
                byte b19 = bArr12[7];
                Object[] objArr61 = new Object[1];
                a(b19, (short) (b19 | 103), (byte) (bArr12[33] - 1), objArr61);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(packedPositionGroup, size, defaultSize2, -1142834547, false, (String) objArr61[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, objArr60);
            try {
                str4 = str2;
                long jLongValue5 = ((Long) Class.forName(str10).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                    byte b20 = $$a[7];
                    byte b21 = b20;
                    Object[] objArr62 = new Object[1];
                    a(b21, (short) (b21 | 51), b20, objArr62);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(pressedStateDuration, tapTimeout2, scrollBarSize2, -778300370, false, (String) objArr62[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char threadPriority = (char) (31533 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
                    int iLastIndexOf2 = 27 - TextUtils.lastIndexOf("", '0');
                    Object[] objArr63 = new Object[1];
                    a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr63);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(threadPriority, iMakeMeasureSpec, iLastIndexOf2, -1048449946, false, (String) objArr63[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf8);
                objArr4 = objArr60;
                c = 1;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i96 = ((int[]) objArr4[c])[0];
        int i97 = ((int[]) objArr4[3])[0];
        if (i97 == i96) {
            int i98 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            TuitionPaymentFragmentbindingInflater1 = i98 % 128;
            int i99 = i98 % 2;
            int i100 = ((int[]) objArr4[0])[0];
            Object[] objArr64 = {new int[1], new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[]{((int[]) objArr4[3])[0]}, (String[]) objArr4[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i101 = (-403930261) + (((~((-242275383) | iIdentityHashCode2)) | 171986980 | (~((-1531804262) | iIdentityHashCode2))) * (-880));
            int i102 = (~((-242275383) | (~iIdentityHashCode2))) | 1531804261;
            int i103 = ~(iIdentityHashCode2 | 242275382);
            int i104 = i100 + i101 + ((i102 | i103) * (-880)) + (i103 * 880);
            int i105 = (i104 << 13) ^ i104;
            int i106 = i105 ^ (i105 >>> 17);
            i2 = 0;
            ((int[]) objArr64[0])[0] = i106 ^ (i106 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr9 = (String[]) objArr4[4];
            if (strArr9 != null) {
                for (String str18 : strArr9) {
                    arrayList3.add(str18);
                }
            }
            int[] iArr5 = new int[i97];
            int i107 = i97 - 1;
            iArr5[i107] = 1;
            Toast.makeText((Context) null, iArr5[((i97 * i107) % 2) - 1], 1).show();
            int i108 = ((int[]) objArr4[0])[0];
            Object[] objArr65 = {new int[1], new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[]{((int[]) objArr4[3])[0]}, (String[]) objArr4[4]};
            int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 2123900475;
            int i109 = (~((-1400685951) | iCodePointAt2)) | 306217244;
            int i110 = ~((~iCodePointAt2) | 1467862399);
            int i111 = i108 + (-332703741) + ((i109 | i110) * (-470)) + (((~(iCodePointAt2 | (-1094468707))) | i110) * 470);
            int i112 = (i111 << 13) ^ i111;
            int i113 = i112 ^ (i112 >>> 17);
            i2 = 0;
            ((int[]) objArr65[0])[0] = i113 ^ (i113 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
            char scrollDefaultDelay2 = (char) (37567 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
            int i114 = 625 - (TypedValue.complexToFloat(i2) > 0.0f ? 1 : (TypedValue.complexToFloat(i2) == 0.0f ? 0 : -1));
            int i115 = 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr66 = new Object[1];
            a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr66);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(scrollDefaultDelay2, i114, i115, -477065106, false, (String) objArr66[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str10).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            char cAlpha = (char) (37567 - Color.alpha(0));
            int maxKeyCode = 625 - (KeyEvent.getMaxKeyCode() >> 16);
            int iResolveOpacity = 14 - Drawable.resolveOpacity(0, 0);
            byte[] bArr13 = $$a;
            byte b22 = bArr13[7];
            Object[] objArr67 = new Object[1];
            a(b22, bArr13[5], b22, objArr67);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cAlpha, maxKeyCode, iResolveOpacity, -976899241, false, (String) objArr67[0], null);
        }
        if (j2 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char cArgb2 = (char) (Color.argb(0, 0, 0, 0) + 37567);
                int i116 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 624;
                int packedPositionChild = 13 - ExpandableListView.getPackedPositionChild(0L);
                byte b23 = $$a[7];
                byte b24 = b23;
                Object[] objArr68 = new Object[1];
                a(b24, (short) (b24 | 51), b23, objArr68);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cArgb2, i116, packedPositionChild, -973632554, false, (String) objArr68[0], null);
            }
            Object[] objArr69 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
            int i117 = ((int[]) objArr69[2])[0];
            int i118 = ((int[]) objArr69[0])[0];
            String[] strArr10 = (String[]) objArr69[3];
            int[] iArr6 = {i117};
            int iNextInt = new Random().nextInt(769072832);
            int i119 = ((((~(iNextInt | 340466872)) | 1483271248) * 56) - 588159552) + (((~((~iNextInt) | 1483271248)) | 340466872) * 56) + 668121894;
            int i120 = (i119 << 13) ^ i119;
            int i121 = i120 ^ (i120 >>> 17);
            ((int[]) objArr5[1])[0] = i121 ^ (i121 << 5);
            objArr5 = new Object[]{new int[]{i118}, new int[1], iArr6, strArr10};
            str5 = str;
            i3 = 0;
            str6 = str4;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                int i122 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                TuitionPaymentFragmentbindingInflater1 = i122 % 128;
                baseContext3 = i122 % 2 != 0 ? (Context) Class.forName(str14).getMethod(str3, new Class[1]).invoke(null, null) : (Context) Class.forName(str14).getMethod(str3, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            str5 = str;
            int iIntValue2 = ((Integer) Class.forName(str12).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr70 = new Object[1];
            c(new char[]{'\'', '*', '*', 23, 26, 14, 2, '%', '\t', '.', '.', 30, 13891, 13891, 25, 28, '%', 5, ' ', ',', '!', '\'', '/', 26, '/', '\'', 16, 5, ' ', '.', 11, '\f', 7, 25, '\'', 7, 13807, 13807, '#', 22, '.', 30, '\b', Typography.amp, '-', '/', ' ', '\'', 28, 0, '#', 22, '\b', Typography.amp, '(', 14, '\b', '\'', '\f', 17, 16, '/', '(', 14}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 69), Color.red(0) + 64, objArr70);
            String str19 = (String) objArr70[0];
            Object[] objArr71 = new Object[1];
            c(new char[]{24, 22, '%', ' ', '.', 28, 26, '/', '/', '-', '/', 14, '*', '\'', '-', '\t', '\'', 21, ' ', 23, '!', '\'', 2, '%', 17, '\f', 18, '\f', ' ', 18, '\b', '\'', '\f', 18, 30, 4, 11, '-', 28, '*', '\'', '*', 2, '%', Typography.amp, '\f', 13833, 13833, '\t', 25, 13827, 13827, 17, '\f', 21, '\'', 30, 2, Typography.amp, 7, 28, 0, '%', 2}, (byte) (TextUtils.getTrimmedLength("") + 96), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.delete_this_card).substring(11, 12).length() + 63, objArr71);
            Object[] objArr72 = {baseContext3, new String[]{str19, (String) objArr71[0]}, Integer.valueOf(iIntValue2), 17, 668121894};
            byte[] bArr14 = $$d;
            byte b25 = bArr14[109];
            Object[] objArr73 = new Object[1];
            d(b25, (short) (b25 | 258), bArr14[98], objArr73);
            Class<?> cls4 = Class.forName((String) objArr73[0]);
            Object[] objArr74 = new Object[1];
            d(bArr14[4], (short) 396, (byte) 72, objArr74);
            Object[] objArr75 = (Object[]) cls4.getMethod((String) objArr74[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr72);
            int i123 = ((int[]) objArr75[0])[0];
            int i124 = ((int[]) objArr75[2])[0];
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 37568);
                    int i125 = 625 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i126 = 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b26 = $$a[7];
                    byte b27 = b26;
                    Object[] objArr76 = new Object[1];
                    a(b27, (short) (b27 | 51), b26, objArr76);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cIndexOf3, i125, i126, -973632554, false, (String) objArr76[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, objArr75);
                try {
                    str6 = str4;
                    long jLongValue7 = ((Long) Class.forName(str10).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char cIndexOf4 = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int iIndexOf4 = TextUtils.indexOf("", "", 0) + 625;
                        int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 15;
                        byte[] bArr15 = $$a;
                        byte b28 = bArr15[7];
                        Object[] objArr77 = new Object[1];
                        a(b28, bArr15[5], b28, objArr77);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cIndexOf4, iIndexOf4, modifierMetaStateMask2, -976899241, false, (String) objArr77[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char c5 = (char) (37568 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int iIndexOf5 = 625 - TextUtils.indexOf("", "", 0, 0);
                        int iIndexOf6 = 14 - TextUtils.indexOf("", "", 0, 0);
                        Object[] objArr78 = new Object[1];
                        a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr78);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c5, iIndexOf5, iIndexOf6, -477065106, false, (String) objArr78[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                str6 = str4;
                objArr75 = objArr75;
            }
            objArr5 = objArr75;
            i3 = 0;
        }
        if (((int[]) objArr5[2])[i3] != ((int[]) objArr5[i3])[i3]) {
            int i127 = i3;
            ArrayList arrayList4 = new ArrayList();
            String[] strArr11 = (String[]) objArr5[3];
            if (strArr11 != null) {
                for (int i128 = i127; i128 < strArr11.length; i128++) {
                    arrayList4.add(strArr11[i128]);
                }
            }
            throw null;
        }
        Object[] objArr79 = new Object[4];
        int[] iArr7 = new int[1];
        objArr79[i3] = iArr7;
        objArr79[1] = new int[1];
        int[] iArr8 = new int[1];
        objArr79[2] = iArr8;
        int i129 = ((int[]) objArr5[1])[i3];
        int i130 = ((int[]) objArr5[2])[i3];
        int i131 = ((int[]) objArr5[i3])[i3];
        String[] strArr12 = (String[]) objArr5[3];
        iArr8[i3] = i130;
        iArr7[i3] = i131;
        int iNextInt2 = new Random().nextInt(717028763);
        int i132 = ~((-264725) | iNextInt2);
        int i133 = ~iNextInt2;
        int i134 = i129 + (-978086840) + ((i132 | (~((-1822572673) | i133))) * 920) + (((~((-900725) | i133)) | 264724) * 920) + (((~(iNextInt2 | (-1822572673))) | (~((-264725) | i133)) | (~((-636001) | iNextInt2))) * 920);
        int i135 = (i134 << 13) ^ i134;
        int i136 = i135 ^ (i135 >>> 17);
        ((int[]) objArr79[1])[0] = i136 ^ (i136 << 5);
        objArr79[3] = strArr12;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iResolveSize = 2267 - View.resolveSize(0, 0);
            int iIndexOf7 = 32 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte b29 = $$a[7];
            byte b30 = b29;
            Object[] objArr80 = new Object[1];
            a(b30, (short) (b30 | 51), b29, objArr80);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(keyRepeatTimeout, iResolveSize, iIndexOf7, -887667012, false, (String) objArr80[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0') + 2268;
                int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                byte[] bArr16 = $$a;
                byte b31 = bArr16[7];
                Object[] objArr81 = new Object[1];
                a(b31, (short) (b31 | 103), (byte) (bArr16[33] - 1), objArr81);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(tapTimeout3, iIndexOf8, scrollBarFadeDuration3, -654680577, false, (String) objArr81[0], null);
            }
            Object[] objArr82 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).get(null);
            objArr6 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i137 = ((int[]) objArr82[0])[0];
            int i138 = ((int[]) objArr82[3])[0];
            String[] strArr13 = (String[]) objArr82[1];
            int i139 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i140 = (((((~((-793103720) | i139)) | 788644099) * (-566)) + 504674565) + ((~(i139 | (-4459621))) * 566)) - 1560700529;
            int i141 = (i140 << 13) ^ i140;
            int i142 = i141 ^ (i141 >>> 17);
            ((int[]) objArr6[2])[0] = i142 ^ (i142 << 5);
            str7 = str6;
            c2 = 3;
            str3 = str3;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str14).getMethod(str3, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                if (baseContext4 instanceof ContextWrapper) {
                    int i143 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
                    TuitionPaymentFragmentbindingInflater1 = i143 % 128;
                    if (i143 % 2 != 0) {
                        int i144 = 5 / 0;
                        if (((ContextWrapper) baseContext4).getBaseContext() != null) {
                            baseContext4 = baseContext4.getApplicationContext();
                        } else {
                            baseContext4 = null;
                        }
                    } else if (((ContextWrapper) baseContext4).getBaseContext() != null) {
                        baseContext4 = baseContext4.getApplicationContext();
                    } else {
                        baseContext4 = null;
                    }
                } else {
                    baseContext4 = baseContext4.getApplicationContext();
                }
            }
            Object[] objArr83 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -1560700529};
            byte[] bArr17 = $$d;
            Object[] objArr84 = new Object[1];
            d(bArr17[109], (short) 198, bArr17[278], objArr84);
            Class<?> cls5 = Class.forName((String) objArr84[0]);
            Object[] objArr85 = new Object[1];
            d(bArr17[278], (short) ($$e + 4), bArr17[17], objArr85);
            Object[] objArr86 = (Object[]) cls5.getMethod((String) objArr85[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr83);
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 2267;
                    int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 33;
                    byte[] bArr18 = $$a;
                    byte b32 = bArr18[7];
                    Object[] objArr87 = new Object[1];
                    a(b32, (short) (b32 | 103), (byte) (bArr18[33] - 1), objArr87);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(deadChar2, iArgb2, scrollDefaultDelay3, -654680577, false, (String) objArr87[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, objArr86);
                try {
                    str7 = str6;
                    long jLongValue8 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char offsetAfter3 = (char) TextUtils.getOffsetAfter("", 0);
                        int capsMode = 2267 - TextUtils.getCapsMode("", 0, 0);
                        int iMyPid2 = (Process.myPid() >> 22) + 33;
                        byte[] bArr19 = $$a;
                        byte b33 = bArr19[7];
                        Object[] objArr88 = new Object[1];
                        a(b33, bArr19[5], b33, objArr88);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(offsetAfter3, capsMode, iMyPid2, -874156483, false, (String) objArr88[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                        char c6 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 2268;
                        int bitsPerPixel2 = 32 - ImageFormat.getBitsPerPixel(0);
                        byte b34 = $$a[7];
                        byte b35 = b34;
                        Object[] objArr89 = new Object[1];
                        a(b35, (short) (b35 | 51), b34, objArr89);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c6, modifierMetaStateMask3, bitsPerPixel2, -887667012, false, (String) objArr89[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr86 = objArr86;
                str7 = str6;
                str3 = str3;
            }
            objArr6 = objArr86;
            c2 = 3;
        }
        int i145 = ((int[]) objArr6[c2])[0];
        int i146 = ((int[]) objArr6[0])[0];
        if (i146 != i145) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr14 = (String[]) objArr6[1];
            if (strArr14 != null) {
                for (String str20 : strArr14) {
                    arrayList5.add(str20);
                }
            }
            throw new RuntimeException(String.valueOf(i146));
        }
        Object[] objArr90 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i147 = ((int[]) objArr6[2])[0];
        int i148 = ((int[]) objArr6[0])[0];
        int i149 = ((int[]) objArr6[3])[0];
        String[] strArr15 = (String[]) objArr6[1];
        int i150 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i151 = ~i150;
        int i152 = i147 + 2062910200 + (((~(i151 | 48673947)) | 760039368) * (-1042)) + ((48673947 | i150) * 521) + (((~(i150 | (-760039369))) | 4457608 | (~(i151 | 804255707))) * 521);
        int i153 = (i152 << 13) ^ i152;
        int i154 = i153 ^ (i153 >>> 17);
        ((int[]) objArr90[2])[0] = i154 ^ (i154 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char doubleTapTimeout2 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
            int offsetBefore3 = 1755 - TextUtils.getOffsetBefore("", 0);
            int i155 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            byte[] bArr20 = $$a;
            byte b36 = bArr20[7];
            Object[] objArr91 = new Object[1];
            a(b36, (short) (b36 | 103), (byte) (bArr20[33] - 1), objArr91);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(doubleTapTimeout2, offsetBefore3, i155, 986134021, false, (String) objArr91[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char threadPriority2 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 1755;
                int iGreen3 = 23 - Color.green(0);
                byte b37 = $$a[7];
                byte b38 = b37;
                Object[] objArr92 = new Object[1];
                a(b38, (short) (b38 | 51), b37, objArr92);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(threadPriority2, iNormalizeMetaState2, iGreen3, 1599039318, false, (String) objArr92[0], null);
            }
            Object[] objArr93 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr93[0])[0]}, new int[]{((int[]) objArr93[1])[0]}, (Object[]) objArr93[2], new int[1], (String[]) objArr93[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i156 = ~iIdentityHashCode3;
            int i157 = (((948059584 + (((~((-318405225) | i156)) | (~(105802798 | iIdentityHashCode3))) * 217)) + (((~(iIdentityHashCode3 | (-318405225))) | 279974464) * 217)) + (((~(105802798 | i156)) | 318405224) * 217)) - 560823983;
            int i158 = (i157 << 13) ^ i157;
            int i159 = i158 ^ (i158 >>> 17);
            ((int[]) objArr7[3])[0] = i159 ^ (i159 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str12).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr94 = {-1813825281};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b((char) ((Process.myTid() >> 22) + 42049), Color.blue(0) + 1726, (ViewConfiguration.getTouchSlop() >> 8) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue3, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).newInstance(objArr94), -560823983, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char size2 = (char) (View.MeasureSpec.getSize(0) + 29944);
                int i160 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iResolveSize2 = View.resolveSize(0, 0) + 23;
                byte b39 = $$a[7];
                byte b40 = b39;
                Object[] objArr95 = new Object[1];
                a(b40, (short) (b40 | 51), b39, objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(size2, i160, iResolveSize2, 1599039318, false, (String) objArr95[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                long jLongValue9 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char c7 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                    int iArgb3 = 1755 - Color.argb(0, 0, 0, 0);
                    int maxKeyCode2 = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b41 = $$a[7];
                    byte b42 = b41;
                    Object[] objArr96 = new Object[1];
                    a(b42, (short) (b42 | 140), b41, objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(c7, iArgb3, maxKeyCode2, 1596667560, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue9 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char c8 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                    int iRed = Color.red(0) + 1755;
                    int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                    byte[] bArr21 = $$a;
                    byte b43 = bArr21[7];
                    Object[] objArr97 = new Object[1];
                    a(b43, (short) (b43 | 103), (byte) (bArr21[33] - 1), objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c8, iRed, threadPriority3, 986134021, false, (String) objArr97[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf14);
                objArr7 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i161 = ((int[]) objArr7[1])[0];
        int i162 = ((int[]) objArr7[0])[0];
        if (i162 == i161) {
            int i163 = ((int[]) objArr7[3])[0];
            Object[] objArr98 = {new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_notification_shopee_app).substring(26, 27).length() + 1540698679;
            int i164 = i163 + (((1203717843 + (((~length) | 346822282) * 1324)) + (((~(length | (-173148277))) | (~(385750702 | length))) * (-1324))) - 622316114);
            int i165 = (i164 << 13) ^ i164;
            int i166 = i165 ^ (i165 >>> 17);
            ((int[]) objArr98[3])[0] = i166 ^ (i166 << 5);
            i4 = 0;
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr16 = (String[]) objArr7[4];
            if (strArr16 != null) {
                for (String str21 : strArr16) {
                    arrayList6.add(str21);
                }
            }
            int[] iArr9 = new int[i162];
            int i167 = i162 - 1;
            iArr9[i167] = 1;
            Toast.makeText((Context) null, iArr9[((i162 * i167) % 2) - 1], 1).show();
            int i168 = ((int[]) objArr7[3])[0];
            Object[] objArr99 = {new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int i169 = ~((int) SystemClock.elapsedRealtime());
            int i170 = ~(961492424 | i169);
            int i171 = i168 + (-2098942815) + ((i170 | (-748889999)) * 764) + (((~(i169 | (-748889999))) | 671294856) * (-1528)) + (((-367792711) | i170) * 764);
            int i172 = (i171 << 13) ^ i171;
            int i173 = i172 ^ (i172 >>> 17);
            i4 = 0;
            ((int[]) objArr99[3])[0] = i173 ^ (i173 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char edgeSlop3 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 877;
            int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr22 = $$a;
            byte b44 = bArr22[7];
            Object[] objArr100 = new Object[1];
            a(b44, (short) (b44 | 103), (byte) (bArr22[33] - 1), objArr100);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(edgeSlop3, iIndexOf9, maximumFlingVelocity, -1650998592, false, (String) objArr100[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int iAlpha3 = 876 - Color.alpha(0);
            int iBlue = 10 - Color.blue(0);
            byte b45 = $$a[7];
            byte b46 = b45;
            Object[] objArr101 = new Object[1];
            a(b46, (short) (b46 | 51), b45, objArr101);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(mode, iAlpha3, iBlue, 2012020043, false, (String) objArr101[0], null);
        }
        if (j3 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                int i174 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
                int windowTouchSlop2 = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr23 = $$a;
                byte b47 = bArr23[7];
                Object[] objArr102 = new Object[1];
                a(b47, bArr23[5], b47, objArr102);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(deadChar3, i174, windowTouchSlop2, 2012931276, false, (String) objArr102[0], null);
            }
            Object[] objArr103 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).get(null);
            objArr8 = new Object[]{new int[]{((int[]) objArr103[0])[0]}, new int[1], new int[]{((int[]) objArr103[2])[0]}, (String[]) objArr103[3]};
            int iNextInt3 = new Random().nextInt();
            int i175 = ~iNextInt3;
            int i176 = (-563751320) + (((~((-690001186) | i175)) | 687898656) * (-1188));
            int i177 = (~(iNextInt3 | 690001185)) | 687898656;
            int i178 = ~(730311414 | i175);
            int i179 = i176 + ((i177 | i178) * 594) + (((~(690001185 | i175)) | (-732413944) | i178) * 594) + 1765484213;
            int i180 = (i179 << 13) ^ i179;
            int i181 = i180 ^ (i180 >>> 17);
            ((int[]) objArr8[1])[0] = i181 ^ (i181 << 5);
            str8 = str3;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                str8 = str3;
                baseContext5 = (Context) Class.forName(str14).getMethod(str8, new Class[0]).invoke(null, null);
            } else {
                str8 = str3;
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            Object[] objArr104 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1765484213};
            byte[] bArr24 = $$d;
            Object[] objArr105 = new Object[1];
            d(bArr24[109], (short) 101, (byte) (-bArr24[388]), objArr105);
            Class<?> cls6 = Class.forName((String) objArr105[0]);
            Object[] objArr106 = new Object[1];
            d(bArr24[278], bArr24[57], bArr24[17], objArr106);
            Object[] objArr107 = (Object[]) cls6.getMethod((String) objArr106[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr104);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                    char threadPriority4 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int scrollDefaultDelay4 = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iIndexOf10 = TextUtils.indexOf("", "", 0) + 10;
                    byte[] bArr25 = $$a;
                    byte b48 = bArr25[7];
                    Object[] objArr108 = new Object[1];
                    a(b48, bArr25[5], b48, objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(threadPriority4, scrollDefaultDelay4, iIndexOf10, 2012931276, false, (String) objArr108[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, objArr107);
                try {
                    long jLongValue11 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                        int i182 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                        byte b49 = $$a[7];
                        byte b50 = b49;
                        Object[] objArr109 = new Object[1];
                        a(b50, (short) (b50 | 51), b49, objArr109);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(scrollBarSize3, edgeSlop4, i182, 2012020043, false, (String) objArr109[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                        char size3 = (char) View.MeasureSpec.getSize(0);
                        int scrollDefaultDelay5 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                        int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 10;
                        byte[] bArr26 = $$a;
                        byte b51 = bArr26[7];
                        Object[] objArr110 = new Object[1];
                        a(b51, (short) (b51 | 103), (byte) (bArr26[33] - 1), objArr110);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(size3, scrollDefaultDelay5, capsMode2, -1650998592, false, (String) objArr110[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf16);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            } else {
                objArr107 = objArr107;
            }
            objArr8 = objArr107;
        }
        int i183 = ((int[]) objArr8[2])[0];
        int i184 = ((int[]) objArr8[0])[0];
        if (i184 != i183) {
            throw new RuntimeException(String.valueOf(i184));
        }
        int i185 = ((int[]) objArr8[1])[0];
        Object[] objArr111 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i186 = ~((-833008286) | iIdentityHashCode4);
        int i187 = 5931420 + ((556175496 | i186) * (-280)) + ((i186 | (~(792698056 | iIdentityHashCode4))) * 140);
        int i188 = ~((-276832790) | iIdentityHashCode4);
        int i189 = ~iIdentityHashCode4;
        int i190 = i185 + i187 + (((~(i189 | 1069530845)) | i188 | (~((-556175497) | i189))) * 140);
        int i191 = (i190 << 13) ^ i190;
        int i192 = i191 ^ (i191 >>> 17);
        ((int[]) objArr111[1])[0] = i192 ^ (i192 << 5);
        int i193 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentbindingInflater1 = i193 % 128;
        int i194 = i193 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
            char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iAlpha4 = Color.alpha(0) + 876;
            int trimmedLength = TextUtils.getTrimmedLength("") + 10;
            Object[] objArr112 = new Object[1];
            a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(keyRepeatDelay2, iAlpha4, trimmedLength, 252381699, false, (String) objArr112[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
            byte b52 = $$a[7];
            byte b53 = b52;
            Object[] objArr113 = new Object[1];
            a(b53, (short) (b53 | 140), b52, objArr113);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(keyRepeatTimeout2, iMakeMeasureSpec2, iMakeMeasureSpec3, 2009631821, false, (String) objArr113[0], null);
        }
        if (j4 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i195 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 10;
                short s = (short) 209;
                Object[] objArr114 = new Object[1];
                a($$a[54], s, (byte) (s >>> 2), objArr114);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(jumpTapTimeout3, i195, maxKeyCode3, 256017550, false, (String) objArr114[0], null);
            }
            Object[] objArr115 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr115[0])[0]}, new int[1], new int[]{((int[]) objArr115[2])[0]}, (String[]) objArr115[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i196 = 1190263120 + (((~(937150893 | startElapsedRealtime)) | (-977461123)) * (-964)) + (((~((~startElapsedRealtime) | 937150893)) | (-1071374256)) * (-964)) + 872098729;
            int i197 = (i196 << 13) ^ i196;
            int i198 = i197 ^ (i197 >>> 17);
            ((int[]) objArr9[1])[0] = i198 ^ (i198 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str14).getMethod(str8, new Class[0]).invoke(null, null);
            }
            if (baseContext6 == null) {
                obj2 = null;
            } else {
                if (baseContext6 instanceof ContextWrapper) {
                    int i199 = TuitionPaymentFragmentbindingInflater1 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i199 % 128;
                    if (i199 % 2 == 0) {
                        ((ContextWrapper) baseContext6).getBaseContext();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) baseContext6).getBaseContext() == null) {
                        baseContext6 = null;
                        obj2 = null;
                    }
                }
                obj2 = null;
                baseContext6 = baseContext6.getApplicationContext();
            }
            Object[] objArr116 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str5, Object.class).invoke(obj2, this)).intValue()), 872098729};
            byte[] bArr27 = $$d;
            byte b54 = bArr27[184];
            short s2 = bArr27[98];
            Object[] objArr117 = new Object[1];
            d(b54, s2, (byte) (s2 | 28), objArr117);
            Class<?> cls7 = Class.forName((String) objArr117[0]);
            Object[] objArr118 = new Object[1];
            d(bArr27[278], (short) 336, bArr27[17], objArr118);
            objArr9 = (Object[]) cls7.getMethod((String) objArr118[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr116);
            if (baseContext6 != null) {
                int i200 = TuitionPaymentFragmentbindingInflater1 + 9;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i200 % 128;
                try {
                    if (i200 % 2 == 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                            char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                            int packedPositionType4 = 876 - ExpandableListView.getPackedPositionType(0L);
                            int scrollDefaultDelay6 = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            short s3 = (short) 209;
                            Object[] objArr119 = new Object[1];
                            a($$a[54], s3, (byte) (s3 >>> 2), objArr119);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(packedPositionType3, packedPositionType4, scrollDefaultDelay6, 256017550, false, (String) objArr119[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, objArr9);
                        long jLongValue13 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[1]).invoke(null, new Object[1])).longValue();
                        Long lValueOf17 = Long.valueOf(jLongValue13);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                            char edgeSlop5 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int iArgb4 = 876 - Color.argb(0, 0, 0, 0);
                            int iIndexOf11 = TextUtils.indexOf("", "") + 10;
                            byte b55 = $$a[7];
                            byte b56 = b55;
                            Object[] objArr120 = new Object[1];
                            a(b56, (short) (b56 | 140), b55, objArr120);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(edgeSlop5, iArgb4, iIndexOf11, 2009631821, false, (String) objArr120[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf17);
                        Long lValueOf18 = Long.valueOf(jLongValue13 >> 16);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                            char c9 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int threadPriority5 = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                            int i201 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                            Object[] objArr121 = new Object[1];
                            a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr121);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c9, threadPriority5, i201, 252381699, false, (String) objArr121[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, lValueOf18);
                    } else {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                            char packedPositionType5 = (char) ExpandableListView.getPackedPositionType(0L);
                            int packedPositionType6 = ExpandableListView.getPackedPositionType(0L) + 876;
                            int i202 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                            short s4 = (short) 209;
                            Object[] objArr122 = new Object[1];
                            a($$a[54], s4, (byte) (s4 >>> 2), objArr122);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(packedPositionType5, packedPositionType6, i202, 256017550, false, (String) objArr122[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, objArr9);
                        long jLongValue14 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf19 = Long.valueOf(jLongValue14);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                            char c10 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                            int deadChar4 = 876 - KeyEvent.getDeadChar(0, 0);
                            int gidForName2 = Process.getGidForName("") + 11;
                            byte b57 = $$a[7];
                            byte b58 = b57;
                            Object[] objArr123 = new Object[1];
                            a(b58, (short) (b58 | 140), b57, objArr123);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(c10, deadChar4, gidForName2, 2009631821, false, (String) objArr123[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf19);
                        Long lValueOf20 = Long.valueOf(jLongValue14 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                            char c11 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int i203 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                            int maxKeyCode4 = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                            Object[] objArr124 = new Object[1];
                            a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr124);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(c11, i203, maxKeyCode4, 252381699, false, (String) objArr124[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf20);
                    }
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
        }
        int i204 = ((int[]) objArr9[2])[0];
        int i205 = ((int[]) objArr9[0])[0];
        if (i205 == i204) {
            int i206 = ((int[]) objArr9[1])[0];
            Object[] objArr125 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            str9 = "currentApplication";
            int i207 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str9, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 8413680;
            int i208 = i206 + (-1806092768) + (((~(512138060 | i207)) | 503450188) * (-502)) + ((~((~i207) | 1055898477)) * (-502)) + (((~(i207 | (-552448290))) | 512138060) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i209 = i208 ^ (i208 << 13);
            int i210 = i209 ^ (i209 >>> 17);
            i6 = 0;
            ((int[]) objArr125[1])[0] = i210 ^ (i210 << 5);
            i5 = 1;
        } else {
            str9 = r8;
            Toast.makeText((Context) null, i205 / (((i205 - 1) * i205) % 2), 0).show();
            int i211 = ((int[]) objArr9[1])[0];
            Object[] objArr126 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int iNextInt4 = new Random().nextInt();
            int i212 = i211 + (-953815252) + (((~(707523486 | iNextInt4)) | (-747833716)) * (-948)) + ((~((~iNextInt4) | (-76548194))) * (-948)) + 270609484;
            int i213 = i212 ^ (i212 << 13);
            int i214 = i213 ^ (i213 >>> 17);
            i5 = 1;
            i6 = 0;
            ((int[]) objArr126[1])[0] = i214 ^ (i214 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) "", '0', i6, i6) + i5);
            int iGreen4 = 651 - Color.green(i6);
            int iGreen5 = Color.green(i6) + 44;
            byte b59 = $$a[7];
            byte b60 = b59;
            Object[] objArr127 = new Object[1];
            a(b60, (short) (b60 | 140), b59, objArr127);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cIndexOf5, iGreen4, iGreen5, -459846511, false, (String) objArr127[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char cRed = (char) Color.red(0);
            int iResolveSize3 = View.resolveSize(0, 0) + 651;
            int scrollBarSize4 = 44 - (ViewConfiguration.getScrollBarSize() >> 8);
            Object[] objArr128 = new Object[1];
            a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr128);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cRed, iResolveSize3, scrollBarSize4, -873460649, false, (String) objArr128[0], null);
        }
        if (j5 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char c12 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 651;
                int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 44;
                byte[] bArr28 = $$a;
                byte b61 = bArr28[7];
                Object[] objArr129 = new Object[1];
                a(b61, (short) (b61 | 103), (byte) (bArr28[33] - 1), objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(c12, iKeyCodeFromString2, windowTouchSlop3, -1595579076, false, (String) objArr129[0], null);
            }
            Object[] objArr130 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr10 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i215 = ((int[]) objArr130[2])[0];
            int i216 = ((int[]) objArr130[0])[0];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i217 = ~iIdentityHashCode5;
            int i218 = ((((-798759979) + ((((~(897588205 | i217)) | (-901019016)) | (~((-897588206) | iIdentityHashCode5))) * (-564))) + ((~(iIdentityHashCode5 | (-897585542))) * 1128)) + (((~((-901019016) | i217)) | 2664) * 564)) - 98187051;
            int i219 = (i218 << 13) ^ i218;
            int i220 = i219 ^ (i219 >>> 17);
            ((int[]) objArr10[3])[0] = i220 ^ (i220 << 5);
            i7 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b((char) TextUtils.indexOf("", ""), MotionEvent.axisFromString("") + 1611, TextUtils.indexOf((CharSequence) "", '0', 0) + 27, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr131 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).newInstance(null), -98187051, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i221 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44;
                Object[] objArr132 = new Object[1];
                a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr132);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(maximumDrawingCacheSize, i221, keyRepeatTimeout3, 2075921419, false, (String) objArr132[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTapTimeout() >> 16), 695 - View.MeasureSpec.getMode(0), 98 - TextUtils.getCapsMode("", 0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetBefore("", 0) + 63406), View.MeasureSpec.getMode(0) + 793, 83 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Integer.TYPE, Integer.TYPE});
            }
            objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).invoke(null, objArr131);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int iMyTid = (Process.myTid() >> 22) + 651;
                int absoluteGravity = 44 - Gravity.getAbsoluteGravity(0, 0);
                byte[] bArr29 = $$a;
                byte b62 = bArr29[7];
                Object[] objArr133 = new Object[1];
                a(b62, (short) (b62 | 103), (byte) (bArr29[33] - 1), objArr133);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cLastIndexOf2, iMyTid, absoluteGravity, -1595579076, false, (String) objArr133[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArr10);
            try {
                long jLongValue16 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char cAlpha2 = (char) Color.alpha(0);
                    int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 651;
                    int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 44;
                    Object[] objArr134 = new Object[1];
                    a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr134);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cAlpha2, keyRepeatDelay3, capsMode3, -873460649, false, (String) objArr134[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char cArgb3 = (char) Color.argb(0, 0, 0, 0);
                    int packedPositionChild2 = 650 - ExpandableListView.getPackedPositionChild(0L);
                    int keyRepeatTimeout4 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44;
                    byte b63 = $$a[7];
                    byte b64 = b63;
                    Object[] objArr135 = new Object[1];
                    a(b64, (short) (b64 | 140), b63, objArr135);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cArgb3, packedPositionChild2, keyRepeatTimeout4, -459846511, false, (String) objArr135[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf22);
                i7 = 0;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i222 = ((int[]) objArr10[i7])[i7];
        int i223 = ((int[]) objArr10[2])[i7];
        if (i223 == i222) {
            Object[] objArr136 = new Object[4];
            int[] iArr10 = new int[1];
            objArr136[i7] = iArr10;
            int[] iArr11 = new int[1];
            objArr136[2] = iArr11;
            objArr136[3] = new int[1];
            int i224 = ((int[]) objArr10[3])[i7];
            int i225 = ((int[]) objArr10[2])[i7];
            int i226 = ((int[]) objArr10[i7])[i7];
            iArr11[i7] = i225;
            iArr10[i7] = i226;
            objArr136[1] = new String[i7];
            int i227 = ((Context) Class.forName(r4).getMethod(str9, new Class[i7]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i228 = i224 + (-946567402) + (((~((-33587361) | i227)) | (~((-30156551) | i227))) * 69) + (((~(i227 | (-769474336))) | (~((-772905146) | i227)) | 739317785) * (-69)) + 423317824;
            int i229 = (i228 << 13) ^ i228;
            int i230 = i229 ^ (i229 >>> 17);
            i8 = 0;
            ((int[]) objArr136[3])[0] = i230 ^ (i230 << 5);
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr17 = (String[]) objArr10[1];
            if (strArr17 != null) {
                int i231 = TuitionPaymentFragmentbindingInflater1 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i231 % 128;
                int i232 = i231 % 2;
                for (String str22 : strArr17) {
                    arrayList7.add(str22);
                }
            }
            Toast.makeText((Context) null, i223 / (((i223 - 1) * i223) % 2), 0).show();
            Object[] objArr137 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i233 = ((int[]) objArr10[3])[0];
            int i234 = ((int[]) objArr10[2])[0];
            int i235 = ((int[]) objArr10[0])[0];
            int i236 = ((Context) Class.forName(r4).getMethod(str9, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i237 = ~i236;
            int i238 = i233 + (-1777159062) + (((~((-1024681169) | i237)) | (-1021250359)) * 519) + (((~(i237 | (-1007878161))) | (~((-13372199) | i236))) * (-519)) + (((~(i236 | (-1021250359))) | 1024681168) * 519);
            int i239 = i238 ^ (i238 << 13);
            int i240 = i239 ^ (i239 >>> 17);
            i8 = 0;
            ((int[]) objArr137[3])[0] = i240 ^ (i240 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char keyRepeatDelay4 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i241 = 1031 - (TypedValue.complexToFloat(i8) > 0.0f ? 1 : (TypedValue.complexToFloat(i8) == 0.0f ? 0 : -1));
            int iRgb = (-16777201) - Color.rgb(i8, i8, i8);
            byte[] bArr30 = $$a;
            byte b65 = bArr30[7];
            Object[] objArr138 = new Object[1];
            a(b65, bArr30[5], b65, objArr138);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(keyRepeatDelay4, i241, iRgb, 1357589585, false, (String) objArr138[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null);
        long jLongValue17 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
            char cIndexOf6 = (char) TextUtils.indexOf("", "", 0);
            int capsMode4 = 1031 - TextUtils.getCapsMode("", 0, 0);
            int edgeSlop6 = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
            byte b66 = $$a[7];
            byte b67 = b66;
            Object[] objArr139 = new Object[1];
            a(b67, (short) (b67 | 51), b66, objArr139);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cIndexOf6, capsMode4, edgeSlop6, 1344079056, false, (String) objArr139[0], null);
        }
        if (j6 == ((jLongValue17 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int iResolveSize4 = 1031 - View.resolveSize(0, 0);
                int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
                Object[] objArr140 = new Object[1];
                a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr140);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cMyPid, iResolveSize4, iResolveSizeAndState, 632103528, false, (String) objArr140[0], null);
            }
            Object[] objArr141 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).get(null);
            objArr11 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i242 = ((int[]) objArr141[3])[0];
            int i243 = ((int[]) objArr141[1])[0];
            String[] strArr18 = (String[]) objArr141[0];
            int iCodePointAt3 = ((Context) Class.forName(r4).getMethod(str9, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_6).substring(3, 4).codePointAt(0) - 1660659509;
            int i244 = (~(230712291 | iCodePointAt3)) | 269454348;
            int i245 = ~iCodePointAt3;
            int i246 = ((((-1630008451) + ((i244 | (~((-25174179) | i245))) * 886)) + (((~(i245 | (-230712292))) | 474992461) * (-1772))) + ((~(i245 | 474992461)) * 886)) - 1395761695;
            int i247 = (i246 << 13) ^ i246;
            int i248 = i247 ^ (i247 >>> 17);
            ((int[]) objArr11[2])[0] = i248 ^ (i248 << 5);
        } else {
            int iIntValue4 = ((Integer) Class.forName(str12).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr142 = {-1813825281};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b((char) (46038 - TextUtils.getOffsetAfter("", 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 1134, 18 - KeyEvent.keyCodeFromString(""), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr143 = {Integer.valueOf(iIntValue4), 0, -1395761695, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).newInstance(objArr142), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                char cIndexOf7 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
                int i249 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte[] bArr31 = $$a;
                byte b68 = bArr31[7];
                Object[] objArr144 = new Object[1];
                a(b68, bArr31[5], b68, objArr144);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cIndexOf7, iCombineMeasuredStates, i249, 1298546779, false, (String) objArr144[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.getDefaultSize(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1117, View.combineMeasuredStates(0, 0) + 17), Boolean.TYPE});
            }
            objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).invoke(null, objArr143);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                char c13 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int i250 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                int iRgb2 = (-16777201) - Color.rgb(0, 0, 0);
                Object[] objArr145 = new Object[1];
                a((byte) ($$a[205] + 1), (short) 103, (byte) 52, objArr145);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(c13, i250, iRgb2, 632103528, false, (String) objArr145[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, objArr11);
            try {
                long jLongValue18 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf23 = Long.valueOf(jLongValue18);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                    char cIndexOf8 = (char) TextUtils.indexOf("", "");
                    int windowTouchSlop4 = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 16;
                    byte b69 = $$a[7];
                    byte b70 = b69;
                    Object[] objArr146 = new Object[1];
                    a(b70, (short) (b70 | 51), b69, objArr146);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(cIndexOf8, windowTouchSlop4, bitsPerPixel3, 1344079056, false, (String) objArr146[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf23);
                Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                    char cIndexOf9 = (char) TextUtils.indexOf("", "", 0, 0);
                    int iIndexOf12 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                    int i251 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                    byte[] bArr32 = $$a;
                    byte b71 = bArr32[7];
                    Object[] objArr147 = new Object[1];
                    a(b71, bArr32[5], b71, objArr147);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(cIndexOf9, iIndexOf12, i251, 1357589585, false, (String) objArr147[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).set(null, lValueOf24);
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        int i252 = ((int[]) objArr11[1])[0];
        int i253 = ((int[]) objArr11[3])[0];
        if (i253 == i252) {
            Object[] objArr148 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i254 = ((int[]) objArr11[2])[0];
            int i255 = ((int[]) objArr11[3])[0];
            int i256 = ((int[]) objArr11[1])[0];
            String[] strArr19 = (String[]) objArr11[0];
            int iNextInt5 = new Random().nextInt();
            int i257 = i254 + 619471748 + (((~((~iNextInt5) | 456948839)) | 75563160) * 529) + (((~(iNextInt5 | 456948839)) | 212668669) * 529);
            int i258 = (i257 << 13) ^ i257;
            int i259 = i258 ^ (i258 >>> 17);
            ((int[]) objArr148[2])[0] = i259 ^ (i259 << 5);
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr20 = (String[]) objArr11[0];
            if (strArr20 != null) {
                for (String str23 : strArr20) {
                    arrayList8.add(str23);
                }
            }
            Toast.makeText((Context) null, i253 / (((i253 - 1) * i253) % 2), 0).show();
            Object[] objArr149 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i260 = ((int[]) objArr11[2])[0];
            int i261 = ((int[]) objArr11[3])[0];
            int i262 = ((int[]) objArr11[1])[0];
            String[] strArr21 = (String[]) objArr11[0];
            int i263 = ((Context) Class.forName(r4).getMethod(str9, new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i264 = ~i263;
            int i265 = (~(594408857 | i264)) | 277872642;
            int i266 = ~(i263 | (-33592473));
            int i267 = i260 + ((i265 | i266) * (-252)) + 1548709217 + ((i266 | (~(i264 | 872281499))) * 252);
            int i268 = (i267 << 13) ^ i267;
            int i269 = i268 ^ (i268 >>> 17);
            ((int[]) objArr149[2])[0] = i269 ^ (i269 << 5);
        }
        super.onCreate();
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        return i2 % 2 != 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, short r6, byte r7) {
        /*
            int r6 = 116 - r6
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r5 = r5 * 3
            int r5 = 4 - r5
            byte[] r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r6 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r5]
        L25:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.$$g(int, short, byte):java.lang.String");
    }
}
