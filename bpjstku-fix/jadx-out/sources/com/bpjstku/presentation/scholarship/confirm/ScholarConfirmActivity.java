package com.bpjstku.presentation.scholarship.confirm;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert;
import com.bpjstku.data.scholarship.model.request.ScholarshipEducationListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmBeginRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmRequest;
import com.bpjstku.data.scholarship.model.response.ScholarshipFmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipVerificationResponse;
import com.bpjstku.data.setting.model.request.KeyRequest;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.databinding.ActivityScholarConfirmBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.jp.model.JpDataTk;
import com.bpjstku.domain.scholarship.model.ScholarBenefit;
import com.bpjstku.domain.scholarship.model.ScholarInsertResult;
import com.bpjstku.domain.scholarship.model.ScholarPerson;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2;
import com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity;
import com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity;
import com.bpjstku.util.custom.CircleImageView;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.Scopes;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2CameraCoordinatorExternalSyntheticLambda0;
import defpackage.Camera2InteropExtender;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.IntegerRes;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SynchronizedCaptureSessionImplExternalSyntheticLambda0;
import defpackage.TargetAspectRatio;
import defpackage.ToolbarActionBarToolbarMenuCallback;
import defpackage.TwilightManager;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.dumpAudioCapabilities;
import defpackage.generateUltraHdrSupportedCombinationList;
import defpackage.getCameraOperatingMode;
import defpackage.getCameraState;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRatioByPercentage;
import defpackage.getSessionConfigTemplateType;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isStateValid;
import defpackage.isTorchResetRequired;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdacreateCameraSelectorById0;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import defpackage.lambdasetZoomRatio0androidxcameracamera2internalZoomControl;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import defpackage.unregisterMediaButtonEventReceiver;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016R\u0015\u0010\u0007\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0015\u0010\u0006\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0015\u0010\u001d\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0015\u0010\u001c\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0015\u0010\n\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0015\u0010 \u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0015\u0010\t\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0014\u0010\b\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010$\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u0010\"\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010-\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0016\u0010.\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0015\u00103\u001a\u0002018BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b2\u0010\u0018R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u00106R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0015\u0010&\u001a\u00020:8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0017\u0010<\u001a\u0004\u0018\u00010;8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010="}, d2 = {"Lcom/bpjstku/presentation/scholarship/confirm/ScholarConfirmActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityScholarConfirmBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "LlambdaenableTorch1androidxcameracamera2internalTorchControl;", "connect", "LisStateValid;", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LacquireBuffer;", "LgenerateUltraHdrSupportedCombinationList;", "d", "LIntegerRes;", "onTransact", "LgetRatioByPercentage;", "INotificationSideChannel", "Ljava/text/SimpleDateFormat;", "getInterfaceDescriptor", "Ljava/text/SimpleDateFormat;", "", "notify", "Ljava/lang/String;", "write", "cancelAll", "cancel", "RemoteActionCompatParcelizer", "INotificationSideChannelDefault", "Z", "LlambdasetZoomRatio0androidxcameracamera2internalZoomControl;", "INotificationSideChannelStub", "INotificationSideChannelStubProxy", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResultLauncher;", "", "Ljava/io/File;", "Ljava/util/List;", "LoutputFormatToAudioProfile;", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "read", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScholarConfirmActivity extends BindingBaseActivity<ActivityScholarConfirmBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int disconnect;
    private static int read;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ActivityResultLauncher<Intent> INotificationSideChannelDefault;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private String onTransact;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String notify;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private String INotificationSideChannel;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String cancelAll;
    private static final byte[] $$c = {29, -5, -24, -13};
    private static final int $$f = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {27, -8, 5, 78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 249;
    private static int getItem = 1;
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompat = 1;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final SimpleDateFormat a = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String cancel = "";

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy INotificationSideChannelStubProxy = LazyKt.lazy(new Function0() { // from class: SynchronizedCaptureSessionBaseImplExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final List<File> INotificationSideChannelStub = new ArrayList();

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy getInterfaceDescriptor = LazyKt.lazy(new Function0() { // from class: SynchronizedCaptureSessionBaseImplExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy read = LazyKt.lazy(new Function0() { // from class: SynchronizedCaptureSessionBaseImpl1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return (JpDataTk) ScholarConfirmActivity.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1851543013, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1851543012, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<String, String> connect = new Function1() { // from class: SynchronizedCaptureSessionBaseImplExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return (String) ScholarConfirmActivity.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1778224382, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1778224375, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{(String) obj});
        }
    };

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i6)) | i9 | (~(i8 | i6));
        int i11 = ~i6;
        int i12 = (~(i11 | i8 | i3)) | (~(i7 | i11 | i5));
        int i13 = i3 + i5 + i + ((-195996979) * i4) + ((-904719387) * i2);
        int i14 = i13 * i13;
        int i15 = (i3 * 1886715248) + 940376064 + (1886715248 * i5) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i) + ((-1389494272) * i4) + (1623064576 * i2) + (1510801408 * i14);
        int i16 = (i3 * 1590984816) + 1398186415 + (i5 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i * 1590985553) + (i4 * (-1025631779)) + (i2 * 1121679989) + (i14 * 622657536);
        switch (i15 + (i16 * i16 * (-1928134656))) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 3:
                int i17 = 2 % 2;
                int i18 = IconCompatParcelizer + 39;
                int i19 = i18 % 128;
                MediaBrowserCompat = i19;
                int i20 = i18 % 2;
                int i21 = i19 + 45;
                IconCompatParcelizer = i21 % 128;
                int i22 = i21 % 2;
                return Integer.valueOf(R.layout.activity_scholar_confirm);
            case 4:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 5:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return g(objArr);
            default:
                return b(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r8 = 196 - r8
            byte[] r0 = com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.$$a
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/scholarship/confirm/ScholarConfirmActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ScholarConfirmActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ScholarConfirmActivity() {
        final ScholarConfirmActivity scholarConfirmActivity = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = scholarConfirmActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final ScholarConfirmActivity scholarConfirmActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<lambdaenableTorch1androidxcameracamera2internalTorchControl>() { // from class: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$viewModel$default$1
            private static final byte[] $$c = {25, 31, 20, 1};
            private static final int $$d = 230;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {38, 31, -70, -1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 158;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {44243, 18630, 25826, 142, 15541, 55385, 62538, 36906, 35841, 43063, 17880, 25048, 7663, 14734, 54698, 61722, 60753, 35175, 42248, 16680, 32479, 6888, 14074, 13497, 53409, 64670, 39121, 42182, 16428, 27694, 2049, 5229, 12373, 56750, 63913, 34185, 41442, 19963, 26934, 29976, 4363, 45565, 21992, 31180, 7584, 8603, 50551, 59748, 36100, 37167, 46361, 22774, 31990, 193, 9376, 51332, 60468, 61516, 37963, 47206, 23603, 25572, 1998, 11212, 53155, 54159, 63351, 39756, 48971, 17195, 26368, 2777, 11988, 12986, 54953, 23382, 48966, 37733, 63257, 52011, 64322, 7954, 13101, 22336, 27434, 36742, 41887, 51122, 56265, 65448, 4613, 13855, 19006, 28251, 33324, 42639, 47784, 57013, 62156, 5860, 10498, 19758, 24883, 34135, 39288, 48585, 53691, 62896, 45485, 45550, 21993, 31110, 7606, 8593, 50556, 59765, 36173, 37163, 46359, 22778, 31982, 193};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -5588770588903910010L;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r7, short r8, int r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 + 1
                    int r9 = 145 - r9
                    byte[] r0 = com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$viewModel$default$1.$$a
                    int r8 = r8 * 14
                    int r8 = r8 + 84
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r9
                    r5 = r2
                    goto L2b
                L12:
                    r3 = r2
                L13:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    byte r4 = (byte) r9
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L25
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
                    int r9 = r9 + 1
                    int r3 = r3 + r8
                    int r8 = r3 + (-11)
                    r3 = r5
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$viewModel$default$1.c(byte, short, int, java.lang.Object[]):void");
            }

            private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i5 = $11 + 69;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 / 4;
                }
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i7 = $11 + 27;
                    $10 = i7 % 128;
                    if (i7 % i3 != 0) {
                        int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i * i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cGreen = (char) Color.green(0);
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2187;
                                int packedPositionGroup = 40 - ExpandableListView.getPackedPositionGroup(0L);
                                byte b = $$c[3];
                                byte b2 = (byte) (b - 1);
                                byte b3 = (byte) (-b);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iKeyCodeFromString, packedPositionGroup, 841711447, false, $$e(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c2 = (char) (33018 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int scrollDefaultDelay = 3011 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 27;
                                byte b4 = $$c[3];
                                byte b5 = (byte) (b4 - 1);
                                byte b6 = (byte) (-b4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, scrollDefaultDelay, modifierMetaStateMask, 321985076, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cLastIndexOf = (char) (36504 - TextUtils.lastIndexOf("", '0', 0));
                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 3376;
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 18;
                                byte b7 = $$c[3];
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, scrollBarSize, iLastIndexOf, -968507904, false, $$e((byte) (b7 - 1), (byte) (-b7), b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i9 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int iMyTid = 2187 - (Process.myTid() >> 22);
                                int iAxisFromString = MotionEvent.axisFromString("") + 41;
                                byte b8 = $$c[3];
                                byte b9 = (byte) (b8 - 1);
                                byte b10 = (byte) (-b8);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iMyTid, iAxisFromString, 841711447, false, $$e(b9, b10, (byte) (b10 + 3)), new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char c4 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33017);
                                    int fadingEdgeLength = 3011 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 26;
                                    byte b11 = $$c[3];
                                    byte b12 = (byte) (b11 - 1);
                                    byte b13 = (byte) (-b11);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, fadingEdgeLength, offsetBefore, 321985076, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i9] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char c5 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36504);
                                    int iMyPid = 3376 - (Process.myPid() >> 22);
                                    int iArgb = Color.argb(0, 0, 0, 0) + 17;
                                    byte b14 = $$c[3];
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c5, iMyPid, iArgb, -968507904, false, $$e((byte) (b14 - 1), (byte) (-b14), b14), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
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
                    i3 = 2;
                }
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i10 = $11 + 113;
                $10 = i10 % 128;
                int i11 = 2;
                int i12 = i10 % 2;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i13 = $11 + 85;
                    $10 = i13 % 128;
                    if (i13 % i11 != 0) {
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        try {
                            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char defaultSize = (char) (View.getDefaultSize(0, 0) + 36505);
                                int i14 = 3376 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i15 = 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                byte b15 = $$c[3];
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(defaultSize, i14, i15, -968507904, false, $$e((byte) (b15 - 1), (byte) (-b15), b15), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                            throw null;
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    }
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cAlpha = (char) (36505 - Color.alpha(0));
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 3376;
                        int capsMode = 17 - TextUtils.getCapsMode("", 0, 0);
                        byte b16 = $$c[3];
                        String str$$e = $$e((byte) (b16 - 1), (byte) (-b16), b16);
                        i11 = 2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAlpha, threadPriority, capsMode, -968507904, false, str$$e, new Class[]{Object.class, Object.class});
                    } else {
                        i11 = 2;
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
                }
                objArr[0] = new String(cArr);
            }

            /* JADX WARN: Type inference failed for: r1v11, types: [androidx.lifecycle.ViewModel, lambdaenableTorch1androidxcameracamera2internalTorchControl] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl invoke() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Reflection.getOrCreateKotlinClass(lambdaenableTorch1androidxcameracamera2internalTorchControl.class);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                LifecycleOwner lifecycleOwner = scholarConfirmActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(lambdaenableTorch1androidxcameracamera2internalTorchControl.class);
                if (lifecycleOwner == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
                }
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                ?? B = isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                return B;
            }

            {
                super(0);
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r29, int r30, int r31, int r32) {
                /*
                    Method dump skipped, instruction units count: 2012
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context, int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, byte r7, byte r8) {
                /*
                    int r6 = r6 * 3
                    int r0 = 1 - r6
                    byte[] r1 = com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$viewModel$default$1.$$c
                    int r8 = r8 * 3
                    int r8 = 115 - r8
                    int r7 = r7 + 4
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r1 != 0) goto L17
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L25:
                    int r7 = r7 + 1
                    r3 = r1[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L2c:
                    int r7 = r7 + r3
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$viewModel$default$1.$$e(byte, byte, byte):java.lang.String");
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<isStateValid>() { // from class: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, isStateValid] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ isStateValid invoke() {
                LifecycleOwner lifecycleOwner = scholarConfirmActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(isStateValid.class);
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
        this.g = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = scholarConfirmActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asBinder = LazyKt.lazy(new Function0<generateUltraHdrSupportedCombinationList>() { // from class: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [generateUltraHdrSupportedCombinationList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final generateUltraHdrSupportedCombinationList invoke() {
                ComponentCallbacks componentCallbacks = scholarConfirmActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(generateUltraHdrSupportedCombinationList.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.d = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$inject$default$4
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = scholarConfirmActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asInterface = LazyKt.lazy(new Function0<getRatioByPercentage>() { // from class: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity$special$$inlined$inject$default$5
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getRatioByPercentage, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getRatioByPercentage invoke() {
                ComponentCallbacks componentCallbacks = scholarConfirmActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getRatioByPercentage.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ ActivityResultLauncher asInterface(ScholarConfirmActivity scholarConfirmActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = scholarConfirmActivity.INotificationSideChannelDefault;
        if (i3 != 0) {
            return activityResultLauncher;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ScholarConfirmActivity scholarConfirmActivity = (ScholarConfirmActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 17;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        List<File> list = scholarConfirmActivity.INotificationSideChannelStub;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 81;
        MediaBrowserCompat = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityScholarConfirmBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        ScholarConfirmActivity$bindingInflater$1 scholarConfirmActivity$bindingInflater$1 = ScholarConfirmActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = MediaBrowserCompat + 121;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return scholarConfirmActivity$bindingInflater$1;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        private /* synthetic */ unregisterMediaButtonEventReceiver TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(unregisterMediaButtonEventReceiver unregistermediabuttoneventreceiver) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = unregistermediabuttoneventreceiver;
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dismiss();
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0172  */
    /* JADX WARN: Code duplicated, block: B:41:0x0173  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(read)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3291, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, 1199271174, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myPid() >> 22), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 650, TextUtils.indexOf((CharSequence) "", '0') + 45, -450685997, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
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
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i7 = $11 + 33;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.green(0) + 651, 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -450685997, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            int i8 = $10 + 3;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
        int i10 = $11 + 53;
        $10 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityScholarConfirmBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnConfirmation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: SynchronizedCaptureSessionBaseImplExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (Unit) ScholarConfirmActivity.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2022484453, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -2022484449, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{(View) obj});
            }
        }));
        MaterialButton materialButton2 = ((ActivityScholarConfirmBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnHistory;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: releaseDeferrableSurfaces
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) obj);
            }
        }));
        int i2 = IconCompatParcelizer + 101;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        if (getIntent().hasExtra(Scopes.PROFILE)) {
            ((lambdaenableTorch1androidxcameracamera2internalTorchControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.setValue((ScholarInsertResult) getIntent().getParcelableExtra(Scopes.PROFILE));
        }
        int i4 = MediaBrowserCompat + 57;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        private /* synthetic */ ScholarPersonDetail b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarPersonDetail scholarPersonDetail) {
            this.b = scholarPersonDetail;
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            ActivityResultLauncher activityResultLauncherAsInterface = ScholarConfirmActivity.asInterface(ScholarConfirmActivity.this);
            if (activityResultLauncherAsInterface != null) {
                ScholarBenefitActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarBenefitActivity.INSTANCE;
                ScholarConfirmActivity scholarConfirmActivity = ScholarConfirmActivity.this;
                ScholarPersonDetail scholarPersonDetail = this.b;
                Intrinsics.checkNotNull(scholarPersonDetail);
                Object[] objArr = {ScholarConfirmActivity.this};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                activityResultLauncherAsInterface.launch(ScholarBenefitActivity.Companion.b(scholarConfirmActivity, scholarPersonDetail, (List) ScholarConfirmActivity.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1350557090, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1350557090, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr)));
            }
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ScholarConfirmActivity scholarConfirmActivity = this;
        ((lambdaenableTorch1androidxcameracamera2internalTorchControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannel.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: lambdaclose2androidxcameracamera2internalSynchronizedCaptureSessionImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((generateUltraHdrSupportedCombinationList) this.asBinder.getValue()).notify.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: SynchronizedCaptureSessionImplExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.d(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((lambdaenableTorch1androidxcameracamera2internalTorchControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancel.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: SynchronizedCaptureSessionStateCallbacks
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((lambdaenableTorch1androidxcameracamera2internalTorchControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelStub.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: lambdastartWithDeferrableSurface1androidxcameracamera2internalSynchronizedCaptureSessionBaseImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.d.getValue()).b.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: SynchronizedCaptureSessionImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.b, (VirtualCameraAdapter1) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (Unit) ScholarConfirmActivity.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1976170322, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1976170327, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr);
            }
        }));
        ((IntegerRes) this.d.getValue()).MediaBrowserCompat.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: SynchronizedCaptureSessionImplExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.a(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((lambdaenableTorch1androidxcameracamera2internalTorchControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).onTransact.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: TemplateTypeUtil1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((lambdaenableTorch1androidxcameracamera2internalTorchControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: TorchControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (ScholarInsertResult) obj);
            }
        }));
        ((lambdaenableTorch1androidxcameracamera2internalTorchControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).notify.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getCaptureConfigTemplateType
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.b, (VirtualCameraAdapter1) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (Unit) ScholarConfirmActivity.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 817870439, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -817870437, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr);
            }
        }));
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: TemplateTypeUtil
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.asInterface(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        VideoRecordEventStart<TwilightManager> videoRecordEventStartHide = ((isStateValid) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.hide();
        Intrinsics.checkNotNullExpressionValue(videoRecordEventStartHide, "");
        VideoRecordEventStart<TwilightManager> videoRecordEventStartObserveOn = videoRecordEventStartHide.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: lambdaonConfigured1androidxcameracamera2internalSynchronizedCaptureSessionImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.b(this.TuitionPaymentFragmentbindingInflater1, (TwilightManager) obj);
            }
        };
        logToString<? super TwilightManager> logtostring = new logToString() { // from class: closeCreatedSession
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr = {function1, obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                ScholarConfirmActivity.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -953947821, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 953947827, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr);
            }
        };
        final Function1 function2 = new Function1() { // from class: lambdaopenCaptureSession0androidxcameracamera2internalSynchronizedCaptureSessionImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartObserveOn.subscribe(logtostring, new logToString() { // from class: SynchronizedCaptureSessionStateCallbacksAdapter
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                ScholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        ((getRatioByPercentage) this.asInterface.getValue()).asInterface.observe(scholarConfirmActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new SynchronizedCaptureSessionImplExternalSyntheticLambda0(this)));
        int i2 = MediaBrowserCompat + 77;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        this.INotificationSideChannelDefault = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: SynchronizedCaptureSessionBaseImplApi23Impl
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ScholarConfirmActivity.b(this.b, (ActivityResult) obj);
            }
        });
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            ((ActivityScholarConfirmBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvNamesLegacy.setText(String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue();
            String str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = "";
            if (str == null) {
                int i2 = IconCompatParcelizer + 17;
                MediaBrowserCompat = i2 % 128;
                int i3 = i2 % 2;
                str = "";
            }
            String str3 = userAsBinder.TuitionPaymentFragmentbindingInflater1;
            if (str3 != null) {
                int i4 = IconCompatParcelizer + 19;
                MediaBrowserCompat = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str2 = str3;
            }
            activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, str2);
            int i5 = MediaBrowserCompat + 51;
            IconCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 45;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        ScholarConfirmActivity scholarConfirmActivity = this;
        Intrinsics.checkNotNullParameter(scholarConfirmActivity, "");
        scholarConfirmActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityScholarConfirmBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityScholarConfirmBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_scholarship_confirmation));
        int i4 = MediaBrowserCompat + 3;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = IconCompatParcelizer + 107;
                MediaBrowserCompat = i4 % 128;
                int i5 = i4 % 2;
                onBackPressed();
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        MediaBrowserCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char edgeSlop = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
                int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                byte b = $$a[7];
                Object[] objArr2 = new Object[1];
                c((byte) 37, b, (short) (b | 193), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, iResolveOpacity, packedPositionType, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
            int iAlpha = Color.alpha(0) + 1755;
            int i3 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
            byte b2 = $$a[7];
            Object[] objArr3 = new Object[1];
            c((byte) 37, b2, (short) (b2 | 193), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, iAlpha, i3, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            int i4 = IconCompatParcelizer + 109;
            MediaBrowserCompat = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                int iLastIndexOf2 = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte b3 = $$a[7];
                Object[] objArr4 = new Object[1];
                c((byte) 52, b3, (short) (b3 | 156), objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iLastIndexOf, iLastIndexOf2, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = 668137750 + ((iIdentityHashCode | 171565872) * (-859)) + (((~(iIdentityHashCode | (-36709121))) | (~(171565872 | i6))) * 859) + (((~((-41036554) | i6)) | 4327433) * 859) + 1617814327;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step5).substring(1, 7).length() + 182, 16 - TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0', 0) + 14, new char[]{65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20}, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 146, 15 - ((byte) KeyEvent.getModifierMetaStateMask()), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_2).substring(10, 11).length() + 2, new char[]{65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b'}, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {-1831533858};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1726 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 1617814327);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
                    int iMyPid = (Process.myPid() >> 22) + 23;
                    byte b4 = $$a[7];
                    Object[] objArr9 = new Object[1];
                    c((byte) 52, b4, (short) (b4 | 156), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, iKeyCodeFromString, iMyPid, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_retake_selfie).substring(8, 13).codePointAt(3) + 84, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 84, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copy_payment_code).substring(9, 10).length() + DerHeader.TAG_CLASS_PRIVATE, 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_mandiri).substring(15, 17).length() + 8, new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                        int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b5 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((byte) 52, b5, (short) (b5 | 104), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, longPressTimeout, iIndexOf, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
                        byte b6 = $$a[7];
                        Object[] objArr13 = new Object[1];
                        c((byte) 37, b6, (short) (b6 | 193), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMakeMeasureSpec, fadingEdgeLength, keyRepeatTimeout, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int i13 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i14 = ~((-159224109) | i13);
            int i15 = ~i13;
            int i16 = i12 + 236320611 + ((i14 | (~(192937261 | i15))) * (-406)) + ((~((-139558945) | i15)) * (-406)) + (((~(i13 | (-53378318))) | (~(159224108 | i15))) * 406);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr14[3])[0] = i18 ^ (i18 << 5);
            int i19 = MediaBrowserCompat + 65;
            IconCompatParcelizer = i19 % 128;
            int i20 = i19 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                int i21 = IconCompatParcelizer + 55;
                int i22 = i21 % 128;
                MediaBrowserCompat = i22;
                int i23 = i21 % 2;
                int i24 = i22 + 117;
                IconCompatParcelizer = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = 4 % 2;
                }
                int i26 = 0;
                while (i26 < strArr.length) {
                    arrayList.add(strArr[i26]);
                    i26++;
                    int i27 = IconCompatParcelizer + 75;
                    MediaBrowserCompat = i27 % 128;
                    if (i27 % 2 == 0) {
                        int i28 = 2 % 5;
                    }
                }
            }
            int[] iArr = new int[i11];
            int i29 = i11 - 1;
            iArr[i29] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i29) % 2) - 1], 1).show();
            int i30 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iNextInt = new Random().nextInt();
            int i31 = ~iNextInt;
            int i32 = i30 + 1679425517 + ((784301055 | iNextInt) * (-676)) + (((~(784034095 | i31)) | (-784301056)) * 676) + (((~(iNextInt | (-266961))) | (~(i31 | 571431669)) | 212869386) * 676);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr15[3])[0] = i34 ^ (i34 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int offsetAfter = 1031 - TextUtils.getOffsetAfter("", 0);
            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte b7 = $$a[7];
            Object[] objArr16 = new Object[1];
            c((byte) 52, b7, (short) (b7 | 52), objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(fadingEdgeLength2, offsetAfter, scrollBarFadeDuration, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr17 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 153, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_done_step1).substring(92, 93).codePointAt(0) - 79, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.danamon_online_instruction_step3).substring(104, 112).codePointAt(2) + 92, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notificationOpenAppToActivateBody).substring(0, 65).codePointAt(37) - 101, new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
            int i35 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
            byte b8 = $$a[7];
            Object[] objArr19 = new Object[1];
            c((byte) 52, b8, (short) (b8 | 156), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionType2, i35, maximumDrawingCacheSize, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 15;
                byte[] bArr = $$a;
                byte b9 = bArr[7];
                Object[] objArr20 = new Object[1];
                c(b9, bArr[5], b9, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, iAxisFromString, offsetAfter2, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i36 = ((int[]) objArr21[3])[0];
            int i37 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i38 = ~layoutDirection;
            int i39 = (-711022115) + (((~((-405431603) | i38)) | 270533682 | (~(161151432 | i38)) | (~((-26253513) | layoutDirection))) * (-84));
            int i40 = (~(layoutDirection | 161151432)) | 405431602;
            int i41 = ~(i38 | (-161151433));
            int i42 = i39 + ((i40 | i41) * (-84)) + ((26253512 | i41) * 84) + 1096113318;
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr[2])[0] = i44 ^ (i44 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_alfamart).substring(0, 8).length() + 180, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, (ViewConfiguration.getEdgeSlop() >> 16) + 13, new char[]{65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 156, ExpandableListView.getPackedPositionGroup(0L) + 16, 4 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b'}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-1831533858};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46039 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1135 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, 1096113318, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int gidForName = Process.getGidForName("") + 16;
                byte b10 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((byte) 52, b10, (short) (b10 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar, maximumFlingVelocity, gidForName, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 45994), 1117 - Color.blue(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            Object[] objArr27 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 1031;
                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 15;
                byte[] bArr2 = $$a;
                byte b11 = bArr2[7];
                Object[] objArr28 = new Object[1];
                c(b11, bArr2[5], b11, objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMakeMeasureSpec2, iIndexOf2, iKeyCodeFromString2, 632103528, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr27);
            try {
                Object[] objArr29 = new Object[1];
                e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 178, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 24, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr29);
                Class<?> cls5 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 157, (KeyEvent.getMaxKeyCode() >> 16) + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 26, new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, objArr30);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int defaultSize = 1031 - View.getDefaultSize(0, 0);
                    int iArgb = 15 - Color.argb(0, 0, 0, 0);
                    byte b12 = $$a[7];
                    Object[] objArr31 = new Object[1];
                    c((byte) 52, b12, (short) (b12 | 156), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c, defaultSize, iArgb, 1344079056, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int i45 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
                    byte b13 = $$a[7];
                    Object[] objArr32 = new Object[1];
                    c((byte) 52, b13, (short) (b13 | 52), objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cMyPid, i45, bitsPerPixel, 1357589585, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                objArr = objArr27;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i46 = ((int[]) objArr[1])[0];
        int i47 = ((int[]) objArr[3])[0];
        if (i47 != i46) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i47));
        }
        int i48 = MediaBrowserCompat + 55;
        IconCompatParcelizer = i48 % 128;
        int i49 = i48 % 2;
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i50 = ((int[]) objArr[2])[0];
        int i51 = ((int[]) objArr[3])[0];
        int i52 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i53 = i50 + 629738686 + (((~((-52428941) | iIdentityHashCode2)) | (~(191851229 | iIdentityHashCode2))) * 69) + (((~(iIdentityHashCode2 | 57101004)) | (~((-187179166) | iIdentityHashCode2)) | 134750225) * (-69)) + 322372416;
        int i54 = i53 ^ (i53 << 13);
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr33[2])[0] = i55 ^ (i55 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d5, code lost:
    
        if (r1 != ((744827982 + (((~((~r3) | (-474039910))) | (-2105016056)) * (-591))) + ((r3 | (-474039910)) * 591))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d7, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.MediaBrowserCompat + 1;
        com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.IconCompatParcelizer = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e2, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e5, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e9, code lost:
    
        r1 = (-912787476) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f2, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f3, code lost:
    
        r1 = (-1437847560) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fc, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        if (r1 == (((1435634636 + ((~(1928197499 | r7)) * 623)) + (((~r7) | 543494176) * (-623))) + (((~(r7 | 820852066)) | ((~(1650839609 | r7)) | (-1928197500))) * 623))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0092, code lost:
    
        if (r1 == ((((-1134047304) + (((~r7) | 378538025) * 1324)) + (((~(r7 | (-1768731523))) | (~(938743979 | r7))) * (-1324))) + 1630888292)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0094, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r3 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 32997276;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1823736464
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r9)
            int r5 = ~r4
            r6 = 1324012648(0x4eead468, float:1.9698944E9)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = -494025106(0xffffffffe28dc66e, float:-1.3076446E21)
            r6 = r6 | r7
            r8 = -1324012649(0xffffffffb1152b97, float:-2.1707132E-9)
            r8 = r8 | r4
            int r8 = ~r8
            r6 = r6 | r8
            int r6 = r6 * (-564)
            r8 = 293902944(0x11849a60, float:2.092107E-28)
            int r8 = r8 + r6
            r6 = -207753217(0xfffffffff39defff, float:-2.5026193E31)
            r4 = r4 | r6
            int r4 = ~r4
            int r4 = r4 * 1128
            int r8 = r8 + r4
            r4 = r7 | r5
            int r4 = ~r4
            r5 = 1116259432(0x4288c468, float:68.383606)
            r4 = r4 | r5
            int r4 = r4 * 564
            int r8 = r8 + r4
            if (r1 != r8) goto L9a
            java.lang.reflect.Member[] r1 = defpackage.checkUnsupportedFeatureCombinationAndThrow.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            long r4 = r2.totalMemory()
            int r2 = (int) r4
            int r4 = ~r2
            r5 = 346782124(0x14ab79ac, float:1.7314579E-26)
            r4 = r4 | r5
            int r4 = ~r4
            r6 = 1783628867(0x6a500443, float:6.2869174E25)
            r4 = r4 | r6
            int r4 = r4 * 529
            r6 = 1100061850(0x41919c9a, float:18.201466)
            int r6 = r6 + r4
            r2 = r2 | r5
            int r2 = ~r2
            r4 = 2062693455(0x7af2344f, float:6.287984E35)
            r2 = r2 | r4
            int r2 = r2 * 529
            int r6 = r6 + r2
            if (r1 == r6) goto L96
            int r1 = com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.IconCompatParcelizer
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.MediaBrowserCompat = r2
            int r1 = r1 % r0
            r1 = -1823736464(0xffffffff934bfd70, float:-2.5747157E-27)
            int[] r1 = new int[r1]
            r2 = -1823736465(0xffffffff934bfd6f, float:-2.5747155E-27)
            r4 = 1
            r1[r2] = r4
            r2 = -2026204272(0xffffffff873a9390, float:-1.403645E-34)
            int r2 = r2 % r0
            r2 = -1
            r1 = r1[r2]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r4)
            r1.show()
            int r1 = com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.IconCompatParcelizer
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.MediaBrowserCompat = r2
            int r1 = r1 % r0
        L96:
            super.onStart()
            return
        L9a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "-924303108"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.onStart():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2046839594
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarConfirmActivity scholarConfirmActivity, unregisterMediaButtonEventReceiver unregistermediabuttoneventreceiver) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(unregistermediabuttoneventreceiver, "");
        getCameraState.Companion bVar = getCameraState.INSTANCE;
        String string = scholarConfirmActivity.getString(R.string.label_success);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = scholarConfirmActivity.getString(R.string.message_success_jp);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = scholarConfirmActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
        FragmentManager childFragmentManager = unregistermediabuttoneventreceiver.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i4 = IconCompatParcelizer + 3;
            MediaBrowserCompat = i4 % 128;
            if (i4 % 2 == 0) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        getcamerastateB.g = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(unregistermediabuttoneventreceiver);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007a  */
    public static /* synthetic */ Unit b(ScholarConfirmActivity scholarConfirmActivity, ScholarInsertResult scholarInsertResult) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 111;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        ActivityScholarConfirmBinding activityScholarConfirmBinding = (ActivityScholarConfirmBinding) ((ViewBinding) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        if (scholarInsertResult != null) {
            Group group = activityScholarConfirmBinding.groupScholarNotConfirm;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
            Group group2 = activityScholarConfirmBinding.groupScholarConfirm;
            Intrinsics.checkNotNullExpressionValue(group2, "");
            group2.setVisibility(0);
            if (scholarInsertResult.cancelAll < 23) {
                MaterialCardView materialCardView = activityScholarConfirmBinding.confirmNextInfo;
                Intrinsics.checkNotNullExpressionValue(materialCardView, "");
                materialCardView.setVisibility(0);
            }
            String upperCase = scholarInsertResult.TuitionPaymentFragmentbindingInflater1.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != -1921354682) {
                if (iHashCode != -1567728890) {
                    int i4 = MediaBrowserCompat + 35;
                    IconCompatParcelizer = i4 % 128;
                    int i5 = i4 % 2;
                    if (iHashCode == 983774041 && upperCase.equals("DIPROSES")) {
                        MaterialCardView materialCardView2 = activityScholarConfirmBinding.contentConfirmStatus2;
                        Intrinsics.checkNotNullExpressionValue(materialCardView2, "");
                        materialCardView2.setVisibility(8);
                        MaterialCardView materialCardView3 = activityScholarConfirmBinding.contentConfirmStatus1;
                        Intrinsics.checkNotNullExpressionValue(materialCardView3, "");
                        materialCardView3.setVisibility(0);
                        activityScholarConfirmBinding.contentConfirmStatusText1.setText(scholarInsertResult.TuitionPaymentFragmentbindingInflater1);
                    }
                } else if (upperCase.equals("DISETUJUI")) {
                    MaterialCardView materialCardView4 = activityScholarConfirmBinding.contentConfirmStatus2;
                    Intrinsics.checkNotNullExpressionValue(materialCardView4, "");
                    materialCardView4.setVisibility(8);
                    MaterialCardView materialCardView5 = activityScholarConfirmBinding.contentConfirmStatus1;
                    Intrinsics.checkNotNullExpressionValue(materialCardView5, "");
                    materialCardView5.setVisibility(0);
                    activityScholarConfirmBinding.contentConfirmStatusText1.setText(scholarInsertResult.TuitionPaymentFragmentbindingInflater1);
                }
            } else if (!(!upperCase.equals("DIBAYAR"))) {
                MaterialCardView materialCardView6 = activityScholarConfirmBinding.contentConfirmStatus1;
                Intrinsics.checkNotNullExpressionValue(materialCardView6, "");
                materialCardView6.setVisibility(8);
                MaterialCardView materialCardView7 = activityScholarConfirmBinding.contentConfirmStatus2;
                Intrinsics.checkNotNullExpressionValue(materialCardView7, "");
                materialCardView7.setVisibility(0);
                activityScholarConfirmBinding.contentConfirmStatusText2.setText(scholarInsertResult.TuitionPaymentFragmentbindingInflater1);
            }
            activityScholarConfirmBinding.contentBenefitNik.setText(scholarInsertResult.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            activityScholarConfirmBinding.contentBenefitNama.setText(scholarInsertResult.b);
            activityScholarConfirmBinding.contentBenefitKpj.setText(scholarInsertResult.g);
            activityScholarConfirmBinding.contentBenefitAmount.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(scholarInsertResult.INotificationSideChannel));
            TextView textView = activityScholarConfirmBinding.contentBenefitEdu;
            String str = scholarInsertResult.asBinder;
            String str2 = scholarInsertResult.asInterface;
            String str3 = scholarInsertResult.a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" UNTUK ");
            sb.append(str2);
            sb.append(" TINGKAT / KELAS ");
            sb.append(str3);
            textView.setText(sb.toString());
            activityScholarConfirmBinding.contentBenefitYear.setText(scholarInsertResult.d);
            activityScholarConfirmBinding.contentBenefitLembaga.setText(scholarInsertResult.cancel);
            activityScholarConfirmBinding.contentConfirmDate.setText(scholarInsertResult.notify);
            TextView textView2 = activityScholarConfirmBinding.confirmNextInfoContent;
            int i6 = Calendar.getInstance().get(1);
            StringBuilder sb2 = new StringBuilder("Januari ");
            sb2.append(i6 + 1);
            textView2.setText(sb2.toString());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ lambdasetZoomRatio0androidxcameracamera2internalZoomControl TuitionPaymentFragmentspecialinlinedviewModeldefault3(final ScholarConfirmActivity scholarConfirmActivity) {
        int i = 2 % 2;
        lambdasetZoomRatio0androidxcameracamera2internalZoomControl.Companion companion = lambdasetZoomRatio0androidxcameracamera2internalZoomControl.INSTANCE;
        lambdasetZoomRatio0androidxcameracamera2internalZoomControl lambdasetzoomratio0androidxcameracamera2internalzoomcontrolTuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdasetZoomRatio0androidxcameracamera2internalZoomControl.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function0() { // from class: SynchronizedCaptureSessionBaseImplExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScholarConfirmActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }, new Function2() { // from class: SynchronizedCaptureSessionBaseImpl2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ScholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (unregisterMediaButtonEventReceiver) obj);
            }
        }, (JpDataTk) scholarConfirmActivity.read.getValue());
        int i2 = IconCompatParcelizer + 85;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return lambdasetzoomratio0androidxcameracamera2internalzoomcontrolTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(ScholarConfirmActivity scholarConfirmActivity, Boolean bool) {
        VideoRecordEventStart<TwilightManager> videoRecordEventStartTuitionPaymentFragmentbindingInflater1;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            bool.booleanValue();
            throw null;
        }
        if (bool.booleanValue()) {
            final isStateValid isstatevalid = (isStateValid) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            ScholarConfirmActivity scholarConfirmActivity2 = scholarConfirmActivity;
            Intrinsics.checkNotNullParameter(scholarConfirmActivity2, "");
            if (isstatevalid.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                isstatevalid.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ToolbarActionBarToolbarMenuCallback();
            }
            ToolbarActionBarToolbarMenuCallback toolbarActionBarToolbarMenuCallback = isstatevalid.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (toolbarActionBarToolbarMenuCallback != null && (videoRecordEventStartTuitionPaymentFragmentbindingInflater1 = toolbarActionBarToolbarMenuCallback.TuitionPaymentFragmentbindingInflater1(scholarConfirmActivity2)) != null) {
                final Function1 function1 = new Function1() { // from class: getLastKnownLocationForProvider
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return isStateValid.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isstatevalid, (TwilightManager) obj);
                    }
                };
                logToString<? super TwilightManager> logtostring = new logToString() { // from class: updateState
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: setInstance
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return isStateValid.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isstatevalid, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartTuitionPaymentFragmentbindingInflater1.subscribe(logtostring, new logToString() { // from class: isNight
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                if (bufferProviderStateSubscribe != null) {
                    isstatevalid.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
                }
            }
            int i3 = MediaBrowserCompat + 89;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
        } else {
            ScholarConfirmActivity scholarConfirmActivity3 = scholarConfirmActivity;
            String string = scholarConfirmActivity.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(scholarConfirmActivity3, string);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        MediaBrowserCompat = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        function1.invoke(obj);
        int i3 = IconCompatParcelizer + 11;
        MediaBrowserCompat = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 25;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = str;
        if (str2.length() != 0) {
            return "PENERIMA BEASISWA KE-".concat(String.valueOf(StringsKt.trim((CharSequence) CollectionsKt.last(StringsKt.split$default((CharSequence) str2, new String[]{" "}, false, 0, 6, (Object) null))).toString()));
        }
        int i4 = IconCompatParcelizer + 21;
        int i5 = i4 % 128;
        MediaBrowserCompat = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 115;
        IconCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarConfirmActivity scholarConfirmActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompat;
        int i3 = i2 + 117;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i5 = i2 + 53;
            IconCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            String str3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                StringsKt.split$default((CharSequence) ((ScholarshipVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuspend(), new String[]{"#"}, false, 0, 6, (Object) null);
                StringsKt.split$default((CharSequence) ((ScholarshipVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
                lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = (lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder != null) {
                    str = userAsBinder.b;
                    int i7 = MediaBrowserCompat + 57;
                    IconCompatParcelizer = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    str = null;
                }
                if (str == null) {
                    int i9 = MediaBrowserCompat + 35;
                    IconCompatParcelizer = i9 % 128;
                    if (i9 % 2 != 0) {
                        str3.hashCode();
                        throw null;
                    }
                    str = "";
                }
                User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder2 != null) {
                    int i10 = IconCompatParcelizer + 87;
                    MediaBrowserCompat = i10 % 128;
                    int i11 = i10 % 2;
                    str2 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                ScholarPersonDetail value = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                String str4 = value != null ? value.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                if (str4 == null) {
                    int i12 = MediaBrowserCompat + 111;
                    IconCompatParcelizer = i12 % 128;
                    if (i12 % 2 != 0) {
                        throw null;
                    }
                    str4 = "";
                }
                ScholarPersonDetail value2 = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                str3 = value2 != null ? value2.INotificationSideChannelStub : null;
                lambdaenabletorch1androidxcameracamera2internaltorchcontrol.b(new ScholarshipEducationListRequest(str, str2, str4, str3 != null ? str3 : ""));
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i13 = i2 + 11;
                IconCompatParcelizer = i13 % 128;
                int i14 = i13 % 2;
                scholarConfirmActivity.IconCompatParcelizer();
                scholarConfirmActivity.INotificationSideChannel = null;
                File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                    FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                scholarConfirmActivity.INotificationSideChannelStub.clear();
                scholarConfirmActivity.RemoteActionCompatParcelizer = false;
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string = scholarConfirmActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
                FragmentManager supportFragmentManager = scholarConfirmActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarConfirmActivity scholarConfirmActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(scholarConfirmActivity);
        int i2 = MediaBrowserCompat + 79;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return outputformattoaudioprofile;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ScholarConfirmActivity scholarConfirmActivity = (ScholarConfirmActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        JpDataTk jpDataTk = (JpDataTk) scholarConfirmActivity.getIntent().getParcelableExtra("jp_info");
        int i4 = MediaBrowserCompat + 63;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return jpDataTk;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ScholarConfirmActivity scholarConfirmActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 55;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        ((IntegerRes) scholarConfirmActivity.d.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompat + 53;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompat + 63;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompat + 117;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    public static /* synthetic */ Unit asBinder(ScholarConfirmActivity scholarConfirmActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        ArrayList<CodeNamePair> arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            scholarConfirmActivity.MediaBrowserCompat();
        } else {
            String str2 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                scholarConfirmActivity.IconCompatParcelizer();
                List listSplit$default = StringsKt.split$default((CharSequence) ((ScholarBenefit) CollectionsKt.last((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1)).TuitionPaymentFragmentspecialinlinedviewModeldefault3, new String[]{"/"}, false, 0, 6, (Object) null);
                String string = StringsKt.trim((CharSequence) listSplit$default.get(0)).toString();
                int iHashCode = string.hashCode();
                if (iHashCode != -2066945330) {
                    if (iHashCode != 2641) {
                        if (iHashCode != 2679) {
                            if (iHashCode != 82215) {
                                if (iHashCode == 82230 && string.equals("SMP")) {
                                    int i2 = MediaBrowserCompat + 3;
                                    IconCompatParcelizer = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        isTorchResetRequired istorchresetrequired = isTorchResetRequired.INSTANCE;
                                        isTorchResetRequired.TuitionPaymentFragmentbindingInflater1();
                                        str2.hashCode();
                                        throw null;
                                    }
                                    isTorchResetRequired istorchresetrequired2 = isTorchResetRequired.INSTANCE;
                                    arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isTorchResetRequired.TuitionPaymentFragmentbindingInflater1();
                                } else {
                                    arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
                                }
                            } else if (string.equals("SMA")) {
                                int i3 = IconCompatParcelizer + 97;
                                MediaBrowserCompat = i3 % 128;
                                int i4 = i3 % 2;
                                isTorchResetRequired istorchresetrequired3 = isTorchResetRequired.INSTANCE;
                                arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isTorchResetRequired.b();
                            } else {
                                arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
                            }
                        } else if (string.equals("TK")) {
                            int i5 = IconCompatParcelizer + 113;
                            MediaBrowserCompat = i5 % 128;
                            if (i5 % 2 == 0) {
                                isTorchResetRequired istorchresetrequired4 = isTorchResetRequired.INSTANCE;
                                isTorchResetRequired.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                throw null;
                            }
                            isTorchResetRequired istorchresetrequired5 = isTorchResetRequired.INSTANCE;
                            arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isTorchResetRequired.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        } else {
                            arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
                        }
                    } else if (string.equals("SD")) {
                        int i6 = IconCompatParcelizer + 89;
                        MediaBrowserCompat = i6 % 128;
                        if (i6 % 2 == 0) {
                            isTorchResetRequired istorchresetrequired6 = isTorchResetRequired.INSTANCE;
                            isTorchResetRequired.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            throw null;
                        }
                        isTorchResetRequired istorchresetrequired7 = isTorchResetRequired.INSTANCE;
                        arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isTorchResetRequired.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    } else {
                        arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
                    }
                } else if (string.equals("KULIAH")) {
                    isTorchResetRequired istorchresetrequired8 = isTorchResetRequired.INSTANCE;
                    arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isTorchResetRequired.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } else {
                    arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
                }
                if (Intrinsics.areEqual(StringsKt.trim((CharSequence) listSplit$default.get(1)).toString(), ((CodeNamePair) CollectionsKt.last((List) arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2)).b)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string2 = scholarConfirmActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "Mohon maaf konfirmasi tidak dapat dilanjutkan", "Silakan menghubungi Kantor Cabang terdekat untuk melakukan konfirmasi atas pengajuan manfaat beasiswa pada tingkat jenjang pendidikan yang sama.\nPenerima Beasiswa agar menyiapkan dokumen sebagai berikut :\n1. Surat Keterangan masih menempuh pendidikan terakhir\n2. Raport/transkrip nilai sesuai tahun beasiswa", string2, null, 112);
                    FragmentManager supportFragmentManager = scholarConfirmActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        int i7 = MediaBrowserCompat + 89;
                        IconCompatParcelizer = i7 % 128;
                        if (i7 % 2 != 0) {
                            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            str2.hashCode();
                            throw null;
                        }
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = (lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    String str3 = userAsBinder != null ? userAsBinder.b : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    String str4 = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    ScholarPersonDetail value = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    if (value != null) {
                        int i8 = MediaBrowserCompat + 25;
                        IconCompatParcelizer = i8 % 128;
                        if (i8 % 2 != 0) {
                            String str5 = value.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            throw null;
                        }
                        str = value.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    ScholarPersonDetail value2 = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    if (value2 != null) {
                        int i9 = MediaBrowserCompat + 43;
                        IconCompatParcelizer = i9 % 128;
                        int i10 = i9 % 2;
                        str2 = value2.INotificationSideChannelStub;
                    }
                    lambdaenabletorch1androidxcameracamera2internaltorchcontrol.b(new ScholarshipEducationListRequest(str3, str4, str, str2 != null ? str2 : ""));
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                scholarConfirmActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String str6 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str6 == null) {
                    str6 = "";
                }
                String lowerCase = str6.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "melakukan konfirmasi rapel", false, 2, (Object) null)) {
                    getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                    String str7 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String strReplace$default = StringsKt.replace$default(str7 == null ? "" : str7, "\t", "", false, 4, (Object) null);
                    String string3 = scholarConfirmActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "Mohon maaf konfirmasi tidak dapat dilanjutkan", strReplace$default, string3, null, 112);
                    FragmentManager supportFragmentManager2 = scholarConfirmActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                    if (supportFragmentManager2.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        int i11 = MediaBrowserCompat + 45;
                        IconCompatParcelizer = i11 % 128;
                        if (i11 % 2 != 0) {
                            getstringornullB2.show(supportFragmentManager2, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            int i12 = 32 / 0;
                        } else {
                            getstringornullB2.show(supportFragmentManager2, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                    return Unit.INSTANCE;
                }
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string4 = scholarConfirmActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string4);
                FragmentManager supportFragmentManager3 = scholarConfirmActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager3, "");
                if (supportFragmentManager3.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i13 = MediaBrowserCompat + 43;
                    IconCompatParcelizer = i13 % 128;
                    if (i13 % 2 != 0) {
                        getcamerastateB.show(supportFragmentManager3, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        int i14 = 66 / 0;
                    } else {
                        getcamerastateB.show(supportFragmentManager3, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(ScholarConfirmActivity scholarConfirmActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = MediaBrowserCompat + 37;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                scholarConfirmActivity.MediaBrowserCompat();
                int i3 = 29 / 0;
            } else {
                scholarConfirmActivity.MediaBrowserCompat();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            scholarConfirmActivity.IconCompatParcelizer();
            ScholarHistoryActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarHistoryActivity.INSTANCE;
            ScholarHistoryActivity.Companion.b(scholarConfirmActivity, CollectionsKt.reversed((Iterable) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = IconCompatParcelizer + 105;
            MediaBrowserCompat = i4 % 128;
            int i5 = i4 % 2;
            scholarConfirmActivity.IconCompatParcelizer();
            getCameraState.Companion bVar = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = scholarConfirmActivity.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
            FragmentManager supportFragmentManager = scholarConfirmActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i6 = MediaBrowserCompat + 81;
                IconCompatParcelizer = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarConfirmActivity scholarConfirmActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws IOException {
        int i = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i2 = IconCompatParcelizer + 79;
            int i3 = i2 % 128;
            MediaBrowserCompat = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder;
                obj.hashCode();
                throw null;
            }
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
                String strIsSuccessful = ((ScholarshipFmResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful();
                Intrinsics.checkNotNull(strIsSuccessful);
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strIsSuccessful, strB);
                Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
                String value = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancelAll.getValue();
                Intrinsics.checkNotNull(value);
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value, strB);
                List listSplit$default = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault3, new String[]{"#"}, false, 0, 6, (Object) null);
                List listSplit$default2 = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault4, new String[]{"#"}, false, 0, 6, (Object) null);
                getContentPaddingRight.b bVarB = getContentPaddingRight.b("confsign");
                Intrinsics.checkExpressionValueIsNotNull(bVarB, "");
                Object obj2 = listSplit$default.get(2);
                Object obj3 = listSplit$default2.get(2);
                StringBuilder sb = new StringBuilder();
                sb.append(obj2);
                sb.append(" ");
                sb.append(obj3);
                bVarB.TuitionPaymentFragmentbindingInflater1(sb.toString(), new Object[0]);
                if (Intrinsics.areEqual(listSplit$default.get(2), listSplit$default2.get(2))) {
                    outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) scholarConfirmActivity.getInterfaceDescriptor.getValue();
                    String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
                    final getSessionConfigTemplateType getsessionconfigtemplatetype = new getSessionConfigTemplateType(scholarConfirmActivity);
                    BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: setLiveDataValue
                        @Override // defpackage.logToString
                        public final void accept(Object obj4) {
                            ScholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getsessionconfigtemplatetype, obj4);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
                    ((acquireBuffer) scholarConfirmActivity.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
                } else {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(scholarConfirmActivity, "Permintaan ditolak", null);
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i4 = i3 + 31;
                IconCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                scholarConfirmActivity.IconCompatParcelizer();
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string = scholarConfirmActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
                FragmentManager supportFragmentManager = scholarConfirmActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ScholarConfirmActivity scholarConfirmActivity = (ScholarConfirmActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        String str = "";
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_time_server_biometric", "loading_time_server_biometric_asik"));
            Intrinsics.checkNotNullParameter("loading_time_server_biometric_asik", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_time_server_biometric_asik", mapMutableMapOf);
            scholarConfirmActivity.MediaBrowserCompat();
        } else {
            String str2 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_time_server_asik", "success_time_server_biometric_asik"));
                Intrinsics.checkNotNullParameter("success_time_server_asik", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_time_server_asik", mapMutableMapOf2);
                if (((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancelAll.getValue() == null) {
                    int i2 = IconCompatParcelizer + 85;
                    MediaBrowserCompat = i2 % 128;
                    if (i2 % 2 == 0) {
                        boolean z = scholarConfirmActivity.RemoteActionCompatParcelizer;
                        throw null;
                    }
                    if (scholarConfirmActivity.RemoteActionCompatParcelizer) {
                        IntegerRes integerRes = (IntegerRes) scholarConfirmActivity.d.getValue();
                        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                        str2 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append("#beasiswa");
                        integerRes.b(new KeyRequest(sb.toString()));
                        int i3 = MediaBrowserCompat + 3;
                        IconCompatParcelizer = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        String value = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancelAll.getValue();
                        if (value == null) {
                            int i5 = MediaBrowserCompat + 101;
                            IconCompatParcelizer = i5 % 128;
                            int i6 = i5 % 2;
                            value = "";
                        }
                        scholarConfirmActivity.cancel = value;
                        lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = (lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                        if (userAsBinder2 != null) {
                            int i7 = IconCompatParcelizer + 5;
                            MediaBrowserCompat = i7 % 128;
                            if (i7 % 2 == 0) {
                                String str3 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                throw null;
                            }
                            str2 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        }
                        String strValueOf = String.valueOf(str2);
                        String value2 = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancelAll.getValue();
                        if (value2 == null) {
                            int i8 = MediaBrowserCompat + 93;
                            IconCompatParcelizer = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            str = value2;
                        }
                        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ScholarshipFmBeginRequest(strValueOf, str));
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_time_server_scholar_confirm", "failure_time_server_scholar_confirm"));
                Intrinsics.checkNotNullParameter("failure_time_server_scholar_confirm", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_time_server_scholar_confirm", mapMutableMapOf3);
                scholarConfirmActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(scholarConfirmActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ScholarConfirmActivity scholarConfirmActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i2 = MediaBrowserCompat;
            int i3 = i2 + 45;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i5 = i2 + 85;
                IconCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                scholarConfirmActivity.IconCompatParcelizer();
                ScholarPersonDetail value = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                Calendar.getInstance();
                if (value != null) {
                    String strValueOf = String.valueOf(scholarConfirmActivity.notify);
                    Intrinsics.checkNotNullParameter(strValueOf, "");
                    value.getInterfaceDescriptor = strValueOf;
                    int i7 = IconCompatParcelizer + 21;
                    MediaBrowserCompat = i7 % 128;
                    int i8 = i7 % 2;
                }
                if (value != null) {
                    int i9 = IconCompatParcelizer + 115;
                    MediaBrowserCompat = i9 % 128;
                    int i10 = i9 % 2;
                    String strValueOf2 = String.valueOf(scholarConfirmActivity.onTransact);
                    Intrinsics.checkNotNullParameter(strValueOf2, "");
                    value.INotificationSideChannelStubProxy = strValueOf2;
                }
                ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.setValue(value);
                ScholarPersonDetail value2 = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String string = scholarConfirmActivity.getString(R.string.label_success);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = scholarConfirmActivity.getString(R.string.message_success_scholarship);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = scholarConfirmActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
                FragmentManager supportFragmentManager = scholarConfirmActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i11 = IconCompatParcelizer + 35;
                    MediaBrowserCompat = i11 % 128;
                    int i12 = i11 % 2;
                }
                getcamerastateB.g = scholarConfirmActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3(value2);
            } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
                scholarConfirmActivity.IconCompatParcelizer();
                getCameraState.Companion bVar2 = getCameraState.INSTANCE;
                String strValueOf3 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string4 = scholarConfirmActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                getCameraState getcamerastateB2 = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf3, string4);
                FragmentManager supportFragmentManager2 = scholarConfirmActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                if (supportFragmentManager2.findFragmentByTag(getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB2.show(supportFragmentManager2, getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(ScholarConfirmActivity scholarConfirmActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 7;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            String str3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                List listSplit$default = StringsKt.split$default((CharSequence) ((KeyResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum(), new String[]{"#"}, false, 0, 6, (Object) null);
                ScholarPersonDetail value = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
                String value2 = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancelAll.getValue();
                Intrinsics.checkNotNull(value2);
                Object obj = StringsKt.split$default((CharSequence) companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value2, strB), new String[]{"#"}, false, 0, 6, (Object) null).get(1);
                Object obj2 = listSplit$default.get(2);
                StringBuilder sb = new StringBuilder("JMO#");
                sb.append(obj);
                sb.append("#true#70#");
                sb.append(obj2);
                String string = sb.toString();
                User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (!Intrinsics.areEqual(String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null), listSplit$default.get(0))) {
                    scholarConfirmActivity.IconCompatParcelizer();
                    String string2 = scholarConfirmActivity.getString(R.string.message_integrity_data);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(scholarConfirmActivity, string2, null);
                } else if (value != null) {
                    int i4 = IconCompatParcelizer + 107;
                    MediaBrowserCompat = i4 % 128;
                    int i5 = i4 % 2;
                    lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = (lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    String value3 = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).a.getValue();
                    if (value3 == null) {
                        value3 = "";
                    }
                    String str4 = scholarConfirmActivity.cancel;
                    User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder2 != null) {
                        int i6 = IconCompatParcelizer + 83;
                        MediaBrowserCompat = i6 % 128;
                        if (i6 % 2 == 0) {
                            String str5 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            throw null;
                        }
                        str3 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    }
                    String str6 = str3 == null ? "" : str3;
                    String str7 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str7, "");
                    String string3 = Settings.Secure.getString(scholarConfirmActivity.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string3, "");
                    String str8 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str8, "");
                    String str9 = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(str9, "");
                    String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, string, strB);
                    File file = (File) CollectionsKt.getOrNull(scholarConfirmActivity.INotificationSideChannelStub, 0);
                    File file2 = (File) CollectionsKt.getOrNull(scholarConfirmActivity.INotificationSideChannelStub, 1);
                    File file3 = (File) CollectionsKt.getOrNull(scholarConfirmActivity.INotificationSideChannelStub, 2);
                    String str10 = value.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String str11 = value.INotificationSideChannelStub;
                    String str12 = scholarConfirmActivity.cancelAll;
                    String str13 = str12 == null ? "" : str12;
                    String str14 = scholarConfirmActivity.notify;
                    if (str14 == null) {
                        int i7 = MediaBrowserCompat + 119;
                        IconCompatParcelizer = i7 % 128;
                        int i8 = i7 % 2;
                        str = "";
                    } else {
                        str = str14;
                    }
                    String str15 = scholarConfirmActivity.onTransact;
                    if (str15 == null) {
                        int i9 = IconCompatParcelizer + 45;
                        MediaBrowserCompat = i9 % 128;
                        int i10 = i9 % 2;
                        str2 = "";
                    } else {
                        str2 = str15;
                    }
                    lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value3, new ScholarshipFmRequest(str4, str6, str7, string3, str8, str9, strValueOf, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, file, file2, file3, str11, str10, str13, str, str2));
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                scholarConfirmActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(scholarConfirmActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        String str;
        ScholarConfirmActivity scholarConfirmActivity = (ScholarConfirmActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        String str2 = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = MediaBrowserCompat + 95;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                scholarConfirmActivity.MediaBrowserCompat();
                throw null;
            }
            scholarConfirmActivity.MediaBrowserCompat();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                scholarConfirmActivity.IconCompatParcelizer();
                ScholarPersonDetail scholarPersonDetail = (ScholarPersonDetail) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (scholarPersonDetail != null) {
                    int i3 = MediaBrowserCompat + 21;
                    IconCompatParcelizer = i3 % 128;
                    if (i3 % 2 != 0) {
                        ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.setValue(scholarPersonDetail);
                        ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        str2.hashCode();
                        throw null;
                    }
                    ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.setValue(scholarPersonDetail);
                    ScholarPersonDetail value = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    if (value != null) {
                        int i4 = MediaBrowserCompat + 61;
                        IconCompatParcelizer = i4 % 128;
                        if (i4 % 2 != 0) {
                            ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
                            str2.hashCode();
                            throw null;
                        }
                        ScholarPerson value2 = ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
                        value.cancel = value2 != null ? value2.asBinder : null;
                    }
                    lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = (lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder != null) {
                        int i5 = MediaBrowserCompat + 25;
                        IconCompatParcelizer = i5 % 128;
                        if (i5 % 2 != 0) {
                            str = userAsBinder.b;
                            int i6 = 15 / 0;
                        } else {
                            str = userAsBinder.b;
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder2 != null) {
                        int i7 = IconCompatParcelizer + 7;
                        MediaBrowserCompat = i7 % 128;
                        int i8 = i7 % 2;
                        str2 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    }
                    lambdaenabletorch1androidxcameracamera2internaltorchcontrol.b(new ScholarshipEducationListRequest(str, str2 != null ? str2 : "", scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault2, scholarPersonDetail.INotificationSideChannelStub));
                }
            } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
                scholarConfirmActivity.IconCompatParcelizer();
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string = scholarConfirmActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
                FragmentManager supportFragmentManager = scholarConfirmActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i9 = MediaBrowserCompat + 121;
                    IconCompatParcelizer = i9 % 128;
                    int i10 = i9 % 2;
                    getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ScholarConfirmActivity scholarConfirmActivity, TwilightManager twilightManager) {
        int i = 2 % 2;
        if (twilightManager instanceof TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = MediaBrowserCompat + 69;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) twilightManager;
            byte[] imageBytes = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getImageBytes();
            if (imageBytes != null) {
                int i4 = IconCompatParcelizer + 85;
                MediaBrowserCompat = i4 % 128;
                int i5 = i4 % 2;
                scholarConfirmActivity.INotificationSideChannelStub.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageBytes, scholarConfirmActivity));
            }
            List<byte[]> additionalImages = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getAdditionalImages();
            if (additionalImages != null) {
                ArrayList arrayList = new ArrayList();
                for (byte[] bArr : additionalImages) {
                    Intrinsics.checkNotNull(bArr);
                    arrayList.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr, scholarConfirmActivity));
                    int i6 = MediaBrowserCompat + 119;
                    IconCompatParcelizer = i6 % 128;
                    int i7 = i6 % 2;
                }
                scholarConfirmActivity.INotificationSideChannelStub.addAll(arrayList);
            }
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getImageBytes() != null) {
                int i8 = MediaBrowserCompat + 55;
                IconCompatParcelizer = i8 % 128;
                String str = null;
                if (i8 % 2 != 0) {
                    VidaLivenessResponse vidaLivenessResponse = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
                    throw null;
                }
                VidaLivenessResponse vidaLivenessResponse2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
                if (vidaLivenessResponse2 != null) {
                    byte[] imageBytes2 = vidaLivenessResponse2.getImageBytes();
                    if (imageBytes2 != null) {
                        Intrinsics.checkNotNullParameter(imageBytes2, "");
                        String strEncodeToString = Base64.encodeToString(imageBytes2, 2);
                        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                        int i9 = MediaBrowserCompat + 75;
                        IconCompatParcelizer = i9 % 128;
                        int i10 = i9 % 2;
                        str = strEncodeToString;
                    }
                    scholarConfirmActivity.INotificationSideChannel = str;
                    scholarConfirmActivity.cancelAll = vidaLivenessResponse2.getTransactionId();
                    scholarConfirmActivity.notify = String.valueOf(vidaLivenessResponse2.getLivenessScore());
                    scholarConfirmActivity.onTransact = String.valueOf(vidaLivenessResponse2.getManipulationScore());
                }
                scholarConfirmActivity.RemoteActionCompatParcelizer = true;
                ((IntegerRes) scholarConfirmActivity.d.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        } else {
            if (!(twilightManager instanceof TwilightManager.TuitionPaymentFragmentbindingInflater1)) {
                throw new NoWhenBranchMatchedException();
            }
            TwilightManager.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager;
            int i11 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder();
            sb.append(i11);
            sb.append(": ");
            sb.append(str2);
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), sb.toString(), 0).show();
            scholarConfirmActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ScholarConfirmActivity scholarConfirmActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = scholarConfirmActivity.getString(R.string.action_information);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = scholarConfirmActivity.getString(R.string.message_exception_vida);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = scholarConfirmActivity.getString(R.string.action_back);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, string2, string3, null, 112);
        FragmentManager supportFragmentManager = scholarConfirmActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i4 = MediaBrowserCompat + 39;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(ScholarConfirmActivity scholarConfirmActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            CircleImageView circleImageView = ((ActivityScholarConfirmBinding) ((ViewBinding) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfile;
            Intrinsics.checkNotNullExpressionValue(circleImageView, "");
            ScholarConfirmActivity scholarConfirmActivity2 = scholarConfirmActivity;
            Bitmap bitmap = (Bitmap) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Drawable drawable = scholarConfirmActivity.getResources().getDrawable(R.drawable.ic_placeholder);
            Intrinsics.checkNotNullExpressionValue(drawable, "");
            Drawable drawable2 = scholarConfirmActivity.getResources().getDrawable(R.drawable.ic_placeholder);
            Intrinsics.checkNotNullExpressionValue(drawable2, "");
            lambdacreateCameraSelectorById0.b(circleImageView, scholarConfirmActivity2, bitmap, drawable, drawable2);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IconCompatParcelizer + 25;
        MediaBrowserCompat = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 74 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 119;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = MediaBrowserCompat + 55;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit g(ScholarConfirmActivity scholarConfirmActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i2 = IconCompatParcelizer + 125;
            MediaBrowserCompat = i2 % 128;
            int i3 = i2 % 2;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                scholarConfirmActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                ScholarInsertResult scholarInsertResult = (ScholarInsertResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                List<ScholarshipDataDocumentForInsert> list = ((ScholarInsertResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).onTransact;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    ScholarshipDataDocumentForInsert scholarshipDataDocumentForInsert = (ScholarshipDataDocumentForInsert) obj;
                    if (!Intrinsics.areEqual(scholarshipDataDocumentForInsert.getKode(), "D113")) {
                        int i4 = MediaBrowserCompat + 1;
                        IconCompatParcelizer = i4 % 128;
                        if (i4 % 2 != 0) {
                            Intrinsics.areEqual(scholarshipDataDocumentForInsert.getKode(), "D114");
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (Intrinsics.areEqual(scholarshipDataDocumentForInsert.getKode(), "D114") || Intrinsics.areEqual(scholarshipDataDocumentForInsert.getKode(), "D000")) {
                        }
                    }
                    arrayList.add(obj);
                }
                ArrayList arrayList2 = arrayList;
                Intrinsics.checkNotNullParameter(arrayList2, "");
                scholarInsertResult.onTransact = arrayList2;
                ScholarConfirmedActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarConfirmedActivity.INSTANCE;
                ScholarConfirmedActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(scholarConfirmActivity, (ScholarInsertResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                scholarConfirmActivity.IconCompatParcelizer();
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string = scholarConfirmActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
                FragmentManager supportFragmentManager = scholarConfirmActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i5 = MediaBrowserCompat + 51;
                    IconCompatParcelizer = i5 % 128;
                    int i6 = i5 % 2;
                    getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IconCompatParcelizer + 11;
        MediaBrowserCompat = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 41 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void b(ScholarConfirmActivity scholarConfirmActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (i3 == 0) {
            if (activityResult.getResultCode() != 4887) {
                return;
            }
        } else if (activityResult.getResultCode() != 501) {
            return;
        }
        Intent data = activityResult.getData();
        ScholarInsertResult scholarInsertResult = data != null ? (ScholarInsertResult) data.getParcelableExtra("scholar_info") : null;
        if (scholarInsertResult != null) {
            int i4 = IconCompatParcelizer + 45;
            MediaBrowserCompat = i4 % 128;
            if (i4 % 2 == 0) {
                scholarInsertResult.INotificationSideChannelStubProxy = false;
            } else {
                scholarInsertResult.INotificationSideChannelStubProxy = true;
            }
        }
        ((lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarConfirmActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.setValue(scholarInsertResult);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 77;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = MediaBrowserCompat + 111;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -953947821, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 953947827, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{function1, obj});
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1778224382, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1778224375, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{str});
    }

    public static /* synthetic */ JpDataTk TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarConfirmActivity scholarConfirmActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (JpDataTk) b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1851543013, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1851543012, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{scholarConfirmActivity});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarConfirmActivity scholarConfirmActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 817870439, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -817870437, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{scholarConfirmActivity, virtualCameraAdapter1});
    }

    public static /* synthetic */ Unit b(ScholarConfirmActivity scholarConfirmActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1976170322, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1976170327, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{scholarConfirmActivity, virtualCameraAdapter1});
    }

    public static /* synthetic */ Unit b(View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2022484453, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -2022484449, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{view});
    }

    static {
        disconnect = 0;
        g();
        INSTANCE = new Companion(null);
        int i = getItem + 9;
        disconnect = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ List a(ScholarConfirmActivity scholarConfirmActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (List) b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1350557090, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1350557090, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{scholarConfirmActivity});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Integer) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1052).substring(0, 25).length() - 18543526, 1862325179, RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1862325176, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this})).intValue();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 117;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompat + 11;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void g() {
        read = -83722440;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r7, int r8, byte r9) {
        /*
            int r7 = 120 - r7
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r0 = com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.$$c
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity.$$i(short, int, byte):java.lang.String");
    }
}
