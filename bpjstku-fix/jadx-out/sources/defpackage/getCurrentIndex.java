package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
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
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentKpjBottomSheetDialogBinding;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.presentation.complaint.UserKpj;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R%\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0019j\b\u0012\u0004\u0012\u00020\u0003`\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR%\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u0019j\b\u0012\u0004\u0012\u00020\u001d`\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0015\u0010\u0013\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0016\u0010\u0012\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u001a\u0010\u0017\u001a\u00020#8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b\u001e\u0010%"}, d2 = {"LgetCurrentIndex;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/user/model/SubscribedProgram;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lkotlin/jvm/functions/Function1;", "asInterface", "Lcom/bpjstku/domain/user/model/SubscribedProgram;", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/presentation/complaint/UserKpj;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LsetAlpha;", "asBinder", "Lcom/bpjstku/databinding/FragmentKpjBottomSheetDialogBinding;", "Lcom/bpjstku/databinding/FragmentKpjBottomSheetDialogBinding;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getCurrentIndex extends unregisterMediaButtonEventReceiver {
    private static int INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f927a;
    private static char cancelAll;
    private static char notify;
    private static char onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentKpjBottomSheetDialogBinding g;
    private final Function1<SubscribedProgram, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private SubscribedProgram b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int asInterface;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, 5, -88, -44, 1, 18, -31, 32, 3, 8, -36, 27, 12, 10, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -64, 7, 8, -5, 0, 8, -61, 72, -11, 15, 7, -13, 12, -8, 5, 17, -66, 40, 21, 15, 7, -13, 12, -8, 5, 17, -37, 44, -18, 3, 3, -9, 21, 15, 7, -13, 12, -8, 5, 17, -37, 44, -77, 76, -1, 8, 10, 1, -76, 16, -10, 3, 36, 54, -1, -12, 16, -1, -10, 14, -22, 41, -8, 9, -9, 0, 18, -8, -3, -20, 24, 15, -8, 5, 0, -46, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -62};
    private static final int $$e = 56;
    private static final byte[] $$a = {7, 15, 25, 25, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 11;
    private static int INotificationSideChannelStubProxy = 1;
    private static int cancel = 0;
    private static int INotificationSideChannel = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i7 | i5;
        int i9 = (~i8) | (~(i7 | i6));
        int i10 = (~((~i6) | i7 | (~i5))) | (~(i3 | i5));
        int i11 = i3 + i5 + i4 + ((-540997959) * i) + (162607451 * i2);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i3) + 1723858944 + (1667710703 * i5) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i4) + ((-672137216) * i) + (483393536 * i2) + (377683968 * i12);
        int i14 = (i3 * 228155117) + 240245784 + (i5 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i4 * 228155391) + (i * (-329950905)) + (i2 * (-2026639707)) + (i12 * 159186944);
        if (i13 + (i14 * i14 * (-1451425792)) == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        getCurrentIndex getcurrentindex = (getCurrentIndex) objArr[0];
        View view = (View) objArr[1];
        int i15 = 2 % 2;
        int i16 = cancel + 93;
        INotificationSideChannel = i16 % 128;
        int i17 = i16 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        SubscribedProgram subscribedProgram = getcurrentindex.b;
        if (subscribedProgram != null) {
            int i18 = cancel + 123;
            int i19 = i18 % 128;
            INotificationSideChannel = i19;
            int i20 = i18 % 2;
            Function1<SubscribedProgram, Unit> function1 = getcurrentindex.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                int i21 = i19 + 79;
                cancel = i21 % 128;
                int i22 = i21 % 2;
                function1.invoke(subscribedProgram);
            }
        }
        getcurrentindex.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r0 = defpackage.getCurrentIndex.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCurrentIndex.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 141 - r6
            int r7 = r7 + 84
            int r8 = 76 - r8
            byte[] r0 = defpackage.getCurrentIndex.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r7 = r8
            r4 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r6]
        L23:
            int r7 = r7 + r3
            int r6 = r6 + 1
            int r7 = r7 + (-3)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCurrentIndex.f(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getCurrentIndex(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = cancel;
            int i3 = i2 + 81;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 87;
            INotificationSideChannel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            function1 = null;
        }
        this(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getCurrentIndex(Function1<? super SubscribedProgram, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: getConstantState
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getCurrentIndex.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: getHotspotBounds
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (ArrayList) getCurrentIndex.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1192414299, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, -1192414298, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: getIntrinsicHeight
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getCurrentIndex.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        this.asInterface = R.layout.fragment_kpj_bottom_sheet_dialog;
    }

    /* JADX INFO: renamed from: getCurrentIndex$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LgetCurrentIndex$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ getCurrentIndex TuitionPaymentFragmentbindingInflater1(List list, Function1 function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            getCurrentIndex getcurrentindex = new getCurrentIndex(function1);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("subscribed_programs", new ArrayList<>(list));
            getcurrentindex.setArguments(bundle);
            return getcurrentindex;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 81;
        int i3 = i2 % 128;
        cancel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.asInterface;
        int i5 = i3 + 47;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentKpjBottomSheetDialogBinding fragmentKpjBottomSheetDialogBindingInflate = FragmentKpjBottomSheetDialogBinding.inflate(p0, p1, false);
        this.g = fragmentKpjBottomSheetDialogBindingInflate;
        if (fragmentKpjBottomSheetDialogBindingInflate == null) {
            int i2 = cancel + 107;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = cancel + 109;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            fragmentKpjBottomSheetDialogBindingInflate = null;
        }
        ConstraintLayout root = fragmentKpjBottomSheetDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i3 = $10 + 33;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = $10 + 17;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $11 + 75;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i11 = i8;
                int i12 = (c4 + i7) ^ ((c4 << 4) + ((char) (((long) notify) ^ 8611973335120459638L)));
                int i13 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onTransact);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[c2] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 47773);
                        int edgeSlop = 468 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iGreen = 13 - Color.green(0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, edgeSlop, iGreen, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) f927a) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(cancelAll)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.getOffsetBefore("", 0)), 467 - Process.getGidForName(""), 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i11 + 1;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2323, 44 - TextUtils.indexOf("", "", 0, 0), -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() throws Throwable {
        FragmentKpjBottomSheetDialogBinding fragmentKpjBottomSheetDialogBinding;
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = cancel + 59;
        INotificationSideChannel = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            fragmentKpjBottomSheetDialogBinding = this.g;
            int i4 = 2 / 0;
            if (fragmentKpjBottomSheetDialogBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentKpjBottomSheetDialogBinding = null;
            }
        } else {
            fragmentKpjBottomSheetDialogBinding = this.g;
            if (fragmentKpjBottomSheetDialogBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentKpjBottomSheetDialogBinding = null;
            }
        }
        RecyclerView recyclerView = fragmentKpjBottomSheetDialogBinding.rvJamsostekNumberId;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
            int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
            int pressedStateDuration = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte b = $$a[80];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            c(b, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iLastIndexOf, pressedStateDuration, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{37337, 64327, 27890, 34028, 23356, 54453, 5811, 19881, 65391, 55285, 17782, 44167, 22186, 57100, 36293, 20287, 49006, 60505, 29586, 55534, 34519, 1255, 514, 19639}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{58578, 5247, 46364, 29186, 61199, 49593, 14178, 24920, 6125, 9264, 40386, 37689, 58633, 58654, 31827, 7806, 42285, 36176}, TextUtils.lastIndexOf("", '0', 0) + 16, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int maximumFlingVelocity2 = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$a;
            Object[] objArr6 = new Object[1];
            c((byte) 52, bArr[80], bArr[37], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, maximumFlingVelocity2, bitsPerPixel, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
                int minimumFlingVelocity = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
                byte b3 = $$a[37];
                Object[] objArr7 = new Object[1];
                c((byte) 37, b3, b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, minimumFlingVelocity, deadChar, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (((-327984980) + (((-287346972) | iIdentityHashCode) * (-381))) + (((~((~iIdentityHashCode) | 1284468448)) | (-1369551196)) * 381)) - 582179557;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            int i8 = cancel + 61;
            INotificationSideChannel = i8 % 128;
            int i9 = i8 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{10075, 58066, 9811, 22643, 40908, 4541, 6069, 61357, 25442, 62843, 22975, 12445, 8821, 61027, 52606, 59324, 16645, 61839, 54430, 37456, 43655, 32516, 44667, 15548, 5188, 28606, 16039, 714}, (ViewConfiguration.getEdgeSlop() >> 16) + 26, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{20383, 52750, 64684, 17623, 35800, 62400, 57978, 53342, 39981, 1563, 1077, 20973, 9688, 8006, 39464, 788, 42472, 31078, 34344, 13118}, 18 - Color.green(0), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e(new char[]{15223, 24724, 51080, 50945, 54591, 34252, 19339, 37812, 59245, 12660, 35161, 17794, 5582, 2027, 49621, 44018, 24738, 8557}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(new char[]{15028, 63034, 56456, 28792, 35947, 41392, 63885, 25328, 44424, 14832, 3086, 65380, 55034, 30719, 51104, 56164, 967, 5667}, ((byte) KeyEvent.getModifierMetaStateMask()) + 17, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 1607774188};
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                f((short) (bArr2[108] - 1), bArr2[62], bArr2[36], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                short s = bArr2[36];
                Object[] objArr15 = new Object[1];
                f(s, (byte) s, bArr2[62], objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char deadChar2 = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
                    int size = View.MeasureSpec.getSize(0) + 921;
                    int i10 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b4 = $$a[37];
                    Object[] objArr16 = new Object[1];
                    c((byte) 37, b4, b4, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar2, size, i10, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{37337, 64327, 27890, 34028, 23356, 54453, 5811, 19881, 65391, 55285, 17782, 44167, 22186, 57100, 36293, 20287, 49006, 60505, 29586, 55534, 34519, 1255, 514, 19639}, Color.rgb(0, 0, 0) + 16777238, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{58578, 5247, 46364, 29186, 61199, 49593, 14178, 24920, 6125, 9264, 40386, 37689, 58633, 58654, 31827, 7806, 42285, 36176}, 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
                        int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                        byte[] bArr3 = $$a;
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, bArr3[80], bArr3[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, threadPriority, iResolveOpacity, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31534);
                        int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i11 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                        byte b5 = $$a[80];
                        byte b6 = b5;
                        Object[] objArr20 = new Object[1];
                        c(b5, b6, b6, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, scrollDefaultDelay, i11, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i15 = (int) Runtime.getRuntime().totalMemory();
            int i16 = i14 + (-1377611965) + (((~(i15 | 1437759805)) | (-336319839)) * (-465)) + ((1437759805 | (~((-336319839) | i15))) * 930) + ((i15 | (-623683)) * 465);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr2[0])[0] = i18 ^ (i18 << 5);
            int i19 = INotificationSideChannel + 93;
            cancel = i19 % 128;
            int i20 = i19 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i21 = INotificationSideChannel + 23;
                cancel = i21 % 128;
                for (int i22 = i21 % 2 != 0 ? 1 : 0; i22 < strArr.length; i22++) {
                    arrayList.add(strArr[i22]);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i23 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i24 = ~iElapsedRealtime;
            int i25 = i23 + 78233719 + (((-1361051683) | iElapsedRealtime) * (-676)) + (((~(240905053 | i24)) | 1361051682) * 676) + (((~(iElapsedRealtime | 1601956735)) | (~(i24 | (-1533174591))) | 172122908) * 676);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        int i28 = ((int[]) objArr2[0])[0];
        int i29 = i28 * i28;
        int i30 = -(1676405070 * i28);
        int i31 = (((i29 ^ i30) + ((i29 & i30) << 1)) - (~(-(i28 * (-832417802))))) - 1;
        int i32 = (i31 & 1620039300) + (1620039300 | i31);
        int i33 = i32 >> 15;
        int i34 = ((((-262143) | i33) << 1) - (i33 ^ (-262143))) / 131072;
        int i35 = ((i34 | 1) << 1) - (i34 ^ 1);
        int i36 = (i32 & i35) + (i35 | i32);
        int i37 = i32 >> 20;
        int i38 = -(i36 ^ ((((i37 & (-8191)) + (i37 | (-8191))) / 4096) + 1));
        int i39 = (i38 ^ 6) + ((i38 & 6) << 1);
        int i40 = i39 >> 21;
        recyclerView.setNestedScrollingEnabled(0 / (((-((((i40 & (-4095)) + (i40 | (-4095))) / 2048) + 2)) & i39) * 1218));
        recyclerView.setAdapter((setAlpha) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        SubscribedProgram subscribedProgram = this.b;
        if (subscribedProgram != null) {
            int i41 = cancel + 3;
            INotificationSideChannel = i41 % 128;
            int i42 = i41 % 2;
            List<Data> list = ((setAlpha) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(list, "");
            int size2 = list.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    UserKpj userKpj = (UserKpj) list.get(i3);
                    userKpj.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Intrinsics.areEqual(userKpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3, subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    ((setAlpha) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.set(i3, userKpj);
                    if (i3 == size2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            ((setAlpha) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 121;
        INotificationSideChannel = i3 % 128;
        FragmentKpjBottomSheetDialogBinding fragmentKpjBottomSheetDialogBinding = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        FragmentKpjBottomSheetDialogBinding fragmentKpjBottomSheetDialogBinding2 = this.g;
        if (fragmentKpjBottomSheetDialogBinding2 == null) {
            int i4 = i2 + 53;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                throw null;
            }
        } else {
            fragmentKpjBottomSheetDialogBinding = fragmentKpjBottomSheetDialogBinding2;
        }
        MaterialButton materialButton = fragmentKpjBottomSheetDialogBinding.btnChooseJamsostekNumberId;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getIntrinsicWidth
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.b, (View) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (Unit) getCurrentIndex.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1878894965, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, -1878894965, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0216  */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = cancel + 75;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char defaultSize = (char) (View.getDefaultSize(0, 0) + 31533);
            int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
            int edgeSlop = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b = $$a[80];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, packedPositionGroup, edgeSlop, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{37337, 64327, 27890, 34028, 23356, 54453, 5811, 19881, 65391, 55285, 17782, 44167, 22186, 57100, 36293, 20287, 49006, 60505, 29586, 55534, 34519, 1255, 514, 19639}, TextUtils.getOffsetAfter("", 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{58578, 5247, 46364, 29186, 61199, 49593, 14178, 24920, 6125, 9264, 40386, 37689, 58633, 58654, 31827, 7806, 42285, 36176}, 14 - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 28;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr[80], bArr[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i4, capsMode, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
                int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                byte b3 = $$a[37];
                Object[] objArr6 = new Object[1];
                c((byte) 37, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, i5, keyRepeatTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMyPid = Process.myPid();
            int i6 = ~iMyPid;
            int i7 = (~((-1491457809) | i6)) | 1210417168 | (~(282621835 | i6));
            int i8 = (((2022732577 + (((~(iMyPid | (-1581196))) | i7) * 590)) + (i7 * (-1180))) + (((~((-282621836) | i6)) | (~(i6 | 1491457808))) * 590)) - 333116800;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{10075, 58066, 9811, 22643, 40908, 4541, 6069, 61357, 25442, 62843, 22975, 12445, 8821, 61027, 52606, 59324, 16645, 61839, 54430, 37456, 43655, 32516, 44667, 15548, 5188, 28606, 16039, 714}, View.MeasureSpec.makeMeasureSpec(0, 0) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{20383, 52750, 64684, 17623, 35800, 62400, 57978, 53342, 39981, 1563, 1077, 20973, 9688, 8006, 39464, 788, 42472, 31078, 34344, 13118}, 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i11 = INotificationSideChannel + 125;
                    cancel = i11 % 128;
                    if (i11 % 2 == 0) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{15223, 24724, 51080, 50945, 54591, 34252, 19339, 37812, 59245, 12660, 35161, 17794, 5582, 2027, 49621, 44018, 24738, 8557}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{15028, 63034, 56456, 28792, 35947, 41392, 63885, 25328, 44424, 14832, 3086, 65380, 55034, 30719, 51104, 56164, 967, 5667}, Color.green(0) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -333116800};
                byte[] bArr2 = $$d;
                Object[] objArr13 = new Object[1];
                f((short) 137, (byte) (bArr2[21] - 1), (byte) 65, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f((short) ($$e | 71), bArr2[36], bArr2[62], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int iIndexOf = 921 - TextUtils.indexOf("", "", 0, 0);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
                    byte b4 = $$a[37];
                    Object[] objArr16 = new Object[1];
                    c((byte) 37, b4, b4, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iIndexOf, packedPositionType, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{37337, 64327, 27890, 34028, 23356, 54453, 5811, 19881, 65391, 55285, 17782, 44167, 22186, 57100, 36293, 20287, 49006, 60505, 29586, 55534, 34519, 1255, 514, 19639}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{58578, 5247, 46364, 29186, 61199, 49593, 14178, 24920, 6125, 9264, 40386, 37689, 58633, 58654, 31827, 7806, 42285, 36176}, KeyEvent.getDeadChar(0, 0) + 15, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
                        int iAlpha = Color.alpha(0) + 921;
                        int iAlpha2 = 28 - Color.alpha(0);
                        byte[] bArr3 = $$a;
                        byte b5 = bArr3[80];
                        byte b6 = bArr3[37];
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, b5, b6, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop2, iAlpha, iAlpha2, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int iAlpha3 = 921 - Color.alpha(0);
                        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 28;
                        byte b7 = $$a[80];
                        byte b8 = b7;
                        Object[] objArr20 = new Object[1];
                        c(b7, b8, b8, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iAlpha3, packedPositionGroup2, -1048449946, false, (String) objArr20[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i15 = (~((-1342301354) | iIdentityHashCode)) | 268460192;
            int i16 = ~iIdentityHashCode;
            int i17 = i14 + (-1486994227) + ((i15 | (~(1505619451 | i16))) * 886) + (((~(i16 | 1342301353)) | 431778290) * (-1772)) + ((~(i16 | 431778290)) * 886);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr21[0])[0] = i19 ^ (i19 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        int[] iArr = new int[i13];
        int i20 = i13 - 1;
        iArr[i20] = 1;
        Toast.makeText((Context) null, iArr[((i13 * i20) % 2) - 1], 1).show();
        int i21 = ((int[]) objArr[0])[0];
        Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i22 = ~startUptimeMillis;
        int i23 = i21 + (-1200012581) + ((354945025 | i22) * (-192)) + (((~((-1247004315) | i22)) | 172130304) * (-384)) + (((~(startUptimeMillis | 1601949339)) | (~(i22 | (-1074874011))) | (~((-172130305) | startUptimeMillis))) * DerHeader.TAG_CLASS_PRIVATE);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr22[0])[0] = i25 ^ (i25 << 5);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        UserKpj userKpj;
        int i = 2 % 2;
        ArrayList<SubscribedProgram> arrayList = (ArrayList) ((getCurrentIndex) objArr[0]).TuitionPaymentFragmentbindingInflater1.getValue();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (SubscribedProgram subscribedProgram : arrayList) {
            int i2 = INotificationSideChannel + 23;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            String str = "";
            if (Intrinsics.areEqual(subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "PU")) {
                int i4 = INotificationSideChannel + 63;
                cancel = i4 % 128;
                int i5 = i4 % 2;
                String str2 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str2 != null) {
                    int i6 = INotificationSideChannel + 15;
                    cancel = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    str = str2;
                }
                userKpj = new UserKpj(str, false, 2, null);
            } else {
                userKpj = new UserKpj("", false, 2, null);
            }
            arrayList2.add(userKpj);
        }
        return new ArrayList(arrayList2);
    }

    public static /* synthetic */ ArrayList TuitionPaymentFragmentspecialinlinedviewModeldefault2(getCurrentIndex getcurrentindex) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 121;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getcurrentindex.getArguments();
        if (arguments != null) {
            int i4 = cancel + 41;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("subscribed_programs");
            if (parcelableArrayList != null) {
                int i6 = INotificationSideChannel;
                int i7 = i6 + 29;
                cancel = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 63;
                cancel = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 16 / 0;
                }
                return parcelableArrayList;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i11 = INotificationSideChannel + 31;
        cancel = i11 % 128;
        if (i11 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getCurrentIndex getcurrentindex, int i, UserKpj userKpj) {
        Object obj;
        Object next;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(userKpj, "");
        List<Data> list = ((setAlpha) getcurrentindex.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(list, "");
        int size = list.size() - 1;
        if (size >= 0) {
            int i3 = 0;
            while (true) {
                UserKpj userKpj2 = (UserKpj) list.get(i3);
                userKpj2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i == i3;
                ((setAlpha) getcurrentindex.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.set(i3, (Data) userKpj2);
                if (i3 == size) {
                    break;
                }
                int i4 = INotificationSideChannel + 91;
                cancel = i4 % 128;
                int i5 = i4 % 2;
                i3++;
            }
        }
        ((setAlpha) getcurrentindex.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).notifyDataSetChanged();
        Iterator it = ((ArrayList) getcurrentindex.TuitionPaymentFragmentbindingInflater1.getValue()).iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            }
            getcurrentindex.b = (SubscribedProgram) obj;
            Unit unit = Unit.INSTANCE;
            int i6 = INotificationSideChannel + 43;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        } while (!StringsKt.equals$default(((SubscribedProgram) next).TuitionPaymentFragmentspecialinlinedviewModeldefault2, userKpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3, false, 2, null));
        obj = next;
        getcurrentindex.b = (SubscribedProgram) obj;
        Unit unit2 = Unit.INSTANCE;
        int i8 = INotificationSideChannel + 43;
        cancel = i8 % 128;
        int i9 = i8 % 2;
        return unit2;
    }

    public static /* synthetic */ setAlpha TuitionPaymentFragmentspecialinlinedviewModeldefault3(final getCurrentIndex getcurrentindex) {
        int i = 2 % 2;
        Context contextRequireContext = getcurrentindex.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        setAlpha setalpha = new setAlpha(contextRequireContext, (ArrayList) getcurrentindex.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue(), new Function2() { // from class: getPadding
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getCurrentIndex.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((Integer) obj).intValue(), (UserKpj) obj2);
            }
        });
        int i2 = cancel + 119;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        return setalpha;
    }

    public static /* synthetic */ ArrayList b(getCurrentIndex getcurrentindex) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (ArrayList) TuitionPaymentFragmentspecialinlinedviewModeldefault3(ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1192414299, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{getcurrentindex}, -1192414298, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getCurrentIndex getcurrentindex, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1878894965, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{getcurrentindex, view}, -1878894965, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    static {
        INotificationSideChannelStub = 0;
        asBinder();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelStubProxy + 9;
        INotificationSideChannelStub = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getCurrentIndex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 119;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        int i = 2 % 2;
        int i2 = cancel + 101;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    static void asBinder() {
        f927a = (char) 61808;
        cancelAll = (char) 43556;
        notify = (char) 22507;
        onTransact = (char) 37935;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            byte[] r0 = defpackage.getCurrentIndex.$$c
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r7 = r7 + 108
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r8 = r8 + 1
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCurrentIndex.$$g(short, int, byte):java.lang.String");
    }
}
