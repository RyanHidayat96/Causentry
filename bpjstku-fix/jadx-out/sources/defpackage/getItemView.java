package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentListDialCodeBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.country.ListDialCodeBottomSheetFragment$dialCodeAdapter$2$1;
import com.bpjstku.presentation.country.ListDialCodeBottomSheetFragment$handleItemClicked$1;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.material.chip.Chip;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.flagActionItems;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0016R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0013\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0015\u0010\u0010\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!0 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010%"}, d2 = {"LgetItemView;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", "Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/FragmentListDialCodeBottomSheetBinding;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/databinding/FragmentListDialCodeBottomSheetBinding;", "LflagActionItems;", "Lkotlin/Lazy;", "LsetId;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "asInterface", "Ljava/util/List;", "", "()I", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getItemView extends unregisterMediaButtonEventReceiver {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long asBinder;
    private static int onTransact;
    private FragmentListDialCodeBottomSheetBinding TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Function1<CodeNamePair, Unit> b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$a = {109, 7, 114, -90, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 139;
    private static int cancel = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f949a = 0;
    private static int notify = 1;

    public static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
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

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i7 | i2)) | (~(i8 | i2));
        int i10 = ~(i6 | i7);
        int i11 = i2 | i10 | (~(i8 | i4));
        int i12 = i2 + i4 + i5 + (1997535707 * i3) + (1930545336 * i);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i2) + 1468203008 + ((-417352845) * i4) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i5) + ((-1408630784) * i3) + ((-2070937600) * i) + (392888320 * i13);
        int i15 = (i2 * (-2054695253)) + 138751921 + (i4 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i5 * (-2054694363)) + (i3 * 1502648999) + (i * 931574424) + (i13 * (-2139684864));
        if (i14 + (i15 * i15 * (-174260224)) != 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        getItemView getitemview = (getItemView) objArr[0];
        CodeNamePair codeNamePair = (CodeNamePair) objArr[1];
        int i16 = 2 % 2;
        getitemview.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = codeNamePair;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ListDialCodeBottomSheetFragment$handleItemClicked$1(getitemview, codeNamePair, null), 3, null);
        int i17 = f949a + 89;
        notify = i17 % 128;
        int i18 = i17 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r0 = 53 - r7
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = defpackage.getItemView.$$a
            int r6 = r6 * 2
            int r6 = 84 - r6
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L30:
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getItemView.e(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getItemView(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = notify + 89;
            int i3 = i2 % 128;
            f949a = i3;
            if (i2 % 2 != 0) {
                int i4 = 0 / 0;
            }
            int i5 = i3 + 97;
            notify = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            function1 = null;
        }
        this(function1);
    }

    public static final /* synthetic */ Function1 b(getItemView getitemview) {
        int i = 2 % 2;
        int i2 = notify + 37;
        f949a = i2 % 128;
        int i3 = i2 % 2;
        Function1<CodeNamePair, Unit> function1 = getitemview.b;
        if (i3 == 0) {
            return function1;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getItemView(Function1<? super CodeNamePair, Unit> function1) {
        this.b = function1;
        final getItemView getitemview = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<flagActionItems>() { // from class: com.bpjstku.presentation.country.ListDialCodeBottomSheetFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, flagActionItems] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ flagActionItems invoke() {
                LifecycleOwner lifecycleOwner = getitemview;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(flagActionItems.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getMenuView
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (setId) getItemView.b(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2079160642, objArr, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2079160642, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        this.d = CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: getItemView$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LgetItemView$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p0", "Lkotlin/Function1;", "", "p1", "LgetItemView;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/domain/general/model/CodeNamePair;Lkotlin/jvm/functions/Function1;)LgetItemView;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getItemView TuitionPaymentFragmentspecialinlinedviewModeldefault1(CodeNamePair p0, Function1<? super CodeNamePair, Unit> p1) {
            getItemView getitemview = new getItemView(p1);
            Bundle bundle = new Bundle();
            if (p0 != null) {
                bundle.putParcelable("key_dial_code", p0);
            }
            getitemview.setArguments(bundle);
            return getitemview;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        FragmentListDialCodeBottomSheetBinding fragmentListDialCodeBottomSheetBindingInflate;
        int i = 2 % 2;
        int i2 = f949a + 87;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            fragmentListDialCodeBottomSheetBindingInflate = FragmentListDialCodeBottomSheetBinding.inflate(p0, p1, false);
            this.TuitionPaymentFragmentbindingInflater1 = fragmentListDialCodeBottomSheetBindingInflate;
            if (fragmentListDialCodeBottomSheetBindingInflate == null) {
                int i3 = f949a + 15;
                notify = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = notify + 101;
                f949a = i5 % 128;
                int i6 = i5 % 2;
                fragmentListDialCodeBottomSheetBindingInflate = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            fragmentListDialCodeBottomSheetBindingInflate = FragmentListDialCodeBottomSheetBinding.inflate(p0, p1, false);
            this.TuitionPaymentFragmentbindingInflater1 = fragmentListDialCodeBottomSheetBindingInflate;
            if (fragmentListDialCodeBottomSheetBindingInflate == null) {
                int i7 = f949a + 15;
                notify = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i9 = notify + 101;
                f949a = i9 % 128;
                int i10 = i9 % 2;
                fragmentListDialCodeBottomSheetBindingInflate = null;
            }
        }
        LinearLayout root = fragmentListDialCodeBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x018f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0190  */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 17;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 2624 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (asBinder ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 481, Color.rgb(0, 0, 0) + 16777253, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $10 + 115;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 81;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39421 - Process.getGidForName("")), 481 - View.MeasureSpec.getSize(0), 37 - (ViewConfiguration.getEdgeSlop() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39422), 481 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.alpha(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        CodeNamePair codeNamePair;
        int i = 2 % 2;
        int i2 = f949a + 29;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getTouchSlop() >> 8) + 40, 'C' - AndroidCharacter.getMirror('0'), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        Object obj = null;
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(new char[]{54242, 39016, 17645, 12670, 65016, 43635, 5881, 49934, 36804, 29789, 8351, 60775, 22982, 1585, 62129, 48941, 27582, 53269, 40117, 18739, 13700, 57857}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19332, objArr);
        int i5 = 0;
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(new char[]{54246, 11070, 8768, 14720, 12468, 4083, 1793, 7782, 5486, 27835, 27589, 25356, 31270, 29043, 18568}, 63697 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 184;
        long j2 = -1;
        long j3 = j2 ^ 3123197804407857404L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = jIdentityHashCode ^ j2;
        long j5 = (((long) (-183)) * 3123197804407857404L) + (((long) 185) * (-1025940629665898417L)) + ((((j3 | (-1025940629665898417L)) ^ j2) | ((j4 | (-1025940629665898417L)) ^ j2)) * j) + (((long) (-184)) * (jIdentityHashCode | (((j2 ^ (-1025940629665898417L)) | 3123197804407857404L) ^ j2))) + (j * ((j3 | j4) ^ j2));
        int i6 = 0;
        long j6 = jLongValue;
        while (true) {
            if (i6 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37836), Color.rgb(i5, i5, i5) + 16777275, TextUtils.getCapsMode("", i5, i5) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(obj);
                int i8 = i5;
                long j7 = j6;
                while (true) {
                    for (int i9 = i5; i9 != 8; i9++) {
                        i7 = (((((int) (j7 >> i9)) & 255) + (i7 << 6)) + (i7 << 16)) - i7;
                    }
                    if (i8 != 0) {
                        break;
                    }
                    int i10 = notify;
                    int i11 = i10 + 25;
                    f949a = i11 % 128;
                    int i12 = i11 % 2;
                    i8++;
                    int i13 = i10 + 29;
                    f949a = i13 % 128;
                    int i14 = i13 % 2;
                    j7 = j5;
                    i5 = 0;
                }
                if (i7 != i4) {
                    int i15 = f949a + 89;
                    int i16 = i15 % 128;
                    notify = i16;
                    int i17 = i15 % 2;
                    j6 -= 1024;
                    i6++;
                    int i18 = i16 + 3;
                    f949a = i18 % 128;
                    int i19 = i18 % 2;
                    obj = null;
                    i5 = 0;
                }
            } else {
                Object[] objArr3 = new Object[1];
                c(new char[]{54249, 52623, 61231, 34981, 43545, 19406, 25964, 1814, 8332, 49784, 58258, 40277, 48876, 22654, 31248, 7053}, 7789 - KeyEvent.getDeadChar(0, 0), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{54250, 12316, 5136, 30748, 23579, 40973, 33813, 59431, 52243, 53297, 13374, 6178, 31748, 16467, 42077, 34899}, 58363 - View.getDefaultSize(0, 0), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {83201859};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 46039), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1134, (-16777198) - Color.rgb(0, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1996876122, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1032;
                        int i20 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte b = $$a[7];
                        byte b2 = b;
                        Object[] objArr7 = new Object[1];
                        e(b, b2, b2, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iLastIndexOf, i20, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45993), (ViewConfiguration.getPressedStateDuration() >> 16) + 1117, (-16777199) - Color.rgb(0, 0, 0)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                    int i21 = ((int[]) objArr8[1])[0];
                    int i22 = ((int[]) objArr8[3])[0];
                    if (i22 != i21) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[0];
                        if (strArr != null) {
                            int i23 = f949a + 29;
                            notify = i23 % 128;
                            int i24 = i23 % 2;
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        codeNamePair = null;
                        Toast.makeText((Context) null, i22 / (((i22 - 1) * i22) % 2), 0).show();
                        break;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            codeNamePair = null;
            break;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments != null ? (CodeNamePair) arguments.getParcelable(PlaceTypes.BANK) : codeNamePair;
            int i25 = notify + 51;
            f949a = i25 % 128;
            int i26 = i25 % 2;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        int i = 2 % 2;
        FragmentListDialCodeBottomSheetBinding fragmentListDialCodeBottomSheetBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentListDialCodeBottomSheetBinding == null) {
            int i2 = notify + 93;
            f949a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f949a + 79;
            notify = i4 % 128;
            int i5 = i4 % 2;
            fragmentListDialCodeBottomSheetBinding = null;
        }
        fragmentListDialCodeBottomSheetBinding.svSearchItem.setQueryHint("Cari Negara");
        setId setid = (setId) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        setid.d.clear();
        setid.notifyDataSetChanged();
        ((setId) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d);
        RecyclerView recyclerView = fragmentListDialCodeBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((setId) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        fragmentListDialCodeBottomSheetBinding.tvTitle.setText(getString(R.string.selection_contry));
        CodeNamePair codeNamePair = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (codeNamePair != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(codeNamePair);
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        FragmentListDialCodeBottomSheetBinding fragmentListDialCodeBottomSheetBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentListDialCodeBottomSheetBinding == null) {
            int i2 = f949a + 53;
            notify = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = notify + 33;
            f949a = i4 % 128;
            int i5 = i4 % 2;
            fragmentListDialCodeBottomSheetBinding = null;
        }
        SearchView searchView = fragmentListDialCodeBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: shouldIncludeItem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (String) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        int i = 2 % 2;
        final flagActionItems flagactionitems = (flagActionItems) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = flagactionitems.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(flagactionitems.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
        final Function1 function1 = new Function1() { // from class: createItemView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return flagActionItems.TuitionPaymentFragmentspecialinlinedviewModeldefault3(flagactionitems, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getId
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: expandItemActionView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return flagActionItems.TuitionPaymentFragmentspecialinlinedviewModeldefault1(flagactionitems, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: filterLeftoverView
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        flagactionitems.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = f949a + 65;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        int i = 2 % 2;
        ((flagActionItems) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: initForMenu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getItemView.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = notify + 123;
        f949a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CodeNamePair p0) {
        int i = 2 % 2;
        int i2 = notify + 47;
        f949a = i2 % 128;
        int i3 = i2 % 2;
        Iterable iterable = ((setId) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        Iterator it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int i5 = f949a + 47;
            notify = i5 % 128;
            FragmentListDialCodeBottomSheetBinding fragmentListDialCodeBottomSheetBinding = null;
            if (i5 % 2 == 0) {
                it.next();
                throw null;
            }
            Object next = it.next();
            if (i4 < 0) {
                int i6 = f949a + 29;
                notify = i6 % 128;
                if (i6 % 2 == 0) {
                    CollectionsKt.throwIndexOverflow();
                    fragmentListDialCodeBottomSheetBinding.hashCode();
                    throw null;
                }
                CollectionsKt.throwIndexOverflow();
            }
            lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) next;
            lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(p0.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b);
            ((setId) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d.set(i4, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
            if (Intrinsics.areEqual(p0.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b)) {
                FragmentListDialCodeBottomSheetBinding fragmentListDialCodeBottomSheetBinding2 = this.TuitionPaymentFragmentbindingInflater1;
                if (fragmentListDialCodeBottomSheetBinding2 == null) {
                    int i7 = f949a + 125;
                    notify = i7 % 128;
                    int i8 = i7 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    if (i8 == 0) {
                        throw null;
                    }
                } else {
                    fragmentListDialCodeBottomSheetBinding = fragmentListDialCodeBottomSheetBinding2;
                }
                RecyclerView recyclerView = fragmentListDialCodeBottomSheetBinding.rvItem;
                int i9 = i4 + 4;
                if (((setId) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d.size() <= i9 || i4 <= 4) {
                    i9 = i4;
                }
                recyclerView.scrollToPosition(i9);
            }
            i4++;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getItemView getitemview, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        FragmentListDialCodeBottomSheetBinding fragmentListDialCodeBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentListDialCodeBottomSheetBinding fragmentListDialCodeBottomSheetBinding2 = getitemview.TuitionPaymentFragmentbindingInflater1;
            if (fragmentListDialCodeBottomSheetBinding2 == null) {
                int i2 = notify + 53;
                f949a = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentListDialCodeBottomSheetBinding = fragmentListDialCodeBottomSheetBinding2;
            }
            MultiStateView multiStateView = fragmentListDialCodeBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = f949a + 89;
            notify = i4 % 128;
            int i5 = i4 % 2;
            FragmentListDialCodeBottomSheetBinding fragmentListDialCodeBottomSheetBinding3 = getitemview.TuitionPaymentFragmentbindingInflater1;
            if (fragmentListDialCodeBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentListDialCodeBottomSheetBinding = fragmentListDialCodeBottomSheetBinding3;
            }
            MultiStateView multiStateView2 = fragmentListDialCodeBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((CodeNamePair) it.next()));
            }
            getitemview.d = arrayList;
            setId setid = (setId) getitemview.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            setid.d.clear();
            setid.notifyDataSetChanged();
            ((setId) getitemview.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(getitemview.d);
            CodeNamePair codeNamePair = getitemview.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (codeNamePair != null) {
                int i6 = notify + 19;
                f949a = i6 % 128;
                if (i6 % 2 != 0) {
                    getitemview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(codeNamePair);
                    int i7 = 22 / 0;
                } else {
                    getitemview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(codeNamePair);
                }
            }
            int i8 = f949a + 27;
            notify = i8 % 128;
            int i9 = i8 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentListDialCodeBottomSheetBinding fragmentListDialCodeBottomSheetBinding4 = getitemview.TuitionPaymentFragmentbindingInflater1;
            if (fragmentListDialCodeBottomSheetBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentListDialCodeBottomSheetBinding = fragmentListDialCodeBottomSheetBinding4;
            }
            MultiStateView multiStateView3 = fragmentListDialCodeBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getItemView getitemview, String str) {
        int i = 2 % 2;
        setId setid = (setId) getitemview.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (str == null) {
            int i2 = f949a + 7;
            notify = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        setid.b(str);
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 115;
        f949a = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        getItemView getitemview = (getItemView) objArr[0];
        int i = 2 % 2;
        Context contextRequireContext = getitemview.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        setId setid = new setId(contextRequireContext, null, new ListDialCodeBottomSheetFragment$dialCodeAdapter$2$1(getitemview), 2, null);
        int i2 = notify + 107;
        f949a = i2 % 128;
        if (i2 % 2 == 0) {
            return setid;
        }
        throw null;
    }

    public static /* synthetic */ setId TuitionPaymentFragmentspecialinlinedviewModeldefault2(getItemView getitemview) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (setId) b(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2079160642, new Object[]{getitemview}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -2079160642, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    static {
        onTransact = 0;
        asInterface();
        INSTANCE = new Companion(null);
        int i = cancel + 99;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getItemView() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ void b(getItemView getitemview, CodeNamePair codeNamePair) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1675676915, new Object[]{getitemview, codeNamePair}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1675676914, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f949a + 57;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        f949a = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.fragment_list_dial_code_bottom_sheet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void asInterface() {
        asBinder = -8330325998499169640L;
    }
}
