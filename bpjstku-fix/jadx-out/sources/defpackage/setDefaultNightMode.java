package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.AsikVerificationStepRequest;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.databinding.FragmentAsikActiveParticipantEmergencyContactBinding;
import com.bpjstku.domain.asik.model.BloodTypeStatus;
import com.bpjstku.domain.asik.model.EducationStatus;
import com.bpjstku.domain.asik.model.FamilyStatus;
import com.bpjstku.domain.asik.model.ReligionStatus;
import com.bpjstku.domain.asik.model.SubmissionCheckItem;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantEmergencyContactFragment$bindingInflater$1;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.util.enums.VerificationActionType;
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
import java.util.ArrayList;
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
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0013\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0015\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0015\u0010\u0017\u001a\u00020\u00168BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0015\u0010!\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0015\u0010\n\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u0010R\u0015\u0010$\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0015\u0010\t\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010\u0010R.\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00020&8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010*R\u0014\u0010\u0006\u001a\u00020+8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010,"}, d2 = {"LsetDefaultNightMode;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantEmergencyContactBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "cancel", "INotificationSideChannel", "g", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lselect;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LsetTabListener;", "TuitionPaymentFragmentbindingInflater1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "b", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "notify", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "LgetStringOrNull;", "asBinder", "LgetStringOrNull;", "a", "Lcom/bpjstku/domain/asik/model/SubmissionCheckItem;", "LonBackInvoked;", "asInterface", "LonWindowStartingActionMode;", "LsetLocales;", "d", "LunregisterOnBackInvokedCallback;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setDefaultNightMode extends AutoValue_ImmutableImageInfo<FragmentAsikActiveParticipantEmergencyContactBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getContextForDelegate
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((setTabListener) this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private getStringOrNull a;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy INotificationSideChannel;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault2;

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

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return R.layout.fragment_asik_active_participant_emergency_contact;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
    }

    public setDefaultNightMode() {
        final setDefaultNightMode setdefaultnightmode = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantEmergencyContactFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, select] */
            @Override // kotlin.jvm.functions.Function0
            public final select invoke() {
                ComponentCallbacks componentCallbacks = setdefaultnightmode;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(select.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final setDefaultNightMode setdefaultnightmode2 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantEmergencyContactFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = setdefaultnightmode2.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<setTabListener>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantEmergencyContactFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, setTabListener] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setTabListener invoke() {
                return getFocusY.b(setdefaultnightmode2, Reflection.getOrCreateKotlinClass(setTabListener.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantEmergencyContactFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = setdefaultnightmode;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asBinder = LazyKt.lazy(new Function0() { // from class: getLocalNightMode
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((select) this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.TuitionPaymentFragmentbindingInflater1();
            }
        });
        this.asInterface = LazyKt.lazy(new Function0() { // from class: setApplicationLocales
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setDefaultNightMode.b(this.b);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: asyncExecuteSyncRequestedAndStoredLocales
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setDefaultNightMode.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: createView
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.INotificationSideChannel = LazyKt.lazy(new Function0() { // from class: attachBaseContext2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
    }

    /* JADX INFO: renamed from: setDefaultNightMode$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LsetDefaultNightMode$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "LsetDefaultNightMode;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LsetDefaultNightMode;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static setDefaultNightMode TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new setDefaultNightMode();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantEmergencyContactBinding> d() {
        return AsikActiveParticipantEmergencyContactFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: resetStaticRequestedAndStoredLocales
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setDefaultNightMode.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        INotificationSideChannelStub().edtAddressPostalCode.setOnClickListener(new View.OnClickListener() { // from class: isHandleNativeActionModesEnabled
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, view);
            }
        });
        View view = getView();
        TextInputEditText textInputEditText = view != null ? (TextInputEditText) view.findViewById(R.id.edtLastEducation) : null;
        if (textInputEditText != null) {
            textInputEditText.setOnClickListener(new View.OnClickListener() { // from class: removeDelegateFromActives
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    setDefaultNightMode.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view2);
                }
            });
        }
        View view2 = getView();
        TextInputEditText textInputEditText2 = view2 != null ? (TextInputEditText) view2.findViewById(R.id.edtReligion) : null;
        if (textInputEditText2 != null) {
            textInputEditText2.setOnClickListener(new View.OnClickListener() { // from class: setIsAutoStoreLocalesOptedIn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    setDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, view3);
                }
            });
        }
        View view3 = getView();
        TextInputEditText textInputEditText3 = view3 != null ? (TextInputEditText) view3.findViewById(R.id.edtBloodType) : null;
        if (textInputEditText3 != null) {
            textInputEditText3.setOnClickListener(new applyAppLocales(this));
        }
        View view4 = getView();
        TextInputEditText textInputEditText4 = view4 != null ? (TextInputEditText) view4.findViewById(R.id.edtFamilyStatus) : null;
        if (textInputEditText4 != null) {
            textInputEditText4.setOnClickListener(new View.OnClickListener() { // from class: syncRequestedAndStoredLocales
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    setDefaultNightMode.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view5);
                }
            });
        }
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentAsikActiveParticipantEmergencyContactBinding fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilLastEducation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilReligion;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilBloodType;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout4 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilFullNameEmergency;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout5 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilPhoneNumberEmergency;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        TextInputLayout textInputLayout6 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilAddressEmergency;
        Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
        String string6 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout6, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
        TextInputLayout textInputLayout7 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilAddressPostalCode;
        Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
        String string7 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout7, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string7))));
        TextInputLayout textInputLayout8 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilFamilyStatus;
        Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
        String string8 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout8, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string8))));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setDefaultNightMode setdefaultnightmode, BloodTypeStatus bloodTypeStatus) {
        String str = bloodTypeStatus != null ? bloodTypeStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        Intrinsics.checkNotNull(str);
        EditText editText = setdefaultnightmode.INotificationSideChannelStub().tilBloodType.getEditText();
        if (editText != null) {
            editText.setText(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setDefaultNightMode setdefaultnightmode, FamilyStatus familyStatus) {
        String str = familyStatus != null ? familyStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
        Intrinsics.checkNotNull(str);
        EditText editText = setdefaultnightmode.INotificationSideChannelStub().tilFamilyStatus.getEditText();
        if (editText != null) {
            editText.setText(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setDefaultNightMode setdefaultnightmode, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        setdefaultnightmode.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = codeNamePair;
        EditText editText = setdefaultnightmode.INotificationSideChannelStub().tilAddressPostalCode.getEditText();
        if (editText != null) {
            editText.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(setDefaultNightMode setdefaultnightmode, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            unregisterOnBackInvokedCallback unregisteronbackinvokedcallback = (unregisterOnBackInvokedCallback) setdefaultnightmode.INotificationSideChannel.getValue();
            FragmentManager childFragmentManager = setdefaultnightmode.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(unregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                unregisteronbackinvokedcallback.show(childFragmentManager, unregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ setLocales TuitionPaymentFragmentspecialinlinedviewModeldefault3(final setDefaultNightMode setdefaultnightmode) {
        setLocales.Companion companion = setLocales.INSTANCE;
        return setLocales.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: syncLocalesToFramework
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (BloodTypeStatus) obj);
            }
        });
    }

    public static /* synthetic */ Unit b(setDefaultNightMode setdefaultnightmode, ReligionStatus religionStatus) {
        Intrinsics.checkNotNullParameter(religionStatus, "");
        String str = religionStatus.TuitionPaymentFragmentbindingInflater1;
        EditText editText = setdefaultnightmode.INotificationSideChannelStub().tilReligion.getEditText();
        if (editText != null) {
            editText.setText(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ onBackInvoked b(final setDefaultNightMode setdefaultnightmode) {
        onBackInvoked.Companion companion = onBackInvoked.INSTANCE;
        return onBackInvoked.Companion.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: requestWindowFeature
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (EducationStatus) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(setDefaultNightMode setdefaultnightmode, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            onWindowStartingActionMode onwindowstartingactionmode = (onWindowStartingActionMode) setdefaultnightmode.g.getValue();
            FragmentManager childFragmentManager = setdefaultnightmode.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(onwindowstartingactionmode.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                onwindowstartingactionmode.show(childFragmentManager, onwindowstartingactionmode.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final setDefaultNightMode setdefaultnightmode, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            bypassDispatchKeyEvent.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = bypassDispatchKeyEvent.INSTANCE;
            bypassDispatchKeyEvent bypassdispatchkeyeventTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bypassDispatchKeyEvent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: applyDayNight
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setDefaultNightMode.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = setdefaultnightmode.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(bypassdispatchkeyeventTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                bypassdispatchkeyeventTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(childFragmentManager, bypassdispatchkeyeventTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setDefaultNightMode setdefaultnightmode, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        AsikActiveParticipant asikActiveParticipantB;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setdefaultnightmode.IconCompatParcelizer();
            str = "loading_asik_step_fifth_emergency_contact";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            setdefaultnightmode.write();
            FragmentAsikActiveParticipantEmergencyContactBinding fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub = setdefaultnightmode.INotificationSideChannelStub();
            AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) setdefaultnightmode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            VerificationActionType verificationActionType = null;
            Object[] objArr = 0;
            if (asikActiveParticipant != null) {
                EditText editText = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilLastEducation.getEditText();
                String string = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
                EditText editText2 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilReligion.getEditText();
                String string2 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
                EditText editText3 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilBloodType.getEditText();
                String string3 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
                EditText editText4 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilFullNameEmergency.getEditText();
                String string4 = StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString();
                EditText editText5 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilPhoneNumberEmergency.getEditText();
                String string5 = StringsKt.trim((CharSequence) String.valueOf(editText5 != null ? editText5.getText() : null)).toString();
                EditText editText6 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilAddressEmergency.getEditText();
                String string6 = StringsKt.trim((CharSequence) String.valueOf(editText6 != null ? editText6.getText() : null)).toString();
                CodeNamePair codeNamePair = setdefaultnightmode.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str2 = codeNamePair != null ? codeNamePair.b : null;
                String str3 = str2 == null ? "" : str2;
                EditText editText7 = fragmentAsikActiveParticipantEmergencyContactBindingINotificationSideChannelStub.tilFamilyStatus.getEditText();
                asikActiveParticipantB = AsikActiveParticipant.b(asikActiveParticipant, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, string, string2, string3, string4, string5, string6, str3, StringsKt.trim((CharSequence) String.valueOf(editText7 != null ? editText7.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, -66846721, 31);
            } else {
                asikActiveParticipantB = null;
            }
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion bVar = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
            lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol = new lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl(asikActiveParticipantB, verificationActionType, 2, objArr == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol, "");
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol);
            str = "success_asik_step_fifth_emergency_contact";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            setdefaultnightmode.write();
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string7 = setdefaultnightmode.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string7, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string7, null, 112);
            setdefaultnightmode.a = getstringornullB;
            if (getstringornullB != null) {
                FragmentManager childFragmentManager = setdefaultnightmode.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            str = "failure_asik_step_fifth_emergency_contact";
        } else {
            setdefaultnightmode.write();
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_fifth", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ unregisterOnBackInvokedCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2(final setDefaultNightMode setdefaultnightmode) {
        unregisterOnBackInvokedCallback.Companion companion = unregisterOnBackInvokedCallback.INSTANCE;
        return unregisterOnBackInvokedCallback.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: hasWindowFeature
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (FamilyStatus) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setDefaultNightMode setdefaultnightmode, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            setLocales setlocales = (setLocales) setdefaultnightmode.d.getValue();
            FragmentManager childFragmentManager = setdefaultnightmode.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(setlocales.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                setlocales.show(childFragmentManager, setlocales.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(setDefaultNightMode setdefaultnightmode, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_fifth", "submit_asik_step_fifth_emergency_contact"));
        Intrinsics.checkNotNullParameter("submit_asik_step_fifth_emergency_contact", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_asik_step_fifth_emergency_contact", mapMutableMapOf);
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) setdefaultnightmode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = asikActiveParticipant != null ? asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault1() : null;
        SubmissionCheckItem submissionCheckItem = (SubmissionCheckItem) setdefaultnightmode.asBinder.getValue();
        AsikVerificationStepRequest asikVerificationStepRequest = new AsikVerificationStepRequest(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, submissionCheckItem != null ? submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
        final select selectVar = (select) setdefaultnightmode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        Intrinsics.checkNotNullParameter(asikVerificationStepRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.f1351a;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asikVerificationStepRequest)));
        final Function1 function1 = new Function1() { // from class: centerButton
            private static final byte[] $$c = {115, 98, 19, 9};
            private static final int $$f = 170;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {87, -91, 60, 112, -34, -13, -3, -4, -23, 20, -30, -20, 3, -6, -13, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
            private static final int $$e = 36;
            private static final byte[] $$a = {48, -110, 22, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 244;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60034, 60049, 60053, 60073, 60090, 60039, 60041, 60079, 60059, 60056, 60037, 60117, 60036, 60061, 60043, 60046, 60072, 60060, 60083, 60062, 60042, 60058, 60052, 60038, 60054, 60044, 60051, 60055, 60050, 60088, 60040, 60048, 60047, 60057, 60063, 60045};
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57191;

            private static void a(byte b, short s, int i, Object[] objArr) {
                byte[] bArr = $$a;
                int i2 = i * 15;
                int i3 = 108 - (s * 52);
                int i4 = 84 - (b * 4);
                byte[] bArr2 = new byte[53 - i2];
                int i5 = 52 - i2;
                int i6 = -1;
                if (bArr == null) {
                    i4 = (i5 + (-i3)) - 11;
                    i3++;
                    i6 = -1;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i4;
                    if (i7 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i8 = i3;
                    i4 = (i4 + (-bArr[i3])) - 11;
                    i3 = i8 + 1;
                    i6 = i7;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r7, short r8, short r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 11
                    int r8 = r8 + 4
                    int r9 = r9 * 26
                    int r9 = r9 + 12
                    int r7 = r7 * 3
                    int r7 = 87 - r7
                    byte[] r0 = defpackage.centerButton.$$d
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r5 = r2
                    goto L2e
                L16:
                    r3 = r2
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L1a:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r9) goto L29
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L29:
                    r3 = r0[r7]
                    r6 = r3
                    r3 = r7
                    r7 = r6
                L2e:
                    int r7 = -r7
                    int r8 = r8 + r7
                    int r8 = r8 + (-10)
                    int r7 = r3 + 1
                    r3 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.centerButton.d(short, short, short, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
                int i2;
                char c = 2;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                char c2 = '0';
                long j = 0;
                int i4 = 1770390596;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = $11 + 81;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionGroup(j), 2266 - TextUtils.lastIndexOf("", c2, 0, 0), 33 - (ViewConfiguration.getPressedStateDuration() >> 16), -1927765101, false, $$g(b2, b3, (byte) (b3 + 4)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i5++;
                            int i8 = $10 + 69;
                            $11 = i8 % 128;
                            if (i8 % 2 == 0) {
                                int i9 = 2 / 5;
                            }
                            c2 = '0';
                            j = 0;
                            i4 = 1770390596;
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
                    Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2267, 33 - TextUtils.getOffsetAfter("", 0), -1927765101, false, $$g(b4, b5, (byte) (b5 + 4)), new Class[]{Integer.TYPE});
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
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            } else {
                                Object[] objArr4 = new Object[13];
                                objArr4[12] = deinitsession;
                                objArr4[11] = Integer.valueOf(cCharValue);
                                objArr4[10] = deinitsession;
                                objArr4[9] = deinitsession;
                                objArr4[8] = Integer.valueOf(cCharValue);
                                objArr4[7] = deinitsession;
                                objArr4[6] = deinitsession;
                                objArr4[5] = Integer.valueOf(cCharValue);
                                objArr4[4] = deinitsession;
                                objArr4[3] = deinitsession;
                                objArr4[c] = Integer.valueOf(cCharValue);
                                objArr4[1] = deinitsession;
                                objArr4[0] = deinitsession;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = (byte) (b6 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - Color.alpha(0)), ExpandableListView.getPackedPositionGroup(0L) + 3261, View.MeasureSpec.makeMeasureSpec(0, 0) + 30, -127612708, false, $$g(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                    int i10 = $10 + 17;
                                    $11 = i10 % 128;
                                    int i11 = i10 % 2;
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b8 = (byte) 0;
                                        byte b9 = (byte) (b8 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22877 - TextUtils.lastIndexOf("", '0', 0, 0)), 594 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Gravity.getAbsoluteGravity(0, 0) + 17, 1570859318, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                    int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                                } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                } else {
                                    int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                }
                            }
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                            c = 2;
                        }
                    }
                    for (int i17 = 0; i17 < i; i17++) {
                        cArr4[i17] = (char) (cArr4[i17] ^ 13722);
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

            /* JADX WARN: Code duplicated, block: B:26:0x0217  */
            /* JADX WARN: Code duplicated, block: B:27:0x0219  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                char c;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cBlue = (char) Color.blue(0);
                    int iBlue = 2267 - Color.blue(0);
                    int scrollDefaultDelay = 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte[] bArr = $$a;
                    byte b = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b, bArr[40], b, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iBlue, scrollDefaultDelay, -887667012, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{20, 3, 30, '\n', 28, Typography.quote, '#', '\n', 18, Typography.quote, '\n', 17, 6, 0, 31, 20, 25, 24, 28, 21, 7, '!'}, (byte) (48 - KeyEvent.normalizeMetaState(0)), TextUtils.getOffsetAfter("", 0) + 22, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{21, 25, 20, 15, 31, 18, '!', 4, 20, 22, 26, '!', 29, 25, 13854}, (byte) (32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int iResolveSize = 2267 - View.resolveSize(0, 0);
                    int i2 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32;
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[7];
                    Object[] objArr5 = new Object[1];
                    a(b2, bArr2[5], b2, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, iResolveSize, i2, -874156483, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int iAxisFromString = MotionEvent.axisFromString("") + 2268;
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
                        byte[] bArr3 = $$a;
                        byte b3 = bArr3[7];
                        Object[] objArr6 = new Object[1];
                        a(b3, b3, bArr3[5], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iAxisFromString, doubleTapTimeout, -654680577, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i3 = ((int[]) objArr7[0])[0];
                    int i4 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[1];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i5 = ((((~(200746916 | iIdentityHashCode)) | (-937165741)) * 398) - 69247521) + (((~((~iIdentityHashCode) | 200746916)) | (-937165741)) * 398) + 1515185323;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[2])[0] = i7 ^ (i7 << 5);
                    int i8 = TuitionPaymentFragmentbindingInflater1 + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                    int i9 = i8 % 2;
                    c = 3;
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{20, 3, 30, '\n', 28, Typography.quote, '#', '\n', 20, 15, 17, '\b', 3, '\n', Typography.quote, 26, Typography.quote, 29, 30, 2, '\b', 25, 7, 18, 22, '!'}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8), 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{15, 21, 13898, 13898, 20, 1, Typography.quote, 2, 13900, 13900, 28, 29, 15, 27, Typography.quote, 26, 20, 4}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 98), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i10 = TuitionPaymentFragmentbindingInflater1 + 69;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                            if (i10 % 2 != 0) {
                                int i11 = 31 / 0;
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
                    c(new char[]{3, 19, '!', 23, '\t', 29, 20, 3, 23, 17, '\f', 4, 31, '!', 18, 25}, (byte) (31 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{Typography.quote, 4, 20, 1, Typography.quote, 26, 30, 2, 19, 22, ' ', 24, 28, 23, 31, 22}, (byte) (117 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 16 - Gravity.getAbsoluteGravity(0, 0), objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i12 = TuitionPaymentFragmentbindingInflater1 + 111;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                    int i13 = i12 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1515185323};
                        byte[] bArr4 = $$d;
                        byte b4 = bArr4[39];
                        byte b5 = b4;
                        Object[] objArr13 = new Object[1];
                        d(b4, b5, b5, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b6 = bArr4[18];
                        byte b7 = b6;
                        Object[] objArr14 = new Object[1];
                        d(b6, b7, b7, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                                int i14 = 2267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i15 = 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                byte[] bArr5 = $$a;
                                byte b8 = bArr5[7];
                                Object[] objArr16 = new Object[1];
                                a(b8, b8, bArr5[5], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, i14, i15, -654680577, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(new char[]{20, 3, 30, '\n', 28, Typography.quote, '#', '\n', 18, Typography.quote, '\n', 17, 6, 0, 31, 20, 25, 24, 28, 21, 7, '!'}, (byte) (48 - TextUtils.getOffsetBefore("", 0)), 22 - View.getDefaultSize(0, 0), objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(new char[]{21, 25, 20, 15, 31, 18, '!', 4, 20, 22, 26, '!', 29, 25, 13854}, (byte) (30 - Process.getGidForName("")), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                    int scrollDefaultDelay2 = 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int edgeSlop = 33 - (ViewConfiguration.getEdgeSlop() >> 16);
                                    byte[] bArr6 = $$a;
                                    byte b9 = bArr6[7];
                                    Object[] objArr19 = new Object[1];
                                    a(b9, bArr6[5], b9, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, scrollDefaultDelay2, edgeSlop, -874156483, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                    int size = View.MeasureSpec.getSize(0) + 2267;
                                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 33;
                                    byte[] bArr7 = $$a;
                                    byte b10 = bArr7[7];
                                    Object[] objArr20 = new Object[1];
                                    a(b10, bArr7[40], b10, objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, size, touchSlop, -887667012, false, (String) objArr20[0], null);
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
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i16 = ((int[]) objArr[c])[0];
                int i17 = ((int[]) objArr[0])[0];
                if (i17 != i16) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) objArr[1];
                    if (strArr2 != null) {
                        for (String str : strArr2) {
                            arrayList.add(str);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i17));
                }
                int i18 = TuitionPaymentFragmentbindingInflater1 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                int i19 = i18 % 2;
                Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i20 = ((int[]) objArr[2])[0];
                int i21 = ((int[]) objArr[0])[0];
                int i22 = ((int[]) objArr[3])[0];
                String[] strArr3 = (String[]) objArr[1];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i23 = i20 + (-1089948455) + (((-822607977) | (~iIdentityHashCode2)) * (-490)) + (((~(iIdentityHashCode2 | 251098885)) | (-1073706862)) * 490) + 383063836;
                int i24 = i23 ^ (i23 << 13);
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr21[2])[0] = i25 ^ (i25 << 5);
                return select.TuitionPaymentFragmentspecialinlinedviewModeldefault2(selectVar, (BaseItem) obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r6, byte r7, int r8) {
                /*
                    byte[] r0 = defpackage.centerButton.$$c
                    int r7 = r7 + 4
                    int r8 = 116 - r8
                    int r6 = r6 * 2
                    int r1 = 1 - r6
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r0 != 0) goto L15
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r6) goto L21
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L21:
                    int r7 = r7 + 1
                    int r3 = r3 + 1
                    r4 = r0[r7]
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.centerButton.$$g(short, byte, int):java.lang.String");
            }
        };
        logToString logtostring = new logToString() { // from class: setScrollIndicators
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: selectContentView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.TuitionPaymentFragmentspecialinlinedviewModeldefault2(selectVar, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setupTitle
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void asInterface(setDefaultNightMode setdefaultnightmode, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            onBackInvoked onbackinvoked = (onBackInvoked) setdefaultnightmode.asInterface.getValue();
            FragmentManager childFragmentManager = setdefaultnightmode.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(onbackinvoked.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                onbackinvoked.show(childFragmentManager, onbackinvoked.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setDefaultNightMode setdefaultnightmode, EducationStatus educationStatus) {
        String str = educationStatus != null ? educationStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        Intrinsics.checkNotNull(str);
        EditText editText = setdefaultnightmode.INotificationSideChannelStub().tilLastEducation.getEditText();
        if (editText != null) {
            editText.setText(str);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((select) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).f1351a.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: installViewFactory
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setDefaultNightMode.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    public static /* synthetic */ onWindowStartingActionMode asInterface(final setDefaultNightMode setdefaultnightmode) {
        onWindowStartingActionMode.Companion companion = onWindowStartingActionMode.INSTANCE;
        return onWindowStartingActionMode.Companion.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: setHandleNativeActionModesEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setDefaultNightMode.b(this.TuitionPaymentFragmentbindingInflater1, (ReligionStatus) obj);
            }
        });
    }
}
