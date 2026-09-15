package com.bpjstku.data.registration.bpu;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.office.model.response.BranchOfficeLocationResponse;
import com.bpjstku.data.office.model.response.RegionalOfficeItem;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequestAuth;
import com.bpjstku.data.registration.bpu.model.request.GetDataSertakanDonaturWebviewRequest;
import com.bpjstku.data.registration.bpu.model.request.InsertJmoPairRequest;
import com.bpjstku.data.registration.bpu.model.request.ListJmoPairRequest;
import com.bpjstku.data.registration.bpu.model.request.ListTuitionRateRequest;
import com.bpjstku.data.registration.bpu.model.request.PhoneVerificationRequestAuth;
import com.bpjstku.data.registration.bpu.model.request.RegisterBpuRequest;
import com.bpjstku.data.registration.bpu.model.request.UpdateProfileBpuRequest;
import com.bpjstku.data.registration.bpu.model.response.CheckResidenceItem;
import com.bpjstku.data.registration.bpu.model.response.GetDataSertakanDonaturResponse;
import com.bpjstku.data.registration.bpu.model.response.JobTitlesItem;
import com.bpjstku.data.registration.bpu.model.response.ListJmoPairResponse;
import com.bpjstku.data.registration.bpu.model.response.ListTuitionRateResponse;
import com.bpjstku.data.registration.bpu.model.response.OfficeLocationsItem;
import com.bpjstku.data.registration.bpu.remote.BPURegistrationApi;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.general.model.response.RegistrationItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.setVideoStabilizationMode;
import defpackage.share;
import defpackage.unbind;
import defpackage.unbindChildren;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0003\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\u0006\u0010\u0003\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\u0006\u0010\u0003\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\u0006\u0010\u0003\u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0003\u001a\u00020\u000eH\u0017¢\u0006\u0004\b$\u0010\u0011J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0003\u001a\u00020%H\u0017¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00072\u0006\u0010\u0003\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b,\u0010\u001aJ\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\u0006\u0010\u0003\u001a\u00020\u0012H\u0017¢\u0006\u0004\b-\u0010\u0015J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0003\u001a\u00020.H\u0017¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u000201H\u0017¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00072\u0006\u0010\u0003\u001a\u00020.H\u0017¢\u0006\u0004\b5\u00100J\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00072\u0006\u0010\u0003\u001a\u000206H\u0017¢\u0006\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010?\u001a\u0004\u0018\u00010>8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B"}, d2 = {"Lcom/bpjstku/data/registration/bpu/BPURegistrationDataStore;", "Lcom/bpjstku/data/registration/bpu/BPURegistrationRepository;", "Lcom/bpjstku/data/registration/bpu/remote/BPURegistrationApi;", "p0", "<init>", "(Lcom/bpjstku/data/registration/bpu/remote/BPURegistrationApi;)V", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postCheckResidenceInfo", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/RegisterBpuRequest;", "Lcom/bpjstku/data/registration/general/model/response/RegistrationItem;", "postRegisterBpu", "(Lcom/bpjstku/data/registration/bpu/model/request/RegisterBpuRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "Lcom/bpjstku/data/lib/model/CodeAndNamePairItem;", "getWorkingLocations", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/response/RegionalOfficeItem;", "getBranchOfficeLocations", "Lcom/bpjstku/data/registration/bpu/model/request/ListTuitionRateRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/ListTuitionRateResponse;", "getTuitionRate", "(Lcom/bpjstku/data/registration/bpu/model/request/ListTuitionRateRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/UpdateProfileBpuRequest;", "updateProfileBpu", "(Lcom/bpjstku/data/registration/bpu/model/request/UpdateProfileBpuRequest;)LderiveCodec;", "checkBpuRegistered", "Lcom/bpjstku/data/registration/bpu/model/request/InsertJmoPairRequest;", "insertJmoPair", "(Lcom/bpjstku/data/registration/bpu/model/request/InsertJmoPairRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/ListJmoPairRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/ListJmoPairResponse;", "listJmoPair", "(Lcom/bpjstku/data/registration/bpu/model/request/ListJmoPairRequest;)LderiveCodec;", "getJobTitles", "postRegisterBpuAuth", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequestAuth;", "postCheckResidenceInfoAuth", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequestAuth;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/PhoneVerificationRequestAuth;", "postPhoneVerificationAuth", "(Lcom/bpjstku/data/registration/bpu/model/request/PhoneVerificationRequestAuth;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/response/CheckResidenceItem;", "checkBpuRegisteredAuth", "Lcom/bpjstku/data/registration/bpu/model/request/GetDataSertakanDonaturWebviewRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/GetDataSertakanDonaturResponse;", "GetDataDonaturSertakan", "(Lcom/bpjstku/data/registration/bpu/model/request/GetDataSertakanDonaturWebviewRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/registration/bpu/remote/BPURegistrationApi;", "getWebService", "()Lcom/bpjstku/data/registration/bpu/remote/BPURegistrationApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BPURegistrationDataStore implements BPURegistrationRepository {
    public static final int $stable = 8;
    private static boolean TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] b;
    private static int g;
    private final Void dbService;
    private final BPURegistrationApi webService;
    private static final byte[] $$c = {48, -119, -71, 110};
    private static final int $$f = 13;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {114, -115, 48, 84, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -67, 14, -25, 11, 7, -10, -7, 69, -64, -3, 10, -2, -8, Base64.padSymbol, -69, 12, -13, -5, 15, -15, -2, 69, -28, -38, 9, -6, -14, 12, 4, -18, 19, -12, 39, -34, -16, 18, -9, -4, 40, -51, 1, -2, 4, 1, 7, -14, 34, -20, -9, 4, 1, -18, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64};
    private static final int $$e = 154;
    private static final byte[] $$a = {59, -124, -78, 46, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 197;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f403a = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r5 = r5 + 4
            byte[] r1 = com.bpjstku.data.registration.bpu.BPURegistrationDataStore.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r5 = r5 + 1
            r3 = r1[r5]
        L26:
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.bpu.BPURegistrationDataStore.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 15
            int r5 = 99 - r5
            byte[] r0 = com.bpjstku.data.registration.bpu.BPURegistrationDataStore.$$d
            int r6 = r6 * 31
            int r1 = 69 - r6
            int r7 = r7 * 68
            int r7 = 72 - r7
            byte[] r1 = new byte[r1]
            int r6 = 68 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r5 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2b:
            int r4 = -r4
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.bpu.BPURegistrationDataStore.f(int, short, short, java.lang.Object[]):void");
    }

    public BPURegistrationDataStore(BPURegistrationApi bPURegistrationApi) {
        Intrinsics.checkNotNullParameter(bPURegistrationApi, "");
        this.webService = bPURegistrationApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7716getDbService() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        mergeChildrenConfigs mergechildrenconfigs = (mergeChildrenConfigs) getDbService();
        int i4 = f403a + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return mergechildrenconfigs;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getWebService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ unbindChildren m7717getWebService() {
        int i = 2 % 2;
        int i2 = f403a + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        BPURegistrationApi webService = getWebService();
        int i4 = f403a + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return webService;
    }

    public final BPURegistrationApi getWebService() {
        int i = 2 % 2;
        int i2 = f403a + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.webService;
        }
        throw null;
    }

    public final Void getDbService() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        f403a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.dbService;
        }
        throw null;
    }

    private static final VerificationItem postEmailVerification$lambda$1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        f403a = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (VerificationItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<VerificationItem> postEmailVerification(EmailVerificationRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostEmailVerification = getWebService().postEmailVerification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostEmailVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$Kgv0VR6fHDbL2uHMv6zNDp7L4Fc((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$gG2q8kFVD9Ng_xY0W8wmV7zQKXQ(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final VerificationItem postPhoneVerification$lambda$3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        VerificationItem verificationItem = (VerificationItem) function1.invoke(obj);
        int i4 = f403a + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return verificationItem;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<VerificationItem> postPhoneVerification(PhoneVerificationRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostPhoneVerification = getWebService().postPhoneVerification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostPhoneVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$KjGqA00NU379yei2ieisJhMu97I((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda29
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$9MgCVxvik2Tc2Yxav9t5pqgZE_Y(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = f403a + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final BaseItem postCheckResidenceInfo$lambda$4(CheckResidenceItem checkResidenceItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(checkResidenceItem, "");
        CheckResidenceItem checkResidenceItem2 = checkResidenceItem;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        f403a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return checkResidenceItem2;
    }

    private static final BaseItem postCheckResidenceInfo$lambda$5(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        f403a = i3 % 128;
        int i4 = i3 % 2;
        return baseItem;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<BaseItem> postCheckResidenceInfo(CheckResidenceInfoRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CheckResidenceItem>> derivecodecPostCheckResidenceInfo = getWebService().postCheckResidenceInfo(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostCheckResidenceInfo, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$WLgUa861kZOGQtTdWSJwVaw0J84((CheckResidenceItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$GQk134B1YLSkGfFXIQB05Gc5M3w(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = f403a + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final RegistrationItem postRegisterBpu$lambda$7(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        RegistrationItem registrationItem = (RegistrationItem) function1.invoke(obj);
        int i4 = f403a + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return registrationItem;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<RegistrationItem> postRegisterBpu(RegisterBpuRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<RegistrationItem>> derivecodecPostRegisterBpu = getWebService().postRegisterBpu(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostRegisterBpu, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$i58ki2RCMbjhX8umrzzVfjxg8hA((RegistrationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda33
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$Z4H5JFkYuilc_zibL01DBRDJueM(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        f403a = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = b;
        long j = 0;
        char c = '0';
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) (31340 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)));
                        int iLastIndexOf = TextUtils.lastIndexOf("", c, i3) + 2995;
                        int iIndexOf = TextUtils.indexOf("", c, i3, i3) + 18;
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iLastIndexOf, iIndexOf, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                    c = '0';
                    i3 = 0;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43326), Color.alpha(0) + 253, View.MeasureSpec.makeMeasureSpec(0, 0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i5 = 1687675375;
        if (TuitionPaymentFragmentbindingInflater1) {
            int i6 = $11 + 55;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33603), View.resolveSizeAndState(0, 0, 0) + 3085, (ViewConfiguration.getLongPressTimeout() >> 16) + 26, -2146875848, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i8 = $10 + 41;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i10 = $10 + 111;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - Color.argb(0, 0, 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3084, 25 - TextUtils.lastIndexOf("", '0', 0), -2146875848, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i5 = 1687675375;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i13 = $10 + 93;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i12 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    private static final List getWorkingLocations$lambda$8(OfficeLocationsItem officeLocationsItem) {
        List<CodeAndNamePairItem> data;
        int i = 2 % 2;
        int i2 = f403a + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(officeLocationsItem, "");
            data = officeLocationsItem.getData();
            int i3 = 31 / 0;
        } else {
            Intrinsics.checkNotNullParameter(officeLocationsItem, "");
            data = officeLocationsItem.getData();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        f403a = i4 % 128;
        int i5 = i4 % 2;
        return data;
    }

    private static final List getWorkingLocations$lambda$9(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i3 = f403a + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return list;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getWorkingLocations(BaseRequest p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) (31533 - (ViewConfiguration.getWindowTouchSlop() >> 8));
            int mode = View.MeasureSpec.getMode(0) + 921;
            int iAxisFromString = MotionEvent.axisFromString("") + 29;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[80];
            Object[] objArr3 = new Object[1];
            c(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, mode, iAxisFromString, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(null, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31533);
            int maximumDrawingCacheSize = 921 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            c(bArr2[7], bArr2[37], (byte) 52, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, maximumDrawingCacheSize, iIndexOf, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 31533);
                int capsMode = 921 - TextUtils.getCapsMode("", 0, 0);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                byte b4 = $$a[37];
                Object[] objArr7 = new Object[1];
                c((byte) 51, b4, (byte) (b4 | 36), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, capsMode, maximumFlingVelocity, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr8[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{i2}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = 2139271263 + ((~((~iIdentityHashCode) | 1605369467)) * (-116)) + ((529454202 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | (-1244625442))) | 168710176) * 116) + 845320958;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i6 = f403a + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            Object[] objArr11 = new Object[1];
            e(null, null, 127 - TextUtils.indexOf("", "", 0, 0), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(null, null, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i8 = f403a + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 845320958};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[77];
                Object[] objArr14 = new Object[1];
                f(b5, b5, bArr3[5], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b6 = bArr3[5];
                Object[] objArr15 = new Object[1];
                f(b6, b6, bArr3[77], objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                    int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
                    int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                    byte b7 = $$a[37];
                    Object[] objArr17 = new Object[1];
                    c((byte) 51, b7, (byte) (b7 | 36), objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, i10, iCombineMeasuredStates, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    e(null, null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    e(null, null, TextUtils.getTrimmedLength("") + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 921;
                        int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27;
                        byte[] bArr4 = $$a;
                        Object[] objArr20 = new Object[1];
                        c(bArr4[7], bArr4[37], (byte) 52, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, scrollDefaultDelay, i11, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 31533);
                        int i12 = 921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iIndexOf2 = 28 - TextUtils.indexOf("", "", 0, 0);
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        byte b9 = bArr5[80];
                        Object[] objArr21 = new Object[1];
                        c(b8, b9, b9, objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, i12, iIndexOf2, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i16}, (String[]) objArr[4]};
            int iMyPid = Process.myPid();
            int i17 = i15 + (((~((-652691480) | iMyPid)) | 606095379) * (-566)) + 1226680477 + ((~(iMyPid | (-46596101))) * 566);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[0])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i20 = f403a + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                int i21 = 2;
                int i22 = i20 % 2;
                int i23 = 0;
                while (i23 < strArr.length) {
                    int i24 = f403a + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
                    if (i24 % i21 != 0) {
                        arrayList.add(strArr[i23]);
                        i23 += 29;
                    } else {
                        arrayList.add(strArr[i23]);
                        i23++;
                    }
                    i21 = 2;
                }
            }
            int[] iArr = new int[i14];
            int i25 = i14 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i25) % 2) - 1], 1).show();
            int i26 = ((int[]) objArr[0])[0];
            int i27 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i27}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i28 = ~iIdentityHashCode2;
            int i29 = i26 + 505690711 + (((~(812340386 | i28)) | 961739257) * (-328)) + ((iIdentityHashCode2 | 961739257) * 164) + (((~(iIdentityHashCode2 | (-812340387))) | 809652384 | (~(i28 | 964427259))) * 164);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr2[0])[0] = i31 ^ (i31 << 5);
            int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            f403a = i32 % 128;
            int i33 = i32 % 2;
        }
        deriveCodec<Response<OfficeLocationsItem>> workingLocations = getWebService().getWorkingLocations(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(workingLocations, unbindVar);
        BPURegistrationDataStore$$ExternalSyntheticLambda24 bPURegistrationDataStore$$ExternalSyntheticLambda24 = new BPURegistrationDataStore$$ExternalSyntheticLambda24(new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$nn83DmYxs7ZMybGJ_9XWVl1GzCU((OfficeLocationsItem) obj);
            }
        });
        share.b(bPURegistrationDataStore$$ExternalSyntheticLambda24, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, bPURegistrationDataStore$$ExternalSyntheticLambda24);
        int i34 = ((int[]) objArr2[0])[0];
        int i35 = ((((i34 * i34) - (~(-(242081734 * i34)))) - 1) - (~(-(i34 * 848662122)))) - 1;
        int i36 = (i35 & 153309760) + (153309760 | i35);
        int i37 = i36 >> 18;
        int i38 = (((i37 | (-32767)) << 1) - (i37 ^ (-32767))) / 16384;
        int i39 = (i36 - (~((i38 ^ 1) + ((i38 & 1) << 1)))) - 1;
        int i40 = ((i36 >> 19) - 16383) / 8192;
        int i41 = -(i39 ^ (((i40 | 1) << 1) - (i40 ^ 1)));
        int i42 = ((i41 | 3) << 1) - (i41 ^ 3);
        int i43 = i42 >> 25;
        int i44 = ((i43 ^ (-255)) + ((i43 & (-255)) << 1)) / 128;
        int i45 = (i44 ^ 1) + ((i44 & 1) << 1);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "11\\9\\28\\map(...)".substring(37464 / (((-(((i45 | 1) << 1) - (i45 ^ 1))) & i42) * 1561)));
        return api23Impl;
    }

    private static final List getBranchOfficeLocations$lambda$10(BranchOfficeLocationResponse branchOfficeLocationResponse) {
        int i = 2 % 2;
        int i2 = f403a + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(branchOfficeLocationResponse, "");
        List<RegionalOfficeItem> data = branchOfficeLocationResponse.getData();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        f403a = i4 % 128;
        if (i4 % 2 != 0) {
            return data;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final List getBranchOfficeLocations$lambda$11(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (List) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        int i3 = 2 / 0;
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<List<RegionalOfficeItem>> getBranchOfficeLocations(BaseRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BranchOfficeLocationResponse>> branchOfficeLocations = getWebService().getBranchOfficeLocations(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(branchOfficeLocations, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$wl29iBuTSUPxdazJULmQrca11oM((BranchOfficeLocationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.m7714$r8$lambda$jEPOSst09hOKw2AxfVFaC1kxd4(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        f403a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 56 / 0;
        }
        return api23Impl;
    }

    private static final ListTuitionRateResponse getTuitionRate$lambda$13(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ListTuitionRateResponse listTuitionRateResponse = (ListTuitionRateResponse) function1.invoke(obj);
        int i4 = f403a + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return listTuitionRateResponse;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<ListTuitionRateResponse> getTuitionRate(ListTuitionRateRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ListTuitionRateResponse>> tuitionRate = getWebService().getTuitionRate(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(tuitionRate, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$Xmf85PdOi9JbbLDusRB2z0_x508((ListTuitionRateResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda10
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$TtkPrvd86M1zOA6OKIVVSh2BUYY(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        f403a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
        return api23Impl;
    }

    private static final RegistrationItem updateProfileBpu$lambda$15(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        RegistrationItem registrationItem = (RegistrationItem) function1.invoke(obj);
        int i4 = f403a + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return registrationItem;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<RegistrationItem> updateProfileBpu(UpdateProfileBpuRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<RegistrationItem>> derivecodecPostUpdateProfileBpu = getWebService().postUpdateProfileBpu(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostUpdateProfileBpu, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$CQRGSooB_tnX_N8BZpA4d4AhwHo((RegistrationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda27
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$LZAKZhslSM3S8783gEACUPzYFDw(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        f403a = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final BaseItem checkBpuRegistered$lambda$16(CheckResidenceItem checkResidenceItem) {
        CheckResidenceItem checkResidenceItem2;
        int i = 2 % 2;
        int i2 = f403a + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(checkResidenceItem, "");
            checkResidenceItem2 = checkResidenceItem;
            int i3 = 37 / 0;
        } else {
            Intrinsics.checkNotNullParameter(checkResidenceItem, "");
            checkResidenceItem2 = checkResidenceItem;
        }
        int i4 = f403a + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return checkResidenceItem2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final BaseItem checkBpuRegistered$lambda$17(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        f403a = i3 % 128;
        int i4 = i3 % 2;
        return baseItem;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<BaseItem> checkBpuRegistered(CheckResidenceInfoRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CheckResidenceItem>> derivecodecCheckBpuRegistered = getWebService().checkBpuRegistered(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckBpuRegistered, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$oQ4TUGQZ6yiVSXxUGgl0yWEzICo((CheckResidenceItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda21
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$1LkhdhRZMiGe4lOR41nlbZjAjXA(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final BaseItem insertJmoPair$lambda$19(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        f403a = i4 % 128;
        if (i4 % 2 != 0) {
            return baseItem;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<BaseItem> insertJmoPair(InsertJmoPairRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecInsertJmoPair = getWebService().insertJmoPair(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecInsertJmoPair, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$bhVjE0hbDswtHjM1hUl5fkAUjaA((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$Dc60SCMFf7ECBO7fRzCSPljZL78(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final ListJmoPairResponse listJmoPair$lambda$21(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ListJmoPairResponse listJmoPairResponse = (ListJmoPairResponse) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        f403a = i4 % 128;
        if (i4 % 2 != 0) {
            return listJmoPairResponse;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<ListJmoPairResponse> listJmoPair(ListJmoPairRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ListJmoPairResponse>> derivecodecListJmoPair = getWebService().listJmoPair(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecListJmoPair, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.m7715$r8$lambda$khUOh8mm0GXqHUXwibW_QmeG7U((ListJmoPairResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda6
            private static final byte[] $$a = {49, -45, -112, 57};
            private static final int $$b = 234;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int b = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -5949257290339971889L;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59705, 59746, 59756, 59740, 59730, 59757, 59759, 59757, 59756, 59753, 59731, 59753, 59751, 59757, 59698, 59771, 59751, 59757, 59714, 59715, 59746, 59749, 59770, 59751, 59746, 59770, 59738, 59716, 59749, 59718, 59700, 59731, 59753, 59756, 59757, 59759, 59757, 59730, 59740, 59756, 59756, 59759, 59757, 59744, 59746, 59756, 59746, 59745, 59871, 59857, 59867, 59853, 59867, 59870, 59871, 59865, 59871, 59854, 59842, 59859, 59859, 59726, 59790, 59790, 59773, 59769, 59786, 59764, 59786, 59785, 59766, 59768, 59729, 59747, 59778, 59745, 59751, 59783, 59791, 59788, 59783, 59778, 59791, 59752, 59759, 59786, 59788, 59776, 59789, 59791, 59785, 59721, 59751, 59718, 59727, 59714, 59704, 59756, 59757, 59753, 59745, 59751, 59742, 59736, 59753, 59744, 59770, 59771, 59774, 59770, 59758, 59744, 59744, 59724, 59739, 59751, 59759, 59751, 59768, 59750, 59749, 59773, 59736, 59715, 59759, 59744, 59768, 59738, 59699, 59743, 59744, 59768, 59749, 59708, 59747, 59759, 59757, 59757, 59751, 59733, 59728, 59771, 59768, 59745, 59705, 59744, 59768, 59775, 59745, 59756, 59745, 59747, 59733, 59723, 59718, 59749, 59716, 59738, 59770, 59746, 59751, 59770, 59749, 59746, 59715, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59705, 59743, 59743, 59751, 59745, 59746, 59744, 59746, 59746, 59757, 59757, 59751, 59745, 59753, 59757, 59756, 59756, 59749, 59768, 59761, 59888, 59890, 59898, 59902, 59901, 59901, 59894, 59401, 59889, 59880, 59846, 59848, 59850, 59870, 59865, 59883, 59401, 59889, 59896, 59868, 59881, 59406, 59894, 59895, 59401, 59888, 59896, 59888, 59860, 59869, 59889, 59889, 59903};

            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = b + 41;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                if (i3 % 2 == 0) {
                    BPURegistrationDataStore.m7712$r8$lambda$EouvMAlnlScVj62tmF38CH2Ig(function1, obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ListJmoPairResponse listJmoPairResponseM7712$r8$lambda$EouvMAlnlScVj62tmF38CH2Ig = BPURegistrationDataStore.m7712$r8$lambda$EouvMAlnlScVj62tmF38CH2Ig(function1, obj);
                int i4 = b + 101;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                return listJmoPairResponseM7712$r8$lambda$EouvMAlnlScVj62tmF38CH2Ig;
            }

            private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
                char c;
                int i3 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (true) {
                    c = '0';
                    if (getrealtimecapturelatency.b >= cArr.length) {
                        break;
                    }
                    int i4 = $11 + 21;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getSize(0) + 19472), Color.red(0) + 2624, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                        try {
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.getOffsetBefore("", 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 480, Color.red(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                int i7 = $11 + 61;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i9 = $10 + 115;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        try {
                            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39421 - TextUtils.lastIndexOf("", c)), KeyEvent.keyCodeFromString("") + 481, ExpandableListView.getPackedPositionType(0L) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            throw null;
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    try {
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 39422), 481 - View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        c = '0';
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Code duplicated, block: B:33:0x00dc A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:31:0x00c4, B:33:0x00dc, B:34:0x0114, B:45:0x0193, B:47:0x01a0, B:48:0x01dc, B:39:0x012e, B:41:0x0147, B:42:0x0180), top: B:71:0x00c4 }] */
            /* JADX WARN: Code duplicated, block: B:38:0x0127  */
            /* JADX WARN: Code duplicated, block: B:41:0x0147 A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:31:0x00c4, B:33:0x00dc, B:34:0x0114, B:45:0x0193, B:47:0x01a0, B:48:0x01dc, B:39:0x012e, B:41:0x0147, B:42:0x0180), top: B:71:0x00c4 }] */
            private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
                int i2;
                char c;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i3 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i4 = 0;
                int i5 = iArr[0];
                int i6 = 1;
                int i7 = iArr[1];
                int i8 = iArr[2];
                int i9 = iArr[3];
                char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i10 = 0;
                    while (i10 < length) {
                        try {
                            Object[] objArr2 = new Object[i6];
                            objArr2[i4] = Integer.valueOf(cArr[i10]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char size = (char) View.MeasureSpec.getSize(i4);
                                int maximumFlingVelocity = 1270 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 19;
                                byte b2 = (byte) i4;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, maximumFlingVelocity, iIndexOf, 407021364, false, $$c(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                            i10++;
                            i4 = 0;
                            i6 = 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i7];
                System.arraycopy(cArr, i5, cArr3, 0, i7);
                if (bArr != null) {
                    char[] cArr4 = new char[i7];
                    setvideostabilizationmode.b = 0;
                    int i11 = $10 + 61;
                    $11 = i11 % 128;
                    int i12 = 2;
                    int i13 = i11 % 2;
                    char c2 = 0;
                    while (setvideostabilizationmode.b < i7) {
                        int i14 = $11 + 5;
                        $10 = i14 % 128;
                        if (i14 % i12 == 0) {
                            c = 1;
                            if (bArr[setvideostabilizationmode.b] == 1) {
                                int i15 = setvideostabilizationmode.b;
                                char c3 = cArr3[setvideostabilizationmode.b];
                                Object[] objArr3 = new Object[2];
                                objArr3[c] = Integer.valueOf(c2);
                                objArr3[0] = Integer.valueOf(c3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), 3225 - ExpandableListView.getPackedPositionGroup(0L), 13 - (KeyEvent.getMaxKeyCode() >> 16), 2133916302, false, $$c(b4, b5, (byte) (b5 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            } else {
                                int i16 = setvideostabilizationmode.b;
                                Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b6 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1755 - TextUtils.indexOf("", "", 0), 22 - ImageFormat.getBitsPerPixel(0), 387247676, false, $$c(b6, b6, (byte) $$a.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).charValue();
                            }
                        } else if (bArr[setvideostabilizationmode.b] == 0) {
                            c = 1;
                            int i17 = setvideostabilizationmode.b;
                            char c4 = cArr3[setvideostabilizationmode.b];
                            try {
                                Object[] objArr5 = new Object[2];
                                objArr5[c] = Integer.valueOf(c2);
                                objArr5[0] = Integer.valueOf(c4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), 3225 - ExpandableListView.getPackedPositionGroup(0L), 13 - (KeyEvent.getMaxKeyCode() >> 16), 2133916302, false, $$c(b7, b8, (byte) (b8 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).charValue();
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            int i18 = setvideostabilizationmode.b;
                            Object[] objArr6 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b9 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1755 - TextUtils.indexOf("", "", 0), 22 - ImageFormat.getBitsPerPixel(0), 387247676, false, $$c(b9, b9, (byte) $$a.length), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr6)).charValue();
                        }
                        c2 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr7 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - Gravity.getAbsoluteGravity(0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1704, 21 - View.MeasureSpec.getMode(0), -1434471773, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7);
                        i12 = 2;
                    }
                    cArr3 = cArr4;
                }
                if (i9 > 0) {
                    char[] cArr5 = new char[i7];
                    i2 = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i7);
                    int i19 = i7 - i9;
                    System.arraycopy(cArr5, 0, cArr3, i19, i9);
                    System.arraycopy(cArr5, i9, cArr3, 0, i19);
                } else {
                    i2 = 0;
                }
                if (z) {
                    char[] cArr6 = new char[i7];
                    while (true) {
                        setvideostabilizationmode.b = i2;
                        if (setvideostabilizationmode.b >= i7) {
                            break;
                        }
                        cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                        i2 = setvideostabilizationmode.b + 1;
                    }
                    cArr3 = cArr6;
                }
                if (i8 > 0) {
                    int i20 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i20;
                        if (setvideostabilizationmode.b >= i7) {
                            break;
                        }
                        int i21 = $10 + 87;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        i20 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v12 */
            /* JADX WARN: Type inference failed for: r5v0, types: [int] */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [int] */
            /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v38 */
            /* JADX WARN: Type inference failed for: r5v39 */
            /* JADX WARN: Type inference failed for: r5v5 */
            /* JADX WARN: Type inference failed for: r5v67 */
            /* JADX WARN: Type inference failed for: r5v68 */
            /* JADX WARN: Type inference failed for: r7v10 */
            /* JADX WARN: Type inference failed for: r8v3 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r25, int r26, int r27) {
                /*
                    Method dump skipped, instruction units count: 3147
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda6.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(byte r7, short r8, int r9) {
                /*
                    int r7 = r7 * 2
                    int r7 = 4 - r7
                    int r8 = r8 * 4
                    int r8 = 1 - r8
                    int r9 = 105 - r9
                    byte[] r0 = com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda6.$$a
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r9 = r7
                    r3 = r8
                    r4 = r2
                    goto L29
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r8) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L23:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L29:
                    int r7 = r7 + r3
                    int r9 = r9 + 1
                    r3 = r4
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda6.$$c(byte, short, int):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = f403a + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final List getJobTitles$lambda$22(JobTitlesItem jobTitlesItem) {
        List<CodeAndNamePairItem> data;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        f403a = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jobTitlesItem, "");
            data = jobTitlesItem.getData();
            int i3 = 91 / 0;
        } else {
            Intrinsics.checkNotNullParameter(jobTitlesItem, "");
            data = jobTitlesItem.getData();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        f403a = i4 % 128;
        int i5 = i4 % 2;
        return data;
    }

    private static final List getJobTitles$lambda$23(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        f403a = i3 % 128;
        if (i3 % 2 != 0) {
            return list;
        }
        throw null;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getJobTitles(BaseRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JobTitlesItem>> jobTitles = getWebService().getJobTitles(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(jobTitles, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$L1Xjoplr9DSapcHLcgDPre88eiM((JobTitlesItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda31
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$btil44UWB2D6_RIsqSNOIlkhsQk(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        f403a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return api23Impl;
    }

    private static final RegistrationItem postRegisterBpuAuth$lambda$25(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (RegistrationItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        RegistrationItem registrationItem = (RegistrationItem) function1.invoke(obj);
        int i3 = 47 / 0;
        return registrationItem;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<RegistrationItem> postRegisterBpuAuth(RegisterBpuRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<RegistrationItem>> derivecodecPostRegisterBpuAuth = getWebService().postRegisterBpuAuth(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostRegisterBpuAuth, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.m7710$r8$lambda$1xNhYQPIYuv3PC5bTOg2hZEP1I((RegistrationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.m7713$r8$lambda$hHPlOYQLmxd4eKx3ftjaX_qcv8(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = f403a + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final BaseItem postCheckResidenceInfoAuth$lambda$26(CheckResidenceItem checkResidenceItem) {
        int i = 2 % 2;
        int i2 = f403a + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(checkResidenceItem, "");
        CheckResidenceItem checkResidenceItem2 = checkResidenceItem;
        int i4 = f403a + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return checkResidenceItem2;
    }

    private static final BaseItem postCheckResidenceInfoAuth$lambda$27(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (BaseItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<BaseItem> postCheckResidenceInfoAuth(CheckResidenceInfoRequestAuth p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CheckResidenceItem>> derivecodecPostCheckResidenceInfoAuth = getWebService().postCheckResidenceInfoAuth(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostCheckResidenceInfoAuth, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$Ev7osPjrH8whe6t4prQzDPZXxwg((CheckResidenceItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda17
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$zqwDyaq_m4gX5oHlmkoJ0warqeI(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        f403a = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final VerificationItem postPhoneVerificationAuth$lambda$29(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        VerificationItem verificationItem = (VerificationItem) function1.invoke(obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        f403a = i3 % 128;
        if (i3 % 2 != 0) {
            return verificationItem;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<VerificationItem> postPhoneVerificationAuth(PhoneVerificationRequestAuth p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostPhoneVerificationAuth = getWebService().postPhoneVerificationAuth(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostPhoneVerificationAuth, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$DtnsaiT1ZQlKB0Bg4sTATTgPSEg((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda19
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.m7711$r8$lambda$47lumlQPEMILv2UgExCt0GTyBM(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final CheckResidenceItem checkBpuRegisteredAuth$lambda$31(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (CheckResidenceItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<CheckResidenceItem> checkBpuRegisteredAuth(CheckResidenceInfoRequestAuth p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CheckResidenceItem>> derivecodecCheckBpuRegisteredAuth = getWebService().checkBpuRegisteredAuth(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckBpuRegisteredAuth, unbindVar);
        final BPURegistrationDataStore$$ExternalSyntheticLambda25 bPURegistrationDataStore$$ExternalSyntheticLambda25 = new BPURegistrationDataStore$$ExternalSyntheticLambda25();
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda26
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$ikS8ywRh4ctNCr_P70pPWw0VKA8(bPURegistrationDataStore$$ExternalSyntheticLambda25, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final GetDataSertakanDonaturResponse GetDataDonaturSertakan$lambda$33(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        GetDataSertakanDonaturResponse getDataSertakanDonaturResponse = (GetDataSertakanDonaturResponse) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        f403a = i4 % 128;
        int i5 = i4 % 2;
        return getDataSertakanDonaturResponse;
    }

    @Override // com.bpjstku.data.registration.bpu.BPURegistrationRepository
    public final deriveCodec<GetDataSertakanDonaturResponse> GetDataDonaturSertakan(GetDataSertakanDonaturWebviewRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<GetDataSertakanDonaturResponse>> derivecodecGetDataDonaturSertakan = getWebService().GetDataDonaturSertakan(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecGetDataDonaturSertakan, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$Fg_jw47DC5jPmVvDkIfXVPzSWCk((GetDataSertakanDonaturResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BPURegistrationDataStore.$r8$lambda$KHZmjq2aLHoAZFoPfhSRil0mYFc(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    public static /* synthetic */ BaseItem $r8$lambda$1LkhdhRZMiGe4lOR41nlbZjAjXA(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        f403a = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            checkBpuRegistered$lambda$17(function1, obj);
            obj2.hashCode();
            throw null;
        }
        BaseItem baseItemCheckBpuRegistered$lambda$17 = checkBpuRegistered$lambda$17(function1, obj);
        int i3 = f403a + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return baseItemCheckBpuRegistered$lambda$17;
        }
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$1xNhYQPIYuv3PC5bT-Og2hZEP1I, reason: not valid java name */
    public static /* synthetic */ RegistrationItem m7710$r8$lambda$1xNhYQPIYuv3PC5bTOg2hZEP1I(RegistrationItem registrationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        f403a = i2 % 128;
        if (i2 % 2 == 0) {
            postRegisterBpuAuth$lambda$24(registrationItem);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RegistrationItem registrationItemPostRegisterBpuAuth$lambda$24 = postRegisterBpuAuth$lambda$24(registrationItem);
        int i3 = f403a + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
        }
        return registrationItemPostRegisterBpuAuth$lambda$24;
    }

    /* JADX INFO: renamed from: $r8$lambda$47lumlQPE-MILv2UgExCt0GTyBM, reason: not valid java name */
    public static /* synthetic */ VerificationItem m7711$r8$lambda$47lumlQPEMILv2UgExCt0GTyBM(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        f403a = i2 % 128;
        if (i2 % 2 != 0) {
            return postPhoneVerificationAuth$lambda$29(function1, obj);
        }
        postPhoneVerificationAuth$lambda$29(function1, obj);
        throw null;
    }

    public static /* synthetic */ CheckResidenceItem $r8$lambda$5vhk2qpotjqwVNGkZEuc8GY9GQ8(CheckResidenceItem checkResidenceItem) {
        int i = 2 % 2;
        int i2 = f403a + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        CheckResidenceItem checkResidenceItemCheckBpuRegisteredAuth$lambda$30 = checkBpuRegisteredAuth$lambda$30(checkResidenceItem);
        int i4 = f403a + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return checkResidenceItemCheckBpuRegisteredAuth$lambda$30;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$9MgCVxvik2Tc2Yxav9t5pqgZE_Y(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        f403a = i2 % 128;
        if (i2 % 2 == 0) {
            postPhoneVerification$lambda$3(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        VerificationItem verificationItemPostPhoneVerification$lambda$3 = postPhoneVerification$lambda$3(function1, obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        f403a = i3 % 128;
        int i4 = i3 % 2;
        return verificationItemPostPhoneVerification$lambda$3;
    }

    public static /* synthetic */ RegistrationItem $r8$lambda$CQRGSooB_tnX_N8BZpA4d4AhwHo(RegistrationItem registrationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        f403a = i2 % 128;
        if (i2 % 2 != 0) {
            return updateProfileBpu$lambda$14(registrationItem);
        }
        updateProfileBpu$lambda$14(registrationItem);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$Dc60SCMFf7ECBO7fRzCSPljZL78(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemInsertJmoPair$lambda$19 = insertJmoPair$lambda$19(function1, obj);
        int i4 = f403a + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return baseItemInsertJmoPair$lambda$19;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$DtnsaiT1ZQlKB0Bg4sTATTgPSEg(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = f403a + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemPostPhoneVerificationAuth$lambda$28 = postPhoneVerificationAuth$lambda$28(verificationItem);
        int i4 = f403a + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return verificationItemPostPhoneVerificationAuth$lambda$28;
    }

    /* JADX INFO: renamed from: $r8$lambda$EouvMAlnlScV-j62tmF38CH-2Ig, reason: not valid java name */
    public static /* synthetic */ ListJmoPairResponse m7712$r8$lambda$EouvMAlnlScVj62tmF38CH2Ig(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ListJmoPairResponse listJmoPairResponseListJmoPair$lambda$21 = listJmoPair$lambda$21(function1, obj);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return listJmoPairResponseListJmoPair$lambda$21;
    }

    public static /* synthetic */ BaseItem $r8$lambda$Ev7osPjrH8whe6t4prQzDPZXxwg(CheckResidenceItem checkResidenceItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        f403a = i2 % 128;
        if (i2 % 2 != 0) {
            return postCheckResidenceInfoAuth$lambda$26(checkResidenceItem);
        }
        postCheckResidenceInfoAuth$lambda$26(checkResidenceItem);
        throw null;
    }

    public static /* synthetic */ GetDataSertakanDonaturResponse $r8$lambda$Fg_jw47DC5jPmVvDkIfXVPzSWCk(GetDataSertakanDonaturResponse getDataSertakanDonaturResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        f403a = i2 % 128;
        if (i2 % 2 == 0) {
            GetDataDonaturSertakan$lambda$32(getDataSertakanDonaturResponse);
            throw null;
        }
        GetDataSertakanDonaturResponse getDataSertakanDonaturResponseGetDataDonaturSertakan$lambda$32 = GetDataDonaturSertakan$lambda$32(getDataSertakanDonaturResponse);
        int i3 = f403a + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 39 / 0;
        }
        return getDataSertakanDonaturResponseGetDataDonaturSertakan$lambda$32;
    }

    public static /* synthetic */ BaseItem $r8$lambda$GQk134B1YLSkGfFXIQB05Gc5M3w(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            postCheckResidenceInfo$lambda$5(function1, obj);
            throw null;
        }
        BaseItem baseItemPostCheckResidenceInfo$lambda$5 = postCheckResidenceInfo$lambda$5(function1, obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        f403a = i3 % 128;
        int i4 = i3 % 2;
        return baseItemPostCheckResidenceInfo$lambda$5;
    }

    public static /* synthetic */ GetDataSertakanDonaturResponse $r8$lambda$KHZmjq2aLHoAZFoPfhSRil0mYFc(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            GetDataDonaturSertakan$lambda$33(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        GetDataSertakanDonaturResponse getDataSertakanDonaturResponseGetDataDonaturSertakan$lambda$33 = GetDataDonaturSertakan$lambda$33(function1, obj);
        int i3 = f403a + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return getDataSertakanDonaturResponseGetDataDonaturSertakan$lambda$33;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$Kgv0VR6fHDbL2uHMv6zNDp7L4Fc(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemPostEmailVerification$lambda$0 = postEmailVerification$lambda$0(verificationItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        f403a = i4 % 128;
        int i5 = i4 % 2;
        return verificationItemPostEmailVerification$lambda$0;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$KjGqA00NU379yei2ieisJhMu97I(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = f403a + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemPostPhoneVerification$lambda$2 = postPhoneVerification$lambda$2(verificationItem);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        f403a = i5 % 128;
        int i6 = i5 % 2;
        return verificationItemPostPhoneVerification$lambda$2;
    }

    public static /* synthetic */ List $r8$lambda$L1Xjoplr9DSapcHLcgDPre88eiM(JobTitlesItem jobTitlesItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        f403a = i2 % 128;
        if (i2 % 2 == 0) {
            getJobTitles$lambda$22(jobTitlesItem);
            throw null;
        }
        List jobTitles$lambda$22 = getJobTitles$lambda$22(jobTitlesItem);
        int i3 = f403a + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return jobTitles$lambda$22;
    }

    public static /* synthetic */ RegistrationItem $r8$lambda$LZAKZhslSM3S8783gEACUPzYFDw(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        RegistrationItem registrationItemUpdateProfileBpu$lambda$15 = updateProfileBpu$lambda$15(function1, obj);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        f403a = i5 % 128;
        int i6 = i5 % 2;
        return registrationItemUpdateProfileBpu$lambda$15;
    }

    public static /* synthetic */ List $r8$lambda$LdjhqwHRcrh2HdtPuDXOzJ3p_wc(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        List workingLocations$lambda$9 = getWorkingLocations$lambda$9(function1, obj);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        int i5 = f403a + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return workingLocations$lambda$9;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ ListTuitionRateResponse $r8$lambda$TtkPrvd86M1zOA6OKIVVSh2BUYY(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ListTuitionRateResponse tuitionRate$lambda$13 = getTuitionRate$lambda$13(function1, obj);
        int i4 = f403a + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return tuitionRate$lambda$13;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$WLgUa861kZOGQtTdWSJwVaw0J84(CheckResidenceItem checkResidenceItem) {
        int i = 2 % 2;
        int i2 = f403a + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            postCheckResidenceInfo$lambda$4(checkResidenceItem);
            throw null;
        }
        BaseItem baseItemPostCheckResidenceInfo$lambda$4 = postCheckResidenceInfo$lambda$4(checkResidenceItem);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        f403a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
        return baseItemPostCheckResidenceInfo$lambda$4;
    }

    public static /* synthetic */ ListTuitionRateResponse $r8$lambda$Xmf85PdOi9JbbLDusRB2z0_x508(ListTuitionRateResponse listTuitionRateResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        ListTuitionRateResponse tuitionRate$lambda$12 = getTuitionRate$lambda$12(listTuitionRateResponse);
        int i4 = f403a + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return tuitionRate$lambda$12;
    }

    public static /* synthetic */ RegistrationItem $r8$lambda$Z4H5JFkYuilc_zibL01DBRDJueM(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        RegistrationItem registrationItemPostRegisterBpu$lambda$7 = postRegisterBpu$lambda$7(function1, obj);
        int i4 = f403a + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return registrationItemPostRegisterBpu$lambda$7;
    }

    public static /* synthetic */ BaseItem $r8$lambda$bhVjE0hbDswtHjM1hUl5fkAUjaA(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        f403a = i2 % 128;
        if (i2 % 2 != 0) {
            return insertJmoPair$lambda$18(baseItem);
        }
        insertJmoPair$lambda$18(baseItem);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List $r8$lambda$btil44UWB2D6_RIsqSNOIlkhsQk(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        List jobTitles$lambda$23 = getJobTitles$lambda$23(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        f403a = i4 % 128;
        if (i4 % 2 != 0) {
            return jobTitles$lambda$23;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$gG2q8kFVD9Ng_xY0W8wmV7zQKXQ(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemPostEmailVerification$lambda$1 = postEmailVerification$lambda$1(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        f403a = i4 % 128;
        int i5 = i4 % 2;
        return verificationItemPostEmailVerification$lambda$1;
    }

    /* JADX INFO: renamed from: $r8$lambda$hHPl-OYQLmxd4eKx3ftjaX_qcv8, reason: not valid java name */
    public static /* synthetic */ RegistrationItem m7713$r8$lambda$hHPlOYQLmxd4eKx3ftjaX_qcv8(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        RegistrationItem registrationItemPostRegisterBpuAuth$lambda$25 = postRegisterBpuAuth$lambda$25(function1, obj);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        int i5 = f403a + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return registrationItemPostRegisterBpuAuth$lambda$25;
    }

    public static /* synthetic */ RegistrationItem $r8$lambda$i58ki2RCMbjhX8umrzzVfjxg8hA(RegistrationItem registrationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        RegistrationItem registrationItemPostRegisterBpu$lambda$6 = postRegisterBpu$lambda$6(registrationItem);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return registrationItemPostRegisterBpu$lambda$6;
    }

    public static /* synthetic */ CheckResidenceItem $r8$lambda$ikS8ywRh4ctNCr_P70pPWw0VKA8(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        CheckResidenceItem checkResidenceItemCheckBpuRegisteredAuth$lambda$31 = checkBpuRegisteredAuth$lambda$31(function1, obj);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        f403a = i5 % 128;
        if (i5 % 2 != 0) {
            return checkResidenceItemCheckBpuRegisteredAuth$lambda$31;
        }
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$jEPOSst09hOKw-2AxfVFaC1kxd4, reason: not valid java name */
    public static /* synthetic */ List m7714$r8$lambda$jEPOSst09hOKw2AxfVFaC1kxd4(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f403a + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            getBranchOfficeLocations$lambda$11(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        List branchOfficeLocations$lambda$11 = getBranchOfficeLocations$lambda$11(function1, obj);
        int i3 = f403a + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return branchOfficeLocations$lambda$11;
    }

    /* JADX INFO: renamed from: $r8$lambda$khUOh8mm0-GXqHUXwibW_QmeG7U, reason: not valid java name */
    public static /* synthetic */ ListJmoPairResponse m7715$r8$lambda$khUOh8mm0GXqHUXwibW_QmeG7U(ListJmoPairResponse listJmoPairResponse) {
        int i = 2 % 2;
        int i2 = f403a + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            listJmoPair$lambda$20(listJmoPairResponse);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ListJmoPairResponse listJmoPairResponseListJmoPair$lambda$20 = listJmoPair$lambda$20(listJmoPairResponse);
        int i3 = f403a + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return listJmoPairResponseListJmoPair$lambda$20;
    }

    public static /* synthetic */ List $r8$lambda$nn83DmYxs7ZMybGJ_9XWVl1GzCU(OfficeLocationsItem officeLocationsItem) {
        int i = 2 % 2;
        int i2 = f403a + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        List workingLocations$lambda$8 = getWorkingLocations$lambda$8(officeLocationsItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        f403a = i4 % 128;
        int i5 = i4 % 2;
        return workingLocations$lambda$8;
    }

    public static /* synthetic */ BaseItem $r8$lambda$oQ4TUGQZ6yiVSXxUGgl0yWEzICo(CheckResidenceItem checkResidenceItem) {
        int i = 2 % 2;
        int i2 = f403a + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemCheckBpuRegistered$lambda$16 = checkBpuRegistered$lambda$16(checkResidenceItem);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = f403a + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return baseItemCheckBpuRegistered$lambda$16;
        }
        throw null;
    }

    public static /* synthetic */ List $r8$lambda$wl29iBuTSUPxdazJULmQrca11oM(BranchOfficeLocationResponse branchOfficeLocationResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        List branchOfficeLocations$lambda$10 = getBranchOfficeLocations$lambda$10(branchOfficeLocationResponse);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        f403a = i4 % 128;
        if (i4 % 2 != 0) {
            return branchOfficeLocations$lambda$10;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$zqwDyaq_m4gX5oHlmkoJ0warqeI(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemPostCheckResidenceInfoAuth$lambda$27 = postCheckResidenceInfoAuth$lambda$27(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        f403a = i4 % 128;
        if (i4 % 2 != 0) {
            return baseItemPostCheckResidenceInfoAuth$lambda$27;
        }
        throw null;
    }

    static {
        g = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = d + 81;
        g = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
        }
    }

    private static final GetDataSertakanDonaturResponse GetDataDonaturSertakan$lambda$32(GetDataSertakanDonaturResponse getDataSertakanDonaturResponse) {
        int i = 2 % 2;
        int i2 = f403a + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getDataSertakanDonaturResponse, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        f403a = i4 % 128;
        if (i4 % 2 != 0) {
            return getDataSertakanDonaturResponse;
        }
        throw null;
    }

    private static final CheckResidenceItem checkBpuRegisteredAuth$lambda$30(CheckResidenceItem checkResidenceItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(checkResidenceItem, "");
        if (i3 != 0) {
            return checkResidenceItem;
        }
        throw null;
    }

    private static final ListTuitionRateResponse getTuitionRate$lambda$12(ListTuitionRateResponse listTuitionRateResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(listTuitionRateResponse, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        f403a = i4 % 128;
        int i5 = i4 % 2;
        return listTuitionRateResponse;
    }

    private static final BaseItem insertJmoPair$lambda$18(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        f403a = i4 % 128;
        if (i4 % 2 != 0) {
            return baseItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ListJmoPairResponse listJmoPair$lambda$20(ListJmoPairResponse listJmoPairResponse) {
        int i = 2 % 2;
        int i2 = f403a + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(listJmoPairResponse, "");
        if (i3 == 0) {
            return listJmoPairResponse;
        }
        throw null;
    }

    private static final VerificationItem postEmailVerification$lambda$0(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = f403a + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationItem, "");
        int i4 = f403a + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return verificationItem;
        }
        throw null;
    }

    private static final VerificationItem postPhoneVerification$lambda$2(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = f403a + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationItem, "");
        if (i3 == 0) {
            return verificationItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final VerificationItem postPhoneVerificationAuth$lambda$28(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = f403a + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        f403a = i4 % 128;
        if (i4 % 2 != 0) {
            return verificationItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final RegistrationItem postRegisterBpu$lambda$6(RegistrationItem registrationItem) {
        int i = 2 % 2;
        int i2 = f403a + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(registrationItem, "");
        int i4 = f403a + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return registrationItem;
    }

    private static final RegistrationItem postRegisterBpuAuth$lambda$24(RegistrationItem registrationItem) {
        int i = 2 % 2;
        int i2 = f403a + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(registrationItem, "");
        int i4 = f403a + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return registrationItem;
        }
        throw null;
    }

    private static final RegistrationItem updateProfileBpu$lambda$14(RegistrationItem registrationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        f403a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(registrationItem, "");
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return registrationItem;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = new char[]{47464, 47515, 47461, 47511, 47514, 47456, 47451, 47510, 47478, 47504, 47509, 47460, 47516, 47430, 47517, 47462, 47518, 47513, 47479, 47432, 47507, 47477, 47457, 47508, 47519, 47458, 47425};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719689;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        TuitionPaymentFragmentbindingInflater1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, int r6, short r7) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = com.bpjstku.data.registration.bpu.BPURegistrationDataStore.$$c
            int r6 = 68 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r7]
        L26:
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.bpu.BPURegistrationDataStore.$$g(byte, int, short):java.lang.String");
    }
}
