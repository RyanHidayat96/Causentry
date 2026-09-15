package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
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
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.request.CreateRecurringPlanRequest;
import com.bpjstku.data.payment.model.request.GetListPaymentMethodRequest;
import com.bpjstku.data.payment.model.request.PaymentProfileItem;
import com.bpjstku.data.payment.model.response.PaymentMethodItem;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bpjstku.databinding.ActivityPaymentAuthenticationBinding;
import com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity;
import com.bpjstku.presentation.membership.payment.model.UrlAuthentication;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.ListPopupWindow2;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9;
import kotlin.collections.ArraysUtilJVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\u000e\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0015\u0010\u0006\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0015\u0010\f\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016R\u0014\u0010\n\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentAuthenticationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPaymentAuthenticationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "LListPopupWindow2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetStringOrNull;", "LgetStringOrNull;", "Lcom/bpjstku/presentation/membership/payment/model/UrlAuthentication;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentAuthenticationActivity extends BindingBaseActivity<ActivityPaymentAuthenticationBinding> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f531a;
    private static int asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private getStringOrNull b;
    private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$f = 181;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {23, -73, 107, 5, 11, -3, -64, 68, -3, 3, -21, 16, -14, 15, -6, -67, 64, -5, -4, 11, -1, -5, -67, 58, 4, 5, -16, 12, -5, -14, 10, -63, 57, 11, -1, -5, -67, 25, 43, -1, -5, -44, 40, -8, 1, 4, -10, -66, 13, 32, -13, 10, -12, 5, -2, -31, 16, 23, -13, -9, 8, 5, -47, 43, -18, 5, 5, -9, 8, 5, -2, -4, -12, -3, 5, -9, 10, -4, 4, -3, -4, 4, -10, -2, 17, -14, -5, 17, -43, 33, -12, 0, 6, -9, 0, 0, -6, 19, -10, 7, -68};
    private static final int $$k = 3;
    private static final byte[] $$a = {57, -56, 23, -36, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 242;
    private static int d = 0;
    private static int asInterface = 0;
    private static int g = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: isDropDownAlwaysVisible
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentAuthenticationActivity.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: isModal
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentAuthenticationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws IllegalAccessException {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i);
        int i11 = ~i6;
        int i12 = i10 | (~(i11 | i8 | i4));
        int i13 = (~(i7 | i11)) | (~(i11 | i));
        int i14 = i4 + i6 + i5 + (1941422536 * i3) + ((-555707305) * i2);
        int i15 = i14 * i14;
        int i16 = (i4 * (-2131549542)) + 177471488 + ((-2131549542) * i6) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i5) + ((-1363148800) * i3) + (2141716480 * i2) + ((-573308928) * i15);
        int i17 = ((i4 * 487360618) - 1291405921) + (i6 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i5 * 487361161) + (i3 * (-1188264952)) + (i2 * 624576655) + (i15 * (-25952256));
        int i18 = i16 + (i17 * i17 * 74186752);
        if (i18 == 1) {
            return b(objArr);
        }
        if (i18 != 2) {
            if (i18 == 3) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            }
            PaymentAuthenticationActivity paymentAuthenticationActivity = (PaymentAuthenticationActivity) objArr[0];
            int i19 = 2 % 2;
            WebSettings settings = ((ActivityPaymentAuthenticationBinding) ((ViewBinding) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webViewAuth.getSettings();
            Intrinsics.checkNotNullExpressionValue(settings, "");
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            ((ActivityPaymentAuthenticationBinding) ((ViewBinding) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webViewAuth.loadUrl(((UrlAuthentication) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString());
            ((ActivityPaymentAuthenticationBinding) ((ViewBinding) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webViewAuth.setWebViewClient(paymentAuthenticationActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            int i20 = asInterface + 107;
            g = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        PaymentAuthenticationActivity paymentAuthenticationActivity2 = (PaymentAuthenticationActivity) objArr[0];
        int i22 = 2 % 2;
        int i23 = g + 43;
        asInterface = i23 % 128;
        int i24 = i23 % 2;
        if (((Field) cacheInteropConfig.b[0]).getInt(null) != 200966976 + (((~(1575396316 | i8)) | (-745408774) | (~((-1575396317) | i))) * (-564)) + ((~((-208011525) | i)) * 1128) + (((~((-745408774) | i8)) | 1367384792) * 564)) {
            throw null;
        }
        int i25 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i26 = ~(i | (-2077724334));
        if (i25 != ((((-2144853680) | i26) * (-196)) - 1472887532) + ((i26 | 67129346) * 196)) {
            int i27 = g + 121;
            asInterface = i27 % 128;
            if (i27 % 2 != 0) {
                int[] iArr = new int[773760122];
                iArr[773760121] = 1;
                int i28 = (-1608129110) % 3;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[773760122];
                iArr2[773760121] = 1;
                int i29 = (-1608129110) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onStart();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity.$$a
            int r6 = r6 + 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r8 = r8 * 7
            int r0 = r8 + 46
            byte[] r1 = com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity.$$j
            int r7 = r7 * 45
            int r7 = 49 - r7
            byte[] r0 = new byte[r0]
            int r8 = r8 + 45
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r6
            int r6 = r7 + 1
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity.f(int, byte, int, java.lang.Object[]):void");
    }

    public PaymentAuthenticationActivity() {
        final PaymentAuthenticationActivity paymentAuthenticationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = paymentAuthenticationActivity;
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

    public static final /* synthetic */ CustomerObject asInterface(PaymentAuthenticationActivity paymentAuthenticationActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return (CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
    }

    public static final /* synthetic */ UrlAuthentication g(PaymentAuthenticationActivity paymentAuthenticationActivity) {
        UrlAuthentication urlAuthentication;
        int i = 2 % 2;
        int i2 = g + 29;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            urlAuthentication = (UrlAuthentication) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            int i3 = 35 / 0;
        } else {
            urlAuthentication = (UrlAuthentication) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        }
        int i4 = g + 105;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return urlAuthentication;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentAuthenticationActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/payment/model/UrlAuthentication;", "p1", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "p2", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/payment/model/UrlAuthentication;Lcom/bpjstku/presentation/tuition/model/CustomerObject;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, UrlAuthentication p1, CustomerObject p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) PaymentAuthenticationActivity.class);
            intent.putExtra("url_authentication_payment", p1);
            intent.putExtra("customer_object_recurring", p2);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPaymentAuthenticationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        PaymentAuthenticationActivity$bindingInflater$1 paymentAuthenticationActivity$bindingInflater$1 = PaymentAuthenticationActivity$bindingInflater$1.b;
        if (i3 == 0) {
            return paymentAuthenticationActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        PaymentAuthenticationActivity paymentAuthenticationActivity = this;
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).f164a.observe(paymentAuthenticationActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getSelectedView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).notify.observe(paymentAuthenticationActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getSelectedItem
            private static final byte[] $$a = {64, 73, -26, 82};
            private static final int $$b = 145;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int d = 0;
            private static int asInterface = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 21311;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722256;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = d + 123;
                asInterface = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    PaymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
                    throw null;
                }
                Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PaymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
                int i4 = d + 49;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                obj2.hashCode();
                throw null;
            }

            private static void a(char[] cArr, char[] cArr2, char c, int i2, char[] cArr3, Object[] objArr) throws Throwable {
                int i3;
                int i4 = 2;
                int i5 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i6 = $11 + 67;
                    $10 = i6 % 128;
                    int i7 = i6 % i4;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.alpha(0) + 8328), 1235 - View.MeasureSpec.getMode(0), 36 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -653973969, false, $$c(b, b2, b2), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 2764, Color.green(0) + 14, 1504416861, false, $$c(b3, b4, (byte) (b4 - 2)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSize(0, 0) + 43325), (ViewConfiguration.getTapTimeout() >> 16) + 253, 21 - TextUtils.lastIndexOf("", '0', 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cArgb = (char) (65200 - Color.argb(0, 0, 0, 0));
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2891;
                            int i8 = 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 1);
                            String str$$c = $$c(b5, b6, (byte) (b6 - 1));
                            i3 = 2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, pressedStateDuration, i8, 2012627446, false, str$$c, new Class[]{Integer.TYPE, Integer.TYPE});
                        } else {
                            i3 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        int i9 = $10 + 113;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        i4 = i3;
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

            /* JADX WARN: Code duplicated, block: B:32:0x0166  */
            /* JADX WARN: Code duplicated, block: B:33:0x0167  */
            private static void c(char[] cArr, boolean z, int i2, int i3, int i4, Object[] objArr) throws Throwable {
                int i5;
                Throwable cause;
                int i6 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (true) {
                    i5 = 29209604;
                    if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                        break;
                    }
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i3 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.getDefaultSize(0, 0), 3291 - View.resolveSizeAndState(0, 0, 0), 31 - (Process.myTid() >> 22), 1199271174, false, $$c(b, (byte) (b | 18), b), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b2 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 652 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 44 - Color.red(0), -450685997, false, $$c(b2, (byte) (b2 | 17), b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i4 > 0) {
                    int i8 = $11 + 75;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i4;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    int i10 = $11 + 49;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    int i12 = $10 + 11;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i14 = $10 + 19;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), View.resolveSizeAndState(0, 0, 0) + 651, Color.alpha(0) + 44, -450685997, false, $$c(b3, (byte) (b3 | 17), b3), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        i5 = 29209604;
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Class] */
            /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r3v73, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r4v125 */
            /* JADX WARN: Type inference failed for: r5v128 */
            /* JADX WARN: Type inference failed for: r5v129 */
            /* JADX WARN: Type inference failed for: r5v58, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v118, types: [java.lang.Class<java.io.InputStream>] */
            /* JADX WARN: Type inference failed for: r6v130 */
            /* JADX WARN: Type inference failed for: r6v149 */
            /* JADX WARN: Type inference failed for: r6v174, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r6v186 */
            /* JADX WARN: Type inference failed for: r6v187 */
            /* JADX WARN: Type inference failed for: r6v188 */
            /* JADX WARN: Type inference failed for: r6v189 */
            /* JADX WARN: Type inference failed for: r6v190 */
            /* JADX WARN: Type inference failed for: r6v191 */
            /* JADX WARN: Type inference failed for: r6v2 */
            /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r6v56 */
            /* JADX WARN: Type inference failed for: r6v66 */
            /* JADX WARN: Type inference failed for: r6v86 */
            /* JADX WARN: Type inference failed for: r6v88, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r6v89, types: [java.io.ByteArrayInputStream, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v174, types: [java.lang.Class[]] */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context r31, int r32, int r33) {
                /*
                    Method dump skipped, instruction units count: 4881
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getSelectedItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context, int, int):java.lang.Object[]");
            }

            private static String $$c(int i2, int i3, int i4) {
                int i5 = i4 * 2;
                int i6 = 4 - (i2 * 4);
                byte[] bArr = $$a;
                int i7 = i3 + 102;
                byte[] bArr2 = new byte[i5 + 1];
                int i8 = -1;
                if (bArr == null) {
                    i7 = i5 + i7;
                    i6++;
                }
                while (true) {
                    i8++;
                    bArr2[i8] = (byte) i7;
                    if (i8 == i5) {
                        return new String(bArr2, 0);
                    }
                    i7 += bArr[i6];
                    i6++;
                }
            }
        }));
        int i2 = asInterface + 17;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(f531a)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int maximumDrawingCacheSize = 3291 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i6 = 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b = (byte) ($$f & 3);
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, maximumDrawingCacheSize, i6, 1199271174, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Color.green(0) + 651, 44 - (ViewConfiguration.getEdgeSlop() >> 16), -450685997, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 93;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (!(!z)) {
            int i9 = $11 + 69;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 44, -450685997, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends WebViewClient {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String string = PaymentAuthenticationActivity.g(PaymentAuthenticationActivity.this).TuitionPaymentFragmentbindingInflater1.toString();
            String string2 = PaymentAuthenticationActivity.g(PaymentAuthenticationActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.toString();
            if (!StringsKt.contains$default((CharSequence) String.valueOf(str), (CharSequence) string.toString(), false, 2, (Object) null)) {
                if (StringsKt.contains$default((CharSequence) String.valueOf(str), (CharSequence) string2.toString(), false, 2, (Object) null)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    final PaymentAuthenticationActivity paymentAuthenticationActivity = PaymentAuthenticationActivity.this;
                    Function0 function0 = new Function0() { // from class: setAnimationStyle
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            paymentAuthenticationActivity.d_();
                            return Unit.INSTANCE;
                        }
                    };
                    final PaymentAuthenticationActivity paymentAuthenticationActivity2 = PaymentAuthenticationActivity.this;
                    getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_email, "Account Linking User Gagal", "Apakah ingin mencoba link dengan kanal pembayaran lain", "Ok", function0, "Kembali", new Function0() { // from class: setDropDownAlwaysVisible
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            PaymentAuthenticationActivity paymentAuthenticationActivity3 = paymentAuthenticationActivity2;
                            PaymentAuthenticationActivity.Companion companion2 = PaymentAuthenticationActivity.INSTANCE;
                            PaymentAuthenticationActivity.Companion.TuitionPaymentFragmentbindingInflater1(paymentAuthenticationActivity3, PaymentAuthenticationActivity.g(paymentAuthenticationActivity3), PaymentAuthenticationActivity.asInterface(paymentAuthenticationActivity3));
                            paymentAuthenticationActivity3.d_();
                            return Unit.INSTANCE;
                        }
                    });
                    FragmentManager supportFragmentManager = PaymentAuthenticationActivity.this.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
            } else {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Proses linking account berhasil", 0).show();
                LinkingAccountPaymentActivity.Companion companion2 = LinkingAccountPaymentActivity.INSTANCE;
                PaymentAuthenticationActivity paymentAuthenticationActivity3 = PaymentAuthenticationActivity.this;
                LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(paymentAuthenticationActivity3, PaymentAuthenticationActivity.asInterface(paymentAuthenticationActivity3));
                PaymentAuthenticationActivity.this.d_();
            }
            return false;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
            int iRed = Color.red(0) + 1755;
            int pressedStateDuration = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 103, b, (byte) (b | 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, iRed, pressedStateDuration, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                int scrollDefaultDelay2 = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr = $$a;
                short s = bArr[5];
                byte b2 = bArr[7];
                Object[] objArr3 = new Object[1];
                c(s, b2, (byte) (b2 | 52), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, packedPositionGroup, scrollDefaultDelay2, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i3 = ~i2;
            int i4 = (~(745596702 | i3)) | (-1031599967) | (~(958199128 | i3));
            int i5 = (-4590601) + (((~(i2 | (-672195865))) | i4) * 590) + (i4 * (-1180)) + (((~((-958199129) | i3)) | (~(i3 | (-745596703)))) * 590) + 1996854368;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_transaction_id_text).substring(11, 12).length() + 140, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step6).substring(28, 29).length() + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 24, new char[]{23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 34, 16 - View.MeasureSpec.getMode(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_unavailable).substring(4, 5).length() + 8, new char[]{19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-646566192};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 42050), 1726 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getTrimmedLength("") + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1996854368);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cBlue = (char) (Color.blue(0) + 29944);
                    int iIndexOf = TextUtils.indexOf("", "") + 1755;
                    int packedPositionGroup2 = 23 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr2 = $$a;
                    short s2 = bArr2[5];
                    byte b3 = bArr2[7];
                    Object[] objArr8 = new Object[1];
                    c(s2, b3, (byte) (b3 | 52), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, iIndexOf, packedPositionGroup2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_6).substring(0, 1).length() + 141, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 111, new char[]{'\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 29, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 12, new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                        int mode2 = 1755 - View.MeasureSpec.getMode(0);
                        int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                        byte b4 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c((short) 140, b4, (byte) (b4 | 52), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, mode2, iCombineMeasuredStates, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                        int i8 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                        int iAxisFromString = MotionEvent.axisFromString("") + 24;
                        byte b5 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((short) 103, b5, (byte) (b5 | 37), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i8, iAxisFromString, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrB$5f1425da[1])[0];
        int i10 = ((int[]) objArrB$5f1425da[0])[0];
        if (i10 == i9) {
            int i11 = asInterface + 43;
            g = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i14 = i13 + 950188177 + (((~(886809794 | layoutDirection)) | 136581640 | (~((-674207369) | layoutDirection))) * (-744)) + (((~layoutDirection) | 349184066) * 744) + ((layoutDirection | (-136581641)) * 744);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr != null) {
                int i17 = 0;
                while (i17 < strArr.length) {
                    arrayList.add(strArr[i17]);
                    i17++;
                    int i18 = g + 57;
                    asInterface = i18 % 128;
                    int i19 = i18 % 2;
                }
            }
            int[] iArr = new int[i10];
            int i20 = i10 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = i21 + (((1332474231 + (((~iIdentityHashCode) | (-190049850)) * 1444)) + (((~(iIdentityHashCode | 45987840)) | ((~(166614585 | iIdentityHashCode)) | (-201326138))) * (-1444))) - 222962494);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr14[3])[0] = i24 ^ (i24 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1032;
            int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte b6 = $$a[7];
            Object[] objArr15 = new Object[1];
            c((short) 51, b6, (byte) (b6 | 52), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSizeAndState, iLastIndexOf, longPressTimeout, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 106, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_prima).substring(1, 3).length() + 20, 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{'\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 135, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redirecting_to_gopay).substring(1, 2).codePointAt(0) - 86, 11 - TextUtils.lastIndexOf("", '0'), new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iMyPid = (Process.myPid() >> 22) + 15;
            byte[] bArr3 = $$a;
            short s3 = bArr3[5];
            byte b7 = bArr3[7];
            Object[] objArr18 = new Object[1];
            c(s3, b7, (byte) (b7 | 52), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumFlingVelocity, minimumFlingVelocity, iMyPid, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollDefaultDelay3 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                int iMyTid = 15 - (Process.myTid() >> 22);
                short s4 = (short) ($$b & 960);
                byte[] bArr4 = $$a;
                Object[] objArr19 = new Object[1];
                c(s4, bArr4[132], bArr4[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollDefaultDelay3, trimmedLength, iMyTid, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr20[3])[0];
            int i26 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode2;
            int i28 = (((2042990233 + (((~(i27 | 485077756)) | ((~(240797586 | i27)) | (-519829503))) * 464)) + (((-279031917) | iIdentityHashCode2) * (-464))) + (((~(iIdentityHashCode2 | 485077756)) | (-519829503)) * 464)) - 285384594;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[2])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.installment_required).substring(16, 18).length() + 139, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 83, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_6).substring(3, 4).length() + 11, new char[]{23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_expiry_date).substring(14, 16).codePointAt(0) + 48, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto2).substring(8, 9).codePointAt(0) - 81, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 27, new char[]{19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-646566192};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), Color.red(0) + 1134, 'B' - AndroidCharacter.getMirror('0'), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -285384594, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                int i31 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int mirror = '?' - AndroidCharacter.getMirror('0');
                byte b8 = $$a[7];
                Object[] objArr25 = new Object[1];
                c((short) 51, b8, (byte) (b8 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf, i31, mirror, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Color.argb(0, 0, 0, 0) + 1117, (ViewConfiguration.getScrollBarSize() >> 8) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int defaultSize = 1031 - View.getDefaultSize(0, 0);
                int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                short s5 = (short) ($$b & 960);
                byte[] bArr5 = $$a;
                Object[] objArr26 = new Object[1];
                c(s5, bArr5[132], bArr5[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(size, defaultSize, offsetBefore, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_left_eye_closed).substring(0, 14).codePointAt(10) + 35, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, KeyEvent.keyCodeFromString("") + 1, new char[]{'\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_failed).substring(53, 55).codePointAt(0) + 114, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.j1772_ev_connector_type).substring(0, 5).codePointAt(3) - 43, new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int i32 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
                    byte[] bArr6 = $$a;
                    short s6 = bArr6[5];
                    byte b9 = bArr6[7];
                    Object[] objArr29 = new Object[1];
                    c(s6, b9, (byte) (b9 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, i32, offsetAfter, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int i33 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iRed2 = 15 - Color.red(0);
                    byte b10 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c((short) 51, b10, (byte) (b10 | 52), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, i33, iRed2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 == null) {
                throw null;
            }
            int i34 = asInterface + 101;
            g = i34 % 128;
            int i35 = i34 % 2;
            for (String str : strArr3) {
                arrayList2.add(str);
            }
            throw null;
        }
        int i36 = g + 23;
        asInterface = i36 % 128;
        int i37 = i36 % 2;
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i38 = ((int[]) objArr[2])[0];
        int i39 = ((int[]) objArr[3])[0];
        int i40 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i41 = i38 + 494446257 + (((~(434650193 | iIdentityHashCode3)) | (-678930364)) * (-964)) + (((~((~iIdentityHashCode3) | 434650193)) | (-973062140)) * (-964));
        int i42 = i41 ^ (i41 << 13);
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr31[2])[0] = i43 ^ (i43 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (-872170360) + (((~((-277441163) | i4)) | (~((-1112966518) | iIdentityHashCode))) * 520);
            int i6 = ~(1112966517 | i4);
            int i7 = ~(iIdentityHashCode | 282978974);
            if (i3 != i5 + ((i6 | i7) * (-1040)) + ((i7 | (~(i4 | (-282978975))) | (-1390407680)) * 520)) {
                throw null;
            }
        } else {
            int i8 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode2;
            if (i8 != (((~(i9 | (-992225933))) | (~((-162238390) | i9)) | 153094788) * (-397)) + 1576726222 + ((iIdentityHashCode2 | (-848274746)) * 397)) {
                throw null;
            }
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i11 = ~((int) Runtime.getRuntime().maxMemory());
        if (i10 != (((-856319252) + (((~(i11 | (-1762656937))) | 46745605) * (-828))) + ((i11 | (-1762656937)) * (-828))) - 808937632) {
            throw null;
        }
        super.onResume();
        int i12 = g + 13;
        asInterface = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00af, code lost:
    
        if (r3 != ((((-1160113875) + (((~((-1966168042) | r6)) | 1362104968) * 98)) + ((((~(r6 | (-612887924))) | (-1966168042)) | (~(612887923 | r5))) * (-49))) + (((~(r5 | (-1966168042))) | (-1974992892)) * 49))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b1, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity.g + 79;
        com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity.asInterface = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bd, code lost:
    
        if ((r10 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bf, code lost:
    
        r10 = 31 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ca, code lost:
    
        throw new java.lang.RuntimeException("420094724");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d2, code lost:
    
        throw new java.lang.RuntimeException("599489516");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        if (r3 == ((448722684 + (((~(1598985305 | r6)) | (~((-768997763) | r5))) * 210)) + (((~(r5 | 2145385947)) | (~(r6 | (-222597121)))) * 210))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        if (r3 == (((((~((-676824080) | r5)) | 139461638) * (-283)) - 17049654) + ((~(r5 | (-537362442))) * 283))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        r3 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r5 = (int) android.os.SystemClock.uptimeMillis();
        r6 = ~r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity.b(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ CustomerObject b(PaymentAuthenticationActivity paymentAuthenticationActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = paymentAuthenticationActivity.getIntent().getParcelableExtra("customer_object_recurring");
        Intrinsics.checkNotNull(parcelableExtra);
        CustomerObject customerObject = (CustomerObject) parcelableExtra;
        int i4 = asInterface + 63;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return customerObject;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x00db  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:26:0x011e  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final PaymentAuthenticationActivity paymentAuthenticationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentManager supportFragmentManager;
        int i;
        getStringOrNull getstringornullB;
        FragmentManager supportFragmentManager2;
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            paymentAuthenticationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            paymentAuthenticationActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentAuthenticationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: isInputMethodNotNeeded
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentAuthenticationActivity.d();
                }
            });
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i6 = i3 + 31;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                paymentAuthenticationActivity.IconCompatParcelizer();
                if (Intrinsics.areEqual(((PaymentMethodItem) ((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).get(0)).getStatus(), "ACTIVE")) {
                    ActivityPaymentAuthenticationBinding activityPaymentAuthenticationBinding = (ActivityPaymentAuthenticationBinding) ((ViewBinding) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                    activityPaymentAuthenticationBinding.webViewAuth.loadUrl("about:blank");
                    activityPaymentAuthenticationBinding.webViewAuth.onPause();
                    activityPaymentAuthenticationBinding.webViewAuth.removeAllViews();
                    activityPaymentAuthenticationBinding.webViewAuth.destroy();
                    String str = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancelAll;
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string = paymentAuthenticationActivity.getString(R.string.action_ok_continue);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_email, "Pendaftaran Auto Debit", "Tagihan akan dibayarkan secara otomatis. Apakah Anda yakin akan melanjutkan ke  proses berikutnya?", string, new Function0() { // from class: getWidth
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                    }, paymentAuthenticationActivity.getString(R.string.action_return), new Function0() { // from class: onKeyPreIme
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    });
                    paymentAuthenticationActivity.b = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    supportFragmentManager = paymentAuthenticationActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        i = asInterface + 81;
                        g = i % 128;
                        if (i % 2 != 0) {
                            getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                    getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_error_process, "Account Linking dalam proses", "", "Coba Kembali", new Function0() { // from class: performItemClick
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }, 96);
                    supportFragmentManager2 = paymentAuthenticationActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                    if (supportFragmentManager2.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        int i7 = g + 61;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        getstringornullB.show(supportFragmentManager2, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
            } else {
                paymentAuthenticationActivity.IconCompatParcelizer();
                if (Intrinsics.areEqual(((PaymentMethodItem) ((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).get(0)).getStatus(), "ACTIVE")) {
                    ActivityPaymentAuthenticationBinding activityPaymentAuthenticationBinding2 = (ActivityPaymentAuthenticationBinding) ((ViewBinding) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                    activityPaymentAuthenticationBinding2.webViewAuth.loadUrl("about:blank");
                    activityPaymentAuthenticationBinding2.webViewAuth.onPause();
                    activityPaymentAuthenticationBinding2.webViewAuth.removeAllViews();
                    activityPaymentAuthenticationBinding2.webViewAuth.destroy();
                    String str2 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancelAll;
                    getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                    String string2 = paymentAuthenticationActivity.getString(R.string.action_ok_continue);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_email, "Pendaftaran Auto Debit", "Tagihan akan dibayarkan secara otomatis. Apakah Anda yakin akan melanjutkan ke  proses berikutnya?", string2, new Function0() { // from class: getWidth
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                    }, paymentAuthenticationActivity.getString(R.string.action_return), new Function0() { // from class: onKeyPreIme
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    });
                    paymentAuthenticationActivity.b = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    supportFragmentManager = paymentAuthenticationActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        i = asInterface + 81;
                        g = i % 128;
                        if (i % 2 != 0) {
                            getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    getStringOrNull.Companion companion4 = getStringOrNull.INSTANCE;
                    getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_error_process, "Account Linking dalam proses", "", "Coba Kembali", new Function0() { // from class: performItemClick
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }, 96);
                    supportFragmentManager2 = paymentAuthenticationActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                    if (supportFragmentManager2.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        int i9 = g + 61;
                        asInterface = i9 % 128;
                        int i10 = i9 % 2;
                        getstringornullB.show(supportFragmentManager2, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentAuthenticationActivity paymentAuthenticationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = g + 91;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            paymentAuthenticationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            paymentAuthenticationActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentAuthenticationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: getSoftInputMode
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentAuthenticationActivity.g();
                }
            });
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            int i5 = i3 + 83;
            g = i5 % 128;
            int i6 = i5 % 2;
            paymentAuthenticationActivity.IconCompatParcelizer();
            RegisterRecurringSuccessActivity.Companion companion = RegisterRecurringSuccessActivity.INSTANCE;
            RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentAuthenticationActivity, (CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = g + 33;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentAuthenticationActivity paymentAuthenticationActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            getStringOrNull getstringornull = paymentAuthenticationActivity.b;
            throw null;
        }
        getStringOrNull getstringornull2 = paymentAuthenticationActivity.b;
        if (getstringornull2 != null) {
            getstringornull2.dismiss();
        }
        paymentAuthenticationActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i3 = g + 27;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit d() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        g = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 61;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentAuthenticationActivity paymentAuthenticationActivity) {
        int i = 2 % 2;
        ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String strValueOf = String.valueOf(((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String str = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).INotificationSideChannel;
        Intrinsics.checkNotNull(str);
        String string = str.toString();
        int i2 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).IconCompatParcelizer;
        String strValueOf2 = String.valueOf(((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d);
        int i3 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).IconCompatParcelizer;
        String str2 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1;
        String str3 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getItem;
        String str4 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).RemoteActionCompatParcelizer;
        String str5 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).onTransact;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append("#");
        sb.append(str2);
        sb.append("#");
        sb.append(str3);
        sb.append("#");
        sb.append(str4);
        sb.append("#");
        sb.append(str5);
        String string2 = sb.toString();
        String string3 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.toString();
        String string4 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.toString();
        String str6 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str7 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).asInterface;
        String str8 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).a;
        String str9 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancelAll;
        String strValueOf3 = String.valueOf(((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d);
        String str10 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getInterfaceDescriptor;
        String str11 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).RemoteActionCompatParcelizer;
        int i4 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).IconCompatParcelizer;
        listPopupWindow2.b(new CreateRecurringPlanRequest(strValueOf, string, String.valueOf(i2), strValueOf2, string2, new PaymentProfileItem(String.valueOf(((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).INotificationSideChannel), string3, string4, str6, str7, str8, str9, str11, String.valueOf(i4), str10, strValueOf3, String.valueOf(((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getItem))));
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 55;
        g = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0279  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentAuthenticationActivity paymentAuthenticationActivity) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 119;
        g = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityPaymentAuthenticationBinding) ((ViewBinding) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webViewAuth.onPause();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2267;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
            byte[] bArr = $$a;
            short s = bArr[5];
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(s, b, (byte) (b | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, packedPositionGroup, iIndexOf, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(false, 141 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.lastIndexOf("", '0') + 23, Color.green(0) + 1, new char[]{'\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, KeyEvent.getDeadChar(0, 0) + 146, 15 - View.MeasureSpec.getSize(0), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int i4 = 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int maximumDrawingCacheSize = 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 51, b2, (byte) (b2 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i4, maximumDrawingCacheSize, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2267;
                int defaultSize = 33 - View.getDefaultSize(0, 0);
                byte b3 = $$a[7];
                Object[] objArr6 = new Object[1];
                c((short) 103, b3, (byte) (b3 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, edgeSlop, defaultSize, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[0])[0];
            int i6 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i7 = ~startUptimeMillis;
            int i8 = (-99653299) + (((~((-535954065) | i7)) | (~((-272759252) | startUptimeMillis))) * 210) + (((~(startUptimeMillis | (-263324161))) | (~(i7 | (-129348)))) * 210) + 1132630947;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Context baseContext = paymentAuthenticationActivity.getBaseContext();
            if (baseContext == null) {
                int i11 = g + 9;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr8 = new Object[1];
                e(true, Color.green(0) + 142, 25 - MotionEvent.axisFromString(""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, new char[]{65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(false, 149 - View.combineMeasuredStates(0, 0), View.combineMeasuredStates(0, 0) + 18, 7 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2}, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i13 = g + 11;
                int i14 = i13 % 128;
                asInterface = i14;
                int i15 = i13 % 2;
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = baseContext.getApplicationContext();
                } else {
                    int i16 = i14 + 15;
                    g = i16 % 128;
                    int i17 = i16 % 2;
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = baseContext.getApplicationContext();
                    } else {
                        baseContext = null;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            e(true, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 141, 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 144, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, 10 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, paymentAuthenticationActivity)).intValue()), 0, 1132630947};
                byte[] bArr2 = $$j;
                byte b4 = bArr2[44];
                Object[] objArr13 = new Object[1];
                f(b4, b4, bArr2[91], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr2[91];
                Object[] objArr14 = new Object[1];
                f(b5, b5, bArr2[44], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int packedPositionChild = 2266 - ExpandableListView.getPackedPositionChild(0L);
                        int iIndexOf2 = TextUtils.indexOf("", "") + 33;
                        byte b6 = $$a[7];
                        Object[] objArr15 = new Object[1];
                        c((short) 103, b6, (byte) (b6 | 37), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, packedPositionChild, iIndexOf2, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(false, 142 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 23, 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{'\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(false, 146 - ExpandableListView.getPackedPositionType(0L), 15 - (ViewConfiguration.getPressedStateDuration() >> 16), 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2267;
                            int iIndexOf3 = 33 - TextUtils.indexOf("", "");
                            byte b7 = $$a[7];
                            Object[] objArr18 = new Object[1];
                            c((short) 51, b7, (byte) (b7 | 52), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iCombineMeasuredStates, iIndexOf3, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int scrollDefaultDelay = 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0', 0);
                            byte[] bArr3 = $$a;
                            short s2 = bArr3[5];
                            byte b8 = bArr3[7];
                            Object[] objArr19 = new Object[1];
                            c(s2, b8, (byte) (b8 | 52), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, scrollDefaultDelay, iLastIndexOf, -887667012, false, (String) objArr19[0], null);
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[3])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 == null) {
                throw null;
            }
            int i18 = asInterface + 29;
            g = i18 % 128;
            int i19 = i18 % 2;
            for (String str : strArr2) {
                arrayList.add(str);
            }
            throw null;
        }
        Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[0])[0];
        int i22 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
        int i23 = (-332711547) + (((~((-899172895) | startUptimeMillis2)) | 83904538 | (~((-90459579) | startUptimeMillis2))) * (-754));
        int i24 = ~((-83904539) | startUptimeMillis2);
        int i25 = ~startUptimeMillis2;
        int i26 = i20 + i23 + ((i24 | (~((-6555041) | i25))) * (-754)) + ((i25 | (-899172895)) * 754);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr20[2])[0] = i28 ^ (i28 << 5);
        ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String str2 = ((CustomerObject) paymentAuthenticationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).INotificationSideChannel;
        Intrinsics.checkNotNull(str2);
        listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new GetListPaymentMethodRequest(str2.toString()));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ UrlAuthentication TuitionPaymentFragmentbindingInflater1(PaymentAuthenticationActivity paymentAuthenticationActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            Parcelable parcelableExtra = paymentAuthenticationActivity.getIntent().getParcelableExtra("url_authentication_payment");
            Intrinsics.checkNotNull(parcelableExtra);
            return (UrlAuthentication) parcelableExtra;
        }
        Parcelable parcelableExtra2 = paymentAuthenticationActivity.getIntent().getParcelableExtra("url_authentication_payment");
        Intrinsics.checkNotNull(parcelableExtra2);
        int i3 = 86 / 0;
        return (UrlAuthentication) parcelableExtra2;
    }

    static {
        asBinder = 1;
        cancelAll();
        INSTANCE = new Companion(null);
        int i = d + 29;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 85;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            int i4 = 7 / 0;
        }
        int i5 = i3 + 1;
        g = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_payment_authentication;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g + 17;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws IllegalAccessException {
        int iB = ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9.b();
        int iB2 = ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iB, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 396559593, iB2, new Object[]{this}, -396559593);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int iB = ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9.b();
        int iB2 = ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iB, 1184100147 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1560128264, iB2, new Object[]{this, bundle}, -1560128263);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2093202351;
        int iB = ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9.b(), ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1934397165, iB, new Object[]{this}, -1934397163);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws IllegalAccessException {
        int iB = ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iB, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 575189186, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 661841386, 470078743, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, -470078740);
    }

    static void cancelAll() {
        f531a = -83722423;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        PaymentAuthenticationActivity paymentAuthenticationActivity = (PaymentAuthenticationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 15;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            int r6 = r6 + 119
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentAuthenticationActivity.$$i(int, short, short):java.lang.String");
    }
}
