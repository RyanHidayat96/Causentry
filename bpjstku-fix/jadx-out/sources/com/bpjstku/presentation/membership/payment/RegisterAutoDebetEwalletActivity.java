package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
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
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodRequest;
import com.bpjstku.data.payment.model.request.EditCustomerObjectRequest;
import com.bpjstku.data.payment.model.response.ActionLinkingStatus;
import com.bpjstku.data.payment.model.response.CustomerObjectItem;
import com.bpjstku.data.payment.model.response.CustomerObjectUpdated;
import com.bpjstku.data.payment.model.response.PaymentMethodItem;
import com.bpjstku.databinding.ActivityRegisterAutoDebetEwalletBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.RegisterAutoDebetEwalletActivity;
import com.bpjstku.presentation.membership.payment.model.UrlAuthentication;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.auth.UserRecoverableNotifiedException;
import com.google.android.gms.internal.mlkit_vision_face.zzbr;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CaptureSession1;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ListPopupWindow2;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.getEventTime;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004R\u0015\u0010\u0012\u001a\u00020\u000f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0015\u0010\u0006\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00158BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\f\u001a\u00020\n8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\b\u001a\u00020\n8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u001d"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/RegisterAutoDebetEwalletActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegisterAutoDebetEwalletBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)V", "asBinder", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "d", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "LListPopupWindow2;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "cancel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegisterAutoDebetEwalletActivity extends BindingBaseActivity<ActivityRegisterAutoDebetEwalletBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancelAll;
    private static long notify;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$a = {113, 29, -123, -97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 52;
    private static int INotificationSideChannel = 0;
    private static int cancel = 0;
    private static int onTransact = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: ScrollingTabContainerViewVisibilityAnimListener
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegisterAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: SearchView
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegisterAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "";
    public String a = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public String asInterface = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public String d = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String g = "";

    /* JADX WARN: Code duplicated, block: B:16:0x0106  */
    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws IllegalAccessException {
        int i7 = (~(i3 | i4)) | i5;
        int i8 = (~((~i4) | i3)) | i5;
        int i9 = (~i5) | i3;
        int i10 = i5 + i3 + i + (440753341 * i6) + ((-634449194) * i2);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i5) + 1075183616 + ((-1421434046) * i3) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i) + (780402688 * i6) + ((-180879360) * i2) + (353763328 * i11);
        int i13 = (i5 * 892202253) + 1676176333 + (i3 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (892200819 * i) + (i6 * (-770690073)) + (i2 * 448958498) + (i11 * 1390542848);
        int i14 = i12 + (i13 * i13 * (-1042677760));
        if (i14 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i14 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i14 != 3) {
            return b(objArr);
        }
        RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity = (RegisterAutoDebetEwalletActivity) objArr[0];
        int i15 = 2 % 2;
        int i16 = onTransact + 19;
        cancel = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int i18 = ~((-782047298) | i);
            int i19 = ~i;
            if (i17 != (-1243251976) + ((i18 | (~((-1612034841) | i19))) * (-1808)) + (((~((-243796034) | i)) | (~(i19 | (-1073783577)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(i | 1612034840)) | 538251264 | (~(782047297 | i19))) * TypedValues.Custom.TYPE_BOOLEAN)) {
                int[] iArr = new int[926636822];
                iArr[926636821] = 1;
                int i20 = 1498499790 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i21 = cancel + 85;
                onTransact = i21 % 128;
                int i22 = i21 % 2;
            }
        } else if (((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null) != (-62881560) + (((~((-269052307) | (~i))) | (~((-1099039850) | i))) * (-272)) + (((~((-873327507) | i)) | 604275200) * (-272)) + (((~(i | 873327506)) | (-1703315050)) * 272)) {
            int[] iArr2 = new int[926636822];
            iArr2[926636821] = 1;
            int i23 = 1498499790 % 2;
            Toast.makeText((Context) null, iArr2[-1], 1).show();
            int i24 = cancel + 85;
            onTransact = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMyPid = Process.myPid();
        if (i26 != 278483246 + (((-406061137) | iMyPid) * (-381)) + (((~((~iMyPid) | 1635968139)) | (-1505002587)) * 381) + 90470160) {
            throw new RuntimeException("-2027315510");
        }
        super.onStart();
        return null;
    }

    private static void c(int i, int i2, int i3, Object[] objArr) {
        int i4 = (i * 14) + 84;
        int i5 = 196 - i2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = (i4 + (-i3)) - 11;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5++;
                i4 = (i4 + (-bArr[i5])) - 11;
            }
        }
    }

    public RegisterAutoDebetEwalletActivity() {
        final RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity = this;
        this.b = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.RegisterAutoDebetEwalletActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = registerAutoDebetEwalletActivity;
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.RegisterAutoDebetEwalletActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = registerAutoDebetEwalletActivity;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.RegisterAutoDebetEwalletActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/RegisterAutoDebetEwalletActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/tuition/model/CustomerObject;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, CustomerObject p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) RegisterAutoDebetEwalletActivity.class);
            intent.putExtra("customer_object_recurring", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegisterAutoDebetEwalletBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancel + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        RegisterAutoDebetEwalletActivity$bindingInflater$1 registerAutoDebetEwalletActivity$bindingInflater$1 = RegisterAutoDebetEwalletActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = onTransact + 37;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return registerAutoDebetEwalletActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityRegisterAutoDebetEwalletBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ScrollingTabContainerViewTabView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegisterAutoDebetEwalletActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        int i2 = onTransact + 59;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 119;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - ExpandableListView.getPackedPositionGroup(0L)), 2624 - TextUtils.indexOf("", "", 0), View.combineMeasuredStates(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (notify ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.resolveSize(0, 0) + 39422), 481 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 15;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (KeyEvent.getMaxKeyCode() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 481, 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity = this;
        ((ListPopupWindow2) this.b.getValue()).cancel.observe(registerAutoDebetEwalletActivity, new Observer() { // from class: ScrollingTabContainerView1
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegisterAutoDebetEwalletActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.b.getValue()).TuitionPaymentFragmentbindingInflater1.observe(registerAutoDebetEwalletActivity, new Observer() { // from class: bindTab
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IllegalAccessException {
                RegisterAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.b.getValue()).f164a.observe(registerAutoDebetEwalletActivity, new Observer() { // from class: getTab
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegisterAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.b.getValue()).asBinder.observe(registerAutoDebetEwalletActivity, new Observer() { // from class: setSelected
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IllegalAccessException {
                RegisterAutoDebetEwalletActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancel + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        int i = 2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = cancel + 105;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            int i4 = onTransact + 87;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            if (str2.length() != 0) {
                return;
            }
        }
        if (Intrinsics.areEqual(((CustomerObject) this.TuitionPaymentFragmentbindingInflater1.getValue()).write, "cross_selling")) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Login session habis", 0).show();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
            d_();
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        ((ListPopupWindow2) this.b.getValue()).b(new CreatePaymentMethodRequest(String.valueOf(((CustomerObject) this.TuitionPaymentFragmentbindingInflater1.getValue()).cancelAll), p0));
        int i2 = cancel + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        char c;
        char c2;
        int i = 2 % 2;
        RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity = this;
        Intrinsics.checkNotNullParameter(registerAutoDebetEwalletActivity, "");
        registerAutoDebetEwalletActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityRegisterAutoDebetEwalletBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityRegisterAutoDebetEwalletBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_registration_autodebet));
        ActivityRegisterAutoDebetEwalletBinding activityRegisterAutoDebetEwalletBinding = (ActivityRegisterAutoDebetEwalletBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView = activityRegisterAutoDebetEwalletBinding.tvEnterPhoneNumberInstruction;
        String str = ((CustomerObject) this.TuitionPaymentFragmentbindingInflater1.getValue()).cancelAll;
        StringBuilder sb = new StringBuilder("Silakan masukkan nomor handphone akun ");
        sb.append(str);
        sb.append(" anda untuk proses pendaftaran auto debit");
        String string = sb.toString();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
            int iRgb = (-16777193) - Color.rgb(0, 0, 0);
            byte b = $$a[7];
            Object[] objArr3 = new Object[1];
            c(b, (short) (b | 193), (byte) 37, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, tapTimeout, iRgb, 986134021, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{2734, 55916, 43825, 30938, 18836, 7847, 61029, 49018, 36040, 23945, 8931, 62035, 49962, 37077, 24973, 13993, 1650, 55057, 42185, 30103, 23208, 10869}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 53417, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{2730, 53908, 47808, 33306, 27232, 13241, 7137, 58140, 51986, 37697, 30853, 16614, 10290, 61545, 55720}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_threat_detected_error).substring(0, 25).codePointAt(5) + 55250, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
            int i2 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
            byte b2 = $$a[7];
            Object[] objArr6 = new Object[1];
            c(b2, (short) (b2 | 156), (byte) $$b, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, i2, scrollDefaultDelay, 1596667560, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                int mirror = 'G' - AndroidCharacter.getMirror('0');
                byte b3 = $$a[7];
                Object[] objArr7 = new Object[1];
                c(b3, (short) (b3 | 104), (byte) $$b, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, iIndexOf, mirror, 1599039318, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[1], (String[]) objArr8[4]};
            int iMyUid = Process.myUid();
            int i3 = ~iMyUid;
            int i4 = (-1640362915) + (((~((-346353940) | i3)) | 558956365) * (-328)) + ((iMyUid | 558956365) * 164) + (((~(iMyUid | 346353939)) | 558894668 | (~(i3 | (-346292243)))) * 164) + 1321007352;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{2725, 13203, 30915, 41241, 60949, 5266, 24000, 39434, 49984, 2500, 14078, 32553, 42080, 58018, 11260, 20529}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_done_step1).substring(92, 93).codePointAt(0) + 14552, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{2726, 13532, 30276, 45508, 62311, 13045, 31857, 49143, 63807, 14465, 31258, 42426, 59160, 9899, 24617, 41555}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.details_message_not_enabled).substring(11, 12).length() + 15990, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {-2040834617};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 42049), (ViewConfiguration.getTapTimeout() >> 16) + 1726, TextUtils.indexOf("", "", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), 1321007352, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                    int gidForName = 1754 - Process.getGidForName("");
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 24;
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c(b4, (short) (b4 | 104), (byte) $$b, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, gidForName, iLastIndexOf, 1599039318, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr13 = new Object[1];
                    e(new char[]{2734, 55916, 43825, 30938, 18836, 7847, 61029, 49018, 36040, 23945, 8931, 62035, 49962, 37077, 24973, 13993, 1650, 55057, 42185, 30103, 23208, 10869}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step3).substring(0, 1).codePointAt(0) + 53386, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    e(new char[]{2730, 53908, 47808, 33306, 27232, 13241, 7137, 58140, 51986, 37697, 30853, 16614, 10290, 61545, 55720}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).length() + 55350, objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                        int i7 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                        byte b5 = $$a[7];
                        Object[] objArr15 = new Object[1];
                        c(b5, (short) (b5 | 156), (byte) $$b, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay2, i7, doubleTapTimeout, 1596667560, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                        int i8 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b6 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c(b6, (short) (b6 | 193), (byte) 37, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, maximumFlingVelocity, i8, 986134021, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentbindingInflater1$7879113;
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i12 = i11 + (-2137317647) + (((~((-195422102) | iIdentityHashCode)) | 17180324) * (-366)) + (((~(iIdentityHashCode | (-178372882))) | 131104) * 366);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr2[3])[0] = i14 ^ (i14 << 5);
            c2 = 0;
            c = 3;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i15 = onTransact + 65;
                cancel = i15 % 128;
                for (int i16 = i15 % 2 != 0 ? 1 : 0; i16 < strArr.length; i16++) {
                    arrayList.add(strArr[i16]);
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i17 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int i18 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i19 = ~i18;
            int i20 = i17 + 1979327369 + ((~(465194249 | i19)) * (-560)) + ((~(i18 | 532578255)) * (-560)) + (((~((-252591824) | i19)) | 185207817) * 560);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            c = 3;
            c2 = 0;
            ((int[]) objArr2[3])[0] = i22 ^ (i22 << 5);
        }
        textView.setText(string);
        String str2 = ((CustomerObject) this.TuitionPaymentFragmentbindingInflater1.getValue()).cancelAll;
        int i23 = ((int[]) objArr2[c])[c2];
        int i24 = i23 * i23;
        int i25 = -(850917453 * i23);
        int i26 = (i24 & i25) + (i24 | i25);
        int i27 = -(i23 * 1024217213);
        int i28 = ((i26 ^ i27) + ((i27 & i26) << 1)) - 1384083495;
        int i29 = i28 >> 24;
        int i30 = (((i29 & (-511)) + (i29 | (-511))) / 256) + 1;
        int i31 = (i28 ^ i30) + ((i30 & i28) << 1);
        int i32 = i28 >> 15;
        int i33 = (((-262143) ^ i32) + ((i32 & (-262143)) << 1)) / 131072;
        int i34 = -(i31 ^ ((i33 ^ 1) + ((i33 & 1) << 1)));
        int i35 = (i34 ^ 7) + ((i34 & 7) << 1);
        int i36 = ((i35 >> 19) - 16383) / 8192;
        int i37 = (i36 & 1) + (i36 | 1);
        if (Intrinsics.areEqual(str2, "18\\OVO".substring(31269 / (((-(((i37 | 1) << 1) - (1 ^ i37))) & i35) * 1489)))) {
            activityRegisterAutoDebetEwalletBinding.imgLogo.setImageResource(R.drawable.bg_logo_ovo);
            activityRegisterAutoDebetEwalletBinding.imgLogo.setVisibility(0);
            int i38 = cancel + 111;
            onTransact = i38 % 128;
            int i39 = i38 % 2;
            return;
        }
        if (Intrinsics.areEqual(((CustomerObject) this.TuitionPaymentFragmentbindingInflater1.getValue()).cancelAll, "SHOPEEPAY")) {
            activityRegisterAutoDebetEwalletBinding.imgLogo.setImageResource(2131231515);
            activityRegisterAutoDebetEwalletBinding.imgLogo.setVisibility(0);
            return;
        }
        activityRegisterAutoDebetEwalletBinding.imgLogo.setImageResource(2131231295);
        activityRegisterAutoDebetEwalletBinding.imgLogo.setVisibility(0);
        int i40 = cancel + 53;
        onTransact = i40 % 128;
        int i41 = i40 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i = 2 % 2;
        int i2 = cancel + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int keyRepeatDelay = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i4 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte b = $$a[7];
            short s = (short) $$b;
            Object[] objArr2 = new Object[1];
            c(b, s, (byte) s, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, keyRepeatDelay, i4, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{2734, 55916, 43825, 30938, 18836, 7847, 61029, 49018, 36040, 23945, 8931, 62035, 49962, 37077, 24973, 13993, 1650, 55057, 42185, 30103, 23208, 10869}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 53355, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{2730, 53908, 47808, 33306, 27232, 13241, 7137, 58140, 51986, 37697, 30853, 16614, 10290, 61545, 55720}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.seconds).substring(1, 2).codePointAt(0) + 55250, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
            int i5 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 104), (byte) $$b, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollDefaultDelay, i5, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int iIndexOf = 1031 - TextUtils.indexOf("", "");
                int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                byte[] bArr = $$a;
                byte b3 = bArr[5];
                short s2 = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b3, s2, (byte) s2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, iIndexOf, trimmedLength, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i8 = ~((-661785820) | (~iFreeMemory));
            int i9 = (((((-1072868860) | i8) | (~(661785819 | iFreeMemory))) * (-338)) - 1608141647) + (((~(iFreeMemory | (-411083041))) | i8) * 338) + 616891922;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{2725, 13203, 30915, 41241, 60949, 5266, 24000, 39434, 49984, 2500, 14078, 32553, 42080, 58018, 11260, 20529}, Color.red(0) + 14653, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{2726, 13532, 30276, 45508, 62311, 13045, 31857, 49143, 63807, 14465, 31258, 42426, 59160, 9899, 24617, 41555}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_atm_bersama).substring(1, 3).length() + 15989, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1505667064};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (AndroidCharacter.getMirror('0') + 45990), TextUtils.getCapsMode("", 0, 0) + 1134, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 616891922, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                    int iAxisFromString = MotionEvent.axisFromString("") + 16;
                    byte b4 = $$a[7];
                    short s3 = (short) $$b;
                    Object[] objArr12 = new Object[1];
                    c(b4, s3, (byte) s3, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, maximumDrawingCacheSize, iAxisFromString, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0') + 45994), 1117 - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1031;
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[5];
                    short s4 = bArr2[7];
                    Object[] objArr13 = new Object[1];
                    c(b5, s4, (byte) s4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iIndexOf2, touchSlop, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{2734, 55916, 43825, 30938, 18836, 7847, 61029, 49018, 36040, 23945, 8931, 62035, 49962, 37077, 24973, 13993, 1650, 55057, 42185, 30103, 23208, 10869}, 53453 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{2730, 53908, 47808, 33306, 27232, 13241, 7137, 58140, 51986, 37697, 30853, 16614, 10290, 61545, 55720}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step2).substring(0, 5).length() + 55346, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                        int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
                        byte b6 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c(b6, (short) (b6 | 104), (byte) $$b, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iRgb, i12, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                        int iRgb2 = Color.rgb(0, 0, 0) + 16778247;
                        int edgeSlop = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b7 = $$a[7];
                        short s5 = (short) $$b;
                        Object[] objArr17 = new Object[1];
                        c(b7, s5, (byte) s5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, iRgb2, edgeSlop, 1357589585, false, (String) objArr17[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fuel_price).substring(0, 8).length() + 1572169130;
            int i18 = i15 + (((2037148234 + (((-541069329) | length) * (-381))) + (((~((~length) | (-608244273))) | 378630058) * 381)) - 11016240);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i21 = 0;
                while (i21 < strArr3.length) {
                    int i22 = onTransact + 99;
                    cancel = i22 % 128;
                    if (i22 % 2 != 0) {
                        arrayList.add(strArr3[i21]);
                        i21 += 115;
                    } else {
                        arrayList.add(strArr3[i21]);
                        i21++;
                    }
                }
            }
            int[] iArr = new int[i14];
            int i23 = i14 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i23) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iNextInt = new Random().nextInt();
            int i27 = i24 + 29974735 + (((~((~iNextInt) | (-692060230))) | (~((-67193129) | iNextInt))) * (-302)) + ((~((-692060230) | iNextInt)) * (-604)) + (((~(iNextInt | (-759253358))) | (-1070726656)) * 302);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr19[2])[0] = i29 ^ (i29 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c4 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
            int pressedStateDuration = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int bitsPerPixel = 22 - ImageFormat.getBitsPerPixel(0);
            byte b8 = $$a[7];
            Object[] objArr20 = new Object[1];
            c(b8, (short) (b8 | 193), (byte) 37, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, pressedStateDuration, bitsPerPixel, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                int offsetAfter2 = 1755 - TextUtils.getOffsetAfter("", 0);
                int iMyPid = 23 - (Process.myPid() >> 22);
                byte b9 = $$a[7];
                Object[] objArr21 = new Object[1];
                c(b9, (short) (b9 | 104), (byte) $$b, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionType, offsetAfter2, iMyPid, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_mobile_instruction_5).substring(3, 4).codePointAt(0) + 715329702;
            int i30 = ~iCodePointAt;
            int i31 = (-2139440418) + ((~(155723318 | i30)) * 979) + ((iCodePointAt | 368325744) * (-979)) + (((~(iCodePointAt | 155723318)) | (~(i30 | 368325744))) * 979) + 626473675;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{2725, 13203, 30915, 41241, 60949, 5266, 24000, 39434, 49984, 2500, 14078, 32553, 42080, 58018, 11260, 20529}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 14555, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{2726, 13532, 30276, 45508, 62311, 13045, 31857, 49143, 63807, 14465, 31258, 42426, 59160, 9899, 24617, 41555}, 15992 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1505667064};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42048), 1726 - ExpandableListView.getPackedPositionGroup(0L), 28 - Process.getGidForName(""), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 626473675);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c5 = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1755;
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                byte b10 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b10, (short) (b10 | 104), (byte) $$b, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c5, doubleTapTimeout, iResolveSizeAndState, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{2734, 55916, 43825, 30938, 18836, 7847, 61029, 49018, 36040, 23945, 8931, 62035, 49962, 37077, 24973, 13993, 1650, 55057, 42185, 30103, 23208, 10869}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 53336, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{2730, 53908, 47808, 33306, 27232, 13241, 7137, 58140, 51986, 37697, 30853, 16614, 10290, 61545, 55720}, 55351 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                    int mirror = AndroidCharacter.getMirror('0') + 1707;
                    int i34 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b11 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c(b11, (short) (b11 | 156), (byte) $$b, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRgb, mirror, i34, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                    int iMyPid2 = 1755 - (Process.myPid() >> 22);
                    int iIndexOf3 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte b12 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(b12, (short) (b12 | 193), (byte) 37, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveOpacity, iMyPid2, iIndexOf3, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr5 == null) {
                throw null;
            }
            int i35 = onTransact + 57;
            cancel = i35 % 128;
            int i36 = i35 % 2;
            for (String str : strArr5) {
                arrayList2.add(str);
            }
            throw null;
        }
        int i37 = onTransact + 3;
        cancel = i37 % 128;
        int i38 = i37 % 2;
        int i39 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i40 = 371216057 + (((~(386814242 | iIdentityHashCode)) | (-174211817)) * 672);
        int i41 = ~iIdentityHashCode;
        int i42 = i39 + i40 + (((~(iIdentityHashCode | (-174211817))) | (~((-386814243) | i41))) * (-672)) + (((~(174211816 | i41)) | (-527324139)) * 672);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr31[3])[0] = i44 ^ (i44 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != ((533811710 + (((~((-545747330) | iIdentityHashCode)) | (~((-1375734873) | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | (-1514179675))) | ((~((-684192132) | iIdentityHashCode)) | 138444802)) * (-69))) - 401042508) {
            throw new RuntimeException("-1558227790");
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_message_userid_invalid).substring(13, 15).codePointAt(1) + 1711921044;
        int i6 = 1176031974 + ((iCodePointAt | 718715661) * (-859));
        int i7 = ~iCodePointAt;
        if (i5 != i6 + (((~(iCodePointAt | (-717392398))) | (~(718715661 | i7))) * 859) + (((~((-1860340304) | i7)) | 1142947906) * 859)) {
            throw new RuntimeException("1853006008");
        }
        super.onResume();
        int i8 = onTransact + 119;
        cancel = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:12:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:9:0x0097  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 61;
        cancel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            if (i4 != (-573117390) + (((~(i5 | 444099095)) | 1098974440) * 305) + (((~((~i5) | 444099095)) | 1274086638) * 305)) {
                i = cancel + 11;
                onTransact = i % 128;
                if (i % 2 == 0) {
                    int[] iArr = new int[2143347204];
                    iArr[2143347203] = 1;
                    Toast.makeText((Context) null, iArr[-1], 0).show();
                } else {
                    int[] iArr2 = new int[2143347204];
                    iArr2[2143347203] = 1;
                    int i6 = 1170877964 % 2;
                    Toast.makeText((Context) null, iArr2[-1], 1).show();
                }
            }
        } else {
            int i7 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            if (i7 != (-1499091224) + (((~((-1368988420) | i8)) | 539000876) * (-756)) + (((~i8) | (-1368988420)) * 756)) {
                i = cancel + 11;
                onTransact = i % 128;
                if (i % 2 == 0) {
                    int[] iArr3 = new int[2143347204];
                    iArr3[2143347203] = 1;
                    Toast.makeText((Context) null, iArr3[-1], 0).show();
                } else {
                    int[] iArr4 = new int[2143347204];
                    iArr4[2143347203] = 1;
                    int i9 = 1170877964 % 2;
                    Toast.makeText((Context) null, iArr4[-1], 1).show();
                }
            }
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i11 = ~((-931877929) | iIdentityHashCode);
        int i12 = 1221288652 + ((360842248 | i11) * (-280)) + ((i11 | (~((-1647178037) | iIdentityHashCode))) * 140);
        int i13 = ~((-571035681) | iIdentityHashCode);
        int i14 = ~iIdentityHashCode;
        if (i10 != i12 + (((~(i14 | (-1076142357))) | i13 | (~((-360842249) | i14))) * 140)) {
            throw null;
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity) {
        User userAsBinder;
        int i = 2 % 2;
        int i2 = onTransact + 99;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) registerAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            int i3 = 95 / 0;
        } else {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) registerAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        int i4 = onTransact + 49;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return userAsBinder;
    }

    public static /* synthetic */ void b(RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = onTransact + 81;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            registerAutoDebetEwalletActivity.MediaBrowserCompat();
            int i4 = onTransact + 89;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            registerAutoDebetEwalletActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            registerAutoDebetEwalletActivity.g = ((CustomerObjectUpdated) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEmail().toString();
            registerAutoDebetEwalletActivity.d = ((CustomerObjectUpdated) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMobileNumber().toString();
            registerAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(((CustomerObject) registerAutoDebetEwalletActivity.TuitionPaymentFragmentbindingInflater1.getValue()).INotificationSideChannel));
            return;
        }
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registerAutoDebetEwalletActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetEwalletActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        int i6 = onTransact + 79;
        cancel = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ CustomerObject TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = registerAutoDebetEwalletActivity.getIntent().getParcelableExtra("customer_object_recurring");
        Intrinsics.checkNotNull(parcelableExtra);
        CustomerObject customerObject = (CustomerObject) parcelableExtra;
        int i4 = cancel + 81;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return customerObject;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity, View view) {
        String str;
        int i = 2 % 2;
        int i2 = cancel + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) registerAutoDebetEwalletActivity.b.getValue();
        String strValueOf = String.valueOf(((CustomerObject) registerAutoDebetEwalletActivity.TuitionPaymentFragmentbindingInflater1.getValue()).INotificationSideChannel);
        String strValueOf2 = String.valueOf(((CustomerObject) registerAutoDebetEwalletActivity.TuitionPaymentFragmentbindingInflater1.getValue()).a);
        String string = ((ActivityRegisterAutoDebetEwalletBinding) ((ViewBinding) registerAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtPhoneNumber.getText().toString();
        Intrinsics.checkNotNullParameter(string, "");
        String string2 = StringsKt.trim((CharSequence) string).toString();
        Iterator it = CollectionsKt.listOf((Object[]) new String[]{"0620", "062", "620", "+62", "62", "00", "0"}).iterator();
        while (it.hasNext()) {
            int i4 = cancel + 5;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                str = (String) it.next();
                if (StringsKt.startsWith$default(string2, str, true, 5, (Object) null)) {
                    String strSubstring = string2.substring(str.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    string2 = "+62".concat(String.valueOf(strSubstring));
                    break;
                }
            } else {
                str = (String) it.next();
                if (StringsKt.startsWith$default(string2, str, false, 2, (Object) null)) {
                    String strSubstring2 = string2.substring(str.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    string2 = "+62".concat(String.valueOf(strSubstring2));
                    break;
                }
            }
        }
        listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new EditCustomerObjectRequest(strValueOf, strValueOf2, string2));
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 81;
        cancel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 29;
        int i4 = i3 % 128;
        cancel = i4;
        int i5 = i3 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i6 = i4 + 109;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                registerAutoDebetEwalletActivity.MediaBrowserCompat();
                return;
            } else {
                registerAutoDebetEwalletActivity.MediaBrowserCompat();
                throw null;
            }
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i7 = i4 + 81;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                registerAutoDebetEwalletActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetEwalletActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            return;
        }
        int i9 = i2 + 35;
        cancel = i9 % 128;
        if (i9 % 2 == 0) {
            registerAutoDebetEwalletActivity.IconCompatParcelizer();
            RegisterRecurringSuccessActivity.Companion companion = RegisterRecurringSuccessActivity.INSTANCE;
            RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetEwalletActivity, (CustomerObject) registerAutoDebetEwalletActivity.TuitionPaymentFragmentbindingInflater1.getValue());
            registerAutoDebetEwalletActivity.d_();
            return;
        }
        registerAutoDebetEwalletActivity.IconCompatParcelizer();
        RegisterRecurringSuccessActivity.Companion companion2 = RegisterRecurringSuccessActivity.INSTANCE;
        RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetEwalletActivity, (CustomerObject) registerAutoDebetEwalletActivity.TuitionPaymentFragmentbindingInflater1.getValue());
        registerAutoDebetEwalletActivity.d_();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity = (RegisterAutoDebetEwalletActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 111;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (!(true ^ (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            registerAutoDebetEwalletActivity.MediaBrowserCompat();
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            registerAutoDebetEwalletActivity.IconCompatParcelizer();
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            CustomerObject customerObject = (CustomerObject) registerAutoDebetEwalletActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            String referenceId = ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getReferenceId();
            String strValueOf = String.valueOf(((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getPaymentMethodId());
            String str = ((CustomerObject) registerAutoDebetEwalletActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(string);
            CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerObject, null, null, null, null, sb.toString(), referenceId, registerAutoDebetEwalletActivity.d, null, strValueOf, null, String.valueOf(((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCustomerId()), null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1393, 2047);
            if (Intrinsics.areEqual(((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatus(), "REQUIRES_ACTION")) {
                PaymentAuthenticationActivity.Companion companion = PaymentAuthenticationActivity.INSTANCE;
                List<ActionLinkingStatus> actionLinkingStatus = ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getActionLinkingStatus();
                Intrinsics.checkNotNull(actionLinkingStatus);
                PaymentAuthenticationActivity.Companion.TuitionPaymentFragmentbindingInflater1(registerAutoDebetEwalletActivity, new UrlAuthentication(actionLinkingStatus.get(0).getUrl(), ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEwallet().getEwalletChannelProperties().getSuccessReturnUrl(), ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEwallet().getEwalletChannelProperties().getFailureReturnUrl()), customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                return null;
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registerAutoDebetEwalletActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetEwalletActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            int i3 = onTransact + 13;
            cancel = i3 % 128;
            int i4 = i3 % 2;
        }
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity = (RegisterAutoDebetEwalletActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = onTransact + 87;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            registerAutoDebetEwalletActivity.MediaBrowserCompat();
            return null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i4 = onTransact + 107;
                cancel = i4 % 128;
                if (i4 % 2 != 0) {
                    registerAutoDebetEwalletActivity.IconCompatParcelizer();
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetEwalletActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                    obj.hashCode();
                    throw null;
                }
                registerAutoDebetEwalletActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetEwalletActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
            return null;
        }
        int i5 = cancel + 31;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            registerAutoDebetEwalletActivity.IconCompatParcelizer();
            String strValueOf = String.valueOf(((CustomerObjectItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCustomerId());
            registerAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = strValueOf;
            registerAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf);
            return null;
        }
        registerAutoDebetEwalletActivity.IconCompatParcelizer();
        String strValueOf2 = String.valueOf(((CustomerObjectItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCustomerId());
        registerAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = strValueOf2;
        registerAutoDebetEwalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf2);
        int i6 = 30 / 0;
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -507735180, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 507735180, new Object[]{registerAutoDebetEwalletActivity, virtualCameraAdapter1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegisterAutoDebetEwalletActivity registerAutoDebetEwalletActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 715805984, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -715805983, new Object[]{registerAutoDebetEwalletActivity, virtualCameraAdapter1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    static {
        cancelAll = 1;
        d();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 119;
        cancelAll = i % 128;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iB = UserRecoverableNotifiedException.b();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(UserRecoverableNotifiedException.b(), UserRecoverableNotifiedException.b(), -2131299233, iB, 2131299235, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_bni_details).substring(34, 36).length() - 565645215)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iB = UserRecoverableNotifiedException.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iB, UserRecoverableNotifiedException.b(), 1311751111, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1311751108, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = cancel + 7;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void d() {
        notify = 7991152978378662868L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancel + 53;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return Integer.valueOf(R.layout.activity_register_auto_debet_ewallet);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
