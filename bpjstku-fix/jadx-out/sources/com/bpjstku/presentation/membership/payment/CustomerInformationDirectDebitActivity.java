package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
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
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard;
import com.bpjstku.data.payment.model.request.EditCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.ForceExpirePaymentMethodRequest;
import com.bpjstku.data.payment.model.request.GetListPaymentMethodRequest;
import com.bpjstku.data.payment.model.response.ActionLinkingStatus;
import com.bpjstku.data.payment.model.response.CreatePaymentMethodGeneralResponse;
import com.bpjstku.data.payment.model.response.CustomerObjectItem;
import com.bpjstku.data.payment.model.response.CustomerObjectUpdated;
import com.bpjstku.data.payment.model.response.PaymentMethodItem;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import com.bpjstku.databinding.ActivityCustomerInformationDirectDebitBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Constants;
import com.msa.dateedittext.DateEditText;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ListPopupWindow2;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getEventTime;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setInactive;
import defpackage.setQuickZoomEnabled;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0004R\u0015\u0010\n\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0015\u0010\u0016\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0015\u0010\f\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010!R\u0014\u0010\u0014\u001a\u00020\"8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010#"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/CustomerInformationDirectDebitActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityCustomerInformationDirectDebitBinding;", "<init>", "()V", "", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)V", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LListPopupWindow2;", "Lcom/bpjstku/domain/user/model/User;", "g", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomerInformationDirectDebitActivity extends BindingReactiveFormActivity<ActivityCustomerInformationDirectDebitBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f526a;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {110, -73, -111, 99};
    private static final int $$f = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {102, -96, -78, -55, 34, 13, 3, 4, 23, -20, 30, 20, -3, 6, 13, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$n = 197;
    private static final byte[] $$a = {115, 98, 19, 9, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 65;
    private static int notify = 0;
    private static int asBinder = 0;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: getChildrenSkipCount
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CustomerInformationDirectDebitActivity.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: getLocationOffset
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (User) CustomerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(VoucherRequest.b(), VoucherRequest.b(), -1263970300, VoucherRequest.b(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1}, VoucherRequest.b(), 1263970301);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i5 | i7);
        int i9 = i3 | i8;
        int i10 = ~i3;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i3)) | (~(i10 | i6));
        int i13 = i6 + i3 + i + (513088896 * i2) + ((-1342203445) * i4);
        int i14 = i13 * i13;
        int i15 = (665020156 * i6) + 661520384 + (1303681286 * i3) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i) + ((-771751936) * i2) + (1382285312 * i4) + ((-350355456) * i14);
        int i16 = ((i6 * (-363642324)) - 614971735) + (i3 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i * (-363641803)) + (i2 * (-2127225984)) + (i4 * (-1080704249)) + (i14 * (-1523187712));
        int i17 = i15 + (i16 * i16 * (-227409920));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 == 2) {
            return b(objArr);
        }
        if (i17 != 3) {
            return i17 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r6
            int r8 = r8 + 4
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r7 = r7 + r8
            int r8 = r3 + 1
            int r7 = r7 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.c(byte, int, short, java.lang.Object[]):void");
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
    private static void f(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 26
            int r8 = r8 + 12
            int r7 = r7 * 11
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.$$m
            int r6 = r6 * 3
            int r6 = r6 + 84
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r8
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.f(int, short, int, java.lang.Object[]):void");
    }

    public CustomerInformationDirectDebitActivity() {
        final CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = customerInformationDirectDebitActivity;
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
        this.asInterface = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = customerInformationDirectDebitActivity;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/CustomerInformationDirectDebitActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/presentation/tuition/model/CustomerObject;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, CustomerObject p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) CustomerInformationDirectDebitActivity.class);
            intent.putExtra("customer_object_recurring", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityCustomerInformationDirectDebitBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            CustomerInformationDirectDebitActivity$bindingInflater$1 customerInformationDirectDebitActivity$bindingInflater$1 = CustomerInformationDirectDebitActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CustomerInformationDirectDebitActivity$bindingInflater$1 customerInformationDirectDebitActivity$bindingInflater$2 = CustomerInformationDirectDebitActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = asBinder + 71;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return customerInformationDirectDebitActivity$bindingInflater$2;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        Editable text;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        ActivityCustomerInformationDirectDebitBinding activityCustomerInformationDirectDebitBindingINotificationSideChannelStub = INotificationSideChannelStub();
        ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String string = ((CustomerObject) this.b.getValue()).b.toString();
        EditText editText = activityCustomerInformationDirectDebitBindingINotificationSideChannelStub.tilValueLastFourDigitDebitCard.getEditText();
        if (editText != null) {
            int i2 = cancelAll + 111;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            text = editText.getText();
        } else {
            text = null;
        }
        String strValueOf = String.valueOf(text);
        String strValueOf2 = String.valueOf(activityCustomerInformationDirectDebitBindingINotificationSideChannelStub.edtExpiredValue.getText());
        EditText editText2 = activityCustomerInformationDirectDebitBindingINotificationSideChannelStub.tilEmailAddress.getEditText();
        listPopupWindow2.TuitionPaymentFragmentbindingInflater1(new CreatePaymentMethodWithDebitCard(p0, "BRI", string, Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityCustomerInformationDirectDebitBindingINotificationSideChannelStub.edtPhoneNumber.getText().toString()), strValueOf, strValueOf2, String.valueOf(editText2 != null ? editText2.getText() : null)));
        int i4 = cancelAll + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        DateEditText dateEditText = INotificationSideChannelStub().edtExpiredValue;
        dateEditText.addTextChangedListener(dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Button button = INotificationSideChannelStub().btnProcess;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getDividerWidth
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) CustomerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(VoucherRequest.b(), VoucherRequest.b(), 1138978234, VoucherRequest.b(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj}, VoucherRequest.b(), -1138978230);
            }
        }));
        int i2 = cancelAll + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f526a;
        long j = 0;
        int i5 = -1870535734;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = $11 + 119;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) - 1);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3291;
                        int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 30;
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, fadingEdgeLength, i11, 1948206109, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = 2;
                    j = 0;
                    i5 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f526a;
        if (iArr6 != null) {
            int i12 = $11 + 57;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i13 = $10 + 39;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    try {
                        Object[] objArr3 = new Object[i6];
                        objArr3[i7] = Integer.valueOf(iArr6[i2]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) i7;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getCapsMode("", i7, i7) + 3291, Process.getGidForName("") + 32, 1948206109, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i2 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    length = length;
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr6[i2])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 3291 - Gravity.getAbsoluteGravity(0, 0), Gravity.getAbsoluteGravity(0, 0) + 31, 1948206109, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        i2++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                length = length;
                i6 = 1;
                i7 = 0;
            }
            iArr6 = iArr2;
        }
        int i14 = i7;
        System.arraycopy(iArr6, i14, iArr5, i14, length3);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[i14] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                int i17 = $10 + 11;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i15];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2559, TextUtils.indexOf((CharSequence) "", '0', 0) + 30, 683220507, false, $$i(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i15 += 103;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i15];
                    Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 1;
                        byte b10 = (byte) (b9 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 2559 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 29 - KeyEvent.getDeadChar(0, 0), 683220507, false, $$i(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i15--;
                }
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr7 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (28879 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 348, 25 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i14 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity = this;
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(customerInformationDirectDebitActivity, new Observer() { // from class: drawHorizontalDivider
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                CustomerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(VoucherRequest.b(), VoucherRequest.b(), -410863199, VoucherRequest.b(), new Object[]{this.b, (VirtualCameraAdapter1) obj}, VoucherRequest.b(), 410863201);
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancel.observe(customerInformationDirectDebitActivity, new Observer() { // from class: getBaselineAlignedChildIndex
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                CustomerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(customerInformationDirectDebitActivity, new Observer() { // from class: drawDividersVertical
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                CustomerInformationDirectDebitActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancelAll.observe(customerInformationDirectDebitActivity, new Observer() { // from class: getDividerPadding
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IllegalAccessException {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 41, (Process.myTid() >> 22) + 19, 1513912262, false, "b", null);
                }
                int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37835), 59 - KeyEvent.keyCodeFromString(""), 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - KeyEvent.keyCodeFromString("")), ExpandableListView.getPackedPositionType(0L) + 59, 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                }
                int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                long j2 = -1;
                long j3 = 151057716872392356L ^ j2;
                long jIdentityHashCode = System.identityHashCode(this);
                long j4 = jIdentityHashCode | 5368195780287393883L;
                long j5 = (((long) (-464)) * 151057716872392356L) + (((long) (-929)) * 5368195780287393883L) + (((long) (-465)) * (j3 | (j4 ^ j2))) + (((long) 930) * (((jIdentityHashCode | j3) ^ j2) | 5368195780287393883L)) + (((long) 465) * (j4 | j3));
                int i4 = 0;
                long j6 = j;
                while (true) {
                    for (int i5 = 0; i5 != 8; i5++) {
                        i3 = (((((int) (j6 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                    }
                    if (i4 != 0) {
                        break;
                    }
                    i4++;
                    j6 = j5;
                }
                if (i3 != i2) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46400), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, View.getDefaultSize(0, 0) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                    throw null;
                }
                CustomerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).notify.observe(customerInformationDirectDebitActivity, new Observer() { // from class: getDividerDrawable
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                CustomerInformationDirectDebitActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancelAll + 97;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        int i = 2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = cancelAll + 105;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            int i4 = asBinder + 115;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            if (str2.length() == 0) {
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
                d_();
            }
        } else {
            LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
            d_();
        }
        EditText editText = INotificationSideChannelStub().tilEmailAddress.getEditText();
        if (editText != null) {
            User user = (User) this.a.getValue();
            editText.setText(String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null));
        }
        EditText editText2 = INotificationSideChannelStub().edtPhoneNumber;
        User user2 = (User) this.a.getValue();
        String strValueOf = String.valueOf(user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
        Intrinsics.checkNotNullParameter(strValueOf, "");
        String string = StringsKt.trim((CharSequence) strValueOf).toString();
        for (String str3 : CollectionsKt.listOf((Object[]) new String[]{"0620", "062", "620", "+62", "62", "00", "0"})) {
            int i6 = asBinder + 7;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
            if (StringsKt.startsWith$default(string, str3, false, 2, (Object) null)) {
                string = string.substring(str3.length());
                Intrinsics.checkNotNullExpressionValue(string, "");
                break;
            }
        }
        editText2.setText(new Regex("[^0-9]").replace(string, ""));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancelAll + 83;
        asBinder = i2 % 128;
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
                int i3 = cancelAll + 75;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                onBackPressed();
                int i5 = asBinder + 73;
                cancelAll = i5 % 128;
                int i6 = i5 % 2;
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
        int i2 = cancelAll + 3;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
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

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = cancelAll + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Button button = INotificationSideChannelStub().btnProcess;
            Intrinsics.checkNotNullExpressionValue(button, "");
            Button button2 = button;
            Intrinsics.checkNotNullParameter(button2, "");
            button2.setEnabled(true);
        } else {
            Button button3 = INotificationSideChannelStub().btnProcess;
            Intrinsics.checkNotNullExpressionValue(button3, "");
            Button button4 = button3;
            Intrinsics.checkNotNullParameter(button4, "");
            button4.setEnabled(true);
        }
        int i3 = cancelAll + 5;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilEmailAddress;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string);
        String string2 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string2)})));
        EditText editText = INotificationSideChannelStub().edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(editText, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(R.string.error_phone_number_invalid);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(editText, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string3), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string4, 9, null)})));
        TextInputLayout textInputLayout2 = INotificationSideChannelStub().tilValueLastFourDigitDebitCard;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = getString(R.string.error_last_four_digit_debit_card);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string5), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string6, 4, 4)})));
        DateEditText dateEditText = INotificationSideChannelStub().edtExpiredValue;
        Intrinsics.checkNotNullExpressionValue(dateEditText, "");
        DateEditText dateEditText2 = dateEditText;
        String string7 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        String string8 = getString(R.string.error_expired_date_invalid);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        List listListOf = CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string7), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string8, 5, 5)});
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int capsMode = 2267 - TextUtils.getCapsMode("", 0, 0);
            int defaultSize = View.getDefaultSize(0, 0) + 33;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, bArr[132], b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, capsMode, defaultSize, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{1833847107, -304726395, 2111487829, 1187816796, 855488871, 348234194, -548172825, 2134204639, -1942948077, -1925277731, -384057319, 1147828226, 1208888220, -1705556277}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{-1753701648, 190410018, 61334059, 995972129, 103090624, 1283772977, -1064628823, -1929040454, 68111564, -2035191912}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2267;
            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 33;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[7], bArr2[132], (short) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, iResolveOpacity, iResolveOpacity2, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2267;
                int trimmedLength = TextUtils.getTrimmedLength("") + 33;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) (bArr3[33] - 1), bArr3[132], (short) 104, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, scrollDefaultDelay, trimmedLength, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr7[0])[0];
            int i3 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i5 = (((598054297 + (((~(7042973 | i4)) | 796950594) * (-140))) + ((~(803993567 | i4)) * 70)) + (((~(i4 | 801670342)) | 799273819) * 70)) - 488417107;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[2])[0] = i7 ^ (i7 << 5);
            int i8 = asBinder + 103;
            cancelAll = i8 % 128;
            int i9 = i8 % 2;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                e(new int[]{1691231750, -2073674186, 71548029, -1232045272, -1603248035, -613135823, 282964100, 334307044, -470314164, -1990735550, -89184944, 519175958, -282762380, -211360669, -570721312, 118637412}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 10, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new int[]{1255509598, 723280760, 829713885, -2066922462, 2139506048, 1038456287, -1919900183, 1662959838, 504803681, -1487984980, 1954485781, -1395618350}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 18, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i10 = cancelAll + 35;
                asBinder = i10 % 128;
                if (i10 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new int[]{922914826, 168265827, -1197122573, -1038657585, -436282820, 499388114, 339812197, 923359239, -1484026739, 73484142}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{815777147, -1135131980, -934096621, 1578230079, 795044213, 1674570368, -952909823, 1130568592, -960754737, 598367069}, View.MeasureSpec.getSize(0) + 16, objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -488417107};
                byte[] bArr4 = $$m;
                byte b2 = (byte) (-bArr4[18]);
                byte b3 = bArr4[39];
                Object[] objArr13 = new Object[1];
                f(b2, b3, b3, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b4 = bArr4[39];
                byte b5 = (byte) (-bArr4[18]);
                Object[] objArr14 = new Object[1];
                f(b4, b5, b5, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int i11 = 2267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((byte) (bArr5[33] - 1), bArr5[132], (short) 104, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, i11, i12, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new int[]{1833847107, -304726395, 2111487829, 1187816796, 855488871, 348234194, -548172825, 2134204639, -1942948077, -1925277731, -384057319, 1147828226, 1208888220, -1705556277}, KeyEvent.keyCodeFromString("") + 22, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new int[]{-1753701648, 190410018, 61334059, 995972129, 103090624, 1283772977, -1064628823, -1929040454, 68111564, -2035191912}, (ViewConfiguration.getLongPressTimeout() >> 16) + 15, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i13 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2267;
                            int iRgb = Color.rgb(0, 0, 0) + 16777249;
                            byte[] bArr6 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr6[7], bArr6[132], (short) 52, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, i13, iRgb, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char mode = (char) View.MeasureSpec.getMode(0);
                            int size2 = 2267 - View.MeasureSpec.getSize(0);
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 33;
                            byte[] bArr7 = $$a;
                            byte b6 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            c(b6, bArr7[132], b6, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, size2, iIndexOf, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 != null) {
                int i16 = cancelAll + 109;
                asBinder = i16 % 128;
                int i17 = i16 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i18 = asBinder + 99;
        cancelAll = i18 % 128;
        int i19 = i18 % 2;
        Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[0])[0];
        int i22 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i23 = i20 + ((((~((-77729524) | startElapsedRealtime)) | 791929731) * 398) - 1547093265) + (((~((~startElapsedRealtime) | (-77729524))) | 791929731) * 398);
        int i24 = i23 ^ (i23 << 13);
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr21[2])[0] = i25 ^ (i25 << 5);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(dateEditText2, listListOf));
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr2;
        CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity = (CustomerInformationDirectDebitActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (29944 - (Process.myTid() >> 22));
            int size = View.MeasureSpec.getSize(0) + 1755;
            int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (bArr[33] - 1), bArr[132], (short) 104, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, size, iLastIndexOf, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = cancelAll + 21;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                int i4 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                byte[] bArr2 = $$a;
                byte b = bArr2[7];
                Object[] objArr4 = new Object[1];
                c(b, bArr2[132], b, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, i4, iCombineMeasuredStates, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = ~startUptimeMillis;
            int i6 = 1066293772 + (((~((-964590452) | i5)) | (-751988026)) * (-602)) + (((~(startUptimeMillis | (-964590452))) | 288100930 | (~((-75498505) | i5))) * (-301)) + ((~(i5 | (-751988026))) * 301) + 756554055;
            int i7 = i6 ^ (i6 << 13);
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new int[]{922914826, 168265827, -1197122573, -1038657585, -436282820, 499388114, 339812197, 923359239, -1484026739, 73484142}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new int[]{815777147, -1135131980, -934096621, 1578230079, 795044213, 1674570368, -952909823, 1130568592, -960754737, 598367069}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, customerInformationDirectDebitActivity)).intValue();
            try {
                Object[] objArr8 = {-1288013809};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 42049), 1726 - TextUtils.getOffsetAfter("", 0), KeyEvent.normalizeMetaState(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 756554055, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                    int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                    int mirror = 'G' - AndroidCharacter.getMirror('0');
                    byte[] bArr3 = $$a;
                    byte b2 = bArr3[7];
                    Object[] objArr9 = new Object[1];
                    c(b2, bArr3[132], b2, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, i9, mirror, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new int[]{1833847107, -304726395, 2111487829, 1187816796, 855488871, 348234194, -548172825, 2134204639, -1942948077, -1925277731, -384057319, 1147828226, 1208888220, -1705556277}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.chademo_ev_connector_type).substring(0, 6).length() + 16, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new int[]{-1753701648, 190410018, 61334059, 995972129, 103090624, 1283772977, -1064628823, -1929040454, 68111564, -2035191912}, 15 - KeyEvent.keyCodeFromString(""), objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                        int iRed = Color.red(0) + 1755;
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                        byte[] bArr4 = $$a;
                        byte b3 = bArr4[7];
                        byte b4 = bArr4[132];
                        Object[] objArr12 = new Object[1];
                        c(b3, b4, (short) (b4 | 140), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iRed, iResolveOpacity, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                        int deadChar2 = 1755 - KeyEvent.getDeadChar(0, 0);
                        int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                        byte[] bArr5 = $$a;
                        Object[] objArr13 = new Object[1];
                        c((byte) (bArr5[33] - 1), bArr5[132], (short) 104, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, deadChar2, packedPositionType, 986134021, false, (String) objArr13[0], null);
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
        int i10 = ((int[]) objArrB$7879113[1])[0];
        int i11 = ((int[]) objArrB$7879113[0])[0];
        if (i11 == i10) {
            int i12 = cancelAll + 43;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iNextInt = new Random().nextInt(122335440);
            int i15 = ~(1035360894 | iNextInt);
            int i16 = i14 + 200961501 + ((688015392 | i15) * (-476)) + (i15 * 952) + ((~((~iNextInt) | 1035360894)) * 476);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr14[3])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i19 = cancelAll + 39;
                    asBinder = i19 % 128;
                    int i20 = i19 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i11];
            int i21 = i11 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i23 = i22 + (-1371657412) + ((~(1052770171 | startUptimeMillis2)) * 623) + (((~startUptimeMillis2) | 571672881) * (-623)) + (((~(startUptimeMillis2 | 918522739)) | (~(705920313 | startUptimeMillis2)) | (-1052770172)) * 623);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr15[3])[0] = i25 ^ (i25 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
            int tapTimeout = 15 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr6 = $$a;
            Object[] objArr16 = new Object[1];
            c(bArr6[7], bArr6[132], (short) 52, objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iLastIndexOf2, tapTimeout, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr17 = new Object[1];
        e(new int[]{1833847107, -304726395, 2111487829, 1187816796, 855488871, 348234194, -548172825, 2134204639, -1942948077, -1925277731, -384057319, 1147828226, 1208888220, -1705556277}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(new int[]{-1753701648, 190410018, 61334059, 995972129, 103090624, 1283772977, -1064628823, -1929040454, 68111564, -2035191912}, (ViewConfiguration.getEdgeSlop() >> 16) + 15, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 1032;
            int gidForName = 14 - Process.getGidForName("");
            byte[] bArr7 = $$a;
            byte b5 = bArr7[7];
            Object[] objArr19 = new Object[1];
            c(b5, bArr7[132], b5, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, iLastIndexOf3, gidForName, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b6 = $$a[7];
                Object[] objArr20 = new Object[1];
                c((byte) 52, b6, (short) (b6 | 193), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, tapTimeout2, scrollBarSize, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr21[3])[0];
            int i27 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int iNextInt2 = new Random().nextInt();
            int i28 = (-2140082559) + (((~(684598199 | iNextInt2)) | 387025920) * 336) + (((~(iNextInt2 | 928878369)) | 142745750) * (-168)) + (((~((~iNextInt2) | 928878369)) | 684598199) * 168) + 38119502;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[2])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new int[]{922914826, 168265827, -1197122573, -1038657585, -436282820, 499388114, 339812197, 923359239, -1484026739, 73484142}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text__multiple_face_detected).substring(0, 34).length() - 18, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new int[]{815777147, -1135131980, -934096621, 1578230079, 795044213, 1674570368, -952909823, 1130568592, -960754737, 598367069}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, customerInformationDirectDebitActivity)).intValue();
            Object[] objArr24 = {-1288013809};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (Color.alpha(0) + 46038), 1135 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, 38119502, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cAlpha = (char) Color.alpha(0);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                byte[] bArr8 = $$a;
                Object[] objArr26 = new Object[1];
                c(bArr8[7], bArr8[132], (short) 52, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cAlpha, scrollDefaultDelay, packedPositionChild, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.rgb(0, 0, 0) + 16778333, 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int i31 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                byte b7 = $$a[7];
                Object[] objArr27 = new Object[1];
                c((byte) 52, b7, (short) (b7 | 193), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf2, i31, iIndexOf, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr28 = new Object[1];
                e(new int[]{1833847107, -304726395, 2111487829, 1187816796, 855488871, 348234194, -548172825, 2134204639, -1942948077, -1925277731, -384057319, 1147828226, 1208888220, -1705556277}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new int[]{-1753701648, 190410018, 61334059, 995972129, 103090624, 1283772977, -1064628823, -1929040454, 68111564, -2035191912}, 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int size2 = 1031 - View.MeasureSpec.getSize(0);
                    int mirror2 = AndroidCharacter.getMirror('0') - '!';
                    byte[] bArr9 = $$a;
                    byte b8 = bArr9[7];
                    Object[] objArr30 = new Object[1];
                    c(b8, bArr9[132], b8, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveOpacity, size2, mirror2, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
                    int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                    byte[] bArr10 = $$a;
                    Object[] objArr31 = new Object[1];
                    c(bArr10[7], bArr10[132], (short) 52, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, iKeyCodeFromString, tapTimeout3, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    int i32 = cancelAll + 91;
                    asBinder = i32 % 128;
                    int i33 = i32 % 2;
                    arrayList2.add(str2);
                }
            }
            throw null;
        }
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i34 = ((int[]) objArr2[2])[0];
        int i35 = ((int[]) objArr2[3])[0];
        int i36 = ((int[]) objArr2[1])[0];
        String[] strArr4 = (String[]) objArr2[0];
        int i37 = ~(((int) SystemClock.uptimeMillis()) | 226718001);
        int i38 = i34 + 1776585319 + (((-17562169) | i37) * (-220)) + ((i37 | (-227277626)) * 220) + 1655422430;
        int i39 = (i38 << 13) ^ i38;
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr32[2])[0] = i40 ^ (i40 << 5);
        return null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2039394123
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.cancelAll
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.asBinder = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.String r5 = "currentApplication"
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)
            r5 = r3
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r4 = r4.invoke(r3, r3)
            android.content.Context r4 = (android.content.Context) r4
            android.content.Context r4 = r4.getApplicationContext()
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.targetSdkVersion
            r5 = 530078022(0x1f985946, float:6.4522195E-20)
            int r4 = r4 + r5
            int r5 = ~r4
            r6 = -1579172143(0xffffffffa1dfbed1, float:-1.5161576E-18)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = 203423750(0xc200006, float:1.2325959E-31)
            r6 = r6 | r7
            int r6 = r6 * 184
            r7 = 249101528(0xed8fcd8, float:5.349159E-30)
            int r7 = r7 + r6
            r6 = -2124932992(0xffffffff81581880, float:-3.9690512E-38)
            r4 = r4 | r6
            int r4 = r4 * (-184)
            int r7 = r7 + r4
            r4 = -749184600(0xffffffffd35859a8, float:-9.292171E11)
            r4 = r4 | r5
            int r4 = ~r4
            int r4 = r4 * 184
            int r7 = r7 + r4
            if (r1 == r7) goto L80
            int r1 = com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.asBinder
            int r1 = r1 + 31
            int r4 = r1 % 128
            com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.cancelAll = r4
            int r1 = r1 % r0
            r1 = -2039394123(0xffffffff867150b5, float:-4.5386356E-35)
            int[] r1 = new int[r1]
            r4 = -2039394124(0xffffffff867150b4, float:-4.5386353E-35)
            r5 = 1
            r1[r4] = r5
            r4 = 1321881412(0x4eca4f44, float:1.6970962E9)
            int r4 = r4 % r0
            r0 = -1
            r0 = r1[r0]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r5)
            r0.show()
        L80:
            java.lang.reflect.Member[] r0 = defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1
            r0 = r0[r2]
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r0 = r0.getInt(r3)
            long r1 = android.os.Process.getElapsedCpuTime()
            int r1 = (int) r1
            r2 = -279683(0xfffffffffffbbb7d, float:NaN)
            r2 = r2 | r1
            int r2 = r2 * (-381)
            r4 = 1146912642(0x445c7f82, float:881.9923)
            int r4 = r4 + r2
            int r1 = ~r1
            r2 = -1885667203(0xffffffff8f9b007d, float:-1.5284368E-29)
            r1 = r1 | r2
            int r1 = ~r1
            r2 = 2054863709(0x7a7abb5d, float:3.254686E35)
            r1 = r1 | r2
            int r1 = r1 * 381
            int r4 = r4 + r1
            r1 = 106558842(0x659f57a, float:4.0993512E-35)
            int r4 = r4 + r1
            if (r0 != r4) goto Lb0
            super.onResume()
            return
        Lb0:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyPid = Process.myPid();
        if (i4 != 1533548112 + ((~(1971060055 | iMyPid)) * 623) + (((~iMyPid) | 604198912) * (-623)) + (((~(iMyPid | 872635712)) | (~(1702623255 | iMyPid)) | (-1971060056)) * 623)) {
            throw null;
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i6 = ~iIdentityHashCode;
        if (i5 != (-1646699726) + (((~(i6 | (-2036871077))) | 320959745) * (-1042)) + (((-2036871077) | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-320959746))) | 33640449 | (~(i6 | (-1749551781)))) * 521)) {
            int i7 = 1791389352 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i8 = cancelAll + 53;
        asBinder = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_no_shopee_message).substring(3, 4).codePointAt(0) + 632716880;
        if (i4 != (-1806733070) + (((~((~iCodePointAt) | 673009050)) | 1367384161) * 529) + (((~(iCodePointAt | 673009050)) | 1502996593) * 529)) {
            throw null;
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i6 = ~((-536954223) | iIdentityHashCode);
        int i7 = ~iIdentityHashCode;
        if (i5 != 1266772046 + ((i6 | (~(i7 | (-1100228609)))) * 497) + (((~(iIdentityHashCode | (-1100228609))) | (~((-941873135) | i7)) | 404918912) * 497)) {
            int i8 = (-1066346182) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i9 = asBinder + 47;
        cancelAll = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 1 / 0;
        }
    }

    public static /* synthetic */ CustomerObject TuitionPaymentFragmentbindingInflater1(CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            Parcelable parcelableExtra = customerInformationDirectDebitActivity.getIntent().getParcelableExtra("customer_object_recurring");
            Intrinsics.checkNotNull(parcelableExtra);
            return (CustomerObject) parcelableExtra;
        }
        Parcelable parcelableExtra2 = customerInformationDirectDebitActivity.getIntent().getParcelableExtra("customer_object_recurring");
        Intrinsics.checkNotNull(parcelableExtra2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String url;
        ActionLinkingStatus actionLinkingStatus;
        ActionLinkingStatus actionLinkingStatus2;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            customerInformationDirectDebitActivity.MediaBrowserCompat();
            return;
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            customerInformationDirectDebitActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (!Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Duplicate Payment Method")) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerInformationDirectDebitActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: getOrientation
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CustomerInformationDirectDebitActivity.g();
                    }
                });
                return;
            }
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_email, "Duplikat Metode Pembayaran", "Teridentifikasi duplikasi metode pembayaran", "Lanjut", new Function0() { // from class: getNextLocationOffset
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return (Unit) CustomerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(VoucherRequest.b(), VoucherRequest.b(), -1120226157, VoucherRequest.b(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1}, VoucherRequest.b(), 1120226160);
                }
            }, "Kembali", new Function0() { // from class: getVirtualChildAt
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
                }
            });
            FragmentManager supportFragmentManager = customerInformationDirectDebitActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            customerInformationDirectDebitActivity.IconCompatParcelizer();
            CustomerObject customerObject = (CustomerObject) customerInformationDirectDebitActivity.b.getValue();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            List<ActionLinkingStatus> actionsPmLinking = ((CreatePaymentMethodGeneralResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData().getActionsPmLinking();
            String method = null;
            if (actionsPmLinking == null || (actionLinkingStatus2 = actionsPmLinking.get(0)) == null) {
                url = null;
            } else {
                int i2 = cancelAll + 67;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    actionLinkingStatus2.getUrl();
                    method.hashCode();
                    throw null;
                }
                url = actionLinkingStatus2.getUrl();
                int i3 = cancelAll + 55;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 / 4;
                }
            }
            String strValueOf = String.valueOf(url);
            List<ActionLinkingStatus> actionsPmLinking2 = ((CreatePaymentMethodGeneralResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData().getActionsPmLinking();
            if (actionsPmLinking2 != null && (actionLinkingStatus = actionsPmLinking2.get(0)) != null) {
                method = actionLinkingStatus.getMethod();
            }
            CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerObject, null, null, null, null, null, String.valueOf(((CreatePaymentMethodGeneralResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData().getReferenceId()), Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(customerInformationDirectDebitActivity.INotificationSideChannelStub().edtPhoneNumber.getText().toString()), null, ((CreatePaymentMethodGeneralResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData().getPmId().toString(), null, ((CreatePaymentMethodGeneralResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData().getCustomerId(), null, null, null, null, strValueOf, String.valueOf(method), null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -99681, 2047);
            AuthenticationOtpDirectDebitActivity.Companion companion2 = AuthenticationOtpDirectDebitActivity.INSTANCE;
            AuthenticationOtpDirectDebitActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerInformationDirectDebitActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = asBinder + 83;
        cancelAll = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity = (CustomerInformationDirectDebitActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 7;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) customerInformationDirectDebitActivity.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) customerInformationDirectDebitActivity.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i3 = cancelAll + 53;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 85 / 0;
        }
        return userAsBinder;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            customerInformationDirectDebitActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = cancelAll + 57;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            customerInformationDirectDebitActivity.IconCompatParcelizer();
            String string = ((CustomerObjectUpdated) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCustomerId().toString();
            customerInformationDirectDebitActivity.TuitionPaymentFragmentbindingInflater1 = string;
            customerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = asBinder + 29;
            cancelAll = i4 % 128;
            if (i4 % 2 != 0) {
                customerInformationDirectDebitActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerInformationDirectDebitActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            } else {
                customerInformationDirectDebitActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerInformationDirectDebitActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                throw null;
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = cancelAll + 19;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i3 + 41;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
            customerInformationDirectDebitActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            customerInformationDirectDebitActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerInformationDirectDebitActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: getBaseline
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerInformationDirectDebitActivity.cancelAll();
                }
            });
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            customerInformationDirectDebitActivity.IconCompatParcelizer();
            customerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerInformationDirectDebitActivity.TuitionPaymentFragmentbindingInflater1.toString());
        }
        int i7 = cancelAll + 37;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = cancelAll + 85;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                customerInformationDirectDebitActivity.MediaBrowserCompat();
                throw null;
            }
            customerInformationDirectDebitActivity.MediaBrowserCompat();
            str = "loading_get_list_payment_method_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            customerInformationDirectDebitActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerInformationDirectDebitActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: drawVerticalDivider
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerInformationDirectDebitActivity.onTransact();
                }
            });
            str = "failure_get_list_payment_method_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            customerInformationDirectDebitActivity.IconCompatParcelizer();
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter("BRI", "");
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (Intrinsics.areEqual(((PaymentMethodItem) list.get(i3)).getChannelCode(), "BRI")) {
                    int i4 = cancelAll + 75;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList.add(list.get(i3));
                }
            }
            customerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((PaymentMethodItem) arrayList.get(0)).getPaymentMethodId();
            ((ListPopupWindow2) customerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ForceExpirePaymentMethodRequest(String.valueOf(customerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2)));
            int i6 = cancelAll + 57;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            str = "success_get_list_payment_method_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_get_list_payment_method", str));
        Intrinsics.checkNotNullParameter(customerInformationDirectDebitActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 63;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            customerInformationDirectDebitActivity.d_();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        customerInformationDirectDebitActivity.d_();
        Unit unit2 = Unit.INSTANCE;
        int i3 = asBinder + 39;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        Editable text;
        CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity = (CustomerInformationDirectDebitActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 41;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) customerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String strValueOf = String.valueOf(((CustomerObject) customerInformationDirectDebitActivity.b.getValue()).INotificationSideChannel);
        EditText editText = customerInformationDirectDebitActivity.INotificationSideChannelStub().tilEmailAddress.getEditText();
        if (editText != null) {
            text = editText.getText();
        } else {
            int i4 = asBinder + 59;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            text = null;
        }
        listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new EditCustomerObjectRequest(strValueOf, String.valueOf(text), Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(customerInformationDirectDebitActivity.INotificationSideChannelStub().edtPhoneNumber.getText().toString())));
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 83;
        cancelAll = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit cancelAll() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 65;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity = (CustomerInformationDirectDebitActivity) objArr[0];
        int i = 2 % 2;
        String str = customerInformationDirectDebitActivity.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(str, "");
        ((ListPopupWindow2) customerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new GetListPaymentMethodRequest(str));
        Unit unit = Unit.INSTANCE;
        int i2 = cancelAll + 23;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 107;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity = (CustomerInformationDirectDebitActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (!(true ^ (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            customerInformationDirectDebitActivity.MediaBrowserCompat();
            return null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                customerInformationDirectDebitActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerInformationDirectDebitActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                int i2 = asBinder + 75;
                cancelAll = i2 % 128;
                int i3 = i2 % 2;
            }
            return null;
        }
        int i4 = asBinder + 67;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        customerInformationDirectDebitActivity.IconCompatParcelizer();
        String strSubstring = String.valueOf(((CustomerObjectItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCustomerId()).substring(5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        customerInformationDirectDebitActivity.TuitionPaymentFragmentbindingInflater1 = strSubstring;
        customerInformationDirectDebitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strSubstring);
        return null;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault1(CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity) {
        int iB = VoucherRequest.b();
        return (User) TuitionPaymentFragmentspecialinlinedviewModeldefault1(VoucherRequest.b(), VoucherRequest.b(), -1263970300, VoucherRequest.b(), new Object[]{customerInformationDirectDebitActivity}, iB, 1263970301);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity, View view) {
        int iB = VoucherRequest.b();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(VoucherRequest.b(), VoucherRequest.b(), 1138978234, VoucherRequest.b(), new Object[]{customerInformationDirectDebitActivity, view}, iB, -1138978230);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity) {
        int iB = VoucherRequest.b();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(VoucherRequest.b(), VoucherRequest.b(), -1120226157, VoucherRequest.b(), new Object[]{customerInformationDirectDebitActivity}, iB, 1120226160);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomerInformationDirectDebitActivity customerInformationDirectDebitActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iB = VoucherRequest.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(VoucherRequest.b(), VoucherRequest.b(), -410863199, VoucherRequest.b(), new Object[]{customerInformationDirectDebitActivity, virtualCameraAdapter1}, iB, 410863201);
    }

    static {
        onTransact = 1;
        INotificationSideChannel();
        INSTANCE = new Companion(null);
        int i = notify + 7;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        int i3 = i2 % 128;
        cancelAll = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_customer_information_direct_debit;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(VoucherRequest.b(), VoucherRequest.b(), -816978723, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_title_text).substring(12, 13).codePointAt(0) + 463336829, new Object[]{this, context}, VoucherRequest.b(), 816978723);
    }

    static void INotificationSideChannel() {
        f526a = new int[]{-438073228, -43071905, 1724993536, -1620668476, -280625261, 2046987326, -1454446290, 1483636922, -1910051215, -1177896264, 1090931903, -1864099293, -1891268950, 944000718, -1896767096, 844632618, 430010570, 825685600};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r7, short r8, short r9) {
        /*
            int r7 = r7 * 56
            int r7 = r7 + 66
            byte[] r0 = com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.$$c
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.CustomerInformationDirectDebitActivity.$$i(short, short, short):java.lang.String");
    }
}
