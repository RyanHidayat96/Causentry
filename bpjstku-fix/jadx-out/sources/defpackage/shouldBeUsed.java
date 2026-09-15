package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.pmi.model.PmiBranchOffice;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerProgramOptionsRegistrationFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onSuggestionClick;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001a\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R.\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010#R\u001a\u0010\u001e\u001a\u00020$8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"LshouldBeUsed;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannelDefault", "cancel", "INotificationSideChannel", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LsetTitleMarginBottom;", "a", "()LsetTitleMarginBottom;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "d", "Ljava/lang/String;", "LonSuggestionClick;", "b", "Lcom/bpjstku/domain/registration/pmi/model/PmiBranchOffice;", "Lcom/bpjstku/domain/registration/pmi/model/PmiBranchOffice;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "", "I", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class shouldBeUsed extends AutoValue_ImmutableImageInfo<FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asBinder;
    private static int cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private PmiBranchOffice TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String d;
    private final Lazy b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {118, 35, -100, -35};
    private static final int $$f = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {74, 60, 122, -26, -4, -20, -6, 6, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 163;
    private static final byte[] $$a = {15, -9, 64, -81, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 240;
    private static int onTransact = 1;
    private static int cancelAll = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: setLayoutInflater
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return shouldBeUsed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: computeFitSystemWindows
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return shouldBeUsed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int asInterface = R.layout.fragment_indonesian_migrant_worker_program_options_registration;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = ~((~i5) | i9);
        int i11 = ~(i9 | i2);
        int i12 = i10 | i11;
        int i13 = (~(i5 | i7)) | i11 | i8;
        int i14 = i3 + i2 + i4 + ((-168536539) * i6) + (1787681333 * i);
        int i15 = i14 * i14;
        int i16 = ((-1349843359) * i3) + 1460535296 + ((-923239215) * i2) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i4) + (1604583424 * i6) + (216268800 * i) + (1778253824 * i15);
        int i17 = (i3 * (-925914073)) + 175428941 + (i2 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i4 * (-925913209)) + (i6 * 1252505731) + (i * 30625011) + (i15 * (-2030960640));
        int i18 = i16 + (i17 * i17 * 899809280);
        if (i18 == 1) {
            shouldBeUsed shouldbeused = (shouldBeUsed) objArr[0];
            int i19 = 2 % 2;
            int i20 = cancelAll + 51;
            notify = i20 % 128;
            int i21 = i20 % 2;
            ((onSuggestionClick) shouldbeused.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Unit unit = Unit.INSTANCE;
            int i22 = notify + 69;
            cancelAll = i22 % 128;
            int i23 = i22 % 2;
            return unit;
        }
        if (i18 != 2) {
            return i18 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
        }
        shouldBeUsed shouldbeused2 = (shouldBeUsed) objArr[0];
        int i24 = 2 % 2;
        shouldbeused2.INotificationSideChannelStub().tvValuePaymentPeriod.setText(new SimpleDateFormat("yyyy").format(new Date()));
        shouldbeused2.d = shouldbeused2.INotificationSideChannelStub().tvJKKJKM.getText().toString();
        shouldbeused2.INotificationSideChannelStub().cvJkkJKM.setBackgroundResource(R.drawable.border_darkmint);
        shouldbeused2.INotificationSideChannelStub().imgChecklistJKKJKM.setVisibility(0);
        RecyclerView recyclerView = shouldbeused2.INotificationSideChannelStub().rvPaymentMonth;
        recyclerView.setLayoutManager(new GridLayoutManager(shouldbeused2.requireContext(), 2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new b());
        recyclerView.setAdapter(shouldbeused2.TuitionPaymentFragmentbindingInflater1());
        int i25 = notify + 87;
        cancelAll = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r0 = r8 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = defpackage.shouldBeUsed.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-10)
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shouldBeUsed.c(short, byte, byte, java.lang.Object[]):void");
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
    private static void f(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 33
            int r7 = r7 + 84
            int r6 = r6 * 5
            int r6 = r6 + 4
            int r8 = r8 * 47
            int r8 = r8 + 6
            byte[] r0 = defpackage.shouldBeUsed.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shouldBeUsed.f(short, short, byte, java.lang.Object[]):void");
    }

    public shouldBeUsed() {
        final shouldBeUsed shouldbeused = this;
        this.b = LazyKt.lazy(new Function0<onSuggestionClick>() { // from class: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerProgramOptionsRegistrationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, onSuggestionClick] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ onSuggestionClick invoke() {
                LifecycleOwner lifecycleOwner = shouldbeused;
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
    }

    /* JADX INFO: renamed from: shouldBeUsed$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LshouldBeUsed$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "p0", "LshouldBeUsed;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;)LshouldBeUsed;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static shouldBeUsed TuitionPaymentFragmentspecialinlinedviewModeldefault2(MigrantWorkerRegistration p0) {
            shouldBeUsed shouldbeused = new shouldBeUsed();
            Bundle bundle = new Bundle();
            bundle.putParcelable("migration_worker_data", p0);
            shouldbeused.setArguments(bundle);
            return shouldbeused;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        Object obj;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 85;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(asBinder)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.green(0), 3291 - (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.keyCodeFromString("") + 31, 1199271174, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 650 - TextUtils.lastIndexOf("", '0'), 44 - (KeyEvent.getMaxKeyCode() >> 16), -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 83;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i10 = $10 + 31;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i11 = $10 + 119;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * i2) + 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 652, View.MeasureSpec.getSize(0) + 44, -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    obj = null;
                } else {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (MotionEvent.axisFromString("") + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 650, 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -450685997, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    obj = null;
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public static final class b extends RecyclerView.ItemDecoration {
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 12;
        private final int TuitionPaymentFragmentbindingInflater1 = 2;

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            rect.top = (int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * Resources.getSystem().getDisplayMetrics().density);
            if (childAdapterPosition % this.TuitionPaymentFragmentbindingInflater1 == 0) {
                rect.right = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2) * Resources.getSystem().getDisplayMetrics().density);
            } else {
                rect.left = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2) * Resources.getSystem().getDisplayMetrics().density);
            }
        }
    }

    private final setTitleMarginBottom TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char size = (char) (31533 - View.MeasureSpec.getSize(0));
            int iIndexOf = 921 - TextUtils.indexOf("", "", 0, 0);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[37], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, iIndexOf, iCombineMeasuredStates, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(false, (Process.myPid() >> 22) + 149, 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 3, new char[]{'\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, 153 - Color.argb(0, 0, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15, 7 - ExpandableListView.getPackedPositionType(0L), new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int i3 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 28;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            byte b4 = bArr2[37];
            Object[] objArr5 = new Object[1];
            c(b3, b4, (byte) (b4 & 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, i3, offsetAfter, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 28;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b5, (byte) (b5 | 50), (byte) (bArr3[17] + 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, keyRepeatTimeout, iIndexOf2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (-1383514516) + (((~((-219719085) | i4)) | (~((-1554360560) | iIdentityHashCode))) * 217) + (((~(iIdentityHashCode | (-219719085))) | 201367724) * 217) + (((~((-1554360560) | i4)) | 219719084) * 217) + 1034245720;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(true, View.getDefaultSize(0, 0) + 149, (ViewConfiguration.getScrollBarSize() >> 8) + 26, 21 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(false, TextUtils.indexOf("", "") + 156, ExpandableListView.getPackedPositionType(0L) + 18, 8 - ExpandableListView.getPackedPositionType(0L), new char[]{2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(false, 148 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), '6' - AndroidCharacter.getMirror('0'), new char[]{65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(false, Color.rgb(0, 0, 0) + 16777368, 16 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1034245720};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[12];
                Object[] objArr13 = new Object[1];
                f(b6, bArr4[10], b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[10];
                Object[] objArr14 = new Object[1];
                f(b7, bArr4[12], b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (31533 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 921;
                    int offsetAfter2 = 28 - TextUtils.getOffsetAfter("", 0);
                    byte[] bArr5 = $$a;
                    byte b8 = bArr5[7];
                    byte b9 = (byte) (bArr5[17] + 1);
                    Object[] objArr16 = new Object[1];
                    c(b8, (byte) (b8 | 50), b9, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iResolveOpacity, offsetAfter2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(false, (Process.myTid() >> 22) + 149, (Process.myPid() >> 22) + 22, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, new char[]{'\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t'}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(false, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 153, (Process.myPid() >> 22) + 15, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 921;
                        int edgeSlop2 = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte[] bArr6 = $$a;
                        byte b10 = bArr6[7];
                        byte b11 = bArr6[37];
                        Object[] objArr19 = new Object[1];
                        c(b10, b11, (byte) (b11 & 52), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, trimmedLength, edgeSlop2, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (31533 - TextUtils.indexOf("", ""));
                        int iCombineMeasuredStates2 = 921 - View.combineMeasuredStates(0, 0);
                        int iBlue = 28 - Color.blue(0);
                        byte[] bArr7 = $$a;
                        byte b12 = bArr7[80];
                        Object[] objArr20 = new Object[1];
                        c(b12, bArr7[37], b12, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iCombineMeasuredStates2, iBlue, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i8 = ((int[]) objArr[1])[0];
        int i9 = ((int[]) objArr[3])[0];
        if (i9 != i8) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i10 = cancelAll + 85;
                while (true) {
                    notify = i10 % 128;
                    int i11 = i10 % 2;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    int i12 = cancelAll + 85;
                    notify = i12 % 128;
                    int i13 = i12 % 2;
                    arrayList.add(strArr[i2]);
                    i2++;
                    i10 = cancelAll + 65;
                }
            }
            throw new RuntimeException(String.valueOf(i9));
        }
        int i14 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i15 = 1531411118 + (((~((~iIdentityHashCode2) | (-1149501762))) | 1082392577) * (-245));
        int i16 = ~(iIdentityHashCode2 | (-1149501762));
        int i17 = i14 + i15 + (i16 * (-245)) + ((i16 | 624577882) * 245);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr21[0])[0] = i19 ^ (i19 << 5);
        int i20 = cancelAll + 25;
        notify = i20 % 128;
        int i21 = i20 % 2;
        setTitleMarginBottom settitlemarginbottom = (setTitleMarginBottom) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        int i22 = cancelAll + 5;
        notify = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 66 / 0;
        }
        return settitlemarginbottom;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding> d() {
        int i = 2 % 2;
        int i2 = cancelAll + 79;
        notify = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerProgramOptionsRegistrationFragment$bindingInflater$1 indonesianMigrantWorkerProgramOptionsRegistrationFragment$bindingInflater$1 = IndonesianMigrantWorkerProgramOptionsRegistrationFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = cancelAll + 51;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return indonesianMigrantWorkerProgramOptionsRegistrationFragment$bindingInflater$1;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 123;
        int i3 = i2 % 128;
        cancelAll = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.asInterface;
        int i5 = i3 + 91;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int i = 2 % 2;
        final FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onInflate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return shouldBeUsed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        MaterialCardView materialCardView = fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBindingINotificationSideChannelStub.cvJkkJKM;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "");
        materialCardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ViewUtils
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return shouldBeUsed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        MaterialCardView materialCardView2 = fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBindingINotificationSideChannelStub.cvJkkJKMJHT;
        Intrinsics.checkNotNullExpressionValue(materialCardView2, "");
        materialCardView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isLayoutRtl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return shouldBeUsed.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        EditText editText = fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBindingINotificationSideChannelStub.tilChooseBranchOffice.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: makeOptionalFitsSystemWindows
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    shouldBeUsed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBindingINotificationSideChannelStub, view);
                }
            });
        }
        int i2 = notify + 87;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilChooseBranchOffice;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        int i2 = notify + 89;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int i = 2 % 2;
        int i2 = cancelAll + 117;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            ((onSuggestionClick) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            throw null;
        }
        ((onSuggestionClick) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i3 = cancelAll + 65;
        notify = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int i = 2 % 2;
        ((onSuggestionClick) this.b.getValue()).g.observe(getViewLifecycleOwner(), new Observer() { // from class: ViewStubCompatOnInflateListener
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                shouldBeUsed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancelAll + 11;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        shouldBeUsed shouldbeused = (shouldBeUsed) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 119;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = shouldbeused.INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        if (i3 != 0) {
            materialButton2.setEnabled(true);
            return null;
        }
        materialButton2.setEnabled(false);
        return null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = cancelAll + 21;
        notify = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = notify + 85;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ MigrantWorkerRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldBeUsed shouldbeused) {
        int i = 2 % 2;
        Bundle arguments = shouldbeused.getArguments();
        if (arguments != null) {
            MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) arguments.getParcelable("migration_worker_data");
            int i2 = notify + 27;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            return migrantWorkerRegistration;
        }
        int i4 = cancelAll + 9;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return null;
    }

    public static /* synthetic */ setTitleMarginBottom TuitionPaymentFragmentspecialinlinedviewModeldefault2(final shouldBeUsed shouldbeused) {
        int i = 2 % 2;
        Context contextRequireContext = shouldbeused.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        setTitleMarginBottom settitlemarginbottom = new setTitleMarginBottom(contextRequireContext, null, new Function1() { // from class: setInflatedId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return shouldBeUsed.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj);
            }
        }, 2, null);
        int i2 = notify + 19;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            return settitlemarginbottom;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(shouldBeUsed shouldbeused, FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding, View view) {
        int i = 2 % 2;
        int i2 = cancelAll + 47;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        shouldbeused.d = fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.tvJKKJKMJHT.getText().toString();
        fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.cvJkkJKMJHT.setBackgroundResource(R.drawable.border_darkmint);
        fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.cvJkkJKM.setBackgroundResource(R.drawable.bg_rounded_8dp);
        fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.imgChecklistJKKJKM.setVisibility(4);
        fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.imgChecklistJKKJKMJHT.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 105;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final shouldBeUsed shouldbeused, final FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            postToMainThread.Companion companion = postToMainThread.INSTANCE;
            postToMainThread posttomainthreadTuitionPaymentFragmentbindingInflater1 = postToMainThread.Companion.TuitionPaymentFragmentbindingInflater1(shouldbeused.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new Function1() { // from class: setLayoutResource
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding, (PmiBranchOffice) obj};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return (Unit) shouldBeUsed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1527163302, -1527163299, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                }
            });
            FragmentManager childFragmentManager = shouldbeused.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(posttomainthreadTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = notify + 85;
                cancelAll = i2 % 128;
                if (i2 % 2 != 0) {
                    posttomainthreadTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, posttomainthreadTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    throw null;
                }
                posttomainthreadTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, posttomainthreadTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldBeUsed shouldbeused, FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (shouldbeused.TuitionPaymentFragmentbindingInflater1 != null) {
            int i2 = cancelAll + 3;
            notify = i2 % 128;
            int i3 = i2 % 2;
            if (fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.cbAgreeTermCondition.isChecked()) {
                int i4 = notify + 47;
                cancelAll = i4 % 128;
                MigrantWorkerRegistration migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = null;
                if (i4 % 2 != 0) {
                    String str = shouldbeused.d;
                    migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1.hashCode();
                    throw null;
                }
                if (shouldbeused.d != null) {
                    MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) shouldbeused.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    if (migrantWorkerRegistration != null) {
                        int i5 = notify + 117;
                        cancelAll = i5 % 128;
                        int i6 = i5 % 2;
                        PmiBranchOffice pmiBranchOffice = shouldbeused.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        String str2 = pmiBranchOffice != null ? pmiBranchOffice.TuitionPaymentFragmentbindingInflater1 : null;
                        PmiBranchOffice pmiBranchOffice2 = shouldbeused.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        String str3 = pmiBranchOffice2 != null ? pmiBranchOffice2.b : null;
                        PmiBranchOffice pmiBranchOffice3 = shouldbeused.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        String str4 = pmiBranchOffice3 != null ? pmiBranchOffice3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                        String str5 = shouldbeused.TuitionPaymentFragmentbindingInflater1;
                        String str6 = shouldbeused.d;
                        migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = MigrantWorkerRegistration.TuitionPaymentFragmentbindingInflater1(migrantWorkerRegistration, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str5, null, null, str2, str3, str4, null, null, str6 == null ? "" : str6, 939524095, 6);
                    }
                    lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                    Camera2CameraControlExternalSyntheticLambda1 camera2CameraControlExternalSyntheticLambda1 = new Camera2CameraControlExternalSyntheticLambda1(migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1);
                    Intrinsics.checkNotNullParameter(camera2CameraControlExternalSyntheticLambda1, "");
                    lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(camera2CameraControlExternalSyntheticLambda1);
                } else if (!fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.cbAgreeTermCondition.isChecked()) {
                    String string = shouldbeused.getString(R.string.message_agreed_tnc);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
                    int i7 = notify + 47;
                    cancelAll = i7 % 128;
                    int i8 = i7 % 2;
                }
            } else if (!fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.cbAgreeTermCondition.isChecked()) {
                String string2 = shouldbeused.getString(R.string.message_agreed_tnc);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
                int i9 = notify + 47;
                cancelAll = i9 % 128;
                int i10 = i9 % 2;
            }
        } else if (!fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.cbAgreeTermCondition.isChecked()) {
            String string3 = shouldbeused.getString(R.string.message_agreed_tnc);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 0).show();
            int i11 = notify + 47;
            cancelAll = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final shouldBeUsed shouldbeused, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = cancelAll + 99;
            notify = i2 % 128;
            if (i2 % 2 != 0) {
                MultiStateView multiStateView = shouldbeused.INotificationSideChannelStub().msvPaymentMonth;
                Intrinsics.checkNotNullExpressionValue(multiStateView, "");
                multiStateView.setViewState(MultiStateView.ViewState.LOADING);
                return;
            } else {
                MultiStateView multiStateView2 = shouldbeused.INotificationSideChannelStub().msvPaymentMonth;
                Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
                multiStateView2.setViewState(MultiStateView.ViewState.LOADING);
                int i3 = 5 / 0;
                return;
            }
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                shouldbeused.write();
                MultiStateView multiStateView3 = shouldbeused.INotificationSideChannelStub().msvPaymentMonth;
                Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
                Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, shouldbeused.getString(R.string.error_error_occured), null, new Pair(shouldbeused.getString(R.string.action_retry), new Function0() { // from class: setOnInflateListener
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        return (Unit) shouldBeUsed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 99688493, -99688492, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    }
                }));
            }
            int i4 = notify + 71;
            cancelAll = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MultiStateView multiStateView4 = shouldbeused.INotificationSideChannelStub().msvPaymentMonth;
        Intrinsics.checkNotNullExpressionValue(multiStateView4, "");
        multiStateView4.setViewState(MultiStateView.ViewState.CONTENT);
        Iterable<CodeNamePair> iterable = (Iterable) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        int i5 = notify + 35;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
        for (CodeNamePair codeNamePair : iterable) {
            arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy(new CodeNamePair(codeNamePair.b, codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1)));
        }
        ArrayList arrayList2 = arrayList;
        ((lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) arrayList2.get(0)).TuitionPaymentFragmentbindingInflater1 = true;
        shouldbeused.TuitionPaymentFragmentbindingInflater1 = ((CodeNamePair) ((lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) arrayList2.get(0)).TuitionPaymentFragmentspecialinlinedviewModeldefault2).b;
        shouldbeused.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList2);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        shouldBeUsed shouldbeused = (shouldBeUsed) objArr[0];
        FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding = (FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding) objArr[1];
        PmiBranchOffice pmiBranchOffice = (PmiBranchOffice) objArr[2];
        int i = 2 % 2;
        int i2 = notify + 93;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pmiBranchOffice, "");
        shouldbeused.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = pmiBranchOffice;
        EditText editText = fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.tilChooseBranchOffice.getEditText();
        if (editText != null) {
            int i4 = notify + 109;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            editText.setText(pmiBranchOffice.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i6 = notify + 57;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0051  */
    /* JADX WARN: Code duplicated, block: B:15:0x0078  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0089 A[EDGE_INSN: B:22:0x0089->B:19:0x0089 BREAK  A[LOOP:0: B:13:0x0055->B:24:0x0055], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0046 A[PHI: r1 r2
  0x0046: PHI (r1v9 java.util.List) = (r1v8 java.util.List), (r1v14 java.util.List) binds: [B:8:0x0044, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:8:0x0044, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(shouldBeUsed shouldbeused, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy) {
        List list;
        int size;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = cancelAll + 121;
        notify = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, "");
        if (i5 != 0) {
            shouldbeused.TuitionPaymentFragmentbindingInflater1 = ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b;
            list = shouldbeused.TuitionPaymentFragmentbindingInflater1().d;
            Intrinsics.checkNotNullExpressionValue(list, "");
            size = list.size() - 1;
            if (size >= 0) {
                i = notify + 91;
                cancelAll = i % 128;
                if (i % 2 != 0) {
                    int i6 = 3 % 4;
                }
                i2 = 0;
                while (true) {
                    lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2 = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) list.get(i2);
                    lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b);
                    shouldbeused.TuitionPaymentFragmentbindingInflater1().d.set(i2, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2);
                    if (i2 != size) {
                        break;
                        break;
                    }
                    int i7 = notify + 43;
                    cancelAll = i7 % 128;
                    if (i7 % 2 != 0) {
                    }
                }
            }
        } else {
            shouldbeused.TuitionPaymentFragmentbindingInflater1 = ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b;
            list = shouldbeused.TuitionPaymentFragmentbindingInflater1().d;
            Intrinsics.checkNotNullExpressionValue(list, "");
            size = list.size() << 1;
            if (size >= 0) {
                i = notify + 91;
                cancelAll = i % 128;
                if (i % 2 != 0) {
                    int i8 = 3 % 4;
                }
                i2 = 0;
                while (true) {
                    lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy3 = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) list.get(i2);
                    lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy3.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy3.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b);
                    shouldbeused.TuitionPaymentFragmentbindingInflater1().d.set(i2, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy3);
                    if (i2 != size) {
                        break;
                    }
                    int i9 = notify + 43;
                    cancelAll = i9 % 128;
                    i2 = i9 % 2 != 0 ? i2 + 49 : i2 + 1;
                }
            }
        }
        shouldbeused.TuitionPaymentFragmentbindingInflater1().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(shouldBeUsed shouldbeused, FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding, View view) {
        int i = 2 % 2;
        int i2 = notify + 3;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        shouldbeused.d = fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.tvJKKJKM.getText().toString();
        fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.cvJkkJKM.setBackgroundResource(R.drawable.border_darkmint);
        fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.cvJkkJKMJHT.setBackgroundResource(R.drawable.bg_rounded_8dp);
        fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.imgChecklistJKKJKM.setVisibility(0);
        fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding.imgChecklistJKKJKMJHT.setVisibility(4);
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 59;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(shouldBeUsed shouldbeused) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 99688493, -99688492, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{shouldbeused}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldBeUsed shouldbeused, FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding, PmiBranchOffice pmiBranchOffice) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1527163302, -1527163299, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{shouldbeused, fragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding, pmiBranchOffice}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    static {
        cancel = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        int i = onTransact + 35;
        cancel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = cancelAll + 85;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1236083679, 1236083681, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1719994092, -1719994092, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        asBinder = -83722416;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r8 = r8 + 119
            byte[] r1 = defpackage.shouldBeUsed.$$c
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shouldBeUsed.$$g(int, short, short):java.lang.String");
    }
}
