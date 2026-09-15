package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.queueing.model.response.AntrianData;
import com.bpjstku.data.queueing.model.response.GetDataAntrianResponse;
import com.bpjstku.data.registration.general.model.request.GenerateKeyRequest;
import com.bpjstku.data.registration.general.model.request.NewActivationRequest;
import com.bpjstku.data.registration.general.model.request.NewRegisterRequest;
import com.bpjstku.data.registration.general.model.request.VerifyBiometricRequest;
import com.bpjstku.data.registration.general.model.request.VerifyCountBiometricRequest;
import com.bpjstku.data.registration.general.model.response.VerifyBiometricResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.databinding.FragmentActivationBiometricBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.presentation.membership.accountactivation.newactivation.ActivationBiometricFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.queueing.BookingAntreanFormActivity;
import com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.FirebaseMessaging;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.IntegerRes;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.checkShowingFlags;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0004R\u0015\u0010\u001d\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0019\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0015\u0010\u0018\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0015\u0010\b\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0015\u0010\u0015\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0015\u0010\n\u001a\u00020$8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0017\u0010(\u001a\u0004\u0018\u00010&8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0015\u0010\u0011\u001a\u00020)8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b*\u0010\u001cR\u0015\u0010\u0017\u001a\u00020+8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b,\u0010\u001cR\u0015\u0010.\u001a\u00020\u00058CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0018\u0010-\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\f\u001a\u0002068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u00105R\u0018\u0010'\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u00105R\u0018\u0010,\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u00105R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020/0<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010=R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020/0?8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010?8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010=R\u0018\u0010:\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u00105R\u0018\u00102\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u00105R\u0018\u00100\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u00105R\u0018\u00104\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0018\u0010;\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u00105R\u0018\u0010#\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u00105R\u0018\u0010@\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u00105R.\u00107\u001a\u001c\u0012\u0004\u0012\u00020B\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00020A8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010DR\u001a\u0010 \u001a\u00020E8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\b(\u0010G"}, d2 = {"LActivityChooserModelActivityResolveInfo;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentActivationBiometricBinding;", "<init>", "()V", "", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)V", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "Lcom/bpjstku/data/registration/general/model/response/VerifyBiometricResponse;", "(Lcom/bpjstku/data/registration/general/model/response/VerifyBiometricResponse;)V", "d", "", "Lid/vida/liveness/dto/VidaLivenessResponse;", "p1", "b", "([BLid/vida/liveness/dto/VidaLivenessResponse;)V", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LsetSplitTrack;", "INotificationSideChannelStubProxy", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LcheckShowingFlags;", "LIntegerRes;", "disconnect", "LacquireBuffer;", "LgetUntrustedCreatorPackageName;", "getExtras", "LgetStreamUseCaseSupportedCombinationList;", "sendCustomAction", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "INotificationSideChannelDefault", "asBinder", "LoutputFormatToAudioProfile;", "getInterfaceDescriptor", "Lcom/bpjstku/data/lib/PreferenceManager;", "INotificationSideChannelStub", "notify", "asInterface", "Ljava/io/File;", "read", "Ljava/io/File;", "connect", "[B", "IconCompatParcelizer", "Ljava/lang/String;", "", "getItem", "Z", "getNotifyChildrenChangedOptions", "MediaBrowserCompat", "write", "", "Ljava/util/List;", "RemoteActionCompatParcelizer", "", "getRoot", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityChooserModelActivityResolveInfo extends AutoValue_CameraState_StateError<FragmentActivationBiometricBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private List<String> INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private List<? extends File> getInterfaceDescriptor;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final List<File> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String MediaBrowserCompat;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String getExtras;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String connect;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private byte[] onTransact;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private boolean INotificationSideChannel;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private String cancelAll;
    private String getRoot;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final int disconnect;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private File notify;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String INotificationSideChannelStub;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
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

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public ActivityChooserModelActivityResolveInfo() {
        final ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.ActivationBiometricFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = activityChooserModelActivityResolveInfo;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setSplitTrack.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<checkShowingFlags>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.ActivationBiometricFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, checkShowingFlags] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ checkShowingFlags invoke() {
                LifecycleOwner lifecycleOwner = activityChooserModelActivityResolveInfo;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(checkShowingFlags.class);
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
        final ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.ActivationBiometricFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = activityChooserModelActivityResolveInfo2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.ActivationBiometricFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = activityChooserModelActivityResolveInfo2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo3 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.ActivationBiometricFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = activityChooserModelActivityResolveInfo3.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.b = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.ActivationBiometricFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(activityChooserModelActivityResolveInfo3, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.g = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.ActivationBiometricFragment$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = activityChooserModelActivityResolveInfo;
                mapPoint mappoint = this.$qualifier;
                Function0 function1 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class);
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
        this.asBinder = LazyKt.lazy(new Function0() { // from class: onChooseActivity
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b.getValue()).b.getValue();
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: ActivityChooserView
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityChooserModelActivityResolveInfo.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        this.a = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.ActivationBiometricFragment$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = activityChooserModelActivityResolveInfo2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asInterface = LazyKt.lazy(new Function0() { // from class: getDataModel
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((PreferenceManager) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a.getValue()).getString("OCR_TRANSACTION_ID", "");
            }
        });
        this.RemoteActionCompatParcelizer = new ArrayList();
        this.getInterfaceDescriptor = CollectionsKt.emptyList();
        this.getRoot = ExifInterface.GPS_DIRECTION_TRUE;
        this.disconnect = R.layout.fragment_activation_biometric;
    }

    /* JADX INFO: renamed from: ActivityChooserModelActivityResolveInfo$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LActivityChooserModelActivityResolveInfo$b;", "", "<init>", "()V", "LActivityChooserModelActivityResolveInfo;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LActivityChooserModelActivityResolveInfo;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static ActivityChooserModelActivityResolveInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new ActivityChooserModelActivityResolveInfo();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentActivationBiometricBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ActivationBiometricFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getCancel() {
        return this.disconnect;
    }

    private final void TuitionPaymentFragmentbindingInflater1(String p0) {
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_document_failed, "", p0, string, null, 112);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        MaterialButton materialButton = asInterface().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: isShowingPopup
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityChooserModelActivityResolveInfo.cancelAll(this.b);
            }
        });
        CardView cardView = asInterface().cvLivenessCheck;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cardView, new Function0() { // from class: showPopupUnchecked
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityChooserModelActivityResolveInfo.b(this.b);
            }
        });
    }

    private final void TuitionPaymentFragmentbindingInflater1(VerifyBiometricResponse p0) {
        List listSplit$default = StringsKt.split$default((CharSequence) p0.isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
        List listSplit$default2 = StringsKt.split$default((CharSequence) p0.isSuspend(), new String[]{"#"}, false, 0, 6, (Object) null);
        if ((Intrinsics.areEqual(listSplit$default.get(0), "true") && Intrinsics.areEqual(listSplit$default2.get(0), "true")) || (Intrinsics.areEqual(listSplit$default.get(0), "true") && Intrinsics.areEqual(listSplit$default2.get(0), "false"))) {
            this.getRoot = "Y";
            d();
            return;
        }
        if (Intrinsics.areEqual(listSplit$default.get(0), "false") && Intrinsics.areEqual(listSplit$default2.get(0), "true")) {
            this.getRoot = ExifInterface.GPS_DIRECTION_TRUE;
            d();
            return;
        }
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = getString(R.string.message_sorry);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String message = p0.getMessage();
        String string2 = getString(R.string.action_back);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, message, string2, new Function0() { // from class: ActivityChooserModelActivitySorter
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityChooserModelActivityResolveInfo.cancel(this.b);
            }
        }, 96);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    private final void b(byte[] p0, VidaLivenessResponse p1) {
        BitmapFactory.decodeByteArray(p0, 0, p0.length);
        FragmentActivationBiometricBinding fragmentActivationBiometricBindingAsInterface = asInterface();
        fragmentActivationBiometricBindingAsInterface.imgLivenessCheck.setVisibility(8);
        fragmentActivationBiometricBindingAsInterface.tvLivenessCheckLabel.setVisibility(8);
        this.cancelAll = p1.getTransactionId();
        this.INotificationSideChannelDefault = String.valueOf(p1.getLivenessScore());
        this.INotificationSideChannelStub = String.valueOf(p1.getManipulationScore());
        this.onTransact = p0;
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    private final void TuitionPaymentFragmentbindingInflater1() {
        this.onTransact = null;
        File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
            FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        FragmentActivationBiometricBinding fragmentActivationBiometricBindingAsInterface = asInterface();
        fragmentActivationBiometricBindingAsInterface.imgLivenessCheck.setVisibility(0);
        fragmentActivationBiometricBindingAsInterface.tvLivenessCheckLabel.setVisibility(0);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.notify = null;
        this.INotificationSideChannel = false;
        this.getInterfaceDescriptor = CollectionsKt.toList(this.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer.clear();
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
        String string = getString(R.string.label_title_validation_account_dialog);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.label_message_validation_account_dialog);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.action_booking_antrean_online);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: dismissPopup
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityChooserModelActivityResolveInfo.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static /* synthetic */ Unit b(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            activityChooserModelActivityResolveInfo.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            activityChooserModelActivityResolveInfo.write();
            activityChooserModelActivityResolveInfo.a();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses Pendaftaran tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                activityChooserModelActivityResolveInfo.getRoot = ExifInterface.GPS_DIRECTION_TRUE;
                if (activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.isEmpty() && !activityChooserModelActivityResolveInfo.getInterfaceDescriptor.isEmpty()) {
                    activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.addAll(activityChooserModelActivityResolveInfo.getInterfaceDescriptor);
                }
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                if (registeredMemberRegistration != null) {
                    setSplitTrack setsplittrack = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    String str = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
                    List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
                    Intrinsics.checkNotNull(list);
                    String str2 = list.get(0);
                    String str3 = registeredMemberRegistration.d;
                    String str4 = registeredMemberRegistration.asBinder;
                    String str5 = registeredMemberRegistration.notify;
                    String str6 = registeredMemberRegistration.a;
                    MembershipType membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String strName = membershipType != null ? membershipType.name() : null;
                    String str7 = registeredMemberRegistration.INotificationSideChannel;
                    String str8 = registeredMemberRegistration.g;
                    String str9 = registeredMemberRegistration.cancelAll;
                    String str10 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                    File fileTuitionPaymentFragmentbindingInflater1 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 0);
                    if (fileTuitionPaymentFragmentbindingInflater1 == null) {
                        fileTuitionPaymentFragmentbindingInflater1 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File file = fileTuitionPaymentFragmentbindingInflater1;
                    File fileTuitionPaymentFragmentbindingInflater2 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 1);
                    if (fileTuitionPaymentFragmentbindingInflater2 == null) {
                        fileTuitionPaymentFragmentbindingInflater2 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File file2 = fileTuitionPaymentFragmentbindingInflater2;
                    File fileTuitionPaymentFragmentbindingInflater3 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 2);
                    if (fileTuitionPaymentFragmentbindingInflater3 == null) {
                        fileTuitionPaymentFragmentbindingInflater3 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File fileTuitionPaymentFragmentbindingInflater4 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    String strValueOf = String.valueOf(activityChooserModelActivityResolveInfo.MediaBrowserCompat);
                    String strValueOf2 = String.valueOf(activityChooserModelActivityResolveInfo.connect);
                    String strValueOf3 = String.valueOf(activityChooserModelActivityResolveInfo.read);
                    String str11 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str11, "");
                    String str12 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str12, "");
                    Context contextRequireContext = activityChooserModelActivityResolveInfo.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string, "");
                    setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, new NewActivationRequest(str2, str3, str4, str5, str6, strName, str7, "fcmid997797656579", str8, str9, str10, file, file2, fileTuitionPaymentFragmentbindingInflater3, strValueOf, strValueOf2, strValueOf3, ExifInterface.GPS_DIRECTION_TRUE, fileTuitionPaymentFragmentbindingInflater4, str11, str12, string));
                }
            } else {
                activityChooserModelActivityResolveInfo.write();
                ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo2 = activityChooserModelActivityResolveInfo;
                String strValueOf4 = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(activityChooserModelActivityResolveInfo2, "");
                Intrinsics.checkNotNullParameter(strValueOf4, "");
                BaseActivity baseActivity = (BaseActivity) activityChooserModelActivityResolveInfo2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf4, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            activityChooserModelActivityResolveInfo.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            activityChooserModelActivityResolveInfo.write();
            activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1((VerifyBiometricResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses Pendaftaran tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                activityChooserModelActivityResolveInfo.getRoot = ExifInterface.GPS_DIRECTION_TRUE;
                if (activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.isEmpty() && !activityChooserModelActivityResolveInfo.getInterfaceDescriptor.isEmpty()) {
                    activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.addAll(activityChooserModelActivityResolveInfo.getInterfaceDescriptor);
                }
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                if (registeredMemberRegistration != null) {
                    setSplitTrack setsplittrack = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    String str = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
                    List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
                    Intrinsics.checkNotNull(list);
                    String str2 = list.get(0);
                    String str3 = registeredMemberRegistration.d;
                    String str4 = registeredMemberRegistration.asBinder;
                    String str5 = registeredMemberRegistration.notify;
                    String str6 = registeredMemberRegistration.a;
                    MembershipType membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String strName = membershipType != null ? membershipType.name() : null;
                    String str7 = registeredMemberRegistration.INotificationSideChannel;
                    String str8 = registeredMemberRegistration.g;
                    String str9 = registeredMemberRegistration.cancelAll;
                    String str10 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                    File fileTuitionPaymentFragmentbindingInflater1 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 0);
                    if (fileTuitionPaymentFragmentbindingInflater1 == null) {
                        fileTuitionPaymentFragmentbindingInflater1 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File file = fileTuitionPaymentFragmentbindingInflater1;
                    File fileTuitionPaymentFragmentbindingInflater2 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 1);
                    if (fileTuitionPaymentFragmentbindingInflater2 == null) {
                        fileTuitionPaymentFragmentbindingInflater2 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File file2 = fileTuitionPaymentFragmentbindingInflater2;
                    File fileTuitionPaymentFragmentbindingInflater3 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 2);
                    if (fileTuitionPaymentFragmentbindingInflater3 == null) {
                        fileTuitionPaymentFragmentbindingInflater3 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File fileTuitionPaymentFragmentbindingInflater4 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    String strValueOf = String.valueOf(activityChooserModelActivityResolveInfo.MediaBrowserCompat);
                    String strValueOf2 = String.valueOf(activityChooserModelActivityResolveInfo.connect);
                    String strValueOf3 = String.valueOf(activityChooserModelActivityResolveInfo.read);
                    String str11 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str11, "");
                    String str12 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str12, "");
                    Context contextRequireContext = activityChooserModelActivityResolveInfo.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string, "");
                    setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, new NewActivationRequest(str2, str3, str4, str5, str6, strName, str7, "fcmid997797656579", str8, str9, str10, file, file2, fileTuitionPaymentFragmentbindingInflater3, strValueOf, strValueOf2, strValueOf3, ExifInterface.GPS_DIRECTION_TRUE, fileTuitionPaymentFragmentbindingInflater4, str11, str12, string));
                }
            } else {
                activityChooserModelActivityResolveInfo.write();
                activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1();
                activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo) {
        activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        ((IntegerRes) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo) {
        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) activityChooserModelActivityResolveInfo.g.getValue();
        String str = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
        List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
        Intrinsics.checkNotNull(list);
        getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(str, list.get(0));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo) {
        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) activityChooserModelActivityResolveInfo.g.getValue();
        String str = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
        List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
        Intrinsics.checkNotNull(list);
        getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(str, list.get(0));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo) {
        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) activityChooserModelActivityResolveInfo.g.getValue();
        String str = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
        List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
        Intrinsics.checkNotNull(list);
        getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(str, list.get(0));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ outputFormatToAudioProfile a(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo) {
        return new outputFormatToAudioProfile(activityChooserModelActivityResolveInfo);
    }

    public static /* synthetic */ Unit a(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            activityChooserModelActivityResolveInfo.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            activityChooserModelActivityResolveInfo.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            activityChooserModelActivityResolveInfo.getNotifyChildrenChangedOptions = ((KeyResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum();
            List listSplit$default = StringsKt.split$default((CharSequence) ((KeyResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum(), new String[]{"#"}, false, 0, 6, (Object) null);
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
            List listSplit$default2 = (registeredMemberRegistration == null || (str = registeredMemberRegistration.asInterface) == null) ? null : StringsKt.split$default((CharSequence) str, new String[]{"#"}, false, 0, 6, (Object) null);
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
            if (Intrinsics.areEqual(String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null), listSplit$default.get(0))) {
                if (activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.isEmpty()) {
                    activityChooserModelActivityResolveInfo.write();
                    String string = activityChooserModelActivityResolveInfo.getString(R.string.error_message_selfie_photo_required);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1(string);
                    activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } else {
                    List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
                    Intrinsics.checkNotNull(list);
                    if (Intrinsics.areEqual(list.get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
                        final setSplitTrack setsplittrack = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        String str2 = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
                        String str3 = activityChooserModelActivityResolveInfo.cancel;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str3 = null;
                        }
                        Object obj = listSplit$default.get(2);
                        StringBuilder sb = new StringBuilder("JMO#");
                        sb.append(str3);
                        sb.append("#true#70#");
                        sb.append(obj);
                        String string2 = sb.toString();
                        String str4 = Build.BRAND;
                        Intrinsics.checkNotNullExpressionValue(str4, "");
                        Context contextRequireContext = activityChooserModelActivityResolveInfo.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        String string3 = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string3, "");
                        String str5 = Build.MODEL;
                        Intrinsics.checkNotNullExpressionValue(str5, "");
                        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
                        String str6 = Build.MANUFACTURER;
                        Intrinsics.checkNotNullExpressionValue(str6, "");
                        File file = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
                        File file2 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 1);
                        if (file2 == null) {
                            file2 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
                        }
                        File file3 = file2;
                        File file4 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 2);
                        if (file4 == null) {
                            file4 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
                        }
                        File file5 = file4;
                        String str7 = listSplit$default2 != null ? (String) CollectionsKt.getOrNull(listSplit$default2, 0) : null;
                        RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        String strValueOf2 = String.valueOf(registeredMemberRegistration3 != null ? registeredMemberRegistration3.TuitionPaymentFragmentbindingInflater1 : null);
                        RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        String strValueOf3 = String.valueOf(registeredMemberRegistration4 != null ? registeredMemberRegistration4.g : null);
                        String str8 = activityChooserModelActivityResolveInfo.cancelAll;
                        String str9 = str8 == null ? "" : str8;
                        String str10 = activityChooserModelActivityResolveInfo.INotificationSideChannelDefault;
                        String str11 = str10 == null ? "" : str10;
                        String str12 = activityChooserModelActivityResolveInfo.INotificationSideChannelStub;
                        VerifyBiometricRequest verifyBiometricRequest = new VerifyBiometricRequest(string2, str4, string3, str5, strValueOf, str6, file, file3, file5, str7, strValueOf2, strValueOf3, str9, str11, str12 == null ? "" : str12);
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(verifyBiometricRequest, "");
                        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData = setsplittrack.read;
                        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, verifyBiometricRequest)));
                        final Function1 function1 = new Function1() { // from class: addChildrenForExpandedActionView
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return setSplitTrack.b(setsplittrack, (VerifyBiometricResponse) obj2);
                            }
                        };
                        logToString logtostring = new logToString() { // from class: shouldCollapse
                            @Override // defpackage.logToString
                            public final void accept(Object obj2) {
                                function1.invoke(obj2);
                            }
                        };
                        final Function1 function2 = new Function1() { // from class: shouldLayout
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return setSplitTrack.getInterfaceDescriptor(setsplittrack, (Throwable) obj2);
                            }
                        };
                        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ensureCollapseButtonView
                            @Override // defpackage.logToString
                            public final void accept(Object obj2) {
                                function2.invoke(obj2);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                        setsplittrack.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    } else {
                        final setSplitTrack setsplittrack2 = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        String str13 = activityChooserModelActivityResolveInfo.cancel;
                        if (str13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str13 = null;
                        }
                        Object obj2 = listSplit$default.get(2);
                        StringBuilder sb2 = new StringBuilder("JMO#");
                        sb2.append(str13);
                        sb2.append("#true#70#");
                        sb2.append(obj2);
                        String string4 = sb2.toString();
                        String str14 = Build.BRAND;
                        Intrinsics.checkNotNullExpressionValue(str14, "");
                        Context contextRequireContext2 = activityChooserModelActivityResolveInfo.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                        String string5 = Settings.Secure.getString(contextRequireContext2.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string5, "");
                        String str15 = Build.MODEL;
                        Intrinsics.checkNotNullExpressionValue(str15, "");
                        String strValueOf4 = String.valueOf(Build.VERSION.SDK_INT);
                        String str16 = Build.MANUFACTURER;
                        Intrinsics.checkNotNullExpressionValue(str16, "");
                        File file6 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
                        File file7 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 1);
                        if (file7 == null) {
                            file7 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
                        }
                        File file8 = file7;
                        File file9 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 2);
                        if (file9 == null) {
                            file9 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
                        }
                        File file10 = file9;
                        String str17 = listSplit$default2 != null ? (String) CollectionsKt.getOrNull(listSplit$default2, 0) : null;
                        RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        String strValueOf5 = String.valueOf(registeredMemberRegistration5 != null ? registeredMemberRegistration5.TuitionPaymentFragmentbindingInflater1 : null);
                        RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        String strValueOf6 = String.valueOf(registeredMemberRegistration6 != null ? registeredMemberRegistration6.g : null);
                        String str18 = activityChooserModelActivityResolveInfo.cancelAll;
                        String str19 = str18 == null ? "" : str18;
                        String str20 = activityChooserModelActivityResolveInfo.INotificationSideChannelDefault;
                        String str21 = str20 == null ? "" : str20;
                        String str22 = activityChooserModelActivityResolveInfo.INotificationSideChannelStub;
                        VerifyBiometricRequest verifyBiometricRequest2 = new VerifyBiometricRequest(string4, str14, string5, str15, strValueOf4, str16, file6, file8, file10, str17, strValueOf5, strValueOf6, str19, str21, str22 == null ? "" : str22);
                        Intrinsics.checkNotNullParameter(verifyBiometricRequest2, "");
                        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData2 = setsplittrack2.disconnect;
                        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                        deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack2.MediaBrowserCompat.b(verifyBiometricRequest2)));
                        final Function1 function3 = new Function1() { // from class: ensureMenu
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setsplittrack2, (VerifyBiometricResponse) obj3);
                            }
                        };
                        logToString logtostring2 = new logToString() { // from class: addSystemView
                            @Override // defpackage.logToString
                            public final void accept(Object obj3) {
                                function3.invoke(obj3);
                            }
                        };
                        final Function1 function4 = new Function1() { // from class: getChildHorizontalGravity
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return setSplitTrack.g(setsplittrack2, (Throwable) obj3);
                            }
                        };
                        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: ensureMenuView
                            @Override // defpackage.logToString
                            public final void accept(Object obj3) {
                                function4.invoke(obj3);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                        setsplittrack2.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    }
                }
            } else {
                activityChooserModelActivityResolveInfo.write();
                ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo2 = activityChooserModelActivityResolveInfo;
                String string6 = activityChooserModelActivityResolveInfo.getString(R.string.message_integrity_data);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                Intrinsics.checkNotNullParameter(activityChooserModelActivityResolveInfo2, "");
                Intrinsics.checkNotNullParameter(string6, "");
                BaseActivity baseActivity = (BaseActivity) activityChooserModelActivityResolveInfo2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string6, null);
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            activityChooserModelActivityResolveInfo.write();
            ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo3 = activityChooserModelActivityResolveInfo;
            String strValueOf7 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(activityChooserModelActivityResolveInfo3, "");
            Intrinsics.checkNotNullParameter(strValueOf7, "");
            BaseActivity baseActivity2 = (BaseActivity) activityChooserModelActivityResolveInfo3.getContext();
            if (baseActivity2 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf7, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo) {
        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) activityChooserModelActivityResolveInfo.g.getValue();
        String str = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
        List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
        Intrinsics.checkNotNull(list);
        getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(str, list.get(0));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancel(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo) {
        BaseActivity baseActivity = activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).INotificationSideChannel.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: setProvider
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: ActivityChooserModelHistoricalRecord
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).getRoot.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getListPopupWindow
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo = this;
        ((getStreamUseCaseSupportedCombinationList) this.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(activityChooserModelActivityResolveInfo, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: ActivityChooserView3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).read.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: onChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        VideoRecordEventStart<TwilightManager> videoRecordEventStartHide = ((checkShowingFlags) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.hide();
        Intrinsics.checkNotNullExpressionValue(videoRecordEventStartHide, "");
        VideoRecordEventStart<TwilightManager> videoRecordEventStartObserveOn = videoRecordEventStartHide.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: ActivityChooserView5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (TwilightManager) obj);
            }
        };
        logToString<? super TwilightManager> logtostring = new logToString() { // from class: getShowDefaultActivity
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getItemViewType
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartObserveOn.subscribe(logtostring, new logToString() { // from class: ActivityChooserView4
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).getExtras.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: ActivityChooserViewActivityChooserViewAdapter
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).disconnect.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: onInitializeAccessibilityNodeInfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).cancelAll.observe(activityChooserModelActivityResolveInfo, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: ActivityChooserView2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).notify.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: onInvalidated
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.asBinder(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    private final void a() {
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) this.d.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final Function1 function1 = new Function1() { // from class: setExpandActivityOverflowButtonContentDescription
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.b(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: setDefaultActionButtonContentDescription
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
    }

    private final void d() {
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.asBinder.getValue();
        ((getUntrustedCreatorPackageName) this.b.getValue()).b.setValue(registeredMemberRegistration != null ? RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (File) CollectionsKt.getOrNull(this.RemoteActionCompatParcelizer, 0), (File) CollectionsKt.getOrNull(this.RemoteActionCompatParcelizer, 1), (File) CollectionsKt.getOrNull(this.RemoteActionCompatParcelizer, 2), null, null, null, null, 7929855) : null);
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: ActivityChooserModelPersistHistoryAsyncTask
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) throws Throwable {
                ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, task);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.asBinder.getValue();
        this.INotificationSideChannelStubProxy = StringsKt.split$default((CharSequence) String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.asInterface : null), new String[]{"#"}, false, 0, 6, (Object) null);
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: setInitialActivityCount
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: ActivityChooserView1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityChooserModelActivityResolveInfo.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
    }

    public static /* synthetic */ Unit asInterface(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_time_server_biometric", "loading_time_server_biometric_asik"));
            Intrinsics.checkNotNullParameter("loading_time_server_biometric_asik", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_time_server_biometric_asik", mapMutableMapOf);
            activityChooserModelActivityResolveInfo.IconCompatParcelizer();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_time_server_asik", "success_time_server_biometric_asik"));
                Intrinsics.checkNotNullParameter("success_time_server_asik", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_time_server_asik", mapMutableMapOf2);
                activityChooserModelActivityResolveInfo.cancel = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
                if (activityChooserModelActivityResolveInfo.INotificationSideChannel) {
                    List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
                    Intrinsics.checkNotNull(list);
                    if (Intrinsics.areEqual(list.get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
                        setSplitTrack setsplittrack = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        String str = registeredMemberRegistration != null ? registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1 : null;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("#activation");
                        String string = sb.toString();
                        RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new GenerateKeyRequest(string, String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null)));
                    } else {
                        setSplitTrack setsplittrack2 = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        String str2 = registeredMemberRegistration3 != null ? registeredMemberRegistration3.TuitionPaymentFragmentbindingInflater1 : null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append("#registrasi");
                        String string2 = sb2.toString();
                        RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new GenerateKeyRequest(string2, String.valueOf(registeredMemberRegistration4 != null ? registeredMemberRegistration4.TuitionPaymentFragmentbindingInflater1 : null)));
                    }
                } else {
                    List<String> list2 = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
                    Intrinsics.checkNotNull(list2);
                    if (Intrinsics.areEqual(list2.get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
                        final setSplitTrack setsplittrack3 = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        String str3 = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
                        RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        String strValueOf = String.valueOf(registeredMemberRegistration5 != null ? registeredMemberRegistration5.onTransact : null);
                        RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        VerifyCountBiometricRequest verifyCountBiometricRequest = new VerifyCountBiometricRequest(strValueOf, String.valueOf(registeredMemberRegistration6 != null ? registeredMemberRegistration6.TuitionPaymentFragmentbindingInflater1 : null), "");
                        Intrinsics.checkNotNullParameter(str3, "");
                        Intrinsics.checkNotNullParameter(verifyCountBiometricRequest, "");
                        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData = setsplittrack3.getRoot;
                        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack3.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, verifyCountBiometricRequest)));
                        final Function1 function1 = new Function1() { // from class: layoutChildLeft
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setsplittrack3, (VerifyBiometricResponse) obj);
                            }
                        };
                        logToString logtostring = new logToString() { // from class: onCreateMenu
                            @Override // defpackage.logToString
                            public final void accept(Object obj) {
                                function1.invoke(obj);
                            }
                        };
                        final Function1 function2 = new Function1() { // from class: layoutChildRight
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return setSplitTrack.onTransact(setsplittrack3, (Throwable) obj);
                            }
                        };
                        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: measureChildCollapseMargins
                            @Override // defpackage.logToString
                            public final void accept(Object obj) {
                                function2.invoke(obj);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                        setsplittrack3.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    } else {
                        setSplitTrack setsplittrack4 = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        String str4 = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
                        RegisteredMemberRegistration registeredMemberRegistration7 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        String strValueOf2 = String.valueOf(registeredMemberRegistration7 != null ? registeredMemberRegistration7.onTransact : null);
                        RegisteredMemberRegistration registeredMemberRegistration8 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        String strValueOf3 = String.valueOf(registeredMemberRegistration8 != null ? registeredMemberRegistration8.TuitionPaymentFragmentbindingInflater1 : null);
                        RegisteredMemberRegistration registeredMemberRegistration9 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                        setsplittrack4.TuitionPaymentFragmentbindingInflater1(str4, new VerifyCountBiometricRequest(strValueOf2, strValueOf3, String.valueOf(registeredMemberRegistration9 != null ? registeredMemberRegistration9.asInterface : null)));
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_time_server_asik", "failure_time_server_asik"));
                Intrinsics.checkNotNullParameter("failure_time_server_asik", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_time_server_asik", mapMutableMapOf3);
                activityChooserModelActivityResolveInfo.write();
                ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo2 = activityChooserModelActivityResolveInfo;
                String strValueOf4 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(activityChooserModelActivityResolveInfo2, "");
                Intrinsics.checkNotNullParameter(strValueOf4, "");
                BaseActivity baseActivity = (BaseActivity) activityChooserModelActivityResolveInfo2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf4, null);
                }
            } else {
                activityChooserModelActivityResolveInfo.write();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancelAll(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo) {
        if (activityChooserModelActivityResolveInfo.onTransact != null) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_next_step_second_asik", "submit_asik_step_second_ekyc"));
            Intrinsics.checkNotNullParameter("submit_asik_step_second_ekyc", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_asik_step_second_ekyc", mapMutableMapOf);
            if (activityChooserModelActivityResolveInfo.asInterface().btnNext.isEnabled()) {
                activityChooserModelActivityResolveInfo.d();
            }
        } else {
            activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            ((IntegerRes) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, TwilightManager twilightManager) {
        List<byte[]> listEmptyList;
        if (twilightManager instanceof TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) twilightManager;
            List<byte[]> list = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            byte[] imageBytes = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getImageBytes();
            List<byte[]> additionalImages = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getAdditionalImages();
            if (additionalImages == null || (listEmptyList = CollectionsKt.toList(additionalImages)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (!listEmptyList.isEmpty()) {
                list = listEmptyList;
            }
            if (imageBytes != null) {
                Context contextRequireContext = activityChooserModelActivityResolveInfo.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageBytes, contextRequireContext));
            }
            for (byte[] bArr : list) {
                Intrinsics.checkNotNull(bArr);
                Context contextRequireContext2 = activityChooserModelActivityResolveInfo.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr, contextRequireContext2));
            }
            if (!activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.isEmpty()) {
                activityChooserModelActivityResolveInfo.getInterfaceDescriptor = CollectionsKt.emptyList();
            } else {
                activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.addAll(activityChooserModelActivityResolveInfo.getInterfaceDescriptor);
                activityChooserModelActivityResolveInfo.getInterfaceDescriptor = CollectionsKt.emptyList();
            }
            if (imageBytes != null) {
                activityChooserModelActivityResolveInfo.b(imageBytes, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
            }
            activityChooserModelActivityResolveInfo.INotificationSideChannel = true;
        } else {
            if (!(twilightManager instanceof TwilightManager.TuitionPaymentFragmentbindingInflater1)) {
                throw new NoWhenBranchMatchedException();
            }
            TwilightManager.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager;
            if (tuitionPaymentFragmentbindingInflater1.b.getImageBytes() == null) {
                int i = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(": ");
                sb.append(str);
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), sb.toString(), 0).show();
                activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.addAll(activityChooserModelActivityResolveInfo.getInterfaceDescriptor);
                activityChooserModelActivityResolveInfo.getInterfaceDescriptor = CollectionsKt.emptyList();
                activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1();
            } else {
                byte[] imageBytes2 = tuitionPaymentFragmentbindingInflater1.b.getImageBytes();
                if (imageBytes2 != null) {
                    activityChooserModelActivityResolveInfo.b(imageBytes2, tuitionPaymentFragmentbindingInflater1.b);
                    activityChooserModelActivityResolveInfo.INotificationSideChannel = true;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                activityChooserModelActivityResolveInfo.write();
                GetDataAntrianResponse getDataAntrianResponse = (GetDataAntrianResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                AntrianData data = getDataAntrianResponse.getData();
                if (Intrinsics.areEqual(getDataAntrianResponse.isSuccessful(), Boolean.TRUE) && data != null) {
                    BookingAntreanSuccessActivity.Companion companion = BookingAntreanSuccessActivity.INSTANCE;
                    Context contextRequireContext = activityChooserModelActivityResolveInfo.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String nomorIdentitas = data.getNomorIdentitas();
                    String str = nomorIdentitas == null ? "" : nomorIdentitas;
                    String nama = data.getNama();
                    String str2 = nama == null ? "" : nama;
                    String handphone = data.getHandphone();
                    String str3 = handphone == null ? "" : handphone;
                    String email = data.getEmail();
                    String str4 = email == null ? "" : email;
                    String kodePengajuan = data.getKodePengajuan();
                    String str5 = kodePengajuan == null ? "" : kodePengajuan;
                    String layanan = data.getLayanan();
                    String str6 = layanan == null ? "" : layanan;
                    String layanan2 = data.getLayanan();
                    String str7 = layanan2 == null ? "" : layanan2;
                    String namaKantorCabang = data.getNamaKantorCabang();
                    String str8 = (namaKantorCabang == null && (namaKantorCabang = data.getKantorCabang()) == null) ? "" : namaKantorCabang;
                    String alamatKantor = data.getAlamatKantor();
                    String str9 = alamatKantor == null ? "" : alamatKantor;
                    String tanggalBooking = data.getTanggalBooking();
                    String str10 = tanggalBooking == null ? "" : tanggalBooking;
                    String tanggalBooking2 = data.getTanggalBooking();
                    String str11 = tanggalBooking2 == null ? "" : tanggalBooking2;
                    String namaShift = data.getNamaShift();
                    String str12 = namaShift == null ? "" : namaShift;
                    String qrCode = getDataAntrianResponse.getQrCode();
                    BookingAntreanSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, "", "", qrCode == null ? "" : qrCode, "902");
                } else {
                    activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                activityChooserModelActivityResolveInfo.write();
                ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo2 = activityChooserModelActivityResolveInfo;
                String str13 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str13 == null) {
                    str13 = "";
                }
                Intrinsics.checkNotNullParameter(activityChooserModelActivityResolveInfo2, "");
                Intrinsics.checkNotNullParameter(str13, "");
                BaseActivity baseActivity = (BaseActivity) activityChooserModelActivityResolveInfo2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, str13, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            activityChooserModelActivityResolveInfo.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            activityChooserModelActivityResolveInfo.write();
            activityChooserModelActivityResolveInfo.a();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses Pendaftaran tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                activityChooserModelActivityResolveInfo.getRoot = ExifInterface.GPS_DIRECTION_TRUE;
                if (activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.isEmpty() && !activityChooserModelActivityResolveInfo.getInterfaceDescriptor.isEmpty()) {
                    activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.addAll(activityChooserModelActivityResolveInfo.getInterfaceDescriptor);
                }
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
                if (registeredMemberRegistration != null) {
                    setSplitTrack setsplittrack = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    String str = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
                    String string = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string, "");
                    String str2 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                    String str3 = registeredMemberRegistration.notify;
                    String str4 = registeredMemberRegistration.a;
                    List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
                    Intrinsics.checkNotNull(list);
                    String str5 = list.get(0);
                    String str6 = registeredMemberRegistration.d;
                    MembershipType membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String strName = membershipType != null ? membershipType.name() : null;
                    String str7 = registeredMemberRegistration.cancelAll;
                    Citizenship citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    String strName2 = citizenship != null ? citizenship.name() : null;
                    String str8 = registeredMemberRegistration.asBinder;
                    String str9 = registeredMemberRegistration.g;
                    String str10 = registeredMemberRegistration.INotificationSideChannel;
                    File fileTuitionPaymentFragmentbindingInflater1 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 0);
                    if (fileTuitionPaymentFragmentbindingInflater1 == null) {
                        fileTuitionPaymentFragmentbindingInflater1 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File file = fileTuitionPaymentFragmentbindingInflater1;
                    File fileTuitionPaymentFragmentbindingInflater2 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 1);
                    if (fileTuitionPaymentFragmentbindingInflater2 == null) {
                        fileTuitionPaymentFragmentbindingInflater2 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File file2 = fileTuitionPaymentFragmentbindingInflater2;
                    File fileTuitionPaymentFragmentbindingInflater3 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 2);
                    if (fileTuitionPaymentFragmentbindingInflater3 == null) {
                        fileTuitionPaymentFragmentbindingInflater3 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File fileTuitionPaymentFragmentbindingInflater4 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    String strValueOf = String.valueOf(activityChooserModelActivityResolveInfo.MediaBrowserCompat);
                    String strValueOf2 = String.valueOf(activityChooserModelActivityResolveInfo.connect);
                    String strValueOf3 = String.valueOf(activityChooserModelActivityResolveInfo.read);
                    String str11 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str11, "");
                    String str12 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str12, "");
                    setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new NewRegisterRequest(string, str2, strName2, strName, str6, str8, str5, str9, str4, str7, "fcmid997797656579", str3, str10, ExifInterface.GPS_DIRECTION_TRUE, file, file2, fileTuitionPaymentFragmentbindingInflater3, fileTuitionPaymentFragmentbindingInflater4, strValueOf, strValueOf2, strValueOf3, str11, str12));
                }
            } else {
                activityChooserModelActivityResolveInfo.write();
                ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo2 = activityChooserModelActivityResolveInfo;
                String strValueOf4 = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(activityChooserModelActivityResolveInfo2, "");
                Intrinsics.checkNotNullParameter(strValueOf4, "");
                BaseActivity baseActivity = (BaseActivity) activityChooserModelActivityResolveInfo2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf4, null);
                }
            }
        } else {
            activityChooserModelActivityResolveInfo.write();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) throws IOException {
        getContentPaddingRight.TuitionPaymentFragmentbindingInflater1(th);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            activityChooserModelActivityResolveInfo.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            activityChooserModelActivityResolveInfo.write();
            if (StringsKt.contains$default((CharSequence) ((BaseModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTuitionPaymentFragmentspecialinlinedviewModeldefault1().toString(), (CharSequence) "Terdapat pengajuan akun yang masih dalam proses, silakan tunggu hingga proses selesai.", false, 2, (Object) null)) {
                OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
                String string = activityChooserModelActivityResolveInfo.getString(R.string.label_verification_added);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = activityChooserModelActivityResolveInfo.getString(R.string.label_message_verification_added);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = activityChooserModelActivityResolveInfo.getString(R.string.action_booking_antrean_online);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: setExpandActivityOverflowButtonDrawable
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
                FragmentManager childFragmentManager = activityChooserModelActivityResolveInfo.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else if (Intrinsics.areEqual(activityChooserModelActivityResolveInfo.getRoot, "Y")) {
                RegistrationSuccessActivity.Companion companion2 = RegistrationSuccessActivity.INSTANCE;
                Context contextRequireContext = activityChooserModelActivityResolveInfo.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue());
                BaseActivity baseActivity = activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1;
                if (baseActivity != null) {
                    baseActivity.d_();
                }
            } else {
                activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            activityChooserModelActivityResolveInfo.write();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Terdapat pengajuan akun yang masih dalam proses, silakan tunggu hingga proses selesai.", false, 2, (Object) null)) {
                OutputConfigurationCompatApi33Impl.Companion companion3 = OutputConfigurationCompatApi33Impl.INSTANCE;
                String string4 = activityChooserModelActivityResolveInfo.getString(R.string.label_verification_added);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = activityChooserModelActivityResolveInfo.getString(R.string.label_message_verification_added);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                String string6 = activityChooserModelActivityResolveInfo.getString(R.string.action_booking_antrean_online);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB2 = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string4, string5, string6, (128 & 16) != 0 ? null : new Function0() { // from class: updateAppearance
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
                FragmentManager childFragmentManager2 = activityChooserModelActivityResolveInfo.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                if (childFragmentManager2.findFragmentByTag(outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    outputConfigurationCompatApi33ImplB2.show(childFragmentManager2, outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            activityChooserModelActivityResolveInfo.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            activityChooserModelActivityResolveInfo.write();
            activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1((VerifyBiometricResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            activityChooserModelActivityResolveInfo.write();
            activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1();
            activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1(String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        } else {
            activityChooserModelActivityResolveInfo.write();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        activityChooserModelActivityResolveInfo.MediaBrowserCompat = String.valueOf(userLocationComplete.b);
        activityChooserModelActivityResolveInfo.connect = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        activityChooserModelActivityResolveInfo.read = str;
        activityChooserModelActivityResolveInfo.IconCompatParcelizer = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        }
        activityChooserModelActivityResolveInfo.write = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        activityChooserModelActivityResolveInfo.getExtras = str4;
        String str5 = activityChooserModelActivityResolveInfo.MediaBrowserCompat;
        String str6 = activityChooserModelActivityResolveInfo.connect;
        String str7 = activityChooserModelActivityResolveInfo.read;
        String str8 = activityChooserModelActivityResolveInfo.IconCompatParcelizer;
        String str9 = activityChooserModelActivityResolveInfo.write;
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

    public static /* synthetic */ Unit asBinder(final ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            activityChooserModelActivityResolveInfo.IconCompatParcelizer();
            str = "loading_activation_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            activityChooserModelActivityResolveInfo.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) ((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTuitionPaymentFragmentspecialinlinedviewModeldefault1().toString(), (CharSequence) "Terdapat pengajuan akun yang masih dalam proses, silakan tunggu hingga proses selesai.", false, 2, (Object) null)) {
                OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
                String string = activityChooserModelActivityResolveInfo.getString(R.string.label_verification_added);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = activityChooserModelActivityResolveInfo.getString(R.string.label_message_verification_added);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = activityChooserModelActivityResolveInfo.getString(R.string.action_booking_antrean_online);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: ActivityChooserModelOnChooseActivityListener
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ActivityChooserModelActivityResolveInfo.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
                FragmentManager childFragmentManager = activityChooserModelActivityResolveInfo.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else if (((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getB()) {
                if (!Intrinsics.areEqual(activityChooserModelActivityResolveInfo.getRoot, "Y")) {
                    getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) activityChooserModelActivityResolveInfo.g.getValue();
                    String str2 = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
                    List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
                    Intrinsics.checkNotNull(list);
                    getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(str2, list.get(0));
                } else {
                    RegistrationSuccessActivity.Companion companion2 = RegistrationSuccessActivity.INSTANCE;
                    Context contextRequireContext = activityChooserModelActivityResolveInfo.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue());
                    BaseActivity baseActivity = activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1;
                    if (baseActivity != null) {
                        baseActivity.d_();
                    }
                }
            } else {
                ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo2 = activityChooserModelActivityResolveInfo;
                String tuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Intrinsics.checkNotNullParameter(activityChooserModelActivityResolveInfo2, "");
                Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                BaseActivity baseActivity2 = (BaseActivity) activityChooserModelActivityResolveInfo2.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, tuitionPaymentFragmentspecialinlinedviewModeldefault1, null);
                }
            }
            str = "success_activation_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            activityChooserModelActivityResolveInfo.write();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (!StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Terdapat pengajuan akun yang masih dalam proses, silakan tunggu hingga proses selesai.", false, 2, (Object) null)) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            } else {
                OutputConfigurationCompatApi33Impl.Companion companion3 = OutputConfigurationCompatApi33Impl.INSTANCE;
                String string4 = activityChooserModelActivityResolveInfo.getString(R.string.label_verification_added);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = activityChooserModelActivityResolveInfo.getString(R.string.label_message_verification_added);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                String string6 = activityChooserModelActivityResolveInfo.getString(R.string.action_booking_antrean_online);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB2 = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string4, string5, string6, (128 & 16) != 0 ? null : new Function0() { // from class: ActivityChooserModelDefaultSorter
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ActivityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
                    }
                }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
                FragmentManager childFragmentManager2 = activityChooserModelActivityResolveInfo.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                if (childFragmentManager2.findFragmentByTag(outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    outputConfigurationCompatApi33ImplB2.show(childFragmentManager2, outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            str = "failure_activation_account_step_fifth_result";
        } else {
            str = "";
        }
        FragmentActivity activity = activityChooserModelActivityResolveInfo.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_activation_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0186  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, Task task) throws Throwable {
        CharSequence charSequence;
        RegisteredMemberRegistration registeredMemberRegistration;
        String string;
        String str;
        String string2;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0 || (registeredMemberRegistration = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue()) == null) {
            return;
        }
        if (activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer.isEmpty()) {
            activityChooserModelActivityResolveInfo.write();
            String string3 = activityChooserModelActivityResolveInfo.getString(R.string.error_message_selfie_photo_required);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            activityChooserModelActivityResolveInfo.TuitionPaymentFragmentbindingInflater1(string3);
            activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            return;
        }
        List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
        Intrinsics.checkNotNull(list);
        String str2 = "-";
        if (Intrinsics.areEqual(list.get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
            setSplitTrack setsplittrack = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String str3 = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
            Citizenship citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (Intrinsics.areEqual(citizenship != null ? citizenship.name() : null, "WNI")) {
                List<String> list2 = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
                Intrinsics.checkNotNull(list2);
                str2 = list2.get(0);
            }
            String str4 = str2;
            String str5 = registeredMemberRegistration.d;
            String str6 = registeredMemberRegistration.asBinder;
            String str7 = registeredMemberRegistration.notify;
            String str8 = registeredMemberRegistration.a;
            MembershipType membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String strName = membershipType != null ? membershipType.name() : null;
            String str9 = registeredMemberRegistration.INotificationSideChannel;
            String str10 = (String) task.getResult();
            String str11 = registeredMemberRegistration.g;
            String str12 = registeredMemberRegistration.cancelAll;
            String str13 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
            if (str13 != null) {
                String lowerCase = str13.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase != null) {
                    string2 = StringsKt.trim((CharSequence) lowerCase).toString();
                } else {
                    string2 = null;
                }
            } else {
                string2 = null;
            }
            File file = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
            File file2 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 1);
            if (file2 == null) {
                file2 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
            }
            File file3 = file2;
            File file4 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 2);
            if (file4 == null) {
                file4 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
            }
            File file5 = file4;
            File fileTuitionPaymentFragmentbindingInflater1 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
            if (fileTuitionPaymentFragmentbindingInflater1 == null) {
                fileTuitionPaymentFragmentbindingInflater1 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
            }
            File file6 = fileTuitionPaymentFragmentbindingInflater1;
            String str14 = activityChooserModelActivityResolveInfo.getRoot;
            String strValueOf = String.valueOf(activityChooserModelActivityResolveInfo.connect);
            String strValueOf2 = String.valueOf(activityChooserModelActivityResolveInfo.MediaBrowserCompat);
            String str15 = activityChooserModelActivityResolveInfo.read;
            Context contextRequireContext = activityChooserModelActivityResolveInfo.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string4 = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string4, "");
            String str16 = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(str16, "");
            String str17 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str17, "");
            setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, new NewActivationRequest(str4, str5, str6, str7, str8, strName, str9, str10, str11, str12, string2, file, file3, file5, strValueOf2, strValueOf, str15, str14, file6, str16, str17, string4));
            return;
        }
        setSplitTrack setsplittrack2 = (setSplitTrack) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String str18 = (String) activityChooserModelActivityResolveInfo.asInterface.getValue();
        String str19 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str20 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
        if (str20 != null) {
            String lowerCase2 = str20.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (lowerCase2 != null) {
                string = StringsKt.trim((CharSequence) lowerCase2).toString();
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        Citizenship citizenship2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strName2 = citizenship2 != null ? citizenship2.name() : null;
        MembershipType membershipType2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String strName3 = membershipType2 != null ? membershipType2.name() : null;
        String str21 = registeredMemberRegistration.d;
        String str22 = registeredMemberRegistration.asBinder;
        Citizenship citizenship3 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (Intrinsics.areEqual(citizenship3 != null ? citizenship3.name() : null, "WNI")) {
            List<String> list3 = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
            Intrinsics.checkNotNull(list3);
            str2 = list3.get(0);
        }
        String str23 = str2;
        String str24 = registeredMemberRegistration.g;
        String str25 = registeredMemberRegistration.cancelAll;
        String str26 = (String) task.getResult();
        String str27 = registeredMemberRegistration.notify;
        Citizenship citizenship4 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (Intrinsics.areEqual(citizenship4 != null ? citizenship4.name() : null, "WNA")) {
            String str28 = registeredMemberRegistration.asInterface;
            if (str28 != null) {
                String upperCase = str28.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                str = upperCase;
            } else {
                str = null;
            }
        } else {
            str = "";
        }
        String strValueOf3 = String.valueOf(registeredMemberRegistration.INotificationSideChannel);
        File file7 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
        File file8 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 1);
        if (file8 == null) {
            file8 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
        }
        File file9 = file8;
        File file10 = (File) CollectionsKt.getOrNull(activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer, 2);
        if (file10 == null) {
            file10 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
        }
        File file11 = file10;
        File fileTuitionPaymentFragmentbindingInflater2 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
        if (fileTuitionPaymentFragmentbindingInflater2 == null) {
            fileTuitionPaymentFragmentbindingInflater2 = (File) CollectionsKt.firstOrNull((List) activityChooserModelActivityResolveInfo.RemoteActionCompatParcelizer);
        }
        File file12 = fileTuitionPaymentFragmentbindingInflater2;
        String str29 = activityChooserModelActivityResolveInfo.getRoot;
        String strValueOf4 = String.valueOf(activityChooserModelActivityResolveInfo.connect);
        String strValueOf5 = String.valueOf(activityChooserModelActivityResolveInfo.MediaBrowserCompat);
        String str30 = activityChooserModelActivityResolveInfo.read;
        String str31 = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str31, "");
        String str32 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str32, "");
        setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str18, new NewRegisterRequest(str19, string, strName2, strName3, str21, str22, str23, str24, str, str25, str26, str27, strValueOf3, str29, file7, file9, file11, file12, strValueOf5, strValueOf4, str30, str31, str32));
    }

    public static /* synthetic */ Unit b(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo, Boolean bool) {
        if (bool.booleanValue()) {
            checkShowingFlags checkshowingflags = (checkShowingFlags) activityChooserModelActivityResolveInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            FragmentActivity fragmentActivityRequireActivity = activityChooserModelActivityResolveInfo.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            checkshowingflags.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fragmentActivityRequireActivity);
        } else {
            Context contextRequireContext = activityChooserModelActivityResolveInfo.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = activityChooserModelActivityResolveInfo.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(contextRequireContext, string);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo) throws IOException {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) activityChooserModelActivityResolveInfo.a.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null && camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            activityChooserModelActivityResolveInfo.MediaBrowserCompat = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            activityChooserModelActivityResolveInfo.connect = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            activityChooserModelActivityResolveInfo.read = camera2CameraControlExternalSyntheticLambda4B.b;
            activityChooserModelActivityResolveInfo.IconCompatParcelizer = camera2CameraControlExternalSyntheticLambda4B.g;
            activityChooserModelActivityResolveInfo.write = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            activityChooserModelActivityResolveInfo.getExtras = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = activityChooserModelActivityResolveInfo.MediaBrowserCompat;
            String str2 = activityChooserModelActivityResolveInfo.connect;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        } else {
            activityChooserModelActivityResolveInfo.MediaBrowserCompat = "0.0";
            activityChooserModelActivityResolveInfo.connect = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(ActivityChooserModelActivityResolveInfo activityChooserModelActivityResolveInfo) {
        MembershipType membershipType;
        BookingAntreanFormActivity.Companion companion = BookingAntreanFormActivity.INSTANCE;
        Context contextRequireContext = activityChooserModelActivityResolveInfo.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        List<String> list = activityChooserModelActivityResolveInfo.INotificationSideChannelStubProxy;
        Intrinsics.checkNotNull(list);
        String str = list.get(0);
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
        String strName = null;
        String strValueOf = String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.asBinder : null);
        RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
        String strValueOf2 = String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.notify : null);
        RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
        String strValueOf3 = String.valueOf(registeredMemberRegistration3 != null ? registeredMemberRegistration3.MediaBrowserCompat : null);
        RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
        String strValueOf4 = String.valueOf(registeredMemberRegistration4 != null ? registeredMemberRegistration4.read : null);
        String strValueOf5 = String.valueOf(activityChooserModelActivityResolveInfo.MediaBrowserCompat);
        String strValueOf6 = String.valueOf(activityChooserModelActivityResolveInfo.connect);
        RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) activityChooserModelActivityResolveInfo.asBinder.getValue();
        if (registeredMemberRegistration5 != null && (membershipType = registeredMemberRegistration5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != null) {
            strName = membershipType.name();
        }
        BookingAntreanFormActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, str, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, "RES", strName, (String) activityChooserModelActivityResolveInfo.asInterface.getValue());
        return Unit.INSTANCE;
    }
}
