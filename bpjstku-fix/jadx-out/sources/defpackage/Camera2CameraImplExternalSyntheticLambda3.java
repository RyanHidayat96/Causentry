package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.data.jht.model.request.ClaimLivenessFaceMatchCheckRequest;
import com.bpjstku.data.jht.model.request.ClaimLivenessFaceMatchRequest;
import com.bpjstku.data.jht.model.response.ClaimLivenessResponse;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.queueing.model.request.AntrianOnlineUrlRequest;
import com.bpjstku.data.queueing.model.response.AntrianOnlineUrlResponse;
import com.bpjstku.data.setting.model.request.KeyRequest;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.databinding.FragmentClaimOldDaySecurityCheckLivenessBinding;
import com.bpjstku.domain.jht.model.JhtClaimEligibility;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityCheckLivenessFragment$bindingInflater$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.material.button.MaterialButton;
import com.google.gson.Gson;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.IntegerRes;
import defpackage.ToolbarActionBarActionMenuPresenterCallback;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.getEventTime;
import defpackage.getExtendedConfig;
import defpackage.getFocusY;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.setQuickZoomEnabled;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0016\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0015\u0010\b\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0015\u0010\u001d\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0015\u0010\u001f\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0015\u0010\"\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0015\u0010\n\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u000e\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010$\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0018R\u0018\u00104\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0018\u0010/\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u0018\u00105\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0017\u0010\u001c\u001a\u0004\u0018\u0001068CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b7\u0010\u0015R\u0017\u00100\u001a\u0004\u0018\u0001088CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0015\u0010*\u001a\u0002098CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b.\u0010\u0015R\u0014\u0010!\u001a\u00020:8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b,\u0010;R.\u00102\u001a\u001c\u0012\u0004\u0012\u00020=\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00020<8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010?R\u0015\u0010&\u001a\u00020@8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b5\u0010\u0015R\u0015\u00107\u001a\u00020A8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0015\u0010-\u001a\u00020B8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b4\u0010\u0015"}, d2 = {"LCamera2CameraImplExternalSyntheticLambda3;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentClaimOldDaySecurityCheckLivenessBinding;", "<init>", "()V", "", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)V", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lid/vida/liveness/dto/VidaLivenessResponse;", "TuitionPaymentFragmentbindingInflater1", "(Lid/vida/liveness/dto/VidaLivenessResponse;)V", "LgenerateConfigDelta_colorMode;", "getInterfaceDescriptor", "Lkotlin/Lazy;", "b", "connect", "Ljava/lang/String;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "LIntegerRes;", "MediaBrowserCompat", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LCamera2CameraControlImplExternalSyntheticLambda4;", "d", "LgetExtendedConfig;", "read", "asInterface", "LgetStreamUseCaseSupportedCombinationList;", "INotificationSideChannelDefault", "LgetCameraState;", "getExtras", "LgetCameraState;", "a", "", "IconCompatParcelizer", "[B", "asBinder", "getRoot", "notify", "INotificationSideChannelStub", "write", "", "getItem", "Z", "RemoteActionCompatParcelizer", "INotificationSideChannelStubProxy", "Lcom/bpjstku/domain/user/model/User;", "disconnect", "Lcom/bpjstku/domain/jht/model/JhtClaimEligibility;", "LToolbarActionBarActionMenuPresenterCallback;", "", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;", "LoutputFormatToAudioProfile;", "LacquireBuffer;", "Lcom/bpjstku/data/lib/PreferenceManager;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraImplExternalSyntheticLambda3 extends AutoValue_CameraState_StateError<FragmentClaimOldDaySecurityCheckLivenessBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final Lazy getExtras;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private byte[] asBinder;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Lazy getRoot;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String INotificationSideChannelStubProxy;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String getInterfaceDescriptor;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String connect;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy disconnect;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy write;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String INotificationSideChannel;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final Lazy MediaBrowserCompat;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private getCameraState a;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private boolean onTransact;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private String notify;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: Camera2CameraImplExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: r8lambdavP8r3TQaFyA1LCzc6Ww_XfeoBlI
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((getExtendedConfig) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        }
    });

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.b.invoke(obj);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getCancel() {
        return R.layout.fragment_claim_old_day_security_check_liveness;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public Camera2CameraImplExternalSyntheticLambda3() {
        final Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityCheckLivenessFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = camera2CameraImplExternalSyntheticLambda3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityCheckLivenessFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = camera2CameraImplExternalSyntheticLambda3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda4 = this;
        this.d = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityCheckLivenessFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = camera2CameraImplExternalSyntheticLambda4;
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
        final Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda5 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityCheckLivenessFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = camera2CameraImplExternalSyntheticLambda5.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.asInterface = LazyKt.lazy(new Function0<getExtendedConfig>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityCheckLivenessFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getExtendedConfig] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getExtendedConfig invoke() {
                return getFocusY.b(camera2CameraImplExternalSyntheticLambda5, Reflection.getOrCreateKotlinClass(getExtendedConfig.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.g = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityCheckLivenessFragment$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getStreamUseCaseSupportedCombinationList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getStreamUseCaseSupportedCombinationList invoke() {
                ComponentCallbacks componentCallbacks = camera2CameraImplExternalSyntheticLambda3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.MediaBrowserCompat = LazyKt.lazy(new Function0() { // from class: onClosed
            private static final byte[] $$c = {83, -4, -55, -17};
            private static final int $$d = 27;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {41, 2, 45, -60, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 157;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {55207, 1240, 28994, 44516, 39529, 63135, 8962, 8184, 19493, 47449, 38344, 49762, 16099, 27416, 18322, 46200, 57477, 56793, 2632, 26338, 21347, 36750, 64530, 12997, 57783, 37942, 18611, 32530, 5090, 50798, 64219, 43329, 23603, 28854, 10011, 56205, 36476, 41675, 20828, 1476, 14525, 21015, 33128, 62706, 10324, 8153, 29487, 42674, 39496, 51605, 15593, 4216, 18386, 47955, 61096, 49698, 12744, 25862, 22635, 36792, 58215, 54982, 2614, 31162, 44303, 32917, 63463, 11106, 7887, 29273, 41384, 38175, 51336, 15376, 4969, 45562, 25216, 5917, 52139, 64559, 45491, 25225, 5896, 52143, 64627, 37061, 17746, 31205, 10856, 57155, 62352, 42016, 22711, 3400, 8593, 53864, 34553, 48014, 27657, 171, 13627, 59853, 39518, 20192, 25465, 5186, 51342, 64815, 23249, 45550, 25219, 5970, 52136, 64569, 37070, 17737, 31211, 10875, 57101, 62366, 42016, 22713};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1014762255967821076L;

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x0019  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r5, short r6, short r7, java.lang.Object[] r8) {
                /*
                    int r0 = r7 + 1
                    int r5 = r5 * 14
                    int r5 = 98 - r5
                    int r6 = r6 + 4
                    byte[] r1 = defpackage.onClosed.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L13
                    r4 = r6
                    r5 = r7
                    r3 = r2
                    goto L25
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r5
                    r0[r3] = r4
                    if (r3 != r7) goto L21
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L21:
                    r4 = r1[r6]
                    int r3 = r3 + 1
                L25:
                    int r6 = r6 + 1
                    int r4 = -r4
                    int r5 = r5 + r4
                    int r5 = r5 + (-11)
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onClosed.c(byte, short, short, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return userAsBinder;
                }
                throw null;
            }

            private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i4 = $10 + 107;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i >>> i5])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2187 - View.MeasureSpec.getSize(0), 40 - View.resolveSize(0, 0), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33017), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3012, ((byte) KeyEvent.getModifierMetaStateMask()) + 27, 321985076, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getScrollBarSize() >> 8)), AndroidCharacter.getMirror('0') + 3328, View.combineMeasuredStates(0, 0) + 17, -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
                        int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.blue(0), (ViewConfiguration.getTapTimeout() >> 16) + 2187, View.getDefaultSize(0, 0) + 40, 841711447, false, $$e(b8, b9, b9), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 3011 - TextUtils.getOffsetBefore("", 0), 26 - TextUtils.getOffsetBefore("", 0), 321985076, false, $$e(b10, b11, (byte) (b11 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36506 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0) + 3376, 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -968507904, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    }
                }
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i7 = $10 + 5;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 36505), 3376 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -968507904, false, $$e(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                }
                objArr[0] = new String(cArr);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v55 */
            /* JADX WARN: Type inference failed for: r3v50 */
            /* JADX WARN: Type inference failed for: r3v75, types: [int[]] */
            /* JADX WARN: Type inference failed for: r4v10 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r4v55, types: [int] */
            /* JADX WARN: Type inference failed for: r4v58 */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v9 */
            /* JADX WARN: Type inference failed for: r4v93 */
            /* JADX WARN: Type inference failed for: r4v94 */
            /* JADX WARN: Type inference failed for: r4v95 */
            /* JADX WARN: Type inference failed for: r4v96 */
            /* JADX WARN: Type inference failed for: r5v93 */
            /* JADX WARN: Type inference failed for: r8v45 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r29, int r30, int r31, int r32) {
                /*
                    Method dump skipped, instruction units count: 2452
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onClosed.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int, int):java.lang.Object[]");
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
            private static java.lang.String $$e(byte r7, short r8, short r9) {
                /*
                    byte[] r0 = defpackage.onClosed.$$c
                    int r9 = r9 * 3
                    int r9 = r9 + 109
                    int r8 = r8 * 4
                    int r8 = 1 - r8
                    int r7 = r7 * 2
                    int r7 = 3 - r7
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r9 = r7
                    r3 = r8
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r7 = r7 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r8) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L27:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L2c:
                    int r7 = r7 + r3
                    r3 = r4
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onClosed.$$e(byte, short, short):java.lang.String");
            }
        });
        this.write = LazyKt.lazy(new Function0() { // from class: Camera2CameraImpl2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentbindingInflater1.d.getValue()).INotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1();
            }
        });
        this.IconCompatParcelizer = LazyKt.lazy(new Function0<ToolbarActionBarActionMenuPresenterCallback>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityCheckLivenessFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ToolbarActionBarActionMenuPresenterCallback, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ToolbarActionBarActionMenuPresenterCallback invoke() {
                LifecycleOwner lifecycleOwner = camera2CameraImplExternalSyntheticLambda4;
                mapPoint mappoint = this.$qualifier;
                Function0 function1 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ToolbarActionBarActionMenuPresenterCallback.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function1, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.getExtras = LazyKt.lazy(new Function0() { // from class: Camera2CameraImpl1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            }
        });
        this.disconnect = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityCheckLivenessFragment$special$$inlined$inject$default$4
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = camera2CameraImplExternalSyntheticLambda3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.getRoot = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityCheckLivenessFragment$special$$inlined$inject$default$5
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = camera2CameraImplExternalSyntheticLambda3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: Camera2CameraImplExternalSyntheticLambda3$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCamera2CameraImplExternalSyntheticLambda3$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "LCamera2CameraImplExternalSyntheticLambda3;", "TuitionPaymentFragmentbindingInflater1", "()LCamera2CameraImplExternalSyntheticLambda3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static Camera2CameraImplExternalSyntheticLambda3 TuitionPaymentFragmentbindingInflater1() {
            return new Camera2CameraImplExternalSyntheticLambda3();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        getCameraState.Companion bVar = getCameraState.INSTANCE;
        String string = getString(R.string.action_information);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, string, p0, string2);
        this.a = getcamerastateB;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDaySecurityCheckLivenessBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ClaimOldDaySecurityCheckLivenessFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentClaimOldDaySecurityCheckLivenessBinding fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface = asInterface();
        MaterialButton materialButton = fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: Camera2CameraImplExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface);
            }
        });
        CardView cardView = fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface.cvLivenessCheck;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cardView, new Function0() { // from class: onOpened
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Camera2CameraImplExternalSyntheticLambda3.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0170  */
    /* JADX WARN: Code duplicated, block: B:34:0x017a  */
    /* JADX WARN: Code duplicated, block: B:35:0x017d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0180  */
    /* JADX WARN: Code duplicated, block: B:40:0x018b  */
    /* JADX WARN: Code duplicated, block: B:41:0x018e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0191  */
    /* JADX WARN: Code duplicated, block: B:46:0x019c  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a1  */
    /* JADX WARN: Type inference failed for: r13v18, types: [T, java.lang.String] */
    public static final Unit asInterface(final Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        User user;
        String str;
        IndividualDataClaim individualDataClaim;
        String str2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            camera2CameraImplExternalSyntheticLambda3.IconCompatParcelizer();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                camera2CameraImplExternalSyntheticLambda3.write();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                List listSplit$default = StringsKt.split$default((CharSequence) ((ClaimLivenessResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
                if (Intrinsics.areEqual(StringsKt.split$default((CharSequence) ((ClaimLivenessResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuspend(), new String[]{"#"}, false, 0, 6, (Object) null).get(0), "false") && Intrinsics.areEqual(listSplit$default.get(0), "true")) {
                    camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } else {
                    getCameraState.Companion bVar = getCameraState.INSTANCE;
                    String string = camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_information);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String string2 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.message_integrity_data);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    String string3 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_back);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, string, string2, string3);
                    camera2CameraImplExternalSyntheticLambda3.a = getcamerastateB;
                    FragmentManager childFragmentManager = camera2CameraImplExternalSyntheticLambda3.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                FragmentClaimOldDaySecurityCheckLivenessBinding fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface = camera2CameraImplExternalSyntheticLambda3.asInterface();
                camera2CameraImplExternalSyntheticLambda3.write();
                camera2CameraImplExternalSyntheticLambda3.asBinder = null;
                File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                    FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface.imgSelfiePhoto.setImageResource(0);
                fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface.imgLivenessCheck.setVisibility(0);
                fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface.tvLivenessCheckLabel.setVisibility(0);
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses Klaim tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                    getMaxImages getmaximages = getMaxImages.INSTANCE;
                    String strB = getMaxImages.b();
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "";
                    if (strB.length() > 0) {
                        try {
                            AntreanMenuConfig antreanMenuConfig = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                            if (antreanMenuConfig.getStatus()) {
                                try {
                                    objectRef.element = antreanMenuConfig.getLinkAntreanKlaim();
                                } catch (Exception unused) {
                                }
                                if (((CharSequence) objectRef.element).length() > 0) {
                                    OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
                                    String string4 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.label_title_failed_biometric);
                                    Intrinsics.checkNotNullExpressionValue(string4, "");
                                    String string5 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.label_message_failed_biometrik);
                                    Intrinsics.checkNotNullExpressionValue(string5, "");
                                    String string6 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_booking_antrean_online);
                                    Intrinsics.checkNotNullExpressionValue(string6, "");
                                    OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.img_failed_biometric, string4, string5, string6, (128 & 16) != 0 ? null : new Function0() { // from class: onCameraControlUpdateSessionConfig
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, objectRef);
                                        }
                                    }, (128 & 32) != 0 ? null : camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_return), (128 & 64) != 0 ? null : new Function0() { // from class: Camera2CameraImplControlUpdateListenerInternal
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Camera2CameraImplExternalSyntheticLambda3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                        }
                                    }, (128 & 128) != 0 ? false : false);
                                    FragmentManager childFragmentManager2 = camera2CameraImplExternalSyntheticLambda3.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                                    Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                                    if (childFragmentManager2.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                        outputConfigurationCompatApi33ImplB.show(childFragmentManager2, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                } else {
                                    user = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                                    if (user != null) {
                                        str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        str = "";
                                    }
                                    individualDataClaim = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                                    if (individualDataClaim != null) {
                                        str2 = individualDataClaim.asBinder;
                                    } else {
                                        str2 = null;
                                    }
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    IndividualDataClaim individualDataClaim2 = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                                    String str3 = individualDataClaim2 != null ? individualDataClaim2.g : null;
                                    ((getStreamUseCaseSupportedCombinationList) camera2CameraImplExternalSyntheticLambda3.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AntrianOnlineUrlRequest(str, str2, "KLAIM", str3 != null ? str3 : ""));
                                }
                            } else {
                                user = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                                if (user != null) {
                                    str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                individualDataClaim = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                                if (individualDataClaim != null) {
                                    str2 = individualDataClaim.asBinder;
                                } else {
                                    str2 = null;
                                }
                                if (str2 == null) {
                                    str2 = "";
                                }
                                IndividualDataClaim individualDataClaim3 = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                                if (individualDataClaim3 != null) {
                                }
                                ((getStreamUseCaseSupportedCombinationList) camera2CameraImplExternalSyntheticLambda3.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AntrianOnlineUrlRequest(str, str2, "KLAIM", str3 != null ? str3 : ""));
                            }
                        } catch (Exception unused2) {
                        }
                    } else {
                        user = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                        if (user != null) {
                            str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        individualDataClaim = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                        if (individualDataClaim != null) {
                            str2 = individualDataClaim.asBinder;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        IndividualDataClaim individualDataClaim4 = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                        if (individualDataClaim4 != null) {
                        }
                        ((getStreamUseCaseSupportedCombinationList) camera2CameraImplExternalSyntheticLambda3.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AntrianOnlineUrlRequest(str, str2, "KLAIM", str3 != null ? str3 : ""));
                    }
                } else {
                    camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    Toast.makeText(camera2CameraImplExternalSyntheticLambda3.getContext(), String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0150  */
    /* JADX WARN: Code duplicated, block: B:36:0x015a  */
    /* JADX WARN: Code duplicated, block: B:37:0x015d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0160  */
    /* JADX WARN: Code duplicated, block: B:42:0x016b  */
    /* JADX WARN: Code duplicated, block: B:43:0x016e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0171  */
    /* JADX WARN: Code duplicated, block: B:48:0x017c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0181  */
    /* JADX WARN: Type inference failed for: r14v17, types: [T, java.lang.String] */
    public static final Unit g(final Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        User user;
        String str;
        IndividualDataClaim individualDataClaim;
        String str2;
        String str3;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            camera2CameraImplExternalSyntheticLambda3.IconCompatParcelizer();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                camera2CameraImplExternalSyntheticLambda3.write();
                List listSplit$default = StringsKt.split$default((CharSequence) ((ClaimLivenessResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
                JhtClaimEligibility jhtClaimEligibility = (JhtClaimEligibility) camera2CameraImplExternalSyntheticLambda3.write.getValue();
                List listSplit$default2 = (jhtClaimEligibility == null || (str3 = jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) ? null : StringsKt.split$default((CharSequence) str3, new String[]{"#"}, false, 0, 6, (Object) null);
                if (!Intrinsics.areEqual(listSplit$default.get(2), listSplit$default2 != null ? (String) listSplit$default2.get(2) : null)) {
                    camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Permintaan ditolak");
                } else {
                    outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) camera2CameraImplExternalSyntheticLambda3.getExtras.getValue();
                    String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
                    final Function1 function1 = new Function1() { // from class: Camera2CameraImplCameraConfigureAvailable
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Boolean) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: onCameraControlCaptureRequests
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function1.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
                    ((acquireBuffer) camera2CameraImplExternalSyntheticLambda3.disconnect.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                camera2CameraImplExternalSyntheticLambda3.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses Klaim tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                    getMaxImages getmaximages = getMaxImages.INSTANCE;
                    String strB = getMaxImages.b();
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "";
                    if (strB.length() > 0) {
                        try {
                            AntreanMenuConfig antreanMenuConfig = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                            if (antreanMenuConfig.getStatus()) {
                                try {
                                    objectRef.element = antreanMenuConfig.getLinkAntreanKlaim();
                                } catch (Exception unused) {
                                }
                                if (((CharSequence) objectRef.element).length() > 0) {
                                    OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
                                    String string = camera2CameraImplExternalSyntheticLambda3.getString(R.string.label_title_failed_biometric);
                                    Intrinsics.checkNotNullExpressionValue(string, "");
                                    String string2 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.label_message_failed_biometrik);
                                    Intrinsics.checkNotNullExpressionValue(string2, "");
                                    String string3 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_booking_antrean_online);
                                    Intrinsics.checkNotNullExpressionValue(string3, "");
                                    OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.img_failed_biometric, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: isCameraAvailable
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, objectRef);
                                        }
                                    }, (128 & 32) != 0 ? null : camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_return), (128 & 64) != 0 ? null : new Function0() { // from class: onConfigureAvailable
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Camera2CameraImplExternalSyntheticLambda3.d(this.b);
                                        }
                                    }, (128 & 128) != 0 ? false : false);
                                    FragmentManager childFragmentManager = camera2CameraImplExternalSyntheticLambda3.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                                    if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                        outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                } else {
                                    user = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                                    if (user != null) {
                                        str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        str = "";
                                    }
                                    individualDataClaim = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                                    if (individualDataClaim != null) {
                                        str2 = individualDataClaim.asBinder;
                                    } else {
                                        str2 = null;
                                    }
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    IndividualDataClaim individualDataClaim2 = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                                    String str4 = individualDataClaim2 != null ? individualDataClaim2.g : null;
                                    ((getStreamUseCaseSupportedCombinationList) camera2CameraImplExternalSyntheticLambda3.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AntrianOnlineUrlRequest(str, str2, "KLAIM", str4 != null ? str4 : ""));
                                }
                            } else {
                                user = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                                if (user != null) {
                                    str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                individualDataClaim = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                                if (individualDataClaim != null) {
                                    str2 = individualDataClaim.asBinder;
                                } else {
                                    str2 = null;
                                }
                                if (str2 == null) {
                                    str2 = "";
                                }
                                IndividualDataClaim individualDataClaim3 = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                                if (individualDataClaim3 != null) {
                                }
                                ((getStreamUseCaseSupportedCombinationList) camera2CameraImplExternalSyntheticLambda3.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AntrianOnlineUrlRequest(str, str2, "KLAIM", str4 != null ? str4 : ""));
                            }
                        } catch (Exception unused2) {
                        }
                    } else {
                        user = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                        if (user != null) {
                            str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        individualDataClaim = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                        if (individualDataClaim != null) {
                            str2 = individualDataClaim.asBinder;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        IndividualDataClaim individualDataClaim4 = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                        if (individualDataClaim4 != null) {
                        }
                        ((getStreamUseCaseSupportedCombinationList) camera2CameraImplExternalSyntheticLambda3.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AntrianOnlineUrlRequest(str, str2, "KLAIM", str4 != null ? str4 : ""));
                    }
                } else {
                    camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void TuitionPaymentFragmentbindingInflater1(VidaLivenessResponse p0) {
        byte[] imageBytes = p0.getImageBytes();
        Bitmap bitmapDecodeByteArray = imageBytes != null ? BitmapFactory.decodeByteArray(p0.getImageBytes(), 0, imageBytes.length) : null;
        FragmentClaimOldDaySecurityCheckLivenessBinding fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface = asInterface();
        fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface.imgLivenessCheck.setVisibility(8);
        fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface.tvLivenessCheckLabel.setVisibility(8);
        fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface.imgSelfiePhoto.setVisibility(0);
        fragmentClaimOldDaySecurityCheckLivenessBindingAsInterface.imgSelfiePhoto.setImageBitmap(bitmapDecodeByteArray);
        this.notify = p0.getTransactionId();
        this.cancelAll = String.valueOf(p0.getLivenessScore());
        this.cancel = String.valueOf(p0.getManipulationScore());
        this.asBinder = p0.getImageBytes();
    }

    public static /* synthetic */ generateConfigDelta_colorMode TuitionPaymentFragmentbindingInflater1(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3) {
        generateConfigDelta_colorMode.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = generateConfigDelta_colorMode.INSTANCE;
        String string = camera2CameraImplExternalSyntheticLambda3.getString(R.string.label_process_verification_ekyc);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.info_sending_data);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return generateConfigDelta_colorMode.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string, string2);
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3) {
        return new outputFormatToAudioProfile(camera2CameraImplExternalSyntheticLambda3.requireActivity());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, Ref.ObjectRef objectRef) {
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        Context contextRequireContext = camera2CameraImplExternalSyntheticLambda3.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (String) objectRef.element, "Appointment Online", 0, null, false, 56);
        BaseActivity baseActivity = camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3) {
        ((IntegerRes) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            camera2CameraImplExternalSyntheticLambda3.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            camera2CameraImplExternalSyntheticLambda3.write();
            final String urlAntrianOnline = ((AntrianOnlineUrlResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getUrlAntrianOnline();
            String str = urlAntrianOnline;
            if (str != null && str.length() != 0) {
                OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
                String string = camera2CameraImplExternalSyntheticLambda3.getString(R.string.label_title_failed_biometric);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.label_message_failed_biometrik);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_queueing);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.img_failed_biometric, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: onSurfaceReset
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, urlAntrianOnline);
                    }
                }, (128 & 32) != 0 ? null : camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_return), (128 & 64) != 0 ? null : new Function0() { // from class: Camera2CameraImplExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Camera2CameraImplExternalSyntheticLambda3.onTransact(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                }, (128 & 128) != 0 ? false : false);
                FragmentManager childFragmentManager = camera2CameraImplExternalSyntheticLambda3.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Link antrean klaim belum tersedia");
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            camera2CameraImplExternalSyntheticLambda3.write();
            camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, TwilightManager twilightManager) {
        if (twilightManager instanceof TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(((TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) twilightManager).TuitionPaymentFragmentbindingInflater1);
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_second", "submit_claim_jht_step_second_check_liveness"));
            Intrinsics.checkNotNullParameter("submit_claim_jht_step_second_check_liveness", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_claim_jht_step_second_check_liveness", mapMutableMapOf);
            camera2CameraImplExternalSyntheticLambda3.onTransact = true;
            ((IntegerRes) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } else {
            if (!(twilightManager instanceof TwilightManager.TuitionPaymentFragmentbindingInflater1)) {
                throw new NoWhenBranchMatchedException();
            }
            TwilightManager.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager;
            if (tuitionPaymentFragmentbindingInflater1.b.getImageBytes() != null) {
                camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1.b);
                camera2CameraImplExternalSyntheticLambda3.onTransact = true;
                ((IntegerRes) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                MaterialButton materialButton = camera2CameraImplExternalSyntheticLambda3.asInterface().btnNext;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                MaterialButton materialButton2 = materialButton;
                Intrinsics.checkNotNullParameter(materialButton2, "");
                materialButton2.setEnabled(false);
            } else if (!camera2CameraImplExternalSyntheticLambda3.asInterface().btnNext.isEnabled()) {
                camera2CameraImplExternalSyntheticLambda3.asBinder = null;
                File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                    FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                camera2CameraImplExternalSyntheticLambda3.asInterface().imgSelfiePhoto.setImageResource(0);
                camera2CameraImplExternalSyntheticLambda3.asInterface().imgLivenessCheck.setVisibility(0);
                camera2CameraImplExternalSyntheticLambda3.asInterface().tvLivenessCheckLabel.setVisibility(0);
                int i = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(": ");
                sb.append(str);
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), sb.toString(), 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_time_server_biometric_claim", "loading_time_server_biometric_claim"));
            Intrinsics.checkNotNullParameter("loading_time_server_biometric_claim", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_time_server_biometric_claim", mapMutableMapOf);
            camera2CameraImplExternalSyntheticLambda3.IconCompatParcelizer();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_time_server_claim", "success_time_server_biometric_claim"));
                Intrinsics.checkNotNullParameter("success_time_server_claim", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_time_server_claim", mapMutableMapOf2);
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((BaseItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
                if (camera2CameraImplExternalSyntheticLambda3.onTransact) {
                    camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((BaseItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
                    IntegerRes integerRes = (IntegerRes) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    User user = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                    String str = user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("#claim");
                    integerRes.b(new KeyRequest(sb.toString()));
                } else {
                    final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) camera2CameraImplExternalSyntheticLambda3.d.getValue();
                    User user2 = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                    String strValueOf = String.valueOf(user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                    JhtClaimEligibility jhtClaimEligibility = (JhtClaimEligibility) camera2CameraImplExternalSyntheticLambda3.write.getValue();
                    ClaimLivenessFaceMatchCheckRequest claimLivenessFaceMatchCheckRequest = new ClaimLivenessFaceMatchCheckRequest(strValueOf, String.valueOf(jhtClaimEligibility != null ? jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null));
                    Intrinsics.checkNotNullParameter(claimLivenessFaceMatchCheckRequest, "");
                    MutableLiveData<VirtualCameraAdapter1<ClaimLivenessResponse>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannel;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimLivenessFaceMatchCheckRequest)));
                    final Function1 function1 = new Function1() { // from class: newCaptureSession
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.b(camera2CameraControlImplExternalSyntheticLambda4, (ClaimLivenessResponse) obj);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: lambdaconfigAndClose3
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function1.invoke(obj);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: isSurfaceCombinationWithMeteringRepeatingSupported
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.b(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: lambdaconfigAndClose2
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function2.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_time_server_claim", "failure_time_server_biometric_claim"));
                Intrinsics.checkNotNullParameter("failure_time_server_claim", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_time_server_claim", mapMutableMapOf3);
                camera2CameraImplExternalSyntheticLambda3.write();
                Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda4 = camera2CameraImplExternalSyntheticLambda3;
                String strValueOf2 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(camera2CameraImplExternalSyntheticLambda4, "");
                Intrinsics.checkNotNullParameter(strValueOf2, "");
                BaseActivity baseActivity = (BaseActivity) camera2CameraImplExternalSyntheticLambda4.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf2, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3) {
        BaseActivity baseActivity = camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, Boolean bool) {
        if (!bool.booleanValue()) {
            Context contextRequireContext = camera2CameraImplExternalSyntheticLambda3.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = camera2CameraImplExternalSyntheticLambda3.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(contextRequireContext, string);
        } else {
            ToolbarActionBarActionMenuPresenterCallback toolbarActionBarActionMenuPresenterCallback = (ToolbarActionBarActionMenuPresenterCallback) camera2CameraImplExternalSyntheticLambda3.IconCompatParcelizer.getValue();
            FragmentActivity fragmentActivityRequireActivity = camera2CameraImplExternalSyntheticLambda3.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            toolbarActionBarActionMenuPresenterCallback.TuitionPaymentFragmentbindingInflater1(fragmentActivityRequireActivity);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3) {
        BaseActivity baseActivity = camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3) {
        BaseActivity baseActivity = camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        IndividualDataClaim individualDataClaim = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
        DefaultConstructorMarker defaultConstructorMarker = null;
        IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = individualDataClaim != null ? IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.asBinder, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1048577, -1, 127, null) : null;
        MaterialButton materialButton = asInterface().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion bVar = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, false, 2, defaultConstructorMarker);
        Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3 = this;
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).MediaBrowserCompat.observe(camera2CameraImplExternalSyntheticLambda3, new b(new Function1() { // from class: Camera2CameraImpl2ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraImplExternalSyntheticLambda3.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.observe(camera2CameraImplExternalSyntheticLambda3, new b(new Function1() { // from class: Camera2CameraImpl4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.d.getValue()).cancelAll.observe(camera2CameraImplExternalSyntheticLambda3, new b(new Function1() { // from class: Camera2CameraImpl3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraImplExternalSyntheticLambda3.asInterface(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.d.getValue()).INotificationSideChannel.observe(camera2CameraImplExternalSyntheticLambda3, new b(new Function1() { // from class: Camera2CameraImplCameraAvailability
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraImplExternalSyntheticLambda3.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.d.getValue()).d.observe(camera2CameraImplExternalSyntheticLambda3, new b(new onCameraAvailable(this)));
        ((ToolbarActionBarActionMenuPresenterCallback) this.IconCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(camera2CameraImplExternalSyntheticLambda3, new b(new Function1() { // from class: onOpenAvailable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (TwilightManager) obj);
            }
        }));
        ((getStreamUseCaseSupportedCombinationList) this.g.getValue()).b.observe(camera2CameraImplExternalSyntheticLambda3, new b(new Function1() { // from class: Camera2CameraImplExternalSyntheticLambda8
            private static final byte[] $$c = {21, 65, -9, -121};
            private static final int $$f = 88;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {94, -56, 58, -24, 2, -21, 2, -11, -6, -11, -24, 4, -5, -28, 6, 9, -43, -6, 3, -4, -11, -11, 10, -28, -21, -13, 7, -23, -10, 59, -58, -22, 1, -23, -6, -3, -4, -29, 12, -7, -21, -1, -22, 8, -11, -21, -12, 4, -20, -11, -6, 3, -11, -23, -9, 1, -14, -2, 11, -43, -6, 3, -4, -11, -11, 23, -40, -12, -7, 56, -22, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56};
            private static final int $$e = 169;
            private static final byte[] $$a = {29, 88, -118, 32, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 117;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int d = 1;
            private static long b = -6377398940819159759L;
            private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 11364;

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    int r0 = r8 + 1
                    int r6 = r6 * 14
                    int r6 = r6 + 84
                    int r7 = r7 * 52
                    int r7 = r7 + 4
                    byte[] r1 = defpackage.Camera2CameraImplExternalSyntheticLambda8.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L14
                    r3 = r7
                    r4 = r2
                    goto L2a
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L22:
                    r4 = r1[r7]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2a:
                    int r6 = r6 + r7
                    int r6 = r6 + (-10)
                    int r7 = r3 + 1
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2CameraImplExternalSyntheticLambda8.a(int, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(byte r7, short r8, short r9, java.lang.Object[] r10) {
                /*
                    int r9 = r9 * 30
                    int r9 = 68 - r9
                    int r8 = r8 * 67
                    int r8 = 71 - r8
                    int r7 = r7 * 24
                    int r7 = r7 + 84
                    byte[] r0 = defpackage.Camera2CameraImplExternalSyntheticLambda8.$$d
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r8
                    r7 = r9
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r9) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r8]
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L2c:
                    int r8 = -r8
                    int r7 = r7 + r8
                    int r8 = r3 + 1
                    int r7 = r7 + (-9)
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2CameraImplExternalSyntheticLambda8.e(byte, short, short, java.lang.Object[]):void");
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
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                int i5 = $10 + 91;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i7 = $11 + 49;
                    $10 = i7 % 128;
                    int i8 = i7 % i3;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 8328), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1234, Color.alpha(0) + 35, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2764 - KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionGroup(0L) + 14, 1504416861, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - ((Process.getThreadPriority(0) + 20) >> 6)), 253 - TextUtils.indexOf("", "", 0), 22 - TextUtils.indexOf("", ""), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 65200);
                            int iGreen = 2891 - Color.green(0);
                            int iAlpha = Color.alpha(0) + 17;
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            String str$$g = $$g(b6, b7, (byte) (b7 + 1));
                            i2 = 2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iGreen, iAlpha, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                        } else {
                            i2 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        i3 = i2;
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
                int i2 = d + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char longPressTimeout = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
                    int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27;
                    byte[] bArr = $$a;
                    byte b2 = bArr[37];
                    byte b3 = bArr[80];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, threadPriority, i4, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{51528, 44888, 57821, 46072}, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), KeyEvent.keyCodeFromString(""), new char[]{48473, 56072, 37159, 19797, 29418, 39130, 42493, 12902, 25907, 23918, 13268, 47992, 47225, 21966, 20405, 55927, 35606, 56266, 6859, 32267, 43739, 60572}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{40084, 28538, 15058, 46070}, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63034), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 764446051, new char[]{28882, 25234, 31919, 49007, 37507, 13844, 49002, 52022, 60604, 57886, 31711, 12712, 363, 61998, 36827}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cRed = (char) (31533 - Color.red(0));
                    int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 28;
                    byte b4 = $$a[80];
                    byte b5 = b4;
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, (byte) (b5 | 52), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, iResolveSizeAndState, offsetAfter, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i5 = d + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                    int i6 = i5 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (31534 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 921;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[80];
                        byte b7 = bArr2[37];
                        Object[] objArr6 = new Object[1];
                        a(b6, b7, (byte) (b7 | 36), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, fadingEdgeLength, maximumDrawingCacheSize, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iNextInt = new Random().nextInt(1553506381);
                    int i7 = ~((-413701) | iNextInt);
                    int i8 = ~iNextInt;
                    int i9 = 730401652 + ((i7 | (~((-1074866691) | i8))) * 497) + (((~(iNextInt | (-1074866691))) | (~((-698799254) | i8)) | 698385553) * 497) + 971925352;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                    int i12 = d + 89;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{9195, 29255, 64902, 8787}, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 21501), ViewConfiguration.getTapTimeout() >> 16, new char[]{64157, 53610, 39786, 8936, 5099, 17437, 6750, 53486, 17032, 33294, 56025, 28150, 51918, 41302, 15618, 16912, 27309, 42437, 9183, 53493, 55873, 10324, 24523, 21853, 8154, 54150}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{35250, 63049, 14884, 27485}, (char) (23866 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), View.resolveSizeAndState(0, 0, 0), new char[]{20156, 49004, 34109, 7358, 25696, 17843, 50376, 52208, 14090, 3320, 65492, 35222, 13877, 43297, 43208, 17678, 9476, 55791}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{41957, 39077, 7786, 62322}, (char) (29215 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0), new char[]{19697, 56496, 11891, 30087, 65385, 57745, 42192, 13881, 51351, 53796, 52290, 3160, 23885, 13604, 38585, 50838}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{59149, 867, 45330, 58699}, (char) (View.getDefaultSize(0, 0) + 19377), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{12472, 58341, 45072, 64438, 18808, 55763, 1574, 33286, 31732, 45361, 30364, 42518, 22937, 36755, 13339, 49900}, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 971925352};
                        byte[] bArr3 = $$d;
                        byte b8 = bArr3[32];
                        byte b9 = b8;
                        Object[] objArr13 = new Object[1];
                        e(b8, b9, (byte) (b9 - 1), objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b10 = bArr3[32];
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr14 = new Object[1];
                        e(b11, b11, b10, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
                            int iMyPid = (Process.myPid() >> 22) + 921;
                            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                            byte[] bArr4 = $$a;
                            byte b12 = bArr4[80];
                            byte b13 = bArr4[37];
                            Object[] objArr15 = new Object[1];
                            a(b12, b13, (byte) (b13 | 36), objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, iMyPid, threadPriority2, -1142834547, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{51528, 44888, 57821, 46072}, (char) (ViewConfiguration.getScrollBarSize() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{48473, 56072, 37159, 19797, 29418, 39130, 42493, 12902, 25907, 23918, 13268, 47992, 47225, 21966, 20405, 55927, 35606, 56266, 6859, 32267, 43739, 60572}, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{40084, 28538, 15058, 46070}, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 63034), (-764446052) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{28882, 25234, 31919, 49007, 37507, 13844, 49002, 52022, 60604, 57886, 31711, 12712, 363, 61998, 36827}, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                                int iResolveOpacity = 28 - Drawable.resolveOpacity(0, 0);
                                byte b14 = $$a[80];
                                byte b15 = b14;
                                Object[] objArr18 = new Object[1];
                                a(b14, b15, (byte) (b15 | 52), objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, scrollBarFadeDuration, iResolveOpacity, -778300370, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cRed2 = (char) (Color.red(0) + 31533);
                                int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
                                byte[] bArr5 = $$a;
                                byte b16 = bArr5[37];
                                byte b17 = bArr5[80];
                                Object[] objArr19 = new Object[1];
                                a(b16, b17, b17, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed2, iIndexOf, iLastIndexOf, -1048449946, false, (String) objArr19[0], null);
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
                if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr == null) {
                        throw null;
                    }
                    int i14 = d + 21;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    int i15 = i14 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                    throw null;
                }
                int i16 = d + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                int i17 = i16 % 2;
                int i18 = ((int[]) objArr[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i19 = i18 + 1358037827 + (((~((-1731114804) | iIdentityHashCode)) | (-42964841)) * (-964)) + (((~((~iIdentityHashCode) | (-1731114804))) | 1696604179) * (-964));
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr20[0])[0] = i21 ^ (i21 << 5);
                int i22 = d + 9;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                int i23 = i22 % 2;
                return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
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
            private static java.lang.String $$g(int r6, short r7, byte r8) {
                /*
                    int r6 = r6 + 4
                    byte[] r0 = defpackage.Camera2CameraImplExternalSyntheticLambda8.$$c
                    int r8 = r8 + 102
                    int r7 = r7 * 3
                    int r1 = 1 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L15
                    r8 = r6
                    r3 = r7
                    r4 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    int r6 = r6 + 1
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r6 = r6 + r3
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2CameraImplExternalSyntheticLambda8.$$g(int, short, byte):java.lang.String");
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, FragmentClaimOldDaySecurityCheckLivenessBinding fragmentClaimOldDaySecurityCheckLivenessBinding) {
        if (camera2CameraImplExternalSyntheticLambda3.asBinder != null) {
            if (fragmentClaimOldDaySecurityCheckLivenessBinding.btnNext.isEnabled()) {
                IndividualDataClaim individualDataClaim = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1.getValue();
                DefaultConstructorMarker defaultConstructorMarker = null;
                IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = individualDataClaim != null ? IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, camera2CameraImplExternalSyntheticLambda3.asBinder, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1048577, -1, 127, null) : null;
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion bVar = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, false, 2, defaultConstructorMarker);
                Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
            }
        } else {
            String string = camera2CameraImplExternalSyntheticLambda3.getString(R.string.error_message_selfie_photo_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState.Companion bVar2 = getCameraState.INSTANCE;
            String string2 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, string2, string, string3);
            FragmentManager childFragmentManager = camera2CameraImplExternalSyntheticLambda3.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0142  */
    /* JADX WARN: Code duplicated, block: B:52:0x014e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
    /* JADX WARN: Code duplicated, block: B:56:0x015d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:63:0x016b  */
    /* JADX WARN: Code duplicated, block: B:64:0x016e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:68:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0180  */
    /* JADX WARN: Code duplicated, block: B:75:0x0186  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f8  */
    public static /* synthetic */ Unit asBinder(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String checkSum;
        List listSplit$default;
        User user;
        String str2;
        String string;
        BaseActivity baseActivity;
        User user2;
        String str3;
        String str4;
        byte[] bArr;
        String str5;
        JhtClaimEligibility jhtClaimEligibility;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            camera2CameraImplExternalSyntheticLambda3.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            camera2CameraImplExternalSyntheticLambda3.write();
            String strJoinToString$default = camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelStub;
            if (strJoinToString$default == null) {
                strJoinToString$default = "";
            }
            String str17 = camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelStubProxy;
            if (str17 == null) {
                str17 = "";
            }
            String str18 = strJoinToString$default;
            if (!StringsKt.isBlank(str18) && !StringsKt.isBlank(str17) && !StringsKt.equals(str17, "Indonesia", true)) {
                List listListOf = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default, str17});
                ArrayList arrayList = new ArrayList();
                for (Object obj : listListOf) {
                    if (!StringsKt.isBlank((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
            } else {
                if (StringsKt.isBlank(str18)) {
                    str = !StringsKt.isBlank(str17) ? str17 : "";
                }
                checkSum = ((KeyResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum();
                camera2CameraImplExternalSyntheticLambda3.INotificationSideChannel = checkSum;
                if (checkSum == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    checkSum = null;
                }
                listSplit$default = StringsKt.split$default((CharSequence) checkSum, new String[]{"#"}, false, 0, 6, (Object) null);
                user = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                if (user != null) {
                    str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual(String.valueOf(str2), listSplit$default.get(0))) {
                    final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) camera2CameraImplExternalSyntheticLambda3.d.getValue();
                    user2 = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                    if (user2 != null) {
                        str3 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        str3 = null;
                    }
                    String strValueOf = String.valueOf(str3);
                    str4 = camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str4 = null;
                    }
                    Object obj2 = listSplit$default.get(2);
                    StringBuilder sb = new StringBuilder("JMO#");
                    sb.append(str4);
                    sb.append("#true#70#");
                    sb.append(obj2);
                    String string2 = sb.toString();
                    String str19 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str19, "");
                    Context contextRequireContext = camera2CameraImplExternalSyntheticLambda3.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String string3 = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string3, "");
                    String str20 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str20, "");
                    String strValueOf2 = String.valueOf(Build.VERSION.SDK_INT);
                    String str21 = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(str21, "");
                    bArr = camera2CameraImplExternalSyntheticLambda3.asBinder;
                    if (bArr != null) {
                        Intrinsics.checkNotNullParameter(bArr, "");
                        String strEncodeToString = Base64.encodeToString(bArr, 2);
                        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                        str5 = strEncodeToString;
                    } else {
                        str5 = null;
                    }
                    jhtClaimEligibility = (JhtClaimEligibility) camera2CameraImplExternalSyntheticLambda3.write.getValue();
                    if (jhtClaimEligibility != null) {
                        str6 = jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    } else {
                        str6 = null;
                    }
                    str7 = camera2CameraImplExternalSyntheticLambda3.notify;
                    if (str7 == null) {
                        str8 = "";
                    } else {
                        str8 = str7;
                    }
                    str9 = camera2CameraImplExternalSyntheticLambda3.cancelAll;
                    if (str9 == null) {
                        str10 = "";
                    } else {
                        str10 = str9;
                    }
                    str11 = camera2CameraImplExternalSyntheticLambda3.cancel;
                    if (str11 == null) {
                        str12 = "";
                    } else {
                        str12 = str11;
                    }
                    str13 = camera2CameraImplExternalSyntheticLambda3.RemoteActionCompatParcelizer;
                    if (str13 == null) {
                        str14 = "";
                    } else {
                        str14 = str13;
                    }
                    str15 = camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelDefault;
                    if (str15 == null) {
                        str16 = "";
                    } else {
                        str16 = str15;
                    }
                    ClaimLivenessFaceMatchRequest claimLivenessFaceMatchRequest = new ClaimLivenessFaceMatchRequest(strValueOf, string2, str19, string3, str20, strValueOf2, str21, str5, str6, str8, str10, str12, str14, str16, str);
                    Intrinsics.checkNotNullParameter(claimLivenessFaceMatchRequest, "");
                    MutableLiveData<VirtualCameraAdapter1<ClaimLivenessResponse>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.cancelAll;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(claimLivenessFaceMatchRequest)));
                    final Function1 function1 = new Function1() { // from class: getCameraAvailability
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4, (ClaimLivenessResponse) obj3);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: isSessionCloseComplete
                        @Override // defpackage.logToString
                        public final void accept(Object obj3) {
                            function1.invoke(obj3);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: Camera2CameraControlImplExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.cancelAll(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj3);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onCaptureCancelled
                        @Override // defpackage.logToString
                        public final void accept(Object obj3) {
                            function2.invoke(obj3);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda4 = camera2CameraImplExternalSyntheticLambda3;
                    string = camera2CameraImplExternalSyntheticLambda3.getString(R.string.message_integrity_data);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Intrinsics.checkNotNullParameter(camera2CameraImplExternalSyntheticLambda4, "");
                    Intrinsics.checkNotNullParameter(string, "");
                    baseActivity = (BaseActivity) camera2CameraImplExternalSyntheticLambda4.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string, null);
                    }
                }
            }
            str = strJoinToString$default;
            checkSum = ((KeyResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum();
            camera2CameraImplExternalSyntheticLambda3.INotificationSideChannel = checkSum;
            if (checkSum == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                checkSum = null;
            }
            listSplit$default = StringsKt.split$default((CharSequence) checkSum, new String[]{"#"}, false, 0, 6, (Object) null);
            user = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
            if (user != null) {
                str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(String.valueOf(str2), listSplit$default.get(0))) {
                final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda5 = (Camera2CameraControlImplExternalSyntheticLambda4) camera2CameraImplExternalSyntheticLambda3.d.getValue();
                user2 = (User) camera2CameraImplExternalSyntheticLambda3.MediaBrowserCompat.getValue();
                if (user2 != null) {
                    str3 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    str3 = null;
                }
                String strValueOf3 = String.valueOf(str3);
                str4 = camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str4 = null;
                }
                Object obj3 = listSplit$default.get(2);
                StringBuilder sb2 = new StringBuilder("JMO#");
                sb2.append(str4);
                sb2.append("#true#70#");
                sb2.append(obj3);
                String string4 = sb2.toString();
                String str110 = Build.BRAND;
                Intrinsics.checkNotNullExpressionValue(str110, "");
                Context contextRequireContext2 = camera2CameraImplExternalSyntheticLambda3.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                String string5 = Settings.Secure.getString(contextRequireContext2.getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string5, "");
                String str22 = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(str22, "");
                String strValueOf4 = String.valueOf(Build.VERSION.SDK_INT);
                String str23 = Build.MANUFACTURER;
                Intrinsics.checkNotNullExpressionValue(str23, "");
                bArr = camera2CameraImplExternalSyntheticLambda3.asBinder;
                if (bArr != null) {
                    Intrinsics.checkNotNullParameter(bArr, "");
                    String strEncodeToString2 = Base64.encodeToString(bArr, 2);
                    Intrinsics.checkNotNullExpressionValue(strEncodeToString2, "");
                    str5 = strEncodeToString2;
                } else {
                    str5 = null;
                }
                jhtClaimEligibility = (JhtClaimEligibility) camera2CameraImplExternalSyntheticLambda3.write.getValue();
                if (jhtClaimEligibility != null) {
                    str6 = jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    str6 = null;
                }
                str7 = camera2CameraImplExternalSyntheticLambda3.notify;
                if (str7 == null) {
                    str8 = "";
                } else {
                    str8 = str7;
                }
                str9 = camera2CameraImplExternalSyntheticLambda3.cancelAll;
                if (str9 == null) {
                    str10 = "";
                } else {
                    str10 = str9;
                }
                str11 = camera2CameraImplExternalSyntheticLambda3.cancel;
                if (str11 == null) {
                    str12 = "";
                } else {
                    str12 = str11;
                }
                str13 = camera2CameraImplExternalSyntheticLambda3.RemoteActionCompatParcelizer;
                if (str13 == null) {
                    str14 = "";
                } else {
                    str14 = str13;
                }
                str15 = camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelDefault;
                if (str15 == null) {
                    str16 = "";
                } else {
                    str16 = str15;
                }
                ClaimLivenessFaceMatchRequest claimLivenessFaceMatchRequest2 = new ClaimLivenessFaceMatchRequest(strValueOf3, string4, str110, string5, str22, strValueOf4, str23, str5, str6, str8, str10, str12, str14, str16, str);
                Intrinsics.checkNotNullParameter(claimLivenessFaceMatchRequest2, "");
                MutableLiveData<VirtualCameraAdapter1<ClaimLivenessResponse>> mutableLiveData2 = camera2CameraControlImplExternalSyntheticLambda5.cancelAll;
                VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda5.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(claimLivenessFaceMatchRequest2)));
                final Function1 function3 = new Function1() { // from class: getCameraAvailability
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda5, (ClaimLivenessResponse) obj4);
                    }
                };
                logToString logtostring2 = new logToString() { // from class: isSessionCloseComplete
                    @Override // defpackage.logToString
                    public final void accept(Object obj4) {
                        function3.invoke(obj4);
                    }
                };
                final Function1 function4 = new Function1() { // from class: Camera2CameraControlImplExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return Camera2CameraControlImplExternalSyntheticLambda4.cancelAll(camera2CameraControlImplExternalSyntheticLambda5, (Throwable) obj4);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: onCaptureCancelled
                    @Override // defpackage.logToString
                    public final void accept(Object obj4) {
                        function4.invoke(obj4);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                camera2CameraControlImplExternalSyntheticLambda5.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            } else {
                Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda5 = camera2CameraImplExternalSyntheticLambda3;
                string = camera2CameraImplExternalSyntheticLambda3.getString(R.string.message_integrity_data);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Intrinsics.checkNotNullParameter(camera2CameraImplExternalSyntheticLambda5, "");
                Intrinsics.checkNotNullParameter(string, "");
                baseActivity = (BaseActivity) camera2CameraImplExternalSyntheticLambda5.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string, null);
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            camera2CameraImplExternalSyntheticLambda3.write();
            Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda6 = camera2CameraImplExternalSyntheticLambda3;
            String strValueOf5 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(camera2CameraImplExternalSyntheticLambda6, "");
            Intrinsics.checkNotNullParameter(strValueOf5, "");
            BaseActivity baseActivity2 = (BaseActivity) camera2CameraImplExternalSyntheticLambda6.getContext();
            if (baseActivity2 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf5, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(final Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3) {
        camera2CameraImplExternalSyntheticLambda3.asBinder = null;
        camera2CameraImplExternalSyntheticLambda3.onTransact = false;
        Camera2CameraControlImplExternalSyntheticLambda5.Companion bVar = Camera2CameraControlImplExternalSyntheticLambda5.INSTANCE;
        String string = camera2CameraImplExternalSyntheticLambda3.getString(R.string.title_term_and_condition);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.term_and_condition_biometric_dukcapil);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_next);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = camera2CameraImplExternalSyntheticLambda3.getString(R.string.action_cancel_id);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        Camera2CameraControlImplExternalSyntheticLambda5 camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlImplExternalSyntheticLambda5.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(R.drawable.ic_info_blue, string, string2, string3, new Function0() { // from class: Camera2CameraImplExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }, string4, new Function0() { // from class: Camera2CameraImplExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.setCancelable(false);
        FragmentManager childFragmentManager = camera2CameraImplExternalSyntheticLambda3.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.show(childFragmentManager, camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            ((generateConfigDelta_colorMode) camera2CameraImplExternalSyntheticLambda3.b.getValue()).setCancelable(false);
            generateConfigDelta_colorMode generateconfigdelta_colormode = (generateConfigDelta_colorMode) camera2CameraImplExternalSyntheticLambda3.b.getValue();
            FragmentManager childFragmentManager = camera2CameraImplExternalSyntheticLambda3.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(generateconfigdelta_colormode.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                generateconfigdelta_colormode.show(childFragmentManager, generateconfigdelta_colormode.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            str = "loading_claim_jht_step_second_ekyc_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ((generateConfigDelta_colorMode) camera2CameraImplExternalSyntheticLambda3.b.getValue()).dismiss();
            camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            str = "success_claim_jht_step_second_ekyc_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ((generateConfigDelta_colorMode) camera2CameraImplExternalSyntheticLambda3.b.getValue()).dismiss();
            camera2CameraImplExternalSyntheticLambda3.asBinder = null;
            File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            camera2CameraImplExternalSyntheticLambda3.asInterface().imgSelfiePhoto.setImageResource(0);
            camera2CameraImplExternalSyntheticLambda3.asInterface().imgLivenessCheck.setVisibility(0);
            camera2CameraImplExternalSyntheticLambda3.asInterface().tvLivenessCheckLabel.setVisibility(0);
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            Toast.makeText(camera2CameraImplExternalSyntheticLambda3.getContext(), String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            str = "failure_claim_jht_step_second_ekyc_result";
        } else {
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_second", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, Ref.ObjectRef objectRef) {
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        Context contextRequireContext = camera2CameraImplExternalSyntheticLambda3.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (String) objectRef.element, "Appointment Online", 0, null, false, 56);
        BaseActivity baseActivity = camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelDefault = String.valueOf(userLocationComplete.b);
        camera2CameraImplExternalSyntheticLambda3.RemoteActionCompatParcelizer = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelStub = str;
        camera2CameraImplExternalSyntheticLambda3.getInterfaceDescriptor = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        }
        camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelStubProxy = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        camera2CameraImplExternalSyntheticLambda3.connect = str4;
        String str5 = camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelDefault;
        String str6 = camera2CameraImplExternalSyntheticLambda3.RemoteActionCompatParcelizer;
        String str7 = camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelStub;
        String str8 = camera2CameraImplExternalSyntheticLambda3.getInterfaceDescriptor;
        String str9 = camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelStubProxy;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str5);
        sb.append(", ");
        sb.append(str6);
        sb.append(", City: ");
        sb.append(str7);
        sb.append(", Province: ");
        sb.append(str8);
        sb.append(", Country: ");
        sb.append(str9);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3, String str) {
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        Context contextRequireContext = camera2CameraImplExternalSyntheticLambda3.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, str, "Appointment Online", 0, null, false, 56);
        BaseActivity baseActivity = camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3) throws IOException {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) camera2CameraImplExternalSyntheticLambda3.getRoot.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null && camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelDefault = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            camera2CameraImplExternalSyntheticLambda3.RemoteActionCompatParcelizer = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelStub = camera2CameraControlExternalSyntheticLambda4B.b;
            camera2CameraImplExternalSyntheticLambda3.getInterfaceDescriptor = camera2CameraControlExternalSyntheticLambda4B.g;
            camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelStubProxy = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            camera2CameraImplExternalSyntheticLambda3.connect = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelDefault;
            String str2 = camera2CameraImplExternalSyntheticLambda3.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        } else {
            camera2CameraImplExternalSyntheticLambda3.INotificationSideChannelDefault = "0.0";
            camera2CameraImplExternalSyntheticLambda3.RemoteActionCompatParcelizer = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: onDisconnected
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: onCameraUnavailable
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
            }
        });
        MaterialButton materialButton = asInterface().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }
}
