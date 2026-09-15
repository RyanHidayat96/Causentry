package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.promo.model.CategoryMerchant;
import com.bpjstku.presentation.promo.bottomsheet.CategoryBottomSheetFragment$adapter$2$1;
import com.bpjstku.presentation.promo.bottomsheet.CategoryBottomSheetFragment$handleItemClicked$1;
import com.google.android.libraries.places.internal.zzapt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\tJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000b\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\"R\u0016\u0010\n\u001a\u00020#8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\r\u0010$"}, d2 = {"LtriggerAePrecapture;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/promo/model/CategoryMerchant;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/util/List;)V", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Ljava/util/List;", "a", "Lcom/bpjstku/domain/promo/model/CategoryMerchant;", "LlambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl;", "Lkotlin/Lazy;", "", "()I", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class triggerAePrecapture extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<CategoryMerchant, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CategoryMerchant>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CategoryMerchant TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding g;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getA() {
        return R.layout.fragment_general_searchable_list_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    public /* synthetic */ triggerAePrecapture(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public triggerAePrecapture(Function1<? super CategoryMerchant, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CollectionsKt.emptyList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: FocusMeteringControlExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return triggerAePrecapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentbindingInflater1 = arguments != null ? (CategoryMerchant) arguments.getParcelable("key_selected_merchant") : null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.g;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        lambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl lambdaexecutemeteringaction11androidxcameracamera2internalfocusmeteringcontrol = (lambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        lambdaexecutemeteringaction11androidxcameracamera2internalfocusmeteringcontrol.d.clear();
        lambdaexecutemeteringaction11androidxcameracamera2internalfocusmeteringcontrol.notifyDataSetChanged();
        ((lambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((lambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        fragmentGeneralListBottomSheetBinding.tvTitle.setText(getString(R.string.label_category_merchant));
        fragmentGeneralListBottomSheetBinding.svSearchItem.setQueryHint(getString(R.string.hint_category_merchant));
        CategoryMerchant categoryMerchant = this.TuitionPaymentFragmentbindingInflater1;
        if (categoryMerchant != null) {
            Iterable iterable = ((lambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            int i = 0;
            for (Object obj : iterable) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
                String str = categoryMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str2 = categoryMerchant.TuitionPaymentFragmentbindingInflater1;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                String string = sb.toString();
                String str3 = ((CategoryMerchant) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str4 = ((CategoryMerchant) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentbindingInflater1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str4);
                lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(string, sb2.toString());
                ((lambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.set(i, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
                if (Intrinsics.areEqual(categoryMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((CategoryMerchant) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = this.g;
                    if (fragmentGeneralListBottomSheetBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        fragmentGeneralListBottomSheetBinding2 = null;
                    }
                    RecyclerView recyclerView2 = fragmentGeneralListBottomSheetBinding2.rvItem;
                    int i2 = i + 4;
                    if (((lambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.size() <= i2 || i <= 4) {
                        i2 = i;
                    }
                    recyclerView2.scrollToPosition(i2);
                }
                i++;
            }
        }
        fragmentGeneralListBottomSheetBinding.svSearchItem.setQuery("", false);
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.g;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: FocusMeteringControlExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return triggerAePrecapture.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: triggerAePrecapture$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LtriggerAePrecapture$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/bpjstku/domain/promo/model/CategoryMerchant;", "p0", "Lkotlin/Function1;", "", "p1", "LtriggerAePrecapture;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/domain/promo/model/CategoryMerchant;Lkotlin/jvm/functions/Function1;)LtriggerAePrecapture;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$a = {123, -2, -101, -104};
        private static final int $$b = 195;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int asBinder = 1;
        private static char b = 60708;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 24153;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 35298;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 8759;
        private static long TuitionPaymentFragmentbindingInflater1 = -1803883725174357918L;

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = $10 + 47;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 19473), 2625 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 | 9053247990562531611L);
                        try {
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 39422), 481 - KeyEvent.keyCodeFromString(""), 37 - TextUtils.getCapsMode("", 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
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
                } else {
                    int i5 = getrealtimecapturelatency.b;
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 19473), 2623 - ExpandableListView.getPackedPositionChild(0L), 13 - Drawable.resolveOpacity(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39421 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 481, 37 - Drawable.resolveOpacity(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i6 = $11 + 23;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39422), TextUtils.getTrimmedLength("") + 481, TextUtils.getCapsMode("", 0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
            int i8 = $11 + 15;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }

        private Companion() {
        }

        @JvmStatic
        public static triggerAePrecapture TuitionPaymentFragmentbindingInflater1(CategoryMerchant p0, Function1<? super CategoryMerchant, Unit> p1) {
            int i = 2 % 2;
            triggerAePrecapture triggeraeprecapture = new triggerAePrecapture(p1);
            triggeraeprecapture.setArguments(new Bundle());
            int i2 = asBinder + 31;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 82 / 0;
            }
            return triggeraeprecapture;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            int i3 = $11 + 31;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                int i5 = $11 + 23;
                $10 = i5 % 128;
                int i6 = 58224;
                if (i5 % 2 != 0) {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 1];
                } else {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                }
                for (int i7 = 0; i7 < 16; i7++) {
                    int i8 = $10 + 21;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    try {
                        Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (47773 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 467, 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 468 - (KeyEvent.getMaxKeyCode() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr3[0] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 2323 - Color.argb(0, 0, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44, -1312321721, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v2, types: [int] */
        /* JADX WARN: Type inference failed for: r5v12 */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3;
            String str;
            Object objInvoke;
            int i4;
            Object[] objArr;
            char[] cArr;
            int i5;
            int i6;
            Class<?> cls;
            char[] cArr2;
            int offsetAfter;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i7;
            int i8;
            int i9;
            Class<?> cls2;
            char[] cArr3;
            int i10;
            int i11;
            int i12;
            int i13 = i2;
            ?? r3 = "";
            int i14 = 2 % 2;
            if (context != null) {
                try {
                    int i15 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i16 = (i15 & 30) + (i15 | 30);
                    Object[] objArr2 = new Object[1];
                    a(new char[]{40026, 19006, 45496, 6394, 58919, 20953, 50499, 5848, 46557, 33996, 21257, 1797, 35373, 62487, 21528, 8839, 32068, 55215, 28944, 58372, 41435, 62435, 57332, 17484, 40449, 13310, 32994, 34826, 27315, 57279, 46201, 1381, 31630, 55493}, i16, objArr2);
                    try {
                        try {
                            Object[] objArr3 = {(String) objArr2[0]};
                            int i17 = -(-View.getDefaultSize(0, 0));
                            Object[] objArr4 = new Object[1];
                            c(new char[]{26899, 42025, 62317, 3723, 24005, 26786, 42540, 62795, 146, 24501, 27361, 47115, 63297, 637, 20985, 27847, 47644, 51532, 1123, 21492, 28373, 48201, 52095, 1582, 21967, 24808, 49078, 52578, 6165, 22436, 25269, 45567, 53047, 6731, 10642, 25786, 46076, 49408}, ((i17 | 52529) << 1) - (i17 ^ 52529), objArr4);
                            Class<?> cls3 = Class.forName((String) objArr4[0]);
                            Class<?>[] clsArr = new Class[1];
                            int i18 = asBinder;
                            int i19 = (i18 ^ 67) + ((i18 & 67) << 1);
                            asInterface = i19 % 128;
                            int i20 = i19 % 2;
                            clsArr[0] = String.class;
                            Object objNewInstance = cls3.getDeclaredConstructor(clsArr).newInstance(objArr3);
                            char[] cArr4 = {59775, 19160, 23408, 11501, 53135, 27983, 61110, 31633, 39865, 58756, 26005, 30135, 20553, 9393, 37431, 8748, 457, 62290, 49253, 48042, Typography.registered, 23595, 37030, 11044, 45530, 20207, 11733, 308, 26280, 34304, 8493, 16281, 2674, 42283};
                            int i21 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int i22 = ((i21 | 30) << 1) - (i21 ^ 30);
                            Object[] objArr5 = new Object[1];
                            a(cArr4, i22, objArr5);
                            try {
                                Object[] objArr6 = {(String) objArr5[0]};
                                char[] cArr5 = {26899, 42025, 62317, 3723, 24005, 26786, 42540, 62795, 146, 24501, 27361, 47115, 63297, 637, 20985, 27847, 47644, 51532, 1123, 21492, 28373, 48201, 52095, 1582, 21967, 24808, 49078, 52578, 6165, 22436, 25269, 45567, 53047, 6731, 10642, 25786, 46076, 49408};
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i23 = iResolveOpacity * 273;
                                int i24 = asBinder;
                                int i25 = i24 + 57;
                                asInterface = i25 % 128;
                                int i26 = i25 % 2;
                                int i27 = (i23 & (-14235359)) + (i23 | (-14235359));
                                int i28 = ~iResolveOpacity;
                                int i29 = i24 + 37;
                                int i30 = i29 % 128;
                                asInterface = i30;
                                int i31 = i29 % 2;
                                int i32 = ~(((-52530) & i28) | (i28 ^ (-52530)) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i33 = (iResolveOpacity ^ 52529) | (iResolveOpacity & 52529);
                                int i34 = ~((i33 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i33 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i35 = -(-((-272) * ((i32 ^ i34) | (i32 & i34))));
                                int i36 = (i27 & i35) + (i35 | i27);
                                int i37 = (i30 ^ 87) + ((i30 & 87) << 1);
                                asBinder = i37 % 128;
                                int i38 = i37 % 2;
                                int i39 = ~iResolveOpacity;
                                int i40 = ~((i39 & 52529) | (i39 ^ 52529));
                                int i41 = ~((i28 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i28 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i42 = ((i40 & i41) | (i40 ^ i41)) * (-272);
                                int i43 = (i36 ^ i42) + ((i42 & i36) << 1) + (((~((iResolveOpacity ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (iResolveOpacity & iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | 52529) * 272);
                                Object[] objArr7 = new Object[1];
                                c(cArr5, i43, objArr7);
                                Object objNewInstance2 = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                                int i44 = asInterface;
                                int i45 = ((i44 | 43) << 1) - (i44 ^ 43);
                                asBinder = i45 % 128;
                                int i46 = i45 % 2;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i47 = -(-((~(((-743654171) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-743654171) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * TypedValues.CycleType.TYPE_EASING));
                                int i48 = ((39411143 | i47) << 1) - (i47 ^ 39411143);
                                int i49 = (i48 & (-34541332)) + ((-34541332) | i48);
                                int i50 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (-743654171));
                                int i51 = -(-(((i50 & 42245124) | (42245124 ^ i50)) * TypedValues.CycleType.TYPE_EASING));
                                int i52 = (i49 ^ i51) + ((i51 & i49) << 1);
                                int i53 = ~(276784664 | i);
                                int i54 = -(-(((i53 & 670454173) | (670454173 ^ i53)) * (-948)));
                                int i55 = ((-1410699059) ^ i54) + ((i54 & (-1410699059)) << 1);
                                int i56 = ~i;
                                int i57 = -(-((~((939489181 & i56) | (939489181 ^ i56))) * (-948)));
                                int i58 = (i55 & i57) + (i57 | i55);
                                try {
                                    if (i52 <= (i58 & (-1178657848)) + ((-1178657848) | i58)) {
                                        Object[] objArr8 = new Object[1];
                                        c(new char[]{26904, 42996, 62683, 1442, 21146, 25471, 45135, 49506, 7682, 11501, 32201, 35532, 56248, 59536, 14695, 30234, 34570, 54277, 58081, 13268, 16544, 37278, 44687}, 52963 >> (TypedValue.complexToFraction(1, 0.0f, 2.0f) > 1.0f ? 1 : (TypedValue.complexToFraction(1, 0.0f, 2.0f) == 1.0f ? 0 : -1)), objArr8);
                                        str = (String) objArr8[0];
                                    } else {
                                        int i59 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i60 = (i59 ^ 52963) + ((i59 & 52963) << 1);
                                        Object[] objArr9 = new Object[1];
                                        c(new char[]{26904, 42996, 62683, 1442, 21146, 25471, 45135, 49506, 7682, 11501, 32201, 35532, 56248, 59536, 14695, 30234, 34570, 54277, 58081, 13268, 16544, 37278, 44687}, i60, objArr9);
                                        str = (String) objArr9[0];
                                    }
                                    Class<?> cls4 = Class.forName(str);
                                    char[] cArr6 = {38390, 53678, 31174, 32095, 42524, 1576, 64922, 42948, 49463, 35434, 11706, 20641, 11608, 42487, 11178, 62741, 59120, 2720, 22995, 52943};
                                    int i61 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i62 = (i61 * 471) + 7536;
                                    int i63 = -(-(((i61 ^ 16) | (i61 & 16)) * (-470)));
                                    int i64 = (i62 ^ i63) + ((i62 & i63) << 1);
                                    int i65 = ~((~i61) | (-17));
                                    int i66 = asInterface + 61;
                                    asBinder = i66 % 128;
                                    int i67 = i66 % 2;
                                    int i68 = ~(((-17) ^ i) | ((-17) & i));
                                    int i69 = (i68 & i65) | (i65 ^ i68);
                                    int i70 = ~i;
                                    int i71 = ~((i70 ^ i61) | (i70 & i61) | 16);
                                    int i72 = ((i69 ^ i71) | (i69 & i71)) * (-470);
                                    int i73 = (i64 & i72) + (i64 | i72);
                                    int i74 = (-17) | i61;
                                    int i75 = ~((i74 ^ i) | (i74 & i));
                                    int i76 = i61 | i56;
                                    int i77 = ~((i76 ^ 16) | (i76 & 16));
                                    int i78 = ((i75 ^ i77) | (i75 & i77)) * 470;
                                    int i79 = ((i73 | i78) << 1) - (i78 ^ i73);
                                    Object[] objArr10 = new Object[1];
                                    a(cArr6, i79, objArr10);
                                    Object objInvoke2 = cls4.getMethod((String) objArr10[0], null).invoke(context, null);
                                    try {
                                        Object[] objArr11 = new Object[1];
                                        c(new char[]{26904, 42996, 62683, 1442, 21146, 25471, 45135, 49506, 7682, 11501, 32201, 35532, 56248, 59536, 14695, 30234, 34570, 54277, 58081, 13268, 16544, 37278, 44687}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 52962, objArr11);
                                        Class<?> cls5 = Class.forName((String) objArr11[0]);
                                        int i80 = -(-Process.getGidForName(""));
                                        int i81 = ((i80 | 54564) << 1) - (i80 ^ 54564);
                                        Object[] objArr12 = new Object[1];
                                        c(new char[]{26910, 48191, 49995, 5696, 15764, 16565, 38848, 47853, 49158, 5927, 14953, 16793, 38064, 48091}, i81, objArr12);
                                        String str2 = (String) objArr12[0];
                                        int i82 = asInterface + 47;
                                        asBinder = i82 % 128;
                                        if (i82 % 2 == 0) {
                                            objInvoke = cls5.getMethod(str2, null).invoke(context, null);
                                            i4 = 28;
                                        } else {
                                            objInvoke = cls5.getMethod(str2, null).invoke(context, null);
                                            i4 = 64;
                                        }
                                        int i83 = asBinder + 117;
                                        asInterface = i83 % 128;
                                        try {
                                            if (i83 % 2 != 0) {
                                                objArr = new Object[]{Integer.valueOf(i4), objInvoke};
                                                cArr = new char[]{61016, 57920, 5239, 27040, 12271, 64674, 52922, 50370, 7432, 38546, 5941, 52167, 41028, 53530, 2429, 61102, 20985, 37525, 63895, 58676, 38994, 22612, 57022, 14463, 24798, 54933, 59175, 22149, 6955, 11380, 37479, 36264, 35862, 41476, 22173, 33499};
                                                i5 = -(ViewConfiguration.getTapTimeout() * 9);
                                                i6 = 111;
                                            } else {
                                                objArr = new Object[]{objInvoke, Integer.valueOf(i4)};
                                                cArr = new char[]{61016, 57920, 5239, 27040, 12271, 64674, 52922, 50370, 7432, 38546, 5941, 52167, 41028, 53530, 2429, 61102, 20985, 37525, 63895, 58676, 38994, 22612, 57022, 14463, 24798, 54933, 59175, 22149, 6955, 11380, 37479, 36264, 35862, 41476, 22173, 33499};
                                                i5 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                i6 = 33;
                                            }
                                            int i84 = i5 * (-496);
                                            int i85 = -(-(i6 * (-496)));
                                            int i86 = (i84 ^ i85) + ((i84 & i85) << 1);
                                            int i87 = ~i5;
                                            int i88 = ~i6;
                                            int i89 = i86 + ((~((i87 ^ i88) | (i87 & i88))) * 497);
                                            int i90 = ~i5;
                                            int i91 = i90 | i88;
                                            int i92 = ~((i91 ^ i) | (i91 & i));
                                            Object obj = objNewInstance2;
                                            int i93 = ~i6;
                                            int i94 = (i93 ^ i56) | (i93 & i56);
                                            int i95 = ~((i94 ^ i5) | (i94 & i5));
                                            int i96 = i89 + (((i92 ^ i95) | (i92 & i95)) * 497);
                                            int i97 = ~(i90 | i56);
                                            int i98 = ~((i87 ^ i6) | (i87 & i6));
                                            int i99 = (i97 & i98) | (i97 ^ i98);
                                            int i100 = (i88 ^ i5) | (i88 & i5);
                                            int i101 = -(-((i99 | (~((i100 & i) | (i100 ^ i)))) * 497));
                                            int i102 = i96 ^ i101;
                                            i13 = (i101 & i96) << 1;
                                            int i103 = i102 + i13;
                                            try {
                                                Object[] objArr13 = new Object[1];
                                                a(cArr, i103, objArr13);
                                                Class<?> cls6 = Class.forName((String) objArr13[0]);
                                                int i104 = -Color.blue(0);
                                                int i105 = ((i104 | 14) << 1) - (i104 ^ 14);
                                                Object[] objArr14 = new Object[1];
                                                a(new char[]{61540, 40002, 25589, 51425, 41769, 29083, 41702, 41218, 25974, 64317, 46226, 45404, 2497, 25618, 33869, 55327}, i105, objArr14);
                                                Object objInvoke3 = cls6.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke2, objArr);
                                                try {
                                                    char[] cArr7 = {20437, 14875, 61460, 1810, 12976, 61346, 57153, 17889, 17876, 44440, 50000, 56516, 41916, 65372, 16788, 12885, 55780, 26351, 26006, 24242, 54420, 59241, 26685, 7732, 42525, 7, 23674, 47609, 19137, 3888, 5038, 39583};
                                                    double dConvertQuartSecToDecDegrees = CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                                    int i106 = asInterface;
                                                    int i107 = ((i106 | 31) << 1) - (i106 ^ 31);
                                                    asBinder = i107 % 128;
                                                    int i108 = (dConvertQuartSecToDecDegrees > 0.0d ? 1 : (dConvertQuartSecToDecDegrees == 0.0d ? 0 : -1));
                                                    if (i107 % 2 == 0) {
                                                        Object[] objArr15 = new Object[1];
                                                        a(cArr7, 30 / i108, objArr15);
                                                        cls = Class.forName((String) objArr15[0]);
                                                        cArr2 = new char[]{26890, 52031, 11584, 36762, 57764, 17382, 42006, 1602, 30820, 55981};
                                                        offsetAfter = TextUtils.getOffsetAfter("", 0);
                                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                        int i109 = -offsetAfter;
                                                        i7 = (i109 & 784) + (i109 | 784);
                                                    } else {
                                                        int i110 = -(-i108);
                                                        Object[] objArr16 = new Object[1];
                                                        a(cArr7, (i110 & 30) + (i110 | 30), objArr16);
                                                        cls = Class.forName((String) objArr16[0]);
                                                        cArr2 = new char[]{26890, 52031, 11584, 36762, 57764, 17382, 42006, 1602, 30820, 55981};
                                                        offsetAfter = TextUtils.getOffsetAfter("", 0);
                                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                        i7 = offsetAfter * 784;
                                                    }
                                                    int i111 = (i7 & (-32467858)) + ((-32467858) | i7) + 32510160;
                                                    int i112 = ~offsetAfter;
                                                    int i113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                    int i114 = (i112 ^ i113) | (i112 & i113);
                                                    int i115 = (~((i114 & 41519) | (i114 ^ 41519))) * (-783);
                                                    int i116 = (i111 & i115) + (i115 | i111);
                                                    int i117 = ~((i113 & 41519) | (i113 ^ 41519));
                                                    int i118 = -(-(((i117 & i112) | (i112 ^ i117)) * 783));
                                                    int i119 = (i116 ^ i118) + ((i118 & i116) << 1);
                                                    Object[] objArr17 = new Object[1];
                                                    c(cArr2, i119, objArr17);
                                                    Object[] objArr18 = (Object[]) cls.getField((String) objArr17[0]).get(objInvoke3);
                                                    int length = objArr18.length;
                                                    int i120 = asInterface;
                                                    int i121 = ((i120 | 51) << 1) - (i120 ^ 51);
                                                    asBinder = i121 % 128;
                                                    int i122 = 2;
                                                    int i123 = i121 % 2;
                                                    int i124 = 0;
                                                    while (true) {
                                                        if (i124 < length) {
                                                            int i125 = asInterface + 97;
                                                            asBinder = i125 % 128;
                                                            int i126 = i125 % i122;
                                                            Object obj2 = objArr18[i124];
                                                            char[] cArr8 = {26913, 26028, 28858, 20408, 23212};
                                                            int i127 = -ExpandableListView.getPackedPositionChild(0L);
                                                            int i128 = asInterface + 93;
                                                            asBinder = i128 % 128;
                                                            int i129 = i128 % 2;
                                                            int i130 = ((-183) * i127) + 614570;
                                                            int i131 = ~i127;
                                                            int i132 = ~(i131 | 3322);
                                                            int i133 = ~((i56 ^ 3322) | (i56 & 3322));
                                                            int i134 = -(-(((i132 & i133) | (i132 ^ i133)) * 184));
                                                            int i135 = (((i130 & i134) + (i130 | i134)) - (~(((~((i127 & (-3323)) | ((-3323) ^ i127))) | i) * (-184)))) - 1;
                                                            int i136 = -(-((~((i131 ^ i56) | (i131 & i56))) * 184));
                                                            Object[] objArr19 = new Object[1];
                                                            c(cArr8, (i135 & i136) + (i136 | i135), objArr19);
                                                            try {
                                                                Object[] objArr20 = {(String) objArr19[0]};
                                                                int i137 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                int i138 = ((i137 | 37) << 1) - (i137 ^ 37);
                                                                Object[] objArr21 = new Object[1];
                                                                a(new char[]{54983, 11831, 42605, 27477, 21056, 63341, 39664, 45084, 61866, 716, 35592, 50642, 10460, 33399, 54228, 28883, 28592, 2634, 49248, 65241, 43499, 16906, 49681, 39779, 19795, 14838, 60172, 9027, 34945, 56701, 34553, 13057, 34321, 58548, 5543, 29894, 22689, 15387, 36690, 5952}, i138, objArr21);
                                                                Class<?> cls7 = Class.forName((String) objArr21[0]);
                                                                Object[] objArr22 = new Object[1];
                                                                c(new char[]{26910, 36583, 42747, 57025, 63227, 61165, 1775, 16069, 22223, 20169, 26322}, 59386 - (~(-(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))), objArr22);
                                                                Object objInvoke4 = cls7.getMethod((String) objArr22[0], String.class).invoke(null, objArr20);
                                                                try {
                                                                    char[] cArr9 = {26904, 12592, 55635, 24958, 2442, 53715, 31223, 'F', 43042, 28745, 6289, 41120, 18632, 4332, 47919, 17182, 60281, 45955, 23529, 58319, 35356, 21037, 64077, 33433, 10917, 62147, 39677, 9473};
                                                                    int i139 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                    int i140 = asBinder + 21;
                                                                    int i141 = i140 % 128;
                                                                    asInterface = i141;
                                                                    if (i140 % 2 != 0) {
                                                                        i8 = 236 % i139;
                                                                        i9 = 60288;
                                                                    } else {
                                                                        i8 = i139 * 236;
                                                                        i9 = 10629057;
                                                                    }
                                                                    int i142 = (i8 ^ i9) + ((i8 & i9) << 1);
                                                                    int i143 = ~i139;
                                                                    int i144 = ~((i143 ^ i70) | (i143 & i70));
                                                                    Object[] objArr23 = objArr18;
                                                                    int i145 = (i142 - (~(-(-(((i144 ^ 22567) | (i144 & 22567)) * (-235)))))) - 1;
                                                                    int i146 = ~((i143 ^ i) | (i143 & i));
                                                                    int i147 = -(-(((i146 & 22567) | (i146 ^ 22567)) * (-470)));
                                                                    int i148 = (i145 ^ i147) + ((i145 & i147) << 1);
                                                                    int i149 = ~(((-22568) ^ i139) | ((-22568) & i139));
                                                                    int i150 = (i141 ^ 75) + ((i141 & 75) << 1);
                                                                    asBinder = i150 % 128;
                                                                    if (i150 % 2 == 0) {
                                                                        int i151 = ~((i143 ^ 22567) | (i143 & 22567) | i);
                                                                        Object[] objArr24 = new Object[1];
                                                                        c(cArr9, i148 >>> (235 >>> ((i149 & i151) | (i149 ^ i151))), objArr24);
                                                                        cls2 = Class.forName((String) objArr24[0]);
                                                                        cArr3 = new char[]{26893, 15507, 49713, 27023, 16153, 49797, 26662, 16296, 50467, 26805, 15922};
                                                                    } else {
                                                                        int i152 = (i143 ^ 22567) | (i143 & 22567);
                                                                        int i153 = ~((i152 & i) | (i152 ^ i));
                                                                        int i154 = ((i149 & i153) | (i149 ^ i153)) * 235;
                                                                        int i155 = (i148 & i154) + (i154 | i148);
                                                                        Object[] objArr25 = new Object[1];
                                                                        c(cArr9, i155, objArr25);
                                                                        cls2 = Class.forName((String) objArr25[0]);
                                                                        cArr3 = new char[]{26893, 15507, 49713, 27023, 16153, 49797, 26662, 16296, 50467, 26805, 15922};
                                                                    }
                                                                    Object[] objArr26 = new Object[1];
                                                                    c(cArr3, 21892 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), objArr26);
                                                                    try {
                                                                        Object[] objArr27 = {new ByteArrayInputStream((byte[]) cls2.getMethod((String) objArr26[0], null).invoke(obj2, null))};
                                                                        int iIndexOf = TextUtils.indexOf("", "", 0);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                        int i156 = iIndexOf * (-716);
                                                                        int i157 = (i156 & 53095) + (i156 | 53095) + (((~iIndexOf) | 37) * (-1434));
                                                                        int i158 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                        int i159 = ~(i158 | 37);
                                                                        int i160 = ~((iIndexOf ^ 37) | (iIndexOf & 37));
                                                                        int i161 = (i159 ^ i160) | (i159 & i160);
                                                                        int i162 = ~iIndexOf;
                                                                        int i163 = length;
                                                                        int i164 = ~((i162 ^ (-38)) | (i162 & (-38)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                                                        int i165 = ((i161 ^ i164) | (i164 & i161)) * 717;
                                                                        int i166 = ((i157 | i165) << 1) - (i165 ^ i157);
                                                                        int i167 = ~((i162 ^ (-38)) | (i162 & (-38)) | i158);
                                                                        int i168 = (i167 & i160) | (i167 ^ i160);
                                                                        int i169 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 37) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 37));
                                                                        int i170 = ((i168 & i169) | (i168 ^ i169)) * 717;
                                                                        int i171 = (i166 ^ i170) + ((i170 & i166) << 1);
                                                                        Object[] objArr28 = new Object[1];
                                                                        a(new char[]{54983, 11831, 42605, 27477, 21056, 63341, 39664, 45084, 61866, 716, 35592, 50642, 10460, 33399, 54228, 28883, 28592, 2634, 49248, 65241, 43499, 16906, 49681, 39779, 19795, 14838, 60172, 9027, 34945, 56701, 34553, 13057, 34321, 58548, 5543, 29894, 22689, 15387, 36690, 5952}, i171, objArr28);
                                                                        Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                        Object[] objArr29 = new Object[1];
                                                                        c(new char[]{26910, 58727, 29153, 52333, 22759, 55167, 9199, 48705, 2786, 39247, 5573, 24644, 64724, 19232, 51114, 21039, 44712, 15654, 35258}, 35962 - (~(-(-View.MeasureSpec.getSize(0)))), objArr29);
                                                                        Object objInvoke5 = cls8.getMethod((String) objArr29[0], InputStream.class).invoke(objInvoke4, objArr27);
                                                                        try {
                                                                            Object[] objArr30 = new Object[1];
                                                                            c(new char[]{26899, 14595, 51513, 39241, 10555, 63885, 35262, 22951, 59860, 47608, 18462, 6180, 43076, 30728, 2144, 55433, 26811, 14534, 51377, 39712, 11088, 64382, 35602, 23383, 60308, 48040, 19379, 7113, 44011, 31263, 2608, 55901, 27245, 14951}, 20508 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr30);
                                                                            Class<?> cls9 = Class.forName((String) objArr30[0]);
                                                                            char[] cArr10 = {46878, 43441, 38689, 65389, 47447, 40372, 38023, 51309, 12183, 45972, 51538, 38486, 45710, 57172, 32447, 30270, 37342, 24639, 15864, 16967, 545, 49458, 46721, 23235, 11130, 13956};
                                                                            int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                            int i172 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                                            int i173 = ~((i172 & (-868961885)) | ((-868961885) ^ i172));
                                                                            int i174 = ~((1025216355 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (1025216355 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                                                            int i175 = 1307569236 + (((i173 ^ i174) | (i173 & i174)) * 959);
                                                                            int i176 = ~((-868961885) | iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                                                                            int i177 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                                            int i178 = ~((i177 & 1025216355) | (i177 ^ 1025216355));
                                                                            int i179 = (((i175 | 110792291) << 1) - (110792291 ^ i175)) + (((i178 & i176) | (i176 ^ i178)) * 959);
                                                                            int i180 = -(-((~((-34249) | i)) * 521));
                                                                            int i181 = ((-1152540442) ^ i180) + ((i180 & (-1152540442)) << 1);
                                                                            int i182 = (i181 ^ (-1880718750)) + (((-1880718750) & i181) << 1);
                                                                            int i183 = ~((-34249) | i56);
                                                                            int i184 = ((i183 & 59510807) | (59510807 ^ i183)) * 521;
                                                                            if (i179 <= (i182 & i184) + (i182 | i184)) {
                                                                                i10 = 471 >>> longPressTimeout;
                                                                                i11 = (-470) >> (longPressTimeout | 23);
                                                                            } else {
                                                                                int i185 = longPressTimeout * 471;
                                                                                i10 = ((i185 | 10833) << 1) - (i185 ^ 10833);
                                                                                i11 = ((longPressTimeout ^ 23) | (longPressTimeout & 23)) * (-470);
                                                                            }
                                                                            int i186 = (i10 ^ i11) + ((i10 & i11) << 1);
                                                                            int i187 = ~((~longPressTimeout) | (-24));
                                                                            int i188 = ~(((-24) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-24) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                            int i189 = (i187 & i188) | (i187 ^ i188);
                                                                            int i190 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                            int i191 = -(-((i189 | (~((i190 & longPressTimeout) | (i190 ^ longPressTimeout) | 23))) * (-470)));
                                                                            int i192 = ((i186 | i191) << 1) - (i191 ^ i186);
                                                                            int i193 = (-24) | longPressTimeout;
                                                                            int i194 = ~((i193 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i193 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                            int i195 = asBinder;
                                                                            int i196 = ((i195 | 13) << 1) - (i195 ^ 13);
                                                                            asInterface = i196 % 128;
                                                                            int i197 = i196 % 2;
                                                                            int i198 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                            int i199 = ~((i198 & longPressTimeout) | (i198 ^ longPressTimeout) | 23);
                                                                            int i200 = -(-(470 * ((i199 & i194) | (i194 ^ i199))));
                                                                            int i201 = ((i192 | i200) << 1) - (i200 ^ i192);
                                                                            Object[] objArr31 = new Object[1];
                                                                            a(cArr10, i201, objArr31);
                                                                            if (!objNewInstance.equals(cls9.getMethod((String) objArr31[0], null).invoke(objInvoke5, null))) {
                                                                                int i202 = asBinder;
                                                                                int i203 = (i202 ^ 59) + ((i202 & 59) << 1);
                                                                                asInterface = i203 % 128;
                                                                                int i204 = i203 % 2;
                                                                                try {
                                                                                    char[] cArr11 = {26899, 14595, 51513, 39241, 10555, 63885, 35262, 22951, 59860, 47608, 18462, 6180, 43076, 30728, 2144, 55433, 26811, 14534, 51377, 39712, 11088, 64382, 35602, 23383, 60308, 48040, 19379, 7113, 44011, 31263, 2608, 55901, 27245, 14951};
                                                                                    int iGreen = Color.green(0);
                                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                                    int i205 = (iGreen * 881) + 18066667;
                                                                                    int i206 = asInterface;
                                                                                    int i207 = (i206 & 111) + (i206 | 111);
                                                                                    asBinder = i207 % 128;
                                                                                    if (i207 % 2 == 0) {
                                                                                        throw null;
                                                                                    }
                                                                                    int i208 = ~iGreen;
                                                                                    int i209 = (~((i208 & (-20508)) | (i208 ^ (-20508)))) | (~((i208 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i208 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9)));
                                                                                    int i210 = ~((-20508) | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                                                                                    int i211 = (-880) * ((i209 & i210) | (i209 ^ i210));
                                                                                    int i212 = (i205 ^ i211) + ((i205 & i211) << 1);
                                                                                    int i213 = ~iGreen;
                                                                                    int i214 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                                                    int i215 = (~((i213 & i214) | (i213 ^ i214))) | 20507;
                                                                                    int i216 = ~((iGreen ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (iGreen & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                                                                    int i217 = ((i215 & i216) | (i215 ^ i216)) * (-880);
                                                                                    int i218 = (i212 ^ i217) + ((i212 & i217) << 1);
                                                                                    int i219 = (~(iGreen | iTuitionPaymentFragmentspecialinlinedviewModeldefault9)) * 880;
                                                                                    int i220 = ((i218 | i219) << 1) - (i219 ^ i218);
                                                                                    Object[] objArr32 = new Object[1];
                                                                                    c(cArr11, i220, objArr32);
                                                                                    Class<?> cls10 = Class.forName((String) objArr32[0]);
                                                                                    char[] cArr12 = {46878, 43441, 38689, 65389, 47447, 40372, 38023, 51309, 12183, 45972, 51538, 38486, 45710, 57172, 32447, 30270, 37342, 24639, 15864, 16967, 545, 49458, 46721, 23235, 11130, 13956};
                                                                                    int i221 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                    int i222 = ~(((-23) ^ i) | ((-23) & i));
                                                                                    int i223 = asInterface + 29;
                                                                                    int i224 = i223 % 128;
                                                                                    asBinder = i224;
                                                                                    int i225 = i223 % 2;
                                                                                    int i226 = ~((i56 ^ i221) | (i56 & i221));
                                                                                    int i227 = (((i221 * (-515)) + 11374) - (~((-516) * (((i222 ^ i226) | (i226 & i222)) | (~((i56 ^ 22) | (i56 & 22))))))) - 1;
                                                                                    int i228 = ~i221;
                                                                                    int i229 = (i224 ^ 85) + ((i224 & 85) << 1);
                                                                                    asInterface = i229 % 128;
                                                                                    int i230 = i229 % 2;
                                                                                    int i231 = (i228 ^ i70) | (i228 & i70);
                                                                                    int i232 = (i227 - (~(516 * ((~(((i228 ^ (-23)) | (i228 & (-23))) | i)) | (~((i231 & 22) | (i231 ^ 22))))))) - 1;
                                                                                    int i233 = ~((i228 & 22) | (i228 ^ 22));
                                                                                    int i234 = ((i224 | 1) << 1) - (i224 ^ 1);
                                                                                    asInterface = i234 % 128;
                                                                                    int i235 = i234 % 2;
                                                                                    int i236 = 516 * (i233 | (~((i56 ^ 22) | (i56 & 22))));
                                                                                    int i237 = (i232 & i236) + (i236 | i232);
                                                                                    Object[] objArr33 = new Object[1];
                                                                                    a(cArr12, i237, objArr33);
                                                                                    Object objInvoke6 = cls10.getMethod((String) objArr33[0], null).invoke(objInvoke5, null);
                                                                                    Object obj3 = obj;
                                                                                    if (!obj3.equals(objInvoke6)) {
                                                                                        int i238 = (i124 ^ (-93)) + ((i124 & (-93)) << 1);
                                                                                        i124 = (i238 & 94) + (i238 | 94);
                                                                                        objArr18 = objArr23;
                                                                                        obj = obj3;
                                                                                        length = i163;
                                                                                        i122 = 2;
                                                                                    }
                                                                                } catch (Throwable th) {
                                                                                    Throwable cause = th.getCause();
                                                                                    if (cause != null) {
                                                                                        throw cause;
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                            Object[] objArr34 = {new int[]{i}, new int[1], new int[]{(~(i & 1)) & (i | 1)}, null};
                                                                            int i239 = 2029882472 + (((-228682308) | i56) * (-369)) + (((~((-811242653) | i56)) | (-770932424)) * (-369)) + (((~(811242652 | i)) | (-1039924960) | (~((-542250117) | i56))) * 369);
                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                            int i240 = (-8288) + (i239 * (-518));
                                                                            int i241 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                                            int i242 = ~(((-17) & i241) | ((-17) ^ i241));
                                                                            int i243 = -(-(((i242 & i239) | (i239 ^ i242)) * 519));
                                                                            int i244 = (i240 ^ i243) + ((i240 & i243) << 1);
                                                                            int i245 = (i241 & (-17)) | ((-17) ^ i241);
                                                                            int i246 = asInterface + 75;
                                                                            asBinder = i246 % 128;
                                                                            if (i246 % 2 == 0) {
                                                                                int i247 = ~(i245 | i239);
                                                                                int i248 = (i239 ^ 16) | (i239 & 16);
                                                                                int i249 = ~((i248 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i248 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                                                int i250 = i247 ^ i249;
                                                                                int i251 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & i239) | (i239 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                                                int i252 = -(-((i251 & 16) | (i251 ^ 16)));
                                                                                i12 = (i244 << ((-519) % ((i247 & i249) | i250))) * ((i252 ^ 519) + ((i252 & 519) << 1));
                                                                            } else {
                                                                                int i253 = ~((i245 & i239) | (i245 ^ i239));
                                                                                int i254 = ~(i239 | 16 | iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                                                                                int i255 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault10 | i239);
                                                                                i12 = i244 + (((i253 & i254) | (i253 ^ i254)) * (-519)) + (((i255 & 16) | (i255 ^ 16)) * 519);
                                                                            }
                                                                            int i256 = i12 * (-405);
                                                                            int i257 = i2 * 407;
                                                                            int i258 = ((i256 | i257) << 1) - (i256 ^ i257);
                                                                            int i259 = ~i2;
                                                                            int i260 = ~((i259 & i) | (i259 ^ i));
                                                                            int i261 = (i56 ^ i12) | (i56 & i12);
                                                                            int i262 = ~((i261 & i2) | (i261 ^ i2));
                                                                            int i263 = -(-(((i260 & i262) | (i260 ^ i262)) * (-406)));
                                                                            int i264 = (i258 & i263) + (i263 | i258);
                                                                            int i265 = ~i2;
                                                                            int i266 = (i265 & i70) | (i265 ^ i70);
                                                                            int i267 = -(-((~((i266 & i12) | (i266 ^ i12))) * (-406)));
                                                                            int i268 = (i264 ^ i267) + ((i267 & i264) << 1);
                                                                            int i269 = ~i12;
                                                                            int i270 = ~((i269 & i) | (i269 ^ i));
                                                                            int i271 = ~((i56 ^ i2) | (i56 & i2));
                                                                            int i272 = (i268 - (~(((i270 & i271) | (i270 ^ i271)) * 406))) - 1;
                                                                            int i273 = i272 << 13;
                                                                            int i274 = (i273 | i272) & (~(i272 & i273));
                                                                            int i275 = i274 >>> 17;
                                                                            int i276 = (i274 | i275) & (~(i274 & i275));
                                                                            int i277 = i276 << 5;
                                                                            ((int[]) objArr34[1])[0] = ((~i276) & i277) | ((~i277) & i276);
                                                                            return objArr34;
                                                                        } catch (Throwable th2) {
                                                                            Throwable cause2 = th2.getCause();
                                                                            if (cause2 != null) {
                                                                                throw cause2;
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        Throwable cause3 = th3.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    Throwable cause4 = th4.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th4;
                                                                }
                                                            } catch (Throwable th5) {
                                                                Throwable cause5 = th5.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th5;
                                                            }
                                                        }
                                                        r3 = i2;
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                Throwable cause6 = th.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause7 = th8.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause8 = th9.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause9 = th10.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th10;
                            }
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable th11) {
                        Throwable cause10 = th11.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th11;
                    }
                } catch (Throwable unused3) {
                    r3 = i13;
                }
            } else {
                r3 = i13;
            }
            Object[] objArr35 = {new int[]{i}, new int[1], new int[]{i}, null};
            int i278 = ~i;
            int i279 = ~(371961809 | i278);
            int i280 = 708765608 + ((i279 | (-331651581)) * 764) + (((~(i278 | (-331651581))) | 302025168) * (-1528)) + (((-99563054) | i279) * 764);
            int i281 = asInterface;
            int i282 = (i281 & 3) + (i281 | 3);
            asBinder = i282 % 128;
            if (i282 % 2 == 0) {
                i280 /= 0;
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                i3 = (628 >>> i280) % (r3 + 628);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i283 = i280 * 628;
                int i284 = r3 * 628;
                i3 = ((i283 | i284) << 1) - (i283 ^ i284);
            }
            int i285 = (r3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (r3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int i286 = ~i280;
            int i287 = i3 + ((-627) * ((i285 & i286) | (i285 ^ i286)));
            int i288 = ~r3;
            int i289 = ~((i288 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i288 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
            int i290 = i287 + (((i289 & i280) | (i280 ^ i289)) * (-627));
            int i291 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i292 = ~((r3 & i291) | ((i291 ^ r3) == true ? 1 : 0));
            int i293 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i280) | (i280 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
            int i294 = ((i293 & i292) | (i292 ^ i293)) * 627;
            int i295 = ((i290 | i294) << 1) - (i294 ^ i290);
            int i296 = asInterface + 33;
            asBinder = i296 % 128;
            int i297 = i296 % 2;
            int i298 = i295 << 13;
            int i299 = (i298 & (~i295)) | ((~i298) & i295);
            int i300 = i299 ^ (i299 >>> 17);
            int i301 = i300 << 5;
            ((int[]) objArr35[1])[0] = (i300 | i301) & (~(i300 & i301));
            return objArr35;
        }

        private static String $$c(byte b2, byte b3, short s) {
            int i = b2 * 3;
            int i2 = 108 - (b3 * 2);
            int i3 = 3 - (s * 4);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i + 1];
            int i4 = -1;
            if (bArr == null) {
                i2 += i3;
                i3 = i3;
                i4 = -1;
            }
            while (true) {
                int i5 = i4 + 1;
                int i6 = i3 + 1;
                bArr2[i5] = (byte) i2;
                if (i5 == i) {
                    return new String(bArr2, 0);
                }
                i2 += bArr[i6];
                i3 = i6;
                i4 = i5;
            }
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(p0, p1, false);
        this.g = fragmentGeneralListBottomSheetBindingInflate;
        if (fragmentGeneralListBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBindingInflate = null;
        }
        LinearLayout root = fragmentGeneralListBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(List<CategoryMerchant> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<CategoryMerchant> list = p0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((CategoryMerchant) it.next()));
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayList;
    }

    public static /* synthetic */ Unit b(triggerAePrecapture triggeraeprecapture, String str) {
        ((lambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl) triggeraeprecapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1(String.valueOf(str));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ lambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl TuitionPaymentFragmentspecialinlinedviewModeldefault1(triggerAePrecapture triggeraeprecapture) {
        Context contextRequireContext = triggeraeprecapture.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new lambdaexecuteMeteringAction11androidxcameracamera2internalFocusMeteringControl(contextRequireContext, null, new CategoryBottomSheetFragment$adapter$2$1(triggeraeprecapture), 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(triggerAePrecapture triggeraeprecapture, CategoryMerchant categoryMerchant) {
        triggeraeprecapture.TuitionPaymentFragmentbindingInflater1 = categoryMerchant;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new CategoryBottomSheetFragment$handleItemClicked$1(triggeraeprecapture, categoryMerchant, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public triggerAePrecapture() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
