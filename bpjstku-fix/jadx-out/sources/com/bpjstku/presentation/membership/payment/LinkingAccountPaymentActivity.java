package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.request.CreateRecurringPlanRequest;
import com.bpjstku.data.payment.model.request.PaymentProfileItem;
import com.bpjstku.databinding.ActivityLinkingAccountPaymentBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.payment.LinkingAccountPaymentActivity;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.presentation.tuition.model.LinkedAccountDirectDebit;
import com.bpjstku.presentation.tuition.model.LinkedAccountEwallet;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_MediaSpec1;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2InteropExtender;
import defpackage.CameraUseCaseAdapter;
import defpackage.ListPopupWindow2;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getCameraOperatingMode;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0015\u0010\u0006\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00168BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\n\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0015\u0010\t\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0015\u0010 \u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010#R\u0014\u0010%\u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010$"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/LinkingAccountPaymentActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityLinkingAccountPaymentBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "I", "TuitionPaymentFragmentbindingInflater1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Lcom/bpjstku/domain/user/model/User;", "onTransact", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "Ljava/lang/String;", "d", "g", "cancel", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "LListPopupWindow2;", "cancelAll", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "()I", "INotificationSideChannel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LinkingAccountPaymentActivity extends BindingBaseActivity<ActivityLinkingAccountPaymentBinding> {
    private static char INotificationSideChannel;
    private static int INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char cancelAll;
    private static char getInterfaceDescriptor;
    private static char notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int g;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy cancelAll;
    private static final byte[] $$c = {117, -15, -81, 1};
    private static final int $$f = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {55, -64, 35, -71, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 176;
    private static int write = 1;
    private static int INotificationSideChannelDefault = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private int TuitionPaymentFragmentbindingInflater1 = 2;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: measureNullChild
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LinkingAccountPaymentActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String d = "";

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String a = "";

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String asBinder = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: measureHorizontal
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LinkingAccountPaymentActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.b.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i;
        int i8 = ~((~i4) | i7 | i2);
        int i9 = (~i2) | i7;
        int i10 = i8 | (~(i9 | i4)) | (~(i | i4 | i2));
        int i11 = ~i9;
        int i12 = (~(i2 | i)) | i4 | i11;
        int i13 = i11 | (~(i7 | i4));
        int i14 = i + i4 + i6 + (933655473 * i3) + ((-1037598838) * i5);
        int i15 = i14 * i14;
        int i16 = (((-727610197) * i) - 1081761860) + (i4 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i6 * (-727609241)) + (i3 * 1532828727) + (i5 * (-747900794)) + (i15 * 556466176);
        int i17 = (((-1556109539) * i) - 925892608) + (470833381 * i4) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i6) + ((-1691877376) * i3) + ((-393216000) * i5) + ((-1633878016) * i15) + (i16 * i16 * (-1911357440));
        if (i17 == 1) {
            LinkingAccountPaymentActivity linkingAccountPaymentActivity = (LinkingAccountPaymentActivity) objArr[0];
            int i18 = 2 % 2;
            int i19 = INotificationSideChannelDefault + 71;
            RemoteActionCompatParcelizer = i19 % 128;
            int i20 = i19 % 2;
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) linkingAccountPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            int i21 = RemoteActionCompatParcelizer + 125;
            INotificationSideChannelDefault = i21 % 128;
            int i22 = i21 % 2;
            return userAsBinder;
        }
        if (i17 == 2) {
            return b(objArr);
        }
        LinkingAccountPaymentActivity linkingAccountPaymentActivity2 = (LinkingAccountPaymentActivity) objArr[0];
        int i23 = 2 % 2;
        int i24 = INotificationSideChannelDefault + 113;
        RemoteActionCompatParcelizer = i24 % 128;
        int i25 = i24 % 2;
        int i26 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i27 = ~((int) Runtime.getRuntime().maxMemory());
        if (i26 != (-1175661392) + ((~((-1485374689) | i27)) * 52) + (((~(662071839 | i27)) | (~(1492059382 | i27)) | (-2147446528)) * (-52)) + (((~(i27 | (-662071840))) | 6684694) * 52)) {
            int i28 = (-7016890) % 2;
            throw new ArithmeticException();
        }
        if (((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null) != 1647420755 + (((~((-849335638) | i7)) | (~((-1729720328) | i))) * 217) + (((~(i | (-849335638))) | 572084229) * 217) + (((~((-1729720328) | i7)) | 849335637) * 217)) {
            int i29 = (-978105368) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i30 = INotificationSideChannelDefault + 63;
        RemoteActionCompatParcelizer = i30 % 128;
        int i31 = i30 % 2;
        return null;
    }

    private static void c(int i, short s, int i2, Object[] objArr) {
        int i3 = 98 - (i * 14);
        byte[] bArr = $$a;
        int i4 = s + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (i2 + (-i3)) - 11;
            i4 = i4;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            int i7 = i4 + 1;
            if (i6 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + (-bArr[i7])) - 11;
            i4 = i7;
            i5 = i6;
        }
    }

    public LinkingAccountPaymentActivity() {
        final LinkingAccountPaymentActivity linkingAccountPaymentActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.LinkingAccountPaymentActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = linkingAccountPaymentActivity;
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
        this.cancelAll = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.LinkingAccountPaymentActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = linkingAccountPaymentActivity;
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
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.LinkingAccountPaymentActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/LinkingAccountPaymentActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/tuition/model/CustomerObject;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, CustomerObject p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) LinkingAccountPaymentActivity.class);
            intent.putExtra("customer_object_recurring", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityLinkingAccountPaymentBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 35;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        LinkingAccountPaymentActivity$bindingInflater$1 linkingAccountPaymentActivity$bindingInflater$1 = LinkingAccountPaymentActivity$bindingInflater$1.b;
        int i4 = RemoteActionCompatParcelizer + 33;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        return linkingAccountPaymentActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityLinkingAccountPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: isBaselineAligned
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkingAccountPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        int i2 = INotificationSideChannelDefault + 9;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = 58224;
            char c = 1;
            if (i5 % 2 != 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 << 1];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i7 = $11 + 101;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) cancelAll) ^ 8611973335120459638L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getInterfaceDescriptor);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char absoluteGravity = (char) (47773 - Gravity.getAbsoluteGravity(i4, i4));
                        int i11 = 468 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iIndexOf = 12 - TextUtils.indexOf((CharSequence) "", '0');
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, i11, iIndexOf, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) INotificationSideChannel) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(notify)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 47773), 468 - (ViewConfiguration.getEdgeSlop() >> 16), 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    i4 = 0;
                    c = 1;
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
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2323;
                int iKeyCodeFromString = 44 - KeyEvent.keyCodeFromString("");
                byte b2 = (byte) ($$c[3] - 1);
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, i12, iKeyCodeFromString, -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((ListPopupWindow2) this.cancelAll.getValue()).f164a.observe(this, new b(new Function1() { // from class: isMeasureWithLargestChildEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkingAccountPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = INotificationSideChannelDefault + 115;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:29:0x0100  */
    /* JADX WARN: Code duplicated, block: B:31:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x020e  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        EditText editText;
        int i;
        LinkedAccountEwallet linkedAccountEwallet;
        String str2;
        int i2 = 2 % 2;
        int i3 = INotificationSideChannelDefault + 7;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        ActivityLinkingAccountPaymentBinding activityLinkingAccountPaymentBinding = (ActivityLinkingAccountPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        this.a = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(((CustomerObject) this.asInterface.getValue()).onTransact), this.asBinder);
        Double d = ((CustomerObject) this.asInterface.getValue()).MediaBrowserCompat;
        Intrinsics.checkNotNull(d);
        if (d.doubleValue() > 0.0d) {
            this.TuitionPaymentFragmentbindingInflater1 = 3;
        }
        Double d2 = ((CustomerObject) this.asInterface.getValue()).connect;
        Intrinsics.checkNotNull(d2);
        int iDoubleValue = (int) (d2.doubleValue() + ((double) (this.TuitionPaymentFragmentbindingInflater1 * 200)));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iDoubleValue;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iDoubleValue + ((CustomerObject) this.asInterface.getValue()).IconCompatParcelizer;
        String str3 = null;
        if (Intrinsics.areEqual(((CustomerObject) this.asInterface.getValue()).cancelAll, "DANA")) {
            activityLinkingAccountPaymentBinding.imgMerchantPartner.setImageResource(2131231295);
            LinkedAccountEwallet linkedAccountEwallet2 = ((CustomerObject) this.asInterface.getValue()).unsubscribe;
            String str4 = linkedAccountEwallet2 != null ? linkedAccountEwallet2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (str4 != null) {
                int i5 = INotificationSideChannelDefault + 97;
                RemoteActionCompatParcelizer = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 95 / 0;
                    if (str4.length() != 0) {
                        activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(0);
                        activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(0);
                        editText = activityLinkingAccountPaymentBinding.tilPhoneNumber.getEditText();
                        if (editText != null) {
                            i = RemoteActionCompatParcelizer + 3;
                            INotificationSideChannelDefault = i % 128;
                            if (i % 2 == 0) {
                                LinkedAccountEwallet linkedAccountEwallet3 = ((CustomerObject) this.asInterface.getValue()).unsubscribe;
                                str3.hashCode();
                                throw null;
                            }
                            linkedAccountEwallet = ((CustomerObject) this.asInterface.getValue()).unsubscribe;
                            if (linkedAccountEwallet != null) {
                                int i7 = RemoteActionCompatParcelizer + 31;
                                INotificationSideChannelDefault = i7 % 128;
                                int i8 = i7 % 2;
                                str2 = linkedAccountEwallet.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            } else {
                                int i9 = RemoteActionCompatParcelizer + 35;
                                INotificationSideChannelDefault = i9 % 128;
                                int i10 = i9 % 2;
                                str2 = null;
                            }
                            editText.setText(str2);
                        }
                    } else {
                        activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(8);
                        activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(8);
                    }
                } else if (str4.length() != 0) {
                    activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(0);
                    activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(0);
                    editText = activityLinkingAccountPaymentBinding.tilPhoneNumber.getEditText();
                    if (editText != null) {
                        i = RemoteActionCompatParcelizer + 3;
                        INotificationSideChannelDefault = i % 128;
                        if (i % 2 == 0) {
                            LinkedAccountEwallet linkedAccountEwallet4 = ((CustomerObject) this.asInterface.getValue()).unsubscribe;
                            str3.hashCode();
                            throw null;
                        }
                        linkedAccountEwallet = ((CustomerObject) this.asInterface.getValue()).unsubscribe;
                        if (linkedAccountEwallet != null) {
                            int i11 = RemoteActionCompatParcelizer + 31;
                            INotificationSideChannelDefault = i11 % 128;
                            int i12 = i11 % 2;
                            str2 = linkedAccountEwallet.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        } else {
                            int i13 = RemoteActionCompatParcelizer + 35;
                            INotificationSideChannelDefault = i13 % 128;
                            int i14 = i13 % 2;
                            str2 = null;
                        }
                        editText.setText(str2);
                    }
                } else {
                    activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(8);
                    activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(8);
                }
            } else {
                activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(8);
                activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(8);
            }
        }
        if (Intrinsics.areEqual(((CustomerObject) this.asInterface.getValue()).cancelAll, "LINKAJA")) {
            int i15 = RemoteActionCompatParcelizer + 109;
            INotificationSideChannelDefault = i15 % 128;
            if (i15 % 2 != 0) {
                activityLinkingAccountPaymentBinding.imgMerchantPartner.setImageResource(R.drawable.ic_linkaja);
                LinkedAccountEwallet linkedAccountEwallet5 = ((CustomerObject) this.asInterface.getValue()).onConnectionFailed;
                throw null;
            }
            activityLinkingAccountPaymentBinding.imgMerchantPartner.setImageResource(R.drawable.ic_linkaja);
            LinkedAccountEwallet linkedAccountEwallet6 = ((CustomerObject) this.asInterface.getValue()).onConnectionFailed;
            if (linkedAccountEwallet6 != null) {
                str = linkedAccountEwallet6.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                int i16 = RemoteActionCompatParcelizer + 65;
                INotificationSideChannelDefault = i16 % 128;
                int i17 = i16 % 2;
                str = null;
            }
            String str5 = str;
            if (str5 == null || str5.length() == 0) {
                activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(8);
                activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(8);
            } else {
                activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(0);
                activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(0);
                EditText editText2 = activityLinkingAccountPaymentBinding.tilPhoneNumber.getEditText();
                if (editText2 != null) {
                    LinkedAccountEwallet linkedAccountEwallet7 = ((CustomerObject) this.asInterface.getValue()).onConnectionFailed;
                    editText2.setText(linkedAccountEwallet7 != null ? linkedAccountEwallet7.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                }
            }
        }
        if (Intrinsics.areEqual(((CustomerObject) this.asInterface.getValue()).cancelAll, "OVO")) {
            activityLinkingAccountPaymentBinding.imgMerchantPartner.setImageResource(R.drawable.bg_logo_ovo);
            LinkedAccountEwallet linkedAccountEwallet8 = ((CustomerObject) this.asInterface.getValue()).getServiceComponent;
            String str6 = linkedAccountEwallet8 != null ? linkedAccountEwallet8.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (str6 != null) {
                int i18 = RemoteActionCompatParcelizer + 39;
                INotificationSideChannelDefault = i18 % 128;
                if (i18 % 2 != 0) {
                    str6.length();
                    throw null;
                }
                if (str6.length() != 0) {
                    activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(0);
                    activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(0);
                    EditText editText3 = activityLinkingAccountPaymentBinding.tilPhoneNumber.getEditText();
                    if (editText3 != null) {
                        LinkedAccountEwallet linkedAccountEwallet9 = ((CustomerObject) this.asInterface.getValue()).getServiceComponent;
                        editText3.setText(linkedAccountEwallet9 != null ? linkedAccountEwallet9.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                    }
                } else {
                    activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(8);
                    activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(8);
                }
            } else {
                activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(8);
                activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(8);
            }
        }
        if (Intrinsics.areEqual(((CustomerObject) this.asInterface.getValue()).cancelAll, "BRI")) {
            activityLinkingAccountPaymentBinding.tilPhoneNumber.setHint("4 Digit Terakhir Kartu BRI");
            activityLinkingAccountPaymentBinding.imgMerchantPartner.setImageResource(2131230997);
            LinkedAccountDirectDebit linkedAccountDirectDebit = ((CustomerObject) this.asInterface.getValue()).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String;
            String str7 = linkedAccountDirectDebit != null ? linkedAccountDirectDebit.TuitionPaymentFragmentbindingInflater1 : null;
            if (str7 == null || str7.length() == 0) {
                activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(8);
                activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(8);
            } else {
                int i19 = RemoteActionCompatParcelizer + 73;
                INotificationSideChannelDefault = i19 % 128;
                int i20 = i19 % 2;
                activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(0);
                activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(0);
                EditText editText4 = activityLinkingAccountPaymentBinding.tilPhoneNumber.getEditText();
                if (editText4 != null) {
                    LinkedAccountDirectDebit linkedAccountDirectDebit2 = ((CustomerObject) this.asInterface.getValue()).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String;
                    editText4.setText(linkedAccountDirectDebit2 != null ? linkedAccountDirectDebit2.TuitionPaymentFragmentbindingInflater1 : null);
                }
            }
        }
        if (Intrinsics.areEqual(((CustomerObject) this.asInterface.getValue()).cancelAll, "MANDIRI")) {
            activityLinkingAccountPaymentBinding.tilPhoneNumber.setHint("4 Digit Terakhir Kartu Mandiri");
            activityLinkingAccountPaymentBinding.imgMerchantPartner.setImageResource(2131231594);
            LinkedAccountDirectDebit linkedAccountDirectDebit3 = ((CustomerObject) this.asInterface.getValue()).getSessionToken;
            String str8 = linkedAccountDirectDebit3 != null ? linkedAccountDirectDebit3.TuitionPaymentFragmentbindingInflater1 : null;
            if (str8 == null || str8.length() == 0) {
                activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(8);
                activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(8);
            } else {
                activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(0);
                activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(0);
                EditText editText5 = activityLinkingAccountPaymentBinding.tilPhoneNumber.getEditText();
                if (editText5 != null) {
                    LinkedAccountDirectDebit linkedAccountDirectDebit4 = ((CustomerObject) this.asInterface.getValue()).getSessionToken;
                    editText5.setText(linkedAccountDirectDebit4 != null ? linkedAccountDirectDebit4.TuitionPaymentFragmentbindingInflater1 : null);
                }
            }
        }
        if (Intrinsics.areEqual(((CustomerObject) this.asInterface.getValue()).cancelAll, "SHOPEEPAY")) {
            activityLinkingAccountPaymentBinding.imgMerchantPartner.setImageResource(R.drawable.ic_shopeepay_large_size);
            LinkedAccountEwallet linkedAccountEwallet10 = ((CustomerObject) this.asInterface.getValue()).MediaBrowserCompatCallbackHandler;
            String str9 = linkedAccountEwallet10 != null ? linkedAccountEwallet10.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (str9 == null || str9.length() == 0) {
                activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(8);
                activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(8);
            } else {
                activityLinkingAccountPaymentBinding.tvTitleStatusLinkingAccount.setVisibility(0);
                activityLinkingAccountPaymentBinding.tilPhoneNumber.setVisibility(0);
                EditText editText6 = activityLinkingAccountPaymentBinding.tilPhoneNumber.getEditText();
                if (editText6 != null) {
                    LinkedAccountEwallet linkedAccountEwallet11 = ((CustomerObject) this.asInterface.getValue()).MediaBrowserCompatCallbackHandler;
                    editText6.setText(linkedAccountEwallet11 != null ? linkedAccountEwallet11.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                    int i21 = RemoteActionCompatParcelizer + 21;
                    INotificationSideChannelDefault = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i22 = 5 % 4;
                    }
                }
            }
        }
        activityLinkingAccountPaymentBinding.tvTitleInfoNikValue.setText(((CustomerObject) this.asInterface.getValue()).TuitionPaymentFragmentbindingInflater1.toString());
        activityLinkingAccountPaymentBinding.tvTitleInfoNamaValue.setText(((CustomerObject) this.asInterface.getValue()).b.toString());
        activityLinkingAccountPaymentBinding.tvTitleInfoTuitionValue.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(((CustomerObject) this.asInterface.getValue()).IconCompatParcelizer)));
        activityLinkingAccountPaymentBinding.tvTitleInfoTuitionMitraValue.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
        activityLinkingAccountPaymentBinding.tvTotalAutodebetValue.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 63;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        LinkingAccountPaymentActivity linkingAccountPaymentActivity = this;
        Intrinsics.checkNotNullParameter(linkingAccountPaymentActivity, "");
        linkingAccountPaymentActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityLinkingAccountPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityLinkingAccountPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_linking_account_payment));
        int i4 = INotificationSideChannelDefault + 53;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        INotificationSideChannelDefault = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = RemoteActionCompatParcelizer + 95;
                INotificationSideChannelDefault = i3 % 128;
                if (i3 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    obj.hashCode();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 87;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int i4 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            short s = bArr[132];
            Object[] objArr2 = new Object[1];
            c(b2, s, (byte) (s & 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, i4, iLastIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{5865, 61309, 49539, 54967, 24268, 45480, 36287, 38991, 57744, 1355, 4508, 16891, 24396, 18232, 35022, 6388, 48207, 28082, 64399, 37389, 26298, 4568, 18357, 23689}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_failed).substring(0, 1).codePointAt(0) - 58, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{32419, 19967, 47618, 60231, 4153, 48762, 64373, 52086, 54387, 41273, 30929, 697, 14820, 43892, 2404, 11217, 21234, 18035}, 15 - View.resolveSize(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int iBlue = Color.blue(0) + 1031;
            int i5 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte b3 = $$a[5];
            short s2 = (short) (b3 | 50);
            Object[] objArr5 = new Object[1];
            c(b3, s2, (byte) (s2 + 1), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, iBlue, i5, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i6 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b5, (short) (b5 | 103), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i6, iMakeMeasureSpec, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i10 = 1055211545 + (((~((-1049475) | (~i9))) | (~(243230695 | i9))) * (-272)) + (((~((-36784003) | i9)) | 35734528) * (-272)) + (((~(i9 | 36784002)) | 207496167) * 272) + 580616908;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{34187, 22965, 45986, 3629, 29598, 6364, 43244, 15304, 11593, 57113, 45750, 31802, 50449, 1256, 4931, 4144, 30566, 45521}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingcity_empty).substring(15, 16).codePointAt(0) - 92, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{58038, 48720, 35179, 58851, 21882, 49345, 30664, 32401, 52793, 29591, 774, 35630, 41071, 19974, 49074, 10595, 23991, 49848}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_unavailable).substring(4, 5).codePointAt(0) - 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1819436687};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - View.MeasureSpec.getSize(0)), 1133 - ExpandableListView.getPackedPositionChild(0L), 18 - TextUtils.getCapsMode("", 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 580616908, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iAlpha = Color.alpha(0) + 1031;
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                    byte[] bArr2 = $$a;
                    byte b6 = bArr2[5];
                    short s3 = bArr2[132];
                    Object[] objArr12 = new Object[1];
                    c(b6, s3, (byte) (s3 & 52), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, iAlpha, scrollBarSize, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.MeasureSpec.getSize(0)), Color.argb(0, 0, 0, 0) + 1117, KeyEvent.getDeadChar(0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                    int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr13 = new Object[1];
                    c(b8, (short) (b8 | 103), b7, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, keyRepeatTimeout, packedPositionChild, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{5865, 61309, 49539, 54967, 24268, 45480, 36287, 38991, 57744, 1355, 4508, 16891, 24396, 18232, 35022, 6388, 48207, 28082, 64399, 37389, 26298, 4568, 18357, 23689}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{32419, 19967, 47618, 60231, 4153, 48762, 64373, 52086, 54387, 41273, 30929, 697, 14820, 43892, 2404, 11217, 21234, 18035}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 16;
                        byte b9 = $$a[5];
                        short s4 = (short) (b9 | 50);
                        Object[] objArr16 = new Object[1];
                        c(b9, s4, (byte) (s4 + 1), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(gidForName, iNormalizeMetaState, bitsPerPixel, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int i13 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int size = View.MeasureSpec.getSize(0) + 15;
                        byte[] bArr3 = $$a;
                        byte b10 = bArr3[5];
                        short s5 = bArr3[132];
                        Object[] objArr17 = new Object[1];
                        c(b10, s5, (byte) (s5 & 52), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, i13, size, 1357589585, false, (String) objArr17[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = INotificationSideChannelDefault + 123;
            RemoteActionCompatParcelizer = i16 % 128;
            int i17 = i16 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i22 = i18 + (-243233947) + (((~((-25248001) | i21)) | 269528170) * (-756)) + (((~i21) | (-25248001)) * 756);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[3])[0];
            int i27 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = ~((-2338833) | iIdentityHashCode);
            int i29 = ~iIdentityHashCode;
            int i30 = i25 + (-1155175919) + ((i28 | (~((-168296705) | i29))) * 920) + (((~((-73644634) | i29)) | 2338832) * 920) + (((~(iIdentityHashCode | (-168296705))) | (~((-2338833) | i29)) | (~((-71305802) | iIdentityHashCode))) * 920);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr19[2])[0] = i32 ^ (i32 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
            int i33 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iRgb = (-16777193) - Color.rgb(0, 0, 0);
            byte b11 = $$a[5];
            short s6 = (short) (b11 | 102);
            Object[] objArr20 = new Object[1];
            c(b11, s6, (byte) (s6 & 189), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cAxisFromString, i33, iRgb, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i34 = RemoteActionCompatParcelizer + 123;
            INotificationSideChannelDefault = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0');
                int size2 = 23 - View.MeasureSpec.getSize(0);
                byte b12 = $$a[5];
                short s7 = (short) (b12 | 50);
                Object[] objArr21 = new Object[1];
                c(b12, s7, (byte) (s7 + 1), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, iLastIndexOf2, size2, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iNextInt = new Random().nextInt(1336019497);
            int i36 = ~iNextInt;
            int i37 = ((1566088347 + (((~(641072201 | i36)) | (~((-853674628) | iNextInt))) * (-370))) + ((((~(iNextInt | 641072201)) | (~(i36 | (-853674628)))) | 68547656) * (-370))) - 1045853352;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i39 ^ (i39 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{34187, 22965, 45986, 3629, 29598, 6364, 43244, 15304, 11593, 57113, 45750, 31802, 50449, 1256, 4931, 4144, 30566, 45521}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{58038, 48720, 35179, 58851, 21882, 49345, 30664, 32401, 52793, 29591, 774, 35630, 41071, 19974, 49074, 10595, 23991, 49848}, (Process.myTid() >> 22) + 16, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1819436687};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getTouchSlop() >> 8)), 1726 - (ViewConfiguration.getWindowTouchSlop() >> 8), 29 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -638682296);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyPid = (char) (29944 - (Process.myPid() >> 22));
                int scrollBarFadeDuration2 = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i40 = 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b13 = $$a[5];
                short s8 = (short) (b13 | 50);
                Object[] objArr26 = new Object[1];
                c(b13, s8, (byte) (s8 + 1), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyPid, scrollBarFadeDuration2, i40, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{5865, 61309, 49539, 54967, 24268, 45480, 36287, 38991, 57744, 1355, 4508, 16891, 24396, 18232, 35022, 6388, 48207, 28082, 64399, 37389, 26298, 4568, 18357, 23689}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_cta_text_try_later).substring(0, 20).length() + 2, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{32419, 19967, 47618, 60231, 4153, 48762, 64373, 52086, 54387, 41273, 30929, 697, 14820, 43892, 2404, 11217, 21234, 18035}, 15 - View.resolveSize(0, 0), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char offsetAfter = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                    int iAlpha2 = Color.alpha(0) + 1755;
                    int packedPositionChild2 = 24 + ExpandableListView.getPackedPositionChild(0L);
                    Object[] objArr29 = new Object[1];
                    c($$a[5], (short) 140, (byte) 52, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetAfter, iAlpha2, packedPositionChild2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                    byte b14 = $$a[5];
                    short s9 = (short) (b14 | 102);
                    Object[] objArr30 = new Object[1];
                    c(b14, s9, (byte) (s9 & 189), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(keyRepeatDelay, iKeyCodeFromString, iCombineMeasuredStates, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr5 != null) {
                int i41 = RemoteActionCompatParcelizer + 45;
                INotificationSideChannelDefault = i41 % 128;
                for (int i42 = i41 % 2 == 0 ? 0 : 1; i42 < strArr5.length; i42++) {
                    arrayList2.add(strArr5[i42]);
                }
            }
            throw null;
        }
        int i43 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i44 = 957029939 + ((iIdentityHashCode2 | 800940255) * (-50));
        int i45 = ~((-212607067) | iIdentityHashCode2);
        int i46 = ~iIdentityHashCode2;
        int i47 = i43 + i44 + ((i45 | (~(800944895 | i46))) * 50) + (((~(i46 | 800940255)) | (~(588337829 | i46)) | (-800944896)) * 50);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr31[3])[0] = i49 ^ (i49 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 33;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 1137475320 + (((~((-840013334) | i5)) | 10025790) * (-328)) + ((iIdentityHashCode | 10025790) * 164) + (((~(iIdentityHashCode | 840013333)) | 8939818 | (~(i5 | (-838927362)))) * 164)) {
            throw null;
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i7 = ~iElapsedRealtime;
        int i8 = ~(314343426 | i7);
        if (i6 != (-327540196) + (((-2076162728) | i8) * (-712)) + (((~(iElapsedRealtime | (-1761819302))) | (~(i7 | 2076162727))) * (-712)) + ((2030254757 | i8) * 712)) {
            int i9 = 1465337212 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i10 = RemoteActionCompatParcelizer + 35;
        INotificationSideChannelDefault = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 55 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ca, code lost:
    
        if (r1 != (((1385593784 + ((r6 | r7) * 1150)) + (((~(2049912392 | r4)) | r7) * (-575))) + (((~(r2 | (-529143573))) | (~(r4 | 529143572))) * 575))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cc, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.membership.payment.LinkingAccountPaymentActivity.INotificationSideChannelDefault + 41;
        com.bpjstku.presentation.membership.payment.LinkingAccountPaymentActivity.RemoteActionCompatParcelizer = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d8, code lost:
    
        if ((r10 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00da, code lost:
    
        r10 = 50 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e5, code lost:
    
        throw new java.lang.RuntimeException("-1123834596");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e6, code lost:
    
        r10 = 1508732202 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ef, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        if (r1 == (((-381807440) + ((r5 | (~(r6 | 1070202879))) * 497)) + (((~(r4 | 1070202879)) | ((~((-239689721) | r6)) | 239164104)) * 497))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0070, code lost:
    
        if (r1 == ((((-410628888) + (((~(1237868914 | r4)) | 268928649) * 104)) + ((~((~r4) | (-1098916193))) * (-104))) + ((r4 | 407881371) * 104))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0072, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r5 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 678085041;
        r4 = ~r2;
        r6 = ~((-529143573) | r4);
        r7 = ~((-2049912393) | r2);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.LinkingAccountPaymentActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(LinkingAccountPaymentActivity linkingAccountPaymentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 89;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        MainActivity.Companion companion = MainActivity.INSTANCE;
        MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(linkingAccountPaymentActivity, null, null, 6);
        linkingAccountPaymentActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = RemoteActionCompatParcelizer + 43;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ CustomerObject b(LinkingAccountPaymentActivity linkingAccountPaymentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 45;
        RemoteActionCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Parcelable parcelableExtra = linkingAccountPaymentActivity.getIntent().getParcelableExtra("customer_object_recurring");
            Intrinsics.checkNotNull(parcelableExtra);
            throw null;
        }
        Parcelable parcelableExtra2 = linkingAccountPaymentActivity.getIntent().getParcelableExtra("customer_object_recurring");
        Intrinsics.checkNotNull(parcelableExtra2);
        CustomerObject customerObject = (CustomerObject) parcelableExtra2;
        int i3 = RemoteActionCompatParcelizer + 71;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return customerObject;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(final LinkingAccountPaymentActivity linkingAccountPaymentActivity) {
        int i = 2 % 2;
        int i2 = linkingAccountPaymentActivity.g + 1;
        linkingAccountPaymentActivity.g = i2;
        if (i2 == 1) {
            int i3 = RemoteActionCompatParcelizer + 61;
            INotificationSideChannelDefault = i3 % 128;
            int i4 = i3 % 2;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (Intrinsics.areEqual(StringsKt.split$default((CharSequence) linkingAccountPaymentActivity.a, new String[]{"#"}, false, 0, 6, (Object) null).get(2), String.valueOf(((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).IconCompatParcelizer))) {
                ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) linkingAccountPaymentActivity.cancelAll.getValue();
                String str = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).TuitionPaymentFragmentbindingInflater1;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("#");
                sb.append(string);
                String string2 = sb.toString();
                String str2 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).INotificationSideChannel;
                Intrinsics.checkNotNull(str2);
                String string3 = str2.toString();
                int i5 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).IconCompatParcelizer;
                String strValueOf = String.valueOf(((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).d);
                int i6 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).IconCompatParcelizer;
                String str3 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).TuitionPaymentFragmentbindingInflater1;
                String str4 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).getItem;
                String str5 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).RemoteActionCompatParcelizer;
                String str6 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).onTransact;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i6);
                sb2.append("#");
                sb2.append(str3);
                sb2.append("#");
                sb2.append(str4);
                sb2.append("#");
                sb2.append(str5);
                sb2.append("#");
                sb2.append(str6);
                String string4 = sb2.toString();
                String string5 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).TuitionPaymentFragmentbindingInflater1.toString();
                String string6 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).b.toString();
                String str7 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str8 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).asInterface;
                String str9 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).a;
                String str10 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).cancelAll;
                String strValueOf2 = String.valueOf(((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).d);
                String str11 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).getInterfaceDescriptor;
                String str12 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).RemoteActionCompatParcelizer;
                int i7 = ((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).IconCompatParcelizer;
                listPopupWindow2.b(new CreateRecurringPlanRequest(string2, string3, String.valueOf(i5), strValueOf, string4, new PaymentProfileItem(String.valueOf(((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).INotificationSideChannel), string5, string6, str7, str8, str9, str10, str12, String.valueOf(i7), str11, strValueOf2, String.valueOf(((CustomerObject) linkingAccountPaymentActivity.asInterface.getValue()).getItem))));
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(linkingAccountPaymentActivity, "Invalid Request", new Function0() { // from class: layoutVertical
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LinkingAccountPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                });
                int i8 = INotificationSideChannelDefault + 77;
                RemoteActionCompatParcelizer = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(LinkingAccountPaymentActivity linkingAccountPaymentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = INotificationSideChannelDefault + 85;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            linkingAccountPaymentActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            linkingAccountPaymentActivity.IconCompatParcelizer();
            linkingAccountPaymentActivity.g = 0;
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(linkingAccountPaymentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: getWeightSum
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LinkingAccountPaymentActivity.d();
                }
            });
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = RemoteActionCompatParcelizer + 89;
            INotificationSideChannelDefault = i4 % 128;
            if (i4 % 2 != 0) {
                linkingAccountPaymentActivity.IconCompatParcelizer();
                linkingAccountPaymentActivity.g = 0;
                RegisterRecurringSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = RegisterRecurringSuccessActivity.INSTANCE;
                RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(linkingAccountPaymentActivity, (CustomerObject) linkingAccountPaymentActivity.asInterface.getValue());
            } else {
                linkingAccountPaymentActivity.IconCompatParcelizer();
                linkingAccountPaymentActivity.g = 0;
                RegisterRecurringSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisterRecurringSuccessActivity.INSTANCE;
                RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(linkingAccountPaymentActivity, (CustomerObject) linkingAccountPaymentActivity.asInterface.getValue());
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannelDefault + 83;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ User TuitionPaymentFragmentbindingInflater1(LinkingAccountPaymentActivity linkingAccountPaymentActivity) {
        return (User) TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{linkingAccountPaymentActivity}, -1518120287, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1518120288, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static {
        INotificationSideChannelStub = 0;
        g();
        INSTANCE = new Companion(null);
        int i = write + 21;
        INotificationSideChannelStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 9;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_linking_account_payment;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, 1410460622, (-923291179) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1.b(), -1410460620, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, 1359469026, ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1.b(), -1359469026, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 209254144, ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = RemoteActionCompatParcelizer + 83;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        INotificationSideChannel = (char) 42762;
        notify = (char) 20187;
        cancelAll = (char) 13306;
        getInterfaceDescriptor = (char) 23744;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        INotificationSideChannelDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, short r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r6 = r6 * 4
            int r6 = r6 + 1
            byte[] r0 = com.bpjstku.presentation.membership.payment.LinkingAccountPaymentActivity.$$c
            int r7 = r7 * 3
            int r7 = 108 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.LinkingAccountPaymentActivity.$$i(byte, short, byte):java.lang.String");
    }
}
