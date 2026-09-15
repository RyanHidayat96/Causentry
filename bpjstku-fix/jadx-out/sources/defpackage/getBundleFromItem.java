package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.BranchPioneerOfficeBottomSheetDialogFragment$chooseAddressPostalCodeAdapter$2$1;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.BranchPioneerOfficeBottomSheetDialogFragment$handleItemClicked$1;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.drawSelectorCompat;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.select;
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
import kotlin.io.encoding.Base64;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0016R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0015\u0010\u001a\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0015\u0010\u0015\u001a\u00020\u001b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001b\u0010\u0013\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"0!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010&R\u0016\u0010\u0014\u001a\u00020'8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010("}, d2 = {"LgetBundleFromItem;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", "Lkotlin/jvm/functions/Function1;", "LdrawSelectorCompat;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lselect;", "LcreateIntentFilterForBroadcastReceiver;", "TuitionPaymentFragmentbindingInflater1", "asBinder", "()LcreateIntentFilterForBroadcastReceiver;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "asInterface", "Ljava/util/List;", "", "()I", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getBundleFromItem extends unregisterMediaButtonEventReceiver {
    private static char INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f914a;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<CodeNamePair, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {115, 98, 19, 9};
    private static final int $$f = 62;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {22, 102, 43, -6, 5, -18, 5, -8, -3, -10, -25, 13, -4, -24, -5, 9, 15, -40, 7, 28, -36, -21, -10, -7, -3, 7, 46, -54, -19, 4, -20, -3, 0, -1, -26, 15, -4, -18, 2, -19, 11, -8, -4, -18, 2, -19, 11, 41, -61, -11, -12, 9, -19, -2, 7, -17, 35, -36, -18, 2, -19, 11, 41, -23, -36, -21, -10, -7, -3, 7, 15, -31, -13, 5, -13, -3, -11, 3, 15, -31, -13, 5, -13, -3, -11, 3, 59, -54, -39, 6, -17, 5, -12, -5, 24, -23, -30, 6, 2, -15, -12, 40, -50, 11, -12, -12, 2, -15, -12, 12, -13, -11, 4, -11, -11, 1, 24, -43, 2, -12, 5, -25, 9, -19, 59, -39, 6, -17, 5, -12, -5, 24, -23, -30, 6, 2, -15, -12, 40, -50, 11, -12, -12, 2, -15, -12, -5, -3, 5, -4, -12, 2, -17, -3, -11, -4, -3, -11, 3, -5, -24, 7, -2, -24, 36, -40, 5, -7, -13, 2, -7, -7, -1, -26, 3, -14, Base64.padSymbol};
    private static final int $$e = 201;
    private static final byte[] $$a = {12, -88, 33, 118, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 53;
    private static int cancel = 1;
    private static int onTransact = 0;
    private static int cancelAll = 1;

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | i3;
        int i10 = i8 | i3;
        int i11 = (~((~i3) | i4)) | (~i10);
        int i12 = (~(i5 | i7 | i3)) | (~(i10 | i4));
        int i13 = i3 + i4 + i6 + (528639218 * i) + ((-532493036) * i2);
        int i14 = i13 * i13;
        int i15 = ((i3 * 873666089) - 1460666368) + (873666089 * i4) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i6) + (1819279360 * i) + ((-1621098496) * i2) + (586088448 * i14);
        int i16 = (i3 * (-1573143961)) + 2078511484 + (i4 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i6 * (-1573143025)) + (i * 123045422) + (i2 * (-1548035028)) + (i14 * 1845559296);
        int i17 = i15 + (i16 * i16 * 1848705024);
        if (i17 == 1) {
            getBundleFromItem getbundlefromitem = (getBundleFromItem) objArr[0];
            int i18 = 2 % 2;
            int i19 = onTransact + 95;
            cancelAll = i19 % 128;
            int i20 = i19 % 2;
            ((drawSelectorCompat) getbundlefromitem.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1();
            int i21 = onTransact + 73;
            cancelAll = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        if (i17 == 2) {
            return b(objArr);
        }
        getBundleFromItem getbundlefromitem2 = (getBundleFromItem) objArr[0];
        int i23 = 2 % 2;
        Context contextRequireContext = getbundlefromitem2.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiver = new createIntentFilterForBroadcastReceiver(contextRequireContext, null, new BranchPioneerOfficeBottomSheetDialogFragment$chooseAddressPostalCodeAdapter$2$1(getbundlefromitem2), 2, null);
        int i24 = cancelAll + 71;
        onTransact = i24 % 128;
        int i25 = i24 % 2;
        return createintentfilterforbroadcastreceiver;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 84
            int r7 = r7 * 52
            int r7 = 107 - r7
            byte[] r0 = defpackage.getBundleFromItem.$$a
            int r8 = r8 * 15
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-11)
            r7 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getBundleFromItem.c(short, byte, int, java.lang.Object[]):void");
    }

    private static void f(short s, short s2, byte b, Object[] objArr) {
        int i = 108 - (s2 * 24);
        int i2 = s * 69;
        int i3 = (b * 121) + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[122 - i2];
        int i4 = 121 - i2;
        int i5 = -1;
        if (bArr == null) {
            i = (i + (-i4)) - 6;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i = (i + (-bArr[i3])) - 6;
                i3++;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getBundleFromItem(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = cancelAll;
            int i3 = i2 + 25;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 65;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            function1 = null;
        }
        this(function1);
    }

    public static final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1(getBundleFromItem getbundlefromitem) {
        int i = 2 % 2;
        int i2 = cancelAll + 11;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Function1<CodeNamePair, Unit> function1 = getbundlefromitem.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i3 + 83;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getBundleFromItem getbundlefromitem, CodeNamePair codeNamePair) {
        int i = 2 % 2;
        getbundlefromitem.TuitionPaymentFragmentbindingInflater1 = codeNamePair;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new BranchPioneerOfficeBottomSheetDialogFragment$handleItemClicked$1(getbundlefromitem, codeNamePair, null), 3, null);
        int i2 = cancelAll + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getBundleFromItem(Function1<? super CodeNamePair, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        final getBundleFromItem getbundlefromitem = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<drawSelectorCompat>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.BranchPioneerOfficeBottomSheetDialogFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [drawSelectorCompat, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final drawSelectorCompat invoke() {
                ComponentCallbacks componentCallbacks = getbundlefromitem;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(drawSelectorCompat.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final getBundleFromItem getbundlefromitem2 = this;
        this.b = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.BranchPioneerOfficeBottomSheetDialogFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, select] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ select invoke() {
                LifecycleOwner lifecycleOwner = getbundlefromitem2;
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: grantReadPermission
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (createIntentFilterForBroadcastReceiver) getBundleFromItem.b(new Object[]{this.TuitionPaymentFragmentbindingInflater1}, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 641378852, -641378852, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        this.asBinder = CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: getBundleFromItem$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LgetBundleFromItem$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p0", "Lkotlin/Function1;", "", "p1", "LgetBundleFromItem;", "b", "(Lkotlin/jvm/functions/Function1;)LgetBundleFromItem;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getBundleFromItem b(Function1<? super CodeNamePair, Unit> function1) {
            getBundleFromItem getbundlefromitem = new getBundleFromItem(function1);
            getbundlefromitem.setArguments(new Bundle());
            return getbundlefromitem;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final createIntentFilterForBroadcastReceiver asBinder() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = onTransact + 123;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43041);
            int i5 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3110;
            int i6 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, bArr[40], b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i5, i6, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{4, '\b', 18, 5, 17, 11, 20, 0, 15, 6, 22, 0, 0, 6, 19, '\t', 3, 23, 1, 21, '\b', 7}, (byte) (57 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{1, 24, 0, '\r', '\t', 0, 16, '\n', 0, 4, 24, 11, '\r', 22, 13901}, (byte) (77 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 14 - ImageFormat.getBitsPerPixel(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 43042);
            int iLastIndexOf = 3110 - TextUtils.lastIndexOf("", '0', 0, 0);
            int iRed = 22 - Color.red(0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, bArr2[5], b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, iLastIndexOf, iRed, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i7 = onTransact + 125;
            cancelAll = i7 % 128;
            int i8 = i7 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
                int jumpTapTimeout = 3111 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                byte[] bArr3 = $$a;
                byte b3 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b3, b3, bArr3[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, jumpTapTimeout, i9, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i10 = ((int[]) objArr7[2])[0];
            int i11 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i10};
            int[] iArr2 = {i11};
            int iIdentityHashCode = System.identityHashCode(this);
            int i12 = ~((-773946128) | iIdentityHashCode);
            int i13 = ~iIdentityHashCode;
            int i14 = i12 | (~(931085331 | i13));
            int i15 = ~(773946127 | i13);
            int i16 = ((((-2069386478) + ((i14 | i15) * (-516))) + (((~(iIdentityHashCode | (-639711236))) | (~((-291374097) | i13))) * 516)) + ((291374096 | i15) * 516)) - 86362295;
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
            objArr = new Object[]{new int[1], iArr2, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{23, 2, 23, 4, 21, 22, 4, '\b', '\n', 23, 3, 2, '\t', '\n', 3, 24}, (byte) (71 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{'\n', 17, '\t', 14, '\n', '\r', 11, 4, 18, 2, '\n', 5, 19, 17, 19, 0}, (byte) (83 - (ViewConfiguration.getTouchSlop() >> 8)), Gravity.getAbsoluteGravity(0, 0) + 16, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -86362295};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[32];
                byte b5 = b4;
                Object[] objArr11 = new Object[1];
                f(b4, b5, b5, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr4[115];
                byte b7 = b6;
                Object[] objArr12 = new Object[1];
                f(b6, b7, b7, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0'));
                    int minimumFlingVelocity = 3111 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iMyPid = 22 - (Process.myPid() >> 22);
                    byte[] bArr5 = $$a;
                    byte b8 = bArr5[7];
                    Object[] objArr13 = new Object[1];
                    c(b8, b8, bArr5[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, minimumFlingVelocity, iMyPid, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{4, '\b', 18, 5, 17, 11, 20, 0, 15, 6, 22, 0, 0, 6, 19, '\t', 3, 23, 1, 21, '\b', 7}, (byte) (58 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{1, 24, 0, '\r', '\t', 0, 16, '\n', 0, 4, 24, 11, '\r', 22, 13901}, (byte) (77 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 43042);
                        int iRgb = Color.rgb(0, 0, 0) + 16780327;
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 22;
                        byte[] bArr6 = $$a;
                        byte b9 = bArr6[7];
                        Object[] objArr16 = new Object[1];
                        c(b9, bArr6[5], b9, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, iRgb, iNormalizeMetaState, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43042);
                        int offsetAfter2 = 3111 - TextUtils.getOffsetAfter("", 0);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 23;
                        byte[] bArr7 = $$a;
                        byte b10 = bArr7[7];
                        Object[] objArr17 = new Object[1];
                        c(b10, bArr7[40], b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, offsetAfter2, iLastIndexOf2, -1272852037, false, (String) objArr17[0], null);
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
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[2])[0];
        if (i20 != i19) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                while (i4 < strArr2.length) {
                    int i21 = cancelAll + 1;
                    onTransact = i21 % 128;
                    if (i21 % 2 != 0) {
                        arrayList.add(strArr2[i4]);
                        i4 += 63;
                    } else {
                        arrayList.add(strArr2[i4]);
                        i4++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i20));
        }
        int i22 = onTransact + 59;
        cancelAll = i22 % 128;
        int i23 = i22 % 2;
        int i24 = ((int[]) objArr[0])[0];
        int i25 = ((int[]) objArr[2])[0];
        int i26 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int i27 = ~System.identityHashCode(this);
        int i28 = i24 + (-831635134) + (((~(i27 | 165591872)) | (-1541405667)) * (-160)) + (((~(i27 | (-1539439587))) | 165591872) * 160);
        int i29 = (i28 << 13) ^ i28;
        int i30 = i29 ^ (i29 >>> 17);
        ((int[]) objArr[0])[0] = i30 ^ (i30 << 5);
        Object[] objArr18 = {new int[1], new int[]{i26}, new int[]{i25}, strArr3};
        int i31 = cancelAll + 123;
        onTransact = i31 % 128;
        int i32 = i31 % 2;
        return (createIntentFilterForBroadcastReceiver) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = f914a;
        int i4 = 1770390596;
        Object obj2 = null;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int packedPositionGroup = 2267 - ExpandableListView.getPackedPositionGroup(0L);
                        int i6 = (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 33;
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, packedPositionGroup, i6, -1927765101, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 1770390596;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 59;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(INotificationSideChannel)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 2266 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.getTrimmedLength("") + 33, -1927765101, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $10 + 123;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                i2 = i + 90;
                cArr4[i2] = (char) (cArr[i2] << b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - Gravity.getAbsoluteGravity(0, 0)), 3261 - TextUtils.indexOf("", "", 0, 0), TextUtils.getOffsetAfter("", 0) + 30, -127612708, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        try {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 22878), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 594, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, 1570859318, false, $$g(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        } else {
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                int i15 = $11 + 49;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                obj2 = obj;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            int i18 = $11 + 97;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBindingInflate;
        int i = 2 % 2;
        int i2 = cancelAll + 31;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(p0, p1, true);
            this.d = fragmentGeneralListBottomSheetBindingInflate;
            if (fragmentGeneralListBottomSheetBindingInflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentGeneralListBottomSheetBindingInflate = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(p0, p1, false);
            this.d = fragmentGeneralListBottomSheetBindingInflate;
            if (fragmentGeneralListBottomSheetBindingInflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentGeneralListBottomSheetBindingInflate = null;
            }
        }
        LinearLayout root = fragmentGeneralListBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        LinearLayout linearLayout = root;
        int i3 = cancelAll + 109;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return linearLayout;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.d;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        TuitionPaymentFragmentbindingInflater1();
        createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiverAsBinder = asBinder();
        createintentfilterforbroadcastreceiverAsBinder.d.clear();
        createintentfilterforbroadcastreceiverAsBinder.notifyDataSetChanged();
        asBinder().TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder);
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter(asBinder());
        fragmentGeneralListBottomSheetBinding.tvTitle.setText("Kantor Cabang");
        fragmentGeneralListBottomSheetBinding.svSearchItem.setQueryHint("Cari Kantor Cabang");
        CodeNamePair codeNamePair = this.TuitionPaymentFragmentbindingInflater1;
        if (codeNamePair != null) {
            int i3 = cancelAll + 35;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                b(new Object[]{this, codeNamePair}, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1223866272, -1223866270, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                obj.hashCode();
                throw null;
            }
            b(new Object[]{this, codeNamePair}, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1223866272, -1223866270, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        int i4 = cancelAll + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 65;
        onTransact = i3 % 128;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = null;
        if (i3 % 2 != 0) {
            fragmentGeneralListBottomSheetBinding.hashCode();
            throw null;
        }
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = this.d;
        if (fragmentGeneralListBottomSheetBinding2 == null) {
            int i4 = i2 + 51;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding2;
        }
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: BrowserActionsIntentBrowserActionsUrlType
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getBundleFromItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (String) obj);
            }
        });
        int i6 = onTransact + 11;
        cancelAll = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        int i = 2 % 2;
        ((drawSelectorCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(getViewLifecycleOwner(), new Observer() { // from class: BrowserServiceFileProvider
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                getBundleFromItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancelAll + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007e A[PHI: r6
  0x007e: PHI (r6v18 com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding) = 
  (r6v16 com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding)
  (r6v19 com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding)
 binds: [B:18:0x0082, B:14:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private static /* synthetic */ Object b(Object[] objArr) {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding;
        getBundleFromItem getbundlefromitem = (getBundleFromItem) objArr[0];
        CodeNamePair codeNamePair = (CodeNamePair) objArr[1];
        int i = 2 % 2;
        Iterable iterable = getbundlefromitem.asBinder().d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        Iterator it = iterable.iterator();
        int i2 = cancelAll + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (true) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = null;
            if (!it.hasNext()) {
                return null;
            }
            int i5 = cancelAll + 45;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            Object next = it.next();
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) next;
            lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b);
            getbundlefromitem.asBinder().d.set(i4, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
            if (Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b)) {
                int i7 = onTransact + 105;
                cancelAll = i7 % 128;
                if (i7 % 2 == 0) {
                    fragmentGeneralListBottomSheetBinding = getbundlefromitem.d;
                    int i8 = 61 / 0;
                    if (fragmentGeneralListBottomSheetBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        fragmentGeneralListBottomSheetBinding2 = fragmentGeneralListBottomSheetBinding;
                    }
                } else {
                    fragmentGeneralListBottomSheetBinding = getbundlefromitem.d;
                    if (fragmentGeneralListBottomSheetBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        fragmentGeneralListBottomSheetBinding2 = fragmentGeneralListBottomSheetBinding;
                    }
                }
                RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding2.rvItem;
                int i9 = i4 + 4;
                if (getbundlefromitem.asBinder().d.size() > i9) {
                    int i10 = cancelAll + 99;
                    onTransact = i10 % 128;
                    if (i10 % 2 == 0 ? i4 <= 4 : i4 <= 4) {
                        i9 = i4;
                    }
                } else {
                    i9 = i4;
                }
                recyclerView.scrollToPosition(i9);
            }
            i4++;
        }
    }

    public static /* synthetic */ Unit b(getBundleFromItem getbundlefromitem) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((drawSelectorCompat) getbundlefromitem.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1();
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        ((drawSelectorCompat) getbundlefromitem.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1();
        Unit unit2 = Unit.INSTANCE;
        int i3 = cancelAll + 59;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r3
  0x001f: PHI (r3v2 createIntentFilterForBroadcastReceiver) = (r3v1 createIntentFilterForBroadcastReceiver), (r3v5 createIntentFilterForBroadcastReceiver) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getBundleFromItem getbundlefromitem, String str) throws Throwable {
        createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiverAsBinder;
        int i = 2 % 2;
        int i2 = onTransact + 41;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            createintentfilterforbroadcastreceiverAsBinder = getbundlefromitem.asBinder();
            int i3 = 86 / 0;
            if (str == null) {
                str = "";
            }
        } else {
            createintentfilterforbroadcastreceiverAsBinder = getbundlefromitem.asBinder();
            if (str == null) {
                str = "";
            }
        }
        createintentfilterforbroadcastreceiverAsBinder.b(str);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 9;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final getBundleFromItem getbundlefromitem, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        int i = 2 % 2;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = onTransact;
            int i3 = i2 + 11;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = getbundlefromitem.d;
            if (fragmentGeneralListBottomSheetBinding2 == null) {
                int i5 = i2 + 35;
                cancelAll = i5 % 128;
                if (i5 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentGeneralListBottomSheetBinding.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding2;
            }
            MultiStateView multiStateView = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i6 = onTransact + 95;
                cancelAll = i6 % 128;
                int i7 = i6 % 2;
                FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = getbundlefromitem.d;
                if (fragmentGeneralListBottomSheetBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding3;
                }
                MultiStateView multiStateView2 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
                Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
                Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView2, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, getbundlefromitem.getString(R.string.error_error_occured), null, new Pair(getbundlefromitem.getString(R.string.action_retry), new Function0() { // from class: setUrlType
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return getBundleFromItem.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }));
                return;
            }
            return;
        }
        int i8 = onTransact + 3;
        cancelAll = i8 % 128;
        int i9 = i8 % 2;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = getbundlefromitem.d;
        if (fragmentGeneralListBottomSheetBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding4 = null;
        }
        MultiStateView multiStateView3 = fragmentGeneralListBottomSheetBinding4.msvGeneralList;
        Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
        multiStateView3.setViewState(MultiStateView.ViewState.CONTENT);
        Iterable<Office> iterable = (Iterable) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Office office : iterable) {
            arrayList.add(new CodeNamePair(office.TuitionPaymentFragmentspecialinlinedviewModeldefault2.toString(), office.TuitionPaymentFragmentbindingInflater1.toString()));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((CodeNamePair) it.next()));
        }
        getbundlefromitem.asBinder = arrayList3;
        createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiverAsBinder = getbundlefromitem.asBinder();
        createintentfilterforbroadcastreceiverAsBinder.d.clear();
        createintentfilterforbroadcastreceiverAsBinder.notifyDataSetChanged();
        getbundlefromitem.asBinder().TuitionPaymentFragmentspecialinlinedviewModeldefault3(getbundlefromitem.asBinder);
        CodeNamePair codeNamePair = getbundlefromitem.TuitionPaymentFragmentbindingInflater1;
        if (codeNamePair != null) {
            int i10 = onTransact + 51;
            cancelAll = i10 % 128;
            if (i10 % 2 == 0) {
                b(new Object[]{getbundlefromitem, codeNamePair}, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1223866272, -1223866270, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                fragmentGeneralListBottomSheetBinding.hashCode();
                throw null;
            }
            b(new Object[]{getbundlefromitem, codeNamePair}, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1223866272, -1223866270, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
    }

    public static /* synthetic */ createIntentFilterForBroadcastReceiver TuitionPaymentFragmentspecialinlinedviewModeldefault3(getBundleFromItem getbundlefromitem) {
        return (createIntentFilterForBroadcastReceiver) b(new Object[]{getbundlefromitem}, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 641378852, -641378852, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static {
        notify = 0;
        a();
        INSTANCE = new Companion(null);
        int i = cancel + 111;
        notify = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getBundleFromItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CodeNamePair p0) {
        b(new Object[]{this, p0}, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1223866272, -1223866270, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getD() {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        int i3 = i2 % 128;
        cancelAll = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 123;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return R.layout.fragment_general_list_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = cancelAll + 33;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        b(new Object[]{this}, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -625606553, 625606554, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static void a() {
        f914a = new char[]{60051, 60034, 60072, 60058, 60062, 60040, 60048, 60056, 60041, 60053, 60043, 60073, 60050, 60060, 60047, 60063, 60052, 60083, 60088, 60057, 60117, 60055, 60049, 60054, 60045};
        INotificationSideChannel = (char) 57188;
    }

    private static String $$g(int i, int i2, int i3) {
        int i4 = 3 - (i * 2);
        int i5 = i2 * 2;
        byte[] bArr = $$c;
        int i6 = i3 + 113;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        int i8 = -1;
        if (bArr == null) {
            i8 = -1;
            i6 = i4 + i7;
            i4 = i4;
        }
        while (true) {
            int i9 = i8 + 1;
            bArr2[i9] = (byte) i6;
            int i10 = i4 + 1;
            if (i9 == i7) {
                return new String(bArr2, 0);
            }
            i8 = i9;
            i6 = bArr[i10] + i6;
            i4 = i10;
        }
    }
}
