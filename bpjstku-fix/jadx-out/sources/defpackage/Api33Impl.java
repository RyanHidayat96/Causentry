package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentNonSalariedWorkerJobDescriptionRegistrationBinding;
import com.bpjstku.presentation.membership.registration.PhoneVerificationActivity;
import com.bpjstku.presentation.membership.registration.model.Job;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.model.WorkLocation;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerJobDescriptionRegistrationFragment$bindingInflater$1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001e\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000f\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0015\u0010\u0016\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\u000b\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u001a\u0010\u001c\u001a\u00020\"8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b\u000f\u0010$R.\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010)"}, d2 = {"LApi33Impl;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentNonSalariedWorkerJobDescriptionRegistrationBinding;", "<init>", "()V", "", "INotificationSideChannelDefault", "cancelAll", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "g", "cancel", "INotificationSideChannel", "Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;", "asBinder", "Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "a", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "b", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "LgetActivitySideSheetPosition;", "asInterface", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "LsaveBitmap;", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "", "I", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Api33Impl extends AutoValue_ImmutableImageInfo<FragmentNonSalariedWorkerJobDescriptionRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Job TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private WorkLocation TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Job b;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Calendar g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: setNavigationBarColor
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy asBinder = LazyKt.lazy(new Function0() { // from class: onActivityLayout
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Api33Impl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: extraCallbackWithResult
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
    }

    public Api33Impl() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.g = calendar;
        this.asInterface = R.layout.fragment_non_salaried_worker_job_description_registration;
    }

    /* JADX INFO: renamed from: Api33Impl$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LApi33Impl$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "p0", "LApi33Impl;", "b", "(Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)LApi33Impl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static Api33Impl b(RegistrationForUnregistered p0) {
            Api33Impl api33Impl = new Api33Impl();
            Bundle bundle = new Bundle();
            bundle.putParcelable("unregistered_data", p0);
            api33Impl.setArguments(bundle);
            return api33Impl;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getAsInterface() {
        return this.asInterface;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerJobDescriptionRegistrationBinding> d() {
        return NonSalariedWorkerJobDescriptionRegistrationFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentNonSalariedWorkerJobDescriptionRegistrationBinding fragmentNonSalariedWorkerJobDescriptionRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentNonSalariedWorkerJobDescriptionRegistrationBindingINotificationSideChannelStub.tilChooseLocation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout2 = fragmentNonSalariedWorkerJobDescriptionRegistrationBindingINotificationSideChannelStub.tilChooseJobFirst;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments != null ? (RegistrationForUnregistered) arguments.getParcelable("unregistered_data") : null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setSecondaryToolbarColor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Api33Impl.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        EditText editText = INotificationSideChannelStub().tilChooseLocation.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: setNavigationBarDividerColor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
                }
            });
        }
        EditText editText2 = INotificationSideChannelStub().tilChooseJobFirst.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: setToolbarColor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Api33Impl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
        }
        EditText editText3 = INotificationSideChannelStub().tilChooseJobSecond.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: CustomTabsCallback
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
        }
    }

    public static /* synthetic */ Unit b(Api33Impl api33Impl, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        RegistrationForUnregistered registrationForUnregistered = api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        if (registrationForUnregistered != null) {
            Job job = api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str = job != null ? job.TuitionPaymentFragmentbindingInflater1 : null;
            Job job2 = api33Impl.b;
            String str2 = job2 != null ? job2.TuitionPaymentFragmentbindingInflater1 : null;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(",");
            sb.append(str2);
            String string = sb.toString();
            Job job3 = api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str3 = job3 != null ? job3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
            Job job4 = api33Impl.b;
            String str4 = job4 != null ? job4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(",");
            sb2.append(str4);
            String string2 = sb2.toString();
            WorkLocation workLocation = api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str5 = workLocation != null ? workLocation.TuitionPaymentFragmentbindingInflater1 : null;
            WorkLocation workLocation2 = api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, null, null, null, null, null, null, null, string, string2, str5, workLocation2 != null ? workLocation2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null, "00:00", "23:59", null, null, null, null, null, null, null, null, false, false, 16761087);
        }
        Context context = api33Impl.getContext();
        if (context != null) {
            PhoneVerificationActivity.Companion companion = PhoneVerificationActivity.INSTANCE;
            PhoneVerificationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Api33Impl api33Impl, Job job) {
        Intrinsics.checkNotNullParameter(job, "");
        api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = job;
        EditText editText = api33Impl.INotificationSideChannelStub().tilChooseJobFirst.getEditText();
        if (editText != null) {
            editText.setText(job.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Api33Impl api33Impl, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getActivitySideSheetPosition getactivitysidesheetposition = (getActivitySideSheetPosition) api33Impl.TuitionPaymentFragmentbindingInflater1.getValue();
            FragmentManager childFragmentManager = api33Impl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getactivitysidesheetposition.show(childFragmentManager, getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ getActivitySideSheetPosition TuitionPaymentFragmentspecialinlinedviewModeldefault1(final Api33Impl api33Impl) {
        getActivitySideSheetPosition.Companion companion = getActivitySideSheetPosition.INSTANCE;
        return getActivitySideSheetPosition.Companion.TuitionPaymentFragmentbindingInflater1(api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Function1() { // from class: onMessageChannelReady
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (WorkLocation) obj);
            }
        });
    }

    public static /* synthetic */ saveBitmap TuitionPaymentFragmentbindingInflater1(final Api33Impl api33Impl) {
        saveBitmap.Companion companion = saveBitmap.INSTANCE;
        return saveBitmap.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new Function1() { // from class: CustomTabColorSchemeParamsBuilder
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Job) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Api33Impl api33Impl, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            saveBitmap savebitmap = (saveBitmap) api33Impl.asBinder.getValue();
            FragmentManager childFragmentManager = api33Impl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                savebitmap.show(childFragmentManager, savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Api33Impl api33Impl, WorkLocation workLocation) {
        Intrinsics.checkNotNullParameter(workLocation, "");
        api33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = workLocation;
        EditText editText = api33Impl.INotificationSideChannelStub().tilChooseLocation.getEditText();
        if (editText != null) {
            editText.setText(workLocation.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ saveBitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(final Api33Impl api33Impl) {
        saveBitmap.Companion companion = saveBitmap.INSTANCE;
        return saveBitmap.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(api33Impl.b, new Function1() { // from class: extraCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Api33Impl.b(this.b, (Job) obj);
            }
        });
    }

    public static /* synthetic */ Unit b(Api33Impl api33Impl, Job job) {
        Intrinsics.checkNotNullParameter(job, "");
        api33Impl.b = job;
        EditText editText = api33Impl.INotificationSideChannelStub().tilChooseJobSecond.getEditText();
        if (editText != null) {
            editText.setText(job.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Api33Impl api33Impl, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            saveBitmap savebitmap = (saveBitmap) api33Impl.d.getValue();
            FragmentManager childFragmentManager = api33Impl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                savebitmap.show(childFragmentManager, savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }
}
