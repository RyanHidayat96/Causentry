package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentChooseKpjBottomSheetBinding;
import com.bpjstku.domain.jht.model.Kpj;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.ChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.ChooseKpjBottomSheetFragment$handleItemClicked$1;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.mapPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\tJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0019\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0015\u0010\u001e\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001a\u0010\r\u001a\u00020\u001f8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001e\u0010!R\u0016\u0010\u0016\u001a\u00020\"8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\b\u0010#"}, d2 = {"LupdateSessionConfigSynchronous;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/jht/model/Kpj;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "asInterface", "Lkotlin/jvm/functions/Function1;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "asBinder", "Lcom/bpjstku/domain/jht/model/Kpj;", "LisZslDisabledByByUserCaseConfig;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "I", "()I", "Lcom/bpjstku/databinding/FragmentChooseKpjBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChooseKpjBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class updateSessionConfigSynchronous extends unregisterMediaButtonEventReceiver {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1423a;
    private static char cancel;
    private static long g;
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentChooseKpjBottomSheetBinding asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private Kpj TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Function1<Kpj, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$f = 11;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {117, -15, -81, 1, 5, -2, 7, 29, -5, -7, 40, -7, 23, 15, -3, 19, 13, 5, -2, 29, -1, 16, 9, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 97;
    private static final byte[] $$a = {23, -73, 107, 5, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 43;
    private static int onTransact = 0;
    private static int cancelAll = 0;
    private static int notify = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i4) | i5);
        int i11 = i9 | i10 | (~(i5 | i));
        int i12 = (~(i | i4)) | (~(i7 | i4));
        int i13 = i8 | i10;
        int i14 = i4 + i5 + i6 + (793188503 * i2) + (2090109681 * i3);
        int i15 = i14 * i14;
        int i16 = (837707615 * i4) + 1286602752 + ((-1676358574) * i5) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i6) + (1186463744 * i2) + (1166540800 * i3) + ((-1956446208) * i15);
        int i17 = ((i4 * 1389925299) - 652765764) + (i5 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i6 * 1389926445) + (i2 * (-1551828341)) + (i3 * (-2047638435)) + (i15 * 1214709760);
        return i16 + ((i17 * i17) * 445972480) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    private static void c(short s, short s2, short s3, Object[] objArr) {
        int i = 84 - (s3 * 4);
        byte[] bArr = $$a;
        int i2 = (s * 52) + 4;
        int i3 = s2 * 15;
        byte[] bArr2 = new byte[53 - i3];
        int i4 = 52 - i3;
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i = (i + i4) - 11;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i6 = bArr[i2];
                i2++;
                i = (i + i6) - 11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 33
            int r8 = 117 - r8
            byte[] r0 = defpackage.updateSessionConfigSynchronous.$$d
            int r6 = r6 * 18
            int r6 = 38 - r6
            int r7 = r7 * 19
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-10)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.updateSessionConfigSynchronous.f(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ updateSessionConfigSynchronous(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = cancelAll;
            int i3 = i2 + 35;
            notify = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 8 / 0;
            }
            int i5 = i2 + 51;
            notify = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            function1 = null;
        }
        this(function1);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(updateSessionConfigSynchronous updatesessionconfigsynchronous, Kpj kpj) {
        int i = 2 % 2;
        updatesessionconfigsynchronous.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kpj;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ChooseKpjBottomSheetFragment$handleItemClicked$1(updatesessionconfigsynchronous, kpj, null), 3, null);
        int i2 = notify + 21;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(updateSessionConfigSynchronous updatesessionconfigsynchronous) {
        int i = 2 % 2;
        int i2 = notify + 11;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Function1<Kpj, Unit> function1 = updatesessionconfigsynchronous.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            return function1;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public updateSessionConfigSynchronous(Function1<? super Kpj, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        final updateSessionConfigSynchronous updatesessionconfigsynchronous = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.ChooseKpjBottomSheetFragment$special$$inlined$inject$default$1
            public static int $TuitionPaymentFragmentbindingInflater1 = 970956320;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = updatesessionconfigsynchronous;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: Camera2CameraControlImplExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return updateSessionConfigSynchronous.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.b = R.layout.fragment_choose_kpj_bottom_sheet;
    }

    /* JADX INFO: renamed from: updateSessionConfigSynchronous$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/ChooseKpjBottomSheetFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/ChooseKpjBottomSheetFragment;", "onItemSelectedListener", "Lkotlin/Function1;", "Lcom/bpjstku/domain/jht/model/Kpj;", "", "kpj", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static updateSessionConfigSynchronous TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1<? super Kpj, Unit> function1, Kpj kpj) {
            updateSessionConfigSynchronous updatesessionconfigsynchronous = new updateSessionConfigSynchronous(function1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_kpj_klaim", kpj);
            updatesessionconfigsynchronous.setArguments(bundle);
            return updatesessionconfigsynchronous;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        Kpj kpj;
        updateSessionConfigSynchronous updatesessionconfigsynchronous = (updateSessionConfigSynchronous) objArr[0];
        int i = 2 % 2;
        Bundle arguments = updatesessionconfigsynchronous.getArguments();
        if (arguments != null) {
            int i2 = cancelAll + 109;
            notify = i2 % 128;
            int i3 = i2 % 2;
            kpj = (Kpj) arguments.getParcelable("key_kpj_klaim");
        } else {
            kpj = null;
        }
        updatesessionconfigsynchronous.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kpj;
        int i4 = cancelAll + 15;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        int i = 2 % 2;
        FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBinding = this.asInterface;
        if (fragmentChooseKpjBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = notify + 7;
            cancelAll = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 3;
            }
            fragmentChooseKpjBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentChooseKpjBottomSheetBinding.rvChooseKpj;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((isZslDisabledByByUserCaseConfig) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        Kpj kpj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (kpj != null) {
            Iterable iterable = ((isZslDisabledByByUserCaseConfig) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            int i4 = cancelAll + 93;
            notify = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            for (Object obj : iterable) {
                if (i6 < 0) {
                    int i7 = cancelAll + 63;
                    notify = i7 % 128;
                    int i8 = i7 % 2;
                    CollectionsKt.throwIndexOverflow();
                }
                Kpj kpj2 = (Kpj) obj;
                kpj2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Intrinsics.areEqual(kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3, kpj2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ((isZslDisabledByByUserCaseConfig) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.set(i6, (Data) kpj2);
                FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBinding2 = this.asInterface;
                if (fragmentChooseKpjBottomSheetBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentChooseKpjBottomSheetBinding2 = null;
                }
                fragmentChooseKpjBottomSheetBinding2.rvChooseKpj.scrollToPosition(i6);
                i6++;
            }
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getA() {
        int i = 2 % 2;
        int i2 = cancelAll + 75;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        int i5 = this.b;
        int i6 = i3 + 73;
        cancelAll = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 89 / 0;
        }
        return i5;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        updateSessionConfigSynchronous updatesessionconfigsynchronous = (updateSessionConfigSynchronous) objArr[0];
        LayoutInflater layoutInflater = (LayoutInflater) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBindingInflate = FragmentChooseKpjBottomSheetBinding.inflate(layoutInflater, viewGroup, false);
        updatesessionconfigsynchronous.asInterface = fragmentChooseKpjBottomSheetBindingInflate;
        Object obj = null;
        if (fragmentChooseKpjBottomSheetBindingInflate == null) {
            int i2 = notify + 25;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseKpjBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseKpjBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        FrameLayout frameLayout = root;
        int i4 = notify + 111;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return frameLayout;
        }
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $10 + 7;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 8328), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1235, 36 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -653973969, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), View.getDefaultSize(0, 0) + 2764, 14 - TextUtils.indexOf("", "", 0), 1504416861, false, $$g(b3, b4, (byte) (b4 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - View.MeasureSpec.getSize(0)), 253 - KeyEvent.normalizeMetaState(0), 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 65200);
                    int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2890;
                    int defaultSize = View.getDefaultSize(0, 0) + 17;
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    String str$$g = $$g(b5, b6, (byte) (b6 + 1));
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, i7, defaultSize, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (g ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) f1423a) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) cancel) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i8 = $11 + 121;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = notify + 117;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43042);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3111;
            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, scrollBarFadeDuration, maximumDrawingCacheSize2, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{11494, 51122, 25180, 26798}, new char[]{14646, 60812, 63165, 25883}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, new char[]{32487, 28466, 51798, 42092, 20002, 43642, 35139, 62417, 34670, 35013, 45847, 47553, 34134, 49281, 18287, 55250, 34842, 57319, 28936, 53065, 22659, 4601}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{11494, 51122, 25180, 26798}, new char[]{38076, 49733, 46348, 32765}, (char) (Color.red(0) + 64949), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 214058388, new char[]{62493, 995, 7932, 21200, 33561, 1488, 33163, 3019, 60918, 20162, 56576, 17036, 49090, 32956, 51887}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0', 0));
            int i4 = 3112 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
            byte[] bArr = $$a;
            byte b3 = bArr[132];
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i4, capsMode, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = cancelAll + 51;
            notify = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') + 42994);
                int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 3111;
                int iBlue = 22 - Color.blue(0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr2[37], bArr2[132], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, capsMode2, iBlue, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int iMyTid = Process.myTid();
            int i9 = ((((~((-33624261) | iMyTid)) * 521) - 1273093274) + (((~((~iMyTid) | (-33624261))) | 1612588056) * 521)) - 1991918663;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{new int[1], new int[]{i8}, new int[]{i7}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{11494, 51122, 25180, 26798}, new char[]{65074, 13440, 9020, 36281}, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 47395), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{2057, 13168, 32714, 42737, 20358, 55497, 26254, 55675, 42365, 19456, 18419, 23102, 59550, 43607, 60571, 57804}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{11494, 51122, 25180, 26798}, new char[]{27070, 11434, 24087, 51730}, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 4702), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{17147, 60792, 41168, 38464, 32878, 47219, 28565, 65453, 41671, 52467, 22680, 13443, 11890, 31478, 25860, 478}, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -1991918663};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[3];
                byte b6 = bArr3[47];
                Object[] objArr11 = new Object[1];
                f(b5, b6, b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[47];
                byte b8 = bArr3[3];
                Object[] objArr12 = new Object[1];
                f(b7, b8, b8, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 43043);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 3111;
                    int iGreen = 22 - Color.green(0);
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    c(bArr4[37], bArr4[132], bArr4[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf2, absoluteGravity, iGreen, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{11494, 51122, 25180, 26798}, new char[]{14646, 60812, 63165, 25883}, (char) View.resolveSizeAndState(0, 0, 0), View.getDefaultSize(0, 0), new char[]{32487, 28466, 51798, 42092, 20002, 43642, 35139, 62417, 34670, 35013, 45847, 47553, 34134, 49281, 18287, 55250, 34842, 57319, 28936, 53065, 22659, 4601}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{11494, 51122, 25180, 26798}, new char[]{38076, 49733, 46348, 32765}, (char) (64997 - AndroidCharacter.getMirror('0')), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 214058387, new char[]{62493, 995, 7932, 21200, 33561, 1488, 33163, 3019, 60918, 20162, 56576, 17036, 49090, 32956, 51887}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mode = (char) (43042 - View.MeasureSpec.getMode(0));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3112;
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[132];
                        byte b10 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        c(b9, b10, b10, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, packedPositionChild, iCombineMeasuredStates, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollDefaultDelay = (char) (43042 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int deadChar = 3111 - KeyEvent.getDeadChar(0, 0);
                        int doubleTapTimeout = 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b11 = $$a[7];
                        byte b12 = b11;
                        Object[] objArr17 = new Object[1];
                        c(b11, b12, b12, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, deadChar, doubleTapTimeout, -1272852037, false, (String) objArr17[0], null);
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
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr = {i15};
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = ~iIdentityHashCode;
            int i18 = i14 + 1556967732 + (((~((-645779519) | i17)) | 1059251940) * 519) + (((~(i17 | (-6098971))) | (~(1065350910 | iIdentityHashCode))) * (-519)) + (((~(iIdentityHashCode | 1059251940)) | 645779518) * 519);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[0])[0] = i20 ^ (i20 << 5);
            Object[] objArr18 = {new int[1], new int[]{i16}, iArr, strArr2};
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 != null) {
            int i21 = cancelAll + 115;
            notify = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (i23 < strArr3.length) {
                arrayList.add(strArr3[i23]);
                i23++;
                int i24 = cancelAll + 71;
                notify = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
        int i26 = ((int[]) objArr[0])[0];
        int i27 = ((int[]) objArr[2])[0];
        int i28 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i27};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i29 = i26 + ((((~((-648201986) | iIdentityHashCode2)) | 408893216) * 398) - 1884893676) + (((~((~iIdentityHashCode2) | (-648201986))) | 408893216) * 398);
        int i30 = (i29 << 13) ^ i29;
        int i31 = i30 ^ (i30 >>> 17);
        ((int[]) objArr[0])[0] = i31 ^ (i31 << 5);
        Object[] objArr19 = {new int[1], new int[]{i28}, iArr2, strArr4};
    }

    public static /* synthetic */ isZslDisabledByByUserCaseConfig b(updateSessionConfigSynchronous updatesessionconfigsynchronous) {
        ArrayList arrayListEmptyList;
        List<SubscribedProgram> list;
        String str;
        String str2;
        int i = 2 % 2;
        ChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1 chooseKpjBottomSheetFragment$chooseKpjAdapter$2$1 = new ChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1(updatesessionconfigsynchronous);
        Context contextRequireContext = updatesessionconfigsynchronous.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) updatesessionconfigsynchronous.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        Object obj = null;
        if (userAsBinder == null || (list = userAsBinder.INotificationSideChannel) == null) {
            arrayListEmptyList = null;
        } else {
            List<SubscribedProgram> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (SubscribedProgram subscribedProgram : list2) {
                int i2 = cancelAll + 109;
                notify = i2 % 128;
                int i3 = i2 % 2;
                String str3 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str4 = str3 == null ? "" : str3;
                String str5 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str5 == null) {
                    int i4 = cancelAll + 59;
                    notify = i4 % 128;
                    if (i4 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str = "";
                } else {
                    str = str5;
                }
                String str6 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str6 == null) {
                    int i5 = notify + 97;
                    cancelAll = i5 % 128;
                    int i6 = i5 % 2;
                    str2 = "";
                } else {
                    str2 = str6;
                }
                String str7 = subscribedProgram.g;
                arrayList.add(new Kpj(str4, str, false, str2, str7 == null ? "" : str7));
            }
            arrayListEmptyList = arrayList;
        }
        if (arrayListEmptyList == null) {
            int i7 = notify + 25;
            cancelAll = i7 % 128;
            if (i7 % 2 != 0) {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        return new isZslDisabledByByUserCaseConfig(contextRequireContext, arrayListEmptyList, chooseKpjBottomSheetFragment$chooseKpjAdapter$2$1);
    }

    static {
        INotificationSideChannel = 1;
        a();
        INSTANCE = new Companion(null);
        int i = onTransact + 35;
        INotificationSideChannel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public updateSessionConfigSynchronous() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 29;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1820738895, 1820738896, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this});
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 11;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (View) TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -193258283, 193258283, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, p0, p1, p2});
    }

    static void a() {
        g = -3472117880639215145L;
        f1423a = -981105359;
        cancel = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, short r8, int r9) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r9 = r9 + 102
            byte[] r0 = defpackage.updateSessionConfigSynchronous.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r9 = r9 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.updateSessionConfigSynchronous.$$g(byte, short, int):java.lang.String");
    }
}
