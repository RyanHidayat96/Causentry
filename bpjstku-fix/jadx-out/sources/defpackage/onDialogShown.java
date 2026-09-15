package defpackage;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.domain.branchoffice.model.RegionalOffice;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.BranchOfficeBottomSheetDialogFragment$handleItemClicked$1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.drawSelectorCompat;
import defpackage.getEventTime;
import defpackage.mapPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003J%\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00132\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00130\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR0\u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0015\u0010\u0012\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0015\u0010$\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010\"R\u001a\u0010\u0011\u001a\u00020%8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b\u001f\u0010'R\u0016\u0010\u001b\u001a\u00020(8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0012\u0010)"}, d2 = {"LonDialogShown;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Lcom/bpjstku/domain/branchoffice/model/Office;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;)V", "", "asBinder", "Ljava/util/List;", "asInterface", "Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Lkotlin/Function2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function2;", "LdrawSelectorCompat;", "Lkotlin/Lazy;", "LsetSubtitleTextAppearance;", "a", "", "I", "()I", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onDialogShown extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;
    private Function2<? super RegionalOffice, ? super lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office>, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private RegionalOffice TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding asInterface;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private List<RegionalOffice> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = CollectionsKt.emptyList();
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: setDialogShownListenter
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return onDialogShown.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int d = R.layout.fragment_general_list_bottom_sheet;

    public onDialogShown() {
        final onDialogShown ondialogshown = this;
        this.b = LazyKt.lazy(new Function0<drawSelectorCompat>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.BranchOfficeBottomSheetDialogFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [drawSelectorCompat, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final drawSelectorCompat invoke() {
                ComponentCallbacks componentCallbacks = ondialogshown;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(drawSelectorCompat.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(p0, p1, false);
        this.asInterface = fragmentGeneralListBottomSheetBindingInflate;
        if (fragmentGeneralListBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBindingInflate = null;
        }
        LinearLayout root = fragmentGeneralListBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentbindingInflater1 = arguments != null ? (RegionalOffice) arguments.getParcelable("regional_office") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: parseBrowserActionItems
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    onDialogShown.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            });
        }
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.asInterface;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: setCustomItems
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onDialogShown.b(this.b, (String) obj);
            }
        });
    }

    private final void TuitionPaymentFragmentbindingInflater1(RegionalOffice p0, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office> p1) {
        this.TuitionPaymentFragmentbindingInflater1 = p0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p1;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new BranchOfficeBottomSheetDialogFragment$handleItemClicked$1(this, p0, p1, null), 3, null);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final onDialogShown ondialogshown, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = ondialogshown.asInterface;
            if (fragmentGeneralListBottomSheetBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding2;
            }
            MultiStateView multiStateView = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = ondialogshown.asInterface;
            if (fragmentGeneralListBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding3;
            }
            MultiStateView multiStateView2 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            ondialogshown.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ((setSubtitleTextAppearance) ondialogshown.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (ondialogshown.TuitionPaymentFragmentbindingInflater1 != null) {
                lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office> lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = ondialogshown.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = ondialogshown.asInterface;
            if (fragmentGeneralListBottomSheetBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding4;
            }
            MultiStateView multiStateView3 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, ondialogshown.getString(R.string.error_error_occured), null, new Pair(ondialogshown.getString(R.string.action_retry), new Function0() { // from class: openFallbackBrowserActionsMenu
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return onDialogShown.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }));
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(onDialogShown ondialogshown, RegionalOffice regionalOffice, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy) {
        Intrinsics.checkNotNullParameter(regionalOffice, "");
        Intrinsics.checkNotNullParameter(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, "");
        ondialogshown.TuitionPaymentFragmentbindingInflater1(regionalOffice, lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onDialogShown ondialogshown) {
        Dialog dialog = ondialogshown.getDialog();
        Intrinsics.checkNotNull(dialog, "");
        View viewFindViewById = ((BottomSheetDialog) dialog).findViewById(R.id.design_bottom_sheet);
        Intrinsics.checkNotNull(viewFindViewById, "");
        BottomSheetBehavior.from((FrameLayout) viewFindViewById).setState(3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(onDialogShown ondialogshown, RegionalOffice regionalOffice, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy) {
        Intrinsics.checkNotNullParameter(regionalOffice, "");
        Intrinsics.checkNotNullParameter(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, "");
        ondialogshown.TuitionPaymentFragmentbindingInflater1(regionalOffice, lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(final onDialogShown ondialogshown, String str) {
        String upperCase;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = null;
        if (str != null) {
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        } else {
            upperCase = null;
        }
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = ondialogshown.asInterface;
        if (fragmentGeneralListBottomSheetBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding2;
        }
        if (upperCase != null) {
            String str2 = upperCase;
            if (str2.length() > 0) {
                Iterable iterable = ((setSubtitleTextAppearance) ondialogshown.a.getValue()).d;
                Intrinsics.checkNotNullExpressionValue(iterable, "");
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    List<Office> list = ((RegionalOffice) obj).asInterface;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (StringsKt.contains((CharSequence) ((Office) it.next()).TuitionPaymentFragmentbindingInflater1, (CharSequence) str2, true)) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
                RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
                Context contextRequireContext = ondialogshown.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                recyclerView.setAdapter(new setSubtitleTextAppearance(contextRequireContext, arrayList, new Function2() { // from class: BrowserActionsIntentBuilder
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return onDialogShown.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (RegionalOffice) obj2, (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj3);
                    }
                }));
            } else {
                ((setSubtitleTextAppearance) ondialogshown.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(ondialogshown.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                fragmentGeneralListBottomSheetBinding.rvItem.setAdapter((setSubtitleTextAppearance) ondialogshown.a.getValue());
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(onDialogShown ondialogshown) {
        ((drawSelectorCompat) ondialogshown.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ setSubtitleTextAppearance b(final onDialogShown ondialogshown) {
        Context contextRequireContext = ondialogshown.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new setSubtitleTextAppearance(contextRequireContext, null, new Function2() { // from class: BrowserActionsIntentBrowserActionsFallDialogListener
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return onDialogShown.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (RegionalOffice) obj, (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj2);
            }
        }, 2, null);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((drawSelectorCompat) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(getViewLifecycleOwner(), new Observer() { // from class: BrowserActionsIntentBrowserActionsItemId
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                onDialogShown.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        ((drawSelectorCompat) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        setSubtitleTextAppearance setsubtitletextappearance = (setSubtitleTextAppearance) this.a.getValue();
        setsubtitletextappearance.d.clear();
        setsubtitletextappearance.notifyDataSetChanged();
        ((setSubtitleTextAppearance) this.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.asInterface;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = null;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter((setSubtitleTextAppearance) this.a.getValue());
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = this.asInterface;
        if (fragmentGeneralListBottomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentGeneralListBottomSheetBinding2 = fragmentGeneralListBottomSheetBinding3;
        }
        fragmentGeneralListBottomSheetBinding2.tvTitle.setText(getString(R.string.label_branch_office));
    }
}
