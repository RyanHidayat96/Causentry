package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat;
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
import com.bpjstku.data.registration.general.model.request.RegisterRequest;
import com.bpjstku.data.registration.general.model.request.VerifyBiometricRequest;
import com.bpjstku.data.registration.general.model.request.VerifyCountBiometricRequest;
import com.bpjstku.data.registration.general.model.response.VerifyBiometricResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.databinding.FragmentRegistrationBiometricBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.RegistrationBiometricFragment$bindingInflater$1;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004R\u0015\u0010\u0013\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0015\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0015\u0010\u001e\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0015\u0010\u0007\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0015\u0010\u0011\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0015\u0010$\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0017\u0010\u0017\u001a\u0004\u0018\u00010%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0015\u0010\u0006\u001a\u00020'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u0015\u0010\f\u001a\u00020)8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010+\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0018\u0010\u000b\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\n\u001a\u00020\u00148\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u0010\t\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010*R\u0018\u0010(\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u0010*R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020,088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020,0:8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0018\u00103\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0018\u0010!\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0018\u00101\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010*R\u0018\u00105\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010*R.\u0010#\u001a\u001c\u0012\u0004\u0012\u00020=\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00020<8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010?R\u0014\u0010;\u001a\u00020@8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b+\u0010A"}, d2 = {"LBrowserActionsFallbackMenuAdapter;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentRegistrationBiometricBinding;", "<init>", "()V", "", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "d", "", "p0", "Lid/vida/liveness/dto/VidaLivenessResponse;", "p1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "([BLid/vida/liveness/dto/VidaLivenessResponse;)V", "TuitionPaymentFragmentbindingInflater1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)V", "a", "LsetSplitTrack;", "RemoteActionCompatParcelizer", "Lkotlin/Lazy;", "LcheckShowingFlags;", "LIntegerRes;", "IconCompatParcelizer", "b", "LacquireBuffer;", "LgetUntrustedCreatorPackageName;", "connect", "LgetStreamUseCaseSupportedCombinationList;", "disconnect", "asInterface", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "notify", "LoutputFormatToAudioProfile;", "INotificationSideChannelStubProxy", "Lcom/bpjstku/data/lib/PreferenceManager;", "Ljava/lang/String;", "asBinder", "Ljava/io/File;", "getInterfaceDescriptor", "Ljava/io/File;", "read", "[B", "write", "", "MediaBrowserCompat", "Z", "getItem", "INotificationSideChannelStub", "INotificationSideChannelDefault", "", "Ljava/util/List;", "", "getNotifyChildrenChangedOptions", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BrowserActionsFallbackMenuAdapter extends AutoValue_CameraState_StateError<FragmentRegistrationBiometricBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private String getInterfaceDescriptor;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private boolean INotificationSideChannel;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String connect;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final List<File> INotificationSideChannelDefault;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final String asBinder;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String MediaBrowserCompat;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private File onTransact;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private String getItem;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private List<? extends File> INotificationSideChannelStub;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private byte[] notify;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String cancel;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getCancel() {
        return R.layout.fragment_registration_biometric;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public BrowserActionsFallbackMenuAdapter() {
        final BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.RegistrationBiometricFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = browserActionsFallbackMenuAdapter;
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<checkShowingFlags>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.RegistrationBiometricFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, checkShowingFlags] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ checkShowingFlags invoke() {
                LifecycleOwner lifecycleOwner = browserActionsFallbackMenuAdapter;
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
        final BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter2 = this;
        this.b = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.RegistrationBiometricFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = browserActionsFallbackMenuAdapter2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.RegistrationBiometricFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = browserActionsFallbackMenuAdapter2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter3 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.RegistrationBiometricFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = browserActionsFallbackMenuAdapter3.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.RegistrationBiometricFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(browserActionsFallbackMenuAdapter3, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asInterface = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.RegistrationBiometricFragment$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = browserActionsFallbackMenuAdapter;
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
        this.a = LazyKt.lazy(new Function0() { // from class: BrowserActionsFallbackMenuDialog
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.getValue();
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: buildOpenInBrowserAction
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrowserActionsFallbackMenuAdapter.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        Lazy lazy = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.RegistrationBiometricFragment$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = browserActionsFallbackMenuAdapter2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.d = lazy;
        this.asBinder = ((PreferenceManager) lazy.getValue()).getString("OCR_TRANSACTION_ID", "");
        this.INotificationSideChannelDefault = new ArrayList();
        this.INotificationSideChannelStub = CollectionsKt.emptyList();
        this.getItem = ExifInterface.GPS_DIRECTION_TRUE;
    }

    /* JADX INFO: renamed from: BrowserActionsFallbackMenuAdapter$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LBrowserActionsFallbackMenuAdapter$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "LBrowserActionsFallbackMenuAdapter;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LBrowserActionsFallbackMenuAdapter;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static BrowserActionsFallbackMenuAdapter TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new BrowserActionsFallbackMenuAdapter();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentRegistrationBiometricBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return RegistrationBiometricFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        MaterialButton materialButton = asInterface().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: startAnimation
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        CardView cardView = asInterface().cvLivenessCheck;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cardView, new Function0() { // from class: BrowserActionsFallbackMenuDialog1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.onTransact = null;
        this.INotificationSideChannel = false;
        this.INotificationSideChannelStub = CollectionsKt.toList(this.INotificationSideChannelDefault);
        this.INotificationSideChannelDefault.clear();
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] p0, VidaLivenessResponse p1) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(p0, 0, p0.length);
        FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBindingAsInterface = asInterface();
        fragmentRegistrationBiometricBindingAsInterface.imgLivenessCheck.setVisibility(8);
        fragmentRegistrationBiometricBindingAsInterface.tvLivenessCheckLabel.setVisibility(8);
        ImageView imageView = fragmentRegistrationBiometricBindingAsInterface.imgSelfiePhoto;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = fragmentRegistrationBiometricBindingAsInterface.imgSelfiePhoto;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmapDecodeByteArray);
        }
        this.cancelAll = p1.getTransactionId();
        this.getInterfaceDescriptor = String.valueOf(p1.getLivenessScore());
        this.INotificationSideChannelStubProxy = String.valueOf(p1.getManipulationScore());
        this.notify = p0;
        ((IntegerRes) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    private final void TuitionPaymentFragmentbindingInflater1() {
        this.notify = null;
        File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
            FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBindingAsInterface = asInterface();
        ImageView imageView = fragmentRegistrationBiometricBindingAsInterface.imgSelfiePhoto;
        if (imageView != null) {
            imageView.setImageResource(0);
        }
        fragmentRegistrationBiometricBindingAsInterface.imgLivenessCheck.setVisibility(0);
        fragmentRegistrationBiometricBindingAsInterface.tvLivenessCheckLabel.setVisibility(0);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "", p0, string, null, 112);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        if (Intrinsics.areEqual(p0, getString(R.string.error_message_selfie_photo_required))) {
            getstringornullB.INotificationSideChannel = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            BrowserActionsFallbackMenuAdapter.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            BrowserActionsFallbackMenuAdapter.INotificationSideChannel(BrowserActionsFallbackMenuAdapter.this);
        }
    }

    private final void a() {
        OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
        String string = getString(R.string.label_title_validation_account_dialog);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.label_message_validation_account_dialog);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.action_booking_antrean_online);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: BrowserActionsFallbackMenuUi1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
            }
        }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter) {
        if (browserActionsFallbackMenuAdapter.notify != null) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_next_step_second_asik", "submit_asik_step_second_ekyc"));
            Intrinsics.checkNotNullParameter("submit_asik_step_second_ekyc", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_asik_step_second_ekyc", mapMutableMapOf);
            if (browserActionsFallbackMenuAdapter.asInterface().btnNext.isEnabled()) {
                browserActionsFallbackMenuAdapter.d();
            }
        } else {
            browserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            ((IntegerRes) browserActionsFallbackMenuAdapter.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                browserActionsFallbackMenuAdapter.write();
                GetDataAntrianResponse getDataAntrianResponse = (GetDataAntrianResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                AntrianData data = getDataAntrianResponse.getData();
                if (Intrinsics.areEqual(getDataAntrianResponse.isSuccessful(), Boolean.TRUE) && data != null) {
                    BookingAntreanSuccessActivity.Companion companion = BookingAntreanSuccessActivity.INSTANCE;
                    Context contextRequireContext = browserActionsFallbackMenuAdapter.requireContext();
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
                    browserActionsFallbackMenuAdapter.a();
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                browserActionsFallbackMenuAdapter.write();
                BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter2 = browserActionsFallbackMenuAdapter;
                String str13 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str13 == null) {
                    str13 = "";
                }
                Intrinsics.checkNotNullParameter(browserActionsFallbackMenuAdapter2, "");
                Intrinsics.checkNotNullParameter(str13, "");
                BaseActivity baseActivity = (BaseActivity) browserActionsFallbackMenuAdapter2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, str13, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter, TwilightManager twilightManager) {
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
                Context contextRequireContext = browserActionsFallbackMenuAdapter.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                browserActionsFallbackMenuAdapter.INotificationSideChannelDefault.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageBytes, contextRequireContext));
            }
            for (byte[] bArr : list) {
                Intrinsics.checkNotNull(bArr);
                Context contextRequireContext2 = browserActionsFallbackMenuAdapter.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                browserActionsFallbackMenuAdapter.INotificationSideChannelDefault.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr, contextRequireContext2));
            }
            if (!browserActionsFallbackMenuAdapter.INotificationSideChannelDefault.isEmpty()) {
                browserActionsFallbackMenuAdapter.INotificationSideChannelStub = CollectionsKt.emptyList();
            } else {
                browserActionsFallbackMenuAdapter.INotificationSideChannelDefault.addAll(browserActionsFallbackMenuAdapter.INotificationSideChannelStub);
                browserActionsFallbackMenuAdapter.INotificationSideChannelStub = CollectionsKt.emptyList();
            }
            if (imageBytes != null) {
                browserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageBytes, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
            }
            browserActionsFallbackMenuAdapter.INotificationSideChannel = true;
        } else {
            if (!(twilightManager instanceof TwilightManager.TuitionPaymentFragmentbindingInflater1)) {
                throw new NoWhenBranchMatchedException();
            }
            TwilightManager.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager;
            if (tuitionPaymentFragmentbindingInflater1.b.getImageBytes() != null) {
                byte[] imageBytes2 = tuitionPaymentFragmentbindingInflater1.b.getImageBytes();
                if (imageBytes2 != null) {
                    browserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageBytes2, tuitionPaymentFragmentbindingInflater1.b);
                    browserActionsFallbackMenuAdapter.INotificationSideChannel = true;
                }
            } else {
                int i = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(": ");
                sb.append(str);
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), sb.toString(), 0).show();
                browserActionsFallbackMenuAdapter.INotificationSideChannelDefault.addAll(browserActionsFallbackMenuAdapter.INotificationSideChannelStub);
                browserActionsFallbackMenuAdapter.INotificationSideChannelStub = CollectionsKt.emptyList();
                browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            browserActionsFallbackMenuAdapter.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            browserActionsFallbackMenuAdapter.write();
            VerifyBiometricResponse verifyBiometricResponse = (VerifyBiometricResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List listSplit$default = StringsKt.split$default((CharSequence) verifyBiometricResponse.isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
            List listSplit$default2 = StringsKt.split$default((CharSequence) verifyBiometricResponse.isSuspend(), new String[]{"#"}, false, 0, 6, (Object) null);
            if ((Intrinsics.areEqual(listSplit$default.get(0), "true") && Intrinsics.areEqual(listSplit$default2.get(0), "true")) || (Intrinsics.areEqual(listSplit$default.get(0), "true") && Intrinsics.areEqual(listSplit$default2.get(0), "false"))) {
                browserActionsFallbackMenuAdapter.getItem = "Y";
                browserActionsFallbackMenuAdapter.d();
            } else if (Intrinsics.areEqual(listSplit$default.get(0), "false") && Intrinsics.areEqual(listSplit$default2.get(0), "true")) {
                browserActionsFallbackMenuAdapter.getItem = ExifInterface.GPS_DIRECTION_TRUE;
                browserActionsFallbackMenuAdapter.d();
            } else {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = browserActionsFallbackMenuAdapter.getString(R.string.message_sorry);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String message = verifyBiometricResponse.getMessage();
                String string2 = browserActionsFallbackMenuAdapter.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, message, string2, new Function0() { // from class: BrowserActionsFallbackMenuAdapter2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BrowserActionsFallbackMenuAdapter.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                }, 96);
                FragmentManager childFragmentManager = browserActionsFallbackMenuAdapter.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses Pendaftaran tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                browserActionsFallbackMenuAdapter.getItem = ExifInterface.GPS_DIRECTION_TRUE;
                if (browserActionsFallbackMenuAdapter.INotificationSideChannelDefault.isEmpty() && !browserActionsFallbackMenuAdapter.INotificationSideChannelStub.isEmpty()) {
                    browserActionsFallbackMenuAdapter.INotificationSideChannelDefault.addAll(browserActionsFallbackMenuAdapter.INotificationSideChannelStub);
                }
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                if (registeredMemberRegistration != null) {
                    setSplitTrack setsplittrack = (setSplitTrack) browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1.getValue();
                    String str = browserActionsFallbackMenuAdapter.asBinder;
                    String str2 = registeredMemberRegistration.asInterface;
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
                    File fileTuitionPaymentFragmentbindingInflater1 = (File) CollectionsKt.getOrNull(browserActionsFallbackMenuAdapter.INotificationSideChannelDefault, 0);
                    if (fileTuitionPaymentFragmentbindingInflater1 == null) {
                        fileTuitionPaymentFragmentbindingInflater1 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File file = fileTuitionPaymentFragmentbindingInflater1;
                    File fileTuitionPaymentFragmentbindingInflater2 = (File) CollectionsKt.getOrNull(browserActionsFallbackMenuAdapter.INotificationSideChannelDefault, 1);
                    if (fileTuitionPaymentFragmentbindingInflater2 == null) {
                        fileTuitionPaymentFragmentbindingInflater2 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File file2 = fileTuitionPaymentFragmentbindingInflater2;
                    File fileTuitionPaymentFragmentbindingInflater3 = (File) CollectionsKt.getOrNull(browserActionsFallbackMenuAdapter.INotificationSideChannelDefault, 2);
                    if (fileTuitionPaymentFragmentbindingInflater3 == null) {
                        fileTuitionPaymentFragmentbindingInflater3 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File fileTuitionPaymentFragmentbindingInflater4 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    String strValueOf = String.valueOf(browserActionsFallbackMenuAdapter.RemoteActionCompatParcelizer);
                    String strValueOf2 = String.valueOf(browserActionsFallbackMenuAdapter.MediaBrowserCompat);
                    String strValueOf3 = String.valueOf(browserActionsFallbackMenuAdapter.IconCompatParcelizer);
                    String str11 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str11, "");
                    String str12 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str12, "");
                    Context contextRequireContext = browserActionsFallbackMenuAdapter.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String string3 = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string3, "");
                    setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, new NewActivationRequest(str2, str3, str4, str5, str6, strName, str7, "fcmid997797656579", str8, str9, str10, file, file2, fileTuitionPaymentFragmentbindingInflater3, strValueOf, strValueOf2, strValueOf3, ExifInterface.GPS_DIRECTION_TRUE, fileTuitionPaymentFragmentbindingInflater4, str11, str12, string3));
                }
            } else {
                browserActionsFallbackMenuAdapter.write();
                browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1();
                browserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            }
        } else {
            browserActionsFallbackMenuAdapter.write();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter, Boolean bool) {
        if (!bool.booleanValue()) {
            Context contextRequireContext = browserActionsFallbackMenuAdapter.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = browserActionsFallbackMenuAdapter.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(contextRequireContext, string);
        } else {
            checkShowingFlags checkshowingflags = (checkShowingFlags) browserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            FragmentActivity fragmentActivityRequireActivity = browserActionsFallbackMenuAdapter.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            checkshowingflags.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fragmentActivityRequireActivity);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter) {
        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) browserActionsFallbackMenuAdapter.asInterface.getValue();
        String str = browserActionsFallbackMenuAdapter.asBinder;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
        getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(str, String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.asInterface : null));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ outputFormatToAudioProfile d(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter) {
        return new outputFormatToAudioProfile(browserActionsFallbackMenuAdapter);
    }

    public static /* synthetic */ Unit a(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter) {
        ((IntegerRes) browserActionsFallbackMenuAdapter.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            browserActionsFallbackMenuAdapter.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            browserActionsFallbackMenuAdapter.write();
            List listSplit$default = StringsKt.split$default((CharSequence) ((KeyResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum(), new String[]{"#"}, false, 0, 6, (Object) null);
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
            if (Intrinsics.areEqual(String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1 : null), listSplit$default.get(0))) {
                if (!browserActionsFallbackMenuAdapter.INotificationSideChannelDefault.isEmpty()) {
                    final setSplitTrack setsplittrack = (setSplitTrack) browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1.getValue();
                    String str = browserActionsFallbackMenuAdapter.asBinder;
                    String str2 = browserActionsFallbackMenuAdapter.cancel;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str2 = null;
                    }
                    Object obj = listSplit$default.get(2);
                    StringBuilder sb = new StringBuilder("JMO#");
                    sb.append(str2);
                    sb.append("#true#70#");
                    sb.append(obj);
                    String string = sb.toString();
                    String str3 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    Context contextRequireContext = browserActionsFallbackMenuAdapter.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String string2 = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string2, "");
                    String str4 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                    String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
                    String str5 = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(str5, "");
                    File file = (File) CollectionsKt.first((List) browserActionsFallbackMenuAdapter.INotificationSideChannelDefault);
                    File file2 = (File) CollectionsKt.getOrNull(browserActionsFallbackMenuAdapter.INotificationSideChannelDefault, 1);
                    if (file2 == null) {
                        file2 = (File) CollectionsKt.first((List) browserActionsFallbackMenuAdapter.INotificationSideChannelDefault);
                    }
                    File file3 = file2;
                    File file4 = (File) CollectionsKt.getOrNull(browserActionsFallbackMenuAdapter.INotificationSideChannelDefault, 2);
                    if (file4 == null) {
                        file4 = (File) CollectionsKt.first((List) browserActionsFallbackMenuAdapter.INotificationSideChannelDefault);
                    }
                    File file5 = file4;
                    RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                    String strValueOf2 = String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.asInterface : null);
                    RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                    String strValueOf3 = String.valueOf(registeredMemberRegistration3 != null ? registeredMemberRegistration3.TuitionPaymentFragmentbindingInflater1 : null);
                    RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                    String strValueOf4 = String.valueOf(registeredMemberRegistration4 != null ? registeredMemberRegistration4.g : null);
                    String str6 = browserActionsFallbackMenuAdapter.cancelAll;
                    String str7 = str6 == null ? "" : str6;
                    String str8 = browserActionsFallbackMenuAdapter.getInterfaceDescriptor;
                    String str9 = str8 == null ? "" : str8;
                    String str10 = browserActionsFallbackMenuAdapter.INotificationSideChannelStubProxy;
                    VerifyBiometricRequest verifyBiometricRequest = new VerifyBiometricRequest(string, str3, string2, str4, strValueOf, str5, file, file3, file5, strValueOf2, strValueOf3, strValueOf4, str7, str9, str10 == null ? "" : str10);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(verifyBiometricRequest, "");
                    MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData = setsplittrack.disconnect;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack.MediaBrowserCompat.b(str, verifyBiometricRequest)));
                    final Function1 function1 = new Function1() { // from class: getWrappedTypeArray
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setsplittrack, (VerifyBiometricResponse) obj2);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: hasValue
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function1.invoke(obj2);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: recycle
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return setSplitTrack.b(setsplittrack, (Throwable) obj2);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: peekValue
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function2.invoke(obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    setsplittrack.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    String string3 = browserActionsFallbackMenuAdapter.getString(R.string.error_message_selfie_photo_required);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    browserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string3);
                }
            } else {
                BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter2 = browserActionsFallbackMenuAdapter;
                String string4 = browserActionsFallbackMenuAdapter.getString(R.string.message_integrity_data);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                Intrinsics.checkNotNullParameter(browserActionsFallbackMenuAdapter2, "");
                Intrinsics.checkNotNullParameter(string4, "");
                BaseActivity baseActivity = (BaseActivity) browserActionsFallbackMenuAdapter2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string4, null);
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            browserActionsFallbackMenuAdapter.write();
            BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter3 = browserActionsFallbackMenuAdapter;
            String strValueOf5 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(browserActionsFallbackMenuAdapter3, "");
            Intrinsics.checkNotNullParameter(strValueOf5, "");
            BaseActivity baseActivity2 = (BaseActivity) browserActionsFallbackMenuAdapter3.getContext();
            if (baseActivity2 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf5, null);
            }
        } else {
            browserActionsFallbackMenuAdapter.write();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter) {
        BaseActivity baseActivity = browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter) {
        browserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        ((IntegerRes) browserActionsFallbackMenuAdapter.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).INotificationSideChannel.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: initMenuView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.b.getValue()).b.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: BrowserActionsFallbackMenuUi3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BrowserActionsFallbackMenuAdapter.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter = this;
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).cancelAll.observe(browserActionsFallbackMenuAdapter, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: onShow
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BrowserActionsFallbackMenuAdapter.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).getExtras.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: BrowserActionsFallbackMenuAdapterViewHolderItem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).disconnect.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setMenuUiListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getStreamUseCaseSupportedCombinationList) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(browserActionsFallbackMenuAdapter, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: BrowserActionsFallbackMenuView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        VideoRecordEventStart<TwilightManager> videoRecordEventStartHide = ((checkShowingFlags) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.hide();
        Intrinsics.checkNotNullExpressionValue(videoRecordEventStartHide, "");
        VideoRecordEventStart<TwilightManager> videoRecordEventStartObserveOn = videoRecordEventStartHide.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: onMenuShown
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1249449824;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BrowserActionsFallbackMenuAdapter.b(this.b, (TwilightManager) obj);
            }
        };
        logToString<? super TwilightManager> logtostring = new logToString() { // from class: BrowserActionsFallbackMenuUiBrowserActionsFallMenuUiListener
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getBrowserActionsIntentHandlers
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1((Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartObserveOn.subscribe(logtostring, new logToString() { // from class: BrowserActionsIntent
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
    }

    private final void d() {
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.a.getValue();
        ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.setValue(registeredMemberRegistration != null ? RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (File) CollectionsKt.getOrNull(this.INotificationSideChannelDefault, 0), (File) CollectionsKt.getOrNull(this.INotificationSideChannelDefault, 1), (File) CollectionsKt.getOrNull(this.INotificationSideChannelDefault, 2), null, null, null, null, 7929855) : null);
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: BrowserActionsFallbackMenuUi
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) throws Throwable {
                BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, task);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(final BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            browserActionsFallbackMenuAdapter.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            browserActionsFallbackMenuAdapter.write();
            outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) browserActionsFallbackMenuAdapter.g.getValue();
            String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
            final Function1 function1 = new Function1() { // from class: buildShareAction
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1(this.b, (Boolean) obj);
                }
            };
            BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: buildFallbackMenuItemList
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
            ((acquireBuffer) browserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses Pendaftaran tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                browserActionsFallbackMenuAdapter.getItem = ExifInterface.GPS_DIRECTION_TRUE;
                if (browserActionsFallbackMenuAdapter.INotificationSideChannelDefault.isEmpty() && !browserActionsFallbackMenuAdapter.INotificationSideChannelStub.isEmpty()) {
                    browserActionsFallbackMenuAdapter.INotificationSideChannelDefault.addAll(browserActionsFallbackMenuAdapter.INotificationSideChannelStub);
                }
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                if (registeredMemberRegistration != null) {
                    setSplitTrack setsplittrack = (setSplitTrack) browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1.getValue();
                    String str = browserActionsFallbackMenuAdapter.asBinder;
                    String string = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string, "");
                    String str2 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                    String str3 = registeredMemberRegistration.notify;
                    String str4 = registeredMemberRegistration.a;
                    String str5 = registeredMemberRegistration.asInterface;
                    String str6 = registeredMemberRegistration.d;
                    MembershipType membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String strName = membershipType != null ? membershipType.name() : null;
                    String str7 = registeredMemberRegistration.cancelAll;
                    Citizenship citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    String strName2 = citizenship != null ? citizenship.name() : null;
                    String str8 = registeredMemberRegistration.asBinder;
                    String str9 = registeredMemberRegistration.g;
                    String str10 = registeredMemberRegistration.INotificationSideChannel;
                    File fileTuitionPaymentFragmentbindingInflater1 = (File) CollectionsKt.getOrNull(browserActionsFallbackMenuAdapter.INotificationSideChannelDefault, 0);
                    if (fileTuitionPaymentFragmentbindingInflater1 == null) {
                        fileTuitionPaymentFragmentbindingInflater1 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File file = fileTuitionPaymentFragmentbindingInflater1;
                    File fileTuitionPaymentFragmentbindingInflater2 = (File) CollectionsKt.getOrNull(browserActionsFallbackMenuAdapter.INotificationSideChannelDefault, 1);
                    if (fileTuitionPaymentFragmentbindingInflater2 == null) {
                        fileTuitionPaymentFragmentbindingInflater2 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File file2 = fileTuitionPaymentFragmentbindingInflater2;
                    File fileTuitionPaymentFragmentbindingInflater3 = (File) CollectionsKt.getOrNull(browserActionsFallbackMenuAdapter.INotificationSideChannelDefault, 2);
                    if (fileTuitionPaymentFragmentbindingInflater3 == null) {
                        fileTuitionPaymentFragmentbindingInflater3 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    }
                    File fileTuitionPaymentFragmentbindingInflater4 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
                    String strValueOf = String.valueOf(browserActionsFallbackMenuAdapter.RemoteActionCompatParcelizer);
                    String strValueOf2 = String.valueOf(browserActionsFallbackMenuAdapter.MediaBrowserCompat);
                    String strValueOf3 = String.valueOf(browserActionsFallbackMenuAdapter.IconCompatParcelizer);
                    String str11 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str11, "");
                    String str12 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str12, "");
                    setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new NewRegisterRequest(string, str2, strName2, strName, str6, str8, str5, str9, str4, str7, "fcmid997797656579", str3, str10, ExifInterface.GPS_DIRECTION_TRUE, file, file2, fileTuitionPaymentFragmentbindingInflater3, fileTuitionPaymentFragmentbindingInflater4, strValueOf, strValueOf2, strValueOf3, str11, str12));
                }
            } else {
                browserActionsFallbackMenuAdapter.write();
                MaterialButton materialButton = browserActionsFallbackMenuAdapter.asInterface().btnNext;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                MaterialButton materialButton2 = materialButton;
                Intrinsics.checkNotNullParameter(materialButton2, "");
                materialButton2.setEnabled(true);
                browserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            }
        } else {
            browserActionsFallbackMenuAdapter.write();
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void INotificationSideChannel(final BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter) {
        Camera2CameraControlImplExternalSyntheticLambda5.Companion companion = Camera2CameraControlImplExternalSyntheticLambda5.INSTANCE;
        String string = browserActionsFallbackMenuAdapter.getString(R.string.title_term_and_condition);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = browserActionsFallbackMenuAdapter.getString(R.string.term_and_condition_biometric_dukcapil);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = browserActionsFallbackMenuAdapter.getString(R.string.action_next);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = browserActionsFallbackMenuAdapter.getString(R.string.action_cancel_id);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        Camera2CameraControlImplExternalSyntheticLambda5 camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlImplExternalSyntheticLambda5.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(R.drawable.ic_warning_2, string, string2, string3, new Function0() { // from class: getCreatorPackageName
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrowserActionsFallbackMenuAdapter.a(this.b);
            }
        }, string4, new Function0() { // from class: openBrowserAction
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.setCancelable(false);
        int i = browserActionsFallbackMenuAdapter.requireContext().getResources().getDisplayMetrics().heightPixels;
        FragmentManager childFragmentManager = browserActionsFallbackMenuAdapter.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.show(childFragmentManager, camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(i));
    }

    public static /* synthetic */ Unit b(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_time_server_biometric", "loading_time_server_biometric_asik"));
            Intrinsics.checkNotNullParameter("loading_time_server_biometric_asik", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_time_server_biometric_asik", mapMutableMapOf);
            browserActionsFallbackMenuAdapter.IconCompatParcelizer();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_time_server_asik", "success_time_server_biometric_asik"));
                Intrinsics.checkNotNullParameter("success_time_server_asik", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_time_server_asik", mapMutableMapOf2);
                browserActionsFallbackMenuAdapter.cancel = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
                if (!browserActionsFallbackMenuAdapter.INotificationSideChannel) {
                    setSplitTrack setsplittrack = (setSplitTrack) browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1.getValue();
                    String str = browserActionsFallbackMenuAdapter.asBinder;
                    RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                    String strValueOf = String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.INotificationSideChannel : null);
                    RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                    String strValueOf2 = String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null);
                    RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                    setsplittrack.TuitionPaymentFragmentbindingInflater1(str, new VerifyCountBiometricRequest(strValueOf, strValueOf2, String.valueOf(registeredMemberRegistration3 != null ? registeredMemberRegistration3.asInterface : null)));
                } else {
                    setSplitTrack setsplittrack2 = (setSplitTrack) browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1.getValue();
                    RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                    String str2 = registeredMemberRegistration4 != null ? registeredMemberRegistration4.TuitionPaymentFragmentbindingInflater1 : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("#registrasi");
                    String string = sb.toString();
                    RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                    setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new GenerateKeyRequest(string, String.valueOf(registeredMemberRegistration5 != null ? registeredMemberRegistration5.TuitionPaymentFragmentbindingInflater1 : null)));
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_time_server_asik", "failure_time_server_asik"));
                Intrinsics.checkNotNullParameter("failure_time_server_asik", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_time_server_asik", mapMutableMapOf3);
                browserActionsFallbackMenuAdapter.write();
                BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter2 = browserActionsFallbackMenuAdapter;
                String strValueOf3 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(browserActionsFallbackMenuAdapter2, "");
                Intrinsics.checkNotNullParameter(strValueOf3, "");
                BaseActivity baseActivity = (BaseActivity) browserActionsFallbackMenuAdapter2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf3, null);
                }
            } else {
                browserActionsFallbackMenuAdapter.write();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(final BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            browserActionsFallbackMenuAdapter.IconCompatParcelizer();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                browserActionsFallbackMenuAdapter.write();
                if (StringsKt.contains$default((CharSequence) ((BaseModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTuitionPaymentFragmentspecialinlinedviewModeldefault1().toString(), (CharSequence) "Terdapat pengajuan akun yang masih dalam proses, silakan tunggu hingga proses selesai.", false, 2, (Object) null)) {
                    OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
                    String string = browserActionsFallbackMenuAdapter.getString(R.string.label_verification_added);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String string2 = browserActionsFallbackMenuAdapter.getString(R.string.label_message_verification_added);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    String string3 = browserActionsFallbackMenuAdapter.getString(R.string.action_booking_antrean_online);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: buildCopyAction
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        }
                    }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
                    FragmentManager childFragmentManager = browserActionsFallbackMenuAdapter.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else if (!Intrinsics.areEqual(browserActionsFallbackMenuAdapter.getItem, "Y")) {
                    getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) browserActionsFallbackMenuAdapter.asInterface.getValue();
                    String str = browserActionsFallbackMenuAdapter.asBinder;
                    RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
                    getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(str, String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.asInterface : null));
                } else {
                    RegistrationSuccessActivity.Companion companion2 = RegistrationSuccessActivity.INSTANCE;
                    Context contextRequireContext = browserActionsFallbackMenuAdapter.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue());
                    BaseActivity baseActivity = browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1;
                    if (baseActivity != null) {
                        baseActivity.d_();
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                browserActionsFallbackMenuAdapter.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                if (!StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Terdapat pengajuan aktivasi yang masih dalam proses, silakan tunggu hingga proses selesai", false, 2, (Object) null)) {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
                } else {
                    browserActionsFallbackMenuAdapter.a();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        browserActionsFallbackMenuAdapter.RemoteActionCompatParcelizer = String.valueOf(userLocationComplete.b);
        browserActionsFallbackMenuAdapter.MediaBrowserCompat = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        browserActionsFallbackMenuAdapter.IconCompatParcelizer = str;
        browserActionsFallbackMenuAdapter.read = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        }
        browserActionsFallbackMenuAdapter.connect = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        browserActionsFallbackMenuAdapter.write = str4;
        String str5 = browserActionsFallbackMenuAdapter.RemoteActionCompatParcelizer;
        String str6 = browserActionsFallbackMenuAdapter.MediaBrowserCompat;
        String str7 = browserActionsFallbackMenuAdapter.IconCompatParcelizer;
        String str8 = browserActionsFallbackMenuAdapter.read;
        String str9 = browserActionsFallbackMenuAdapter.connect;
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

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Throwable th) throws IOException {
        getContentPaddingRight.TuitionPaymentFragmentbindingInflater1(th);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter, Task task) throws Throwable {
        CharSequence charSequence;
        RegisteredMemberRegistration registeredMemberRegistration;
        String string;
        String str;
        String str2;
        String string2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0 || (registeredMemberRegistration = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue()) == null) {
            return;
        }
        Citizenship citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String upperCase = "-";
        if (Intrinsics.areEqual(citizenship != null ? citizenship.name() : null, "WNA")) {
            MembershipType membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (Intrinsics.areEqual(membershipType != null ? membershipType.name() : null, "PU")) {
                setSplitTrack setsplittrack = (setSplitTrack) browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1.getValue();
                String str5 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str6 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                if (str6 != null) {
                    String lowerCase = str6.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (lowerCase != null) {
                        string2 = StringsKt.trim((CharSequence) lowerCase).toString();
                    } else {
                        string2 = null;
                    }
                } else {
                    string2 = null;
                }
                String strName = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1.name();
                String strName2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2.name();
                String str7 = registeredMemberRegistration.d;
                String str8 = registeredMemberRegistration.asBinder;
                if (Intrinsics.areEqual(registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1.name(), "WNI")) {
                    String str9 = registeredMemberRegistration.asInterface;
                    if (str9 != null) {
                        upperCase = str9.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                        str3 = upperCase;
                    } else {
                        str3 = null;
                    }
                } else {
                    str3 = upperCase;
                }
                String str10 = registeredMemberRegistration.g;
                String str11 = registeredMemberRegistration.cancelAll;
                String str12 = (String) task.getResult();
                String str13 = registeredMemberRegistration.notify;
                if (Intrinsics.areEqual(registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1.name(), "WNA")) {
                    String str14 = registeredMemberRegistration.asInterface;
                    if (str14 != null) {
                        String upperCase2 = str14.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                        str4 = upperCase2;
                    } else {
                        str4 = null;
                    }
                } else {
                    str4 = "";
                }
                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new RegisterRequest(str5, string2, strName, strName2, str7, str8, str3, str10, str4, str11, str12, str13, String.valueOf(registeredMemberRegistration.INotificationSideChannel), String.valueOf(browserActionsFallbackMenuAdapter.RemoteActionCompatParcelizer), String.valueOf(browserActionsFallbackMenuAdapter.MediaBrowserCompat), browserActionsFallbackMenuAdapter.IconCompatParcelizer));
                return;
            }
        }
        setSplitTrack setsplittrack2 = (setSplitTrack) browserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1.getValue();
        String str15 = browserActionsFallbackMenuAdapter.asBinder;
        String str16 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str17 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
        if (str17 != null) {
            String lowerCase2 = str17.toLowerCase(Locale.ROOT);
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
        String strName3 = citizenship2 != null ? citizenship2.name() : null;
        MembershipType membershipType2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String strName4 = membershipType2 != null ? membershipType2.name() : null;
        String str18 = registeredMemberRegistration.d;
        String str19 = registeredMemberRegistration.asBinder;
        Citizenship citizenship3 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (Intrinsics.areEqual(citizenship3 != null ? citizenship3.name() : null, "WNI")) {
            String str20 = registeredMemberRegistration.asInterface;
            if (str20 != null) {
                upperCase = str20.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                str = upperCase;
            } else {
                str = null;
            }
        } else {
            str = upperCase;
        }
        String str21 = registeredMemberRegistration.g;
        String str22 = registeredMemberRegistration.cancelAll;
        String str23 = (String) task.getResult();
        String str24 = registeredMemberRegistration.notify;
        Citizenship citizenship4 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (Intrinsics.areEqual(citizenship4 != null ? citizenship4.name() : null, "WNA")) {
            String str25 = registeredMemberRegistration.asInterface;
            if (str25 != null) {
                String upperCase3 = str25.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                str2 = upperCase3;
            } else {
                str2 = null;
            }
        } else {
            str2 = "";
        }
        String strValueOf = String.valueOf(registeredMemberRegistration.INotificationSideChannel);
        File file = (File) CollectionsKt.first((List) browserActionsFallbackMenuAdapter.INotificationSideChannelDefault);
        File file2 = (File) CollectionsKt.getOrNull(browserActionsFallbackMenuAdapter.INotificationSideChannelDefault, 1);
        if (file2 == null) {
            file2 = (File) CollectionsKt.first((List) browserActionsFallbackMenuAdapter.INotificationSideChannelDefault);
        }
        File file3 = file2;
        File file4 = (File) CollectionsKt.getOrNull(browserActionsFallbackMenuAdapter.INotificationSideChannelDefault, 2);
        if (file4 == null) {
            file4 = (File) CollectionsKt.first((List) browserActionsFallbackMenuAdapter.INotificationSideChannelDefault);
        }
        File fileTuitionPaymentFragmentbindingInflater1 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1();
        String str26 = browserActionsFallbackMenuAdapter.getItem;
        String strValueOf2 = String.valueOf(browserActionsFallbackMenuAdapter.MediaBrowserCompat);
        String strValueOf3 = String.valueOf(browserActionsFallbackMenuAdapter.RemoteActionCompatParcelizer);
        String str27 = browserActionsFallbackMenuAdapter.IconCompatParcelizer;
        String str28 = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str28, "");
        String str29 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str29, "");
        setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str15, new NewRegisterRequest(str16, string, strName3, strName4, str18, str19, str, str21, str2, str22, str23, str24, strValueOf, str26, file, file3, file4, fileTuitionPaymentFragmentbindingInflater1, strValueOf3, strValueOf2, str27, str28, str29));
    }

    public static /* synthetic */ Unit g(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter) throws IOException {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) browserActionsFallbackMenuAdapter.d.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null && camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            browserActionsFallbackMenuAdapter.RemoteActionCompatParcelizer = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            browserActionsFallbackMenuAdapter.MediaBrowserCompat = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            browserActionsFallbackMenuAdapter.IconCompatParcelizer = camera2CameraControlExternalSyntheticLambda4B.b;
            browserActionsFallbackMenuAdapter.read = camera2CameraControlExternalSyntheticLambda4B.g;
            browserActionsFallbackMenuAdapter.connect = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            browserActionsFallbackMenuAdapter.write = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = browserActionsFallbackMenuAdapter.RemoteActionCompatParcelizer;
            String str2 = browserActionsFallbackMenuAdapter.MediaBrowserCompat;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        } else {
            browserActionsFallbackMenuAdapter.RemoteActionCompatParcelizer = "0.0";
            browserActionsFallbackMenuAdapter.MediaBrowserCompat = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(BrowserActionsFallbackMenuAdapter browserActionsFallbackMenuAdapter) {
        MembershipType membershipType;
        BookingAntreanFormActivity.Companion companion = BookingAntreanFormActivity.INSTANCE;
        Context contextRequireContext = browserActionsFallbackMenuAdapter.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
        String strName = null;
        String strValueOf = String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.asInterface : null);
        RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
        String strValueOf2 = String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.asBinder : null);
        RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
        String strValueOf3 = String.valueOf(registeredMemberRegistration3 != null ? registeredMemberRegistration3.notify : null);
        RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
        String strValueOf4 = String.valueOf(registeredMemberRegistration4 != null ? registeredMemberRegistration4.MediaBrowserCompat : null);
        RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
        String strValueOf5 = String.valueOf(registeredMemberRegistration5 != null ? registeredMemberRegistration5.read : null);
        String strValueOf6 = String.valueOf(browserActionsFallbackMenuAdapter.RemoteActionCompatParcelizer);
        String strValueOf7 = String.valueOf(browserActionsFallbackMenuAdapter.MediaBrowserCompat);
        RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) browserActionsFallbackMenuAdapter.a.getValue();
        if (registeredMemberRegistration6 != null && (membershipType = registeredMemberRegistration6.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != null) {
            strName = membershipType.name();
        }
        BookingAntreanFormActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, "REG", strName, browserActionsFallbackMenuAdapter.asBinder);
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: displayMenu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BrowserActionsFallbackMenuAdapter.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: BrowserActionsFallbackMenuUi2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static short[] f92a;
            private static final byte[] $$c = {111, 40, 23, -13};
            private static final int $$f = 38;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {14, 116, 92, -78, -7, -8, 5, 0, -8, Base64.padSymbol, -72, 11, -15, -7, 13, -12, 8, -5, -17, 66, -40, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 18, -3, -3, 9, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 77, -76, 1, -8, -10, -1, 76, -16, 10, -3, -36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 46, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 62};
            private static final int $$e = 239;
            private static final byte[] $$a = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 94;
            private static int d = 0;
            private static int g = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1090649966;
            private static int b = -1934795632;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1250392650;
            private static byte[] TuitionPaymentFragmentbindingInflater1 = {70, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, ByteCompanionObject.MAX_VALUE, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 66, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 122, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, 124, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 124, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r7, byte r8, int r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 14
                    int r7 = r7 + 84
                    int r8 = r8 + 4
                    int r9 = 53 - r9
                    byte[] r0 = defpackage.BrowserActionsFallbackMenuUi2.$$a
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r7 = r8
                    r3 = r9
                    r5 = r2
                    goto L2a
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r7
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r9) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L23:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L2a:
                    int r8 = r8 + r3
                    int r8 = r8 + (-10)
                    r3 = r5
                    r6 = r8
                    r8 = r7
                    r7 = r6
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.BrowserActionsFallbackMenuUi2.c(byte, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void f(byte r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 23
                    int r0 = 76 - r7
                    int r8 = r8 * 23
                    int r8 = 107 - r8
                    int r6 = r6 * 75
                    int r6 = 79 - r6
                    byte[] r1 = defpackage.BrowserActionsFallbackMenuUi2.$$d
                    byte[] r0 = new byte[r0]
                    int r7 = 75 - r7
                    r2 = 0
                    if (r1 != 0) goto L19
                    r3 = r8
                    r4 = r2
                    r8 = r6
                    goto L2f
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L29:
                    r3 = r1[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r3
                    r3 = r5
                L2f:
                    int r6 = -r6
                    int r8 = r8 + 1
                    int r3 = r3 + r6
                    int r6 = r3 + (-3)
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.BrowserActionsFallbackMenuUi2.f(byte, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:39:0x01a3 A[PHI: r0
  0x01a3: PHI (r0v12 int) = (r0v11 int), (r0v42 int) binds: [B:38:0x01a1, B:35:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:40:0x01a5 A[PHI: r0
  0x01a5: PHI (r0v39 int) = (r0v11 int), (r0v42 int) binds: [B:38:0x01a1, B:35:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
            private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                int i4;
                int i5;
                int length;
                byte[] bArr;
                int i6 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2267;
                        int defaultSize = 33 - View.getDefaultSize(0, 0);
                        byte length2 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, absoluteGravity, defaultSize, 1387473586, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    boolean z = iIntValue == -1;
                    if (z) {
                        int i7 = $11 + 105;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        byte[] bArr2 = TuitionPaymentFragmentbindingInflater1;
                        if (bArr2 != null) {
                            int length3 = bArr2.length;
                            byte[] bArr3 = new byte[length3];
                            for (int i9 = 0; i9 < length3; i9++) {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 3358 - KeyEvent.getDeadChar(0, 0), View.resolveSizeAndState(0, 0, 0) + 18, -1054011043, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                bArr3[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            }
                            bArr2 = bArr3;
                        }
                        if (bArr2 != null) {
                            int i10 = $10 + 107;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2267;
                                int i12 = 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                byte length4 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, doubleTapTimeout, i12, 1387473586, false, $$g((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                        } else {
                            iIntValue = (short) (((short) (((long) f92a[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        int i13 = $10 + 53;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            i4 = ((i3 % iIntValue) >>> 4) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L));
                            if (!(!z)) {
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                        } else {
                            i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L));
                            if (z) {
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (ViewConfiguration.getPressedStateDuration() >> 16)), 2855 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 13 - KeyEvent.getDeadChar(0, 0), -1529949196, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr5 = TuitionPaymentFragmentbindingInflater1;
                        if (bArr5 != null) {
                            int i14 = $10 + 35;
                            $11 = i14 % 128;
                            if (i14 % 2 == 0) {
                                length = bArr5.length;
                                bArr = new byte[length];
                            } else {
                                length = bArr5.length;
                                bArr = new byte[length];
                            }
                            int i15 = 0;
                            while (i15 < length) {
                                int i16 = $11 + 69;
                                $10 = i16 % 128;
                                if (i16 % 2 != 0) {
                                    bArr[i15] = (byte) (((long) bArr5[i15]) - 3046761265686732006L);
                                    i15 %= 1;
                                } else {
                                    bArr[i15] = (byte) (((long) bArr5[i15]) ^ 3046761265686732006L);
                                    i15++;
                                }
                            }
                            bArr5 = bArr;
                        }
                        boolean z2 = bArr5 != null;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            int i17 = $10 + 15;
                            $11 = i17 % 128;
                            if (i17 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (z2) {
                                byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                                int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                            } else {
                                short[] sArr = f92a;
                                int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    }
                    objArr[0] = sb.toString();
                    int i20 = $10 + 31;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            /* JADX WARN: Code duplicated, block: B:26:0x02ac  */
            /* JADX WARN: Code duplicated, block: B:27:0x02ae  */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 31533);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                    byte[] bArr = $$a;
                    byte b2 = bArr[37];
                    byte b3 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    c(b2, b3, (byte) (b3 & 52), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, threadPriority, maximumFlingVelocity, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                e((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 970316015, (-120) - TextUtils.lastIndexOf("", '0'), (short) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 844323959, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                e((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 970316012, (-119) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (byte) TextUtils.getCapsMode("", 0, 0), TextUtils.lastIndexOf("", '0', 0) + 844323983, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31533);
                    int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i2 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[80];
                    byte b5 = b4;
                    Object[] objArr5 = new Object[1];
                    c(b4, bArr2[7], b5, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, longPressTimeout, i2, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i3 = d + 111;
                    g = i3 % 128;
                    int i4 = i3 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[80];
                        Object[] objArr6 = new Object[1];
                        c(b6, (byte) (b6 | 51), bArr3[33], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, keyRepeatTimeout, iIndexOf, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i5 = (-403930261) + (((~((-564431152) | iIdentityHashCode)) | 33068 | (~((-1209648493) | iIdentityHashCode))) * (-880));
                    int i6 = (~((-564431152) | (~iIdentityHashCode))) | 1209648492;
                    int i7 = ~(iIdentityHashCode | 564431151);
                    int i8 = i5 + ((i6 | i7) * (-880)) + (i7 * 880) + 971579803;
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    e((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 970316015, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 119, (short) (Color.rgb(0, 0, 0) + 16777216), (byte) (ViewConfiguration.getTapTimeout() >> 16), 844323997 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    e((-970316013) - View.resolveSizeAndState(0, 0, 0), Process.getGidForName("") - 118, (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 844324023, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i11 = d + 7;
                        int i12 = i11 % 128;
                        g = i12;
                        int i13 = i11 % 2;
                        if (applicationContext instanceof ContextWrapper) {
                            int i14 = i12 + 7;
                            d = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i15 = 54 / 0;
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
                    e((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 970316006, (-119) - Color.green(0), (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (byte) TextUtils.getOffsetAfter("", 0), 844324041 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e((-970316007) - ExpandableListView.getPackedPositionType(0L), (-119) - View.resolveSizeAndState(0, 0, 0), (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 844324057, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 971579803};
                        byte[] bArr4 = $$d;
                        byte b7 = bArr4[47];
                        byte b8 = bArr4[7];
                        Object[] objArr13 = new Object[1];
                        f(b7, b8, b8, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b9 = bArr4[7];
                        byte b10 = bArr4[47];
                        Object[] objArr14 = new Object[1];
                        f(b9, b10, b10, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
                            int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                            byte[] bArr5 = $$a;
                            byte b11 = bArr5[80];
                            Object[] objArr16 = new Object[1];
                            c(b11, (byte) (b11 | 51), bArr5[33], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, scrollDefaultDelay, pressedStateDuration, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            e(TextUtils.indexOf((CharSequence) "", '0') - 970316014, (-118) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) Color.alpha(0), 844323959 - TextUtils.indexOf((CharSequence) "", '0'), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            e((Process.myTid() >> 22) - 970316011, (-119) - (ViewConfiguration.getEdgeSlop() >> 16), (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), 844323981 - Process.getGidForName(""), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c2 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                int trimmedLength = TextUtils.getTrimmedLength("") + 921;
                                int maximumFlingVelocity2 = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                byte[] bArr6 = $$a;
                                byte b12 = bArr6[80];
                                Object[] objArr19 = new Object[1];
                                c(b12, bArr6[7], b12, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, trimmedLength, maximumFlingVelocity2, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char keyRepeatTimeout2 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                                int iIndexOf2 = 921 - TextUtils.indexOf("", "");
                                int iMyTid = (Process.myTid() >> 22) + 28;
                                byte[] bArr7 = $$a;
                                byte b13 = bArr7[37];
                                byte b14 = bArr7[7];
                                Object[] objArr20 = new Object[1];
                                c(b13, b14, (byte) (b14 & 52), objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout2, iIndexOf2, iMyTid, -1048449946, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i16 = g + 63;
                            d = i16 % 128;
                            int i17 = i16 % 2;
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
                int i18 = ((int[]) objArr[1])[0];
                int i19 = ((int[]) objArr[3])[0];
                if (i19 != i18) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i20 = g + 29;
                        d = i20 % 128;
                        int i21 = i20 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i19));
                }
                int i22 = ((int[]) objArr[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i23 = ~((-285212674) | iMaxMemory);
                int i24 = i22 + 2043700279 + ((69226130 | i23) * (-476)) + (i23 * 952) + ((~((~iMaxMemory) | (-285212674))) * 476);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr21[0])[0] = i26 ^ (i26 << 5);
                return BrowserActionsFallbackMenuAdapter.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }

            private static String $$g(byte b2, int i, byte b3) {
                int i2 = 121 - i;
                int i3 = (b3 * 3) + 4;
                byte[] bArr = $$c;
                int i4 = b2 * 3;
                byte[] bArr2 = new byte[1 - i4];
                int i5 = 0 - i4;
                int i6 = -1;
                if (bArr == null) {
                    i2 += i5;
                    i3++;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i5) {
                        return new String(bArr2, 0);
                    }
                    i2 += bArr[i3];
                    i3++;
                }
            }
        });
    }
}
