package com.bpjstku.data.asik;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.asik.local.AddressPostalCodeDao;
import com.bpjstku.data.asik.local.entity.AddressPostalCodeEntity;
import com.bpjstku.data.asik.model.request.AccountBankRequest;
import com.bpjstku.data.asik.model.request.AsikDocumentRequest;
import com.bpjstku.data.asik.model.request.AsikFirstStepRequest;
import com.bpjstku.data.asik.model.request.AsikListFamilyRequest;
import com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest;
import com.bpjstku.data.asik.model.request.AsikListKpjRequest;
import com.bpjstku.data.asik.model.request.AsikRequest;
import com.bpjstku.data.asik.model.request.AsikVerificationEkyc;
import com.bpjstku.data.asik.model.request.AsikVerificationLivenessBegin;
import com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly;
import com.bpjstku.data.asik.model.request.AsikVerificationStepRequest;
import com.bpjstku.data.asik.model.request.CheckSubmissionRequest;
import com.bpjstku.data.asik.model.request.EmployeeDataRequest;
import com.bpjstku.data.asik.model.request.OtpByEmailRequest;
import com.bpjstku.data.asik.model.request.OtpByPhoneRequest;
import com.bpjstku.data.asik.model.request.VerifyOtpAsikRequest;
import com.bpjstku.data.asik.model.response.AccountBankItem;
import com.bpjstku.data.asik.model.response.AccountBankResponse;
import com.bpjstku.data.asik.model.response.AddressPostalCodeItem;
import com.bpjstku.data.asik.model.response.AddressPostalCodeResponse;
import com.bpjstku.data.asik.model.response.AsikItem;
import com.bpjstku.data.asik.model.response.AsikListFamilyItem;
import com.bpjstku.data.asik.model.response.AsikListFamilyResponse;
import com.bpjstku.data.asik.model.response.AsikListKpjItem;
import com.bpjstku.data.asik.model.response.AsikListKpjMobileItem;
import com.bpjstku.data.asik.model.response.AsikListKpjMobileResponse;
import com.bpjstku.data.asik.model.response.AsikListKpjResponse;
import com.bpjstku.data.asik.model.response.AsikVerifivationLivenessOnlyResponse;
import com.bpjstku.data.asik.model.response.EmployeeFamilyItem;
import com.bpjstku.data.asik.model.response.EmployeeFamilyResponse;
import com.bpjstku.data.asik.model.response.EmployeeItem;
import com.bpjstku.data.asik.model.response.EmployeeKpjItem;
import com.bpjstku.data.asik.model.response.EmployeeKpjResponse;
import com.bpjstku.data.asik.model.response.MaritalStatusItem;
import com.bpjstku.data.asik.model.response.MaritalStatusResponse;
import com.bpjstku.data.asik.model.response.OtpRequestItem;
import com.bpjstku.data.asik.model.response.SubmissionRequestItem;
import com.bpjstku.data.asik.model.response.SubmissionRequestResponse;
import com.bpjstku.data.asik.remote.AsikApi;
import com.bpjstku.data.lib.model.BaseItem;
import defpackage.Api23Impl;
import defpackage.Camera2InteropExtender;
import defpackage.appendBackupVideoProfile;
import defpackage.createCameraSelectorById;
import defpackage.currentSystemTimeNs;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.generateBackupProfile;
import defpackage.getContentPaddingRight;
import defpackage.initSession;
import defpackage.isSamsungJ2;
import defpackage.logToString;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0003\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0003\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\b2\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001d\u0010\u001bJ#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t0\b2\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001f\u0010\u001bJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\b2\u0006\u0010\u0003\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\b2\u0006\u0010\u0003\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0003\u001a\u00020'H\u0017¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0003\u001a\u00020'H\u0017¢\u0006\u0004\b*\u0010)J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\b2\u0006\u0010\u0003\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\t0\b2\u0006\u0010\u0003\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102J#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040\b2\u0006\u0010\u0003\u001a\u000203H\u0017¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0003\u001a\u000208H\u0017¢\u0006\u0004\b9\u0010:J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0003\u001a\u00020;H\u0017¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0003\u001a\u00020;H\u0017¢\u0006\u0004\b>\u0010=J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\b2\u0006\u0010\u0003\u001a\u00020?H\u0017¢\u0006\u0004\bA\u0010BJ\u001b\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\t0\bH\u0017¢\u0006\u0004\bD\u0010\fJ#\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\t0\b2\u0006\u0010\u0003\u001a\u00020EH\u0017¢\u0006\u0004\bG\u0010HJ\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\b2\u0006\u0010\u0003\u001a\u00020IH\u0017¢\u0006\u0004\bK\u0010LJ\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020J0\b2\u0006\u0010\u0003\u001a\u00020MH\u0017¢\u0006\u0004\bN\u0010OJ\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0003\u001a\u00020;H\u0017¢\u0006\u0004\bP\u0010=J\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0003\u001a\u00020;H\u0017¢\u0006\u0004\bQ\u0010=J\u001b\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\t0\bH\u0002¢\u0006\u0004\bR\u0010\fJ)\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\t0\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020S0\tH\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010]\u001a\u0004\u0018\u00010\\8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`"}, d2 = {"Lcom/bpjstku/data/asik/AsikDataStore;", "Lcom/bpjstku/data/asik/AsikRepository;", "Lcom/bpjstku/data/asik/remote/AsikApi;", "p0", "Lcom/bpjstku/data/asik/local/AddressPostalCodeDao;", "p1", "<init>", "(Lcom/bpjstku/data/asik/remote/AsikApi;Lcom/bpjstku/data/asik/local/AddressPostalCodeDao;)V", "LderiveCodec;", "", "Lcom/bpjstku/data/asik/model/response/MaritalStatusItem;", "getMaritalStatus", "()LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikRequest;", "Lcom/bpjstku/data/asik/model/response/AsikItem;", "insertAsik", "(Lcom/bpjstku/data/asik/model/request/AsikRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikDocumentRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "documentAsik", "(Lcom/bpjstku/data/asik/model/request/AsikDocumentRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationEkyc;", "verifEkyc", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationEkyc;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/EmployeeDataRequest;", "Lcom/bpjstku/data/asik/model/response/EmployeeItem;", "employeeData", "(Lcom/bpjstku/data/asik/model/request/EmployeeDataRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/response/EmployeeKpjItem;", "employeeKpj", "Lcom/bpjstku/data/asik/model/response/EmployeeFamilyItem;", "employeeFamily", "Lcom/bpjstku/data/asik/model/request/OtpByEmailRequest;", "Lcom/bpjstku/data/asik/model/response/OtpRequestItem;", "postOtpByEmailRequest", "(Lcom/bpjstku/data/asik/model/request/OtpByEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/OtpByPhoneRequest;", "postOtpByPhoneRequest", "(Lcom/bpjstku/data/asik/model/request/OtpByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/VerifyOtpAsikRequest;", "verifyOtpAsikByEmailRequest", "(Lcom/bpjstku/data/asik/model/request/VerifyOtpAsikRequest;)LderiveCodec;", "verifyOtpAsikByPhoneRequest", "Lcom/bpjstku/data/asik/model/request/CheckSubmissionRequest;", "Lcom/bpjstku/data/asik/model/response/SubmissionRequestItem;", "checkSubmissionAsik", "(Lcom/bpjstku/data/asik/model/request/CheckSubmissionRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikListKpjRequest;", "Lcom/bpjstku/data/asik/model/response/AsikListKpjItem;", "getListKpj", "(Lcom/bpjstku/data/asik/model/request/AsikListKpjRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikListFamilyRequest;", "", "Lcom/bpjstku/data/asik/model/response/AsikListFamilyItem;", "getListFamily", "(Lcom/bpjstku/data/asik/model/request/AsikListFamilyRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikFirstStepRequest;", "verifyAsikFirstStep", "(Lcom/bpjstku/data/asik/model/request/AsikFirstStepRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationStepRequest;", "verifyAsikSecondStep", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationStepRequest;)LderiveCodec;", "verifyAsikFifthStep", "Lcom/bpjstku/data/asik/model/request/AccountBankRequest;", "Lcom/bpjstku/data/asik/model/response/AccountBankItem;", "getAccountBank", "(Lcom/bpjstku/data/asik/model/request/AccountBankRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/response/AddressPostalCodeItem;", "addressPostalCode", "Lcom/bpjstku/data/asik/model/request/AsikListKpjMobileRequest;", "Lcom/bpjstku/data/asik/model/response/AsikListKpjMobileItem;", "getListKpjMobile", "(Lcom/bpjstku/data/asik/model/request/AsikListKpjMobileRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessOnly;", "Lcom/bpjstku/data/asik/model/response/AsikVerifivationLivenessOnlyResponse;", "verifyAsikLivenessOnly", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessOnly;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessBegin;", "verifyAsikLivenessBegin", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessBegin;)LderiveCodec;", "verifyAsikSixthStep", "verifyAsikFourStep", "getAddressRemote", "Lcom/bpjstku/data/asik/local/entity/AddressPostalCodeEntity;", "getAddressLocal", "(Ljava/util/List;)LderiveCodec;", "addressPostalCodeDao", "Lcom/bpjstku/data/asik/local/AddressPostalCodeDao;", "webService", "Lcom/bpjstku/data/asik/remote/AsikApi;", "getWebService", "()Lcom/bpjstku/data/asik/remote/AsikApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikDataStore implements AsikRepository {
    public static final int $stable = 8;
    private final AddressPostalCodeDao addressPostalCodeDao;
    private final Void dbService;
    private final AsikApi webService;

    public AsikDataStore(AsikApi asikApi, AddressPostalCodeDao addressPostalCodeDao) {
        Intrinsics.checkNotNullParameter(asikApi, "");
        Intrinsics.checkNotNullParameter(addressPostalCodeDao, "");
        this.addressPostalCodeDao = addressPostalCodeDao;
        this.webService = asikApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7574getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final AsikApi m7575getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<List<MaritalStatusItem>> getMaritalStatus() {
        deriveCodec<Response<MaritalStatusResponse>> maritalStatus = m7575getWebService().getMaritalStatus();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(maritalStatus, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.getMaritalStatus$lambda$0((MaritalStatusResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda49
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.getMaritalStatus$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMaritalStatus$lambda$0(MaritalStatusResponse maritalStatusResponse) {
        Intrinsics.checkNotNullParameter(maritalStatusResponse, "");
        return maritalStatusResponse.getMaritalStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMaritalStatus$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<AsikItem> insertAsik(AsikRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<AsikItem>> derivecodecInsertAsik = m7575getWebService().insertAsik(p0);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.insertAsik$lambda$2((Response) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda31
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.insertAsik$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecInsertAsik, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsikItem insertAsik$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AsikItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsikItem insertAsik$lambda$2(Response response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "");
        if (response.isSuccessful()) {
            AsikItem asikItem = (AsikItem) response.body();
            if (asikItem != null) {
                asikItem.setRequestSignature(response.headers().get("x-request-signature"));
            }
            if (asikItem != null) {
                asikItem.setClientId(response.headers().get("x-client-id"));
            }
            return asikItem;
        }
        throw new Exception("Gagal terhubung ke server");
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<BaseItem> documentAsik(AsikDocumentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecDocumentAsik = m7575getWebService().documentAsik(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecDocumentAsik, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.documentAsik$lambda$4((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda10
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.documentAsik$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem documentAsik$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<BaseItem> verifEkyc(AsikVerificationEkyc p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        AsikApi asikApiM7575getWebService = m7575getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        File file = p0.getFile();
        deriveCodec<Response<BaseItem>> derivecodecVerifEkyc = asikApiM7575getWebService.verifEkyc(partMap, file != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, "file") : null);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifEkyc, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.verifEkyc$lambda$6((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.verifEkyc$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifEkyc$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<EmployeeItem> employeeData(EmployeeDataRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<EmployeeItem>> derivecodecEmployeeData = m7575getWebService().employeeData(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecEmployeeData, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.employeeData$lambda$8((EmployeeItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.employeeData$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmployeeItem employeeData$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (EmployeeItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<List<EmployeeKpjItem>> employeeKpj(EmployeeDataRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<EmployeeKpjResponse>> derivecodecEmployeeKpj = m7575getWebService().employeeKpj(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecEmployeeKpj, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.employeeKpj$lambda$10((EmployeeKpjResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.employeeKpj$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List employeeKpj$lambda$10(EmployeeKpjResponse employeeKpjResponse) {
        Intrinsics.checkNotNullParameter(employeeKpjResponse, "");
        return employeeKpjResponse.getEmployeeKpj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List employeeKpj$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<List<EmployeeFamilyItem>> employeeFamily(EmployeeDataRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<EmployeeFamilyResponse>> derivecodecEmployeeFamily = m7575getWebService().employeeFamily(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecEmployeeFamily, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.employeeFamily$lambda$12((EmployeeFamilyResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.employeeFamily$lambda$13(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List employeeFamily$lambda$12(EmployeeFamilyResponse employeeFamilyResponse) {
        Intrinsics.checkNotNullParameter(employeeFamilyResponse, "");
        return employeeFamilyResponse.getEmployeeFamily();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List employeeFamily$lambda$13(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<OtpRequestItem> postOtpByEmailRequest(OtpByEmailRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<OtpRequestItem>> derivecodecPostGetOtpByEmail = m7575getWebService().postGetOtpByEmail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostGetOtpByEmail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.postOtpByEmailRequest$lambda$14((OtpRequestItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda24
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.postOtpByEmailRequest$lambda$15(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpRequestItem postOtpByEmailRequest$lambda$15(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpRequestItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<OtpRequestItem> postOtpByPhoneRequest(OtpByPhoneRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<OtpRequestItem>> derivecodecPostGetOtpByHandphone = m7575getWebService().postGetOtpByHandphone(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostGetOtpByHandphone, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.postOtpByPhoneRequest$lambda$16((OtpRequestItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda26
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.postOtpByPhoneRequest$lambda$17(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpRequestItem postOtpByPhoneRequest$lambda$17(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpRequestItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<BaseItem> verifyOtpAsikByEmailRequest(VerifyOtpAsikRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecVerifyEmailOtpAsikRequest = m7575getWebService().verifyEmailOtpAsikRequest(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyEmailOtpAsikRequest, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.verifyOtpAsikByEmailRequest$lambda$18((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda36
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.verifyOtpAsikByEmailRequest$lambda$19(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyOtpAsikByEmailRequest$lambda$19(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<BaseItem> verifyOtpAsikByPhoneRequest(VerifyOtpAsikRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecVerifyPhoneOtpAsikRequest = m7575getWebService().verifyPhoneOtpAsikRequest(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyPhoneOtpAsikRequest, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.verifyOtpAsikByPhoneRequest$lambda$20((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.verifyOtpAsikByPhoneRequest$lambda$21(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyOtpAsikByPhoneRequest$lambda$21(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<SubmissionRequestItem> checkSubmissionAsik(CheckSubmissionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<SubmissionRequestResponse>> derivecodecCheckSubmissionAsik = m7575getWebService().checkSubmissionAsik(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckSubmissionAsik, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.checkSubmissionAsik$lambda$22((SubmissionRequestResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda29
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.checkSubmissionAsik$lambda$23(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmissionRequestItem checkSubmissionAsik$lambda$23(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SubmissionRequestItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmissionRequestItem checkSubmissionAsik$lambda$22(SubmissionRequestResponse submissionRequestResponse) {
        Intrinsics.checkNotNullParameter(submissionRequestResponse, "");
        return submissionRequestResponse.getSubmissionRequestItem();
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<List<AsikListKpjItem>> getListKpj(AsikListKpjRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<AsikListKpjResponse>> listKpj = m7575getWebService().getListKpj(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(listKpj, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.getListKpj$lambda$24((AsikListKpjResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda50
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.getListKpj$lambda$25(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListKpj$lambda$25(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListKpj$lambda$24(AsikListKpjResponse asikListKpjResponse) {
        Intrinsics.checkNotNullParameter(asikListKpjResponse, "");
        return asikListKpjResponse.getData();
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<List<AsikListFamilyItem>> getListFamily(AsikListFamilyRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<AsikListFamilyResponse>> listFamily = m7575getWebService().getListFamily(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(listFamily, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.getListFamily$lambda$27((AsikListFamilyResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.getListFamily$lambda$28(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListFamily$lambda$28(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListFamily$lambda$27(AsikListFamilyResponse asikListFamilyResponse) {
        Intrinsics.checkNotNullParameter(asikListFamilyResponse, "");
        List<AsikListFamilyItem> mutableList = CollectionsKt.toMutableList((Collection) asikListFamilyResponse.getData());
        for (AsikListFamilyItem asikListFamilyItem : mutableList) {
            Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
            String identityNumber = asikListFamilyItem.getIdentityNumber();
            if (identityNumber == null) {
                identityNumber = "";
            }
            asikListFamilyItem.setIdentityNumber(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(identityNumber));
            Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
            String familyCardNumber = asikListFamilyItem.getFamilyCardNumber();
            if (familyCardNumber == null) {
                familyCardNumber = "";
            }
            asikListFamilyItem.setFamilyCardNumber(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(familyCardNumber));
            Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
            String fullName = asikListFamilyItem.getFullName();
            if (fullName == null) {
                fullName = "";
            }
            asikListFamilyItem.setFullName(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(fullName));
            Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
            String gender = asikListFamilyItem.getGender();
            if (gender == null) {
                gender = "";
            }
            asikListFamilyItem.setGender(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gender));
            Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
            String birthPlace = asikListFamilyItem.getBirthPlace();
            if (birthPlace == null) {
                birthPlace = "";
            }
            asikListFamilyItem.setBirthPlace(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(birthPlace));
            Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
            String birthDate = asikListFamilyItem.getBirthDate();
            if (birthDate == null) {
                birthDate = "";
            }
            asikListFamilyItem.setBirthDate(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(birthDate));
            Camera2InteropExtender.Companion companion7 = Camera2InteropExtender.INSTANCE;
            String maritalStatus = asikListFamilyItem.getMaritalStatus();
            if (maritalStatus == null) {
                maritalStatus = "";
            }
            asikListFamilyItem.setMaritalStatus(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(maritalStatus));
            Camera2InteropExtender.Companion companion8 = Camera2InteropExtender.INSTANCE;
            String familyStatus = asikListFamilyItem.getFamilyStatus();
            if (familyStatus == null) {
                familyStatus = "";
            }
            asikListFamilyItem.setFamilyStatus(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(familyStatus));
            Camera2InteropExtender.Companion companion9 = Camera2InteropExtender.INSTANCE;
            String address = asikListFamilyItem.getAddress();
            if (address == null) {
                address = "";
            }
            asikListFamilyItem.setAddress(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(address));
        }
        return mutableList;
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<BaseItem> verifyAsikFirstStep(AsikFirstStepRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecVerifyAsikFirstStep = m7575getWebService().verifyAsikFirstStep(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyAsikFirstStep, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.verifyAsikFirstStep$lambda$29((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda34
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.verifyAsikFirstStep$lambda$30(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyAsikFirstStep$lambda$30(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<BaseItem> verifyAsikSecondStep(AsikVerificationStepRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecVerifyAsikSecondStep = m7575getWebService().verifyAsikSecondStep(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyAsikSecondStep, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.verifyAsikSecondStep$lambda$31((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda19
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.verifyAsikSecondStep$lambda$32(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyAsikSecondStep$lambda$32(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<BaseItem> verifyAsikFifthStep(AsikVerificationStepRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecVerifyAsikFifthStep = m7575getWebService().verifyAsikFifthStep(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyAsikFifthStep, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.verifyAsikFifthStep$lambda$33((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda40
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.verifyAsikFifthStep$lambda$34(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyAsikFifthStep$lambda$34(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<AccountBankItem> getAccountBank(AccountBankRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<AccountBankResponse>> accountBank = m7575getWebService().getAccountBank(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(accountBank, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.getAccountBank$lambda$35((AccountBankResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.getAccountBank$lambda$36(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountBankItem getAccountBank$lambda$36(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AccountBankItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountBankItem getAccountBank$lambda$35(AccountBankResponse accountBankResponse) {
        Intrinsics.checkNotNullParameter(accountBankResponse, "");
        return accountBankResponse.getData();
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<List<AddressPostalCodeItem>> addressPostalCode() {
        deriveCodec<List<AddressPostalCodeEntity>> allAddressPostalCode = this.addressPostalCodeDao.getAllAddressPostalCode();
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.addressPostalCode$lambda$37(this.f$0, (List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda52
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.addressPostalCode$lambda$38(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        SingleFlatMap singleFlatMap = new SingleFlatMap(allAddressPostalCode, readablems);
        final Function1 function2 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.addressPostalCode$lambda$39((Throwable) obj);
            }
        };
        readableMs readablems2 = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda54
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.addressPostalCode$lambda$40(function2, obj);
            }
        };
        share.b(readablems2, "resumeFunctionInCaseOfError is null");
        SingleResumeNext singleResumeNext = new SingleResumeNext(singleFlatMap, readablems2);
        Intrinsics.checkNotNullExpressionValue(singleResumeNext, "");
        return singleResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final generateBackupProfile addressPostalCode$lambda$38(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (generateBackupProfile) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final generateBackupProfile addressPostalCode$lambda$37(AsikDataStore asikDataStore, List list) {
        deriveCodec<List<AddressPostalCodeItem>> addressLocal;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            addressLocal = asikDataStore.getAddressRemote();
        } else {
            addressLocal = asikDataStore.getAddressLocal(list);
        }
        return addressLocal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final generateBackupProfile addressPostalCode$lambda$40(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (generateBackupProfile) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final generateBackupProfile addressPostalCode$lambda$39(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return deriveCodec.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<List<AsikListKpjMobileItem>> getListKpjMobile(AsikListKpjMobileRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<AsikListKpjMobileResponse>> listKpjMobile = m7575getWebService().getListKpjMobile(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(listKpjMobile, unbindVar);
        final AsikDataStore$$ExternalSyntheticLambda16 asikDataStore$$ExternalSyntheticLambda16 = new AsikDataStore$$ExternalSyntheticLambda16();
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda17
            private static final byte[] $$c = {56, 94, 119, -19};
            private static final int $$f = 150;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {14, 116, 92, -78, -62, -9, -5, 15, -21, -21, -19, 6, -4, 8, -34, -9, -15, -2, 4, -43, -5, -13, 3, 12, -48, -9, -6, -15, -9, 27, -43, -14, 1, -16, -9, -15, 10, 8, -34, -9, -15, -2, 4, -43, -5, -13, 3, 12, -48, -9, -6, -15, -9, 27, -43, -14, 1, -16, -9, -15, 32, -47, -16, 5, -23, -6, 3, -21, 62, -23, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
            private static final int $$e = 206;
            private static final byte[] $$a = {107, 48, 57, 107, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
            private static final int $$b = 88;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static char[] b = {60052, 60054, 59748, 60061, 60060, 60047, 60048, 60073, 59745, 60057, 60056, 60090, 60072, 60043, 60051, 60050, 60083, 59747, 60058, 60079, 60046, 60045, 60117, 59744, 60040, 60063, 60062, 60041, 60053, 59746, 60049, 60055, 60034, 59749, 60059, 60088};
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57191;

            private static void a(short s, byte b2, short s2, Object[] objArr) {
                int i = 55 - (b2 * 52);
                int i2 = (s * 14) + 84;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[53 - s2];
                int i3 = 52 - s2;
                int i4 = -1;
                if (bArr == null) {
                    int i5 = (i + (-i3)) - 10;
                    i = i;
                    i2 = i5;
                }
                while (true) {
                    int i6 = i + 1;
                    i4++;
                    bArr2[i4] = (byte) i2;
                    if (i4 == i3) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i = i6;
                    i2 = (i2 + (-bArr[i6])) - 10;
                }
            }

            private static void d(int i, short s, int i2, Object[] objArr) {
                int i3 = (i * 66) + 4;
                byte[] bArr = $$d;
                int i4 = i2 * 29;
                int i5 = 84 - (s * 19);
                byte[] bArr2 = new byte[i4 + 38];
                int i6 = i4 + 37;
                int i7 = -1;
                if (bArr == null) {
                    i5 = (i5 + (-i6)) - 10;
                    i3++;
                }
                while (true) {
                    i7++;
                    bArr2[i7] = (byte) i5;
                    if (i7 == i6) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i5 = (i5 + (-bArr[i3])) - 10;
                        i3++;
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0228  */
            /* JADX WARN: Code duplicated, block: B:27:0x022a  */
            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
                    int iRed = Color.red(0) + 28;
                    byte b2 = $$a[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b2, (byte) 52, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, iLastIndexOf, iRed, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{22, 24, 26, 28, 3, '\f', 28, 19, 6, 30, 18, 16, 30, 26, 2, 29, 5, 31, 30, 1, 11, 7}, (byte) (View.MeasureSpec.getSize(0) + 117), 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{25, ' ', 19, '\f', 25, 27, 31, '\r', 24, 20, '#', 1, '\r', 3, 13896}, (byte) (74 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (Process.myTid() >> 22) + 15, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 31534);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
                    int windowTouchSlop = 28 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr = $$a;
                    byte b3 = bArr[80];
                    Object[] objArr5 = new Object[1];
                    a(b3, bArr[7], b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, keyRepeatDelay, windowTouchSlop, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31533);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                        int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                        byte[] bArr2 = $$a;
                        byte b4 = bArr2[80];
                        Object[] objArr6 = new Object[1];
                        a(b4, b4, (byte) (-bArr2[33]), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, absoluteGravity, i2, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i3 = (-1858291073) + (((~(startUptimeMillis | 1015371270)) | (-758708374)) * (-668)) + ((1015371270 | (~((-758708374) | startUptimeMillis))) * 1336) + ((startUptimeMillis | (-20490386)) * 668) + 1405351651;
                    int i4 = (i3 << 13) ^ i3;
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{22, 24, 26, 28, 3, '\f', 28, 19, 19, '\f', 16, 19, 6, 11, 3, 17, 27, 21, 2, '#', 20, '\r', 28, 27, 19, 24}, (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20), Color.rgb(0, 0, 0) + 16777242, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{'\b', 22, 13886, 13886, 27, 29, 11, 17, 13888, 13888, '!', '\r', 6, 22, 3, 17, 4, 24}, (byte) (85 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 61 / 0;
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
                    c(new char[]{0, 24, 22, 19, 19, Typography.quote, 22, 24, '\n', 28, 14, 30, 29, 0, 25, 2}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50), View.combineMeasuredStates(0, 0) + 16, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{'\r', 27, 27, 29, 3, 17, 2, '#', '\f', 22, 26, '\f', 30, 5, 26, 27}, (byte) (66 - Color.alpha(0)), 16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                    int i9 = i8 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1405351651};
                        byte[] bArr3 = $$d;
                        byte b5 = bArr3[94];
                        byte b6 = bArr3[32];
                        Object[] objArr13 = new Object[1];
                        d(b5, b6, b6, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b7 = bArr3[32];
                        byte b8 = bArr3[94];
                        Object[] objArr14 = new Object[1];
                        d(b7, b8, b8, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 31534);
                            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
                            int i10 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[80];
                            Object[] objArr15 = new Object[1];
                            a(b9, b9, (byte) (-bArr4[33]), objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel2, keyRepeatDelay2, i10, -1142834547, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c(new char[]{22, 24, 26, 28, 3, '\f', 28, 19, 6, 30, 18, 16, 30, 26, 2, 29, 5, 31, 30, 1, 11, 7}, (byte) (116 - ((byte) KeyEvent.getModifierMetaStateMask())), 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c(new char[]{25, ' ', 19, '\f', 25, 27, 31, '\r', 24, 20, '#', 1, '\r', 3, 13896}, (byte) (TextUtils.lastIndexOf("", '0') + 74), ExpandableListView.getPackedPositionType(0L) + 15, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                                int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                int mode = 28 - View.MeasureSpec.getMode(0);
                                byte[] bArr5 = $$a;
                                byte b10 = bArr5[80];
                                Object[] objArr18 = new Object[1];
                                a(b10, bArr5[7], b10, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop2, iMakeMeasureSpec, mode, -778300370, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
                                int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                                int iAlpha = 28 - Color.alpha(0);
                                byte b11 = $$a[7];
                                Object[] objArr19 = new Object[1];
                                a(b11, b11, (byte) 52, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, iKeyCodeFromString, iAlpha, -1048449946, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
                int i11 = ((int[]) objArr[1])[0];
                int i12 = ((int[]) objArr[3])[0];
                if (i12 != i11) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i12));
                }
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                int i14 = i13 % 2;
                int i15 = ((int[]) objArr[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i16 = ~iIdentityHashCode;
                int i17 = i15 + 1053551265 + (((~((-1147764318) | i16)) | (~((-626315327) | iIdentityHashCode))) * (-370)) + (((~(iIdentityHashCode | (-1147764318))) | (~(i16 | (-626315327))) | (-1702755968)) * (-370)) + 1340484352;
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr20[0])[0] = i19 ^ (i19 << 5);
                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                int i21 = i20 % 2;
                return AsikDataStore.getListKpjMobile$lambda$42(asikDataStore$$ExternalSyntheticLambda16, obj);
            }

            private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = b;
                long j = 0;
                Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i4 = 0;
                    while (i4 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionGroup(j), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2267, 33 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1927765101, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i4++;
                            j = 0;
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
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getOffsetAfter("", 0), 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, -1927765101, false, $$g(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    int i5 = $11 + 81;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
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
                                    byte b8 = b7;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - Gravity.getAbsoluteGravity(0, 0)), 3261 - TextUtils.getTrimmedLength(""), 30 - (ViewConfiguration.getJumpTapTimeout() >> 16), -127612708, false, $$g(b7, b8, (byte) (b8 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                    int i7 = $10 + 43;
                                    $11 = i7 % 128;
                                    int i8 = i7 % 2;
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b9 = (byte) 0;
                                        byte b10 = b9;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22879 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 594, TextUtils.getCapsMode("", 0, 0) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                    int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i10 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i10];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                                    } else {
                                        int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
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
                int i14 = 0;
                while (i14 < i) {
                    int i15 = $10 + 51;
                    int i16 = i15 % 128;
                    $11 = i16;
                    int i17 = i15 % 2;
                    cArr4[i14] = (char) (cArr4[i14] ^ 13722);
                    i14++;
                    int i18 = i16 + 21;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                }
                objArr[0] = new String(cArr4);
            }

            private static String $$g(int i, short s, short s2) {
                int i2 = 3 - (i * 2);
                int i3 = 116 - s2;
                byte[] bArr = $$c;
                int i4 = s * 2;
                byte[] bArr2 = new byte[1 - i4];
                int i5 = 0 - i4;
                int i6 = -1;
                if (bArr == null) {
                    i6 = -1;
                    i3 = i2 + i3;
                    i2 = i2;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i3;
                    if (i7 == i5) {
                        return new String(bArr2, 0);
                    }
                    int i8 = i2 + 1;
                    i6 = i7;
                    i3 = bArr[i8] + i3;
                    i2 = i8;
                }
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListKpjMobile$lambda$42(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListKpjMobile$lambda$41(AsikListKpjMobileResponse asikListKpjMobileResponse) {
        Intrinsics.checkNotNullParameter(asikListKpjMobileResponse, "");
        return asikListKpjMobileResponse.getData();
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<AsikVerifivationLivenessOnlyResponse> verifyAsikLivenessOnly(AsikVerificationLivenessOnly p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<AsikVerifivationLivenessOnlyResponse>> derivecodecVerifyAsikLivenessOnly = m7575getWebService().verifyAsikLivenessOnly(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyAsikLivenessOnly, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.verifyAsikLivenessOnly$lambda$43((AsikVerifivationLivenessOnlyResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda38
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.verifyAsikLivenessOnly$lambda$44(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsikVerifivationLivenessOnlyResponse verifyAsikLivenessOnly$lambda$44(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AsikVerifivationLivenessOnlyResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<AsikVerifivationLivenessOnlyResponse> verifyAsikLivenessBegin(AsikVerificationLivenessBegin p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<AsikVerifivationLivenessOnlyResponse>> derivecodecVerifyAsikLivenessBegin = m7575getWebService().verifyAsikLivenessBegin(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyAsikLivenessBegin, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.verifyAsikLivenessBegin$lambda$45((AsikVerifivationLivenessOnlyResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda21
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.verifyAsikLivenessBegin$lambda$46(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsikVerifivationLivenessOnlyResponse verifyAsikLivenessBegin$lambda$46(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AsikVerifivationLivenessOnlyResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<BaseItem> verifyAsikSixthStep(AsikVerificationStepRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecVerifyAsikSixthStep = m7575getWebService().verifyAsikSixthStep(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyAsikSixthStep, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.verifyAsikSixthStep$lambda$47((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda33
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.verifyAsikSixthStep$lambda$48(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyAsikSixthStep$lambda$48(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.asik.AsikRepository
    public final deriveCodec<BaseItem> verifyAsikFourStep(AsikVerificationStepRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecVerifyAsikFourStep = m7575getWebService().verifyAsikFourStep(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyAsikFourStep, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.verifyAsikFourStep$lambda$49((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda47
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.verifyAsikFourStep$lambda$50(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyAsikFourStep$lambda$50(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    private final deriveCodec<List<AddressPostalCodeItem>> getAddressRemote() {
        deriveCodec<Response<AddressPostalCodeResponse>> derivecodecAddressPostalCode = m7575getWebService().addressPostalCode();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecAddressPostalCode, unbindVar);
        appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
        share.b(appendbackupvideoprofileB, "scheduler is null");
        SingleSubscribeOn singleSubscribeOn = new SingleSubscribeOn(setbuffersizeinbytes, appendbackupvideoprofileB);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.getAddressRemote$lambda$51((AddressPostalCodeResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda42
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return AsikDataStore.getAddressRemote$lambda$52(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(singleSubscribeOn, readablems);
        final Function1 function2 = new Function1() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikDataStore.getAddressRemote$lambda$56(this.f$0, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda45
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(api23Impl, logtostring);
        Intrinsics.checkNotNullExpressionValue(currentsystemtimens, "");
        return currentsystemtimens;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAddressRemote$lambda$52(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAddressRemote$lambda$51(AddressPostalCodeResponse addressPostalCodeResponse) {
        Intrinsics.checkNotNullParameter(addressPostalCodeResponse, "");
        return addressPostalCodeResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAddressRemote$lambda$56(final AsikDataStore asikDataStore, final List list) {
        deriveCodec derivecodecB = deriveCodec.b(new Callable() { // from class: com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda27
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AsikDataStore.getAddressRemote$lambda$56$lambda$55(list, asikDataStore);
            }
        });
        appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
        share.b(appendbackupvideoprofileB, "scheduler is null");
        new SingleSubscribeOn(derivecodecB, appendbackupvideoprofileB).TuitionPaymentFragmentspecialinlinedviewModeldefault3(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAddressRemote$lambda$56$lambda$55(List list, AsikDataStore asikDataStore) throws IOException {
        Intrinsics.checkNotNull(list);
        List<AddressPostalCodeItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (AddressPostalCodeItem addressPostalCodeItem : list2) {
            arrayList.add(new AddressPostalCodeEntity(0L, addressPostalCodeItem.getCode(), addressPostalCodeItem.getAddress(), 1, null));
        }
        Iterator it = CollectionsKt.chunked(arrayList, 1000).iterator();
        while (it.hasNext()) {
            try {
                asikDataStore.addressPostalCodeDao.insertAllAddressPostalCode((List) it.next());
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Data inserted successfully", new Object[0]);
            } catch (Exception e2) {
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, "Error during data insertion", new Object[0]);
            }
        }
        return Unit.INSTANCE;
    }

    private final deriveCodec<List<AddressPostalCodeItem>> getAddressLocal(List<AddressPostalCodeEntity> p0) {
        List<AddressPostalCodeEntity> list = p0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (AddressPostalCodeEntity addressPostalCodeEntity : list) {
            arrayList.add(new AddressPostalCodeItem(addressPostalCodeEntity.getCode(), addressPostalCodeEntity.getAddress()));
        }
        deriveCodec<List<AddressPostalCodeItem>> derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2 = deriveCodec.TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayList);
        Intrinsics.checkNotNullExpressionValue(derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        return derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem documentAsik$lambda$4(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmployeeItem employeeData$lambda$8(EmployeeItem employeeItem) {
        Intrinsics.checkNotNullParameter(employeeItem, "");
        return employeeItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpRequestItem postOtpByEmailRequest$lambda$14(OtpRequestItem otpRequestItem) {
        Intrinsics.checkNotNullParameter(otpRequestItem, "");
        return otpRequestItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpRequestItem postOtpByPhoneRequest$lambda$16(OtpRequestItem otpRequestItem) {
        Intrinsics.checkNotNullParameter(otpRequestItem, "");
        return otpRequestItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifEkyc$lambda$6(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyAsikFifthStep$lambda$33(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyAsikFirstStep$lambda$29(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyAsikFourStep$lambda$49(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsikVerifivationLivenessOnlyResponse verifyAsikLivenessBegin$lambda$45(AsikVerifivationLivenessOnlyResponse asikVerifivationLivenessOnlyResponse) {
        Intrinsics.checkNotNullParameter(asikVerifivationLivenessOnlyResponse, "");
        return asikVerifivationLivenessOnlyResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsikVerifivationLivenessOnlyResponse verifyAsikLivenessOnly$lambda$43(AsikVerifivationLivenessOnlyResponse asikVerifivationLivenessOnlyResponse) {
        Intrinsics.checkNotNullParameter(asikVerifivationLivenessOnlyResponse, "");
        return asikVerifivationLivenessOnlyResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyAsikSecondStep$lambda$31(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyAsikSixthStep$lambda$47(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyOtpAsikByEmailRequest$lambda$18(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyOtpAsikByPhoneRequest$lambda$20(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }
}
