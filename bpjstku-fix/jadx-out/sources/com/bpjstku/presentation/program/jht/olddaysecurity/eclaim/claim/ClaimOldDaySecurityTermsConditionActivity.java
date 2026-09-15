package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.view.OnBackPressedCallback;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.data.jht.model.request.ClaimCheckEligibilityRequest;
import com.bpjstku.data.jht.model.response.InfoPraClaimItem;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.data.queueing.model.request.AntrianOnlineUrlRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.databinding.ActivityClaimOldDaySecurityTermsConditionBinding;
import com.bpjstku.domain.jht.model.BenefitDetail;
import com.bpjstku.domain.jht.model.JhtBalance;
import com.bpjstku.domain.jht.model.JhtClaimEligibility;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.constant.AsikPointer;
import com.bpjstku.util.constant.JhtEligibilityStatus;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.AutoValue_MediaSpec1;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.ConstantObservable;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.deriveCodec;
import defpackage.getCameraOperatingMode;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isModeInList;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onCaptureSessionEnd;
import defpackage.onResume;
import defpackage.setContentView;
import defpackage.setQuickZoomEnabled;
import defpackage.setTimeout3A;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010C\u001a\u00020DH\u0014J\b\u0010E\u001a\u00020DH\u0014J\b\u0010F\u001a\u00020DH\u0014J\b\u0010G\u001a\u00020DH\u0014J\b\u0010H\u001a\u00020DH\u0014J\b\u0010I\u001a\u00020DH\u0002J\b\u0010J\u001a\u00020DH\u0002J\b\u0010K\u001a\u00020DH\u0002J\u0010\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020D2\u0006\u0010P\u001a\u000200H\u0002J\u0010\u0010Q\u001a\u00020D2\u0006\u0010R\u001a\u00020SH\u0002J\b\u0010T\u001a\u00020DH\u0002J\b\u0010U\u001a\u00020DH\u0002J\b\u0010V\u001a\u00020DH\u0002J\b\u0010W\u001a\u00020DH\u0002J^\u0010X\u001a\u00020D2\b\b\u0002\u0010Y\u001a\u00020\u00062\b\b\u0002\u0010Z\u001a\u0002022\b\b\u0002\u0010[\u001a\u0002022\b\b\u0002\u0010\\\u001a\u0002022\b\b\u0002\u0010]\u001a\u0002022\u0010\b\u0002\u0010^\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010_2\u0010\b\u0002\u0010`\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010_H\u0002J&\u0010a\u001a\u00020D2\b\b\u0002\u0010[\u001a\u0002022\b\b\u0002\u0010\\\u001a\u0002022\b\b\u0002\u0010b\u001a\u000202H\u0002J\u0010\u0010c\u001a\u0002092\u0006\u0010d\u001a\u00020eH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b \u0010!R\u001d\u0010#\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b%\u0010&R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00105\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u00106R\u0010\u00107\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010>\u001a\u0004\u0018\u00010?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u0013\u001a\u0004\b@\u0010A¨\u0006g"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimOldDaySecurityTermsConditionActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityClaimOldDaySecurityTermsConditionBinding;", "<init>", "()V", "layoutResource", "", "getLayoutResource", "()I", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "getBindingInflater", "()Lkotlin/jvm/functions/Function1;", "jhtClaimViewModel", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/JhtClaimViewModel;", "getJhtClaimViewModel", "()Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/JhtClaimViewModel;", "jhtClaimViewModel$delegate", "Lkotlin/Lazy;", "accountViewModel", "Lcom/bpjstku/presentation/account/AccountViewModel;", "getAccountViewModel", "()Lcom/bpjstku/presentation/account/AccountViewModel;", "accountViewModel$delegate", "queueingViewModel", "Lcom/bpjstku/presentation/queueing/QueueingViewModel;", "getQueueingViewModel", "()Lcom/bpjstku/presentation/queueing/QueueingViewModel;", "queueingViewModel$delegate", "jhtViewModel", "Lcom/bpjstku/presentation/program/jht/JhtViewModel;", "getJhtViewModel", "()Lcom/bpjstku/presentation/program/jht/JhtViewModel;", "jhtViewModel$delegate", "user", "Lcom/bpjstku/domain/user/model/User;", "getUser", "()Lcom/bpjstku/domain/user/model/User;", "user$delegate", "resultCheckBalanceJht", "Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment;", "resultBenefitDetailDialog", "resultInfoPraClaim", "resultCheckEligibilityClaimDialog", "notifikasi", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/SimpleDialogFragment;", "checkPraClaimItem", "Lcom/bpjstku/data/jht/model/response/InfoPraClaimItem;", "segmentCode", "", "kpj", "divitionCode", "blthRsjht", "Ljava/lang/Integer;", "companyCode", "benefitDetailStatus", "", "claimCodeSegmen", "minimsaldo", "eligibleMessage", "eligibleReactivationBpu", "statusClaim", "Lcom/bpjstku/domain/jht/model/ClaimStatus;", "getStatusClaim", "()Lcom/bpjstku/domain/jht/model/ClaimStatus;", "statusClaim$delegate", "initAction", "", "initIntent", "initObservers", "initProcess", "initUI", "eligibilityClaim", "doGetFieldForRsjht", "doGetSaldoJht", "showEligibilityClaim", "requestItem", "Lcom/bpjstku/domain/jht/model/JhtClaimEligibility;", "preloadInfoPraClaim", "infoPraClaimItem", "checkBenefitDetail", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/domain/jht/model/BenefitDetail;", "showBalanceInformation", "hideBalanceInformation", "checkTermCondition", "showMessageDialog", "showDialogEligibility", "image", "title", "message", "buttonText", "secondaryButtonText", "buttonClickedListener", "Lkotlin/Function0;", "secondaryButtonClickedListener", "showLapakAsikDialog", ImagesContract.URL, "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClaimOldDaySecurityTermsConditionActivity extends BindingBaseActivity<ActivityClaimOldDaySecurityTermsConditionBinding> {
    public static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1;
    private static char disconnect;
    private static int getExtras;
    private static char getItem;
    private static char read;
    private static char write;
    private final Lazy INotificationSideChannel;
    private getStringOrNull INotificationSideChannelDefault;
    private getStringOrNull INotificationSideChannelStub;
    private String MediaBrowserCompat;
    private final Lazy RemoteActionCompatParcelizer;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private InfoPraClaimItem TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f587a;
    private Integer b;
    private String cancel;
    private String g;
    private getStringOrNull getInterfaceDescriptor;
    private final Lazy notify;
    private lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl onTransact;
    private static final byte[] $$c = {109, 48, -62, 38};
    private static final int $$f = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {117, 50, 102, 124, -39, 36, -39, -10, -16, 19, -42, 5, -22, -8, 6, -7, 25, -38, -19, -8, 2, -7, -10, -16, 20, -39, 36, -39, -10, -16, 19, -42, 5, -22, -8, 6, -7, 23, -57, 9, -17, -14, 36, -33, -21, 2, -16, -1, -21, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, 10, -15, -13, 2, -13, -13, -1, 22, -45, 0, -14, 3, -27, 7, -21, 57};
    private static final int $$k = 243;
    private static final byte[] $$a = {91, -9, 99, 11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 101;
    private static int isConnected = 1;
    private static int getNotifyChildrenChangedOptions = 0;
    private static int getRoot = 1;
    private final Lazy connect = LazyKt.lazy(new Function0() { // from class: isTorchAsFlash
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ClaimOldDaySecurityTermsConditionActivity.d(this.b);
        }
    });
    private String d = "";
    private String cancelAll = "";
    private String asBinder = "";
    private String asInterface = "";
    private final Lazy IconCompatParcelizer = LazyKt.lazy(new Function0() { // from class: Camera2CameraInfoImplExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ClaimOldDaySecurityTermsConditionActivity.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = i7 | i3;
        int i9 = ~i8;
        int i10 = ~i5;
        int i11 = i9 | (~(i10 | i3));
        int i12 = i8 | i10;
        int i13 = (~(i5 | i3)) | (~(i7 | (~i3)));
        int i14 = i3 + i + i6 + ((-1311665080) * i2) + (1761575915 * i4);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i3) + 412680192 + (1917570655 * i) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i6) + (175112192 * i2) + ((-649461760) * i4) + (1783169024 * i15);
        int i17 = ((i3 * 1226044109) - 1701849991) + (i * 1226043089) + (i11 * TypedValues.PositionType.TYPE_POSITION_TYPE) + (i12 * (-510)) + (i13 * TypedValues.PositionType.TYPE_POSITION_TYPE) + (i6 * 1226043599) + (i2 * (-858626504)) + (i4 * 1069087493) + (i15 * 1627848704);
        switch (i16 + (i17 * i17 * 739704832)) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 2:
                final ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity = (ClaimOldDaySecurityTermsConditionActivity) objArr[0];
                VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
                int i18 = 2 % 2;
                int i19 = getNotifyChildrenChangedOptions + 1;
                getRoot = i19 % 128;
                int i20 = i19 % 2;
                if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_jht_balance", "loading_jht_balance_result"));
                    Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                    Intrinsics.checkNotNullParameter("loading_jht_balance_result", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                    TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("loading_jht_balance_result", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_jht_balance_result", mapMutableMapOf);
                } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                    Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_jht_balance", "success_jht_balance_result"));
                    Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                    Intrinsics.checkNotNullParameter("success_jht_balance_result", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                    TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("success_jht_balance_result", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_jht_balance_result", mapMutableMapOf2);
                    VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                    claimOldDaySecurityTermsConditionActivity.MediaBrowserCompat = ((JhtBalance) ((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).get(0)).b.toString();
                    claimOldDaySecurityTermsConditionActivity.f587a = ((JhtBalance) ((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).get(0)).TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString();
                    claimOldDaySecurityTermsConditionActivity.cancel = ((JhtBalance) ((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).get(0)).TuitionPaymentFragmentbindingInflater1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(675719463, new Object[]{claimOldDaySecurityTermsConditionActivity}, ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), -675719463, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
                } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_jht_balance", "failure_jht_balance_result"));
                    Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                    Intrinsics.checkNotNullParameter("failure_jht_balance_result", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                    TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("failure_jht_balance_result", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_jht_balance_result", mapMutableMapOf3);
                    claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer();
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    String string = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_retry);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    claimOldDaySecurityTermsConditionActivity.INotificationSideChannelStub = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_info_blue, "", strValueOf, string, new Function0() { // from class: Camera2CaptureCallbacksComboSessionCaptureCallback
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ClaimOldDaySecurityTermsConditionActivity.INotificationSideChannelStub(this.TuitionPaymentFragmentbindingInflater1);
                        }
                    }, claimOldDaySecurityTermsConditionActivity.getString(R.string.action_return), new Function0() { // from class: onCaptureSequenceCompleted
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return (Unit) ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(376486216, new Object[]{this.TuitionPaymentFragmentbindingInflater1}, ScholarshipHistoryRequest.b(), -376486210, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
                        }
                    });
                    int i21 = getNotifyChildrenChangedOptions + 23;
                    getRoot = i21 % 128;
                    int i22 = i21 % 2;
                } else {
                    claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer();
                }
                return Unit.INSTANCE;
            case 3:
                final ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity2 = (ClaimOldDaySecurityTermsConditionActivity) objArr[0];
                int i23 = 2 % 2;
                ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity3 = claimOldDaySecurityTermsConditionActivity2;
                ((Camera2CameraControlImplExternalSyntheticLambda4) claimOldDaySecurityTermsConditionActivity2.notify.getValue()).b.observe(claimOldDaySecurityTermsConditionActivity3, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: Camera2CameraInfoImplRedirectableLiveDataExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
                    }
                }));
                ((isModeInList) claimOldDaySecurityTermsConditionActivity2.INotificationSideChannel.getValue()).TuitionPaymentFragmentbindingInflater1.observe(claimOldDaySecurityTermsConditionActivity3, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: redirectTo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return (Unit) ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1222648970, new Object[]{this.b, (VirtualCameraAdapter1) obj}, ScholarshipHistoryRequest.b(), 1222648972, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
                    }
                }));
                ((Camera2CameraControlImplExternalSyntheticLambda4) claimOldDaySecurityTermsConditionActivity2.notify.getValue()).TuitionPaymentFragmentbindingInflater1.observe(claimOldDaySecurityTermsConditionActivity3, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: onCaptureSequenceAborted
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
                    }
                }));
                ((getStreamUseCaseSupportedCombinationList) claimOldDaySecurityTermsConditionActivity2.RemoteActionCompatParcelizer.getValue()).b.observe(claimOldDaySecurityTermsConditionActivity3, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: onCaptureBufferLost
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VirtualCameraAdapter1) obj);
                    }
                }));
                int i24 = getRoot + 95;
                getNotifyChildrenChangedOptions = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 4:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 5:
                return b(objArr);
            case 6:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 7:
                return a(objArr);
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity.$$a
            int r9 = r9 * 14
            int r9 = r9 + 84
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
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
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity.c(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity.$$j
            int r6 = r6 * 8
            int r6 = 46 - r6
            int r8 = r8 * 5
            int r8 = r8 + 79
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity.f(short, int, int, java.lang.Object[]):void");
    }

    public ClaimOldDaySecurityTermsConditionActivity() {
        final ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity = this;
        this.notify = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = claimOldDaySecurityTermsConditionActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = claimOldDaySecurityTermsConditionActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.RemoteActionCompatParcelizer = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = claimOldDaySecurityTermsConditionActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        final ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity2 = this;
        this.INotificationSideChannel = LazyKt.lazy(new Function0<isModeInList>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [isModeInList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final isModeInList invoke() {
                ComponentCallbacks componentCallbacks = claimOldDaySecurityTermsConditionActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(isModeInList.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimOldDaySecurityTermsConditionActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "codeSegmen", "", "codePengajuan", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1 {
        private TuitionPaymentFragmentbindingInflater1() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, String str, String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent(context, (Class<?>) ClaimOldDaySecurityTermsConditionActivity.class);
            intent.putExtra("codeSegmen", str);
            intent.putExtra("codePengajuan", str2);
            context.startActivity(intent);
        }

        public /* synthetic */ TuitionPaymentFragmentbindingInflater1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityClaimOldDaySecurityTermsConditionBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 67;
        getRoot = i2 % 128;
        if (i2 % 2 == 0) {
            ClaimOldDaySecurityTermsConditionActivity$bindingInflater$1 claimOldDaySecurityTermsConditionActivity$bindingInflater$1 = ClaimOldDaySecurityTermsConditionActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ClaimOldDaySecurityTermsConditionActivity$bindingInflater$1 claimOldDaySecurityTermsConditionActivity$bindingInflater$2 = ClaimOldDaySecurityTermsConditionActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = getRoot + 115;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        return claimOldDaySecurityTermsConditionActivity$bindingInflater$2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            int i4 = $11 + 35;
            $10 = i4 % 128;
            char c2 = 1;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            int i5 = 58224;
            while (i2 < 16) {
                int i6 = $10 + 67;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i8 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) disconnect) ^ 8611973335120459638L)));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getItem);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c2] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16824989);
                        int iIndexOf = 467 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iIndexOf, i10, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) write) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(read)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 47772), 468 - TextUtils.indexOf("", "", 0, 0), Color.red(0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i2++;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myTid() >> 22), 2323 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, -1312321721, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i11 = $11 + 75;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        final ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity = (ClaimOldDaySecurityTermsConditionActivity) objArr[0];
        int i = 2 % 2;
        ActivityClaimOldDaySecurityTermsConditionBinding activityClaimOldDaySecurityTermsConditionBinding = (ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        MaterialButton materialButton = activityClaimOldDaySecurityTermsConditionBinding.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: lambdawaitForResult0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClaimOldDaySecurityTermsConditionActivity.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        MaterialCardView materialCardView = activityClaimOldDaySecurityTermsConditionBinding.cvLastRsjht;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialCardView, new Function0() { // from class: is3AConverged
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        TextView textView = activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceTuition;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textView, new Function0() { // from class: isFlashRequired
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (Unit) ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(794907566, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3}, ScholarshipHistoryRequest.b(), -794907561, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
            }
        });
        int i2 = getRoot + 123;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 111;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("codeSegmen");
        if (stringExtra == null) {
            stringExtra = "";
            int i4 = getNotifyChildrenChangedOptions + 53;
            getRoot = i4 % 128;
            int i5 = i4 % 2;
        }
        this.d = stringExtra;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            ClaimOldDaySecurityTermsConditionActivity.this.d_();
        }
    }

    public static final class b implements getStringOrNull.b {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public static int b;

        b() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            ClaimOldDaySecurityTermsConditionActivity.this.d_();
        }

        public static int b() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = i % 7794691;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
            if (i2 != 0) {
                return b;
            }
            int iNextInt = new Random().nextInt(870262353);
            b = iNextInt;
            return iNextInt;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        String str2;
        int i = 2 % 2;
        User user = (User) this.connect.getValue();
        Object obj = null;
        if (user != null) {
            str = user.b;
            int i2 = getNotifyChildrenChangedOptions + 121;
            getRoot = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = null;
        }
        String str3 = str;
        if (str3 != null) {
            int i4 = getNotifyChildrenChangedOptions + 85;
            getRoot = i4 % 128;
            int i5 = i4 % 2;
            if (str3.length() != 0) {
                int i6 = getNotifyChildrenChangedOptions + 63;
                getRoot = i6 % 128;
                int i7 = i6 % 2;
                final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) this.notify.getValue();
                String str4 = this.d;
                Intrinsics.checkNotNullParameter(str4, "");
                MutableLiveData<VirtualCameraAdapter1<JhtClaimEligibility>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                User userAsBinder = camera2CameraControlImplExternalSyntheticLambda4.IconCompatParcelizer.asBinder();
                setContentView setcontentviewTuitionPaymentFragmentspecialinlinedviewModeldefault2 = camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if (userAsBinder != null) {
                    String str5 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (str5 == null) {
                        int i8 = getNotifyChildrenChangedOptions + 75;
                        getRoot = i8 % 128;
                        int i9 = i8 % 2;
                        str5 = "";
                    }
                    if (setcontentviewTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        int i10 = getNotifyChildrenChangedOptions + 57;
                        getRoot = i10 % 128;
                        if (i10 % 2 == 0) {
                            String str6 = setcontentviewTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            obj.hashCode();
                            throw null;
                        }
                        str2 = setcontentviewTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1(new ClaimCheckEligibilityRequest(str5, str2, str4))));
                    final Function1 function1 = new Function1() { // from class: getBackwardCompatibleCameraIds
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(camera2CameraControlImplExternalSyntheticLambda4, (JhtClaimEligibility) obj2);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: getAvailableCameraIds
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function1.invoke(obj2);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: getCameraCoordinator
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannel(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj2);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: r8lambdaivGBw9nrg4lh3jZXyyT4rq1nf8w
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function2.invoke(obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    return;
                }
                return;
            }
        }
        LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
        LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
        d_();
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends OnBackPressedCallback {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            super(true);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() {
            ClaimOldDaySecurityTermsConditionActivity.this.finish();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity = this;
        Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
        claimOldDaySecurityTermsConditionActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_claim_old_day_security));
        String strValueOf = String.valueOf(Calendar.getInstance().get(1));
        TextView textView = ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvTitleInformationJhtLast;
        int i2 = Integer.parseInt(strValueOf);
        StringBuilder sb = new StringBuilder("Rincian Saldo JHT Tahun ");
        sb.append(i2 - 1);
        textView.setText(sb.toString());
        ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvTitleInformationJht.setText("Rincian Saldo JHT Tahun ".concat(String.valueOf(strValueOf)));
        getOnBackPressedDispatcher().addCallback(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i3 = getRoot + 93;
        getNotifyChildrenChangedOptions = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArr2;
        int i = 0;
        ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity = (ClaimOldDaySecurityTermsConditionActivity) objArr[0];
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char size = (char) (View.MeasureSpec.getSize(0) + 43042);
            int iAlpha = Color.alpha(0) + 3111;
            int iIndexOf = TextUtils.indexOf("", "") + 22;
            byte[] bArr = $$a;
            short s = bArr[132];
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            c(s, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, iAlpha, iIndexOf, -1272852037, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{49937, 20816, 13887, 11825, 64967, 25430, 23149, 44780, 12285, 2282, 14628, 63926, 58490, 59862, 59540, 22870, 43620, 51256, 7479, 59636, 18282, 15730, 23687, 32728}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_while_encrypting_data).substring(0, 39).codePointAt(8) - 79, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{58629, 13562, 55969, 41573, 9409, 32530, 37827, 57631, 24204, 18157, 47663, 61586, 25327, 41853, 51462, 4921, 14461, 1526}, 15 - View.combineMeasuredStates(0, 0), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (43043 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int capsMode = 3111 - TextUtils.getCapsMode("", 0, 0);
            int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
            byte b3 = $$a[7];
            Object[] objArr6 = new Object[1];
            c((short) 51, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, capsMode, iResolveOpacity, -1269618118, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = getRoot + 97;
            getNotifyChildrenChangedOptions = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43043);
                int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3110;
                int iAxisFromString = MotionEvent.axisFromString("") + 23;
                Object[] objArr7 = new Object[1];
                c((short) ($$b + 2), (byte) 15, $$a[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, i5, iAxisFromString, 154975793, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr8[2])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i6};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i8 = 1312898920 + (((-270867) | iFreeMemory) * (-627)) + (((~((-1033622669) | iFreeMemory)) | 671408790) * (-627)) + (((~(iFreeMemory | 671408790)) | (~((~iFreeMemory) | 1033622668))) * 627) + 482983438;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr2[0])[0] = i10 ^ (i10 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i7}, iArr, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{31905, 28576, 25761, 29631, 17495, 2909, 48955, 63471, 4437, 16359, 52868, 21841, 10422, 12474, 3270, 43227, 29874, 2974}, TextUtils.getTrimmedLength("") + 16, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{18151, 33710, 10168, 24201, 24130, 53164, 2526, 508, 22583, 17122, 38755, 25113, 46848, 16126, 48552, 28811, 5119, 7798}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr10);
            try {
                Object[] objArr11 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, claimOldDaySecurityTermsConditionActivity)).intValue()), 0, 482983438};
                byte[] bArr2 = $$j;
                byte b4 = bArr2[59];
                Object[] objArr12 = new Object[1];
                f(b4, bArr2[47], b4, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b5 = bArr2[47];
                Object[] objArr13 = new Object[1];
                f((byte) (-b5), (byte) 44, (byte) (-b5), objArr13);
                objArr2 = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char jumpTapTimeout = (char) (43042 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int iIndexOf2 = 3111 - TextUtils.indexOf("", "");
                    int scrollBarSize = 22 - (ViewConfiguration.getScrollBarSize() >> 8);
                    Object[] objArr14 = new Object[1];
                    c((short) ($$b + 2), (byte) 15, $$a[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, iIndexOf2, scrollBarSize, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{49937, 20816, 13887, 11825, 64967, 25430, 23149, 44780, 12285, 2282, 14628, 63926, 58490, 59862, 59540, 22870, 43620, 51256, 7479, 59636, 18282, 15730, 23687, 32728}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto6_bni).substring(8, 9).codePointAt(0) - 10, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{58629, 13562, 55969, 41573, 9409, 32530, 37827, 57631, 24204, 18157, 47663, 61586, 25327, 41853, 51462, 4921, 14461, 1526}, 15 - View.MeasureSpec.getMode(0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43042);
                        int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3110;
                        int keyRepeatDelay = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b6 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((short) 51, b6, b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, i11, keyRepeatDelay, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43042);
                        int edgeSlop = 3111 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iBlue = Color.blue(0) + 22;
                        byte[] bArr3 = $$a;
                        short s2 = bArr3[132];
                        byte b7 = bArr3[7];
                        Object[] objArr18 = new Object[1];
                        c(s2, b7, b7, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, edgeSlop, iBlue, -1272852037, false, (String) objArr18[0], null);
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
        int i12 = ((int[]) objArr2[1])[0];
        int i13 = ((int[]) objArr2[2])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[3];
            if (strArr2 != null) {
                while (i < strArr2.length) {
                    int i14 = getNotifyChildrenChangedOptions + 33;
                    getRoot = i14 % 128;
                    if (i14 % 2 == 0) {
                        arrayList.add(strArr2[i]);
                        i += 106;
                    } else {
                        arrayList.add(strArr2[i]);
                        i++;
                    }
                    int i15 = getNotifyChildrenChangedOptions + 9;
                    getRoot = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i17 = ((int[]) objArr2[0])[0];
        int i18 = ((int[]) objArr2[2])[0];
        int i19 = ((int[]) objArr2[1])[0];
        String[] strArr3 = (String[]) objArr2[3];
        int[] iArr2 = {i18};
        int iNextInt = new Random().nextInt(1393517749);
        int i20 = ~iNextInt;
        int i21 = i17 + 1739474114 + ((~(607058274 | i20)) * (-560)) + ((~(iNextInt | (-1095828609))) * (-560)) + (((~(1097973184 | i20)) | 604913698) * 560);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr[0])[0] = i23 ^ (i23 << 5);
        Object[] objArr19 = {new int[1], new int[]{i19}, iArr2, strArr3};
        int i24 = getNotifyChildrenChangedOptions + 3;
        getRoot = i24 % 128;
        int i25 = i24 % 2;
        Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) claimOldDaySecurityTermsConditionActivity.notify.getValue();
        User user = (User) claimOldDaySecurityTermsConditionActivity.connect.getValue();
        Intrinsics.checkNotNull(user);
        String str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        camera2CameraControlImplExternalSyntheticLambda4.b();
        return null;
    }

    public static final class asBinder implements lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.b {
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        asBinder(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        @Override // lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimOldDaySecurityTermsConditionActivity.this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "Klaim JHT", 0, null, false, 56);
            ClaimOldDaySecurityTermsConditionActivity.this.d_();
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = getRoot + 73;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        ActivityClaimOldDaySecurityTermsConditionBinding activityClaimOldDaySecurityTermsConditionBinding = (ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityClaimOldDaySecurityTermsConditionBinding.tvTitleInfoBalanceJht.setVisibility(0);
        activityClaimOldDaySecurityTermsConditionBinding.cvLastRsjht.setVisibility(0);
        activityClaimOldDaySecurityTermsConditionBinding.cvCurrentRsjht.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = activityClaimOldDaySecurityTermsConditionBinding.btnNext.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.topToBottom = R.id.cvCurrentRsjht;
        activityClaimOldDaySecurityTermsConditionBinding.btnNext.setLayoutParams(layoutParams2);
        int i4 = getRoot + 81;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 45;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        ActivityClaimOldDaySecurityTermsConditionBinding activityClaimOldDaySecurityTermsConditionBinding = (ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityClaimOldDaySecurityTermsConditionBinding.tvTitleInfoBalanceJht.setVisibility(8);
        activityClaimOldDaySecurityTermsConditionBinding.cvLastRsjht.setVisibility(8);
        activityClaimOldDaySecurityTermsConditionBinding.cvCurrentRsjht.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = activityClaimOldDaySecurityTermsConditionBinding.btnNext.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.topToBottom = R.id.tvMembershipStatus;
        activityClaimOldDaySecurityTermsConditionBinding.btnNext.setLayoutParams(layoutParams2);
        int i4 = getRoot + 93;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity, int i, String str, String str2, String str3, String str4, Function0 function0, Function0 function1, int i2) {
        int i3;
        String str5;
        int i4 = 2 % 2;
        int i5 = getRoot;
        int i6 = i5 + 7;
        getNotifyChildrenChangedOptions = i6 % 128;
        int i7 = i6 % 2;
        if ((i2 & 1) != 0) {
            int i8 = i5 + 29;
            getNotifyChildrenChangedOptions = i8 % 128;
            int i9 = i8 % 2;
            i3 = R.drawable.ic_info_blue;
        } else {
            i3 = i;
        }
        String str6 = "";
        String str7 = (i2 & 2) != 0 ? "" : str;
        String str8 = (i2 & 4) != 0 ? "" : str2;
        if ((i2 & 8) != 0) {
            int i10 = i5 + 5;
            getNotifyChildrenChangedOptions = i10 % 128;
            int i11 = i10 % 2;
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i2 & 16) != 0) {
            int i12 = i5 + 19;
            getNotifyChildrenChangedOptions = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str6 = str4;
        }
        claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i3, str7, str8, str5, str6, (Function0<Unit>) ((i2 & 32) != 0 ? new Function0() { // from class: Camera2CameraInfoImplRedirectableLiveData
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClaimOldDaySecurityTermsConditionActivity.notify(this.b);
            }
        } : function0), (Function0<Unit>) ((i2 & 64) != 0 ? new Function0() { // from class: createNoOpCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClaimOldDaySecurityTermsConditionActivity.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } : function1));
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function1) {
        int i2 = 2 % 2;
        int i3 = getNotifyChildrenChangedOptions + 51;
        getRoot = i3 % 128;
        int i4 = i3 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, str, str2, str3, function0, str4, function1);
        this.INotificationSideChannelDefault = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        int i5 = getRoot + 97;
        getNotifyChildrenChangedOptions = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        int i = 2 % 2;
        int i2 = getRoot + 57;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(item);
        try {
            Intrinsics.checkNotNullParameter(item, "");
            if (item.getItemId() == 16908332) {
                int i4 = getRoot + 85;
                getNotifyChildrenChangedOptions = i4 % 128;
                int i5 = i4 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            return super.onOptionsItemSelected(item);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int iMyPid = 1031 - (Process.myPid() >> 22);
            int iIndexOf = TextUtils.indexOf("", "") + 15;
            byte[] bArr = $$a;
            short s = bArr[132];
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(s, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iMyPid, iIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{49937, 20816, 13887, 11825, 64967, 25430, 23149, 44780, 12285, 2282, 14628, 63926, 58490, 59862, 59540, 22870, 43620, 51256, 7479, 59636, 18282, 15730, 23687, 32728}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{58629, 13562, 55969, 41573, 9409, 32530, 37827, 57631, 24204, 18157, 47663, 61586, 25327, 41853, 51462, 4921, 14461, 1526}, Process.getGidForName("") + 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
            int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 16;
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 51, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i2, iIndexOf2, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = getNotifyChildrenChangedOptions + 19;
            getRoot = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 1031;
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
                Object[] objArr6 = new Object[1];
                c((short) ($$b + 2), (byte) 52, $$a[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, deadChar, capsMode, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i7 = 2077728567 + ((225350789 | startElapsedRealtime) * 614);
            int i8 = ~startElapsedRealtime;
            int i9 = i7 + (((~((-32697332) | i8)) | 23232641 | (~(211582838 | i8))) * (-1228)) + (((~(i8 | 234815479)) | (~((-9464691) | i8))) * 614) + 1712940873;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{31905, 28576, 25761, 29631, 17495, 2909, 48955, 63471, 4437, 16359, 52868, 21841, 10422, 12474, 3270, 43227, 29874, 2974}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_cvv).substring(12, 13).codePointAt(0) - 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{18151, 33710, 10168, 24201, 24130, 53164, 2526, 508, 22583, 17122, 38755, 25113, 46848, 16126, 48552, 28811, 5119, 7798}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_not_straight).substring(0, 31).length() - 15, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1259403472};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 46038), (Process.myPid() >> 22) + 1134, TextUtils.lastIndexOf("", '0', 0, 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1712940873, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int iArgb = 1031 - Color.argb(0, 0, 0, 0);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
                    byte[] bArr2 = $$a;
                    short s2 = bArr2[132];
                    byte b4 = bArr2[7];
                    Object[] objArr12 = new Object[1];
                    c(s2, b4, b4, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iArgb, modifierMetaStateMask, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetBefore("", 0) + 45993), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1117, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iMyTid = 15 - (Process.myTid() >> 22);
                    Object[] objArr13 = new Object[1];
                    c((short) ($$b + 2), (byte) 52, $$a[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, keyRepeatTimeout, iMyTid, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{49937, 20816, 13887, 11825, 64967, 25430, 23149, 44780, 12285, 2282, 14628, 63926, 58490, 59862, 59540, 22870, 43620, 51256, 7479, 59636, 18282, 15730, 23687, 32728}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_payment_successful).substring(0, 1).codePointAt(0) - 58, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{58629, 13562, 55969, 41573, 9409, 32530, 37827, 57631, 24204, 18157, 47663, 61586, 25327, 41853, 51462, 4921, 14461, 1526}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 94, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int modifierMetaStateMask2 = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
                        byte b5 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 51, b5, b5, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(absoluteGravity, modifierMetaStateMask2, iResolveSizeAndState, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int offsetBefore = 1031 - TextUtils.getOffsetBefore("", 0);
                        int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                        byte[] bArr3 = $$a;
                        short s3 = bArr3[132];
                        byte b6 = bArr3[7];
                        Object[] objArr17 = new Object[1];
                        c(s3, b6, b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRgb, offsetBefore, packedPositionChild, 1357589585, false, (String) objArr17[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i17 = ~System.identityHashCode(this);
            int i18 = i14 + 1034897099 + (((-541065349) | i17) * 494) + (((~(i17 | (-574621829))) | 311393130) * 494);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i21 = 0;
                while (i21 < strArr3.length) {
                    int i22 = getRoot + 35;
                    getNotifyChildrenChangedOptions = i22 % 128;
                    if (i22 % 2 != 0) {
                        arrayList.add(strArr3[i21]);
                        i21 += 40;
                    } else {
                        arrayList.add(strArr3[i21]);
                        i21++;
                    }
                }
            }
            int[] iArr = new int[i13];
            int i23 = i13 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i23) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i27 = ~startElapsedRealtime2;
            int i28 = i24 + 619806392 + ((startElapsedRealtime2 | 182358211) * (-859)) + (((~(startElapsedRealtime2 | (-43028611))) | (~(182358211 | i27))) * 859) + (((~((-61921959) | i27)) | 18893348) * 859);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr19[2])[0] = i30 ^ (i30 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) (29944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int iRed = Color.red(0) + 1755;
            int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
            Object[] objArr20 = new Object[1];
            c((short) ($$b + 2), (byte) 15, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iRed, iLastIndexOf, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
                int packedPositionChild2 = 1754 - ExpandableListView.getPackedPositionChild(0L);
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 24;
                byte b7 = $$a[7];
                Object[] objArr21 = new Object[1];
                c((short) 51, b7, b7, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(modifierMetaStateMask3, packedPositionChild2, iLastIndexOf2, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iMyUid = Process.myUid();
            int i31 = ~((-1038459475) | iMyUid);
            int i32 = ~iMyUid;
            int i33 = (((1927559185 + ((i31 | (~((-825857049) | i32))) * (-1808))) + (((~((-214180419) | iMyUid)) | (~(i32 | (-1577993)))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(iMyUid | 825857048)) | 824279056) | (~(1038459474 | i32))) * TypedValues.Custom.TYPE_BOOLEAN)) - 1341014704;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{31905, 28576, 25761, 29631, 17495, 2909, 48955, 63471, 4437, 16359, 52868, 21841, 10422, 12474, 3270, 43227, 29874, 2974}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{18151, 33710, 10168, 24201, 24130, 53164, 2526, 508, 22583, 17122, 38755, 25113, 46848, 16126, 48552, 28811, 5119, 7798}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_kioson).substring(1, 3).codePointAt(1) - 105, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1259403472};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42050 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1725 - TextUtils.lastIndexOf("", '0', 0), (Process.myPid() >> 22) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1341014704, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                int iRed2 = 1755 - Color.red(0);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                byte b8 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((short) 51, b8, b8, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarSize, iRed2, iMakeMeasureSpec, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{49937, 20816, 13887, 11825, 64967, 25430, 23149, 44780, 12285, 2282, 14628, 63926, 58490, 59862, 59540, 22870, 43620, 51256, 7479, 59636, 18282, 15730, 23687, 32728}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 95, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{58629, 13562, 55969, 41573, 9409, 32530, 37827, 57631, 24204, 18157, 47663, 61586, 25327, 41853, 51462, 4921, 14461, 1526}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step2).substring(4, 5).length() + 14, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                    int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                    int tapTimeout2 = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b9 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 140, b9, b9, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf2, iKeyCodeFromString, tapTimeout2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int i36 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int size = View.MeasureSpec.getSize(0) + 23;
                    Object[] objArr30 = new Object[1];
                    c((short) ($$b + 2), (byte) 15, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(windowTouchSlop, i36, size, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr5 == null) {
                throw null;
            }
            for (String str : strArr5) {
                arrayList2.add(str);
            }
            throw null;
        }
        int i37 = getRoot + 117;
        getNotifyChildrenChangedOptions = i37 % 128;
        int i38 = i37 % 2;
        int i39 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int i40 = (~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.install_gojek_message).substring(0, 8).length() - 1179423554)) | 186527760;
        int i41 = i39 + 106504232 + (i40 * 495) + (((~i40) | 17567744) * 495);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr31[3])[0] = i43 ^ (i43 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1535068501
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity.onResume():void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity = (ClaimOldDaySecurityTermsConditionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 105;
        getRoot = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = ~elapsedCpuTime;
            if (i3 != ((((~(i4 | (-1075882162))) | ((~((-245894619) | i4)) | 2099344)) * (-397)) - 904055564) + ((elapsedCpuTime | (-1317578092)) * 397)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iMyPid = Process.myPid();
            int i6 = ~iMyPid;
            if (i5 != ((((~(1474293113 | i6)) | (~((-1141441577) | iMyPid))) * 988) - 1164089084) + (((~(iMyPid | 1162839080)) | 311454033 | (~(i6 | (-1141441577)))) * 988)) {
                throw null;
            }
        }
        int i7 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i7 != (-778344900) + ((1717292391 | iElapsedRealtime) * 376) + (((~((~iElapsedRealtime) | 277776882)) | 1716601861) * (-376)) + (((~(iElapsedRealtime | (-277776883))) | (-1993688214)) * 376)) {
            int i8 = (-1730156202) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i9 = getNotifyChildrenChangedOptions + 73;
        getRoot = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 29;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_telkomsel_cash).substring(1, 3).length() - 1615877980;
        int i5 = ~length;
        if (i4 != ((((~(1265362470 | i5)) | (~(length | 435374927))) * 959) - 1910394383) + (((~(length | 1265362470)) | (~(i5 | 435374927))) * 959)) {
            throw new RuntimeException("714947531");
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_primary_cta_text).substring(0, 6).length() - 1635802865;
        int i7 = ~length2;
        int i8 = (~((-1000070715) | i7)) | 562206744;
        int i9 = ~(length2 | (-1141121281));
        if (i6 != 2129852212 + ((i8 | i9) * (-713)) + (i9 * 1426) + ((~((-1578985251) | i7)) * 713)) {
            int i10 = (-2026214072) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i11 = getNotifyChildrenChangedOptions + 7;
        getRoot = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getRoot + 19;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        claimOldDaySecurityTermsConditionActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getRoot + 119;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity2 = claimOldDaySecurityTermsConditionActivity;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_rsjht", "view_rsjht"));
        Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity2, "");
        Intrinsics.checkNotNullParameter("view_rsjht", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_rsjht", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_rsjht", mapMutableMapOf);
        if (claimOldDaySecurityTermsConditionActivity.cancel != null) {
            int i2 = getRoot + 121;
            int i3 = i2 % 128;
            getNotifyChildrenChangedOptions = i3;
            int i4 = i2 % 2;
            if (claimOldDaySecurityTermsConditionActivity.f587a != null) {
                int i5 = i3 + 91;
                getRoot = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 67 / 0;
                    if (claimOldDaySecurityTermsConditionActivity.MediaBrowserCompat != null) {
                        String str = claimOldDaySecurityTermsConditionActivity.g;
                    }
                } else if (claimOldDaySecurityTermsConditionActivity.MediaBrowserCompat != null) {
                    String str2 = claimOldDaySecurityTermsConditionActivity.g;
                }
            }
        }
        Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_rsjht_not_found", "rsjht_not_found"));
        Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity2, "");
        Intrinsics.checkNotNullParameter("rsjht_not_found", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("rsjht_not_found", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("rsjht_not_found", mapMutableMapOf2);
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, "RSJHT Belum Tersedia", string2, null, 112);
        claimOldDaySecurityTermsConditionActivity.INotificationSideChannelStub = getstringornullB;
        if (getstringornullB != null) {
            FragmentManager supportFragmentManager = claimOldDaySecurityTermsConditionActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity, Ref.ObjectRef objectRef) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 119;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, (String) objectRef.element, "Appointment Online", 0, null, false, 56);
        claimOldDaySecurityTermsConditionActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getRoot + 73;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 5;
        getRoot = i2 % 128;
        if (i2 % 2 != 0) {
            claimOldDaySecurityTermsConditionActivity.d_();
            return Unit.INSTANCE;
        }
        claimOldDaySecurityTermsConditionActivity.d_();
        int i3 = 42 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity = (ClaimOldDaySecurityTermsConditionActivity) objArr[0];
        int i = 2 % 2;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_detail_tuition_on_claim_jht", "view_detail_tuition_on_claim_jht"));
        Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
        Intrinsics.checkNotNullParameter("view_detail_tuition_on_claim_jht", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_detail_tuition_on_claim_jht", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_detail_tuition_on_claim_jht", mapMutableMapOf);
        setTimeout3A.Companion companion = setTimeout3A.INSTANCE;
        setTimeout3A settimeout3aTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setTimeout3A.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        FragmentManager supportFragmentManager = claimOldDaySecurityTermsConditionActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(settimeout3aTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = getNotifyChildrenChangedOptions + 39;
            getRoot = i2 % 128;
            int i3 = i2 % 2;
            settimeout3aTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, settimeout3aTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i4 = getRoot + 95;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 115;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        CheckEligibilityOldDaySecurityActivity.Companion tuitionPaymentFragmentbindingInflater1 = CheckEligibilityOldDaySecurityActivity.INSTANCE;
        CheckEligibilityOldDaySecurityActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, claimOldDaySecurityTermsConditionActivity.asInterface);
        Unit unit = Unit.INSTANCE;
        int i4 = getRoot + 121;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ User d(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 91;
        getRoot = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            throw null;
        }
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i3 = getRoot + 9;
        getNotifyChildrenChangedOptions = i3 % 128;
        if (i3 % 2 == 0) {
            return userAsBinder;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ setContentView g(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getRoot + 57;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        setContentView setcontentviewTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((Camera2CameraControlImplExternalSyntheticLambda4) claimOldDaySecurityTermsConditionActivity.notify.getValue()).INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i4 = getRoot + 75;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
        return setcontentviewTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0147  */
    public static /* synthetic */ Unit asBinder(final ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        String statusPensiun;
        String statusUpdateData;
        int i = 2 % 2;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_check_eligibility_claim_jht", "check_eligibility_claim_jht"));
        Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
        Intrinsics.checkNotNullParameter("check_eligibility_claim_jht", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("check_eligibility_claim_jht", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("check_eligibility_claim_jht", mapMutableMapOf);
        InfoPraClaimItem infoPraClaimItem = claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String statusMembership = null;
        if (infoPraClaimItem != null) {
            int i2 = getRoot + 69;
            getNotifyChildrenChangedOptions = i2 % 128;
            int i3 = i2 % 2;
            statusPensiun = infoPraClaimItem.getStatusPensiun();
        } else {
            statusPensiun = null;
        }
        if (Intrinsics.areEqual(statusPensiun, "Y")) {
            InfoPraClaimItem infoPraClaimItem2 = claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (!Intrinsics.areEqual(infoPraClaimItem2 != null ? infoPraClaimItem2.getStatusUpdateData() : null, "Y")) {
                String string = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = claimOldDaySecurityTermsConditionActivity.getString(R.string.message_check_term_condition);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, R.drawable.ic_info_blue, string, string2, string3, null, null, null, 112);
                int i4 = getNotifyChildrenChangedOptions + 97;
                getRoot = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = getNotifyChildrenChangedOptions + 29;
                getRoot = i6 % 128;
                int i7 = i6 % 2;
                InfoPraClaimItem infoPraClaimItem3 = claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (Intrinsics.areEqual(infoPraClaimItem3 != null ? infoPraClaimItem3.getStatusMaksimumBalanceJht() : null, ExifInterface.GPS_DIRECTION_TRUE)) {
                    String string4 = claimOldDaySecurityTermsConditionActivity.getString(R.string.label_eligible_for_old_day_security);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String str = claimOldDaySecurityTermsConditionActivity.asBinder;
                    String string5 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, R.drawable.ic_document_success, string4, str, string5, null, new Function0() { // from class: Camera2CaptureCallbacks
                        private static final byte[] $$c = {106, -22, 107, 95};
                        private static final int $$f = 173;
                        private static int $10 = 0;
                        private static int $11 = 1;
                        private static final byte[] $$d = {104, 27, -72, 120, -3, 26, -40, 45, 28, 0, 17, 10, -13, 30, 7, 29, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
                        private static final int $$e = 220;
                        private static final byte[] $$a = {83, -44, 103, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
                        private static final int $$b = 231;
                        private static int TuitionPaymentFragmentbindingInflater1 = 0;
                        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
                        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {57184, 57188, 57189, 60054, 60073, 60117, 57186, 57191, 60051, 57187, 60048, 57190, 57192, 60034, 60041, 60062, 60043, 60063, 60040, 57193, 60047, 60046, 60072, 60083, 60053, 60045, 60052, 60088, 60079, 60090, 60058, 60055, 60056, 60050, 60060, 60049};
                        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57191;

                        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static void a(short r5, byte r6, byte r7, java.lang.Object[] r8) {
                            /*
                                int r6 = r6 + 84
                                int r5 = r5 * 52
                                int r5 = r5 + 1
                                byte[] r0 = defpackage.Camera2CaptureCallbacks.$$a
                                int r7 = r7 * 52
                                int r7 = 56 - r7
                                byte[] r1 = new byte[r5]
                                r2 = 0
                                if (r0 != 0) goto L15
                                r4 = r6
                                r3 = r2
                                r6 = r5
                                goto L27
                            L15:
                                r3 = r2
                            L16:
                                byte r4 = (byte) r6
                                r1[r3] = r4
                                int r3 = r3 + 1
                                if (r3 != r5) goto L25
                                java.lang.String r5 = new java.lang.String
                                r5.<init>(r1, r2)
                                r8[r2] = r5
                                return
                            L25:
                                r4 = r0[r7]
                            L27:
                                int r6 = r6 + r4
                                int r7 = r7 + 1
                                int r6 = r6 + (-11)
                                goto L16
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2CaptureCallbacks.a(short, byte, byte, java.lang.Object[]):void");
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
                        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
                            /*
                                int r8 = r8 + 4
                                int r6 = r6 * 31
                                int r6 = r6 + 84
                                byte[] r0 = defpackage.Camera2CaptureCallbacks.$$d
                                int r7 = r7 * 40
                                int r1 = 53 - r7
                                byte[] r1 = new byte[r1]
                                int r7 = 52 - r7
                                r2 = 0
                                if (r0 != 0) goto L16
                                r3 = r8
                                r4 = r2
                                goto L32
                            L16:
                                r3 = r2
                            L17:
                                r5 = r8
                                r8 = r6
                                r6 = r5
                                byte r4 = (byte) r8
                                r1[r3] = r4
                                int r6 = r6 + 1
                                if (r3 != r7) goto L29
                                java.lang.String r6 = new java.lang.String
                                r6.<init>(r1, r2)
                                r9[r2] = r6
                                return
                            L29:
                                r4 = r0[r6]
                                int r3 = r3 + 1
                                r5 = r8
                                r8 = r6
                                r6 = r4
                                r4 = r3
                                r3 = r5
                            L32:
                                int r3 = r3 + r6
                                int r6 = r3 + (-11)
                                r3 = r4
                                goto L17
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2CaptureCallbacks.d(byte, byte, short, java.lang.Object[]):void");
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() throws Throwable {
                            Object[] objArr;
                            int i8 = 2 % 2;
                            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                            int i10 = i9 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                int iMakeMeasureSpec = 876 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                int iArgb = 10 - Color.argb(0, 0, 0, 0);
                                byte[] bArr = $$a;
                                byte b2 = bArr[7];
                                Object[] objArr2 = new Object[1];
                                a(b2, (byte) (b2 | 14), (byte) (-bArr[5]), objArr2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, iMakeMeasureSpec, iArgb, 252381699, false, (String) objArr2[0], null);
                            }
                            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                            Object[] objArr3 = new Object[1];
                            c(new char[]{0, 30, '\f', 15, 27, ' ', 23, 11, 24, 20, 4, 23, '\f', 19, 21, 14, '\t', '!', ' ', 25, Typography.quote, '\b'}, (byte) (ImageFormat.getBitsPerPixel(0) + 18), (ViewConfiguration.getTapTimeout() >> 16) + 22, objArr3);
                            Class<?> cls = Class.forName((String) objArr3[0]);
                            Object[] objArr4 = new Object[1];
                            c(new char[]{'\r', '!', Typography.quote, '\f', 21, '\f', 16, 5, '\f', '!', ' ', 19, 3, '\t', 13848}, (byte) (25 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, objArr4);
                            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                                byte[] bArr2 = $$a;
                                byte b3 = bArr2[5];
                                Object[] objArr5 = new Object[1];
                                a((byte) (-b3), bArr2[7], (byte) (-b3), objArr5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, minimumFlingVelocity, maximumDrawingCacheSize, 2009631821, false, (String) objArr5[0], null);
                            }
                            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                    int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                                    int iCombineMeasuredStates = 10 - View.combineMeasuredStates(0, 0);
                                    byte[] bArr3 = $$a;
                                    byte b4 = bArr3[7];
                                    Object[] objArr6 = new Object[1];
                                    a(b4, bArr3[54], b4, objArr6);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, iResolveOpacity, iCombineMeasuredStates, 256017550, false, (String) objArr6[0], null);
                                }
                                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                                int iIdentityHashCode = System.identityHashCode(this);
                                int i11 = (((2022768506 + (((~((~iIdentityHashCode) | (-1040836663))) | (-1000526434)) * (-235))) + (((~((-1040836663) | iIdentityHashCode)) | (-1000526434)) * (-470))) + (((~(iIdentityHashCode | (-973127713))) | (-1068235384)) * 235)) - 203349265;
                                int i12 = (i11 << 13) ^ i11;
                                int i13 = i12 ^ (i12 >>> 17);
                                ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
                            } else {
                                Object[] objArr8 = new Object[1];
                                c(new char[]{0, 30, '\f', 15, 27, ' ', 23, 11, Typography.quote, '\f', 17, 4, 26, '#', 21, ' ', 27, 31, 19, 14, 26, '\n', 15, 16, '#', '\f'}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 72), 26 - Color.green(0), objArr8);
                                Class<?> cls2 = Class.forName((String) objArr8[0]);
                                Object[] objArr9 = new Object[1];
                                c(new char[]{'!', 20, 13831, 13831, '\f', 27, 23, 26, 13833, 13833, ' ', Typography.quote, '!', 31, 21, ' ', 27, 25}, (byte) (31 - (ViewConfiguration.getTapTimeout() >> 16)), 18 - ((Process.getThreadPriority(0) + 20) >> 6), objArr9);
                                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                                if (applicationContext != null) {
                                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                                }
                                Object[] objArr10 = new Object[1];
                                c(new char[]{30, 31, 24, 31, 1, '#', 0, 30, '#', 4, 19, 16, 19, 21, 21, '\t'}, (byte) ((Process.myTid() >> 22) + 18), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr10);
                                Class<?> cls3 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                c(new char[]{'#', 15, '\f', 27, 21, ' ', 19, 14, 18, '#', 20, 6, 28, 27, '\f', 16}, (byte) (80 - Gravity.getAbsoluteGravity(0, 0)), 16 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr11);
                                try {
                                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -203349265};
                                    byte[] bArr4 = $$d;
                                    byte b5 = bArr4[17];
                                    byte b6 = (byte) (-b5);
                                    Object[] objArr13 = new Object[1];
                                    d(b6, b6, b5, objArr13);
                                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                                    byte b7 = bArr4[9];
                                    byte b8 = b7;
                                    Object[] objArr14 = new Object[1];
                                    d(b7, b8, (byte) (b8 | 11), objArr14);
                                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                    if (applicationContext != null) {
                                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
                                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                                        int i15 = i14 % 2;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                            int scrollBarSize = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
                                            byte[] bArr5 = $$a;
                                            byte b9 = bArr5[7];
                                            Object[] objArr16 = new Object[1];
                                            a(b9, bArr5[54], b9, objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, scrollBarSize, bitsPerPixel, 256017550, false, (String) objArr16[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                        try {
                                            Object[] objArr17 = new Object[1];
                                            c(new char[]{0, 30, '\f', 15, 27, ' ', 23, 11, 24, 20, 4, 23, '\f', 19, 21, 14, '\t', '!', ' ', 25, Typography.quote, '\b'}, (byte) (17 - TextUtils.getTrimmedLength("")), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr17);
                                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                                            Object[] objArr18 = new Object[1];
                                            c(new char[]{'\r', '!', Typography.quote, '\f', 21, '\f', 16, 5, '\f', '!', ' ', 19, 3, '\t', 13848}, (byte) (25 - Gravity.getAbsoluteGravity(0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 15, objArr18);
                                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                            Long lValueOf = Long.valueOf(jLongValue2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                                                int iGreen = Color.green(0) + 10;
                                                byte[] bArr6 = $$a;
                                                byte b10 = bArr6[5];
                                                Object[] objArr19 = new Object[1];
                                                a((byte) (-b10), bArr6[7], (byte) (-b10), objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize2, iResolveSizeAndState, iGreen, 2009631821, false, (String) objArr19[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                int defaultSize = View.getDefaultSize(0, 0) + 876;
                                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                                                byte[] bArr7 = $$a;
                                                byte b11 = bArr7[7];
                                                Object[] objArr20 = new Object[1];
                                                a(b11, (byte) (b11 | 14), (byte) (-bArr7[5]), objArr20);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, defaultSize, touchSlop, 252381699, false, (String) objArr20[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                            int i16 = TuitionPaymentFragmentbindingInflater1 + 41;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                                            int i17 = i16 % 2;
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
                            int i18 = ((int[]) objArr[2])[0];
                            int i19 = ((int[]) objArr[0])[0];
                            if (i19 == i18) {
                                int i20 = TuitionPaymentFragmentbindingInflater1 + 93;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                                int i21 = i20 % 2;
                                int i22 = ((int[]) objArr[1])[0];
                                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                int iNextInt = new Random().nextInt(1049848071);
                                int i23 = (-721451340) + (((~(120234993 | iNextInt)) | (-79924765)) * 672);
                                int i24 = ~iNextInt;
                                int i25 = i22 + i23 + (((~(iNextInt | (-79924765))) | (~((-120234994) | i24))) * (-672)) + (((~(79924764 | i24)) | (-132886526)) * 672);
                                int i26 = (i25 << 13) ^ i25;
                                int i27 = i26 ^ (i26 >>> 17);
                                ((int[]) objArr21[1])[0] = i27 ^ (i27 << 5);
                            } else {
                                int[] iArr = new int[i19];
                                int i28 = i19 - 1;
                                iArr[i28] = 1;
                                Toast.makeText((Context) null, iArr[((i19 * i28) % 2) - 1], 1).show();
                                int i29 = ((int[]) objArr[1])[0];
                                Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                int i30 = i29 + (((1577982850 + (((~((-76027990) | iMaxMemory)) | (~((-35717761) | iMaxMemory))) * 69)) + (((~(iMaxMemory | (-862430081))) | ((~((-902740310) | iMaxMemory)) | 826712320)) * (-69))) - 329097390);
                                int i31 = (i30 << 13) ^ i30;
                                int i32 = i31 ^ (i31 >>> 17);
                                ((int[]) objArr22[1])[0] = i32 ^ (i32 << 5);
                            }
                            Unit unitINotificationSideChannelStubProxy = ClaimOldDaySecurityTermsConditionActivity.INotificationSideChannelStubProxy(this.b);
                            int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                            TuitionPaymentFragmentbindingInflater1 = i33 % 128;
                            if (i33 % 2 == 0) {
                                return unitINotificationSideChannelStubProxy;
                            }
                            throw null;
                        }

                        private static void c(char[] cArr, byte b2, int i8, Object[] objArr) throws Throwable {
                            int i9;
                            Object obj;
                            int i10 = 2 % 2;
                            deInitSession deinitsession = new deInitSession();
                            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i11 = 1770390596;
                            Object obj2 = null;
                            if (cArr2 != null) {
                                int i12 = $10 + 21;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                                int length = cArr2.length;
                                char[] cArr3 = new char[length];
                                int i14 = 0;
                                while (i14 < length) {
                                    try {
                                        Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i11);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            byte b3 = (byte) 0;
                                            byte b4 = b3;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 2267 - (ViewConfiguration.getPressedStateDuration() >> 16), 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                                        }
                                        cArr3[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                        i14++;
                                        i11 = 1770390596;
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
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.alpha(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267, 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            char[] cArr4 = new char[i8];
                            if (i8 % 2 != 0) {
                                int i15 = $10 + 47;
                                $11 = i15 % 128;
                                int i16 = i15 % 2;
                                i9 = i8 - 1;
                                cArr4[i9] = (char) (cArr[i9] - b2);
                            } else {
                                i9 = i8;
                            }
                            if (i9 > 1) {
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i9) {
                                    int i17 = $10 + 41;
                                    $11 = i17 % 128;
                                    int i18 = i17 % 2;
                                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                        obj = obj2;
                                    } else {
                                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            byte b7 = (byte) 0;
                                            byte b8 = (byte) (b7 + 1);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getTouchSlop() >> 8)), 3261 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 30, -127612708, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                        }
                                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                            int i19 = $11 + 33;
                                            $10 = i19 % 128;
                                            int i20 = i19 % 2;
                                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                byte b9 = (byte) 0;
                                                byte b10 = (byte) (b9 + 3);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 22878), 594 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1570859318, false, $$g(b9, b10, (byte) (b10 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                            }
                                            obj = null;
                                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                            int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                                        } else {
                                            obj = null;
                                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                                int i22 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                                int i23 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i22];
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i23];
                                            } else {
                                                int i24 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                                int i25 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i24];
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i25];
                                            }
                                        }
                                    }
                                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                                    obj2 = obj;
                                }
                            }
                            for (int i26 = 0; i26 < i8; i26++) {
                                cArr4[i26] = (char) (cArr4[i26] ^ 13722);
                            }
                            objArr[0] = new String(cArr4);
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static java.lang.String $$g(short r6, short r7, int r8) {
                            /*
                                byte[] r0 = defpackage.Camera2CaptureCallbacks.$$c
                                int r8 = r8 * 4
                                int r1 = r8 + 1
                                int r6 = r6 * 4
                                int r6 = r6 + 4
                                int r7 = r7 + 113
                                byte[] r1 = new byte[r1]
                                r2 = 0
                                if (r0 != 0) goto L15
                                r4 = r7
                                r3 = r2
                                r7 = r6
                                goto L2b
                            L15:
                                r3 = r2
                            L16:
                                r5 = r7
                                r7 = r6
                                r6 = r5
                                byte r4 = (byte) r6
                                r1[r3] = r4
                                if (r3 != r8) goto L24
                                java.lang.String r6 = new java.lang.String
                                r6.<init>(r1, r2)
                                return r6
                            L24:
                                r4 = r0[r7]
                                int r3 = r3 + 1
                                r5 = r7
                                r7 = r6
                                r6 = r5
                            L2b:
                                int r6 = r6 + 1
                                int r7 = r7 + r4
                                goto L16
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2CaptureCallbacks.$$g(short, short, int):java.lang.String");
                        }
                    }, null, 80);
                } else {
                    String string6 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    String string7 = claimOldDaySecurityTermsConditionActivity.getString(R.string.message_check_term_condition);
                    Intrinsics.checkNotNullExpressionValue(string7, "");
                    String string8 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
                    Intrinsics.checkNotNullExpressionValue(string8, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, R.drawable.ic_info_blue, string6, string7, string8, null, null, null, 112);
                    int i8 = getNotifyChildrenChangedOptions + 97;
                    getRoot = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        } else {
            InfoPraClaimItem infoPraClaimItem4 = claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (infoPraClaimItem4 != null) {
                int i10 = getRoot + 53;
                getNotifyChildrenChangedOptions = i10 % 128;
                if (i10 % 2 != 0) {
                    infoPraClaimItem4.getStatusUpdateData();
                    statusMembership.hashCode();
                    throw null;
                }
                statusUpdateData = infoPraClaimItem4.getStatusUpdateData();
            } else {
                statusUpdateData = null;
            }
            if (Intrinsics.areEqual(statusUpdateData, "Y")) {
                InfoPraClaimItem infoPraClaimItem5 = claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (Intrinsics.areEqual(infoPraClaimItem5 != null ? infoPraClaimItem5.getStatusMaksimumBalanceJht() : null, ExifInterface.GPS_DIRECTION_TRUE)) {
                    InfoPraClaimItem infoPraClaimItem6 = claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (infoPraClaimItem6 != null) {
                        int i11 = getNotifyChildrenChangedOptions + 91;
                        getRoot = i11 % 128;
                        if (i11 % 2 == 0) {
                            infoPraClaimItem6.getStatusMembership();
                            throw null;
                        }
                        statusMembership = infoPraClaimItem6.getStatusMembership();
                    }
                    if (Intrinsics.areEqual(statusMembership, ExifInterface.GPS_DIRECTION_TRUE)) {
                        String string9 = claimOldDaySecurityTermsConditionActivity.getString(R.string.label_eligible_for_old_day_security);
                        Intrinsics.checkNotNullExpressionValue(string9, "");
                        String str2 = claimOldDaySecurityTermsConditionActivity.asBinder;
                        String string10 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                        Intrinsics.checkNotNullExpressionValue(string10, "");
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, R.drawable.ic_document_success, string9, str2, string10, null, new Function0() { // from class: createComboCallback
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ClaimOldDaySecurityTermsConditionActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            }
                        }, null, 80);
                    } else {
                        String string11 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                        Intrinsics.checkNotNullExpressionValue(string11, "");
                        String string12 = claimOldDaySecurityTermsConditionActivity.getString(R.string.message_check_term_condition);
                        Intrinsics.checkNotNullExpressionValue(string12, "");
                        String string13 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
                        Intrinsics.checkNotNullExpressionValue(string13, "");
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, R.drawable.ic_info_blue, string11, string12, string13, null, null, null, 112);
                    }
                } else {
                    String string14 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                    Intrinsics.checkNotNullExpressionValue(string14, "");
                    String string15 = claimOldDaySecurityTermsConditionActivity.getString(R.string.message_check_term_condition);
                    Intrinsics.checkNotNullExpressionValue(string15, "");
                    String string16 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
                    Intrinsics.checkNotNullExpressionValue(string16, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, R.drawable.ic_info_blue, string14, string15, string16, null, null, null, 112);
                }
            } else {
                String string17 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string17, "");
                String string18 = claimOldDaySecurityTermsConditionActivity.getString(R.string.message_check_term_condition);
                Intrinsics.checkNotNullExpressionValue(string18, "");
                String string19 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string19, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, R.drawable.ic_info_blue, string17, string18, string19, null, null, null, 112);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 1;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        claimOldDaySecurityTermsConditionActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getRoot + 31;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit a(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 71;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        claimOldDaySecurityTermsConditionActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getRoot + 65;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit cancel(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 19;
        getRoot = i2 % 128;
        if (i2 % 2 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(675719463, new Object[]{claimOldDaySecurityTermsConditionActivity}, ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), -675719463, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
            return Unit.INSTANCE;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(675719463, new Object[]{claimOldDaySecurityTermsConditionActivity}, ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), -675719463, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit notify(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getRoot + 17;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        claimOldDaySecurityTermsConditionActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getRoot + 45;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity = (ClaimOldDaySecurityTermsConditionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 15;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        claimOldDaySecurityTermsConditionActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getRoot + 101;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit INotificationSideChannel(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 77;
        getRoot = i2 % 128;
        if (i2 % 2 != 0) {
            AsikActiveParticipantSubmissionCheckActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = AsikActiveParticipantSubmissionCheckActivity.INSTANCE;
            AsikActiveParticipantSubmissionCheckActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(claimOldDaySecurityTermsConditionActivity, AsikPointer.KLAIM.getType());
            claimOldDaySecurityTermsConditionActivity.d_();
            return Unit.INSTANCE;
        }
        AsikActiveParticipantSubmissionCheckActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikActiveParticipantSubmissionCheckActivity.INSTANCE;
        AsikActiveParticipantSubmissionCheckActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(claimOldDaySecurityTermsConditionActivity, AsikPointer.KLAIM.getType());
        claimOldDaySecurityTermsConditionActivity.d_();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063 A[PHI: r0
  0x0063: PHI (r0v16 VirtualCameraAdapter1$asBinder) = (r0v15 VirtualCameraAdapter1$asBinder), (r0v84 VirtualCameraAdapter1$asBinder) binds: [B:13:0x0061, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x0903  */
    /* JADX WARN: Code duplicated, block: B:168:0x092f  */
    /* JADX WARN: Code duplicated, block: B:16:0x00db  */
    /* JADX WARN: Code duplicated, block: B:171:0x096f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:189:0x0a92  */
    /* JADX WARN: Code duplicated, block: B:18:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:191:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:194:0x0aad  */
    /* JADX WARN: Code duplicated, block: B:21:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0124  */
    /* JADX WARN: Code duplicated, block: B:29:0x012a  */
    /* JADX WARN: Code duplicated, block: B:32:0x013b  */
    /* JADX WARN: Code duplicated, block: B:37:0x016b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0186  */
    /* JADX WARN: Code duplicated, block: B:41:0x018c  */
    /* JADX WARN: Code duplicated, block: B:44:0x019b  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x0202 A[PHI: r0
  0x0202: PHI (r0v83 VirtualCameraAdapter1$asBinder) = (r0v15 VirtualCameraAdapter1$asBinder), (r0v84 VirtualCameraAdapter1$asBinder) binds: [B:13:0x0061, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0260  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v47, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v36, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r5v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v49, types: [T, java.lang.String] */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        Object obj;
        boolean z;
        VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i;
        getStringOrNull getstringornullB;
        getStringOrNull getstringornull;
        FragmentManager supportFragmentManager;
        VirtualCameraAdapter1.asBinder asbinder;
        InfoPraClaimItem infoPraClaimItem;
        ActivityClaimOldDaySecurityTermsConditionBinding activityClaimOldDaySecurityTermsConditionBinding;
        ?? r3;
        String strTuitionPaymentFragmentbindingInflater1;
        boolean z2;
        int i2 = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            claimOldDaySecurityTermsConditionActivity.MediaBrowserCompat();
            str = "loading_check_eligibility_claim_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i3 = getRoot + 13;
            getNotifyChildrenChangedOptions = i3 % 128;
            if (i3 % 2 != 0) {
                asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                claimOldDaySecurityTermsConditionActivity.asInterface = ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i4 = 6 / 0;
                if (Intrinsics.areEqual(((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, JhtEligibilityStatus.STATUS_CODE_100.getValue())) {
                    infoPraClaimItem = new InfoPraClaimItem(((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).asBinder, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).g, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).asInterface, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).d, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancel, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).notify, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannel, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).onTransact, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancelAll);
                    claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = infoPraClaimItem;
                    claimOldDaySecurityTermsConditionActivity.cancelAll = getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(infoPraClaimItem.getMaximumBalanceJht());
                    activityClaimOldDaySecurityTermsConditionBinding = (ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                    if (Intrinsics.areEqual(infoPraClaimItem.getFlagMaxSaldo(), "Y")) {
                        int i5 = getNotifyChildrenChangedOptions + 43;
                        getRoot = i5 % 128;
                        r3 = i5 % 2;
                        try {
                            if (r3 == 0) {
                                activityClaimOldDaySecurityTermsConditionBinding.gbMaxBalance.setVisibility(0);
                                TextView textView = activityClaimOldDaySecurityTermsConditionBinding.tvMaximalBalanceStatus2;
                                strTuitionPaymentFragmentbindingInflater1 = getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(infoPraClaimItem.getMaximumBalanceJht());
                                r3 = textView;
                            } else {
                                activityClaimOldDaySecurityTermsConditionBinding.gbMaxBalance.setVisibility(0);
                                TextView textView2 = activityClaimOldDaySecurityTermsConditionBinding.tvMaximalBalanceStatus2;
                                strTuitionPaymentFragmentbindingInflater1 = getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(infoPraClaimItem.getMaximumBalanceJht());
                                r3 = textView2;
                            }
                        } catch (Exception unused) {
                        }
                        r3.setText(strTuitionPaymentFragmentbindingInflater1);
                        if (Intrinsics.areEqual(infoPraClaimItem.getStatusMaksimumBalanceJht(), "Y")) {
                            activityClaimOldDaySecurityTermsConditionBinding.imgViewMaximalBalanceStatus.setBackgroundResource(R.drawable.ic_failed_mini);
                        } else {
                            activityClaimOldDaySecurityTermsConditionBinding.imgViewMaximalBalanceStatus.setBackgroundResource(R.drawable.ic_success_mini);
                        }
                    } else {
                        activityClaimOldDaySecurityTermsConditionBinding.gbMaxBalance.setVisibility(8);
                    }
                    if (Intrinsics.areEqual(infoPraClaimItem.getStatusMembership(), "Y")) {
                        int i6 = getNotifyChildrenChangedOptions + 67;
                        getRoot = i6 % 128;
                        int i7 = i6 % 2;
                        if (Intrinsics.areEqual(infoPraClaimItem.getStatusUpdateData(), ExifInterface.GPS_DIRECTION_TRUE) || !Intrinsics.areEqual(infoPraClaimItem.getStatusMaksimumBalanceJht(), "Y")) {
                            MaterialButton materialButton = activityClaimOldDaySecurityTermsConditionBinding.btnNext;
                            Intrinsics.checkNotNullExpressionValue(materialButton, "");
                            MaterialButton materialButton2 = materialButton;
                            Intrinsics.checkNotNullParameter(materialButton2, "");
                            materialButton2.setEnabled(true);
                            claimOldDaySecurityTermsConditionActivity.onTransact();
                        } else {
                            MaterialButton materialButton3 = activityClaimOldDaySecurityTermsConditionBinding.btnNext;
                            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
                            MaterialButton materialButton4 = materialButton3;
                            Intrinsics.checkNotNullParameter(materialButton4, "");
                            materialButton4.setEnabled(false);
                            claimOldDaySecurityTermsConditionActivity.INotificationSideChannel();
                        }
                    } else {
                        MaterialButton materialButton5 = activityClaimOldDaySecurityTermsConditionBinding.btnNext;
                        Intrinsics.checkNotNullExpressionValue(materialButton5, "");
                        MaterialButton materialButton6 = materialButton5;
                        Intrinsics.checkNotNullParameter(materialButton6, "");
                        materialButton6.setEnabled(true);
                        claimOldDaySecurityTermsConditionActivity.onTransact();
                    }
                    if (Intrinsics.areEqual(infoPraClaimItem.getStatusMembership(), "Y")) {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewMembershipStatus.setBackgroundResource(R.drawable.ic_failed_mini);
                    } else {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewMembershipStatus.setBackgroundResource(R.drawable.ic_success_mini);
                    }
                    if (Intrinsics.areEqual(infoPraClaimItem.getStatusUpdateData(), "Y")) {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewUpdateDataStatus.setBackgroundResource(R.drawable.ic_success_mini);
                        claimOldDaySecurityTermsConditionActivity.onTransact();
                    } else {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewUpdateDataStatus.setBackgroundResource(R.drawable.ic_failed_mini);
                        claimOldDaySecurityTermsConditionActivity.INotificationSideChannel();
                    }
                    if (Intrinsics.areEqual(infoPraClaimItem.getStatusPensiun(), "Y")) {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewMembershipStatus.setVisibility(8);
                        activityClaimOldDaySecurityTermsConditionBinding.tvMembershipStatus.setVisibility(8);
                    } else {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewMembershipStatus.setVisibility(0);
                        activityClaimOldDaySecurityTermsConditionBinding.tvMembershipStatus.setVisibility(0);
                    }
                    MaterialButton materialButton7 = ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnNext;
                    Intrinsics.checkNotNullExpressionValue(materialButton7, "");
                    MaterialButton materialButton8 = materialButton7;
                    Intrinsics.checkNotNullParameter(materialButton8, "");
                    materialButton8.setEnabled(true);
                    ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerClaim.setVisibility(0);
                    ((isModeInList) claimOldDaySecurityTermsConditionActivity.INotificationSideChannel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                } else {
                    claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer();
                    ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerClaim.setVisibility(8);
                    ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnNext.setVisibility(8);
                }
            } else {
                asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                claimOldDaySecurityTermsConditionActivity.asInterface = ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (Intrinsics.areEqual(((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, JhtEligibilityStatus.STATUS_CODE_100.getValue())) {
                    infoPraClaimItem = new InfoPraClaimItem(((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).asBinder, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).g, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).asInterface, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).d, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancel, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).notify, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannel, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).onTransact, ((JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancelAll);
                    claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = infoPraClaimItem;
                    claimOldDaySecurityTermsConditionActivity.cancelAll = getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(infoPraClaimItem.getMaximumBalanceJht());
                    activityClaimOldDaySecurityTermsConditionBinding = (ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                    if (Intrinsics.areEqual(infoPraClaimItem.getFlagMaxSaldo(), "Y")) {
                        int i8 = getNotifyChildrenChangedOptions + 43;
                        getRoot = i8 % 128;
                        r3 = i8 % 2;
                        if (r3 == 0) {
                            activityClaimOldDaySecurityTermsConditionBinding.gbMaxBalance.setVisibility(0);
                            TextView textView3 = activityClaimOldDaySecurityTermsConditionBinding.tvMaximalBalanceStatus2;
                            strTuitionPaymentFragmentbindingInflater1 = getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(infoPraClaimItem.getMaximumBalanceJht());
                            r3 = textView3;
                        } else {
                            activityClaimOldDaySecurityTermsConditionBinding.gbMaxBalance.setVisibility(0);
                            TextView textView4 = activityClaimOldDaySecurityTermsConditionBinding.tvMaximalBalanceStatus2;
                            strTuitionPaymentFragmentbindingInflater1 = getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(infoPraClaimItem.getMaximumBalanceJht());
                            r3 = textView4;
                        }
                        r3.setText(strTuitionPaymentFragmentbindingInflater1);
                        if (Intrinsics.areEqual(infoPraClaimItem.getStatusMaksimumBalanceJht(), "Y")) {
                            activityClaimOldDaySecurityTermsConditionBinding.imgViewMaximalBalanceStatus.setBackgroundResource(R.drawable.ic_failed_mini);
                        } else {
                            activityClaimOldDaySecurityTermsConditionBinding.imgViewMaximalBalanceStatus.setBackgroundResource(R.drawable.ic_success_mini);
                        }
                    } else {
                        activityClaimOldDaySecurityTermsConditionBinding.gbMaxBalance.setVisibility(8);
                    }
                    if (Intrinsics.areEqual(infoPraClaimItem.getStatusMembership(), "Y")) {
                        int i9 = getNotifyChildrenChangedOptions + 67;
                        getRoot = i9 % 128;
                        int i10 = i9 % 2;
                        if (Intrinsics.areEqual(infoPraClaimItem.getStatusUpdateData(), ExifInterface.GPS_DIRECTION_TRUE)) {
                            MaterialButton materialButton9 = activityClaimOldDaySecurityTermsConditionBinding.btnNext;
                            Intrinsics.checkNotNullExpressionValue(materialButton9, "");
                            MaterialButton materialButton10 = materialButton9;
                            Intrinsics.checkNotNullParameter(materialButton10, "");
                            materialButton10.setEnabled(true);
                            claimOldDaySecurityTermsConditionActivity.onTransact();
                        } else {
                            MaterialButton materialButton11 = activityClaimOldDaySecurityTermsConditionBinding.btnNext;
                            Intrinsics.checkNotNullExpressionValue(materialButton11, "");
                            MaterialButton materialButton12 = materialButton11;
                            Intrinsics.checkNotNullParameter(materialButton12, "");
                            materialButton12.setEnabled(true);
                            claimOldDaySecurityTermsConditionActivity.onTransact();
                        }
                    } else {
                        MaterialButton materialButton13 = activityClaimOldDaySecurityTermsConditionBinding.btnNext;
                        Intrinsics.checkNotNullExpressionValue(materialButton13, "");
                        MaterialButton materialButton14 = materialButton13;
                        Intrinsics.checkNotNullParameter(materialButton14, "");
                        materialButton14.setEnabled(true);
                        claimOldDaySecurityTermsConditionActivity.onTransact();
                    }
                    if (Intrinsics.areEqual(infoPraClaimItem.getStatusMembership(), "Y")) {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewMembershipStatus.setBackgroundResource(R.drawable.ic_failed_mini);
                    } else {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewMembershipStatus.setBackgroundResource(R.drawable.ic_success_mini);
                    }
                    if (Intrinsics.areEqual(infoPraClaimItem.getStatusUpdateData(), "Y")) {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewUpdateDataStatus.setBackgroundResource(R.drawable.ic_success_mini);
                        claimOldDaySecurityTermsConditionActivity.onTransact();
                    } else {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewUpdateDataStatus.setBackgroundResource(R.drawable.ic_failed_mini);
                        claimOldDaySecurityTermsConditionActivity.INotificationSideChannel();
                    }
                    if (Intrinsics.areEqual(infoPraClaimItem.getStatusPensiun(), "Y")) {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewMembershipStatus.setVisibility(8);
                        activityClaimOldDaySecurityTermsConditionBinding.tvMembershipStatus.setVisibility(8);
                    } else {
                        activityClaimOldDaySecurityTermsConditionBinding.imgViewMembershipStatus.setVisibility(0);
                        activityClaimOldDaySecurityTermsConditionBinding.tvMembershipStatus.setVisibility(0);
                    }
                    MaterialButton materialButton15 = ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnNext;
                    Intrinsics.checkNotNullExpressionValue(materialButton15, "");
                    MaterialButton materialButton16 = materialButton15;
                    Intrinsics.checkNotNullParameter(materialButton16, "");
                    materialButton16.setEnabled(true);
                    ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerClaim.setVisibility(0);
                    ((isModeInList) claimOldDaySecurityTermsConditionActivity.INotificationSideChannel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                } else {
                    claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer();
                    ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerClaim.setVisibility(8);
                    ((ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnNext.setVisibility(8);
                }
            }
            JhtClaimEligibility jhtClaimEligibility = (JhtClaimEligibility) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            String strRun = getMaxImages.run();
            getMaxImages getmaximages2 = getMaxImages.INSTANCE;
            String strB = getMaxImages.b();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            if (strB.length() > 0) {
                try {
                    AntreanMenuConfig antreanMenuConfig = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                    if (antreanMenuConfig.getStatus()) {
                        try {
                            objectRef.element = antreanMenuConfig.getLinkAntreanKlaim();
                        } catch (Exception unused2) {
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } catch (Exception unused3) {
                }
            } else {
                z2 = false;
            }
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = ((getStreamUseCaseSupportedCombinationList) claimOldDaySecurityTermsConditionActivity.RemoteActionCompatParcelizer.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL", "");
            if (((CharSequence) objectRef2.element).length() == 0) {
                User user = (User) claimOldDaySecurityTermsConditionActivity.connect.getValue();
                if (user != null) {
                    int i11 = getNotifyChildrenChangedOptions + 93;
                    getRoot = i11 % 128;
                    int i12 = i11 % 2;
                    String str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ((getStreamUseCaseSupportedCombinationList) claimOldDaySecurityTermsConditionActivity.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AntrianOnlineUrlRequest(str2, "", "KLAIM", ""));
                }
                getMaxImages getmaximages3 = getMaxImages.INSTANCE;
                objectRef2.element = (String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], -644713709, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 644713713);
            }
            String str3 = jhtClaimEligibility.TuitionPaymentFragmentbindingInflater1;
            if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_100.getValue())) {
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_eligible", "jmo_claim_jht_eligible"));
                Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                Intrinsics.checkNotNullParameter("jmo_claim_jht_eligible", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("jmo_claim_jht_eligible", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_eligible", mapMutableMapOf);
                setContentView setcontentview = (setContentView) claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer.getValue();
                if (Intrinsics.areEqual(setcontentview != null ? setcontentview.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null, "Y")) {
                    Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) claimOldDaySecurityTermsConditionActivity.notify.getValue();
                    Intrinsics.checkNotNullParameter(ExifInterface.GPS_DIRECTION_TRUE, "");
                    camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new setContentView(ExifInterface.GPS_DIRECTION_TRUE, null, 2, null));
                }
                claimOldDaySecurityTermsConditionActivity.asBinder = jhtClaimEligibility.b;
            } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_109.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_110.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_111.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_112.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_114.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_115.getValue())) {
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible_caused_card_on_process_branch_office"));
                Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_card_on_process_branch_office", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_card_on_process_branch_office", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible_caused_card_on_process_branch_office", mapMutableMapOf2);
                String string = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String str4 = jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                StringBuilder sb = new StringBuilder("Pengajuan klaim JHT Anda tidak dapat dilanjutkan pada aplikasi JMO karena kartu Anda dalam proses ");
                sb.append(str4);
                sb.append(". Untuk informasi lebih lanjut silakan menghubungi perusahaan Anda atau Kantor Cabang terdekat di kota Anda.");
                String string2 = sb.toString();
                String string3 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string, string2, string3, null, null, null, 113);
            } else {
                int i13 = getNotifyChildrenChangedOptions + 39;
                getRoot = i13 % 128;
                if (i13 % 2 == 0) {
                    Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_104.getValue());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_104.getValue())) {
                    Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible_caused_claim_on_process_branch_office"));
                    Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                    Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_claim_on_process_branch_office", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                    TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_claim_on_process_branch_office", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible_caused_claim_on_process_branch_office", mapMutableMapOf3);
                    String string4 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String str5 = jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    StringBuilder sb2 = new StringBuilder("Pengajuan klaim JHT Anda tidak dapat dilanjutkan pada aplikasi JMO karena masih dalam proses klaim JHT di ");
                    sb2.append(str5);
                    sb2.append(". Untuk informasi lebih lanjut silakan menghubungi Kantor Cabang terdekat di kota Anda.");
                    String string5 = sb2.toString();
                    String string6 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string4, string5, string6, null, null, null, 113);
                } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_102.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_105.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_107.getValue())) {
                    Map<String, Object> mapMutableMapOf4 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible"));
                    Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                    Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf4, "");
                    TargetAspectRatio targetAspectRatio4 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf4, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible", mapMutableMapOf4);
                    if (z2 || ((CharSequence) objectRef.element).length() <= 0) {
                        String string7 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                        Intrinsics.checkNotNullExpressionValue(string7, "");
                        String str6 = jhtClaimEligibility.b;
                        String string8 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_booking_antrean_online);
                        Intrinsics.checkNotNullExpressionValue(string8, "");
                        String string9 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_return);
                        Intrinsics.checkNotNullExpressionValue(string9, "");
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string7, str6, string8, string9, new Function0() { // from class: setCameraStateSource
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ClaimOldDaySecurityTermsConditionActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, objectRef2);
                            }
                        }, new Function0() { // from class: onCaptureProgressed
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                            }
                        }, 1);
                    } else {
                        String string10 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                        Intrinsics.checkNotNullExpressionValue(string10, "");
                        String str7 = jhtClaimEligibility.b;
                        String string11 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_booking_antrean_online);
                        Intrinsics.checkNotNullExpressionValue(string11, "");
                        String string12 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_return);
                        Intrinsics.checkNotNullExpressionValue(string12, "");
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string10, str7, string11, string12, new Function0() { // from class: unpack
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, objectRef);
                            }
                        }, new Function0() { // from class: onCaptureStarted
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return (Unit) ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1560784330, new Object[]{this.TuitionPaymentFragmentbindingInflater1}, ScholarshipHistoryRequest.b(), -1560784329, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
                            }
                        }, 1);
                    }
                } else {
                    int i14 = getNotifyChildrenChangedOptions + 31;
                    getRoot = i14 % 128;
                    if (i14 % 2 == 0) {
                        Object obj3 = null;
                        Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_108.getValue());
                        obj3.hashCode();
                        throw null;
                    }
                    if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_108.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_125.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_126.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_130.getValue())) {
                        Map<String, Object> mapMutableMapOf5 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible"));
                        Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                        Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                        Intrinsics.checkNotNullParameter(mapMutableMapOf5, "");
                        TargetAspectRatio targetAspectRatio5 = TargetAspectRatio.INSTANCE;
                        Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                        Intrinsics.checkNotNullParameter(mapMutableMapOf5, "");
                        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible", mapMutableMapOf5);
                        if (z2) {
                            String string13 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                            Intrinsics.checkNotNullExpressionValue(string13, "");
                            String str8 = jhtClaimEligibility.b;
                            String string14 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_booking_antrean_online);
                            Intrinsics.checkNotNullExpressionValue(string14, "");
                            String string15 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_return);
                            Intrinsics.checkNotNullExpressionValue(string15, "");
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string13, str8, string14, string15, new Function0() { // from class: setCameraStateSource
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ClaimOldDaySecurityTermsConditionActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, objectRef2);
                                }
                            }, new Function0() { // from class: onCaptureProgressed
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                                }
                            }, 1);
                        } else {
                            String string16 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                            Intrinsics.checkNotNullExpressionValue(string16, "");
                            String str9 = jhtClaimEligibility.b;
                            String string17 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_booking_antrean_online);
                            Intrinsics.checkNotNullExpressionValue(string17, "");
                            String string18 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_return);
                            Intrinsics.checkNotNullExpressionValue(string18, "");
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string16, str9, string17, string18, new Function0() { // from class: setCameraStateSource
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ClaimOldDaySecurityTermsConditionActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, objectRef2);
                                }
                            }, new Function0() { // from class: onCaptureProgressed
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                                }
                            }, 1);
                        }
                    } else {
                        int i15 = getRoot + 85;
                        getNotifyChildrenChangedOptions = i15 % 128;
                        if (i15 % 2 != 0) {
                            Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_132.getValue());
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        if (!(!Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_132.getValue())) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_133.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_140.getValue())) {
                            Map<String, Object> mapMutableMapOf6 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible"));
                            Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf6, "");
                            TargetAspectRatio targetAspectRatio6 = TargetAspectRatio.INSTANCE;
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf6, "");
                            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible", mapMutableMapOf6);
                            if (z2) {
                                String string19 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                                Intrinsics.checkNotNullExpressionValue(string19, "");
                                String str10 = jhtClaimEligibility.b;
                                String string110 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_booking_antrean_online);
                                Intrinsics.checkNotNullExpressionValue(string110, "");
                                String string111 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_return);
                                Intrinsics.checkNotNullExpressionValue(string111, "");
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string19, str10, string110, string111, new Function0() { // from class: setCameraStateSource
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ClaimOldDaySecurityTermsConditionActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, objectRef2);
                                    }
                                }, new Function0() { // from class: onCaptureProgressed
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                                    }
                                }, 1);
                            } else {
                                String string112 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                                Intrinsics.checkNotNullExpressionValue(string112, "");
                                String str11 = jhtClaimEligibility.b;
                                String string113 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_booking_antrean_online);
                                Intrinsics.checkNotNullExpressionValue(string113, "");
                                String string114 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_return);
                                Intrinsics.checkNotNullExpressionValue(string114, "");
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string112, str11, string113, string114, new Function0() { // from class: setCameraStateSource
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ClaimOldDaySecurityTermsConditionActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, objectRef2);
                                    }
                                }, new Function0() { // from class: onCaptureProgressed
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                                    }
                                }, 1);
                            }
                        } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_106.getValue())) {
                            Map<String, Object> mapMutableMapOf7 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible"));
                            Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf7, "");
                            TargetAspectRatio targetAspectRatio7 = TargetAspectRatio.INSTANCE;
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf7, "");
                            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible", mapMutableMapOf7);
                            String string20 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                            Intrinsics.checkNotNullExpressionValue(string20, "");
                            String str12 = jhtClaimEligibility.b;
                            String string21 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                            Intrinsics.checkNotNullExpressionValue(string21, "");
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string20, str12, string21, null, null, null, 113);
                        } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_113.getValue())) {
                            Map<String, Object> mapMutableMapOf8 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible_caused_waiting_posting_tuition"));
                            Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_waiting_posting_tuition", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf8, "");
                            TargetAspectRatio targetAspectRatio8 = TargetAspectRatio.INSTANCE;
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_waiting_posting_tuition", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf8, "");
                            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible_caused_waiting_posting_tuition", mapMutableMapOf8);
                            String string22 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                            Intrinsics.checkNotNullExpressionValue(string22, "");
                            String string23 = claimOldDaySecurityTermsConditionActivity.getString(R.string.message_already_posting);
                            Intrinsics.checkNotNullExpressionValue(string23, "");
                            String string24 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                            Intrinsics.checkNotNullExpressionValue(string24, "");
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string22, string23, string24, null, null, null, 113);
                        } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_103.getValue())) {
                            Map<String, Object> mapMutableMapOf9 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible_caused_active_participant"));
                            Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_active_participant", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf9, "");
                            TargetAspectRatio targetAspectRatio9 = TargetAspectRatio.INSTANCE;
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_active_participant", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf9, "");
                            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible_caused_active_participant", mapMutableMapOf9);
                            String string25 = claimOldDaySecurityTermsConditionActivity.getString(R.string.label_ineligible_for_old_day_security);
                            Intrinsics.checkNotNullExpressionValue(string25, "");
                            String string26 = claimOldDaySecurityTermsConditionActivity.getString(R.string.message_still_active_memberships);
                            Intrinsics.checkNotNullExpressionValue(string26, "");
                            String string27 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                            Intrinsics.checkNotNullExpressionValue(string27, "");
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string25, string26, string27, null, null, null, 113);
                        } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_101.getValue())) {
                            Map<String, Object> mapMutableMapOf10 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible_caused_need_fill_asik_form"));
                            Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_need_fill_asik_form", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf10, "");
                            TargetAspectRatio targetAspectRatio10 = TargetAspectRatio.INSTANCE;
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_need_fill_asik_form", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf10, "");
                            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible_caused_need_fill_asik_form", mapMutableMapOf10);
                            String string28 = claimOldDaySecurityTermsConditionActivity.getString(R.string.label_ineligible_for_old_day_security);
                            Intrinsics.checkNotNullExpressionValue(string28, "");
                            String str13 = jhtClaimEligibility.b;
                            String string29 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_asik_program);
                            Intrinsics.checkNotNullExpressionValue(string29, "");
                            String string30 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_return);
                            Intrinsics.checkNotNullExpressionValue(string30, "");
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string28, str13, string29, string30, new Function0() { // from class: Camera2CaptureOptionUnpacker
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ClaimOldDaySecurityTermsConditionActivity.INotificationSideChannel(this.b);
                                }
                            }, new Function0() { // from class: Camera2CaptureCallbacksNoOpSessionCaptureCallback
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ClaimOldDaySecurityTermsConditionActivity.RemoteActionCompatParcelizer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                }
                            }, 1);
                        } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_117.getValue()) || Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_118.getValue())) {
                            Map<String, Object> mapMutableMapOf11 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible_caused_identified_full_claim"));
                            Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_identified_full_claim", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf11, "");
                            TargetAspectRatio targetAspectRatio11 = TargetAspectRatio.INSTANCE;
                            Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_identified_full_claim", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf11, "");
                            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible_caused_identified_full_claim", mapMutableMapOf11);
                            String string31 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                            Intrinsics.checkNotNullExpressionValue(string31, "");
                            String string32 = claimOldDaySecurityTermsConditionActivity.getString(R.string.message_full_claim);
                            Intrinsics.checkNotNullExpressionValue(string32, "");
                            String string33 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
                            Intrinsics.checkNotNullExpressionValue(string33, "");
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string31, string32, string33, null, null, null, 113);
                        } else {
                            int i16 = getRoot + 85;
                            getNotifyChildrenChangedOptions = i16 % 128;
                            if (i16 % 2 != 0) {
                                Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_119.getValue());
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                            if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_119.getValue())) {
                                Map<String, Object> mapMutableMapOf12 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible_caused_one_month_waiting"));
                                Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_one_month_waiting", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf12, "");
                                TargetAspectRatio targetAspectRatio12 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_one_month_waiting", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf12, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible_caused_one_month_waiting", mapMutableMapOf12);
                                String string34 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                                Intrinsics.checkNotNullExpressionValue(string34, "");
                                String string35 = claimOldDaySecurityTermsConditionActivity.getString(R.string.message_one_month_notice);
                                Intrinsics.checkNotNullExpressionValue(string35, "");
                                String string36 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                                Intrinsics.checkNotNullExpressionValue(string36, "");
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string34, string35, string36, null, null, null, 113);
                            } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_121.getValue())) {
                                Map<String, Object> mapMutableMapOf13 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible_caused_kla1"));
                                Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_kla1", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf13, "");
                                TargetAspectRatio targetAspectRatio13 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_kla1", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf13, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible_caused_kla1", mapMutableMapOf13);
                                String string37 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                                Intrinsics.checkNotNullExpressionValue(string37, "");
                                String string38 = claimOldDaySecurityTermsConditionActivity.getString(R.string.message_claim_kla1);
                                Intrinsics.checkNotNullExpressionValue(string38, "");
                                String string39 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                                Intrinsics.checkNotNullExpressionValue(string39, "");
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string37, string38, string39, null, null, null, 113);
                            } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_135.getValue())) {
                                Map<String, Object> mapMutableMapOf14 = MapsKt.mutableMapOf(new Pair("jmo_claim_jht_eligible_piloting", "jmo_claim_jht_eligible_piloting_approval_otp"));
                                Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_eligible_piloting", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf14, "");
                                TargetAspectRatio targetAspectRatio14 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_eligible_piloting", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf14, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_eligible_piloting", mapMutableMapOf14);
                                String string40 = claimOldDaySecurityTermsConditionActivity.getString(R.string.label_eligible_for_old_day_security);
                                Intrinsics.checkNotNullExpressionValue(string40, "");
                                String str14 = jhtClaimEligibility.b;
                                String string41 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                                Intrinsics.checkNotNullExpressionValue(string41, "");
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, R.drawable.ic_document_success, string40, str14, string41, null, null, null, 112);
                            } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_136.getValue())) {
                                Map<String, Object> mapMutableMapOf15 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible_caused_status_code_136"));
                                Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_status_code_136", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf15, "");
                                TargetAspectRatio targetAspectRatio15 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible_caused_status_code_136", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf15, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible_caused_status_code_136", mapMutableMapOf15);
                                String str15 = jhtClaimEligibility.b;
                                lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.INSTANCE;
                                lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1 = lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.Companion.TuitionPaymentFragmentbindingInflater1(str15, "Buka Lapak Asik");
                                lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.a = claimOldDaySecurityTermsConditionActivity.new asBinder(strRun);
                                FragmentManager supportFragmentManager2 = claimOldDaySecurityTermsConditionActivity.getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                                Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                                if (supportFragmentManager2.findFragmentByTag(lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                    int i17 = getRoot + 19;
                                    getNotifyChildrenChangedOptions = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.show(supportFragmentManager2, lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        int i18 = 11 / 0;
                                    } else {
                                        lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.show(supportFragmentManager2, lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                }
                            } else if (Intrinsics.areEqual(str3, JhtEligibilityStatus.STATUS_CODE_130.getValue())) {
                                Map<String, Object> mapMutableMapOf16 = MapsKt.mutableMapOf(new Pair("jmo_claim_jht_eligible_piloting", "jmo_claim_jht_eligible_piloting_approval_otp"));
                                Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_eligible_piloting", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf16, "");
                                TargetAspectRatio targetAspectRatio16 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_eligible_piloting", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf16, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_eligible_piloting", mapMutableMapOf16);
                                String string42 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                                Intrinsics.checkNotNullExpressionValue(string42, "");
                                String str16 = jhtClaimEligibility.b;
                                String string43 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_ok);
                                Intrinsics.checkNotNullExpressionValue(string43, "");
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string42, str16, string43, null, null, null, 113);
                            } else {
                                Map<String, Object> mapMutableMapOf17 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible"));
                                Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf17, "");
                                TargetAspectRatio targetAspectRatio17 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf17, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible", mapMutableMapOf17);
                                String string44 = claimOldDaySecurityTermsConditionActivity.getString(R.string.label_ineligible_for_old_day_security);
                                Intrinsics.checkNotNullExpressionValue(string44, "");
                                String str17 = jhtClaimEligibility.b;
                                String string45 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
                                Intrinsics.checkNotNullExpressionValue(string45, "");
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, 0, string44, str17, string45, null, null, null, 113);
                            }
                        }
                    }
                }
            }
            str = "success_check_eligibility_claim_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i19 = getRoot + 111;
            getNotifyChildrenChangedOptions = i19 % 128;
            if (i19 % 2 != 0) {
                claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer();
                tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                obj = null;
                z = false;
                if (!StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "layanan ini tersedia pada pukul", false, 4, (Object) null)) {
                    i = 2;
                    if (!StringsKt.contains$default(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), "fitur ini sedang dalam peningkatan kapasitas. Silakan mengajukan Klaim JHT melalui", z, i, obj)) {
                        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                        String string46 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                        Intrinsics.checkNotNullExpressionValue(string46, "");
                        String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        String string47 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
                        Intrinsics.checkNotNullExpressionValue(string47, "");
                        getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string46, strValueOf, string47, null, 112);
                        claimOldDaySecurityTermsConditionActivity.INotificationSideChannelDefault = getstringornullB;
                        if (getstringornullB != null) {
                            supportFragmentManager = claimOldDaySecurityTermsConditionActivity.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                        getstringornull = claimOldDaySecurityTermsConditionActivity.INotificationSideChannelDefault;
                        if (getstringornull != null) {
                            getstringornull.INotificationSideChannel = claimOldDaySecurityTermsConditionActivity.new b();
                        }
                    }
                }
                str = "failure_check_eligibility_claim_result";
            } else {
                obj = null;
                z = false;
                claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer();
                tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                i = 2;
                if (!StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "layanan ini tersedia pada pukul", false, 2, (Object) null)) {
                    if (!StringsKt.contains$default(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), "fitur ini sedang dalam peningkatan kapasitas. Silakan mengajukan Klaim JHT melalui", z, i, obj)) {
                        getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                        String string48 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                        Intrinsics.checkNotNullExpressionValue(string48, "");
                        String strValueOf2 = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        String string49 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
                        Intrinsics.checkNotNullExpressionValue(string49, "");
                        getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string48, strValueOf2, string49, null, 112);
                        claimOldDaySecurityTermsConditionActivity.INotificationSideChannelDefault = getstringornullB;
                        if (getstringornullB != null) {
                            supportFragmentManager = claimOldDaySecurityTermsConditionActivity.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                        getstringornull = claimOldDaySecurityTermsConditionActivity.INotificationSideChannelDefault;
                        if (getstringornull != null) {
                            getstringornull.INotificationSideChannel = claimOldDaySecurityTermsConditionActivity.new b();
                        }
                    }
                }
                str = "failure_check_eligibility_claim_result";
            }
            lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.INSTANCE;
            String strValueOf3 = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string50 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
            Intrinsics.checkNotNullExpressionValue(string50, "");
            lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater2 = lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.Companion.TuitionPaymentFragmentbindingInflater1(strValueOf3, string50);
            claimOldDaySecurityTermsConditionActivity.onTransact = lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater2;
            FragmentManager supportFragmentManager3 = claimOldDaySecurityTermsConditionActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager3, "");
            if (supportFragmentManager3.findFragmentByTag(lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater2.show(supportFragmentManager3, lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl = claimOldDaySecurityTermsConditionActivity.onTransact;
            if (lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl != null) {
                lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl.a = claimOldDaySecurityTermsConditionActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            str = "failure_check_eligibility_claim_result";
        } else {
            claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer();
            str = "";
        }
        Map<String, Object> mapMutableMapOf18 = MapsKt.mutableMapOf(new Pair("params_check_eligibility_claim", str));
        Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf18, "");
        TargetAspectRatio targetAspectRatio18 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf18, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf18);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelStub(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 67;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        ((isModeInList) claimOldDaySecurityTermsConditionActivity.INotificationSideChannel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Unit unit = Unit.INSTANCE;
        int i4 = getNotifyChildrenChangedOptions + 45;
        getRoot = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c5 A[PHI: r9
  0x00c5: PHI (r9v65 java.lang.Double) = (r9v64 java.lang.Double), (r9v66 java.lang.Double) binds: [B:23:0x00c3, B:20:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x0158  */
    /* JADX WARN: Code duplicated, block: B:48:0x018c  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0226  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws ParseException {
        double dDoubleValue;
        Double doubleOrNull;
        Double doubleOrNull2;
        Double doubleOrNull3;
        int i = 2 % 2;
        int i2 = getRoot + 57;
        getNotifyChildrenChangedOptions = i2 % 128;
        Integer numValueOf = null;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_benefit_detail", "loading_benefit_detail_result"));
            Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
            Intrinsics.checkNotNullParameter("loading_benefit_detail_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("loading_benefit_detail_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_benefit_detail_result", mapMutableMapOf);
            claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_benefit_detail", "success_benefit_detail_result"));
            Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
            Intrinsics.checkNotNullParameter("success_benefit_detail_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("success_benefit_detail_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_benefit_detail_result", mapMutableMapOf2);
            claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer();
            BenefitDetail benefitDetail = (BenefitDetail) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ActivityClaimOldDaySecurityTermsConditionBinding activityClaimOldDaySecurityTermsConditionBinding = (ActivityClaimOldDaySecurityTermsConditionBinding) ((ViewBinding) claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            int i3 = Calendar.getInstance().get(1);
            String str = benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            double dDoubleValue2 = (str == null || (doubleOrNull3 = StringsKt.toDoubleOrNull(str)) == null) ? 0.0d : doubleOrNull3.doubleValue();
            String str2 = benefitDetail.g;
            if (str2 != null) {
                int i4 = getNotifyChildrenChangedOptions + 7;
                getRoot = i4 % 128;
                if (i4 % 2 == 0) {
                    doubleOrNull2 = StringsKt.toDoubleOrNull(str2);
                    int i5 = 46 / 0;
                    if (doubleOrNull2 != null) {
                        dDoubleValue = doubleOrNull2.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                } else {
                    doubleOrNull2 = StringsKt.toDoubleOrNull(str2);
                    if (doubleOrNull2 != null) {
                        dDoubleValue = doubleOrNull2.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                }
            } else {
                dDoubleValue = 0.0d;
            }
            double d = dDoubleValue2 + dDoubleValue + 0.0d;
            if (d < 10000.0d) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, "Pengajuan klaim Anda tidak dapat dilanjutkan dikarenakan tidak memenuhi kelayakan nominal saldo. Silakan kunjungi Kantor Cabang terdekat atau hubungi Call Center 175 untuk informasi lebih lanjut (JHTA028)", string2, new Function0() { // from class: Camera2CapturePipeline
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ClaimOldDaySecurityTermsConditionActivity.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                }, 96);
                FragmentManager supportFragmentManager = claimOldDaySecurityTermsConditionActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                activityClaimOldDaySecurityTermsConditionBinding.containerClaim.setVisibility(8);
            } else {
                activityClaimOldDaySecurityTermsConditionBinding.containerClaim.setVisibility(0);
            }
            String str3 = benefitDetail.a;
            if (str3 != null) {
                int i6 = getNotifyChildrenChangedOptions + 49;
                getRoot = i6 % 128;
                int i7 = i6 % 2;
                if (str3.length() != 0) {
                    int i8 = getNotifyChildrenChangedOptions + 125;
                    getRoot = i8 % 128;
                    int i9 = i8 % 2;
                    activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailTotalBalance.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(benefitDetail.a));
                } else {
                    activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailTotalBalance.setText(claimOldDaySecurityTermsConditionActivity.getString(R.string.rp_0_00));
                }
            } else {
                activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailTotalBalance.setText(claimOldDaySecurityTermsConditionActivity.getString(R.string.rp_0_00));
            }
            String str4 = benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str4 != null) {
                int i10 = getRoot + 69;
                getNotifyChildrenChangedOptions = i10 % 128;
                if (i10 % 2 != 0) {
                    str4.length();
                    throw null;
                }
                if (str4.length() != 0) {
                    activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceBeginning.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                } else {
                    activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceBeginning.setText(claimOldDaySecurityTermsConditionActivity.getString(R.string.rp_0_00));
                }
            } else {
                activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceBeginning.setText(claimOldDaySecurityTermsConditionActivity.getString(R.string.rp_0_00));
            }
            String str5 = benefitDetail.asBinder;
            if (str5 != null) {
                int i11 = getRoot + 111;
                getNotifyChildrenChangedOptions = i11 % 128;
                int i12 = i11 % 2;
                if (str5.length() != 0) {
                    int i13 = getRoot + 59;
                    getNotifyChildrenChangedOptions = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 45 / 0;
                        if (Intrinsics.areEqual(benefitDetail.asBinder.toString(), "0")) {
                            activityClaimOldDaySecurityTermsConditionBinding.tvTuitionDetail.setVisibility(8);
                            TextView textView = activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceTuition;
                            Intrinsics.checkNotNullExpressionValue(textView, "");
                            TextView textView2 = textView;
                            Intrinsics.checkNotNullParameter(textView2, "");
                            textView2.setEnabled(false);
                        } else {
                            activityClaimOldDaySecurityTermsConditionBinding.tvTuitionDetail.setVisibility(0);
                            TextView textView3 = activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceTuition;
                            Intrinsics.checkNotNullExpressionValue(textView3, "");
                            TextView textView4 = textView3;
                            Intrinsics.checkNotNullParameter(textView4, "");
                            textView4.setEnabled(true);
                        }
                    } else if (Intrinsics.areEqual(benefitDetail.asBinder.toString(), "0")) {
                        activityClaimOldDaySecurityTermsConditionBinding.tvTuitionDetail.setVisibility(8);
                        TextView textView5 = activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceTuition;
                        Intrinsics.checkNotNullExpressionValue(textView5, "");
                        TextView textView6 = textView5;
                        Intrinsics.checkNotNullParameter(textView6, "");
                        textView6.setEnabled(false);
                    } else {
                        activityClaimOldDaySecurityTermsConditionBinding.tvTuitionDetail.setVisibility(0);
                        TextView textView7 = activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceTuition;
                        Intrinsics.checkNotNullExpressionValue(textView7, "");
                        TextView textView8 = textView7;
                        Intrinsics.checkNotNullParameter(textView8, "");
                        textView8.setEnabled(true);
                    }
                    TextView textView9 = activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceTuition;
                    String str6 = benefitDetail.g;
                    textView9.setText((str6 == null || str6.length() == 0 || Intrinsics.areEqual(benefitDetail.g, "-")) ? claimOldDaySecurityTermsConditionActivity.getString(R.string.rp_0_00) : getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(benefitDetail.g));
                } else {
                    activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceTuition.setText(claimOldDaySecurityTermsConditionActivity.getString(R.string.rp_0_00));
                    activityClaimOldDaySecurityTermsConditionBinding.tvTuitionDetail.setVisibility(8);
                }
            } else {
                activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailBalanceTuition.setText(claimOldDaySecurityTermsConditionActivity.getString(R.string.rp_0_00));
                activityClaimOldDaySecurityTermsConditionBinding.tvTuitionDetail.setVisibility(8);
            }
            String str7 = benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str7 == null || str7.length() == 0) {
                activityClaimOldDaySecurityTermsConditionBinding.tvDevelopmentEstimationValue.setText(claimOldDaySecurityTermsConditionActivity.getString(R.string.rp_0_00));
            } else {
                Double doubleOrNull4 = StringsKt.toDoubleOrNull(benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                double dDoubleValue3 = doubleOrNull4 != null ? doubleOrNull4.doubleValue() : 0.0d;
                String str8 = benefitDetail.d;
                double dDoubleValue4 = (str8 == null || (doubleOrNull = StringsKt.toDoubleOrNull(str8)) == null) ? 0.0d : doubleOrNull.doubleValue();
                TextView textView10 = activityClaimOldDaySecurityTermsConditionBinding.tvDevelopmentEstimationValue;
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(dDoubleValue3 + dDoubleValue4));
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";
                }
                textView10.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            activityClaimOldDaySecurityTermsConditionBinding.tvInfoRsjhtDetailTotalBalance.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(d)));
            String str9 = benefitDetail.TuitionPaymentFragmentbindingInflater1;
            if (str9 != null) {
                int i15 = getRoot + 109;
                getNotifyChildrenChangedOptions = i15 % 128;
                int i16 = i15 % 2;
                if (str9.length() != 0) {
                    try {
                        String strSubstring = benefitDetail.TuitionPaymentFragmentbindingInflater1.substring(6, 10);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        Integer intOrNull = StringsKt.toIntOrNull(strSubstring);
                        if (intOrNull != null) {
                            int i17 = getRoot + 109;
                            getNotifyChildrenChangedOptions = i17 % 128;
                            numValueOf = i17 % 2 != 0 ? Integer.valueOf(intOrNull.intValue() / 0) : Integer.valueOf(intOrNull.intValue() - 1);
                        }
                    } catch (Exception unused) {
                    }
                    claimOldDaySecurityTermsConditionActivity.b = numValueOf;
                } else {
                    TextView textView11 = activityClaimOldDaySecurityTermsConditionBinding.tvTitleInformationJhtLast;
                    int i18 = Integer.parseInt(String.valueOf(i3));
                    StringBuilder sb = new StringBuilder("Rincian Saldo JHT Tahun ");
                    sb.append(i18 - 1);
                    textView11.setText(sb.toString());
                }
            } else {
                TextView textView12 = activityClaimOldDaySecurityTermsConditionBinding.tvTitleInformationJhtLast;
                int i19 = Integer.parseInt(String.valueOf(i3));
                StringBuilder sb2 = new StringBuilder("Rincian Saldo JHT Tahun ");
                sb2.append(i19 - 1);
                textView12.setText(sb2.toString());
            }
            claimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_benefit_detail", "failure_benefit_detail_result"));
            Intrinsics.checkNotNullParameter(claimOldDaySecurityTermsConditionActivity, "");
            Intrinsics.checkNotNullParameter("failure_benefit_detail_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("failure_benefit_detail_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_benefit_detail_result", mapMutableMapOf3);
            claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer();
            getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string3 = claimOldDaySecurityTermsConditionActivity.getString(R.string.action_retry);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_info_blue, "", strValueOf, string3, new Function0() { // from class: r8lambdapsaU5qiXtqvOekL_ePKwcuNUq8E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClaimOldDaySecurityTermsConditionActivity.cancel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }, claimOldDaySecurityTermsConditionActivity.getString(R.string.action_return), new Function0() { // from class: addSource
                private static final byte[] $$c = {94, -1, 37, -59};
                private static final int $$f = 42;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {82, Base64.padSymbol, -66, -42, -17, -3, 58, -57, -19, 1, -14, -6, 4, -15, 66, -59, -2, -24, 14, 46, -65, -3, -17, 65, -33, -35, -17, 43, -34, -24, 14, 9, -38, 0, -8, 8, 60, -5, -38, -56, -1, 10, -18, -1, 8, -16, 20, -43, 6, -11, 7, -2, -20, 6, 1, 18, -26, -17, 6, -7, -2, 43, -12};
                private static final int $$e = 22;
                private static final byte[] $$a = {70, -114, 113, 8, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
                private static final int $$b = 75;
                private static int b = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                private static char[] TuitionPaymentFragmentbindingInflater1 = {57187, 57186, 57188, 60079, 60063, 60073, 60045, 60053, 57192, 60040, 60050, 60041, 60117, 60090, 60049, 57191, 60047, 60072, 60060, 60088, 60055, 60046, 57193, 60083, 60058, 57184, 60056, 60034, 57189, 60062, 60052, 60054, 60051, 57190, 60043, 60048};
                private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57191;

                /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(short r7, byte r8, int r9, java.lang.Object[] r10) {
                    /*
                        int r7 = r7 + 4
                        int r8 = r8 * 15
                        int r8 = 53 - r8
                        int r9 = r9 * 2
                        int r9 = r9 + 84
                        byte[] r0 = defpackage.addSource.$$a
                        byte[] r1 = new byte[r8]
                        r2 = 0
                        if (r0 != 0) goto L15
                        r3 = r9
                        r4 = r2
                        r9 = r7
                        goto L2d
                    L15:
                        r3 = r2
                    L16:
                        int r4 = r3 + 1
                        byte r5 = (byte) r9
                        r1[r3] = r5
                        int r7 = r7 + 1
                        if (r4 != r8) goto L27
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L27:
                        r3 = r0[r7]
                        r6 = r9
                        r9 = r7
                        r7 = r3
                        r3 = r6
                    L2d:
                        int r7 = -r7
                        int r3 = r3 + r7
                        int r7 = r3 + (-11)
                        r3 = r4
                        r6 = r9
                        r9 = r7
                        r7 = r6
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.addSource.a(short, byte, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void d(short r6, byte r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r8 = r8 * 59
                        int r0 = 60 - r8
                        int r6 = 99 - r6
                        int r7 = r7 * 59
                        int r7 = 62 - r7
                        byte[] r1 = defpackage.addSource.$$d
                        byte[] r0 = new byte[r0]
                        int r8 = 59 - r8
                        r2 = 0
                        if (r1 != 0) goto L17
                        r3 = r7
                        r6 = r8
                        r4 = r2
                        goto L2f
                    L17:
                        r3 = r2
                    L18:
                        int r7 = r7 + 1
                        byte r4 = (byte) r6
                        r0[r3] = r4
                        if (r3 != r8) goto L27
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L27:
                        int r3 = r3 + 1
                        r4 = r1[r7]
                        r5 = r3
                        r3 = r7
                        r7 = r4
                        r4 = r5
                    L2f:
                        int r7 = -r7
                        int r6 = r6 + r7
                        int r6 = r6 + (-5)
                        r7 = r3
                        r3 = r4
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.addSource.d(short, byte, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:22:0x0213  */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws Throwable {
                    Object[] objArr;
                    char c = 2;
                    int i20 = 2 % 2;
                    int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i23 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                        byte[] bArr = $$a;
                        Object[] objArr2 = new Object[1];
                        a(bArr[28], bArr[5], bArr[7], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, i23, jumpTapTimeout, -1650998592, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{25, 6, 5, '\n', Typography.quote, 6, 0, 16, '!', 6, '\r', '\f', '!', 15, 17, 28, 1, 25, 18, ' ', 29, ' '}, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 19), (ViewConfiguration.getScrollBarSize() >> 8) + 22, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(new char[]{26, 23, 28, 30, 11, 27, 5, 0, 24, 25, 22, 14, 7, Typography.quote, 13927}, (byte) (104 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int i24 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
                        byte[] bArr2 = $$a;
                        byte b2 = (byte) (bArr2[17] + 1);
                        byte b3 = bArr2[7];
                        Object[] objArr5 = new Object[1];
                        a(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, i24, absoluteGravity, 2012020043, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int iNormalizeMetaState = 876 - KeyEvent.normalizeMetaState(0);
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                            byte b4 = $$a[7];
                            Object[] objArr6 = new Object[1];
                            a((byte) 88, b4, b4, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iNormalizeMetaState, modifierMetaStateMask, 2012931276, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i25 = ((1001096684 + (((~iIdentityHashCode) | 48836219) * 1444)) + (((~(iIdentityHashCode | (-492015060))) | ((~(532325288 | iIdentityHashCode)) | 4262995)) * (-1444))) - 171998782;
                        int i26 = (i25 << 13) ^ i25;
                        int i27 = i26 ^ (i26 >>> 17);
                        ((int[]) objArr[1])[0] = i27 ^ (i27 << 5);
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(new char[]{25, 6, 5, '\n', Typography.quote, 6, 0, 16, 28, 30, 30, 16, 14, 25, 22, 16, 7, 11, 15, 28, 2, '!', 17, '#', 28, 0}, (byte) (73 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(new char[]{27, 20, 13874, 13874, 25, 11, 17, 14, 13876, 13876, 22, '\b', 27, 25, 22, 16, 31, 6}, (byte) (74 - Color.red(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, objArr9);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            if (applicationContext instanceof ContextWrapper) {
                                int i28 = b + 109;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
                                int i29 = i28 % 2;
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = applicationContext.getApplicationContext();
                                } else {
                                    applicationContext = null;
                                }
                            } else {
                                applicationContext = applicationContext.getApplicationContext();
                            }
                        }
                        Object[] objArr10 = new Object[1];
                        c(new char[]{'\f', 26, '\f', 30, 14, 18, 25, 6, 24, 18, 15, 29, '\n', 15, 25, '#'}, (byte) (22 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 16, objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        c(new char[]{16, '\n', 25, 11, 22, 16, 15, 28, 18, 29, '\b', '!', 18, 31, 5, 28}, (byte) (125 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 16, objArr11);
                        int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                        int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        try {
                            Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 728013690};
                            byte[] bArr3 = $$d;
                            byte b5 = bArr3[33];
                            Object[] objArr13 = new Object[1];
                            d(b5, bArr3[9], b5, objArr13);
                            Class<?> cls4 = Class.forName((String) objArr13[0]);
                            byte b6 = bArr3[9];
                            byte b7 = b6;
                            Object[] objArr14 = new Object[1];
                            d(b6, bArr3[33], b7, objArr14);
                            Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                            if (applicationContext != null) {
                                int i32 = b + 19;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
                                int i33 = i32 % 2;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char cRed = (char) Color.red(0);
                                    int iNormalizeMetaState2 = 876 - KeyEvent.normalizeMetaState(0);
                                    int i34 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    byte b8 = $$a[7];
                                    Object[] objArr16 = new Object[1];
                                    a((byte) 88, b8, b8, objArr16);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, iNormalizeMetaState2, i34, 2012931276, false, (String) objArr16[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                try {
                                    Object[] objArr17 = new Object[1];
                                    c(new char[]{25, 6, 5, '\n', Typography.quote, 6, 0, 16, '!', 6, '\r', '\f', '!', 15, 17, 28, 1, 25, 18, ' ', 29, ' '}, (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19), 22 - View.resolveSizeAndState(0, 0, 0), objArr17);
                                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                                    Object[] objArr18 = new Object[1];
                                    c(new char[]{26, 23, 28, 30, 11, 27, 5, 0, 24, 25, 22, 14, 7, Typography.quote, 13927}, (byte) (104 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, objArr18);
                                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                        int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
                                        int iAlpha = Color.alpha(0) + 10;
                                        byte[] bArr4 = $$a;
                                        byte b9 = (byte) (bArr4[17] + 1);
                                        byte b10 = bArr4[7];
                                        Object[] objArr19 = new Object[1];
                                        a(b9, b10, b10, objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, modifierMetaStateMask2, iAlpha, 2012020043, false, (String) objArr19[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int minimumFlingVelocity = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        int iRed = Color.red(0) + 10;
                                        byte[] bArr5 = $$a;
                                        Object[] objArr20 = new Object[1];
                                        a(bArr5[28], bArr5[5], bArr5[7], objArr20);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, minimumFlingVelocity, iRed, -1650998592, false, (String) objArr20[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused2) {
                                    throw new RuntimeException();
                                }
                            }
                            objArr = objArr15;
                            c = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int i35 = ((int[]) objArr[c])[0];
                    int i36 = ((int[]) objArr[0])[0];
                    if (i36 != i35) {
                        throw new RuntimeException(String.valueOf(i36));
                    }
                    int i37 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                    b = i37 % 128;
                    int i38 = i37 % 2;
                    int i39 = ((int[]) objArr[1])[0];
                    Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i40 = i39 + ((((-758182276) + (((~((~iIdentityHashCode2) | 268053611)) | 268517888) * 446)) + (((~(iIdentityHashCode2 | 536571499)) | 39845952) * 446)) - 500106240);
                    int i41 = (i40 << 13) ^ i40;
                    int i42 = i41 ^ (i41 >>> 17);
                    ((int[]) objArr21[1])[0] = i42 ^ (i42 << 5);
                    return ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }

                private static void c(char[] cArr, byte b2, int i20, Object[] objArr) throws Throwable {
                    int i21;
                    Object obj;
                    int i22 = 2;
                    int i23 = 2 % 2;
                    deInitSession deinitsession = new deInitSession();
                    char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                    int i24 = 1770390596;
                    Object obj2 = null;
                    int i25 = 8;
                    if (cArr2 != null) {
                        int i26 = $10 + 37;
                        $11 = i26 % 128;
                        int i27 = i26 % 2;
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i28 = 0;
                        while (i28 < length) {
                            int i29 = $10 + 79;
                            $11 = i29 % 128;
                            int i30 = i29 % i22;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i28])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i24);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cResolveSize = (char) View.resolveSize(0, 0);
                                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> i25) + 2267;
                                    int offsetAfter = 33 - TextUtils.getOffsetAfter("", 0);
                                    byte b3 = (byte) ($$c[1] + 1);
                                    byte b4 = b3;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, scrollBarSize, offsetAfter, -1927765101, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                                }
                                cArr3[i28] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                i28++;
                                i22 = 2;
                                i24 = 1770390596;
                                i25 = 8;
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
                        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int mirror = AndroidCharacter.getMirror('0') + 2219;
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34;
                            byte b5 = (byte) ($$c[1] + 1);
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, mirror, iIndexOf, -1927765101, false, $$g(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        char[] cArr4 = new char[i20];
                        if (i20 % 2 != 0) {
                            int i31 = $11 + 85;
                            $10 = i31 % 128;
                            if (i31 % 2 != 0) {
                                i21 = i20 + 88;
                                cArr4[i21] = (char) (cArr[i21] << b2);
                            } else {
                                i21 = i20 - 1;
                                cArr4[i21] = (char) (cArr[i21] - b2);
                            }
                        } else {
                            i21 = i20;
                        }
                        if (i21 > 1) {
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i21) {
                                int i32 = $10 + 5;
                                $11 = i32 % 128;
                                int i33 = i32 % 2;
                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                    obj = obj2;
                                } else {
                                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 49268);
                                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 3261;
                                        int defaultSize = 30 - View.getDefaultSize(0, 0);
                                        byte b7 = (byte) ($$c[1] + 1);
                                        byte b8 = b7;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, offsetAfter2, defaultSize, -127612708, false, $$g(b7, b8, (byte) (b8 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char packedPositionGroup = (char) (22878 - ExpandableListView.getPackedPositionGroup(0L));
                                            int packedPositionChild2 = 593 - ExpandableListView.getPackedPositionChild(0L);
                                            int size = View.MeasureSpec.getSize(0) + 17;
                                            byte b9 = (byte) ($$c[1] + 1);
                                            byte b10 = b9;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, packedPositionChild2, size, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                        int i34 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i34];
                                    } else {
                                        obj = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            int i35 = $10 + 71;
                                            $11 = i35 % 128;
                                            int i36 = i35 % 2;
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i37 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i38 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i37];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i38];
                                        } else {
                                            int i39 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i40 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i39];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i40];
                                        }
                                    }
                                }
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                                obj2 = obj;
                            }
                        }
                        for (int i41 = 0; i41 < i20; i41++) {
                            cArr4[i41] = (char) (cArr4[i41] ^ 13722);
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

                /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(byte r7, int r8, short r9) {
                    /*
                        int r8 = r8 * 2
                        int r8 = r8 + 4
                        int r9 = 116 - r9
                        int r7 = r7 * 3
                        int r7 = 1 - r7
                        byte[] r0 = defpackage.addSource.$$c
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L15
                        r3 = r9
                        r4 = r2
                        r9 = r8
                        goto L28
                    L15:
                        r3 = r2
                        r6 = r9
                        r9 = r8
                        r8 = r6
                    L19:
                        int r4 = r3 + 1
                        byte r5 = (byte) r8
                        r1[r3] = r5
                        if (r4 != r7) goto L26
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        return r7
                    L26:
                        r3 = r0[r9]
                    L28:
                        int r8 = r8 + r3
                        int r9 = r9 + 1
                        r3 = r4
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.addSource.$$g(byte, int, short):java.lang.String");
                }
            });
            claimOldDaySecurityTermsConditionActivity.getInterfaceDescriptor = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            FragmentManager supportFragmentManager2 = claimOldDaySecurityTermsConditionActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
            if (supportFragmentManager2.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager2, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } else {
            claimOldDaySecurityTermsConditionActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity = (ClaimOldDaySecurityTermsConditionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 97;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        claimOldDaySecurityTermsConditionActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getNotifyChildrenChangedOptions + 121;
        getRoot = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 59;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = getNotifyChildrenChangedOptions + 103;
        getRoot = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity, Ref.ObjectRef objectRef) {
        int i = 2 % 2;
        int i2 = getRoot + 83;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, (String) objectRef.element, "Appointment Online", 0, null, false, 56);
        claimOldDaySecurityTermsConditionActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getNotifyChildrenChangedOptions + 57;
        getRoot = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit RemoteActionCompatParcelizer(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getRoot + 121;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        claimOldDaySecurityTermsConditionActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getNotifyChildrenChangedOptions + 101;
        getRoot = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit INotificationSideChannelStubProxy(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        int i = 2 % 2;
        int i2 = getRoot + 31;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            CheckEligibilityOldDaySecurityActivity.Companion tuitionPaymentFragmentbindingInflater1 = CheckEligibilityOldDaySecurityActivity.INSTANCE;
            CheckEligibilityOldDaySecurityActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, claimOldDaySecurityTermsConditionActivity.asInterface);
            return Unit.INSTANCE;
        }
        CheckEligibilityOldDaySecurityActivity.Companion tuitionPaymentFragmentbindingInflater2 = CheckEligibilityOldDaySecurityActivity.INSTANCE;
        CheckEligibilityOldDaySecurityActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityTermsConditionActivity, claimOldDaySecurityTermsConditionActivity.asInterface);
        int i3 = 60 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1222648970, new Object[]{claimOldDaySecurityTermsConditionActivity, virtualCameraAdapter1}, ScholarshipHistoryRequest.b(), 1222648972, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(794907566, new Object[]{claimOldDaySecurityTermsConditionActivity}, ScholarshipHistoryRequest.b(), -794907561, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
    }

    public static /* synthetic */ Unit cancelAll(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(1560784330, new Object[]{claimOldDaySecurityTermsConditionActivity}, ScholarshipHistoryRequest.b(), -1560784329, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
    }

    public static /* synthetic */ Unit onTransact(ClaimOldDaySecurityTermsConditionActivity claimOldDaySecurityTermsConditionActivity) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(376486216, new Object[]{claimOldDaySecurityTermsConditionActivity}, ScholarshipHistoryRequest.b(), -376486210, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
    }

    static {
        getExtras = 0;
        g();
        TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(null);
        int i = isConnected + 55;
        getExtras = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void cancelAll() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(675719463, new Object[]{this}, ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), -675719463, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getRoot;
        int i3 = i2 + 113;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        getNotifyChildrenChangedOptions = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_claim_old_day_security_terms_condition;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1413309545, new Object[]{this}, (-1129546027) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5), 1413309552, ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), ScholarshipHistoryRequest.b());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1019608234, new Object[]{this}, (-991859587) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_left_eye_closed).substring(0, 14).length(), 1019608237, ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), ScholarshipHistoryRequest.b(), 1268616867 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingaddress_empty).substring(18, 19).codePointAt(0));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(2073755693, new Object[]{this}, ScholarshipHistoryRequest.b(), -2073755689, ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = getRoot + 95;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        write = (char) 50743;
        read = (char) 50755;
        disconnect = (char) 25844;
        getItem = (char) 63898;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, byte r6, short r7) {
        /*
            int r5 = r5 * 3
            int r5 = 108 - r5
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity.$$c
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity.$$i(byte, byte, short):java.lang.String");
    }
}
