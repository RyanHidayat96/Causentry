package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentShowMoreHomeBinding;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity;
import com.bpjstku.presentation.branchoffice.BranchOfficeActivity;
import com.bpjstku.presentation.complaint.ChooseComplaintActivity;
import com.bpjstku.presentation.digitalcard.DigitalCardActivity;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity;
import com.bpjstku.presentation.partner.PartnerActivity;
import com.bpjstku.presentation.program.ProgramActivity;
import com.bpjstku.presentation.promo.PromoActivity;
import com.bpjstku.presentation.report.ChooseReportingActivity;
import com.bpjstku.presentation.tuition.TuitionActivity;
import com.bpjstku.presentation.util.SertakanWebviewActivity;
import com.bpjstku.util.constant.AsikPointer;
import com.bpjstku.util.enums.BpjsServiceEnum;
import com.google.android.material.button.MaterialButton;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0010\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0015\u0010\u0017\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u000e\u001a\u00020\u00188\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a"}, d2 = {"LonWindowSystemUiVisibilityChanged;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lcom/bpjstku/databinding/FragmentShowMoreHomeBinding;", "Lcom/bpjstku/databinding/FragmentShowMoreHomeBinding;", "LsetActionBarHideOffset;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "I", "()I", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onWindowSystemUiVisibilityChanged extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentShowMoreHomeBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: onStopNestedScroll
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return onWindowSystemUiVisibilityChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 4;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return R.layout.fragment_show_more_home;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentShowMoreHomeBinding fragmentShowMoreHomeBindingInflate = FragmentShowMoreHomeBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fragmentShowMoreHomeBindingInflate;
        if (fragmentShowMoreHomeBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowMoreHomeBindingInflate = null;
        }
        RelativeLayout root = fragmentShowMoreHomeBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends RecyclerView.ItemDecoration {
        private final int TuitionPaymentFragmentbindingInflater1;
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 13;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            this.TuitionPaymentFragmentbindingInflater1 = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view) + 1;
            rect.bottom = (int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * Resources.getSystem().getDisplayMetrics().density);
            int i = childAdapterPosition % this.TuitionPaymentFragmentbindingInflater1;
            if (i == 0) {
                rect.right = (int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * Resources.getSystem().getDisplayMetrics().density);
                rect.left = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2) * Resources.getSystem().getDisplayMetrics().density);
            } else if (i == 1) {
                rect.left = (int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * Resources.getSystem().getDisplayMetrics().density);
                rect.right = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2) * Resources.getSystem().getDisplayMetrics().density);
            } else {
                rect.left = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2) * Resources.getSystem().getDisplayMetrics().density);
                rect.right = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2) * Resources.getSystem().getDisplayMetrics().density);
            }
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentShowMoreHomeBinding fragmentShowMoreHomeBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentShowMoreHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowMoreHomeBinding = null;
        }
        RecyclerView recyclerView = fragmentShowMoreHomeBinding.rvServices;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        recyclerView.addItemDecoration(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        recyclerView.setAdapter((setActionBarHideOffset) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(recyclerView.getContext().getResources().getDisplayMetrics().heightPixels));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentShowMoreHomeBinding fragmentShowMoreHomeBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentShowMoreHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentShowMoreHomeBinding = null;
        }
        MaterialButton materialButton = fragmentShowMoreHomeBinding.btnCloseDialog;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: onStartNestedScroll
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return onWindowSystemUiVisibilityChanged.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
    }

    public static /* synthetic */ Unit b(onWindowSystemUiVisibilityChanged onwindowsystemuivisibilitychanged) {
        onwindowsystemuivisibilitychanged.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onWindowSystemUiVisibilityChanged onwindowsystemuivisibilitychanged, r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        String str;
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        String str2 = r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (Intrinsics.areEqual(str2, BpjsServiceEnum.REGISTRATION.getType())) {
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            if (getMaxImages.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal()) {
                SertakanWebviewActivity.Companion companion = SertakanWebviewActivity.INSTANCE;
                Context contextRequireContext = onwindowsystemuivisibilitychanged.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                SertakanWebviewActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, "", "");
            } else {
                TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion2 = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
                Context contextRequireContext2 = onwindowsystemuivisibilitychanged.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext2, false, false, 6);
            }
            str = "registration_non_salaried_wordker";
        } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.ECARD.getType())) {
            DigitalCardActivity.Companion companion3 = DigitalCardActivity.INSTANCE;
            Context contextRequireContext3 = onwindowsystemuivisibilitychanged.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            DigitalCardActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext3);
            str = "view_menu_digital_card";
        } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.PROMO.getType())) {
            PromoActivity.Companion companion4 = PromoActivity.INSTANCE;
            Context contextRequireContext4 = onwindowsystemuivisibilitychanged.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
            PromoActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext4);
            str = "view_menu_promo";
        } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.TUITION.getType())) {
            TuitionActivity.Companion companion5 = TuitionActivity.INSTANCE;
            Context contextRequireContext5 = onwindowsystemuivisibilitychanged.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
            TuitionActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext5);
            str = "view_menu_tuition";
        } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.PARTNER.getType())) {
            PartnerActivity.Companion companion6 = PartnerActivity.INSTANCE;
            Context contextRequireContext6 = onwindowsystemuivisibilitychanged.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
            PartnerActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext6, "DKI Jakarta", "Jakarta Barat");
            str = "view_menu_partner";
        } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.PROGRAM_INFO.getType())) {
            ProgramActivity.Companion companion7 = ProgramActivity.INSTANCE;
            Context contextRequireContext7 = onwindowsystemuivisibilitychanged.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "");
            ProgramActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext7, Camera2CameraControlExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ProgramActivity.ProgramDetailType.OPEN_PROGRAM_INFO);
            str = "view_menu_info_program";
        } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.REPORTING.getType())) {
            ChooseReportingActivity.Companion companion8 = ChooseReportingActivity.INSTANCE;
            Context contextRequireContext8 = onwindowsystemuivisibilitychanged.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext8, "");
            ChooseReportingActivity.Companion.b(contextRequireContext8);
            str = "view_menu_reporting";
        } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.BRANCH_OFFICE.getType())) {
            Context contextRequireContext9 = onwindowsystemuivisibilitychanged.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext9, "");
            Intrinsics.checkNotNullParameter(contextRequireContext9, "");
            ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
            if (ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                BranchOfficeActivity.Companion companion9 = BranchOfficeActivity.INSTANCE;
                Context contextRequireContext10 = onwindowsystemuivisibilitychanged.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext10, "");
                BranchOfficeActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext10, null);
            } else {
                String string = onwindowsystemuivisibilitychanged.getString(R.string.error_message_location_gps_disabled);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
            }
            str = "view_menu_branch_office";
        } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.COMPLAINT.getType())) {
            ChooseComplaintActivity.Companion companion10 = ChooseComplaintActivity.INSTANCE;
            Context contextRequireContext11 = onwindowsystemuivisibilitychanged.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext11, "");
            ChooseComplaintActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext11);
            str = "view_menu_complaint";
        } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.HEREGISTRATION.getType())) {
            AsikActiveParticipantSubmissionCheckActivity.Companion companion11 = AsikActiveParticipantSubmissionCheckActivity.INSTANCE;
            Context contextRequireContext12 = onwindowsystemuivisibilitychanged.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext12, "");
            AsikActiveParticipantSubmissionCheckActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext12, AsikPointer.MENU.getType());
            str = "view_menu_heregistration_pengkinian";
        } else {
            str = "";
        }
        FragmentActivity activity = onwindowsystemuivisibilitychanged.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ setActionBarHideOffset TuitionPaymentFragmentspecialinlinedviewModeldefault3(final onWindowSystemUiVisibilityChanged onwindowsystemuivisibilitychanged) {
        Context contextRequireContext = onwindowsystemuivisibilitychanged.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String type = BpjsServiceEnum.TUITION.getType();
        String string = onwindowsystemuivisibilitychanged.getString(R.string.label_tuition_payment);
        Intrinsics.checkNotNullExpressionValue(string, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type, string, R.drawable.ic_tuition);
        String type2 = BpjsServiceEnum.PROMO.getType();
        String string2 = onwindowsystemuivisibilitychanged.getString(R.string.label_promo);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs5 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type2, string2, 2131231442);
        String type3 = BpjsServiceEnum.HEREGISTRATION.getType();
        String string3 = onwindowsystemuivisibilitychanged.getString(R.string.label_asik_program);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs6 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type3, string3, R.drawable.ic_asik);
        String type4 = BpjsServiceEnum.PARTNER.getType();
        String string4 = onwindowsystemuivisibilitychanged.getString(R.string.label_partner);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs7 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type4, string4, R.drawable.ic_partner);
        String type5 = BpjsServiceEnum.PROGRAM_INFO.getType();
        String string5 = onwindowsystemuivisibilitychanged.getString(R.string.label_program_info);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs8 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type5, string5, R.drawable.ic_program_info);
        String type6 = BpjsServiceEnum.REPORTING.getType();
        String string6 = onwindowsystemuivisibilitychanged.getString(R.string.label_report);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs9 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type6, string6, R.drawable.ic_report);
        String type7 = BpjsServiceEnum.BRANCH_OFFICE.getType();
        String string7 = onwindowsystemuivisibilitychanged.getString(R.string.label_branch_office);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs10 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type7, string7, R.drawable.ic_branch_office);
        String type8 = BpjsServiceEnum.COMPLAINT.getType();
        String string8 = onwindowsystemuivisibilitychanged.getString(R.string.label_complaint);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        return new setActionBarHideOffset(contextRequireContext, CollectionsKt.mutableListOf(r8lambdai2xi7mochmmaz9qzzewheaxs4, r8lambdai2xi7mochmmaz9qzzewheaxs5, r8lambdai2xi7mochmmaz9qzzewheaxs6, r8lambdai2xi7mochmmaz9qzzewheaxs7, r8lambdai2xi7mochmmaz9qzzewheaxs8, r8lambdai2xi7mochmmaz9qzzewheaxs9, r8lambdai2xi7mochmmaz9qzzewheaxs10, new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type8, string8, R.drawable.ic_complaint)), new Function1() { // from class: pullChildren
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onWindowSystemUiVisibilityChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj);
            }
        });
    }
}
