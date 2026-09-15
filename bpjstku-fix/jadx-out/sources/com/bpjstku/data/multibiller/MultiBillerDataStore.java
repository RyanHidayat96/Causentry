package com.bpjstku.data.multibiller;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.multibiller.model.request.MultiBillerAuthTransactionRequest;
import com.bpjstku.data.multibiller.model.request.MultiBillerCheckRegisterRequest;
import com.bpjstku.data.multibiller.model.request.MultiBillerCheckTransactionRequest;
import com.bpjstku.data.multibiller.model.request.MultiBillerRegistrationRequest;
import com.bpjstku.data.multibiller.model.request.MultiBillerTransactionRequest;
import com.bpjstku.data.multibiller.model.response.MultiBillerAuthResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerAuthTransactionItem;
import com.bpjstku.data.multibiller.model.response.MultiBillerAuthTransactionResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerCheckRegisterResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerCheckTransactionResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerRegistrationResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerTokenResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerTransactionItem;
import com.bpjstku.data.multibiller.model.response.MultiBillerTransactionResponse;
import com.bpjstku.data.multibiller.remote.MultiBillerApi;
import defpackage.Api23Impl;
import defpackage.Camera2InteropExtender;
import defpackage.deriveCodec;
import defpackage.initSession;
import defpackage.mergeChildrenConfigs;
import defpackage.onCaptureSessionEnd;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u0006\u0010\u0003\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001f\u0010\u0012R\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/bpjstku/data/multibiller/MultiBillerDataStore;", "Lcom/bpjstku/data/multibiller/MultiBillerRepository;", "Lcom/bpjstku/data/multibiller/remote/MultiBillerApi;", "p0", "<init>", "(Lcom/bpjstku/data/multibiller/remote/MultiBillerApi;)V", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerTransactionRequest;", "LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerTransactionResponse;", "transaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerRegistrationRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationResponse;", "register", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerRegistrationRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckRegisterRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerTokenResponse;", "generateToken", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckRegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthResponse;", "authenticate", "()LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerAuthTransactionRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionResponse;", "authenticateTransaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerAuthTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckTransactionRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerCheckTransactionResponse;", "checkTransaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerCheckRegisterResponse;", "checkRegister", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;", "webService", "Lcom/bpjstku/data/multibiller/remote/MultiBillerApi;", "getWebService", "()Lcom/bpjstku/data/multibiller/remote/MultiBillerApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiBillerDataStore implements MultiBillerRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final MultiBillerApi webService;

    public MultiBillerDataStore(MultiBillerApi multiBillerApi) {
        Intrinsics.checkNotNullParameter(multiBillerApi, "");
        this.webService = multiBillerApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7653getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    public final Void getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final MultiBillerApi m7654getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.multibiller.MultiBillerRepository
    public final deriveCodec<MultiBillerTransactionResponse> transaction(MultiBillerTransactionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<MultiBillerTransactionResponse>> derivecodecTransaction = m7654getWebService().transaction(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecTransaction, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBillerDataStore.transaction$lambda$1((MultiBillerTransactionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return MultiBillerDataStore.transaction$lambda$2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerTransactionResponse transaction$lambda$2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MultiBillerTransactionResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerTransactionResponse transaction$lambda$1(MultiBillerTransactionResponse multiBillerTransactionResponse) {
        Intrinsics.checkNotNullParameter(multiBillerTransactionResponse, "");
        MultiBillerTransactionItem data = multiBillerTransactionResponse.getData();
        if (data != null) {
            Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
            String transactionId = data.getTransactionId();
            if (transactionId == null) {
                transactionId = "";
            }
            data.setTransactionId(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionId));
            Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
            String callbackUrl = data.getCallbackUrl();
            if (callbackUrl == null) {
                callbackUrl = "";
            }
            data.setCallbackUrl(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(callbackUrl));
            Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
            String redirectUrl = data.getRedirectUrl();
            if (redirectUrl == null) {
                redirectUrl = "";
            }
            data.setRedirectUrl(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(redirectUrl));
            Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
            String deepUrl = data.getDeepUrl();
            data.setDeepUrl(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(deepUrl != null ? deepUrl : "", true));
        }
        return multiBillerTransactionResponse;
    }

    @Override // com.bpjstku.data.multibiller.MultiBillerRepository
    public final deriveCodec<MultiBillerRegistrationResponse> register(MultiBillerRegistrationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<MultiBillerRegistrationResponse>> derivecodecRegister = m7654getWebService().register(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecRegister, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBillerDataStore.register$lambda$3((MultiBillerRegistrationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda9
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return MultiBillerDataStore.register$lambda$4(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerRegistrationResponse register$lambda$4(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MultiBillerRegistrationResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.multibiller.MultiBillerRepository
    public final deriveCodec<MultiBillerTokenResponse> generateToken(MultiBillerCheckRegisterRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<MultiBillerTokenResponse>> derivecodecGenerateToken = m7654getWebService().generateToken(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecGenerateToken, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBillerDataStore.generateToken$lambda$5((MultiBillerTokenResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return MultiBillerDataStore.generateToken$lambda$6(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerTokenResponse generateToken$lambda$6(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MultiBillerTokenResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.multibiller.MultiBillerRepository
    public final deriveCodec<MultiBillerAuthResponse> authenticate() {
        deriveCodec<Response<MultiBillerAuthResponse>> derivecodecAuthenticate = m7654getWebService().authenticate();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecAuthenticate, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBillerDataStore.authenticate$lambda$7((MultiBillerAuthResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return MultiBillerDataStore.authenticate$lambda$8(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerAuthResponse authenticate$lambda$8(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MultiBillerAuthResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.multibiller.MultiBillerRepository
    public final deriveCodec<MultiBillerAuthTransactionResponse> authenticateTransaction(MultiBillerAuthTransactionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<MultiBillerAuthTransactionResponse>> derivecodecAuthenticateTransaction = m7654getWebService().authenticateTransaction(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecAuthenticateTransaction, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBillerDataStore.authenticateTransaction$lambda$10((MultiBillerAuthTransactionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return MultiBillerDataStore.authenticateTransaction$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerAuthTransactionResponse authenticateTransaction$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MultiBillerAuthTransactionResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerAuthTransactionResponse authenticateTransaction$lambda$10(MultiBillerAuthTransactionResponse multiBillerAuthTransactionResponse) {
        Intrinsics.checkNotNullParameter(multiBillerAuthTransactionResponse, "");
        MultiBillerAuthTransactionItem data = multiBillerAuthTransactionResponse.getData();
        if (data != null) {
            Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
            String transactionId = data.getTransactionId();
            if (transactionId == null) {
                transactionId = "";
            }
            data.setTransactionId(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionId));
            Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
            String callbackUrl = data.getCallbackUrl();
            if (callbackUrl == null) {
                callbackUrl = "";
            }
            data.setCallbackUrl(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(callbackUrl));
            Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
            String redirectUrl = data.getRedirectUrl();
            if (redirectUrl == null) {
                redirectUrl = "";
            }
            data.setRedirectUrl(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(redirectUrl));
            Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
            String deepUrl = data.getDeepUrl();
            data.setDeepUrl(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(deepUrl != null ? deepUrl : "", true));
        }
        return multiBillerAuthTransactionResponse;
    }

    @Override // com.bpjstku.data.multibiller.MultiBillerRepository
    public final deriveCodec<MultiBillerCheckTransactionResponse> checkTransaction(MultiBillerCheckTransactionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<MultiBillerCheckTransactionResponse>> derivecodecCheckTransaction = m7654getWebService().checkTransaction(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckTransaction, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBillerDataStore.checkTransaction$lambda$12((MultiBillerCheckTransactionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return MultiBillerDataStore.checkTransaction$lambda$13(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerCheckTransactionResponse checkTransaction$lambda$13(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MultiBillerCheckTransactionResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.multibiller.MultiBillerRepository
    public final deriveCodec<MultiBillerCheckRegisterResponse> checkRegister(MultiBillerCheckRegisterRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<MultiBillerCheckRegisterResponse>> derivecodecCheckRegister = m7654getWebService().checkRegister(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckRegister, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBillerDataStore.checkRegister$lambda$14((MultiBillerCheckRegisterResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda11
            private static final byte[] $$c = {111, 40, 23, -13};
            private static final int $$f = 182;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {84, 10, 24, -102, -7, 0, -7, -9, -7, -22, 40, -45, 12, -43, 4, -7, -7, -24, -13, -10, -6, 4, 56, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 57};
            private static final int $$e = 96;
            private static final byte[] $$a = {41, 2, 45, -60, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
            private static final int $$b = 70;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f392a = 1;
            private static char TuitionPaymentFragmentbindingInflater1 = 29696;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 9629;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 45872;
            private static char b = 63283;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r7, byte r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 52
                    int r7 = r7 + 1
                    int r9 = r9 + 84
                    int r8 = r8 * 52
                    int r8 = 55 - r8
                    byte[] r0 = com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda11.$$a
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r9 = r8
                    r4 = r2
                    goto L2d
                L15:
                    r3 = r2
                L16:
                    int r8 = r8 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r7) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r8]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r6
                L2d:
                    int r3 = r3 + r8
                    int r8 = r3 + (-11)
                    r3 = r4
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda11.c(short, byte, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x002b  */
            /* JADX WARN: Code duplicated, block: B:8:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(short r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 20
                    int r0 = r6 + 53
                    byte[] r1 = com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda11.$$d
                    int r8 = r8 * 32
                    int r8 = r8 + 84
                    int r7 = r7 * 72
                    int r7 = 75 - r7
                    byte[] r0 = new byte[r0]
                    int r6 = r6 + 52
                    r2 = 0
                    if (r1 != 0) goto L19
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L31
                L19:
                    r3 = r2
                L1a:
                    int r7 = r7 + 1
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L2b
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L2b:
                    r3 = r1[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r5
                L31:
                    int r7 = -r7
                    int r3 = r3 + r7
                    int r7 = r3 + (-9)
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda11.e(short, short, int, java.lang.Object[]):void");
            }

            private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr[0] = new String(cArr2, 0, i);
                        return;
                    }
                    int i4 = $10 + 53;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    int i6 = $10 + 55;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 58224;
                    int i9 = 0;
                    while (i9 < 16) {
                        char c = cArr3[1];
                        char c2 = cArr3[i3];
                        int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                        int i11 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(b);
                            objArr2[2] = Integer.valueOf(i11);
                            objArr2[1] = Integer.valueOf(i10);
                            objArr2[i3] = Integer.valueOf(c);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cAxisFromString = (char) (47772 - MotionEvent.axisFromString(""));
                                int mode = View.MeasureSpec.getMode(i3) + 468;
                                int iIndexOf = 12 - TextUtils.indexOf((CharSequence) "", '0', i3, i3);
                                Class[] clsArr = new Class[4];
                                clsArr[i3] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, mode, iIndexOf, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            int i12 = i9;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 47773), 468 - (ViewConfiguration.getScrollBarSize() >> 8), 13 - Color.green(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i8 -= 40503;
                            i9 = i12 + 1;
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) + 2323, TextUtils.lastIndexOf("", '0', 0) + 45, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0214  */
            /* JADX WARN: Code duplicated, block: B:27:0x0216  */
            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = f392a + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int size = View.MeasureSpec.getSize(0) + 876;
                    int i4 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    c(bArr[7], (byte) (-bArr[5]), (byte) 14, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, size, i4, 252381699, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                d(new char[]{29623, 153, 41299, 30405, 7102, 22076, 35561, 16806, 43069, 20875, 54494, 54433, 65517, 40620, 43197, 18001, 15511, 1528, 59161, 35176, 39520, 29189, 46237, 53088}, 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                d(new char[]{25548, 21568, 42909, 60444, 45108, 34770, 5737, 57143, 46325, 4228, 3949, 45520, 41715, 26403, 19522, 9641, 36150, 55330}, 15 - TextUtils.getTrimmedLength(""), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr2 = $$a;
                    byte b2 = (byte) (-bArr2[5]);
                    Object[] objArr5 = new Object[1];
                    c(b2, b2, bArr2[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, modifierMetaStateMask, windowTouchSlop, 2009631821, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int iMyPid = 876 - (Process.myPid() >> 22);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                        byte[] bArr3 = $$a;
                        byte b3 = bArr3[7];
                        Object[] objArr6 = new Object[1];
                        c(b3, b3, bArr3[54], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iMyPid, scrollDefaultDelay, 256017550, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i5 = ~(409756490 | elapsedCpuTime);
                    int i6 = ~elapsedCpuTime;
                    int i7 = i5 | (~(450066719 | i6));
                    int i8 = ~((-409756491) | i6);
                    int i9 = (-1246834644) + ((i7 | i8) * (-516)) + (((~(elapsedCpuTime | (-43194390))) | (~((-406872331) | i6))) * 516) + ((406872330 | i8) * 516) + 945340442;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    d(new char[]{8565, 42118, 25837, 26777, 31009, 43069, 33290, 51006, 3474, 38859, 57167, 27389, 22146, 37228, 62681, 50581, 37956, 8160, 5346, 14680, 43575, 43876, 43133, 53940, 11334, 31498, 31136, 28365}, ExpandableListView.getPackedPositionType(0L) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    d(new char[]{9172, 5481, 59775, 62175, 6380, 22148, 52439, 36508, 7673, 58369, 29355, 44298, 48211, 31402, 40645, 22585, 18923, 61402, 2889, 18291}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (!(!(applicationContext instanceof ContextWrapper))) {
                            int i12 = f392a + 47;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                            if (i12 % 2 != 0) {
                                int i13 = 52 / 0;
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
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    d(new char[]{25891, 63598, 57043, 35041, 1738, 35936, 19920, 36881, 7447, 58103, 45898, 29936, 25296, 32835, 26912, 24027, 60019, 27474}, 16 - (ViewConfiguration.getTouchSlop() >> 8), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    d(new char[]{40602, 23318, 16952, 48618, 7564, 55831, 27968, 55721, 17652, 61500, 64173, 48396, 55642, 63859, 11635, 34542, 17936, 45353}, ExpandableListView.getPackedPositionChild(0L) + 17, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i14 = f392a + 97;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                    int i15 = i14 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 945340442};
                        byte[] bArr4 = $$d;
                        byte b4 = (byte) (-bArr4[34]);
                        byte b5 = b4;
                        Object[] objArr13 = new Object[1];
                        e(b4, b5, b5, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b6 = bArr4[5];
                        byte b7 = b6;
                        Object[] objArr14 = new Object[1];
                        e(b6, b7, b7, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                int iIndexOf = 876 - TextUtils.indexOf("", "");
                                int iIndexOf2 = 10 - TextUtils.indexOf("", "", 0, 0);
                                byte[] bArr5 = $$a;
                                byte b8 = bArr5[7];
                                Object[] objArr16 = new Object[1];
                                c(b8, b8, bArr5[54], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, iIndexOf, iIndexOf2, 256017550, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                d(new char[]{29623, 153, 41299, 30405, 7102, 22076, 35561, 16806, 43069, 20875, 54494, 54433, 65517, 40620, 43197, 18001, 15511, 1528, 59161, 35176, 39520, 29189, 46237, 53088}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                d(new char[]{25548, 21568, 42909, 60444, 45108, 34770, 5737, 57143, 46325, 4228, 3949, 45520, 41715, 26403, 19522, 9641, 36150, 55330}, 15 - Color.red(0), objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cResolveSize2 = (char) View.resolveSize(0, 0);
                                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                                    int i16 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                                    byte[] bArr6 = $$a;
                                    byte b9 = (byte) (-bArr6[5]);
                                    Object[] objArr19 = new Object[1];
                                    c(b9, b9, bArr6[7], objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize2, doubleTapTimeout, i16, 2009631821, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cBlue = (char) Color.blue(0);
                                    int iIndexOf3 = TextUtils.indexOf("", "") + 876;
                                    int iCombineMeasuredStates = 10 - View.combineMeasuredStates(0, 0);
                                    byte[] bArr7 = $$a;
                                    Object[] objArr20 = new Object[1];
                                    c(bArr7[7], (byte) (-bArr7[5]), (byte) 14, objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, iIndexOf3, iCombineMeasuredStates, 252381699, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                                f392a = i17 % 128;
                                int i18 = i17 % 2;
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
                int i19 = ((int[]) objArr[2])[0];
                int i20 = ((int[]) objArr[0])[0];
                if (i20 != i19) {
                    throw new RuntimeException(String.valueOf(i20));
                }
                int i21 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iMyTid = Process.myTid();
                int i22 = ~iMyTid;
                int i23 = (-868597916) + (((~((-39570640) | i22)) | 739333 | (~((-739590) | i22)) | (~(39570895 | iMyTid))) * (-84));
                int i24 = (~(iMyTid | (-739590))) | 39570639;
                int i25 = ~(i22 | 739589);
                int i26 = i21 + i23 + ((i24 | i25) * (-84)) + (((-39570896) | i25) * 84);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr21[1])[0] = i28 ^ (i28 << 5);
                int i29 = f392a + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
                int i30 = i29 % 2;
                return MultiBillerDataStore.checkRegister$lambda$15(function1, obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, int r7, byte r8) {
                /*
                    int r6 = r6 * 3
                    int r6 = 3 - r6
                    int r7 = r7 * 2
                    int r7 = 1 - r7
                    byte[] r0 = com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda11.$$c
                    int r8 = r8 * 2
                    int r8 = 108 - r8
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r8
                    r4 = r2
                    r8 = r6
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    int r6 = r6 + 1
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L27:
                    r4 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2e:
                    int r6 = r6 + r3
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.multibiller.MultiBillerDataStore$$ExternalSyntheticLambda11.$$g(byte, int, byte):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerCheckRegisterResponse checkRegister$lambda$15(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MultiBillerCheckRegisterResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerAuthResponse authenticate$lambda$7(MultiBillerAuthResponse multiBillerAuthResponse) {
        Intrinsics.checkNotNullParameter(multiBillerAuthResponse, "");
        return multiBillerAuthResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerCheckRegisterResponse checkRegister$lambda$14(MultiBillerCheckRegisterResponse multiBillerCheckRegisterResponse) {
        Intrinsics.checkNotNullParameter(multiBillerCheckRegisterResponse, "");
        return multiBillerCheckRegisterResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerCheckTransactionResponse checkTransaction$lambda$12(MultiBillerCheckTransactionResponse multiBillerCheckTransactionResponse) {
        Intrinsics.checkNotNullParameter(multiBillerCheckTransactionResponse, "");
        return multiBillerCheckTransactionResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerTokenResponse generateToken$lambda$5(MultiBillerTokenResponse multiBillerTokenResponse) {
        Intrinsics.checkNotNullParameter(multiBillerTokenResponse, "");
        return multiBillerTokenResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiBillerRegistrationResponse register$lambda$3(MultiBillerRegistrationResponse multiBillerRegistrationResponse) {
        Intrinsics.checkNotNullParameter(multiBillerRegistrationResponse, "");
        return multiBillerRegistrationResponse;
    }
}
