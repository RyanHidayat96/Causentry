package com.bpjstku.data.devicebinding;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.devicebinding.model.request.CheckMembershipRequest;
import com.bpjstku.data.devicebinding.model.request.LivenessBeginRequest;
import com.bpjstku.data.devicebinding.model.request.LivenessEndRequest;
import com.bpjstku.data.devicebinding.model.request.SendEmailOtpRequest;
import com.bpjstku.data.devicebinding.model.request.SubmitDeviceBindingRequest;
import com.bpjstku.data.devicebinding.model.request.VerifyOtpRequest;
import com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessEndResponse;
import com.bpjstku.data.devicebinding.model.response.SendEmailOtpResponse;
import com.bpjstku.data.devicebinding.model.response.SubmitDeviceBindingResponse;
import com.bpjstku.data.devicebinding.remote.DeviceBindingApi;
import com.bpjstku.data.lib.model.BaseItem;
import defpackage.Api23Impl;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2InteropExtender;
import defpackage.LayoutSettings;
import defpackage.createCameraSelectorById;
import defpackage.deriveCodec;
import defpackage.initSession;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.share;
import defpackage.unbind;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/bpjstku/data/devicebinding/DeviceBindingDataStore;", "Lcom/bpjstku/data/devicebinding/DeviceBindingRepository;", "Lcom/bpjstku/data/devicebinding/remote/DeviceBindingApi;", "p0", "<init>", "(Lcom/bpjstku/data/devicebinding/remote/DeviceBindingApi;)V", "", "Lcom/bpjstku/data/devicebinding/model/request/CheckMembershipRequest;", "p1", "LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/response/CheckMembershipResponse;", "checkMembership", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/CheckMembershipRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/SendEmailOtpRequest;", "Lcom/bpjstku/data/devicebinding/model/response/SendEmailOtpResponse;", "sendEmailOtp", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/SendEmailOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/VerifyOtpRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "verifyOtp", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/VerifyOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/SubmitDeviceBindingRequest;", "Lcom/bpjstku/data/devicebinding/model/response/SubmitDeviceBindingResponse;", "submitDeviceBinding", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/SubmitDeviceBindingRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/LivenessBeginRequest;", "Lcom/bpjstku/data/devicebinding/model/response/LivenessBeginResponse;", "livenessBegin", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/LivenessBeginRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/LivenessEndRequest;", "Lcom/bpjstku/data/devicebinding/model/response/LivenessEndResponse;", "livenessEnd", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/LivenessEndRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/devicebinding/remote/DeviceBindingApi;", "getWebService", "()Lcom/bpjstku/data/devicebinding/remote/DeviceBindingApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceBindingDataStore implements DeviceBindingRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final DeviceBindingApi webService;

    public DeviceBindingDataStore(DeviceBindingApi deviceBindingApi) {
        Intrinsics.checkNotNullParameter(deviceBindingApi, "");
        this.webService = deviceBindingApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7599getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final DeviceBindingApi m7600getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.devicebinding.DeviceBindingRepository
    public final deriveCodec<CheckMembershipResponse> checkMembership(String p0, CheckMembershipRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<CheckMembershipResponse>> derivecodecCheckMembership = m7600getWebService().checkMembership(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckMembership, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceBindingDataStore.checkMembership$lambda$0((CheckMembershipResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return DeviceBindingDataStore.checkMembership$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckMembershipResponse checkMembership$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CheckMembershipResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckMembershipResponse checkMembership$lambda$0(CheckMembershipResponse checkMembershipResponse) {
        Intrinsics.checkNotNullParameter(checkMembershipResponse, "");
        Intrinsics.checkNotNullParameter(checkMembershipResponse, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(checkMembershipResponse.getHaveMembership(), strB);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(checkMembershipResponse.getHavePengajuan(), strB);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(checkMembershipResponse.isSuccessful(), strB);
        String message = checkMembershipResponse.getMessage();
        return new CheckMembershipResponse(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, checkMembershipResponse.getStatusCode(), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(checkMembershipResponse.isSuspend(), strB), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(checkMembershipResponse.isSuspendAntol(), strB), message, checkMembershipResponse.isSuccessfulRaw(), checkMembershipResponse.getHaveMembershipRaw(), checkMembershipResponse.getHavePengajuanRaw(), checkMembershipResponse.isSuspendRaw(), checkMembershipResponse.isSuspendAntolRaw());
    }

    @Override // com.bpjstku.data.devicebinding.DeviceBindingRepository
    public final deriveCodec<SendEmailOtpResponse> sendEmailOtp(String p0, SendEmailOtpRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<SendEmailOtpResponse>> derivecodecSendEmailOtp = m7600getWebService().sendEmailOtp(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecSendEmailOtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceBindingDataStore.sendEmailOtp$lambda$2((SendEmailOtpResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda9
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return DeviceBindingDataStore.sendEmailOtp$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendEmailOtpResponse sendEmailOtp$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SendEmailOtpResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.devicebinding.DeviceBindingRepository
    public final deriveCodec<BaseItem> verifyOtp(String p0, VerifyOtpRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<BaseItem>> derivecodecVerifyOtp = m7600getWebService().verifyOtp(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyOtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceBindingDataStore.verifyOtp$lambda$4((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return DeviceBindingDataStore.verifyOtp$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyOtp$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.devicebinding.DeviceBindingRepository
    public final deriveCodec<SubmitDeviceBindingResponse> submitDeviceBinding(String p0, SubmitDeviceBindingRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<SubmitDeviceBindingResponse>> derivecodecSubmitDeviceBinding = m7600getWebService().submitDeviceBinding(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecSubmitDeviceBinding, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceBindingDataStore.submitDeviceBinding$lambda$6((SubmitDeviceBindingResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return DeviceBindingDataStore.submitDeviceBinding$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmitDeviceBindingResponse submitDeviceBinding$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SubmitDeviceBindingResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.devicebinding.DeviceBindingRepository
    public final deriveCodec<LivenessBeginResponse> livenessBegin(String p0, LivenessBeginRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<LivenessBeginResponse>> derivecodecLivenessBegin = m7600getWebService().livenessBegin(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecLivenessBegin, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceBindingDataStore.livenessBegin$lambda$8((LivenessBeginResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda2
            private static final byte[] $$c = {25, 31, 20, 1};
            private static final int $$d = 26;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {17, 104, 102, -28};
            private static final int $$b = 68;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722466;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda2.$$a
                    int r6 = r6 * 2
                    int r6 = r6 + 98
                    int r8 = r8 * 3
                    int r8 = 3 - r8
                    int r7 = r7 * 4
                    int r1 = r7 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L2e
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r8 = r8 + 1
                    if (r3 != r7) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2e:
                    int r6 = r6 + r8
                    r8 = r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda2.c(byte, short, byte, java.lang.Object[]):void");
            }

            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                LivenessBeginResponse livenessBeginResponseLivenessBegin$lambda$9 = DeviceBindingDataStore.livenessBegin$lambda$9(function1, obj);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return livenessBeginResponseLivenessBegin$lambda$9;
                }
                throw null;
            }

            private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i6 = 3291 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int iMyTid = (Process.myTid() >> 22) + 31;
                            byte b = (byte) ($$c[3] - 1);
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, i6, iMyTid, 1199271174, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 652;
                            int fadingEdgeLength = 44 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte b3 = $$c[3];
                            byte b4 = (byte) (b3 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, packedPositionChild, fadingEdgeLength, -450685997, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
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
                if (i3 > 0) {
                    int i7 = $11 + 9;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    int i9 = $11 + 67;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i11 = $10 + 117;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int packedPositionGroup = 651 - ExpandableListView.getPackedPositionGroup(0L);
                            int scrollBarFadeDuration2 = 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte b5 = $$c[3];
                            byte b6 = (byte) (b5 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, packedPositionGroup, scrollBarFadeDuration2, -450685997, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Code duplicated, block: B:101:0x085a A[Catch: Exception -> 0x0884, TRY_LEAVE, TryCatch #7 {Exception -> 0x0884, blocks: (B:71:0x059c, B:73:0x0660, B:75:0x0722, B:77:0x072a, B:80:0x07af, B:83:0x07b7, B:85:0x07f5, B:99:0x0853, B:100:0x0859, B:101:0x085a, B:103:0x085e, B:108:0x0863, B:109:0x0869, B:84:0x07c1, B:74:0x066a), top: B:145:0x059c, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:110:0x086a  */
            /* JADX WARN: Code duplicated, block: B:112:0x0882  */
            /* JADX WARN: Code duplicated, block: B:117:0x08cd  */
            /* JADX WARN: Code duplicated, block: B:118:0x08e0  */
            /* JADX WARN: Code duplicated, block: B:121:0x092a  */
            /* JADX WARN: Code duplicated, block: B:122:0x0958  */
            /* JADX WARN: Code duplicated, block: B:73:0x0660 A[Catch: Exception -> 0x0884, TRY_LEAVE, TryCatch #7 {Exception -> 0x0884, blocks: (B:71:0x059c, B:73:0x0660, B:75:0x0722, B:77:0x072a, B:80:0x07af, B:83:0x07b7, B:85:0x07f5, B:99:0x0853, B:100:0x0859, B:101:0x085a, B:103:0x085e, B:108:0x0863, B:109:0x0869, B:84:0x07c1, B:74:0x066a), top: B:145:0x059c, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:77:0x072a A[Catch: Exception -> 0x0884, TRY_LEAVE, TryCatch #7 {Exception -> 0x0884, blocks: (B:71:0x059c, B:73:0x0660, B:75:0x0722, B:77:0x072a, B:80:0x07af, B:83:0x07b7, B:85:0x07f5, B:99:0x0853, B:100:0x0859, B:101:0x085a, B:103:0x085e, B:108:0x0863, B:109:0x0869, B:84:0x07c1, B:74:0x066a), top: B:145:0x059c, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:80:0x07af A[Catch: Exception -> 0x0884, TRY_ENTER, TryCatch #7 {Exception -> 0x0884, blocks: (B:71:0x059c, B:73:0x0660, B:75:0x0722, B:77:0x072a, B:80:0x07af, B:83:0x07b7, B:85:0x07f5, B:99:0x0853, B:100:0x0859, B:101:0x085a, B:103:0x085e, B:108:0x0863, B:109:0x0869, B:84:0x07c1, B:74:0x066a), top: B:145:0x059c, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:82:0x07b5  */
            /* JADX WARN: Code duplicated, block: B:83:0x07b7 A[Catch: Exception -> 0x0884, TRY_LEAVE, TryCatch #7 {Exception -> 0x0884, blocks: (B:71:0x059c, B:73:0x0660, B:75:0x0722, B:77:0x072a, B:80:0x07af, B:83:0x07b7, B:85:0x07f5, B:99:0x0853, B:100:0x0859, B:101:0x085a, B:103:0x085e, B:108:0x0863, B:109:0x0869, B:84:0x07c1, B:74:0x066a), top: B:145:0x059c, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:87:0x07fd  */
            /* JADX WARN: Code duplicated, block: B:89:0x080e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:90:0x0810  */
            /* JADX WARN: Code duplicated, block: B:92:0x081c  */
            /* JADX WARN: Code duplicated, block: B:93:0x0826  */
            /* JADX WARN: Code duplicated, block: B:95:0x084b  */
            /* JADX WARN: Code duplicated, block: B:96:0x084d  */
            public static Object[] TuitionPaymentFragmentbindingInflater1(int i, int i2) throws Throwable {
                int i3;
                int i4;
                int i5;
                String line;
                int i6;
                Object[] objArr;
                char c;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                String[] strArr;
                Object[] objArr2;
                int[] iArr;
                int i13;
                int i14;
                File file;
                int i15;
                FileReader fileReader;
                BufferedReader bufferedReader;
                boolean zEquals;
                File file2;
                int i16;
                FileReader fileReader2;
                BufferedReader bufferedReader2;
                boolean zEquals2;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23 = 2 % 2;
                int i24 = TuitionPaymentFragmentbindingInflater1 + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
                int i25 = i24 % 2;
                try {
                    String[] strArr2 = new String[2];
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                    int i26 = ~iResolveSizeAndState;
                    int i27 = ~((i26 & (-227)) | (i26 ^ (-227)));
                    int i28 = ~i;
                    int i29 = ~(((-227) ^ i28) | ((-227) & i28));
                    int i30 = (i27 ^ i29) | (i29 & i27);
                    int i31 = ~i;
                    LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i32 = (iResolveSizeAndState ^ 226) | (iResolveSizeAndState & 226);
                    int i33 = ~((i32 ^ i) | (i32 & i));
                    int i34 = ((iResolveSizeAndState * 253) - (-57178)) + ((-252) * ((i30 ^ i33) | (i30 & i33)));
                    int i35 = i32 * (-252);
                    int i36 = (i34 & i35) + (i35 | i34);
                    int i37 = ((-227) ^ i28) | ((-227) & i28);
                    int i38 = ~((i37 & iResolveSizeAndState) | (i37 ^ iResolveSizeAndState));
                    int i39 = i36 + (((i38 & i33) | (i38 ^ i33)) * 252);
                    int i40 = -Color.green(0);
                    int i41 = i40 * 765;
                    int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
                    TuitionPaymentFragmentbindingInflater1 = i42 % 128;
                    int i43 = i42 % 2;
                    int i44 = (i41 ^ (-29013)) + ((i41 & (-29013)) << 1);
                    int i45 = i31 | i40;
                    int i46 = ~i45;
                    int i47 = ((i46 & 19) | (19 ^ i46)) * 764;
                    int i48 = ((i44 | i47) << 1) - (i44 ^ i47);
                    int i49 = ~i40;
                    int i50 = i48 + (((~((i49 & 19) | (i49 ^ 19))) | (~((i31 ^ 19) | (i31 & 19)))) * (-1528));
                    int i51 = ~i40;
                    int i52 = ~((i51 & 19) | (i51 ^ 19));
                    int i53 = ~((i40 & (-20)) | ((-20) ^ i40));
                    int i54 = (i53 & i52) | (i52 ^ i53);
                    int i55 = ~i45;
                    int i56 = ((i54 & i55) | (i54 ^ i55)) * 764;
                    int i57 = (i50 & i56) + (i56 | i50);
                    int i58 = -Color.argb(0, 0, 0, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i59 = (i58 * 465) - 6945;
                    int i60 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i61 = ~(((-16) ^ i60) | (i60 & (-16)));
                    int i62 = ((-16) ^ i58) | ((-16) & i58);
                    int i63 = ~i62;
                    int i64 = (i61 ^ i63) | (i63 & i61);
                    int i65 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i66 = ~((i65 ^ i58) | (i65 & i58));
                    int i67 = ((i64 ^ i66) | (i64 & i66)) * 464;
                    int i68 = (i59 ^ i67) + ((i59 & i67) << 1);
                    int i69 = ~i58;
                    int i70 = (i69 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ i69);
                    int i71 = TuitionPaymentFragmentbindingInflater1;
                    int i72 = ((i71 | 23) << 1) - (i71 ^ 23);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i72 % 128;
                    int i73 = i72 % 2;
                    int i74 = (-464) * ((i70 & (-16)) | (i70 ^ (-16)));
                    int i75 = ((i68 | i74) << 1) - (i74 ^ i68);
                    int i76 = ~i62;
                    int i77 = ~((i58 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i58 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    Object[] objArr3 = new Object[1];
                    a(false, i39, i57, (((i77 & i76) | (i76 ^ i77)) * 464) + i75, new char[]{65532, 15, 1, 1, 65535, '\f', 65501, '\t', '\b', '\b', 65535, 65533, 14, 65535, 65534, 3, '\r', 65502, 65535}, objArr3);
                    strArr2[0] = (String) objArr3[0];
                    int iMyPid = Process.myPid() >> 22;
                    int i78 = iMyPid * 628;
                    int i79 = ((i78 | 142556) << 1) - (i78 ^ 142556);
                    int i80 = (i ^ 227) | (i & 227);
                    int i81 = TuitionPaymentFragmentbindingInflater1;
                    int i82 = (i81 ^ 3) + ((i81 & 3) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i82 % 128;
                    int i83 = i82 % 2;
                    int i84 = ~iMyPid;
                    int i85 = (-627) * ((i80 & i84) | (i80 ^ i84));
                    int i86 = ((i79 | i85) << 1) - (i85 ^ i79);
                    int i87 = ~(((-228) & i) | ((-228) ^ i));
                    int i88 = -(-(((i87 & iMyPid) | (iMyPid ^ i87)) * (-627)));
                    int i89 = (i86 ^ i88) + ((i86 & i88) << 1);
                    int i90 = ~((i31 ^ 227) | (i31 & 227));
                    int i91 = ~((iMyPid & i) | (iMyPid ^ i));
                    int i92 = ((i91 & i90) | (i90 ^ i91)) * 627;
                    int i93 = ((i89 | i92) << 1) - (i92 ^ i89);
                    int i94 = -TextUtils.indexOf("", "");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i95 = ~(-(-(i94 * (-963))));
                    int i96 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                    TuitionPaymentFragmentbindingInflater1 = i96 % 128;
                    int i97 = i96 % 2;
                    int i98 = 16405 - i95;
                    int i99 = ~i94;
                    int i100 = ~(((-19) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-19) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i101 = ((i99 & i100) | (i99 ^ i100)) * (-964);
                    int i102 = (i98 & i101) + (i98 | i101);
                    int i103 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i104 = ~((i103 & (-19)) | ((-19) ^ i103));
                    int i105 = ~((i94 & (-19)) | ((-19) ^ i94));
                    int i106 = -(-(((i105 & i104) | (i104 ^ i105)) * (-964)));
                    int i107 = ((i102 | i106) << 1) - (i106 ^ i102);
                    int i108 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i109 = i108 * 592;
                    int i110 = (i109 & (-1770)) + (i109 | (-1770));
                    int i111 = ~i108;
                    int i112 = (i110 - (~((~((i111 ^ 3) | (i111 & 3))) * (-1182)))) - 1;
                    int i113 = ~i108;
                    int i114 = (i113 & (-4)) | (i113 ^ (-4));
                    int i115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i116 = ~((i114 & i115) | (i114 ^ i115));
                    int i117 = ~((i108 & 3) | (i108 ^ 3));
                    int i118 = (i112 - (~(((i117 & i116) | (i116 ^ i117)) * (-591)))) - 1;
                    int i119 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ i111) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i111) | (-4)) * 591;
                    Object[] objArr4 = new Object[1];
                    a(false, i93, i107, ((i118 | i119) << 1) - (i119 ^ i118), new char[]{0, 65534, 11, 16, 65530, 2, '\r', 2, 7, 0, 65503, '\b', 11, 65501, 65534, 65531, 14, 0}, objArr4);
                    strArr2[1] = (String) objArr4[0];
                    int i120 = 0;
                    while (true) {
                        if (i120 >= 2) {
                            i5 = i;
                            break;
                        }
                        String str = strArr2[i120];
                        int i121 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i122 = ((i121 | 219) << 1) - (i121 ^ 219);
                        int size = View.MeasureSpec.getSize(0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i123 = size * 303;
                        int i124 = (i123 ^ (-4816)) + ((i123 & (-4816)) << 1);
                        int i125 = ~size;
                        int i126 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i127 = (i125 & i126) | (i125 ^ i126);
                        int i128 = (i127 & 16) | (i127 ^ 16);
                        int i129 = TuitionPaymentFragmentbindingInflater1;
                        int i130 = (i129 & 37) + (i129 | 37);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i130 % 128;
                        if (i130 % 2 == 0) {
                            int i131 = ~i128;
                            int i132 = ~(size | 16 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                            i21 = i124 / (((i131 & i132) | (i131 ^ i132)) - 302);
                        } else {
                            int i133 = ~i128;
                            int i134 = ~(size | 16 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                            int i135 = ((i133 & i134) | (i133 ^ i134)) * (-302);
                            i21 = (i124 & i135) + (i135 | i124);
                        }
                        int i136 = i129 + 83;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i136 % 128;
                        if (i136 % 2 == 0) {
                            int i137 = ~size;
                            i22 = -((-604) % (~(((i137 & 16) | (i137 ^ 16)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5)));
                        } else {
                            int i138 = ~size;
                            int i139 = (i138 & 16) | (i138 ^ 16);
                            i22 = (-604) * (~((i139 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i139 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5)));
                        }
                        int i140 = (((i21 & i22) + (i22 | i21)) - (~(302 * ((~(size | (-17))) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 16) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 16))))))) - 1;
                        int size2 = View.MeasureSpec.getSize(0);
                        Object[] objArr5 = new Object[1];
                        a(true, i122, i140, (size2 ^ 12) + ((size2 & 12) << 1), new char[]{65508, 65486, 19, 15, 65486, 4, '\t', 15, 18, 4, 14, 1, 7, 21, 2, 5}, objArr5);
                        Class<?> cls = Class.forName((String) objArr5[0]);
                        Method method = cls.getMethod(str, new Class[0]);
                        int i141 = TuitionPaymentFragmentbindingInflater1;
                        int i142 = (i141 & 107) + (i141 | 107);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i142 % 128;
                        int i143 = i142 % 2;
                        if (((Boolean) method.invoke(cls, null)).booleanValue()) {
                            i3 = ~(i & 1);
                            i4 = i | 1;
                            i5 = i3 & i4;
                            break;
                        }
                        i120 = ((i120 & 1) << 1) + (i120 ^ 1);
                    }
                } catch (Exception unused) {
                    i3 = ~(i & 2);
                    i4 = i | 2;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) (2420 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int packedPositionChild = 2844 - ExpandableListView.getPackedPositionChild(0L);
                        int mode = View.MeasureSpec.getMode(0) + 5;
                        byte b = (byte) 0;
                        byte b2 = b;
                        Object[] objArr6 = new Object[1];
                        c(b, b2, b2, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, packedPositionChild, mode, -501222268, false, (String) objArr6[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j = -1076983257;
                    long j2 = 370;
                    long j3 = (j2 * j) + (j2 * jLongValue);
                    long j4 = -369;
                    long startUptimeMillis = (int) Process.getStartUptimeMillis();
                    long j5 = -1;
                    long j6 = startUptimeMillis ^ j5;
                    long j7 = (j ^ j5) | j6;
                    long j8 = j3 + ((j | jLongValue | j6) * j4) + (j4 * (jLongValue | (j7 ^ j5))) + (((long) 369) * ((j5 ^ (j7 | jLongValue)) | (((jLongValue ^ j5) | j) ^ j5) | ((j | startUptimeMillis) ^ j5))) + ((long) (-82203429));
                    int i144 = ~i;
                    int i145 = ~(1699391258 | i144);
                    int i146 = ~(1158349626 | i);
                    int i147 = ((int) (j8 >> 32)) & ((-334238508) + ((i145 | i146) * 1150) + (((~((-1158349627) | i144)) | i146) * (-575)) + (((~(1699391258 | i)) | (~((-1699391259) | i144))) * 575));
                    int i148 = ~(724957041 | i144);
                    int i149 = ((int) j8) & ((((2114833 | i148) * (-374)) - 406325013) + ((i148 | 722842208) * 374));
                    int i150 = (i147 & i149) | (i147 ^ i149);
                    int i151 = (i150 & (-2)) | ((~i150) & 1);
                    int i152 = (i151 | (-i151)) >> 31;
                    int i153 = (i ^ 10) & (~i152);
                    int i154 = TuitionPaymentFragmentbindingInflater1;
                    int i155 = (i154 & 1) + (i154 | 1);
                    int i156 = i155 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i156;
                    int i157 = i155 % 2;
                    int i158 = i152 & i;
                    int i159 = (i158 & i153) | (i153 ^ i158);
                    int i160 = ((~i5) & i) | (i5 & i144);
                    int i161 = i156 + 35;
                    TuitionPaymentFragmentbindingInflater1 = i161 % 128;
                    int i162 = i161 % 2;
                    int i163 = -i160;
                    int i164 = ((i160 & i163) | (i160 ^ i163)) >> 31;
                    int i165 = i159 & (~i164);
                    int i166 = i5 & i164;
                    int i167 = (i165 ^ i166) | (i166 & i165);
                    try {
                        int i168 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int i169 = ((i168 | 224) << 1) - (i168 ^ 224);
                        int i170 = -(-Gravity.getAbsoluteGravity(0, 0));
                        int i171 = -ExpandableListView.getPackedPositionChild(0L);
                        Object[] objArr7 = new Object[1];
                        a(false, i169, ((i170 | 40) << 1) - (i170 ^ 40), ((i171 | 23) << 1) - (i171 ^ 23), new char[]{4, 65484, 17, 15, 65534, 0, 6, 11, 4, 65484, 0, 18, 15, 15, 2, 11, 17, 65532, 17, 15, 65534, 0, 2, 15, 65484, 16, 22, 16, 65484, '\b', 2, 15, 11, 2, '\t', 65484, 1, 2, 65535, 18}, objArr7);
                        File file3 = new File((String) objArr7[0]);
                        int i172 = TuitionPaymentFragmentbindingInflater1;
                        int i173 = (i172 ^ 117) + ((i172 & 117) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i173 % 128;
                        try {
                            if (i173 % 2 == 0) {
                                file3.canRead();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (file3.canRead()) {
                                FileReader fileReader3 = new FileReader(file3);
                                BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                try {
                                    line = bufferedReader3.readLine();
                                    int iResolveOpacity = 235 - Drawable.resolveOpacity(0, 0);
                                    int i174 = 2 - (~(-((Process.getThreadPriority(0) + 20) >> 6)));
                                    int i175 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    int i176 = TuitionPaymentFragmentbindingInflater1;
                                    int i177 = i176 + 19;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i177 % 128;
                                    int i178 = i177 % 2;
                                    int i179 = (-515) * i175;
                                    int i180 = (i179 ^ 517) + ((i179 & 517) << 1);
                                    int i181 = ~(((-2) ^ i) | ((-2) & i));
                                    int i182 = i176 + 35;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i182 % 128;
                                    if (i182 % 2 == 0) {
                                        int i183 = ~((i144 ^ i175) | (i144 & i175));
                                        int i184 = (i181 ^ i183) | (i183 & i181);
                                        int i185 = ~((i144 ^ 1) | (i144 & 1));
                                        i20 = i180 / ((-516) % ((i184 ^ i185) | (i184 & i185)));
                                    } else {
                                        int i186 = ~((i144 ^ i175) | (i144 & i175));
                                        int i187 = (i181 ^ i186) | (i186 & i181);
                                        int i188 = ~i;
                                        int i189 = (i187 | (~((i188 ^ 1) | (i188 & 1)))) * (-516);
                                        i20 = (i180 ^ i189) + ((i189 & i180) << 1);
                                    }
                                    int i190 = ~i175;
                                    int i191 = i190 | (-2);
                                    int i192 = (i190 ^ i144) | (i190 & i144);
                                    int i193 = (i20 - (~(516 * ((~((i191 & i) | (i191 ^ i))) | (~((i192 & 1) | (i192 ^ 1))))))) - 1;
                                    int i194 = ~((i190 & 1) | (i190 ^ 1));
                                    int i195 = ~((~i) | 1);
                                    Object[] objArr8 = new Object[1];
                                    a(true, iResolveOpacity, i174, (i193 - (~(-(-(((i194 & i195) | (i194 ^ i195)) * 516))))) - 1, new char[]{0, 65535, 1}, objArr8);
                                    if (line.equals((String) objArr8[0])) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                    } else {
                                        int i196 = TuitionPaymentFragmentbindingInflater1;
                                        int i197 = (i196 & 109) + (i196 | 109);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i197 % 128;
                                        int i198 = i197 % 2;
                                        fileReader3.close();
                                        bufferedReader3.close();
                                    }
                                    int i199 = -View.getDefaultSize(0, 0);
                                    int i200 = i199 * 375;
                                    int i201 = (i200 ^ (-165834)) + ((i200 & (-165834)) << 1);
                                    int i202 = ~i199;
                                    int i203 = ~((i202 ^ 222) | (i202 & 222));
                                    int i204 = ~i;
                                    int i205 = ~((i204 & i199) | (i204 ^ i199));
                                    int i206 = (i201 - (~(-(-(((i203 & i205) | (i203 ^ i205)) * (-374)))))) - 1;
                                    int i207 = (~(i199 | (-223))) * 748;
                                    int i208 = (i206 ^ i207) + ((i207 & i206) << 1);
                                    int i209 = ~(i202 | (-223));
                                    int i210 = (i208 - (~(((i209 & i205) | (i209 ^ i205)) * 374))) - 1;
                                    int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i211 = (scrollBarSize * 755) - 23343;
                                    int i212 = ~scrollBarSize;
                                    int i213 = ~((i212 ^ 31) | (i212 & 31));
                                    int i214 = ~scrollBarSize;
                                    int i215 = ~((i214 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i214 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                    int i216 = (i213 ^ i215) | (i213 & i215);
                                    int i217 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 31) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 31));
                                    int i218 = ((i216 ^ i217) | (i216 & i217)) * (-754);
                                    int i219 = (i211 ^ i218) + ((i211 & i218) << 1);
                                    int i220 = i214 | 31;
                                    int i221 = ~((i220 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i220 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                    int i222 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i223 = (scrollBarSize & i222) | (i222 ^ scrollBarSize);
                                    int i224 = ~((i223 & 31) | (i223 ^ 31));
                                    int i225 = -(-(((i224 & i221) | (i221 ^ i224)) * (-754)));
                                    Object[] objArr9 = new Object[1];
                                    a(true, i210, (((i212 ^ i222) | (i222 & i212)) * 754) + (i219 ^ i225) + ((i225 & i219) << 1), -TextUtils.indexOf((CharSequence) "", '0'), new char[]{65485, 2, 3, '\n', 0, 65535, '\f', 3, 65533, 3, 1, 65535, 16, 18, 4, 65485, '\n', 3, '\f', 16, 3, '\t', 65485, 17, 23, 17, 65485, 1, '\r', 16, 14}, objArr9);
                                    file = new File((String) objArr9[0]);
                                    if (file.canRead()) {
                                        fileReader = new FileReader(file);
                                        bufferedReader = new BufferedReader(fileReader);
                                        try {
                                            String line2 = bufferedReader.readLine();
                                            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                            int i226 = ~minimumFlingVelocity;
                                            int i227 = ~(i226 | (-174));
                                            int i228 = ~(((-174) & i144) | ((-174) ^ i144));
                                            int i229 = ((minimumFlingVelocity * (-167)) - 28891) + (((i227 & i228) | (i227 ^ i228)) * 168);
                                            int i230 = ~minimumFlingVelocity;
                                            int i231 = (~((i230 & (-174)) | (i230 ^ (-174)) | i)) * 168;
                                            int i232 = (i229 ^ i231) + ((i229 & i231) << 1);
                                            int i233 = ~((i226 ^ i144) | (i226 & i144));
                                            int i234 = ~((i226 & 173) | (i226 ^ 173));
                                            int i235 = -(-(((~((minimumFlingVelocity & (-174)) | ((-174) ^ minimumFlingVelocity) | i)) | (i233 & i234) | (i233 ^ i234)) * 168));
                                            int i236 = ((i235 & i232) << 1) + (i232 ^ i235);
                                            int iNormalizeMetaState = 1 - KeyEvent.normalizeMetaState(0);
                                            int iArgb = Color.argb(0, 0, 0, 0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            int i237 = (iArgb * 491) - 489;
                                            int i238 = ~iArgb;
                                            int i239 = (i238 ^ (-2)) | (i238 & (-2));
                                            int i240 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                            int i241 = -(-(((i239 ^ i240) | (i239 & i240)) * (-490)));
                                            int i242 = ((i237 | i241) << 1) - (i241 ^ i237);
                                            int i243 = ~((iArgb & (-2)) | ((-2) ^ iArgb));
                                            int i244 = ~((-2) | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                                            int i245 = ((i244 & i243) | (i243 ^ i244)) * 490;
                                            int i246 = (i242 ^ i245) + ((i242 & i245) << 1);
                                            int i247 = -(-(i238 * 490));
                                            Object[] objArr10 = new Object[1];
                                            a(false, i236, iNormalizeMetaState, ((i247 & i246) << 1) + (i246 ^ i247), new char[]{0}, objArr10);
                                            zEquals = line2.equals((String) objArr10[0]);
                                            fileReader.close();
                                            bufferedReader.close();
                                            if (zEquals) {
                                                int i248 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                int i249 = ~((-222) | (~i));
                                                int i250 = ~i248;
                                                int i251 = ~((i250 & i) | (i250 ^ i));
                                                int i252 = (((i248 * 371) + 81991) - (~(((i249 & i251) | (i249 ^ i251)) * (-370)))) - 1;
                                                int i253 = (~((~i248) | i144)) | (~(((-222) & i) | ((-222) ^ i)));
                                                int i254 = ~((i248 & 221) | (i248 ^ 221));
                                                int i255 = -(-((i253 | i254) * (-370)));
                                                int i256 = (i254 * 370) + (i252 & i255) + (i252 | i255);
                                                int i257 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                int i258 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                Object[] objArr11 = new Object[1];
                                                a(false, i256, ((i257 & 35) << 1) + (i257 ^ 35), ((i258 | 27) << 1) - (i258 ^ 27), new char[]{'\f', 3, '\n', 65485, 2, 3, 0, 19, 5, 65485, 18, 16, 65535, 1, 7, '\f', 5, 65485, 18, 16, 65535, 1, 7, '\f', 5, 65533, '\r', '\f', 65485, 17, 23, 17, 65485, '\t', 3, 16}, objArr11);
                                                file2 = new File((String) objArr11[0]);
                                                int i259 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                i16 = (i259 & 1) + (i259 | 1);
                                                TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                                                if (i16 % 2 == 0) {
                                                    file2.canRead();
                                                    throw null;
                                                }
                                                if (!file2.canRead()) {
                                                    fileReader2 = new FileReader(file2);
                                                    bufferedReader2 = new BufferedReader(fileReader2);
                                                    try {
                                                        String line3 = bufferedReader2.readLine();
                                                        int i260 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                        Object[] objArr12 = new Object[1];
                                                        a(false, (i260 | 173) + (i260 & 173), -ImageFormat.getBitsPerPixel(0), -ImageFormat.getBitsPerPixel(0), new char[]{0}, objArr12);
                                                        zEquals2 = line3.equals((String) objArr12[0]);
                                                        fileReader2.close();
                                                        bufferedReader2.close();
                                                        if (zEquals2) {
                                                            i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            i18 = ((i17 | 43) << 1) - (i17 ^ 43);
                                                            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                Object obj2 = null;
                                                                obj2.hashCode();
                                                                throw null;
                                                            }
                                                            if (line != null) {
                                                                i19 = (i17 & 79) + (i17 | 79);
                                                                int i261 = i19 % 128;
                                                                TuitionPaymentFragmentbindingInflater1 = i261;
                                                                if (i19 % 2 != 0) {
                                                                    objArr = new Object[3];
                                                                    objArr[1] = new int[0];
                                                                } else {
                                                                    objArr = new Object[2];
                                                                    objArr[0] = new int[1];
                                                                }
                                                                int i262 = i261 + 17;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i262 % 128;
                                                                int i263 = i262 % 2;
                                                                ((int[]) objArr[0])[0] = (i & (-21)) | (i144 & 20);
                                                                objArr[1] = new String[]{line};
                                                                c = 0;
                                                            } else {
                                                                i6 = 2;
                                                            }
                                                        }
                                                        objArr = new Object[i6];
                                                        c = 0;
                                                        objArr[0] = new int[]{i};
                                                        objArr[1] = new String[0];
                                                    } catch (Throwable th) {
                                                        fileReader2.close();
                                                        bufferedReader2.close();
                                                        throw th;
                                                    }
                                                }
                                            }
                                            i7 = ((int[]) objArr[c])[c];
                                            int i264 = (i144 & i167) | ((~i167) & i);
                                            int i265 = -i264;
                                            int i266 = (i264 & i265) | (i264 ^ i265);
                                            int i267 = TuitionPaymentFragmentbindingInflater1;
                                            int i268 = (i267 ^ 15) + ((i267 & 15) << 1);
                                            int i269 = i268 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i269;
                                            int i270 = i268 % 2;
                                            int i271 = i266 >> 31;
                                            int i272 = (~i271) & i7;
                                            int i273 = i167 & i271;
                                            i8 = (i273 & i272) | (i272 ^ i273);
                                            String[] strArr3 = (String[]) objArr[1];
                                            Object[] objArr13 = new Object[2];
                                            i9 = i269 + 89;
                                            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                                            if (i9 % 2 != 0) {
                                                int i274 = (i7 | i) & (~(i & i7));
                                                int i275 = -i274;
                                                int i276 = ((i274 & i275) | (i274 ^ i275)) / 33;
                                                i10 = 1;
                                                i11 = (i276 & 1) | ((~i276) & 1);
                                                i12 = 0;
                                            } else {
                                                i10 = 1;
                                                int i277 = i7 ^ i;
                                                int i278 = -i277;
                                                i11 = (((i277 & i278) | (i277 ^ i278)) >> 31) & 1;
                                                int i279 = -i11;
                                                i12 = (~(((i279 & i11) | (i11 ^ i279)) >> 31)) & 1;
                                            }
                                            objArr13[i11] = null;
                                            objArr13[i12] = strArr3;
                                            strArr = (String[]) objArr13[0];
                                            objArr2 = new Object[4];
                                            int[] iArr2 = new int[i10];
                                            objArr2[0] = iArr2;
                                            objArr2[i10] = new int[i10];
                                            iArr = new int[i10];
                                            objArr2[2] = iArr;
                                            int i280 = i ^ i8;
                                            int i281 = ((i280 | (-i280)) >> 31) & 16;
                                            iArr2[0] = i;
                                            i13 = ((i269 | 45) << 1) - (i269 ^ 45);
                                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                                            if (i13 % 2 != 0) {
                                                ((int[]) objArr2[4])[1] = i8;
                                                objArr2[2] = strArr;
                                                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                int i282 = ~elapsedCpuTime;
                                                i14 = 1086382598 + (((~(759956144 | i282)) | (~((-800266374) | elapsedCpuTime))) * 210) + (((~(elapsedCpuTime | 805247669)) | (~(i282 | (-754974849)))) * 210);
                                            } else {
                                                iArr[0] = i8;
                                                objArr2[3] = strArr;
                                                int i283 = (int) Runtime.getRuntime().totalMemory();
                                                int i284 = ~i283;
                                                i14 = 1926308660 + ((536444663 | i283) * (-676)) + (((~(501239478 | i284)) | (-536444664)) * 676) + (((~(i283 | (-35205186))) | (~(i284 | 460929249)) | 75515414) * 676);
                                            }
                                            int i285 = i2 + i14 + i281;
                                            int i286 = i285 ^ (i285 << 13);
                                            int i287 = i286 >>> 17;
                                            int i288 = (i286 | i287) & (~(i286 & i287));
                                            int i289 = i288 << 5;
                                            ((int[]) objArr2[1])[0] = ((~i288) & i289) | ((~i289) & i288);
                                            return objArr2;
                                        } catch (Throwable th2) {
                                            fileReader.close();
                                            bufferedReader.close();
                                            throw th2;
                                        }
                                    }
                                    int i290 = TuitionPaymentFragmentbindingInflater1;
                                    int i291 = (i290 ^ 45) + ((i290 & 45) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i291 % 128;
                                    int i292 = i291 % 2;
                                    i15 = i290 + 69;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        int i293 = 4 % 4;
                                    }
                                    i6 = 2;
                                    objArr = new Object[i6];
                                    c = 0;
                                    objArr[0] = new int[]{i};
                                    objArr[1] = new String[0];
                                    i7 = ((int[]) objArr[c])[c];
                                    int i2610 = (i144 & i167) | ((~i167) & i);
                                    int i2611 = -i2610;
                                    int i2612 = (i2610 & i2611) | (i2610 ^ i2611);
                                    int i2613 = TuitionPaymentFragmentbindingInflater1;
                                    int i2614 = (i2613 ^ 15) + ((i2613 & 15) << 1);
                                    int i2615 = i2614 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2615;
                                    int i2710 = i2614 % 2;
                                    int i2711 = i2612 >> 31;
                                    int i2712 = (~i2711) & i7;
                                    int i2713 = i167 & i2711;
                                    i8 = (i2713 & i2712) | (i2712 ^ i2713);
                                    String[] strArr4 = (String[]) objArr[1];
                                    Object[] objArr14 = new Object[2];
                                    i9 = i2615 + 89;
                                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        int i2714 = (i7 | i) & (~(i & i7));
                                        int i2715 = -i2714;
                                        int i2716 = ((i2714 & i2715) | (i2714 ^ i2715)) / 33;
                                        i10 = 1;
                                        i11 = (i2716 & 1) | ((~i2716) & 1);
                                        i12 = 0;
                                    } else {
                                        i10 = 1;
                                        int i2717 = i7 ^ i;
                                        int i2718 = -i2717;
                                        i11 = (((i2717 & i2718) | (i2717 ^ i2718)) >> 31) & 1;
                                        int i2719 = -i11;
                                        i12 = (~(((i2719 & i11) | (i11 ^ i2719)) >> 31)) & 1;
                                    }
                                    objArr14[i11] = null;
                                    objArr14[i12] = strArr4;
                                    strArr = (String[]) objArr14[0];
                                    objArr2 = new Object[4];
                                    int[] iArr3 = new int[i10];
                                    objArr2[0] = iArr3;
                                    objArr2[i10] = new int[i10];
                                    iArr = new int[i10];
                                    objArr2[2] = iArr;
                                    int i2810 = i ^ i8;
                                    int i2811 = ((i2810 | (-i2810)) >> 31) & 16;
                                    iArr3[0] = i;
                                    i13 = ((i2615 | 45) << 1) - (i2615 ^ 45);
                                    TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        ((int[]) objArr2[4])[1] = i8;
                                        objArr2[2] = strArr;
                                        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                        int i2812 = ~elapsedCpuTime2;
                                        i14 = 1086382598 + (((~(759956144 | i2812)) | (~((-800266374) | elapsedCpuTime2))) * 210) + (((~(elapsedCpuTime2 | 805247669)) | (~(i2812 | (-754974849)))) * 210);
                                    } else {
                                        iArr[0] = i8;
                                        objArr2[3] = strArr;
                                        int i2813 = (int) Runtime.getRuntime().totalMemory();
                                        int i2814 = ~i2813;
                                        i14 = 1926308660 + ((536444663 | i2813) * (-676)) + (((~(501239478 | i2814)) | (-536444664)) * 676) + (((~(i2813 | (-35205186))) | (~(i2814 | 460929249)) | 75515414) * 676);
                                    }
                                    int i2815 = i2 + i14 + i2811;
                                    int i2816 = i2815 ^ (i2815 << 13);
                                    int i2817 = i2816 >>> 17;
                                    int i2818 = (i2816 | i2817) & (~(i2816 & i2817));
                                    int i2819 = i2818 << 5;
                                    ((int[]) objArr2[1])[0] = ((~i2818) & i2819) | ((~i2819) & i2818);
                                    return objArr2;
                                } catch (Throwable th3) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th3;
                                }
                            }
                            int i294 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                            TuitionPaymentFragmentbindingInflater1 = i294 % 128;
                            int i295 = i294 % 2;
                            int i1910 = -View.getDefaultSize(0, 0);
                            int i2010 = i1910 * 375;
                            int i2011 = (i2010 ^ (-165834)) + ((i2010 & (-165834)) << 1);
                            int i2012 = ~i1910;
                            int i2013 = ~((i2012 ^ 222) | (i2012 & 222));
                            int i2014 = ~i;
                            int i2015 = ~((i2014 & i1910) | (i2014 ^ i1910));
                            int i2016 = (i2011 - (~(-(-(((i2013 & i2015) | (i2013 ^ i2015)) * (-374)))))) - 1;
                            int i2017 = (~(i1910 | (-223))) * 748;
                            int i2018 = (i2016 ^ i2017) + ((i2017 & i2016) << 1);
                            int i2019 = ~(i2012 | (-223));
                            int i2110 = (i2018 - (~(((i2019 & i2015) | (i2019 ^ i2015)) * 374))) - 1;
                            int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i2111 = (scrollBarSize2 * 755) - 23343;
                            int i2112 = ~scrollBarSize2;
                            int i2113 = ~((i2112 ^ 31) | (i2112 & 31));
                            int i2114 = ~scrollBarSize2;
                            int i2115 = ~((i2114 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i2114 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i2116 = (i2113 ^ i2115) | (i2113 & i2115);
                            int i2117 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ 31) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & 31));
                            int i2118 = ((i2116 ^ i2117) | (i2116 & i2117)) * (-754);
                            int i2119 = (i2111 ^ i2118) + ((i2111 & i2118) << 1);
                            int i2210 = i2114 | 31;
                            int i2211 = ~((i2210 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i2210 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i2212 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i2213 = (scrollBarSize2 & i2212) | (i2212 ^ scrollBarSize2);
                            int i2214 = ~((i2213 & 31) | (i2213 ^ 31));
                            int i2215 = -(-(((i2214 & i2211) | (i2211 ^ i2214)) * (-754)));
                            Object[] objArr15 = new Object[1];
                            a(true, i2110, (((i2112 ^ i2212) | (i2212 & i2112)) * 754) + (i2119 ^ i2215) + ((i2215 & i2119) << 1), -TextUtils.indexOf((CharSequence) "", '0'), new char[]{65485, 2, 3, '\n', 0, 65535, '\f', 3, 65533, 3, 1, 65535, 16, 18, 4, 65485, '\n', 3, '\f', 16, 3, '\t', 65485, 17, 23, 17, 65485, 1, '\r', 16, 14}, objArr15);
                            file = new File((String) objArr15[0]);
                            if (file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                String line4 = bufferedReader.readLine();
                                int minimumFlingVelocity2 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                int i2216 = ~minimumFlingVelocity2;
                                int i2217 = ~(i2216 | (-174));
                                int i2218 = ~(((-174) & i144) | ((-174) ^ i144));
                                int i2219 = ((minimumFlingVelocity2 * (-167)) - 28891) + (((i2217 & i2218) | (i2217 ^ i2218)) * 168);
                                int i2310 = ~minimumFlingVelocity2;
                                int i2311 = (~((i2310 & (-174)) | (i2310 ^ (-174)) | i)) * 168;
                                int i2312 = (i2219 ^ i2311) + ((i2219 & i2311) << 1);
                                int i2313 = ~((i2216 ^ i144) | (i2216 & i144));
                                int i2314 = ~((i2216 & 173) | (i2216 ^ 173));
                                int i2315 = -(-(((~((minimumFlingVelocity2 & (-174)) | ((-174) ^ minimumFlingVelocity2) | i)) | (i2313 & i2314) | (i2313 ^ i2314)) * 168));
                                int i2316 = ((i2315 & i2312) << 1) + (i2312 ^ i2315);
                                int iNormalizeMetaState2 = 1 - KeyEvent.normalizeMetaState(0);
                                int iArgb2 = Color.argb(0, 0, 0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i2317 = (iArgb2 * 491) - 489;
                                int i2318 = ~iArgb2;
                                int i2319 = (i2318 ^ (-2)) | (i2318 & (-2));
                                int i2410 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                int i2411 = -(-(((i2319 ^ i2410) | (i2319 & i2410)) * (-490)));
                                int i2412 = ((i2317 | i2411) << 1) - (i2411 ^ i2317);
                                int i2413 = ~((iArgb2 & (-2)) | ((-2) ^ iArgb2));
                                int i2414 = ~((-2) | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                                int i2415 = ((i2414 & i2413) | (i2413 ^ i2414)) * 490;
                                int i2416 = (i2412 ^ i2415) + ((i2412 & i2415) << 1);
                                int i2417 = -(-(i2318 * 490));
                                Object[] objArr16 = new Object[1];
                                a(false, i2316, iNormalizeMetaState2, ((i2417 & i2416) << 1) + (i2416 ^ i2417), new char[]{0}, objArr16);
                                zEquals = line4.equals((String) objArr16[0]);
                                fileReader.close();
                                bufferedReader.close();
                                if (zEquals) {
                                    int i2418 = -((byte) KeyEvent.getModifierMetaStateMask());
                                    int i2419 = ~((-222) | (~i));
                                    int i2510 = ~i2418;
                                    int i2511 = ~((i2510 & i) | (i2510 ^ i));
                                    int i2512 = (((i2418 * 371) + 81991) - (~(((i2419 & i2511) | (i2419 ^ i2511)) * (-370)))) - 1;
                                    int i2513 = (~((~i2418) | i144)) | (~(((-222) & i) | ((-222) ^ i)));
                                    int i2514 = ~((i2418 & 221) | (i2418 ^ 221));
                                    int i2515 = -(-((i2513 | i2514) * (-370)));
                                    int i2516 = (i2514 * 370) + (i2512 & i2515) + (i2512 | i2515);
                                    int i2517 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                    int i2518 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                    Object[] objArr17 = new Object[1];
                                    a(false, i2516, ((i2517 & 35) << 1) + (i2517 ^ 35), ((i2518 | 27) << 1) - (i2518 ^ 27), new char[]{'\f', 3, '\n', 65485, 2, 3, 0, 19, 5, 65485, 18, 16, 65535, 1, 7, '\f', 5, 65485, 18, 16, 65535, 1, 7, '\f', 5, 65533, '\r', '\f', 65485, 17, 23, 17, 65485, '\t', 3, 16}, objArr17);
                                    file2 = new File((String) objArr17[0]);
                                    int i2519 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i16 = (i2519 & 1) + (i2519 | 1);
                                    TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        file2.canRead();
                                        throw null;
                                    }
                                    if (!file2.canRead()) {
                                        fileReader2 = new FileReader(file2);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        String line5 = bufferedReader2.readLine();
                                        int i2616 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        Object[] objArr18 = new Object[1];
                                        a(false, (i2616 | 173) + (i2616 & 173), -ImageFormat.getBitsPerPixel(0), -ImageFormat.getBitsPerPixel(0), new char[]{0}, objArr18);
                                        zEquals2 = line5.equals((String) objArr18[0]);
                                        fileReader2.close();
                                        bufferedReader2.close();
                                        if (zEquals2) {
                                            i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            i18 = ((i17 | 43) << 1) - (i17 ^ 43);
                                            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                Object obj3 = null;
                                                obj3.hashCode();
                                                throw null;
                                            }
                                            if (line != null) {
                                                i19 = (i17 & 79) + (i17 | 79);
                                                int i2617 = i19 % 128;
                                                TuitionPaymentFragmentbindingInflater1 = i2617;
                                                if (i19 % 2 != 0) {
                                                    objArr = new Object[3];
                                                    objArr[1] = new int[0];
                                                } else {
                                                    objArr = new Object[2];
                                                    objArr[0] = new int[1];
                                                }
                                                int i2618 = i2617 + 17;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2618 % 128;
                                                int i2619 = i2618 % 2;
                                                ((int[]) objArr[0])[0] = (i & (-21)) | (i144 & 20);
                                                objArr[1] = new String[]{line};
                                                c = 0;
                                            } else {
                                                i6 = 2;
                                            }
                                        }
                                        objArr = new Object[i6];
                                        c = 0;
                                        objArr[0] = new int[]{i};
                                        objArr[1] = new String[0];
                                    }
                                }
                                i7 = ((int[]) objArr[c])[c];
                                int i26110 = (i144 & i167) | ((~i167) & i);
                                int i26111 = -i26110;
                                int i26112 = (i26110 & i26111) | (i26110 ^ i26111);
                                int i26113 = TuitionPaymentFragmentbindingInflater1;
                                int i26114 = (i26113 ^ 15) + ((i26113 & 15) << 1);
                                int i26115 = i26114 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26115;
                                int i27110 = i26114 % 2;
                                int i27111 = i26112 >> 31;
                                int i27112 = (~i27111) & i7;
                                int i27113 = i167 & i27111;
                                i8 = (i27113 & i27112) | (i27112 ^ i27113);
                                String[] strArr5 = (String[]) objArr[1];
                                Object[] objArr19 = new Object[2];
                                i9 = i26115 + 89;
                                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                                if (i9 % 2 != 0) {
                                    int i27114 = (i7 | i) & (~(i & i7));
                                    int i27115 = -i27114;
                                    int i27116 = ((i27114 & i27115) | (i27114 ^ i27115)) / 33;
                                    i10 = 1;
                                    i11 = (i27116 & 1) | ((~i27116) & 1);
                                    i12 = 0;
                                } else {
                                    i10 = 1;
                                    int i27117 = i7 ^ i;
                                    int i27118 = -i27117;
                                    i11 = (((i27117 & i27118) | (i27117 ^ i27118)) >> 31) & 1;
                                    int i27119 = -i11;
                                    i12 = (~(((i27119 & i11) | (i11 ^ i27119)) >> 31)) & 1;
                                }
                                objArr19[i11] = null;
                                objArr19[i12] = strArr5;
                                strArr = (String[]) objArr19[0];
                                objArr2 = new Object[4];
                                int[] iArr4 = new int[i10];
                                objArr2[0] = iArr4;
                                objArr2[i10] = new int[i10];
                                iArr = new int[i10];
                                objArr2[2] = iArr;
                                int i28110 = i ^ i8;
                                int i28111 = ((i28110 | (-i28110)) >> 31) & 16;
                                iArr4[0] = i;
                                i13 = ((i26115 | 45) << 1) - (i26115 ^ 45);
                                TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                                if (i13 % 2 != 0) {
                                    ((int[]) objArr2[4])[1] = i8;
                                    objArr2[2] = strArr;
                                    int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                    int i28112 = ~elapsedCpuTime3;
                                    i14 = 1086382598 + (((~(759956144 | i28112)) | (~((-800266374) | elapsedCpuTime3))) * 210) + (((~(elapsedCpuTime3 | 805247669)) | (~(i28112 | (-754974849)))) * 210);
                                } else {
                                    iArr[0] = i8;
                                    objArr2[3] = strArr;
                                    int i28113 = (int) Runtime.getRuntime().totalMemory();
                                    int i28114 = ~i28113;
                                    i14 = 1926308660 + ((536444663 | i28113) * (-676)) + (((~(501239478 | i28114)) | (-536444664)) * 676) + (((~(i28113 | (-35205186))) | (~(i28114 | 460929249)) | 75515414) * 676);
                                }
                                int i28115 = i2 + i14 + i28111;
                                int i28116 = i28115 ^ (i28115 << 13);
                                int i28117 = i28116 >>> 17;
                                int i28118 = (i28116 | i28117) & (~(i28116 & i28117));
                                int i28119 = i28118 << 5;
                                ((int[]) objArr2[1])[0] = ((~i28118) & i28119) | ((~i28119) & i28118);
                                return objArr2;
                            }
                            int i296 = TuitionPaymentFragmentbindingInflater1;
                            int i297 = (i296 ^ 45) + ((i296 & 45) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i297 % 128;
                            int i298 = i297 % 2;
                            i15 = i296 + 69;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i299 = 4 % 4;
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                    }
                    line = null;
                    i6 = 2;
                    objArr = new Object[i6];
                    c = 0;
                    objArr[0] = new int[]{i};
                    objArr[1] = new String[0];
                    i7 = ((int[]) objArr[c])[c];
                    int i26116 = (i144 & i167) | ((~i167) & i);
                    int i26117 = -i26116;
                    int i26118 = (i26116 & i26117) | (i26116 ^ i26117);
                    int i26119 = TuitionPaymentFragmentbindingInflater1;
                    int i261110 = (i26119 ^ 15) + ((i26119 & 15) << 1);
                    int i261111 = i261110 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i261111;
                    int i271110 = i261110 % 2;
                    int i271111 = i26118 >> 31;
                    int i271112 = (~i271111) & i7;
                    int i271113 = i167 & i271111;
                    i8 = (i271113 & i271112) | (i271112 ^ i271113);
                    String[] strArr6 = (String[]) objArr[1];
                    Object[] objArr110 = new Object[2];
                    i9 = i261111 + 89;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i271114 = (i7 | i) & (~(i & i7));
                        int i271115 = -i271114;
                        int i271116 = ((i271114 & i271115) | (i271114 ^ i271115)) / 33;
                        i10 = 1;
                        i11 = (i271116 & 1) | ((~i271116) & 1);
                        i12 = 0;
                    } else {
                        i10 = 1;
                        int i271117 = i7 ^ i;
                        int i271118 = -i271117;
                        i11 = (((i271117 & i271118) | (i271117 ^ i271118)) >> 31) & 1;
                        int i271119 = -i11;
                        i12 = (~(((i271119 & i11) | (i11 ^ i271119)) >> 31)) & 1;
                    }
                    objArr110[i11] = null;
                    objArr110[i12] = strArr6;
                    strArr = (String[]) objArr110[0];
                    objArr2 = new Object[4];
                    int[] iArr5 = new int[i10];
                    objArr2[0] = iArr5;
                    objArr2[i10] = new int[i10];
                    iArr = new int[i10];
                    objArr2[2] = iArr;
                    int i281110 = i ^ i8;
                    int i281111 = ((i281110 | (-i281110)) >> 31) & 16;
                    iArr5[0] = i;
                    i13 = ((i261111 | 45) << 1) - (i261111 ^ 45);
                    TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                    if (i13 % 2 != 0) {
                        ((int[]) objArr2[4])[1] = i8;
                        objArr2[2] = strArr;
                        int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                        int i281112 = ~elapsedCpuTime4;
                        i14 = 1086382598 + (((~(759956144 | i281112)) | (~((-800266374) | elapsedCpuTime4))) * 210) + (((~(elapsedCpuTime4 | 805247669)) | (~(i281112 | (-754974849)))) * 210);
                    } else {
                        iArr[0] = i8;
                        objArr2[3] = strArr;
                        int i281113 = (int) Runtime.getRuntime().totalMemory();
                        int i281114 = ~i281113;
                        i14 = 1926308660 + ((536444663 | i281113) * (-676)) + (((~(501239478 | i281114)) | (-536444664)) * 676) + (((~(i281113 | (-35205186))) | (~(i281114 | 460929249)) | 75515414) * 676);
                    }
                    int i281115 = i2 + i14 + i281111;
                    int i281116 = i281115 ^ (i281115 << 13);
                    int i281117 = i281116 >>> 17;
                    int i281118 = (i281116 | i281117) & (~(i281116 & i281117));
                    int i281119 = i281118 << 5;
                    ((int[]) objArr2[1])[0] = ((~i281118) & i281119) | ((~i281119) & i281118);
                    return objArr2;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
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
            private static java.lang.String $$e(short r6, int r7, byte r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = 4 - r7
                    int r6 = 120 - r6
                    int r8 = r8 * 2
                    int r8 = r8 + 1
                    byte[] r0 = com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda2.$$c
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L25
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r6
                    r1[r3] = r5
                    if (r4 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    r3 = r0[r7]
                L25:
                    int r7 = r7 + 1
                    int r6 = r6 + r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda2.$$e(short, int, byte):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LivenessBeginResponse livenessBegin$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (LivenessBeginResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LivenessBeginResponse livenessBegin$lambda$8(LivenessBeginResponse livenessBeginResponse) {
        Intrinsics.checkNotNullParameter(livenessBeginResponse, "");
        Intrinsics.checkNotNullParameter(livenessBeginResponse, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        return new LivenessBeginResponse(Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(livenessBeginResponse.isSuspend(), strB), livenessBeginResponse.isSuccessfulRaw(), livenessBeginResponse.isSuspendRaw(), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(livenessBeginResponse.isSuccessful(), strB), livenessBeginResponse.getMessage(), livenessBeginResponse.getStatusCode());
    }

    @Override // com.bpjstku.data.devicebinding.DeviceBindingRepository
    public final deriveCodec<LivenessEndResponse> livenessEnd(String p0, LivenessEndRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        DeviceBindingApi deviceBindingApiM7600getWebService = m7600getWebService();
        Map<String, RequestBody> partMap = p1.getPartMap();
        File selfiePhoto1 = p1.getSelfiePhoto1();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = selfiePhoto1 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(selfiePhoto1, "selfiePhoto1") : null;
        File selfiePhoto2 = p1.getSelfiePhoto2();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = selfiePhoto2 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(selfiePhoto2, "selfiePhoto2") : null;
        File selfiePhoto3 = p1.getSelfiePhoto3();
        deriveCodec<Response<LivenessEndResponse>> derivecodecLivenessEnd = deviceBindingApiM7600getWebService.livenessEnd(p0, partMap, partTuitionPaymentFragmentspecialinlinedviewModeldefault2, partTuitionPaymentFragmentspecialinlinedviewModeldefault3, selfiePhoto3 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(selfiePhoto3, "selfiePhoto3") : null);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecLivenessEnd, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceBindingDataStore.livenessEnd$lambda$10((LivenessEndResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.devicebinding.DeviceBindingDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return DeviceBindingDataStore.livenessEnd$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LivenessEndResponse livenessEnd$lambda$10(LivenessEndResponse livenessEndResponse) {
        Intrinsics.checkNotNullParameter(livenessEndResponse, "");
        Intrinsics.checkNotNullParameter(livenessEndResponse, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        return new LivenessEndResponse(Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(livenessEndResponse.isSuspend(), strB), livenessEndResponse.isSuccessfulRaw(), livenessEndResponse.isSuspendRaw(), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(livenessEndResponse.isSuccessful(), strB), livenessEndResponse.getMessage(), livenessEndResponse.getStatusCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LivenessEndResponse livenessEnd$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (LivenessEndResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendEmailOtpResponse sendEmailOtp$lambda$2(SendEmailOtpResponse sendEmailOtpResponse) {
        Intrinsics.checkNotNullParameter(sendEmailOtpResponse, "");
        return sendEmailOtpResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmitDeviceBindingResponse submitDeviceBinding$lambda$6(SubmitDeviceBindingResponse submitDeviceBindingResponse) {
        Intrinsics.checkNotNullParameter(submitDeviceBindingResponse, "");
        return submitDeviceBindingResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyOtp$lambda$4(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }
}
