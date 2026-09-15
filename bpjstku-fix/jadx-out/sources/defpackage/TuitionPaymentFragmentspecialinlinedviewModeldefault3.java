package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.compose.material3.CalendarModelKt;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.request.CheckRecurringStatusRequest;
import com.bpjstku.data.payment.model.response.GetStatusRecurringPlanResponse;
import com.bpjstku.data.payment.model.response.RecurringProfile;
import com.bpjstku.data.tuition.model.request.TuitionPaymentRequest;
import com.bpjstku.databinding.FragmentTuitionPaymentBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.tuition.model.BpuCheckPaymentItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.payment.PaymentActivity;
import com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity;
import com.bpjstku.presentation.tuition.TuitionPaymentDetailActivity;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.presentation.tuition.model.SelectedTuitionPayment;
import com.bpjstku.util.constant.MembershipType;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0015\u0010\u0000\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0000\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\rR\u0015\u0010\u0012\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0015\u0010\u001a\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0015\u0010\u001c\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010\u0000\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010 R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010 R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010 R\u0016\u0010\t\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010\n\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010+R\u0016\u0010\u0006\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010+R\u0016\u0010\u001f\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010+R\u0016\u0010\b\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0018\u0010\u0016\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010,R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0000\u0010 R\u0017\u0010!\u001a\u0004\u0018\u00010-8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b.\u0010\u0017R\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010 R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u000201008\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u00102R\u001a\u0010%\u001a\u00020\u00118\u0015X\u0095D¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001d\u00103R.\u0010/\u001a\u001c\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0002048UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u00107"}, d2 = {"LTuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentTuitionPaymentBinding;", "<init>", "()V", "", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "cancelAll", "onTransact", "", "p0", "(Ljava/lang/String;)V", "g", "INotificationSideChannel", "cancel", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(I)I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LListPopupWindow2;", "INotificationSideChannelStub", "Lkotlin/Lazy;", "LInputConfigurationCompat;", "connect", "b", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "asBinder", "I", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "read", "asInterface", "d", "a", "write", "notify", "MediaBrowserCompat", "", "Z", "", "D", "Ljava/lang/Double;", "Lcom/bpjstku/domain/user/model/User;", "getNotifyChildrenChangedOptions", "IconCompatParcelizer", "", "Lcom/bpjstku/presentation/tuition/model/SelectedTuitionPayment;", "Ljava/util/List;", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends AutoValue_ImmutableImageInfo<FragmentTuitionPaymentBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private double onTransact;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private boolean cancelAll;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private double INotificationSideChannelDefault;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private double RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String asInterface = "";

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String d = "";

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private String g = "";

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private String asBinder = "";

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String a = "";

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String notify = "";

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private String cancel = "";

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String INotificationSideChannel = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String getInterfaceDescriptor = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Double INotificationSideChannelStub = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String INotificationSideChannelStubProxy = "";

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private final Lazy read = LazyKt.lazy(new Function0() { // from class: getInterfaceDescriptor
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String MediaBrowserCompat = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public List<SelectedTuitionPayment> connect = new ArrayList();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final int write = R.layout.fragment_tuition_payment;

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int p0) {
        if (p0 == R.id.rbOneMonthPeriod) {
            return 1;
        }
        if (p0 == R.id.rbSixMonthPeriod) {
            return 6;
        }
        switch (p0) {
            case R.id.rbThreeMonthPeriod /* 2131429155 */:
                return 3;
            case R.id.rbTwelveMonthPeriod /* 2131429156 */:
                return 12;
            case R.id.rbTwoMonthPeriod /* 2131429157 */:
                return 2;
            default:
                return 1;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        final TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: TuitionPaymentFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListPopupWindow2.class);
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
        this.b = LazyKt.lazy(new Function0<InputConfigurationCompat>() { // from class: TuitionPaymentFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [InputConfigurationCompat, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ InputConfigurationCompat invoke() {
                LifecycleOwner lifecycleOwner = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputConfigurationCompat.class);
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
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: TuitionPaymentFragment$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
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
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LTuitionPaymentFragmentspecialinlinedviewModeldefault3;", "()LTuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getCancel() {
        return this.write;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentTuitionPaymentBinding> d() {
        return TuitionPaymentFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik_max_length);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16)})));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnPaymentProcess;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        final FragmentTuitionPaymentBinding fragmentTuitionPaymentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentTuitionPaymentBindingINotificationSideChannelStub.btnPaymentProcess;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        EditText editText = fragmentTuitionPaymentBindingINotificationSideChannelStub.tilIdNumber.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: notify
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragmentTuitionPaymentBindingINotificationSideChannelStub, view);
                }
            });
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        User user = (User) this.read.getValue();
        retrieveConcurrentCameraIds.b(textInputLayout, user != null ? user.b : null);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentTuitionPaymentBinding fragmentTuitionPaymentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentTuitionPaymentBindingINotificationSideChannelStub.btnPaymentProcess;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, fragmentTuitionPaymentBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        fragmentTuitionPaymentBindingINotificationSideChannelStub.rgPaymentPeriod.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: asBinder
            private static final byte[] $$c = {25, 31, 20, 1};
            private static final int $$d = 107;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {7, 15, 25, 25, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
            private static final int $$b = 79;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int b = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59742, 59804, 59770, 59786, 59817, 59764, 59761, 59804, 59798, 59818, 59799, 59793, 59795, 59804, 59795, 59793, 59797, 59779, 59778, 59793, 59798, 59823, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747};

            /* JADX WARN: Code duplicated, block: B:10:0x002b  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
                /*
                    int r5 = r5 + 4
                    int r7 = r7 * 3
                    int r0 = r7 + 53
                    byte[] r1 = defpackage.asBinder.$$a
                    int r6 = r6 * 4
                    int r6 = r6 + 84
                    byte[] r0 = new byte[r0]
                    int r7 = r7 + 52
                    r2 = -1
                    if (r1 != 0) goto L16
                    r3 = r2
                    r2 = r5
                    goto L31
                L16:
                    r4 = r6
                    r6 = r5
                    r5 = r4
                L19:
                    int r2 = r2 + 1
                    byte r3 = (byte) r5
                    r0[r2] = r3
                    int r6 = r6 + 1
                    if (r2 != r7) goto L2b
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r0, r6)
                    r8[r6] = r5
                    return
                L2b:
                    r3 = r1[r6]
                    r4 = r2
                    r2 = r6
                    r6 = r3
                    r3 = r4
                L31:
                    int r6 = -r6
                    int r5 = r5 + r6
                    int r5 = r5 + (-11)
                    r6 = r2
                    r2 = r3
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.asBinder.c(short, int, short, java.lang.Object[]):void");
            }

            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) throws Throwable {
                int i2;
                int i3 = 2 % 2;
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                b = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 46401), 40 - Drawable.resolveOpacity(0, 0), 19 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object[] objArr = new Object[1];
                a(new int[]{0, 22, 49, 13}, true, new byte[]{0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr2);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                long j = 988;
                long j2 = (int) Runtime.getRuntime().totalMemory();
                long j3 = -1;
                long j4 = ((j3 ^ 1739756236006242953L) | 357500938735716034L) ^ j3;
                int i7 = i6;
                long j5 = j3 ^ 357500938735716034L;
                long j6 = j2 ^ j3;
                long j7 = (((long) (-1975)) * 1739756236006242953L) + (((long) 989) * 357500938735716034L) + ((j2 | j4) * j) + (((long) (-1976)) * (((j5 | 1739756236006242953L) ^ j3) | ((j6 | 1739756236006242953L) ^ j3))) + (j * (j4 | ((j5 | j2) ^ j3) | ((j6 | 357500938735716034L) ^ j3)));
                int i8 = 0;
                while (true) {
                    if (i8 == 10) {
                        try {
                            Object[] objArr3 = {1231302947};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 46038), 1134 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                            }
                            Object[] objArr4 = {Integer.valueOf(i), 0, -1788873968, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                int scrollBarFadeDuration2 = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                byte[] bArr = $$a;
                                byte b2 = (byte) (-bArr[5]);
                                byte b3 = bArr[7];
                                Object[] objArr5 = new Object[1];
                                c(b2, b3, b3, objArr5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, iMakeMeasureSpec, scrollBarFadeDuration2, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ExpandableListView.getPackedPositionGroup(0L)), 1117 - (KeyEvent.getMaxKeyCode() >> 16), Color.green(0) + 17), Boolean.TYPE});
                            }
                            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            int i9 = ((int[]) objArr6[1])[0];
                            int i10 = ((int[]) objArr6[3])[0];
                            if (i10 == i9) {
                                break;
                            }
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr6[0];
                            if (strArr != null) {
                                for (String str : strArr) {
                                    arrayList.add(str);
                                }
                            }
                            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
                            break;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i11 = b + 1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    if (i11 % 2 != 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - KeyEvent.keyCodeFromString("")), 59 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 18 - View.getDefaultSize(0, 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                    } else {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37836), (ViewConfiguration.getScrollBarSize() >> 8) + 59, (ViewConfiguration.getScrollBarSize() >> 8) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).getInt(null);
                    }
                    long j8 = jLongValue;
                    int i12 = 0;
                    while (true) {
                        int i13 = 0;
                        while (i13 != 8) {
                            int i14 = b + 67;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                            if (i14 % 2 != 0) {
                                i2 += ((((int) (j8 >> i13)) & 11822) << (i2 + 77)) << (i2 << 16);
                                i13 += 110;
                            } else {
                                i2 = (((((int) (j8 >> i13)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
                                i13++;
                            }
                        }
                        if (i12 != 0) {
                            break;
                        }
                        i12++;
                        j8 = j7;
                    }
                    int i15 = i7;
                    if (i2 == i15) {
                        break;
                    }
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    jLongValue -= 1024;
                    i8++;
                    i7 = i15;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
                Intrinsics.checkNotNullParameter(radioGroup, "");
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i2 = 0;
                int i3 = iArr[0];
                int i4 = 1;
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                long j = 0;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 119;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        try {
                            Object[] objArr2 = new Object[i4];
                            objArr2[i2] = Integer.valueOf(cArr[i8]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cAxisFromString = (char) (MotionEvent.axisFromString("") + i4);
                                int iResolveOpacity = 1270 - Drawable.resolveOpacity(i2, i2);
                                int i11 = 18 - (ExpandableListView.getPackedPositionForGroup(i2) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(i2) == j ? 0 : -1));
                                byte b2 = $$c[3];
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, iResolveOpacity, i11, 407021364, false, $$e((byte) (b2 - 1), (byte) (-b2), b2), new Class[]{Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i8++;
                            i2 = 0;
                            i4 = 1;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i5];
                System.arraycopy(cArr, i3, cArr3, 0, i5);
                if (bArr != null) {
                    char[] cArr4 = new char[i5];
                    setvideostabilizationmode.b = 0;
                    char c = 0;
                    while (setvideostabilizationmode.b < i5) {
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i12 = setvideostabilizationmode.b;
                            Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int mode = View.MeasureSpec.getMode(0) + 3225;
                                int i13 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13;
                                byte b3 = $$c[3];
                                byte b4 = (byte) (b3 - 1);
                                byte b5 = (byte) (-b3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, mode, i13, 2133916302, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        } else {
                            int i14 = setvideostabilizationmode.b;
                            try {
                                Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                                    int i15 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                                    byte b6 = $$c[3];
                                    byte b7 = (byte) (b6 - 1);
                                    byte b8 = (byte) (-b6);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i15, minimumFlingVelocity, 387247676, false, $$e(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        c = cArr4[setvideostabilizationmode.b];
                        Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char offsetBefore = (char) (41241 - TextUtils.getOffsetBefore("", 0));
                            int iMakeMeasureSpec = 1705 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            int scrollBarFadeDuration = 21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte b9 = $$c[3];
                            byte b10 = (byte) (b9 - 1);
                            byte b11 = (byte) (-b9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, iMakeMeasureSpec, scrollBarFadeDuration, -1434471773, false, $$e(b10, b11, (byte) (b11 & 6)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    cArr3 = cArr4;
                }
                if (i7 > 0) {
                    char[] cArr5 = new char[i5];
                    System.arraycopy(cArr3, 0, cArr5, 0, i5);
                    int i16 = i5 - i7;
                    System.arraycopy(cArr5, 0, cArr3, i16, i7);
                    System.arraycopy(cArr5, i7, cArr3, 0, i16);
                }
                if (z) {
                    int i17 = $10 + 5;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    char[] cArr6 = new char[i5];
                    int i19 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i19;
                        if (setvideostabilizationmode.b >= i5) {
                            break;
                        }
                        cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                        i19 = setvideostabilizationmode.b + 1;
                    }
                    cArr3 = cArr6;
                }
                if (i6 > 0) {
                    int i20 = $10 + 61;
                    $11 = i20 % 128;
                    if (i20 % 2 == 0) {
                        setvideostabilizationmode.b = 0;
                    } else {
                        setvideostabilizationmode.b = 0;
                    }
                    while (setvideostabilizationmode.b < i5) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        setvideostabilizationmode.b++;
                    }
                }
                objArr[0] = new String(cArr3);
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
            private static java.lang.String $$e(int r6, byte r7, int r8) {
                /*
                    int r8 = r8 + 99
                    int r7 = r7 + 4
                    byte[] r0 = defpackage.asBinder.$$c
                    int r6 = r6 * 2
                    int r1 = 1 - r6
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r0 != 0) goto L15
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    int r7 = r7 + 1
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    r4 = r0[r7]
                    int r3 = r3 + 1
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r7 = r7 + r3
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.asBinder.$$e(int, byte, int):java.lang.String");
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        final FragmentTuitionPaymentBinding fragmentTuitionPaymentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        this.connect.add(0, new SelectedTuitionPayment("tuition01", "Iuran Lanjutan", false));
        this.connect.add(1, new SelectedTuitionPayment("tuition02", "Auto Debit", false));
        RecyclerView recyclerView = fragmentTuitionPaymentBindingINotificationSideChannelStub.rvListMethodPayment;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        recyclerView.setAdapter(new OutputConfigurationCompatApi24Impl(contextRequireContext, this.connect, new Function1() { // from class: cancel
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentTuitionPaymentBindingINotificationSideChannelStub, (SelectedTuitionPayment) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
        Context contextRequireContext = tuitionPaymentFragmentspecialinlinedviewModeldefault3.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, false, false, 6);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        User user = (User) tuitionPaymentFragmentspecialinlinedviewModeldefault3.read.getValue();
        if (user != null) {
            String strValueOf = String.valueOf(user.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            TextInputLayout textInputLayout = tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub().tilIdNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            TuitionPaymentRequest tuitionPaymentRequest = new TuitionPaymentRequest(strValueOf, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3), "", retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout));
            final InputConfigurationCompat inputConfigurationCompat = (InputConfigurationCompat) tuitionPaymentFragmentspecialinlinedviewModeldefault3.b.getValue();
            Intrinsics.checkNotNullParameter(tuitionPaymentRequest, "");
            MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> mutableLiveData = inputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(inputConfigurationCompat.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentRequest)));
            final Function1 function1 = new Function1() { // from class: getMirrorMode
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(inputConfigurationCompat, (BpuCheckPaymentItem) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: setMirrorMode
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: InputConfigurationCompatInputConfigurationCompatApi31Impl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(inputConfigurationCompat, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getSurfaces
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            inputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, FragmentTuitionPaymentBinding fragmentTuitionPaymentBinding, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.MediaBrowserCompat.length() == 0) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Silahkan pilih jenis pembayaran iuran", 0).show();
        } else {
            if (Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault3.MediaBrowserCompat, "tuition01")) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy = "iuran_lanjutan";
                EditText editText = fragmentTuitionPaymentBinding.tilIdNumber.getEditText();
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString());
            } else {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy = "auto_debit";
                EditText editText2 = fragmentTuitionPaymentBinding.tilIdNumber.getEditText();
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString());
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
            str = "loading_get_tuition_payment_detail";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Function0 function0 = new Function0() { // from class: INotificationSideChannelDefault
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity = (BaseActivity) tuitionPaymentFragmentspecialinlinedviewModeldefault4.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, function0);
            }
            str = "failure_get_tuition_payment_detail";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancelAll);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelDefault = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.RemoteActionCompatParcelizer = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.a = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).RemoteActionCompatParcelizer);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).IconCompatParcelizer);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStubProxy.toString();
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getInterfaceDescriptor);
            String str2 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).write;
            Intrinsics.checkNotNull(str2);
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "JHT", false, 2, (Object) null)) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.d = "L";
            } else {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.d = ExifInterface.GPS_DIRECTION_TRUE;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.g = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).write);
            TuitionPaymentDetailActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentDetailActivity.INSTANCE;
            Context contextRequireContext = tuitionPaymentFragmentspecialinlinedviewModeldefault3.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            TuitionPaymentDetailActivity.Companion.b(contextRequireContext, (BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            str = "success_get_tuition_payment_detail";
        } else {
            str = "";
        }
        FragmentActivity activity = tuitionPaymentFragmentspecialinlinedviewModeldefault3.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_tuition_payment", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ void b(final TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Boolean bool = Boolean.FALSE;
        String str2 = "";
        if (z) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
            str2 = "loading_check_recurring_status";
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.write();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Function0 function0 = new Function0() { // from class: g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity = (BaseActivity) tuitionPaymentFragmentspecialinlinedviewModeldefault4.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, function0);
                }
                str = "failure_check_recurring_status";
                str2 = "";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.write();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                Integer statusCode = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatusCode();
                if (statusCode != null && statusCode.intValue() == 100) {
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll) {
                        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                        getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_info_alert, "Pendaftaran Autodebit", "Dalam perlindungan grace period. silakan melakukan pembayaran iuran terlebih dahulu untuk melanjutkan pendaftaran autodebit", "Lanjut", new Function0() { // from class: asInterface
                            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2076390576;

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }, "Batal", new Function0() { // from class: cancelAll
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        });
                        FragmentManager childFragmentManager = tuitionPaymentFragmentspecialinlinedviewModeldefault3.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager, "");
                        if (childFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                        str2 = "";
                    } else {
                        RegisterAutoDebetActivity.Companion companion2 = RegisterAutoDebetActivity.INSTANCE;
                        Context contextRequireContext = tuitionPaymentFragmentspecialinlinedviewModeldefault3.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        String str3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        String str4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
                        String str5 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface;
                        String string = tuitionPaymentFragmentspecialinlinedviewModeldefault3.g.toString();
                        User user = (User) tuitionPaymentFragmentspecialinlinedviewModeldefault3.read.getValue();
                        String strValueOf2 = String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
                        User user2 = (User) tuitionPaymentFragmentspecialinlinedviewModeldefault3.read.getValue();
                        String strValueOf3 = String.valueOf(user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                        String str6 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                        String str7 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.a;
                        double d = tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelDefault;
                        double d2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.RemoteActionCompatParcelizer;
                        double d3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact;
                        str2 = "";
                        RegisterAutoDebetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, new CustomerObject(str3, str4, str5, string, "", "", strValueOf2, strValueOf3, "", "", "", "", "", "", tuitionPaymentFragmentspecialinlinedviewModeldefault3.getInterfaceDescriptor, "", "", str6, str7, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub, (int) (d + d2 + d3), "cross_selling", "", "", "", tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel, bool, null, null, null, bool, null, bool, null, bool, null, null, null, null, null, Integer.MIN_VALUE, 1664, null));
                    }
                } else {
                    str2 = "";
                    setDisabled.Companion companion3 = setDisabled.INSTANCE;
                    RecurringProfile recurringProfile = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
                    String strValueOf4 = String.valueOf(recurringProfile != null ? recurringProfile.getTglLahir() : null);
                    RecurringProfile recurringProfile2 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
                    String strValueOf5 = String.valueOf(recurringProfile2 != null ? recurringProfile2.getTipeRekening() : null);
                    RecurringProfile recurringProfile3 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
                    String strValueOf6 = String.valueOf(recurringProfile3 != null ? recurringProfile3.getNamaLengkap() : null);
                    RecurringProfile recurringProfile4 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
                    String strValueOf7 = String.valueOf(recurringProfile4 != null ? recurringProfile4.getRecurringAktif() : null);
                    RecurringProfile recurringProfile5 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
                    String strValueOf8 = String.valueOf(recurringProfile5 != null ? recurringProfile5.getPetugasRekam() : null);
                    RecurringProfile recurringProfile6 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
                    String strValueOf9 = String.valueOf(recurringProfile6 != null ? recurringProfile6.getTglAktifRecurring() : null);
                    RecurringProfile recurringProfile7 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
                    String strValueOf10 = String.valueOf(recurringProfile7 != null ? recurringProfile7.getNik() : null);
                    RecurringProfile recurringProfile8 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
                    String strValueOf11 = String.valueOf(recurringProfile8 != null ? recurringProfile8.getKodePaket() : null);
                    RecurringProfile recurringProfile9 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
                    setDisabled setdisabledTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setDisabled.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new RecurringProfile(strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, String.valueOf(recurringProfile9 != null ? recurringProfile9.getNominal() : null)));
                    FragmentManager childFragmentManager2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, str2);
                    Intrinsics.checkNotNullParameter(childFragmentManager2, str2);
                    if (childFragmentManager2.findFragmentByTag(setdisabledTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        setdisabledTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager2, setdisabledTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                str = "success_check_recurring_status";
            }
            FragmentActivity activity = tuitionPaymentFragmentspecialinlinedviewModeldefault3.getActivity();
            Intrinsics.checkNotNull(activity, str2);
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_tuition_payment", str));
            Intrinsics.checkNotNullParameter((BaseActivity) activity, str2);
            Intrinsics.checkNotNullParameter(str, str2);
            Intrinsics.checkNotNullParameter(mapMutableMapOf, str2);
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter(str, str2);
            Intrinsics.checkNotNullParameter(mapMutableMapOf, str2);
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        }
        str = str2;
        FragmentActivity activity2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.getActivity();
        Intrinsics.checkNotNull(activity2, str2);
        Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_tuition_payment", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity2, str2);
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, str2);
        TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, str2);
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf2);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(FragmentTuitionPaymentBinding fragmentTuitionPaymentBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            TextInputLayout textInputLayout = fragmentTuitionPaymentBinding.tilIdNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            retrieveConcurrentCameraIds.b(textInputLayout, "");
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, FragmentTuitionPaymentBinding fragmentTuitionPaymentBinding, SelectedTuitionPayment selectedTuitionPayment) {
        Intrinsics.checkNotNullParameter(selectedTuitionPayment, "");
        if (Intrinsics.areEqual(selectedTuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Auto Debit")) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.MediaBrowserCompat = selectedTuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            fragmentTuitionPaymentBinding.ContainerPeriodsPayment.setVisibility(8);
            fragmentTuitionPaymentBinding.rbOneMonthPeriod.setChecked(true);
            fragmentTuitionPaymentBinding.rbTwoMonthPeriod.setVisibility(8);
            fragmentTuitionPaymentBinding.rbThreeMonthPeriod.setVisibility(8);
            fragmentTuitionPaymentBinding.rbSixMonthPeriod.setVisibility(8);
            fragmentTuitionPaymentBinding.rbTwelveMonthPeriod.setVisibility(8);
            fragmentTuitionPaymentBinding.tvInfoAutoDebit.setVisibility(0);
        } else {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.MediaBrowserCompat = selectedTuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            fragmentTuitionPaymentBinding.tvInfoAutoDebit.setVisibility(8);
            fragmentTuitionPaymentBinding.ContainerPeriodsPayment.setVisibility(0);
            fragmentTuitionPaymentBinding.rbTwoMonthPeriod.setVisibility(0);
            fragmentTuitionPaymentBinding.rbThreeMonthPeriod.setVisibility(0);
            fragmentTuitionPaymentBinding.rbSixMonthPeriod.setVisibility(0);
            fragmentTuitionPaymentBinding.rbTwelveMonthPeriod.setVisibility(0);
            fragmentTuitionPaymentBinding.rbOneMonthPeriod.setChecked(false);
            fragmentTuitionPaymentBinding.rbTwoMonthPeriod.setChecked(false);
            fragmentTuitionPaymentBinding.rbThreeMonthPeriod.setChecked(true);
            fragmentTuitionPaymentBinding.rbSixMonthPeriod.setChecked(false);
            fragmentTuitionPaymentBinding.rbTwelveMonthPeriod.setChecked(false);
        }
        return Unit.INSTANCE;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ((InputConfigurationCompat) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new TuitionPaymentRequest("", "", "", p0.toString()));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.observe(getViewLifecycleOwner(), new Observer() { // from class: TuitionPaymentFragmentbindingInflater1
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((InputConfigurationCompat) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(getViewLifecycleOwner(), new Observer() { // from class: TuitionPaymentFragmentspecialinlinedviewModeldefault1
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((InputConfigurationCompat) this.b.getValue()).asInterface.observe(getViewLifecycleOwner(), new Observer() { // from class: TuitionPaymentFragmentspecialinlinedviewModeldefault2
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((InputConfigurationCompat) this.b.getValue()).b.observe(getViewLifecycleOwner(), new Observer() { // from class: d
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        User user = (User) this.read.getValue();
        if (user != null) {
            ((InputConfigurationCompat) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentRequest(String.valueOf(user.TuitionPaymentFragmentspecialinlinedviewModeldefault1), String.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1(INotificationSideChannelStub().rgPaymentPeriod.getCheckedRadioButtonId())), "", p0));
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        Editable text;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
            str = "loading_get_tuition_payment_detail";
        } else {
            Object objTrim = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                if (Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "No KTP/NIK belum terdaftar")) {
                    RegistrationForUnregistered registrationForUnregistered = new RegistrationForUnregistered(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, ViewCompat.MEASURED_SIZE_MASK, null);
                    MembershipType membershipType = MembershipType.BPU;
                    User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, null, String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, membershipType, null, "cross_selling", false, false, 14155771);
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_info_alert, "Belum terdaftar menjadi peserta", "Silakan lakukan pendaftaran terlebih dahulu", "Daftar Peserta", new Function0() { // from class: INotificationSideChannelStubProxy
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                    }, "Kembali", new Function0() { // from class: RemoteActionCompatParcelizer
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    });
                    FragmentManager childFragmentManager = tuitionPaymentFragmentspecialinlinedviewModeldefault3.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Function0 function0 = new Function0() { // from class: INotificationSideChannelStub
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                    Intrinsics.checkNotNullParameter(strValueOf, "");
                    BaseActivity baseActivity = (BaseActivity) tuitionPaymentFragmentspecialinlinedviewModeldefault4.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, function0);
                    }
                }
                str = "failure_get_tuition_payment_detail";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.write();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancelAll);
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelDefault = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.RemoteActionCompatParcelizer = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.getInterfaceDescriptor = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancel;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.a = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).RemoteActionCompatParcelizer);
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).IconCompatParcelizer);
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStubProxy.toString();
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getInterfaceDescriptor);
                String str2 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).write;
                Intrinsics.checkNotNull(str2);
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "JHT", false, 2, (Object) null)) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.d = "L";
                } else {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.d = ExifInterface.GPS_DIRECTION_TRUE;
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.g = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).write);
                if (Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault3.MediaBrowserCompat, "tuition02")) {
                    ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    EditText editText = tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub().tilIdNumber.getEditText();
                    if (editText != null && (text = editText.getText()) != null) {
                        objTrim = StringsKt.trim(text);
                    }
                    listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new CheckRecurringStatusRequest("JMO", "BPJSTK-PTI12345", String.valueOf(objTrim)));
                } else {
                    TuitionPaymentDetailActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentDetailActivity.INSTANCE;
                    Context contextRequireContext = tuitionPaymentFragmentspecialinlinedviewModeldefault3.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    TuitionPaymentDetailActivity.Companion.b(contextRequireContext, (BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1, TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub().rgPaymentPeriod.getCheckedRadioButtonId()));
                }
                str = "success_get_tuition_payment_detail";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = tuitionPaymentFragmentspecialinlinedviewModeldefault3.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_tuition_payment", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
            str = "loading_check_unpaid_tuition";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.write();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "No KTP/NIK belum terdaftar")) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_info_alert, "Belum terdaftar menjadi peserta", "Silakan lakukan pendaftaran terlebih dahulu", "Daftar Peserta", new Function0() { // from class: onTransact
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }, "Kembali", new Function0() { // from class: b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                });
                FragmentManager childFragmentManager = tuitionPaymentFragmentspecialinlinedviewModeldefault3.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_alert, "", String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), "Ok", new Function0() { // from class: INotificationSideChannel
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, 96);
                FragmentManager childFragmentManager2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                if (childFragmentManager2.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(childFragmentManager2, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            str = "failure_check_unpaid_tuition";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).d != 100) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Oops masih ada iuran yang harus dibayarkan", 0).show();
                BaseActivity baseActivity = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                if (baseActivity != null) {
                    baseActivity.d_();
                }
                PaymentActivity.Companion bVar = PaymentActivity.INSTANCE;
                Context contextRequireContext = tuitionPaymentFragmentspecialinlinedviewModeldefault3.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                String strValueOf = Double.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1) == null ? "0.00" : String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1);
                double d = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                double d2 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                User user = (User) tuitionPaymentFragmentspecialinlinedviewModeldefault3.read.getValue();
                String strValueOf2 = String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                User user2 = (User) tuitionPaymentFragmentspecialinlinedviewModeldefault3.read.getValue();
                String strValueOf3 = String.valueOf(user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
                User user3 = (User) tuitionPaymentFragmentspecialinlinedviewModeldefault3.read.getValue();
                String strValueOf4 = String.valueOf(user3 != null ? user3.g : null);
                String string = ((String) StringsKt.split$default((CharSequence) ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).asInterface, new String[]{"#"}, false, 0, 6, (Object) null).get(0)).toString();
                String string2 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b.toString();
                double d3 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                User user4 = (User) tuitionPaymentFragmentspecialinlinedviewModeldefault3.read.getValue();
                String strValueOf5 = String.valueOf(user4 != null ? user4.asBinder : null);
                String string3 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStubProxy.toString();
                String strValueOf6 = String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).IconCompatParcelizer);
                double d4 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).asBinder;
                PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, new Registration(true, "", strValueOf, String.valueOf(d), String.valueOf(d2), string2, String.valueOf(d3), string3, String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getInterfaceDescriptor), strValueOf2, strValueOf3, strValueOf5, strValueOf4, string, ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelDefault, ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStub, "cross_selling", strValueOf6, Double.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).g), Double.valueOf(d4), ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a, ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannel, ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).notify, ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancelAll, ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).onTransact, ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancel, String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).RemoteActionCompatParcelizer), "", "", false, false, 1610612736, null));
            } else if (Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy, "iuran_lanjutan")) {
                User user5 = (User) tuitionPaymentFragmentspecialinlinedviewModeldefault3.read.getValue();
                if (user5 != null) {
                    String strValueOf7 = String.valueOf(user5.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    TextInputLayout textInputLayout = tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub().tilIdNumber;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
                    ((InputConfigurationCompat) tuitionPaymentFragmentspecialinlinedviewModeldefault3.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentRequest(strValueOf7, String.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub().rgPaymentPeriod.getCheckedRadioButtonId())), "", retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout)));
                }
            } else if (Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy, "auto_debit")) {
                Date dateB = setSessionStateCallback.b(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStub);
                Date dateB2 = setSessionStateCallback.b(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), "dd-MM-yyyy"));
                if (dateB2.after(dateB)) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll = true;
                    int iCeil = (int) Math.ceil((dateB2.getTime() - dateB.getTime()) / CalendarModelKt.MillisecondsIn24Hours);
                    int i = iCeil / 28;
                    if ((iCeil ^ 28) < 0 && i * 28 != iCeil) {
                        i--;
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a;
                    EditText editText = tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub().tilIdNumber.getEditText();
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString());
                } else {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll = false;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a;
                    EditText editText2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub().tilIdNumber.getEditText();
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString());
                }
            }
            str = "success_check_unpaid_tuition";
        } else {
            str = "";
        }
        FragmentActivity activity = tuitionPaymentFragmentspecialinlinedviewModeldefault3.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_check_bpu_tuition_payment", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
        Context contextRequireContext = tuitionPaymentFragmentspecialinlinedviewModeldefault3.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, false, false, 6);
        return Unit.INSTANCE;
    }
}
