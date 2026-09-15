package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16;
import com.bpjstku.databinding.FragmentChoosePostalCodeAddressBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.scholarship.benefit.fragment.ScholarBenefitItemBottomDialog$chooseAddressPostalCodeAdapter$2$1;
import com.bpjstku.presentation.scholarship.benefit.fragment.ScholarBenefitItemBottomDialog$handleItemClicked$1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0013\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001f0\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010\u0015\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\"R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0010\u0010$"}, d2 = {"LgetOrderedSupportedStreamUseCaseSurfaceConfigList;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "LcreateIntentFilterForBroadcastReceiver;", "Lkotlin/Lazy;", "asBinder", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Ljava/util/List;", "", "()I", "Lcom/bpjstku/databinding/FragmentChoosePostalCodeAddressBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChoosePostalCodeAddressBottomSheetBinding;", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getOrderedSupportedStreamUseCaseSurfaceConfigList extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancel;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentChoosePostalCodeAddressBottomSheetBinding a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<CodeNamePair, Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {49, -45, -112, 57};
    private static final int $$f = 169;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {31, 115, -100, -11, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 55, -2, 20, -18, -50, 69, -12, 3, 3, 11, 2, -1, -16, 20, -10, 7, 0, -63, 53, 15, 6, -70, 21, 15, 6, -2, 20, 3, 3, 11, 2, -1, -16, 20, -10, 7, 0, -41, 30, 20, -18, -13, 34, -4, 4, -12, -64, 1, 34, 52, -3, -14, 14, -3, -12, 12, -24, 39, -10, 7, -11, -2, 16, -10, -5, -22, 22, 13, -10, 3, -2, -42, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, -17, 8, 6, -9, 6, 6, -6, -29, 38, -7, 7, -10, 20, -14, 14, -64};
    private static final int $$e = 13;
    private static final byte[] $$a = {113, 29, -123, -97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = DerHeader.TAG_CLASS_PRIVATE;
    private static int notify = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f961a = 0;
    private static int asInterface = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i4);
        int i8 = ~i2;
        int i9 = i7 | (~(i8 | i4));
        int i10 = ~i4;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i);
        int i13 = (~(i8 | i)) | i11 | i12;
        int i14 = (~(i2 | i10)) | i12;
        int i15 = i + i4 + i5 + (1039959776 * i3) + ((-2046201414) * i6);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i) - 8388608) + ((-1785926397) * i4) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i5) + ((-201326592) * i3) + ((-406847488) * i6) + (529399808 * i16);
        int i18 = ((i * 868240256) - 1765242424) + (i4 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i5 * 868239597) + (i3 * 817356128) + (i6 * 406493490) + (i16 * 645267456);
        return i17 + ((i18 * i18) * 681705472) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getOrderedSupportedStreamUseCaseSurfaceConfigList.$$a
            int r7 = r7 * 52
            int r1 = r7 + 1
            int r6 = 103 - r6
            int r8 = r8 * 52
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getOrderedSupportedStreamUseCaseSurfaceConfigList.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r7 = r7 * 83
            int r7 = 87 - r7
            int r5 = r5 * 46
            int r0 = r5 + 38
            byte[] r1 = defpackage.getOrderedSupportedStreamUseCaseSurfaceConfigList.$$d
            byte[] r0 = new byte[r0]
            int r5 = r5 + 37
            r2 = -1
            if (r1 != 0) goto L19
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2c
        L19:
            r3 = r2
        L1a:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L2a:
            r4 = r1[r7]
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + r2
            int r7 = r7 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getOrderedSupportedStreamUseCaseSurfaceConfigList.f(byte, short, int, java.lang.Object[]):void");
    }

    public static final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1(getOrderedSupportedStreamUseCaseSurfaceConfigList getorderedsupportedstreamusecasesurfaceconfiglist) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        f961a = i2 % 128;
        int i3 = i2 % 2;
        Function1<CodeNamePair, Unit> function1 = getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentbindingInflater1;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return function1;
    }

    public static final /* synthetic */ void b(getOrderedSupportedStreamUseCaseSurfaceConfigList getorderedsupportedstreamusecasesurfaceconfiglist, CodeNamePair codeNamePair) {
        int i = 2 % 2;
        getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = codeNamePair;
        Object obj = null;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ScholarBenefitItemBottomDialog$handleItemClicked$1(getorderedsupportedstreamusecasesurfaceconfiglist, codeNamePair, null), 3, null);
        int i2 = asInterface + 27;
        f961a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getOrderedSupportedStreamUseCaseSurfaceConfigList(Function1<? super CodeNamePair, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: getSuggestedStreamSpecifications
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getOrderedSupportedStreamUseCaseSurfaceConfigList.b(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: getOrderedSupportedStreamUseCaseSurfaceConfigList$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\tj\b\u0012\u0004\u0012\u00020\u0007`\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"LgetOrderedSupportedStreamUseCaseSurfaceConfigList$b;", "", "<init>", "()V", "", "p0", "p1", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p2", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "p3", "Lkotlin/Function1;", "", "p4", "LgetOrderedSupportedStreamUseCaseSurfaceConfigList;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/domain/general/model/CodeNamePair;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)LgetOrderedSupportedStreamUseCaseSurfaceConfigList;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getOrderedSupportedStreamUseCaseSurfaceConfigList TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, String p1, CodeNamePair p2, ArrayList<CodeNamePair> p3, Function1<? super CodeNamePair, Unit> p4) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p4, "");
            getOrderedSupportedStreamUseCaseSurfaceConfigList getorderedsupportedstreamusecasesurfaceconfiglist = new getOrderedSupportedStreamUseCaseSurfaceConfigList(p4);
            Bundle bundle = new Bundle();
            bundle.putString("result_dialog_title", p0);
            bundle.putString("result_dialog_message", p1);
            if (p2 != null) {
                bundle.putParcelable("scholar_data_selected", p2);
            }
            bundle.putParcelableArrayList("scholar_data_list", p3);
            getorderedsupportedstreamusecasesurfaceconfiglist.setArguments(bundle);
            return getorderedsupportedstreamusecasesurfaceconfiglist;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBindingInflate;
        int i;
        Object obj;
        int i2 = 2 % 2;
        int i3 = asInterface + 121;
        f961a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            fragmentChoosePostalCodeAddressBottomSheetBindingInflate = FragmentChoosePostalCodeAddressBottomSheetBinding.inflate(p0, p1, true);
            this.a = fragmentChoosePostalCodeAddressBottomSheetBindingInflate;
            if (fragmentChoosePostalCodeAddressBottomSheetBindingInflate == null) {
                int i4 = f961a + 75;
                asInterface = i4 % 128;
                i = i4 % 2;
                obj = null;
                Intrinsics.throwUninitializedPropertyAccessException("");
                if (i != 0) {
                    obj.hashCode();
                    throw null;
                }
                fragmentChoosePostalCodeAddressBottomSheetBindingInflate = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            fragmentChoosePostalCodeAddressBottomSheetBindingInflate = FragmentChoosePostalCodeAddressBottomSheetBinding.inflate(p0, p1, false);
            this.a = fragmentChoosePostalCodeAddressBottomSheetBindingInflate;
            if (fragmentChoosePostalCodeAddressBottomSheetBindingInflate == null) {
                int i5 = f961a + 75;
                asInterface = i5 % 128;
                i = i5 % 2;
                obj = null;
                Intrinsics.throwUninitializedPropertyAccessException("");
                if (i != 0) {
                    obj.hashCode();
                    throw null;
                }
                fragmentChoosePostalCodeAddressBottomSheetBindingInflate = null;
            }
        }
        LinearLayout root = fragmentChoosePostalCodeAddressBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        String string;
        String string2;
        getOrderedSupportedStreamUseCaseSurfaceConfigList getorderedsupportedstreamusecasesurfaceconfiglist = (getOrderedSupportedStreamUseCaseSurfaceConfigList) objArr[0];
        int i = 2 % 2;
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding = getorderedsupportedstreamusecasesurfaceconfiglist.a;
        if (fragmentChoosePostalCodeAddressBottomSheetBinding == null) {
            int i2 = f961a + 57;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChoosePostalCodeAddressBottomSheetBinding = null;
        }
        Bundle arguments = getorderedsupportedstreamusecasesurfaceconfiglist.getArguments();
        getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (CodeNamePair) arguments.getParcelable("scholar_data_selected") : null;
        Bundle arguments2 = getorderedsupportedstreamusecasesurfaceconfiglist.getArguments();
        if (arguments2 != null) {
            int i3 = asInterface + 67;
            f961a = i3 % 128;
            int i4 = i3 % 2;
            ArrayList parcelableArrayList = arguments2.getParcelableArrayList("scholar_data_list");
            if (parcelableArrayList != null) {
                ArrayList arrayList = parcelableArrayList;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((CodeNamePair) it.next()));
                }
                getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayList2;
                createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiver = (createIntentFilterForBroadcastReceiver) getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                createintentfilterforbroadcastreceiver.d.clear();
                createintentfilterforbroadcastreceiver.notifyDataSetChanged();
                ((createIntentFilterForBroadcastReceiver) getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                CodeNamePair codeNamePair = getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (codeNamePair != null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{getorderedsupportedstreamusecasesurfaceconfiglist, codeNamePair}, -769272547, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 769272547, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                }
            }
        }
        createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiver2 = (createIntentFilterForBroadcastReceiver) getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        createintentfilterforbroadcastreceiver2.d.clear();
        createintentfilterforbroadcastreceiver2.notifyDataSetChanged();
        ((createIntentFilterForBroadcastReceiver) getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        RecyclerView recyclerView = fragmentChoosePostalCodeAddressBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getorderedsupportedstreamusecasesurfaceconfiglist.requireContext(), 1));
        recyclerView.setAdapter((createIntentFilterForBroadcastReceiver) getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        TextView textView = fragmentChoosePostalCodeAddressBottomSheetBinding.tvTitle;
        Bundle arguments3 = getorderedsupportedstreamusecasesurfaceconfiglist.getArguments();
        if (arguments3 != null) {
            int i5 = asInterface + 49;
            f961a = i5 % 128;
            int i6 = i5 % 2;
            string = arguments3.getString("result_dialog_title");
        } else {
            string = null;
        }
        textView.setText(string);
        SearchView searchView = fragmentChoosePostalCodeAddressBottomSheetBinding.svSearchItem;
        Bundle arguments4 = getorderedsupportedstreamusecasesurfaceconfiglist.getArguments();
        if (arguments4 != null) {
            int i7 = f961a + 23;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            string2 = arguments4.getString("result_dialog_message");
            int i9 = f961a + 19;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 % 5;
            }
        } else {
            string2 = null;
        }
        searchView.setQueryHint(string2);
        CodeNamePair codeNamePair2 = getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (codeNamePair2 != null) {
            int i11 = asInterface + 33;
            f961a = i11 % 128;
            int i12 = i11 % 2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{getorderedsupportedstreamusecasesurfaceconfiglist, codeNamePair2}, -769272547, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 769272547, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        return null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f961a + 111;
        int i3 = i2 % 128;
        asInterface = i3;
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding = null;
        if (i2 % 2 == 0) {
            fragmentChoosePostalCodeAddressBottomSheetBinding.hashCode();
            throw null;
        }
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding2 = this.a;
        if (fragmentChoosePostalCodeAddressBottomSheetBinding2 == null) {
            int i4 = i3 + 11;
            f961a = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                fragmentChoosePostalCodeAddressBottomSheetBinding.hashCode();
                throw null;
            }
        } else {
            fragmentChoosePostalCodeAddressBottomSheetBinding = fragmentChoosePostalCodeAddressBottomSheetBinding2;
        }
        SearchView searchView = fragmentChoosePostalCodeAddressBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: checkSupported
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOrderedSupportedStreamUseCaseSurfaceConfigList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (String) obj);
            }
        });
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i6 = $10 + 43;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(g)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iIndexOf = 3291 - TextUtils.indexOf("", "", 0);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 32;
                    byte b = (byte) ($$f & 7);
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, iIndexOf2, 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 652 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i9 = $11 + 17;
                $10 = i9 % 128;
                int i10 = i9 % 2;
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
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                try {
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 651 - TextUtils.getOffsetBefore("", 0), 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i4 = 29209604;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
        int i11 = $11 + 53;
        $10 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0270  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArr3;
        getOrderedSupportedStreamUseCaseSurfaceConfigList getorderedsupportedstreamusecasesurfaceconfiglist = (getOrderedSupportedStreamUseCaseSurfaceConfigList) objArr[0];
        CodeNamePair codeNamePair = (CodeNamePair) objArr[1];
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i2 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
            byte[] bArr = $$a;
            byte b = (byte) (bArr[19] - 1);
            byte b2 = bArr[7];
            Object[] objArr4 = new Object[1];
            c(b, b2, b2, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, i2, iMakeMeasureSpec, 252381699, false, (String) objArr4[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr5 = new Object[1];
        e(false, 259 - Color.green(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, 20 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, objArr5);
        Class<?> cls = Class.forName((String) objArr5[0]);
        Object[] objArr6 = new Object[1];
        e(true, View.MeasureSpec.getSize(0) + 263, (ViewConfiguration.getScrollBarSize() >> 8) + 15, (ViewConfiguration.getJumpTapTimeout() >> 16) + 10, new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, objArr6);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int jumpTapTimeout = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iMakeMeasureSpec2 = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr2 = $$a;
            Object[] objArr7 = new Object[1];
            c(bArr2[10], bArr2[5], bArr2[7], objArr7);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, jumpTapTimeout, iMakeMeasureSpec2, 2009631821, false, (String) objArr7[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = asInterface + 61;
            f961a = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha = (char) Color.alpha(0);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                int iMyTid = (Process.myTid() >> 22) + 10;
                byte[] bArr3 = $$a;
                byte b3 = bArr3[7];
                Object[] objArr8 = new Object[1];
                c(b3, b3, bArr3[5], objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, iResolveSizeAndState, iMyTid, 256017550, false, (String) objArr8[0], null);
            }
            Object[] objArr9 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int i5 = (int) Runtime.getRuntime().totalMemory();
            int i6 = (-773792034) + ((~(939212661 | i5)) * 623) + (((~i5) | 810558752) * (-623)) + (((~(i5 | 895040821)) | (~(854730592 | i5)) | (-939212662)) * 623) + 1365703237;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr2[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr10 = new Object[1];
            e(false, 259 - Color.argb(0, 0, 0, 0), 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 6 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22}, objArr10);
            Class<?> cls2 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(true, 266 - (ViewConfiguration.getTouchSlop() >> 8), 18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 15, new char[]{65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n'}, objArr11);
            Context applicationContext = (Context) cls2.getMethod((String) objArr11[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = f961a + 77;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr12 = new Object[1];
            e(false, 258 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b'}, objArr12);
            Class<?> cls3 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            e(true, 263 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 17, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7, new char[]{3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, getorderedsupportedstreamusecasesurfaceconfiglist)).intValue()), 1365703237};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[62];
                Object[] objArr15 = new Object[1];
                f(b4, bArr4[31], b4, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b5 = bArr4[31];
                Object[] objArr16 = new Object[1];
                f(b5, bArr4[62], b5, objArr16);
                objArr2 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                if (applicationContext != null) {
                    int i11 = asInterface + 89;
                    f961a = i11 % 128;
                    int i12 = i11 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char mode = (char) View.MeasureSpec.getMode(0);
                        int iRgb = Color.rgb(0, 0, 0) + 16778092;
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0);
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b6, b6, bArr5[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode, iRgb, iLastIndexOf, 256017550, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr2);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(false, 259 - TextUtils.getOffsetAfter("", 0), KeyEvent.getDeadChar(0, 0) + 22, TextUtils.indexOf((CharSequence) "", '0', 0) + 22, new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(true, 262 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.lastIndexOf("", '0') + 16, ExpandableListView.getPackedPositionType(0L) + 10, new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 876;
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                            byte[] bArr6 = $$a;
                            Object[] objArr20 = new Object[1];
                            c(bArr6[10], bArr6[5], bArr6[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, iCombineMeasuredStates, keyRepeatDelay, 2009631821, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int offsetAfter = 876 - TextUtils.getOffsetAfter("", 0);
                            int mode2 = 10 - View.MeasureSpec.getMode(0);
                            byte[] bArr7 = $$a;
                            byte b7 = (byte) (bArr7[19] - 1);
                            byte b8 = bArr7[7];
                            Object[] objArr21 = new Object[1];
                            c(b7, b8, b8, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, offsetAfter, mode2, 252381699, false, (String) objArr21[0], null);
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
        int i13 = ((int[]) objArr2[2])[0];
        int i14 = ((int[]) objArr2[0])[0];
        if (i14 == i13) {
            int i15 = f961a + 41;
            asInterface = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr2[1])[0];
            objArr3 = new Object[]{new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i18 = ~((-825229841) | iUptimeMillis);
            int i19 = 2122934116 + ((536870928 | i18) * (-280)) + ((i18 | (~(784919611 | iUptimeMillis))) * 140);
            int i20 = ~((-288358913) | iUptimeMillis);
            int i21 = ~iUptimeMillis;
            int i22 = i17 + i19 + (((~(i21 | 1073278523)) | i20 | (~((-536870929) | i21))) * 140);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr3[1])[0] = i24 ^ (i24 << 5);
        } else {
            int[] iArr = new int[i14];
            int i25 = i14 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i25) % 2) - 1], 1).show();
            int i26 = ((int[]) objArr2[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iNextInt = new Random().nextInt(203944618);
            int i27 = i26 + (((~((-285343873) | iNextInt)) * 521) - 277828704) + (((~((~iNextInt) | (-285343873))) | (-334195436)) * 521);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr22[1])[0] = i29 ^ (i29 << 5);
            objArr3 = objArr22;
        }
        Iterable iterable = ((createIntentFilterForBroadcastReceiver) getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i30 = ((int[]) objArr3[1])[0];
        int i31 = i30 * i30;
        int i32 = -(801894285 * i30);
        int i33 = ((((i31 | i32) << 1) - (i31 ^ i32)) - (~(-(i30 * 799882019)))) - (-6262335);
        int i34 = i33 >> 17;
        int i35 = (((-65535) ^ i34) + ((i34 & (-65535)) << 1)) / 32768;
        int i36 = (i35 ^ 1) + ((i35 & 1) << 1);
        int i37 = (i33 ^ i36) + ((i36 & i33) << 1);
        int i38 = i33 >> 23;
        int i39 = ((i38 ^ (-1023)) + ((i38 & (-1023)) << 1)) / 512;
        int i40 = (-((((i39 | 1) << 1) - (i39 ^ 1)) ^ i37)) + 1;
        int i41 = i40 >> 22;
        int i42 = ((((i41 | (-2047)) << 1) - (i41 ^ (-2047))) / 1024) + 1;
        int i43 = 0 / (((-((i42 & 1) + (1 | i42))) & i40) * 1292);
        for (Object obj : iterable) {
            int i44 = f961a + 17;
            asInterface = i44 % 128;
            int i45 = i44 % 2;
            if (i43 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
            lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b);
            ((createIntentFilterForBroadcastReceiver) getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.set(i43, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
            if (Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b)) {
                int i46 = asInterface + 61;
                f961a = i46 % 128;
                int i47 = i46 % 2;
                FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding = getorderedsupportedstreamusecasesurfaceconfiglist.a;
                if (fragmentChoosePostalCodeAddressBottomSheetBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentChoosePostalCodeAddressBottomSheetBinding = null;
                }
                RecyclerView recyclerView = fragmentChoosePostalCodeAddressBottomSheetBinding.rvItem;
                int i48 = i43 + 4;
                if (((createIntentFilterForBroadcastReceiver) getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.size() <= i48 || i43 <= 4) {
                    i48 = i43;
                }
                recyclerView.scrollToPosition(i48);
            }
            i43++;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r3
  0x0027: PHI (r3v4 createIntentFilterForBroadcastReceiver) = (r3v3 createIntentFilterForBroadcastReceiver), (r3v10 createIntentFilterForBroadcastReceiver) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getOrderedSupportedStreamUseCaseSurfaceConfigList getorderedsupportedstreamusecasesurfaceconfiglist, String str) {
        createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiver;
        int i = 2 % 2;
        int i2 = asInterface + 99;
        f961a = i2 % 128;
        if (i2 % 2 != 0) {
            createintentfilterforbroadcastreceiver = (createIntentFilterForBroadcastReceiver) getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            int i3 = 43 / 0;
            if (str == null) {
                str = "";
            }
        } else {
            createintentfilterforbroadcastreceiver = (createIntentFilterForBroadcastReceiver) getorderedsupportedstreamusecasesurfaceconfiglist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            if (str == null) {
                str = "";
            }
        }
        createintentfilterforbroadcastreceiver.b(str);
        Unit unit = Unit.INSTANCE;
        int i4 = f961a + 1;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ createIntentFilterForBroadcastReceiver b(getOrderedSupportedStreamUseCaseSurfaceConfigList getorderedsupportedstreamusecasesurfaceconfiglist) {
        int i = 2 % 2;
        Context contextRequireContext = getorderedsupportedstreamusecasesurfaceconfiglist.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiver = new createIntentFilterForBroadcastReceiver(contextRequireContext, null, new ScholarBenefitItemBottomDialog$chooseAddressPostalCodeAdapter$2$1(getorderedsupportedstreamusecasesurfaceconfiglist), 2, null);
        int i2 = asInterface + 123;
        f961a = i2 % 128;
        int i3 = i2 % 2;
        return createintentfilterforbroadcastreceiver;
    }

    static {
        cancel = 0;
        asInterface();
        INSTANCE = new Companion(null);
        int i = notify + 37;
        cancel = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void TuitionPaymentFragmentbindingInflater1(CodeNamePair p0) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this, p0}, -769272547, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 769272547, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getA() {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        f961a = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.fragment_choose_postal_code_address_bottom_sheet;
        }
        throw null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        f961a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        int i = 2 % 2;
        int i2 = f961a + 117;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        int i = 2 % 2;
        int i2 = f961a + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this}, -546463033, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 546463034, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static void asInterface() {
        g = -83722302;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, int r8, byte r9) {
        /*
            int r7 = r7 + 119
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = defpackage.getOrderedSupportedStreamUseCaseSurfaceConfigList.$$c
            int r9 = r9 * 4
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r5 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r9 = r9 + r3
            int r7 = r7 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getOrderedSupportedStreamUseCaseSurfaceConfigList.$$g(byte, int, byte):java.lang.String");
    }
}
