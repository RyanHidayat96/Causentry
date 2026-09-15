package defpackage;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.AsikListFamilyRequest;
import com.bpjstku.data.asik.model.request.AsikVerificationStepRequest;
import com.bpjstku.data.asik.model.response.AsikListFamilyItem;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.databinding.FragmentAsikActiveParticipantOthersStepFourBinding;
import com.bpjstku.domain.asik.model.EmployeeFamily;
import com.bpjstku.domain.asik.model.SubmissionCheckItem;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantOtherStepFourFragment$bindingInflater$1;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.util.constant.FamilyStatus;
import com.bpjstku.util.constant.Gender;
import com.bpjstku.util.constant.MaritalStatus;
import com.esafirm.imagepicker.features.ImagePickerActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.mapPoint;
import defpackage.select;
import defpackage.setTabListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u001d\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u0015\u0010\u0007\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0016\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0083D¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0015\u0010%\u001a\u00020$8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0017\u0010\b\u001a\u0004\u0018\u00010&8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\n\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010)R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010)R\u0015\u0010\t\u001a\u00020*8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0014\u0010\u0014\u001a\u00020+8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010,R.\u00102\u001a\u001c\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00020-8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u00101"}, d2 = {"LattachToWindow;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantOthersStepFourBinding;", "<init>", "()V", "", "INotificationSideChannelDefault", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "g", "cancelAll", "INotificationSideChannel", "cancel", "", "Lcom/bpjstku/data/asik/model/response/AsikListFamilyItem;", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/util/List;)V", "onTransact", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "LsetTabListener;", "Lcom/bpjstku/domain/user/model/User;", "b", "Lcom/bpjstku/domain/asik/model/SubmissionCheckItem;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "notify", "Ljava/lang/String;", "a", "asInterface", "asBinder", "Lselect;", "d", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "Ljava/util/List;", "LAppCompatDelegateImplApi33ImplExternalSyntheticLambda0;", "", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "INotificationSideChannelStub"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class attachToWindow extends AutoValue_ImmutableImageInfo<FragmentAsikActiveParticipantOthersStepFourBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Calendar INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private List<AsikListFamilyItem> onTransact;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy cancelAll;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private List<AsikListFamilyItem> notify;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private List<AsikListFamilyItem> cancel;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final String a;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String asBinder;

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getAsBinder() {
        return R.layout.fragment_asik_active_participant_others_step_four;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public attachToWindow() {
        final attachToWindow attachtowindow = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantOtherStepFourFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = attachtowindow;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final attachToWindow attachtowindow2 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantOtherStepFourFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = attachtowindow2.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<setTabListener>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantOtherStepFourFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, setTabListener] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setTabListener invoke() {
                return getFocusY.b(attachtowindow2, Reflection.getOrCreateKotlinClass(setTabListener.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: onSubDecorInstalled
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: shouldRegisterBackInvokedCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((select) this.b.d.getValue()).d.TuitionPaymentFragmentbindingInflater1();
            }
        });
        this.a = "20";
        this.asInterface = "0";
        this.asBinder = "";
        this.d = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantOtherStepFourFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, select] */
            @Override // kotlin.jvm.functions.Function0
            public final select invoke() {
                ComponentCallbacks componentCallbacks = attachtowindow;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(select.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: setDefaultLocalesForLocaleList
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((setTabListener) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            }
        });
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.INotificationSideChannel = calendar;
        this.onTransact = new ArrayList();
        this.cancel = new ArrayList();
        this.notify = new ArrayList();
        this.cancelAll = LazyKt.lazy(new Function0() { // from class: calculateNightMode
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return attachToWindow.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
    }

    /* JADX INFO: renamed from: attachToWindow$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LattachToWindow$b;", "", "<init>", "()V", "LattachToWindow;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LattachToWindow;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static attachToWindow TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new attachToWindow();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantOthersStepFourBinding> d() {
        return AsikActiveParticipantOtherStepFourFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilAddressPostalCode;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMotherName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilAddressPostalCode;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout4 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilParticipantAddress;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String string5 = getString(R.string.error_not_complete_address);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string4), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string5, 5, null)})));
        TextInputLayout textInputLayout5 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        String string6 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
        if (StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString().length() == 0) {
            TextInputLayout textInputLayout = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            textInputLayout.setVisibility(8);
            TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSpouse;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            textInputLayout2.setVisibility(8);
            ConstraintLayout constraintLayout = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.childrenContainer;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFatherName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
            textInputLayout3.setVisibility(8);
            TextInputLayout textInputLayout4 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFather;
            Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
            textInputLayout4.setVisibility(8);
            return;
        }
        EditText editText2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
        if (StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString().equals(MaritalStatus.SINGLE.getType())) {
            ConstraintLayout constraintLayout2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.childrenContainer;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            TextInputLayout textInputLayout5 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
            textInputLayout5.setVisibility(8);
            TextInputLayout textInputLayout6 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSpouse;
            Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
            textInputLayout6.setVisibility(8);
            TextInputLayout textInputLayout7 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFatherName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
            textInputLayout7.setVisibility(0);
            TextInputLayout textInputLayout8 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFather;
            Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
            textInputLayout8.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnNext.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToBottom = R.id.tilBirthDateFather;
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnNext.setLayoutParams(layoutParams2);
            return;
        }
        EditText editText3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
        if (StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString().equals(MaritalStatus.MARRIED.getType())) {
            ConstraintLayout constraintLayout3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.childrenContainer;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(0);
            TextInputLayout textInputLayout9 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
            textInputLayout9.setVisibility(0);
            TextInputLayout textInputLayout10 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSpouse;
            Intrinsics.checkNotNullExpressionValue(textInputLayout10, "");
            textInputLayout10.setVisibility(0);
            TextInputLayout textInputLayout11 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFatherName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout11, "");
            textInputLayout11.setVisibility(8);
            TextInputLayout textInputLayout12 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFather;
            Intrinsics.checkNotNullExpressionValue(textInputLayout12, "");
            textInputLayout12.setVisibility(8);
            ViewGroup.LayoutParams layoutParams3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.childrenContainer.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.topToBottom = R.id.tilBirthDateSpouse;
            layoutParams4.startToStart = R.id.tilBirthDateSpouse;
            layoutParams4.endToEnd = R.id.tilBirthDateSpouse;
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.childrenContainer.setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnNext.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams5, "");
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            layoutParams6.topToBottom = R.id.cvScanKtp;
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnNext.setLayoutParams(layoutParams6);
            return;
        }
        ConstraintLayout constraintLayout4 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.childrenContainer;
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
        constraintLayout4.setVisibility(0);
        TextInputLayout textInputLayout13 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout13, "");
        textInputLayout13.setVisibility(8);
        TextInputLayout textInputLayout14 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSpouse;
        Intrinsics.checkNotNullExpressionValue(textInputLayout14, "");
        textInputLayout14.setVisibility(8);
        TextInputLayout textInputLayout15 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFatherName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout15, "");
        textInputLayout15.setVisibility(8);
        TextInputLayout textInputLayout16 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFather;
        Intrinsics.checkNotNullExpressionValue(textInputLayout16, "");
        textInputLayout16.setVisibility(8);
        ViewGroup.LayoutParams layoutParams7 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.childrenContainer.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams7, "");
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        layoutParams8.topToBottom = R.id.tilMaritalStatus;
        layoutParams8.startToStart = R.id.tilMaritalStatus;
        layoutParams8.endToEnd = R.id.tilMaritalStatus;
        fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.childrenContainer.setLayoutParams(layoutParams8);
        ViewGroup.LayoutParams layoutParams9 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnNext.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams9, "");
        ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
        layoutParams10.topToBottom = R.id.cvScanKtp;
        fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnNext.setLayoutParams(layoutParams10);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ensureSubDecor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.edtAddressPostalCode.setOnClickListener(new View.OnClickListener() { // from class: reopenMenu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                attachToWindow.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub, view);
            }
        });
        View view = getView();
        TextInputEditText textInputEditText = view != null ? (TextInputEditText) view.findViewById(R.id.edtMaritalStatus) : null;
        if (textInputEditText != null) {
            textInputEditText.setOnClickListener(new View.OnClickListener() { // from class: tryUnwrapContext
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view2);
                }
            });
        }
        if (textInputEditText != null) {
            textInputEditText.addTextChangedListener(new suspendUseCases.b(new Function1() { // from class: updateStatusGuardColor
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return attachToWindow.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (String) obj);
                }
            }));
        }
        CardView cardView = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.cvScanKtp;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: callOnPanelClosed
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return attachToWindow.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        CardView cardView2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.cvScanKK;
        Intrinsics.checkNotNullExpressionValue(cardView2, "");
        cardView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: checkCloseActionMenu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        MaterialButton materialButton2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: calculateApplicationLocales
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub, this, (View) obj);
            }
        }));
        MaterialButton materialButton3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        materialButton3.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: dismissPopups
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub, this, (View) obj);
            }
        }));
        fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.rgChooseGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: endOnGoingFadeAnimation
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                attachToWindow.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, radioGroup);
            }
        });
        View view2 = getView();
        TextInputEditText textInputEditText2 = view2 != null ? (TextInputEditText) view2.findViewById(R.id.edtBirthDateMother) : null;
        if (textInputEditText2 != null) {
            textInputEditText2.setOnClickListener(new closePanel(this, textInputEditText2));
        }
        View view3 = getView();
        final TextInputEditText textInputEditText3 = view3 != null ? (TextInputEditText) view3.findViewById(R.id.edtBirthDateSpouse) : null;
        if (textInputEditText3 != null) {
            textInputEditText3.setOnClickListener(new View.OnClickListener() { // from class: createSubDecor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    attachToWindow.a(this.b, textInputEditText3, view4);
                }
            });
        }
        View view4 = getView();
        final TextInputEditText textInputEditText4 = view4 != null ? (TextInputEditText) view4.findViewById(R.id.edtBirthDateFather) : null;
        if (textInputEditText4 != null) {
            textInputEditText4.setOnClickListener(new View.OnClickListener() { // from class: generateConfigDelta
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, textInputEditText4, view5);
                }
            });
        }
        View view5 = getView();
        final TextInputEditText textInputEditText5 = view5 != null ? (TextInputEditText) view5.findViewById(R.id.edtBirthDateFirstChildren) : null;
        if (textInputEditText5 != null) {
            textInputEditText5.setOnClickListener(new View.OnClickListener() { // from class: getActivityHandlesConfigChangesFlags
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    attachToWindow.asBinder(this.b, textInputEditText5, view6);
                }
            });
        }
        View view6 = getView();
        final TextInputEditText textInputEditText6 = view6 != null ? (TextInputEditText) view6.findViewById(R.id.edtBirthDateSecondChildren) : null;
        if (textInputEditText6 != null) {
            textInputEditText6.setOnClickListener(new View.OnClickListener() { // from class: getAutoBatteryNightModeManager
                @Override // android.view.View.OnClickListener
                public final void onClick(View view7) {
                    attachToWindow.RemoteActionCompatParcelizer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, textInputEditText6, view7);
                }
            });
        }
        View view7 = getView();
        final TextInputEditText textInputEditText7 = view7 != null ? (TextInputEditText) view7.findViewById(R.id.edtBirthDateThirdChildren) : null;
        if (textInputEditText7 != null) {
            textInputEditText7.setOnClickListener(new View.OnClickListener() { // from class: initWindowDecorActionBar
                private static final byte[] $$c = {88, ByteCompanionObject.MAX_VALUE, -112, -47};
                private static final int $$f = 7;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {106, -93, -11, -74, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
                private static final int $$e = 145;
                private static final byte[] $$a = {55, -47, -47, 67, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
                private static final int $$b = 100;
                private static int TuitionPaymentFragmentbindingInflater1 = 0;
                private static int asBinder = 1;
                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {57186, 60051, 60034, 57190, 60090, 60043, 57193, 60073, 60045, 60063, 60053, 60079, 60046, 57192, 57191, 60041, 60049, 60047, 60058, 60060, 60088, 57188, 60055, 60056, 60117, 60054, 60072, 60052, 60062, 57184, 60040, 57187, 60048, 60050, 57189, 60083};
                private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57191;

                /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r8 = r8 * 3
                        int r8 = 84 - r8
                        int r7 = r7 * 15
                        int r0 = 53 - r7
                        int r6 = r6 * 52
                        int r6 = 107 - r6
                        byte[] r1 = defpackage.initWindowDecorActionBar.$$a
                        byte[] r0 = new byte[r0]
                        int r7 = 52 - r7
                        r2 = 0
                        if (r1 != 0) goto L18
                        r3 = r7
                        r4 = r2
                        goto L30
                    L18:
                        r3 = r2
                    L19:
                        int r6 = r6 + 1
                        byte r4 = (byte) r8
                        r0[r3] = r4
                        if (r3 != r7) goto L28
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L28:
                        r4 = r1[r6]
                        int r3 = r3 + 1
                        r5 = r3
                        r3 = r8
                        r8 = r4
                        r4 = r5
                    L30:
                        int r8 = -r8
                        int r3 = r3 + r8
                        int r8 = r3 + (-11)
                        r3 = r4
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.initWindowDecorActionBar.a(short, byte, int, java.lang.Object[]):void");
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
                private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                    /*
                        int r7 = r7 * 2
                        int r7 = r7 + 4
                        int r6 = r6 * 52
                        int r0 = 53 - r6
                        byte[] r1 = defpackage.initWindowDecorActionBar.$$d
                        int r8 = r8 * 4
                        int r8 = 84 - r8
                        byte[] r0 = new byte[r0]
                        int r6 = 52 - r6
                        r2 = 0
                        if (r1 != 0) goto L19
                        r4 = r8
                        r3 = r2
                        r8 = r7
                        goto L2e
                    L19:
                        r3 = r2
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L1d:
                        byte r4 = (byte) r7
                        r0[r3] = r4
                        if (r3 != r6) goto L2a
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L2a:
                        int r3 = r3 + 1
                        r4 = r1[r8]
                    L2e:
                        int r4 = -r4
                        int r7 = r7 + r4
                        int r7 = r7 + (-11)
                        int r8 = r8 + 1
                        goto L1d
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.initWindowDecorActionBar.d(byte, byte, byte, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:22:0x020a  */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view8) throws Throwable {
                    Object[] objArr;
                    char c;
                    int i = 2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int iIndexOf = 2267 - TextUtils.indexOf("", "", 0, 0);
                        int trimmedLength = 33 - TextUtils.getTrimmedLength("");
                        byte[] bArr = $$a;
                        byte b = bArr[40];
                        byte b2 = bArr[7];
                        Object[] objArr2 = new Object[1];
                        a(b, b2, b2, objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, iIndexOf, trimmedLength, -887667012, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{22, 6, 15, 21, '!', 3, 6, 27, 24, '!', 25, 27, 0, ' ', 16, 29, 26, 19, 21, 28, 20, '#'}, (byte) (35 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 23, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(new char[]{Typography.quote, 28, 23, 0, Typography.quote, 24, '\n', '\b', 24, 22, 23, 16, 31, 27, 13911}, (byte) (88 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 15 - TextUtils.indexOf("", ""), objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int iRgb = Color.rgb(0, 0, 0) + 16779483;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 33;
                        byte[] bArr2 = $$a;
                        byte b3 = bArr2[5];
                        byte b4 = bArr2[7];
                        Object[] objArr5 = new Object[1];
                        a(b3, b4, b4, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iRgb, fadingEdgeLength, -874156483, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        int i2 = asBinder + 49;
                        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                        int i3 = i2 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                            int iIndexOf2 = 2267 - TextUtils.indexOf("", "", 0);
                            int iAlpha = 33 - Color.alpha(0);
                            byte[] bArr3 = $$a;
                            byte b5 = bArr3[7];
                            Object[] objArr6 = new Object[1];
                            a(b5, bArr3[5], b5, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, iIndexOf2, iAlpha, -654680577, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                        int i4 = ((int[]) objArr7[0])[0];
                        int i5 = ((int[]) objArr7[3])[0];
                        String[] strArr = (String[]) objArr7[1];
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i6 = ~iIdentityHashCode;
                        int i7 = 1378365520 + (((~((-752255545) | i6)) | (-56457772)) * (-865)) + ((~(iIdentityHashCode | 752255544)) * 865) + (((~((-56457772) | i6)) | (~(i6 | 752255544))) * 865) + 1744849760;
                        int i8 = (i7 << 13) ^ i7;
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
                        c = 3;
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(new char[]{22, 6, 15, 21, '!', 3, 6, 27, 23, 0, 0, 29, 5, 22, 15, '#', '\t', ' ', 14, 5, 7, 5, 16, 27, 21, 6}, (byte) (21 - TextUtils.indexOf("", "", 0, 0)), ImageFormat.getBitsPerPixel(0) + 27, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(new char[]{18, 17, 13819, 13819, Typography.quote, 16, 16, 5, 13821, 13821, 21, Typography.quote, 18, 19, 15, '#', 28, '\t'}, (byte) (18 - ((byte) KeyEvent.getModifierMetaStateMask())), 18 - Color.red(0), objArr9);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            if (applicationContext instanceof ContextWrapper) {
                                int i10 = TuitionPaymentFragmentbindingInflater1 + 87;
                                asBinder = i10 % 128;
                                int i11 = i10 % 2;
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = applicationContext.getApplicationContext();
                                    int i12 = asBinder + 35;
                                    TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                                    int i13 = i12 % 2;
                                } else {
                                    applicationContext = null;
                                }
                            } else {
                                applicationContext = applicationContext.getApplicationContext();
                                int i14 = asBinder + 35;
                                TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                                int i15 = i14 % 2;
                            }
                        }
                        Object[] objArr10 = new Object[1];
                        c(new char[]{'\f', 22, 6, 20, 28, 18, 22, 6, 18, 25, ' ', '\b', '#', '\f', 29, 26}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 14), Color.argb(0, 0, 0, 0) + 16, objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        c(new char[]{3, 15, Typography.quote, 16, 15, '#', 14, 5, 30, 23, 31, 0, 21, 26, '\n', 27}, (byte) (121 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 16 - (KeyEvent.getMaxKeyCode() >> 16), objArr11);
                        try {
                            Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1744849760};
                            byte[] bArr4 = $$d;
                            byte b6 = bArr4[5];
                            Object[] objArr13 = new Object[1];
                            d(b6, bArr4[7], b6, objArr13);
                            Class<?> cls4 = Class.forName((String) objArr13[0]);
                            byte b7 = bArr4[7];
                            byte b8 = b7;
                            Object[] objArr14 = new Object[1];
                            d(b7, b8, b8, objArr14);
                            Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                            if (applicationContext != null) {
                                int i16 = TuitionPaymentFragmentbindingInflater1 + 1;
                                asBinder = i16 % 128;
                                int i17 = i16 % 2;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int iIndexOf3 = TextUtils.indexOf("", "", 0) + 2267;
                                    int trimmedLength2 = TextUtils.getTrimmedLength("") + 33;
                                    byte[] bArr5 = $$a;
                                    byte b9 = bArr5[7];
                                    Object[] objArr16 = new Object[1];
                                    a(b9, bArr5[5], b9, objArr16);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength2, iIndexOf3, trimmedLength2, -654680577, false, (String) objArr16[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                try {
                                    Object[] objArr17 = new Object[1];
                                    c(new char[]{22, 6, 15, 21, '!', 3, 6, 27, 24, '!', 25, 27, 0, ' ', 16, 29, 26, 19, 21, 28, 20, '#'}, (byte) (Color.alpha(0) + 34), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, objArr17);
                                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                                    Object[] objArr18 = new Object[1];
                                    c(new char[]{Typography.quote, 28, 23, 0, Typography.quote, 24, '\n', '\b', 24, 22, 23, 16, 31, 27, 13911}, (byte) (88 - TextUtils.getOffsetBefore("", 0)), 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr18);
                                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2267;
                                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 33;
                                        byte[] bArr6 = $$a;
                                        byte b10 = bArr6[5];
                                        byte b11 = bArr6[7];
                                        Object[] objArr19 = new Object[1];
                                        a(b10, b11, b11, objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, edgeSlop, touchSlop, -874156483, false, (String) objArr19[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267;
                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 33;
                                        byte[] bArr7 = $$a;
                                        byte b12 = bArr7[40];
                                        byte b13 = bArr7[7];
                                        Object[] objArr20 = new Object[1];
                                        a(b12, b13, b13, objArr20);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, scrollBarFadeDuration, iMakeMeasureSpec, -887667012, false, (String) objArr20[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            }
                            objArr = objArr15;
                            c = 3;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i18 = ((int[]) objArr[c])[0];
                    int i19 = ((int[]) objArr[0])[0];
                    if (i19 == i18) {
                        Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                        int i20 = ((int[]) objArr[2])[0];
                        int i21 = ((int[]) objArr[0])[0];
                        int i22 = ((int[]) objArr[3])[0];
                        String[] strArr2 = (String[]) objArr[1];
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i23 = (~((-675967420) | iElapsedRealtime)) | 4718760;
                        int i24 = i20 + (-881132397) + (i23 * 992) + ((i23 | (~((~iElapsedRealtime) | 803994555))) * (-496)) + ((iElapsedRealtime | 132745896) * 496);
                        int i25 = (i24 << 13) ^ i24;
                        int i26 = i25 ^ (i25 >>> 17);
                        ((int[]) objArr21[2])[0] = i26 ^ (i26 << 5);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) objArr[1];
                        if (strArr3 != null) {
                            int i27 = 0;
                            while (i27 < strArr3.length) {
                                arrayList.add(strArr3[i27]);
                                i27++;
                                int i28 = TuitionPaymentFragmentbindingInflater1 + 55;
                                asBinder = i28 % 128;
                                int i29 = i28 % 2;
                            }
                        }
                        int[] iArr = new int[i19];
                        int i30 = i19 - 1;
                        iArr[i30] = 1;
                        Toast.makeText((Context) null, iArr[((i19 * i30) % 2) - 1], 1).show();
                        Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                        int i31 = ((int[]) objArr[2])[0];
                        int i32 = ((int[]) objArr[0])[0];
                        int i33 = ((int[]) objArr[3])[0];
                        String[] strArr4 = (String[]) objArr[1];
                        int i34 = (int) Runtime.getRuntime().totalMemory();
                        int i35 = 1840215363 + (((~(1063742139 | i34)) | (-255028824)) * 672);
                        int i36 = ~i34;
                        int i37 = i31 + i35 + (((~(i34 | (-255028824))) | (~((-1063742140) | i36))) * (-672)) + (((~(255028823 | i36)) | (-1064791808)) * 672);
                        int i38 = (i37 << 13) ^ i37;
                        int i39 = i38 ^ (i38 >>> 17);
                        ((int[]) objArr22[2])[0] = i39 ^ (i39 << 5);
                    }
                    attachToWindow.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, textInputEditText7, view8);
                }

                private static void c(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
                    int i2;
                    Object obj;
                    int i3;
                    int i4 = 2;
                    int i5 = 2 % 2;
                    deInitSession deinitsession = new deInitSession();
                    char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i6 = 1770390596;
                    Object obj2 = null;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i7 = 0;
                        while (i7 < length) {
                            int i8 = $11 + 65;
                            $10 = i8 % 128;
                            int i9 = i8 % i4;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int iIndexOf = 2267 - TextUtils.indexOf("", "", 0, 0);
                                    int iMyPid = (Process.myPid() >> 22) + 33;
                                    byte b2 = (byte) ($$f - 4);
                                    byte b3 = (byte) (b2 - 3);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, iMyPid, -1927765101, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                                }
                                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                i7++;
                                i4 = 2;
                                i6 = 1770390596;
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
                        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                            int i10 = 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33;
                            byte b4 = (byte) ($$f - 4);
                            byte b5 = (byte) (b4 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i10, keyRepeatTimeout, -1927765101, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        char[] cArr4 = new char[i];
                        if (i % 2 != 0) {
                            i2 = i - 1;
                            cArr4[i2] = (char) (cArr[i2] - b);
                        } else {
                            i2 = i;
                        }
                        if (i2 > 1) {
                            int i11 = $10 + 107;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                                    int i13 = $11 + 75;
                                    $10 = i13 % 128;
                                    int i14 = i13 % 2;
                                    obj = obj2;
                                    i3 = 2;
                                } else {
                                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c3 = (char) (49267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                        int i15 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3261;
                                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 30;
                                        byte b6 = (byte) ($$f - 5);
                                        byte b7 = (byte) (b6 - 2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, i15, iNormalizeMetaState, -127612708, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            byte b8 = (byte) 0;
                                            byte b9 = b8;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 22878), MotionEvent.axisFromString("") + 595, View.getDefaultSize(0, 0) + 17, 1570859318, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                        int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                    } else {
                                        obj = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            int i17 = $11 + 55;
                                            $10 = i17 % 128;
                                            int i18 = i17 % 2;
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                                        } else {
                                            int i21 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i22 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i21];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i22];
                                            int i23 = $10 + 123;
                                            $11 = i23 % 128;
                                            i3 = 2;
                                            int i24 = i23 % 2;
                                        }
                                    }
                                    i3 = 2;
                                }
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i3;
                                obj2 = obj;
                            }
                        }
                        for (int i25 = 0; i25 < i; i25++) {
                            int i26 = $11 + 13;
                            $10 = i26 % 128;
                            int i27 = i26 % 2;
                            cArr4[i25] = (char) (cArr4[i25] ^ 13722);
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

                /* JADX WARN: Code duplicated, block: B:10:0x0021  */
                /* JADX WARN: Code duplicated, block: B:8:0x001b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(short r7, byte r8, int r9) {
                    /*
                        byte[] r0 = defpackage.initWindowDecorActionBar.$$c
                        int r9 = r9 + 4
                        int r7 = 116 - r7
                        int r8 = r8 * 4
                        int r8 = r8 + 1
                        byte[] r1 = new byte[r8]
                        r2 = 0
                        if (r0 != 0) goto L13
                        r3 = r9
                        r4 = r2
                        r9 = r8
                        goto L29
                    L13:
                        r3 = r2
                    L14:
                        int r4 = r3 + 1
                        byte r5 = (byte) r7
                        r1[r3] = r5
                        if (r4 != r8) goto L21
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        return r7
                    L21:
                        int r9 = r9 + 1
                        r3 = r0[r9]
                        r6 = r9
                        r9 = r7
                        r7 = r3
                        r3 = r6
                    L29:
                        int r7 = -r7
                        int r7 = r7 + r9
                        r9 = r3
                        r3 = r4
                        goto L14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.initWindowDecorActionBar.$$g(short, byte, int):java.lang.String");
                }
            });
        }
        View view8 = getView();
        final TextInputEditText textInputEditText8 = view8 != null ? (TextInputEditText) view8.findViewById(R.id.edtBirthDateFourthChildren) : null;
        if (textInputEditText8 != null) {
            textInputEditText8.setOnClickListener(new View.OnClickListener() { // from class: initializePanelContent
                @Override // android.view.View.OnClickListener
                public final void onClick(View view9) {
                    attachToWindow.cancel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, textInputEditText8, view9);
                }
            });
        }
        View view9 = getView();
        final TextInputEditText textInputEditText9 = view9 != null ? (TextInputEditText) view9.findViewById(R.id.edtBirthDateFifthChildren) : null;
        if (textInputEditText9 != null) {
            textInputEditText9.setOnClickListener(new View.OnClickListener() { // from class: getAutoTimeNightModeManager
                @Override // android.view.View.OnClickListener
                public final void onClick(View view10) {
                    attachToWindow.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, textInputEditText9, view10);
                }
            });
        }
        View view10 = getView();
        final TextInputEditText textInputEditText10 = view10 != null ? (TextInputEditText) view10.findViewById(R.id.edtBirthDateSixthChildren) : null;
        if (textInputEditText10 != null) {
            textInputEditText10.setOnClickListener(new View.OnClickListener() { // from class: onKeyDownPanel
                @Override // android.view.View.OnClickListener
                public final void onClick(View view11) {
                    attachToWindow.INotificationSideChannel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, textInputEditText10, view11);
                }
            });
        }
        View view11 = getView();
        final TextInputEditText textInputEditText11 = view11 != null ? (TextInputEditText) view11.findViewById(R.id.edtBirthDateSevenChildren) : null;
        if (textInputEditText11 != null) {
            textInputEditText11.setOnClickListener(new View.OnClickListener() { // from class: initializePanelDecor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view12) {
                    attachToWindow.onTransact(this.b, textInputEditText11, view12);
                }
            });
        }
        View view12 = getView();
        final TextInputEditText textInputEditText12 = view12 != null ? (TextInputEditText) view12.findViewById(R.id.edtBirthDateEightChildren) : null;
        if (textInputEditText12 != null) {
            textInputEditText12.setOnClickListener(new View.OnClickListener() { // from class: initializePanelMenu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view13) {
                    attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, textInputEditText12, view13);
                }
            });
        }
        View view13 = getView();
        final TextInputEditText textInputEditText13 = view13 != null ? (TextInputEditText) view13.findViewById(R.id.edtBirthDateNineChildren) : null;
        if (textInputEditText13 != null) {
            textInputEditText13.setOnClickListener(new View.OnClickListener() { // from class: openPanel
                @Override // android.view.View.OnClickListener
                public final void onClick(View view14) {
                    attachToWindow.INotificationSideChannelDefault(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, textInputEditText13, view14);
                }
            });
        }
        View view14 = getView();
        final TextInputEditText textInputEditText14 = view14 != null ? (TextInputEditText) view14.findViewById(R.id.edtBirthDateTenChildren) : null;
        if (textInputEditText14 != null) {
            textInputEditText14.setOnClickListener(new View.OnClickListener() { // from class: performPanelShortcut
                @Override // android.view.View.OnClickListener
                public final void onClick(View view15) {
                    attachToWindow.cancelAll(this.TuitionPaymentFragmentbindingInflater1, textInputEditText14, view15);
                }
            });
        }
        View view15 = getView();
        final TextInputEditText textInputEditText15 = view15 != null ? (TextInputEditText) view15.findViewById(R.id.edtBirthDateElevenChildren) : null;
        if (textInputEditText15 != null) {
            textInputEditText15.setOnClickListener(new View.OnClickListener() { // from class: preparePanel
                @Override // android.view.View.OnClickListener
                public final void onClick(View view16) {
                    attachToWindow.getInterfaceDescriptor(this.TuitionPaymentFragmentbindingInflater1, textInputEditText15, view16);
                }
            });
        }
        View view16 = getView();
        final TextInputEditText textInputEditText16 = view16 != null ? (TextInputEditText) view16.findViewById(R.id.edtBirthDateTwelveChildren) : null;
        if (textInputEditText16 != null) {
            textInputEditText16.setOnClickListener(new View.OnClickListener() { // from class: sanitizeWindowFeatureId
                @Override // android.view.View.OnClickListener
                public final void onClick(View view17) {
                    attachToWindow.notify(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, textInputEditText16, view17);
                }
            });
        }
        View view17 = getView();
        final TextInputEditText textInputEditText17 = view17 != null ? (TextInputEditText) view17.findViewById(R.id.edtBirthDateThirteenChildren) : null;
        if (textInputEditText17 != null) {
            textInputEditText17.setOnClickListener(new View.OnClickListener() { // from class: updateAppConfiguration
                @Override // android.view.View.OnClickListener
                public final void onClick(View view18) {
                    attachToWindow.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, textInputEditText17, view18);
                }
            });
        }
        View view18 = getView();
        final TextInputEditText textInputEditText18 = view18 != null ? (TextInputEditText) view18.findViewById(R.id.edtBirthDateFourteenChildren) : null;
        if (textInputEditText18 != null) {
            textInputEditText18.setOnClickListener(new View.OnClickListener() { // from class: throwFeatureRequestIfSubDecorInstalled
                @Override // android.view.View.OnClickListener
                public final void onClick(View view19) {
                    attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, textInputEditText18, view19);
                }
            });
        }
        View view19 = getView();
        final TextInputEditText textInputEditText19 = view19 != null ? (TextInputEditText) view19.findViewById(R.id.edtBirthDateFifteenChildren) : null;
        if (textInputEditText19 != null) {
            textInputEditText19.setOnClickListener(new View.OnClickListener() { // from class: updateActivityConfiguration
                @Override // android.view.View.OnClickListener
                public final void onClick(View view20) {
                    attachToWindow.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, textInputEditText19, view20);
                }
            });
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        INotificationSideChannelStub().edtChildren.setText(this.asInterface);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        EditText editText = INotificationSideChannelStub().tilParticipantAddress.getEditText();
        if (editText != null) {
            User user = (User) this.b.getValue();
            editText.setText(String.valueOf(user != null ? user.asBinder : null));
        }
        final select selectVar = (select) this.d.getValue();
        User user2 = (User) this.b.getValue();
        String strValueOf = String.valueOf(user2 != null ? user2.b : null);
        User user3 = (User) this.b.getValue();
        String strValueOf2 = String.valueOf(user3 != null ? user3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
        User user4 = (User) this.b.getValue();
        AsikListFamilyRequest asikListFamilyRequest = new AsikListFamilyRequest(strValueOf, strValueOf2, String.valueOf(user4 != null ? user4.asInterface : null));
        Intrinsics.checkNotNullParameter(asikListFamilyRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<AsikListFamilyItem>>> mutableLiveData = selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar.d.TuitionPaymentFragmentbindingInflater1(asikListFamilyRequest)));
        final Function1 function1 = new Function1() { // from class: ActionBarDrawerToggle1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.TuitionPaymentFragmentbindingInflater1(selectVar, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: toggle
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ActionBarDrawerToggleDelegateProvider
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.cancelAll(selectVar, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getActionBarThemedContext
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<AsikListFamilyItem> p0) {
        FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub = INotificationSideChannelStub();
        View view = getView();
        TextInputEditText textInputEditText = view != null ? (TextInputEditText) view.findViewById(R.id.edtBirthDateSpouse) : null;
        View view2 = getView();
        TextInputEditText textInputEditText2 = view2 != null ? (TextInputEditText) view2.findViewById(R.id.edtBirthDateFirstChildren) : null;
        View view3 = getView();
        TextInputEditText textInputEditText3 = view3 != null ? (TextInputEditText) view3.findViewById(R.id.edtBirthDateSecondChildren) : null;
        View view4 = getView();
        TextInputEditText textInputEditText4 = view4 != null ? (TextInputEditText) view4.findViewById(R.id.edtBirthDateThirdChildren) : null;
        View view5 = getView();
        TextInputEditText textInputEditText5 = view5 != null ? (TextInputEditText) view5.findViewById(R.id.edtBirthDateFourthChildren) : null;
        View view6 = getView();
        TextInputEditText textInputEditText6 = view6 != null ? (TextInputEditText) view6.findViewById(R.id.edtBirthDateFifthChildren) : null;
        View view7 = getView();
        TextInputEditText textInputEditText7 = view7 != null ? (TextInputEditText) view7.findViewById(R.id.edtBirthDateSixthChildren) : null;
        View view8 = getView();
        TextInputEditText textInputEditText8 = view8 != null ? (TextInputEditText) view8.findViewById(R.id.edtBirthDateSevenChildren) : null;
        View view9 = getView();
        TextInputEditText textInputEditText9 = view9 != null ? (TextInputEditText) view9.findViewById(R.id.edtBirthDateEightChildren) : null;
        View view10 = getView();
        TextInputEditText textInputEditText10 = view10 != null ? (TextInputEditText) view10.findViewById(R.id.edtBirthDateNineChildren) : null;
        View view11 = getView();
        TextInputEditText textInputEditText11 = view11 != null ? (TextInputEditText) view11.findViewById(R.id.edtBirthDateTenChildren) : null;
        View view12 = getView();
        TextInputEditText textInputEditText12 = view12 != null ? (TextInputEditText) view12.findViewById(R.id.edtBirthDateElevenChildren) : null;
        View view13 = getView();
        TextInputEditText textInputEditText13 = view13 != null ? (TextInputEditText) view13.findViewById(R.id.edtBirthDateTwelveChildren) : null;
        View view14 = getView();
        TextInputEditText textInputEditText14 = textInputEditText13;
        TextInputEditText textInputEditText15 = view14 != null ? (TextInputEditText) view14.findViewById(R.id.edtBirthDateThirteenChildren) : null;
        View view15 = getView();
        TextInputEditText textInputEditText16 = textInputEditText15;
        TextInputEditText textInputEditText17 = view15 != null ? (TextInputEditText) view15.findViewById(R.id.edtBirthDateFourteenChildren) : null;
        View view16 = getView();
        TextInputEditText textInputEditText18 = textInputEditText17;
        TextInputEditText textInputEditText19 = view16 != null ? (TextInputEditText) view16.findViewById(R.id.edtBirthDateFifteenChildren) : null;
        List<AsikListFamilyItem> list = p0;
        TextInputEditText textInputEditText20 = textInputEditText19;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            TextInputEditText textInputEditText21 = textInputEditText12;
            TextInputEditText textInputEditText22 = textInputEditText11;
            TextInputEditText textInputEditText23 = textInputEditText10;
            if (Intrinsics.areEqual(((AsikListFamilyItem) obj).getFamilyStatus(), "I")) {
                arrayList.add(obj);
            }
            textInputEditText12 = textInputEditText21;
            textInputEditText10 = textInputEditText23;
            textInputEditText11 = textInputEditText22;
        }
        TextInputEditText textInputEditText24 = textInputEditText10;
        TextInputEditText textInputEditText25 = textInputEditText11;
        TextInputEditText textInputEditText26 = textInputEditText12;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Iterator it2 = it;
            TextInputEditText textInputEditText27 = textInputEditText9;
            if (Intrinsics.areEqual(((AsikListFamilyItem) next).getFamilyStatus(), ExifInterface.LATITUDE_SOUTH)) {
                arrayList3.add(next);
            }
            it = it2;
            textInputEditText9 = textInputEditText27;
        }
        TextInputEditText textInputEditText28 = textInputEditText9;
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            Iterator it4 = it3;
            if (Intrinsics.areEqual(((AsikListFamilyItem) next2).getFamilyStatus(), ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
                arrayList5.add(next2);
            }
            it3 = it4;
        }
        ArrayList arrayList6 = arrayList5;
        AsikListFamilyItem asikListFamilyItem = new AsikListFamilyItem("", "", "", "", "", "", "", "", "");
        if (arrayList2.isEmpty() || createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList2)) {
            this.cancel.add(asikListFamilyItem);
        } else {
            this.cancel.addAll(arrayList2);
        }
        if (arrayList4.isEmpty() || createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList4)) {
            this.notify.add(asikListFamilyItem);
        } else {
            this.notify.addAll(arrayList4);
        }
        if (arrayList6.isEmpty() || createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList6)) {
            this.onTransact.add(asikListFamilyItem);
        } else {
            this.onTransact.addAll(arrayList6);
        }
        if (arrayList2.size() > 0) {
            this.asBinder = MaritalStatus.MARRIED.getType();
            EditText editText = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
            if (editText != null) {
                editText.setText(this.asBinder);
                Unit unit = Unit.INSTANCE;
            }
            EditText editText2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName.getEditText();
            if (editText2 != null) {
                editText2.setText(String.valueOf(((AsikListFamilyItem) arrayList2.get(0)).getFullName()));
                Unit unit2 = Unit.INSTANCE;
            }
            if (textInputEditText != null) {
                textInputEditText.setText(String.valueOf(((AsikListFamilyItem) arrayList2.get(0)).getBirthDate()));
                Unit unit3 = Unit.INSTANCE;
            }
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.edtChildren.setText(String.valueOf(arrayList6.size()));
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            Unit unit4 = Unit.INSTANCE;
        } else if (arrayList4.size() > 0) {
            this.asBinder = MaritalStatus.MARRIED.getType();
            EditText editText3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
            if (editText3 != null) {
                editText3.setText(this.asBinder);
                Unit unit5 = Unit.INSTANCE;
            }
            EditText editText4 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName.getEditText();
            if (editText4 != null) {
                editText4.setText(String.valueOf(((AsikListFamilyItem) arrayList4.get(0)).getFullName()));
                Unit unit6 = Unit.INSTANCE;
            }
            if (textInputEditText != null) {
                textInputEditText.setText(String.valueOf(((AsikListFamilyItem) arrayList4.get(0)).getBirthDate()));
                Unit unit7 = Unit.INSTANCE;
            }
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.edtChildren.setText(String.valueOf(arrayList6.size()));
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            Unit unit8 = Unit.INSTANCE;
        } else {
            this.asBinder = MaritalStatus.SINGLE.getType();
            EditText editText5 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
            if (editText5 != null) {
                editText5.setText(this.asBinder);
                Unit unit9 = Unit.INSTANCE;
            }
        }
        switch (arrayList6.size()) {
            case 0:
                Unit unit10 = Unit.INSTANCE;
                break;
            case 1:
                EditText editText6 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText6 != null) {
                    String fullName = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText6.setText(fullName != null ? fullName.toString() : null);
                    Unit unit11 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit12 = Unit.INSTANCE;
                }
                break;
            case 2:
                EditText editText7 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText7 != null) {
                    String fullName2 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText7.setText(fullName2 != null ? fullName2.toString() : null);
                    Unit unit13 = Unit.INSTANCE;
                }
                EditText editText8 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText8 != null) {
                    String fullName3 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText8.setText(fullName3 != null ? fullName3.toString() : null);
                    Unit unit14 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit15 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit16 = Unit.INSTANCE;
                }
                break;
            case 3:
                EditText editText9 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText9 != null) {
                    String fullName4 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText9.setText(fullName4 != null ? fullName4.toString() : null);
                    Unit unit17 = Unit.INSTANCE;
                }
                EditText editText10 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText10 != null) {
                    String fullName5 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText10.setText(fullName5 != null ? fullName5.toString() : null);
                    Unit unit18 = Unit.INSTANCE;
                }
                EditText editText11 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText11 != null) {
                    String fullName6 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText11.setText(fullName6 != null ? fullName6.toString() : null);
                    Unit unit19 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit20 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit21 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit22 = Unit.INSTANCE;
                }
                break;
            case 4:
                EditText editText12 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText12 != null) {
                    String fullName7 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText12.setText(fullName7 != null ? fullName7.toString() : null);
                    Unit unit23 = Unit.INSTANCE;
                }
                EditText editText13 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText13 != null) {
                    String fullName8 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText13.setText(fullName8 != null ? fullName8.toString() : null);
                    Unit unit24 = Unit.INSTANCE;
                }
                EditText editText14 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText14 != null) {
                    String fullName9 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText14.setText(fullName9 != null ? fullName9.toString() : null);
                    Unit unit25 = Unit.INSTANCE;
                }
                EditText editText15 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText15 != null) {
                    String fullName10 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText15.setText(fullName10 != null ? fullName10.toString() : null);
                    Unit unit26 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit27 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit28 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit29 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit30 = Unit.INSTANCE;
                }
                break;
            case 5:
                EditText editText16 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText16 != null) {
                    String fullName11 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText16.setText(fullName11 != null ? fullName11.toString() : null);
                    Unit unit31 = Unit.INSTANCE;
                }
                EditText editText17 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText17 != null) {
                    String fullName12 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText17.setText(fullName12 != null ? fullName12.toString() : null);
                    Unit unit32 = Unit.INSTANCE;
                }
                EditText editText18 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText18 != null) {
                    String fullName13 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText18.setText(fullName13 != null ? fullName13.toString() : null);
                    Unit unit33 = Unit.INSTANCE;
                }
                EditText editText19 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText19 != null) {
                    String fullName14 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText19.setText(fullName14 != null ? fullName14.toString() : null);
                    Unit unit34 = Unit.INSTANCE;
                }
                EditText editText20 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText20 != null) {
                    String fullName15 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText20.setText(fullName15 != null ? fullName15.toString() : null);
                    Unit unit35 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit36 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit37 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit38 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit39 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit40 = Unit.INSTANCE;
                }
                break;
            case 6:
                EditText editText21 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText21 != null) {
                    String fullName16 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText21.setText(fullName16 != null ? fullName16.toString() : null);
                    Unit unit41 = Unit.INSTANCE;
                }
                EditText editText22 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText22 != null) {
                    String fullName17 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText22.setText(fullName17 != null ? fullName17.toString() : null);
                    Unit unit42 = Unit.INSTANCE;
                }
                EditText editText23 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText23 != null) {
                    String fullName18 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText23.setText(fullName18 != null ? fullName18.toString() : null);
                    Unit unit43 = Unit.INSTANCE;
                }
                EditText editText24 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText24 != null) {
                    String fullName19 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText24.setText(fullName19 != null ? fullName19.toString() : null);
                    Unit unit44 = Unit.INSTANCE;
                }
                EditText editText25 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText25 != null) {
                    String fullName20 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText25.setText(fullName20 != null ? fullName20.toString() : null);
                    Unit unit45 = Unit.INSTANCE;
                }
                EditText editText26 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                if (editText26 != null) {
                    String fullName21 = ((AsikListFamilyItem) arrayList6.get(5)).getFullName();
                    editText26.setText(fullName21 != null ? fullName21.toString() : null);
                    Unit unit46 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit47 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit48 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit49 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit50 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit51 = Unit.INSTANCE;
                }
                if (textInputEditText7 != null) {
                    textInputEditText7.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(5)).getBirthDate()));
                    Unit unit52 = Unit.INSTANCE;
                }
                break;
            case 7:
                EditText editText27 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText27 != null) {
                    String fullName22 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText27.setText(fullName22 != null ? fullName22.toString() : null);
                    Unit unit53 = Unit.INSTANCE;
                }
                EditText editText28 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText28 != null) {
                    String fullName23 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText28.setText(fullName23 != null ? fullName23.toString() : null);
                    Unit unit54 = Unit.INSTANCE;
                }
                EditText editText29 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText29 != null) {
                    String fullName24 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText29.setText(fullName24 != null ? fullName24.toString() : null);
                    Unit unit55 = Unit.INSTANCE;
                }
                EditText editText30 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText30 != null) {
                    String fullName25 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText30.setText(fullName25 != null ? fullName25.toString() : null);
                    Unit unit56 = Unit.INSTANCE;
                }
                EditText editText31 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText31 != null) {
                    String fullName26 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText31.setText(fullName26 != null ? fullName26.toString() : null);
                    Unit unit57 = Unit.INSTANCE;
                }
                EditText editText32 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                if (editText32 != null) {
                    String fullName27 = ((AsikListFamilyItem) arrayList6.get(5)).getFullName();
                    editText32.setText(fullName27 != null ? fullName27.toString() : null);
                    Unit unit58 = Unit.INSTANCE;
                }
                EditText editText33 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
                if (editText33 != null) {
                    String fullName28 = ((AsikListFamilyItem) arrayList6.get(6)).getFullName();
                    editText33.setText(fullName28 != null ? fullName28.toString() : null);
                    Unit unit59 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit60 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit61 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit62 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit63 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit64 = Unit.INSTANCE;
                }
                if (textInputEditText7 != null) {
                    textInputEditText7.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(5)).getBirthDate()));
                    Unit unit65 = Unit.INSTANCE;
                }
                if (textInputEditText8 != null) {
                    textInputEditText8.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(6)).getBirthDate()));
                    Unit unit66 = Unit.INSTANCE;
                }
                break;
            case 8:
                EditText editText34 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText34 != null) {
                    String fullName29 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText34.setText(fullName29 != null ? fullName29.toString() : null);
                    Unit unit67 = Unit.INSTANCE;
                }
                EditText editText35 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText35 != null) {
                    String fullName30 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText35.setText(fullName30 != null ? fullName30.toString() : null);
                    Unit unit68 = Unit.INSTANCE;
                }
                EditText editText36 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText36 != null) {
                    String fullName31 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText36.setText(fullName31 != null ? fullName31.toString() : null);
                    Unit unit69 = Unit.INSTANCE;
                }
                EditText editText37 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText37 != null) {
                    String fullName32 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText37.setText(fullName32 != null ? fullName32.toString() : null);
                    Unit unit70 = Unit.INSTANCE;
                }
                EditText editText38 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText38 != null) {
                    String fullName33 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText38.setText(fullName33 != null ? fullName33.toString() : null);
                    Unit unit71 = Unit.INSTANCE;
                }
                EditText editText39 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                if (editText39 != null) {
                    String fullName34 = ((AsikListFamilyItem) arrayList6.get(5)).getFullName();
                    editText39.setText(fullName34 != null ? fullName34.toString() : null);
                    Unit unit72 = Unit.INSTANCE;
                }
                EditText editText40 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
                if (editText40 != null) {
                    String fullName35 = ((AsikListFamilyItem) arrayList6.get(6)).getFullName();
                    editText40.setText(fullName35 != null ? fullName35.toString() : null);
                    Unit unit73 = Unit.INSTANCE;
                }
                EditText editText41 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild.getEditText();
                if (editText41 != null) {
                    String fullName36 = ((AsikListFamilyItem) arrayList6.get(7)).getFullName();
                    editText41.setText(fullName36 != null ? fullName36.toString() : null);
                    Unit unit74 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit75 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit76 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit77 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit78 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit79 = Unit.INSTANCE;
                }
                if (textInputEditText7 != null) {
                    textInputEditText7.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(5)).getBirthDate()));
                    Unit unit80 = Unit.INSTANCE;
                }
                if (textInputEditText8 != null) {
                    textInputEditText8.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(6)).getBirthDate()));
                    Unit unit81 = Unit.INSTANCE;
                }
                if (textInputEditText28 != null) {
                    textInputEditText28.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(7)).getBirthDate()));
                    Unit unit82 = Unit.INSTANCE;
                }
                break;
            case 9:
                EditText editText42 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText42 != null) {
                    String fullName37 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText42.setText(fullName37 != null ? fullName37.toString() : null);
                    Unit unit83 = Unit.INSTANCE;
                }
                EditText editText43 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText43 != null) {
                    String fullName38 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText43.setText(fullName38 != null ? fullName38.toString() : null);
                    Unit unit84 = Unit.INSTANCE;
                }
                EditText editText44 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText44 != null) {
                    String fullName39 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText44.setText(fullName39 != null ? fullName39.toString() : null);
                    Unit unit85 = Unit.INSTANCE;
                }
                EditText editText45 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText45 != null) {
                    String fullName40 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText45.setText(fullName40 != null ? fullName40.toString() : null);
                    Unit unit86 = Unit.INSTANCE;
                }
                EditText editText46 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText46 != null) {
                    String fullName41 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText46.setText(fullName41 != null ? fullName41.toString() : null);
                    Unit unit87 = Unit.INSTANCE;
                }
                EditText editText47 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                if (editText47 != null) {
                    String fullName42 = ((AsikListFamilyItem) arrayList6.get(5)).getFullName();
                    editText47.setText(fullName42 != null ? fullName42.toString() : null);
                    Unit unit88 = Unit.INSTANCE;
                }
                EditText editText48 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
                if (editText48 != null) {
                    String fullName43 = ((AsikListFamilyItem) arrayList6.get(6)).getFullName();
                    editText48.setText(fullName43 != null ? fullName43.toString() : null);
                    Unit unit89 = Unit.INSTANCE;
                }
                EditText editText49 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild.getEditText();
                if (editText49 != null) {
                    String fullName44 = ((AsikListFamilyItem) arrayList6.get(7)).getFullName();
                    editText49.setText(fullName44 != null ? fullName44.toString() : null);
                    Unit unit90 = Unit.INSTANCE;
                }
                EditText editText50 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild.getEditText();
                if (editText50 != null) {
                    String fullName45 = ((AsikListFamilyItem) arrayList6.get(8)).getFullName();
                    editText50.setText(fullName45 != null ? fullName45.toString() : null);
                    Unit unit91 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit92 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit93 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit94 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit95 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit96 = Unit.INSTANCE;
                }
                if (textInputEditText7 != null) {
                    textInputEditText7.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(5)).getBirthDate()));
                    Unit unit97 = Unit.INSTANCE;
                }
                if (textInputEditText8 != null) {
                    textInputEditText8.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(6)).getBirthDate()));
                    Unit unit98 = Unit.INSTANCE;
                }
                if (textInputEditText28 != null) {
                    textInputEditText28.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(7)).getBirthDate()));
                    Unit unit99 = Unit.INSTANCE;
                }
                if (textInputEditText24 != null) {
                    textInputEditText24.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(8)).getBirthDate()));
                    Unit unit100 = Unit.INSTANCE;
                }
                break;
            case 10:
                EditText editText51 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText51 != null) {
                    String fullName46 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText51.setText(fullName46 != null ? fullName46.toString() : null);
                    Unit unit101 = Unit.INSTANCE;
                }
                EditText editText52 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText52 != null) {
                    String fullName47 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText52.setText(fullName47 != null ? fullName47.toString() : null);
                    Unit unit102 = Unit.INSTANCE;
                }
                EditText editText53 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText53 != null) {
                    String fullName48 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText53.setText(fullName48 != null ? fullName48.toString() : null);
                    Unit unit103 = Unit.INSTANCE;
                }
                EditText editText54 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText54 != null) {
                    String fullName49 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText54.setText(fullName49 != null ? fullName49.toString() : null);
                    Unit unit104 = Unit.INSTANCE;
                }
                EditText editText55 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText55 != null) {
                    String fullName50 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText55.setText(fullName50 != null ? fullName50.toString() : null);
                    Unit unit105 = Unit.INSTANCE;
                }
                EditText editText56 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                if (editText56 != null) {
                    String fullName51 = ((AsikListFamilyItem) arrayList6.get(5)).getFullName();
                    editText56.setText(fullName51 != null ? fullName51.toString() : null);
                    Unit unit106 = Unit.INSTANCE;
                }
                EditText editText57 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
                if (editText57 != null) {
                    String fullName52 = ((AsikListFamilyItem) arrayList6.get(6)).getFullName();
                    editText57.setText(fullName52 != null ? fullName52.toString() : null);
                    Unit unit107 = Unit.INSTANCE;
                }
                EditText editText58 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild.getEditText();
                if (editText58 != null) {
                    String fullName53 = ((AsikListFamilyItem) arrayList6.get(7)).getFullName();
                    editText58.setText(fullName53 != null ? fullName53.toString() : null);
                    Unit unit108 = Unit.INSTANCE;
                }
                EditText editText59 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild.getEditText();
                if (editText59 != null) {
                    String fullName54 = ((AsikListFamilyItem) arrayList6.get(8)).getFullName();
                    editText59.setText(fullName54 != null ? fullName54.toString() : null);
                    Unit unit109 = Unit.INSTANCE;
                }
                EditText editText60 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild.getEditText();
                if (editText60 != null) {
                    String fullName55 = ((AsikListFamilyItem) arrayList6.get(9)).getFullName();
                    editText60.setText(fullName55 != null ? fullName55.toString() : null);
                    Unit unit110 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit111 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit112 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit113 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit114 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit115 = Unit.INSTANCE;
                }
                if (textInputEditText7 != null) {
                    textInputEditText7.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(5)).getBirthDate()));
                    Unit unit116 = Unit.INSTANCE;
                }
                if (textInputEditText8 != null) {
                    textInputEditText8.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(6)).getBirthDate()));
                    Unit unit117 = Unit.INSTANCE;
                }
                if (textInputEditText28 != null) {
                    textInputEditText28.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(7)).getBirthDate()));
                    Unit unit118 = Unit.INSTANCE;
                }
                if (textInputEditText24 != null) {
                    textInputEditText24.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(8)).getBirthDate()));
                    Unit unit119 = Unit.INSTANCE;
                }
                if (textInputEditText25 != null) {
                    textInputEditText25.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(9)).getBirthDate()));
                    Unit unit120 = Unit.INSTANCE;
                }
                break;
            case 11:
                EditText editText61 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText61 != null) {
                    String fullName56 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText61.setText(fullName56 != null ? fullName56.toString() : null);
                    Unit unit121 = Unit.INSTANCE;
                }
                EditText editText62 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText62 != null) {
                    String fullName57 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText62.setText(fullName57 != null ? fullName57.toString() : null);
                    Unit unit122 = Unit.INSTANCE;
                }
                EditText editText63 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText63 != null) {
                    String fullName58 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText63.setText(fullName58 != null ? fullName58.toString() : null);
                    Unit unit123 = Unit.INSTANCE;
                }
                EditText editText64 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText64 != null) {
                    String fullName59 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText64.setText(fullName59 != null ? fullName59.toString() : null);
                    Unit unit124 = Unit.INSTANCE;
                }
                EditText editText65 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText65 != null) {
                    String fullName60 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText65.setText(fullName60 != null ? fullName60.toString() : null);
                    Unit unit125 = Unit.INSTANCE;
                }
                EditText editText66 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                if (editText66 != null) {
                    String fullName61 = ((AsikListFamilyItem) arrayList6.get(5)).getFullName();
                    editText66.setText(fullName61 != null ? fullName61.toString() : null);
                    Unit unit126 = Unit.INSTANCE;
                }
                EditText editText67 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
                if (editText67 != null) {
                    String fullName62 = ((AsikListFamilyItem) arrayList6.get(6)).getFullName();
                    editText67.setText(fullName62 != null ? fullName62.toString() : null);
                    Unit unit127 = Unit.INSTANCE;
                }
                EditText editText68 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild.getEditText();
                if (editText68 != null) {
                    String fullName63 = ((AsikListFamilyItem) arrayList6.get(7)).getFullName();
                    editText68.setText(fullName63 != null ? fullName63.toString() : null);
                    Unit unit128 = Unit.INSTANCE;
                }
                EditText editText69 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild.getEditText();
                if (editText69 != null) {
                    String fullName64 = ((AsikListFamilyItem) arrayList6.get(8)).getFullName();
                    editText69.setText(fullName64 != null ? fullName64.toString() : null);
                    Unit unit129 = Unit.INSTANCE;
                }
                EditText editText70 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild.getEditText();
                if (editText70 != null) {
                    String fullName65 = ((AsikListFamilyItem) arrayList6.get(9)).getFullName();
                    editText70.setText(fullName65 != null ? fullName65.toString() : null);
                    Unit unit130 = Unit.INSTANCE;
                }
                EditText editText71 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild.getEditText();
                if (editText71 != null) {
                    String fullName66 = ((AsikListFamilyItem) arrayList6.get(10)).getFullName();
                    editText71.setText(fullName66 != null ? fullName66.toString() : null);
                    Unit unit131 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit132 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit133 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit134 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit135 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit136 = Unit.INSTANCE;
                }
                if (textInputEditText7 != null) {
                    textInputEditText7.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(5)).getBirthDate()));
                    Unit unit137 = Unit.INSTANCE;
                }
                if (textInputEditText8 != null) {
                    textInputEditText8.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(6)).getBirthDate()));
                    Unit unit138 = Unit.INSTANCE;
                }
                if (textInputEditText28 != null) {
                    textInputEditText28.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(7)).getBirthDate()));
                    Unit unit139 = Unit.INSTANCE;
                }
                if (textInputEditText24 != null) {
                    textInputEditText24.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(8)).getBirthDate()));
                    Unit unit140 = Unit.INSTANCE;
                }
                if (textInputEditText25 != null) {
                    textInputEditText25.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(9)).getBirthDate()));
                    Unit unit141 = Unit.INSTANCE;
                }
                if (textInputEditText26 != null) {
                    textInputEditText26.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(10)).getBirthDate()));
                    Unit unit142 = Unit.INSTANCE;
                }
                break;
            case 12:
                EditText editText72 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText72 != null) {
                    String fullName67 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText72.setText(fullName67 != null ? fullName67.toString() : null);
                    Unit unit143 = Unit.INSTANCE;
                }
                EditText editText73 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText73 != null) {
                    String fullName68 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText73.setText(fullName68 != null ? fullName68.toString() : null);
                    Unit unit144 = Unit.INSTANCE;
                }
                EditText editText74 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText74 != null) {
                    String fullName69 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText74.setText(fullName69 != null ? fullName69.toString() : null);
                    Unit unit145 = Unit.INSTANCE;
                }
                EditText editText75 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText75 != null) {
                    String fullName70 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText75.setText(fullName70 != null ? fullName70.toString() : null);
                    Unit unit146 = Unit.INSTANCE;
                }
                EditText editText76 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText76 != null) {
                    String fullName71 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText76.setText(fullName71 != null ? fullName71.toString() : null);
                    Unit unit147 = Unit.INSTANCE;
                }
                EditText editText77 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                if (editText77 != null) {
                    String fullName72 = ((AsikListFamilyItem) arrayList6.get(5)).getFullName();
                    editText77.setText(fullName72 != null ? fullName72.toString() : null);
                    Unit unit148 = Unit.INSTANCE;
                }
                EditText editText78 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
                if (editText78 != null) {
                    String fullName73 = ((AsikListFamilyItem) arrayList6.get(6)).getFullName();
                    editText78.setText(fullName73 != null ? fullName73.toString() : null);
                    Unit unit149 = Unit.INSTANCE;
                }
                EditText editText79 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild.getEditText();
                if (editText79 != null) {
                    String fullName74 = ((AsikListFamilyItem) arrayList6.get(7)).getFullName();
                    editText79.setText(fullName74 != null ? fullName74.toString() : null);
                    Unit unit150 = Unit.INSTANCE;
                }
                EditText editText80 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild.getEditText();
                if (editText80 != null) {
                    String fullName75 = ((AsikListFamilyItem) arrayList6.get(8)).getFullName();
                    editText80.setText(fullName75 != null ? fullName75.toString() : null);
                    Unit unit151 = Unit.INSTANCE;
                }
                EditText editText81 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild.getEditText();
                if (editText81 != null) {
                    String fullName76 = ((AsikListFamilyItem) arrayList6.get(9)).getFullName();
                    editText81.setText(fullName76 != null ? fullName76.toString() : null);
                    Unit unit152 = Unit.INSTANCE;
                }
                EditText editText82 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild.getEditText();
                if (editText82 != null) {
                    String fullName77 = ((AsikListFamilyItem) arrayList6.get(10)).getFullName();
                    editText82.setText(fullName77 != null ? fullName77.toString() : null);
                    Unit unit153 = Unit.INSTANCE;
                }
                EditText editText83 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild.getEditText();
                if (editText83 != null) {
                    String fullName78 = ((AsikListFamilyItem) arrayList6.get(11)).getFullName();
                    editText83.setText(fullName78 != null ? fullName78.toString() : null);
                    Unit unit154 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit155 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit156 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit157 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit158 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit159 = Unit.INSTANCE;
                }
                if (textInputEditText7 != null) {
                    textInputEditText7.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(5)).getBirthDate()));
                    Unit unit160 = Unit.INSTANCE;
                }
                if (textInputEditText8 != null) {
                    textInputEditText8.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(6)).getBirthDate()));
                    Unit unit161 = Unit.INSTANCE;
                }
                if (textInputEditText28 != null) {
                    textInputEditText28.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(7)).getBirthDate()));
                    Unit unit162 = Unit.INSTANCE;
                }
                if (textInputEditText24 != null) {
                    textInputEditText24.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(8)).getBirthDate()));
                    Unit unit163 = Unit.INSTANCE;
                }
                if (textInputEditText25 != null) {
                    textInputEditText25.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(9)).getBirthDate()));
                    Unit unit164 = Unit.INSTANCE;
                }
                if (textInputEditText26 != null) {
                    textInputEditText26.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(10)).getBirthDate()));
                    Unit unit165 = Unit.INSTANCE;
                }
                if (textInputEditText14 != null) {
                    textInputEditText14.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(11)).getBirthDate()));
                    Unit unit166 = Unit.INSTANCE;
                }
                break;
            case 13:
                EditText editText84 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText84 != null) {
                    String fullName79 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText84.setText(fullName79 != null ? fullName79.toString() : null);
                    Unit unit167 = Unit.INSTANCE;
                }
                EditText editText85 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText85 != null) {
                    String fullName80 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText85.setText(fullName80 != null ? fullName80.toString() : null);
                    Unit unit168 = Unit.INSTANCE;
                }
                EditText editText86 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText86 != null) {
                    String fullName81 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText86.setText(fullName81 != null ? fullName81.toString() : null);
                    Unit unit169 = Unit.INSTANCE;
                }
                EditText editText87 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText87 != null) {
                    String fullName82 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText87.setText(fullName82 != null ? fullName82.toString() : null);
                    Unit unit170 = Unit.INSTANCE;
                }
                EditText editText88 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText88 != null) {
                    String fullName83 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText88.setText(fullName83 != null ? fullName83.toString() : null);
                    Unit unit171 = Unit.INSTANCE;
                }
                EditText editText89 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                if (editText89 != null) {
                    String fullName84 = ((AsikListFamilyItem) arrayList6.get(5)).getFullName();
                    editText89.setText(fullName84 != null ? fullName84.toString() : null);
                    Unit unit172 = Unit.INSTANCE;
                }
                EditText editText90 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
                if (editText90 != null) {
                    String fullName85 = ((AsikListFamilyItem) arrayList6.get(6)).getFullName();
                    editText90.setText(fullName85 != null ? fullName85.toString() : null);
                    Unit unit173 = Unit.INSTANCE;
                }
                EditText editText91 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild.getEditText();
                if (editText91 != null) {
                    String fullName86 = ((AsikListFamilyItem) arrayList6.get(7)).getFullName();
                    editText91.setText(fullName86 != null ? fullName86.toString() : null);
                    Unit unit174 = Unit.INSTANCE;
                }
                EditText editText92 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild.getEditText();
                if (editText92 != null) {
                    String fullName87 = ((AsikListFamilyItem) arrayList6.get(8)).getFullName();
                    editText92.setText(fullName87 != null ? fullName87.toString() : null);
                    Unit unit175 = Unit.INSTANCE;
                }
                EditText editText93 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild.getEditText();
                if (editText93 != null) {
                    String fullName88 = ((AsikListFamilyItem) arrayList6.get(9)).getFullName();
                    editText93.setText(fullName88 != null ? fullName88.toString() : null);
                    Unit unit176 = Unit.INSTANCE;
                }
                EditText editText94 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild.getEditText();
                if (editText94 != null) {
                    String fullName89 = ((AsikListFamilyItem) arrayList6.get(10)).getFullName();
                    editText94.setText(fullName89 != null ? fullName89.toString() : null);
                    Unit unit177 = Unit.INSTANCE;
                }
                EditText editText95 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild.getEditText();
                if (editText95 != null) {
                    String fullName90 = ((AsikListFamilyItem) arrayList6.get(11)).getFullName();
                    editText95.setText(fullName90 != null ? fullName90.toString() : null);
                    Unit unit178 = Unit.INSTANCE;
                }
                EditText editText96 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild.getEditText();
                if (editText96 != null) {
                    String fullName91 = ((AsikListFamilyItem) arrayList6.get(12)).getFullName();
                    editText96.setText(fullName91 != null ? fullName91.toString() : null);
                    Unit unit179 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit180 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit181 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit182 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit183 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit184 = Unit.INSTANCE;
                }
                if (textInputEditText7 != null) {
                    textInputEditText7.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(5)).getBirthDate()));
                    Unit unit185 = Unit.INSTANCE;
                }
                if (textInputEditText8 != null) {
                    textInputEditText8.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(6)).getBirthDate()));
                    Unit unit186 = Unit.INSTANCE;
                }
                if (textInputEditText28 != null) {
                    textInputEditText28.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(7)).getBirthDate()));
                    Unit unit187 = Unit.INSTANCE;
                }
                if (textInputEditText24 != null) {
                    textInputEditText24.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(8)).getBirthDate()));
                    Unit unit188 = Unit.INSTANCE;
                }
                if (textInputEditText25 != null) {
                    textInputEditText25.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(9)).getBirthDate()));
                    Unit unit189 = Unit.INSTANCE;
                }
                if (textInputEditText26 != null) {
                    textInputEditText26.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(10)).getBirthDate()));
                    Unit unit190 = Unit.INSTANCE;
                }
                if (textInputEditText14 != null) {
                    textInputEditText14.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(11)).getBirthDate()));
                    Unit unit191 = Unit.INSTANCE;
                }
                if (textInputEditText16 != null) {
                    textInputEditText16.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(12)).getBirthDate()));
                    Unit unit192 = Unit.INSTANCE;
                }
                break;
            case 14:
                EditText editText97 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText97 != null) {
                    String fullName92 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText97.setText(fullName92 != null ? fullName92.toString() : null);
                    Unit unit193 = Unit.INSTANCE;
                }
                EditText editText98 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText98 != null) {
                    String fullName93 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText98.setText(fullName93 != null ? fullName93.toString() : null);
                    Unit unit194 = Unit.INSTANCE;
                }
                EditText editText99 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText99 != null) {
                    String fullName94 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText99.setText(fullName94 != null ? fullName94.toString() : null);
                    Unit unit195 = Unit.INSTANCE;
                }
                EditText editText100 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText100 != null) {
                    String fullName95 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText100.setText(fullName95 != null ? fullName95.toString() : null);
                    Unit unit196 = Unit.INSTANCE;
                }
                EditText editText101 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText101 != null) {
                    String fullName96 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText101.setText(fullName96 != null ? fullName96.toString() : null);
                    Unit unit197 = Unit.INSTANCE;
                }
                EditText editText102 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                if (editText102 != null) {
                    String fullName97 = ((AsikListFamilyItem) arrayList6.get(5)).getFullName();
                    editText102.setText(fullName97 != null ? fullName97.toString() : null);
                    Unit unit198 = Unit.INSTANCE;
                }
                EditText editText103 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
                if (editText103 != null) {
                    String fullName98 = ((AsikListFamilyItem) arrayList6.get(6)).getFullName();
                    editText103.setText(fullName98 != null ? fullName98.toString() : null);
                    Unit unit199 = Unit.INSTANCE;
                }
                EditText editText104 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild.getEditText();
                if (editText104 != null) {
                    String fullName99 = ((AsikListFamilyItem) arrayList6.get(7)).getFullName();
                    editText104.setText(fullName99 != null ? fullName99.toString() : null);
                    Unit unit200 = Unit.INSTANCE;
                }
                EditText editText105 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild.getEditText();
                if (editText105 != null) {
                    String fullName100 = ((AsikListFamilyItem) arrayList6.get(8)).getFullName();
                    editText105.setText(fullName100 != null ? fullName100.toString() : null);
                    Unit unit201 = Unit.INSTANCE;
                }
                EditText editText106 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild.getEditText();
                if (editText106 != null) {
                    String fullName101 = ((AsikListFamilyItem) arrayList6.get(9)).getFullName();
                    editText106.setText(fullName101 != null ? fullName101.toString() : null);
                    Unit unit202 = Unit.INSTANCE;
                }
                EditText editText107 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild.getEditText();
                if (editText107 != null) {
                    String fullName102 = ((AsikListFamilyItem) arrayList6.get(10)).getFullName();
                    editText107.setText(fullName102 != null ? fullName102.toString() : null);
                    Unit unit203 = Unit.INSTANCE;
                }
                EditText editText108 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild.getEditText();
                if (editText108 != null) {
                    String fullName103 = ((AsikListFamilyItem) arrayList6.get(11)).getFullName();
                    editText108.setText(fullName103 != null ? fullName103.toString() : null);
                    Unit unit204 = Unit.INSTANCE;
                }
                EditText editText109 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild.getEditText();
                if (editText109 != null) {
                    String fullName104 = ((AsikListFamilyItem) arrayList6.get(12)).getFullName();
                    editText109.setText(fullName104 != null ? fullName104.toString() : null);
                    Unit unit205 = Unit.INSTANCE;
                }
                EditText editText110 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild.getEditText();
                if (editText110 != null) {
                    String fullName105 = ((AsikListFamilyItem) arrayList6.get(13)).getFullName();
                    editText110.setText(fullName105 != null ? fullName105.toString() : null);
                    Unit unit206 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit207 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit208 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit209 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit210 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit211 = Unit.INSTANCE;
                }
                if (textInputEditText7 != null) {
                    textInputEditText7.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(5)).getBirthDate()));
                    Unit unit212 = Unit.INSTANCE;
                }
                if (textInputEditText8 != null) {
                    textInputEditText8.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(6)).getBirthDate()));
                    Unit unit213 = Unit.INSTANCE;
                }
                if (textInputEditText28 != null) {
                    textInputEditText28.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(7)).getBirthDate()));
                    Unit unit214 = Unit.INSTANCE;
                }
                if (textInputEditText24 != null) {
                    textInputEditText24.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(8)).getBirthDate()));
                    Unit unit215 = Unit.INSTANCE;
                }
                if (textInputEditText25 != null) {
                    textInputEditText25.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(9)).getBirthDate()));
                    Unit unit216 = Unit.INSTANCE;
                }
                if (textInputEditText26 != null) {
                    textInputEditText26.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(10)).getBirthDate()));
                    Unit unit217 = Unit.INSTANCE;
                }
                if (textInputEditText14 != null) {
                    textInputEditText14.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(11)).getBirthDate()));
                    Unit unit218 = Unit.INSTANCE;
                }
                if (textInputEditText16 != null) {
                    textInputEditText16.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(12)).getBirthDate()));
                    Unit unit219 = Unit.INSTANCE;
                }
                if (textInputEditText18 != null) {
                    textInputEditText18.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(13)).getBirthDate()));
                    Unit unit220 = Unit.INSTANCE;
                }
                break;
            default:
                EditText editText111 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                if (editText111 != null) {
                    String fullName106 = ((AsikListFamilyItem) arrayList6.get(0)).getFullName();
                    editText111.setText(fullName106 != null ? fullName106.toString() : null);
                    Unit unit221 = Unit.INSTANCE;
                }
                EditText editText112 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                if (editText112 != null) {
                    String fullName107 = ((AsikListFamilyItem) arrayList6.get(1)).getFullName();
                    editText112.setText(fullName107 != null ? fullName107.toString() : null);
                    Unit unit222 = Unit.INSTANCE;
                }
                EditText editText113 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                if (editText113 != null) {
                    String fullName108 = ((AsikListFamilyItem) arrayList6.get(2)).getFullName();
                    editText113.setText(fullName108 != null ? fullName108.toString() : null);
                    Unit unit223 = Unit.INSTANCE;
                }
                EditText editText114 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                if (editText114 != null) {
                    String fullName109 = ((AsikListFamilyItem) arrayList6.get(3)).getFullName();
                    editText114.setText(fullName109 != null ? fullName109.toString() : null);
                    Unit unit224 = Unit.INSTANCE;
                }
                EditText editText115 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                if (editText115 != null) {
                    String fullName110 = ((AsikListFamilyItem) arrayList6.get(4)).getFullName();
                    editText115.setText(fullName110 != null ? fullName110.toString() : null);
                    Unit unit225 = Unit.INSTANCE;
                }
                EditText editText116 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                if (editText116 != null) {
                    String fullName111 = ((AsikListFamilyItem) arrayList6.get(5)).getFullName();
                    editText116.setText(fullName111 != null ? fullName111.toString() : null);
                    Unit unit226 = Unit.INSTANCE;
                }
                EditText editText117 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
                if (editText117 != null) {
                    String fullName112 = ((AsikListFamilyItem) arrayList6.get(6)).getFullName();
                    editText117.setText(fullName112 != null ? fullName112.toString() : null);
                    Unit unit227 = Unit.INSTANCE;
                }
                EditText editText118 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild.getEditText();
                if (editText118 != null) {
                    String fullName113 = ((AsikListFamilyItem) arrayList6.get(7)).getFullName();
                    editText118.setText(fullName113 != null ? fullName113.toString() : null);
                    Unit unit228 = Unit.INSTANCE;
                }
                EditText editText119 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild.getEditText();
                if (editText119 != null) {
                    String fullName114 = ((AsikListFamilyItem) arrayList6.get(8)).getFullName();
                    editText119.setText(fullName114 != null ? fullName114.toString() : null);
                    Unit unit229 = Unit.INSTANCE;
                }
                EditText editText120 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild.getEditText();
                if (editText120 != null) {
                    String fullName115 = ((AsikListFamilyItem) arrayList6.get(9)).getFullName();
                    editText120.setText(fullName115 != null ? fullName115.toString() : null);
                    Unit unit230 = Unit.INSTANCE;
                }
                EditText editText121 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild.getEditText();
                if (editText121 != null) {
                    String fullName116 = ((AsikListFamilyItem) arrayList6.get(10)).getFullName();
                    editText121.setText(fullName116 != null ? fullName116.toString() : null);
                    Unit unit231 = Unit.INSTANCE;
                }
                EditText editText122 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild.getEditText();
                if (editText122 != null) {
                    String fullName117 = ((AsikListFamilyItem) arrayList6.get(11)).getFullName();
                    editText122.setText(fullName117 != null ? fullName117.toString() : null);
                    Unit unit232 = Unit.INSTANCE;
                }
                EditText editText123 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild.getEditText();
                if (editText123 != null) {
                    String fullName118 = ((AsikListFamilyItem) arrayList6.get(12)).getFullName();
                    editText123.setText(fullName118 != null ? fullName118.toString() : null);
                    Unit unit233 = Unit.INSTANCE;
                }
                EditText editText124 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild.getEditText();
                if (editText124 != null) {
                    String fullName119 = ((AsikListFamilyItem) arrayList6.get(13)).getFullName();
                    editText124.setText(fullName119 != null ? fullName119.toString() : null);
                    Unit unit234 = Unit.INSTANCE;
                }
                EditText editText125 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild.getEditText();
                if (editText125 != null) {
                    String fullName120 = ((AsikListFamilyItem) arrayList6.get(14)).getFullName();
                    editText125.setText(fullName120 != null ? fullName120.toString() : null);
                    Unit unit235 = Unit.INSTANCE;
                }
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(0)).getBirthDate()));
                    Unit unit236 = Unit.INSTANCE;
                }
                if (textInputEditText3 != null) {
                    textInputEditText3.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(1)).getBirthDate()));
                    Unit unit237 = Unit.INSTANCE;
                }
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(2)).getBirthDate()));
                    Unit unit238 = Unit.INSTANCE;
                }
                if (textInputEditText5 != null) {
                    textInputEditText5.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(3)).getBirthDate()));
                    Unit unit239 = Unit.INSTANCE;
                }
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(4)).getBirthDate()));
                    Unit unit240 = Unit.INSTANCE;
                }
                if (textInputEditText7 != null) {
                    textInputEditText7.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(5)).getBirthDate()));
                    Unit unit241 = Unit.INSTANCE;
                }
                if (textInputEditText8 != null) {
                    textInputEditText8.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(6)).getBirthDate()));
                    Unit unit242 = Unit.INSTANCE;
                }
                if (textInputEditText28 != null) {
                    textInputEditText28.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(7)).getBirthDate()));
                    Unit unit243 = Unit.INSTANCE;
                }
                if (textInputEditText24 != null) {
                    textInputEditText24.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(8)).getBirthDate()));
                    Unit unit244 = Unit.INSTANCE;
                }
                if (textInputEditText25 != null) {
                    textInputEditText25.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(9)).getBirthDate()));
                    Unit unit245 = Unit.INSTANCE;
                }
                if (textInputEditText26 != null) {
                    textInputEditText26.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(10)).getBirthDate()));
                    Unit unit246 = Unit.INSTANCE;
                }
                if (textInputEditText14 != null) {
                    textInputEditText14.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(11)).getBirthDate()));
                    Unit unit247 = Unit.INSTANCE;
                }
                if (textInputEditText16 != null) {
                    textInputEditText16.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(12)).getBirthDate()));
                    Unit unit248 = Unit.INSTANCE;
                }
                if (textInputEditText18 != null) {
                    textInputEditText18.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(13)).getBirthDate()));
                    Unit unit249 = Unit.INSTANCE;
                }
                if (textInputEditText20 != null) {
                    textInputEditText20.setText(String.valueOf(((AsikListFamilyItem) arrayList6.get(14)).getBirthDate()));
                    Unit unit250 = Unit.INSTANCE;
                }
                break;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMotherName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
        if (editText2 != null) {
            Intrinsics.checkNotNullParameter(editText2, "");
            editText2.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
        if (editText3 != null) {
            Intrinsics.checkNotNullParameter(editText3, "");
            editText3.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText4 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
        if (editText4 != null) {
            Intrinsics.checkNotNullParameter(editText4, "");
            editText4.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText5 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
        if (editText5 != null) {
            Intrinsics.checkNotNullParameter(editText5, "");
            editText5.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText6 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
        if (editText6 != null) {
            Intrinsics.checkNotNullParameter(editText6, "");
            editText6.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText7 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
        if (editText7 != null) {
            Intrinsics.checkNotNullParameter(editText7, "");
            editText7.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText8 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
        if (editText8 != null) {
            Intrinsics.checkNotNullParameter(editText8, "");
            editText8.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText9 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild.getEditText();
        if (editText9 != null) {
            Intrinsics.checkNotNullParameter(editText9, "");
            editText9.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText10 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild.getEditText();
        if (editText10 != null) {
            Intrinsics.checkNotNullParameter(editText10, "");
            editText10.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText11 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild.getEditText();
        if (editText11 != null) {
            Intrinsics.checkNotNullParameter(editText11, "");
            editText11.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText12 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild.getEditText();
        if (editText12 != null) {
            Intrinsics.checkNotNullParameter(editText12, "");
            editText12.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText13 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild.getEditText();
        if (editText13 != null) {
            Intrinsics.checkNotNullParameter(editText13, "");
            editText13.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText14 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild.getEditText();
        if (editText14 != null) {
            Intrinsics.checkNotNullParameter(editText14, "");
            editText14.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText15 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
        if (editText15 != null) {
            Intrinsics.checkNotNullParameter(editText15, "");
            editText15.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText16 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName.getEditText();
        if (editText16 != null) {
            Intrinsics.checkNotNullParameter(editText16, "");
            editText16.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText17 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFatherName.getEditText();
        if (editText17 != null) {
            Intrinsics.checkNotNullParameter(editText17, "");
            editText17.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText18 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilAddressPostalCode.getEditText();
        if (editText18 != null) {
            Intrinsics.checkNotNullParameter(editText18, "");
            editText18.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        User user = (User) this.b.getValue();
        if (!StringsKt.equals$default(user != null ? user.notify : null, Gender.L.getType(), false, 2, null)) {
            User user2 = (User) this.b.getValue();
            if (!Intrinsics.areEqual(user2 != null ? user2.notify : null, "L")) {
                User user3 = (User) this.b.getValue();
                if (!StringsKt.equals$default(user3 != null ? user3.notify : null, Gender.P.getType(), false, 2, null)) {
                    User user4 = (User) this.b.getValue();
                    if (!Intrinsics.areEqual(user4 != null ? user4.notify : null, "P")) {
                        return;
                    }
                }
                INotificationSideChannelStub().rgChooseGender.check(R.id.rbFemale);
                return;
            }
        }
        INotificationSideChannelStub().rgChooseGender.check(R.id.rbMale);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub = INotificationSideChannelStub();
        Editable text = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.edtChildren.getText();
        if (text != null) {
            if (text.toString().equals(this.asInterface)) {
                MaterialButton materialButton = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault1(materialButton);
                MaterialButton materialButton2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton2, "");
                suspendUseCases.b(materialButton2);
                TextInputLayout textInputLayout = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout);
                TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout2);
                TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout3);
                TextInputLayout textInputLayout4 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout4);
                TextInputLayout textInputLayout5 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout5);
                TextInputLayout textInputLayout6 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout6);
                TextInputLayout textInputLayout7 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout7);
                TextInputLayout textInputLayout8 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout8);
                TextInputLayout textInputLayout9 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout9);
                TextInputLayout textInputLayout10 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout10, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout10);
                TextInputLayout textInputLayout11 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout11, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout11);
                TextInputLayout textInputLayout12 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout12, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout12);
                TextInputLayout textInputLayout13 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout13, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout13);
                TextInputLayout textInputLayout14 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout14, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout14);
                TextInputLayout textInputLayout15 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout15, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout15);
                TextInputLayout textInputLayout16 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout16, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout16);
                TextInputLayout textInputLayout17 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout17, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout17);
                TextInputLayout textInputLayout18 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout18, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout18);
                TextInputLayout textInputLayout19 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout19, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout19);
                TextInputLayout textInputLayout20 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout20, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout20);
                TextInputLayout textInputLayout21 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout21, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout21);
                TextInputLayout textInputLayout22 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout22, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout22);
                TextInputLayout textInputLayout23 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout23, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout23);
                TextInputLayout textInputLayout24 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout24, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout24);
                TextInputLayout textInputLayout25 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout25, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout25);
                TextInputLayout textInputLayout26 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout26, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout26);
                TextInputLayout textInputLayout27 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout27, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout27);
                TextInputLayout textInputLayout28 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout28, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout28);
                TextInputLayout textInputLayout29 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout29, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout29);
                TextInputLayout textInputLayout30 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout30, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout30);
                TextInputLayout textInputLayout31 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout31, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout31);
                TextInputLayout textInputLayout32 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout32, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout32);
                TextInputLayout textInputLayout33 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout33, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout33);
                TextInputLayout textInputLayout34 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout34, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout34);
                TextInputLayout textInputLayout35 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout35, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout35);
                TextInputLayout textInputLayout36 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout36, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout36);
                TextInputLayout textInputLayout37 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout37, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout37);
                TextInputLayout textInputLayout38 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout38, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout38);
                TextInputLayout textInputLayout39 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout39, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout39);
                TextInputLayout textInputLayout40 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout40, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout40);
            } else if (text.toString().equals("1")) {
                MaterialButton materialButton3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton3, "");
                suspendUseCases.b(materialButton3);
                MaterialButton materialButton4 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton4, "");
                suspendUseCases.b(materialButton4);
                TextInputLayout textInputLayout41 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout41, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout41);
                TextInputLayout textInputLayout42 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout42, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout42);
                TextInputLayout textInputLayout43 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout43, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout43);
                TextInputLayout textInputLayout44 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout44, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout44);
                TextInputLayout textInputLayout45 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout45, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout45);
                TextInputLayout textInputLayout46 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout46, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout46);
                TextInputLayout textInputLayout47 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout47, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout47);
                TextInputLayout textInputLayout48 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout48, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout48);
                TextInputLayout textInputLayout49 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout49, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout49);
                TextInputLayout textInputLayout50 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout50, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout50);
                TextInputLayout textInputLayout51 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout51, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout51);
                TextInputLayout textInputLayout52 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout52, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout52);
                TextInputLayout textInputLayout53 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout53, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout53);
                TextInputLayout textInputLayout54 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout54, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout54);
                TextInputLayout textInputLayout55 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout55, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout55);
                TextInputLayout textInputLayout56 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout56, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout56);
                TextInputLayout textInputLayout57 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout57, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout57);
                TextInputLayout textInputLayout58 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout58, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout58);
                TextInputLayout textInputLayout59 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout59, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout59);
                TextInputLayout textInputLayout60 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout60, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout60);
                TextInputLayout textInputLayout61 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout61, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout61);
                TextInputLayout textInputLayout62 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout62, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout62);
                TextInputLayout textInputLayout63 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout63, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout63);
                TextInputLayout textInputLayout64 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout64, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout64);
                TextInputLayout textInputLayout65 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout65, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout65);
                TextInputLayout textInputLayout66 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout66, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout66);
                TextInputLayout textInputLayout67 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout67, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout67);
                TextInputLayout textInputLayout68 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout68, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout68);
                TextInputLayout textInputLayout69 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout69, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout69);
                TextInputLayout textInputLayout70 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout70, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout70);
                TextInputLayout textInputLayout71 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout71, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout71);
                TextInputLayout textInputLayout72 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout72, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout72);
                TextInputLayout textInputLayout73 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout73, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout73);
                TextInputLayout textInputLayout74 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout74, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout74);
                TextInputLayout textInputLayout75 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout75, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout75);
                TextInputLayout textInputLayout76 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout76, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout76);
                TextInputLayout textInputLayout77 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout77, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout77);
                TextInputLayout textInputLayout78 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout78, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout78);
                TextInputLayout textInputLayout79 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout79, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout79);
                TextInputLayout textInputLayout80 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout80, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout80);
            } else if (text.toString().equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                MaterialButton materialButton5 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton5, "");
                suspendUseCases.b(materialButton5);
                MaterialButton materialButton6 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton6, "");
                suspendUseCases.b(materialButton6);
                TextInputLayout textInputLayout81 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout81, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout81);
                TextInputLayout textInputLayout82 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout82, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout82);
                TextInputLayout textInputLayout83 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout83, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout83);
                TextInputLayout textInputLayout84 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout84, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout84);
                TextInputLayout textInputLayout85 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout85, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout85);
                TextInputLayout textInputLayout86 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout86, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout86);
                TextInputLayout textInputLayout87 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout87, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout87);
                TextInputLayout textInputLayout88 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout88, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout88);
                TextInputLayout textInputLayout89 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout89, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout89);
                TextInputLayout textInputLayout90 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout90, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout90);
                TextInputLayout textInputLayout91 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout91, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout91);
                TextInputLayout textInputLayout92 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout92, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout92);
                TextInputLayout textInputLayout93 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout93, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout93);
                TextInputLayout textInputLayout94 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout94, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout94);
                TextInputLayout textInputLayout95 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout95, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout95);
                TextInputLayout textInputLayout96 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout96, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout96);
                TextInputLayout textInputLayout97 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout97, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout97);
                TextInputLayout textInputLayout98 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout98, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout98);
                TextInputLayout textInputLayout99 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout99, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout99);
                TextInputLayout textInputLayout100 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout100, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout100);
                TextInputLayout textInputLayout101 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout101, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout101);
                TextInputLayout textInputLayout102 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout102, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout102);
                TextInputLayout textInputLayout103 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout103, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout103);
                TextInputLayout textInputLayout104 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout104, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout104);
                TextInputLayout textInputLayout105 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout105, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout105);
                TextInputLayout textInputLayout106 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout106, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout106);
                TextInputLayout textInputLayout107 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout107, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout107);
                TextInputLayout textInputLayout108 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout108, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout108);
                TextInputLayout textInputLayout109 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout109, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout109);
                TextInputLayout textInputLayout110 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout110, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout110);
                TextInputLayout textInputLayout111 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout111, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout111);
                TextInputLayout textInputLayout112 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout112, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout112);
                TextInputLayout textInputLayout113 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout113, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout113);
                TextInputLayout textInputLayout114 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout114, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout114);
                TextInputLayout textInputLayout115 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout115, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout115);
                TextInputLayout textInputLayout116 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout116, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout116);
                TextInputLayout textInputLayout117 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout117, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout117);
                TextInputLayout textInputLayout118 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout118, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout118);
                TextInputLayout textInputLayout119 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout119, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout119);
                TextInputLayout textInputLayout120 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout120, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout120);
            } else if (text.toString().equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                MaterialButton materialButton7 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton7, "");
                suspendUseCases.b(materialButton7);
                MaterialButton materialButton8 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton8, "");
                suspendUseCases.b(materialButton8);
                TextInputLayout textInputLayout121 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout121, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout121);
                TextInputLayout textInputLayout122 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout122, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout122);
                TextInputLayout textInputLayout123 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout123, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout123);
                TextInputLayout textInputLayout124 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout124, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout124);
                TextInputLayout textInputLayout125 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout125, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout125);
                TextInputLayout textInputLayout126 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout126, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout126);
                TextInputLayout textInputLayout127 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout127, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout127);
                TextInputLayout textInputLayout128 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout128, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout128);
                TextInputLayout textInputLayout129 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout129, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout129);
                TextInputLayout textInputLayout130 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout130, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout130);
                TextInputLayout textInputLayout131 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout131, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout131);
                TextInputLayout textInputLayout132 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout132, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout132);
                TextInputLayout textInputLayout133 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout133, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout133);
                TextInputLayout textInputLayout134 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout134, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout134);
                TextInputLayout textInputLayout135 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout135, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout135);
                TextInputLayout textInputLayout136 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout136, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout136);
                TextInputLayout textInputLayout137 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout137, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout137);
                TextInputLayout textInputLayout138 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout138, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout138);
                TextInputLayout textInputLayout139 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout139, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout139);
                TextInputLayout textInputLayout140 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout140, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout140);
                TextInputLayout textInputLayout141 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout141, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout141);
                TextInputLayout textInputLayout142 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout142, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout142);
                TextInputLayout textInputLayout143 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout143, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout143);
                TextInputLayout textInputLayout144 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout144, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout144);
                TextInputLayout textInputLayout145 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout145, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout145);
                TextInputLayout textInputLayout146 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout146, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout146);
                TextInputLayout textInputLayout147 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout147, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout147);
                TextInputLayout textInputLayout148 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout148, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout148);
                TextInputLayout textInputLayout149 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout149, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout149);
                TextInputLayout textInputLayout150 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout150, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout150);
                TextInputLayout textInputLayout151 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout151, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout151);
                TextInputLayout textInputLayout152 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout152, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout152);
                TextInputLayout textInputLayout153 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout153, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout153);
                TextInputLayout textInputLayout154 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout154, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout154);
                TextInputLayout textInputLayout155 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout155, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout155);
                TextInputLayout textInputLayout156 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout156, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout156);
                TextInputLayout textInputLayout157 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout157, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout157);
                TextInputLayout textInputLayout158 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout158, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout158);
                TextInputLayout textInputLayout159 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout159, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout159);
                TextInputLayout textInputLayout160 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout160, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout160);
            } else if (text.toString().equals("4")) {
                MaterialButton materialButton9 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton9, "");
                suspendUseCases.b(materialButton9);
                MaterialButton materialButton10 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton10, "");
                suspendUseCases.b(materialButton10);
                TextInputLayout textInputLayout161 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout161, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout161);
                TextInputLayout textInputLayout162 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout162, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout162);
                TextInputLayout textInputLayout163 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout163, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout163);
                TextInputLayout textInputLayout164 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout164, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout164);
                TextInputLayout textInputLayout165 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout165, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout165);
                TextInputLayout textInputLayout166 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout166, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout166);
                TextInputLayout textInputLayout167 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout167, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout167);
                TextInputLayout textInputLayout168 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout168, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout168);
                TextInputLayout textInputLayout169 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout169, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout169);
                TextInputLayout textInputLayout170 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout170, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout170);
                TextInputLayout textInputLayout171 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout171, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout171);
                TextInputLayout textInputLayout172 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout172, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout172);
                TextInputLayout textInputLayout173 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout173, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout173);
                TextInputLayout textInputLayout174 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout174, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout174);
                TextInputLayout textInputLayout175 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout175, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout175);
                TextInputLayout textInputLayout176 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout176, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout176);
                TextInputLayout textInputLayout177 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout177, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout177);
                TextInputLayout textInputLayout178 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout178, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout178);
                TextInputLayout textInputLayout179 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout179, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout179);
                TextInputLayout textInputLayout180 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout180, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout180);
                TextInputLayout textInputLayout181 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout181, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout181);
                TextInputLayout textInputLayout182 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout182, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout182);
                TextInputLayout textInputLayout183 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout183, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout183);
                TextInputLayout textInputLayout184 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout184, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout184);
                TextInputLayout textInputLayout185 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout185, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout185);
                TextInputLayout textInputLayout186 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout186, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout186);
                TextInputLayout textInputLayout187 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout187, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout187);
                TextInputLayout textInputLayout188 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout188, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout188);
                TextInputLayout textInputLayout189 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout189, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout189);
                TextInputLayout textInputLayout190 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout190, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout190);
                TextInputLayout textInputLayout191 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout191, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout191);
                TextInputLayout textInputLayout192 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout192, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout192);
                TextInputLayout textInputLayout193 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout193, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout193);
                TextInputLayout textInputLayout194 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout194, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout194);
                TextInputLayout textInputLayout195 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout195, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout195);
                TextInputLayout textInputLayout196 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout196, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout196);
                TextInputLayout textInputLayout197 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout197, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout197);
                TextInputLayout textInputLayout198 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout198, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout198);
                TextInputLayout textInputLayout199 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout199, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout199);
                TextInputLayout textInputLayout200 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout200, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout200);
            } else if (text.toString().equals("5")) {
                MaterialButton materialButton11 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton11, "");
                suspendUseCases.b(materialButton11);
                MaterialButton materialButton12 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton12, "");
                suspendUseCases.b(materialButton12);
                TextInputLayout textInputLayout201 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout201, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout201);
                TextInputLayout textInputLayout202 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout202, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout202);
                TextInputLayout textInputLayout203 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout203, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout203);
                TextInputLayout textInputLayout204 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout204, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout204);
                TextInputLayout textInputLayout205 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout205, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout205);
                TextInputLayout textInputLayout206 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout206, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout206);
                TextInputLayout textInputLayout207 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout207, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout207);
                TextInputLayout textInputLayout208 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout208, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout208);
                TextInputLayout textInputLayout209 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout209, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout209);
                TextInputLayout textInputLayout210 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout210, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout210);
                TextInputLayout textInputLayout211 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout211, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout211);
                TextInputLayout textInputLayout212 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout212, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout212);
                TextInputLayout textInputLayout213 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout213, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout213);
                TextInputLayout textInputLayout214 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout214, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout214);
                TextInputLayout textInputLayout215 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout215, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout215);
                TextInputLayout textInputLayout216 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout216, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout216);
                TextInputLayout textInputLayout217 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout217, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout217);
                TextInputLayout textInputLayout218 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout218, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout218);
                TextInputLayout textInputLayout219 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout219, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout219);
                TextInputLayout textInputLayout220 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout220, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout220);
                TextInputLayout textInputLayout221 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout221, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout221);
                TextInputLayout textInputLayout222 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout222, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout222);
                TextInputLayout textInputLayout223 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout223, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout223);
                TextInputLayout textInputLayout224 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout224, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout224);
                TextInputLayout textInputLayout225 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout225, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout225);
                TextInputLayout textInputLayout226 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout226, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout226);
                TextInputLayout textInputLayout227 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout227, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout227);
                TextInputLayout textInputLayout228 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout228, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout228);
                TextInputLayout textInputLayout229 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout229, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout229);
                TextInputLayout textInputLayout230 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout230, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout230);
                TextInputLayout textInputLayout231 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout231, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout231);
                TextInputLayout textInputLayout232 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout232, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout232);
                TextInputLayout textInputLayout233 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout233, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout233);
                TextInputLayout textInputLayout234 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout234, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout234);
                TextInputLayout textInputLayout235 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout235, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout235);
                TextInputLayout textInputLayout236 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout236, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout236);
                TextInputLayout textInputLayout237 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout237, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout237);
                TextInputLayout textInputLayout238 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout238, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout238);
                TextInputLayout textInputLayout239 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout239, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout239);
                TextInputLayout textInputLayout240 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout240, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout240);
            } else if (text.toString().equals("6")) {
                MaterialButton materialButton13 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton13, "");
                suspendUseCases.b(materialButton13);
                MaterialButton materialButton14 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton14, "");
                suspendUseCases.b(materialButton14);
                TextInputLayout textInputLayout241 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout241, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout241);
                TextInputLayout textInputLayout242 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout242, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout242);
                TextInputLayout textInputLayout243 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout243, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout243);
                TextInputLayout textInputLayout244 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout244, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout244);
                TextInputLayout textInputLayout245 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout245, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout245);
                TextInputLayout textInputLayout246 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout246, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout246);
                TextInputLayout textInputLayout247 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout247, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout247);
                TextInputLayout textInputLayout248 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout248, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout248);
                TextInputLayout textInputLayout249 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout249, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout249);
                TextInputLayout textInputLayout250 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout250, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout250);
                TextInputLayout textInputLayout251 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout251, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout251);
                TextInputLayout textInputLayout252 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout252, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout252);
                TextInputLayout textInputLayout253 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout253, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout253);
                TextInputLayout textInputLayout254 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout254, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout254);
                TextInputLayout textInputLayout255 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout255, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout255);
                TextInputLayout textInputLayout256 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout256, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout256);
                TextInputLayout textInputLayout257 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout257, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout257);
                TextInputLayout textInputLayout258 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout258, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout258);
                TextInputLayout textInputLayout259 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout259, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout259);
                TextInputLayout textInputLayout260 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout260, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout260);
                TextInputLayout textInputLayout261 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout261, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout261);
                TextInputLayout textInputLayout262 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout262, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout262);
                TextInputLayout textInputLayout263 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout263, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout263);
                TextInputLayout textInputLayout264 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout264, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout264);
                TextInputLayout textInputLayout265 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout265, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout265);
                TextInputLayout textInputLayout266 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout266, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout266);
                TextInputLayout textInputLayout267 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout267, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout267);
                TextInputLayout textInputLayout268 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout268, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout268);
                TextInputLayout textInputLayout269 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout269, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout269);
                TextInputLayout textInputLayout270 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout270, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout270);
                TextInputLayout textInputLayout271 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout271, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout271);
                TextInputLayout textInputLayout272 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout272, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout272);
                TextInputLayout textInputLayout273 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout273, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout273);
                TextInputLayout textInputLayout274 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout274, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout274);
                TextInputLayout textInputLayout275 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout275, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout275);
                TextInputLayout textInputLayout276 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout276, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout276);
                TextInputLayout textInputLayout277 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout277, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout277);
                TextInputLayout textInputLayout278 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout278, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout278);
                TextInputLayout textInputLayout279 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout279, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout279);
                TextInputLayout textInputLayout280 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout280, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout280);
            } else if (text.toString().equals("7")) {
                MaterialButton materialButton15 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton15, "");
                suspendUseCases.b(materialButton15);
                MaterialButton materialButton16 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton16, "");
                suspendUseCases.b(materialButton16);
                TextInputLayout textInputLayout281 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout281, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout281);
                TextInputLayout textInputLayout282 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout282, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout282);
                TextInputLayout textInputLayout283 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout283, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout283);
                TextInputLayout textInputLayout284 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout284, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout284);
                TextInputLayout textInputLayout285 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout285, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout285);
                TextInputLayout textInputLayout286 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout286, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout286);
                TextInputLayout textInputLayout287 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout287, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout287);
                TextInputLayout textInputLayout288 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout288, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout288);
                TextInputLayout textInputLayout289 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout289, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout289);
                TextInputLayout textInputLayout290 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout290, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout290);
                TextInputLayout textInputLayout291 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout291, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout291);
                TextInputLayout textInputLayout292 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout292, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout292);
                TextInputLayout textInputLayout293 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout293, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout293);
                TextInputLayout textInputLayout294 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout294, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout294);
                TextInputLayout textInputLayout295 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout295, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout295);
                TextInputLayout textInputLayout296 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout296, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout296);
                TextInputLayout textInputLayout297 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout297, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout297);
                TextInputLayout textInputLayout298 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout298, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout298);
                TextInputLayout textInputLayout299 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout299, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout299);
                TextInputLayout textInputLayout300 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout300, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout300);
                TextInputLayout textInputLayout301 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout301, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout301);
                TextInputLayout textInputLayout302 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout302, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout302);
                TextInputLayout textInputLayout303 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout303, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout303);
                TextInputLayout textInputLayout304 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout304, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout304);
                TextInputLayout textInputLayout305 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout305, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout305);
                TextInputLayout textInputLayout306 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout306, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout306);
                TextInputLayout textInputLayout307 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout307, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout307);
                TextInputLayout textInputLayout308 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout308, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout308);
                TextInputLayout textInputLayout309 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout309, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout309);
                TextInputLayout textInputLayout310 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout310, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout310);
                TextInputLayout textInputLayout311 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout311, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout311);
                TextInputLayout textInputLayout312 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout312, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout312);
                TextInputLayout textInputLayout313 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout313, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout313);
                TextInputLayout textInputLayout314 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout314, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout314);
                TextInputLayout textInputLayout315 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout315, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout315);
                TextInputLayout textInputLayout316 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout316, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout316);
                TextInputLayout textInputLayout317 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout317, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout317);
                TextInputLayout textInputLayout318 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout318, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout318);
                TextInputLayout textInputLayout319 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout319, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout319);
                TextInputLayout textInputLayout320 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout320, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout320);
            } else if (text.toString().equals("8")) {
                MaterialButton materialButton17 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton17, "");
                suspendUseCases.b(materialButton17);
                MaterialButton materialButton18 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton18, "");
                suspendUseCases.b(materialButton18);
                TextInputLayout textInputLayout321 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout321, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout321);
                TextInputLayout textInputLayout322 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout322, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout322);
                TextInputLayout textInputLayout323 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout323, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout323);
                TextInputLayout textInputLayout324 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout324, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout324);
                TextInputLayout textInputLayout325 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout325, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout325);
                TextInputLayout textInputLayout326 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout326, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout326);
                TextInputLayout textInputLayout327 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout327, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout327);
                TextInputLayout textInputLayout328 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout328, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout328);
                TextInputLayout textInputLayout329 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout329, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout329);
                TextInputLayout textInputLayout330 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout330, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout330);
                TextInputLayout textInputLayout331 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout331, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout331);
                TextInputLayout textInputLayout332 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout332, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout332);
                TextInputLayout textInputLayout333 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout333, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout333);
                TextInputLayout textInputLayout334 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout334, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout334);
                TextInputLayout textInputLayout335 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout335, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout335);
                TextInputLayout textInputLayout336 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout336, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout336);
                TextInputLayout textInputLayout337 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout337, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout337);
                TextInputLayout textInputLayout338 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout338, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout338);
                TextInputLayout textInputLayout339 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout339, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout339);
                TextInputLayout textInputLayout340 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout340, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout340);
                TextInputLayout textInputLayout341 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout341, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout341);
                TextInputLayout textInputLayout342 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout342, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout342);
                TextInputLayout textInputLayout343 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout343, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout343);
                TextInputLayout textInputLayout344 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout344, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout344);
                TextInputLayout textInputLayout345 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout345, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout345);
                TextInputLayout textInputLayout346 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout346, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout346);
                TextInputLayout textInputLayout347 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout347, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout347);
                TextInputLayout textInputLayout348 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout348, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout348);
                TextInputLayout textInputLayout349 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout349, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout349);
                TextInputLayout textInputLayout350 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout350, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout350);
                TextInputLayout textInputLayout351 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout351, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout351);
                TextInputLayout textInputLayout352 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout352, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout352);
                TextInputLayout textInputLayout353 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout353, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout353);
                TextInputLayout textInputLayout354 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout354, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout354);
                TextInputLayout textInputLayout355 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout355, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout355);
                TextInputLayout textInputLayout356 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout356, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout356);
                TextInputLayout textInputLayout357 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout357, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout357);
                TextInputLayout textInputLayout358 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout358, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout358);
                TextInputLayout textInputLayout359 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout359, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout359);
                TextInputLayout textInputLayout360 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout360, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout360);
            } else if (text.toString().equals("9")) {
                MaterialButton materialButton19 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton19, "");
                suspendUseCases.b(materialButton19);
                MaterialButton materialButton20 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton20, "");
                suspendUseCases.b(materialButton20);
                TextInputLayout textInputLayout361 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout361, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout361);
                TextInputLayout textInputLayout362 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout362, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout362);
                TextInputLayout textInputLayout363 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout363, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout363);
                TextInputLayout textInputLayout364 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout364, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout364);
                TextInputLayout textInputLayout365 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout365, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout365);
                TextInputLayout textInputLayout366 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout366, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout366);
                TextInputLayout textInputLayout367 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout367, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout367);
                TextInputLayout textInputLayout368 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout368, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout368);
                TextInputLayout textInputLayout369 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout369, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout369);
                TextInputLayout textInputLayout370 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout370, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout370);
                TextInputLayout textInputLayout371 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout371, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout371);
                TextInputLayout textInputLayout372 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout372, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout372);
                TextInputLayout textInputLayout373 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout373, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout373);
                TextInputLayout textInputLayout374 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout374, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout374);
                TextInputLayout textInputLayout375 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout375, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout375);
                TextInputLayout textInputLayout376 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout376, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout376);
                TextInputLayout textInputLayout377 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout377, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout377);
                TextInputLayout textInputLayout378 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout378, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout378);
                TextInputLayout textInputLayout379 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout379, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout379);
                TextInputLayout textInputLayout380 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout380, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout380);
                TextInputLayout textInputLayout381 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout381, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout381);
                TextInputLayout textInputLayout382 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout382, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout382);
                TextInputLayout textInputLayout383 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout383, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout383);
                TextInputLayout textInputLayout384 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout384, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout384);
                TextInputLayout textInputLayout385 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout385, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout385);
                TextInputLayout textInputLayout386 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout386, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout386);
                TextInputLayout textInputLayout387 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout387, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout387);
                TextInputLayout textInputLayout388 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout388, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout388);
                TextInputLayout textInputLayout389 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout389, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout389);
                TextInputLayout textInputLayout390 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout390, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout390);
                TextInputLayout textInputLayout391 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout391, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout391);
                TextInputLayout textInputLayout392 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout392, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout392);
                TextInputLayout textInputLayout393 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout393, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout393);
                TextInputLayout textInputLayout394 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout394, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout394);
                TextInputLayout textInputLayout395 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout395, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout395);
                TextInputLayout textInputLayout396 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout396, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout396);
                TextInputLayout textInputLayout397 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout397, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout397);
                TextInputLayout textInputLayout398 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout398, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout398);
                TextInputLayout textInputLayout399 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout399, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout399);
                TextInputLayout textInputLayout400 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout400, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout400);
            } else if (text.toString().equals("10")) {
                MaterialButton materialButton21 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton21, "");
                suspendUseCases.b(materialButton21);
                MaterialButton materialButton22 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton22, "");
                suspendUseCases.b(materialButton22);
                TextInputLayout textInputLayout401 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout401, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout401);
                TextInputLayout textInputLayout402 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout402, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout402);
                TextInputLayout textInputLayout403 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout403, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout403);
                TextInputLayout textInputLayout404 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout404, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout404);
                TextInputLayout textInputLayout405 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout405, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout405);
                TextInputLayout textInputLayout406 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout406, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout406);
                TextInputLayout textInputLayout407 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout407, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout407);
                TextInputLayout textInputLayout408 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout408, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout408);
                TextInputLayout textInputLayout409 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout409, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout409);
                TextInputLayout textInputLayout410 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout410, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout410);
                TextInputLayout textInputLayout411 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout411, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout411);
                TextInputLayout textInputLayout412 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout412, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout412);
                TextInputLayout textInputLayout413 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout413, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout413);
                TextInputLayout textInputLayout414 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout414, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout414);
                TextInputLayout textInputLayout415 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout415, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout415);
                TextInputLayout textInputLayout416 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout416, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout416);
                TextInputLayout textInputLayout417 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout417, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout417);
                TextInputLayout textInputLayout418 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout418, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout418);
                TextInputLayout textInputLayout419 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout419, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout419);
                TextInputLayout textInputLayout420 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout420, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout420);
                TextInputLayout textInputLayout421 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout421, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout421);
                TextInputLayout textInputLayout422 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout422, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout422);
                TextInputLayout textInputLayout423 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout423, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout423);
                TextInputLayout textInputLayout424 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout424, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout424);
                TextInputLayout textInputLayout425 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout425, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout425);
                TextInputLayout textInputLayout426 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout426, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout426);
                TextInputLayout textInputLayout427 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout427, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout427);
                TextInputLayout textInputLayout428 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout428, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout428);
                TextInputLayout textInputLayout429 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout429, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout429);
                TextInputLayout textInputLayout430 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout430, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout430);
                TextInputLayout textInputLayout431 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout431, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout431);
                TextInputLayout textInputLayout432 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout432, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout432);
                TextInputLayout textInputLayout433 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout433, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout433);
                TextInputLayout textInputLayout434 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout434, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout434);
                TextInputLayout textInputLayout435 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout435, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout435);
                TextInputLayout textInputLayout436 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout436, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout436);
                TextInputLayout textInputLayout437 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout437, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout437);
                TextInputLayout textInputLayout438 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout438, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout438);
                TextInputLayout textInputLayout439 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout439, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout439);
                TextInputLayout textInputLayout440 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout440, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout440);
            } else if (text.toString().equals("11")) {
                MaterialButton materialButton23 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton23, "");
                suspendUseCases.b(materialButton23);
                MaterialButton materialButton24 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton24, "");
                suspendUseCases.b(materialButton24);
                TextInputLayout textInputLayout441 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout441, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout441);
                TextInputLayout textInputLayout442 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout442, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout442);
                TextInputLayout textInputLayout443 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout443, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout443);
                TextInputLayout textInputLayout444 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout444, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout444);
                TextInputLayout textInputLayout445 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout445, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout445);
                TextInputLayout textInputLayout446 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout446, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout446);
                TextInputLayout textInputLayout447 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout447, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout447);
                TextInputLayout textInputLayout448 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout448, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout448);
                TextInputLayout textInputLayout449 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout449, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout449);
                TextInputLayout textInputLayout450 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout450, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout450);
                TextInputLayout textInputLayout451 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout451, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout451);
                TextInputLayout textInputLayout452 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout452, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout452);
                TextInputLayout textInputLayout453 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout453, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout453);
                TextInputLayout textInputLayout454 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout454, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout454);
                TextInputLayout textInputLayout455 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout455, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout455);
                TextInputLayout textInputLayout456 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout456, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout456);
                TextInputLayout textInputLayout457 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout457, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout457);
                TextInputLayout textInputLayout458 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout458, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout458);
                TextInputLayout textInputLayout459 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout459, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout459);
                TextInputLayout textInputLayout460 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout460, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout460);
                TextInputLayout textInputLayout461 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout461, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout461);
                TextInputLayout textInputLayout462 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout462, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout462);
                TextInputLayout textInputLayout463 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout463, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout463);
                TextInputLayout textInputLayout464 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout464, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout464);
                TextInputLayout textInputLayout465 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout465, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout465);
                TextInputLayout textInputLayout466 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout466, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout466);
                TextInputLayout textInputLayout467 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout467, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout467);
                TextInputLayout textInputLayout468 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout468, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout468);
                TextInputLayout textInputLayout469 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout469, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout469);
                TextInputLayout textInputLayout470 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout470, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout470);
                TextInputLayout textInputLayout471 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout471, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout471);
                TextInputLayout textInputLayout472 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout472, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout472);
                TextInputLayout textInputLayout473 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout473, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout473);
                TextInputLayout textInputLayout474 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout474, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout474);
                TextInputLayout textInputLayout475 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout475, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout475);
                TextInputLayout textInputLayout476 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout476, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout476);
                TextInputLayout textInputLayout477 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout477, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout477);
                TextInputLayout textInputLayout478 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout478, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout478);
                TextInputLayout textInputLayout479 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout479, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout479);
                TextInputLayout textInputLayout480 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout480, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout480);
            } else if (text.toString().equals("12")) {
                MaterialButton materialButton25 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton25, "");
                suspendUseCases.b(materialButton25);
                MaterialButton materialButton26 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton26, "");
                suspendUseCases.b(materialButton26);
                TextInputLayout textInputLayout481 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout481, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout481);
                TextInputLayout textInputLayout482 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout482, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout482);
                TextInputLayout textInputLayout483 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout483, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout483);
                TextInputLayout textInputLayout484 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout484, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout484);
                TextInputLayout textInputLayout485 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout485, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout485);
                TextInputLayout textInputLayout486 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout486, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout486);
                TextInputLayout textInputLayout487 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout487, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout487);
                TextInputLayout textInputLayout488 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout488, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout488);
                TextInputLayout textInputLayout489 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout489, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout489);
                TextInputLayout textInputLayout490 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout490, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout490);
                TextInputLayout textInputLayout491 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout491, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout491);
                TextInputLayout textInputLayout492 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout492, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout492);
                TextInputLayout textInputLayout493 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout493, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout493);
                TextInputLayout textInputLayout494 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout494, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout494);
                TextInputLayout textInputLayout495 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout495, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout495);
                TextInputLayout textInputLayout496 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout496, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout496);
                TextInputLayout textInputLayout497 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout497, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout497);
                TextInputLayout textInputLayout498 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout498, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout498);
                TextInputLayout textInputLayout499 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout499, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout499);
                TextInputLayout textInputLayout500 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout500, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout500);
                TextInputLayout textInputLayout501 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout501, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout501);
                TextInputLayout textInputLayout502 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout502, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout502);
                TextInputLayout textInputLayout503 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout503, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout503);
                TextInputLayout textInputLayout504 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout504, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout504);
                TextInputLayout textInputLayout505 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout505, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout505);
                TextInputLayout textInputLayout506 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout506, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout506);
                TextInputLayout textInputLayout507 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout507, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout507);
                TextInputLayout textInputLayout508 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout508, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout508);
                TextInputLayout textInputLayout509 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout509, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout509);
                TextInputLayout textInputLayout510 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout510, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout510);
                TextInputLayout textInputLayout511 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout511, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout511);
                TextInputLayout textInputLayout512 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout512, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout512);
                TextInputLayout textInputLayout513 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout513, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout513);
                TextInputLayout textInputLayout514 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout514, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout514);
                TextInputLayout textInputLayout515 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout515, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout515);
                TextInputLayout textInputLayout516 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout516, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout516);
                TextInputLayout textInputLayout517 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout517, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout517);
                TextInputLayout textInputLayout518 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout518, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout518);
                TextInputLayout textInputLayout519 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout519, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout519);
                TextInputLayout textInputLayout520 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout520, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout520);
            } else if (text.toString().equals("13")) {
                MaterialButton materialButton27 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton27, "");
                suspendUseCases.b(materialButton27);
                MaterialButton materialButton28 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton28, "");
                suspendUseCases.b(materialButton28);
                TextInputLayout textInputLayout521 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout521, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout521);
                TextInputLayout textInputLayout522 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout522, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout522);
                TextInputLayout textInputLayout523 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout523, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout523);
                TextInputLayout textInputLayout524 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout524, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout524);
                TextInputLayout textInputLayout525 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout525, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout525);
                TextInputLayout textInputLayout526 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout526, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout526);
                TextInputLayout textInputLayout527 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout527, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout527);
                TextInputLayout textInputLayout528 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout528, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout528);
                TextInputLayout textInputLayout529 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout529, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout529);
                TextInputLayout textInputLayout530 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout530, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout530);
                TextInputLayout textInputLayout531 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout531, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout531);
                TextInputLayout textInputLayout532 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout532, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout532);
                TextInputLayout textInputLayout533 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout533, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout533);
                TextInputLayout textInputLayout534 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout534, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout534);
                TextInputLayout textInputLayout535 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout535, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout535);
                TextInputLayout textInputLayout536 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout536, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout536);
                TextInputLayout textInputLayout537 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout537, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout537);
                TextInputLayout textInputLayout538 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout538, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout538);
                TextInputLayout textInputLayout539 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout539, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout539);
                TextInputLayout textInputLayout540 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout540, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout540);
                TextInputLayout textInputLayout541 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout541, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout541);
                TextInputLayout textInputLayout542 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout542, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout542);
                TextInputLayout textInputLayout543 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout543, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout543);
                TextInputLayout textInputLayout544 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout544, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout544);
                TextInputLayout textInputLayout545 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout545, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout545);
                TextInputLayout textInputLayout546 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout546, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout546);
                TextInputLayout textInputLayout547 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout547, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout547);
                TextInputLayout textInputLayout548 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout548, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout548);
                TextInputLayout textInputLayout549 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout549, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout549);
                TextInputLayout textInputLayout550 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout550, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout550);
                TextInputLayout textInputLayout551 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout551, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout551);
                TextInputLayout textInputLayout552 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout552, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout552);
                TextInputLayout textInputLayout553 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout553, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout553);
                TextInputLayout textInputLayout554 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout554, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout554);
                TextInputLayout textInputLayout555 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout555, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout555);
                TextInputLayout textInputLayout556 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout556, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout556);
                TextInputLayout textInputLayout557 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout557, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout557);
                TextInputLayout textInputLayout558 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout558, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout558);
                TextInputLayout textInputLayout559 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout559, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout559);
                TextInputLayout textInputLayout560 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout560, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout560);
            } else if (text.toString().equals("14")) {
                MaterialButton materialButton29 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton29, "");
                suspendUseCases.b(materialButton29);
                MaterialButton materialButton30 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton30, "");
                suspendUseCases.b(materialButton30);
                TextInputLayout textInputLayout561 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout561, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout561);
                TextInputLayout textInputLayout562 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout562, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout562);
                TextInputLayout textInputLayout563 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout563, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout563);
                TextInputLayout textInputLayout564 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout564, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout564);
                TextInputLayout textInputLayout565 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout565, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout565);
                TextInputLayout textInputLayout566 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout566, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout566);
                TextInputLayout textInputLayout567 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout567, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout567);
                TextInputLayout textInputLayout568 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout568, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout568);
                TextInputLayout textInputLayout569 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout569, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout569);
                TextInputLayout textInputLayout570 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout570, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout570);
                TextInputLayout textInputLayout571 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout571, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout571);
                TextInputLayout textInputLayout572 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout572, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout572);
                TextInputLayout textInputLayout573 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout573, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout573);
                TextInputLayout textInputLayout574 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout574, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout574);
                TextInputLayout textInputLayout575 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout575, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout575);
                TextInputLayout textInputLayout576 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout576, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout576);
                TextInputLayout textInputLayout577 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout577, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout577);
                TextInputLayout textInputLayout578 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout578, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout578);
                TextInputLayout textInputLayout579 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout579, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout579);
                TextInputLayout textInputLayout580 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout580, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout580);
                TextInputLayout textInputLayout581 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout581, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout581);
                TextInputLayout textInputLayout582 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout582, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout582);
                TextInputLayout textInputLayout583 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout583, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout583);
                TextInputLayout textInputLayout584 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout584, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout584);
                TextInputLayout textInputLayout585 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout585, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout585);
                TextInputLayout textInputLayout586 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout586, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout586);
                TextInputLayout textInputLayout587 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout587, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout587);
                TextInputLayout textInputLayout588 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout588, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout588);
                TextInputLayout textInputLayout589 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout589, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout589);
                TextInputLayout textInputLayout590 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout590, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout590);
                TextInputLayout textInputLayout591 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout591, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout591);
                TextInputLayout textInputLayout592 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout592, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout592);
                TextInputLayout textInputLayout593 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout593, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout593);
                TextInputLayout textInputLayout594 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout594, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout594);
                TextInputLayout textInputLayout595 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout595, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout595);
                TextInputLayout textInputLayout596 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout596, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout596);
                TextInputLayout textInputLayout597 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout597, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout597);
                TextInputLayout textInputLayout598 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout598, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout598);
                TextInputLayout textInputLayout599 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout599, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout599);
                TextInputLayout textInputLayout600 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout600, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout600);
            } else if (text.toString().equals("15")) {
                MaterialButton materialButton31 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton31, "");
                suspendUseCases.b(materialButton31);
                MaterialButton materialButton32 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton32, "");
                suspendUseCases.b(materialButton32);
                TextInputLayout textInputLayout601 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout601, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout601);
                TextInputLayout textInputLayout602 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout602, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout602);
                TextInputLayout textInputLayout603 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout603, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout603);
                TextInputLayout textInputLayout604 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout604, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout604);
                TextInputLayout textInputLayout605 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout605, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout605);
                TextInputLayout textInputLayout606 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout606, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout606);
                TextInputLayout textInputLayout607 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout607, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout607);
                TextInputLayout textInputLayout608 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout608, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout608);
                TextInputLayout textInputLayout609 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout609, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout609);
                TextInputLayout textInputLayout610 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout610, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout610);
                TextInputLayout textInputLayout611 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout611, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout611);
                TextInputLayout textInputLayout612 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout612, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout612);
                TextInputLayout textInputLayout613 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout613, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout613);
                TextInputLayout textInputLayout614 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout614, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout614);
                TextInputLayout textInputLayout615 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout615, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout615);
                TextInputLayout textInputLayout616 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout616, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout616);
                TextInputLayout textInputLayout617 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout617, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout617);
                TextInputLayout textInputLayout618 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout618, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout618);
                TextInputLayout textInputLayout619 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout619, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout619);
                TextInputLayout textInputLayout620 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout620, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout620);
                TextInputLayout textInputLayout621 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout621, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout621);
                TextInputLayout textInputLayout622 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout622, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout622);
                TextInputLayout textInputLayout623 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout623, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout623);
                TextInputLayout textInputLayout624 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout624, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout624);
                TextInputLayout textInputLayout625 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout625, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout625);
                TextInputLayout textInputLayout626 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout626, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout626);
                TextInputLayout textInputLayout627 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout627, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout627);
                TextInputLayout textInputLayout628 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout628, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout628);
                TextInputLayout textInputLayout629 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout629, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout629);
                TextInputLayout textInputLayout630 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout630, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout630);
                TextInputLayout textInputLayout631 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout631, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout631);
                TextInputLayout textInputLayout632 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout632, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout632);
                TextInputLayout textInputLayout633 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout633, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout633);
                TextInputLayout textInputLayout634 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout634, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout634);
                TextInputLayout textInputLayout635 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout635, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout635);
                TextInputLayout textInputLayout636 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout636, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout636);
                TextInputLayout textInputLayout637 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout637, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout637);
                TextInputLayout textInputLayout638 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout638, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout638);
                TextInputLayout textInputLayout639 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout639, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout639);
                TextInputLayout textInputLayout640 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout640, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout640);
            } else if (text.toString().equals("16")) {
                MaterialButton materialButton33 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton33, "");
                suspendUseCases.b(materialButton33);
                MaterialButton materialButton34 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton34, "");
                suspendUseCases.b(materialButton34);
                TextInputLayout textInputLayout641 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout641, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout641);
                TextInputLayout textInputLayout642 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout642, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout642);
                TextInputLayout textInputLayout643 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout643, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout643);
                TextInputLayout textInputLayout644 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout644, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout644);
                TextInputLayout textInputLayout645 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout645, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout645);
                TextInputLayout textInputLayout646 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout646, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout646);
                TextInputLayout textInputLayout647 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout647, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout647);
                TextInputLayout textInputLayout648 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout648, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout648);
                TextInputLayout textInputLayout649 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout649, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout649);
                TextInputLayout textInputLayout650 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout650, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout650);
                TextInputLayout textInputLayout651 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout651, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout651);
                TextInputLayout textInputLayout652 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout652, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout652);
                TextInputLayout textInputLayout653 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout653, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout653);
                TextInputLayout textInputLayout654 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout654, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout654);
                TextInputLayout textInputLayout655 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout655, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout655);
                TextInputLayout textInputLayout656 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout656, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout656);
                TextInputLayout textInputLayout657 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout657, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout657);
                TextInputLayout textInputLayout658 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout658, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout658);
                TextInputLayout textInputLayout659 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout659, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout659);
                TextInputLayout textInputLayout660 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout660, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout660);
                TextInputLayout textInputLayout661 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout661, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout661);
                TextInputLayout textInputLayout662 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout662, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout662);
                TextInputLayout textInputLayout663 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout663, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout663);
                TextInputLayout textInputLayout664 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout664, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout664);
                TextInputLayout textInputLayout665 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout665, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout665);
                TextInputLayout textInputLayout666 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout666, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout666);
                TextInputLayout textInputLayout667 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout667, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout667);
                TextInputLayout textInputLayout668 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout668, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout668);
                TextInputLayout textInputLayout669 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout669, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout669);
                TextInputLayout textInputLayout670 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout670, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout670);
                TextInputLayout textInputLayout671 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout671, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout671);
                TextInputLayout textInputLayout672 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout672, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout672);
                TextInputLayout textInputLayout673 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout673, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout673);
                TextInputLayout textInputLayout674 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout674, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout674);
                TextInputLayout textInputLayout675 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout675, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout675);
                TextInputLayout textInputLayout676 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout676, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout676);
                TextInputLayout textInputLayout677 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout677, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout677);
                TextInputLayout textInputLayout678 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout678, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout678);
                TextInputLayout textInputLayout679 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout679, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout679);
                TextInputLayout textInputLayout680 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout680, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout680);
            } else if (text.toString().equals("17")) {
                MaterialButton materialButton35 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton35, "");
                suspendUseCases.b(materialButton35);
                MaterialButton materialButton36 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton36, "");
                suspendUseCases.b(materialButton36);
                TextInputLayout textInputLayout681 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout681, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout681);
                TextInputLayout textInputLayout682 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout682, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout682);
                TextInputLayout textInputLayout683 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout683, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout683);
                TextInputLayout textInputLayout684 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout684, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout684);
                TextInputLayout textInputLayout685 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout685, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout685);
                TextInputLayout textInputLayout686 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout686, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout686);
                TextInputLayout textInputLayout687 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout687, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout687);
                TextInputLayout textInputLayout688 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout688, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout688);
                TextInputLayout textInputLayout689 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout689, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout689);
                TextInputLayout textInputLayout690 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout690, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout690);
                TextInputLayout textInputLayout691 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout691, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout691);
                TextInputLayout textInputLayout692 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout692, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout692);
                TextInputLayout textInputLayout693 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout693, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout693);
                TextInputLayout textInputLayout694 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout694, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout694);
                TextInputLayout textInputLayout695 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout695, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout695);
                TextInputLayout textInputLayout696 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout696, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout696);
                TextInputLayout textInputLayout697 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout697, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout697);
                TextInputLayout textInputLayout698 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout698, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout698);
                TextInputLayout textInputLayout699 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout699, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout699);
                TextInputLayout textInputLayout700 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout700, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout700);
                TextInputLayout textInputLayout701 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout701, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout701);
                TextInputLayout textInputLayout702 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout702, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout702);
                TextInputLayout textInputLayout703 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout703, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout703);
                TextInputLayout textInputLayout704 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout704, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout704);
                TextInputLayout textInputLayout705 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout705, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout705);
                TextInputLayout textInputLayout706 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout706, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout706);
                TextInputLayout textInputLayout707 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout707, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout707);
                TextInputLayout textInputLayout708 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout708, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout708);
                TextInputLayout textInputLayout709 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout709, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout709);
                TextInputLayout textInputLayout710 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout710, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout710);
                TextInputLayout textInputLayout711 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout711, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout711);
                TextInputLayout textInputLayout712 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout712, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout712);
                TextInputLayout textInputLayout713 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout713, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout713);
                TextInputLayout textInputLayout714 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout714, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout714);
                TextInputLayout textInputLayout715 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout715, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout715);
                TextInputLayout textInputLayout716 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout716, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout716);
                TextInputLayout textInputLayout717 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout717, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout717);
                TextInputLayout textInputLayout718 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout718, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout718);
                TextInputLayout textInputLayout719 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout719, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout719);
                TextInputLayout textInputLayout720 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout720, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout720);
            } else if (text.toString().equals("18")) {
                MaterialButton materialButton37 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton37, "");
                suspendUseCases.b(materialButton37);
                MaterialButton materialButton38 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton38, "");
                suspendUseCases.b(materialButton38);
                TextInputLayout textInputLayout721 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout721, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout721);
                TextInputLayout textInputLayout722 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout722, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout722);
                TextInputLayout textInputLayout723 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout723, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout723);
                TextInputLayout textInputLayout724 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout724, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout724);
                TextInputLayout textInputLayout725 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout725, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout725);
                TextInputLayout textInputLayout726 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout726, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout726);
                TextInputLayout textInputLayout727 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout727, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout727);
                TextInputLayout textInputLayout728 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout728, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout728);
                TextInputLayout textInputLayout729 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout729, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout729);
                TextInputLayout textInputLayout730 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout730, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout730);
                TextInputLayout textInputLayout731 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout731, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout731);
                TextInputLayout textInputLayout732 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout732, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout732);
                TextInputLayout textInputLayout733 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout733, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout733);
                TextInputLayout textInputLayout734 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout734, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout734);
                TextInputLayout textInputLayout735 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout735, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout735);
                TextInputLayout textInputLayout736 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout736, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout736);
                TextInputLayout textInputLayout737 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout737, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout737);
                TextInputLayout textInputLayout738 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout738, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout738);
                TextInputLayout textInputLayout739 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout739, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout739);
                TextInputLayout textInputLayout740 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout740, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout740);
                TextInputLayout textInputLayout741 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout741, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout741);
                TextInputLayout textInputLayout742 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout742, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout742);
                TextInputLayout textInputLayout743 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout743, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout743);
                TextInputLayout textInputLayout744 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout744, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout744);
                TextInputLayout textInputLayout745 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout745, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout745);
                TextInputLayout textInputLayout746 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout746, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout746);
                TextInputLayout textInputLayout747 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout747, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout747);
                TextInputLayout textInputLayout748 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout748, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout748);
                TextInputLayout textInputLayout749 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout749, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout749);
                TextInputLayout textInputLayout750 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout750, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout750);
                TextInputLayout textInputLayout751 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout751, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout751);
                TextInputLayout textInputLayout752 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout752, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout752);
                TextInputLayout textInputLayout753 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout753, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout753);
                TextInputLayout textInputLayout754 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout754, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout754);
                TextInputLayout textInputLayout755 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout755, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout755);
                TextInputLayout textInputLayout756 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout756, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout756);
                TextInputLayout textInputLayout757 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout757, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout757);
                TextInputLayout textInputLayout758 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout758, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout758);
                TextInputLayout textInputLayout759 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout759, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout759);
                TextInputLayout textInputLayout760 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout760, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout760);
            } else if (text.toString().equals("19")) {
                MaterialButton materialButton39 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton39, "");
                suspendUseCases.b(materialButton39);
                MaterialButton materialButton40 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton40, "");
                suspendUseCases.b(materialButton40);
                TextInputLayout textInputLayout761 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout761, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout761);
                TextInputLayout textInputLayout762 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout762, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout762);
                TextInputLayout textInputLayout763 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout763, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout763);
                TextInputLayout textInputLayout764 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout764, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout764);
                TextInputLayout textInputLayout765 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout765, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout765);
                TextInputLayout textInputLayout766 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout766, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout766);
                TextInputLayout textInputLayout767 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout767, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout767);
                TextInputLayout textInputLayout768 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout768, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout768);
                TextInputLayout textInputLayout769 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout769, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout769);
                TextInputLayout textInputLayout770 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout770, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout770);
                TextInputLayout textInputLayout771 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout771, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout771);
                TextInputLayout textInputLayout772 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout772, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout772);
                TextInputLayout textInputLayout773 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout773, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout773);
                TextInputLayout textInputLayout774 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout774, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout774);
                TextInputLayout textInputLayout775 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout775, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout775);
                TextInputLayout textInputLayout776 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout776, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout776);
                TextInputLayout textInputLayout777 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout777, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout777);
                TextInputLayout textInputLayout778 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout778, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout778);
                TextInputLayout textInputLayout779 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout779, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout779);
                TextInputLayout textInputLayout780 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout780, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout780);
                TextInputLayout textInputLayout781 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout781, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout781);
                TextInputLayout textInputLayout782 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout782, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout782);
                TextInputLayout textInputLayout783 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout783, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout783);
                TextInputLayout textInputLayout784 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout784, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout784);
                TextInputLayout textInputLayout785 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout785, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout785);
                TextInputLayout textInputLayout786 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout786, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout786);
                TextInputLayout textInputLayout787 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout787, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout787);
                TextInputLayout textInputLayout788 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout788, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout788);
                TextInputLayout textInputLayout789 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout789, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout789);
                TextInputLayout textInputLayout790 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout790, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout790);
                TextInputLayout textInputLayout791 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout791, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout791);
                TextInputLayout textInputLayout792 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout792, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout792);
                TextInputLayout textInputLayout793 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout793, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout793);
                TextInputLayout textInputLayout794 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout794, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout794);
                TextInputLayout textInputLayout795 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout795, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout795);
                TextInputLayout textInputLayout796 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout796, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout796);
                TextInputLayout textInputLayout797 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout797, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout797);
                TextInputLayout textInputLayout798 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout798, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout798);
                TextInputLayout textInputLayout799 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout799, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout799);
                TextInputLayout textInputLayout800 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout800, "");
                suspendUseCases.TuitionPaymentFragmentspecialinlinedviewModeldefault3(textInputLayout800);
            } else {
                text.toString().equals("20");
                MaterialButton materialButton41 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton41, "");
                suspendUseCases.b(materialButton41);
                MaterialButton materialButton42 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton42, "");
                suspendUseCases.b(materialButton42);
                TextInputLayout textInputLayout801 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout801, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout801);
                TextInputLayout textInputLayout802 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout802, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout802);
                TextInputLayout textInputLayout803 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout803, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout803);
                TextInputLayout textInputLayout804 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout804, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout804);
                TextInputLayout textInputLayout805 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout805, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout805);
                TextInputLayout textInputLayout806 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout806, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout806);
                TextInputLayout textInputLayout807 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout807, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout807);
                TextInputLayout textInputLayout808 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout808, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout808);
                TextInputLayout textInputLayout809 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout809, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout809);
                TextInputLayout textInputLayout810 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout810, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout810);
                TextInputLayout textInputLayout811 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout811, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout811);
                TextInputLayout textInputLayout812 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout812, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout812);
                TextInputLayout textInputLayout813 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout813, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout813);
                TextInputLayout textInputLayout814 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout814, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout814);
                TextInputLayout textInputLayout815 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout815, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout815);
                TextInputLayout textInputLayout816 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout816, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout816);
                TextInputLayout textInputLayout817 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout817, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout817);
                TextInputLayout textInputLayout818 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout818, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout818);
                TextInputLayout textInputLayout819 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout819, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout819);
                TextInputLayout textInputLayout820 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout820, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout820);
                TextInputLayout textInputLayout821 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateElevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout821, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout821);
                TextInputLayout textInputLayout822 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilElevenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout822, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout822);
                TextInputLayout textInputLayout823 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwelveChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout823, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout823);
                TextInputLayout textInputLayout824 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwelveChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout824, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout824);
                TextInputLayout textInputLayout825 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout825, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout825);
                TextInputLayout textInputLayout826 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout826, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout826);
                TextInputLayout textInputLayout827 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout827, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout827);
                TextInputLayout textInputLayout828 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout828, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout828);
                TextInputLayout textInputLayout829 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout829, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout829);
                TextInputLayout textInputLayout830 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout830, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout830);
                TextInputLayout textInputLayout831 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout831, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout831);
                TextInputLayout textInputLayout832 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout832, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout832);
                TextInputLayout textInputLayout833 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSeventeenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout833, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout833);
                TextInputLayout textInputLayout834 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSeventeenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout834, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout834);
                TextInputLayout textInputLayout835 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEighteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout835, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout835);
                TextInputLayout textInputLayout836 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEighteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout836, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout836);
                TextInputLayout textInputLayout837 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineteenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout837, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout837);
                TextInputLayout textInputLayout838 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineteenChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout838, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout838);
                TextInputLayout textInputLayout839 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTwentyChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout839, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout839);
                TextInputLayout textInputLayout840 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTwentyChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout840, "");
                suspendUseCases.TuitionPaymentFragmentbindingInflater1(textInputLayout840);
            }
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub = INotificationSideChannelStub();
        if (fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() == R.id.rbFemale) {
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName.setHint(getString(R.string.hint_husband_name));
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSpouse.setHint(getString(R.string.hint_birth_date_husband));
        } else if (fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() == R.id.rbMale) {
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName.setHint(getString(R.string.hint_wife_name));
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSpouse.setHint(getString(R.string.hint_birth_date_wife));
        } else {
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName.setHint(getString(R.string.hint_spouse_name));
            fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSpouse.setHint(getString(R.string.hint_birth_date_spouse));
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setEnabled(true);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: updateResourcesConfiguration
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.notify(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ AppCompatDelegateImplApi33ImplExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1(final attachToWindow attachtowindow) {
        AppCompatDelegateImplApi33ImplExternalSyntheticLambda0.Companion companion = AppCompatDelegateImplApi33ImplExternalSyntheticLambda0.INSTANCE;
        return AppCompatDelegateImplApi33ImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: startSupportActionModeFromWindow
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return attachToWindow.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (com.bpjstku.domain.asik.model.MaritalStatus) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void b(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: mapNightMode
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: peekSupportActionBar
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBinding, attachToWindow attachtowindow, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_min_child_fourth_asik", "next_min_child_fourth_asik"));
        Intrinsics.checkNotNullParameter("next_min_child_fourth_asik", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("next_min_child_fourth_asik", mapMutableMapOf);
        fragmentAsikActiveParticipantOthersStepFourBinding.edtChildren.setText(String.valueOf(Integer.parseInt(StringsKt.trim((CharSequence) String.valueOf(fragmentAsikActiveParticipantOthersStepFourBinding.edtChildren.getText())).toString()) - 1));
        attachtowindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(attachToWindow attachtowindow, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            AppCompatDelegateImplApi33ImplExternalSyntheticLambda0 appCompatDelegateImplApi33ImplExternalSyntheticLambda0 = (AppCompatDelegateImplApi33ImplExternalSyntheticLambda0) attachtowindow.cancelAll.getValue();
            FragmentManager childFragmentManager = attachtowindow.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(appCompatDelegateImplApi33ImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                appCompatDelegateImplApi33ImplExternalSyntheticLambda0.show(childFragmentManager, appCompatDelegateImplApi33ImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void b(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: AppCompatDelegateImpl1
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.INotificationSideChannel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void g(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void asBinder(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void asInterface(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void a(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:31:0x0102  */
    /* JADX WARN: Code duplicated, block: B:32:0x0107  */
    /* JADX WARN: Code duplicated, block: B:35:0x0122  */
    /* JADX WARN: Code duplicated, block: B:37:0x012c  */
    /* JADX WARN: Code duplicated, block: B:38:0x013e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0147  */
    /* JADX WARN: Code duplicated, block: B:42:0x014c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0169  */
    /* JADX WARN: Code duplicated, block: B:46:0x016e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0187  */
    /* JADX WARN: Code duplicated, block: B:50:0x0199  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01af  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x020a  */
    /* JADX WARN: Code duplicated, block: B:66:0x020f  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(attachToWindow attachtowindow, View view) {
        EditText editText;
        Editable text;
        EditText editText2;
        Editable text2;
        EditText editText3;
        Editable text3;
        EditText editText4;
        Editable text4;
        String strValueOf;
        EditText editText5;
        Editable text5;
        EditText editText6;
        Editable text6;
        String strValueOf2;
        AsikActiveParticipant asikActiveParticipantB;
        Intrinsics.checkNotNullParameter(view, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_fourth", "submit_asik_step_fourth_family_data"));
        Intrinsics.checkNotNullParameter("submit_asik_step_fourth_family_data", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_asik_step_fourth_family_data", mapMutableMapOf);
        FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub = attachtowindow.INotificationSideChannelStub();
        ArrayList arrayList = new ArrayList();
        if (fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() == R.id.rbFemale) {
            EditText editText7 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
            if (StringsKt.trim((CharSequence) String.valueOf(editText7 != null ? editText7.getText() : null)).toString().equals(MaritalStatus.MARRIED.getType())) {
                String strValueOf3 = !attachtowindow.notify.isEmpty() ? String.valueOf(attachtowindow.notify.get(0).getIdentityNumber()) : "";
                EditText editText8 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName.getEditText();
                String string = StringsKt.trim((CharSequence) String.valueOf(editText8 != null ? editText8.getText() : null)).toString();
                String type = FamilyStatus.HUSBAND.getType();
                EditText editText9 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSpouse.getEditText();
                arrayList.add(new EmployeeFamily(strValueOf3, string, type, StringsKt.trim((CharSequence) String.valueOf(editText9 != null ? editText9.getText() : null)).toString(), "L", !attachtowindow.notify.isEmpty() ? String.valueOf(attachtowindow.notify.get(0).getBirthPlace()) : ""));
            } else if (fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() != R.id.rbMale) {
                editText = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
                if (editText != null) {
                    text = editText.getText();
                } else {
                    text = null;
                }
                if (StringsKt.trim((CharSequence) String.valueOf(text)).toString().equals(MaritalStatus.SINGLE.getType())) {
                    editText3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFatherName.getEditText();
                    if (editText3 != null) {
                        text3 = editText3.getText();
                    } else {
                        text3 = null;
                    }
                    arrayList.add(new EmployeeFamily("", StringsKt.trim((CharSequence) String.valueOf(text3)).toString(), FamilyStatus.PARENTS.getType(), "01-01-1900", "L", ""));
                }
                editText2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMotherName.getEditText();
                if (editText2 != null) {
                    text2 = editText2.getText();
                } else {
                    text2 = null;
                }
                arrayList.add(new EmployeeFamily("", StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), FamilyStatus.PARENTS.getType(), "01-01-1900", "P", ""));
            } else {
                editText4 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
                if (editText4 != null) {
                    text4 = editText4.getText();
                } else {
                    text4 = null;
                }
                if (StringsKt.trim((CharSequence) String.valueOf(text4)).toString().equals(MaritalStatus.MARRIED.getType())) {
                    if (attachtowindow.cancel.isEmpty()) {
                        strValueOf = "";
                    } else {
                        strValueOf = String.valueOf(attachtowindow.cancel.get(0).getIdentityNumber());
                    }
                    editText5 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName.getEditText();
                    if (editText5 != null) {
                        text5 = editText5.getText();
                    } else {
                        text5 = null;
                    }
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
                    String type2 = FamilyStatus.WIFE.getType();
                    editText6 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSpouse.getEditText();
                    if (editText6 != null) {
                        text6 = editText6.getText();
                    } else {
                        text6 = null;
                    }
                    String string3 = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
                    if (attachtowindow.cancel.isEmpty()) {
                        strValueOf2 = "";
                    } else {
                        strValueOf2 = String.valueOf(attachtowindow.cancel.get(0).getBirthPlace());
                    }
                    arrayList.add(new EmployeeFamily(strValueOf, string2, type2, string3, "P", strValueOf2));
                } else {
                    editText = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
                    if (editText != null) {
                        text = editText.getText();
                    } else {
                        text = null;
                    }
                    if (StringsKt.trim((CharSequence) String.valueOf(text)).toString().equals(MaritalStatus.SINGLE.getType())) {
                        editText3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFatherName.getEditText();
                        if (editText3 != null) {
                            text3 = editText3.getText();
                        } else {
                            text3 = null;
                        }
                        arrayList.add(new EmployeeFamily("", StringsKt.trim((CharSequence) String.valueOf(text3)).toString(), FamilyStatus.PARENTS.getType(), "01-01-1900", "L", ""));
                    }
                    editText2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMotherName.getEditText();
                    if (editText2 != null) {
                        text2 = editText2.getText();
                    } else {
                        text2 = null;
                    }
                    arrayList.add(new EmployeeFamily("", StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), FamilyStatus.PARENTS.getType(), "01-01-1900", "P", ""));
                }
            }
        } else if (fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() != R.id.rbMale) {
            editText = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
            if (editText != null) {
                text = editText.getText();
            } else {
                text = null;
            }
            if (StringsKt.trim((CharSequence) String.valueOf(text)).toString().equals(MaritalStatus.SINGLE.getType())) {
                editText3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFatherName.getEditText();
                if (editText3 != null) {
                    text3 = editText3.getText();
                } else {
                    text3 = null;
                }
                arrayList.add(new EmployeeFamily("", StringsKt.trim((CharSequence) String.valueOf(text3)).toString(), FamilyStatus.PARENTS.getType(), "01-01-1900", "L", ""));
            }
            editText2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMotherName.getEditText();
            if (editText2 != null) {
                text2 = editText2.getText();
            } else {
                text2 = null;
            }
            arrayList.add(new EmployeeFamily("", StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), FamilyStatus.PARENTS.getType(), "01-01-1900", "P", ""));
        } else {
            editText4 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
            if (editText4 != null) {
                text4 = editText4.getText();
            } else {
                text4 = null;
            }
            if (StringsKt.trim((CharSequence) String.valueOf(text4)).toString().equals(MaritalStatus.MARRIED.getType())) {
                if (attachtowindow.cancel.isEmpty()) {
                    strValueOf = String.valueOf(attachtowindow.cancel.get(0).getIdentityNumber());
                } else {
                    strValueOf = "";
                }
                editText5 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName.getEditText();
                if (editText5 != null) {
                    text5 = editText5.getText();
                } else {
                    text5 = null;
                }
                String string4 = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
                String type3 = FamilyStatus.WIFE.getType();
                editText6 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSpouse.getEditText();
                if (editText6 != null) {
                    text6 = editText6.getText();
                } else {
                    text6 = null;
                }
                String string5 = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
                if (attachtowindow.cancel.isEmpty()) {
                    strValueOf2 = String.valueOf(attachtowindow.cancel.get(0).getBirthPlace());
                } else {
                    strValueOf2 = "";
                }
                arrayList.add(new EmployeeFamily(strValueOf, string4, type3, string5, "P", strValueOf2));
            } else {
                editText = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
                if (editText != null) {
                    text = editText.getText();
                } else {
                    text = null;
                }
                if (StringsKt.trim((CharSequence) String.valueOf(text)).toString().equals(MaritalStatus.SINGLE.getType())) {
                    editText3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFatherName.getEditText();
                    if (editText3 != null) {
                        text3 = editText3.getText();
                    } else {
                        text3 = null;
                    }
                    arrayList.add(new EmployeeFamily("", StringsKt.trim((CharSequence) String.valueOf(text3)).toString(), FamilyStatus.PARENTS.getType(), "01-01-1900", "L", ""));
                }
                editText2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMotherName.getEditText();
                if (editText2 != null) {
                    text2 = editText2.getText();
                } else {
                    text2 = null;
                }
                arrayList.add(new EmployeeFamily("", StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), FamilyStatus.PARENTS.getType(), "01-01-1900", "P", ""));
            }
        }
        ConstraintLayout constraintLayout = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.childrenContainer;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        if (constraintLayout.getVisibility() == 0) {
            TextInputLayout textInputLayout = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            if (textInputLayout.getVisibility() == 0) {
                TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
                if (textInputLayout2.getVisibility() == 0) {
                    EditText editText10 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                    String string6 = StringsKt.trim((CharSequence) String.valueOf(editText10 != null ? editText10.getText() : null)).toString();
                    String type4 = FamilyStatus.CHILDS.getType();
                    EditText editText11 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFirstChildren.getEditText();
                    arrayList.add(new EmployeeFamily(String.valueOf(attachtowindow.onTransact.get(0).getIdentityNumber()), string6, type4, StringsKt.trim((CharSequence) String.valueOf(editText11 != null ? editText11.getText() : null)).toString(), String.valueOf(attachtowindow.onTransact.get(0).getGender()), String.valueOf(attachtowindow.onTransact.get(0).getBirthPlace())));
                }
            }
            TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
            if (textInputLayout3.getVisibility() == 0) {
                TextInputLayout textInputLayout4 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
                if (textInputLayout4.getVisibility() == 0) {
                    EditText editText12 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                    String string7 = StringsKt.trim((CharSequence) String.valueOf(editText12 != null ? editText12.getText() : null)).toString();
                    String type5 = FamilyStatus.CHILDS.getType();
                    EditText editText13 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSecondChildren.getEditText();
                    arrayList.add(new EmployeeFamily(String.valueOf(attachtowindow.onTransact.get(1).getIdentityNumber()), string7, type5, StringsKt.trim((CharSequence) String.valueOf(editText13 != null ? editText13.getText() : null)).toString(), String.valueOf(attachtowindow.onTransact.get(1).getGender()), String.valueOf(attachtowindow.onTransact.get(1).getBirthPlace())));
                }
            }
            TextInputLayout textInputLayout5 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
            if (textInputLayout5.getVisibility() == 0) {
                TextInputLayout textInputLayout6 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
                if (textInputLayout6.getVisibility() == 0) {
                    EditText editText14 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilThirdChild.getEditText();
                    String string8 = StringsKt.trim((CharSequence) String.valueOf(editText14 != null ? editText14.getText() : null)).toString();
                    String type6 = FamilyStatus.CHILDS.getType();
                    EditText editText15 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateThirdChildren.getEditText();
                    arrayList.add(new EmployeeFamily(String.valueOf(attachtowindow.onTransact.get(2).getIdentityNumber()), string8, type6, StringsKt.trim((CharSequence) String.valueOf(editText15 != null ? editText15.getText() : null)).toString(), String.valueOf(attachtowindow.onTransact.get(2).getGender()), String.valueOf(attachtowindow.onTransact.get(2).getBirthPlace())));
                }
            }
            TextInputLayout textInputLayout7 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
            if (textInputLayout7.getVisibility() == 0) {
                TextInputLayout textInputLayout8 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
                if (textInputLayout8.getVisibility() == 0) {
                    EditText editText16 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFourthChild.getEditText();
                    String string9 = StringsKt.trim((CharSequence) String.valueOf(editText16 != null ? editText16.getText() : null)).toString();
                    String type7 = FamilyStatus.CHILDS.getType();
                    EditText editText17 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFourthChildren.getEditText();
                    arrayList.add(new EmployeeFamily(String.valueOf(attachtowindow.onTransact.get(3).getIdentityNumber()), string9, type7, StringsKt.trim((CharSequence) String.valueOf(editText17 != null ? editText17.getText() : null)).toString(), String.valueOf(attachtowindow.onTransact.get(3).getGender()), String.valueOf(attachtowindow.onTransact.get(3).getBirthPlace())));
                }
            }
            TextInputLayout textInputLayout9 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
            if (textInputLayout9.getVisibility() == 0) {
                TextInputLayout textInputLayout10 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout10, "");
                if (textInputLayout10.getVisibility() == 0) {
                    EditText editText18 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilFifthChild.getEditText();
                    String string10 = StringsKt.trim((CharSequence) String.valueOf(editText18 != null ? editText18.getText() : null)).toString();
                    String type8 = FamilyStatus.CHILDS.getType();
                    EditText editText19 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateFifthChildren.getEditText();
                    arrayList.add(new EmployeeFamily(String.valueOf(attachtowindow.onTransact.get(4).getIdentityNumber()), string10, type8, StringsKt.trim((CharSequence) String.valueOf(editText19 != null ? editText19.getText() : null)).toString(), String.valueOf(attachtowindow.onTransact.get(4).getGender()), String.valueOf(attachtowindow.onTransact.get(4).getBirthPlace())));
                }
            }
            TextInputLayout textInputLayout11 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout11, "");
            if (textInputLayout11.getVisibility() == 0) {
                TextInputLayout textInputLayout12 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout12, "");
                if (textInputLayout12.getVisibility() == 0) {
                    EditText editText20 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSixthChild.getEditText();
                    String string11 = StringsKt.trim((CharSequence) String.valueOf(editText20 != null ? editText20.getText() : null)).toString();
                    String type9 = FamilyStatus.CHILDS.getType();
                    EditText editText21 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSixthChildren.getEditText();
                    arrayList.add(new EmployeeFamily(String.valueOf(attachtowindow.onTransact.get(5).getIdentityNumber()), string11, type9, StringsKt.trim((CharSequence) String.valueOf(editText21 != null ? editText21.getText() : null)).toString(), String.valueOf(attachtowindow.onTransact.get(5).getGender()), String.valueOf(attachtowindow.onTransact.get(5).getBirthPlace())));
                }
            }
            TextInputLayout textInputLayout13 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout13, "");
            if (textInputLayout13.getVisibility() == 0) {
                TextInputLayout textInputLayout14 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout14, "");
                if (textInputLayout14.getVisibility() == 0) {
                    EditText editText22 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSevenChild.getEditText();
                    String string12 = StringsKt.trim((CharSequence) String.valueOf(editText22 != null ? editText22.getText() : null)).toString();
                    String type10 = FamilyStatus.CHILDS.getType();
                    EditText editText23 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateSevenChildren.getEditText();
                    arrayList.add(new EmployeeFamily(String.valueOf(attachtowindow.onTransact.get(6).getIdentityNumber()), string12, type10, StringsKt.trim((CharSequence) String.valueOf(editText23 != null ? editText23.getText() : null)).toString(), String.valueOf(attachtowindow.onTransact.get(6).getGender()), String.valueOf(attachtowindow.onTransact.get(6).getBirthPlace())));
                }
            }
            TextInputLayout textInputLayout15 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout15, "");
            if (textInputLayout15.getVisibility() == 0) {
                TextInputLayout textInputLayout16 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout16, "");
                if (textInputLayout16.getVisibility() == 0) {
                    EditText editText24 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilEightChild.getEditText();
                    String string13 = StringsKt.trim((CharSequence) String.valueOf(editText24 != null ? editText24.getText() : null)).toString();
                    String type11 = FamilyStatus.CHILDS.getType();
                    EditText editText25 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateEightChildren.getEditText();
                    arrayList.add(new EmployeeFamily(String.valueOf(attachtowindow.onTransact.get(7).getIdentityNumber()), string13, type11, StringsKt.trim((CharSequence) String.valueOf(editText25 != null ? editText25.getText() : null)).toString(), String.valueOf(attachtowindow.onTransact.get(7).getGender()), String.valueOf(attachtowindow.onTransact.get(7).getBirthPlace())));
                }
            }
            TextInputLayout textInputLayout17 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout17, "");
            if (textInputLayout17.getVisibility() == 0) {
                TextInputLayout textInputLayout18 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout18, "");
                if (textInputLayout18.getVisibility() == 0) {
                    EditText editText26 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilNineChild.getEditText();
                    String string14 = StringsKt.trim((CharSequence) String.valueOf(editText26 != null ? editText26.getText() : null)).toString();
                    String type12 = FamilyStatus.CHILDS.getType();
                    EditText editText27 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateNineChildren.getEditText();
                    arrayList.add(new EmployeeFamily(String.valueOf(attachtowindow.onTransact.get(8).getIdentityNumber()), string14, type12, StringsKt.trim((CharSequence) String.valueOf(editText27 != null ? editText27.getText() : null)).toString(), String.valueOf(attachtowindow.onTransact.get(8).getGender()), String.valueOf(attachtowindow.onTransact.get(8).getBirthPlace())));
                }
            }
            TextInputLayout textInputLayout19 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout19, "");
            if (textInputLayout19.getVisibility() == 0) {
                TextInputLayout textInputLayout20 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout20, "");
                if (textInputLayout20.getVisibility() == 0) {
                    EditText editText28 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilTenChild.getEditText();
                    String string15 = StringsKt.trim((CharSequence) String.valueOf(editText28 != null ? editText28.getText() : null)).toString();
                    String type13 = FamilyStatus.CHILDS.getType();
                    EditText editText29 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilBirthDateTenChildren.getEditText();
                    arrayList.add(new EmployeeFamily(String.valueOf(attachtowindow.onTransact.get(9).getIdentityNumber()), string15, type13, StringsKt.trim((CharSequence) String.valueOf(editText29 != null ? editText29.getText() : null)).toString(), String.valueOf(attachtowindow.onTransact.get(9).getGender()), String.valueOf(attachtowindow.onTransact.get(9).getBirthPlace())));
                }
            }
        }
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) attachtowindow.g.getValue();
        if (asikActiveParticipant != null) {
            EditText editText30 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMotherName.getEditText();
            String string16 = StringsKt.trim((CharSequence) String.valueOf(editText30 != null ? editText30.getText() : null)).toString();
            String str = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() == R.id.rbFemale ? "P" : "L";
            EditText editText31 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
            String string17 = StringsKt.trim((CharSequence) String.valueOf(editText31 != null ? editText31.getText() : null)).toString();
            EditText editText32 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilSpouseName.getEditText();
            String string18 = StringsKt.trim((CharSequence) String.valueOf(editText32 != null ? editText32.getText() : null)).toString();
            EditText editText33 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilChildren.getEditText();
            String string19 = StringsKt.trim((CharSequence) String.valueOf(editText33 != null ? editText33.getText() : null)).toString();
            EditText editText34 = fragmentAsikActiveParticipantOthersStepFourBindingINotificationSideChannelStub.tilParticipantAddress.getEditText();
            String string20 = StringsKt.trim((CharSequence) String.valueOf(editText34 != null ? editText34.getText() : null)).toString();
            CodeNamePair codeNamePair = attachtowindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = codeNamePair != null ? codeNamePair.b : null;
            asikActiveParticipantB = AsikActiveParticipant.b(asikActiveParticipant, null, null, null, null, null, string20, str2 == null ? "" : str2, null, string16, str, string17, string18, string19, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16225, 31);
        } else {
            asikActiveParticipantB = null;
        }
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol = new lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl(asikActiveParticipantB, null, 2, null);
        Intrinsics.checkNotNullParameter(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol);
        final select selectVar = (select) attachtowindow.d.getValue();
        User user = (User) attachtowindow.b.getValue();
        String strValueOf4 = String.valueOf(user != null ? user.b : null);
        SubmissionCheckItem submissionCheckItem = (SubmissionCheckItem) attachtowindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        AsikVerificationStepRequest asikVerificationStepRequest = new AsikVerificationStepRequest(strValueOf4, String.valueOf(submissionCheckItem != null ? submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null));
        Intrinsics.checkNotNullParameter(asikVerificationStepRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.asBinder;
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar.d.TuitionPaymentFragmentbindingInflater1(asikVerificationStepRequest)));
        final Function1 function1 = new Function1() { // from class: getIconAttributeResId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.TuitionPaymentFragmentspecialinlinedviewModeldefault3(selectVar, (BaseItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getListView
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getButton
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.RemoteActionCompatParcelizer(selectVar, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: installContent
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getPanelState
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void asBinder(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: doInvalidatePanelMenu
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.INotificationSideChannelDefault(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void d(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: shouldInheritContext
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.asBinder(this.b, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void a(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: setConfigurationLocales
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(attachToWindow attachtowindow, com.bpjstku.domain.asik.model.MaritalStatus maritalStatus) {
        String str = maritalStatus != null ? maritalStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        Intrinsics.checkNotNull(str);
        EditText editText = attachtowindow.INotificationSideChannelStub().tilMaritalStatus.getEditText();
        if (editText != null) {
            editText.setText(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void g(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getSubDecor
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.cancelAll(this.b, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void asInterface(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: createOverrideAppConfiguration
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.cancel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void cancel(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: onKeyUpPanel
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.RemoteActionCompatParcelizer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void INotificationSideChannel(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: ensureWindow
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.getInterfaceDescriptor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void cancelAll(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: onCreateView
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.onTransact(this.b, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final attachToWindow attachtowindow, final FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            bypassDispatchKeyEvent.Companion companion = bypassDispatchKeyEvent.INSTANCE;
            bypassDispatchKeyEvent bypassdispatchkeyeventTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bypassDispatchKeyEvent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: invalidatePanelMenu
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, fragmentAsikActiveParticipantOthersStepFourBinding, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = attachtowindow.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(bypassdispatchkeyeventTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                bypassdispatchkeyeventTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(childFragmentManager, bypassdispatchkeyeventTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void onTransact(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: findMenuPanel
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.b(this.b, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void notify(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getWindowCallback
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void getInterfaceDescriptor(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getConfigurationLocales
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void INotificationSideChannelDefault(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: onMenuModeChange
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.a(this.TuitionPaymentFragmentbindingInflater1, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(final attachToWindow attachtowindow, final TextInputEditText textInputEditText, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: applyFixedSizeWindow
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    attachToWindow.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, textInputEditText, i, i2, i3);
                }
            }, attachtowindow.INotificationSideChannel.get(1), attachtowindow.INotificationSideChannel.get(2), attachtowindow.INotificationSideChannel.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(attachToWindow attachtowindow, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        updateFileExif updatefileexif = new updateFileExif();
        attachToWindow attachtowindow2 = attachtowindow;
        Intent intent = new Intent(attachtowindow2.getActivity(), (Class<?>) ImagePickerActivity.class);
        intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        attachtowindow2.startActivityForResult(intent, 200);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(attachToWindow attachtowindow, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        updateFileExif updatefileexif = new updateFileExif();
        attachToWindow attachtowindow2 = attachtowindow;
        Intent intent = new Intent(attachtowindow2.getActivity(), (Class<?>) ImagePickerActivity.class);
        intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        attachtowindow2.startActivityForResult(intent, 100);
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        attachToWindow attachtowindow = this;
        ((select) this.d.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(attachtowindow, new Observer() { // from class: shouldAnimateActionModeView
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                attachToWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((select) this.d.getValue()).asBinder.observe(attachtowindow, new Observer() { // from class: updateBackInvokedCallbackState
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                attachToWindow.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(attachToWindow attachtowindow, FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBinding, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        attachtowindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = codeNamePair;
        EditText editText = fragmentAsikActiveParticipantOthersStepFourBinding.tilAddressPostalCode.getEditText();
        if (editText != null) {
            editText.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(FragmentAsikActiveParticipantOthersStepFourBinding fragmentAsikActiveParticipantOthersStepFourBinding, attachToWindow attachtowindow, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_add_child_fourth_asik", "next_add_child_fourth_asik"));
        Intrinsics.checkNotNullParameter("next_add_child_fourth_asik", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("next_add_child_fourth_asik", mapMutableMapOf);
        int i = Integer.parseInt(StringsKt.trim((CharSequence) String.valueOf(fragmentAsikActiveParticipantOthersStepFourBinding.edtChildren.getText())).toString());
        attachtowindow.onTransact.add(new AsikListFamilyItem("", "", "", "", "", "", "", "", ""));
        fragmentAsikActiveParticipantOthersStepFourBinding.edtChildren.setText(String.valueOf(i + 1));
        attachtowindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(attachToWindow attachtowindow, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        attachtowindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(attachToWindow attachtowindow, RadioGroup radioGroup) {
        Intrinsics.checkNotNullParameter(radioGroup, "");
        attachtowindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static /* synthetic */ void d(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void cancelAll(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void INotificationSideChannelDefault(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void getInterfaceDescriptor(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void notify(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void onTransact(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void INotificationSideChannel(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void cancel(attachToWindow attachtowindow, TextInputEditText textInputEditText, int i, int i2, int i3) {
        attachtowindow.INotificationSideChannel.set(1, i);
        attachtowindow.INotificationSideChannel.set(2, i2);
        attachtowindow.INotificationSideChannel.set(5, i3);
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(attachtowindow.INotificationSideChannel.getTime()));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(attachToWindow attachtowindow, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_fourth_list_family_result", "loading_asik_step_fourth_list_family_result"));
            Intrinsics.checkNotNullParameter("loading_asik_step_fourth_list_family_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_asik_step_fourth_list_family_result", mapMutableMapOf);
            attachtowindow.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_asik_step_fourth_list_family_result", "success_asik_step_fourth_list_family_result"));
            Intrinsics.checkNotNullParameter("success_asik_step_fourth_list_family_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_asik_step_fourth_list_family_result", mapMutableMapOf2);
            attachtowindow.write();
            attachtowindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1((List<AsikListFamilyItem>) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_asik_step_fourth_list_family_result", "failure_asik_step_fourth_list_family_result"));
            Intrinsics.checkNotNullParameter("failure_asik_step_fourth_list_family_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_asik_step_fourth_list_family_result", mapMutableMapOf3);
        }
        attachtowindow.write();
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(attachToWindow attachtowindow, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            attachtowindow.IconCompatParcelizer();
            str = "loading_asik_step_fourth_family_data_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            attachtowindow.write();
            str = "success_asik_step_fourth_family_data_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            attachtowindow.write();
            str = "failure_asik_step_fourth_family_data_result";
        } else {
            attachtowindow.write();
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_fourth", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }
}
