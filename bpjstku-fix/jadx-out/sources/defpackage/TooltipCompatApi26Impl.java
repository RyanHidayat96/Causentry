package defpackage;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.pmi.model.request.CheckPassportRequest;
import com.bpjstku.databinding.FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerIdentityVerificationRegisterFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onSuggestionClick;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0015\u0010\u0012\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR.\u0010\u0017\u001a\u001c\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\"R\u001a\u0010\u0006\u001a\u00020#8\u0015X\u0095D¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"LTooltipCompatApi26Impl;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding;", "<init>", "()V", "", "g", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "TuitionPaymentFragmentbindingInflater1", "()Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "cancelAll", "INotificationSideChannelDefault", "cancel", "INotificationSideChannel", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "d", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "b", "LonSuggestionClick;", "Lkotlin/Lazy;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "", "I", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TooltipCompatApi26Impl extends AutoValue_ImmutableImageInfo<FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding> {
    private static int asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancel;
    private static byte[] cancelAll;
    private static int getInterfaceDescriptor;
    private static short[] notify;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Calendar b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {87, 51, -85, 78};
    private static final int $$d = 3;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {92, 126, -38, -95, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 200;
    private static int INotificationSideChannelDefault = 0;
    private static int INotificationSideChannel = 0;
    private static int INotificationSideChannelStubProxy = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~((~i5) | i8 | i4);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i4);
        int i13 = (~(i5 | i7)) | (~(i7 | i2)) | i10;
        int i14 = i4 + i2 + i3 + (1787548100 * i6) + (1101416392 * i);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i4) - 623378432) + (561581232 * i2) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i3) + ((-778043392) * i6) + ((-46137344) * i) + (324403200 * i15);
        int i17 = (i4 * (-930662234)) + 656878810 + (i2 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i3 * (-930661477)) + (i6 * 2052861356) + (i * 749768216) + (i15 * (-2028863488));
        int i18 = i16 + (i17 * i17 * (-1850081280));
        if (i18 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i18 != 3) {
            return i18 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.TooltipCompatApi26Impl.$$a
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = r7 + 84
            int r9 = r9 * 2
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            int r7 = r7 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TooltipCompatApi26Impl.e(byte, byte, short, java.lang.Object[]):void");
    }

    public TooltipCompatApi26Impl() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentbindingInflater1 = calendar;
        Calendar calendar2 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar2, "");
        this.b = calendar2;
        final TooltipCompatApi26Impl tooltipCompatApi26Impl = this;
        this.d = LazyKt.lazy(new Function0<onSuggestionClick>() { // from class: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerIdentityVerificationRegisterFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, onSuggestionClick] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ onSuggestionClick invoke() {
                LifecycleOwner lifecycleOwner = tooltipCompatApi26Impl;
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
        this.g = R.layout.fragment_indonesian_migrant_worker_identity_verification_register;
    }

    /* JADX INFO: renamed from: TooltipCompatApi26Impl$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTooltipCompatApi26Impl$b;", "", "<init>", "()V", "LTooltipCompatApi26Impl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LTooltipCompatApi26Impl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static TooltipCompatApi26Impl TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            TooltipCompatApi26Impl tooltipCompatApi26Impl = new TooltipCompatApi26Impl();
            tooltipCompatApi26Impl.setArguments(new Bundle());
            return tooltipCompatApi26Impl;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding> d() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 27;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerIdentityVerificationRegisterFragment$bindingInflater$1 indonesianMigrantWorkerIdentityVerificationRegisterFragment$bindingInflater$1 = IndonesianMigrantWorkerIdentityVerificationRegisterFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = INotificationSideChannelStubProxy + 99;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return indonesianMigrantWorkerIdentityVerificationRegisterFragment$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        TooltipCompatApi26Impl tooltipCompatApi26Impl = (TooltipCompatApi26Impl) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 11;
        int i3 = i2 % 128;
        INotificationSideChannelStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = tooltipCompatApi26Impl.g;
        if (i4 == 0) {
            throw null;
        }
        int i6 = i3 + 123;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int i = 2 % 2;
        final FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: VectorEnabledTintResources
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.rbKTP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: computePosition
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr = {fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub, compoundButton, Boolean.valueOf(z)};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                TooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2035359733, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2035359734, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.rbPasspor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ViewStubCompat
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr = {fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub, compoundButton, Boolean.valueOf(z)};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                TooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -63150545, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 63150549, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        EditText editText = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilExpirationPassportDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: cancelPendingShow
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr = {this.b, view};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    TooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1999853103, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1999853103, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                }
            });
            int i2 = INotificationSideChannelStubProxy + 101;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
        }
        EditText editText2 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: forceNextChangeSignificant
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
                }
            });
            int i4 = INotificationSideChannel + 61;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        EditText editText3 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilPlacementCountry.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: TooltipCompatHandlerExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TooltipCompatApi26Impl.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
        }
        EditText editText4 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilChooseProvince.getEditText();
        if (editText4 != null) {
            editText4.setOnClickListener(new View.OnClickListener() { // from class: lambdanew0androidxappcompatwidgetTooltipCompatHandler
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws IllegalAccessException {
                    TooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
        }
        EditText editText5 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilChooseCity.getEditText();
        if (editText5 != null) {
            editText5.setOnClickListener(new View.OnClickListener() { // from class: updateAnchorPos
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
        }
    }

    private static void c(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(onTransact)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            char c = '0';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int size = 2267 - View.MeasureSpec.getSize(0);
                int iResolveSizeAndState = 33 - View.resolveSizeAndState(0, 0, 0);
                byte b2 = (byte) ($$d - 3);
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, size, iResolveSizeAndState, 1387473586, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i4 = 1;
            } else {
                int i8 = $11 + 1;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 0;
            }
            if (i4 != 0) {
                int i10 = $11 + 49;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr2 = cancelAll;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $11 + 71;
                        $10 = i12 % 128;
                        if (i12 % i6 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                int iLastIndexOf = TextUtils.lastIndexOf("", c) + 3359;
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 18;
                                byte b4 = (byte) ($$d - 3);
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, iLastIndexOf, deadChar, -1054011043, false, $$e(b4, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr3[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } else {
                            try {
                                Object[] objArr4 = {Integer.valueOf(bArr2[i11])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char size2 = (char) View.MeasureSpec.getSize(0);
                                    int i13 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3357;
                                    int tapTimeout2 = 18 - (ViewConfiguration.getTapTimeout() >> 16);
                                    byte b5 = (byte) ($$d - 3);
                                    byte length4 = (byte) $$c.length;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size2, i13, tapTimeout2, -1054011043, false, $$e(b5, length4, (byte) (length4 - 4)), new Class[]{Integer.TYPE});
                                }
                                bArr3[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                i11++;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        i6 = 2;
                        c = '0';
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i14 = $11 + 15;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        byte[] bArr4 = cancelAll;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                            int i15 = 2267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int mode = 33 - View.MeasureSpec.getMode(0);
                            byte b6 = (byte) ($$d - 3);
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i15, mode, 1387473586, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) / 3046761265686732006L)) >>> ((int) (((long) onTransact) & 3046761265686732006L));
                    } else {
                        byte[] bArr5 = cancelAll;
                        Object[] objArr6 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2267;
                            int iRed = 33 - Color.red(0);
                            byte b8 = (byte) ($$d - 3);
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, doubleTapTimeout, iRed, 1387473586, false, $$e(b8, b9, b9), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr5[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) onTransact) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i5;
                } else {
                    iIntValue = (short) (((short) (((long) notify[i3 + ((int) (((long) asBinder) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) onTransact) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) asBinder) ^ 3046761265686732006L)) + i4;
                Object[] objArr7 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(cancel), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (55905 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int iAlpha = Color.alpha(0) + 2855;
                    int maximumFlingVelocity = 13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b10 = (byte) ($$d - 3);
                    byte b11 = (byte) (b10 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iAlpha, maximumFlingVelocity, -1529949196, false, $$e(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr6 = cancelAll;
                if (bArr6 != null) {
                    int i16 = $11 + 1;
                    int i17 = i16 % 128;
                    $10 = i17;
                    if (i16 % 2 != 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                    }
                    int i18 = i17 + 5;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    for (int i20 = 0; i20 < length; i20++) {
                        bArr[i20] = (byte) (((long) bArr6[i20]) ^ 3046761265686732006L);
                    }
                    bArr6 = bArr;
                }
                boolean z = bArr6 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        int i21 = $11 + 71;
                        $10 = i21 % 128;
                        if (i21 % 2 != 0) {
                            byte[] bArr7 = cancelAll;
                            int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 + 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % (((byte) (((byte) (((long) bArr7[i22]) / 3046761265686732006L)) / s)) ^ b));
                        } else {
                            byte[] bArr8 = cancelAll;
                            int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i23]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                    } else {
                        short[] sArr = notify;
                        int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i24]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
            int i25 = $11 + 55;
            $10 = i25 % 128;
            if (i25 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private final MigrantWorkerRegistration TuitionPaymentFragmentbindingInflater1() {
        Editable text;
        Editable text2;
        String string;
        Editable text3;
        Editable text4;
        Editable text5;
        String str;
        Editable text6;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 61;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub = INotificationSideChannelStub();
        CodeNamePair codeNamePair = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = null;
        String str2 = codeNamePair != null ? codeNamePair.b : null;
        EditText editText = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilPlacementCountry.getEditText();
        String string2 = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
        EditText editText2 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilPassportNumber.getEditText();
        if (editText2 != null) {
            int i4 = INotificationSideChannel + 51;
            INotificationSideChannelStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                editText2.getText();
                obj.hashCode();
                throw null;
            }
            text = editText2.getText();
        } else {
            text = null;
        }
        String string3 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
        EditText editText3 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilIdentityNumber.getEditText();
        if (editText3 != null) {
            int i5 = INotificationSideChannelStubProxy + 43;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            text2 = editText3.getText();
        } else {
            text2 = null;
        }
        if (String.valueOf(text2).length() > 0) {
            int i7 = INotificationSideChannel + 13;
            INotificationSideChannelStubProxy = i7 % 128;
            if (i7 % 2 == 0) {
                fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilIdentityNumber.getEditText();
                obj.hashCode();
                throw null;
            }
            EditText editText4 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilIdentityNumber.getEditText();
            if (editText4 != null) {
                text6 = editText4.getText();
                int i8 = INotificationSideChannelStubProxy + 93;
                INotificationSideChannel = i8 % 128;
                int i9 = i8 % 2;
            } else {
                text6 = null;
            }
            string = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
        } else {
            string = "";
        }
        String str3 = string;
        EditText editText5 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        String string4 = StringsKt.trim((CharSequence) String.valueOf(editText5 != null ? editText5.getText() : null)).toString();
        EditText editText6 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilBirthplace.getEditText();
        String string5 = StringsKt.trim((CharSequence) String.valueOf(editText6 != null ? editText6.getText() : null)).toString();
        EditText editText7 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilFathersName.getEditText();
        String string6 = StringsKt.trim((CharSequence) String.valueOf(editText7 != null ? editText7.getText() : null)).toString();
        EditText editText8 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilFullName.getEditText();
        if (editText8 != null) {
            int i10 = INotificationSideChannel + 117;
            INotificationSideChannelStubProxy = i10 % 128;
            if (i10 % 2 == 0) {
                editText8.getText();
                throw null;
            }
            text3 = editText8.getText();
        } else {
            text3 = null;
        }
        String string7 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
        EditText editText9 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilMothersName.getEditText();
        String string8 = StringsKt.trim((CharSequence) String.valueOf(editText9 != null ? editText9.getText() : null)).toString();
        EditText editText10 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilAddress.getEditText();
        if (editText10 != null) {
            text4 = editText10.getText();
            int i11 = INotificationSideChannel + 17;
            INotificationSideChannelStubProxy = i11 % 128;
            int i12 = i11 % 2;
        } else {
            text4 = null;
        }
        String string9 = StringsKt.trim((CharSequence) String.valueOf(text4)).toString();
        CodeNamePair codeNamePair2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = codeNamePair2 != null ? codeNamePair2.b : null;
        EditText editText11 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilChooseCity.getEditText();
        if (editText11 != null) {
            int i13 = INotificationSideChannel + 91;
            INotificationSideChannelStubProxy = i13 % 128;
            int i14 = i13 % 2;
            text5 = editText11.getText();
        } else {
            text5 = null;
        }
        String string10 = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
        if (fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.rgGender.getCheckedRadioButtonId() == R.id.rbMale) {
            int i15 = INotificationSideChannelStubProxy + 39;
            INotificationSideChannel = i15 % 128;
            int i16 = i15 % 2;
            str = "L";
        } else {
            str = "P";
        }
        String str5 = str;
        EditText editText12 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilChooseProvince.getEditText();
        MigrantWorkerRegistration migrantWorkerRegistration = new MigrantWorkerRegistration(str3, string4, string5, string9, str4, string10, StringsKt.trim((CharSequence) String.valueOf(editText12 != null ? editText12.getText() : null)).toString(), string7, string3, null, str5, string8, string6, str2, string2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32256, 15, null);
        int i17 = INotificationSideChannel + 125;
        INotificationSideChannelStubProxy = i17 % 128;
        if (i17 % 2 != 0) {
            return migrantWorkerRegistration;
        }
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        int i = 2 % 2;
        FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilPlacementCountry;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout2 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout3 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilBirthplace;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout4 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout5 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilFathersName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        TextInputLayout textInputLayout6 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilMothersName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
        String string6 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout6, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
        TextInputLayout textInputLayout7 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilAddress;
        Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
        String string7 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout7, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string7))));
        TextInputLayout textInputLayout8 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilAddress;
        Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
        String string8 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout8, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string8))));
        TextInputLayout textInputLayout9 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilAddress;
        Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
        String string9 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string9, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout9, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string9))));
        TextInputLayout textInputLayout10 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilChooseProvince;
        Intrinsics.checkNotNullExpressionValue(textInputLayout10, "");
        String string10 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string10, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout10, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string10))));
        TextInputLayout textInputLayout11 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilChooseCity;
        Intrinsics.checkNotNullExpressionValue(textInputLayout11, "");
        String string11 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string11, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout11, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string11))));
        int i2 = INotificationSideChannel + 97;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int i = 2 % 2;
        ((onSuggestionClick) this.d.getValue()).b.observe(getViewLifecycleOwner(), new Observer() { // from class: setPendingHandler
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                TooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((onSuggestionClick) this.d.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(getViewLifecycleOwner(), new Observer() { // from class: onHover
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                TooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1115521256, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1115521259, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        int i2 = INotificationSideChannel + 23;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004e A[PHI: r1 r4
  0x004e: PHI (r1v10 com.bpjstku.databinding.FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding) = 
  (r1v9 com.bpjstku.databinding.FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding)
  (r1v22 com.bpjstku.databinding.FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding)
 binds: [B:8:0x004c, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x004e: PHI (r4v2 android.widget.EditText) = (r4v1 android.widget.EditText), (r4v12 android.widget.EditText) binds: [B:8:0x004c, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub;
        EditText editText;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 107;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            TextInputLayout textInputLayout = INotificationSideChannelStub().tilIdentityNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            textInputLayout.setVisibility(0);
            fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub = INotificationSideChannelStub();
            editText = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilPassportNumber.getEditText();
            if (editText != null) {
                Intrinsics.checkNotNullParameter(editText, "");
                editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
            }
        } else {
            TextInputLayout textInputLayout2 = INotificationSideChannelStub().tilIdentityNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            textInputLayout2.setVisibility(0);
            fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub = INotificationSideChannelStub();
            editText = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilPassportNumber.getEditText();
            if (editText != null) {
                Intrinsics.checkNotNullParameter(editText, "");
                editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
            }
        }
        EditText editText2 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilFullName.getEditText();
        if (editText2 != null) {
            Intrinsics.checkNotNullParameter(editText2, "");
            editText2.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText3 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilBirthplace.getEditText();
        if (editText3 != null) {
            Intrinsics.checkNotNullParameter(editText3, "");
            editText3.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText4 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilFathersName.getEditText();
        if (editText4 != null) {
            Intrinsics.checkNotNullParameter(editText4, "");
            editText4.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText5 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilMothersName.getEditText();
        if (editText5 != null) {
            Intrinsics.checkNotNullParameter(editText5, "");
            editText5.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText6 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBindingINotificationSideChannelStub.tilAddress.getEditText();
        if (editText6 != null) {
            Intrinsics.checkNotNullParameter(editText6, "");
            editText6.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        int i3 = INotificationSideChannelStubProxy + 25;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 31;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(false);
        }
        int i3 = INotificationSideChannelStubProxy + 123;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 83;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = INotificationSideChannelStubProxy + 95;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final TooltipCompatApi26Impl tooltipCompatApi26Impl = (TooltipCompatApi26Impl) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: TooltipPopup
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    TooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, i2, i3, i4);
                }
            }, tooltipCompatApi26Impl.b.get(1), tooltipCompatApi26Impl.b.get(2), tooltipCompatApi26Impl.b.get(5)).show();
            ViewPortBuilder.b();
            int i2 = INotificationSideChannelStubProxy + 73;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding = (FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding) objArr[0];
        CompoundButton compoundButton = (CompoundButton) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 45;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(compoundButton, "");
        if (i3 != 0) {
            throw null;
        }
        if (zBooleanValue) {
            TextInputLayout textInputLayout = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilPassportNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            textInputLayout.setVisibility(0);
            TextInputLayout textInputLayout2 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilExpirationPassportDate;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            textInputLayout2.setVisibility(0);
            TextInputLayout textInputLayout3 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilIdentityNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
            textInputLayout3.setVisibility(8);
            int i4 = INotificationSideChannelStubProxy + 123;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            }
        }
        int i6 = INotificationSideChannel + 51;
        INotificationSideChannelStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public static /* synthetic */ Unit b(TooltipCompatApi26Impl tooltipCompatApi26Impl, CodeNamePair codeNamePair) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 125;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        if (i3 != 0) {
            tooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = codeNamePair;
            tooltipCompatApi26Impl.INotificationSideChannelStub().tilPlacementCountry.getEditText();
            throw null;
        }
        tooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = codeNamePair;
        EditText editText = tooltipCompatApi26Impl.INotificationSideChannelStub().tilPlacementCountry.getEditText();
        if (editText != null) {
            editText.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannel + 83;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(TooltipCompatApi26Impl tooltipCompatApi26Impl, CodeNamePair codeNamePair) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        tooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = codeNamePair;
        EditText editText = tooltipCompatApi26Impl.INotificationSideChannelStub().tilChooseProvince.getEditText();
        if (editText != null) {
            int i2 = INotificationSideChannel + 95;
            INotificationSideChannelStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                editText.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            editText.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = INotificationSideChannel + 37;
        INotificationSideChannelStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TooltipCompatApi26Impl tooltipCompatApi26Impl, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy;
        int i3 = i2 + 5;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            tooltipCompatApi26Impl.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            tooltipCompatApi26Impl.write();
            MigrantWorkerRegistration migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = tooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1();
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
            Camera2CameraControlExternalSyntheticLambda1 camera2CameraControlExternalSyntheticLambda1 = new Camera2CameraControlExternalSyntheticLambda1(migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1);
            Intrinsics.checkNotNullParameter(camera2CameraControlExternalSyntheticLambda1, "");
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(camera2CameraControlExternalSyntheticLambda1);
            int i4 = INotificationSideChannelStubProxy + 67;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = i2 + 53;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            tooltipCompatApi26Impl.write();
            getCameraState.Companion companion2 = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = tooltipCompatApi26Impl.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_alert_red, "", strValueOf, string);
            FragmentManager childFragmentManager = tooltipCompatApi26Impl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
    }

    public static /* synthetic */ void b(final TooltipCompatApi26Impl tooltipCompatApi26Impl, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            setTitleTextColor.Companion companion = setTitleTextColor.INSTANCE;
            setTitleTextColor settitletextcolorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setTitleTextColor.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2, new Function1() { // from class: TooltipCompatHandlerExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TooltipCompatApi26Impl.b(this.b, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = tooltipCompatApi26Impl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(settitletextcolorTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = INotificationSideChannel + 97;
                INotificationSideChannelStubProxy = i2 % 128;
                int i3 = i2 % 2;
                settitletextcolorTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(childFragmentManager, settitletextcolorTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i4 = INotificationSideChannel + 65;
                INotificationSideChannelStubProxy = i4 % 128;
                int i5 = i4 % 2;
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TooltipCompatApi26Impl tooltipCompatApi26Impl, int i, int i2, int i3) {
        int i4 = 2 % 2;
        tooltipCompatApi26Impl.b.set(1, i);
        tooltipCompatApi26Impl.b.set(2, i2);
        tooltipCompatApi26Impl.b.set(5, i3);
        tooltipCompatApi26Impl.INotificationSideChannelStub().edtPublishedPassportDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(tooltipCompatApi26Impl.b.getTime()));
        int i5 = INotificationSideChannelStubProxy + 25;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(TooltipCompatApi26Impl tooltipCompatApi26Impl, CodeNamePair codeNamePair) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        tooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = codeNamePair;
        EditText editText = tooltipCompatApi26Impl.INotificationSideChannelStub().tilChooseCity.getEditText();
        if (editText != null) {
            editText.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i2 = INotificationSideChannelStubProxy + 113;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannel + 29;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final TooltipCompatApi26Impl tooltipCompatApi26Impl, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            TrustedWebActivityService1.Companion companion = TrustedWebActivityService1.INSTANCE;
            TrustedWebActivityService1 trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TrustedWebActivityService1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Function1() { // from class: TooltipCompatHandler
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = tooltipCompatApi26Impl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = INotificationSideChannelStubProxy + 69;
                INotificationSideChannel = i2 % 128;
                if (i2 % 2 != 0) {
                    trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i3 = 60 / 0;
                } else {
                    trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, trustedWebActivityService1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            ViewPortBuilder.b();
            int i4 = INotificationSideChannelStubProxy + 51;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        TooltipCompatApi26Impl tooltipCompatApi26Impl = (TooltipCompatApi26Impl) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 35;
        INotificationSideChannelStubProxy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i4 = i2 + 81;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
            tooltipCompatApi26Impl.IconCompatParcelizer();
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            tooltipCompatApi26Impl.write();
            MigrantWorkerRegistration migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = tooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1();
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
            Camera2CameraControlExternalSyntheticLambda1 camera2CameraControlExternalSyntheticLambda1 = new Camera2CameraControlExternalSyntheticLambda1(migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1);
            Intrinsics.checkNotNullParameter(camera2CameraControlExternalSyntheticLambda1, "");
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(camera2CameraControlExternalSyntheticLambda1);
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            tooltipCompatApi26Impl.write();
            getCameraState.Companion companion2 = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = tooltipCompatApi26Impl.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_document_failed, "", strValueOf, string);
            FragmentManager childFragmentManager = tooltipCompatApi26Impl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i6 = INotificationSideChannel + 9;
                INotificationSideChannelStubProxy = i6 % 128;
                int i7 = i6 % 2;
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding = (FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding) objArr[0];
        CompoundButton compoundButton = (CompoundButton) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 85;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(compoundButton, "");
        if (!zBooleanValue) {
            return null;
        }
        TextInputLayout textInputLayout = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilPassportNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        textInputLayout.setVisibility(8);
        TextInputLayout textInputLayout2 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilExpirationPassportDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        textInputLayout2.setVisibility(8);
        TextInputLayout textInputLayout3 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilIdentityNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        textInputLayout3.setVisibility(0);
        int i4 = INotificationSideChannel + 7;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(TooltipCompatApi26Impl tooltipCompatApi26Impl, int i, int i2, int i3) {
        int i4 = 2 % 2;
        tooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1.set(1, i);
        tooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        tooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        tooltipCompatApi26Impl.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(tooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1.getTime()));
        int i5 = INotificationSideChannelStubProxy + 93;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final TooltipCompatApi26Impl tooltipCompatApi26Impl, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getAppRootView
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    TooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i2, i3, i4);
                }
            }, tooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1.get(1), tooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1.get(2), tooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1.get(5)).show();
            ViewPortBuilder.b();
            int i2 = INotificationSideChannelStubProxy + 125;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(TooltipCompatApi26Impl tooltipCompatApi26Impl, FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding, View view) {
        Editable text;
        Editable text2;
        Editable text3;
        Editable text4;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, tooltipCompatApi26Impl.requireContext());
        fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.indonesianMigrantWorkerContainer.requestFocus();
        Object obj = null;
        if (fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.rgRegistrationOption.getCheckedRadioButtonId() == R.id.rbKTP) {
            final onSuggestionClick onsuggestionclick = (onSuggestionClick) tooltipCompatApi26Impl.d.getValue();
            EditText editText = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilFullName.getEditText();
            if (editText != null) {
                int i2 = INotificationSideChannelStubProxy + 89;
                INotificationSideChannel = i2 % 128;
                if (i2 % 2 != 0) {
                    editText.getText();
                    obj.hashCode();
                    throw null;
                }
                text3 = editText.getText();
            } else {
                text3 = null;
            }
            String string = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
            EditText editText2 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilIdentityNumber.getEditText();
            if (editText2 != null) {
                int i3 = INotificationSideChannel + 57;
                INotificationSideChannelStubProxy = i3 % 128;
                if (i3 % 2 == 0) {
                    text4 = editText2.getText();
                    int i4 = 84 / 0;
                } else {
                    text4 = editText2.getText();
                }
            } else {
                text4 = null;
            }
            String string2 = StringsKt.trim((CharSequence) String.valueOf(text4)).toString();
            EditText editText3 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilBirthDate.getEditText();
            CheckResidenceInfoRequest checkResidenceInfoRequest = new CheckResidenceInfoRequest(string, string2, StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString());
            Intrinsics.checkNotNullParameter(checkResidenceInfoRequest, "");
            MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = onsuggestionclick.b;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(onsuggestionclick.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(checkResidenceInfoRequest)));
            final Function1 function1 = new Function1() { // from class: preApi29Check
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return onSuggestionClick.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onsuggestionclick, (BaseModel) obj2);
                }
            };
            logToString logtostring = new logToString() { // from class: SearchViewSearchAutoComplete
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    function1.invoke(obj2);
                }
            };
            final Function1 function2 = new Function1() { // from class: getSearchViewTextMinWidthDp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return onSuggestionClick.a(onsuggestionclick, (Throwable) obj2);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: enoughToFilter
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    function2.invoke(obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            onsuggestionclick.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            final onSuggestionClick onsuggestionclick2 = (onSuggestionClick) tooltipCompatApi26Impl.d.getValue();
            String str = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.rgGender.getCheckedRadioButtonId() == R.id.rbMale ? "L" : "P";
            EditText editText4 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilExpirationPassportDate.getEditText();
            if (editText4 != null) {
                int i5 = INotificationSideChannel + 15;
                INotificationSideChannelStubProxy = i5 % 128;
                if (i5 % 2 == 0) {
                    editText4.getText();
                    throw null;
                }
                text = editText4.getText();
            } else {
                text = null;
            }
            String string3 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
            EditText editText5 = fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding.tilPassportNumber.getEditText();
            if (editText5 != null) {
                int i6 = INotificationSideChannelStubProxy + 105;
                INotificationSideChannel = i6 % 128;
                if (i6 % 2 != 0) {
                    editText5.getText();
                    throw null;
                }
                text2 = editText5.getText();
            } else {
                text2 = null;
            }
            CheckPassportRequest checkPassportRequest = new CheckPassportRequest(str, string3, StringsKt.trim((CharSequence) String.valueOf(text2)).toString());
            Intrinsics.checkNotNullParameter(checkPassportRequest, "");
            MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData2 = onsuggestionclick2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(onsuggestionclick2.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkPassportRequest)));
            final Function1 function3 = new Function1() { // from class: SearchViewSavedState
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return onSuggestionClick.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onsuggestionclick2, (BaseModel) obj2);
                }
            };
            logToString logtostring2 = new logToString() { // from class: replaceText
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    function3.invoke(obj2);
                }
            };
            final Function1 function4 = new Function1() { // from class: setThreshold
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return onSuggestionClick.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onsuggestionclick2, (Throwable) obj2);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: setImeVisibility
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    function4.invoke(obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
            onsuggestionclick2.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        }
        Unit unit = Unit.INSTANCE;
        int i7 = INotificationSideChannel + 53;
        INotificationSideChannelStubProxy = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final TooltipCompatApi26Impl tooltipCompatApi26Impl, View view) throws IllegalAccessException {
        int i;
        int i2 = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            createServiceIntent.Companion companion = createServiceIntent.INSTANCE;
            createServiceIntent createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createServiceIntent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tooltipCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Function1() { // from class: scheduleShow
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TooltipCompatApi26Impl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (CodeNamePair) obj);
                }
            });
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.blue(0) + 46400), 'X' - AndroidCharacter.getMirror('0'), ExpandableListView.getPackedPositionType(0L) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            c((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 427406995, ((byte) KeyEvent.getModifierMetaStateMask()) - 113, (short) (TextUtils.getOffsetAfter("", 0) + 71), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 762562503, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c((-427406990) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 115, (short) (25 - (ViewConfiguration.getScrollBarSize() >> 8)), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 762562525, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
            long j = -1;
            long j2 = j ^ 1875888414298827700L;
            long j3 = 381;
            long j4 = (((long) (-380)) * 1875888414298827700L) + (((long) 382) * 221368760443131287L) + ((jElapsedRealtime | 221368760443131287L | j2) * ((long) (-381))) + ((((j2 | (j ^ 221368760443131287L)) ^ j) | (((jElapsedRealtime ^ j) | 221368760443131287L) ^ j) | (1953013812351074231L ^ j)) * j3) + (j3 * ((j2 | 221368760443131287L) ^ j));
            int i4 = 0;
            while (true) {
                if (i4 == 10) {
                    Object[] objArr3 = new Object[1];
                    c((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 427406985, View.MeasureSpec.getMode(0) - 114, (short) (AndroidCharacter.getMirror('0') - '}'), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 762562540 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(Color.rgb(0, 0, 0) - 410629770, (-114) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (120 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (byte) (ViewConfiguration.getTouchSlop() >> 8), 762562556 - KeyEvent.getDeadChar(0, 0), objArr4);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, tooltipCompatApi26Impl)).intValue();
                    try {
                        Object[] objArr5 = {986411479};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46038), View.MeasureSpec.getMode(0) + 1134, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -267140592, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char mode = (char) View.MeasureSpec.getMode(0);
                                int edgeSlop = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                                int i5 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
                                byte b = $$a[7];
                                byte b2 = b;
                                Object[] objArr7 = new Object[1];
                                e(b, b2, b2, objArr7);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, edgeSlop, i5, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - MotionEvent.axisFromString("")), 1117 - Color.alpha(0), 17 - (ViewConfiguration.getPressedStateDuration() >> 16)), Boolean.TYPE});
                            }
                            Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                            int i6 = ((int[]) objArr8[1])[0];
                            int i7 = ((int[]) objArr8[3])[0];
                            if (i7 == i6) {
                                break;
                            }
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr8[0];
                            if (strArr != null) {
                                int i8 = INotificationSideChannel + 75;
                                INotificationSideChannelStubProxy = i8 % 128;
                                int i9 = i8 % 2;
                                int i10 = 0;
                                while (i10 < strArr.length) {
                                    int i11 = INotificationSideChannel + 87;
                                    INotificationSideChannelStubProxy = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        arrayList.add(strArr[i10]);
                                        i10 += 111;
                                    } else {
                                        arrayList.add(strArr[i10]);
                                        i10++;
                                    }
                                }
                            }
                            throw new RuntimeException(String.valueOf(i7));
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
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.alpha(0) + 37836), 59 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i12 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                long j5 = jLongValue;
                int i13 = 0;
                while (true) {
                    i = i12;
                    for (int i14 = 0; i14 != 8; i14++) {
                        int i15 = INotificationSideChannel + 67;
                        INotificationSideChannelStubProxy = i15 % 128;
                        int i16 = i15 % 2;
                        i = (((((int) (j5 >> i14)) & 255) + (i << 6)) + (i << 16)) - i;
                    }
                    if (i13 != 0) {
                        break;
                    }
                    i13++;
                    i12 = i;
                    j5 = j4;
                }
                if (i == i3) {
                    break;
                }
                int i17 = INotificationSideChannel + 91;
                INotificationSideChannelStubProxy = i17 % 128;
                int i18 = i17 % 2;
                jLongValue -= 1024;
                i4++;
            }
            FragmentManager childFragmentManager = tooltipCompatApi26Impl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i19 = INotificationSideChannelStubProxy + 71;
                INotificationSideChannel = i19 % 128;
                int i20 = i19 % 2;
                createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(childFragmentManager, createserviceintentTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
        } catch (Throwable th3) {
            ViewPortBuilder.b();
            throw th3;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TooltipCompatApi26Impl tooltipCompatApi26Impl, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1999853103, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1999853103, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{tooltipCompatApi26Impl, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding, compoundButton, Boolean.valueOf(z)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -63150545, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 63150549, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ void b(TooltipCompatApi26Impl tooltipCompatApi26Impl, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1115521256, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1115521259, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{tooltipCompatApi26Impl, virtualCameraAdapter1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {fragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding, compoundButton, Boolean.valueOf(z)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2035359733, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2035359734, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static {
        getInterfaceDescriptor = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelDefault + 55;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            int i2 = 94 / 0;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getINotificationSideChannel() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2052747868, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -2052747866, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4)).intValue();
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 111;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 109;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        asBinder = 1579246815;
        onTransact = -1934795625;
        cancel = -1781208555;
        cancelAll = new byte[]{67, 39, 75, 90, 4, 105, 39, 76, 92, 85, 57, 56, -110, 91, 28, 101, 82, 85, 80, 33, 73, 32, 120, 57, 13, 58, 9, 20, 5, 28, 51, 0, 63, 12, 16, 58, 8, 121, -77, -40, -88, -95, -107, -108, -14, -96, -68, -92, 109, -4, -34, -124, -94, 121, 110, -102, 85, -124, -102, ByteCompanionObject.MAX_VALUE, 70, -80, 106, 116, -102, 107, 118, 110, 100};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, byte r7, int r8) {
        /*
            int r7 = r7 + 117
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = defpackage.TooltipCompatApi26Impl.$$c
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r8 = r8 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TooltipCompatApi26Impl.$$e(int, byte, int):java.lang.String");
    }
}
