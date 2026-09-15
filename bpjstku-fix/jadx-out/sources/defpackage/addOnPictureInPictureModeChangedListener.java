package defpackage;

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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.jht.JhtRepository;
import com.bpjstku.data.jht.model.request.CheckBankAccountRequest;
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
import com.bpjstku.data.jht.model.request.JhtBalanceRequest;
import com.bpjstku.data.jht.model.request.JhtBenefitDetailRequest;
import com.bpjstku.data.jht.model.request.JhtClaimContributionRequest;
import com.bpjstku.data.jht.model.request.JhtClaimTrackRequest;
import com.bpjstku.data.jht.model.request.JhtInstantClaimRequest;
import com.bpjstku.data.jht.model.request.SendRsJhtRequest;
import com.bpjstku.data.jht.model.response.ClaimCheckBankBpuReactivationResponse;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtResponse;
import com.bpjstku.data.jht.model.response.ClaimLivenessResponse;
import com.bpjstku.data.jht.model.response.ClaimReactivationBpuTuitionResponse;
import com.bpjstku.data.jht.model.response.GenerateClaimCodeResponse;
import com.bpjstku.data.jht.model.response.JhtBalanceItem;
import com.bpjstku.data.jht.model.response.JhtBenefitDetailItem;
import com.bpjstku.data.jht.model.response.JhtClaimCheckPhotoResponse;
import com.bpjstku.data.jht.model.response.JhtClaimContributionItem;
import com.bpjstku.data.jht.model.response.JhtClaimContributionResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEligibilityResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem;
import com.bpjstku.data.jht.model.response.JhtClaimReasonItem;
import com.bpjstku.data.jht.model.response.JhtClaimReasonResponse;
import com.bpjstku.data.jht.model.response.JhtClaimSignaturedItem;
import com.bpjstku.data.jht.model.response.JhtClaimTrackItem;
import com.bpjstku.data.jht.model.response.ListClaimSegmenItem;
import com.bpjstku.data.jht.model.response.ReasonNotReactive;
import com.bpjstku.data.jht.model.response.TahapKlaim;
import com.bpjstku.data.jht.model.response.TitleKlaim;
import com.bpjstku.data.lib.OtherPreferences;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.jht.model.BenefitDetail;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.domain.jht.model.ClaimStep;
import com.bpjstku.domain.jht.model.ClaimTitle;
import com.bpjstku.domain.jht.model.JhtBalance;
import com.bpjstku.domain.jht.model.JhtClaimEligibility;
import com.bpjstku.domain.jht.model.JhtClaimTrack;
import com.bpjstku.domain.jht.model.JhtEligibility;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.util.enums.TrackingStatusEnum;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class addOnPictureInPictureModeChangedListener implements removeOnPictureInPictureUiStateChangedListener {
    private final registerlambda1 TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final OtherPreferences TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final PreferenceManager TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final JhtRepository b;

    public addOnPictureInPictureModeChangedListener(JhtRepository jhtRepository, registerlambda1 registerlambda1Var, PreferenceManager preferenceManager, OtherPreferences otherPreferences) {
        Intrinsics.checkNotNullParameter(jhtRepository, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        Intrinsics.checkNotNullParameter(otherPreferences, "");
        this.b = jhtRepository;
        this.TuitionPaymentFragmentbindingInflater1 = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = preferenceManager;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = otherPreferences;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<List<JhtBalance>> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        String str;
        User userAsBinder = this.TuitionPaymentFragmentbindingInflater1.asBinder();
        if (userAsBinder == null || (str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
            return null;
        }
        deriveCodec<List<JhtBalanceItem>> jhtBalance = this.b.getJhtBalance(new JhtBalanceRequest(str, false, 2, null));
        final Function1 function1 = new Function1() { // from class: getLifecycle
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onConfigurationChanged
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        return new Api23Impl(jhtBalance, readablems);
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<List<JhtBalance>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(JhtBalanceRequest jhtBalanceRequest) {
        Intrinsics.checkNotNullParameter(jhtBalanceRequest, "");
        deriveCodec<List<JhtBalanceItem>> jhtBalance = this.b.getJhtBalance(jhtBalanceRequest);
        final Function1 function1 = new Function1() { // from class: removeOnPictureInPictureModeChangedListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: removeOnNewIntentListener
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.INotificationSideChannelStubProxy(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(jhtBalance, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault1(GetRsJhtRequest getRsJhtRequest) {
        Intrinsics.checkNotNullParameter(getRsJhtRequest, "");
        deriveCodec<ResponseBody> rsJht = this.b.getRsJht(getRsJhtRequest);
        final Function1 function1 = new Function1() { // from class: invalidateMenu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((ResponseBody) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onCreatePanelMenu
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.INotificationSideChannelDefault(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(rsJht, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(SendRsJhtRequest sendRsJhtRequest) {
        Intrinsics.checkNotNullParameter(sendRsJhtRequest, "");
        deriveCodec<BaseItem> derivecodecSendRsJht = this.b.sendRsJht(sendRsJhtRequest);
        final Function1 function1 = new Function1() { // from class: reportFullyDrawn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentbindingInflater1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: addOnMultiWindowModeChangedListener
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.cancelAll(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecSendRsJht, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<ComponentActivityExternalSyntheticLambda10> TuitionPaymentFragmentspecialinlinedviewModeldefault1(GenerateClaimCodeRequest generateClaimCodeRequest) {
        Intrinsics.checkNotNullParameter(generateClaimCodeRequest, "");
        deriveCodec<GenerateClaimCodeResponse> generateClaimCode = this.b.getGenerateClaimCode(generateClaimCodeRequest);
        final Function1 function1 = new Function1() { // from class: onUserLeaveHint
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentbindingInflater1((GenerateClaimCodeResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: removeMenuProvider
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.INotificationSideChannelStub(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(generateClaimCode, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<List<setPictureInPictureParams>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimReasonRequest claimReasonRequest) {
        Intrinsics.checkNotNullParameter(claimReasonRequest, "");
        deriveCodec<JhtClaimReasonResponse> claimReason = this.b.getClaimReason(claimReasonRequest);
        final Function1 function1 = new Function1() { // from class: onMultiWindowModeChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.b((JhtClaimReasonResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onPanelClosed
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.RemoteActionCompatParcelizer(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(claimReason, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CheckPhotoAdminDukRequest checkPhotoAdminDukRequest) {
        Intrinsics.checkNotNullParameter(checkPhotoAdminDukRequest, "");
        deriveCodec<JhtClaimCheckPhotoResponse> derivecodecCheckPhotoAdminDuk = this.b.checkPhotoAdminDuk(checkPhotoAdminDukRequest);
        final Function1 function1 = new Function1() { // from class: addOnTrimMemoryListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((JhtClaimCheckPhotoResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: addOnUserLeaveHintListener
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckPhotoAdminDuk, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<ClaimEvidenceJhtResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimEvidenceJhtRequest claimEvidenceJhtRequest) {
        Intrinsics.checkNotNullParameter(claimEvidenceJhtRequest, "");
        deriveCodec<ClaimEvidenceJhtResponse> derivecodecCheckClaimEvidenceJht = this.b.checkClaimEvidenceJht(claimEvidenceJhtRequest);
        final Function1 function1 = new Function1() { // from class: onPictureInPictureModeChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.b((ClaimEvidenceJhtResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onRetainNonConfigurationInstance
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.asInterface(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckClaimEvidenceJht, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<JhtEligibility> TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckBankAccountRequest checkBankAccountRequest) {
        Intrinsics.checkNotNullParameter(checkBankAccountRequest, "");
        deriveCodec<JhtClaimSignaturedItem> derivecodecCheckBankAccount = this.b.checkBankAccount(checkBankAccountRequest);
        final Function1 function1 = new Function1() { // from class: onMenuItemSelected
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1((JhtClaimSignaturedItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onNewIntent
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.onTransact(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckBankAccount, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<JhtClaimTrack> TuitionPaymentFragmentspecialinlinedviewModeldefault3(JhtClaimTrackRequest jhtClaimTrackRequest) {
        Intrinsics.checkNotNullParameter(jhtClaimTrackRequest, "");
        deriveCodec<JhtClaimTrackItem> derivecodecPostTrackClaim = this.b.postTrackClaim(jhtClaimTrackRequest);
        final Function1 function1 = new Function1() { // from class: onRetainCustomNonConfigurationInstance
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1((JhtClaimTrackItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: registerForActivityResult
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.d(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostTrackClaim, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<BenefitDetail> TuitionPaymentFragmentspecialinlinedviewModeldefault2(JhtBenefitDetailRequest jhtBenefitDetailRequest) {
        Intrinsics.checkNotNullParameter(jhtBenefitDetailRequest, "");
        deriveCodec<JhtBenefitDetailItem> benefitDetail = this.b.getBenefitDetail(jhtBenefitDetailRequest);
        final Function1 function1 = new Function1() { // from class: removeOnMultiWindowModeChangedListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((JhtBenefitDetailItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: removeOnConfigurationChangedListener
            private static final byte[] $$c = {29, -5, -24, -13};
            private static final int $$f = 101;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {53, -70, 9, -72, -14, 0, Base64.padSymbol, -53, -17, -2, -5, 11, -8, -15, 18, -15, 66, -61, -7, -8, 13, -15, 2, 11, -13, 60, -21, -7, -36, 53, -66, 28, 13, -9, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 65};
            private static final int $$e = 244;
            private static final byte[] $$a = {107, 48, 57, 107, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
            private static final int $$b = 147;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int b = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = -2017562576253018L;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 + 84
                    int r6 = r6 * 52
                    int r6 = r6 + 1
                    int r7 = r7 + 4
                    byte[] r0 = defpackage.removeOnConfigurationChangedListener.$$a
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L2c
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r8
                    int r7 = r7 + 1
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    r4 = r0[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r7 = -r7
                    int r3 = r3 + r7
                    int r7 = r3 + (-11)
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.removeOnConfigurationChangedListener.a(byte, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 22
                    int r0 = r7 + 31
                    byte[] r1 = defpackage.removeOnConfigurationChangedListener.$$d
                    int r6 = r6 * 30
                    int r6 = 34 - r6
                    int r8 = r8 * 15
                    int r8 = 99 - r8
                    byte[] r0 = new byte[r0]
                    int r7 = r7 + 30
                    r2 = 0
                    if (r1 != 0) goto L19
                    r8 = r6
                    r4 = r7
                    r3 = r2
                    goto L2e
                L19:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L1d:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r7) goto L2a
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L2a:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                L2e:
                    int r4 = -r4
                    int r6 = r6 + r4
                    int r8 = r8 + 1
                    int r6 = r6 + (-2)
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.removeOnConfigurationChangedListener.d(int, int, short, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                int i3 = $10 + 89;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (abortcapture.b < cArrB.length) {
                    int i5 = $11 + 45;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i7 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "") + 64838), Color.alpha(0) + 1356, 38 - (KeyEvent.getMaxKeyCode() >> 16), 894276454, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getTrimmedLength("") + 47773), 468 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            }

            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                    int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    byte b3 = (byte) (-bArr[5]);
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, (byte) (b3 & 14), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, scrollBarFadeDuration, minimumFlingVelocity, 252381699, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{65105, 47084, 4542, 11543, 65072, 53826, 55898, 7205, 26942, 19269, 29530, 58745, 53310, 9311, 59408, 29188, 15144, 40287, 33098, 56114, 41532, 30319, 13906, 41016, 3378, 61255}, View.getDefaultSize(0, 0), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{19895, 41641, 37427, 28908, 19922, 50949, 22994, 16860, 56004, 24076, 61655, 47358, 25554, 12552, 27615, 12248, 35038, 34820, 726}, TextUtils.indexOf("", "", 0, 0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int i2 = 876 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iArgb = Color.argb(0, 0, 0, 0) + 10;
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b4, (byte) (-b4), bArr2[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i2, iArgb, 2009631821, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int trimmedLength = 876 - TextUtils.getTrimmedLength("");
                        int size = View.MeasureSpec.getSize(0) + 10;
                        byte[] bArr3 = $$a;
                        byte b5 = bArr3[7];
                        byte b6 = bArr3[10];
                        Object[] objArr6 = new Object[1];
                        a(b5, (byte) (b5 | 51), b6, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, trimmedLength, size, 256017550, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i3 = ~iIdentityHashCode;
                    int i4 = (((1854270488 + (((~(409762130 | i3)) | 450072359) * (-90))) + (((~(409762130 | iIdentityHashCode)) | 2912336) * (-45))) + ((((~(iIdentityHashCode | (-450072360))) | 409762130) | (~(i3 | 450072359))) * 45)) - 142023462;
                    int i5 = (i4 << 13) ^ i4;
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{35972, 25880, 43886, 49655, 36069, Typography.paragraph, 24714, 61637, 7147, 39345, 51594, 2457, 41701, 63144, 21150, 40601, 18885, 20411, 15258, 14302, 53490, 42161, 35994, 19662, 32720, 15792, 5532, 58834, 1765, 35516}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{29989, 32956, 29643, 63856, 30022, 58633, 47161, 51266, 57920, 31762, 4415, 12657, 23381, 4876, 35367, 42585, 45126, 43549, 58175, 3929, 10570, 16658}, 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                        b = i7 % 128;
                        int i8 = i7 % 2;
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{2725, 15060, 48571, 30234, 2767, 24437, 30285, 18235, 40331, 50808, 57178, 48692, 9410, 43322, 17512, 10531, 53206, 4192, 11614, 32823}, (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{14761, 262, 54054, 29327, 14784, 25762, 6339, 17313, 44765, 64943, 45522, 47798, 6113, 37543, 10965, 11687, 64746, 11177, 17346, 33962}, View.getDefaultSize(0, 0), objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -142023462};
                        byte[] bArr4 = $$d;
                        byte b7 = bArr4[56];
                        byte b8 = bArr4[5];
                        Object[] objArr13 = new Object[1];
                        d(b7, b8, b8, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b9 = bArr4[5];
                        byte b10 = bArr4[56];
                        Object[] objArr14 = new Object[1];
                        d(b9, b10, b10, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            int i9 = b + 109;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                            int i10 = i9 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "");
                                int packedPositionType = 876 - ExpandableListView.getPackedPositionType(0L);
                                int iMyPid = (Process.myPid() >> 22) + 10;
                                byte[] bArr5 = $$a;
                                byte b11 = bArr5[7];
                                Object[] objArr15 = new Object[1];
                                a(b11, (byte) (b11 | 51), bArr5[10], objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, packedPositionType, iMyPid, 256017550, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr16 = new Object[1];
                                c(new char[]{65105, 47084, 4542, 11543, 65072, 53826, 55898, 7205, 26942, 19269, 29530, 58745, 53310, 9311, 59408, 29188, 15144, 40287, 33098, 56114, 41532, 30319, 13906, 41016, 3378, 61255}, View.getDefaultSize(0, 0), objArr16);
                                Class<?> cls5 = Class.forName((String) objArr16[0]);
                                Object[] objArr17 = new Object[1];
                                c(new char[]{19895, 41641, 37427, 28908, 19922, 50949, 22994, 16860, 56004, 24076, 61655, 47358, 25554, 12552, 27615, 12248, 35038, 34820, 726}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr17);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
                                    int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                                    byte[] bArr6 = $$a;
                                    byte b12 = bArr6[5];
                                    Object[] objArr18 = new Object[1];
                                    a(b12, (byte) (-b12), bArr6[7], objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, iIndexOf, i11, 2009631821, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                                    int i12 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                                    int iIndexOf2 = 10 - TextUtils.indexOf("", "");
                                    byte[] bArr7 = $$a;
                                    byte b13 = bArr7[7];
                                    byte b14 = (byte) (-bArr7[5]);
                                    Object[] objArr19 = new Object[1];
                                    a(b13, b14, (byte) (b14 & 14), objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, i12, iIndexOf2, 252381699, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
                    throw null;
                }
                int i13 = ((int[]) objArr[1])[0];
                Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i14 = i13 + 1181881492 + (((~((-44570625) | (~iElapsedRealtime))) | (~((-4260396) | iElapsedRealtime))) * (-272)) + (((~((-582809985) | iElapsedRealtime)) | 538239360) * (-272)) + (((~(iElapsedRealtime | 582809984)) | (-542499756)) * 272);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr20[1])[0] = i16 ^ (i16 << 5);
                return addOnPictureInPictureModeChangedListener.connect(function1, obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, short r7, byte r8) {
                /*
                    int r7 = r7 * 2
                    int r0 = 1 - r7
                    byte[] r1 = defpackage.removeOnConfigurationChangedListener.$$c
                    int r6 = r6 * 2
                    int r6 = r6 + 107
                    int r8 = r8 + 4
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r1 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L2c
                L16:
                    r3 = r2
                L17:
                    int r8 = r8 + 1
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r7) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L24:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2c:
                    int r8 = -r8
                    int r6 = r6 + r8
                    r8 = r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.removeOnConfigurationChangedListener.$$g(byte, short, byte):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(benefitDetail, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(JhtInstantClaimRequest jhtInstantClaimRequest) {
        Intrinsics.checkNotNullParameter(jhtInstantClaimRequest, "");
        deriveCodec<BaseItem> derivecodecPostJhtInstantClaim = this.b.postJhtInstantClaim(jhtInstantClaimRequest);
        final Function1 function1 = new Function1() { // from class: addOnPictureInPictureUiStateChangedListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: addOnContextAvailableListener
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostJhtInstantClaim, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<JhtClaimEligibility> TuitionPaymentFragmentbindingInflater1(ClaimCheckEligibilityRequest claimCheckEligibilityRequest) {
        Intrinsics.checkNotNullParameter(claimCheckEligibilityRequest, "");
        String email = claimCheckEligibilityRequest.getEmail();
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        deriveCodec<JhtClaimEligibilityResponse> derivecodecCheckEligibilityClaim = this.b.checkEligibilityClaim(new ClaimCheckEligibilityRequest(email, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimCheckEligibilityRequest.getFlgBlock()), claimCheckEligibilityRequest.getClaimSegmen()));
        final Function1 function1 = new Function1() { // from class: getDefaultViewModelProviderFactory
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1((JhtClaimEligibilityResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getFullyDrawnReporter
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.INotificationSideChannel(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckEligibilityClaim, readablems);
        final Function1 function2 = new Function1() { // from class: getLastCustomNonConfigurationInstance
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (JhtClaimEligibility) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getNavigationEventDispatcher
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

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<JhtClaimEmployeeDataItem> b(ClaimEmployeeDataRequest claimEmployeeDataRequest) {
        Intrinsics.checkNotNullParameter(claimEmployeeDataRequest, "");
        deriveCodec<JhtClaimEmployeeDataItem> employeeDataClaim = this.b.getEmployeeDataClaim(claimEmployeeDataRequest);
        final Function1 function1 = new Function1() { // from class: getSavedStateRegistry
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (JhtClaimEmployeeDataItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getViewModelStore
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(employeeDataClaim, logtostring);
        final Function1 function2 = new Function1() { // from class: onBackPressed
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1((JhtClaimEmployeeDataItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onActivityResult
            private static final byte[] $$c = {57, -56, 23, -36};
            private static final int $$f = 158;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {68, 104, -93, -37, 20, 6, -55, 65, 16, 8, 0, 13, 1, -47, 64, 11, 17, -5, 5, 7, 26, -6, -47, Base64.padSymbol, 23, -9, 26, -3, 12, 21, 3, -3, 2, 24, -61, 67, 13, 14, -7, 21, 4, -5, 19, -54, 71, 10, -3, 9, 15, -54, 27, 60, 7, 3, -17, 19, 19, 17, -8, 2, -20, 55, -9, 26, -3, 12, 21, 3, -3, 2, 24, -25, 27, 19, 7, 11, 10, -13, -4, 26, 22, 8, -2, 14, 7, -7, -18, 57, -9, 17, 14, -13, -5, 37, 5, 8, 11, 14, 7, -43, 58, 8, -2, 6, 15, 7, 0, 17, 14, -72, 21};
            private static final int $$e = 210;
            private static final byte[] $$a = {51, -99, -8, -59, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 43;
            private static int b = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = -5739657130574816103L;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 15
                    int r7 = 53 - r7
                    byte[] r0 = defpackage.onActivityResult.$$a
                    int r6 = r6 * 52
                    int r6 = r6 + 4
                    int r8 = r8 * 2
                    int r8 = 84 - r8
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r8 = r6
                    r3 = r7
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    r4 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2e:
                    int r3 = r3 + r6
                    int r6 = r3 + (-11)
                    int r8 = r8 + 1
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onActivityResult.a(int, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 + 98
                    int r6 = r6 + 4
                    byte[] r0 = defpackage.onActivityResult.$$d
                    int r7 = r7 * 107
                    int r1 = 108 - r7
                    byte[] r1 = new byte[r1]
                    int r7 = 107 - r7
                    r2 = 0
                    if (r0 != 0) goto L15
                    r8 = r6
                    r4 = r7
                    r3 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    int r6 = r6 + 1
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L2c:
                    int r6 = r6 + r4
                    int r6 = r6 + (-8)
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onActivityResult.d(short, int, byte, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                while (abortcapture.b < cArrB.length) {
                    int i3 = $10 + 49;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 64838), 1356 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 38 - TextUtils.indexOf("", "", 0, 0), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 468, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                int i6 = $11 + 121;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                b = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int iResolveOpacity = 2267 - Drawable.resolveOpacity(0, 0);
                    int i4 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33;
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iResolveOpacity, i4, -887667012, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{7003, 32349, 15199, 39308, 6970, 18636, 22213, 15619, 49352, 27855, 29377, 6491, 44236, 37081, 7815, 50474, 35030, 46301, 15065, 41240, 29894, 55537, 59101, 36110, 20692, 64733}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{31835, 5279, 40536, 49759, 31806, 8716, 62407, 26322, 42964, 1537, 55238, 17140, 52166, 64009, 48066, 40670, 61382, 56833, 40911}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2267;
                    int doubleTapTimeout = 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr = $$a;
                    byte b4 = bArr[132];
                    byte b5 = bArr[7];
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, b5, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, absoluteGravity, doubleTapTimeout, -874156483, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2268;
                        int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0');
                        byte[] bArr2 = $$a;
                        Object[] objArr6 = new Object[1];
                        a(bArr2[37], bArr2[132], bArr2[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, i7, iLastIndexOf, -654680577, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i8 = ((int[]) objArr7[0])[0];
                    int i9 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[1];
                    int i10 = ~((int) Process.getStartUptimeMillis());
                    int i11 = (((-1808169946) + (((~((-319343197) | i10)) | (-489370120)) * (-983))) + (((~(i10 | (-489370120))) | 203632643) * 983)) - 1192072020;
                    int i12 = (i11 << 13) ^ i11;
                    int i13 = i12 ^ (i12 >>> 17);
                    ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{398, 53041, 41005, 30255, 495, 63904, 52663, 53920, 55837, 56739, 59827, 63224, 46615, 8630, 34219, 10996, 37435, 1441, 41387, 20151, 28168, 27063, 32183, 25275, 18998, 19890, 6581, 34467, 9735, 37298}, ((Process.getThreadPriority(0) + 20) >> 6) + 1, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{52846, 32626, 19610, 8732, 52749, 18936, 8470, 34451, 5623, 28135, 1300, 41636, 31206, 37365, 26880, 32384, 24057, 46560, 19740, 6788, 41457, 55795}, Gravity.getAbsoluteGravity(0, 0) + 1, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (!(!(applicationContext instanceof ContextWrapper)) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                            int i16 = b + 35;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                            int i17 = i16 % 2;
                            applicationContext = null;
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{59371, 12759, 13932, 26098, 59265, 1865, 23524, 49518, 15417, 9024, 32759, 58725, 20596, 57102, 5065, 14718, 29804, 64336, 14331, 23918}, 1 - View.MeasureSpec.getSize(0), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{28662, 21156, 61357, 17466, 28575, 25663, 33334, 57513, 46206, 16438, 42531, 50362, 55366, 48178, 51752, 6311, 64577, 38968, 60987, 31918}, 1 - Color.green(0), objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1192072020};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[12];
                        Object[] objArr13 = new Object[1];
                        d((byte) (-b6), bArr3[10], b6, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        Object[] objArr14 = new Object[1];
                        d((byte) 106, bArr3[12], bArr3[10], objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            int i18 = b + 27;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                            int i19 = i18 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                int i20 = 2268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int offsetAfter = 33 - TextUtils.getOffsetAfter("", 0);
                                byte[] bArr4 = $$a;
                                Object[] objArr16 = new Object[1];
                                a(bArr4[37], bArr4[132], bArr4[7], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, i20, offsetAfter, -654680577, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(new char[]{7003, 32349, 15199, 39308, 6970, 18636, 22213, 15619, 49352, 27855, 29377, 6491, 44236, 37081, 7815, 50474, 35030, 46301, 15065, 41240, 29894, 55537, 59101, 36110, 20692, 64733}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(new char[]{31835, 5279, 40536, 49759, 31806, 8716, 62407, 26322, 42964, 1537, 55238, 17140, 52166, 64009, 48066, 40670, 61382, 56833, 40911}, 1 - TextUtils.getOffsetAfter("", 0), objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 2268;
                                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 33;
                                    byte[] bArr5 = $$a;
                                    byte b7 = bArr5[132];
                                    byte b8 = bArr5[7];
                                    Object[] objArr19 = new Object[1];
                                    a(b7, b8, b8, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout2, iIndexOf, iKeyCodeFromString, -874156483, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2267;
                                    int i21 = 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    byte b9 = $$a[7];
                                    byte b10 = b9;
                                    Object[] objArr20 = new Object[1];
                                    a(b9, b10, b10, objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, threadPriority, i21, -887667012, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
                if (((int[]) objArr[0])[0] != ((int[]) objArr[3])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) objArr[1];
                    if (strArr2 == null) {
                        throw null;
                    }
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                    throw null;
                }
                Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i22 = ((int[]) objArr[2])[0];
                int i23 = ((int[]) objArr[0])[0];
                int i24 = ((int[]) objArr[3])[0];
                String[] strArr3 = (String[]) objArr[1];
                int i25 = (int) Runtime.getRuntime().totalMemory();
                int i26 = ~i25;
                int i27 = 21155039 + (((~((-825627049) | i26)) | 808714408 | (~(16913732 | i26)) | (~((-1093) | i25))) * (-84));
                int i28 = (~(i25 | 16913732)) | 825627048;
                int i29 = ~(i26 | (-16913733));
                int i30 = i22 + i27 + ((i28 | i29) * (-84)) + ((i29 | 1092) * 84);
                int i31 = (i30 << 13) ^ i30;
                int i32 = i31 ^ (i31 >>> 17);
                ((int[]) objArr21[2])[0] = i32 ^ (i32 << 5);
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function2, obj);
            }

            private static String $$g(int i, byte b2, short s) {
                int i2 = (s * 2) + 107;
                int i3 = i * 3;
                byte[] bArr = $$c;
                int i4 = (b2 * 4) + 4;
                byte[] bArr2 = new byte[1 - i3];
                int i5 = 0 - i3;
                int i6 = -1;
                if (bArr == null) {
                    i2 = i4 + (-i2);
                    i4++;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i5) {
                        return new String(bArr2, 0);
                    }
                    int i7 = i2;
                    int i8 = i4 + 1;
                    i2 = i7 + (-bArr[i4]);
                    i4 = i8;
                }
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(currentsystemtimens, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<List<startActivityForResult>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(JhtClaimContributionRequest jhtClaimContributionRequest) {
        Intrinsics.checkNotNullParameter(jhtClaimContributionRequest, "");
        deriveCodec<JhtClaimContributionResponse> jhtClaimContributionDetail = this.b.getJhtClaimContributionDetail(jhtClaimContributionRequest);
        final Function1 function1 = new Function1() { // from class: removeOnContextAvailableListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1((JhtClaimContributionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: removeOnTrimMemoryListener
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.IconCompatParcelizer(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(jhtClaimContributionDetail, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<ClaimLivenessResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimLivenessFaceMatchCheckRequest claimLivenessFaceMatchCheckRequest) {
        Intrinsics.checkNotNullParameter(claimLivenessFaceMatchCheckRequest, "");
        String email = claimLivenessFaceMatchCheckRequest.getEmail();
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String signature = claimLivenessFaceMatchCheckRequest.getSignature();
        Intrinsics.checkNotNull(signature);
        deriveCodec<ClaimLivenessResponse> derivecodecClaimLivenessFaceMatchCheck = this.b.claimLivenessFaceMatchCheck(new ClaimLivenessFaceMatchCheckRequest(email, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion, signature, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)));
        final Function1 function1 = new Function1() { // from class: addOnNewIntentListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentbindingInflater1((ClaimLivenessResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getDefaultViewModelCreationExtras
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.getInterfaceDescriptor(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecClaimLivenessFaceMatchCheck, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<ClaimLivenessResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimLivenessFaceMatchRequest claimLivenessFaceMatchRequest) {
        Intrinsics.checkNotNullParameter(claimLivenessFaceMatchRequest, "");
        String email = claimLivenessFaceMatchRequest.getEmail();
        String flData = claimLivenessFaceMatchRequest.getFlData();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = flData != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, flData, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : null;
        String brand = claimLivenessFaceMatchRequest.getBrand();
        String deviceId = claimLivenessFaceMatchRequest.getDeviceId();
        String model = claimLivenessFaceMatchRequest.getModel();
        String sdk = claimLivenessFaceMatchRequest.getSdk();
        String manufacture = claimLivenessFaceMatchRequest.getManufacture();
        String file = claimLivenessFaceMatchRequest.getFile();
        String signature = claimLivenessFaceMatchRequest.getSignature();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = signature != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, signature, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : null;
        String transactionIdSdk = claimLivenessFaceMatchRequest.getTransactionIdSdk();
        String scoreLiveness = claimLivenessFaceMatchRequest.getScoreLiveness();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = scoreLiveness != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scoreLiveness, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : null;
        String scoreManipulation = claimLivenessFaceMatchRequest.getScoreManipulation();
        deriveCodec<ClaimLivenessResponse> derivecodecClaimLivenessFaceMatch = this.b.claimLivenessFaceMatch(new ClaimLivenessFaceMatchRequest(email, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, brand, deviceId, model, sdk, manufacture, file, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, transactionIdSdk, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, scoreManipulation != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scoreManipulation, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : null, claimLivenessFaceMatchRequest.getLongitude(), claimLivenessFaceMatchRequest.getLatitude(), claimLivenessFaceMatchRequest.getLocality()));
        final Function1 function1 = new Function1() { // from class: getActivityResultRegistry
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ClaimLivenessResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: enterPictureInPictureMode
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.notify(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecClaimLivenessFaceMatch, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final JhtClaimEligibility TuitionPaymentFragmentbindingInflater1() {
        return (JhtClaimEligibility) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getObject("CLAIM_SIGNATURE", JhtClaimEligibility.class);
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<List<ClaimSegmenItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimSegmenRequest claimSegmenRequest) {
        Intrinsics.checkNotNullParameter(claimSegmenRequest, "");
        deriveCodec<List<ListClaimSegmenItem>> claimSegment = this.b.getClaimSegment(claimSegmenRequest);
        final Function1 function1 = new Function1() { // from class: onSaveInstanceState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onPreparePanel
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(claimSegment, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(setContentView setcontentview) {
        Intrinsics.checkNotNullParameter(setcontentview, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.saveObject("CLAIM_STATUS", setcontentview);
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final setContentView TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        setContentView setcontentview = (setContentView) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getObject("CLAIM_STATUS", setContentView.class);
        return setcontentview == null ? new setContentView(null, null, 3, null) : setcontentview;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<ClaimReactivationBpuTuitionResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimReactivationBpuTuitionRequest claimReactivationBpuTuitionRequest) {
        Intrinsics.checkNotNullParameter(claimReactivationBpuTuitionRequest, "");
        deriveCodec<ClaimReactivationBpuTuitionResponse> claimReactivationBpuTuition = this.b.getClaimReactivationBpuTuition(claimReactivationBpuTuitionRequest);
        final Function1 function1 = new Function1() { // from class: onPictureInPictureUiStateChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((ClaimReactivationBpuTuitionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onRequestPermissionsResult
            private static final byte[] $$a = {73, 55, 58, 33};
            private static final int $$b = 66;
            private static int $10 = 0;
            private static int $11 = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f1305a = 0;
            private static int g = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47238, 47291, 47244, 47240, 47323, 47269, 47319, 47322, 47264, 47209, 47237, 47268, 47271, 47316, 47266, 47261, 47290, 47284, 47286, 47317, 47289, 47272, 47270, 47326, 47292, 47259, 47321, 47324, 47232, 47267, 47318, 47327, 47315, 47312, 47281, 47252, 47257, 47248, 47325};
            private static int TuitionPaymentFragmentbindingInflater1 = 2047719497;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            private static boolean b = true;
            private static int[] asBinder = {1250538200, 183806122, -1239811993, -1480388660, -1184670014, 890725603, 1658243730, 415222917, 33963772, 844938281, -1866213037, 1628236805, 2011888798, -1265065503, 1115361488, 816379160, 1572554906, 946577820};

            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                int i = 2 % 2;
                int i2 = f1305a + 61;
                g = i2 % 128;
                int i3 = i2 % 2;
                ClaimReactivationBpuTuitionResponse claimReactivationBpuTuitionResponseWrite = addOnPictureInPictureModeChangedListener.write(function1, obj);
                int i4 = f1305a + 109;
                g = i4 % 128;
                int i5 = i4 % 2;
                return claimReactivationBpuTuitionResponseWrite;
            }

            private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = asBinder;
                int i3 = -1870535734;
                int i4 = 1;
                int i5 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), View.getDefaultSize(0, 0) + 3291, (ViewConfiguration.getJumpTapTimeout() >> 16) + 31, 1948206109, false, $$c(b2, b3, (byte) (b3 & 56)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i6++;
                            i3 = -1870535734;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = asBinder;
                if (iArr5 != null) {
                    int i7 = $11 + 71;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i9 = 0;
                    while (i9 < length3) {
                        int i10 = $11 + 67;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr3 = new Object[i4];
                        objArr3[i5] = Integer.valueOf(iArr5[i9]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3290;
                            int iResolveOpacity = 31 - Drawable.resolveOpacity(i5, i5);
                            byte b4 = (byte) i5;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, i12, iResolveOpacity, 1948206109, false, $$c(b4, b5, (byte) (b5 & 56)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i9++;
                        i4 = 1;
                        i5 = 0;
                    }
                    iArr5 = iArr6;
                }
                int i13 = i5;
                System.arraycopy(iArr5, i13, iArr4, i13, length2);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    int i14 = $10 + 123;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i16 = 17;
                    while (i16 > 1) {
                        int i17 = $11 + 95;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                            Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.getDefaultSize(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 2559, 29 - View.resolveSizeAndState(0, 0, 0), 683220507, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i16 += 22;
                        } else {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = (byte) (b8 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) + 2560, 29 - View.MeasureSpec.getMode(0), 683220507, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                            i16--;
                        }
                    }
                    int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr6 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - Color.green(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 348, 24 - TextUtils.indexOf((CharSequence) "", '0', 0), -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                long j = 0;
                char c = '0';
                int i3 = 0;
                if (cArr2 != null) {
                    int i4 = $10 + 5;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i3] = Integer.valueOf(cArr2[i6]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(j) + 31339);
                                int offsetBefore = 2994 - TextUtils.getOffsetBefore("", i3);
                                int iIndexOf = 16 - TextUtils.indexOf("", c, i3);
                                byte b2 = (byte) i3;
                                byte b3 = (byte) (b2 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, offsetBefore, iIndexOf, 1182129903, false, $$c(b2, b3, (byte) (b3 & 54)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i6++;
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
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - View.combineMeasuredStates(0, 0)), 252 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                int i7 = 1687675375;
                if (b) {
                    int i8 = $10 + 51;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - (ViewConfiguration.getPressedStateDuration() >> 16)), 3085 - ExpandableListView.getPackedPositionGroup(0L), 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -2146875848, false, $$c(b4, (byte) (b4 - 1), $$a[1]), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                int i10 = 0;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i11 = $11 + 75;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] + iIntValue);
                            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33601 - TextUtils.lastIndexOf("", '0')), 3085 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 26 - KeyEvent.getDeadChar(0, 0), -2146875848, false, $$c(b5, (byte) (b5 - 1), $$a[1]), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        } else {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b6 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33601 - TextUtils.indexOf((CharSequence) "", '0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3084, 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -2146875848, false, $$c(b6, (byte) (b6 - 1), $$a[1]), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                            i7 = 1687675375;
                        }
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        i10 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v108, types: [byte[]] */
            /* JADX WARN: Type inference failed for: r3v121, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r3v191, types: [int] */
            /* JADX WARN: Type inference failed for: r3v207 */
            /* JADX WARN: Type inference failed for: r3v208 */
            /* JADX WARN: Type inference failed for: r3v209 */
            /* JADX WARN: Type inference failed for: r3v210 */
            /* JADX WARN: Type inference failed for: r3v211 */
            /* JADX WARN: Type inference failed for: r3v212 */
            /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r3v36 */
            /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v93 */
            /* JADX WARN: Type inference failed for: r3v94 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r25, int r26, int r27) {
                /*
                    Method dump skipped, instruction units count: 3382
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onRequestPermissionsResult.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(byte r7, int r8, int r9) {
                /*
                    byte[] r0 = defpackage.onRequestPermissionsResult.$$a
                    int r8 = r8 + 4
                    int r9 = 122 - r9
                    int r7 = r7 * 2
                    int r7 = 1 - r7
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r7
                    r9 = r8
                    r4 = r2
                    goto L28
                L13:
                    r3 = r2
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L17:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    int r9 = r9 + 1
                    if (r4 != r7) goto L26
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L26:
                    r3 = r0[r9]
                L28:
                    int r8 = r8 + r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onRequestPermissionsResult.$$c(byte, int, int):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(claimReactivationBpuTuition, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<ClaimCheckBankBpuReactivationResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimCheckBankBpuReactivationRequest claimCheckBankBpuReactivationRequest) {
        Intrinsics.checkNotNullParameter(claimCheckBankBpuReactivationRequest, "");
        deriveCodec<ClaimCheckBankBpuReactivationResponse> derivecodecClaimCheckBankBpuReactivation = this.b.claimCheckBankBpuReactivation(claimCheckBankBpuReactivationRequest);
        final Function1 function1 = new Function1() { // from class: onTrimMemory
            private static final byte[] $$c = {0, -94, -62, -97};
            private static final int $$f = 95;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {114, -59, 10, 31, -29, -11, 9, -12, 18, 48, -16, -43, 2, 9, -2, 3, 35, -50, 5, 16, -12, 5, 14, -10, 26, -37, 12, -5, 13, 4, -14, 12, 7, 24, -20, -11, 12, -1, 4, 50};
            private static final int $$e = 253;
            private static final byte[] $$a = {108, -26, -110, 50, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
            private static final int $$b = 12;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 6597566300565604000L;
            private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
            private static char b = 34097;

            private static void a(int i, byte b2, short s, Object[] objArr) {
                byte[] bArr = $$a;
                int i2 = 84 - (i * 2);
                int i3 = 92 - b2;
                int i4 = s * 15;
                byte[] bArr2 = new byte[53 - i4];
                int i5 = 52 - i4;
                int i6 = -1;
                if (bArr == null) {
                    i2 = (i2 + (-i5)) - 11;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i2;
                    i3++;
                    if (i6 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i2 = (i2 + (-bArr[i3])) - 11;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r7, short r8, int r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 36
                    int r8 = r8 + 4
                    byte[] r0 = defpackage.onTrimMemory.$$d
                    int r9 = r9 * 31
                    int r9 = r9 + 67
                    int r7 = r7 * 36
                    int r7 = r7 + 1
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r9 = r8
                    r5 = r2
                    goto L2d
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r9
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L27
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
                    int r8 = -r8
                    int r3 = r3 + r8
                    int r8 = r3 + 1
                    int r9 = r9 + 1
                    r3 = r5
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onTrimMemory.d(int, short, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                int i5 = 0;
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                int i6 = $10 + 93;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i8 = $10 + 63;
                    $11 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char offsetAfter = (char) (TextUtils.getOffsetAfter("", i5) + 8328);
                            int threadPriority = ((Process.getThreadPriority(i5) + 20) >> 6) + 1235;
                            int i10 = (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35;
                            byte b2 = $$c[i5];
                            byte b3 = b2;
                            String str$$g = $$g(b3, (byte) (b3 - 1), b2);
                            Class[] clsArr = new Class[1];
                            clsArr[i5] = Object.class;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, threadPriority, i10, -653973969, false, str$$g, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                            int scrollBarSize = 2764 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int i11 = 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            byte b4 = $$c[i5];
                            byte b5 = (byte) (b4 - 1);
                            String str$$g2 = $$g(b4, b5, (byte) (b5 + 3));
                            Class[] clsArr2 = new Class[1];
                            clsArr2[i5] = Object.class;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, scrollBarSize, i11, 1504416861, false, str$$g2, clsArr2);
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        int i12 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i12);
                        objArr4[i5] = sessionProcessor;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char scrollBarSize2 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43325);
                            int edgeSlop = 253 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int maximumFlingVelocity = 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            Class[] clsArr3 = new Class[3];
                            clsArr3[i5] = Object.class;
                            clsArr3[1] = Integer.TYPE;
                            clsArr3[2] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize2, edgeSlop, maximumFlingVelocity, -721491957, false, "j", clsArr3);
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i13 = cArr4[iIntValue2] * 32718;
                        Object[] objArr5 = new Object[2];
                        objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                        objArr5[i5] = Integer.valueOf(i13);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) (65200 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2891;
                            int iGreen = 17 - Color.green(i5);
                            byte b6 = $$c[i5];
                            byte b7 = (byte) (b6 - 1);
                            String str$$g3 = $$g(b6, b7, (byte) (-b7));
                            i2 = 2;
                            Class[] clsArr4 = new Class[2];
                            clsArr4[i5] = Integer.TYPE;
                            clsArr4[1] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, maximumFlingVelocity2, iGreen, 2012627446, false, str$$g3, clsArr4);
                        } else {
                            i2 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))) ^ (((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        i3 = i2;
                        i5 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i2 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iAxisFromString = 9 - MotionEvent.axisFromString("");
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, (byte) (b2 | 89), bArr[5], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, iAxisFromString, -1650998592, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{33681, 35528, 44779, 64753}, new char[]{32426, 36293, 24373, 48477}, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{45828, 63272, 54687, 19564, 37921, 57624, 7155, 36414, 51906, 9542, 38743, 41343, 19983, 39501, 39034, 14825, 6663, 3157, 5103, 17501, 40902, 62131}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{33681, 35528, 44779, 64753}, new char[]{14014, 2498, 16824, 64667}, (char) (39744 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getOffsetAfter("", 0) - 1207320010, new char[]{53189, 6373, 8781, 19127, 41071, 56362, 56531, 29495, 22768, 10276, 7042, 21994, 48468, 62288, 62029}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr5 = new Object[1];
                    a(b4, (byte) (b4 | 52), b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, iIndexOf, iKeyCodeFromString, 2012020043, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                        int iGreen = Color.green(0) + 10;
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr6 = new Object[1];
                        a(b5, b6, b6, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, keyRepeatTimeout, iGreen, 2012931276, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i3 = (((((~((-528530110) | iIdentityHashCode)) | 486580392) * (-283)) + 303607692) + ((~(iIdentityHashCode | (-41949718))) * 283)) - 1538797879;
                    int i4 = (i3 << 13) ^ i3;
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{33681, 35528, 44779, 64753}, new char[]{12144, 8290, 9544, 60041}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35108), ExpandableListView.getPackedPositionChild(0L) + 1, new char[]{34476, 45537, 40546, 34051, 57915, 18956, 18246, 9381, 30056, 11245, 38605, 12320, 22314, 57572, 39777, 24553, 45887, 12081, 42977, 6535, 1819, 41580, 31309, 58112, 52531, 30986}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{33681, 35528, 44779, 64753}, new char[]{41799, 27083, 16526, 63718}, (char) (58943 - ImageFormat.getBitsPerPixel(0)), ViewConfiguration.getScrollBarSize() >> 8, new char[]{22001, 1162, 9495, 53488, 29614, 41333, 12421, 23059, 63522, 19242, 63010, 26808, 39586, 28899, 25813, 54820, 30440, 56145}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{33681, 35528, 44779, 64753}, new char[]{63044, 46267, 32003, 63159}, (char) (46973 - (ViewConfiguration.getJumpTapTimeout() >> 16)), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{4514, 35601, 63364, 3608, 34137, 50216, 4103, 26463, 24812, 25774, 28029, 58308, 51148, 17569, 22835, 52163}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{33681, 35528, 44779, 64753}, new char[]{17085, 14005, 31504, 6067}, (char) (45948 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{27915, 29759, 12016, 58586, 53332, 33052, 35359, 9343, 10174, 47135, 39548, 14601, 48955, 56828, 31658, 17988}, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                    int i9 = i8 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1538797879};
                        byte[] bArr2 = $$d;
                        byte b7 = (byte) (-bArr2[37]);
                        byte b8 = (byte) (b7 - 1);
                        Object[] objArr13 = new Object[1];
                        d(b7, b8, b8, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b9 = bArr2[37];
                        byte b10 = (byte) (b9 + 1);
                        byte b11 = (byte) (-b9);
                        Object[] objArr14 = new Object[1];
                        d(b10, b11, b11, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
                                byte b12 = $$a[7];
                                byte b13 = b12;
                                Object[] objArr16 = new Object[1];
                                a(b12, b13, b13, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, iNormalizeMetaState, iIndexOf2, 2012931276, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(new char[]{33681, 35528, 44779, 64753}, new char[]{32426, 36293, 24373, 48477}, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (-1) - MotionEvent.axisFromString(""), new char[]{45828, 63272, 54687, 19564, 37921, 57624, 7155, 36414, 51906, 9542, 38743, 41343, 19983, 39501, 39034, 14825, 6663, 3157, 5103, 17501, 40902, 62131}, objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(new char[]{33681, 35528, 44779, 64753}, new char[]{14014, 2498, 16824, 64667}, (char) (TextUtils.indexOf((CharSequence) "", '0') + 39746), ExpandableListView.getPackedPositionGroup(0L) - 1207320010, new char[]{53189, 6373, 8781, 19127, 41071, 56362, 56531, 29495, 22768, 10276, 7042, 21994, 48468, 62288, 62029}, objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                    int capsMode = 876 - TextUtils.getCapsMode("", 0, 0);
                                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                                    byte b14 = $$a[7];
                                    byte b15 = b14;
                                    Object[] objArr19 = new Object[1];
                                    a(b15, (byte) (b15 | 52), b14, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, capsMode, edgeSlop, 2012020043, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char defaultSize = (char) View.getDefaultSize(0, 0);
                                    int iIndexOf3 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
                                    byte[] bArr3 = $$a;
                                    byte b16 = bArr3[7];
                                    Object[] objArr20 = new Object[1];
                                    a(b16, (byte) (b16 | 89), bArr3[5], objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, iIndexOf3, absoluteGravity, -1650998592, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
                int i10 = ((int[]) objArr[2])[0];
                int i11 = ((int[]) objArr[0])[0];
                if (i11 != i10) {
                    throw new RuntimeException(String.valueOf(i11));
                }
                int i12 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i13 = (int) Runtime.getRuntime().totalMemory();
                int i14 = i12 + 1306147604 + (((~(168860831 | i13)) | 209171060) * (-366)) + (((~(i13 | 242728703)) | 135303188) * 366);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr21[1])[0] = i16 ^ (i16 << 5);
                ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = addOnPictureInPictureModeChangedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((ClaimCheckBankBpuReactivationResponse) obj);
                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                int i18 = i17 % 2;
                return claimCheckBankBpuReactivationResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r6, byte r7, short r8) {
                /*
                    int r7 = r7 + 4
                    int r8 = r8 + 102
                    int r6 = r6 * 3
                    int r0 = 1 - r6
                    byte[] r1 = defpackage.onTrimMemory.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r1 != 0) goto L15
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r7 = r7 + 1
                    if (r3 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r7 = -r7
                    int r7 = r7 + r3
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onTrimMemory.$$g(short, byte, short):java.lang.String");
            }
        };
        readableMs readablems = new readableMs() { // from class: peekAvailableContext
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.cancel(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecClaimCheckBankBpuReactivation, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final deriveCodec<List<ReasonNotReactive>> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        deriveCodec<List<ReasonNotReactive>> derivecodecClaimGetListReasonBpu = this.b.claimGetListReasonBpu();
        final Function1 function1 = new Function1() { // from class: initializeViewTreeOwners
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addOnPictureInPictureModeChangedListener.b((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getOnBackPressedDispatcher
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addOnPictureInPictureModeChangedListener.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecClaimGetListReasonBpu, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.removeOnPictureInPictureUiStateChangedListener
    public final JhtClaimEmployeeDataItem b() {
        return (JhtClaimEmployeeDataItem) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getObject("EMPLOYEE_DATA_CLAIM", JhtClaimEmployeeDataItem.class);
    }

    public static /* synthetic */ ComponentActivityExternalSyntheticLambda10 TuitionPaymentFragmentbindingInflater1(GenerateClaimCodeResponse generateClaimCodeResponse) {
        Intrinsics.checkNotNullParameter(generateClaimCodeResponse, "");
        Intrinsics.checkNotNullParameter(generateClaimCodeResponse, "");
        return new ComponentActivityExternalSyntheticLambda10(generateClaimCodeResponse.isSuccessful(), generateClaimCodeResponse.getMessage(), new ComponentActivityExternalSyntheticLambda12(generateClaimCodeResponse.getData().getKodePengajuan()));
    }

    public static /* synthetic */ ClaimLivenessResponse TuitionPaymentFragmentbindingInflater1(ClaimLivenessResponse claimLivenessResponse) {
        Intrinsics.checkNotNullParameter(claimLivenessResponse, "");
        return ComponentActivityExternalSyntheticLambda11.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimLivenessResponse);
    }

    public static /* synthetic */ JhtClaimEmployeeDataItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JhtClaimEmployeeDataItem) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentbindingInflater1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ List b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    public static /* synthetic */ JhtClaimTrack TuitionPaymentFragmentspecialinlinedviewModeldefault1(JhtClaimTrackItem jhtClaimTrackItem) {
        TrackingStatusEnum trackingStatusEnum;
        Intrinsics.checkNotNullParameter(jhtClaimTrackItem, "");
        Intrinsics.checkNotNullParameter(jhtClaimTrackItem, "");
        List<TahapKlaim> tahapKlaim = jhtClaimTrackItem.getTahapKlaim();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tahapKlaim, 10));
        for (TahapKlaim tahapKlaim2 : tahapKlaim) {
            String tahap = tahapKlaim2.getTahap();
            String keterangan = tahapKlaim2.getKeterangan();
            int iHashCode = keterangan.hashCode();
            if (iHashCode != -957656138) {
                if (iHashCode != -652198768) {
                    if (iHashCode == 426200729 && keterangan.equals("Dalam Proses")) {
                        trackingStatusEnum = TrackingStatusEnum.IN_PROCESS;
                    } else {
                        trackingStatusEnum = TrackingStatusEnum.UNKNOWN;
                    }
                } else if (keterangan.equals("Selesai")) {
                    trackingStatusEnum = TrackingStatusEnum.FINISHED;
                } else {
                    trackingStatusEnum = TrackingStatusEnum.UNKNOWN;
                }
            } else if (keterangan.equals("Ditolak")) {
                trackingStatusEnum = TrackingStatusEnum.REJECTED;
            } else {
                trackingStatusEnum = TrackingStatusEnum.UNKNOWN;
            }
            arrayList.add(new ClaimStep(trackingStatusEnum, tahap, tahapKlaim2.getTglRekam()));
        }
        TitleKlaim titleKlaim = jhtClaimTrackItem.getTitleKlaim();
        return new JhtClaimTrack(arrayList, new ClaimTitle(titleKlaim.getKodeKlaim(), titleKlaim.getTipeKlaim()), jhtClaimTrackItem.isPaid());
    }

    public static /* synthetic */ JhtEligibility TuitionPaymentFragmentspecialinlinedviewModeldefault1(JhtClaimSignaturedItem jhtClaimSignaturedItem) {
        Intrinsics.checkNotNullParameter(jhtClaimSignaturedItem, "");
        Intrinsics.checkNotNullParameter(jhtClaimSignaturedItem, "");
        return new JhtEligibility(jhtClaimSignaturedItem.getSignature(), jhtClaimSignaturedItem.getIsSuccessful(), jhtClaimSignaturedItem.getMessage(), null, null, null, null, 120, null);
    }

    public static /* synthetic */ Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Boolean) function1.invoke(obj);
    }

    public static /* synthetic */ List b(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list;
    }

    public static /* synthetic */ ClaimReactivationBpuTuitionResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimReactivationBpuTuitionResponse claimReactivationBpuTuitionResponse) {
        Intrinsics.checkNotNullParameter(claimReactivationBpuTuitionResponse, "");
        return claimReactivationBpuTuitionResponse;
    }

    public static /* synthetic */ ClaimCheckBankBpuReactivationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponse) {
        Intrinsics.checkNotNullParameter(claimCheckBankBpuReactivationResponse, "");
        return claimCheckBankBpuReactivationResponse;
    }

    public static /* synthetic */ List b(JhtClaimReasonResponse jhtClaimReasonResponse) {
        Intrinsics.checkNotNullParameter(jhtClaimReasonResponse, "");
        List<JhtClaimReasonItem> sebabKlaim = jhtClaimReasonResponse.getSebabKlaim();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sebabKlaim, 10));
        for (JhtClaimReasonItem jhtClaimReasonItem : sebabKlaim) {
            Intrinsics.checkNotNullParameter(jhtClaimReasonItem, "");
            String kodeTipeKlaim = jhtClaimReasonItem.getKodeTipeKlaim();
            if (kodeTipeKlaim == null) {
                kodeTipeKlaim = "";
            }
            String kode = jhtClaimReasonItem.getKode();
            if (kode == null) {
                kode = "";
            }
            String nama = jhtClaimReasonItem.getNama();
            if (nama == null) {
                nama = "";
            }
            arrayList.add(new setPictureInPictureParams(nama, kode, kodeTipeKlaim));
        }
        return arrayList;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ComponentActivityExternalSyntheticLambda11.TuitionPaymentFragmentbindingInflater1((JhtBalanceItem) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2(ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        return responseBody.byteStream();
    }

    public static /* synthetic */ JhtClaimTrack d(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JhtClaimTrack) function1.invoke(obj);
    }

    public static /* synthetic */ JhtClaimEmployeeDataItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem) {
        Intrinsics.checkNotNullParameter(jhtClaimEmployeeDataItem, "");
        return jhtClaimEmployeeDataItem;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(addOnPictureInPictureModeChangedListener addonpictureinpicturemodechangedlistener, JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem) {
        PreferenceManager preferenceManager = addonpictureinpicturemodechangedlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(jhtClaimEmployeeDataItem);
        preferenceManager.saveObject("EMPLOYEE_DATA_CLAIM", jhtClaimEmployeeDataItem);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<ListClaimSegmenItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ListClaimSegmenItem listClaimSegmenItem : list2) {
            Intrinsics.checkNotNullParameter(listClaimSegmenItem, "");
            String kodeSegmen = listClaimSegmenItem.getKodeSegmen();
            if (kodeSegmen == null) {
                kodeSegmen = "";
            }
            arrayList.add(new ClaimSegmenItem(kodeSegmen));
        }
        return arrayList;
    }

    public static /* synthetic */ ClaimEvidenceJhtResponse asInterface(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ClaimEvidenceJhtResponse) function1.invoke(obj);
    }

    public static /* synthetic */ ClaimLivenessResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimLivenessResponse claimLivenessResponse) {
        Intrinsics.checkNotNullParameter(claimLivenessResponse, "");
        return ComponentActivityExternalSyntheticLambda11.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimLivenessResponse);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(JhtClaimContributionResponse jhtClaimContributionResponse) {
        Intrinsics.checkNotNullParameter(jhtClaimContributionResponse, "");
        List<JhtClaimContributionItem> data = jhtClaimContributionResponse.getData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        for (JhtClaimContributionItem jhtClaimContributionItem : data) {
            ComponentActivityExternalSyntheticLambda0 componentActivityExternalSyntheticLambda0 = ComponentActivityExternalSyntheticLambda0.INSTANCE;
            arrayList.add(ComponentActivityExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(jhtClaimContributionItem));
        }
        return arrayList;
    }

    public static /* synthetic */ ClaimEvidenceJhtResponse b(ClaimEvidenceJhtResponse claimEvidenceJhtResponse) {
        Intrinsics.checkNotNullParameter(claimEvidenceJhtResponse, "");
        return claimEvidenceJhtResponse;
    }

    public static /* synthetic */ List g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ ClaimCheckBankBpuReactivationResponse cancel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ClaimCheckBankBpuReactivationResponse) function1.invoke(obj);
    }

    public static /* synthetic */ Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(JhtClaimCheckPhotoResponse jhtClaimCheckPhotoResponse) {
        Intrinsics.checkNotNullParameter(jhtClaimCheckPhotoResponse, "");
        return Boolean.valueOf(jhtClaimCheckPhotoResponse.getFotoExsist());
    }

    public static /* synthetic */ BaseModel cancelAll(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ BenefitDetail TuitionPaymentFragmentspecialinlinedviewModeldefault3(JhtBenefitDetailItem jhtBenefitDetailItem) {
        Intrinsics.checkNotNullParameter(jhtBenefitDetailItem, "");
        Intrinsics.checkNotNullParameter(jhtBenefitDetailItem, "");
        return new BenefitDetail(jhtBenefitDetailItem.getTanggalPengembangan(), jhtBenefitDetailItem.getRatePengembangan(), jhtBenefitDetailItem.getTanggalSaldoAwalTahun(), jhtBenefitDetailItem.getNominalSaldoAwalTahun(), jhtBenefitDetailItem.getNominalSaldoPengembangan(), jhtBenefitDetailItem.getNominalSaldoTotal(), jhtBenefitDetailItem.getNominalIuranTahunBerjalan(), jhtBenefitDetailItem.getNominalIuranPengembangan(), jhtBenefitDetailItem.getNominalIuranTotal(), jhtBenefitDetailItem.getNominalSaldoIuranTotal(), jhtBenefitDetailItem.getPersentasePengambilan(), jhtBenefitDetailItem.getNominalManfaatMaxBisaDiAmbil(), jhtBenefitDetailItem.getNominalManfaatDiAmbil(), jhtBenefitDetailItem.getNominalManfaatGross(), jhtBenefitDetailItem.getNominalPPH(), jhtBenefitDetailItem.getNominalPembulatan(), jhtBenefitDetailItem.getNominalManfaatNetto());
    }

    public static /* synthetic */ ClaimLivenessResponse notify(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ClaimLivenessResponse) function1.invoke(obj);
    }

    public static /* synthetic */ JhtEligibility onTransact(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JhtEligibility) function1.invoke(obj);
    }

    public static /* synthetic */ JhtClaimEligibility INotificationSideChannel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JhtClaimEligibility) function1.invoke(obj);
    }

    public static /* synthetic */ List RemoteActionCompatParcelizer(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ InputStream INotificationSideChannelDefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InputStream) function1.invoke(obj);
    }

    public static /* synthetic */ List INotificationSideChannelStubProxy(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(addOnPictureInPictureModeChangedListener addonpictureinpicturemodechangedlistener, JhtClaimEligibility jhtClaimEligibility) {
        if (jhtClaimEligibility != null) {
            addonpictureinpicturemodechangedlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault3.saveObject("CLAIM_SIGNATURE", jhtClaimEligibility);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ComponentActivityExternalSyntheticLambda11.TuitionPaymentFragmentbindingInflater1((JhtBalanceItem) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ ComponentActivityExternalSyntheticLambda10 INotificationSideChannelStub(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ComponentActivityExternalSyntheticLambda10) function1.invoke(obj);
    }

    public static /* synthetic */ BenefitDetail connect(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BenefitDetail) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ JhtClaimEligibility TuitionPaymentFragmentspecialinlinedviewModeldefault1(JhtClaimEligibilityResponse jhtClaimEligibilityResponse) {
        Intrinsics.checkNotNullParameter(jhtClaimEligibilityResponse, "");
        Intrinsics.checkNotNullParameter(jhtClaimEligibilityResponse, "");
        return new JhtClaimEligibility(jhtClaimEligibilityResponse.getData().getStatusCode(), jhtClaimEligibilityResponse.getData().getMessage(), jhtClaimEligibilityResponse.getData().getBranchOfficeChannelName(), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jhtClaimEligibilityResponse.getData().getSignature(), Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3())), jhtClaimEligibilityResponse.getData().getEligibleReactivationBpu(), jhtClaimEligibilityResponse.getPraNewData().getBtlh(), jhtClaimEligibilityResponse.getPraNewData().getNominalContribution(), jhtClaimEligibilityResponse.getPraNewData().getStatusUpdateData(), jhtClaimEligibilityResponse.getPraNewData().getStatusMembership(), jhtClaimEligibilityResponse.getPraNewData().getStatusNpwp(), jhtClaimEligibilityResponse.getPraNewData().getStatusRsjht(), jhtClaimEligibilityResponse.getPraNewData().getStatusMaksimumBalanceJht(), jhtClaimEligibilityResponse.getPraNewData().getMaximumBalanceJht(), jhtClaimEligibilityResponse.getPraNewData().getStatusPensiun(), jhtClaimEligibilityResponse.getPraNewData().getFlagMaxSaldo());
    }

    public static /* synthetic */ List IconCompatParcelizer(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ ClaimLivenessResponse getInterfaceDescriptor(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ClaimLivenessResponse) function1.invoke(obj);
    }

    public static /* synthetic */ ClaimReactivationBpuTuitionResponse write(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ClaimReactivationBpuTuitionResponse) function1.invoke(obj);
    }
}
