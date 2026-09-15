package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import com.bpjstku.presentation.partner.ProvinceBottomSheetDialogFragment$handleItemClicked$1;
import com.bpjstku.presentation.partner.ProvinceBottomSheetDialogFragment$provinceAdapter$2$1;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onSuggestionClick;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0010\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0015\u0010\"\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001a\u0010\u0012\u001a\u00020#8\u0015X\u0095D¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001b\u0010%R\u0016\u0010\u0019\u001a\u00020&8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0010\u0010'"}, d2 = {"LcreateServiceIntent;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lkotlin/jvm/functions/Function1;", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "a", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asBinder", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "LonSuggestionClick;", "Lkotlin/Lazy;", "LunbindAllConnections;", "asInterface", "TuitionPaymentFragmentbindingInflater1", "", "I", "()I", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class createServiceIntent extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancelAll;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private final Function1<CodeNamePair, Unit> b;
    private static final byte[] $$c = {81, -102, -70, -91};
    private static final int $$f = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {43, 23, 22, -14, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 11, 7, -15, 1, 6, 16, -5, 11, -6, -3, 73, -73, 3, 16, -1, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$e = 4;
    private static final byte[] $$a = {102, -96, -78, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 99;
    private static int INotificationSideChannel = 0;
    private static int notify = 0;
    private static int cancel = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = i6 | i9;
        int i11 = (~(i7 | i6)) | i9 | (~(i8 | i6));
        int i12 = ~((~i6) | i3 | i5);
        int i13 = i3 + i5 + i + ((-2027816600) * i4) + ((-1234684791) * i2);
        int i14 = i13 * i13;
        int i15 = (i3 * (-132237830)) + 1711013888 + ((-132237830) * i5) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i) + (811597824 * i4) + (1100742656 * i2) + (1751056384 * i14);
        int i16 = ((i3 * 572746074) - 905264446) + (i5 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i * 572745585) + (i4 * 982511336) + (i2 * (-774025351)) + (i14 * 1257177088);
        return i15 + ((i16 * i16) * 1874919424) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
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
    private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.createServiceIntent.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r1 = r5 + 1
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r0[r7]
        L28:
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.createServiceIntent.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r8 = r8 * 5
            int r8 = r8 + 48
            int r9 = r9 * 47
            int r9 = 50 - r9
            byte[] r0 = defpackage.createServiceIntent.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + 3
            r9 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.createServiceIntent.f(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ createServiceIntent(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = notify;
            int i3 = i2 + 67;
            cancel = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 57;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            function1 = null;
        }
        this(function1);
    }

    public static final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1(createServiceIntent createserviceintent) {
        int i = 2 % 2;
        int i2 = notify + 87;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Function1<CodeNamePair, Unit> function1 = createserviceintent.b;
        if (i3 != 0) {
            return function1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(createServiceIntent createserviceintent, CodeNamePair codeNamePair) {
        int i = 2 % 2;
        createserviceintent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = codeNamePair;
        Object obj = null;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ProvinceBottomSheetDialogFragment$handleItemClicked$1(createserviceintent, codeNamePair, null), 3, null);
        int i2 = notify + 69;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public createServiceIntent(Function1<? super CodeNamePair, Unit> function1) {
        this.b = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CollectionsKt.emptyList();
        final createServiceIntent createserviceintent = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<onSuggestionClick>() { // from class: com.bpjstku.presentation.partner.ProvinceBottomSheetDialogFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, onSuggestionClick] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ onSuggestionClick invoke() {
                LifecycleOwner lifecycleOwner = createserviceintent;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(onSuggestionClick.class);
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
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: TrustedWebActivityServiceConnectionResultArgs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return createServiceIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        this.g = R.layout.fragment_general_list_bottom_sheet;
    }

    /* JADX INFO: renamed from: createServiceIntent$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LcreateServiceIntent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p0", "Lkotlin/Function1;", "", "p1", "LcreateServiceIntent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/domain/general/model/CodeNamePair;Lkotlin/jvm/functions/Function1;)LcreateServiceIntent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static createServiceIntent TuitionPaymentFragmentspecialinlinedviewModeldefault1(CodeNamePair p0, Function1<? super CodeNamePair, Unit> p1) {
            createServiceIntent createserviceintent = new createServiceIntent(p1);
            Bundle bundle = new Bundle();
            if (p0 != null) {
                bundle.putParcelable("key_province_partner", p0);
            }
            createserviceintent.setArguments(bundle);
            return createserviceintent;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getD() {
        int i = 2 % 2;
        int i2 = cancel + 53;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        int i5 = this.g;
        int i6 = i3 + 49;
        cancel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 75 / 0;
        }
        return i5;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        createServiceIntent createserviceintent = (createServiceIntent) objArr[0];
        LayoutInflater layoutInflater = (LayoutInflater) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        int i = 2 % 2;
        int i2 = notify + 115;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(layoutInflater, viewGroup, false);
        createserviceintent.a = fragmentGeneralListBottomSheetBindingInflate;
        if (fragmentGeneralListBottomSheetBindingInflate == null) {
            int i4 = cancel + 89;
            notify = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBindingInflate = null;
        }
        LinearLayout root = fragmentGeneralListBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[PHI: r1
  0x0024: PHI (r1v9 android.os.Bundle) = (r1v8 android.os.Bundle), (r1v17 android.os.Bundle) binds: [B:10:0x0022, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments;
        CodeNamePair codeNamePair;
        int i = 2 % 2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            int i2 = cancel + 81;
            notify = i2 % 128;
            if (i2 % 2 != 0) {
                arguments = getArguments();
                int i3 = 88 / 0;
                if (arguments != null) {
                    codeNamePair = (CodeNamePair) arguments.getParcelable("key_province_partner");
                    int i4 = notify + 55;
                    cancel = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    int i6 = cancel + 97;
                    notify = i6 % 128;
                    int i7 = i6 % 2;
                    codeNamePair = null;
                }
            } else {
                arguments = getArguments();
                if (arguments != null) {
                    codeNamePair = (CodeNamePair) arguments.getParcelable("key_province_partner");
                    int i8 = notify + 55;
                    cancel = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    int i10 = cancel + 97;
                    notify = i10 % 128;
                    int i11 = i10 % 2;
                    codeNamePair = null;
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = codeNamePair;
        }
        int i12 = cancel + 119;
        notify = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        int i = 2 % 2;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.a;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = null;
        if (fragmentGeneralListBottomSheetBinding == null) {
            int i2 = cancel + 47;
            notify = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = this.a;
        if (fragmentGeneralListBottomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding3 = null;
        }
        fragmentGeneralListBottomSheetBinding3.rvItem.setAdapter((unbindAllConnections) this.TuitionPaymentFragmentbindingInflater1.getValue());
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = this.a;
        if (fragmentGeneralListBottomSheetBinding4 == null) {
            int i4 = notify + 39;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                throw null;
            }
        } else {
            fragmentGeneralListBottomSheetBinding2 = fragmentGeneralListBottomSheetBinding4;
        }
        fragmentGeneralListBottomSheetBinding2.tvTitle.setText(getString(R.string.label_province));
        int i6 = cancel + 105;
        notify = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify + 61;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.a;
        if (fragmentGeneralListBottomSheetBinding == null) {
            int i5 = i3 + 121;
            notify = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: lambdaconnect0androidxbrowsertrustedTrustedWebActivityServiceConnectionPool
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return createServiceIntent.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (String) obj);
            }
        });
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        createServiceIntent createserviceintent = (createServiceIntent) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 49;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            ((onSuggestionClick) createserviceintent.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw null;
        }
        ((onSuggestionClick) createserviceintent.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        int i = 2 % 2;
        ((onSuggestionClick) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).f1311a.observe(getViewLifecycleOwner(), new Observer() { // from class: TrustedWebActivityServiceConnectionNotificationsEnabledArgs
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                createServiceIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancel + 97;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(g)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 3291 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 31 - TextUtils.getOffsetAfter("", 0), 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int keyRepeatDelay = 651 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i6 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43;
                    byte b3 = (byte) ($$f & 3);
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, keyRepeatDelay, i6, -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 23;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (!(!z)) {
            int i9 = $11 + 81;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $10 + 63;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cBlue = (char) Color.blue(0);
                        int mode = View.MeasureSpec.getMode(0) + 651;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 44;
                        byte b5 = (byte) ($$f & 3);
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, mode, iMakeMeasureSpec, -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int i11 = 651 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 44;
                        byte b7 = (byte) ($$f & 3);
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i11, maxKeyCode, -450685997, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
        int i12 = $10 + 3;
        $11 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(createServiceIntent createserviceintent, String str) {
        int i = 2 % 2;
        int i2 = cancel + 115;
        notify = i2 % 128;
        int i3 = i2 % 2;
        unbindAllConnections unbindallconnections = (unbindAllConnections) createserviceintent.TuitionPaymentFragmentbindingInflater1.getValue();
        if (str == null) {
            int i4 = cancel + 39;
            int i5 = i4 % 128;
            notify = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 73;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            str = "";
        }
        unbindallconnections.TuitionPaymentFragmentbindingInflater1(str);
        Unit unit = Unit.INSTANCE;
        int i9 = notify + 73;
        cancel = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(createServiceIntent createserviceintent) {
        int i = 2 % 2;
        int i2 = notify + 61;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ((onSuggestionClick) createserviceintent.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 41;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0709 A[PHI: r7
  0x0709: PHI (r7v92 com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding) = 
  (r7v81 com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding)
  (r7v93 com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding)
 binds: [B:88:0x06fa, B:85:0x06f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final createServiceIntent createserviceintent, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        Object[] objArr;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding;
        int i = 2 % 2;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = createserviceintent.a;
            if (fragmentGeneralListBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding2 = fragmentGeneralListBottomSheetBinding3;
            }
            MultiStateView multiStateView = fragmentGeneralListBottomSheetBinding2.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = createserviceintent.a;
            if (fragmentGeneralListBottomSheetBinding4 == null) {
                int i2 = notify + 9;
                cancel = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding2 = fragmentGeneralListBottomSheetBinding4;
            }
            MultiStateView multiStateView2 = fragmentGeneralListBottomSheetBinding2.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView2, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, createserviceintent.getString(R.string.error_error_occured), null, new Pair(createserviceintent.getString(R.string.action_retry), new Function0() { // from class: TrustedWebActivityServiceConnectionPool
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return createServiceIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                }
            }));
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding5 = createserviceintent.a;
            if (fragmentGeneralListBottomSheetBinding5 == null) {
                int i4 = notify + 15;
                cancel = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentGeneralListBottomSheetBinding5 = null;
            }
            MultiStateView multiStateView3 = fragmentGeneralListBottomSheetBinding5.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            multiStateView3.setViewState(MultiStateView.ViewState.CONTENT);
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((CodeNamePair) it.next()));
            }
            createserviceintent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayList;
            unbindAllConnections unbindallconnections = (unbindAllConnections) createserviceintent.TuitionPaymentFragmentbindingInflater1.getValue();
            unbindallconnections.d.clear();
            unbindallconnections.notifyDataSetChanged();
            ((unbindAllConnections) createserviceintent.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(createserviceintent.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                int i6 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                byte[] bArr = $$a;
                byte b = bArr[80];
                Object[] objArr2 = new Object[1];
                c(b, b, bArr[37], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, i6, doubleTapTimeout, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 294, 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, new char[]{65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t'}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(false, 299 - Gravity.getAbsoluteGravity(0, 0), 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 4 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char longPressTimeout = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int iIndexOf = 921 - TextUtils.indexOf("", "", 0);
                int i7 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b2 = $$a[37];
                Object[] objArr5 = new Object[1];
                c((byte) 52, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, iIndexOf, i7, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i8 = notify + 3;
                cancel = i8 % 128;
                int i9 = i8 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
                    int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    c((byte) 37, bArr2[37], bArr2[80], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iIndexOf2, maxKeyCode, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iMyPid = Process.myPid();
                int i10 = (((1953390499 + (((~((-1033329553) | iMyPid)) | 738611968) * 104)) + ((~((~iMyPid) | 1035467675)) * (-104))) + ((iMyPid | 740750091) * 104)) - 2026070562;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 295, 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f'}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(false, (ViewConfiguration.getTapTimeout() >> 16) + 302, 17 - TextUtils.lastIndexOf("", '0', 0), Color.rgb(0, 0, 0) + 16777225, new char[]{6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                e(false, 294 - View.resolveSize(0, 0), 16 - Color.green(0), 8 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{'\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(true, Color.rgb(0, 0, 0) + 16777514, 16 - Color.blue(0), MotionEvent.axisFromString("") + 12, new char[]{'\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, createserviceintent)).intValue()), 0, -2026070562};
                    byte b3 = (byte) ($$e - 4);
                    byte[] bArr3 = $$d;
                    Object[] objArr13 = new Object[1];
                    f(b3, b3, bArr3[39], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b4 = bArr3[39];
                    byte b5 = b4;
                    Object[] objArr14 = new Object[1];
                    f(b4, b5, (byte) (b5 - 1), objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 31533);
                        int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                        int iAlpha = Color.alpha(0) + 28;
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((byte) 37, bArr4[37], bArr4[80], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, modifierMetaStateMask2, iAlpha, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(true, 295 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 22, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, new char[]{65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t'}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(false, 299 - View.resolveSizeAndState(0, 0, 0), MotionEvent.axisFromString("") + 16, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921;
                            int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                            byte b6 = $$a[37];
                            Object[] objArr19 = new Object[1];
                            c((byte) 52, b6, b6, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, doubleTapTimeout2, modifierMetaStateMask3, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (31534 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int i13 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
                            byte[] bArr5 = $$a;
                            byte b7 = bArr5[80];
                            Object[] objArr20 = new Object[1];
                            c(b7, b7, bArr5[37], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i13, packedPositionType, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i14 = ((int[]) objArr[1])[0];
            int i15 = ((int[]) objArr[3])[0];
            if (i15 == i14) {
                int i16 = cancel + 103;
                notify = i16 % 128;
                int i17 = i16 % 2;
                int i18 = ((int[]) objArr[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i19 = ~((-290295991) | iUptimeMillis);
                int i20 = (-2105435929) + ((17629202 | i19) * (-280)) + ((i19 | (~((-1483783654) | iUptimeMillis))) * 140);
                int i21 = ~((-272666789) | iUptimeMillis);
                int i22 = ~iUptimeMillis;
                int i23 = i18 + i20 + (((~(i22 | (-1211116866))) | i21 | (~((-17629203) | i22))) * 140);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr21[0])[0] = i25 ^ (i25 << 5);
            } else {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        int i26 = cancel + 81;
                        notify = i26 % 128;
                        int i27 = i26 % 2;
                        arrayList2.add(str);
                    }
                }
                Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
                int i28 = ((int[]) objArr[0])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iMyPid2 = Process.myPid();
                int i29 = i28 + (-494165136) + ((~((-1362362641) | iMyPid2)) * 623) + (((~iMyPid2) | 602123) * (-623)) + (((~(iMyPid2 | 206159563)) | (~((-1567920081) | iMyPid2)) | 1362362640) * 623);
                int i30 = (i29 << 13) ^ i29;
                int i31 = i30 ^ (i30 >>> 17);
                ((int[]) objArr22[0])[0] = i31 ^ (i31 << 5);
            }
            CodeNamePair codeNamePair = createserviceintent.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (codeNamePair != null) {
                Iterable iterable = ((unbindAllConnections) createserviceintent.TuitionPaymentFragmentbindingInflater1.getValue()).d;
                Intrinsics.checkNotNullExpressionValue(iterable, "");
                int i32 = 0;
                for (Object obj : iterable) {
                    if (i32 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
                    lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b);
                    ((unbindAllConnections) createserviceintent.TuitionPaymentFragmentbindingInflater1.getValue()).d.set(i32, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
                    if (Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b)) {
                        int i33 = cancel;
                        int i34 = i33 + 15;
                        notify = i34 % 128;
                        if (i34 % 2 != 0) {
                            fragmentGeneralListBottomSheetBinding = createserviceintent.a;
                            int i35 = 22 / 0;
                            if (fragmentGeneralListBottomSheetBinding == null) {
                                int i36 = i33 + 3;
                                notify = i36 % 128;
                                int i37 = i36 % 2;
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                fragmentGeneralListBottomSheetBinding = null;
                            }
                        } else {
                            fragmentGeneralListBottomSheetBinding = createserviceintent.a;
                            if (fragmentGeneralListBottomSheetBinding == null) {
                                int i38 = i33 + 3;
                                notify = i38 % 128;
                                int i39 = i38 % 2;
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                fragmentGeneralListBottomSheetBinding = null;
                            }
                        }
                        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
                        int i40 = i32 + 4;
                        if (((unbindAllConnections) createserviceintent.TuitionPaymentFragmentbindingInflater1.getValue()).d.size() <= i40 || i32 <= 4) {
                            i40 = i32;
                        }
                        recyclerView.scrollToPosition(i40);
                    }
                    i32++;
                }
            }
        }
    }

    public static /* synthetic */ unbindAllConnections TuitionPaymentFragmentspecialinlinedviewModeldefault3(createServiceIntent createserviceintent) {
        int i = 2 % 2;
        Context contextRequireContext = createserviceintent.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        unbindAllConnections unbindallconnections = new unbindAllConnections(contextRequireContext, null, new ProvinceBottomSheetDialogFragment$provinceAdapter$2$1(createserviceintent), 2, null);
        int i2 = notify + 81;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return unbindallconnections;
    }

    static {
        cancelAll = 1;
        asInterface();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 105;
        cancelAll = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public createServiceIntent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, -912344063, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 912344064, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (View) TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this, p0, p1, p2}, -1068189526, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1068189526, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static void asInterface() {
        g = -83722330;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = defpackage.createServiceIntent.$$c
            int r6 = 120 - r6
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r3 = r3 + 1
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.createServiceIntent.$$g(short, int, int):java.lang.String");
    }
}
