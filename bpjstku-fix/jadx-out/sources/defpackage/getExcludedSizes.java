package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.vocation.model.request.VocationTrainingRequest;
import com.bpjstku.databinding.FragmentVocationalChooseTrainingBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.vocation.model.Training;
import com.bpjstku.domain.vocation.model.TrainingField;
import com.bpjstku.presentation.vocational.VocationalChooseTrainingFragment$bindingInflater$1;
import com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity;
import com.bpjstku.presentation.vocational.model.VocationRegistrationStep;
import com.bpjstku.presentation.vocational.model.VocationalRegistration;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\u0005J/\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0005R\u0015\u0010\u0018\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0012\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R*\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0017@\u0017X\u0097\f¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010\u0016\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R.\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00020$8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010("}, d2 = {"LgetExcludedSizes;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentVocationalChooseTrainingBinding;", "Llambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener;", "<init>", "()V", "", "cancelAll", "b_", "onTransact", "cancel", "g", "INotificationSideChannel", "", "Lcom/bpjstku/domain/vocation/model/Training;", "p0", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/util/List;)Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "a", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/List;", "LgetCorrectedPoint;", "Lkotlin/Function2;", "Lcom/bpjstku/presentation/vocational/model/VocationRegistrationStep;", "Lkotlin/jvm/functions/Function2;", "", "asBinder", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getExcludedSizes extends AutoValue_CameraState_StateError<FragmentVocationalChooseTrainingBinding> implements lambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public Function2<? super VocationRegistrationStep, ? super VocationalRegistration, Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private List<Training> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: ExtraCroppingQuirk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return getExcludedSizes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: isSamsungDistortion
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return getExcludedSizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return R.layout.fragment_vocational_choose_training;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public getExcludedSizes() {
        final getExcludedSizes getexcludedsizes = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.VocationalChooseTrainingFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = getexcludedsizes;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreviewDelayWhenVideoCaptureIsBoundQuirk.class);
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

    /* JADX INFO: renamed from: getExcludedSizes$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LgetExcludedSizes$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "p0", "LgetExcludedSizes;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;)LgetExcludedSizes;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getExcludedSizes TuitionPaymentFragmentbindingInflater1(VocationalRegistration p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getExcludedSizes getexcludedsizes = new getExcludedSizes();
            Bundle bundle = new Bundle();
            bundle.putParcelable("vocation_registration_data", p0);
            getexcludedsizes.setArguments(bundle);
            return getexcludedsizes;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentVocationalChooseTrainingBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return VocationalChooseTrainingFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        RecyclerView recyclerView = asInterface().rvVocationalTraining;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter((getCorrectedPoint) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        VocationalRegistration vocationalRegistration = (VocationalRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (vocationalRegistration != null) {
            TextView textView = asInterface().tvTrainingRegion;
            CodeNamePair codeNamePair = vocationalRegistration.INotificationSideChannelStub;
            textView.setText(codeNamePair != null ? codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
            TextView textView2 = asInterface().tvTrainingField;
            TrainingField trainingField = vocationalRegistration.connect;
            textView2.setText(trainingField != null ? trainingField.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        }
    }

    private static Map<String, List<Training>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<Training> p0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : p0) {
            String str = ((Training) obj).INotificationSideChannel;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getExcludedSizes getexcludedsizes, Training training) {
        Intrinsics.checkNotNullParameter(training, "");
        VocationalRegistration vocationalRegistration = (VocationalRegistration) getexcludedsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (vocationalRegistration != null) {
            VocationalTrainingDetailActivity.Companion tuitionPaymentFragmentbindingInflater1 = VocationalTrainingDetailActivity.INSTANCE;
            Context contextRequireContext = getexcludedsizes.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            VocationalTrainingDetailActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, training, vocationalRegistration);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(getExcludedSizes getexcludedsizes, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getexcludedsizes.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            getexcludedsizes.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            getexcludedsizes.b = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Map<String, List<Training>> mapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1((List<Training>) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            getCorrectedPoint getcorrectedpoint = (getCorrectedPoint) getexcludedsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            getcorrectedpoint.d.clear();
            getcorrectedpoint.notifyDataSetChanged();
            ((getCorrectedPoint) getexcludedsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapsKt.toList(mapTuitionPaymentFragmentspecialinlinedviewModeldefault1));
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getexcludedsizes.write();
            Context contextRequireContext = getexcludedsizes.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = getexcludedsizes.getString(R.string.message_no_trainings_available);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(contextRequireContext, string);
        }
    }

    public static /* synthetic */ VocationalRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(getExcludedSizes getexcludedsizes) {
        Bundle arguments = getexcludedsizes.getArguments();
        if (arguments != null) {
            return (VocationalRegistration) arguments.getParcelable("vocation_registration_data");
        }
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getExcludedSizes getexcludedsizes, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        PreviewPixelHDRnet.Companion tuitionPaymentFragmentbindingInflater1 = PreviewPixelHDRnet.INSTANCE;
        PreviewPixelHDRnet previewPixelHDRnetB = PreviewPixelHDRnet.Companion.b(codeNamePair.b);
        FragmentManager childFragmentManager = getexcludedsizes.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(previewPixelHDRnetB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            previewPixelHDRnetB.show(childFragmentManager, previewPixelHDRnetB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getCorrectedPoint TuitionPaymentFragmentspecialinlinedviewModeldefault1(final getExcludedSizes getexcludedsizes) {
        Context contextRequireContext = getexcludedsizes.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new getCorrectedPoint(contextRequireContext, null, new Function1() { // from class: ExtraCroppingQuirk1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getExcludedSizes.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Training) obj);
            }
        }, new Function1() { // from class: ExtraSupportedOutputSizeQuirk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getExcludedSizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (CodeNamePair) obj);
            }
        }, 2, null);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getExcludedSizes getexcludedsizes, String str) {
        String strValueOf = String.valueOf(str);
        List<Training> list = null;
        if (strValueOf.length() == 0) {
            List<Training> list2 = getexcludedsizes.b;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                list = list2;
            }
            Map<String, List<Training>> mapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(list);
            getCorrectedPoint getcorrectedpoint = (getCorrectedPoint) getexcludedsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            getcorrectedpoint.d.clear();
            getcorrectedpoint.notifyDataSetChanged();
            ((getCorrectedPoint) getexcludedsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapsKt.toList(mapTuitionPaymentFragmentspecialinlinedviewModeldefault1));
        } else {
            List<Training> list3 = getexcludedsizes.b;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                list = list3;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.contains((CharSequence) ((Training) obj).toString(), (CharSequence) strValueOf, true)) {
                    arrayList.add(obj);
                }
            }
            Map<String, List<Training>> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList);
            getCorrectedPoint getcorrectedpoint2 = (getCorrectedPoint) getexcludedsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            getcorrectedpoint2.d.clear();
            getcorrectedpoint2.notifyDataSetChanged();
            ((getCorrectedPoint) getexcludedsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapsKt.toList(mapTuitionPaymentFragmentspecialinlinedviewModeldefault2));
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asInterface.observe(getViewLifecycleOwner(), new isOnePlus6T(this));
        SearchView searchView = asInterface().svTraining;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: isSamsungJ7Api27Above
            private static final byte[] $$c = {119, -102, -34, -3};
            private static final int $$f = 100;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {93, -122, -23, -24, -8, -25, 39, -51, -13, -14, 4, 21, -57, -9, -11, -7, 3, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 57};
            private static final int $$e = 132;
            private static final byte[] $$a = {106, -22, 107, 95, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 137;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static int TuitionPaymentFragmentbindingInflater1 = -83722414;

            /* JADX WARN: Code duplicated, block: B:10:0x002b  */
            /* JADX WARN: Code duplicated, block: B:8:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r7, byte r8, short r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 15
                    int r7 = r7 + 38
                    byte[] r0 = defpackage.isSamsungJ7Api27Above.$$a
                    int r8 = r8 * 52
                    int r8 = 107 - r8
                    int r9 = r9 * 2
                    int r9 = r9 + 84
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L30
                L16:
                    r3 = r2
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L1a:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    int r9 = r9 + 1
                    if (r4 != r7) goto L2b
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L2b:
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L30:
                    int r9 = -r9
                    int r8 = r8 + r9
                    int r8 = r8 + (-11)
                    r9 = r3
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.isSamsungJ7Api27Above.a(int, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 19
                    int r7 = 103 - r7
                    int r8 = r8 * 39
                    int r0 = 53 - r8
                    byte[] r1 = defpackage.isSamsungJ7Api27Above.$$d
                    int r6 = r6 * 13
                    int r6 = 16 - r6
                    byte[] r0 = new byte[r0]
                    int r8 = 52 - r8
                    r2 = 0
                    if (r1 != 0) goto L19
                    r3 = r7
                    r4 = r2
                    r7 = r6
                    goto L32
                L19:
                    r3 = r2
                L1a:
                    int r6 = r6 + 1
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r8) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L29:
                    int r3 = r3 + 1
                    r4 = r1[r6]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L32:
                    int r6 = -r6
                    int r3 = r3 + r6
                    int r6 = r3 + (-10)
                    r3 = r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.isSamsungJ7Api27Above.d(int, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:36:0x016c  */
            /* JADX WARN: Code duplicated, block: B:37:0x016d  */
            private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4;
                long j;
                Throwable cause;
                int i5 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (true) {
                    i4 = 29209604;
                    j = 0;
                    if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                        break;
                    }
                    int i6 = $11 + 99;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 1;
                            byte b2 = (byte) (b - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionType(0L) + 3291, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        try {
                            Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 651 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 44, -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i3 > 0) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 651, 44 - (KeyEvent.getMaxKeyCode() >> 16), -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i9 = $11 + 67;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        i4 = 29209604;
                        j = 0;
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cGreen = (char) Color.green(0);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267;
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 33;
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[5], bArr[40], bArr[7], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, scrollBarFadeDuration, iIndexOf, -887667012, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(true, 147 - ExpandableListView.getPackedPositionGroup(0L), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, Color.red(0) + 20, new char[]{'\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(false, AndroidCharacter.getMirror('0') + 'g', (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int edgeSlop = 2267 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int iIndexOf2 = TextUtils.indexOf("", "") + 33;
                    byte[] bArr2 = $$a;
                    byte b = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b, b, bArr2[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, edgeSlop, iIndexOf2, -874156483, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int iResolveSize = 2267 - View.resolveSize(0, 0);
                        int maximumFlingVelocity = 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr6 = new Object[1];
                        a(b2, b3, b3, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, iResolveSize, maximumFlingVelocity, -654680577, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i2 = ((int[]) objArr7[0])[0];
                    int i3 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[1];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i4 = (((-1153688157) + (((~((-384694960) | iIdentityHashCode)) | 272892068) * 576)) + (((~((~iIdentityHashCode) | (-111802892))) | 151126288) * 576)) - 1882136758;
                    int i5 = (i4 << 13) ^ i4;
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(true, 147 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 26 - (ViewConfiguration.getTapTimeout() >> 16), 4 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f'}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(false, 154 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 18, 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                            int i8 = i7 % 2;
                            applicationContext = null;
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(false, Color.alpha(0) + 146, TextUtils.getTrimmedLength("") + 16, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5, new char[]{17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(true, 151 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 16, View.getDefaultSize(0, 0) + 4, new char[]{'\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14}, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -154177974};
                        byte[] bArr3 = $$d;
                        byte b4 = bArr3[20];
                        byte b5 = b4;
                        Object[] objArr13 = new Object[1];
                        d(b5, (byte) (b5 - 1), b4, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b6 = bArr3[20];
                        byte b7 = (byte) (b6 - 1);
                        byte b8 = b6;
                        Object[] objArr14 = new Object[1];
                        d(b7, b8, (byte) (b8 - 1), objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                            int i10 = i9 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cBlue = (char) Color.blue(0);
                                int i11 = 2268 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int i12 = 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr15 = new Object[1];
                                a(b9, b10, b10, objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, i11, i12, -654680577, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr16 = new Object[1];
                                c(true, Drawable.resolveOpacity(0, 0) + 147, 22 - Color.red(0), Drawable.resolveOpacity(0, 0) + 20, new char[]{'\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0}, objArr16);
                                Class<?> cls5 = Class.forName((String) objArr16[0]);
                                Object[] objArr17 = new Object[1];
                                c(false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 150, View.getDefaultSize(0, 0) + 15, (ViewConfiguration.getScrollBarSize() >> 8) + 13, new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, objArr17);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                    int i13 = 2267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int absoluteGravity = 33 - Gravity.getAbsoluteGravity(0, 0);
                                    byte[] bArr4 = $$a;
                                    byte b11 = bArr4[5];
                                    Object[] objArr18 = new Object[1];
                                    a(b11, b11, bArr4[7], objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, i13, absoluteGravity, -874156483, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                    int i14 = 2268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int threadPriority = 33 - ((Process.getThreadPriority(0) + 20) >> 6);
                                    byte[] bArr5 = $$a;
                                    Object[] objArr19 = new Object[1];
                                    a(bArr5[5], bArr5[40], bArr5[7], objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, i14, threadPriority, -887667012, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[0])[0] != ((int[]) objArr[3])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) objArr[1];
                    if (strArr2 == null) {
                        throw null;
                    }
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                    int i16 = i15 % 2;
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                    throw null;
                }
                Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i17 = ((int[]) objArr[2])[0];
                int i18 = ((int[]) objArr[0])[0];
                int i19 = ((int[]) objArr[3])[0];
                String[] strArr3 = (String[]) objArr[1];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i20 = ~startElapsedRealtime;
                int i21 = i17 + (-1056474793) + (((~(startElapsedRealtime | 670716411)) | (~((-3670121) | i20)) | (-805043196)) * (-68)) + ((~((-134326785) | i20)) * (-68)) + (((~((-670716412) | i20)) | (-137996905)) * 68);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr20[2])[0] = i23 ^ (i23 << 5);
                int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                int i25 = i24 % 2;
                return getExcludedSizes.TuitionPaymentFragmentbindingInflater1(this.b, (String) obj);
            }

            private static String $$g(byte b, byte b2, byte b3) {
                int i = b2 * 4;
                int i2 = 3 - (b3 * 4);
                int i3 = b + 119;
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[i + 1];
                int i4 = -1;
                if (bArr == null) {
                    i3 = (-i3) + i2;
                    i4 = -1;
                }
                while (true) {
                    int i5 = i2;
                    int i6 = i3;
                    int i7 = i4 + 1;
                    bArr2[i7] = (byte) i6;
                    if (i7 == i) {
                        return new String(bArr2, 0);
                    }
                    int i8 = i5 + 1;
                    i2 = i8;
                    i3 = (-bArr[i8]) + i6;
                    i4 = i7;
                }
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asInterface.observe(getViewLifecycleOwner(), new isOnePlus6T(this));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        final PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        VocationTrainingRequest vocationTrainingRequest = new VocationTrainingRequest("3174", null, null, 6, null);
        Intrinsics.checkNotNullParameter(vocationTrainingRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<Training>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer.TuitionPaymentFragmentbindingInflater1(vocationTrainingRequest)));
        final Function1 function1 = new Function1() { // from class: isPixel8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault1(previewDelayWhenVideoCaptureIsBoundQuirk, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: UseTorchAsFlashQuirk
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: isFlashModeTorchRequired
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault1(previewDelayWhenVideoCaptureIsBoundQuirk, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: TorchIsClosedAfterImageCapturingQuirk
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.lambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener
    public final void TuitionPaymentFragmentbindingInflater1() {
        Function2<? super VocationRegistrationStep, ? super VocationalRegistration, Unit> function2 = this.TuitionPaymentFragmentbindingInflater1;
        if (function2 != null) {
            VocationRegistrationStep vocationRegistrationStep = VocationRegistrationStep.STEP_2;
            VocationalRegistration vocationalRegistration = (VocationalRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            if (vocationalRegistration == null) {
                vocationalRegistration = new VocationalRegistration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
            }
            function2.invoke(vocationRegistrationStep, vocationalRegistration);
        }
    }
}
