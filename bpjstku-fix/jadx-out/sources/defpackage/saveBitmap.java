package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.membership.registration.model.Job;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.JobBottomSheetDialogFragment$handleItemClicked$1;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.JobBottomSheetDialogFragment$jobAdapter$2$1;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getImeOptions;
import defpackage.mapPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0015\u0010\u0019\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0015\u0010\u0015\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c0\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0012\u001a\u00020\"8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b\u0019\u0010$R\u0016\u0010\u001d\u001a\u00020%8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b!\u0010&"}, d2 = {"LsaveBitmap;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lkotlin/jvm/functions/Function1;", "LsetContentInsetsAbsolute;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetImeOptions;", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "asBinder", "Ljava/util/List;", "a", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "TuitionPaymentFragmentbindingInflater1", "", "I", "()I", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class saveBitmap extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Job TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Job>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int g;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<Job, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public /* synthetic */ saveBitmap(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public saveBitmap(Function1<? super Job, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: BrowserServiceFileProviderFileCleanupTask
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return saveBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            }
        });
        final saveBitmap savebitmap = this;
        this.b = LazyKt.lazy(new Function0<getImeOptions>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.JobBottomSheetDialogFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getImeOptions, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getImeOptions invoke() {
                ComponentCallbacks componentCallbacks = savebitmap;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getImeOptions.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = CollectionsKt.emptyList();
        this.g = R.layout.fragment_general_list_bottom_sheet;
    }

    /* JADX INFO: renamed from: saveBitmap$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LsaveBitmap$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "p0", "Lkotlin/Function1;", "", "p1", "LsaveBitmap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/presentation/membership/registration/model/Job;Lkotlin/jvm/functions/Function1;)LsaveBitmap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static saveBitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(Job p0, Function1<? super Job, Unit> p1) {
            saveBitmap savebitmap = new saveBitmap(p1);
            Bundle bundle = new Bundle();
            if (p0 != null) {
                bundle.putParcelable("job", p0);
            }
            savebitmap.setArguments(bundle);
            return savebitmap;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getG() {
        return this.g;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(p0, p1, false);
        this.asBinder = fragmentGeneralListBottomSheetBindingInflate;
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
            this.TuitionPaymentFragmentbindingInflater1 = arguments != null ? (Job) arguments.getParcelable("job") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        TuitionPaymentFragmentbindingInflater1();
        setContentInsetsAbsolute setcontentinsetsabsolute = (setContentInsetsAbsolute) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        setcontentinsetsabsolute.d.clear();
        setcontentinsetsabsolute.notifyDataSetChanged();
        ((setContentInsetsAbsolute) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.asBinder;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = null;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((setContentInsetsAbsolute) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = this.asBinder;
        if (fragmentGeneralListBottomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentGeneralListBottomSheetBinding2 = fragmentGeneralListBottomSheetBinding3;
        }
        fragmentGeneralListBottomSheetBinding2.tvTitle.setText(getString(R.string.label_job));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.asBinder;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: saveFileIfNeededBlocking
            private static final byte[] $$c = {Base64.padSymbol, -108, 49, -100};
            private static final int $$f = 79;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {49, 84, -120, 101, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -17, -12, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -70};
            private static final int $$e = 3;
            private static final byte[] $$a = {19, 78, 114, 113, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 174;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static int b = -83722477;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.saveFileIfNeededBlocking.$$a
                    int r7 = r7 * 3
                    int r7 = r7 + 84
                    int r8 = r8 * 15
                    int r1 = r8 + 38
                    int r6 = r6 + 4
                    byte[] r1 = new byte[r1]
                    int r8 = r8 + 37
                    r2 = 0
                    if (r0 != 0) goto L17
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r6 = r6 + 1
                    r3 = r0[r6]
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L2e:
                    int r3 = -r3
                    int r6 = r6 + r3
                    int r6 = r6 + (-11)
                    r3 = r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.saveFileIfNeededBlocking.a(byte, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r5, int r6, short r7, java.lang.Object[] r8) {
                /*
                    int r5 = r5 * 4
                    int r5 = r5 + 49
                    int r7 = r7 * 48
                    int r7 = r7 + 4
                    int r6 = r6 * 15
                    int r6 = r6 + 84
                    byte[] r0 = defpackage.saveFileIfNeededBlocking.$$d
                    byte[] r1 = new byte[r5]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r4 = r7
                    r3 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r5) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L26:
                    r4 = r0[r7]
                L28:
                    int r7 = r7 + 1
                    int r6 = r6 + r4
                    int r6 = r6 + 3
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.saveFileIfNeededBlocking.d(int, int, short, java.lang.Object[]):void");
            }

            private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3291, (ViewConfiguration.getFadingEdgeLength() >> 16) + 31, 1199271174, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 651 - (ViewConfiguration.getWindowTouchSlop() >> 8), 44 - TextUtils.getTrimmedLength(""), -450685997, false, $$g(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (i3 > 0) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (z) {
                    int i6 = $11 + 31;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i8 = $11 + 31;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * i2];
                            Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "") + 651, Color.green(0) + 44, -450685997, false, $$g(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } else {
                            cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                            Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = (byte) (b8 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 650 - Process.getGidForName(""), 44 - View.resolveSizeAndState(0, 0, 0), -450685997, false, $$g(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        }
                    }
                    int i9 = $10 + 87;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int i;
                Object[] objArr;
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                int i5 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (43043 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 3112;
                    int iRgb = (-16777194) - Color.rgb(0, 0, 0);
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[132], bArr[7], bArr[5], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, iRgb, -1272852037, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(true, KeyEvent.getDeadChar(0, 0) + 212, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, 5 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(true, 216 - (KeyEvent.getMaxKeyCode() >> 16), 15 - Color.argb(0, 0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14, new char[]{65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cKeyCodeFromString = (char) (43042 - KeyEvent.keyCodeFromString(""));
                    int offsetBefore = 3111 - TextUtils.getOffsetBefore("", 0);
                    i = 22;
                    int windowTouchSlop = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr2 = $$a;
                    Object[] objArr5 = new Object[1];
                    a((byte) 51, bArr2[7], bArr2[5], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, offsetBefore, windowTouchSlop, -1269618118, false, (String) objArr5[0], null);
                } else {
                    i = 22;
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43043);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 3111;
                        int i6 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b2 = $$a[7];
                        Object[] objArr6 = new Object[1];
                        a((byte) 103, b2, b2, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, trimmedLength, i6, 154975793, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i7 = ((int[]) objArr7[2])[0];
                    int i8 = ((int[]) objArr7[1])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i9 = ((~((~iIdentityHashCode) | (-403743761))) * 130) + 93323390 + (((~(iIdentityHashCode | (-403743761))) | 5112514) * 130) + 1850895160;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                    objArr = new Object[]{new int[1], new int[]{i8}, new int[]{i7}, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    c(true, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 211, 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 4, new char[]{20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(false, 215 - (ViewConfiguration.getScrollBarSize() >> 8), 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 14, new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, objArr9);
                    try {
                        Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1850895160};
                        byte b3 = (byte) ($$e - 3);
                        byte[] bArr3 = $$d;
                        byte b4 = (byte) (-bArr3[35]);
                        Object[] objArr11 = new Object[1];
                        d(b3, b4, (byte) (b4 - 1), objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b5 = bArr3[35];
                        byte b6 = (byte) (-b5);
                        Object[] objArr12 = new Object[1];
                        d(b6, (byte) (b6 - 1), (byte) (-b5), objArr12);
                        objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 43042);
                            int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3110;
                            int iAlpha = Color.alpha(0) + 22;
                            byte b7 = $$a[7];
                            Object[] objArr13 = new Object[1];
                            a((byte) 103, b7, b7, objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, i12, iAlpha, 154975793, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            char[] cArr = new char[i];
                            // fill-array-data instruction
                            cArr[0] = 6;
                            cArr[1] = '\f';
                            cArr[2] = 15;
                            cArr[3] = 1;
                            cArr[4] = 11;
                            cArr[5] = 65534;
                            cArr[6] = '\b';
                            cArr[7] = 0;
                            cArr[8] = '\f';
                            cArr[9] = '\t';
                            cArr[10] = 65504;
                            cArr[11] = '\n';
                            cArr[12] = 2;
                            cArr[13] = 17;
                            cArr[14] = 16;
                            cArr[15] = 22;
                            cArr[16] = 65520;
                            cArr[17] = 65483;
                            cArr[18] = 16;
                            cArr[19] = '\f';
                            cArr[20] = 65483;
                            cArr[21] = 1;
                            Object[] objArr14 = new Object[1];
                            c(true, View.resolveSizeAndState(0, 0, 0) + 212, ExpandableListView.getPackedPositionType(0L) + 22, 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), cArr, objArr14);
                            Class<?> cls4 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            c(true, 216 - (ViewConfiguration.getFadingEdgeLength() >> 16), 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 15, new char[]{65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534}, objArr15);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char packedPositionType = (char) (43042 - ExpandableListView.getPackedPositionType(0L));
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 3111;
                                int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte[] bArr4 = $$a;
                                Object[] objArr16 = new Object[1];
                                a((byte) 51, bArr4[7], bArr4[5], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, deadChar, keyRepeatTimeout, -1269618118, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042);
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 3111;
                                int bitsPerPixel = 21 - ImageFormat.getBitsPerPixel(0);
                                byte[] bArr5 = $$a;
                                Object[] objArr17 = new Object[1];
                                a(bArr5[132], bArr5[7], bArr5[5], objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iNormalizeMetaState, bitsPerPixel, -1272852037, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i13 = ((int[]) objArr[1])[0];
                int i14 = ((int[]) objArr[2])[0];
                if (i14 != i13) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) objArr[3];
                    if (strArr2 != null) {
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                        int i16 = i15 % 2;
                        while (i5 < strArr2.length) {
                            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                            if (i17 % 2 == 0) {
                                arrayList.add(strArr2[i5]);
                                i5 += 47;
                            } else {
                                arrayList.add(strArr2[i5]);
                                i5++;
                            }
                        }
                    }
                    throw new RuntimeException(String.valueOf(i14));
                }
                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                int i19 = i18 % 2;
                int i20 = ((int[]) objArr[0])[0];
                int i21 = ((int[]) objArr[2])[0];
                int i22 = ((int[]) objArr[1])[0];
                String[] strArr3 = (String[]) objArr[3];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i23 = i20 + (-1294310594) + (((~((-675563300) | (~iIdentityHashCode2))) | (-1029468160)) * (-591)) + ((iIdentityHashCode2 | (-675563300)) * 591);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr[0])[0] = i25 ^ (i25 << 5);
                Object[] objArr18 = {new int[1], new int[]{i22}, new int[]{i21}, strArr3};
                int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
                if (i26 % 2 != 0) {
                    return saveBitmap.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (String) obj);
                }
                int i27 = 58 / 0;
                return saveBitmap.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (String) obj);
            }

            private static String $$g(byte b2, short s, int i) {
                int i2 = 120 - s;
                int i3 = b2 * 4;
                byte[] bArr = $$c;
                int i4 = i + 4;
                byte[] bArr2 = new byte[1 - i3];
                int i5 = 0 - i3;
                int i6 = -1;
                if (bArr == null) {
                    i2 += -i4;
                    i4 = i4;
                    i6 = -1;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i2;
                    if (i7 == i5) {
                        return new String(bArr2, 0);
                    }
                    int i8 = i4 + 1;
                    i2 += -bArr[i8];
                    i4 = i8;
                    i6 = i7;
                }
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(saveBitmap savebitmap) {
        ((getImeOptions) savebitmap.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final saveBitmap savebitmap, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = savebitmap.asBinder;
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
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = savebitmap.asBinder;
            if (fragmentGeneralListBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentGeneralListBottomSheetBinding3 = null;
            }
            MultiStateView multiStateView2 = fragmentGeneralListBottomSheetBinding3.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            List<CodeNamePair> list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CodeNamePair codeNamePair : list) {
                arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy(new Job(codeNamePair.b, codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1)));
            }
            ((setContentInsetsAbsolute) savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList);
            Job job = savebitmap.TuitionPaymentFragmentbindingInflater1;
            if (job != null) {
                Iterable iterable = ((setContentInsetsAbsolute) savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d;
                Intrinsics.checkNotNullExpressionValue(iterable, "");
                int i = 0;
                for (Object obj : iterable) {
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
                    lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(job.TuitionPaymentFragmentbindingInflater1, ((Job) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentbindingInflater1);
                    ((setContentInsetsAbsolute) savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.set(i, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
                    if (Intrinsics.areEqual(job.TuitionPaymentFragmentbindingInflater1, ((Job) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentbindingInflater1)) {
                        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = savebitmap.asBinder;
                        if (fragmentGeneralListBottomSheetBinding4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            fragmentGeneralListBottomSheetBinding4 = null;
                        }
                        fragmentGeneralListBottomSheetBinding4.rvItem.scrollToPosition(i);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding5 = savebitmap.asBinder;
            if (fragmentGeneralListBottomSheetBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding5;
            }
            MultiStateView multiStateView3 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, savebitmap.getString(R.string.error_error_occured), null, new Pair(savebitmap.getString(R.string.action_retry), new Function0() { // from class: loadBitmap
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return saveBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }));
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(saveBitmap savebitmap, String str) {
        setContentInsetsAbsolute setcontentinsetsabsolute = (setContentInsetsAbsolute) savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (str == null) {
            str = "";
        }
        setcontentinsetsabsolute.TuitionPaymentFragmentbindingInflater1(str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ setContentInsetsAbsolute TuitionPaymentFragmentspecialinlinedviewModeldefault3(saveBitmap savebitmap) {
        Context contextRequireContext = savebitmap.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new setContentInsetsAbsolute(contextRequireContext, null, new JobBottomSheetDialogFragment$jobAdapter$2$1(savebitmap), 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(saveBitmap savebitmap, Job job) {
        savebitmap.TuitionPaymentFragmentbindingInflater1 = job;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new JobBottomSheetDialogFragment$handleItemClicked$1(savebitmap, job, null), 3, null);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((getImeOptions) this.b.getValue()).g.observe(getViewLifecycleOwner(), new Observer() { // from class: isImageFile
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                saveBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        ((getImeOptions) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public saveBitmap() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
