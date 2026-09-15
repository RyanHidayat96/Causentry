package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.menu.model.response.AvailabilityMenuItem;
import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson;
import com.bpjstku.data.scholarship.model.response.ScholarshipEligibleResponse;
import com.bpjstku.data.user.model.response.FiturList;
import com.bpjstku.databinding.FragmentPelaporHomeBinding;
import com.bpjstku.domain.scholarship.model.ScholarPerson;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity;
import com.bpjstku.presentation.branchoffice.BranchOfficeActivity;
import com.bpjstku.presentation.complaint.ChooseComplaintActivity;
import com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity;
import com.bpjstku.presentation.digitalcard.DigitalCardActivity;
import com.bpjstku.presentation.main.home.PelaporHomeFragment$bindingInflater$1;
import com.bpjstku.presentation.partner.PartnerActivity;
import com.bpjstku.presentation.program.ProgramActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity;
import com.bpjstku.presentation.program.jkk.JkkServiceActivity;
import com.bpjstku.presentation.program.jkm.JkmServiceActivity;
import com.bpjstku.presentation.program.jpn.JpnMainActivity;
import com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity;
import com.bpjstku.presentation.program.model.ProgramInfo;
import com.bpjstku.presentation.promo.PromoActivity;
import com.bpjstku.presentation.report.ChooseReportingActivity;
import com.bpjstku.presentation.support.SupportActivity;
import com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity;
import com.bpjstku.presentation.tuition.TuitionActivity;
import com.bpjstku.util.constant.AsikPointer;
import com.bpjstku.util.custom.CircleImageView;
import com.bpjstku.util.enums.BpjsServiceEnum;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.access000;
import defpackage.getEventTime;
import defpackage.getRatioByPercentage;
import defpackage.mapPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\r\u0010\u0016R\u0015\u0010\r\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0015\u0010\u001b\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0015\u0010\u0014\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u001f\u0010 R.\u0010%\u001a\u001c\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010$R\u001a\u0010&\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b&\u0010'R\u0015\u0010)\u001a\u00020(8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0017\u0010\b\u001a\u0004\u0018\u00010\u000f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0017\u0010\u001d\u001a\u0004\u0018\u00010*8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0015\u0010\u001a\u001a\u00020+8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010\u0018"}, d2 = {"LcloseMode;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentPelaporHomeBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "INotificationSideChannel", "cancel", "", "Lcom/bpjstku/presentation/program/model/ProgramInfo;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Ljava/util/List;", "Lcom/bpjstku/domain/user/model/User;", "p0", "", "p1", "", "b", "(Lcom/bpjstku/domain/user/model/User;Ljava/lang/String;)Z", "(Ljava/lang/String;)V", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "Laccess000;", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetRatioByPercentage;", "a", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentbindingInflater1", "asBinder", "()I", "LsetActionBarHideOffset;", "asInterface", "LsetCurrentRunnable;", "LgetCaptureResult;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class closeMode extends AutoValue_CameraState_StateError<FragmentPelaporHomeBinding> {
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 4;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int asBinder = R.layout.fragment_pelapor_home;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: initTitle
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return closeMode.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: generateDefaultLayoutParams
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: setTitleOptional
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((access000) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: killMode
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return closeMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
    }

    public closeMode() {
        final closeMode closemode = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.main.home.PelaporHomeFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = closemode;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<access000>() { // from class: com.bpjstku.presentation.main.home.PelaporHomeFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [access000, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final access000 invoke() {
                ComponentCallbacks componentCallbacks = closemode;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(access000.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0<getRatioByPercentage>() { // from class: com.bpjstku.presentation.main.home.PelaporHomeFragment$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getRatioByPercentage, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getRatioByPercentage invoke() {
                ComponentCallbacks componentCallbacks = closemode;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getRatioByPercentage.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentPelaporHomeBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return PelaporHomeFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getCancel() {
        return this.asBinder;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        onNestedPreScroll.Companion companion = onNestedPreScroll.INSTANCE;
        onNestedPreScroll onnestedprescrollTuitionPaymentFragmentbindingInflater1 = onNestedPreScroll.Companion.TuitionPaymentFragmentbindingInflater1(p0, new Function0() { // from class: applyInsets
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function0() { // from class: ActionBarContextView
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(onnestedprescrollTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            onnestedprescrollTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, onnestedprescrollTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends RecyclerView.ItemDecoration {
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 13;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view) + 1;
            rect.bottom = (int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * Resources.getSystem().getDisplayMetrics().density);
            int i = childAdapterPosition % this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
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

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(closeMode closemode, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            CircleImageView circleImageView = closemode.asInterface().civProfile;
            Intrinsics.checkNotNullExpressionValue(circleImageView, "");
            Context contextRequireContext = closemode.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Bitmap bitmap = (Bitmap) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Drawable drawable = closemode.getResources().getDrawable(R.drawable.ic_placeholder);
            Intrinsics.checkNotNullExpressionValue(drawable, "");
            Drawable drawable2 = closemode.getResources().getDrawable(R.drawable.ic_placeholder);
            Intrinsics.checkNotNullExpressionValue(drawable2, "");
            lambdacreateCameraSelectorById0.b(circleImageView, contextRequireContext, bitmap, drawable, drawable2);
        }
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.SCHOLARSHIP.getType());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(closeMode closemode, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            closemode.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            closemode.write();
            ScholarPerson scholarPerson = (ScholarPerson) CollectionsKt.firstOrNull((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (scholarPerson != null) {
                ((getRatioByPercentage) closemode.b.getValue()).b.setValue(scholarPerson);
                getRatioByPercentage getratiobypercentage = (getRatioByPercentage) closemode.b.getValue();
                User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) closemode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str = userAsBinder != null ? userAsBinder.b : null;
                String str2 = str == null ? "" : str;
                User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) closemode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str3 = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                String str4 = str3 == null ? "" : str3;
                String str5 = scholarPerson.b;
                String str6 = str5 == null ? "" : str5;
                String str7 = scholarPerson.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                User userAsBinder3 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) closemode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str8 = userAsBinder3 != null ? userAsBinder3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                getratiobypercentage.TuitionPaymentFragmentbindingInflater1(new ScholarshipBenefitRequest(str2, str4, str6, str7, str8 == null ? "" : str8));
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            closemode.write();
            getCameraState.Companion companion = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = closemode.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
            FragmentManager childFragmentManager = closemode.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(closeMode closemode, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            closemode.IconCompatParcelizer();
        } else {
            List<ScholarPersonDetail> listEmptyList = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                if (Intrinsics.areEqual(((ScholarshipEligibleResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatusCode(), "203")) {
                    closemode.write();
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String strReplace$default = StringsKt.replace$default(((ScholarshipEligibleResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage(), "\t", "", false, 4, (Object) null);
                    String string = closemode.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "Mohon maaf konfirmasi tidak dapat dilanjutkan", strReplace$default, string, null, 112);
                    FragmentManager childFragmentManager = closemode.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    List<ScholarshipBenefitPerson> choosenScholarDetail = ((ScholarshipEligibleResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getChoosenScholarDetail();
                    if (choosenScholarDetail != null) {
                        String signature = ((ScholarshipEligibleResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature();
                        if (signature == null) {
                            signature = "";
                        }
                        listEmptyList = LocalOnBackPressedDispatcherOwnerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(choosenScholarDetail, signature);
                    }
                    getRatioByPercentage getratiobypercentage = (getRatioByPercentage) closemode.b.getValue();
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    Intrinsics.checkNotNullParameter(listEmptyList, "");
                    getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listEmptyList);
                    getRatioByPercentage getratiobypercentage2 = (getRatioByPercentage) closemode.b.getValue();
                    getratiobypercentage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ScholarshipEligibleResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    closemode.write();
                    closemode.startActivity(new Intent(closemode.requireActivity(), (Class<?>) ScholarshipGranteeActivity.class));
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                closemode.write();
                closeMode closemode2 = closemode;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(closemode2, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity = (BaseActivity) closemode2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(closeMode closemode, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            closemode.IconCompatParcelizer();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                closemode.write();
                ScholarPersonDetail scholarPersonDetail = (ScholarPersonDetail) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (scholarPersonDetail != null) {
                    ((getRatioByPercentage) closemode.b.getValue()).TuitionPaymentFragmentbindingInflater1.setValue(scholarPersonDetail);
                    getRatioByPercentage getratiobypercentage = (getRatioByPercentage) closemode.b.getValue();
                    User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) closemode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ScholarshipEligibleRequest(str != null ? str : "", null, 2, null));
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                closemode.write();
                getCameraState.Companion companion = getCameraState.INSTANCE;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string = closemode.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
                FragmentManager childFragmentManager = closemode.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.JP_PERIODICALLY.getType());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(closeMode closemode, r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        String str;
        AvailabilityMenuItem availabilityMenuItem;
        List<AvailabilityMenuItem> list;
        Object next;
        AvailabilityMenuItem availabilityMenuItem2;
        List<AvailabilityMenuItem> list2;
        Object next2;
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        String str2 = r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (Intrinsics.areEqual(str2, BpjsServiceEnum.ECARD.getType())) {
            DigitalCardActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = DigitalCardActivity.INSTANCE;
            Context contextRequireContext = closemode.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            DigitalCardActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext);
            str = "view_menu_digital_card";
        } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.PROMO.getType())) {
            PromoActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = PromoActivity.INSTANCE;
            Context contextRequireContext2 = closemode.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            PromoActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext2);
            str = "view_menu_promo";
        } else {
            if (Intrinsics.areEqual(str2, BpjsServiceEnum.TUITION.getType())) {
                setCurrentRunnable setcurrentrunnable = (setCurrentRunnable) closemode.a.getValue();
                if (setcurrentrunnable == null || (list2 = setcurrentrunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    availabilityMenuItem2 = null;
                } else {
                    Iterator<T> it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!Intrinsics.areEqual(((AvailabilityMenuItem) next2).getMenuCode(), "JM006"));
                    availabilityMenuItem2 = (AvailabilityMenuItem) next2;
                }
                if (Intrinsics.areEqual(availabilityMenuItem2 != null ? availabilityMenuItem2.getActive() : null, "Y")) {
                    TuitionActivity.Companion tuitionPaymentFragmentbindingInflater1 = TuitionActivity.INSTANCE;
                    Context contextRequireContext3 = closemode.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                    TuitionActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext3);
                } else {
                    if (Intrinsics.areEqual(availabilityMenuItem2 != null ? availabilityMenuItem2.getImageUrl() : null, "")) {
                        closeMode closemode2 = closemode;
                        String string = availabilityMenuItem2.getInformationMessage().toString();
                        Intrinsics.checkNotNullParameter(closemode2, "");
                        Intrinsics.checkNotNullParameter(string, "");
                        BaseActivity baseActivity = (BaseActivity) closemode2.getContext();
                        if (baseActivity != null) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string, null);
                        }
                    } else {
                        closemode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(availabilityMenuItem2 != null ? availabilityMenuItem2.getImageUrl() : null));
                    }
                }
                str = "view_menu_tuition";
            } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.PARTNER.getType())) {
                PartnerActivity.Companion companion = PartnerActivity.INSTANCE;
                Context contextRequireContext4 = closemode.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                PartnerActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext4, "DKI Jakarta", "Jakarta Barat");
                str = "view_menu_partner";
            } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.PROGRAM_INFO.getType())) {
                ProgramActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = ProgramActivity.INSTANCE;
                Context contextRequireContext5 = closemode.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
                List<ProgramInfo> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = closemode.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Intrinsics.checkNotNull(listTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                ProgramActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext5, (ArrayList) listTuitionPaymentFragmentspecialinlinedviewModeldefault1, ProgramActivity.ProgramDetailType.OPEN_PROGRAM_INFO);
                str = "view_menu_info_program";
            } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.REPORTING.getType())) {
                ChooseReportingActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = ChooseReportingActivity.INSTANCE;
                Context contextRequireContext6 = closemode.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
                ChooseReportingActivity.Companion.b(contextRequireContext6);
                str = "view_menu_reporting";
            } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.BRANCH_OFFICE.getType())) {
                Context contextRequireContext7 = closemode.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "");
                Intrinsics.checkNotNullParameter(contextRequireContext7, "");
                ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
                if (ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    BranchOfficeActivity.Companion companion2 = BranchOfficeActivity.INSTANCE;
                    Context contextRequireContext8 = closemode.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext8, "");
                    BranchOfficeActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext8, null);
                } else {
                    closeMode closemode3 = closemode;
                    String string2 = closemode.getString(R.string.error_message_location_gps_disabled);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    Intrinsics.checkNotNullParameter(closemode3, "");
                    Intrinsics.checkNotNullParameter(string2, "");
                    BaseActivity baseActivity2 = (BaseActivity) closemode3.getContext();
                    if (baseActivity2 != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, string2, null);
                    }
                }
                str = "view_menu_branch_office";
            } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.COMPLAINT.getType())) {
                ChooseComplaintActivity.Companion bVar = ChooseComplaintActivity.INSTANCE;
                Context contextRequireContext9 = closemode.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext9, "");
                ChooseComplaintActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext9);
                str = "view_menu_complaint";
            } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.HEREGISTRATION.getType())) {
                setCurrentRunnable setcurrentrunnable2 = (setCurrentRunnable) closemode.a.getValue();
                if (setcurrentrunnable2 == null || (list = setcurrentrunnable2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    availabilityMenuItem = null;
                } else {
                    Iterator<T> it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.areEqual(((AvailabilityMenuItem) next).getMenuCode(), "JM002"));
                    availabilityMenuItem = (AvailabilityMenuItem) next;
                }
                if (Intrinsics.areEqual(availabilityMenuItem != null ? availabilityMenuItem.getActive() : null, "Y")) {
                    AsikActiveParticipantSubmissionCheckActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault5 = AsikActiveParticipantSubmissionCheckActivity.INSTANCE;
                    Context contextRequireContext10 = closemode.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext10, "");
                    AsikActiveParticipantSubmissionCheckActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext10, AsikPointer.MENU.getType());
                } else {
                    if (Intrinsics.areEqual(availabilityMenuItem != null ? availabilityMenuItem.getImageUrl() : null, "")) {
                        closeMode closemode4 = closemode;
                        String string3 = availabilityMenuItem.getInformationMessage().toString();
                        Intrinsics.checkNotNullParameter(closemode4, "");
                        Intrinsics.checkNotNullParameter(string3, "");
                        BaseActivity baseActivity3 = (BaseActivity) closemode4.getContext();
                        if (baseActivity3 != null) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity3, string3, null);
                        }
                    } else {
                        closemode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(availabilityMenuItem != null ? availabilityMenuItem.getImageUrl() : null));
                    }
                }
                str = "view_menu_heregistration_pengkinian";
            } else {
                if (Intrinsics.areEqual(str2, BpjsServiceEnum.SYARIAH.getType())) {
                    SyariahChooseCardMembershipActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault6 = SyariahChooseCardMembershipActivity.INSTANCE;
                    Context contextRequireContext11 = closemode.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext11, "");
                    SyariahChooseCardMembershipActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext11);
                } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.SUPPORT.getType())) {
                    SupportActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault7 = SupportActivity.INSTANCE;
                    Context contextRequireContext12 = closemode.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext12, "");
                    SupportActivity.Companion.b(contextRequireContext12);
                } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.JP_PERIODICALLY.getType())) {
                    JpnPeriodicCheckEligibleActivity.Companion bVar2 = JpnPeriodicCheckEligibleActivity.INSTANCE;
                    Context contextRequireContext13 = closemode.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext13, "");
                    JpnPeriodicCheckEligibleActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext13);
                } else if (Intrinsics.areEqual(str2, BpjsServiceEnum.SCHOLARSHIP.getType())) {
                    getRatioByPercentage getratiobypercentage = (getRatioByPercentage) closemode.b.getValue();
                    User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) closemode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    String str3 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ScholarshipEligibleRequest(str3, null, 2, null));
                }
                str = "";
            }
        }
        FragmentActivity activity = closemode.getActivity();
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

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.JP_PERIODICALLY.getType());
    }

    public static /* synthetic */ boolean b(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.SCHOLARSHIP.getType());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(closeMode closemode, ProgramInfo programInfo) {
        Intrinsics.checkNotNullParameter(programInfo, "");
        String str = programInfo.b;
        int iHashCode = str.hashCode();
        if (iHashCode != 73430) {
            if (iHashCode != 73514) {
                if (iHashCode == 73516 && str.equals("JKM")) {
                    JkmServiceActivity.Companion tuitionPaymentFragmentbindingInflater1 = JkmServiceActivity.INSTANCE;
                    Context contextRequireContext = closemode.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    JkmServiceActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext);
                } else {
                    JpnMainActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = JpnMainActivity.INSTANCE;
                    Context contextRequireContext2 = closemode.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    JpnMainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext2);
                }
            } else if (str.equals("JKK")) {
                JkkServiceActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = JkkServiceActivity.INSTANCE;
                Context contextRequireContext3 = closemode.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                JkkServiceActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext3);
            } else {
                JpnMainActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = JpnMainActivity.INSTANCE;
                Context contextRequireContext4 = closemode.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                JpnMainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext4);
            }
        } else if (str.equals("JHT")) {
            OldDaySecurityActivity.Companion companion = OldDaySecurityActivity.INSTANCE;
            Context contextRequireContext5 = closemode.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
            OldDaySecurityActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext5);
        } else {
            JpnMainActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = JpnMainActivity.INSTANCE;
            Context contextRequireContext6 = closemode.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
            JpnMainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext6);
        }
        return Unit.INSTANCE;
    }

    private static boolean b(User p0, String p1) {
        List<FiturList> list;
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 != null && (list = p0.getInterfaceDescriptor) != null) {
            List<FiturList> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((FiturList) it.next()).getKodeFitur(), p1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ setActionBarHideOffset TuitionPaymentFragmentbindingInflater1(final closeMode closemode) {
        Context contextRequireContext = closemode.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        boolean zOnConnectionFailed = getMaxImages.onConnectionFailed();
        User user = (User) closemode.g.getValue();
        Intrinsics.areEqual(String.valueOf(user != null ? user.RemoteActionCompatParcelizer : null), "Y");
        User user2 = (User) closemode.g.getValue();
        Intrinsics.areEqual(String.valueOf(user2 != null ? user2.INotificationSideChannelStubProxy : null), "Y");
        boolean zB = b((User) closemode.g.getValue(), "F001");
        boolean zB2 = b((User) closemode.g.getValue(), "F002");
        String type = BpjsServiceEnum.JP_PERIODICALLY.getType();
        String string = closemode.getString(R.string.label_jp_periodically);
        Intrinsics.checkNotNullExpressionValue(string, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type, string, R.drawable.ic_vocation);
        String type2 = BpjsServiceEnum.SCHOLARSHIP.getType();
        String string2 = closemode.getString(R.string.label_scholarship);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs5 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type2, string2, R.drawable.ic_scholarship);
        String type3 = BpjsServiceEnum.BRANCH_OFFICE.getType();
        String string3 = closemode.getString(R.string.label_branch_office);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs6 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type3, string3, R.drawable.ic_branch_office);
        String type4 = BpjsServiceEnum.PROGRAM_INFO.getType();
        String string4 = closemode.getString(R.string.label_program_info);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs7 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type4, string4, R.drawable.ic_program_info);
        String type5 = BpjsServiceEnum.SUPPORT.getType();
        String string5 = closemode.getString(R.string.label_support);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        List listMutableListOf = CollectionsKt.mutableListOf(r8lambdai2xi7mochmmaz9qzzewheaxs4, r8lambdai2xi7mochmmaz9qzzewheaxs5, r8lambdai2xi7mochmmaz9qzzewheaxs6, r8lambdai2xi7mochmmaz9qzzewheaxs7, new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type5, string5, R.drawable.ic_support));
        if (!zOnConnectionFailed || !zB || !zB2) {
            if (zOnConnectionFailed && !zB && zB2) {
                final Function1 function1 = new Function1() { // from class: fitSystemWindows
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(closeMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: postRemoveActionBarHideOffset
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) function1.invoke(obj)).booleanValue();
                    }
                });
            } else if (zOnConnectionFailed && zB && !zB2) {
                final Function1 function2 = new Function1() { // from class: shouldHideActionBarOnFling
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(closeMode.b((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: removeActionBarHideOffset
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) function2.invoke(obj)).booleanValue();
                    }
                });
            } else {
                final Function1 function3 = new Function1() { // from class: getNestedScrollAxes
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(closeMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: isInOverlayMode
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) function3.invoke(obj)).booleanValue();
                    }
                });
                final Function1 function4 = new Function1() { // from class: generateLayoutParams
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(closeMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: shouldDelayChildPressedState
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) function4.invoke(obj)).booleanValue();
                    }
                });
            }
        }
        return new setActionBarHideOffset(contextRequireContext, listMutableListOf, new Function1() { // from class: postAddActionBarHideOffset
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return closeMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj);
            }
        });
    }

    private final List<ProgramInfo> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        List<ProgramInfo> listEmptyList = userAsBinder != null ? userAsBinder.INotificationSideChannelStub : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return Camera2CameraControlExternalSyntheticLambda6.TuitionPaymentFragmentbindingInflater1(listEmptyList);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        closeMode closemode = this;
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(closemode, new Observer() { // from class: initForMode
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                closeMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((access000) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(closemode, new Observer() { // from class: ActionBarContextView1
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                closeMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((getRatioByPercentage) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(getViewLifecycleOwner(), new b(new Function1() { // from class: ActionBarOverlayLayout
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return closeMode.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getRatioByPercentage) this.b.getValue()).asBinder.observe(closemode, new b(new Function1() { // from class: addActionBarHideOffset
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return closeMode.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getRatioByPercentage) this.b.getValue()).g.observe(closemode, new b(new Function1() { // from class: decorFitsSystemWindows
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return closeMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() throws Throwable {
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            String str = userAsBinder.TuitionPaymentFragmentbindingInflater1;
            if (str != null) {
                if (str.length() > 0) {
                    CircleImageView circleImageView = asInterface().civProfile;
                    Intrinsics.checkNotNullExpressionValue(circleImageView, "");
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    Drawable drawable = getResources().getDrawable(R.drawable.ic_placeholder);
                    Intrinsics.checkNotNullExpressionValue(drawable, "");
                    Drawable drawable2 = getResources().getDrawable(R.drawable.ic_placeholder);
                    Intrinsics.checkNotNullExpressionValue(drawable2, "");
                    lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(circleImageView, contextRequireContext, str, drawable, drawable2);
                    String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (str2 != null) {
                        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, str);
                    }
                }
            } else {
                asInterface().civProfile.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.ic_placeholder));
            }
            asInterface().tvNamesWorker.setText(String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        }
        RecyclerView recyclerView = asInterface().rvServices;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        recyclerView.addItemDecoration(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        recyclerView.setAdapter((setActionBarHideOffset) this.asInterface.getValue());
        requireActivity().findViewById(R.id.layoutMainToolbar).setVisibility(0);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        ((access000) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static /* synthetic */ getCaptureResult TuitionPaymentFragmentspecialinlinedviewModeldefault3(final closeMode closemode) {
        Context contextRequireContext = closemode.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new getCaptureResult(contextRequireContext, CollectionsKt.take(closemode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2), new Function1() { // from class: checkLayoutParams
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return closeMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ProgramInfo) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(closeMode closemode, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            closemode.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            closemode.write();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            closemode.write();
            closeMode closemode2 = closemode;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(closemode2, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity = (BaseActivity) closemode2.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
            }
        }
    }
}
