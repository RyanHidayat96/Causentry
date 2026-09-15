package com.bpjstku.data.jht;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
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
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.jht.model.request.CheckAdminDukRequest;
import com.bpjstku.data.jht.model.request.CheckBankAccountRequest;
import com.bpjstku.data.jht.model.request.CheckEligibilityRequest;
import com.bpjstku.data.jht.model.request.CheckFaceLivenessRequest;
import com.bpjstku.data.jht.model.request.CheckIdFacelivenessRequest;
import com.bpjstku.data.jht.model.request.CheckPhotoAdminDukRequest;
import com.bpjstku.data.jht.model.request.ClaimCheckBankBpuReactivationRequest;
import com.bpjstku.data.jht.model.request.ClaimCheckEligibilityRequest;
import com.bpjstku.data.jht.model.request.ClaimEmployeeDataRequest;
import com.bpjstku.data.jht.model.request.ClaimEvidenceJhtRequest;
import com.bpjstku.data.jht.model.request.ClaimLivenessFaceMatchCheckRequest;
import com.bpjstku.data.jht.model.request.ClaimLivenessFaceMatchRequest;
import com.bpjstku.data.jht.model.request.ClaimReactivationBpuTuitionRequest;
import com.bpjstku.data.jht.model.request.ClaimReasonRequest;
import com.bpjstku.data.jht.model.request.ClaimSegmenRequest;
import com.bpjstku.data.jht.model.request.GenerateClaimCodeRequest;
import com.bpjstku.data.jht.model.request.GetRsJhtRequest;
import com.bpjstku.data.jht.model.request.InfoPraClaimRequest;
import com.bpjstku.data.jht.model.request.JhtBalanceRequest;
import com.bpjstku.data.jht.model.request.JhtBenefitDetailRequest;
import com.bpjstku.data.jht.model.request.JhtClaimContributionRequest;
import com.bpjstku.data.jht.model.request.JhtClaimRequest;
import com.bpjstku.data.jht.model.request.JhtClaimTrackRequest;
import com.bpjstku.data.jht.model.request.JhtContributionDetailRequest;
import com.bpjstku.data.jht.model.request.JhtInstantClaimRequest;
import com.bpjstku.data.jht.model.request.JhtSubscriptionRequest;
import com.bpjstku.data.jht.model.request.SendRsJhtRequest;
import com.bpjstku.data.jht.model.response.ClaimCheckBankBpuReactivationResponse;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtResponse;
import com.bpjstku.data.jht.model.response.ClaimLayoffDocCodeResponse;
import com.bpjstku.data.jht.model.response.ClaimLivenessResponse;
import com.bpjstku.data.jht.model.response.ClaimNotReactivationReason;
import com.bpjstku.data.jht.model.response.ClaimReactivationBpuTuitionResponse;
import com.bpjstku.data.jht.model.response.ClaimSegmenResponse;
import com.bpjstku.data.jht.model.response.GenerateClaimCodeResponse;
import com.bpjstku.data.jht.model.response.InfoPraClaimItems;
import com.bpjstku.data.jht.model.response.InfoPraClaimResponse;
import com.bpjstku.data.jht.model.response.JhtBalanceItem;
import com.bpjstku.data.jht.model.response.JhtBalanceResponse;
import com.bpjstku.data.jht.model.response.JhtBenefitDetailItem;
import com.bpjstku.data.jht.model.response.JhtBenefitDetailResponse;
import com.bpjstku.data.jht.model.response.JhtClaimCheckPhotoResponse;
import com.bpjstku.data.jht.model.response.JhtClaimContributionResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEligibilityResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem;
import com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataResponse;
import com.bpjstku.data.jht.model.response.JhtClaimReasonResponse;
import com.bpjstku.data.jht.model.response.JhtClaimSignaturedItem;
import com.bpjstku.data.jht.model.response.JhtClaimTrackItem;
import com.bpjstku.data.jht.model.response.JhtContributionDetailItem;
import com.bpjstku.data.jht.model.response.JhtContributionDetailResponse;
import com.bpjstku.data.jht.model.response.JhtEligibilityClaimItem;
import com.bpjstku.data.jht.model.response.JhtSubscriptionItem;
import com.bpjstku.data.jht.model.response.JhtSubscriptionResponse;
import com.bpjstku.data.jht.model.response.ListClaimSegmenItem;
import com.bpjstku.data.jht.model.response.ListCodeLayOffCode;
import com.bpjstku.data.jht.model.response.ReasonNotReactive;
import com.bpjstku.data.jht.remote.JhtApi;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.gms.auth.api.accounttransfer.zzn;
import defpackage.Api23Impl;
import defpackage.Camera2InteropExtender;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.VideoRecordEvent;
import defpackage.createCameraSelectorById;
import defpackage.deriveCodec;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.lambdastart2androidxcameravideointernalaudioAudioSource;
import defpackage.mergeChildrenConfigs;
import defpackage.overrideBySilence;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.share;
import defpackage.unbind;
import defpackage.unbindAll;
import defpackage.unbindChildren;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\u0003\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00072\u0006\u0010\u0003\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00072\u0006\u0010\u0003\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00072\u0006\u0010\u0003\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u000200H\u0017¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u0015032\u0006\u0010\u0003\u001a\u000200H\u0017¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u000206H\u0017¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020%0\u00072\u0006\u0010\u0003\u001a\u000209H\u0017¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u00020<H\u0017¢\u0006\u0004\b=\u0010>J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00072\u0006\u0010\u0003\u001a\u00020?H\u0017¢\u0006\u0004\bA\u0010BJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00072\u0006\u0010\u0003\u001a\u00020CH\u0017¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u00020GH\u0017¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u000200H\u0017¢\u0006\u0004\bJ\u00102J\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u00072\u0006\u0010\u0003\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010NJ\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00072\u0006\u0010\u0003\u001a\u00020OH\u0017¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u00072\u0006\u0010\u0003\u001a\u00020SH\u0017¢\u0006\u0004\bU\u0010VJ#\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\b0\u00072\u0006\u0010\u0003\u001a\u00020WH\u0017¢\u0006\u0004\bY\u0010ZJ\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u00072\u0006\u0010\u0003\u001a\u00020[H\u0017¢\u0006\u0004\b]\u0010^J\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u00072\u0006\u0010\u0003\u001a\u00020_H\u0017¢\u0006\u0004\ba\u0010bJ\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020`0\u00072\u0006\u0010\u0003\u001a\u00020cH\u0017¢\u0006\u0004\bd\u0010eJ#\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0\b0\u00072\u0006\u0010\u0003\u001a\u00020fH\u0017¢\u0006\u0004\bh\u0010iJ#\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0\b0\u00072\u0006\u0010\u0003\u001a\u00020jH\u0017¢\u0006\u0004\bl\u0010mJ\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020o0\u00072\u0006\u0010\u0003\u001a\u00020nH\u0017¢\u0006\u0004\bp\u0010qJ\u001d\u0010t\u001a\b\u0012\u0004\u0012\u00020s0\u00072\u0006\u0010\u0003\u001a\u00020rH\u0017¢\u0006\u0004\bt\u0010uJ\u001b\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020v0\b0\u0007H\u0017¢\u0006\u0004\bw\u0010xR\u001a\u0010y\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u001e\u0010~\u001a\u0004\u0018\u00010}8\u0017X\u0097\u0004¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001"}, d2 = {"Lcom/bpjstku/data/jht/JhtDataStore;", "Lcom/bpjstku/data/jht/JhtRepository;", "Lcom/bpjstku/data/jht/remote/JhtApi;", "p0", "<init>", "(Lcom/bpjstku/data/jht/remote/JhtApi;)V", "Lcom/bpjstku/data/jht/model/request/JhtBalanceRequest;", "LderiveCodec;", "", "Lcom/bpjstku/data/jht/model/response/JhtBalanceItem;", "getJhtBalance", "(Lcom/bpjstku/data/jht/model/request/JhtBalanceRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtSubscriptionRequest;", "Lcom/bpjstku/data/jht/model/response/JhtSubscriptionItem;", "getJhtSubscriptions", "(Lcom/bpjstku/data/jht/model/request/JhtSubscriptionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/GetRsJhtRequest;", "Lokhttp3/ResponseBody;", "getRsJht", "(Lcom/bpjstku/data/jht/model/request/GetRsJhtRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/SendRsJhtRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "sendRsJht", "(Lcom/bpjstku/data/jht/model/request/SendRsJhtRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/GenerateClaimCodeRequest;", "Lcom/bpjstku/data/jht/model/response/GenerateClaimCodeResponse;", "getGenerateClaimCode", "(Lcom/bpjstku/data/jht/model/request/GenerateClaimCodeRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckEligibilityRequest;", "Lcom/bpjstku/data/jht/model/response/JhtEligibilityClaimItem;", "checkEligibilityRequest", "(Lcom/bpjstku/data/jht/model/request/CheckEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimReasonRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimReasonResponse;", "getClaimReason", "(Lcom/bpjstku/data/jht/model/request/ClaimReasonRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckAdminDukRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimSignaturedItem;", "checkAdminDuk", "(Lcom/bpjstku/data/jht/model/request/CheckAdminDukRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckPhotoAdminDukRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimCheckPhotoResponse;", "checkPhotoAdminDuk", "(Lcom/bpjstku/data/jht/model/request/CheckPhotoAdminDukRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimEvidenceJhtRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtResponse;", "checkClaimEvidenceJht", "(Lcom/bpjstku/data/jht/model/request/ClaimEvidenceJhtRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckFaceLivenessRequest;", "checkDukcapilFaceLiveness", "(Lcom/bpjstku/data/jht/model/request/CheckFaceLivenessRequest;)LderiveCodec;", "LVideoRecordEvent;", "checkNodefluxFaceLiveness", "(Lcom/bpjstku/data/jht/model/request/CheckFaceLivenessRequest;)LVideoRecordEvent;", "Lcom/bpjstku/data/jht/model/request/CheckIdFacelivenessRequest;", "checkIdFaceLiveness", "(Lcom/bpjstku/data/jht/model/request/CheckIdFacelivenessRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckBankAccountRequest;", "checkBankAccount", "(Lcom/bpjstku/data/jht/model/request/CheckBankAccountRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtClaimRequest;", "postJhtKlaim", "(Lcom/bpjstku/data/jht/model/request/JhtClaimRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtClaimTrackRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimTrackItem;", "postTrackClaim", "(Lcom/bpjstku/data/jht/model/request/JhtClaimTrackRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtBenefitDetailRequest;", "Lcom/bpjstku/data/jht/model/response/JhtBenefitDetailItem;", "getBenefitDetail", "(Lcom/bpjstku/data/jht/model/request/JhtBenefitDetailRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtInstantClaimRequest;", "postJhtInstantClaim", "(Lcom/bpjstku/data/jht/model/request/JhtInstantClaimRequest;)LderiveCodec;", "checkFaceLivenessBiometric", "Lcom/bpjstku/data/jht/model/request/ClaimCheckEligibilityRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityResponse;", "checkEligibilityClaim", "(Lcom/bpjstku/data/jht/model/request/ClaimCheckEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimEmployeeDataRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimEmployeeDataItem;", "getEmployeeDataClaim", "(Lcom/bpjstku/data/jht/model/request/ClaimEmployeeDataRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/InfoPraClaimRequest;", "Lcom/bpjstku/data/jht/model/response/InfoPraClaimItems;", "getInfoPraClaim", "(Lcom/bpjstku/data/jht/model/request/InfoPraClaimRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtContributionDetailRequest;", "Lcom/bpjstku/data/jht/model/response/JhtContributionDetailItem;", "getJhtContributionDetail", "(Lcom/bpjstku/data/jht/model/request/JhtContributionDetailRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtClaimContributionRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimContributionResponse;", "getJhtClaimContributionDetail", "(Lcom/bpjstku/data/jht/model/request/JhtClaimContributionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchCheckRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimLivenessResponse;", "claimLivenessFaceMatchCheck", "(Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchCheckRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchRequest;", "claimLivenessFaceMatch", "(Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimSegmenRequest;", "Lcom/bpjstku/data/jht/model/response/ListClaimSegmenItem;", "getClaimSegment", "(Lcom/bpjstku/data/jht/model/request/ClaimSegmenRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/jht/model/response/ListCodeLayOffCode;", "getClaimLayoffDocCode", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimReactivationBpuTuitionRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimReactivationBpuTuitionResponse;", "getClaimReactivationBpuTuition", "(Lcom/bpjstku/data/jht/model/request/ClaimReactivationBpuTuitionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimCheckBankBpuReactivationRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimCheckBankBpuReactivationResponse;", "claimCheckBankBpuReactivation", "(Lcom/bpjstku/data/jht/model/request/ClaimCheckBankBpuReactivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/response/ReasonNotReactive;", "claimGetListReasonBpu", "()LderiveCodec;", "webService", "Lcom/bpjstku/data/jht/remote/JhtApi;", "getWebService", "()Lcom/bpjstku/data/jht/remote/JhtApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JhtDataStore implements JhtRepository {
    public static final int $stable = 8;
    private static boolean TuitionPaymentFragmentbindingInflater1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static int g;
    private final Void dbService;
    private final JhtApi webService;
    private static final byte[] $$c = {21, -108, 100, 114};
    private static final int $$d = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {119, -103, 14, -22, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 62;
    private static int asInterface = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asBinder = 1;

    private static void a(short s, short s2, short s3, Object[] objArr) {
        byte[] bArr = $$a;
        int i = 92 - s3;
        int i2 = (s2 * 4) + 84;
        int i3 = s * 15;
        byte[] bArr2 = new byte[i3 + 38];
        int i4 = i3 + 37;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i + (-i2)) - 11;
            i = i;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + (-bArr[i7])) - 11;
            i = i7;
            i5 = i6;
        }
    }

    public JhtDataStore(JhtApi jhtApi) {
        Intrinsics.checkNotNullParameter(jhtApi, "");
        this.webService = jhtApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7627getDbService() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        mergeChildrenConfigs mergechildrenconfigs = (mergeChildrenConfigs) getDbService();
        int i4 = asBinder + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return mergechildrenconfigs;
    }

    /* JADX INFO: renamed from: getWebService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ unbindChildren m7628getWebService() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        JhtApi webService = getWebService();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return webService;
    }

    public final JhtApi getWebService() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        JhtApi jhtApi = this.webService;
        int i5 = i2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return jhtApi;
    }

    public final Void getDbService() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Void r1 = this.dbService;
        int i5 = i3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return r1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final List getJhtBalance$lambda$0(JhtBalanceResponse jhtBalanceResponse) {
        List<JhtBalanceItem> data;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jhtBalanceResponse, "");
            data = jhtBalanceResponse.getData();
            int i3 = 25 / 0;
        } else {
            Intrinsics.checkNotNullParameter(jhtBalanceResponse, "");
            data = jhtBalanceResponse.getData();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return data;
    }

    private static final List getJhtBalance$lambda$1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<List<JhtBalanceItem>> getJhtBalance(JhtBalanceRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtBalanceResponse>> jhtBalance = getWebService().getJhtBalance(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(jhtBalance, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda44
            private static final byte[] $$c = {73, 55, 58, 33};
            private static final int $$f = 78;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {109, 48, -62, 38, 17, 3, -58, 62, 13, 5, -3, 10, -2, -50, 56, 18, -5, 19, 2, -1, 0, -49, 68, -7, 24, -10, 18, -4, -3, 16, -57, 58, 17, 2, 8, 8, -63, 76, 4, -6, 8, 2, 16, -6, 1, 19, -64, 40, 41, -15, 18, 11, -6, 22, -16, 18, -22, 35, -76, 36, 52, -8, 1, 24, -10, -30, 50, 14, -14, 19, -28, 24, 19, 7, -4, 13};
            private static final int $$e = 236;
            private static final byte[] $$a = {81, 125, 2, 46, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 127;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static int b = -83722249;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r0 = r7 + 1
                    byte[] r1 = com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda44.$$a
                    int r8 = r8 * 52
                    int r8 = 56 - r8
                    int r6 = r6 * 14
                    int r6 = r6 + 84
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L14
                    r3 = r8
                    r4 = r2
                    goto L2d
                L14:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L18:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L25:
                    int r3 = r3 + 1
                    r4 = r1[r6]
                    r5 = r3
                    r3 = r6
                    r6 = r4
                    r4 = r5
                L2d:
                    int r8 = r8 + r6
                    int r8 = r8 + (-10)
                    int r6 = r3 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda44.a(int, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x002b  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r5, byte r6, short r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda44.$$d
                    int r6 = r6 * 72
                    int r1 = 73 - r6
                    int r5 = r5 * 72
                    int r5 = 75 - r5
                    int r7 = r7 + 98
                    byte[] r1 = new byte[r1]
                    int r6 = 72 - r6
                    r2 = -1
                    if (r0 != 0) goto L16
                    r7 = r5
                    r3 = r6
                    goto L2d
                L16:
                    r4 = r7
                    r7 = r5
                    r5 = r4
                L19:
                    int r2 = r2 + 1
                    byte r3 = (byte) r5
                    r1[r2] = r3
                    int r7 = r7 + 1
                    if (r2 != r6) goto L2b
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r1, r6)
                    r8[r6] = r5
                    return
                L2b:
                    r3 = r0[r7]
                L2d:
                    int r5 = r5 + r3
                    int r5 = r5 + (-5)
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda44.d(byte, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:36:0x018b  */
            /* JADX WARN: Code duplicated, block: B:37:0x018c  */
            private static void c(boolean z, int i2, int i3, int i4, char[] cArr, Object[] objArr) throws Throwable {
                int i5;
                char[] cArr2;
                Throwable cause;
                int i6 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr3 = new char[i3];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                int i7 = $10 + 7;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                while (true) {
                    i5 = 29209604;
                    if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i3) {
                        break;
                    }
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i9 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i9]), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 3291 - TextUtils.getOffsetAfter("", 0), 31 - View.MeasureSpec.getSize(0), 1199271174, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 1;
                            byte b5 = (byte) (-b4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 650 - ImageFormat.getBitsPerPixel(0), ExpandableListView.getPackedPositionGroup(0L) + 44, -450685997, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i4 > 0) {
                    int i10 = $11 + 105;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i4;
                    char[] cArr4 = new char[i3];
                    System.arraycopy(cArr3, 0, cArr4, 0, i3);
                    System.arraycopy(cArr4, 0, cArr3, i3 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i3 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    int i12 = $11 + 63;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                }
                if (!(!z)) {
                    int i14 = $11 + 43;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr2 = new char[i3];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    } else {
                        cArr2 = new char[i3];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    }
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i3) {
                        cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i3 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (-b6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getTrimmedLength(""), 651 - (ViewConfiguration.getScrollBarSize() >> 8), 44 - View.MeasureSpec.makeMeasureSpec(0, 0), -450685997, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i15 = $11 + 13;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        i5 = 29209604;
                    }
                    cArr3 = cArr2;
                }
                objArr[0] = new String(cArr3);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char tapTimeout = (char) (31533 - (ViewConfiguration.getTapTimeout() >> 16));
                    int iAlpha = Color.alpha(0) + 921;
                    int minimumFlingVelocity = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr = $$a;
                    byte b2 = bArr[37];
                    Object[] objArr2 = new Object[1];
                    a(b2, bArr[80], b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, iAlpha, minimumFlingVelocity, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(false, 247 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 22 - KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20, new char[]{1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(true, ((Process.getThreadPriority(0) + 20) >> 6) + 252, 15 - TextUtils.getTrimmedLength(""), KeyEvent.keyCodeFromString("") + 11, new char[]{5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r'}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 31533);
                    int iArgb = Color.argb(0, 0, 0, 0) + 921;
                    int i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[80];
                    Object[] objArr5 = new Object[1];
                    a(b3, (byte) (b3 | 52), bArr2[37], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iArgb, i3, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                    TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                    int i5 = i4 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                        int iAxisFromString = 920 - MotionEvent.axisFromString("");
                        int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b4 = $$a[80];
                        byte b5 = b4;
                        Object[] objArr6 = new Object[1];
                        a(b5, (byte) (b5 | 37), b4, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, iAxisFromString, iLastIndexOf, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i6 = (((~(iIdentityHashCode | 1061754692)) * TypedValues.CycleType.TYPE_EASING) - 354529217) + (((~((~iIdentityHashCode) | 1061754692)) | 708908868) * TypedValues.CycleType.TYPE_EASING) + 385581687;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 248, 26 - View.getDefaultSize(0, 0), 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(true, ExpandableListView.getPackedPositionType(0L) + 255, (ViewConfiguration.getTapTimeout() >> 16) + 18, TextUtils.getOffsetAfter("", 0) + 2, new char[]{11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b'}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(true, (ViewConfiguration.getScrollBarSize() >> 8) + 247, TextUtils.getOffsetBefore("", 0) + 16, 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(false, TextUtils.indexOf((CharSequence) "", '0') + 252, TextUtils.getTrimmedLength("") + 16, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8, new char[]{65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19}, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 385581687};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[44];
                        Object[] objArr13 = new Object[1];
                        d(b6, bArr3[20], b6, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b7 = bArr3[20];
                        Object[] objArr14 = new Object[1];
                        d(b7, bArr3[44], b7, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char gidForName = (char) (31532 - Process.getGidForName(""));
                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
                            int pressedStateDuration = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            byte b8 = $$a[80];
                            byte b9 = b8;
                            Object[] objArr16 = new Object[1];
                            a(b9, (byte) (b9 | 37), b8, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, iLastIndexOf2, pressedStateDuration, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(false, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 248, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, 21 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11}, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 252, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, 10 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r'}, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char threadPriority = (char) (31533 - ((Process.getThreadPriority(0) + 20) >> 6));
                                int i9 = 921 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int keyRepeatTimeout2 = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte[] bArr4 = $$a;
                                byte b10 = bArr4[80];
                                Object[] objArr19 = new Object[1];
                                a(b10, (byte) (b10 | 52), bArr4[37], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, i9, keyRepeatTimeout2, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                                int gidForName2 = Process.getGidForName("") + 29;
                                byte[] bArr5 = $$a;
                                byte b11 = bArr5[37];
                                Object[] objArr20 = new Object[1];
                                a(b11, bArr5[80], b11, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, edgeSlop, gidForName2, -1048449946, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr15;
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
                int i10 = ((int[]) objArr[1])[0];
                int i11 = ((int[]) objArr[3])[0];
                if (i11 == i10) {
                    int i12 = ((int[]) objArr[0])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i13 = i12 + (((~(iIdentityHashCode2 | 1256784563)) * TypedValues.CycleType.TYPE_EASING) - 1419874453) + (((~((~iIdentityHashCode2) | 1256784563)) | 180421280) * TypedValues.CycleType.TYPE_EASING);
                    int i14 = (i13 << 13) ^ i13;
                    int i15 = i14 ^ (i14 >>> 17);
                    ((int[]) objArr21[0])[0] = i15 ^ (i15 << 5);
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                    TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                        int i19 = 2;
                        int i20 = i18 % 2;
                        int i21 = 0;
                        while (i21 < strArr.length) {
                            int i22 = TuitionPaymentFragmentbindingInflater1 + 59;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
                            int i23 = i22 % i19;
                            arrayList.add(strArr[i21]);
                            i21++;
                            i19 = 2;
                        }
                    }
                    int[] iArr = new int[i11];
                    int i24 = i11 - 1;
                    iArr[i24] = 1;
                    Toast.makeText((Context) null, iArr[((i11 * i24) % 2) - 1], 1).show();
                    int i25 = ((int[]) objArr[0])[0];
                    Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i26 = ~iElapsedRealtime;
                    int i27 = i25 + 2102308869 + (((~((-73985606) | i26)) | (~(iElapsedRealtime | 1700094038))) * 333) + (((~(iElapsedRealtime | (-73985606))) | (~(i26 | 1700094038))) * 333);
                    int i28 = (i27 << 13) ^ i27;
                    int i29 = i28 ^ (i28 >>> 17);
                    ((int[]) objArr22[0])[0] = i29 ^ (i29 << 5);
                }
                List list$r8$lambda$4D0PouKG0mhYjRAFMiXH_FLhwFA = JhtDataStore.$r8$lambda$4D0PouKG0mhYjRAFMiXH_FLhwFA((JhtBalanceResponse) obj);
                int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                TuitionPaymentFragmentbindingInflater1 = i30 % 128;
                int i31 = i30 % 2;
                return list$r8$lambda$4D0PouKG0mhYjRAFMiXH_FLhwFA;
            }

            private static String $$g(int i2, short s, short s2) {
                int i3 = s2 * 3;
                byte[] bArr = $$c;
                int i4 = s + 4;
                int i5 = 120 - i2;
                byte[] bArr2 = new byte[1 - i3];
                int i6 = 0 - i3;
                int i7 = -1;
                if (bArr == null) {
                    i5 = i6 + i4;
                    i4 = i4;
                    i7 = -1;
                }
                while (true) {
                    int i8 = i7 + 1;
                    bArr2[i8] = (byte) i5;
                    int i9 = i4 + 1;
                    if (i8 == i6) {
                        return new String(bArr2, 0);
                    }
                    i5 += bArr[i9];
                    i4 = i9;
                    i7 = i8;
                }
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda55
            private static final byte[] $$c = {57, -56, 23, -36};
            private static final int $$d = 80;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 21;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {1442634364, -1484271584, -1038400540, 1313681234, 62091686, 992256643, -402370082, -2104021792, -1539651489, -693214596, 1190229948, -37784889, 430904771, 2111608201, -854258707, -664412985, 234423503, 891005914};

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r0 = r7 + 1
                    int r8 = r8 * 52
                    int r8 = 56 - r8
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    byte[] r1 = com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda55.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r7) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L23:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r6 = -r6
                    int r8 = r8 + r6
                    int r6 = r3 + 1
                    int r8 = r8 + (-11)
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda55.a(byte, byte, int, java.lang.Object[]):void");
            }

            private static void b(int[] iArr, int i2, Object[] objArr) throws Throwable {
                int i3;
                int length;
                int[] iArr2;
                int i4 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i5 = -1870535734;
                long j = 0;
                int i6 = 1;
                int i7 = 0;
                if (iArr3 != null) {
                    int i8 = $10 + 83;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        length = iArr3.length;
                        iArr2 = new int[length];
                    } else {
                        length = iArr3.length;
                        iArr2 = new int[length];
                    }
                    int i9 = 0;
                    while (i9 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i7] = Integer.valueOf(iArr3[i9]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 3292;
                                int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 32;
                                byte b2 = (byte) i7;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, iIndexOf, packedPositionChild, 1948206109, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr2[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i9++;
                            i5 = -1870535734;
                            j = 0;
                            i7 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i10 = $10 + 63;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    iArr3 = iArr2;
                }
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i12 = 0;
                    while (i12 < length3) {
                        Object[] objArr3 = new Object[i6];
                        objArr3[0] = Integer.valueOf(iArr5[i12]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + i6), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3290, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30, 1948206109, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i12++;
                        iArr5 = iArr5;
                        i6 = 1;
                    }
                    int i13 = $10 + 73;
                    $11 = i13 % 128;
                    i3 = 2;
                    int i14 = i13 % 2;
                    iArr5 = iArr6;
                } else {
                    i3 = 2;
                }
                char c = 0;
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                sessionConfigValidatingBuilder.b = i3;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i15 = 17;
                    for (int i16 = 1; i15 > i16; i16 = 1) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getMode(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2559, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, 683220507, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i15--;
                    }
                    int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28878), MotionEvent.axisFromString("") + 349, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    c = 0;
                }
                objArr[0] = new String(cArr2, 0, i2);
            }

            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i3 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 651;
                    int mirror = '\\' - AndroidCharacter.getMirror('0');
                    byte b2 = $$a[5];
                    Object[] objArr2 = new Object[1];
                    a(b2, (byte) 52, b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, i3, mirror, -459846511, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                b(new int[]{-86419617, -671266764, 1573544498, 1353751971, 1206662038, -343481262, 1213961826, 1572571299, 1748918721, 2096672584, -590488901, -1878168252, 711570896, -496287904}, 21 - TextUtils.indexOf((CharSequence) "", '0'), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(new int[]{344029162, 1922384151, 788011671, -322400155, -52932543, -744378203, 908815449, -1312533407, -1551118535, 1948944104}, (ViewConfiguration.getEdgeSlop() >> 16) + 15, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int size = View.MeasureSpec.getSize(0) + 651;
                    int iMyPid = 44 - (Process.myPid() >> 22);
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr5 = new Object[1];
                    a(b3, b4, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, size, iMyPid, -873460649, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    int i5 = i4 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int i6 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                        int iCombineMeasuredStates = 44 - View.combineMeasuredStates(0, 0);
                        byte[] bArr = $$a;
                        byte b5 = bArr[5];
                        Object[] objArr6 = new Object[1];
                        a(b5, (byte) (b5 | 36), bArr[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i6, iCombineMeasuredStates, -1595579076, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i7 = ((int[]) objArr7[2])[0];
                    int i8 = ((int[]) objArr7[0])[0];
                    int iNextInt = new Random().nextInt(37946097);
                    int i9 = (-353373327) + (((~(1034958198 | iNextInt)) | 4491776) * 104) + ((~((~iNextInt) | (-1060967))) * (-104)) + ((iNextInt | 1038389008) * 104) + 1943508291;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 1610 - (Process.myTid() >> 22), 25 - TextUtils.lastIndexOf("", '0', 0, 0), 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1943508291, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cBlue = (char) Color.blue(0);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 652;
                            int iBlue = Color.blue(0) + 44;
                            byte b6 = $$a[7];
                            byte b7 = b6;
                            Object[] objArr9 = new Object[1];
                            a(b6, b7, b7, objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, iIndexOf, iBlue, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0), 695 - Color.argb(0, 0, 0, 0), KeyEvent.keyCodeFromString("") + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.blue(0) + 63406), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 792, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                        }
                        objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int i12 = 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i13 = 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte[] bArr2 = $$a;
                            byte b8 = bArr2[5];
                            Object[] objArr10 = new Object[1];
                            a(b8, (byte) (b8 | 36), bArr2[7], objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, i12, i13, -1595579076, false, (String) objArr10[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                        try {
                            Object[] objArr11 = new Object[1];
                            b(new int[]{-86419617, -671266764, 1573544498, 1353751971, 1206662038, -343481262, 1213961826, 1572571299, 1748918721, 2096672584, -590488901, -1878168252, 711570896, -496287904}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, objArr11);
                            Class<?> cls2 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            b(new int[]{344029162, 1922384151, 788011671, -322400155, -52932543, -744378203, 908815449, -1312533407, -1551118535, 1948944104}, 15 - KeyEvent.normalizeMetaState(0), objArr12);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char cGreen = (char) Color.green(0);
                                int i14 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 652;
                                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 44;
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr13 = new Object[1];
                                a(b9, b10, b10, objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cGreen, i14, longPressTimeout2, -873460649, false, (String) objArr13[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 651;
                                int mode = View.MeasureSpec.getMode(0) + 44;
                                byte b11 = $$a[5];
                                Object[] objArr14 = new Object[1];
                                a(b11, (byte) 52, b11, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, iResolveSizeAndState, mode, -459846511, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                            int i16 = i15 % 2;
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
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((int[]) objArr[2])[0];
                if (i18 == i17) {
                    Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i19 = ((int[]) objArr[3])[0];
                    int i20 = ((int[]) objArr[2])[0];
                    int i21 = ((int[]) objArr[0])[0];
                    int iMyTid = Process.myTid();
                    int i22 = i19 + (-1567624017) + (((~((-3548163) | iMyTid)) | (~((~iMyTid) | (-117353)))) * (-318)) + (((~(976631042 | iMyTid)) | (-976748395)) * (-318)) + (((~(iMyTid | (-976631043))) | 973200232) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                    int i23 = (i22 << 13) ^ i22;
                    int i24 = i23 ^ (i23 >>> 17);
                    ((int[]) objArr15[3])[0] = i24 ^ (i24 << 5);
                    int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                    int i26 = i25 % 2;
                    return JhtDataStore.m7619$r8$lambda$VvoNq3gI4dTe2MTZHMO5cNaX6Y(function1, obj);
                }
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[1];
                if (strArr != null) {
                    int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                    int i28 = i27 % 2 != 0 ? 0 : 1;
                    while (i28 < strArr.length) {
                        int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i29 % 128;
                        if (i29 % 2 == 0) {
                            arrayList.add(strArr[i28]);
                            i28 += 13;
                        } else {
                            arrayList.add(strArr[i28]);
                            i28++;
                        }
                    }
                }
                throw new RuntimeException(String.valueOf(i18));
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(short r7, byte r8, short r9) {
                /*
                    byte[] r0 = com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda55.$$c
                    int r7 = r7 * 2
                    int r7 = 1 - r7
                    int r9 = r9 * 4
                    int r9 = 4 - r9
                    int r8 = r8 * 56
                    int r8 = r8 + 66
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r9
                    r4 = r2
                    goto L2c
                L16:
                    r3 = r2
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L1a:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r7) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L27:
                    r3 = r0[r8]
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L2c:
                    int r8 = -r8
                    int r9 = r9 + r8
                    int r8 = r3 + 1
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda55.$$e(short, byte, short):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final List getJhtSubscriptions$lambda$2(JhtSubscriptionResponse jhtSubscriptionResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtSubscriptionResponse, "");
        List<JhtSubscriptionItem> data = jhtSubscriptionResponse.getData();
        int i4 = asBinder + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return data;
    }

    private static final List getJhtSubscriptions$lambda$3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i3 = asBinder + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return list;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<List<JhtSubscriptionItem>> getJhtSubscriptions(JhtSubscriptionRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtSubscriptionResponse>> jhtSubscriptions = getWebService().getJhtSubscriptions(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(jhtSubscriptions, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$eKUxmzB__zxLJ9nKjVWUmwNU6To((JhtSubscriptionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$DZSzMM1wmHvopyem2WRt2TyXKtE(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final ResponseBody getRsJht$lambda$5(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseBody) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ResponseBody responseBody = (ResponseBody) function1.invoke(obj);
        int i3 = 0 / 0;
        return responseBody;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<ResponseBody> getRsJht(GetRsJhtRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ResponseBody>> rsJht = getWebService().getRsJht(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(rsJht, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.m7615$r8$lambda$AxzKKEPz1pDu4YeYYwpgwU8alg((ResponseBody) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda54
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$LRI07SrMnXEENl5eOByEMYMieIw(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final BaseItem sendRsJht$lambda$7(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return baseItem;
        }
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<BaseItem> sendRsJht(SendRsJhtRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecSendRsJht = getWebService().sendRsJht(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecSendRsJht, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$e0Nh9KoZ8gpasiN5u1DAX9OgbL4((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda30
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$9f29oLNOa_fkEBEh5uGkLHgGBOQ(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final GenerateClaimCodeResponse getGenerateClaimCode$lambda$9(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        GenerateClaimCodeResponse generateClaimCodeResponse = (GenerateClaimCodeResponse) function1.invoke(obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return generateClaimCodeResponse;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<GenerateClaimCodeResponse> getGenerateClaimCode(GenerateClaimCodeRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<GenerateClaimCodeResponse>> generateClaimCode = getWebService().getGenerateClaimCode(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(generateClaimCode, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$fByRiFodrMx27Lzr3K3neD2TQOQ((GenerateClaimCodeResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda26
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$4GTAncxkpLsj468_d28kdMsrrPA(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final JhtEligibilityClaimItem checkEligibilityRequest$lambda$11(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        JhtEligibilityClaimItem jhtEligibilityClaimItem = (JhtEligibilityClaimItem) function1.invoke(obj);
        int i4 = asBinder + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return jhtEligibilityClaimItem;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<JhtEligibilityClaimItem> checkEligibilityRequest(CheckEligibilityRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtEligibilityClaimItem>> derivecodecCheckEligibility = getWebService().checkEligibility(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckEligibility, unbindVar);
        final JhtDataStore$$ExternalSyntheticLambda5 jhtDataStore$$ExternalSyntheticLambda5 = new JhtDataStore$$ExternalSyntheticLambda5();
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.m7624$r8$lambda$pu_juJRzqzz_Z_U2FCs6l3vOU(jhtDataStore$$ExternalSyntheticLambda5, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final JhtClaimReasonResponse getClaimReason$lambda$13(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JhtClaimReasonResponse jhtClaimReasonResponse = (JhtClaimReasonResponse) function1.invoke(obj);
        int i3 = asBinder + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return jhtClaimReasonResponse;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<JhtClaimReasonResponse> getClaimReason(ClaimReasonRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtClaimReasonResponse>> claimReason = getWebService().getClaimReason(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(claimReason, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.m7621$r8$lambda$da1eirUnFDhPsyWxqieZZd2RJs((JhtClaimReasonResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$iasTz1RO1bfrKZkQEmHzsmOu9nk(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final JhtClaimSignaturedItem checkAdminDuk$lambda$15(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        JhtClaimSignaturedItem jhtClaimSignaturedItem = (JhtClaimSignaturedItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return jhtClaimSignaturedItem;
        }
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<JhtClaimSignaturedItem> checkAdminDuk(CheckAdminDukRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtClaimSignaturedItem>> derivecodecCheckAdminDuk = getWebService().checkAdminDuk(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckAdminDuk, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$MprbsiGdZ80hYd5uC9_3bdiBV1E((JhtClaimSignaturedItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$81LOd4SOuXocRYjNjNFGIRLMCtU(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final JhtClaimCheckPhotoResponse checkPhotoAdminDuk$lambda$17(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (JhtClaimCheckPhotoResponse) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<JhtClaimCheckPhotoResponse> checkPhotoAdminDuk(CheckPhotoAdminDukRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtClaimCheckPhotoResponse>> derivecodecCheckPhotoAdminDuk = getWebService().checkPhotoAdminDuk(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckPhotoAdminDuk, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$hSVi5fqaBxFl6PIrV0Y_GCwD870((JhtClaimCheckPhotoResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda41
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$OT8LSoSlawf6SsDx8NiL5i859Wo(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return api23Impl;
    }

    private static final ClaimEvidenceJhtResponse checkClaimEvidenceJht$lambda$19(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ClaimEvidenceJhtResponse) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<ClaimEvidenceJhtResponse> checkClaimEvidenceJht(ClaimEvidenceJhtRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ClaimEvidenceJhtResponse>> derivecodecCheckClaimEvidenceJht = getWebService().checkClaimEvidenceJht(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckClaimEvidenceJht, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$GWBCXIMUbaOXj2RdvT_QeLfNLaU((ClaimEvidenceJhtResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda32
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$5zEzoGO2QiAO_LWfa3kMh9Gv52I(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final BaseItem checkDukcapilFaceLiveness$lambda$21(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<BaseItem> checkDukcapilFaceLiveness(CheckFaceLivenessRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostDukcapilLivenessCheck = getWebService().postDukcapilLivenessCheck(p0.getPartMap(), createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.getPhoto(), "foto"));
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostDukcapilLivenessCheck, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$nACJHUeTVBlP2OCTWv6Sv3S3UL4((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda61
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$AciYarahlBKfv2xdC0FiYfpAa4w(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final BaseItem checkNodefluxFaceLiveness$lambda$23(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return baseItem;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final VideoRecordEvent<BaseItem> checkNodefluxFaceLiveness(CheckFaceLivenessRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        VideoRecordEvent<Response<BaseItem>> videoRecordEventPostNodefluxLivenessCheck = getWebService().postNodefluxLivenessCheck(p0.getPartMap(), createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.getPhoto(), "foto"));
        unbindAll unbindall = new unbindAll();
        share.b(unbindall, "lifter is null");
        lambdastart2androidxcameravideointernalaudioAudioSource lambdastart2androidxcameravideointernalaudioaudiosource = new lambdastart2androidxcameravideointernalaudioAudioSource(videoRecordEventPostNodefluxLivenessCheck, unbindall);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.m7625$r8$lambda$s8lYEpiYi4k8owqKRYM3PIPdY((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.m7616$r8$lambda$IcHH_YiNLYZUQELnAG1glthsU(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        overrideBySilence overridebysilence = new overrideBySilence(lambdastart2androidxcameravideointernalaudioaudiosource, readablems);
        Intrinsics.checkNotNullExpressionValue(overridebysilence, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return overridebysilence;
    }

    private static final BaseItem checkIdFaceLiveness$lambda$25(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = asBinder + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return baseItem;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<BaseItem> checkIdFaceLiveness(CheckIdFacelivenessRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostIdlLivenessCheck = getWebService().postIdlLivenessCheck(p0.getPartMap(), createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.getPhoto(), "foto"), createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.getIdPhoto(), "fotoKtp"));
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostIdlLivenessCheck, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$3ACFilm6bs4yKITn0sRhZ2d03Ro((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda10
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$C0du4FFse2Aa6C7qIampNPf72Eg(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final JhtClaimSignaturedItem checkBankAccount$lambda$27(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JhtClaimSignaturedItem jhtClaimSignaturedItem = (JhtClaimSignaturedItem) function1.invoke(obj);
        int i3 = asBinder + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return jhtClaimSignaturedItem;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<JhtClaimSignaturedItem> checkBankAccount(CheckBankAccountRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtClaimSignaturedItem>> derivecodecCheckBankAccountValidity = getWebService().checkBankAccountValidity(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckBankAccountValidity, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$kgKR4l6vnhY7tBdEHSYcIV_ZbJM((JhtClaimSignaturedItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda57
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.m7620$r8$lambda$chekgnPvohAQzlTvNMGTZoWL00(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final BaseItem postJhtKlaim$lambda$29(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        return baseItem;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<BaseItem> postJhtKlaim(JhtClaimRequest p0) {
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        JhtApi webService = getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        File fotoKpj = p0.getFotoKpj();
        Object obj = null;
        if (fotoKpj != null) {
            int i2 = asBinder + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fotoKpj, "fotoKpj");
        } else {
            partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        }
        File fotoKtp = p0.getFotoKtp();
        if (fotoKtp != null) {
            int i4 = asBinder + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fotoKtp, "fotoKtp");
        } else {
            partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        File fotoParklaring = p0.getFotoParklaring();
        if (fotoParklaring != null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fotoParklaring, "fotoParklaring");
                obj.hashCode();
                throw null;
            }
            partTuitionPaymentFragmentspecialinlinedviewModeldefault4 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fotoParklaring, "fotoParklaring");
        } else {
            partTuitionPaymentFragmentspecialinlinedviewModeldefault4 = null;
        }
        File fotoKk = p0.getFotoKk();
        deriveCodec<Response<BaseItem>> derivecodecPostJhtClaim = webService.postJhtClaim(partMap, partTuitionPaymentFragmentspecialinlinedviewModeldefault3, partTuitionPaymentFragmentspecialinlinedviewModeldefault2, fotoKk != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fotoKk, "fotoKk") : null, partTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostJhtClaim, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return JhtDataStore.$r8$lambda$VmTV4sRje4melxHQgxzrclV_FyE((BaseItem) obj2);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda48
            @Override // defpackage.readableMs
            public final Object apply(Object obj2) {
                return JhtDataStore.m7614$r8$lambda$9NtWbcm41zNGtBhWHge5ffelyA(function1, obj2);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        char[] cArr3;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = 0;
        char c = 0;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Integer.valueOf(cArr4[i3]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31339);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2994;
                        int i4 = 18 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                        byte b2 = (byte) ($$d & 5);
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, minimumFlingVelocity, i4, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr5[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        }
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AndroidCharacter.getMirror('0') + 43277), ExpandableListView.getPackedPositionChild(0L) + 254, 22 - Color.argb(0, 0, 0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        if (TuitionPaymentFragmentbindingInflater1) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr3 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr3 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            int i6 = $10 + 29;
            $11 = i6 % 128;
            while (true) {
                int i7 = i6 % 2;
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                try {
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 33602), 3085 - (ViewConfiguration.getTouchSlop() >> 8), 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i6 = $11 + 109;
                    $10 = i6 % 128;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        } else {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                int i8 = $10 + 65;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                } else {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33602), (-16774131) - Color.rgb(0, 0, 0), TextUtils.indexOf("", "", 0) + 26, -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            int i9 = 0;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9;
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    i9 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
            }
        }
    }

    private static final JhtClaimTrackItem postTrackClaim$lambda$31(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (JhtClaimTrackItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<JhtClaimTrackItem> postTrackClaim(JhtClaimTrackRequest p0) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
            int i3 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr = new Object[1];
            a(b2, b3, (byte) (b3 | 89), objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i3, scrollDefaultDelay, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(null, null, 127 - Gravity.getAbsoluteGravity(0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(null, null, 127 - Color.blue(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
            byte[] bArr = $$a;
            byte b4 = bArr[5];
            byte b5 = bArr[7];
            Object[] objArr4 = new Object[1];
            a(b4, b5, (byte) (b5 | 52), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, i4, longPressTimeout, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 29944);
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte[] bArr2 = $$a;
                byte b6 = bArr2[5];
                byte b7 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b6, b7, b7, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, windowTouchSlop, threadPriority, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr6[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i5}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = (-2085377297) + (((~((-705599768) | i6)) | 571113745) * (-140)) + ((~((-134486023) | i6)) * 70) + (((~(i6 | 918202193)) | (-481574471)) * 70) + 1857673414;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            c(null, null, 127 - Color.red(0), new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            c(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {-1246327922};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - View.getDefaultSize(0, 0)), View.resolveSize(0, 0) + 1726, 29 - (ViewConfiguration.getTouchSlop() >> 8), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1857673414, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                    byte[] bArr3 = $$a;
                    byte b8 = bArr3[5];
                    byte b9 = bArr3[7];
                    Object[] objArr10 = new Object[1];
                    a(b8, b9, b9, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, iMakeMeasureSpec, threadPriority2, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr11 = new Object[1];
                    c(null, null, KeyEvent.normalizeMetaState(0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                        int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
                        int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[5];
                        byte b11 = bArr4[7];
                        Object[] objArr13 = new Object[1];
                        a(b10, b11, (byte) (b11 | 52), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, i10, jumpTapTimeout, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                        int iBlue = 1755 - Color.blue(0);
                        int mode = 23 - View.MeasureSpec.getMode(0);
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr14 = new Object[1];
                        a(b12, b13, (byte) (b13 | 89), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cKeyCodeFromString, iBlue, mode, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                asBinder = i13 % 128;
                while (true) {
                    int i14 = i13 % 2;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    arrayList.add(strArr[i2]);
                    i2++;
                    i13 = asBinder + 51;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        asBinder = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i18 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr15 = {new int[]{i18}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iNextInt = new Random().nextInt();
        int i19 = ~((-260884351) | iNextInt);
        int i20 = 546207965 + ((41976132 | i19) * (-280)) + ((i19 | (~(48281924 | iNextInt))) * 140);
        int i21 = ~((-218908219) | iNextInt);
        int i22 = ~iNextInt;
        int i23 = i17 + i20 + (((~(i22 | 267190142)) | i21 | (~((-41976133) | i22))) * 140);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr15[3])[0] = i25 ^ (i25 << 5);
        int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        asBinder = i26 % 128;
        int i27 = i26 % 2;
        deriveCodec<Response<JhtClaimTrackItem>> derivecodecPostTrackClaim = getWebService().postTrackClaim(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostTrackClaim, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$m7gfghA9RqdwOVDFoACf0uSUwa0((JhtClaimTrackItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda33
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$Ct4IJcMnzZ3xwMSS_MrP_p6kKzg(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        int i28 = ((int[]) objArr15[3])[0];
        int i29 = i28 * i28;
        int i30 = -(1801594812 * i28);
        int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
        int i32 = -(i28 * 1902260202);
        int i33 = (((i31 | i32) << 1) - (i32 ^ i31)) - 385052695;
        int i34 = ((i33 >> 22) - 2047) / 1024;
        int i35 = (i33 - (~((i34 ^ 1) + ((i34 & 1) << 1)))) - 1;
        int i36 = i33 >> 26;
        int i37 = (-(i35 ^ ((((i36 & ComposerKt.defaultsKey) + (i36 | ComposerKt.defaultsKey)) / 64) + 1))) + 2;
        int i38 = ((i37 >> 23) - 1023) / 512;
        int i39 = (i38 ^ 1) + ((i38 & 1) << 1);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "31,23,8,map(...)".substring(1824 / ((i37 & (-((i39 & 1) + (i39 | 1)))) * 114)));
        return api23Impl;
    }

    private static final JhtBenefitDetailItem getBenefitDetail$lambda$33(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (JhtBenefitDetailItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JhtBenefitDetailItem jhtBenefitDetailItem = (JhtBenefitDetailItem) function1.invoke(obj);
        int i3 = 36 / 0;
        return jhtBenefitDetailItem;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<JhtBenefitDetailItem> getBenefitDetail(JhtBenefitDetailRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtBenefitDetailResponse>> derivecodecPostBenefitDetail = getWebService().postBenefitDetail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostBenefitDetail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.m7617$r8$lambda$LFbbEEqpqE0wGHaAMpy3VsaR0((JhtBenefitDetailResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda17
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.m7623$r8$lambda$gAmyA028Fp8BObwv29bvwLi3FY(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final JhtBenefitDetailItem getBenefitDetail$lambda$32(JhtBenefitDetailResponse jhtBenefitDetailResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtBenefitDetailResponse, "");
        JhtBenefitDetailItem detailBenefit = jhtBenefitDetailResponse.getDetailBenefit();
        int i4 = asBinder + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return detailBenefit;
    }

    private static final BaseItem postJhtInstantClaim$lambda$35(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (BaseItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<BaseItem> postJhtInstantClaim(JhtInstantClaimRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostJhtInstantClaim = getWebService().postJhtInstantClaim(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostJhtInstantClaim, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$LehSYUT3OcGOS7ZHhcbT5ZyMlco((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda46
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.m7611$r8$lambda$4c59Sa_7dZ9IAJe8L8hUPcKgs(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final BaseItem checkFaceLivenessBiometric$lambda$37(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i3 = asBinder + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return baseItem;
        }
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<BaseItem> checkFaceLivenessBiometric(CheckFaceLivenessRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostCheckLivenessBiometric = getWebService().postCheckLivenessBiometric(p0.getPartMap(), createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.getPhoto(), "file"));
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostCheckLivenessBiometric, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$5eo7KdFzVj79OLLwgra91R2GuiI((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda35
            private static final byte[] $$c = {84, 10, 24, -102};
            private static final int $$d = 189;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {70, -114, 113, 8, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 11;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static int b = -83722468;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r7, int r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r9 = r9 * 14
                    int r9 = r9 + 84
                    byte[] r0 = com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda35.$$a
                    int r8 = r8 + 1
                    int r7 = r7 + 4
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r9 = r7
                    r3 = r8
                    r4 = r2
                    goto L2b
                L13:
                    r3 = r2
                L14:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    int r7 = r7 + 1
                    if (r4 != r8) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L2b:
                    int r7 = -r7
                    int r3 = r3 + r7
                    int r7 = r3 + (-11)
                    r3 = r4
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda35.a(short, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:32:0x0181  */
            /* JADX WARN: Code duplicated, block: B:33:0x0182  */
            private static void c(boolean z, int i2, int i3, int i4, char[] cArr, Object[] objArr) throws Throwable {
                int i5;
                Throwable cause;
                int i6 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i3];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (true) {
                    i5 = 29209604;
                    if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i3) {
                        break;
                    }
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Color.blue(0) + 3291, 31 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1199271174, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.rgb(0, 0, 0) + 16777216), 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, -450685997, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i8 = $10 + 27;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i4 > 0) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i4;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    System.arraycopy(cArr3, 0, cArr2, i3 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i3 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (z) {
                    int i10 = $10 + 85;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    char[] cArr4 = new char[i3];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i3) {
                        int i12 = $11 + 99;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i3 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 651 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 45, -450685997, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i14 = $11 + 115;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        i5 = 29209604;
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                int i2;
                Object[] objArr;
                int i3 = 2 % 2;
                int i4 = TuitionPaymentFragmentbindingInflater1 + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cBlue = (char) Color.blue(0);
                    int iGreen = Color.green(0) + 651;
                    int i6 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43;
                    byte[] bArr = $$a;
                    byte b2 = bArr[80];
                    Object[] objArr2 = new Object[1];
                    a(b2, (byte) (b2 & 52), bArr[7], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iGreen, i6, -459846511, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(true, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 225, (Process.myPid() >> 22) + 22, (ViewConfiguration.getEdgeSlop() >> 16) + 3, new char[]{1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(true, 16777445 + Color.rgb(0, 0, 0), 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') - '\'', new char[]{65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                    int iBlue = Color.blue(0) + 651;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 44;
                    byte[] bArr2 = $$a;
                    Object[] objArr5 = new Object[1];
                    a((byte) 51, bArr2[7], bArr2[5], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, iBlue, iCombineMeasuredStates, -873460649, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", r20) + 1);
                        int iLastIndexOf = 650 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43;
                        Object[] objArr6 = new Object[1];
                        a((byte) 51, (byte) 37, $$a[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iLastIndexOf, i7, -1595579076, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i8 = ((int[]) objArr7[2])[0];
                    int i9 = ((int[]) objArr7[0])[0];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i10 = (((~((-606636106) | iIdentityHashCode)) * 521) - 881111944) + (((~((~iIdentityHashCode) | (-606636106))) | (-670887920)) * 521) + 288804107;
                    int i11 = (i10 << 13) ^ i10;
                    int i12 = i11 ^ (i11 >>> 17);
                    ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
                    i2 = 2;
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.getSize(0), 1610 - KeyEvent.normalizeMetaState(0), Color.rgb(0, 0, 0) + 16777242, 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 288804107, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int iIndexOf = 650 - TextUtils.indexOf("", (char) r20, 0, 0);
                            int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                            byte[] bArr3 = $$a;
                            Object[] objArr9 = new Object[1];
                            a((byte) 51, bArr3[7], bArr3[5], objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, iIndexOf, i13, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 696 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 98 - Drawable.resolveOpacity(0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - KeyEvent.normalizeMetaState(0)), 793 - Gravity.getAbsoluteGravity(0, 0), 83 - (ViewConfiguration.getEdgeSlop() >> 16)), Integer.TYPE, Integer.TYPE});
                        }
                        Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 651;
                            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
                            Object[] objArr11 = new Object[1];
                            a((byte) 51, (byte) 37, $$a[7], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, pressedStateDuration, pressedStateDuration2, -1595579076, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                        try {
                            Object[] objArr12 = new Object[1];
                            c(true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 226, View.MeasureSpec.makeMeasureSpec(0, 0) + 22, 2 - MotionEvent.axisFromString(""), new char[]{1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15}, objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            c(true, 230 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 15 - (Process.myPid() >> 22), (-16777207) - Color.rgb(0, 0, 0), new char[]{65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530}, objArr13);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                int tapTimeout = 651 - (ViewConfiguration.getTapTimeout() >> 16);
                                int jumpTapTimeout = 44 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                byte[] bArr4 = $$a;
                                Object[] objArr14 = new Object[1];
                                a((byte) 51, bArr4[7], bArr4[5], objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, tapTimeout, jumpTapTimeout, -873460649, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                int absoluteGravity = 651 - Gravity.getAbsoluteGravity(0, 0);
                                int i14 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45;
                                byte[] bArr5 = $$a;
                                byte b3 = bArr5[80];
                                Object[] objArr15 = new Object[1];
                                a(b3, (byte) (b3 & 52), bArr5[7], objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cKeyCodeFromString, absoluteGravity, i14, -459846511, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                            int i15 = TuitionPaymentFragmentbindingInflater1 + 81;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                            i2 = 2;
                            int i16 = i15 % 2;
                            objArr = objArr10;
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
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((int[]) objArr[i2])[0];
                if (i18 == i17) {
                    int i19 = TuitionPaymentFragmentbindingInflater1 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                    int i20 = i19 % i2;
                    Object[] objArr16 = new Object[4];
                    objArr16[0] = new int[]{i};
                    objArr16[i2] = new int[]{i};
                    objArr16[3] = new int[1];
                    int i21 = ((int[]) objArr[3])[0];
                    int i22 = ((int[]) objArr[i2])[0];
                    int i23 = ((int[]) objArr[0])[0];
                    objArr16[1] = new String[0];
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i24 = ~elapsedCpuTime;
                    int i25 = i21 + (((~(302238525 | i24)) | (~((-305669336) | elapsedCpuTime)) | (~(i24 | 305669335))) * 959) + 769829530 + (((~(elapsedCpuTime | 305669335)) | (~(i24 | (-305669336))) | (~(302238525 | elapsedCpuTime))) * 959);
                    int i26 = (i25 << 13) ^ i25;
                    int i27 = i26 ^ (i26 >>> 17);
                    ((int[]) objArr16[3])[0] = i27 ^ (i27 << 5);
                    int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                    TuitionPaymentFragmentbindingInflater1 = i28 % 128;
                    int i29 = i28 % 2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[1];
                    if (strArr != null) {
                        int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                        TuitionPaymentFragmentbindingInflater1 = i30 % 128;
                        int i31 = i30 % 2;
                        int i32 = 0;
                        while (i32 < strArr.length) {
                            arrayList.add(strArr[i32]);
                            i32++;
                            int i33 = TuitionPaymentFragmentbindingInflater1 + 37;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i33 % 128;
                            int i34 = i33 % 2;
                        }
                    }
                    int[] iArr = new int[i18];
                    int i35 = i18 - 1;
                    iArr[i35] = 1;
                    Toast.makeText((Context) null, iArr[((i18 * i35) % 2) - 1], 1).show();
                    Object[] objArr17 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i36 = ((int[]) objArr[3])[0];
                    int i37 = ((int[]) objArr[2])[0];
                    int i38 = ((int[]) objArr[0])[0];
                    int iNextInt = new Random().nextInt(471832931);
                    int i39 = ~iNextInt;
                    int i40 = i36 + 1437034108 + (((~(i39 | (-333530233))) | 336961042) * (-1042)) + (((-333530233) | iNextInt) * 521) + (((~(iNextInt | (-336961043))) | 68459010 | (~(i39 | (-65028201)))) * 521);
                    int i41 = (i40 << 13) ^ i40;
                    int i42 = i41 ^ (i41 >>> 17);
                    ((int[]) objArr17[3])[0] = i42 ^ (i42 << 5);
                }
                return JhtDataStore.$r8$lambda$jDz363X8xmq2LOiBoyErIvTivNQ(function1, obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, byte r7, short r8) {
                /*
                    byte[] r0 = com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda35.$$c
                    int r6 = r6 * 4
                    int r1 = 1 - r6
                    int r7 = r7 + 119
                    int r8 = r8 * 4
                    int r8 = r8 + 4
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r0 != 0) goto L17
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2b:
                    int r7 = r7 + r8
                    int r8 = r3 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda35.$$e(byte, byte, short):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final JhtClaimEligibilityResponse checkEligibilityClaim$lambda$39(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JhtClaimEligibilityResponse jhtClaimEligibilityResponse = (JhtClaimEligibilityResponse) function1.invoke(obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return jhtClaimEligibilityResponse;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<JhtClaimEligibilityResponse> checkEligibilityClaim(ClaimCheckEligibilityRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtClaimEligibilityResponse>> derivecodecCheckEligibilityClaim = getWebService().checkEligibilityClaim(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckEligibilityClaim, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$ILxMKoGauxnWkKQhEEXpShSIFOQ((JhtClaimEligibilityResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda39
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.m7618$r8$lambda$LbRRaUJmv4aRQtipfYKTVoffo(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final JhtClaimEmployeeDataItem getEmployeeDataClaim$lambda$41(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem = (JhtClaimEmployeeDataItem) function1.invoke(obj);
        int i3 = asBinder + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return jhtClaimEmployeeDataItem;
        }
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<JhtClaimEmployeeDataItem> getEmployeeDataClaim(ClaimEmployeeDataRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtClaimEmployeeDataResponse>> dataEmployeeData = getWebService().getDataEmployeeData(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(dataEmployeeData, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$IQvydHKPrwI_z_kqk0o5Od8i5bs((JhtClaimEmployeeDataResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda37
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$uAOlcadBc05lbqBCoS1omD_xUQs(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final JhtClaimEmployeeDataItem getEmployeeDataClaim$lambda$40(JhtClaimEmployeeDataResponse jhtClaimEmployeeDataResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtClaimEmployeeDataResponse, "");
        JhtClaimEmployeeDataItem data = jhtClaimEmployeeDataResponse.getData();
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        data.setIdentityNumber(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getIdentityNumber()));
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        data.setKpj(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getKpj()));
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        data.setValidIdentity(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getValidIdentity()));
        Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
        data.setFullName(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getFullName()));
        Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
        data.setGender(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getGender()));
        Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
        data.setBirthPlace(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getBirthPlace()));
        Camera2InteropExtender.Companion companion7 = Camera2InteropExtender.INSTANCE;
        data.setBirthDate(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getBirthDate()));
        Camera2InteropExtender.Companion companion8 = Camera2InteropExtender.INSTANCE;
        data.setMotherName(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getMotherName()));
        Camera2InteropExtender.Companion companion9 = Camera2InteropExtender.INSTANCE;
        data.setAddress(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getAddress()));
        Camera2InteropExtender.Companion companion10 = Camera2InteropExtender.INSTANCE;
        data.setPhoneNumber(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getPhoneNumber()));
        Camera2InteropExtender.Companion companion11 = Camera2InteropExtender.INSTANCE;
        data.setEmail(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getEmail()));
        Camera2InteropExtender.Companion companion12 = Camera2InteropExtender.INSTANCE;
        data.setNpwp(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getNpwp()));
        Camera2InteropExtender.Companion companion13 = Camera2InteropExtender.INSTANCE;
        data.setBankCode(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getBankCode()));
        Camera2InteropExtender.Companion companion14 = Camera2InteropExtender.INSTANCE;
        data.setBankName(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getBankName()));
        Camera2InteropExtender.Companion companion15 = Camera2InteropExtender.INSTANCE;
        data.setAccountBankNumber(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getAccountBankNumber()));
        Camera2InteropExtender.Companion companion16 = Camera2InteropExtender.INSTANCE;
        data.setAccountBankName(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getAccountBankName()));
        Camera2InteropExtender.Companion companion17 = Camera2InteropExtender.INSTANCE;
        data.setFlagSipp(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data.getFlagSipp()));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return data;
    }

    private static final InfoPraClaimItems getInfoPraClaim$lambda$43(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InfoPraClaimItems) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<InfoPraClaimItems> getInfoPraClaim(InfoPraClaimRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<InfoPraClaimResponse>> infoPraClaim = getWebService().getInfoPraClaim(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(infoPraClaim, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$7dq8H3vEGCHHk8xJOLb74nEqIw0((InfoPraClaimResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda21
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.m7612$r8$lambda$5Im82nNxc6F0vsJDtnbIXrB2ek(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final InfoPraClaimItems getInfoPraClaim$lambda$42(InfoPraClaimResponse infoPraClaimResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(infoPraClaimResponse, "");
        InfoPraClaimItems data = infoPraClaimResponse.getData();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return data;
    }

    private static final List getJhtContributionDetail$lambda$45(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = asBinder + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<List<JhtContributionDetailItem>> getJhtContributionDetail(JhtContributionDetailRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtContributionDetailResponse>> jhtContributionDetail = getWebService().getJhtContributionDetail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(jhtContributionDetail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$p9uCwrwVBPO0jOvdILVyABLbX6o((JhtContributionDetailResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda50
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.m7613$r8$lambda$6RTkywCHrG3nmpIzvPj9XteDDI(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final List getJhtContributionDetail$lambda$44(JhtContributionDetailResponse jhtContributionDetailResponse) {
        List<JhtContributionDetailItem> data;
        int i = 2 % 2;
        int i2 = asBinder + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(jhtContributionDetailResponse, "");
            data = jhtContributionDetailResponse.getData();
            int i3 = 63 / 0;
        } else {
            Intrinsics.checkNotNullParameter(jhtContributionDetailResponse, "");
            data = jhtContributionDetailResponse.getData();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return data;
        }
        throw null;
    }

    private static final JhtClaimContributionResponse getJhtClaimContributionDetail$lambda$47(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        JhtClaimContributionResponse jhtClaimContributionResponse = (JhtClaimContributionResponse) function1.invoke(obj);
        int i4 = asBinder + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return jhtClaimContributionResponse;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<JhtClaimContributionResponse> getJhtClaimContributionDetail(JhtClaimContributionRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtClaimContributionResponse>> jhtClaimContributionDetail = getWebService().getJhtClaimContributionDetail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(jhtClaimContributionDetail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$2qyDZrUJvvyVLnMXYQc6psp9Aos((JhtClaimContributionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda52
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$mPtZJFm_XGJ7CfaLSD3pw_BsjJQ(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final ClaimLivenessResponse claimLivenessFaceMatchCheck$lambda$49(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        asBinder = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ClaimLivenessResponse claimLivenessResponse = (ClaimLivenessResponse) function1.invoke(obj);
        int i3 = asBinder + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return claimLivenessResponse;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<ClaimLivenessResponse> claimLivenessFaceMatchCheck(ClaimLivenessFaceMatchCheckRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ClaimLivenessResponse>> derivecodecClaimLivenessFaceMatchCheck = getWebService().claimLivenessFaceMatchCheck(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecClaimLivenessFaceMatchCheck, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$Y4ECUwbZj05DiUYiXiUcB5OoylM((ClaimLivenessResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda24
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$pTHubDnGePtFROtZ_AP10Qay8GY(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final ClaimLivenessResponse claimLivenessFaceMatch$lambda$51(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ClaimLivenessResponse claimLivenessResponse = (ClaimLivenessResponse) function1.invoke(obj);
        int i4 = asBinder + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return claimLivenessResponse;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<ClaimLivenessResponse> claimLivenessFaceMatch(ClaimLivenessFaceMatchRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ClaimLivenessResponse>> derivecodecClaimLivenessFaceMatch = getWebService().claimLivenessFaceMatch(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecClaimLivenessFaceMatch, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$IPikEx5wrRdMmGGyJEy4fLghek0((ClaimLivenessResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda28
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$lNfj6kHCSUEqJfjjujwQSZHvpdk(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final List getClaimSegment$lambda$52(ClaimSegmenResponse claimSegmenResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(claimSegmenResponse, "");
        List<ListClaimSegmenItem> listClaimSegmen = claimSegmenResponse.getListClaimSegmen();
        int i4 = asBinder + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return listClaimSegmen;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final List getClaimSegment$lambda$53(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return list;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<List<ListClaimSegmenItem>> getClaimSegment(ClaimSegmenRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ClaimSegmenResponse>> claimSegment = getWebService().getClaimSegment(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(claimSegment, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$1a6wd64qO2smwREYAk4XjTHBlzE((ClaimSegmenResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda43
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$tq8OqeBwOoinpL5MDnLI2RU_K1w(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
        return api23Impl;
    }

    private static final List getClaimLayoffDocCode$lambda$55(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (List) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i3 = 25 / 0;
        return list;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<List<ListCodeLayOffCode>> getClaimLayoffDocCode(BaseRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ClaimLayoffDocCodeResponse>> claimLayoffDocCode = getWebService().getClaimLayoffDocCode(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(claimLayoffDocCode, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda18
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {55, -64, 35, -71, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 70;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int b = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = 2868939111011411837L;

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 + 4
                    byte[] r0 = com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda18.$$a
                    int r7 = r7 * 14
                    int r7 = 98 - r7
                    int r1 = 53 - r8
                    byte[] r1 = new byte[r1]
                    int r8 = 52 - r8
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r4 = r2
                    r7 = r6
                    goto L2d
                L15:
                    r3 = r2
                L16:
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L28:
                    r3 = r0[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L2d:
                    int r6 = r6 + 1
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda18.c(short, byte, short, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = b + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                List list$r8$lambda$AkWT84uXjN4Dw_wd2ZBpi74LvZc = JhtDataStore.$r8$lambda$AkWT84uXjN4Dw_wd2ZBpi74LvZc((ClaimLayoffDocCodeResponse) obj);
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    return list$r8$lambda$AkWT84uXjN4Dw_wd2ZBpi74LvZc;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i4 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19471), 2623 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.indexOf("", "", 0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 480, (ViewConfiguration.getPressedStateDuration() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                int i5 = $11 + 51;
                while (true) {
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    if (getrealtimecapturelatency.b >= cArr.length) {
                        objArr[0] = new String(cArr2);
                        return;
                    }
                    int i7 = $11 + 23;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39422), Color.alpha(0) + 481, ExpandableListView.getPackedPositionChild(0L) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i5 = $11 + 105;
                }
            }

            /* JADX WARN: Code duplicated, block: B:116:0x038f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:0x0376  */
            /* JADX WARN: Code duplicated, block: B:52:0x037c  */
            /* JADX WARN: Code duplicated, block: B:54:0x038b  */
            /* JADX WARN: Code duplicated, block: B:55:0x038e  */
            /* JADX WARN: Code duplicated, block: B:58:0x0395 A[Catch: Exception -> 0x0589, TRY_LEAVE, TryCatch #4 {Exception -> 0x0589, blocks: (B:56:0x038f, B:58:0x0395, B:64:0x0402, B:67:0x04a5, B:69:0x04ab, B:70:0x04ac, B:71:0x04ad, B:75:0x04d0, B:77:0x04ff, B:82:0x056b, B:86:0x0581, B:88:0x0587, B:89:0x0588, B:76:0x04e5, B:78:0x0511, B:80:0x051e, B:81:0x0564, B:59:0x03ae, B:61:0x03bb, B:62:0x03f2), top: B:116:0x038f, inners: #0, #2 }] */
            /* JADX WARN: Code duplicated, block: B:61:0x03bb A[Catch: all -> 0x04a4, TryCatch #2 {all -> 0x04a4, blocks: (B:59:0x03ae, B:61:0x03bb, B:62:0x03f2), top: B:112:0x03ae, outer: #4 }] */
            /* JADX WARN: Code duplicated, block: B:71:0x04ad A[Catch: Exception -> 0x0589, TRY_LEAVE, TryCatch #4 {Exception -> 0x0589, blocks: (B:56:0x038f, B:58:0x0395, B:64:0x0402, B:67:0x04a5, B:69:0x04ab, B:70:0x04ac, B:71:0x04ad, B:75:0x04d0, B:77:0x04ff, B:82:0x056b, B:86:0x0581, B:88:0x0587, B:89:0x0588, B:76:0x04e5, B:78:0x0511, B:80:0x051e, B:81:0x0564, B:59:0x03ae, B:61:0x03bb, B:62:0x03f2), top: B:116:0x038f, inners: #0, #2 }] */
            /* JADX WARN: Code duplicated, block: B:74:0x04c9  */
            /* JADX WARN: Code duplicated, block: B:76:0x04e5 A[Catch: Exception -> 0x0589, TryCatch #4 {Exception -> 0x0589, blocks: (B:56:0x038f, B:58:0x0395, B:64:0x0402, B:67:0x04a5, B:69:0x04ab, B:70:0x04ac, B:71:0x04ad, B:75:0x04d0, B:77:0x04ff, B:82:0x056b, B:86:0x0581, B:88:0x0587, B:89:0x0588, B:76:0x04e5, B:78:0x0511, B:80:0x051e, B:81:0x0564, B:59:0x03ae, B:61:0x03bb, B:62:0x03f2), top: B:116:0x038f, inners: #0, #2 }] */
            /* JADX WARN: Code duplicated, block: B:80:0x051e A[Catch: all -> 0x0580, TryCatch #0 {all -> 0x0580, blocks: (B:78:0x0511, B:80:0x051e, B:81:0x0564), top: B:108:0x0511, outer: #4 }] */
            /* JADX WARN: Code duplicated, block: B:84:0x0571  */
            /* JADX WARN: Code duplicated, block: B:90:0x0589  */
            /* JADX WARN: Code duplicated, block: B:93:0x05a9  */
            /* JADX WARN: Code duplicated, block: B:94:0x05ac  */
            public static Object[] b(Context context, int i2, int i3, int i4) throws Throwable {
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                char[] cArr;
                int i11;
                int i12;
                int i13;
                String str;
                char[] cArr2;
                char c;
                Object[] objArr;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i14;
                int i15 = 2 % 2;
                Object obj = null;
                if (context != null) {
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i17 = (i16 ^ 5) + ((i16 & 5) << 1);
                    b = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = 81 / 0;
                    }
                    try {
                        int i19 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i20 = i19 * (-743);
                        int i21 = (i20 & (-48445829)) + (i20 | (-48445829));
                        int i22 = (i19 ^ 65203) | (i19 & 65203);
                        int i23 = ~i22;
                        int i24 = ~((i19 ^ i2) | (i19 & i2));
                        int i25 = ((~((65203 & i2) | (i2 ^ 65203))) | (i23 ^ i24) | (i23 & i24)) * (-744);
                        int i26 = (i21 & i25) + (i25 | i21);
                        int i27 = ~i2;
                        int i28 = ~i19;
                        int i29 = ~((i28 & (-65204)) | (i28 ^ (-65204)));
                        int i30 = -(-(((i29 & i27) | (i27 ^ i29)) * 744));
                        int i31 = (((i26 ^ i30) + ((i30 & i26) << 1)) - (~(-(-(((i22 ^ i2) | (i22 & i2)) * 744))))) - 1;
                        Object[] objArr2 = new Object[1];
                        a(new char[]{52743, 12475, 13156, 12813, 13509, 14192, 13872, 14509, 15261, 14914, 15606, 16291, 15975, 8479, 9176, 8757, 9493, 10218, 9886, 10587, 11263, 10929, 11632}, i31, objArr2);
                        Class<?> cls = Class.forName((String) objArr2[0]);
                        int i32 = -View.resolveSize(0, 0);
                        int i33 = (i32 ^ 39499) + ((i32 & 39499) << 1);
                        Object[] objArr3 = new Object[1];
                        a(new char[]{52737, 21576, 64132, 198, 42810, 52577, 21448, 62978, 7261, 41636, 51452, 28470, 62861, 7111, 48693, 50285, 27312, 61682}, i33, objArr3);
                        Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                        int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int iB = zzn.b();
                        int i34 = maximumDrawingCacheSize * 46;
                        int i35 = (i34 ^ 2085778) + ((i34 & 2085778) << 1);
                        int i36 = ~iB;
                        int i37 = ((~(((-45344) ^ i36) | ((-45344) & i36))) | maximumDrawingCacheSize) * (-90);
                        int i38 = (i35 & i37) + (i37 | i35);
                        int i39 = ~(((-45344) ^ iB) | ((-45344) & iB));
                        int i40 = ~((maximumDrawingCacheSize ^ 45343) | (45343 & maximumDrawingCacheSize));
                        int i41 = (i38 - (~(((i39 ^ i40) | (i39 & i40)) * (-45)))) - 1;
                        int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i43 = (i42 & 47) + (i42 | 47);
                        b = i43 % 128;
                        int i44 = i43 % 2;
                        int i45 = ~maximumDrawingCacheSize;
                        int i46 = -(-(45 * ((~((i45 & iB) | (i45 ^ iB))) | (-45344) | (~((maximumDrawingCacheSize & i36) | (i36 ^ maximumDrawingCacheSize))))));
                        int i47 = (i41 ^ i46) + ((i41 & i46) << 1);
                        Object[] objArr4 = new Object[1];
                        a(new char[]{52743, 32535, 44092, 56649, 2677, 48020, 59576, 6545, 18173, 62494, 9534, 21063, 33655, 12443, 24992, 44697, 57318, 3332, 47718, 60266, 6266, 18845, 63136, 10182, 21741, 33280, 13108, 24650, 37229, 56971, 3981, 48329, 60896, 6902}, i47, objArr4);
                        Class<?> cls2 = Class.forName((String) objArr4[0]);
                        int i48 = -View.MeasureSpec.getMode(0);
                        int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                        b = i49 % 128;
                        int i50 = i49 % 2;
                        int i51 = 371 * i48;
                        int i52 = ~(((-17658) ^ i27) | ((-17658) & i27));
                        int i53 = ~((~i48) | i2);
                        int i54 = (((i51 ^ 6550747) + ((i51 & 6550747) << 1)) - (~(((i52 ^ i53) | (i52 & i53)) * (-370)))) - 1;
                        int i55 = ~i48;
                        int i56 = ~((i27 & i55) | (i55 ^ i27));
                        int i57 = ~(((-17658) & i2) | ((-17658) ^ i2));
                        int i58 = (i56 & i57) | (i56 ^ i57);
                        int i59 = ~((i48 ^ 17657) | (i48 & 17657));
                        int i60 = (i54 - (~(-(-(((i58 & i59) | (i58 ^ i59)) * (-370)))))) - 1;
                        int i61 = -(-((~(i48 | 17657)) * 370));
                        int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                        Object[] objArr5 = new Object[1];
                        a(new char[]{52736, 35571, 18421, 234, 56817}, i62, objArr5);
                        int i63 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                        int i64 = (~(i2 & 1)) & (i2 | 1);
                        int i65 = -i63;
                        int i66 = (i63 & i65) | (i63 ^ i65);
                        int i67 = b + 109;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i67 % 128;
                        if (i67 % 2 != 0) {
                            int i68 = i66 >>> 31;
                            int i69 = (~i68) & i2;
                            int i70 = i68 & i64;
                            i14 = (i70 & i69) | (i69 ^ i70);
                        } else {
                            int i71 = i66 >> 31;
                            i14 = (i71 & i64) | ((~i71) & i2);
                        }
                        i5 = i14;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i5 = i2;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16794165);
                        int offsetBefore = 2739 - TextUtils.getOffsetBefore("", 0);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 14;
                        byte[] bArr = $$a;
                        byte b2 = bArr[7];
                        short s = b2;
                        byte b3 = bArr[5];
                        byte b4 = b2;
                        Object[] objArr6 = new Object[1];
                        c(s, b3, b4, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, offsetBefore, packedPositionChild, 1501733736, false, (String) objArr6[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                    int i72 = b;
                    int i73 = (i72 ^ 35) + ((i72 & 35) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i73 % 128;
                    if (i73 % 2 != 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char offsetBefore2 = (char) (16949 - TextUtils.getOffsetBefore("", 0));
                            int iArgb = 2739 - Color.argb(0, 0, 0, 0);
                            int iLastIndexOf = 12 - TextUtils.lastIndexOf("", '0', 0, 0);
                            byte[] bArr2 = $$a;
                            Object[] objArr7 = new Object[1];
                            c((short) 52, bArr2[5], bArr2[7], objArr7);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore2, iArgb, iLastIndexOf, 47863026, false, (String) objArr7[0], null);
                        }
                        set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null));
                        obj.hashCode();
                        throw null;
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 16949);
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 2739;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 13;
                        byte[] bArr3 = $$a;
                        Object[] objArr8 = new Object[1];
                        c((short) 52, bArr3[5], bArr3[7], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, iIndexOf, packedPositionGroup, 47863026, false, (String) objArr8[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        int i74 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i75 = (i74 ^ 49) + ((i74 & 49) << 1);
                        b = i75 % 128;
                        if (i75 % 2 == 0) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16948);
                                int packedPositionGroup2 = 2739 - ExpandableListView.getPackedPositionGroup(0L);
                                int i76 = 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                byte b5 = $$a[5];
                                Object[] objArr9 = new Object[1];
                                c((short) 104, b5, (byte) (b5 | 14), objArr9);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, packedPositionGroup2, i76, 631063962, false, (String) objArr9[0], null);
                            }
                            set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null));
                            throw null;
                        }
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cIndexOf = (char) (16948 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            int i77 = 2739 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 13;
                            byte b6 = $$a[5];
                            Object[] objArr10 = new Object[1];
                            c((short) 104, b6, (byte) (b6 | 14), objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, i77, jumpTapTimeout, 631063962, false, (String) objArr10[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                Object[] objArr11 = new Object[1];
                                a(new char[]{52809, 34854, 16984, 7274, 55005, 37046, 27350, 9484, 65338, 47364, 29560, 52637, 34737, 16867, 6221, 53801, 44115, 26225, 8329, 64190, 46309, 3854, 51498, 33625, 23931, 6101, 53718, 44002}, 17956 - (~(-(-KeyEvent.keyCodeFromString("")))), objArr11);
                                Object[] objArr12 = {(String) objArr11[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 993;
                                    int iCombineMeasuredStates = 8 - View.combineMeasuredStates(0, 0);
                                    byte b7 = $$a[7];
                                    Object[] objArr13 = new Object[1];
                                    c((short) 141, b7, (byte) (b7 | 52), objArr13);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, jumpTapTimeout2, iCombineMeasuredStates, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr12)).longValue();
                                long j = 417958312;
                                long j2 = (((long) 465) * j) + (((long) (-463)) * jLongValue);
                                long j3 = 464;
                                long j4 = -1;
                                long j5 = jLongValue ^ j4;
                                long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                long j6 = jElapsedRealtime ^ j4;
                                long j7 = (j5 | j) ^ j4;
                                long j8 = j2 + ((((j5 | j6) ^ j4) | j7 | ((j6 | j) ^ j4)) * j3) + (((long) (-464)) * (jElapsedRealtime | (j ^ j4) | j5)) + ((j7 | ((jElapsedRealtime | j) ^ j4)) * j3) + ((long) (-618876549));
                                int i78 = ~i2;
                                int i79 = ((int) (j8 >> 32)) & ((-851274317) + (((~(1065827117 | i78)) | 1791913767) * (-983)) + (((~(1791913767 | i78)) | 352391176) * 983));
                                int i80 = 1411013713 + (((~(438105847 | i78)) | (-1875332258)) * (-328)) + (((-1875332258) | i2) * 164) + (((~(i78 | (-1707280385))) | (~((-438105848) | i2)) | 270053974) * 164);
                                int i81 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i82 = ((i81 | 87) << 1) - (i81 ^ 87);
                                b = i82 % 128;
                                int i83 = i82 % 2;
                                i8 = i79 | (((int) j8) & i80);
                            } else {
                                cArr = new char[]{52823};
                                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                                b = i11 % 128;
                                i12 = -keyRepeatTimeout;
                                if (i11 % 2 == 0) {
                                    int i84 = (i12 ^ 21991) + ((i12 & 21991) << 1);
                                    Object[] objArr14 = new Object[1];
                                    a(cArr, i84, objArr14);
                                    str = (String) objArr14[0];
                                    cArr2 = new char[]{52756, 11062, 1078, 25023, 23295, 46143, 37225, 35512, 59385, 49456, 14962, 6079, 28919};
                                    c = 'y';
                                    i13 = 0;
                                } else {
                                    int i85 = ((i12 | 21991) << 1) - (i12 ^ 21991);
                                    Object[] objArr15 = new Object[1];
                                    a(cArr, i85, objArr15);
                                    i13 = 0;
                                    str = (String) objArr15[0];
                                    cArr2 = new char[]{52756, 11062, 1078, 25023, 23295, 46143, 37225, 35512, 59385, 49456, 14962, 6079, 28919};
                                    c = '0';
                                }
                                Object[] objArr16 = new Object[1];
                                a(cArr2, 58686 - TextUtils.lastIndexOf("", c, i13), objArr16);
                                objArr = new Object[]{(String) objArr16[i13]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char gidForName = (char) (Process.getGidForName("") + 33603);
                                    int iGreen = Color.green(0) + 3085;
                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 27;
                                    byte b8 = $$a[7];
                                    Object[] objArr17 = new Object[1];
                                    c((short) 141, b8, (byte) (b8 | 52), objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, iGreen, iLastIndexOf2, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i86 = b;
                                    int i87 = (i86 & 51) + (i86 | 51);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i87 % 128;
                                    int i88 = i87 % 2;
                                    i8 = 1;
                                } else {
                                    i8 = 0;
                                }
                            }
                            int i89 = -i8;
                            int i90 = ((i8 & i89) | (i8 ^ i89)) >> 31;
                            int i91 = (~i90) & i2;
                            int i92 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i9 = (i92 & 105) + (i92 | 105);
                            b = i9 % 128;
                            int i93 = i90 & (i2 ^ 10);
                            int i94 = (i93 & i91) | (i91 ^ i93);
                            if (i9 % 2 == 0) {
                                i10 = i3 & 86;
                            } else {
                                i10 = i3 & 32;
                            }
                            int i95 = -i10;
                            int i96 = ((i10 & i95) | (i10 ^ i95)) >> 31;
                            int i97 = ((i92 | 87) << 1) - (i92 ^ 87);
                            b = i97 % 128;
                            int i98 = i97 % 2;
                            int i99 = i94 & (~i96);
                            int i100 = i96 & i2;
                            i7 = (i99 & i100) | (i99 ^ i100);
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i101 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i6 = (i101 ^ 17) + ((i101 & 17) << 1);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                throw null;
                            }
                            i7 = i2;
                        } else {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    Object[] objArr18 = new Object[1];
                                    a(new char[]{52809, 34854, 16984, 7274, 55005, 37046, 27350, 9484, 65338, 47364, 29560, 52637, 34737, 16867, 6221, 53801, 44115, 26225, 8329, 64190, 46309, 3854, 51498, 33625, 23931, 6101, 53718, 44002}, 17956 - (~(-(-KeyEvent.keyCodeFromString("")))), objArr18);
                                    try {
                                        Object[] objArr19 = {(String) objArr18[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                                            int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 993;
                                            int iCombineMeasuredStates2 = 8 - View.combineMeasuredStates(0, 0);
                                            byte b9 = $$a[7];
                                            Object[] objArr110 = new Object[1];
                                            c((short) 141, b9, (byte) (b9 | 52), objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf3, jumpTapTimeout3, iCombineMeasuredStates2, 410748506, false, (String) objArr110[0], new Class[]{String.class});
                                        }
                                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr19)).longValue();
                                        long j9 = 417958312;
                                        long j10 = (((long) 465) * j9) + (((long) (-463)) * jLongValue2);
                                        long j11 = 464;
                                        long j12 = -1;
                                        long j13 = jLongValue2 ^ j12;
                                        long jElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                        long j14 = jElapsedRealtime2 ^ j12;
                                        long j15 = (j13 | j9) ^ j12;
                                        long j16 = j10 + ((((j13 | j14) ^ j12) | j15 | ((j14 | j9) ^ j12)) * j11) + (((long) (-464)) * (jElapsedRealtime2 | (j9 ^ j12) | j13)) + ((j15 | ((jElapsedRealtime2 | j9) ^ j12)) * j11) + ((long) (-618876549));
                                        int i710 = ~i2;
                                        int i711 = ((int) (j16 >> 32)) & ((-851274317) + (((~(1065827117 | i710)) | 1791913767) * (-983)) + (((~(1791913767 | i710)) | 352391176) * 983));
                                        int i810 = 1411013713 + (((~(438105847 | i710)) | (-1875332258)) * (-328)) + (((-1875332258) | i2) * 164) + (((~(i710 | (-1707280385))) | (~((-438105848) | i2)) | 270053974) * 164);
                                        int i811 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i812 = ((i811 | 87) << 1) - (i811 ^ 87);
                                        b = i812 % 128;
                                        int i813 = i812 % 2;
                                        i8 = i711 | (((int) j16) & i810);
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    cArr = new char[]{52823};
                                    int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                    i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                                    b = i11 % 128;
                                    i12 = -keyRepeatTimeout2;
                                    if (i11 % 2 == 0) {
                                        int i814 = (i12 ^ 21991) + ((i12 & 21991) << 1);
                                        Object[] objArr111 = new Object[1];
                                        a(cArr, i814, objArr111);
                                        str = (String) objArr111[0];
                                        cArr2 = new char[]{52756, 11062, 1078, 25023, 23295, 46143, 37225, 35512, 59385, 49456, 14962, 6079, 28919};
                                        c = 'y';
                                        i13 = 0;
                                    } else {
                                        int i815 = ((i12 | 21991) << 1) - (i12 ^ 21991);
                                        Object[] objArr112 = new Object[1];
                                        a(cArr, i815, objArr112);
                                        i13 = 0;
                                        str = (String) objArr112[0];
                                        cArr2 = new char[]{52756, 11062, 1078, 25023, 23295, 46143, 37225, 35512, 59385, 49456, 14962, 6079, 28919};
                                        c = '0';
                                    }
                                    Object[] objArr113 = new Object[1];
                                    a(cArr2, 58686 - TextUtils.lastIndexOf("", c, i13), objArr113);
                                    try {
                                        objArr = new Object[]{(String) objArr113[i13]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char gidForName2 = (char) (Process.getGidForName("") + 33603);
                                            int iGreen2 = Color.green(0) + 3085;
                                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 27;
                                            byte b10 = $$a[7];
                                            Object[] objArr114 = new Object[1];
                                            c((short) 141, b10, (byte) (b10 | 52), objArr114);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName2, iGreen2, iLastIndexOf3, 1411172903, false, (String) objArr114[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            int i816 = b;
                                            int i817 = (i816 & 51) + (i816 | 51);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i817 % 128;
                                            int i818 = i817 % 2;
                                            i8 = 1;
                                        } else {
                                            i8 = 0;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            int i819 = -i8;
                            int i910 = ((i8 & i819) | (i8 ^ i819)) >> 31;
                            int i911 = (~i910) & i2;
                            int i912 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i9 = (i912 & 105) + (i912 | 105);
                            b = i9 % 128;
                            int i913 = i910 & (i2 ^ 10);
                            int i914 = (i913 & i911) | (i911 ^ i913);
                            if (i9 % 2 == 0) {
                                i10 = i3 & 86;
                            } else {
                                i10 = i3 & 32;
                            }
                            int i915 = -i10;
                            int i916 = ((i10 & i915) | (i10 ^ i915)) >> 31;
                            int i917 = ((i912 | 87) << 1) - (i912 ^ 87);
                            b = i917 % 128;
                            int i918 = i917 % 2;
                            int i919 = i914 & (~i916);
                            int i102 = i916 & i2;
                            i7 = (i919 & i102) | (i919 ^ i102);
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i103 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i6 = (i103 ^ 17) + ((i103 & 17) << 1);
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                        i7 = i2;
                    } else {
                        if (Build.VERSION.SDK_INT > 33) {
                            Object[] objArr115 = new Object[1];
                            a(new char[]{52809, 34854, 16984, 7274, 55005, 37046, 27350, 9484, 65338, 47364, 29560, 52637, 34737, 16867, 6221, 53801, 44115, 26225, 8329, 64190, 46309, 3854, 51498, 33625, 23931, 6101, 53718, 44002}, 17956 - (~(-(-KeyEvent.keyCodeFromString("")))), objArr115);
                            Object[] objArr116 = {(String) objArr115[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cIndexOf4 = (char) TextUtils.indexOf("", "", 0, 0);
                                int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 993;
                                int iCombineMeasuredStates3 = 8 - View.combineMeasuredStates(0, 0);
                                byte b11 = $$a[7];
                                Object[] objArr117 = new Object[1];
                                c((short) 141, b11, (byte) (b11 | 52), objArr117);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf4, jumpTapTimeout4, iCombineMeasuredStates3, 410748506, false, (String) objArr117[0], new Class[]{String.class});
                            }
                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr116)).longValue();
                            long j17 = 417958312;
                            long j18 = (((long) 465) * j17) + (((long) (-463)) * jLongValue3);
                            long j19 = 464;
                            long j110 = -1;
                            long j111 = jLongValue3 ^ j110;
                            long jElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                            long j112 = jElapsedRealtime3 ^ j110;
                            long j113 = (j111 | j17) ^ j110;
                            long j114 = j18 + ((((j111 | j112) ^ j110) | j113 | ((j112 | j17) ^ j110)) * j19) + (((long) (-464)) * (jElapsedRealtime3 | (j17 ^ j110) | j111)) + ((j113 | ((jElapsedRealtime3 | j17) ^ j110)) * j19) + ((long) (-618876549));
                            int i712 = ~i2;
                            int i713 = ((int) (j114 >> 32)) & ((-851274317) + (((~(1065827117 | i712)) | 1791913767) * (-983)) + (((~(1791913767 | i712)) | 352391176) * 983));
                            int i8110 = 1411013713 + (((~(438105847 | i712)) | (-1875332258)) * (-328)) + (((-1875332258) | i2) * 164) + (((~(i712 | (-1707280385))) | (~((-438105848) | i2)) | 270053974) * 164);
                            int i8111 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i8112 = ((i8111 | 87) << 1) - (i8111 ^ 87);
                            b = i8112 % 128;
                            int i8113 = i8112 % 2;
                            i8 = i713 | (((int) j114) & i8110);
                        } else {
                            cArr = new char[]{52823};
                            int keyRepeatTimeout3 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                            i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                            b = i11 % 128;
                            i12 = -keyRepeatTimeout3;
                            if (i11 % 2 == 0) {
                                int i8114 = (i12 ^ 21991) + ((i12 & 21991) << 1);
                                Object[] objArr118 = new Object[1];
                                a(cArr, i8114, objArr118);
                                str = (String) objArr118[0];
                                cArr2 = new char[]{52756, 11062, 1078, 25023, 23295, 46143, 37225, 35512, 59385, 49456, 14962, 6079, 28919};
                                c = 'y';
                                i13 = 0;
                            } else {
                                int i8115 = ((i12 | 21991) << 1) - (i12 ^ 21991);
                                Object[] objArr119 = new Object[1];
                                a(cArr, i8115, objArr119);
                                i13 = 0;
                                str = (String) objArr119[0];
                                cArr2 = new char[]{52756, 11062, 1078, 25023, 23295, 46143, 37225, 35512, 59385, 49456, 14962, 6079, 28919};
                                c = '0';
                            }
                            Object[] objArr1110 = new Object[1];
                            a(cArr2, 58686 - TextUtils.lastIndexOf("", c, i13), objArr1110);
                            objArr = new Object[]{(String) objArr1110[i13]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char gidForName3 = (char) (Process.getGidForName("") + 33603);
                                int iGreen3 = Color.green(0) + 3085;
                                int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0) + 27;
                                byte b12 = $$a[7];
                                Object[] objArr1111 = new Object[1];
                                c((short) 141, b12, (byte) (b12 | 52), objArr1111);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName3, iGreen3, iLastIndexOf4, 1411172903, false, (String) objArr1111[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i8116 = b;
                                int i8117 = (i8116 & 51) + (i8116 | 51);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8117 % 128;
                                int i8118 = i8117 % 2;
                                i8 = 1;
                            } else {
                                i8 = 0;
                            }
                        }
                        int i8119 = -i8;
                        int i9110 = ((i8 & i8119) | (i8 ^ i8119)) >> 31;
                        int i9111 = (~i9110) & i2;
                        int i9112 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i9 = (i9112 & 105) + (i9112 | 105);
                        b = i9 % 128;
                        int i9113 = i9110 & (i2 ^ 10);
                        int i9114 = (i9113 & i9111) | (i9111 ^ i9113);
                        if (i9 % 2 == 0) {
                            i10 = i3 & 86;
                        } else {
                            i10 = i3 & 32;
                        }
                        int i9115 = -i10;
                        int i9116 = ((i10 & i9115) | (i10 ^ i9115)) >> 31;
                        int i9117 = ((i9112 | 87) << 1) - (i9112 ^ 87);
                        b = i9117 % 128;
                        int i9118 = i9117 % 2;
                        int i9119 = i9114 & (~i9116);
                        int i104 = i9116 & i2;
                        i7 = (i9119 & i104) | (i9119 ^ i104);
                    }
                    int i105 = (~(i2 & i5)) & (i2 | i5);
                    int i106 = (i105 | (-i105)) >> 31;
                    int i107 = (i7 & (~i106)) | (i106 & i5);
                    int i108 = b;
                    int i109 = (i108 & 105) + (i108 | 105);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i109 % 128;
                    int i110 = i109 % 2;
                    int i111 = ((~i107) & i2) | ((~i2) & i107);
                    int i112 = -i111;
                    int i113 = i108 + 95;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i113 % 128;
                    int i114 = i113 % 2;
                    Object[] objArr20 = {new int[]{i2}, new int[1], new int[]{i107}, null};
                    int i115 = ~((int) Process.getElapsedCpuTime());
                    int i116 = (-898402694) + (((~(348018264 | i115)) | (-388328494)) * (-983)) + (((~(i115 | (-388328494))) | 337921032) * 983) + ((((i111 & i112) | (i111 ^ i112)) >> 31) & 16);
                    int iB2 = zzn.b();
                    int i117 = (i116 * 860) + (i4 * (-858));
                    int i118 = ((i116 ^ iB2) | (i116 & iB2)) * (-859);
                    int i119 = (i117 & i118) + (i117 | i118);
                    int i120 = ~iB2;
                    int i121 = ~((i120 & i116) | (i120 ^ i116));
                    int i122 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i123 = (i122 ^ 55) + ((i122 & 55) << 1);
                    b = i123 % 128;
                    int i124 = i123 % 2;
                    int i125 = ~((~i116) | (~i4) | iB2);
                    int i126 = 859 * ((i121 & i125) | (i121 ^ i125));
                    int i127 = (i119 & i126) + (i119 | i126);
                    int i128 = ~i4;
                    int i129 = ~iB2;
                    int i130 = ~((i129 & i128) | (i128 ^ i129));
                    int i131 = i122 + 71;
                    b = i131 % 128;
                    int i132 = i131 % 2;
                    int i133 = ~(i128 | i116);
                    int i134 = ((i130 & i133) | (i130 ^ i133)) * 859;
                    if (i132 != 0) {
                        int i135 = i127 + i134;
                        int i136 = i135 << 13;
                        int i137 = (i136 & (~i135)) | ((~i136) & i135);
                        int i138 = i137 ^ (i137 >>> 17);
                        ((int[]) objArr20[1])[0] = i138 ^ (i138 << 5);
                        return objArr20;
                    }
                    int i139 = i127 % i134;
                    int i140 = i139 << 120;
                    int i141 = (i140 & (~i139)) | ((~i140) & i139);
                    int i142 = i141 >> 124;
                    int i143 = (i141 | i142) & (~(i141 & i142));
                    int i144 = ((i143 | 2) << 1) - (i143 ^ 2);
                    ((int[]) objArr20[0])[0] = (i143 | i144) & (~(i143 & i144));
                    return objArr20;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda19
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$3vTSmWzZ4eG2itzGdFZ1qEoBYMI(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asBinder + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final List getClaimLayoffDocCode$lambda$54(ClaimLayoffDocCodeResponse claimLayoffDocCodeResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(claimLayoffDocCodeResponse, "");
            return claimLayoffDocCodeResponse.getData();
        }
        Intrinsics.checkNotNullParameter(claimLayoffDocCodeResponse, "");
        claimLayoffDocCodeResponse.getData();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ClaimReactivationBpuTuitionResponse getClaimReactivationBpuTuition$lambda$57(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ClaimReactivationBpuTuitionResponse claimReactivationBpuTuitionResponse = (ClaimReactivationBpuTuitionResponse) function1.invoke(obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return claimReactivationBpuTuitionResponse;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<ClaimReactivationBpuTuitionResponse> getClaimReactivationBpuTuition(ClaimReactivationBpuTuitionRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ClaimReactivationBpuTuitionResponse>> claimBpuReactivationTuition = getWebService().getClaimBpuReactivationTuition(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(claimBpuReactivationTuition, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.m7626$r8$lambda$yHr1bIyKZW6xs53JXhkr1HfFw((ClaimReactivationBpuTuitionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$RrDRlZbZi9Dttt9aR7v0sTSGWmk(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivation$lambda$59(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponse = (ClaimCheckBankBpuReactivationResponse) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return claimCheckBankBpuReactivationResponse;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<ClaimCheckBankBpuReactivationResponse> claimCheckBankBpuReactivation(ClaimCheckBankBpuReactivationRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ClaimCheckBankBpuReactivationResponse>> derivecodecClaimCheckBankBpuReactivation = getWebService().claimCheckBankBpuReactivation(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecClaimCheckBankBpuReactivation, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.$r8$lambda$1592mHHsSfU0JfabYpqlRnMyAKg((ClaimCheckBankBpuReactivationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$w8u5C7e3ApNEhNcs7DoRGXVcIUM(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final List claimGetListReasonBpu$lambda$60(ClaimNotReactivationReason claimNotReactivationReason) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(claimNotReactivationReason, "");
            claimNotReactivationReason.getReasonNotReactive();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(claimNotReactivationReason, "");
        List<ReasonNotReactive> reasonNotReactive = claimNotReactivationReason.getReasonNotReactive();
        int i3 = asBinder + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return reasonNotReactive;
        }
        throw null;
    }

    private static final List claimGetListReasonBpu$lambda$61(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (List) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.jht.JhtRepository
    public final deriveCodec<List<ReasonNotReactive>> claimGetListReasonBpu() {
        int i = 2 % 2;
        deriveCodec<Response<ClaimNotReactivationReason>> derivecodecClaimGetListReasonBpu = getWebService().claimGetListReasonBpu();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecClaimGetListReasonBpu, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JhtDataStore.m7622$r8$lambda$f1hWF0Uj0O_hQZVQOjgBksfk4((ClaimNotReactivationReason) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jht.JhtDataStore$$ExternalSyntheticLambda59
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JhtDataStore.$r8$lambda$HCHiX8DADJxKzY4JNirWFqPfOi4(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    public static /* synthetic */ ClaimCheckBankBpuReactivationResponse $r8$lambda$1592mHHsSfU0JfabYpqlRnMyAKg(ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            claimCheckBankBpuReactivation$lambda$58(claimCheckBankBpuReactivationResponse);
            throw null;
        }
        ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponseClaimCheckBankBpuReactivation$lambda$58 = claimCheckBankBpuReactivation$lambda$58(claimCheckBankBpuReactivationResponse);
        int i3 = asBinder + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return claimCheckBankBpuReactivationResponseClaimCheckBankBpuReactivation$lambda$58;
    }

    public static /* synthetic */ List $r8$lambda$1a6wd64qO2smwREYAk4XjTHBlzE(ClaimSegmenResponse claimSegmenResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getClaimSegment$lambda$52(claimSegmenResponse);
        }
        getClaimSegment$lambda$52(claimSegmenResponse);
        throw null;
    }

    public static /* synthetic */ JhtClaimContributionResponse $r8$lambda$2qyDZrUJvvyVLnMXYQc6psp9Aos(JhtClaimContributionResponse jhtClaimContributionResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimContributionResponse jhtClaimContributionDetail$lambda$46 = getJhtClaimContributionDetail$lambda$46(jhtClaimContributionResponse);
        int i4 = asBinder + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return jhtClaimContributionDetail$lambda$46;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$3ACFilm6bs4yKITn0sRhZ2d03Ro(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemCheckIdFaceLiveness$lambda$24 = checkIdFaceLiveness$lambda$24(baseItem);
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return baseItemCheckIdFaceLiveness$lambda$24;
    }

    public static /* synthetic */ List $r8$lambda$3vTSmWzZ4eG2itzGdFZ1qEoBYMI(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            getClaimLayoffDocCode$lambda$55(function1, obj);
            throw null;
        }
        List claimLayoffDocCode$lambda$55 = getClaimLayoffDocCode$lambda$55(function1, obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return claimLayoffDocCode$lambda$55;
    }

    public static /* synthetic */ List $r8$lambda$4D0PouKG0mhYjRAFMiXH_FLhwFA(JhtBalanceResponse jhtBalanceResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List jhtBalance$lambda$0 = getJhtBalance$lambda$0(jhtBalanceResponse);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return jhtBalance$lambda$0;
        }
        throw null;
    }

    public static /* synthetic */ GenerateClaimCodeResponse $r8$lambda$4GTAncxkpLsj468_d28kdMsrrPA(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return getGenerateClaimCode$lambda$9(function1, obj);
        }
        getGenerateClaimCode$lambda$9(function1, obj);
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$4c59Sa_7dZ9IAJe8L--8hUPcKgs, reason: not valid java name */
    public static /* synthetic */ BaseItem m7611$r8$lambda$4c59Sa_7dZ9IAJe8L8hUPcKgs(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemPostJhtInstantClaim$lambda$35 = postJhtInstantClaim$lambda$35(function1, obj);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return baseItemPostJhtInstantClaim$lambda$35;
    }

    /* JADX INFO: renamed from: $r8$lambda$5Im82nNxc6F0vsJDtnbIX-rB2ek, reason: not valid java name */
    public static /* synthetic */ InfoPraClaimItems m7612$r8$lambda$5Im82nNxc6F0vsJDtnbIXrB2ek(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return getInfoPraClaim$lambda$43(function1, obj);
        }
        getInfoPraClaim$lambda$43(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$5eo7KdFzVj79OLLwgra91R2GuiI(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemCheckFaceLivenessBiometric$lambda$36 = checkFaceLivenessBiometric$lambda$36(baseItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return baseItemCheckFaceLivenessBiometric$lambda$36;
    }

    public static /* synthetic */ ClaimEvidenceJhtResponse $r8$lambda$5zEzoGO2QiAO_LWfa3kMh9Gv52I(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ClaimEvidenceJhtResponse claimEvidenceJhtResponseCheckClaimEvidenceJht$lambda$19 = checkClaimEvidenceJht$lambda$19(function1, obj);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = asBinder + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return claimEvidenceJhtResponseCheckClaimEvidenceJht$lambda$19;
    }

    /* JADX INFO: renamed from: $r8$lambda$6RTkywCHrG3nmpIzvPj-9XteDDI, reason: not valid java name */
    public static /* synthetic */ List m7613$r8$lambda$6RTkywCHrG3nmpIzvPj9XteDDI(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        List jhtContributionDetail$lambda$45 = getJhtContributionDetail$lambda$45(function1, obj);
        int i4 = asBinder + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return jhtContributionDetail$lambda$45;
    }

    public static /* synthetic */ InfoPraClaimItems $r8$lambda$7dq8H3vEGCHHk8xJOLb74nEqIw0(InfoPraClaimResponse infoPraClaimResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        InfoPraClaimItems infoPraClaim$lambda$42 = getInfoPraClaim$lambda$42(infoPraClaimResponse);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return infoPraClaim$lambda$42;
    }

    public static /* synthetic */ JhtClaimSignaturedItem $r8$lambda$81LOd4SOuXocRYjNjNFGIRLMCtU(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimSignaturedItem jhtClaimSignaturedItemCheckAdminDuk$lambda$15 = checkAdminDuk$lambda$15(function1, obj);
        int i4 = asBinder + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return jhtClaimSignaturedItemCheckAdminDuk$lambda$15;
    }

    /* JADX INFO: renamed from: $r8$lambda$9NtWbcm41zNGtBh-WHge5ffelyA, reason: not valid java name */
    public static /* synthetic */ BaseItem m7614$r8$lambda$9NtWbcm41zNGtBhWHge5ffelyA(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return postJhtKlaim$lambda$29(function1, obj);
        }
        postJhtKlaim$lambda$29(function1, obj);
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$9f29oLNOa_fkEBEh5uGkLHgGBOQ(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemSendRsJht$lambda$7 = sendRsJht$lambda$7(function1, obj);
        int i4 = asBinder + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return baseItemSendRsJht$lambda$7;
    }

    public static /* synthetic */ BaseItem $r8$lambda$AciYarahlBKfv2xdC0FiYfpAa4w(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemCheckDukcapilFaceLiveness$lambda$21 = checkDukcapilFaceLiveness$lambda$21(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return baseItemCheckDukcapilFaceLiveness$lambda$21;
        }
        throw null;
    }

    public static /* synthetic */ List $r8$lambda$AkWT84uXjN4Dw_wd2ZBpi74LvZc(ClaimLayoffDocCodeResponse claimLayoffDocCodeResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getClaimLayoffDocCode$lambda$54(claimLayoffDocCodeResponse);
        }
        getClaimLayoffDocCode$lambda$54(claimLayoffDocCodeResponse);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$AxzKKEP-z1pDu4YeYYwpgwU8alg, reason: not valid java name */
    public static /* synthetic */ ResponseBody m7615$r8$lambda$AxzKKEPz1pDu4YeYYwpgwU8alg(ResponseBody responseBody) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            getRsJht$lambda$4(responseBody);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ResponseBody rsJht$lambda$4 = getRsJht$lambda$4(responseBody);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return rsJht$lambda$4;
    }

    public static /* synthetic */ BaseItem $r8$lambda$C0du4FFse2Aa6C7qIampNPf72Eg(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemCheckIdFaceLiveness$lambda$25 = checkIdFaceLiveness$lambda$25(function1, obj);
        int i4 = asBinder + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return baseItemCheckIdFaceLiveness$lambda$25;
    }

    public static /* synthetic */ JhtClaimTrackItem $r8$lambda$Ct4IJcMnzZ3xwMSS_MrP_p6kKzg(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return postTrackClaim$lambda$31(function1, obj);
        }
        postTrackClaim$lambda$31(function1, obj);
        throw null;
    }

    public static /* synthetic */ List $r8$lambda$DZSzMM1wmHvopyem2WRt2TyXKtE(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List jhtSubscriptions$lambda$3 = getJhtSubscriptions$lambda$3(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return jhtSubscriptions$lambda$3;
    }

    public static /* synthetic */ ClaimEvidenceJhtResponse $r8$lambda$GWBCXIMUbaOXj2RdvT_QeLfNLaU(ClaimEvidenceJhtResponse claimEvidenceJhtResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ClaimEvidenceJhtResponse claimEvidenceJhtResponseCheckClaimEvidenceJht$lambda$18 = checkClaimEvidenceJht$lambda$18(claimEvidenceJhtResponse);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return claimEvidenceJhtResponseCheckClaimEvidenceJht$lambda$18;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List $r8$lambda$HCHiX8DADJxKzY4JNirWFqPfOi4(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        List listClaimGetListReasonBpu$lambda$61 = claimGetListReasonBpu$lambda$61(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return listClaimGetListReasonBpu$lambda$61;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ JhtClaimEligibilityResponse $r8$lambda$ILxMKoGauxnWkKQhEEXpShSIFOQ(JhtClaimEligibilityResponse jhtClaimEligibilityResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimEligibilityResponse jhtClaimEligibilityResponseCheckEligibilityClaim$lambda$38 = checkEligibilityClaim$lambda$38(jhtClaimEligibilityResponse);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return jhtClaimEligibilityResponseCheckEligibilityClaim$lambda$38;
    }

    public static /* synthetic */ ClaimLivenessResponse $r8$lambda$IPikEx5wrRdMmGGyJEy4fLghek0(ClaimLivenessResponse claimLivenessResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return claimLivenessFaceMatch$lambda$50(claimLivenessResponse);
        }
        claimLivenessFaceMatch$lambda$50(claimLivenessResponse);
        throw null;
    }

    public static /* synthetic */ JhtClaimEmployeeDataItem $r8$lambda$IQvydHKPrwI_z_kqk0o5Od8i5bs(JhtClaimEmployeeDataResponse jhtClaimEmployeeDataResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimEmployeeDataItem employeeDataClaim$lambda$40 = getEmployeeDataClaim$lambda$40(jhtClaimEmployeeDataResponse);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return employeeDataClaim$lambda$40;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$IcHH_YiNLYZUQE-LnAG-1glthsU, reason: not valid java name */
    public static /* synthetic */ BaseItem m7616$r8$lambda$IcHH_YiNLYZUQELnAG1glthsU(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            checkNodefluxFaceLiveness$lambda$23(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        BaseItem baseItemCheckNodefluxFaceLiveness$lambda$23 = checkNodefluxFaceLiveness$lambda$23(function1, obj);
        int i3 = asBinder + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return baseItemCheckNodefluxFaceLiveness$lambda$23;
    }

    /* JADX INFO: renamed from: $r8$lambda$LF-bbEEqpqE0w-GHaAMpy3VsaR0, reason: not valid java name */
    public static /* synthetic */ JhtBenefitDetailItem m7617$r8$lambda$LFbbEEqpqE0wGHaAMpy3VsaR0(JhtBenefitDetailResponse jhtBenefitDetailResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            getBenefitDetail$lambda$32(jhtBenefitDetailResponse);
            throw null;
        }
        JhtBenefitDetailItem benefitDetail$lambda$32 = getBenefitDetail$lambda$32(jhtBenefitDetailResponse);
        int i3 = asBinder + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return benefitDetail$lambda$32;
    }

    public static /* synthetic */ ResponseBody $r8$lambda$LRI07SrMnXEENl5eOByEMYMieIw(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ResponseBody rsJht$lambda$5 = getRsJht$lambda$5(function1, obj);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return rsJht$lambda$5;
    }

    /* JADX INFO: renamed from: $r8$lambda$LbRR-aU-Jmv4aRQtipfYKTVoffo, reason: not valid java name */
    public static /* synthetic */ JhtClaimEligibilityResponse m7618$r8$lambda$LbRRaUJmv4aRQtipfYKTVoffo(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimEligibilityResponse jhtClaimEligibilityResponseCheckEligibilityClaim$lambda$39 = checkEligibilityClaim$lambda$39(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return jhtClaimEligibilityResponseCheckEligibilityClaim$lambda$39;
    }

    public static /* synthetic */ BaseItem $r8$lambda$LehSYUT3OcGOS7ZHhcbT5ZyMlco(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            postJhtInstantClaim$lambda$34(baseItem);
            throw null;
        }
        BaseItem baseItemPostJhtInstantClaim$lambda$34 = postJhtInstantClaim$lambda$34(baseItem);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return baseItemPostJhtInstantClaim$lambda$34;
    }

    public static /* synthetic */ JhtClaimSignaturedItem $r8$lambda$MprbsiGdZ80hYd5uC9_3bdiBV1E(JhtClaimSignaturedItem jhtClaimSignaturedItem) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimSignaturedItem jhtClaimSignaturedItemCheckAdminDuk$lambda$14 = checkAdminDuk$lambda$14(jhtClaimSignaturedItem);
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return jhtClaimSignaturedItemCheckAdminDuk$lambda$14;
    }

    public static /* synthetic */ JhtClaimCheckPhotoResponse $r8$lambda$OT8LSoSlawf6SsDx8NiL5i859Wo(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        asBinder = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            checkPhotoAdminDuk$lambda$17(function1, obj);
            throw null;
        }
        JhtClaimCheckPhotoResponse jhtClaimCheckPhotoResponseCheckPhotoAdminDuk$lambda$17 = checkPhotoAdminDuk$lambda$17(function1, obj);
        int i3 = asBinder + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return jhtClaimCheckPhotoResponseCheckPhotoAdminDuk$lambda$17;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ ClaimReactivationBpuTuitionResponse $r8$lambda$RrDRlZbZi9Dttt9aR7v0sTSGWmk(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            getClaimReactivationBpuTuition$lambda$57(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ClaimReactivationBpuTuitionResponse claimReactivationBpuTuition$lambda$57 = getClaimReactivationBpuTuition$lambda$57(function1, obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return claimReactivationBpuTuition$lambda$57;
    }

    public static /* synthetic */ BaseItem $r8$lambda$VmTV4sRje4melxHQgxzrclV_FyE(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return postJhtKlaim$lambda$28(baseItem);
        }
        postJhtKlaim$lambda$28(baseItem);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$VvoNq3gI4dTe-2MTZHMO5cNaX6Y, reason: not valid java name */
    public static /* synthetic */ List m7619$r8$lambda$VvoNq3gI4dTe2MTZHMO5cNaX6Y(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        List jhtBalance$lambda$1 = getJhtBalance$lambda$1(function1, obj);
        int i4 = asBinder + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return jhtBalance$lambda$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ ClaimLivenessResponse $r8$lambda$Y4ECUwbZj05DiUYiXiUcB5OoylM(ClaimLivenessResponse claimLivenessResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ClaimLivenessResponse claimLivenessResponseClaimLivenessFaceMatchCheck$lambda$48 = claimLivenessFaceMatchCheck$lambda$48(claimLivenessResponse);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return claimLivenessResponseClaimLivenessFaceMatchCheck$lambda$48;
    }

    /* JADX INFO: renamed from: $r8$lambda$chekgnPvohAQzlTvNM-GTZoWL00, reason: not valid java name */
    public static /* synthetic */ JhtClaimSignaturedItem m7620$r8$lambda$chekgnPvohAQzlTvNMGTZoWL00(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimSignaturedItem jhtClaimSignaturedItemCheckBankAccount$lambda$27 = checkBankAccount$lambda$27(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return jhtClaimSignaturedItemCheckBankAccount$lambda$27;
    }

    /* JADX INFO: renamed from: $r8$lambda$da1eirUnFDhPsyWxqi-eZZd2RJs, reason: not valid java name */
    public static /* synthetic */ JhtClaimReasonResponse m7621$r8$lambda$da1eirUnFDhPsyWxqieZZd2RJs(JhtClaimReasonResponse jhtClaimReasonResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimReasonResponse claimReason$lambda$12 = getClaimReason$lambda$12(jhtClaimReasonResponse);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return claimReason$lambda$12;
        }
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$e0Nh9KoZ8gpasiN5u1DAX9OgbL4(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return sendRsJht$lambda$6(baseItem);
        }
        sendRsJht$lambda$6(baseItem);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List $r8$lambda$eKUxmzB__zxLJ9nKjVWUmwNU6To(JhtSubscriptionResponse jhtSubscriptionResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        List jhtSubscriptions$lambda$2 = getJhtSubscriptions$lambda$2(jhtSubscriptionResponse);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return jhtSubscriptions$lambda$2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$f-1hWF0Uj0O_hQZVQOjgBksf-k4, reason: not valid java name */
    public static /* synthetic */ List m7622$r8$lambda$f1hWF0Uj0O_hQZVQOjgBksfk4(ClaimNotReactivationReason claimNotReactivationReason) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        List listClaimGetListReasonBpu$lambda$60 = claimGetListReasonBpu$lambda$60(claimNotReactivationReason);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return listClaimGetListReasonBpu$lambda$60;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ GenerateClaimCodeResponse $r8$lambda$fByRiFodrMx27Lzr3K3neD2TQOQ(GenerateClaimCodeResponse generateClaimCodeResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        GenerateClaimCodeResponse generateClaimCode$lambda$8 = getGenerateClaimCode$lambda$8(generateClaimCodeResponse);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return generateClaimCode$lambda$8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$gAmyA028Fp8BObwv29bvwLi-3FY, reason: not valid java name */
    public static /* synthetic */ JhtBenefitDetailItem m7623$r8$lambda$gAmyA028Fp8BObwv29bvwLi3FY(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JhtBenefitDetailItem benefitDetail$lambda$33 = getBenefitDetail$lambda$33(function1, obj);
        int i4 = asBinder + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return benefitDetail$lambda$33;
    }

    public static /* synthetic */ JhtClaimCheckPhotoResponse $r8$lambda$hSVi5fqaBxFl6PIrV0Y_GCwD870(JhtClaimCheckPhotoResponse jhtClaimCheckPhotoResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimCheckPhotoResponse jhtClaimCheckPhotoResponseCheckPhotoAdminDuk$lambda$16 = checkPhotoAdminDuk$lambda$16(jhtClaimCheckPhotoResponse);
        int i4 = asBinder + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return jhtClaimCheckPhotoResponseCheckPhotoAdminDuk$lambda$16;
    }

    public static /* synthetic */ JhtClaimReasonResponse $r8$lambda$iasTz1RO1bfrKZkQEmHzsmOu9nk(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimReasonResponse claimReason$lambda$13 = getClaimReason$lambda$13(function1, obj);
        int i4 = asBinder + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return claimReason$lambda$13;
    }

    public static /* synthetic */ BaseItem $r8$lambda$jDz363X8xmq2LOiBoyErIvTivNQ(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return checkFaceLivenessBiometric$lambda$37(function1, obj);
        }
        checkFaceLivenessBiometric$lambda$37(function1, obj);
        throw null;
    }

    public static /* synthetic */ JhtClaimSignaturedItem $r8$lambda$kgKR4l6vnhY7tBdEHSYcIV_ZbJM(JhtClaimSignaturedItem jhtClaimSignaturedItem) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimSignaturedItem jhtClaimSignaturedItemCheckBankAccount$lambda$26 = checkBankAccount$lambda$26(jhtClaimSignaturedItem);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = asBinder + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return jhtClaimSignaturedItemCheckBankAccount$lambda$26;
    }

    public static /* synthetic */ ClaimLivenessResponse $r8$lambda$lNfj6kHCSUEqJfjjujwQSZHvpdk(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return claimLivenessFaceMatch$lambda$51(function1, obj);
        }
        claimLivenessFaceMatch$lambda$51(function1, obj);
        throw null;
    }

    public static /* synthetic */ JhtClaimTrackItem $r8$lambda$m7gfghA9RqdwOVDFoACf0uSUwa0(JhtClaimTrackItem jhtClaimTrackItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return postTrackClaim$lambda$30(jhtClaimTrackItem);
        }
        postTrackClaim$lambda$30(jhtClaimTrackItem);
        throw null;
    }

    public static /* synthetic */ JhtClaimContributionResponse $r8$lambda$mPtZJFm_XGJ7CfaLSD3pw_BsjJQ(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JhtClaimContributionResponse jhtClaimContributionDetail$lambda$47 = getJhtClaimContributionDetail$lambda$47(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return jhtClaimContributionDetail$lambda$47;
    }

    public static /* synthetic */ BaseItem $r8$lambda$nACJHUeTVBlP2OCTWv6Sv3S3UL4(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemCheckDukcapilFaceLiveness$lambda$20 = checkDukcapilFaceLiveness$lambda$20(baseItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return baseItemCheckDukcapilFaceLiveness$lambda$20;
    }

    public static /* synthetic */ List $r8$lambda$p9uCwrwVBPO0jOvdILVyABLbX6o(JhtContributionDetailResponse jhtContributionDetailResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return getJhtContributionDetail$lambda$44(jhtContributionDetailResponse);
        }
        getJhtContributionDetail$lambda$44(jhtContributionDetailResponse);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ClaimLivenessResponse $r8$lambda$pTHubDnGePtFROtZ_AP10Qay8GY(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return claimLivenessFaceMatchCheck$lambda$49(function1, obj);
        }
        claimLivenessFaceMatchCheck$lambda$49(function1, obj);
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$pu-_juJRzqzz_Z_U2FC-s6l3vOU, reason: not valid java name */
    public static /* synthetic */ JhtEligibilityClaimItem m7624$r8$lambda$pu_juJRzqzz_Z_U2FCs6l3vOU(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return checkEligibilityRequest$lambda$11(function1, obj);
        }
        checkEligibilityRequest$lambda$11(function1, obj);
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$s8lYEpiYi4k8owqKRYM3P-IP-dY, reason: not valid java name */
    public static /* synthetic */ BaseItem m7625$r8$lambda$s8lYEpiYi4k8owqKRYM3PIPdY(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return checkNodefluxFaceLiveness$lambda$22(baseItem);
        }
        checkNodefluxFaceLiveness$lambda$22(baseItem);
        throw null;
    }

    public static /* synthetic */ List $r8$lambda$tq8OqeBwOoinpL5MDnLI2RU_K1w(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List claimSegment$lambda$53 = getClaimSegment$lambda$53(function1, obj);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return claimSegment$lambda$53;
    }

    public static /* synthetic */ JhtClaimEmployeeDataItem $r8$lambda$uAOlcadBc05lbqBCoS1omD_xUQs(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return getEmployeeDataClaim$lambda$41(function1, obj);
        }
        getEmployeeDataClaim$lambda$41(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ JhtEligibilityClaimItem $r8$lambda$uWeTYiBD2z73xno_ChjXdzVTwKs(JhtEligibilityClaimItem jhtEligibilityClaimItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JhtEligibilityClaimItem jhtEligibilityClaimItemCheckEligibilityRequest$lambda$10 = checkEligibilityRequest$lambda$10(jhtEligibilityClaimItem);
        int i4 = asBinder + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return jhtEligibilityClaimItemCheckEligibilityRequest$lambda$10;
    }

    public static /* synthetic */ ClaimCheckBankBpuReactivationResponse $r8$lambda$w8u5C7e3ApNEhNcs7DoRGXVcIUM(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponseClaimCheckBankBpuReactivation$lambda$59 = claimCheckBankBpuReactivation$lambda$59(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return claimCheckBankBpuReactivationResponseClaimCheckBankBpuReactivation$lambda$59;
    }

    /* JADX INFO: renamed from: $r8$lambda$yHr1bIyKZW6x-s53J-Xhkr1HfFw, reason: not valid java name */
    public static /* synthetic */ ClaimReactivationBpuTuitionResponse m7626$r8$lambda$yHr1bIyKZW6xs53JXhkr1HfFw(ClaimReactivationBpuTuitionResponse claimReactivationBpuTuitionResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getClaimReactivationBpuTuition$lambda$56(claimReactivationBpuTuitionResponse);
        }
        getClaimReactivationBpuTuition$lambda$56(claimReactivationBpuTuitionResponse);
        throw null;
    }

    static {
        g = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = asInterface + 79;
        g = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final JhtClaimSignaturedItem checkAdminDuk$lambda$14(JhtClaimSignaturedItem jhtClaimSignaturedItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtClaimSignaturedItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return jhtClaimSignaturedItem;
    }

    private static final JhtClaimSignaturedItem checkBankAccount$lambda$26(JhtClaimSignaturedItem jhtClaimSignaturedItem) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtClaimSignaturedItem, "");
        int i4 = asBinder + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return jhtClaimSignaturedItem;
    }

    private static final ClaimEvidenceJhtResponse checkClaimEvidenceJht$lambda$18(ClaimEvidenceJhtResponse claimEvidenceJhtResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(claimEvidenceJhtResponse, "");
        int i4 = asBinder + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return claimEvidenceJhtResponse;
    }

    private static final BaseItem checkDukcapilFaceLiveness$lambda$20(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return baseItem;
    }

    private static final JhtClaimEligibilityResponse checkEligibilityClaim$lambda$38(JhtClaimEligibilityResponse jhtClaimEligibilityResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtClaimEligibilityResponse, "");
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        int i5 = asBinder + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return jhtClaimEligibilityResponse;
    }

    private static final JhtEligibilityClaimItem checkEligibilityRequest$lambda$10(JhtEligibilityClaimItem jhtEligibilityClaimItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtEligibilityClaimItem, "");
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return jhtEligibilityClaimItem;
    }

    private static final BaseItem checkFaceLivenessBiometric$lambda$36(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        int i4 = asBinder + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    private static final BaseItem checkIdFaceLiveness$lambda$24(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return baseItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final BaseItem checkNodefluxFaceLiveness$lambda$22(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        int i4 = asBinder + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return baseItem;
    }

    private static final JhtClaimCheckPhotoResponse checkPhotoAdminDuk$lambda$16(JhtClaimCheckPhotoResponse jhtClaimCheckPhotoResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtClaimCheckPhotoResponse, "");
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return jhtClaimCheckPhotoResponse;
    }

    private static final ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivation$lambda$58(ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(claimCheckBankBpuReactivationResponse, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return claimCheckBankBpuReactivationResponse;
    }

    private static final ClaimLivenessResponse claimLivenessFaceMatch$lambda$50(ClaimLivenessResponse claimLivenessResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(claimLivenessResponse, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return claimLivenessResponse;
    }

    private static final ClaimLivenessResponse claimLivenessFaceMatchCheck$lambda$48(ClaimLivenessResponse claimLivenessResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(claimLivenessResponse, "");
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return claimLivenessResponse;
    }

    private static final ClaimReactivationBpuTuitionResponse getClaimReactivationBpuTuition$lambda$56(ClaimReactivationBpuTuitionResponse claimReactivationBpuTuitionResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(claimReactivationBpuTuitionResponse, "");
        if (i3 != 0) {
            return claimReactivationBpuTuitionResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final JhtClaimReasonResponse getClaimReason$lambda$12(JhtClaimReasonResponse jhtClaimReasonResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtClaimReasonResponse, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return jhtClaimReasonResponse;
    }

    private static final GenerateClaimCodeResponse getGenerateClaimCode$lambda$8(GenerateClaimCodeResponse generateClaimCodeResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(generateClaimCodeResponse, "");
        if (i3 == 0) {
            return generateClaimCodeResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final JhtClaimContributionResponse getJhtClaimContributionDetail$lambda$46(JhtClaimContributionResponse jhtClaimContributionResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtClaimContributionResponse, "");
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return jhtClaimContributionResponse;
    }

    private static final ResponseBody getRsJht$lambda$4(ResponseBody responseBody) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseBody, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return responseBody;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final BaseItem postJhtInstantClaim$lambda$34(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        int i4 = asBinder + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return baseItem;
        }
        throw null;
    }

    private static final BaseItem postJhtKlaim$lambda$28(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    private static final JhtClaimTrackItem postTrackClaim$lambda$30(JhtClaimTrackItem jhtClaimTrackItem) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jhtClaimTrackItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return jhtClaimTrackItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final BaseItem sendRsJht$lambda$6(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return baseItem;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{47353, 47340, 47350, 47336, 47339, 47345, 47276, 47335, 47303, 47329, 47334, 47349, 47341, 47319, 47342, 47351, 47343, 47338, 47304, 47344, 47332, 47347, 47314, 47346};
        b = 2047719578;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        TuitionPaymentFragmentbindingInflater1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, int r8) {
        /*
            int r6 = r6 + 67
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = com.bpjstku.data.jht.JhtDataStore.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r3 = -r3
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.JhtDataStore.$$e(short, int, int):java.lang.String");
    }
}
