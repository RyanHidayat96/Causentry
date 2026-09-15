package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.request.SubmitAutodebitBniAutopayRequest;
import com.bpjstku.data.payment.model.response.SubmitAutodebitBniAutopayResponse;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.databinding.ActivityRegisterBniAutodebetBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda1;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ListPopupWindow2;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getCameraOperatingMode;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u0015\u0010\u0007\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0014\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0015\u0010\u0018\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010!"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/RegisterBniAutodebetActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityRegisterBniAutodebetBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "getInterfaceDescriptor", "d", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "LListPopupWindow2;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "Lcom/bpjstku/domain/user/model/User;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "g", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegisterBniAutodebetActivity extends BindingReactiveFormActivity<ActivityRegisterBniAutodebetBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asBinder;
    private static int[] asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: createVoiceWebSearchIntent
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegisterBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: createVoiceAppSearchIntent
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegisterBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });
    private static final byte[] $$c = {1, -81, 2, 79};
    private static final int $$f = 174;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 36;
    private static int cancelAll = 1;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f538a = 1;

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i);
        int i11 = ~i2;
        int i12 = (~(i8 | i11 | i6)) | i10;
        int i13 = (~(i | i11)) | (~(i7 | i11));
        int i14 = i6 + i2 + i4 + (1941422536 * i5) + ((-555707305) * i3);
        int i15 = i14 * i14;
        int i16 = (i6 * (-2131549542)) + 177471488 + ((-2131549542) * i2) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i4) + ((-1363148800) * i5) + (2141716480 * i3) + ((-573308928) * i15);
        int i17 = ((i6 * 487360618) - 1291405921) + (i2 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i4 * 487361161) + (i5 * (-1188264952)) + (i3 * 624576655) + (i15 * (-25952256));
        int i18 = i16 + (i17 * i17 * 74186752);
        if (i18 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i18 != 2) {
            return i18 != 3 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = 144 - r6
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r0 = 53 - r5
            byte[] r1 = com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity.$$a
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
        L29:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity.c(int, int, short, java.lang.Object[]):void");
    }

    public RegisterBniAutodebetActivity() {
        final RegisterBniAutodebetActivity registerBniAutodebetActivity = this;
        this.b = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = registerBniAutodebetActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListPopupWindow2.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = registerBniAutodebetActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/RegisterBniAutodebetActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/tuition/model/CustomerObject;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, CustomerObject p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) RegisterBniAutodebetActivity.class);
            intent.putExtra("customer_object_recurring", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityRegisterBniAutodebetBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f538a + 15;
        g = i2 % 128;
        int i3 = i2 % 2;
        RegisterBniAutodebetActivity$bindingInflater$1 registerBniAutodebetActivity$bindingInflater$1 = RegisterBniAutodebetActivity$bindingInflater$1.b;
        int i4 = f538a + 41;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return registerBniAutodebetActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = INotificationSideChannelStub().btnProcess;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: createIntentFromSuggestion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegisterBniAutodebetActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = f538a + 19;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((ListPopupWindow2) this.b.getValue()).RemoteActionCompatParcelizer.observe(this, new Observer() { // from class: dismissSuggestions
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegisterBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = f538a + 71;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        RegisterBniAutodebetActivity registerBniAutodebetActivity = (RegisterBniAutodebetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 61;
        f538a = i2 % 128;
        int i3 = i2 % 2;
        Button button = registerBniAutodebetActivity.INotificationSideChannelStub().btnProcess;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
        int i4 = f538a + 85;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return null;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilValueAccountNumberBni;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_minmax_account_no_bni);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, 10, 10))));
        TextInputLayout textInputLayout2 = INotificationSideChannelStub().tilValueAccountNumberBniDebitCard;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_minmax_debit_card_no_bni);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16))));
        int i2 = f538a + 13;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = asInterface;
        char c = '0';
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 123;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr2[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", c, i6) + 1);
                        int i10 = 3290 - (ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1));
                        int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30;
                        byte b = (byte) ($$c[i6] - 1);
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i10, i11, 1948206109, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    c = '0';
                    i4 = -1870535734;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = asInterface;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $11 + 57;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr5[i12]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iLastIndexOf = 3290 - TextUtils.lastIndexOf("", '0', 0);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 31;
                        byte b3 = (byte) ($$c[0] - 1);
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, iLastIndexOf, pressedStateDuration, 1948206109, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i12++;
                    int i15 = $10 + 25;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    iArr5 = iArr5;
                    i5 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        int i17 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i18 = $10 + 45;
            $11 = i18 % 128;
            int i19 = i18 % i17;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            for (int i20 = 17; i20 > 1; i20--) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i20];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int i21 = 2559 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int gidForName = 28 - Process.getGidForName("");
                    byte b5 = $$c[0];
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, i21, gidForName, 683220507, false, $$i(b6, b6, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i22 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i23 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), View.MeasureSpec.getMode(0) + 348, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i17 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        RegisterBniAutodebetActivity registerBniAutodebetActivity = (RegisterBniAutodebetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f538a + 79;
        g = i2 % 128;
        int i3 = i2 % 2;
        RegisterBniAutodebetActivity registerBniAutodebetActivity2 = registerBniAutodebetActivity;
        Intrinsics.checkNotNullParameter(registerBniAutodebetActivity2, "");
        registerBniAutodebetActivity2.getWindow().addFlags(8192);
        registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1(registerBniAutodebetActivity.INotificationSideChannelStub().layoutToolbar.toolbar, true);
        registerBniAutodebetActivity.INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText("Daftar Autodebit");
        EditText editText = registerBniAutodebetActivity.INotificationSideChannelStub().tilValueParticipantName.getEditText();
        if (editText != null) {
            editText.setText(((CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).b.toString());
        }
        EditText editText2 = registerBniAutodebetActivity.INotificationSideChannelStub().tilValueParticipantId.getEditText();
        if (editText2 != null) {
            int i4 = g + 13;
            f538a = i4 % 128;
            int i5 = i4 % 2;
            editText2.setText(((CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.toString());
        }
        EditText editText3 = registerBniAutodebetActivity.INotificationSideChannelStub().tilValueParticipantAmountTuition.getEditText();
        if (editText3 != null) {
            editText3.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(((CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).IconCompatParcelizer).toString());
        }
        EditText editText4 = registerBniAutodebetActivity.INotificationSideChannelStub().tilValueParticipantProgram.getEditText();
        if (editText4 == null) {
            return null;
        }
        editText4.setText(String.valueOf(((CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        return null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = g + 47;
        f538a = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = f538a + 53;
                g = i3 % 128;
                if (i3 % 2 != 0) {
                    onBackPressed();
                    int i4 = 62 / 0;
                } else {
                    onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = g + 51;
        f538a = i2 % 128;
        if (i2 % 2 == 0) {
            Button button = INotificationSideChannelStub().btnProcess;
            Intrinsics.checkNotNullExpressionValue(button, "");
            Button button2 = button;
            Intrinsics.checkNotNullParameter(button2, "");
            button2.setEnabled(true);
            return;
        }
        Button button3 = INotificationSideChannelStub().btnProcess;
        Intrinsics.checkNotNullExpressionValue(button3, "");
        Button button4 = button3;
        Intrinsics.checkNotNullParameter(button4, "");
        button4.setEnabled(false);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        int i2 = g + 119;
        f538a = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1031;
            int touchSlop2 = 15 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 141), bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, iIndexOf, touchSlop2, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{930276368, 991319775, -2017025540, -296173335, -241200439, 1271736931, -1141950769, -386550644, 34889308, 1549646918, -1316827489, -1215372345, 1686163228, -992207667}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{-1760365471, -367929000, -1431542624, -1724737742, -580804172, 1536746110, 1649189031, -419404787, -769776797, -1521861896}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
            int trimmedLength = TextUtils.getTrimmedLength("") + 15;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 89), bArr2[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, doubleTapTimeout, trimmedLength, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
                int i4 = $$b;
                Object[] objArr6 = new Object[1];
                c((byte) (i4 | 16), (short) (i4 + 1), $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iIndexOf2, threadPriority, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ~System.identityHashCode(this);
            int i8 = ((1061477704 + (((~((-721019343) | i7)) | 476739172) * (-933))) + (((~(i7 | 476739172)) | (-1056700399)) * 933)) - 561069553;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
            int i11 = g + 81;
            f538a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{1171326311, -2117003729, 987075726, 1557401306, 984189413, -468196051, 496540852, -549399995, -1902525681, 164837427}, KeyEvent.normalizeMetaState(0) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{1620037631, -306220845, -590602159, 2020418226, 2038671942, 910203701, -383552016, 1655682640, 1832612865, -1723151145}, Drawable.resolveOpacity(0, 0) + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1174443693};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - MotionEvent.axisFromString("")), 1133 - TextUtils.indexOf((CharSequence) "", '0'), Drawable.resolveOpacity(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -218882193, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                    int iRed = Color.red(0) + 15;
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    c(b3, (short) (b3 | 141), bArr3[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, iIndexOf3, iRed, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.MeasureSpec.getMode(0)), 1117 - View.combineMeasuredStates(0, 0), Color.alpha(0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cMyTid = (char) (Process.myTid() >> 22);
                    int i13 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
                    int iAlpha = Color.alpha(0) + 15;
                    int i14 = $$b;
                    Object[] objArr13 = new Object[1];
                    c((byte) (i14 | 16), (short) (i14 + 1), $$a[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, i13, iAlpha, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{930276368, 991319775, -2017025540, -296173335, -241200439, 1271736931, -1141950769, -386550644, 34889308, 1549646918, -1316827489, -1215372345, 1686163228, -992207667}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 84, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{-1760365471, -367929000, -1431542624, -1724737742, -580804172, 1536746110, 1649189031, -419404787, -769776797, -1521861896}, MotionEvent.axisFromString("") + 16, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                        int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        c(b4, (short) (b4 | 89), bArr4[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSizeAndState, edgeSlop, maxKeyCode, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cRgb2 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                        int iBlue = Color.blue(0) + 1031;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                        byte[] bArr5 = $$a;
                        byte b5 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b5, (short) (b5 | 141), bArr5[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRgb2, iBlue, absoluteGravity, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 == i15) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[3])[0];
            int i19 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 666885294;
            int i21 = ~((-9670033) | i20);
            int i22 = ~i20;
            int i23 = i17 + (-392840928) + ((i21 | (~((-201871426) | i22))) * 497) + (((~(i20 | (-201871426))) | (~((-32738713) | i22)) | 23068680) * 497);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i26 = g + 97;
                f538a = i26 % 128;
                int i27 = i26 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iNextInt = new Random().nextInt(250736493);
            int i31 = i28 + (((81689352 + (((~((-539005291) | iNextInt)) | (~((-294725121) | iNextInt))) * 69)) + (((~(iNextInt | (-530263701))) | ((~((-774543871) | iNextInt)) | 235538580)) * (-69))) - 765116347);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
            int iIndexOf4 = 22 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr6 = $$a;
            Object[] objArr20 = new Object[1];
            c((byte) (bArr6[33] - 1), (short) ($$b + 1), bArr6[132], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(windowTouchSlop, scrollBarFadeDuration, iIndexOf4, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                int trimmedLength2 = 1755 - TextUtils.getTrimmedLength("");
                int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                byte[] bArr7 = $$a;
                byte b6 = bArr7[7];
                Object[] objArr21 = new Object[1];
                c(b6, (short) (b6 | 89), bArr7[132], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(capsMode, trimmedLength2, offsetBefore, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i34 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step7).substring(0, 3).length() - 1531063387);
            int i35 = (-251538111) + (((~(i34 | 884998095)) | (~((-756102) | i34))) * (-184)) + ((548422210 | (~((-549178312) | i34)) | (~(336575885 | i34))) * 184) + 1371319659;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new int[]{1171326311, -2117003729, 987075726, 1557401306, 984189413, -468196051, 496540852, -549399995, -1902525681, 164837427}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 95, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new int[]{1620037631, -306220845, -590602159, 2020418226, 2038671942, 910203701, -383552016, 1655682640, 1832612865, -1723151145}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1051).substring(0, 32).codePointAt(22) - 84, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1174443693};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 42049), 1727 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1262349341);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int pressedStateDuration2 = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int i38 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                byte[] bArr8 = $$a;
                byte b7 = bArr8[7];
                Object[] objArr26 = new Object[1];
                c(b7, (short) (b7 | 89), bArr8[132], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c, pressedStateDuration2, i38, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{930276368, 991319775, -2017025540, -296173335, -241200439, 1271736931, -1141950769, -386550644, 34889308, 1549646918, -1316827489, -1215372345, 1686163228, -992207667}, 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{-1760365471, -367929000, -1431542624, -1724737742, -580804172, 1536746110, 1649189031, -419404787, -769776797, -1521861896}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char threadPriority2 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                    int offsetBefore2 = 1755 - TextUtils.getOffsetBefore("", 0);
                    int iAxisFromString = MotionEvent.axisFromString("") + 24;
                    byte[] bArr9 = $$a;
                    byte b8 = bArr9[7];
                    Object[] objArr29 = new Object[1];
                    c(b8, b8, bArr9[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(threadPriority2, offsetBefore2, iAxisFromString, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                    int iIndexOf5 = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int edgeSlop2 = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((byte) (bArr10[33] - 1), (short) ($$b + 1), bArr10[132], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, iIndexOf5, edgeSlop2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i39 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i40 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i40 == i39) {
            int i41 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i42 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i43 = (-1383507495) + (((~(345465481 | i42)) | (-132863056)) * 672);
            int i44 = ~i42;
            int i45 = i41 + i43 + (((~(i42 | (-132863056))) | (~((-345465482) | i44))) * (-672)) + (((~(132863055 | i44)) | (-402618064)) * 672);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr31[3])[0] = i47 ^ (i47 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
        if (strArr5 != null) {
            int i48 = g + 59;
            f538a = i48 % 128;
            int i49 = i48 % 2;
            for (String str2 : strArr5) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i40 / (((i40 - 1) * i40) % 2), 0).show();
        int i50 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).codePointAt(0) + 897537022;
        int i51 = ~((-626902018) | (~iCodePointAt));
        int i52 = i50 + (((-1040053704) | i51 | (~(626902017 | iCodePointAt))) * (-338)) + 861768745 + (((~(iCodePointAt | (-413151687))) | i51) * 338);
        int i53 = (i52 << 13) ^ i52;
        int i54 = i53 ^ (i53 >>> 17);
        ((int[]) objArr32[3])[0] = i54 ^ (i54 << 5);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        RegisterBniAutodebetActivity registerBniAutodebetActivity = (RegisterBniAutodebetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 113;
        f538a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i5 = ~iMaxMemory;
        if (i4 != (-1437295504) + (((~(1881456286 | i5)) | (-1051468744) | (~((-1881456287) | iMaxMemory))) * (-564)) + ((~(iMaxMemory | (-807674503))) * 1128) + (((~((-1051468744) | i5)) | 1073781784) * 564)) {
            int[] iArr = new int[527405608];
            iArr[527405607] = 1;
            int i6 = (-1565387752) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = g + 11;
            f538a = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i10 = (-1961573784) + (((~((~iMyTid) | (-1657166685))) | 1074008412) * (-245));
        int i11 = ~(iMyTid | (-1657166685));
        if (i9 != i10 + (i11 * (-245)) + ((i11 | 921889280) * 245)) {
            throw null;
        }
        super.onResume();
        int i12 = f538a + 123;
        g = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -833610709
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c0, code lost:
    
        if (r1 != ((((1074079744 | r2) * (-196)) - 553700132) + ((r2 | 432670240) * 196))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c2, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity.f538a + 105;
        com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity.g = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ce, code lost:
    
        if ((r11 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d1, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d5, code lost:
    
        r11 = 1295739766 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00de, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e6, code lost:
    
        throw new java.lang.RuntimeException("1790277623");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0065, code lost:
    
        if (r1 == ((((-1496895556) + (((~(1762216419 | r5)) | (-2140794864)) * 98)) + ((((~(r5 | (-932228877))) | 1762216419) | (~(932228876 | r4))) * (-49))) + (((~(r4 | 1762216419)) | 1208565987) * 49))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009a, code lost:
    
        if (r1 == (((1312266488 + (((~(1763213491 | r5)) | (~((-933225949) | r4))) * (-370))) + ((((~(r4 | 1763213491)) | (~(r5 | (-933225949)))) | 1207959587) * (-370))) + 268448406)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009c, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = ~(java.lang.System.identityHashCode(r10) | 1506749984);
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = g + 5;
        f538a = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = f538a + 115;
        g = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ CustomerObject TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegisterBniAutodebetActivity registerBniAutodebetActivity) {
        int i = 2 % 2;
        int i2 = g + 119;
        f538a = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = registerBniAutodebetActivity.getIntent().getParcelableExtra("customer_object_recurring");
        Intrinsics.checkNotNull(parcelableExtra);
        CustomerObject customerObject = (CustomerObject) parcelableExtra;
        int i4 = g + 85;
        f538a = i4 % 128;
        int i5 = i4 % 2;
        return customerObject;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegisterBniAutodebetActivity registerBniAutodebetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        Editable text;
        Editable text2;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registerBniAutodebetActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registerBniAutodebetActivity.IconCompatParcelizer();
            registerBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerBniAutodebetActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: getChildBoundsWithinSearchView
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {115, 98, 19, 9, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
                private static final int $$b = 235;
                private static int b = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -605789984997350161L;

                /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                /* JADX WARN: Code duplicated, block: B:8:0x001b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
                    /*
                        byte[] r0 = defpackage.getChildBoundsWithinSearchView.$$a
                        int r8 = r8 * 14
                        int r8 = r8 + 84
                        int r7 = 145 - r7
                        int r9 = r9 + 1
                        byte[] r1 = new byte[r9]
                        r2 = 0
                        if (r0 != 0) goto L13
                        r8 = r7
                        r3 = r9
                        r4 = r2
                        goto L29
                    L13:
                        r3 = r2
                    L14:
                        int r4 = r3 + 1
                        byte r5 = (byte) r8
                        r1[r3] = r5
                        if (r4 != r9) goto L23
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L23:
                        r3 = r0[r7]
                        r6 = r8
                        r8 = r7
                        r7 = r3
                        r3 = r6
                    L29:
                        int r7 = -r7
                        int r3 = r3 + r7
                        int r7 = r8 + 1
                        int r8 = r3 + (-11)
                        r3 = r4
                        goto L14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.getChildBoundsWithinSearchView.c(int, int, byte, java.lang.Object[]):void");
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                    b = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitG = RegisterBniAutodebetActivity.g();
                    if (i4 != 0) {
                        int i5 = 73 / 0;
                    }
                    return unitG;
                }

                /* JADX WARN: Code duplicated, block: B:61:0x025e  */
                /* JADX WARN: Code duplicated, block: B:62:0x025f  */
                private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
                    Object obj;
                    Throwable cause;
                    int i3 = 2 % 2;
                    getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                    getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
                    int length = cArr.length;
                    long[] jArr = new long[length];
                    getrealtimecapturelatency.b = 0;
                    while (true) {
                        obj = null;
                        if (getrealtimecapturelatency.b >= cArr.length) {
                            break;
                        }
                        int i4 = $11 + 55;
                        $10 = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = getrealtimecapturelatency.b;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 2624 - KeyEvent.keyCodeFromString(""), 13 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                                }
                                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() | (TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 9053247990562531611L);
                                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - TextUtils.lastIndexOf("", '0')), View.resolveSize(0, 0) + 481, 36 - ExpandableListView.getPackedPositionChild(0L), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                            } catch (Throwable th) {
                                cause = th.getCause();
                                if (cause != null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            int i6 = getrealtimecapturelatency.b;
                            try {
                                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Process.getGidForName("") + 2625, (-16777203) - Color.rgb(0, 0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                                }
                                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                                try {
                                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - TextUtils.indexOf("", "")), View.resolveSize(0, 0) + 481, 37 - (ViewConfiguration.getTapTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        }
                        int i7 = $11 + 117;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    char[] cArr2 = new char[length];
                    getrealtimecapturelatency.b = 0;
                    while (getrealtimecapturelatency.b < cArr.length) {
                        int i9 = $11 + 117;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39421 - ImageFormat.getBitsPerPixel(0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 480, View.combineMeasuredStates(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                            obj.hashCode();
                            throw null;
                        }
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (Color.rgb(0, 0, 0) + 16816638), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 481, 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    }
                    objArr[0] = new String(cArr2);
                }

                /* JADX WARN: Code duplicated, block: B:124:0x02a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:43:0x0281  */
                /* JADX WARN: Code duplicated, block: B:45:0x0287  */
                /* JADX WARN: Code duplicated, block: B:49:0x02a6  */
                /* JADX WARN: Code duplicated, block: B:53:0x0312 A[Catch: all -> 0x03f8, TryCatch #4 {all -> 0x03f8, blocks: (B:51:0x0305, B:53:0x0312, B:54:0x0356), top: B:125:0x0305, outer: #3 }] */
                /* JADX WARN: Code duplicated, block: B:62:0x0401 A[Catch: Exception -> 0x057b, TRY_LEAVE, TryCatch #3 {Exception -> 0x057b, blocks: (B:46:0x02a0, B:50:0x02b1, B:56:0x0367, B:58:0x03f9, B:60:0x03ff, B:61:0x0400, B:62:0x0401, B:64:0x0436, B:77:0x04bf, B:81:0x04fc, B:86:0x055b, B:91:0x0573, B:93:0x0579, B:94:0x057a, B:82:0x0506, B:84:0x0513, B:85:0x0554, B:51:0x0305, B:53:0x0312, B:54:0x0356), top: B:124:0x02a0, inners: #0, #4 }] */
                /* JADX WARN: Code duplicated, block: B:67:0x044e  */
                /* JADX WARN: Code duplicated, block: B:69:0x0457  */
                /* JADX WARN: Code duplicated, block: B:72:0x0468  */
                /* JADX WARN: Code duplicated, block: B:73:0x047a  */
                /* JADX WARN: Code duplicated, block: B:76:0x04b0  */
                /* JADX WARN: Code duplicated, block: B:79:0x04c1  */
                /* JADX WARN: Code duplicated, block: B:84:0x0513 A[Catch: all -> 0x0572, TryCatch #0 {all -> 0x0572, blocks: (B:82:0x0506, B:84:0x0513, B:85:0x0554), top: B:118:0x0506, outer: #3 }] */
                /* JADX WARN: Code duplicated, block: B:88:0x0561  */
                /* JADX WARN: Code duplicated, block: B:89:0x0563  */
                public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i2, int i3, int i4) throws Throwable {
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    String str;
                    int i11;
                    int iB;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    int i20;
                    int i21;
                    int i22;
                    Object[] objArr;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    Class<?> cls;
                    char[] cArr;
                    int tapTimeout;
                    int i23;
                    int i24;
                    int i25;
                    int i26;
                    int i27;
                    int i28 = 2 % 2;
                    int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i30 = i29 + 55;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    int i32 = i29 + 71;
                    b = i32 % 128;
                    Object obj = null;
                    if (i32 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (context != null) {
                        ScholarshipHistoryRequest.b();
                        ScholarshipHistoryRequest.b();
                        int i33 = b;
                        int i34 = (i33 ^ 7) + ((i33 & 7) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i34 % 128;
                        try {
                            if (i34 % 2 == 0) {
                                Object[] objArr2 = new Object[1];
                                a(new char[]{52629, 62907, 48594, 26085, 11551, 54584, 40278, 17725, 3231, 13490, 64720, 42219, 27677, 5175, 56398, 33845, 20391, 30634, 16328, 59379, 44805, 22329, 8022}, 1528 >>> TextUtils.getTrimmedLength(""), objArr2);
                                cls = Class.forName((String) objArr2[0]);
                                cArr = new char[]{52627, 65444, 43498, 23338, 1360, 13965, 57510, 37614, 23615, 3656, 15250, 58842, 38887, 16683, 29531, 15489, 61122, 38942};
                                tapTimeout = ViewConfiguration.getTapTimeout();
                                i23 = 32243;
                                i24 = 100;
                            } else {
                                Object[] objArr3 = new Object[1];
                                a(new char[]{52629, 62907, 48594, 26085, 11551, 54584, 40278, 17725, 3231, 13490, 64720, 42219, 27677, 5175, 56398, 33845, 20391, 30634, 16328, 59379, 44805, 22329, 8022}, 14369 - TextUtils.getTrimmedLength(""), objArr3);
                                cls = Class.forName((String) objArr3[0]);
                                cArr = new char[]{52627, 65444, 43498, 23338, 1360, 13965, 57510, 37614, 23615, 3656, 15250, 58842, 38887, 16683, 29531, 15489, 61122, 38942};
                                tapTimeout = ViewConfiguration.getTapTimeout();
                                i23 = 12853;
                                i24 = 16;
                            }
                            int i35 = (i23 - (~(-(tapTimeout >> i24)))) - 1;
                            Object[] objArr4 = new Object[1];
                            a(cArr, i35, objArr4);
                            Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                            int i36 = -(-View.getDefaultSize(0, 0));
                            int i37 = ((i36 | 48341) << 1) - (i36 ^ 48341);
                            Object[] objArr5 = new Object[1];
                            a(new char[]{52629, 29007, 46138, 64505, 16079, 32180, 41326, 58377, 11071, 28390, 44488, 53415, 5229, 23371, 40486, 56737, 212, 18364, 35616, 52858, 3360, 45309, 63446, 15038, 32367, 48472, 57378, 10218, 27351, 43451, 60747, 4177, 22322, 39662}, i37, objArr5);
                            Class<?> cls2 = Class.forName((String) objArr5[0]);
                            char[] cArr2 = {52626, 15063, 8971, 10366, 4283};
                            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                            int iB2 = ScholarshipHistoryRequest.b();
                            int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
                            int i39 = i38 % 128;
                            b = i39;
                            int i40 = i38 % 2;
                            int i41 = ~fadingEdgeLength;
                            int i42 = ~iB2;
                            int i43 = ~(i41 | i42);
                            int i44 = ((fadingEdgeLength * 866) - 54700704) + ((((-63312) ^ i43) | ((-63312) & i43)) * (-865));
                            int i45 = -(-((~((fadingEdgeLength ^ iB2) | (fadingEdgeLength & iB2))) * 865));
                            int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                            int i47 = ~iB2;
                            int i48 = ~((i47 & (-63312)) | ((-63312) ^ i47));
                            int i49 = i39 + 97;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i49 % 128;
                            if (i49 % 2 == 0) {
                                int i50 = i46 << (865 % ((~((i42 ^ fadingEdgeLength) | (i42 & fadingEdgeLength))) | i48));
                                Object[] objArr6 = new Object[1];
                                a(cArr2, i50, objArr6);
                                i25 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 5;
                                i26 = i2;
                            } else {
                                int i51 = (i46 - (~(((~((i42 ^ fadingEdgeLength) | (i42 & fadingEdgeLength))) | i48) * 865))) - 1;
                                Object[] objArr7 = new Object[1];
                                a(cArr2, i51, objArr7);
                                i25 = cls2.getField((String) objArr7[0]).getInt(objInvoke) & 2;
                                i26 = (~(i2 & 1)) & (i2 | 1);
                            }
                            int i52 = b + 41;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i52 % 128;
                            if (i52 % 2 == 0) {
                                int i53 = (i25 | (-i25)) * 5;
                                i27 = (i53 & i26) | ((~i53) & i2);
                            } else {
                                int i54 = -i25;
                                int i55 = ((i25 & i54) | (i25 ^ i54)) >> 31;
                                int i56 = (~i55) & i2;
                                int i57 = i55 & i26;
                                i27 = (i57 & i56) | (i56 ^ i57);
                            }
                            i5 = i27;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        i5 = i2;
                    }
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char defaultSize = (char) (16949 - View.getDefaultSize(0, 0));
                            int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2739;
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13;
                            byte b2 = $$a[7];
                            Object[] objArr8 = new Object[1];
                            c((short) 141, b2, (byte) (b2 | 52), objArr8);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, fadingEdgeLength2, maximumDrawingCacheSize, 1501733736, false, (String) objArr8[0], new Class[0]);
                        }
                        Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cArgb = (char) (16949 - Color.argb(0, 0, 0, 0));
                            int i58 = 2740 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 13;
                            byte b3 = $$a[7];
                            Object[] objArr9 = new Object[1];
                            c((short) 89, b3, (byte) (b3 | 52), objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, i58, edgeSlop, 47863026, false, (String) objArr9[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 16949);
                                int gidForName = 2738 - Process.getGidForName("");
                                int i59 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13;
                                byte b4 = $$a[7];
                                Object[] objArr10 = new Object[1];
                                c((short) 37, b4, (byte) (b4 | 37), objArr10);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout2, gidForName, i59, 631063962, false, (String) objArr10[0], null);
                            }
                            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i60 = b + 113;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i60 % 128;
                                    int i61 = i60 % 2;
                                    int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                    int i62 = ~minimumFlingVelocity;
                                    int i63 = ~((i62 ^ (-4920)) | (i62 & (-4920)));
                                    int i64 = (i63 & i2) | (i2 ^ i63);
                                    int i65 = ~(minimumFlingVelocity | 4919);
                                    int i66 = (((minimumFlingVelocity * (-375)) - 1844625) - (~(((i64 & i65) | (i64 ^ i65)) * 376))) - 1;
                                    int i67 = ~i2;
                                    int i68 = ~((i67 & minimumFlingVelocity) | (i67 ^ minimumFlingVelocity));
                                    int i69 = ~((minimumFlingVelocity & 4919) | (minimumFlingVelocity ^ 4919));
                                    int i70 = -(-(((i69 & i68) | (i68 ^ i69)) * (-376)));
                                    int i71 = (i66 ^ i70) + ((i70 & i66) << 1);
                                    int i72 = ~(i62 | i2);
                                    int i73 = i71 + (((i72 & 4919) | (i72 ^ 4919)) * 376);
                                    Object[] objArr11 = new Object[1];
                                    a(new char[]{52699, 56998, 60398, 62514, 33031, 44430, 48848, 19228, 21560, 24884, 3518, 7877, 11019, 13403, 49371, 60841, 65249, 35633, 37983, 41094, 19935, 24086, 27436, 29801, 185, 11653, 15888, 52058}, i73, objArr11);
                                    Object[] objArr12 = {(String) objArr11[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                        int iAxisFromString = MotionEvent.axisFromString("") + 994;
                                        int threadPriority = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                                        byte[] bArr = $$a;
                                        byte b5 = bArr[7];
                                        Object[] objArr13 = new Object[1];
                                        c(b5, bArr[5], b5, objArr13);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iAxisFromString, threadPriority, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                                    }
                                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr12)).longValue();
                                    long j = 1102795673;
                                    long j2 = -1;
                                    long j3 = j ^ j2;
                                    long jMyUid = Process.myUid();
                                    long j4 = (((long) 303) * j) + (((long) (-301)) * jLongValue) + (((long) (-302)) * ((((j3 | (jMyUid ^ j2)) | jLongValue) ^ j2) | (((j | jLongValue) | jMyUid) ^ j2))) + (((long) (-604)) * (((j3 | jLongValue) | jMyUid) ^ j2)) + (((long) 302) * ((j2 ^ (jLongValue | jMyUid)) | (((jLongValue ^ j2) | j) ^ j2))) + ((long) (-1303713910));
                                    int iMyUid = Process.myUid();
                                    int i74 = ((int) (j4 >> 32)) & ((-797055876) + ((~((~iMyUid) | 2130701935)) * 433) + (((~((-1851769359) | iMyUid)) | 414542947) * (-433)) + (((~(iMyUid | 414542947)) | 278932577) * 433));
                                    int iMyPid = Process.myPid();
                                    i10 = i74 | (((int) j4) & (((((~(2032999731 | iMyPid)) | (-2075123644)) * (-283)) - 286698111) + ((~(iMyPid | (-42123913))) * 283)));
                                } else {
                                    int i75 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int i76 = (i75 & 17958) + (i75 | 17958);
                                    Object[] objArr14 = new Object[1];
                                    a(new char[]{52677}, i76, objArr14);
                                    str = (String) objArr14[0];
                                    char[] cArr3 = {52614, 20096, 52204, 17601, 49661, 16913, 57123, 22574, 54603, 22118, 53912, 28593, 59605};
                                    float length = PointF.length(0.0f, 0.0f);
                                    int i77 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                                    b = i77 % 128;
                                    int i78 = i77 % 2;
                                    i11 = (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1));
                                    iB = ScholarshipHistoryRequest.b();
                                    i12 = i11 * 569;
                                    i13 = b + 123;
                                    int i79 = i13 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i79;
                                    if (i13 % 2 == 0) {
                                        i14 = i12 << 19097347;
                                    } else {
                                        i14 = i12 + 19097347;
                                    }
                                    i15 = ~i11;
                                    i16 = ~((i15 ^ (-33564)) | (i15 & (-33564)));
                                    i17 = (i79 & 61) + (i79 | 61);
                                    b = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        int i80 = ~iB;
                                        int i81 = (~((i15 & i80) | (i15 ^ i80))) | i16;
                                        int i82 = ~iB;
                                        i18 = i14 + ((-1136) << (i81 | (~((i82 & (-33564)) | ((-33564) ^ i82)))));
                                    } else {
                                        int i83 = ~iB;
                                        int i84 = ~((i15 & i83) | (i15 ^ i83));
                                        int i85 = (i84 & i16) | (i16 ^ i84);
                                        int i86 = ~iB;
                                        int i87 = ~((i86 & (-33564)) | ((-33564) ^ i86));
                                        int i88 = (-1136) * ((i85 & i87) | (i85 ^ i87));
                                        i18 = (i14 | i88) + (i14 & i88);
                                    }
                                    int i89 = ~((~i11) | iB);
                                    int i90 = ~((-33564) | iB);
                                    i19 = (i89 & i90) | (i89 ^ i90);
                                    i20 = (i79 ^ 1) + ((i79 & 1) << 1);
                                    b = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        i22 = ~iB;
                                        int i91 = i22 | i11;
                                        int i92 = ~((i91 ^ 33563) | (i91 & 33563));
                                        i21 = i18 / ((-568) - ((i19 ^ i92) | (i19 & i92)));
                                    } else {
                                        int i93 = (~iB) | i11;
                                        int i94 = (-568) * (i19 | (~((i93 & 33563) | (i93 ^ 33563))));
                                        i21 = (i18 | i94) + (i18 & i94);
                                        i22 = ~iB;
                                    }
                                    int i95 = ~((i22 ^ i11) | (i22 & i11));
                                    int i96 = ~iB;
                                    int i97 = ~((i96 & 33563) | (i96 ^ 33563));
                                    int i98 = (i95 & i97) | (i95 ^ i97);
                                    int i99 = ~i11;
                                    int i100 = (i79 ^ 1) + ((i79 & 1) << 1);
                                    b = i100 % 128;
                                    int i101 = i100 % 2;
                                    int i102 = (i99 & (-33564)) | (i99 ^ (-33564));
                                    int i103 = 568 * ((~((i102 & iB) | (i102 ^ iB))) | i98);
                                    int i104 = ((i21 | i103) << 1) - (i103 ^ i21);
                                    Object[] objArr15 = new Object[1];
                                    a(cArr3, i104, objArr15);
                                    objArr = new Object[]{(String) objArr15[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 33602);
                                        int iResolveOpacity = 3085 - Drawable.resolveOpacity(0, 0);
                                        int trimmedLength = TextUtils.getTrimmedLength("") + 26;
                                        byte[] bArr2 = $$a;
                                        byte b6 = bArr2[7];
                                        Object[] objArr16 = new Object[1];
                                        c(b6, bArr2[5], b6, objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize2, iResolveOpacity, trimmedLength, 1411172903, false, (String) objArr16[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        i10 = 1;
                                    } else {
                                        int i105 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i106 = (i105 ^ 21) + ((i105 & 21) << 1);
                                        b = i106 % 128;
                                        int i107 = i106 % 2;
                                        i10 = 0;
                                    }
                                }
                                int i108 = (i2 & (-11)) | ((~i2) & 10);
                                int i109 = -i10;
                                int i110 = ((i10 & i109) | (i10 ^ i109)) >> 31;
                                int i111 = (~i110) & i2;
                                int i112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i113 = i112 + 45;
                                b = i113 % 128;
                                int i114 = i113 % 2;
                                int i115 = (i110 & i108) | i111;
                                int i116 = i3 & 32;
                                int i117 = -i116;
                                int i118 = ((i116 & i117) | (i116 ^ i117)) >> 31;
                                int i119 = i115 & (~i118);
                                int i120 = i118 & i2;
                                i6 = (i119 & i120) | (i119 ^ i120);
                                int i121 = i112 + 71;
                                b = i121 % 128;
                                int i122 = i121 % 2;
                            } else if (Build.VERSION.SDK_INT == 30) {
                                int i123 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i124 = (i123 & 15) + (i123 | 15);
                                b = i124 % 128;
                                int i125 = i124 % 2;
                                int i126 = ((i123 | 13) << 1) - (i123 ^ 13);
                                b = i126 % 128;
                                int i127 = i126 % 2;
                                i6 = i2;
                            } else {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i610 = b + 113;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i610 % 128;
                                    int i611 = i610 % 2;
                                    int minimumFlingVelocity2 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                    int i612 = ~minimumFlingVelocity2;
                                    int i613 = ~((i612 ^ (-4920)) | (i612 & (-4920)));
                                    int i614 = (i613 & i2) | (i2 ^ i613);
                                    int i615 = ~(minimumFlingVelocity2 | 4919);
                                    int i616 = (((minimumFlingVelocity2 * (-375)) - 1844625) - (~(((i614 & i615) | (i614 ^ i615)) * 376))) - 1;
                                    int i617 = ~i2;
                                    int i618 = ~((i617 & minimumFlingVelocity2) | (i617 ^ minimumFlingVelocity2));
                                    int i619 = ~((minimumFlingVelocity2 & 4919) | (minimumFlingVelocity2 ^ 4919));
                                    int i710 = -(-(((i619 & i618) | (i618 ^ i619)) * (-376)));
                                    int i711 = (i616 ^ i710) + ((i710 & i616) << 1);
                                    int i712 = ~(i612 | i2);
                                    int i713 = i711 + (((i712 & 4919) | (i712 ^ 4919)) * 376);
                                    Object[] objArr17 = new Object[1];
                                    a(new char[]{52699, 56998, 60398, 62514, 33031, 44430, 48848, 19228, 21560, 24884, 3518, 7877, 11019, 13403, 49371, 60841, 65249, 35633, 37983, 41094, 19935, 24086, 27436, 29801, 185, 11653, 15888, 52058}, i713, objArr17);
                                    Object[] objArr18 = {(String) objArr17[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                        int iAxisFromString2 = MotionEvent.axisFromString("") + 994;
                                        int threadPriority2 = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                                        byte[] bArr3 = $$a;
                                        byte b7 = bArr3[7];
                                        Object[] objArr19 = new Object[1];
                                        c(b7, bArr3[5], b7, objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iAxisFromString2, threadPriority2, 410748506, false, (String) objArr19[0], new Class[]{String.class});
                                    }
                                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr18)).longValue();
                                    long j5 = 1102795673;
                                    long j6 = -1;
                                    long j7 = j5 ^ j6;
                                    long jMyUid2 = Process.myUid();
                                    long j8 = (((long) 303) * j5) + (((long) (-301)) * jLongValue2) + (((long) (-302)) * ((((j7 | (jMyUid2 ^ j6)) | jLongValue2) ^ j6) | (((j5 | jLongValue2) | jMyUid2) ^ j6))) + (((long) (-604)) * (((j7 | jLongValue2) | jMyUid2) ^ j6)) + (((long) 302) * ((j6 ^ (jLongValue2 | jMyUid2)) | (((jLongValue2 ^ j6) | j5) ^ j6))) + ((long) (-1303713910));
                                    int iMyUid2 = Process.myUid();
                                    int i714 = ((int) (j8 >> 32)) & ((-797055876) + ((~((~iMyUid2) | 2130701935)) * 433) + (((~((-1851769359) | iMyUid2)) | 414542947) * (-433)) + (((~(iMyUid2 | 414542947)) | 278932577) * 433));
                                    int iMyPid2 = Process.myPid();
                                    i10 = i714 | (((int) j8) & (((((~(2032999731 | iMyPid2)) | (-2075123644)) * (-283)) - 286698111) + ((~(iMyPid2 | (-42123913))) * 283)));
                                } else {
                                    int i715 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int i716 = (i715 & 17958) + (i715 | 17958);
                                    Object[] objArr110 = new Object[1];
                                    a(new char[]{52677}, i716, objArr110);
                                    str = (String) objArr110[0];
                                    char[] cArr4 = {52614, 20096, 52204, 17601, 49661, 16913, 57123, 22574, 54603, 22118, 53912, 28593, 59605};
                                    float length2 = PointF.length(0.0f, 0.0f);
                                    int i717 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                                    b = i717 % 128;
                                    int i718 = i717 % 2;
                                    i11 = (length2 > 0.0f ? 1 : (length2 == 0.0f ? 0 : -1));
                                    iB = ScholarshipHistoryRequest.b();
                                    i12 = i11 * 569;
                                    i13 = b + 123;
                                    int i719 = i13 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i719;
                                    if (i13 % 2 == 0) {
                                        i14 = i12 << 19097347;
                                    } else {
                                        i14 = i12 + 19097347;
                                    }
                                    i15 = ~i11;
                                    i16 = ~((i15 ^ (-33564)) | (i15 & (-33564)));
                                    i17 = (i719 & 61) + (i719 | 61);
                                    b = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        int i810 = ~iB;
                                        int i811 = (~((i15 & i810) | (i15 ^ i810))) | i16;
                                        int i812 = ~iB;
                                        i18 = i14 + ((-1136) << (i811 | (~((i812 & (-33564)) | ((-33564) ^ i812)))));
                                    } else {
                                        int i813 = ~iB;
                                        int i814 = ~((i15 & i813) | (i15 ^ i813));
                                        int i815 = (i814 & i16) | (i16 ^ i814);
                                        int i816 = ~iB;
                                        int i817 = ~((i816 & (-33564)) | ((-33564) ^ i816));
                                        int i818 = (-1136) * ((i815 & i817) | (i815 ^ i817));
                                        i18 = (i14 | i818) + (i14 & i818);
                                    }
                                    int i819 = ~((~i11) | iB);
                                    int i910 = ~((-33564) | iB);
                                    i19 = (i819 & i910) | (i819 ^ i910);
                                    i20 = (i719 ^ 1) + ((i719 & 1) << 1);
                                    b = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        i22 = ~iB;
                                        int i911 = i22 | i11;
                                        int i912 = ~((i911 ^ 33563) | (i911 & 33563));
                                        i21 = i18 / ((-568) - ((i19 ^ i912) | (i19 & i912)));
                                    } else {
                                        int i913 = (~iB) | i11;
                                        int i914 = (-568) * (i19 | (~((i913 & 33563) | (i913 ^ 33563))));
                                        i21 = (i18 | i914) + (i18 & i914);
                                        i22 = ~iB;
                                    }
                                    int i915 = ~((i22 ^ i11) | (i22 & i11));
                                    int i916 = ~iB;
                                    int i917 = ~((i916 & 33563) | (i916 ^ 33563));
                                    int i918 = (i915 & i917) | (i915 ^ i917);
                                    int i919 = ~i11;
                                    int i1010 = (i719 ^ 1) + ((i719 & 1) << 1);
                                    b = i1010 % 128;
                                    int i1011 = i1010 % 2;
                                    int i1012 = (i919 & (-33564)) | (i919 ^ (-33564));
                                    int i1013 = 568 * ((~((i1012 & iB) | (i1012 ^ iB))) | i918);
                                    int i1014 = ((i21 | i1013) << 1) - (i1013 ^ i21);
                                    Object[] objArr111 = new Object[1];
                                    a(cArr4, i1014, objArr111);
                                    objArr = new Object[]{(String) objArr111[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char defaultSize3 = (char) (View.getDefaultSize(0, 0) + 33602);
                                        int iResolveOpacity2 = 3085 - Drawable.resolveOpacity(0, 0);
                                        int trimmedLength2 = TextUtils.getTrimmedLength("") + 26;
                                        byte[] bArr4 = $$a;
                                        byte b8 = bArr4[7];
                                        Object[] objArr112 = new Object[1];
                                        c(b8, bArr4[5], b8, objArr112);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize3, iResolveOpacity2, trimmedLength2, 1411172903, false, (String) objArr112[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        i10 = 1;
                                    } else {
                                        int i1015 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i1016 = (i1015 ^ 21) + ((i1015 & 21) << 1);
                                        b = i1016 % 128;
                                        int i1017 = i1016 % 2;
                                        i10 = 0;
                                    }
                                }
                                int i1018 = (i2 & (-11)) | ((~i2) & 10);
                                int i1019 = -i10;
                                int i1110 = ((i10 & i1019) | (i10 ^ i1019)) >> 31;
                                int i1111 = (~i1110) & i2;
                                int i1112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i1113 = i1112 + 45;
                                b = i1113 % 128;
                                int i1114 = i1113 % 2;
                                int i1115 = (i1110 & i1018) | i1111;
                                int i1116 = i3 & 32;
                                int i1117 = -i1116;
                                int i1118 = ((i1116 & i1117) | (i1116 ^ i1117)) >> 31;
                                int i1119 = i1115 & (~i1118);
                                int i128 = i1118 & i2;
                                i6 = (i1119 & i128) | (i1119 ^ i128);
                                int i129 = i1112 + 71;
                                b = i129 % 128;
                                int i1210 = i129 % 2;
                            }
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i1211 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i1212 = (i1211 & 15) + (i1211 | 15);
                            b = i1212 % 128;
                            int i1213 = i1212 % 2;
                            int i1214 = ((i1211 | 13) << 1) - (i1211 ^ 13);
                            b = i1214 % 128;
                            int i1215 = i1214 % 2;
                            i6 = i2;
                        } else {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i6110 = b + 113;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6110 % 128;
                                    int i6111 = i6110 % 2;
                                    int minimumFlingVelocity3 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                    int i6112 = ~minimumFlingVelocity3;
                                    int i6113 = ~((i6112 ^ (-4920)) | (i6112 & (-4920)));
                                    int i6114 = (i6113 & i2) | (i2 ^ i6113);
                                    int i6115 = ~(minimumFlingVelocity3 | 4919);
                                    int i6116 = (((minimumFlingVelocity3 * (-375)) - 1844625) - (~(((i6114 & i6115) | (i6114 ^ i6115)) * 376))) - 1;
                                    int i6117 = ~i2;
                                    int i6118 = ~((i6117 & minimumFlingVelocity3) | (i6117 ^ minimumFlingVelocity3));
                                    int i6119 = ~((minimumFlingVelocity3 & 4919) | (minimumFlingVelocity3 ^ 4919));
                                    int i7110 = -(-(((i6119 & i6118) | (i6118 ^ i6119)) * (-376)));
                                    int i7111 = (i6116 ^ i7110) + ((i7110 & i6116) << 1);
                                    int i7112 = ~(i6112 | i2);
                                    int i7113 = i7111 + (((i7112 & 4919) | (i7112 ^ 4919)) * 376);
                                    Object[] objArr113 = new Object[1];
                                    a(new char[]{52699, 56998, 60398, 62514, 33031, 44430, 48848, 19228, 21560, 24884, 3518, 7877, 11019, 13403, 49371, 60841, 65249, 35633, 37983, 41094, 19935, 24086, 27436, 29801, 185, 11653, 15888, 52058}, i7113, objArr113);
                                    try {
                                        Object[] objArr114 = {(String) objArr113[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char c3 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                            int iAxisFromString3 = MotionEvent.axisFromString("") + 994;
                                            int threadPriority3 = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                                            byte[] bArr5 = $$a;
                                            byte b9 = bArr5[7];
                                            Object[] objArr115 = new Object[1];
                                            c(b9, bArr5[5], b9, objArr115);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iAxisFromString3, threadPriority3, 410748506, false, (String) objArr115[0], new Class[]{String.class});
                                        }
                                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr114)).longValue();
                                        long j9 = 1102795673;
                                        long j10 = -1;
                                        long j11 = j9 ^ j10;
                                        long jMyUid3 = Process.myUid();
                                        long j12 = (((long) 303) * j9) + (((long) (-301)) * jLongValue3) + (((long) (-302)) * ((((j11 | (jMyUid3 ^ j10)) | jLongValue3) ^ j10) | (((j9 | jLongValue3) | jMyUid3) ^ j10))) + (((long) (-604)) * (((j11 | jLongValue3) | jMyUid3) ^ j10)) + (((long) 302) * ((j10 ^ (jLongValue3 | jMyUid3)) | (((jLongValue3 ^ j10) | j9) ^ j10))) + ((long) (-1303713910));
                                        int iMyUid3 = Process.myUid();
                                        int i7114 = ((int) (j12 >> 32)) & ((-797055876) + ((~((~iMyUid3) | 2130701935)) * 433) + (((~((-1851769359) | iMyUid3)) | 414542947) * (-433)) + (((~(iMyUid3 | 414542947)) | 278932577) * 433));
                                        int iMyPid3 = Process.myPid();
                                        i10 = i7114 | (((int) j12) & (((((~(2032999731 | iMyPid3)) | (-2075123644)) * (-283)) - 286698111) + ((~(iMyPid3 | (-42123913))) * 283)));
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    int i7115 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int i7116 = (i7115 & 17958) + (i7115 | 17958);
                                    Object[] objArr116 = new Object[1];
                                    a(new char[]{52677}, i7116, objArr116);
                                    str = (String) objArr116[0];
                                    char[] cArr5 = {52614, 20096, 52204, 17601, 49661, 16913, 57123, 22574, 54603, 22118, 53912, 28593, 59605};
                                    float length3 = PointF.length(0.0f, 0.0f);
                                    int i7117 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                                    b = i7117 % 128;
                                    int i7118 = i7117 % 2;
                                    i11 = (length3 > 0.0f ? 1 : (length3 == 0.0f ? 0 : -1));
                                    iB = ScholarshipHistoryRequest.b();
                                    i12 = i11 * 569;
                                    i13 = b + 123;
                                    int i7119 = i13 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7119;
                                    if (i13 % 2 == 0) {
                                        i14 = i12 << 19097347;
                                    } else {
                                        i14 = i12 + 19097347;
                                    }
                                    i15 = ~i11;
                                    i16 = ~((i15 ^ (-33564)) | (i15 & (-33564)));
                                    i17 = (i7119 & 61) + (i7119 | 61);
                                    b = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        int i8110 = ~iB;
                                        int i8111 = (~((i15 & i8110) | (i15 ^ i8110))) | i16;
                                        int i8112 = ~iB;
                                        i18 = i14 + ((-1136) << (i8111 | (~((i8112 & (-33564)) | ((-33564) ^ i8112)))));
                                    } else {
                                        int i8113 = ~iB;
                                        int i8114 = ~((i15 & i8113) | (i15 ^ i8113));
                                        int i8115 = (i8114 & i16) | (i16 ^ i8114);
                                        int i8116 = ~iB;
                                        int i8117 = ~((i8116 & (-33564)) | ((-33564) ^ i8116));
                                        int i8118 = (-1136) * ((i8115 & i8117) | (i8115 ^ i8117));
                                        i18 = (i14 | i8118) + (i14 & i8118);
                                    }
                                    int i8119 = ~((~i11) | iB);
                                    int i9110 = ~((-33564) | iB);
                                    i19 = (i8119 & i9110) | (i8119 ^ i9110);
                                    i20 = (i7119 ^ 1) + ((i7119 & 1) << 1);
                                    b = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        i22 = ~iB;
                                        int i9111 = i22 | i11;
                                        int i9112 = ~((i9111 ^ 33563) | (i9111 & 33563));
                                        i21 = i18 / ((-568) - ((i19 ^ i9112) | (i19 & i9112)));
                                    } else {
                                        int i9113 = (~iB) | i11;
                                        int i9114 = (-568) * (i19 | (~((i9113 & 33563) | (i9113 ^ 33563))));
                                        i21 = (i18 | i9114) + (i18 & i9114);
                                        i22 = ~iB;
                                    }
                                    int i9115 = ~((i22 ^ i11) | (i22 & i11));
                                    int i9116 = ~iB;
                                    int i9117 = ~((i9116 & 33563) | (i9116 ^ 33563));
                                    int i9118 = (i9115 & i9117) | (i9115 ^ i9117);
                                    int i9119 = ~i11;
                                    int i10110 = (i7119 ^ 1) + ((i7119 & 1) << 1);
                                    b = i10110 % 128;
                                    int i10111 = i10110 % 2;
                                    int i10112 = (i9119 & (-33564)) | (i9119 ^ (-33564));
                                    int i10113 = 568 * ((~((i10112 & iB) | (i10112 ^ iB))) | i9118);
                                    int i10114 = ((i21 | i10113) << 1) - (i10113 ^ i21);
                                    Object[] objArr117 = new Object[1];
                                    a(cArr5, i10114, objArr117);
                                    try {
                                        objArr = new Object[]{(String) objArr117[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char defaultSize4 = (char) (View.getDefaultSize(0, 0) + 33602);
                                            int iResolveOpacity3 = 3085 - Drawable.resolveOpacity(0, 0);
                                            int trimmedLength3 = TextUtils.getTrimmedLength("") + 26;
                                            byte[] bArr6 = $$a;
                                            byte b10 = bArr6[7];
                                            Object[] objArr118 = new Object[1];
                                            c(b10, bArr6[5], b10, objArr118);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize4, iResolveOpacity3, trimmedLength3, 1411172903, false, (String) objArr118[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            i10 = 1;
                                        } else {
                                            int i10115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i10116 = (i10115 ^ 21) + ((i10115 & 21) << 1);
                                            b = i10116 % 128;
                                            int i10117 = i10116 % 2;
                                            i10 = 0;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            int i10118 = (i2 & (-11)) | ((~i2) & 10);
                            int i10119 = -i10;
                            int i11110 = ((i10 & i10119) | (i10 ^ i10119)) >> 31;
                            int i11111 = (~i11110) & i2;
                            int i11112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i11113 = i11112 + 45;
                            b = i11113 % 128;
                            int i11114 = i11113 % 2;
                            int i11115 = (i11110 & i10118) | i11111;
                            int i11116 = i3 & 32;
                            int i11117 = -i11116;
                            int i11118 = ((i11116 & i11117) | (i11116 ^ i11117)) >> 31;
                            int i11119 = i11115 & (~i11118);
                            int i1216 = i11118 & i2;
                            i6 = (i11119 & i1216) | (i11119 ^ i1216);
                            int i1217 = i11112 + 71;
                            b = i1217 % 128;
                            int i1218 = i1217 % 2;
                        }
                        int i130 = i2 ^ i5;
                        int i131 = -i130;
                        int i132 = ((i130 & i131) | (i130 ^ i131)) >> 31;
                        int i133 = b;
                        int i134 = ((i133 | 75) << 1) - (i133 ^ 75);
                        int i135 = i134 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i135;
                        int i136 = i134 % 2;
                        int i137 = i6 & (~i132);
                        int i138 = i132 & i5;
                        int i139 = (i137 & i138) | (i137 ^ i138);
                        Object[] objArr20 = new Object[4];
                        int[] iArr = new int[1];
                        objArr20[0] = iArr;
                        objArr20[1] = new int[1];
                        int[] iArr2 = new int[1];
                        objArr20[2] = iArr2;
                        int i140 = (i135 & 9) + (i135 | 9);
                        b = i140 % 128;
                        int i141 = i140 % 2;
                        int i142 = ((~i139) & i2) | ((~i2) & i139);
                        int i143 = -i142;
                        if (i141 != 0) {
                            int i144 = ((i142 & i143) | (i142 ^ i143)) / 26;
                            int i145 = (~i144) & 1;
                            int i146 = i144 & 51;
                            i7 = (i146 & i145) | (i145 ^ i146);
                        } else {
                            i7 = (((i142 & i143) | (i142 ^ i143)) >> 31) & 16;
                        }
                        iArr[0] = i2;
                        iArr2[0] = i139;
                        objArr20[3] = null;
                        int i147 = ~(531060719 | i2);
                        int i148 = 1510531204 + ((419447236 | i147) * (-476)) + (i147 * 952) + ((~((~i2) | 531060719)) * 476);
                        int iB3 = ScholarshipHistoryRequest.b();
                        int i149 = ((i7 * (-721)) - (~(i148 * (-721)))) - 1;
                        int i150 = ~iB3;
                        int i151 = ~i7;
                        int i152 = ~i148;
                        int i153 = ~((i151 ^ i152) | (i151 & i152));
                        int i154 = (i150 & i153) | (i150 ^ i153);
                        int i155 = ~((i7 ^ i148) | (i7 & i148));
                        int i156 = (i149 - (~(-(-(((i154 & i155) | (i154 ^ i155)) * 1444))))) - 1;
                        int i157 = b;
                        int i158 = (i157 ^ 29) + ((i157 & 29) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i158 % 128;
                        int i159 = i158 % 2;
                        int i160 = ~(i7 | i148);
                        if (i159 == 0) {
                            int i161 = ~(i7 | iB3);
                            int i162 = (i160 & i161) | (i160 ^ i161);
                            int i163 = ~((iB3 & i148) | (i148 ^ iB3));
                            i8 = i156 / ((-1444) >> ((i163 & i162) | (i162 ^ i163)));
                            i9 = i151 | i148;
                        } else {
                            int i164 = ~((i7 ^ iB3) | (i7 & iB3));
                            int i165 = (i160 & i164) | (i160 ^ i164);
                            int i166 = ~((iB3 & i148) | (i148 ^ iB3));
                            int i167 = -(-(((i166 & i165) | (i165 ^ i166)) * (-1444)));
                            i8 = (i156 & i167) + (i167 | i156);
                            i9 = (~i7) | i148;
                        }
                        int i168 = ~i9;
                        int i169 = i157 + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i169 % 128;
                        if (i169 % 2 == 0) {
                            int i170 = ~(i7 | i152);
                            int i171 = -(722 % ((i168 & i170) | (i168 ^ i170)));
                            int i172 = i4 >>> ((i8 ^ i171) + ((i171 & i8) << 1));
                            int i173 = i172 >> 56;
                            int i174 = ((~i172) & i173) | ((~i173) & i172);
                            int i175 = i174 / 124;
                            int i176 = (i174 | i175) & (~(i174 & i175));
                            int i177 = i176 * 4;
                            ((int[]) objArr20[1])[0] = ((~i176) & i177) | ((~i177) & i176);
                        } else {
                            int i178 = ~((i7 & i152) | (i152 ^ i7));
                            int i179 = i4 + i8 + (722 * ((i168 & i178) | (i168 ^ i178)));
                            int i180 = i179 << 13;
                            int i181 = (i179 | i180) & (~(i179 & i180));
                            int i182 = i181 >>> 17;
                            int i183 = ((~i181) & i182) | ((~i182) & i181);
                            int i184 = i183 << 5;
                            ((int[]) objArr20[1])[0] = (i183 | i184) & (~(i183 & i184));
                        }
                        return objArr20;
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 != null) {
                            throw cause4;
                        }
                        throw th4;
                    }
                }
            });
            return;
        }
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            registerBniAutodebetActivity.IconCompatParcelizer();
            registerBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            String string = ((SubmitAutodebitBniAutopayResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getNik().toString();
            String string2 = ((SubmitAutodebitBniAutopayResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMsg().toString();
            String string3 = ((SubmitAutodebitBniAutopayResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getChargeToken().toString();
            String string4 = ((SubmitAutodebitBniAutopayResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getReferenceNo().toString();
            String string5 = ((SubmitAutodebitBniAutopayResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getConfirmPhoneNumber().toString();
            EditText editText = registerBniAutodebetActivity.INotificationSideChannelStub().tilValueAccountNumberBni.getEditText();
            if (editText != null) {
                int i2 = g + 11;
                f538a = i2 % 128;
                int i3 = i2 % 2;
                text = editText.getText();
            } else {
                text = null;
            }
            String strValueOf = String.valueOf(text);
            EditText editText2 = registerBniAutodebetActivity.INotificationSideChannelStub().tilValueAccountNumberBniDebitCard.getEditText();
            if (editText2 != null) {
                int i4 = g + 73;
                f538a = i4 % 128;
                int i5 = i4 % 2;
                text2 = editText2.getText();
            } else {
                text2 = null;
            }
            SubmitAutodebitBniAutopayResponse submitAutodebitBniAutopayResponse = new SubmitAutodebitBniAutopayResponse(string, string2, string3, string4, string5, strValueOf, String.valueOf(text2));
            AuthenticationOtpBniAutodebetActivity.Companion companion = AuthenticationOtpBniAutodebetActivity.INSTANCE;
            AuthenticationOtpBniAutodebetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerBniAutodebetActivity, (CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue(), submitAutodebitBniAutopayResponse);
        }
        int i6 = f538a + 29;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(RegisterBniAutodebetActivity registerBniAutodebetActivity, View view) {
        Editable text;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (registerBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 0) {
            int i2 = g + 79;
            f538a = i2 % 128;
            int i3 = i2 % 2;
            registerBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) registerBniAutodebetActivity.b.getValue();
            String string = ((CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.toString();
            String string2 = ((CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).b.toString();
            String string3 = ((CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).RemoteActionCompatParcelizer.toString();
            int i4 = ((CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).IconCompatParcelizer;
            String strValueOf = String.valueOf(((CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).getInterfaceDescriptor);
            EditText editText = registerBniAutodebetActivity.INotificationSideChannelStub().tilValueAccountNumberBni.getEditText();
            if (editText != null) {
                text = editText.getText();
                int i5 = f538a + 51;
                g = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 3;
                }
            } else {
                text = null;
            }
            String strValueOf2 = String.valueOf(text);
            EditText editText2 = registerBniAutodebetActivity.INotificationSideChannelStub().tilValueAccountNumberBniDebitCard.getEditText();
            String strValueOf3 = String.valueOf(editText2 != null ? editText2.getText() : null);
            String string4 = ((CustomerObject) registerBniAutodebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString();
            User user = (User) registerBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            String strValueOf4 = String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
            User user2 = (User) registerBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new SubmitAutodebitBniAutopayRequest(string, string2, string3, String.valueOf(i4), strValueOf, strValueOf2, strValueOf3, string4, strValueOf4, String.valueOf(user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null)));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegisterBniAutodebetActivity registerBniAutodebetActivity) {
        int i = 2 % 2;
        int i2 = g + 17;
        f538a = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) registerBniAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = g + 5;
        f538a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return userAsBinder;
    }

    static {
        asBinder = 0;
        INotificationSideChannel();
        INSTANCE = new Companion(null);
        int i = cancelAll + 47;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ((Integer) b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step4).substring(23, 24).length() - 903904827, -1602996411, 342980158 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.how_much_point).substring(27, 28).codePointAt(0), ShapeTrimPath.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1602996414)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 125;
        f538a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g + 81;
        f538a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ShapeTrimPath.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ShapeTrimPath.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1192224787, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1192224789);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 583132214;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1488483336, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), i, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1488483337);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ShapeTrimPath.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ShapeTrimPath.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -931800284, (-1053673837) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 931800284);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f538a + 45;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = g + 125;
        f538a = i4 % 128;
        int i5 = i4 % 2;
    }

    static void INotificationSideChannel() {
        asInterface = new int[]{-1630028872, 187726245, 292775968, 686479993, 2144443433, 1031299744, -1091402336, -590098636, -997363796, 491226375, -1478284416, 324300582, -1461880137, 1476349637, 1409223488, -1266005619, 961658348, -1484095207};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f538a + 15;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 103;
        f538a = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(R.layout.activity_register_bni_autodebet);
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
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r8 = r8 * 56
            int r8 = r8 + 66
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
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
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterBniAutodebetActivity.$$i(byte, byte, int):java.lang.String");
    }
}
