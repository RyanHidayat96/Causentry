package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.request.ClaimReactivationBpuTuitionRequest;
import com.bpjstku.data.jht.model.response.ClaimReactivationBpuTuitionResponse;
import com.bpjstku.data.jht.model.response.ReasonNotReactive;
import com.bpjstku.data.jht.model.response.dataBpu;
import com.bpjstku.databinding.FragmentClaimOldDaySecurityReactivationBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.registration.model.Job;
import com.bpjstku.presentation.membership.registration.model.WorkLocation;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationFragment$bindingInflater$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationFragment$onActivityResult$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.esafirm.imagepicker.features.ImagePickerActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.getEventTime;
import defpackage.getExtendedConfig;
import defpackage.getFocusY;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.setQuickZoomEnabled;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0015\u0010$\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010#R\u0015\u0010\b\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010#R\u0017\u0010\u000e\u001a\u0004\u0018\u00010'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010#R\u0015\u0010)\u001a\u00020(8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0017\u0010\f\u001a\u0004\u0018\u00010*8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b+\u0010#R\u001a\u0010,\u001a\u00020\u00138\u0015X\u0095D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.R.\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u000200\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00020/8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u00103R\u0015\u0010\t\u001a\u0002048CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u00107R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u000208\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u00107R\u0015\u0010\u0007\u001a\u0002098CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010#R\u0015\u0010;\u001a\u00020:8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b;\u0010#R\u0015\u0010\u001a\u001a\u00020<8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010#R\u0015\u0010+\u001a\u00020<8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010?"}, d2 = {"LgetExposureState;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentClaimOldDaySecurityReactivationBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "INotificationSideChannel", "cancel", "TuitionPaymentFragmentbindingInflater1", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "Ljava/io/File;", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/io/File;)V", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;", "getInterfaceDescriptor", "Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "b", "RemoteActionCompatParcelizer", "notify", "Ljava/io/File;", "LCamera2CameraControlImplExternalSyntheticLambda4;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetExtendedConfig;", "INotificationSideChannelDefault", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "asBinder", "Lcom/bpjstku/domain/user/model/User;", "INotificationSideChannelStub", "asInterface", "I", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "LoutputFormatToAudioProfile;", "", "Lcom/bpjstku/data/jht/model/response/dataBpu;", "Ljava/util/List;", "Lcom/bpjstku/data/jht/model/response/ReasonNotReactive;", "LacquireBuffer;", "LgetActivitySideSheetPosition;", "INotificationSideChannelStubProxy", "LsaveBitmap;", "Landroidx/activity/result/ActivityResultLauncher;", "Ljava/lang/Void;", "Landroidx/activity/result/ActivityResultLauncher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getExposureState extends AutoValue_CameraState_StateError<FragmentClaimOldDaySecurityReactivationBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private List<ReasonNotReactive> notify;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy d;
    private final Lazy INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Job TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final ActivityResultLauncher<Void> INotificationSideChannelDefault;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy INotificationSideChannelStub;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy getInterfaceDescriptor;
    private final int asInterface;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private Job b = new Job("P050", "PEDAGANG");

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy INotificationSideChannel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private WorkLocation TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private File TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private List<dataBpu> cancel;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
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

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    /* JADX INFO: renamed from: getExposureState$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LgetExposureState$b;", "", "<init>", "()V", "LgetExposureState;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LgetExposureState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getExposureState TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new getExposureState();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public getExposureState() {
        final getExposureState getexposurestate = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = getexposurestate;
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
        final getExposureState getexposurestate2 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = getexposurestate2.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.g = LazyKt.lazy(new Function0<getExtendedConfig>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getExtendedConfig] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getExtendedConfig invoke() {
                return getFocusY.b(getexposurestate2, Reflection.getOrCreateKotlinClass(getExtendedConfig.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.a = LazyKt.lazy(new Function0() { // from class: isLogicalMultiCameraSupported
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getExtendedConfig) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            }
        });
        final getExposureState getexposurestate3 = this;
        this.asBinder = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = getexposurestate3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: removeSessionCaptureCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            }
        });
        this.asInterface = R.layout.fragment_claim_old_day_security_reactivation;
        this.INotificationSideChannel = LazyKt.lazy(new Function0() { // from class: isZslSupported
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        this.onTransact = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = getexposurestate3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.INotificationSideChannelStubProxy = LazyKt.lazy(new Function0() { // from class: querySupportedDynamicRanges
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
            }
        });
        this.getInterfaceDescriptor = LazyKt.lazy(new Function0() { // from class: isVideoStabilizationSupported
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.INotificationSideChannelStub = LazyKt.lazy(new Function0() { // from class: getPhysicalCameraInfos
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getExposureState.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        ActivityResultLauncher<Void> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.TakePicturePreview(), new ActivityResultCallback() { // from class: getSensorOrientation
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Bitmap) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.INotificationSideChannelDefault = activityResultLauncherRegisterForActivityResult;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getAsInterface() {
        return this.asInterface;
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDaySecurityReactivationBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ClaimOldDaySecurityReactivationFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        RequestManager requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getMaxImages.onError()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(ContextCompat.getDrawable(requireContext(), R.drawable.ic_placeholder_wide)).TuitionPaymentFragmentbindingInflater1(ContextCompat.getDrawable(requireContext(), R.drawable.ic_placeholder_wide)).into(asInterface().imgBanner);
        asInterface().rbYes.setChecked(true);
        d();
        TuitionPaymentFragmentbindingInflater1();
        asInterface().rbHealthy.setChecked(true);
        EditText editText = asInterface().tilChooseJobFirst.getEditText();
        if (editText != null) {
            editText.setText(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "Nominal yang tertera adalah tarif normal, jika peserta eligible mendapatkan iuran sesuai dengan PP 50 Tahun 2025, maka akan dilakukan penyesuaian iuran sesuai dengan regulasi yang berlaku. \n");
        asInterface().tvInfoTuition.setText(spannableStringBuilder);
        if (Build.VERSION.SDK_INT >= 26) {
            asInterface().tvInfoTuition.setJustificationMode(1);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "Dengan ini saya menyatakan bahwa benar : \n");
        createCameraSelectorById.b(spannableStringBuilder2, "Memiliki kegiatan atau usaha ekonomi secara mandiri", 30);
        spannableStringBuilder2.append((CharSequence) "\n");
        createCameraSelectorById.b(spannableStringBuilder2, "Mengetahui dan memahami program BPJS Ketenagakerjaan", 30);
        spannableStringBuilder2.append((CharSequence) "\n");
        createCameraSelectorById.b(spannableStringBuilder2, "Setuju untuk mendaftarkan diri menjadi peserta BPJS Ketenagakerjaan dan melakukan pembayaran iuran dari saldo klaim JHT. Perlindungan dimulai sejak iuran dibayarkan", 30);
        spannableStringBuilder2.append((CharSequence) "\n");
        createCameraSelectorById.b(spannableStringBuilder2, "Tidak sedang dirawat dirumah sakit / kritis / koma / dirawat di ICU.", 30);
        spannableStringBuilder2.append((CharSequence) "\n");
        createCameraSelectorById.b(spannableStringBuilder2, "Dan menyatakan bahwa informasi yang saya sampaikan adalah benar dan bersedia mempertanggungjawabkan kebenarannya sesuai dengan ketentuan perundangan berlaku.", 30);
        asInterface().cbAgreeTermCondition.setText(spannableStringBuilder2);
        User user = (User) this.d.getValue();
        String str = user != null ? user.d : null;
        if (str != null && str.length() != 0) {
            FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface = asInterface();
            TextInputEditText textInputEditText = fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtFamilyCardNumber;
            User user2 = (User) this.d.getValue();
            textInputEditText.setText(user2 != null ? user2.d : null);
            fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtFamilyCardNumber.setEnabled(false);
            fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilFamilyCardNumber.setEnabled(false);
            fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtFamilyCardNumber.setAlpha(0.6f);
            return;
        }
        FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface2 = asInterface();
        fragmentClaimOldDaySecurityReactivationBindingAsInterface2.edtFamilyCardNumber.setText("");
        fragmentClaimOldDaySecurityReactivationBindingAsInterface2.edtFamilyCardNumber.setEnabled(true);
        fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilFamilyCardNumber.setEnabled(true);
        fragmentClaimOldDaySecurityReactivationBindingAsInterface2.edtFamilyCardNumber.setAlpha(1.0f);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface = asInterface();
        EditText editText = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilChooseLocation.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: getSupportedHighResolutions
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getExposureState.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
        }
        EditText editText2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilChooseJobFirst.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: getSupportedFrameRateRanges
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getExposureState.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
        }
        EditText editText3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilChooseJobSecond.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: getSupportedResolutions
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
        }
        fragmentClaimOldDaySecurityReactivationBindingAsInterface.imgSelfiePhoto.setOnClickListener(new View.OnClickListener() { // from class: getTimebase
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseIsBpu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: getTorchState
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                getExposureState.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, fragmentClaimOldDaySecurityReactivationBindingAsInterface, radioGroup, i);
            }
        });
        fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgReason.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: getZoomState
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragmentClaimOldDaySecurityReactivationBindingAsInterface, radioGroup, i);
            }
        });
        fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseCondition.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: isPreviewStabilizationSupported
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                getExposureState.TuitionPaymentFragmentbindingInflater1(this.b, radioGroup);
            }
        });
        MaterialButton materialButton = fragmentClaimOldDaySecurityReactivationBindingAsInterface.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isPrivateReprocessingSupported
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (View) obj);
            }
        }));
        MaterialButton materialButton2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton2, new Function0() { // from class: getLensFacing
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        });
    }

    private final void TuitionPaymentFragmentbindingInflater1() {
        ArrayList arrayList;
        String str;
        List listSplit$default;
        FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface = asInterface();
        IndividualDataClaim individualDataClaim = (IndividualDataClaim) this.a.getValue();
        if (individualDataClaim != null && individualDataClaim.MediaBrowserCompatMediaBrowserImplApi212) {
            a();
            MaterialButton materialButton = fragmentClaimOldDaySecurityReactivationBindingAsInterface.btnBack;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            materialButton.setVisibility(8);
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TextView textView = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvQuestionWork;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        IndividualDataClaim individualDataClaim2 = (IndividualDataClaim) this.a.getValue();
        if (individualDataClaim2 == null || (str = individualDataClaim2.MediaBrowserCompatMediaBrowserImplApi214) == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            arrayList = null;
        } else {
            List list = listSplit$default;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(StringsKt.trim((CharSequence) it.next()).toString());
            }
            arrayList = arrayList2;
        }
        String strJoinToString$default = arrayList != null ? CollectionsKt.joinToString$default(arrayList, "\n- ", "- ", null, 0, null, null, 60, null) : null;
        StringBuilder sb = new StringBuilder("Anda dapat mendaftar kembali sebagai peserta BPJS Ketenagakerjaan. Silakan ganti rekening bank Anda dengan salah satu Bank kerja sama di bawah ini:\n\n");
        sb.append(strJoinToString$default);
        sb.append("\n\nAtau Anda dapat melanjutkan klaim JHT dengan klik tombol selanjutnya.");
        fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvQuestionWork.setText(sb.toString());
        MaterialButton materialButton2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setVisibility(0);
    }

    private final void d() {
        FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface = asInterface();
        TextView textView = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberOnes;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        TextView textView2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvMemberCondition;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        RadioGroup radioGroup = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseCondition;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "");
        radioGroup.setVisibility(0);
        TextView textView3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberTwoReason;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(8);
        TextView textView4 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvReason;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(8);
        TextInputLayout textInputLayout = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilReason;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        textInputLayout.setVisibility(8);
        RadioGroup radioGroup2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgReason;
        Intrinsics.checkNotNullExpressionValue(radioGroup2, "");
        radioGroup2.setVisibility(8);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface = asInterface();
        TextView textView = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberTwo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        TextView textView2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvQuestionWork;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        TextInputLayout textInputLayout = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilChooseJobFirst;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        textInputLayout.setVisibility(8);
        TextInputLayout textInputLayout2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilChooseJobSecond;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        textInputLayout2.setVisibility(8);
        TextView textView3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberThree;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(8);
        TextView textView4 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvWorkLocation;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(8);
        TextInputLayout textInputLayout3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilChooseLocation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        textInputLayout3.setVisibility(8);
        TextView textView5 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberFour;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(8);
        TextView textView6 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvMonthlyFee;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(8);
        RadioGroup radioGroup = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "");
        radioGroup.setVisibility(8);
        TextView textView7 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberFive;
        Intrinsics.checkNotNullExpressionValue(textView7, "");
        textView7.setVisibility(8);
        TextView textView8 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvFamilyCardNumber;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        textView8.setVisibility(8);
        TextInputLayout textInputLayout4 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilFamilyCardNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        textInputLayout4.setVisibility(8);
        TextView textView9 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberSix;
        Intrinsics.checkNotNullExpressionValue(textView9, "");
        textView9.setVisibility(8);
        TextView textView10 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvCaptureImage;
        Intrinsics.checkNotNullExpressionValue(textView10, "");
        textView10.setVisibility(8);
        CardView cardView = fragmentClaimOldDaySecurityReactivationBindingAsInterface.cvCaptureImage;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setVisibility(8);
        AppCompatCheckBox appCompatCheckBox = fragmentClaimOldDaySecurityReactivationBindingAsInterface.cbAgreeTermCondition;
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "");
        appCompatCheckBox.setVisibility(8);
    }

    private final void a() {
        FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface = asInterface();
        TextView textView = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberOnes;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        TextView textView2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvMemberCondition;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        RadioGroup radioGroup = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseCondition;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "");
        radioGroup.setVisibility(0);
        TextView textView3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberTwo;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(0);
        TextView textView4 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvQuestionWork;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(0);
        TextInputLayout textInputLayout = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilChooseJobFirst;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        textInputLayout.setVisibility(0);
        TextInputLayout textInputLayout2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilChooseJobSecond;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        textInputLayout2.setVisibility(0);
        TextView textView5 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberThree;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(0);
        TextView textView6 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvWorkLocation;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(0);
        TextInputLayout textInputLayout3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilChooseLocation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        textInputLayout3.setVisibility(0);
        TextView textView7 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberFour;
        Intrinsics.checkNotNullExpressionValue(textView7, "");
        textView7.setVisibility(0);
        TextView textView8 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvMonthlyFee;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        textView8.setVisibility(0);
        RadioGroup radioGroup2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee;
        Intrinsics.checkNotNullExpressionValue(radioGroup2, "");
        radioGroup2.setVisibility(0);
        TextView textView9 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberFive;
        Intrinsics.checkNotNullExpressionValue(textView9, "");
        textView9.setVisibility(0);
        TextView textView10 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvFamilyCardNumber;
        Intrinsics.checkNotNullExpressionValue(textView10, "");
        textView10.setVisibility(0);
        TextInputLayout textInputLayout4 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tilFamilyCardNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        textInputLayout4.setVisibility(0);
        TextView textView11 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberSix;
        Intrinsics.checkNotNullExpressionValue(textView11, "");
        textView11.setVisibility(0);
        TextView textView12 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvCaptureImage;
        Intrinsics.checkNotNullExpressionValue(textView12, "");
        textView12.setVisibility(0);
        CardView cardView = fragmentClaimOldDaySecurityReactivationBindingAsInterface.cvCaptureImage;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setVisibility(0);
        AppCompatCheckBox appCompatCheckBox = fragmentClaimOldDaySecurityReactivationBindingAsInterface.cbAgreeTermCondition;
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "");
        appCompatCheckBox.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(File p0) {
        Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this).b(p0).into(asInterface().imgSelfiePhoto);
        asInterface().imgCapture.setVisibility(8);
        asInterface().tvCaptureLabel.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int p0, int p1, Intent p2) {
        if (p1 == -1 && p0 == 553 && p2 != null) {
            b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ClaimOldDaySecurityReactivationFragment$onActivityResult$1(this, getCaptureNode.b(p2), null), 3, null);
        }
        super.onActivityResult(p0, p1, p2);
    }

    public static /* synthetic */ saveBitmap TuitionPaymentFragmentbindingInflater1(final getExposureState getexposurestate) {
        saveBitmap.Companion companion = saveBitmap.INSTANCE;
        return saveBitmap.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new Function1() { // from class: isFocusMeteringSupported
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Job) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(getExposureState getexposurestate, RadioGroup radioGroup) {
        ArrayList arrayList;
        String str;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(radioGroup, "");
        FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface = getexposurestate.asInterface();
        int checkedRadioButtonId = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseCondition.getCheckedRadioButtonId();
        if (checkedRadioButtonId != R.id.rbHealthy) {
            if (checkedRadioButtonId != R.id.rbSick) {
                getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return;
            }
            getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            MaterialButton materialButton = fragmentClaimOldDaySecurityReactivationBindingAsInterface.btnBack;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            materialButton.setVisibility(8);
            return;
        }
        IndividualDataClaim individualDataClaim = (IndividualDataClaim) getexposurestate.a.getValue();
        if (individualDataClaim != null && individualDataClaim.MediaBrowserCompatMediaBrowserImplApi212) {
            getexposurestate.a();
            MaterialButton materialButton2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.btnBack;
            Intrinsics.checkNotNullExpressionValue(materialButton2, "");
            materialButton2.setVisibility(8);
            return;
        }
        getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TextView textView = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvQuestionWork;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        IndividualDataClaim individualDataClaim2 = (IndividualDataClaim) getexposurestate.a.getValue();
        if (individualDataClaim2 == null || (str = individualDataClaim2.MediaBrowserCompatMediaBrowserImplApi214) == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            arrayList = null;
        } else {
            List list = listSplit$default;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(StringsKt.trim((CharSequence) it.next()).toString());
            }
            arrayList = arrayList2;
        }
        String strJoinToString$default = arrayList != null ? CollectionsKt.joinToString$default(arrayList, "\n- ", "- ", null, 0, null, null, 60, null) : null;
        StringBuilder sb = new StringBuilder("Anda dapat mendaftar kembali sebagai peserta BPJS Ketenagakerjaan. Silakan ganti rekening bank Anda dengan salah satu Bank kerja sama di bawah ini:\n\n");
        sb.append(strJoinToString$default);
        sb.append("\n\nAtau Anda dapat melanjutkan klaim JHT dengan klik tombol selanjutnya.");
        fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvQuestionWork.setText(sb.toString());
        MaterialButton materialButton3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        materialButton3.setVisibility(0);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(getExposureState getexposurestate, FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBinding, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(radioGroup, "");
        FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface = getexposurestate.asInterface();
        int checkedRadioButtonId = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseIsBpu.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.rbNo || checkedRadioButtonId != R.id.rbYes) {
            FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface2 = getexposurestate.asInterface();
            TextView textView = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvNumberOnes;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            TextView textView2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvMemberCondition;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            RadioGroup radioGroup2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgChooseCondition;
            Intrinsics.checkNotNullExpressionValue(radioGroup2, "");
            radioGroup2.setVisibility(8);
            TextView textView3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvNumberTwo;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            TextView textView4 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvQuestionWork;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(8);
            TextInputLayout textInputLayout = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilChooseJobFirst;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            textInputLayout.setVisibility(8);
            TextInputLayout textInputLayout2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilChooseJobSecond;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            textInputLayout2.setVisibility(8);
            TextView textView5 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvNumberThree;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
            TextView textView6 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvWorkLocation;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            textView6.setVisibility(8);
            TextInputLayout textInputLayout3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilChooseLocation;
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
            textInputLayout3.setVisibility(8);
            TextView textView7 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvNumberFour;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            textView7.setVisibility(8);
            TextView textView8 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvMonthlyFee;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            textView8.setVisibility(8);
            RadioGroup radioGroup3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgMonthlyFee;
            Intrinsics.checkNotNullExpressionValue(radioGroup3, "");
            radioGroup3.setVisibility(8);
            TextView textView9 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvNumberFive;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            textView9.setVisibility(8);
            TextView textView10 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvFamilyCardNumber;
            Intrinsics.checkNotNullExpressionValue(textView10, "");
            textView10.setVisibility(8);
            TextInputLayout textInputLayout4 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilFamilyCardNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
            textInputLayout4.setVisibility(8);
            TextView textView11 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvNumberSix;
            Intrinsics.checkNotNullExpressionValue(textView11, "");
            textView11.setVisibility(8);
            TextView textView12 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvCaptureImage;
            Intrinsics.checkNotNullExpressionValue(textView12, "");
            textView12.setVisibility(8);
            CardView cardView = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.cvCaptureImage;
            Intrinsics.checkNotNullExpressionValue(cardView, "");
            cardView.setVisibility(8);
            AppCompatCheckBox appCompatCheckBox = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.cbAgreeTermCondition;
            Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "");
            appCompatCheckBox.setVisibility(8);
            MaterialButton materialButton = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.btnBack;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            materialButton.setVisibility(8);
            TextView textView13 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvNumberTwoReason;
            Intrinsics.checkNotNullExpressionValue(textView13, "");
            textView13.setVisibility(0);
            TextView textView14 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tvReason;
            Intrinsics.checkNotNullExpressionValue(textView14, "");
            textView14.setVisibility(0);
            RadioGroup radioGroup4 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgReason;
            Intrinsics.checkNotNullExpressionValue(radioGroup4, "");
            radioGroup4.setVisibility(0);
        } else {
            getexposurestate.d();
            if (fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseCondition.getCheckedRadioButtonId() == R.id.rbHealthy) {
                getexposurestate.TuitionPaymentFragmentbindingInflater1();
            }
        }
        int id2 = ((AppCompatRadioButton) radioGroup.findViewById(i)).getId();
        if (fragmentClaimOldDaySecurityReactivationBinding.rgReason.getCheckedRadioButtonId() == -1) {
            if (id2 == R.id.rbYes) {
                TextInputLayout textInputLayout5 = fragmentClaimOldDaySecurityReactivationBinding.tilReason;
                Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
                textInputLayout5.setVisibility(8);
                return;
            }
            return;
        }
        Object tag = ((AppCompatRadioButton) fragmentClaimOldDaySecurityReactivationBinding.rgReason.findViewById(fragmentClaimOldDaySecurityReactivationBinding.rgReason.getCheckedRadioButtonId())).getTag();
        Intrinsics.checkNotNull(tag, "");
        if (Intrinsics.areEqual((String) tag, "TDK03") && id2 == R.id.rbNo) {
            TextInputLayout textInputLayout6 = fragmentClaimOldDaySecurityReactivationBinding.tilReason;
            Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
            textInputLayout6.setVisibility(0);
        } else {
            TextInputLayout textInputLayout7 = fragmentClaimOldDaySecurityReactivationBinding.tilReason;
            Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
            textInputLayout7.setVisibility(8);
        }
    }

    public static /* synthetic */ void b(getExposureState getexposurestate, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getActivitySideSheetPosition getactivitysidesheetposition = (getActivitySideSheetPosition) getexposurestate.INotificationSideChannelStubProxy.getValue();
            FragmentManager childFragmentManager = getexposurestate.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getactivitysidesheetposition.show(childFragmentManager, getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ saveBitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(final getExposureState getexposurestate) {
        saveBitmap.Companion companion = saveBitmap.INSTANCE;
        return saveBitmap.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getexposurestate.b, new Function1() { // from class: getSupportedOutputFormats
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Job) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(getExposureState getexposurestate, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            saveBitmap savebitmap = (saveBitmap) getexposurestate.getInterfaceDescriptor.getValue();
            FragmentManager childFragmentManager = getexposurestate.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                savebitmap.show(childFragmentManager, savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final getExposureState getexposurestate, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) getexposurestate.INotificationSideChannel.getValue();
            String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
            final Function1 function1 = new Function1() { // from class: getIntrinsicZoomRatio
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getExposureState.TuitionPaymentFragmentbindingInflater1(this.b, (Boolean) obj);
                }
            };
            BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: getPhysicalCameraCharacteristics
                @Override // defpackage.logToString
                public final void accept(Object obj) throws IllegalAccessException {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46400), 40 - TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, 1513912262, false, "b", null);
                    }
                    int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37836), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58, Gravity.getAbsoluteGravity(0, 0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AndroidCharacter.getMirror('0') + 37788), 60 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                    }
                    int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                    long j2 = -318;
                    long j3 = -1;
                    long j4 = j3 ^ 3741486836703934378L;
                    long j5 = 1777766660455851861L ^ j3;
                    long jIdentityHashCode = System.identityHashCode(this);
                    long j6 = (((long) (-317)) * 3741486836703934378L) + (((long) 319) * 1777766660455851861L) + (((((j4 | j5) | jIdentityHashCode) ^ j3) | (((jIdentityHashCode ^ j3) | 4318933900631603199L) ^ j3)) * j2) + (j2 * (((j5 | 3741486836703934378L) ^ j3) | ((3741486836703934378L | jIdentityHashCode) ^ j3))) + (((long) TypedValues.AttributesType.TYPE_PIVOT_TARGET) * (((j4 | jIdentityHashCode) ^ j3) | j5));
                    int i3 = 0;
                    while (true) {
                        for (int i4 = 0; i4 != 8; i4++) {
                            i2 = (((((int) (j >> i4)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
                        }
                        if (i3 != 0) {
                            break;
                        }
                        i3++;
                        j = j6;
                    }
                    if (i2 != i) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 46400), 40 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                        throw null;
                    }
                    function1.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
            ((acquireBuffer) getexposurestate.onTransact.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getExposureState getexposurestate, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            saveBitmap savebitmap = (saveBitmap) getexposurestate.INotificationSideChannelStub.getValue();
            FragmentManager childFragmentManager = getexposurestate.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                savebitmap.show(childFragmentManager, savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(getExposureState getexposurestate, WorkLocation workLocation) {
        Intrinsics.checkNotNullParameter(workLocation, "");
        getexposurestate.TuitionPaymentFragmentbindingInflater1 = workLocation;
        EditText editText = getexposurestate.asInterface().tilChooseLocation.getEditText();
        if (editText != null) {
            editText.setText(workLocation.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(getExposureState getexposurestate) {
        BaseActivity baseActivity = getexposurestate.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3(getExposureState getexposurestate) {
        return new outputFormatToAudioProfile(getexposurestate.requireActivity());
    }

    public static /* synthetic */ getActivitySideSheetPosition TuitionPaymentFragmentspecialinlinedviewModeldefault1(final getExposureState getexposurestate) {
        getActivitySideSheetPosition.Companion companion = getActivitySideSheetPosition.INSTANCE;
        return getActivitySideSheetPosition.Companion.TuitionPaymentFragmentbindingInflater1(getexposurestate.TuitionPaymentFragmentbindingInflater1, new Function1() { // from class: hasFlashUnit
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getExposureState.b(this.b, (WorkLocation) obj);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getExposureState getexposurestate, Job job) {
        Intrinsics.checkNotNullParameter(job, "");
        getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = job;
        EditText editText = getexposurestate.asInterface().tilChooseJobSecond.getEditText();
        if (editText != null) {
            editText.setText(job.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getExposureState getexposurestate, Job job) {
        Intrinsics.checkNotNullParameter(job, "");
        getexposurestate.b = job;
        EditText editText = getexposurestate.asInterface().tilChooseJobFirst.getEditText();
        if (editText != null) {
            editText.setText(job.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getExposureState getexposurestate, Bitmap bitmap) {
        if (bitmap == null) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Gagal mengambil gambar", 0).show();
            return;
        }
        Context contextRequireContext = getexposurestate.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        File fileTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, bitmap, false);
        getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fileTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fileTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        getExposureState getexposurestate = this;
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancel.observe(getexposurestate, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getSupportedDynamicRanges
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getExposureState.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asBinder.observe(getexposurestate, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getSupportedHardwareLevel
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getExposureState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        IndividualDataClaim individualDataClaim = (IndividualDataClaim) this.a.getValue();
        if (individualDataClaim != null) {
            final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            String str = individualDataClaim.asInterface;
            Intrinsics.checkNotNullParameter(str, "");
            ClaimReactivationBpuTuitionRequest claimReactivationBpuTuitionRequest = new ClaimReactivationBpuTuitionRequest(str);
            MutableLiveData<VirtualCameraAdapter1<ClaimReactivationBpuTuitionResponse>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.cancel;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(claimReactivationBpuTuitionRequest)));
            final Function1 function1 = new Function1() { // from class: releaseInternal
                public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1069569033;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(camera2CameraControlImplExternalSyntheticLambda4, (ClaimReactivationBpuTuitionResponse) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: tryAttachUseCases
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: removeMeteringRepeating
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: resetUseCase
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        IndividualDataClaim individualDataClaim2 = (IndividualDataClaim) this.a.getValue();
        if (individualDataClaim2 != null) {
            boolean z = individualDataClaim2.MediaBrowserCompatMediaBrowserImplApi212;
        }
        FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface = asInterface();
        TextView textView = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvQuestionReactivation;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        RadioGroup radioGroup = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseIsBpu;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "");
        radioGroup.setVisibility(0);
        TextView textView2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvNumberOne;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        fragmentClaimOldDaySecurityReactivationBindingAsInterface.tvRedactionReactivation.setText(R.string.label_reactivation);
        final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda5 = (Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        MutableLiveData<VirtualCameraAdapter1<List<ReasonNotReactive>>> mutableLiveData2 = camera2CameraControlImplExternalSyntheticLambda5.asBinder;
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda5.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
        Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0 camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0 = new Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0(new Function1() { // from class: Camera2CameraControlImplCameraControlSessionCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws IllegalAccessException {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, 18 - ExpandableListView.getPackedPositionChild(0L), 1513912262, false, "b", null);
                }
                int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.getDefaultSize(0, 0) + 37836), TextUtils.getCapsMode("", 0, 0) + 59, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
                }
                int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                long j = i2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37836), View.resolveSizeAndState(0, 0, 0) + 59, TextUtils.getOffsetBefore("", 0) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                }
                int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                long j2 = -1;
                long j3 = elapsedCpuTime ^ j2;
                long j4 = 164;
                long j5 = j2 ^ 2324802527968049794L;
                long j6 = (((long) 165) * 3194450969191736445L) + (((long) (-163)) * 2324802527968049794L) + (((long) (-328)) * (((j3 | 2324802527968049794L) ^ j2) | 3194450969191736445L)) + ((elapsedCpuTime | 3194450969191736445L) * j4) + (j4 * ((j2 ^ (j3 | 3195299262551785215L)) | ((j5 | elapsedCpuTime) ^ j2) | (((3194450969191736445L ^ j2) | j5) ^ j2)));
                long j7 = j;
                int i4 = 0;
                while (true) {
                    for (int i5 = 0; i5 != 8; i5++) {
                        i3 = (((((int) (j7 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                    }
                    if (i4 != 0) {
                        break;
                    }
                    i4++;
                    j7 = j6;
                }
                if (i3 == i) {
                    return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda5, (List) obj);
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46401 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 40 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                throw new RuntimeException(String.valueOf(i2));
            }
        });
        final Function1 function3 = new Function1() { // from class: removeListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(camera2CameraControlImplExternalSyntheticLambda5, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0, new logToString() { // from class: addListener
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function3.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
        camera2CameraControlImplExternalSyntheticLambda5.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getExposureState getexposurestate, Boolean bool) {
        if (!bool.booleanValue()) {
            Context contextRequireContext = getexposurestate.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = getexposurestate.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(contextRequireContext, string);
        } else {
            getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            getexposurestate.asInterface().imgSelfiePhoto.setImageResource(0);
            getexposurestate.asInterface().imgCapture.setVisibility(0);
            getexposurestate.asInterface().tvCaptureLabel.setVisibility(0);
            if (Build.VERSION.SDK_INT < 33) {
                updateFileExif updatefileexif = new updateFileExif();
                getExposureState getexposurestate2 = getexposurestate;
                Intent intent = new Intent(getexposurestate2.getActivity(), (Class<?>) ImagePickerActivity.class);
                intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                getexposurestate2.startActivityForResult(intent, 553);
            } else {
                getexposurestate.INotificationSideChannelDefault.launch(null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBinding, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(radioGroup, "");
        Object tag = ((AppCompatRadioButton) radioGroup.findViewById(i)).getTag();
        Intrinsics.checkNotNull(tag, "");
        if (Intrinsics.areEqual((String) tag, "TDK03")) {
            TextInputLayout textInputLayout = fragmentClaimOldDaySecurityReactivationBinding.tilReason;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            textInputLayout.setVisibility(0);
        } else {
            TextInputLayout textInputLayout2 = fragmentClaimOldDaySecurityReactivationBinding.tilReason;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            textInputLayout2.setVisibility(8);
        }
    }

    public static /* synthetic */ Unit b(final getExposureState getexposurestate, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getexposurestate.IconCompatParcelizer();
            str = "loading_claim_jht_step_fourt_reactivation_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            getexposurestate.cancel = ((ClaimReactivationBpuTuitionResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
            FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface = getexposurestate.asInterface();
            List<dataBpu> list = getexposurestate.cancel;
            if (list != null) {
                for (dataBpu databpu : list) {
                    AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(new ContextThemeWrapper(getexposurestate.requireContext(), R.style.BpjstkuRadioButton_DmSansCoolGrey));
                    appCompatRadioButton.setId(View.generateViewId());
                    appCompatRadioButton.setText(databpu.getKeterangan());
                    appCompatRadioButton.setTag(databpu.getKode());
                    appCompatRadioButton.setTextSize(14.0f);
                    appCompatRadioButton.setButtonDrawable((Drawable) null);
                    appCompatRadioButton.setChecked(Intrinsics.areEqual(databpu.getKode(), "IUR04"));
                    fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee.addView(appCompatRadioButton);
                }
            }
            getexposurestate.write();
            str = "success_claim_jht_step_fourt_reactivation_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getexposurestate.write();
            getExposureState getexposurestate2 = getexposurestate;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Function0 function0 = new Function0() { // from class: getSensorRotationDegrees
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return getExposureState.a(this.TuitionPaymentFragmentbindingInflater1);
                }
            };
            Intrinsics.checkNotNullParameter(getexposurestate2, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity = (BaseActivity) getexposurestate2.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, function0);
            }
            str = "failure_claim_jht_step_fourt_reactivation_result";
        } else {
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_first", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(null, true);
        Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getExposureState getexposurestate, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getexposurestate.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            List<ReasonNotReactive> list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getexposurestate.notify = list;
            if (list != null) {
                for (ReasonNotReactive reasonNotReactive : list) {
                    AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(new ContextThemeWrapper(getexposurestate.requireContext(), R.style.BpjstkuRadioButton_DmSansCoolGrey));
                    appCompatRadioButton.setId(View.generateViewId());
                    appCompatRadioButton.setText(reasonNotReactive.getKeterangan());
                    appCompatRadioButton.setTag(reasonNotReactive.getKodeReason());
                    appCompatRadioButton.setTextSize(14.0f);
                    appCompatRadioButton.setButtonDrawable((Drawable) null);
                    appCompatRadioButton.setTextColor(ContextCompat.getColor(getexposurestate.requireContext(), R.color.colorCoolGrey));
                    appCompatRadioButton.setTypeface(ResourcesCompat.getFont(getexposurestate.requireContext(), R.font.dmsans_reguler));
                    getexposurestate.asInterface().rgReason.addView(appCompatRadioButton);
                }
            }
            getexposurestate.write();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getexposurestate.write();
            getexposurestate.notify = CollectionsKt.emptyList();
            getExposureState getexposurestate2 = getexposurestate;
            Intrinsics.checkNotNullParameter(getexposurestate2, "");
            Intrinsics.checkNotNullParameter("Terjadi Kesalahan", "");
            BaseActivity baseActivity = (BaseActivity) getexposurestate2.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, "Terjadi Kesalahan", null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x038b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0396  */
    /* JADX WARN: Code duplicated, block: B:162:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:163:0x03af  */
    /* JADX WARN: Code duplicated, block: B:165:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:169:0x03be  */
    /* JADX WARN: Code duplicated, block: B:171:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:176:0x03d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:178:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:180:0x03df  */
    /* JADX WARN: Code duplicated, block: B:182:0x0466  */
    /* JADX WARN: Code duplicated, block: B:184:0x0469  */
    /* JADX WARN: Code duplicated, block: B:187:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x019e  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x020b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0221  */
    /* JADX WARN: Code duplicated, block: B:90:0x022a  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getExposureState getexposurestate, View view) {
        boolean z;
        IndividualDataClaim individualDataClaim;
        FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface;
        String str;
        List<dataBpu> list;
        dataBpu databpu;
        AppCompatRadioButton appCompatRadioButton;
        ReasonNotReactive reasonNotReactive;
        IndividualDataClaim individualDataClaim2;
        String kodeReason;
        String str2;
        String kodeReason2;
        String keterangan;
        String str3;
        IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        IndividualDataClaim individualDataClaim3;
        String str4;
        List<ReasonNotReactive> list2;
        Iterator<T> it;
        Object next;
        Iterator<T> it2;
        Object next2;
        Intrinsics.checkNotNullParameter(view, "");
        FragmentClaimOldDaySecurityReactivationBinding fragmentClaimOldDaySecurityReactivationBindingAsInterface2 = getexposurestate.asInterface();
        if (fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgChooseIsBpu.getCheckedRadioButtonId() == R.id.rbNo) {
            if (fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgReason.getCheckedRadioButtonId() != -1) {
                Object tag = ((AppCompatRadioButton) fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgReason.findViewById(fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgReason.getCheckedRadioButtonId())).getTag();
                Intrinsics.checkNotNull(tag, "");
                if (Intrinsics.areEqual((String) tag, "TDK03")) {
                    Editable text = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.edtReason.getText();
                    if (text == null || text.length() == 0) {
                        fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilReason.setError("Alasan harus diisi");
                    } else {
                        fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilReason.setError(null);
                        fragmentClaimOldDaySecurityReactivationBindingAsInterface = getexposurestate.asInterface();
                        Object tag2 = ((AppCompatRadioButton) fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee.findViewById(fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee.getCheckedRadioButtonId())).getTag();
                        Intrinsics.checkNotNull(tag2, "");
                        str = (String) tag2;
                        list = getexposurestate.cancel;
                        if (list != null) {
                            it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!Intrinsics.areEqual(((dataBpu) next2).getKode(), str));
                            databpu = (dataBpu) next2;
                        } else {
                            databpu = null;
                        }
                        appCompatRadioButton = (AppCompatRadioButton) fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgReason.findViewById(fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgReason.getCheckedRadioButtonId());
                        if (appCompatRadioButton != null) {
                            Object tag3 = appCompatRadioButton.getTag();
                            Intrinsics.checkNotNull(tag3, "");
                            str4 = (String) tag3;
                            list2 = getexposurestate.notify;
                            if (list2 != null) {
                                it = list2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!Intrinsics.areEqual(((ReasonNotReactive) next).getKodeReason(), str4));
                                reasonNotReactive = (ReasonNotReactive) next;
                            } else {
                                reasonNotReactive = null;
                            }
                        } else {
                            reasonNotReactive = null;
                        }
                        if (fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseIsBpu.getCheckedRadioButtonId() == R.id.rbYes) {
                            individualDataClaim2 = (IndividualDataClaim) getexposurestate.a.getValue();
                            if (individualDataClaim2 != null) {
                                if (reasonNotReactive != null) {
                                    kodeReason = reasonNotReactive.getKodeReason();
                                } else {
                                    kodeReason = null;
                                }
                                if (kodeReason == null) {
                                    str2 = "";
                                } else {
                                    str2 = kodeReason;
                                }
                                if (reasonNotReactive != null) {
                                    kodeReason2 = reasonNotReactive.getKodeReason();
                                } else {
                                    kodeReason2 = null;
                                }
                                if (kodeReason2 == null) {
                                    kodeReason2 = "";
                                }
                                if (Intrinsics.areEqual(kodeReason2, "TDK03")) {
                                    keterangan = String.valueOf(fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtReason.getText());
                                } else {
                                    if (reasonNotReactive != null) {
                                        keterangan = reasonNotReactive.getKeterangan();
                                    } else {
                                        keterangan = null;
                                    }
                                    if (keterangan == null) {
                                        str3 = "";
                                    }
                                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                                }
                                str3 = keterangan;
                                individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                            } else {
                                individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                            }
                        } else {
                            individualDataClaim2 = (IndividualDataClaim) getexposurestate.a.getValue();
                            if (individualDataClaim2 != null) {
                                if (reasonNotReactive != null) {
                                    kodeReason = reasonNotReactive.getKodeReason();
                                } else {
                                    kodeReason = null;
                                }
                                if (kodeReason == null) {
                                    str2 = "";
                                } else {
                                    str2 = kodeReason;
                                }
                                if (reasonNotReactive != null) {
                                    kodeReason2 = reasonNotReactive.getKodeReason();
                                } else {
                                    kodeReason2 = null;
                                }
                                if (kodeReason2 == null) {
                                    kodeReason2 = "";
                                }
                                if (Intrinsics.areEqual(kodeReason2, "TDK03")) {
                                    keterangan = String.valueOf(fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtReason.getText());
                                } else {
                                    if (reasonNotReactive != null) {
                                        keterangan = reasonNotReactive.getKeterangan();
                                    } else {
                                        keterangan = null;
                                    }
                                    if (keterangan == null) {
                                        str3 = "";
                                    }
                                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                                }
                                str3 = keterangan;
                                individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                            } else {
                                individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                            }
                        }
                        if (individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                            lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, false, 2, null);
                            Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
                            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
                        }
                    }
                } else {
                    fragmentClaimOldDaySecurityReactivationBindingAsInterface = getexposurestate.asInterface();
                    Object tag4 = ((AppCompatRadioButton) fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee.findViewById(fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee.getCheckedRadioButtonId())).getTag();
                    Intrinsics.checkNotNull(tag4, "");
                    str = (String) tag4;
                    list = getexposurestate.cancel;
                    if (list != null) {
                        it2 = list.iterator();
                        do {
                            if (it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!Intrinsics.areEqual(((dataBpu) next2).getKode(), str));
                        databpu = (dataBpu) next2;
                    } else {
                        databpu = null;
                    }
                    appCompatRadioButton = (AppCompatRadioButton) fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgReason.findViewById(fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgReason.getCheckedRadioButtonId());
                    if (appCompatRadioButton != null) {
                        Object tag5 = appCompatRadioButton.getTag();
                        Intrinsics.checkNotNull(tag5, "");
                        str4 = (String) tag5;
                        list2 = getexposurestate.notify;
                        if (list2 != null) {
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.areEqual(((ReasonNotReactive) next).getKodeReason(), str4));
                            reasonNotReactive = (ReasonNotReactive) next;
                        } else {
                            reasonNotReactive = null;
                        }
                    } else {
                        reasonNotReactive = null;
                    }
                    if (fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseIsBpu.getCheckedRadioButtonId() == R.id.rbYes || (individualDataClaim3 = (IndividualDataClaim) getexposurestate.a.getValue()) == null || !individualDataClaim3.MediaBrowserCompatMediaBrowserImplApi212) {
                        individualDataClaim2 = (IndividualDataClaim) getexposurestate.a.getValue();
                        if (individualDataClaim2 != null) {
                            if (reasonNotReactive != null) {
                                kodeReason = reasonNotReactive.getKodeReason();
                            } else {
                                kodeReason = null;
                            }
                            if (kodeReason == null) {
                                str2 = "";
                            } else {
                                str2 = kodeReason;
                            }
                            if (reasonNotReactive != null) {
                                kodeReason2 = reasonNotReactive.getKodeReason();
                            } else {
                                kodeReason2 = null;
                            }
                            if (kodeReason2 == null) {
                                kodeReason2 = "";
                            }
                            if (Intrinsics.areEqual(kodeReason2, "TDK03")) {
                                keterangan = String.valueOf(fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtReason.getText());
                            } else {
                                if (reasonNotReactive != null) {
                                    keterangan = reasonNotReactive.getKeterangan();
                                } else {
                                    keterangan = null;
                                }
                                if (keterangan == null) {
                                    str3 = "";
                                }
                                individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                            }
                            str3 = keterangan;
                            individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                        } else {
                            individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                        }
                    } else {
                        IndividualDataClaim individualDataClaim4 = (IndividualDataClaim) getexposurestate.a.getValue();
                        if (individualDataClaim4 != null) {
                            String str5 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseIsBpu.getCheckedRadioButtonId() == R.id.rbYes ? "Y" : ExifInterface.GPS_DIRECTION_TRUE;
                            String str6 = (fragmentClaimOldDaySecurityReactivationBindingAsInterface.cbAgreeTermCondition.isChecked() && fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseCondition.getCheckedRadioButtonId() == R.id.rbHealthy) ? "Y" : ExifInterface.GPS_DIRECTION_TRUE;
                            String str7 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseCondition.getCheckedRadioButtonId() == R.id.rbSick ? "Y" : ExifInterface.GPS_DIRECTION_TRUE;
                            String str8 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseCondition.getCheckedRadioButtonId() == R.id.rbSick ? "" : getexposurestate.b.TuitionPaymentFragmentbindingInflater1;
                            String str9 = fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseCondition.getCheckedRadioButtonId() == R.id.rbSick ? "" : getexposurestate.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            Job job = getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            String strValueOf = String.valueOf(job != null ? job.TuitionPaymentFragmentbindingInflater1 : null);
                            Job job2 = getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            String strValueOf2 = String.valueOf(job2 != null ? job2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
                            WorkLocation workLocation = getexposurestate.TuitionPaymentFragmentbindingInflater1;
                            String strValueOf3 = String.valueOf(workLocation != null ? workLocation.TuitionPaymentFragmentbindingInflater1 : null);
                            WorkLocation workLocation2 = getexposurestate.TuitionPaymentFragmentbindingInflater1;
                            String strValueOf4 = String.valueOf(workLocation2 != null ? workLocation2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
                            String strValueOf5 = String.valueOf(fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtFamilyCardNumber.getText());
                            String kode = databpu != null ? databpu.getKode() : null;
                            String str10 = kode == null ? "" : kode;
                            String nomIuran = databpu != null ? databpu.getNomIuran() : null;
                            String str11 = nomIuran == null ? "" : nomIuran;
                            String keterangan2 = databpu != null ? databpu.getKeterangan() : null;
                            String str12 = keterangan2 == null ? "" : keterangan2;
                            File file = getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str5, str8, str9, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, str10, str11, str12, "", String.valueOf(file != null ? Camera2CameraControlExternalSyntheticLambda5.b(file) : null), str6, null, false, str7, null, null, null, null, null, null, -1, -1073676289, 126, null);
                        } else {
                            individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                        }
                    }
                    if (individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion2 = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                        lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol2 = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, false, 2, null);
                        Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol2, "");
                        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol2);
                    }
                }
            } else {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Pilih alasan", 0).show();
            }
        } else if (fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgChooseCondition.getCheckedRadioButtonId() != R.id.rbSick && (fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgChooseIsBpu.getCheckedRadioButtonId() != R.id.rbYes || fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgChooseCondition.getCheckedRadioButtonId() != R.id.rbHealthy || (individualDataClaim = (IndividualDataClaim) getexposurestate.a.getValue()) == null || individualDataClaim.MediaBrowserCompatMediaBrowserImplApi212)) {
            if (fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgChooseIsBpu.getCheckedRadioButtonId() == -1) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Pilih jawaban untuk pertanyaan pertama", 0).show();
                z = false;
            } else {
                z = true;
            }
            if (fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgChooseCondition.getCheckedRadioButtonId() == -1) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Pilih jawaban untuk pertanyaan kedua", 0).show();
                z = false;
            }
            Editable text2 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.edtChooseJobFirst.getText();
            if (text2 == null || text2.length() == 0) {
                fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilChooseJobFirst.setError("Pekerjaan 1 harus diisi");
                z = false;
            } else {
                fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilChooseJobFirst.setError(null);
            }
            Editable text3 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.edtChooseLocation.getText();
            if (text3 == null || text3.length() == 0) {
                fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilChooseLocation.setError("Lokasi pekerjaan harus diisi");
                z = false;
            } else {
                fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilChooseLocation.setError(null);
            }
            if (fragmentClaimOldDaySecurityReactivationBindingAsInterface2.rgMonthlyFee.getCheckedRadioButtonId() == -1) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Pilih jumlah iuran yang akan dibayarkan", 0).show();
                z = false;
            }
            Editable text4 = fragmentClaimOldDaySecurityReactivationBindingAsInterface2.edtFamilyCardNumber.getText();
            if (text4 == null || text4.length() == 0 || String.valueOf(fragmentClaimOldDaySecurityReactivationBindingAsInterface2.edtFamilyCardNumber.getText()).length() != 16) {
                fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilFamilyCardNumber.setError("Nomor Kartu Keluarga harus diisi dan terdiri dari 16 karakter");
                z = false;
            } else {
                fragmentClaimOldDaySecurityReactivationBindingAsInterface2.tilFamilyCardNumber.setError(null);
            }
            if (!fragmentClaimOldDaySecurityReactivationBindingAsInterface2.cbAgreeTermCondition.isChecked()) {
                String string = getexposurestate.getString(R.string.message_agreed_tnc);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
                z = false;
            }
            if (getexposurestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Silahkan mengambil foto", 0).show();
            } else if (z) {
                fragmentClaimOldDaySecurityReactivationBindingAsInterface = getexposurestate.asInterface();
                Object tag6 = ((AppCompatRadioButton) fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee.findViewById(fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee.getCheckedRadioButtonId())).getTag();
                Intrinsics.checkNotNull(tag6, "");
                str = (String) tag6;
                list = getexposurestate.cancel;
                if (list != null) {
                    it2 = list.iterator();
                    do {
                        if (it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!Intrinsics.areEqual(((dataBpu) next2).getKode(), str));
                    databpu = (dataBpu) next2;
                } else {
                    databpu = null;
                }
                appCompatRadioButton = (AppCompatRadioButton) fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgReason.findViewById(fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgReason.getCheckedRadioButtonId());
                if (appCompatRadioButton != null) {
                    Object tag7 = appCompatRadioButton.getTag();
                    Intrinsics.checkNotNull(tag7, "");
                    str4 = (String) tag7;
                    list2 = getexposurestate.notify;
                    if (list2 != null) {
                        it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.areEqual(((ReasonNotReactive) next).getKodeReason(), str4));
                        reasonNotReactive = (ReasonNotReactive) next;
                    } else {
                        reasonNotReactive = null;
                    }
                } else {
                    reasonNotReactive = null;
                }
                if (fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseIsBpu.getCheckedRadioButtonId() == R.id.rbYes) {
                    individualDataClaim2 = (IndividualDataClaim) getexposurestate.a.getValue();
                    if (individualDataClaim2 != null) {
                        if (reasonNotReactive != null) {
                            kodeReason = reasonNotReactive.getKodeReason();
                        } else {
                            kodeReason = null;
                        }
                        if (kodeReason == null) {
                            str2 = "";
                        } else {
                            str2 = kodeReason;
                        }
                        if (reasonNotReactive != null) {
                            kodeReason2 = reasonNotReactive.getKodeReason();
                        } else {
                            kodeReason2 = null;
                        }
                        if (kodeReason2 == null) {
                            kodeReason2 = "";
                        }
                        if (Intrinsics.areEqual(kodeReason2, "TDK03")) {
                            keterangan = String.valueOf(fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtReason.getText());
                        } else {
                            if (reasonNotReactive != null) {
                                keterangan = reasonNotReactive.getKeterangan();
                            } else {
                                keterangan = null;
                            }
                            if (keterangan == null) {
                                str3 = "";
                            }
                            individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                        }
                        str3 = keterangan;
                        individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                    } else {
                        individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    }
                } else {
                    individualDataClaim2 = (IndividualDataClaim) getexposurestate.a.getValue();
                    if (individualDataClaim2 != null) {
                        if (reasonNotReactive != null) {
                            kodeReason = reasonNotReactive.getKodeReason();
                        } else {
                            kodeReason = null;
                        }
                        if (kodeReason == null) {
                            str2 = "";
                        } else {
                            str2 = kodeReason;
                        }
                        if (reasonNotReactive != null) {
                            kodeReason2 = reasonNotReactive.getKodeReason();
                        } else {
                            kodeReason2 = null;
                        }
                        if (kodeReason2 == null) {
                            kodeReason2 = "";
                        }
                        if (Intrinsics.areEqual(kodeReason2, "TDK03")) {
                            keterangan = String.valueOf(fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtReason.getText());
                        } else {
                            if (reasonNotReactive != null) {
                                keterangan = reasonNotReactive.getKeterangan();
                            } else {
                                keterangan = null;
                            }
                            if (keterangan == null) {
                                str3 = "";
                            }
                            individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                        }
                        str3 = keterangan;
                        individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                    } else {
                        individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    }
                }
                if (individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion3 = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                    lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol3 = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, false, 2, null);
                    Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol3, "");
                    lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol3);
                }
            }
        } else {
            fragmentClaimOldDaySecurityReactivationBindingAsInterface = getexposurestate.asInterface();
            Object tag8 = ((AppCompatRadioButton) fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee.findViewById(fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgMonthlyFee.getCheckedRadioButtonId())).getTag();
            Intrinsics.checkNotNull(tag8, "");
            str = (String) tag8;
            list = getexposurestate.cancel;
            if (list != null) {
                it2 = list.iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!Intrinsics.areEqual(((dataBpu) next2).getKode(), str));
                databpu = (dataBpu) next2;
            } else {
                databpu = null;
            }
            appCompatRadioButton = (AppCompatRadioButton) fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgReason.findViewById(fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgReason.getCheckedRadioButtonId());
            if (appCompatRadioButton != null) {
                Object tag9 = appCompatRadioButton.getTag();
                Intrinsics.checkNotNull(tag9, "");
                str4 = (String) tag9;
                list2 = getexposurestate.notify;
                if (list2 != null) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((ReasonNotReactive) next).getKodeReason(), str4));
                    reasonNotReactive = (ReasonNotReactive) next;
                } else {
                    reasonNotReactive = null;
                }
            } else {
                reasonNotReactive = null;
            }
            if (fragmentClaimOldDaySecurityReactivationBindingAsInterface.rgChooseIsBpu.getCheckedRadioButtonId() == R.id.rbYes) {
                individualDataClaim2 = (IndividualDataClaim) getexposurestate.a.getValue();
                if (individualDataClaim2 != null) {
                    if (reasonNotReactive != null) {
                        kodeReason = reasonNotReactive.getKodeReason();
                    } else {
                        kodeReason = null;
                    }
                    if (kodeReason == null) {
                        str2 = "";
                    } else {
                        str2 = kodeReason;
                    }
                    if (reasonNotReactive != null) {
                        kodeReason2 = reasonNotReactive.getKodeReason();
                    } else {
                        kodeReason2 = null;
                    }
                    if (kodeReason2 == null) {
                        kodeReason2 = "";
                    }
                    if (Intrinsics.areEqual(kodeReason2, "TDK03")) {
                        keterangan = String.valueOf(fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtReason.getText());
                    } else {
                        if (reasonNotReactive != null) {
                            keterangan = reasonNotReactive.getKeterangan();
                        } else {
                            keterangan = null;
                        }
                        if (keterangan == null) {
                            str3 = "";
                        }
                        individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                    }
                    str3 = keterangan;
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                } else {
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                }
            } else {
                individualDataClaim2 = (IndividualDataClaim) getexposurestate.a.getValue();
                if (individualDataClaim2 != null) {
                    if (reasonNotReactive != null) {
                        kodeReason = reasonNotReactive.getKodeReason();
                    } else {
                        kodeReason = null;
                    }
                    if (kodeReason == null) {
                        str2 = "";
                    } else {
                        str2 = kodeReason;
                    }
                    if (reasonNotReactive != null) {
                        kodeReason2 = reasonNotReactive.getKodeReason();
                    } else {
                        kodeReason2 = null;
                    }
                    if (kodeReason2 == null) {
                        kodeReason2 = "";
                    }
                    if (Intrinsics.areEqual(kodeReason2, "TDK03")) {
                        keterangan = String.valueOf(fragmentClaimOldDaySecurityReactivationBindingAsInterface.edtReason.getText());
                    } else {
                        if (reasonNotReactive != null) {
                            keterangan = reasonNotReactive.getKeterangan();
                        } else {
                            keterangan = null;
                        }
                        if (keterangan == null) {
                            str3 = "";
                        }
                        individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                    }
                    str3 = keterangan;
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, ExifInterface.GPS_DIRECTION_TRUE, null, str2, str3, null, null, null, -1, -1005256705, 114, null);
                } else {
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                }
            }
            if (individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion4 = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol4 = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, false, 2, null);
                Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol4, "");
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol4);
            }
        }
        return Unit.INSTANCE;
    }
}
