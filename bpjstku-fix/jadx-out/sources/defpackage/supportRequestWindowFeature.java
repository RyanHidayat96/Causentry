package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.AsikDocumentRequest;
import com.bpjstku.data.asik.model.request.AsikRequest;
import com.bpjstku.data.asik.model.request.EmployeeFamilyRequest;
import com.bpjstku.data.asik.model.request.EmployeeKpjRequest;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.databinding.FragmentAsikActiveParticipantConfirmationDataBinding;
import com.bpjstku.databinding.ItemKpjListDisabledBinding;
import com.bpjstku.domain.asik.model.Asik;
import com.bpjstku.domain.asik.model.EmployeeFamily;
import com.bpjstku.domain.asik.model.EmployeeKpj;
import com.bpjstku.domain.asik.model.SubmissionCheckItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantConfirmationDataFragment$bindingInflater$1;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.util.constant.BloodTypeCode;
import com.bpjstku.util.constant.EducationCode;
import com.bpjstku.util.constant.FamilyStatusCode;
import com.bpjstku.util.constant.MaritalStatusCode;
import com.bpjstku.util.constant.ReligionCode;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.select;
import defpackage.setQuickZoomEnabled;
import defpackage.setTabListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0005R\u0015\u0010\r\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0015\u0010\u0011\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0015\u0010\u000b\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0015\u0010\u0015\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0017\u0010\b\u001a\u0004\u0018\u00010\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR.\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\"R\u0014\u0010\u0013\u001a\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010$"}, d2 = {"LsupportRequestWindowFeature;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantConfirmationDataBinding;", "LgetStringOrNull$b;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "TuitionPaymentFragmentbindingInflater1", "INotificationSideChannel", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgenerateConfigDelta_colorMode;", "Lkotlin/Lazy;", "Lselect;", "b", "Lcom/bpjstku/data/lib/PreferenceManager;", "notify", "LsetTabListener;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "asBinder", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "a", "asInterface", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class supportRequestWindowFeature extends AutoValue_CameraState_StateError<FragmentAsikActiveParticipantConfirmationDataBinding> implements getStringOrNull.b {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String asBinder;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: applyDayNightToActiveDelegates
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return supportRequestWindowFeature.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

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
        return R.layout.fragment_asik_active_participant_confirmation_data;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public supportRequestWindowFeature() {
        final supportRequestWindowFeature supportrequestwindowfeature = this;
        this.b = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantConfirmationDataFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, select] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ select invoke() {
                LifecycleOwner lifecycleOwner = supportrequestwindowfeature;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(select.class);
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
        final supportRequestWindowFeature supportrequestwindowfeature2 = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantConfirmationDataFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = supportrequestwindowfeature2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final supportRequestWindowFeature supportrequestwindowfeature3 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantConfirmationDataFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = supportrequestwindowfeature3.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<setTabListener>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantConfirmationDataFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, setTabListener] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setTabListener invoke() {
                return getFocusY.b(supportrequestwindowfeature3, Reflection.getOrCreateKotlinClass(setTabListener.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.onTransact = LazyKt.lazy(new Function0() { // from class: applyLocalesToActiveDelegates
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((setTabListener) this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            }
        });
    }

    public static final /* synthetic */ FragmentAsikActiveParticipantConfirmationDataBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(supportRequestWindowFeature supportrequestwindowfeature) {
        return supportrequestwindowfeature.asInterface();
    }

    /* JADX INFO: renamed from: supportRequestWindowFeature$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LsupportRequestWindowFeature$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "LsupportRequestWindowFeature;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LsupportRequestWindowFeature;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static supportRequestWindowFeature TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new supportRequestWindowFeature();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantConfirmationDataBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return AsikActiveParticipantConfirmationDataFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        MaterialButton materialButton = asInterface().btnConfirmation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: addActiveDelegate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return supportRequestWindowFeature.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
    }

    private final void TuitionPaymentFragmentbindingInflater1() {
        List<EmployeeKpj> list;
        EditText editText;
        View viewInflate = getLayoutInflater().inflate(R.layout.item_kpj_list_disabled, (ViewGroup) asInterface().kpjContainer, false);
        asInterface().kpjContainer.addView(viewInflate);
        ItemKpjListDisabledBinding itemKpjListDisabledBindingBind = ItemKpjListDisabledBinding.bind(viewInflate);
        Intrinsics.checkNotNullExpressionValue(itemKpjListDisabledBindingBind, "");
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) this.onTransact.getValue();
        if (asikActiveParticipant == null || (list = asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null || !(!list.isEmpty()) || (editText = itemKpjListDisabledBindingBind.tilIdKpj.getEditText()) == null) {
            return;
        }
        AsikActiveParticipant asikActiveParticipant2 = (AsikActiveParticipant) this.onTransact.getValue();
        Intrinsics.checkNotNull(asikActiveParticipant2);
        editText.setText(asikActiveParticipant2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(0).b);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            MaterialButton materialButton = supportRequestWindowFeature.TuitionPaymentFragmentspecialinlinedviewModeldefault3(supportRequestWindowFeature.this).btnConfirmation;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
            File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            MainActivity.Companion companion = MainActivity.INSTANCE;
            Context contextRequireContext = supportRequestWindowFeature.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, null, null, 6);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
            Context contextRequireContext = supportRequestWindowFeature.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext);
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            supportRequestWindowFeature.b(supportRequestWindowFeature.this);
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(supportRequestWindowFeature supportrequestwindowfeature, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            MaterialButton materialButton = supportrequestwindowfeature.asInterface().btnConfirmation;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
            ((generateConfigDelta_colorMode) supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).setCancelable(false);
            generateConfigDelta_colorMode generateconfigdelta_colormode = (generateConfigDelta_colorMode) supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            FragmentManager childFragmentManager = supportrequestwindowfeature.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(generateconfigdelta_colormode.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                generateconfigdelta_colormode.show(childFragmentManager, generateconfigdelta_colormode.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            str = "loading_asik_step_sixth_confirmation_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ((generateConfigDelta_colorMode) supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).dismiss();
            Asik asik = (Asik) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (asik.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_success", "asik_success"));
                Intrinsics.checkNotNullParameter("asik_success", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_success", mapMutableMapOf);
                getCameraState.Companion companion = getCameraState.INSTANCE;
                String string = supportrequestwindowfeature.getString(R.string.label_success);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = supportrequestwindowfeature.getString(R.string.label_message_asik_successfully_submitted);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = supportrequestwindowfeature.getString(R.string.action_ok_thanks);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
                FragmentManager childFragmentManager2 = supportrequestwindowfeature.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                if (childFragmentManager2.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(childFragmentManager2, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                getcamerastateB.g = supportrequestwindowfeature.new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            } else {
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_confirmation_asik", "asik_failed"));
                Intrinsics.checkNotNullParameter("asik_failed", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_failed", mapMutableMapOf2);
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), asik.b, 0).show();
            }
            str = "success_asik_step_sixth_confirmation_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            MaterialButton materialButton3 = supportrequestwindowfeature.asInterface().btnConfirmation;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
            ((generateConfigDelta_colorMode) supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).dismiss();
            getCameraState.Companion companion2 = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string4 = supportrequestwindowfeature.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            getCameraState getcamerastateB2 = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string4);
            FragmentManager childFragmentManager3 = supportrequestwindowfeature.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
            Intrinsics.checkNotNullParameter(childFragmentManager3, "");
            if (childFragmentManager3.findFragmentByTag(getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB2.show(childFragmentManager3, getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            str = "failure_asik_step_sixth_confirmation_result";
        } else {
            supportrequestwindowfeature.write();
            str = "";
        }
        TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_asik_step_sixth", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ generateConfigDelta_colorMode TuitionPaymentFragmentspecialinlinedviewModeldefault1(supportRequestWindowFeature supportrequestwindowfeature) {
        generateConfigDelta_colorMode.Companion companion = generateConfigDelta_colorMode.INSTANCE;
        String string = supportrequestwindowfeature.getString(R.string.label_process_sending_data);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = supportrequestwindowfeature.getString(R.string.info_sending_data);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return generateConfigDelta_colorMode.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string, string2);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(supportRequestWindowFeature supportrequestwindowfeature) throws IOException {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) supportrequestwindowfeature.TuitionPaymentFragmentbindingInflater1.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null && camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            supportrequestwindowfeature.a = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            supportrequestwindowfeature.asInterface = camera2CameraControlExternalSyntheticLambda4B.b;
            supportrequestwindowfeature.d = camera2CameraControlExternalSyntheticLambda4B.g;
            supportrequestwindowfeature.asBinder = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            supportrequestwindowfeature.g = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = supportrequestwindowfeature.a;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        } else {
            supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "0.0";
            supportrequestwindowfeature.a = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0167 A[LOOP:1: B:41:0x0161->B:43:0x0167, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x019c A[LOOP:2: B:45:0x0196->B:47:0x019c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x01da  */
    /* JADX WARN: Code duplicated, block: B:55:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0217  */
    /* JADX WARN: Code duplicated, block: B:60:0x0229  */
    /* JADX WARN: Code duplicated, block: B:64:0x025d  */
    /* JADX WARN: Code duplicated, block: B:66:0x026f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0297  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:76:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0318  */
    /* JADX WARN: Code duplicated, block: B:84:0x032a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0341  */
    /* JADX WARN: Code duplicated, block: B:89:0x0344  */
    /* JADX WARN: Code duplicated, block: B:92:0x0357  */
    /* JADX WARN: Code duplicated, block: B:93:0x035a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0392  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a0  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(supportRequestWindowFeature supportrequestwindowfeature, View view) throws Throwable {
        String str;
        User userAsBinder;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        String str4;
        List list;
        int size;
        String string;
        int i;
        String str5;
        List list2;
        int size2;
        String string2;
        int i2;
        String str6;
        List list3;
        int size3;
        String string3;
        int i3;
        String str7;
        List list4;
        int size4;
        String string4;
        int i4;
        String str8;
        List list5;
        int size5;
        String string5;
        int i5;
        SubmissionCheckItem submissionCheckItemTuitionPaymentFragmentbindingInflater1;
        String str9;
        SubmissionCheckItem submissionCheckItemTuitionPaymentFragmentbindingInflater2;
        String str10;
        byte[] bArr;
        String str11;
        String strEncodeToString;
        Intrinsics.checkNotNullParameter(view, "");
        if (supportrequestwindowfeature.asInterface().cbAgreeTermCondition.isChecked()) {
            AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) supportrequestwindowfeature.onTransact.getValue();
            if (asikActiveParticipant != null) {
                String str12 = asikActiveParticipant.getExtras;
                if (str12 == null || str12.length() == 0) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string6 = supportrequestwindowfeature.getString(R.string.action_information);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    String string7 = supportrequestwindowfeature.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string7, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string6, "Silakan melakukan pengisian Nomor Rekening pada tahap sebelumnya", string7, null, 112);
                    FragmentManager childFragmentManager = supportrequestwindowfeature.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
                    Context contextRequireContext = supportrequestwindowfeature.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    Intrinsics.checkNotNullParameter(contextRequireContext, "");
                    if (ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3() && ExperimentalCamera2Interop.b(contextRequireContext)) {
                        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_sixth", "submit_asik_step_sixth_confirmation"));
                        Intrinsics.checkNotNullParameter("submit_asik_step_sixth_confirmation", "");
                        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_asik_step_sixth_confirmation", mapMutableMapOf);
                        String strJoinToString$default = supportrequestwindowfeature.asInterface;
                        if (strJoinToString$default == null) {
                            strJoinToString$default = "";
                        }
                        String str13 = supportrequestwindowfeature.asBinder;
                        if (str13 == null) {
                            str13 = "";
                        }
                        String str14 = strJoinToString$default;
                        if (StringsKt.isBlank(str14) || StringsKt.isBlank(str13) || StringsKt.equals(str13, "Indonesia", true)) {
                            if (StringsKt.isBlank(str14)) {
                                str = !StringsKt.isBlank(str13) ? str13 : "";
                            }
                            AsikActiveParticipant asikActiveParticipantB = AsikActiveParticipant.b(asikActiveParticipant, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault3), String.valueOf(supportrequestwindowfeature.a), str, -1, 3);
                            final select selectVar = (select) supportrequestwindowfeature.b.getValue();
                            Intrinsics.checkNotNullParameter(asikActiveParticipantB, "");
                            MutableLiveData<VirtualCameraAdapter1<Asik>> mutableLiveData = selectVar.INotificationSideChannelStub;
                            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                            userAsBinder = selectVar.INotificationSideChannelStubProxy.asBinder();
                            arrayList = new ArrayList();
                            for (EmployeeKpj employeeKpj : asikActiveParticipantB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                arrayList.add(new EmployeeKpjRequest(employeeKpj.b, employeeKpj.TuitionPaymentFragmentspecialinlinedviewModeldefault1, employeeKpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3, employeeKpj.TuitionPaymentFragmentbindingInflater1));
                            }
                            String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                            arrayList2 = new ArrayList();
                            for (EmployeeFamily employeeFamily : asikActiveParticipantB.onTransact) {
                                arrayList2.add(new EmployeeFamilyRequest(employeeFamily.TuitionPaymentFragmentspecialinlinedviewModeldefault2, employeeFamily.TuitionPaymentFragmentspecialinlinedviewModeldefault1, employeeFamily.TuitionPaymentFragmentspecialinlinedviewModeldefault3, employeeFamily.b, employeeFamily.TuitionPaymentFragmentbindingInflater1, employeeFamily.d));
                            }
                            InterfaceC0833y interfaceC0833y = selectVar.d;
                            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = asikActiveParticipantB.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            if (userAsBinder != null) {
                                str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            } else {
                                str2 = null;
                            }
                            String strValueOf = String.valueOf(str2);
                            String str15 = asikActiveParticipantB.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            String str16 = asikActiveParticipantB.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            String str17 = asikActiveParticipantB.TuitionPaymentFragmentbindingInflater1;
                            String str18 = asikActiveParticipantB.asInterface;
                            String str19 = asikActiveParticipantB.d;
                            if (userAsBinder != null) {
                                str3 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            } else {
                                str3 = null;
                            }
                            String strValueOf2 = String.valueOf(str3);
                            String str20 = asikActiveParticipantB.a;
                            String str21 = asikActiveParticipantB.asBinder;
                            String str22 = asikActiveParticipantB.g;
                            String str23 = asikActiveParticipantB.sendCustomAction;
                            String str24 = asikActiveParticipantB.getSessionToken;
                            String str25 = asikActiveParticipantB.getExtras;
                            str4 = asikActiveParticipantB.INotificationSideChannel;
                            Intrinsics.checkNotNull(str4);
                            Intrinsics.checkNotNullParameter(str4, "");
                            list = ArraysKt.toList(MaritalStatusCode.values());
                            size = list.size();
                            string = "";
                            i = 0;
                            while (i < size) {
                                int i6 = size;
                                if (Intrinsics.areEqual(((MaritalStatusCode) list.get(i)).getType(), str4)) {
                                    string = ((MaritalStatusCode) list.get(i)).toString();
                                }
                                i++;
                                size = i6;
                            }
                            String str26 = asikActiveParticipantB.disconnect;
                            String str27 = asikActiveParticipantB.notify;
                            ArrayList arrayList3 = arrayList;
                            ArrayList arrayList4 = arrayList2;
                            str5 = asikActiveParticipantB.RemoteActionCompatParcelizer;
                            Intrinsics.checkNotNull(str5);
                            Intrinsics.checkNotNullParameter(str5, "");
                            list2 = ArraysKt.toList(EducationCode.values());
                            size2 = list2.size();
                            string2 = "";
                            i2 = 0;
                            while (i2 < size2) {
                                int i7 = size2;
                                if (Intrinsics.areEqual(((EducationCode) list2.get(i2)).getType(), str5)) {
                                    string2 = ((EducationCode) list2.get(i2)).toString();
                                }
                                i2++;
                                size2 = i7;
                            }
                            str6 = asikActiveParticipantB.INotificationSideChannelStub;
                            Intrinsics.checkNotNull(str6);
                            Intrinsics.checkNotNullParameter(str6, "");
                            list3 = ArraysKt.toList(ReligionCode.values());
                            size3 = list3.size();
                            string3 = "";
                            i3 = 0;
                            while (i3 < size3) {
                                int i8 = size3;
                                if (Intrinsics.areEqual(((ReligionCode) list3.get(i3)).getType(), str6)) {
                                    string3 = ((ReligionCode) list3.get(i3)).toString();
                                }
                                i3++;
                                size3 = i8;
                            }
                            str7 = asikActiveParticipantB.read;
                            Intrinsics.checkNotNull(str7);
                            Intrinsics.checkNotNullParameter(str7, "");
                            list4 = ArraysKt.toList(BloodTypeCode.values());
                            size4 = list4.size();
                            string4 = "";
                            i4 = 0;
                            while (i4 < size4) {
                                int i9 = size4;
                                if (Intrinsics.areEqual(((BloodTypeCode) list4.get(i4)).getType(), str7)) {
                                    string4 = ((BloodTypeCode) list4.get(i4)).toString();
                                }
                                i4++;
                                size4 = i9;
                            }
                            String str28 = asikActiveParticipantB.connect;
                            String str29 = asikActiveParticipantB.MediaBrowserCompat;
                            String str30 = asikActiveParticipantB.write;
                            String str31 = asikActiveParticipantB.IconCompatParcelizer;
                            str8 = asikActiveParticipantB.getNotifyChildrenChangedOptions;
                            Intrinsics.checkNotNullParameter(str8, "");
                            list5 = ArraysKt.toList(FamilyStatusCode.values());
                            size5 = list5.size();
                            string5 = "";
                            i5 = 0;
                            while (i5 < size5) {
                                int i10 = size5;
                                if (Intrinsics.areEqual(((FamilyStatusCode) list5.get(i5)).getType(), str8)) {
                                    string5 = ((FamilyStatusCode) list5.get(i5)).toString();
                                }
                                i5++;
                                size5 = i10;
                            }
                            submissionCheckItemTuitionPaymentFragmentbindingInflater1 = selectVar.d.TuitionPaymentFragmentbindingInflater1();
                            if (submissionCheckItemTuitionPaymentFragmentbindingInflater1 != null) {
                                str9 = submissionCheckItemTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            } else {
                                str9 = null;
                            }
                            String strValueOf3 = String.valueOf(str9);
                            String str32 = asikActiveParticipantB.getRoot;
                            String str33 = asikActiveParticipantB.getItem;
                            Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
                            submissionCheckItemTuitionPaymentFragmentbindingInflater2 = selectVar.d.TuitionPaymentFragmentbindingInflater1();
                            if (submissionCheckItemTuitionPaymentFragmentbindingInflater2 != null) {
                                str10 = submissionCheckItemTuitionPaymentFragmentbindingInflater2.g;
                            } else {
                                str10 = null;
                            }
                            AsikRequest asikRequest = new AsikRequest(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, strValueOf, str15, str16, str17, str18, str19, "", strValueOf2, str20, str21, str23, str24, str25, str26, str27, str22, string, string2, string3, string4, str28, str29, str30, str31, string5, strValueOf3, arrayList3, arrayList4, str32, str33, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion3, String.valueOf(str10), strB), asikActiveParticipantB.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String, asikActiveParticipantB.subscribe, asikActiveParticipantB.handleMessage);
                            bArr = asikActiveParticipantB.getInterfaceDescriptor;
                            if (bArr != null) {
                                str11 = "";
                                Intrinsics.checkNotNullParameter(bArr, str11);
                                strEncodeToString = Base64.encodeToString(bArr, 2);
                                Intrinsics.checkNotNullExpressionValue(strEncodeToString, str11);
                            } else {
                                str11 = "";
                                strEncodeToString = null;
                            }
                            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(interfaceC0833y.b(asikRequest, new AsikDocumentRequest(str11, str11, strEncodeToString))));
                            final Function1 function1 = new Function1() { // from class: onDrawerStateChanged
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return select.TuitionPaymentFragmentspecialinlinedviewModeldefault1(selectVar, (Asik) obj);
                                }
                            };
                            logToString logtostring = new logToString() { // from class: setActionBarUpIndicator
                                @Override // defpackage.logToString
                                public final void accept(Object obj) {
                                    function1.invoke(obj);
                                }
                            };
                            final Function1 function2 = new Function1() { // from class: setActionBarDescription
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return select.TuitionPaymentFragmentbindingInflater1(selectVar, (Throwable) obj);
                                }
                            };
                            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setDrawerIndicatorEnabled
                                @Override // defpackage.logToString
                                public final void accept(Object obj) {
                                    function2.invoke(obj);
                                }
                            });
                            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, str11);
                            selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        } else {
                            List listListOf = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default, str13});
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj : listListOf) {
                                if (!StringsKt.isBlank((String) obj)) {
                                    arrayList5.add(obj);
                                }
                            }
                            strJoinToString$default = CollectionsKt.joinToString$default(arrayList5, ", ", null, null, 0, null, null, 62, null);
                        }
                        str = strJoinToString$default;
                        AsikActiveParticipant asikActiveParticipantB2 = AsikActiveParticipant.b(asikActiveParticipant, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault3), String.valueOf(supportrequestwindowfeature.a), str, -1, 3);
                        final select selectVar2 = (select) supportrequestwindowfeature.b.getValue();
                        Intrinsics.checkNotNullParameter(asikActiveParticipantB2, "");
                        MutableLiveData<VirtualCameraAdapter1<Asik>> mutableLiveData2 = selectVar2.INotificationSideChannelStub;
                        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
                        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                        userAsBinder = selectVar2.INotificationSideChannelStubProxy.asBinder();
                        arrayList = new ArrayList();
                        while (r6.hasNext()) {
                            arrayList.add(new EmployeeKpjRequest(employeeKpj.b, employeeKpj.TuitionPaymentFragmentspecialinlinedviewModeldefault1, employeeKpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3, employeeKpj.TuitionPaymentFragmentbindingInflater1));
                        }
                        String strB2 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                        arrayList2 = new ArrayList();
                        while (r8.hasNext()) {
                            arrayList2.add(new EmployeeFamilyRequest(employeeFamily.TuitionPaymentFragmentspecialinlinedviewModeldefault2, employeeFamily.TuitionPaymentFragmentspecialinlinedviewModeldefault1, employeeFamily.TuitionPaymentFragmentspecialinlinedviewModeldefault3, employeeFamily.b, employeeFamily.TuitionPaymentFragmentbindingInflater1, employeeFamily.d));
                        }
                        InterfaceC0833y interfaceC0833y2 = selectVar2.d;
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = asikActiveParticipantB2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        if (userAsBinder != null) {
                            str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        } else {
                            str2 = null;
                        }
                        String strValueOf4 = String.valueOf(str2);
                        String str110 = asikActiveParticipantB2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        String str111 = asikActiveParticipantB2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        String str112 = asikActiveParticipantB2.TuitionPaymentFragmentbindingInflater1;
                        String str113 = asikActiveParticipantB2.asInterface;
                        String str114 = asikActiveParticipantB2.d;
                        if (userAsBinder != null) {
                            str3 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        } else {
                            str3 = null;
                        }
                        String strValueOf5 = String.valueOf(str3);
                        String str210 = asikActiveParticipantB2.a;
                        String str211 = asikActiveParticipantB2.asBinder;
                        String str212 = asikActiveParticipantB2.g;
                        String str213 = asikActiveParticipantB2.sendCustomAction;
                        String str214 = asikActiveParticipantB2.getSessionToken;
                        String str215 = asikActiveParticipantB2.getExtras;
                        str4 = asikActiveParticipantB2.INotificationSideChannel;
                        Intrinsics.checkNotNull(str4);
                        Intrinsics.checkNotNullParameter(str4, "");
                        list = ArraysKt.toList(MaritalStatusCode.values());
                        size = list.size();
                        string = "";
                        i = 0;
                        while (i < size) {
                            int i11 = size;
                            if (Intrinsics.areEqual(((MaritalStatusCode) list.get(i)).getType(), str4)) {
                                string = ((MaritalStatusCode) list.get(i)).toString();
                            }
                            i++;
                            size = i11;
                        }
                        String str216 = asikActiveParticipantB2.disconnect;
                        String str217 = asikActiveParticipantB2.notify;
                        ArrayList arrayList6 = arrayList;
                        ArrayList arrayList7 = arrayList2;
                        str5 = asikActiveParticipantB2.RemoteActionCompatParcelizer;
                        Intrinsics.checkNotNull(str5);
                        Intrinsics.checkNotNullParameter(str5, "");
                        list2 = ArraysKt.toList(EducationCode.values());
                        size2 = list2.size();
                        string2 = "";
                        i2 = 0;
                        while (i2 < size2) {
                            int i12 = size2;
                            if (Intrinsics.areEqual(((EducationCode) list2.get(i2)).getType(), str5)) {
                                string2 = ((EducationCode) list2.get(i2)).toString();
                            }
                            i2++;
                            size2 = i12;
                        }
                        str6 = asikActiveParticipantB2.INotificationSideChannelStub;
                        Intrinsics.checkNotNull(str6);
                        Intrinsics.checkNotNullParameter(str6, "");
                        list3 = ArraysKt.toList(ReligionCode.values());
                        size3 = list3.size();
                        string3 = "";
                        i3 = 0;
                        while (i3 < size3) {
                            int i13 = size3;
                            if (Intrinsics.areEqual(((ReligionCode) list3.get(i3)).getType(), str6)) {
                                string3 = ((ReligionCode) list3.get(i3)).toString();
                            }
                            i3++;
                            size3 = i13;
                        }
                        str7 = asikActiveParticipantB2.read;
                        Intrinsics.checkNotNull(str7);
                        Intrinsics.checkNotNullParameter(str7, "");
                        list4 = ArraysKt.toList(BloodTypeCode.values());
                        size4 = list4.size();
                        string4 = "";
                        i4 = 0;
                        while (i4 < size4) {
                            int i14 = size4;
                            if (Intrinsics.areEqual(((BloodTypeCode) list4.get(i4)).getType(), str7)) {
                                string4 = ((BloodTypeCode) list4.get(i4)).toString();
                            }
                            i4++;
                            size4 = i14;
                        }
                        String str218 = asikActiveParticipantB2.connect;
                        String str219 = asikActiveParticipantB2.MediaBrowserCompat;
                        String str34 = asikActiveParticipantB2.write;
                        String str35 = asikActiveParticipantB2.IconCompatParcelizer;
                        str8 = asikActiveParticipantB2.getNotifyChildrenChangedOptions;
                        Intrinsics.checkNotNullParameter(str8, "");
                        list5 = ArraysKt.toList(FamilyStatusCode.values());
                        size5 = list5.size();
                        string5 = "";
                        i5 = 0;
                        while (i5 < size5) {
                            int i15 = size5;
                            if (Intrinsics.areEqual(((FamilyStatusCode) list5.get(i5)).getType(), str8)) {
                                string5 = ((FamilyStatusCode) list5.get(i5)).toString();
                            }
                            i5++;
                            size5 = i15;
                        }
                        submissionCheckItemTuitionPaymentFragmentbindingInflater1 = selectVar2.d.TuitionPaymentFragmentbindingInflater1();
                        if (submissionCheckItemTuitionPaymentFragmentbindingInflater1 != null) {
                            str9 = submissionCheckItemTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        } else {
                            str9 = null;
                        }
                        String strValueOf6 = String.valueOf(str9);
                        String str36 = asikActiveParticipantB2.getRoot;
                        String str37 = asikActiveParticipantB2.getItem;
                        Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
                        submissionCheckItemTuitionPaymentFragmentbindingInflater2 = selectVar2.d.TuitionPaymentFragmentbindingInflater1();
                        if (submissionCheckItemTuitionPaymentFragmentbindingInflater2 != null) {
                            str10 = submissionCheckItemTuitionPaymentFragmentbindingInflater2.g;
                        } else {
                            str10 = null;
                        }
                        AsikRequest asikRequest2 = new AsikRequest(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, strValueOf4, str110, str111, str112, str113, str114, "", strValueOf5, str210, str211, str213, str214, str215, str216, str217, str212, string, string2, string3, string4, str218, str219, str34, str35, string5, strValueOf6, arrayList6, arrayList7, str36, str37, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion5, String.valueOf(str10), strB2), asikActiveParticipantB2.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String, asikActiveParticipantB2.subscribe, asikActiveParticipantB2.handleMessage);
                        bArr = asikActiveParticipantB2.getInterfaceDescriptor;
                        if (bArr != null) {
                            str11 = "";
                            Intrinsics.checkNotNullParameter(bArr, str11);
                            strEncodeToString = Base64.encodeToString(bArr, 2);
                            Intrinsics.checkNotNullExpressionValue(strEncodeToString, str11);
                        } else {
                            str11 = "";
                            strEncodeToString = null;
                        }
                        deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(interfaceC0833y2.b(asikRequest2, new AsikDocumentRequest(str11, str11, strEncodeToString))));
                        final Function1 function3 = new Function1() { // from class: onDrawerStateChanged
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return select.TuitionPaymentFragmentspecialinlinedviewModeldefault1(selectVar2, (Asik) obj2);
                            }
                        };
                        logToString logtostring2 = new logToString() { // from class: setActionBarUpIndicator
                            @Override // defpackage.logToString
                            public final void accept(Object obj2) {
                                function3.invoke(obj2);
                            }
                        };
                        final Function1 function4 = new Function1() { // from class: setActionBarDescription
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return select.TuitionPaymentFragmentbindingInflater1(selectVar2, (Throwable) obj2);
                            }
                        };
                        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: setDrawerIndicatorEnabled
                            @Override // defpackage.logToString
                            public final void accept(Object obj2) {
                                function4.invoke(obj2);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, str11);
                        selectVar2.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    } else {
                        ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
                        if (ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                            getCameraState.Companion companion6 = getCameraState.INSTANCE;
                            String string8 = supportrequestwindowfeature.getString(R.string.action_information);
                            Intrinsics.checkNotNullExpressionValue(string8, "");
                            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, string8, "Silakan berikan izin akses lokasi untuk melanjutkan pengajuan. Lokasi Anda diperlukan untuk verifikasi.", "Berikan Izin");
                            FragmentManager childFragmentManager2 = supportrequestwindowfeature.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                            Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                            if (childFragmentManager2.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                getcamerastateB.show(childFragmentManager2, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                            getcamerastateB.g = supportrequestwindowfeature.new TuitionPaymentFragmentbindingInflater1();
                        } else {
                            getCameraState.Companion companion7 = getCameraState.INSTANCE;
                            String string9 = supportrequestwindowfeature.getString(R.string.action_information);
                            Intrinsics.checkNotNullExpressionValue(string9, "");
                            getCameraState getcamerastateB2 = getCameraState.Companion.b(R.drawable.ic_info_blue, string9, "Silakan aktifkan GPS/Location Services untuk melanjutkan pengajuan. Lokasi Anda diperlukan untuk verifikasi.", "Aktifkan GPS");
                            FragmentManager childFragmentManager3 = supportrequestwindowfeature.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                            Intrinsics.checkNotNullParameter(childFragmentManager3, "");
                            if (childFragmentManager3.findFragmentByTag(getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                getcamerastateB2.show(childFragmentManager3, getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                            getcamerastateB2.g = supportrequestwindowfeature.new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                    }
                }
            }
        } else {
            String string10 = supportrequestwindowfeature.getString(R.string.message_check_tnc);
            Intrinsics.checkNotNullExpressionValue(string10, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string10, 0).show();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((select) this.b.getValue()).INotificationSideChannelStub.observe(this, new b(new Function1() { // from class: AppCompatDelegate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return supportRequestWindowFeature.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // getStringOrNull.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        BaseActivity baseActivity = this.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        FragmentAsikActiveParticipantConfirmationDataBinding fragmentAsikActiveParticipantConfirmationDataBindingAsInterface = asInterface();
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) this.onTransact.getValue();
        if (asikActiveParticipant != null) {
            EditText editText = fragmentAsikActiveParticipantConfirmationDataBindingAsInterface.tilIdentityNumber.getEditText();
            if (editText != null) {
                editText.setText(asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
            EditText editText2 = fragmentAsikActiveParticipantConfirmationDataBindingAsInterface.tilFullName.getEditText();
            if (editText2 != null) {
                editText2.setText(asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            EditText editText3 = fragmentAsikActiveParticipantConfirmationDataBindingAsInterface.tilNPWP.getEditText();
            if (editText3 != null) {
                editText3.setText(asikActiveParticipant.asBinder);
            }
            EditText editText4 = fragmentAsikActiveParticipantConfirmationDataBindingAsInterface.tilPhoneNumber.getEditText();
            if (editText4 != null) {
                editText4.setText(asikActiveParticipant.INotificationSideChannelStubProxy);
            }
            EditText editText5 = fragmentAsikActiveParticipantConfirmationDataBindingAsInterface.tilEmail.getEditText();
            if (editText5 != null) {
                editText5.setText(asikActiveParticipant.INotificationSideChannelDefault);
            }
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        EditText editText;
        List<EmployeeKpj> list;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: supportShouldUpRecreateTask
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return supportRequestWindowFeature.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: AppCompatCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return supportRequestWindowFeature.TuitionPaymentFragmentbindingInflater1(this.b);
            }
        });
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) this.onTransact.getValue();
        Integer numValueOf = (asikActiveParticipant == null || (list = asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) ? null : Integer.valueOf(list.size());
        if (numValueOf != null && numValueOf.intValue() == 1) {
            TuitionPaymentFragmentbindingInflater1();
            return;
        }
        AsikActiveParticipant asikActiveParticipant2 = (AsikActiveParticipant) this.onTransact.getValue();
        List<EmployeeKpj> list2 = asikActiveParticipant2 != null ? asikActiveParticipant2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
        if (list2 != null) {
            int i = 0;
            for (Object obj : list2) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TuitionPaymentFragmentbindingInflater1();
                View childAt = asInterface().kpjContainer.getChildAt(i);
                if ((childAt instanceof TextInputLayout) && (editText = ((TextInputLayout) childAt).getEditText()) != null) {
                    AsikActiveParticipant asikActiveParticipant3 = (AsikActiveParticipant) this.onTransact.getValue();
                    Intrinsics.checkNotNull(asikActiveParticipant3);
                    editText.setText(asikActiveParticipant3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i).b);
                }
                i++;
            }
        }
    }

    public static final /* synthetic */ void b(supportRequestWindowFeature supportrequestwindowfeature) {
        ActivityCompat.requestPermissions(supportrequestwindowfeature.requireActivity(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 100);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(supportRequestWindowFeature supportrequestwindowfeature, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = String.valueOf(userLocationComplete.b);
        supportrequestwindowfeature.a = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        supportrequestwindowfeature.asInterface = str;
        supportrequestwindowfeature.d = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        }
        supportrequestwindowfeature.asBinder = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        supportrequestwindowfeature.g = str4;
        String str5 = supportrequestwindowfeature.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str6 = supportrequestwindowfeature.a;
        String str7 = supportrequestwindowfeature.asInterface;
        String str8 = supportrequestwindowfeature.d;
        String str9 = supportrequestwindowfeature.asBinder;
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
}
