package defpackage;

import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.general.model.response.VerificationSignatureItem;
import com.bpjstku.data.setting.SettingRepository;
import com.bpjstku.data.setting.model.request.AddKpjRequest;
import com.bpjstku.data.setting.model.request.ChangeDataFirstVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangePasswordRequest;
import com.bpjstku.data.setting.model.request.ChangePhoneNumberRequest;
import com.bpjstku.data.setting.model.request.ChangeProfilePictureRequest;
import com.bpjstku.data.setting.model.request.KeyRequest;
import com.bpjstku.data.setting.model.request.PhoneVerificationRequest;
import com.bpjstku.data.setting.model.request.VerificationOtpRequest;
import com.bpjstku.data.setting.model.response.ChangeEmailItem;
import com.bpjstku.data.setting.model.response.ChangePasswordItem;
import com.bpjstku.data.setting.model.response.ChangePhoneItem;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.data.setting.model.response.KpjItemAdded;
import com.bpjstku.data.setting.model.response.ProfilePictureItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.setting.SettingInteractor$postChangeProfilePicture$1;
import com.bpjstku.domain.user.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class PredictiveBackHandlerInfo implements ReportDrawnAfterlambda0 {
    private final PreferenceManager TuitionPaymentFragmentbindingInflater1;
    private final SettingRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public PredictiveBackHandlerInfo(SettingRepository settingRepository, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(settingRepository, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = settingRepository;
        this.TuitionPaymentFragmentbindingInflater1 = preferenceManager;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(final ChangeEmailRequest changeEmailRequest) {
        Intrinsics.checkNotNullParameter(changeEmailRequest, "");
        deriveCodec<ChangeEmailItem> derivecodecPostChangeEmail = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postChangeEmail(changeEmailRequest);
        final Function1 function1 = new Function1() { // from class: ReportDrawnlambda00
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1((ChangeEmailItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ReportDrawnlambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostChangeEmail, readablems);
        final Function1 function2 = new Function1() { // from class: r8lambdaD8a2kH5mKpDy4Fdrtpqcav0aLMg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, changeEmailRequest);
            }
        };
        logToString logtostring = new logToString() { // from class: PredictiveBackHandlerKtExternalSyntheticLambda3
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

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<Verification> TuitionPaymentFragmentbindingInflater1(ChangeEmailVerificationRequest changeEmailVerificationRequest) {
        Intrinsics.checkNotNullParameter(changeEmailVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostEmailVerification = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postEmailVerification(changeEmailVerificationRequest);
        final Function1 function1 = new Function1() { // from class: ReportDrawnAfter
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ReportDrawnWhenlambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostEmailVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<Verification> TuitionPaymentFragmentbindingInflater1(PhoneVerificationRequest phoneVerificationRequest) {
        Intrinsics.checkNotNullParameter(phoneVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostPhoneVerification = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postPhoneVerification(phoneVerificationRequest);
        final Function1 function1 = new Function1() { // from class: ReportDrawnCompositioncheckReporter1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.b((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ReportDrawnKt
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.write(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostPhoneVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<BaseModel> b(final ChangePhoneNumberRequest changePhoneNumberRequest) {
        Intrinsics.checkNotNullParameter(changePhoneNumberRequest, "");
        deriveCodec<ChangePhoneItem> derivecodecPostChangePhoneNumber = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postChangePhoneNumber(changePhoneNumberRequest);
        final Function1 function1 = new Function1() { // from class: ReportDrawnAfterlambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1((ChangePhoneItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PredictiveBackHandler
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostChangePhoneNumber, readablems);
        final Function1 function2 = new Function1() { // from class: r8lambdanQooPx1G5uRDz4nlmkTLRPyb09k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, changePhoneNumberRequest);
            }
        };
        logToString logtostring = new logToString() { // from class: PredictiveBackHandlerlambda20
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

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<BaseModel> b(ChangePasswordRequest changePasswordRequest) {
        Intrinsics.checkNotNullParameter(changePasswordRequest, "");
        String email = changePasswordRequest.getEmail();
        if (email == null) {
            email = "";
        }
        String newPassword = changePasswordRequest.getNewPassword();
        if (newPassword == null) {
            newPassword = "";
        }
        String oldPassword = changePasswordRequest.getOldPassword();
        if (oldPassword == null) {
            oldPassword = "";
        }
        String confirmedNewPassword = changePasswordRequest.getConfirmedNewPassword();
        if (confirmedNewPassword == null) {
            confirmedNewPassword = "";
        }
        deriveCodec<ChangePasswordItem> derivecodecPostChangePassword = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postChangePassword(new ChangePasswordRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, email, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, newPassword, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, oldPassword, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, confirmedNewPassword, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
        final Function1 function1 = new Function1() { // from class: r8lambdaNSqDQDsxdIf4sa0UaGdo4nx3oM
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1((ChangePasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ReportDrawn
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostChangePassword, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AddKpjRequest addKpjRequest) {
        Intrinsics.checkNotNullParameter(addKpjRequest, "");
        deriveCodec<KpjItemAdded> derivecodecPostAddKpj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postAddKpj(addKpjRequest);
        final Function1 function1 = new Function1() { // from class: PredictiveBackHandlerKtExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1((KpjItemAdded) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaLOyiwg1oNIOvuoGg7iwkFJlJEUk
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.RemoteActionCompatParcelizer(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostAddKpj, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<String> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChangeProfilePictureRequest changeProfilePictureRequest) {
        Intrinsics.checkNotNullParameter(changeProfilePictureRequest, "");
        deriveCodec<ProfilePictureItem> derivecodecPostChangeProfilePicture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postChangeProfilePicture(changeProfilePictureRequest);
        final SettingInteractor$postChangeProfilePicture$1 settingInteractor$postChangeProfilePicture$1 = new PropertyReference1Impl() { // from class: com.bpjstku.domain.setting.SettingInteractor$postChangeProfilePicture$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final Object get(Object obj) {
                return ((ProfilePictureItem) obj).getImagePath();
            }
        };
        readableMs readablems = new readableMs() { // from class: PredictiveBackHandlerKtPredictiveBackHandlerlambda40inlinedonDispose1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.INotificationSideChannelDefault(settingInteractor$postChangeProfilePicture$1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostChangeProfilePicture, readablems);
        final Function1 function1 = new Function1() { // from class: ReportDrawnComposition
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (String) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(api23Impl, logtostring);
        Intrinsics.checkNotNullExpressionValue(currentsystemtimens, "");
        return currentsystemtimens;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChangeDataFirstVerificationRequest changeDataFirstVerificationRequest) {
        Intrinsics.checkNotNullParameter(changeDataFirstVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecChangeEmailVerificationHandphone = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.changeEmailVerificationHandphone(changeDataFirstVerificationRequest);
        final Function1 function1 = new Function1() { // from class: r8lambda42owrfowpeNhJx1LT7xtWOPTyZI
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: observeReporter
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.a(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecChangeEmailVerificationHandphone, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<VerificationSignatureItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(VerificationOtpRequest verificationOtpRequest) {
        Intrinsics.checkNotNullParameter(verificationOtpRequest, "");
        deriveCodec<VerificationSignatureItem> derivecodecChangeEmailVerificationHandphoneOtp = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.changeEmailVerificationHandphoneOtp(verificationOtpRequest);
        final Function1 function1 = new Function1() { // from class: PredictiveBackHandlerlambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.b((VerificationSignatureItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PredictiveBackHandlerlambda60
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.notify(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecChangeEmailVerificationHandphoneOtp, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<Verification> b(ChangeEmailVerificationRequest changeEmailVerificationRequest) {
        Intrinsics.checkNotNullParameter(changeEmailVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecChangeEmailVerification = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.changeEmailVerification(changeEmailVerificationRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdacQVN4tRfSnIQmf_oO7lMYiB3VMs
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.g((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PredictiveBackHandlerlambda30
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.read(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecChangeEmailVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<VerificationSignatureItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerificationOtpRequest verificationOtpRequest) {
        Intrinsics.checkNotNullParameter(verificationOtpRequest, "");
        deriveCodec<VerificationSignatureItem> derivecodecChangeEmailVerificationOtp = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.changeEmailVerificationOtp(verificationOtpRequest);
        final Function1 function1 = new Function1() { // from class: PredictiveBackHandlerlambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1((VerificationSignatureItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PredictiveBackHandlerlambda50
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.asInterface(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecChangeEmailVerificationOtp, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<BaseItem> b(ChangeEmailRequest changeEmailRequest) {
        Intrinsics.checkNotNullParameter(changeEmailRequest, "");
        deriveCodec<BaseItem> derivecodecChangeEmail = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.changeEmail(changeEmailRequest);
        final Function1 function1 = new Function1() { // from class: PredictiveBackHandlerKtExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.b((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PredictiveBackHandlerKtExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.asBinder(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecChangeEmail, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<Verification> b(ChangeDataFirstVerificationRequest changeDataFirstVerificationRequest) {
        Intrinsics.checkNotNullParameter(changeDataFirstVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecChangeHandphoneVerificationEmail = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.changeHandphoneVerificationEmail(changeDataFirstVerificationRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdagBlqcTClAvA6iouKKgMD0M84QkM
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdar6snnvQsr72sOpSENmJd75dAfOo
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.cancelAll(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecChangeHandphoneVerificationEmail, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<VerificationSignatureItem> TuitionPaymentFragmentbindingInflater1(VerificationOtpRequest verificationOtpRequest) {
        Intrinsics.checkNotNullParameter(verificationOtpRequest, "");
        deriveCodec<VerificationSignatureItem> derivecodecChangeHandphoneVerificationEmailOtp = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.changeHandphoneVerificationEmailOtp(verificationOtpRequest);
        final Function1 function1 = new Function1() { // from class: PredictiveBackHandlerKtExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2((VerificationSignatureItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PredictiveBackHandlerKtPredictiveBackHandlerlambda60inlinedonStopOrDispose1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.MediaBrowserCompat(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecChangeHandphoneVerificationEmailOtp, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<Verification> b(ChangeHandphoneVerificationRequest changeHandphoneVerificationRequest) {
        Intrinsics.checkNotNullParameter(changeHandphoneVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecChangeHandphoneVerification = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.changeHandphoneVerification(changeHandphoneVerificationRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdaQyz8dgmrKKtiaLGKldclwNgJyhc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaQpnmnANLdfyoqcjkXgtsE9Px6SQ
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecChangeHandphoneVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<VerificationSignatureItem> b(VerificationOtpRequest verificationOtpRequest) {
        Intrinsics.checkNotNullParameter(verificationOtpRequest, "");
        deriveCodec<VerificationSignatureItem> derivecodecChangeHandphoneVerificationOtp = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.changeHandphoneVerificationOtp(verificationOtpRequest);
        ReportDrawnCompositionExternalSyntheticLambda1 reportDrawnCompositionExternalSyntheticLambda1 = new ReportDrawnCompositionExternalSyntheticLambda1(new Function1() { // from class: ReportDrawnCompositionExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VerificationSignatureItem) obj);
            }
        });
        share.b(reportDrawnCompositionExternalSyntheticLambda1, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecChangeHandphoneVerificationOtp, reportDrawnCompositionExternalSyntheticLambda1);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChangePhoneNumberRequest changePhoneNumberRequest) {
        Intrinsics.checkNotNullParameter(changePhoneNumberRequest, "");
        deriveCodec<BaseItem> derivecodecChangeHandphone = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.changeHandphone(changePhoneNumberRequest);
        final Function1 function1 = new Function1() { // from class: snapshotStateObserverlambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaXEPgOM60FcttXLEQnmibtGAxavE
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.cancel(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecChangeHandphone, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        deriveCodec<BaseItem> timeServer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getTimeServer();
        final Function1 function1 = new Function1() { // from class: r8lambda1yXwvY8lpzr0ptjGfFZRhfTB5k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaQyg5QBqA91q6Cfl0DPwFa5Xpg
            public static int TuitionPaymentFragmentbindingInflater1 = -1241519890;
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 929538145;

            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.INotificationSideChannel(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(timeServer, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        deriveCodec<BaseItem> timeDetailServer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getTimeDetailServer();
        final Function1 function1 = new Function1() { // from class: observeReporterlambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambda1usUgKJoh8ndpK1dt_fx0oxihY
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.onTransact(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(timeDetailServer, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnAfterlambda0
    public final deriveCodec<KeyResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(KeyRequest keyRequest) {
        Intrinsics.checkNotNullParameter(keyRequest, "");
        deriveCodec<KeyResponse> generateKey = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getGenerateKey(new KeyRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, keyRequest.getData(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
        final Function1 function1 = new Function1() { // from class: PredictiveBackHandlerKtExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PredictiveBackHandlerInfo.b((KeyResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: accessobserveReporter
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PredictiveBackHandlerInfo.getInterfaceDescriptor(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(generateKey, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault1(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ VerificationSignatureItem TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationSignatureItem) function1.invoke(obj);
    }

    public static /* synthetic */ VerificationSignatureItem b(VerificationSignatureItem verificationSignatureItem) {
        Intrinsics.checkNotNullParameter(verificationSignatureItem, "");
        ReportDrawnWhen reportDrawnWhen = ReportDrawnWhen.INSTANCE;
        return ReportDrawnWhen.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(verificationSignatureItem);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentbindingInflater1(ChangeEmailItem changeEmailItem) {
        Intrinsics.checkNotNullParameter(changeEmailItem, "");
        ChangeEmailItem changeEmailItem2 = changeEmailItem;
        Intrinsics.checkNotNullParameter(changeEmailItem2, "");
        return new BaseModel(changeEmailItem2.getIsSuccessful(), changeEmailItem2.getMessage());
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ Verification a(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ VerificationSignatureItem TuitionPaymentFragmentbindingInflater1(VerificationSignatureItem verificationSignatureItem) {
        Intrinsics.checkNotNullParameter(verificationSignatureItem, "");
        ReportDrawnWhen reportDrawnWhen = ReportDrawnWhen.INSTANCE;
        return ReportDrawnWhen.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(verificationSignatureItem);
    }

    public static /* synthetic */ Verification b(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ VerificationSignatureItem asInterface(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationSignatureItem) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChangePasswordItem changePasswordItem) {
        Intrinsics.checkNotNullParameter(changePasswordItem, "");
        ChangePasswordItem changePasswordItem2 = changePasswordItem;
        Intrinsics.checkNotNullParameter(changePasswordItem2, "");
        return new BaseModel(changePasswordItem2.getIsSuccessful(), changePasswordItem2.getMessage());
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChangePhoneItem changePhoneItem) {
        Intrinsics.checkNotNullParameter(changePhoneItem, "");
        ChangePhoneItem changePhoneItem2 = changePhoneItem;
        Intrinsics.checkNotNullParameter(changePhoneItem2, "");
        return new BaseModel(changePhoneItem2.getIsSuccessful(), changePhoneItem2.getMessage());
    }

    public static /* synthetic */ BaseItem asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem INotificationSideChannel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem onTransact(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem cancel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ VerificationSignatureItem notify(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationSignatureItem) function1.invoke(obj);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PredictiveBackHandlerInfo predictiveBackHandlerInfo, String str) {
        User user;
        if (str != null && (user = (User) predictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1.getObject("USER_OBJECT", User.class)) != null) {
            predictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1.saveObject("USER_OBJECT", User.b(user, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048571));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PredictiveBackHandlerInfo predictiveBackHandlerInfo, ChangeEmailRequest changeEmailRequest) {
        String newEmail = changeEmailRequest.getNewEmail();
        User user = (User) predictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1.getObject("USER_OBJECT", User.class);
        if (newEmail != null) {
            User userB = user != null ? User.b(user, null, newEmail, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048573) : null;
            if (userB != null) {
                predictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1.saveObject("USER_OBJECT", userB);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Verification cancelAll(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ VerificationSignatureItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(VerificationSignatureItem verificationSignatureItem) {
        Intrinsics.checkNotNullParameter(verificationSignatureItem, "");
        ReportDrawnWhen reportDrawnWhen = ReportDrawnWhen.INSTANCE;
        return ReportDrawnWhen.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(verificationSignatureItem);
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentbindingInflater1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    public static /* synthetic */ BaseItem b(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    public static /* synthetic */ KeyResponse b(KeyResponse keyResponse) {
        Intrinsics.checkNotNullParameter(keyResponse, "");
        return ReportDrawnKtExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(keyResponse);
    }

    public static /* synthetic */ BaseModel RemoteActionCompatParcelizer(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ KeyResponse getInterfaceDescriptor(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (KeyResponse) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentbindingInflater1(KpjItemAdded kpjItemAdded) {
        Intrinsics.checkNotNullParameter(kpjItemAdded, "");
        KpjItemAdded kpjItemAdded2 = kpjItemAdded;
        Intrinsics.checkNotNullParameter(kpjItemAdded2, "");
        return new BaseModel(kpjItemAdded2.getIsSuccessful(), kpjItemAdded2.getMessage());
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault3(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentbindingInflater1(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ Unit b(PredictiveBackHandlerInfo predictiveBackHandlerInfo, ChangePhoneNumberRequest changePhoneNumberRequest) {
        String noHp = changePhoneNumberRequest.getNoHp();
        User user = (User) predictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1.getObject("USER_OBJECT", User.class);
        if (noHp != null) {
            User userB = user != null ? User.b(user, null, null, null, noHp, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048567) : null;
            if (userB != null) {
                predictiveBackHandlerInfo.TuitionPaymentFragmentbindingInflater1.saveObject("USER_OBJECT", userB);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String INotificationSideChannelDefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (String) function1.invoke(obj);
    }

    public static /* synthetic */ Verification write(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ Verification g(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ Verification read(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ VerificationSignatureItem MediaBrowserCompat(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationSignatureItem) function1.invoke(obj);
    }

    public static /* synthetic */ VerificationSignatureItem TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerificationSignatureItem verificationSignatureItem) {
        Intrinsics.checkNotNullParameter(verificationSignatureItem, "");
        ReportDrawnWhen reportDrawnWhen = ReportDrawnWhen.INSTANCE;
        return ReportDrawnWhen.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(verificationSignatureItem);
    }
}
